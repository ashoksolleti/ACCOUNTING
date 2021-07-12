/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * <code>OtherChargeRateResponse</code> contains the response of all the request received by
 * <code>OtherChargeRateService</code> for maintaining an other charge rate.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>otherChargeDetails</code>
 * </ul>
 */
public class OtherChargeRateResponse extends AbstractResponse {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -7521650123126410657L;

    /**
     * Attribute to hold <code>otherChargeDetails</code>.
     * <p>
     * Holds the instance of <code>OtherChargeDetailsDto</code>.
     */
    private List<OtherChargeDetailDto> otherChargeDetails;

    /**
     * <code>Default constructor</code>.
     */
    public OtherChargeRateResponse() {

    }

    /**
     * Gets the <code>otherChargeDetails</code> property.
     * <p>
     * Holds the instance of <code>OtherChargeDetailDto</code> which is applicable for an other charge type.
     * <p>
     * 
     * @return the current list of the <code>otherChargeDetails</code> property.<br>
     */
    public List<OtherChargeDetailDto> getOtherChargeDetails() {

        if (this.otherChargeDetails == null) {
            this.otherChargeDetails = new ArrayList<OtherChargeDetailDto>();
        }
        return this.otherChargeDetails;
    }

    /**
     * Sets the <code>otherChargeDetails</code> property.
     * <p>
     * Holds the instance of <code>OtherChargeDetailDto</code> which is applicable for an other charge type.
     * <p>
     * 
     * @param pOtherChargeDetails the new list of the <code>otherChargeDetails</code> property.<br>
     */
    public void setOtherChargeDetails(final List<OtherChargeDetailDto> pOtherChargeDetails) {
        this.otherChargeDetails = pOtherChargeDetails;
    }
}
