/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>RateTypeRestoreRequest</code> class represents the request to restore the currency information.
 * <p>
 * <code>RateTypeRestoreRequest</code> holds the following attributes:
 * <ul>
 * <code>
 * <li>oId
 * <li>rateTypeCode
 * </code>
 * </ul>
 */
public class RateTypeRestoreRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -3195583151381720969L;

    /**
     * Attribute to hold <code>oId</code> property. Unique key for Rate Type.
     */
    private Long oId;

    /**
     * Attribute to hold <code>rateTypeCode</code> property. Rate Type Code to be deleted. Mandatory. Length 3
     * characters.
     */
    private String rateTypeCode;

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>rateTypeCode</code> property.
     * <p>
     * Represents the rate type code which is a unique code to identify the rate type.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * GEN
     * <p>
     * 
     * @return the current value of the <code>rateTypeCode</code> property.<br>
     */
    public String getRateTypeCode() {
        return this.rateTypeCode;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>rateTypeCode</code> property.
     * <p>
     * Represents the rate type code which is a unique code to identify the rate type.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * GEN
     * <p>
     * 
     * @param pRateType the new value of the <code>rateTypeCode</code> property.
     */
    public void setRateTypeCode(final String pRateType) {
        this.rateTypeCode = ContractUtility.convertToUpperCase(pRateType);
    }
}