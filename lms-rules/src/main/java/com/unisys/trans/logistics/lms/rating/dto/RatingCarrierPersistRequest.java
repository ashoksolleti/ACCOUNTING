/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>RatingCarrierPersistRequest</code> class represents the request to create/update
 * RatingCarrierInformation details.
 * <p>
 * <code>RatingCarrierPersistRequest</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>ratingCarrierDto
 * </code>
 * </ul>
 */

public class RatingCarrierPersistRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 75657318779940603L;

    /**
     * Attribute to hold the <code>ratingCarrierDto</code> object.
     */
    private RatingCarrierDto ratingCarrierDto;

    /**
     * Default Constructor.
     */

    public RatingCarrierPersistRequest() {

    }

    /**
     * Gets the <code>ratingCarrierDto</code> property.
     * <p>
     * 
     * @return the current value of <code>ratingCarrierDto</code> property.
     */

    public RatingCarrierDto getRatingCarrierDto() {
        return this.ratingCarrierDto;
    }

    /**
     * Sets the <code>ratingCarrierDto</code> property.
     * <p>
     * 
     * @param pRatingCarrierDto
     *            the new value of the <code>ratingCarrierDto</code> property.
     */
    public void setRatingCarrierDto(final RatingCarrierDto pRatingCarrierDto) {
        this.ratingCarrierDto = pRatingCarrierDto;
    }

}