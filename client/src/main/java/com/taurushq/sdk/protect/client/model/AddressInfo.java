package com.taurushq.sdk.protect.client.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.math.BigInteger;
import java.util.List;

public class AddressInfo {

    private String address;
    private String label;
    private String container;
    private String customerId;
    private BigInteger amount;
    private double amountMainUnit;
    private String type;
    private int idx;
    private long internalAddressId;
    private long whitelistedAddressId;
    private List<Score> scores;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public BigInteger getAmount() {
        return amount;
    }

    public void setAmount(BigInteger amount) {
        this.amount = amount;
    }

    public double getAmountMainUnit() {
        return amountMainUnit;
    }

    public void setAmountMainUnit(double amountMainUnit) {
        this.amountMainUnit = amountMainUnit;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public long getInternalAddressId() {
        return internalAddressId;
    }

    public void setInternalAddressId(long internalAddressId) {
        this.internalAddressId = internalAddressId;
    }

    public long getWhitelistedAddressId() {
        return whitelistedAddressId;
    }

    public void setWhitelistedAddressId(long whitelistedAddressId) {
        this.whitelistedAddressId = whitelistedAddressId;
    }

    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
