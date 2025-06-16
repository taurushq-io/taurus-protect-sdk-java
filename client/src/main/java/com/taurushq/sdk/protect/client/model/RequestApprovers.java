package com.taurushq.sdk.protect.client.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

/**
 * The type Request approvers.
 */
public class RequestApprovers {

    private List<RequestParallelApproversGroups> parallel;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    /**
     * Gets parallel.
     *
     * @return the parallel
     */
    public List<RequestParallelApproversGroups> getParallel() {
        return parallel;
    }

    /**
     * Sets parallel.
     *
     * @param parallel the parallel
     */
    public void setParallel(List<RequestParallelApproversGroups> parallel) {
        this.parallel = parallel;
    }
}
