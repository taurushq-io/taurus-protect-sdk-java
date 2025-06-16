package com.taurushq.sdk.protect.client.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * The type Request.
 */
public class Request {

    private long id;
    private int tenantId;
    private String currency;
    private String envelope;
    private RequestStatus status;
    private List<RequestTrail> trails;
    private List<SignedRequest> signedRequests;
    private OffsetDateTime creationDate;
    private OffsetDateTime updateDate;
    private RequestMetadata metadata;
    private List<Attribute> attributes;
    private String rule;
    private RequestApprovers approvers;
    private String type;
    private Currency currencyInfo;
    private List<String> needsApprovalFrom;
    private String requestBundleId;
    private String externalRequestId;

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
     * Gets tenant id.
     *
     * @return the tenant id
     */
    public int getTenantId() {
        return tenantId;
    }

    /**
     * Sets tenant id.
     *
     * @param tenantId the tenant id
     */
    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
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
     * Gets envelope.
     *
     * @return the envelope
     */
    public String getEnvelope() {
        return envelope;
    }

    /**
     * Sets envelope.
     *
     * @param envelope the envelope
     */
    public void setEnvelope(String envelope) {
        this.envelope = envelope;
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
     * Gets trails.
     *
     * @return the trails
     */
    public List<RequestTrail> getTrails() {
        return trails;
    }

    /**
     * Sets trails.
     *
     * @param trails the trails
     */
    public void setTrails(List<RequestTrail> trails) {
        this.trails = trails;
    }

    /**
     * Gets signed requests.
     *
     * @return the signed requests
     */
    public List<SignedRequest> getSignedRequests() {
        return signedRequests;
    }

    /**
     * Sets signed requests.
     *
     * @param signedRequests the signed requests
     */
    public void setSignedRequests(List<SignedRequest> signedRequests) {
        this.signedRequests = signedRequests;
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
     * Gets metadata.
     *
     * @return the metadata
     */
    public RequestMetadata getMetadata() {
        return metadata;
    }

    /**
     * Sets metadata.
     *
     * @param metadata the metadata
     */
    public void setMetadata(RequestMetadata metadata) {
        this.metadata = metadata;
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
     * Gets rule.
     *
     * @return the rule
     */
    public String getRule() {
        return rule;
    }

    /**
     * Sets rule.
     *
     * @param rule the rule
     */
    public void setRule(String rule) {
        this.rule = rule;
    }

    /**
     * Gets approvers.
     *
     * @return the approvers
     */
    public RequestApprovers getApprovers() {
        return approvers;
    }

    /**
     * Sets approvers.
     *
     * @param approvers the approvers
     */
    public void setApprovers(RequestApprovers approvers) {
        this.approvers = approvers;
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
     * Gets needs approval from.
     *
     * @return the needs approval from
     */
    public List<String> getNeedsApprovalFrom() {
        return needsApprovalFrom;
    }

    /**
     * Sets needs approval from.
     *
     * @param needsApprovalFrom the needs approval from
     */
    public void setNeedsApprovalFrom(List<String> needsApprovalFrom) {
        this.needsApprovalFrom = needsApprovalFrom;
    }

    /**
     * Gets request bundle id.
     *
     * @return the request bundle id
     */
    public String getRequestBundleId() {
        return requestBundleId;
    }

    /**
     * Sets request bundle id.
     *
     * @param requestBundleId the request bundle id
     */
    public void setRequestBundleId(String requestBundleId) {
        this.requestBundleId = requestBundleId;
    }

    /**
     * Gets external request id.
     *
     * @return the external request id
     */
    public String getExternalRequestId() {
        return externalRequestId;
    }

    /**
     * Sets external request id.
     *
     * @param externalRequestId the external request id
     */
    public void setExternalRequestId(String externalRequestId) {
        this.externalRequestId = externalRequestId;
    }
}



