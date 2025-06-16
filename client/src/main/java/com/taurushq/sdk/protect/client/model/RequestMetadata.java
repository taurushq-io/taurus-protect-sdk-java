package com.taurushq.sdk.protect.client.model;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Map;

/**
 * The type Request metadata.
 */
public class RequestMetadata {

    private String hash;
    private Object payload;
    private String payloadAsString;
    private JsonElement payloadAsJson;


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    /**
     * Gets hash.
     *
     * @return the hash
     */
    public String getHash() {
        return hash;
    }

    /**
     * Sets hash.
     *
     * @param hash the hash
     */
    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     * Gets payload.
     *
     * @return the payload
     */
    public Object getPayload() {
        return payload;
    }

    /**
     * Sets payload.
     *
     * @param payload the payload
     */
    public void setPayload(Object payload) {
        this.payload = payload;
    }

    /**
     * Gets payload as string.
     *
     * @return the payload as string
     */
    public String getPayloadAsString() {
        return payloadAsString;
    }

    /**
     * Sets payload as string.
     *
     * @param payloadAsString the payload as string
     */
    public void setPayloadAsString(String payloadAsString) {
        this.payloadAsString = payloadAsString;
        this.payloadAsJson = JsonParser.parseString(payloadAsString);
    }

    /**
     * Gets request id.
     *
     * @return the request id
     * @throws RequestMetadataException the request metadata exception
     */
    public long getRequestId() throws RequestMetadataException {
        return this.getMDLong("request_id");
    }

    /**
     * Gets currency.
     *
     * @return the currency
     * @throws RequestMetadataException the request metadata exception
     */
    public String getCurrency() throws RequestMetadataException {
        return this.getMDString("currency");
    }

    /**
     * Gets the rules key
     *
     * @return the rules key
     * @throws RequestMetadataException the request metadata exception
     */
    public String getRulesKey() throws RequestMetadataException {
        return this.getMDString("rules_key");
    }

    /**
     * Gets source address.
     *
     * @return the source address
     * @throws RequestMetadataException the request metadata exception
     */
    public String getSourceAddress() throws RequestMetadataException {
        for (JsonElement bm : this.payloadAsJson.getAsJsonArray()) {
            Map<String, JsonElement> map = bm.getAsJsonObject().asMap();
            if ("source".equals(map.get("key").getAsString())) {
                return map.get("value").getAsJsonObject().getAsJsonObject("payload").get("address").getAsString();
            }
        }
        throw new RequestMetadataException("source address not found in metadata");
    }

    /**
     * Gets destination address.
     *
     * @return the destination address
     * @throws RequestMetadataException the request metadata exception
     */
    public String getDestinationAddress() throws RequestMetadataException {
        for (JsonElement bm : this.payloadAsJson.getAsJsonArray()) {
            Map<String, JsonElement> map = bm.getAsJsonObject().asMap();
            if ("destination".equals(map.get("key").getAsString())) {
                return map.get("value").getAsJsonObject().getAsJsonObject("payload").get("address").getAsString();
            }
        }
        throw new RequestMetadataException("destination address not found in metadata");
    }

    /**
     * Gets amount.
     *
     * @return the amount
     * @throws RequestMetadataException the request metadata exception
     */
    public RequestMetadataAmount getAmount() throws RequestMetadataException {
        for (JsonElement bm : this.payloadAsJson.getAsJsonArray()) {
            Map<String, JsonElement> map = bm.getAsJsonObject().asMap();
            if ("amount".equals(map.get("key").getAsString())) {

                RequestMetadataAmount amount = new RequestMetadataAmount();
                amount.setValueFrom(map.get("value").getAsJsonObject().get("valueFrom").getAsLong());
                amount.setValueTo(map.get("value").getAsJsonObject().get("valueTo").getAsDouble());
                amount.setRate(map.get("value").getAsJsonObject().get("rate").getAsDouble());
                amount.setDecimals(map.get("value").getAsJsonObject().get("decimals").getAsInt());
                amount.setCurrencyFrom(map.get("value").getAsJsonObject().get("currencyFrom").getAsString());
                amount.setCurrencyTo(map.get("value").getAsJsonObject().get("currencyTo").getAsString());

                return amount;
            }
        }
        throw new RequestMetadataException("amount not found in metadata");
    }


    private String getMDString(String key) throws RequestMetadataException {
        for (JsonElement bm : this.payloadAsJson.getAsJsonArray()) {
            Map<String, JsonElement> map = bm.getAsJsonObject().asMap();
            if (map.get("key").getAsString().equals(key)) {
                return map.get("value").getAsString();
            }
        }
        throw new RequestMetadataException("key '" + key + "' not found in metadata");
    }

    private long getMDLong(String key) throws RequestMetadataException {
        for (JsonElement bm : this.payloadAsJson.getAsJsonArray()) {
            Map<String, JsonElement> map = bm.getAsJsonObject().asMap();
            if (map.get("key").getAsString().equals(key)) {
                return map.get("value").getAsLong();
            }
        }
        throw new RequestMetadataException("key '" + key + "' not found in metadata");
    }
}
