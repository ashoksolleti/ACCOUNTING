/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>RatingNotePersistRequest</code> class represents the request to update
 * ratingNoteinformation details.
 * <p>
 * <code>RatingNotePersistRequest</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>RatingNoteDto
 * </code>
 * </ul>
 */
public class RatingNotePersistRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 3133284262501496486L;

    /**
     * Attribute to hold the <code>RatingNoteDto</code> object.
     */
    private RatingNoteDto ratingNoteDto;

    /**
     * <code>Default Constructor.</code>
     */

    public RatingNotePersistRequest() {

    }

    /**
     * Gets the <code>ratingNoteDto</code> property.
     * <p>
     * 
     * @return the current value of <code>ratingNoteDto</code> property.
     */

    public RatingNoteDto getRatingNoteDto() {
        return this.ratingNoteDto;
    }

    /**
     * Sets the <code>ratingNoteDto</code> property.
     * <p>
     * 
     * @param pRatingNoteDto
     *            the new value of the <code>ratingNoteDto</code> property.
     */
    public void setRatingNoteDto(final RatingNoteDto pRatingNoteDto) {
        this.ratingNoteDto = pRatingNoteDto;
    }

}
