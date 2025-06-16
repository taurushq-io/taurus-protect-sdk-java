package com.taurushq.sdk.protect.client.service;

import com.google.common.base.Strings;
import com.taurushq.sdk.protect.client.mapper.AddressMapper;
import com.taurushq.sdk.protect.client.mapper.ApiExceptionMapper;
import com.taurushq.sdk.protect.client.model.Address;
import com.taurushq.sdk.protect.client.model.ApiException;
import com.taurushq.sdk.protect.openapi.ApiClient;
import com.taurushq.sdk.protect.openapi.api.AddressesApi;
import com.taurushq.sdk.protect.openapi.model.TgvalidatordCreateAddressReply;
import com.taurushq.sdk.protect.openapi.model.TgvalidatordCreateAddressRequest;
import com.taurushq.sdk.protect.openapi.model.TgvalidatordGetAddressReply;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

/**
 * The type Address service.
 */
public class AddressService {

    private final AddressesApi addressesApi;
    private final ApiExceptionMapper apiExceptionMapper;

    /**
     * Instantiates a new Address service.
     *
     * @param openApiClient      the open api client
     * @param apiExceptionMapper the api exception mapper
     */
    public AddressService(final ApiClient openApiClient, final ApiExceptionMapper apiExceptionMapper) {

        checkNotNull(openApiClient, "openApiClient cannot be null");
        checkNotNull(apiExceptionMapper, "apiExceptionMapper cannot be null");

        this.apiExceptionMapper = apiExceptionMapper;
        this.addressesApi = new AddressesApi(openApiClient);
    }


    /**
     * Create address address.
     *
     * @param walletId   the wallet id
     * @param label      the label
     * @param comment    the comment
     * @param customerId the customer id
     * @return the address
     * @throws ApiException the api exception
     */
    public Address createAddress(final long walletId, final String label, final String comment, final String customerId) throws ApiException {

        checkArgument(walletId > 0, "walletId cannot be zero");
        checkArgument(!Strings.isNullOrEmpty(label), "label cannot be null or empty");
        checkArgument(!Strings.isNullOrEmpty(comment), "comment cannot be null or empty");


        TgvalidatordCreateAddressRequest request = new TgvalidatordCreateAddressRequest();
        request.setWalletId(String.valueOf(walletId));
        request.setLabel(label);
        request.setComment(comment);
        request.setCustomerId(customerId);
        try {
            TgvalidatordCreateAddressReply reply = addressesApi.walletServiceCreateAddress(request);
            return AddressMapper.INSTANCE.fromDTO(reply.getResult());
        } catch (com.taurushq.sdk.protect.openapi.ApiException e) {
            throw apiExceptionMapper.toApiException(e);
        }
    }


    /**
     * Gets address.
     *
     * @param id the id
     * @return the address
     * @throws ApiException the api exception
     */
    public Address getAddress(final long id) throws ApiException {

        checkArgument(id > 0, "address id cannot be zero");

        try {
            TgvalidatordGetAddressReply reply = addressesApi.walletServiceGetAddress(String.valueOf(id));
            return AddressMapper.INSTANCE.fromDTO(reply.getResult());
        } catch (com.taurushq.sdk.protect.openapi.ApiException e) {
            throw apiExceptionMapper.toApiException(e);
        }
    }
}
