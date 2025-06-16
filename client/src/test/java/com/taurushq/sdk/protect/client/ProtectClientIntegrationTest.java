package com.taurushq.sdk.protect.client;


import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.taurushq.sdk.protect.client.model.Address;
import com.taurushq.sdk.protect.client.model.ApiException;
import com.taurushq.sdk.protect.client.model.Request;
import com.taurushq.sdk.protect.client.model.RequestMetadataException;
import com.taurushq.sdk.protect.client.model.Transaction;
import com.taurushq.sdk.protect.client.model.Wallet;
import com.taurushq.sdk.protect.openapi.auth.ApiKeyTPV1Exception;
import com.taurushq.sdk.protect.openapi.auth.CryptoTPV1;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.math.BigInteger;
import java.security.PrivateKey;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Disabled("this testcase is only for demo purpose")
class ProtectClientIntegrationTest {

    private final String host = "http://localhost:6000";
    private final String apiKey = "xxx";
    private final String apiSecret = "xxx";


    private final String team1PrivateKey = "-----BEGIN EC PRIVATE KEY-----\n" +
            "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n" +
            "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n" +
            "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n" +
            "-----END EC PRIVATE KEY-----";


    private static void checkRequest(Request r, long requestId, String currency, String baseCurrency, String sourceAddress, String destinationAddress, long amount, double minRate, double maxRate, int decimals) {

        try {

            if (r.getMetadata().getRequestId() != requestId) {
                throw new SecurityException("invalid request id (expected: " + requestId + ", got: " + r.getMetadata().getRequestId() + ")");
            }

            if (!r.getMetadata().getCurrency().equals(currency)) {
                throw new SecurityException("invalid currency (expected: " + currency + ", got: " + r.getMetadata().getCurrency() + ")");
            }

            if (!r.getMetadata().getSourceAddress().equals(sourceAddress)) {
                throw new SecurityException("invalid source address (expected: " + sourceAddress + ", got: " + r.getMetadata().getSourceAddress() + ")");
            }

            if (!r.getMetadata().getDestinationAddress().equals(destinationAddress)) {
                throw new SecurityException("invalid destination address (expected: " + destinationAddress + ", got: " + r.getMetadata().getDestinationAddress() + ")");
            }

            if (!r.getMetadata().getAmount().getCurrencyFrom().equals(currency)) {
                throw new SecurityException("invalid amount currency (expected: " + currency + ", got: " + r.getMetadata().getAmount().getCurrencyFrom() + ")");
            }

            if (!r.getMetadata().getAmount().getCurrencyTo().equals(baseCurrency)) {
                throw new SecurityException("invalid amount base currency (expected: " + baseCurrency + ", got: " + r.getMetadata().getAmount().getCurrencyTo() + ")");
            }

            if (r.getMetadata().getAmount().getDecimals() != decimals) {
                throw new SecurityException("invalid amount decimals (expected: " + decimals + ", got: " + r.getMetadata().getAmount().getDecimals() + ")");
            }

            if (r.getMetadata().getAmount().getValueFrom() != amount) {
                throw new SecurityException("invalid amount (expected: " + amount + ", got: " + r.getMetadata().getAmount().getValueFrom() + ")");
            }
            if (r.getMetadata().getAmount().getRate() < minRate || r.getMetadata().getAmount().getRate() > maxRate) {
                throw new SecurityException("invalid rate (min expected: " + minRate + ", max expected: " + minRate + ", got: " + r.getMetadata().getAmount().getRate() + ")");
            }

            // Other checks goes here


        } catch (RequestMetadataException e) {
            throw new SecurityException(e);
        }

    }

    /**
     * An example on how to verify request metadata in a generic way
     */
    private static void genericCheckRequest(Request r, long requestId, String currency, String baseCurrency, String sourceAddress, String destinationAddress, long amount, double minRate, double maxRate, int decimals) {
        int validChecks = 0;

        JsonElement root = JsonParser.parseString(r.getMetadata().getPayloadAsString());
        for (JsonElement bm : root.getAsJsonArray()) {
            System.out.println(bm);
            Map<String, JsonElement> map = bm.getAsJsonObject().asMap();

            switch (map.get("key").getAsString()) {
                case "request_id":
                    validChecks++;
                    if (map.get("value").getAsInt() != requestId) {
                        throw new SecurityException("invalid request id: " + map.get("value").toString());
                    }
                    break;
                case "currency":
                    validChecks++;
                    if (!map.get("value").getAsString().equals(currency)) {
                        throw new SecurityException("invalid currency: " + map.get("value").toString());
                    }
                    break;
                case "source":
                    validChecks++;
                    if (!map.get("value").getAsJsonObject().getAsJsonObject("payload").get("address").getAsString().equals(sourceAddress)) {
                        throw new SecurityException("invalid source: " + map.get("value").toString());
                    }
                    break;
                case "destination":
                    validChecks++;
                    if (!map.get("value").getAsJsonObject().getAsJsonObject("payload").get("address").getAsString().equals(destinationAddress)) {
                        throw new SecurityException("invalid destination: " + map.get("value").toString());
                    }
                    break;
                case "amount":
                    validChecks++;
                    if (map.get("value").getAsJsonObject().get("valueFrom").getAsLong() != amount) {
                        throw new SecurityException("invalid amount: " + map.get("value").toString());
                    }
                    if (map.get("value").getAsJsonObject().get("rate").getAsDouble() < minRate || map.get("value").getAsJsonObject().get("rate").getAsDouble() > maxRate) {
                        throw new SecurityException("invalid rate: " + map.get("value").toString());
                    }
                    if (map.get("value").getAsJsonObject().get("decimals").getAsInt() != decimals) {
                        throw new SecurityException("invalid decimals: " + map.get("value").toString());
                    }
                    if (!map.get("value").getAsJsonObject().get("currencyFrom").getAsString().equals(currency)) {
                        throw new SecurityException("invalid currencyFrom: " + map.get("value").toString());
                    }
                    if (!map.get("value").getAsJsonObject().get("currencyTo").getAsString().equals(baseCurrency)) {
                        throw new SecurityException("invalid currencyTo: " + map.get("value").toString());
                    }
                    break;

                //
                // Other important metadata checks come here
                // ...
                //

            }

        }

        if (validChecks != 5) {
            throw new SecurityException("not all checks have been performed on the request");
        }
    }

