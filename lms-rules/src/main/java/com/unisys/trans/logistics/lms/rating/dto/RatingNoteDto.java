/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.rating.dto.constants.RatingConventionType;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <code>RatingNoteDto</code> contain details of RatingNote.
 * <p>
 * This contains all information about RatingNote.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>carrierCode
 * <li>deletionDate
 * <li>oId
 * <li>ratingNoteCode
 * <li>ratingNoteFormat
 * <li>ratingNoteVersions
 * <li>retainIndicator
 * </ul>
 */

public class RatingNoteDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -4149870046622128655L;

    /**
     * Attribute to hold <code>carrierCode</code> property.
     */
    private String carrierCode;

    /**
     * Attribute to hold <code>deletionDate</code> property.
     */
    private Date deletionDate;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>ratingNoteCode</code> property.
     */
    private String ratingNoteCode;

    /**
     * Attribute to hold <code>ratingNoteFormat</code> property.
     */
    private RatingConventionType ratingNoteFormat;

    /**
     * Attribute to hold <code>retainIndicator</code> property.
     */

    private boolean retainIndicator;

    /**
     * Attribute to hold <code>ratingNoteVersions</code> property.
     */
    private List<RatingNoteVersionDto> ratingNoteVersions = new ArrayList<RatingNoteVersionDto>();

    /**
     * <code>Default constructor.</code>
     */
    public RatingNoteDto() {
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
     * Gets the <code>deletionDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * DDMMMYY
     * <p>
     * <b>Example: </b><br>
     * 26JAN08
     * <p>
     * 
     * @return the current value of the <code>deletionDate</code> property.
     */
    public Date getDeletionDate() {
        return ContractUtility.getClonedDate(this.deletionDate);
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */

    @Override
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
     * Gets the <code>ratingNoteFormat</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * I or D
     * <p>
     * 
     * @return the current value of the <code>ratingNoteFormat</code> property.
     */
    public RatingConventionType getRatingNoteFormat() {
        return this.ratingNoteFormat;
    }

    /**
     * Holds the list of {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteVersionDto
     * RatingNoteVersionDto} containing <code>ratingNoteVersion</code> details.
     * <p>
     * 
     * @return the current value of <code>ratingNoteVersions</code> details.
     */
    public List<RatingNoteVersionDto> getRatingNoteVersions() {
        return this.ratingNoteVersions;
    }

    /**
     * <li>Gets the RetainIndicator.</li>
     * <p>
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>
     * 
     * @since 1.0</td> <td>&nbsp;</td>
     *        </tr>
     *        </table>
     *        <p>
     * @return <code>boolean</code><br>
     *         Returns the RetainIndicator.<br>
     */

    public boolean getRetainIndicator() {
        return this.retainIndicator;
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
        this.carrierCode = ContractUtility.convertToUpperCase(pCarrierCode);
    }

    /**
     * Sets the <code>deletionDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * DDMMMYY
     * <p>
     * <b>Example: </b><br>
     * 26JAN08
     * <p>
     * 
     * @param pDeletionDate
     *            the new value of the <code>deletionDate</code> property.
     */
    public void setDeletionDate(final Date pDeletionDate) {
        this.deletionDate = ContractUtility.getClonedDate(pDeletionDate);
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
        this.ratingNoteCode = ContractUtility.convertToUpperCase(pRatingNoteCode);
    }

    /**
     * Sets the <code>ratingNoteFormat</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * I or D
     * <p>
     * 
     * @param pRatingNoteFormat
     *            the new value of the <code>ratingNoteFormat</code> property.
     */
    public void setRatingNoteFormat(final RatingConventionType pRatingNoteFormat) {
        this.ratingNoteFormat = pRatingNoteFormat;
    }

    /**
     * Sets the list of {@link com.unisys.trans.logistics.lms.rating.dto.RatingNoteVersionDto
     * RatingNoteVersionDto} containing <code>ratingNoteVersion</code> details.
     * <p>
     * 
     * @param pRatingNoteVersions
     *            holds the new value of <code>ratingNoteVersions</code> details.<br>
     */
    public void setRatingNoteVersions(
                final List<RatingNoteVersionDto> pRatingNoteVersions) {
        this.ratingNoteVersions = pRatingNoteVersions;
    }

    /**
     * <li>Sets the RetainIndicator.</li>
     * <p>
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>
     * 
     * @since 1.0</td> <td>&nbsp;</td>
     *        </tr>
     *        </table>
     *        <p>
     * @param pRetainIndicator
     *            holds the new value of <code>retainIndicator</code> details.<br>
     */
    public void setRetainIndicator(final boolean pRetainIndicator) {
        this.retainIndicator = pRetainIndicator;
    }

}
