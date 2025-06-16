package com.taurushq.sdk.protect.client.service;

import com.google.common.base.Strings;
import com.google.gson.Gson;
import com.taurushq.sdk.protect.client.mapper.ApiExceptionMapper;
import com.taurushq.sdk.protect.client.mapper.RequestMapper;
import com.taurushq.sdk.protect.client.model.ApiException;
import com.taurushq.sdk.protect.client.model.Request;
import com.taurushq.sdk.protect.openapi.ApiClient;
import com.taurushq.sdk.protect.openapi.api.RequestsApi;
import com.taurushq.sdk.protect.openapi.auth.CryptoTPV1;
import com.taurushq.sdk.protect.openapi.model.TgvalidatordApproveRequestsReply;
import com.taurushq.sdk.protect.openapi.model.TgvalidatordApproveRequestsRequest;
import com.taurushq.sdk.protect.openapi.model.TgvalidatordCreateOutgoingRequestRequest;
import com.taurushq.sdk.protect.openapi.model.TgvalidatordCreateRequestReply;
import com.taurushq.sdk.protect.openapi.model.TgvalidatordGetRequestReply;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.SignatureException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;
import static org.bouncycastle.util.Strings.constantTimeAreEqual;

/**
 * The type Request service.
 */
public class RequestService {

    private final Gson gson;
    private final RequestsApi requestsApi;
    private final ApiExceptionMapper apiExceptionMapper;

    /**
     * Instantiates a new Request service.
     *
     * @param openApiClient      the open api client
     * @param apiExceptionMapper the api exception mapper
     */
    public RequestService(final ApiClient openApiClient, final ApiExceptionMapper apiExceptionMapper) {

        checkNotNull(openApiClient, "openApiClient cannot be null");
        checkNotNull(apiExceptionMapper, "apiExceptionMapper cannot be null");

        this.gson = new Gson();
        this.apiExceptionMapper = apiExceptionMapper;
        this.requestsApi = new RequestsApi(openApiClient);

    }


    /**
     * Create internal transfer request.
     *
     * @param fromAddressId the source address id
     * @param toAddressId   the destination address id
     * @param amount        the amount
     * @return the created request
     * @throws ApiException the api exception
     */
    public Request createInternalTransferRequest(final long fromAddressId, final long toAddressId, final BigInteger amount) throws ApiException {
        checkArgument(fromAddressId > 0, "fromAddressId cannot be zero");
        checkArgument(toAddressId > 0, "toAddressId cannot be zero");
        checkArgument(amount != null && amount.signum() > 0, "amount cannot be null or zero");


        TgvalidatordCreateOutgoingRequestRequest request = new TgvalidatordCreateOutgoingRequestRequest();
        request.setFromAddressId(String.valueOf(fromAddressId));
        request.setToAddressId(String.valueOf(toAddressId));
        request.setAmount(amount.toString());
        try {
            TgvalidatordCreateRequestReply reply = requestsApi.requestServiceCreateOutgoingRequest(request);
            return RequestMapper.INSTANCE.fromDTO(reply.getResult());
        } catch (com.taurushq.sdk.protect.openapi.ApiException e) {
            throw apiExceptionMapper.toApiException(e);
        }
    }

    /**
     * Gets request.
     *
     * @param id the id
     * @return the request
     * @throws ApiException the api exception
     */
    public Request getRequest(final long id) throws ApiException {
        checkArgument(id > 0, "request id cannot be zero");

        try {
            TgvalidatordGetRequestReply reply = requestsApi.requestServiceGetRequest(String.valueOf(id));
            Request r = RequestMapper.INSTANCE.fromDTO(reply.getResult());

            if (r.getMetadata() != null && (!Strings.isNullOrEmpty(r.getMetadata().getHash()) || !Strings.isNullOrEmpty(r.getMetadata().getPayloadAsString()))) {

                String computedHash = CryptoTPV1.calculateHexHash(r.getMetadata().getPayloadAsString());
                String providedHash = r.getMetadata().getHash();

                if (!constantTimeAreEqual(computedHash, providedHash)) {
                    ApiException e = new ApiException();
                    e.setCode(400);
                    e.setError("InvalidResponse");
                    e.setMessage(String.format("computed hash '%s' must equal provided hash '%s'", computedHash, providedHash));
                    throw e;
                }
            }
            return r;
        } catch (com.taurushq.sdk.protect.openapi.ApiException e) {
            throw apiExceptionMapper.toApiException(e);
        }
    }

    /**
     * Approve requests int.
     *
     * @param requests   the requests
     * @param privateKey the private key
     * @return the int
     * @throws ApiException the api exception
     */
    public int approveRequests(final List<Request> requests, final PrivateKey privateKey) throws ApiException {
        checkNotNull(requests, "requests list cannot be null");
        checkArgument(!requests.isEmpty(), "requests list cannot be empty");
        requests.forEach(r -> checkNotNull(r.getMetadata(), "request metadata cannot be null"));
        requests.forEach(r -> checkArgument(!Strings.isNullOrEmpty(r.getMetadata().getHash()), "request metadata hash cannot be null or zero"));
        checkNotNull(privateKey, "privateKey cannot be null");


        // sort requests by request id
        requests.sort(Comparator.comparingLong(Request::getId));

        TgvalidatordApproveRequestsRequest request = new TgvalidatordApproveRequestsRequest();
        request.setIds(requests.stream().map(r -> Long.toString(r.getId())).collect(Collectors.toList()));
        request.setComment("approving via taurus-protect-sdk-java");
        String toSign = gson.toJson(requests.stream().map(r -> r.getMetadata().getHash()).collect(Collectors.toList()));

        try {
            request.setSignature(CryptoTPV1.calculateBase64Signature(privateKey, toSign.getBytes(StandardCharsets.UTF_8)));
        } catch (NoSuchAlgorithmException | InvalidKeyException | SignatureException ex) {
            ApiException e = new ApiException();
            e.setCode(400);
            e.setError("ClientInvalidRequest");
            e.setMessage(String.format("unable to sign the array of hashes '%s'", toSign));
            e.setOriginalException(ex);
            throw e;
        }

        try {
            TgvalidatordApproveRequestsReply reply = requestsApi.requestServiceApproveRequests(request);
            if (reply.getSignedRequests() != null) {
                return Integer.parseInt(reply.getSignedRequests());
            }
            return 0;
        } catch (com.taurushq.sdk.protect.openapi.ApiException e) {
            throw apiExceptionMapper.toApiException(e);
        }
    }

    /**
     * Approve request int.
     *
     * @param r          the r
     * @param privateKey the private key
     * @return the int
     * @throws ApiException the api exception
     */
    public int approveRequest(final Request r, final PrivateKey privateKey) throws ApiException {
        return approveRequests(Collections.singletonList(r), privateKey);
    }
}
