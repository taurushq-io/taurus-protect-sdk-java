package com.taurushq.sdk.protect.client.service;

import com.taurushq.sdk.protect.client.mapper.ApiExceptionMapper;
import com.taurushq.sdk.protect.client.mapper.TransactionMapper;
import com.taurushq.sdk.protect.client.model.ApiException;
import com.taurushq.sdk.protect.client.model.Transaction;
import com.taurushq.sdk.protect.openapi.ApiClient;
import com.taurushq.sdk.protect.openapi.api.TransactionsApi;
import com.taurushq.sdk.protect.openapi.model.TgvalidatordGetTransactionsReply;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

/**
 * The type Request service.
 */
public class TransactionService {

    private final TransactionsApi transactionsApi;
    private final ApiExceptionMapper apiExceptionMapper;


    public TransactionService(final ApiClient openApiClient, final ApiExceptionMapper apiExceptionMapper) {

        checkNotNull(openApiClient, "openApiClient cannot be null");
        checkNotNull(apiExceptionMapper, "apiExceptionMapper cannot be null");

        this.apiExceptionMapper = apiExceptionMapper;
        this.transactionsApi = new TransactionsApi(openApiClient);
    }


    public List<Transaction> getTransaction(final long id) throws ApiException {
        checkArgument(id > 0, "transaction id cannot be zero");

        // String currency, String direction, String query, String limit, String offset,
        // OffsetDateTime from, OffsetDateTime to, List<String> transactionIds, String type,
        // String source, String destination, List<String> ids, String blockchain, String network,
        // String fromBlockNumber, String toBlockNumber, List<String> hashes, String address, String amountAbove,
        // Boolean excludeUnknownSourceDestination

        try {
            TgvalidatordGetTransactionsReply reply = transactionsApi.transactionServiceGetTransactions("", "", "", "10", "0", null, null, new ArrayList<>(), "", "", "", Collections.singletonList(String.valueOf(id)), "", "", "0", "0", new ArrayList<>(), "", "0", false);
            return TransactionMapper.INSTANCE.fromDTO(reply.getResult());
        } catch (com.taurushq.sdk.protect.openapi.ApiException e) {
            throw apiExceptionMapper.toApiException(e);
        }
    }

}
