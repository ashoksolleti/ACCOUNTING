/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>RatingSecurityMultipleFindResponse</code> contains the response of the
 * maintenance request received by <code>RatingSecurityService</code>.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>ratingSecurityDto
 * </code>
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.arc.dto.RatingSecurityDto
 */
public class RatingSecurityMultipleFindResponse extends AbstractResponse {
    /**
     * Generated serial version id.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>ratingSecurityDto</code> property.
     */
    private List<RatingSecurityDto> ratingSecurityDto;

    /**
     * Gets the <code>RatingSecurityDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>ratingSecurityDto</code> property.
     */

    public List<RatingSecurityDto> getRatingSecurityDto() {
        return this.ratingSecurityDto;
    }

    /**
     * Sets the <code>RatingSecurityDto</code> property.
     * <p>
     * 
     * @param pRatingSecurityDto
     *            the new value of the <code>RatingSecurityDto</code> property.
     */

    public void setRatingSecurityDto(
                final List<RatingSecurityDto> pRatingSecurityDto) {
        this.ratingSecurityDto = pRatingSecurityDto;
    }

}
