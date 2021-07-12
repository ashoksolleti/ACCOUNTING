/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.rating.dto.constants.RatingConventionType;
import java.util.Date;

/**
 * <code>RatingNoteFindRequest</code> is used for retrieving <code>RatingNote</code> information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>ratingNoteFormatType</code>
 * <li><code>ratingNoteCode</code>
 * <li><code>carrierCode</code>
 * <li><code>date</code>
 * </ul>
 */
public class RatingNoteFindRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -5640262410428029544L;

    /**
     * Attribute to hold <code>carrierCode</code> property.
     */
    private String carrierCode;

    /**
     * Attribute to hold <code>date</code> property.
     */
    private Date date;

    /**
     * Attribute to hold <code>ratingNoteCode</code> property.
     */
    private String ratingNoteCode;

    /**
     * Attribute to hold <code>ratingNoteFormatType</code> property.
     */
    private RatingConventionType ratingNoteFormatType;

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
     * Gets the <code>date</code> property.
     * <p>
     * <b>Format: </b><br>
     * DDMMMYY
     * <p>
     * <b>Example: </b><br>
     * 26JAN08
     * <p>
     * 
     * @return the current value of the <code>date</code> property.
     */
    public Date getDate() {
        return ContractUtility.getClonedDate(this.date);
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
     * Sets the <code>date</code> property.
     * <p>
     * <b>Format: </b><br>
     * DDMMMYY
     * <p>
     * <b>Example: </b><br>
     * 26JAN08
     * <p>
     * 
     * @param pDate
     *            the new value of the <code>date</code> property.
     */
    public void setDate(final Date pDate) {
        this.date = ContractUtility.getClonedDate(pDate);
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
    public void setRatingNoteFormatType(final RatingConventionType pRatingNoteFormatType) {
        this.ratingNoteFormatType = pRatingNoteFormatType;
    }

}
