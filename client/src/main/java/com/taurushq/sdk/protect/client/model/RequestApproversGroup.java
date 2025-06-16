package com.taurushq.sdk.protect.client.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * The type Request approvers group.
 */
public class RequestApproversGroup {

    private String externalGroupID;
    private int minimumSignatures;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    /**
     * Gets external group id.
     *
     * @return the external group id
     */
    public String getExternalGroupID() {
        return externalGroupID;
    }

    /**
     * Sets external group id.
     *
     * @param externalGroupID the external group id
     */
    public void setExternalGroupID(String externalGroupID) {
        this.externalGroupID = externalGroupID;
    }

    /**
     * Gets minimum signatures.
     *
     * @return the minimum signatures
     */
    public int getMinimumSignatures() {
        return minimumSignatures;
    }

    /**
     * Sets minimum signatures.
     *
     * @param minimumSignatures the minimum signatures
     */
    public void setMinimumSignatures(int minimumSignatures) {
        this.minimumSignatures = minimumSignatures;
    }
}
