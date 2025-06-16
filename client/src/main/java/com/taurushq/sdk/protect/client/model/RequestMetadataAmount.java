package com.taurushq.sdk.protect.client.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * The type Request metadata amount.
 */
public class RequestMetadataAmount {
    private long valueFrom;
    private double valueTo;
    private double rate;
    private int decimals;
    private String currencyFrom;
    private String currencyTo;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    /**
     * Gets value from.
     *
     * @return the value from
     */
    public long getValueFrom() {
        return valueFrom;
    }

    /**
     * Sets value from.
     *
     * @param valueFrom the value from
     */
    public void setValueFrom(long valueFrom) {
        this.valueFrom = valueFrom;
    }

    /**
     * Gets value to.
     *
     * @return the value to
     */
    public double getValueTo() {
        return valueTo;
    }

    /**
     * Sets value to.
     *
     * @param valueTo the value to
     */
    public void setValueTo(double valueTo) {
        this.valueTo = valueTo;
    }

    /**
     * Gets rate.
     *
     * @return the rate
     */
    public double getRate() {
        return rate;
    }

    /**
     * Sets rate.
     *
     * @param rate the rate
     */
    public void setRate(double rate) {
        this.rate = rate;
    }

    /**
     * Gets decimals.
     *
     * @return the decimals
     */
    public int getDecimals() {
        return decimals;
    }

    /**
     * Sets decimals.
     *
     * @param decimals the decimals
     */
    public void setDecimals(int decimals) {
        this.decimals = decimals;
    }

    /**
     * Gets currency from.
     *
     * @return the currency from
     */
    public String getCurrencyFrom() {
        return currencyFrom;
    }

    /**
     * Sets currency from.
     *
     * @param currencyFrom the currency from
     */
    public void setCurrencyFrom(String currencyFrom) {
        this.currencyFrom = currencyFrom;
    }

    /**
     * Gets currency to.
     *
     * @return the currency to
     */
    public String getCurrencyTo() {
        return currencyTo;
    }

    /**
     * Sets currency to.
     *
     * @param currencyTo the currency to
     */
    public void setCurrencyTo(String currencyTo) {
        this.currencyTo = currencyTo;
    }
}
