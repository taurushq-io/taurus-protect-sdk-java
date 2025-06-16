package com.taurushq.sdk.protect.client.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.List;

public class Transaction {


    private long id;
    private long requestId;
    private String direction;
    private String network;
    private String blockchain;
    private String currency;
    private Currency currencyInfo;
    private BigInteger amount;
    private double amountMainUnit;
    private List<AddressInfo> sources;
    private List<AddressInfo> destinations;
    private BigInteger fee;
    private double feeMainUnit;
    private String hash;
    private long block;
    private long confirmationBlock;
    private OffsetDateTime receptionDate;
    private OffsetDateTime confirmationDate;
    private String transactionId;
    private String type;
    private String uniqueId;
    private String arg1;
    private String arg2;
    private boolean requestVisible;


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getRequestId() {
        return requestId;
    }

    public void setRequestId(long requestId) {
        this.requestId = requestId;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getBlockchain() {
        return blockchain;
    }

    public void setBlockchain(String blockchain) {
        this.blockchain = blockchain;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Currency getCurrencyInfo() {
        return currencyInfo;
    }

    public void setCurrencyInfo(Currency currencyInfo) {
        this.currencyInfo = currencyInfo;
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

    public List<AddressInfo> getSources() {
        return sources;
    }

    public void setSources(List<AddressInfo> sources) {
        this.sources = sources;
    }

    public List<AddressInfo> getDestinations() {
        return destinations;
    }

    public void setDestinations(List<AddressInfo> destinations) {
        this.destinations = destinations;
    }

    public BigInteger getFee() {
        return fee;
    }

    public void setFee(BigInteger fee) {
        this.fee = fee;
    }

    public double getFeeMainUnit() {
        return feeMainUnit;
    }

    public void setFeeMainUnit(double feeMainUnit) {
        this.feeMainUnit = feeMainUnit;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public long getBlock() {
        return block;
    }

    public void setBlock(long block) {
        this.block = block;
    }

    public long getConfirmationBlock() {
        return confirmationBlock;
    }

    public void setConfirmationBlock(long confirmationBlock) {
        this.confirmationBlock = confirmationBlock;
    }

    public OffsetDateTime getReceptionDate() {
        return receptionDate;
    }

    public void setReceptionDate(OffsetDateTime receptionDate) {
        this.receptionDate = receptionDate;
    }

    public OffsetDateTime getConfirmationDate() {
        return confirmationDate;
    }

    public void setConfirmationDate(OffsetDateTime confirmationDate) {
        this.confirmationDate = confirmationDate;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getArg1() {
        return arg1;
    }

    public void setArg1(String arg1) {
        this.arg1 = arg1;
    }

    public String getArg2() {
        return arg2;
    }

    public void setArg2(String arg2) {
        this.arg2 = arg2;
    }

    public boolean isRequestVisible() {
        return requestVisible;
    }

    public void setRequestVisible(boolean requestVisible) {
        this.requestVisible = requestVisible;
    }
}
