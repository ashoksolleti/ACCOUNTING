/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>OtherChargeRatePersistRequest</code> class contain the specific details for creating other charge
 * rate information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 *  <li>otherChargeDetail
 *  </code>
 * </ul>
 */
public class OtherChargeRatePersistRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -2177480944895370559L;

    /**
     * Attribute to hold <code>otherChargeDetails</code>.
     * <p>
     * Hold the reference of <code>OtherChargeDetailDto</code>.
     */
    private OtherChargeDetailDto otherChargeDetail;

    /**
     * <code>Default constructor</code>.
     */
    public OtherChargeRatePersistRequest() {

    }

    /**
     * Gets the <code>OtherChargeDetailDto</code> property.
     * <p>
     * Hold the reference of <code>OtherChargeDetailDto</code>.
     * <p>
     * 
     * @return the current value of the <code>otherChargeDetail</code> property.<br>
     */
    public OtherChargeDetailDto getOtherChargeDetail() {
        return this.otherChargeDetail;
    }

    /**
     * Sets the <code>otherChargeDetail</code> property.
     * <p>
     * Hold the reference of <code>OtherChargeDetailDto</code>.
     * <p>
     * 
     * @param pOtherChargeDetail the new value of the <code>otherChargeDetail</code> property.<br>
     */
    public void setOtherChargeDetail(final OtherChargeDetailDto pOtherChargeDetail) {
        this.otherChargeDetail = pOtherChargeDetail;
    }
}
