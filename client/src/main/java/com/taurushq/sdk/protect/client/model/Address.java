package com.taurushq.sdk.protect.client.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * The type Address.
 */
public class Address {

    private long id;
    private long walletId;
    private boolean disabled;
    private String currency;
    private Currency currencyInfo;
    private String addressPath;
    private String address;
    private String comment;
    private String label;
    private String signature;
    private OffsetDateTime creationDate;
    private OffsetDateTime updateDate;
    private Wallet walletInfo;
    private Balance balance;
    private List<Score> scores;
    private List<Attribute> attributes;


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets wallet id.
     *
     * @return the wallet id
     */
    public long getWalletId() {
        return walletId;
    }

    /**
     * Sets wallet id.
     *
     * @param walletId the wallet id
     */
    public void setWalletId(long walletId) {
        this.walletId = walletId;
    }

    /**
     * Is disabled boolean.
     *
     * @return the boolean
     */
    public boolean isDisabled() {
        return disabled;
    }

    /**
     * Is disabled.
     *
     * @param disabled the disabled
     */
    public void isDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    /**
     * Gets currency.
     *
     * @return the currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets currency.
     *
     * @param currency the currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Gets currency info.
     *
     * @return the currency info
     */
    public Currency getCurrencyInfo() {
        return currencyInfo;
    }

    /**
     * Sets currency info.
     *
     * @param currencyInfo the currency info
     */
    public void setCurrencyInfo(Currency currencyInfo) {
        this.currencyInfo = currencyInfo;
    }

    /**
     * Gets address path.
     *
     * @return the address path
     */
    public String getAddressPath() {
        return addressPath;
    }

    /**
     * Sets address path.
     *
     * @param addressPath the address path
     */
    public void setAddressPath(String addressPath) {
        this.addressPath = addressPath;
    }

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets comment.
     *
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets comment.
     *
     * @param comment the comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * Gets label.
     *
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets label.
     *
     * @param label the label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Gets signature.
     *
     * @return the signature
     */
    public String getSignature() {
        return signature;
    }

    /**
     * Sets signature.
     *
     * @param signature the signature
     */
    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * Gets creation date.
     *
     * @return the creation date
     */
    public OffsetDateTime getCreationDate() {
        return creationDate;
    }

    /**
     * Sets creation date.
     *
     * @param creationDate the creation date
     */
    public void setCreationDate(OffsetDateTime creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * Gets update date.
     *
     * @return the update date
     */
    public OffsetDateTime getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets update date.
     *
     * @param updateDate the update date
     */
    public void setUpdateDate(OffsetDateTime updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * Gets wallet info.
     *
     * @return the wallet info
     */
    public Wallet getWalletInfo() {
        return walletInfo;
    }

    /**
     * Sets wallet info.
     *
     * @param walletInfo the wallet info
     */
    public void setWalletInfo(Wallet walletInfo) {
        this.walletInfo = walletInfo;
    }

    /**
     * Gets balance.
     *
     * @return the balance
     */
    public Balance getBalance() {
        return balance;
    }

    /**
     * Sets balance.
     *
     * @param balance the balance
     */
    public void setBalance(Balance balance) {
        this.balance = balance;
    }

    /**
     * Gets scores.
     *
     * @return the scores
     */
    public List<Score> getScores() {
        return scores;
    }

    /**
     * Sets scores.
     *
     * @param scores the scores
     */
    public void setScores(List<Score> scores) {
        this.scores = scores;
    }

    /**
     * Gets attributes.
     *
     * @return the attributes
     */
    public List<Attribute> getAttributes() {
        return attributes;
    }

    /**
     * Sets attributes.
     *
     * @param attributes the attributes
     */
    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }
}
