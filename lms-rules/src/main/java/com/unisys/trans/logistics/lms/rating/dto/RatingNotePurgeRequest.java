/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>RatingNotePurgeRequest</code> class represents the request to purge the
 * RatingNoteVersion. information.
 * <p>
 * <code>RatingNotePurgeRequest</code> holds the following attributes:
 * <ul>
 * <code>
 * <li>ratingNoteOId
 * <li>ratingNoteVersionOId
 * </code>
 * </ul>
 */
public class RatingNotePurgeRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */

    private static final long serialVersionUID = -4038119247446680412L;

    /**
     * Attribute to hold <code>ratingNoteOID</code>.
     * <p>
     * This hold the Unique key value for <code>ratingNoteOID</code>.
     */
    private Long ratingNoteOId;

    /**
     * Attribute to hold <code>ratingNoteVersionOId</code>.
     * <p>
     * This hold the Unique key value for <code>ratingNoteVersionOId</code>.
     */
    private Long ratingNoteVersionOId;

    /**
     * Gets the <code>ratingNoteOId</code> property.
     * <p>
     * Unique key to identify the <code>RatingNoteOId</code>.It is of type Long.
     * <p>
     * 
     * @return the current value of the <code>ratingNoteOId</code> property.<br>
     */
    public Long getRatingNoteOId() {
        return this.ratingNoteOId;
    }

    /**
     * Gets the <code>ratingNoteVersionOId</code> property.
     * <p>
     * Unique key to identify the <code>RatingNoteVersionOId</code>.It is of type Long.
     * <p>
     * 
     * @return the current value of the <code>ratingNoteVersionOId</code> property.<br>
     */
    public Long getRatingNoteVersionOId() {
        return this.ratingNoteVersionOId;
    }

    /**
     * Sets the <code>ratingNoteOID</code> property.
     * <p>
     * Unique key to identify the <code>RatingNoteOID</code>.It is of type Long.
     * <p>
     * 
     * @param pRatingNoteOId
     *            the new value of the <code>ratingNoteOID</code> property.<br>
     */
    public void setRatingNoteOId(final Long pRatingNoteOId) {
        this.ratingNoteOId = pRatingNoteOId;
    }

    /**
     * Sets the <code>ratingNoteVersionOId</code> property.
     * <p>
     * Unique key to identify the <code>RatingNoteVersionOId</code>.It is of type Long.
     * <p>
     * 
     * @param pRatingNoteVersionOId
     *            the new value of the <code>ratingNoteVersionOId</code> property.<br>
     */
    public void setRatingNoteVersionOId(final Long pRatingNoteVersionOId) {
        this.ratingNoteVersionOId = pRatingNoteVersionOId;
    }

}
