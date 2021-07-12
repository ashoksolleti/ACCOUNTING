/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>RatingSecurityPersistRequest</code>class represents the request to create/update
 * RatingSecurityInformation details.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>ratingSecurityDto
 * </code>
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.arc.dto.RatingSecurityDto
 */
public class RatingSecurityPersistRequest extends AbstractRequest {

    /**
     * Generated serial version id.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>ratingSecurityDto</code> property.
     */

    private RatingSecurityDto ratingSecurityDto;

    /**
     * Gets the <code>RatingSecurityDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>ratingSecurityDto</code> property.
     */
    public RatingSecurityDto getRatingSecurityDto() {
        return this.ratingSecurityDto;
    }

    /**
     * Sets the <code>RatingSecurityDto</code> property.
     * <p>
     * 
     * @param pRatingSecurityDto
     *            the new value of the <code>RatingSecurityDto</code> property.
     */

    public void setRatingSecurityDto(final RatingSecurityDto pRatingSecurityDto) {
        this.ratingSecurityDto = pRatingSecurityDto;
    }

}
