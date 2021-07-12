/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.rating.dto.constants.RatingConventionType;

/**
 * <code>RatingNoteRestoreRequest</code> class represents the request to restore
 * the Rating Note information.
 * <p>
 * <code>RatingNoteRestoreRequest</code> holds the following attribute:
 * <ul>
 * <code>
 * <li>oId
 * <li>ratingNoteFormatType
 * <li>ratingNoteCode
 * <li>carrierCode
 * </code>
 * </ul>
 */
public class RatingNoteRestoreRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold the <code>carriercCode</code> property.
     */
    private String carrierCode;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold the <code>ratingNoteCode</code> property.
     */
    private String ratingNoteCode;

    /**
     * Attribute to hold the <code>ratingNoteFormatType</code> property.
     */
    private RatingConventionType ratingNoteFormatType;

    /**
     * <code>Default constructor.</code>
     */
    public RatingNoteRestoreRequest() {

    }

    /**
     * Gets the <code>carrierCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * UW
     * <p>
     * 
     * @return the current value of the <code>carrierCode</code> property.
     */
    public String getCarrierCode() {
        return this.carrierCode;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>ratingNoteCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-2 for ATPCO or 4 for IATA Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * IA01,T1,R
     * <p>
     * 
     * @return the current value of the <code>ratingNoteCode</code> property.
     */
    public String getRatingNoteCode() {
        return this.ratingNoteCode;
    }

    /**
     * Gets the <code>ratingNoteFormatType</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * I or D
     * <p>
     * 
     * @return the current value of the <code>ratingNoteFormatType</code> property.
     */
    public RatingConventionType getRatingNoteFormatType() {
        return this.ratingNoteFormatType;
    }

    /**
     * Sets the <code>carrierCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * UW
     * <p>
     * 
     * @param pCarrierCode
     *            the new value of the <code>carrierCode</code> property.
     */
    public void setCarrierCode(final String pCarrierCode) {
        this.carrierCode = pCarrierCode;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>ratingNoteCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-2 for ATPCO or 4 for IATA Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * IA01,T1,R
     * <p>
     * 
     * @param pRatingNoteCode
     *            the new value of the <code>ratingNoteCode</code> property.
     */
    public void setRatingNoteCode(final String pRatingNoteCode) {
        this.ratingNoteCode = pRatingNoteCode;
    }

    /**
     * Sets the <code>ratingNoteFormatType</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * I or D
     * <p>
     * 
     * @param pRatingNoteFormatType
     *            the new value of the <code>ratingNoteFormatType</code> property.
     */
    public void setRatingNoteFormatType(
                final RatingConventionType pRatingNoteFormatType) {
        this.ratingNoteFormatType = pRatingNoteFormatType;
    }

}
