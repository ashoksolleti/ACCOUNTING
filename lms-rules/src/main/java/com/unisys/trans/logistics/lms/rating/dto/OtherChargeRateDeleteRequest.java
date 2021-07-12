/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>OtherChargeRateDeleteRequest</code> class contain information that is used to delete a specific rate
 * information.
 * <p>
 * This contains the following attribute:<br>
 * <ul>
 * <code>
 * <li>otherChargeRateOId
 * </code>
 * </ul>
 */
public class OtherChargeRateDeleteRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 7296908216712973002L;

    /**
     * Attribute to hold <code>otherChargeRateOId</code>.
     * <p>
     * Holds Unique key for Other Charge rate.
     */
    private Long otherChargeRateOId;

    /**
     * <code>Default constructor</code>.
     */
    public OtherChargeRateDeleteRequest() {

    }

    /**
     * Gets the <code>otherChargeRateOId</code> property.
     * <p>
     * Unique key to identify the <code>OtherChargeRateDto</code>.It is of type Long.
     * <p>
     * 
     * @return the current value of the <code>otherChargeRateOId</code> property.<br>
     */
    public Long getOtherChargeRateOId() {
        return this.otherChargeRateOId;
    }

    /**
     * Sets the <code>otherChargeRateOId</code> property.
     * <p>
     * Unique key to identify the <code>OtherChargeRateDto</code>.It is of type Long.
     * <p>
     * 
     * @param pOtherChargeRateOId the new value of the <code>otherChargeRateOId</code> property.<br>
     */
    public void setOtherChargeRateOId(final Long pOtherChargeRateOId) {
        this.otherChargeRateOId = pOtherChargeRateOId;
    }
}
