/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.util.Date;

/**
 * <code>RateTypeDeleteRequest</code> class represents the request to delete the rate type information.
 * <p>
 * <code>rateTypeCode</code> and <code>endDate</code> is required to mark the rate type as deleted. The rate
 * type information is not deleted but is marked for deletion. The rate type marked for deletion can be
 * retrieved but not updated when the end date exists.
 * <p>
 * <code>RateTypeDeleteRequest</code> holds the following attributes:
 * <ul>
 * <code>
 * <li>endDate
 * <li>oId
 * <li>rateTypeCode  
 * </code>
 * </ul>
 */
public class RateTypeDeleteRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 8647991267949190998L;

    /**
     * Attribute to hold <code>endDate</code> property.
     * <p>
     * Date that rates using this rate type must be end-dated with. The end date for the AWBRatingType must be
     * today’s date or later. End date is mandatory when deleting a rate type.
     */
    private Date endDate;

    /**
     * Attribute to hold <code>oId</code> property.
     * <p>
     * Unique key for Rate Type.
     */
    private Long oId;

    /**
     * Attribute to hold <code>rateTypeCode</code> property. Rate Type Code to be deleted. Mandatory. Length 3
     * characters.
     */
    private String rateTypeCode;

    /**
     * Gets the <code>endDate</code> property.
     * <p>
     * Rate type is marked as 'Deleted' effective from this <code>endDate</code>.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 10APR95
     * <p>
     * 
     * @return the current value of the <code>endDate</code> property.<br>
     */
    public Date getEndDate() {
        return ContractUtility.getClonedDate(this.endDate);
    }

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
     * Sets the <code>endDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 10APR95
     * <p>
     * 
     * @param pEndDate the new value of the <code>endDate</code>property.<br>
     */
    public void setEndDate(final Date pEndDate) {
        this.endDate = ContractUtility.getClonedDate(pEndDate);
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