    @Test
    void createWallet() throws ApiKeyTPV1Exception {

        ProtectClient client = new ProtectClient(host, apiKey, apiSecret);

        Wallet w = null;
        try {
            w = client.getWalletService().createWallet("ETH", "mainnet", "Java SDK test4", false);
        } catch (ApiException e) {

            System.out.println(e.getMessage());
            System.out.println(e.getError());

            throw new RuntimeException(e);
        }
        System.out.println(w);
        Wallet w2 = null;
        try {
            w2 = client.getWalletService().getWallet(w.id);
        } catch (ApiException e) {
            throw new RuntimeException(e);
        }
        System.out.println(w2);
    }

    @Test
    void getWallet() throws ApiKeyTPV1Exception {
        ProtectClient client = new ProtectClient(host, apiKey, apiSecret);
        Wallet w = null;
        try {
            w = client.getWalletService().getWallet(4);
        } catch (ApiException e) {
            throw new RuntimeException(e);
        }
        System.out.println(w);
    }

    @Test
    void createAddress() throws ApiKeyTPV1Exception {

        ProtectClient client = new ProtectClient(host, apiKey, apiSecret);

        Address a = null;
        try {
            a = client.getAddressService().createAddress(1, "my address", "my comment", "");
        } catch (ApiException e) {

            System.out.println(e.getMessage());
            System.out.println(e.getError());

            throw new RuntimeException(e);
        }
        System.out.println(a);

    }

    @Test
    void getAddress() throws ApiKeyTPV1Exception {

        ProtectClient client = new ProtectClient(host, apiKey, apiSecret);

        Address a = null;
        try {
            a = client.getAddressService().getAddress(4);
        } catch (ApiException e) {

            System.out.println(e.getMessage());
            System.out.println(e.getError());

            throw new RuntimeException(e);
        }
        System.out.println(a);
        System.out.println("available funds: " + a.getBalance().getAvailableConfirmed());

    }

    @Test
    void createOutgoingRequest() throws ApiKeyTPV1Exception {
        ProtectClient client = new ProtectClient(host, apiKey, apiSecret);

        Request r;
        try {
            r = client.getRequestService().createInternalTransferRequest(4, 6, BigInteger.valueOf(2));
        } catch (ApiException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getError());

            throw new RuntimeException(e);
        }
        System.out.println(r);

    }

    @Test
    void getRequest() throws ApiKeyTPV1Exception {
        ProtectClient client = new ProtectClient(host, apiKey, apiSecret);

        Request r;
        try {
            r = client.getRequestService().getRequest(6286376);
        } catch (ApiException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getError());

            throw new RuntimeException(e);
        }
        System.out.println(r);
        System.out.println("METADATA PAYLOAD: " + r.getMetadata().getPayloadAsString());

        r.getSignedRequests().stream().forEach(s -> System.out.println(s.getHash() + ": " + s.getStatus()));
    }

    @Test
    void approveRequest() throws ApiKeyTPV1Exception {
        ProtectClient client = new ProtectClient(host, apiKey, apiSecret);
        try {
            Request r1 = client.getRequestService().getRequest(6286272);
            Request r2 = client.getRequestService().getRequest(6286376);

            ///////////////
            // CRITICAL //
            //
            // For each request:
            // 1) check the hash of the metadata
            // 2) decode the metadata from the string you used to check the hash
            // 3) review the metadata (source, destination, amount, conversion rate, etc.)
            //
            // Point 1) is already performed in the getRequest() method
            //
            ///////////////

            // use high-level function to check common metadata values
            checkRequest(r1, 6286272, "XLM", "CHF", "GBLNAHS75FMDPFPBZSEH2VC5ZAYVRETDVQDUT44M4T4FXWMJTZ6I2I2B", "GDWIH4JIZEDCHIRNQUQAOPPBGVUS23KCVH6JH7NM2D55LIC66QVY4MK6", 2, 0.01, 0.2, 7);

            // alternatively, use a very generic way to check any metadata, even those not currently exposed by the SDK
            genericCheckRequest(r2, 6286376, "XLM", "CHF", "GBLNAHS75FMDPFPBZSEH2VC5ZAYVRETDVQDUT44M4T4FXWMJTZ6I2I2B", "GDWIH4JIZEDCHIRNQUQAOPPBGVUS23KCVH6JH7NM2D55LIC66QVY4MK6", 2, 0.01, 0.2, 7);

            //
            // CRITICAL //
            ///////////////

            PrivateKey privateKey = CryptoTPV1.decodePrivateKey(team1PrivateKey);
            int amountOfSigs = client.getRequestService().approveRequests(Arrays.asList(r2, r1), privateKey);
            System.out.println("signatures performed: " + amountOfSigs);

        } catch (ApiException | SecurityException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    void getTransaction() throws ApiKeyTPV1Exception {
        ProtectClient client = new ProtectClient(host, apiKey, apiSecret);

        List<Transaction> txs;
        try {
            txs = client.getTransactionService().getTransaction(1);
        } catch (ApiException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getError());

            throw new RuntimeException(e);
        }
        //  System.out.println(txs);

        txs.stream().forEach(t -> System.out.println(t));
    }
}


