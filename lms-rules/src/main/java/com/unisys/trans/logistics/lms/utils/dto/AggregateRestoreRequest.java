/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>AggregateRestoreRequest</code> class represents the request to restore
 * the Aggregate information.
 * <p>
 * <code>AggregateRestoreRequest</code> holds the following attribute:
 * <ul>
 * <code>
 * <li>oId
 * <li>code
 * <li>rcaIndicator
 * </code>
 * </ul>
 */

public class AggregateRestoreRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -9121523194225906290L;

    /**
     * Attribute to hold <code>code</code> property.
     */
    private String code;

    /**
     * Attribute to hold <code>oId</code> property.
     * <p>
     * Unique key identify the <code>AggregateRestoreRequest</code>.It is of type Long.<br>
     */
    private Long oId;

    /**
     * Attribute to hold <code>rcaIndicator</code> property.
     */
    private boolean rcaIndicator;

    /**
     * Attribute to hold <code>usageType</code> property.
     */
    private String usageType;

    /**
     * <code>Default constructor.</code>
     */
    public AggregateRestoreRequest() {

    }

    /**
     * Gets the <code>code</code> property.
     * <p>
     * <b>Format: </b><br>
     * 4-7 Alpha Numeric <br>
     * <b>Example: </b><br>
     * AFR1
     * <p>
     * 
     * @return the current value of the <code>code</code> property.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * Unique key to identify the <code>AggregateRestoreRequest</code>.It is of type Long.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>rcaIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>rcaIndicator</code> property.
     */
    public boolean getRcaIndicator() {
        return this.rcaIndicator;
    }

    /**
     * Gets the <code>usageType</code> property.
     * <p>
     * <b>Format: </b>
     * <p>
     * 2 Alpha Numeric
     * <p>
     * <b>Example: </b>
     * <p>
     * MY
     * <p>
     * 
     * @return the current value of the <code>usageType</code> property.<br>
     */
    public String getUsageType() {
        return this.usageType;
    }

    /**
     * Sets the value of the <code>code</code> property.
     * <p>
     * <b>Format: </b>
     * <p>
     * 4-7 Alpha Numeric
     * <p>
     * <b>Example: </b>
     * <p>
     * AFR1
     * <p>
     * 
     * @param pCode the new value of the <code>code</code> property.<br>
     */
    public void setCode(final String pCode) {
        this.code = ContractUtility.convertToUpperCase(pCode);
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * Unique key to identify the <code>AggregateDeleteRequest</code>.It is of type Long.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>rcaIndicator</code> property.
     * <p>
     * 
     * @param pRcaIndicator
     *            the new value of the <code>rcaIndicator</code> property.
     */
    public void setRcaIndicator(final boolean pRcaIndicator) {
        this.rcaIndicator = pRcaIndicator;
    }

    /**
     * Sets the value of the <code>usageType</code> property.
     * <p>
     * <b>Format: </b>
     * <p>
     * 2 Alpha Numeric
     * <p>
     * <b>Example: </b>
     * <p>
     * MY
     * <p>
     * 
     * @param pUsageType the new value of the <code>usageType</code> property.<br>
     */
    public void setUsageType(final String pUsageType) {
        this.usageType = ContractUtility.convertToUpperCase(pUsageType);
    }
}