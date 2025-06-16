package com.taurushq.sdk.protect.client.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.math.BigInteger;

/**
 * The type Balance.
 */
public class Balance {

    private BigInteger totalConfirmed;
    private BigInteger totalUnconfirmed;
    private BigInteger availableConfirmed;
    private BigInteger availableUnconfirmed;
    private BigInteger reservedConfirmed;
    private BigInteger reservedUnconfirmed;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    /**
     * Gets total confirmed.
     *
     * @return the total confirmed
     */
    public BigInteger getTotalConfirmed() {
        return totalConfirmed;
    }

    /**
     * Sets total confirmed.
     *
     * @param totalConfirmed the total confirmed
     */
    public void setTotalConfirmed(BigInteger totalConfirmed) {
        this.totalConfirmed = totalConfirmed;
    }

    /**
     * Gets total unconfirmed.
     *
     * @return the total unconfirmed
     */
    public BigInteger getTotalUnconfirmed() {
        return totalUnconfirmed;
    }

    /**
     * Sets total unconfirmed.
     *
     * @param totalUnconfirmed the total unconfirmed
     */
    public void setTotalUnconfirmed(BigInteger totalUnconfirmed) {
        this.totalUnconfirmed = totalUnconfirmed;
    }

    /**
     * Gets available confirmed.
     *
     * @return the available confirmed
     */
    public BigInteger getAvailableConfirmed() {
        return availableConfirmed;
    }

    /**
     * Sets available confirmed.
     *
     * @param availableConfirmed the available confirmed
     */
    public void setAvailableConfirmed(BigInteger availableConfirmed) {
        this.availableConfirmed = availableConfirmed;
    }

    /**
     * Gets available unconfirmed.
     *
     * @return the available unconfirmed
     */
    public BigInteger getAvailableUnconfirmed() {
        return availableUnconfirmed;
    }

    /**
     * Sets available unconfirmed.
     *
     * @param availableUnconfirmed the available unconfirmed
     */
    public void setAvailableUnconfirmed(BigInteger availableUnconfirmed) {
        this.availableUnconfirmed = availableUnconfirmed;
    }

    /**
     * Gets reserved confirmed.
     *
     * @return the reserved confirmed
     */
    public BigInteger getReservedConfirmed() {
        return reservedConfirmed;
    }

    /**
     * Sets reserved confirmed.
     *
     * @param reservedConfirmed the reserved confirmed
     */
    public void setReservedConfirmed(BigInteger reservedConfirmed) {
        this.reservedConfirmed = reservedConfirmed;
    }

    /**
     * Gets reserved unconfirmed.
     *
     * @return the reserved unconfirmed
     */
    public BigInteger getReservedUnconfirmed() {
        return reservedUnconfirmed;
    }

    /**
     * Sets reserved unconfirmed.
     *
     * @param reservedUnconfirmed the reserved unconfirmed
     */
    public void setReservedUnconfirmed(BigInteger reservedUnconfirmed) {
        this.reservedUnconfirmed = reservedUnconfirmed;
    }
}
