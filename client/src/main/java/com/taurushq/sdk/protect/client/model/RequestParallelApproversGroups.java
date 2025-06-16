package com.taurushq.sdk.protect.client.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

/**
 * The type Request parallel approvers groups.
 */
public class RequestParallelApproversGroups {
    private List<RequestApproversGroup> sequential;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    /**
     * Gets sequential.
     *
     * @return the sequential
     */
    public List<RequestApproversGroup> getSequential() {
        return sequential;
    }

    /**
     * Sets sequential.
     *
     * @param sequential the sequential
     */
    public void setSequential(List<RequestApproversGroup> sequential) {
        this.sequential = sequential;
    }
}
