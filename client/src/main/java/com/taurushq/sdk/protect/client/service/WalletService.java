package com.taurushq.sdk.protect.client.service;

import com.google.common.base.Strings;
import com.taurushq.sdk.protect.client.mapper.ApiExceptionMapper;
import com.taurushq.sdk.protect.client.mapper.WalletMapper;
import com.taurushq.sdk.protect.client.model.ApiException;
import com.taurushq.sdk.protect.client.model.Wallet;
import com.taurushq.sdk.protect.openapi.ApiClient;
import com.taurushq.sdk.protect.openapi.api.WalletsApi;
import com.taurushq.sdk.protect.openapi.model.TgvalidatordCreateWalletReply;
import com.taurushq.sdk.protect.openapi.model.TgvalidatordCreateWalletRequest;
import com.taurushq.sdk.protect.openapi.model.TgvalidatordGetWalletInfoReply;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

/**
 * The type Wallet service.
 */
public class WalletService {
    private final WalletsApi walletsApi;
    private final ApiExceptionMapper apiExceptionMapper;

    /**
     * Instantiates a new Wallet service.
     *
     * @param openApiClient      the open api client
     * @param apiExceptionMapper the api exception mapper
     */
    public WalletService(final ApiClient openApiClient, final ApiExceptionMapper apiExceptionMapper) {

        checkNotNull(openApiClient, "openApiClient cannot be null");
        checkNotNull(apiExceptionMapper, "apiExceptionMapper cannot be null");

        this.apiExceptionMapper = apiExceptionMapper;
        this.walletsApi = new WalletsApi(openApiClient);
    }


    /**
     * Create wallet.
     *
     * @param blockchain the blockchain
     * @param network    the network
     * @param walletName the wallet name
     * @param isOmnibus  the is omnibus
     * @return the wallet
     * @throws ApiException the api exception
     */
    public Wallet createWallet(final String blockchain, final String network, final String walletName, final boolean isOmnibus) throws ApiException {
        return createWallet(blockchain, network, walletName, isOmnibus, "", "");
    }

    /**
     * Create wallet.
     *
     * @param blockchain the blockchain
     * @param network    the network
     * @param walletName the wallet name
     * @param isOmnibus  the is omnibus
     * @param comment    the comment
     * @return the wallet
     * @throws ApiException the api exception
     */
    public Wallet createWallet(final String blockchain, final String network, final String walletName, final boolean isOmnibus, final String comment) throws ApiException {
        return createWallet(blockchain, network, walletName, isOmnibus, comment, "");
    }


    /**
     * Create wallet.
     *
     * @param blockchain the blockchain
     * @param network    the network
     * @param walletName the wallet name
     * @param isOmnibus  the is omnibus
     * @param comment    the comment
     * @param customerId the customer id
     * @return the wallet
     * @throws ApiException the api exception
     */
    public Wallet createWallet(final String blockchain, final String network, final String walletName, final boolean isOmnibus, final String comment, final String customerId) throws ApiException {
        checkArgument(!Strings.isNullOrEmpty(blockchain), "blockchain cannot be null or empty");
        checkArgument(!Strings.isNullOrEmpty(network), "network cannot be null or empty");
        checkArgument(!Strings.isNullOrEmpty(walletName), "walletName cannot be null or empty");


        TgvalidatordCreateWalletRequest request = new TgvalidatordCreateWalletRequest();
        request.setBlockchain(blockchain);
        request.setNetwork(network);
        request.setName(walletName);
        request.setIsOmnibus(isOmnibus);
        request.setComment(comment);
        request.setCustomerId(customerId);
        try {
            TgvalidatordCreateWalletReply reply = walletsApi.walletServiceCreateWallet(request);
            return WalletMapper.INSTANCE.fromDTO(reply.getResult());
        } catch (com.taurushq.sdk.protect.openapi.ApiException e) {
            throw apiExceptionMapper.toApiException(e);
        }
    }

    /**
     * Gets wallet.
     *
     * @param walletId the wallet id
     * @return the wallet
     * @throws ApiException the api exception
     */
    public Wallet getWallet(final long walletId) throws ApiException {
        checkArgument(walletId > 0, "walletId cannot be zero");

        try {
            TgvalidatordGetWalletInfoReply result = walletsApi.walletServiceGetWalletV2(String.valueOf(walletId));
            return WalletMapper.INSTANCE.fromDTO(result.getResult());
        } catch (com.taurushq.sdk.protect.openapi.ApiException e) {
            throw apiExceptionMapper.toApiException(e);
        }

    }

}
