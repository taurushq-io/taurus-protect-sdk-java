package com.taurushq.sdk.protect.client.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * The type Wallet.
 */
public class Wallet {

    /**
     * The Id.
     */
    public long id;
    /**
     * The Name.
     */
    public String name;
    /**
     * The Currency.
     */
    public String currency;
    private Balance balance;
    private String accountPath;
    private boolean isOmnibus;
    private OffsetDateTime creationDate;
    private OffsetDateTime updateDate;
    private String customerId;
    private String comment;
    private boolean disabled;
    private String blockchain;
    private int addressesCount;
    private Currency currencyInfo;
    private List<Attribute> attributes;
    private String network;
    private String visibilityGroupID;


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
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
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
     * Gets account path.
     *
     * @return the account path
     */
    public String getAccountPath() {
        return accountPath;
    }

    /**
     * Sets account path.
     *
     * @param accountPath the account path
     */
    public void setAccountPath(String accountPath) {
        this.accountPath = accountPath;
    }

    /**
     * Is omnibus boolean.
     *
     * @return the boolean
     */
    public boolean isOmnibus() {
        return isOmnibus;
    }

    /**
     * Is omnibus.
     *
     * @param omnibus the omnibus
     */
    public void isOmnibus(boolean omnibus) {
        isOmnibus = omnibus;
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
     * Gets customer id.
     *
     * @return the customer id
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets customer id.
     *
     * @param customerId the customer id
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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
     * Gets blockchain.
     *
     * @return the blockchain
     */
    public String getBlockchain() {
        return blockchain;
    }

    /**
     * Sets blockchain.
     *
     * @param blockchain the blockchain
     */
    public void setBlockchain(String blockchain) {
        this.blockchain = blockchain;
    }

    /**
     * Gets addresses count.
     *
     * @return the addresses count
     */
    public int getAddressesCount() {
        return addressesCount;
    }

    /**
     * Sets addresses count.
     *
     * @param addressesCount the addresses count
     */
    public void setAddressesCount(int addressesCount) {
        this.addressesCount = addressesCount;
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

    /**
     * Gets network.
     *
     * @return the network
     */
    public String getNetwork() {
        return network;
    }

    /**
     * Sets network.
     *
     * @param network the network
     */
    public void setNetwork(String network) {
        this.network = network;
    }

    /**
     * Gets visibility group id.
     *
     * @return the visibility group id
     */
    public String getVisibilityGroupID() {
        return visibilityGroupID;
    }

    /**
     * Sets visibility group id.
     *
     * @param visibilityGroupID the visibility group id
     */
    public void setVisibilityGroupID(String visibilityGroupID) {
        this.visibilityGroupID = visibilityGroupID;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}


