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
 * <code>RatingNoteResponse</code> contains the response of the maintenance
 * request received by <code>RatingNoteService</code>.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>RatingNoteDto
 * </code>
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.arc.dto.RatingNoteDto
 */

public class RatingNoteResponse extends AbstractResponse {

    /**
     * Generated serial version id.
     */
    private static final long serialVersionUID = 6931144014166204585L;

    /**
     * Attribute to hold list of <code>ratingNoteDto</code> object.
     */
    private RatingNoteDto ratingNoteDto;

    /**
     * <code>Default Constructor.</code>
     */
    public RatingNoteResponse() {

    }

    /**
     * Gets the value of <code>RatingNoteDto</code> property.
     * <p>
     * 
     * @return the current value of list of <code>RatingNoteDto</code> property.
     */

    public RatingNoteDto getRatingNoteDto() {
        return this.ratingNoteDto;
    }

    /**
     * Sets the <code>RatingNoteDto</code> property.
     * <p>
     * 
     * @param pRatingNoteDto
     *            the new value of <code>RatingNoteDto</code> property.
     */

    public void setRatingNoteDto(final RatingNoteDto pRatingNoteDto) {
        this.ratingNoteDto = pRatingNoteDto;
    }

}
