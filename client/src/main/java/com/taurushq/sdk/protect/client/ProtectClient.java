package com.taurushq.sdk.protect.client;

import com.google.common.base.Strings;
import com.taurushq.sdk.protect.client.mapper.ApiExceptionMapper;
import com.taurushq.sdk.protect.client.service.AddressService;
import com.taurushq.sdk.protect.client.service.RequestService;
import com.taurushq.sdk.protect.client.service.TransactionService;
import com.taurushq.sdk.protect.client.service.WalletService;
import com.taurushq.sdk.protect.openapi.ApiClient;
import com.taurushq.sdk.protect.openapi.auth.ApiKeyTPV1Exception;

import static com.google.common.base.Preconditions.checkArgument;

/**
 * The type Protect client.
 */
public class ProtectClient {

    private final ApiClient openApiClient;
    private final WalletService walletService;
    private final AddressService addressService;
    private final RequestService requestService;
    private final TransactionService transactionService;


    /**
     * Instantiates a new Protect client.
     *
     * @param host      the host
     * @param apiKey    the api key
     * @param apiSecret the api secret
     * @throws ApiKeyTPV1Exception the api key tpv 1 exception
     */
    public ProtectClient(String host, String apiKey, String apiSecret) throws ApiKeyTPV1Exception {

        checkArgument(!Strings.isNullOrEmpty(host), "host cannot be null or empty");
        checkArgument(!Strings.isNullOrEmpty(apiKey), "apiKey cannot be null or empty");
        checkArgument(!Strings.isNullOrEmpty(apiSecret), "apiSecret cannot be null or empty");


        openApiClient = new ApiClient();
        openApiClient.setBasePath(host);
        openApiClient.setApiKeyTPV1(apiKey);
        openApiClient.setApiSecretTPV1(apiSecret);

        ApiExceptionMapper apiExceptionMapper = new ApiExceptionMapper();
        this.walletService = new WalletService(openApiClient, apiExceptionMapper);
        this.addressService = new AddressService(openApiClient, apiExceptionMapper);
        this.requestService = new RequestService(openApiClient, apiExceptionMapper);
        this.transactionService = new TransactionService(openApiClient, apiExceptionMapper);
    }


    /**
     * returns the internal OpenApi client, allowing for raw API access
     *
     * @return the internal OpenApiClient
     */
    public ApiClient getOpenApiClient() {
        return openApiClient;
    }

    /**
     * Gets wallet service.
     *
     * @return the wallet service
     */
    public WalletService getWalletService() {
        return walletService;
    }

    /**
     * Gets address service.
     *
     * @return the address service
     */
    public AddressService getAddressService() {
        return addressService;
    }

    /**
     * Gets request service.
     *
     * @return the request service
     */
    public RequestService getRequestService() {
        return requestService;
    }

    public TransactionService getTransactionService() {
        return transactionService;
    }
}
