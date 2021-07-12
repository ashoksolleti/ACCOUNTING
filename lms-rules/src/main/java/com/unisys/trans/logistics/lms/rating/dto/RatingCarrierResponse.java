//@formatter:off
/* ====================================== */
/* Copyright(c) 2012 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on

package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>RatingCarrierResponse</code> contains the response of the maintenance
 * request received by <code>RatingCarrierService</code>.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>ratingCarrierDto
 * </code>
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.arc.dto.RatingCarrierDto
 */

public class RatingCarrierResponse extends AbstractResponse {

    /**
     * Generated serial version id.
     */
    private static final long serialVersionUID = 6931144014166204585L;

    /**
     * Attribute to hold list of <code>ratingCarrierDto</code> object.
     */
    private RatingCarrierDto ratingCarrierDto;

    /**
     * <code>Default Constructor.</code>
     */
    public RatingCarrierResponse() {

    }

    /**
     * Gets the value of <code>ratingCarrierDto</code> property.
     * <p>
     * 
     * @return the current value of list of <code>ratingCarrierDto</code> property.
     */

    public RatingCarrierDto getRatingCarrierDto() {
        return this.ratingCarrierDto;
    }

    /**
     * Sets the <code>ratingCarrierDto</code> property.
     * <p>
     * 
     * @param pRatingCarrierDto
     *            the new value of <code>ratingCarrierDto</code> property.
     */

    public void setRatingCarrierDto(final RatingCarrierDto pRatingCarrierDto) {
        this.ratingCarrierDto = pRatingCarrierDto;
    }

}
