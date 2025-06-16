package com.taurushq.sdk.protect.client.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * The type Currency.
 */
public class Currency {
    private String id;
    private String name;
    private String symbol;
    private String coinTypeIndex;
    private String blockchain;
    private boolean isToken;
    private boolean isERC20;
    private int decimals;
    private String contractAddress;
    private boolean hasStaking;
    private boolean isUTXOBased;
    private boolean isAccountBased;
    private boolean isFiat;
    private boolean isFA12;
    private boolean isFA20;
    private boolean isNFT;
    private boolean enabled;
    private String displayName;
    private String type;
    private long wlcaId;
    private String network;
    private String tokenId;
    private String logo;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
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
     * Gets symbol.
     *
     * @return the symbol
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Sets symbol.
     *
     * @param symbol the symbol
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     * Gets coin type index.
     *
     * @return the coin type index
     */
    public String getCoinTypeIndex() {
        return coinTypeIndex;
    }

    /**
     * Sets coin type index.
     *
     * @param coinTypeIndex the coin type index
     */
    public void setCoinTypeIndex(String coinTypeIndex) {
        this.coinTypeIndex = coinTypeIndex;
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
     * Is token boolean.
     *
     * @return the boolean
     */
    public boolean isToken() {
        return isToken;
    }

    /**
     * Is token.
     *
     * @param token the token
     */
    public void isToken(boolean token) {
        isToken = token;
    }

    /**
     * Is erc 20 boolean.
     *
     * @return the boolean
     */
    public boolean isERC20() {
        return isERC20;
    }

    /**
     * Is erc 20.
     *
     * @param isERC20 the is erc 20
     */
    public void isERC20(boolean isERC20) {
        this.isERC20 = isERC20;
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
     * Gets contract address.
     *
     * @return the contract address
     */
    public String getContractAddress() {
        return contractAddress;
    }

    /**
     * Sets contract address.
     *
     * @param contractAddress the contract address
     */
    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
    }

    /**
     * Has staking boolean.
     *
     * @return the boolean
     */
    public boolean hasStaking() {
        return hasStaking;
    }

    /**
     * Sets has staking.
     *
     * @param hasStaking the has staking
     */
    public void setHasStaking(boolean hasStaking) {
        this.hasStaking = hasStaking;
    }

    /**
     * Is utxo based boolean.
     *
     * @return the boolean
     */
    public boolean isUTXOBased() {
        return isUTXOBased;
    }

    /**
     * Is utxo based.
     *
     * @param isUTXOBased the is utxo based
     */
    public void isUTXOBased(boolean isUTXOBased) {
        this.isUTXOBased = isUTXOBased;
    }

    /**
     * Is account based boolean.
     *
     * @return the boolean
     */
    public boolean isAccountBased() {
        return isAccountBased;
    }

    /**
     * Is account based.
     *
     * @param accountBased the account based
     */
    public void isAccountBased(boolean accountBased) {
        isAccountBased = accountBased;
    }

    /**
     * Is fiat boolean.
     *
     * @return the boolean
     */
    public boolean isFiat() {
        return isFiat;
    }

    /**
     * Is fiat.
     *
     * @param fiat the fiat
     */
    public void isFiat(boolean fiat) {
        isFiat = fiat;
    }

    /**
     * Is fa 12 boolean.
     *
     * @return the boolean
     */
    public boolean isFA12() {
        return isFA12;
    }

    /**
     * Is fa 12.
     *
     * @param isFA12 the is fa 12
     */
    public void isFA12(boolean isFA12) {
        this.isFA12 = isFA12;
    }

    /**
     * Is fa 20 boolean.
     *
     * @return the boolean
     */
    public boolean isFA20() {
        return isFA20;
    }

    /**
     * Is fa 20.
     *
     * @param isFA20 the is fa 20
     */
    public void isFA20(boolean isFA20) {
        this.isFA20 = isFA20;
    }

    /**
     * Is nft boolean.
     *
     * @return the boolean
     */
    public boolean isNFT() {
        return isNFT;
    }

    /**
     * Is nft.
     *
     * @param isNFT the is nft
     */
    public void isNFT(boolean isNFT) {
        this.isNFT = isNFT;
    }

    /**
     * Is enabled boolean.
     *
     * @return the boolean
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Is enabled.
     *
     * @param enabled the enabled
     */
    public void isEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Gets display name.
     *
     * @return the display name
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets display name.
     *
     * @param displayName the display name
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets wlca id.
     *
     * @return the wlca id
     */
    public long getWlcaId() {
        return wlcaId;
    }

    /**
     * Sets wlca id.
     *
     * @param wlcaId the wlca id
     */
    public void setWlcaId(long wlcaId) {
        this.wlcaId = wlcaId;
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
     * Gets token id.
     *
     * @return the token id
     */
    public String getTokenId() {
        return tokenId;
    }

    /**
     * Sets token id.
     *
     * @param tokenId the token id
     */
    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    /**
     * Gets logo.
     *
     * @return the logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     * Sets logo.
     *
     * @param logo the logo
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }
}
