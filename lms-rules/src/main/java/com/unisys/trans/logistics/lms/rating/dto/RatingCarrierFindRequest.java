/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>RatingCarrierFindRequest</code> class represents the request to find
 * RatingCarrierInformations details .
 * <p>
 * <code>RateCarrierFindRequest</code> contains the following attribute:
 * <ul>
 * <li>rateCarrierCode
 * </ul>
 */

public class RatingCarrierFindRequest extends AbstractRequest {

    /**
     * Default serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>rateCarrierCode</code> property.
     */
    private String rateCarrierCode;

    /**
     * Default Constructor.
     */
    public RatingCarrierFindRequest() {

    }

    /**
     * Gets the value of <code>rateCarrierCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>rateCarrierCode</code> property.<br>
     */

    public String getRateCarrierCode() {
        return this.rateCarrierCode;
    }

    /**
     * Sets the value of the <code>rateCarrierCode</code> property.
     * <p>
     * 
     * @param pRateCarrierCode the new value of the <code>rateCarrierCode</code> property.<br>
     */
    public void setRateCarrierCode(final String pRateCarrierCode) {
        this.rateCarrierCode = pRateCarrierCode;
    }

}
