package com.taurushq.sdk.protect.client.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * The type Signed request.
 */
public class SignedRequest {
    private String id;
    private String signedRequest;
    private RequestStatus status;
    private String hash;
    private long block;
    private String details;
    private OffsetDateTime creationDate;
    private OffsetDateTime updateDate;
    private OffsetDateTime broadcastDate;
    private OffsetDateTime confirmationDate;
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
     * Gets signed request.
     *
     * @return the signed request
     */
    public String getSignedRequest() {
        return signedRequest;
    }

    /**
     * Sets signed request.
     *
     * @param signedRequest the signed request
     */
    public void setSignedRequest(String signedRequest) {
        this.signedRequest = signedRequest;
    }

    /**
     * Gets status.
     *
     * @return the status
     */
    public RequestStatus getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(RequestStatus status) {
        this.status = status;
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
     * Gets block.
     *
     * @return the block
     */
    public long getBlock() {
        return block;
    }

    /**
     * Sets block.
     *
     * @param block the block
     */
    public void setBlock(long block) {
        this.block = block;
    }

    /**
     * Gets details.
     *
     * @return the details
     */
    public String getDetails() {
        return details;
    }

    /**
     * Sets details.
     *
     * @param details the details
     */
    public void setDetails(String details) {
        this.details = details;
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
     * Gets broadcast date.
     *
     * @return the broadcast date
     */
    public OffsetDateTime getBroadcastDate() {
        return broadcastDate;
    }

    /**
     * Sets broadcast date.
     *
     * @param broadcastDate the broadcast date
     */
    public void setBroadcastDate(OffsetDateTime broadcastDate) {
        this.broadcastDate = broadcastDate;
    }

    /**
     * Gets confirmation date.
     *
     * @return the confirmation date
     */
    public OffsetDateTime getConfirmationDate() {
        return confirmationDate;
    }

    /**
     * Sets confirmation date.
     *
     * @param confirmationDate the confirmation date
     */
    public void setConfirmationDate(OffsetDateTime confirmationDate) {
        this.confirmationDate = confirmationDate;
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
