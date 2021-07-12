/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.rating.dto.constants.RatingConventionType;

/**
 * <code>RateSourceDto</code> contain details of RateSource.
 * <p>
 * This contains all information about RateSource.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>description
 * <li>rateSourceCode
 * <li>oId
 * <li>ratingConventionType
 * <li>deletionDate
 * <li>rateTypes
 * </ul>
 */

public class RateSourceDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -4323443773583637396L;

    /**
     * Attribute to hold <code>deletionDate</code> property.
     */
    private Date deletionDate;

    /**
     * Attribute to hold <code>description</code> property.
     */
    private String description;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>participantAccountExists</code> property.
     */
    private boolean participantAccountExists = true;

    /**
     * Attribute to hold <code>participantAccountNotExists</code> property.
     */

    private boolean participantAccountNotExists = true;

    /**
     * Attribute to hold <code>publishedIndicator</code> property.
     */
    private boolean publishedIndicator;

    /**
     * Attribute to hold <code>rateSourceCode</code> property.
     */
    private String rateSourceCode;

    /**
     * Attribute to hold <code>rateType</code> property.
     */
    private List<String> rateTypes;

    /**
     * Attribute to hold <code>ratingConventionType</code> property.
     */
    private RatingConventionType ratingConventionType;

    /**
     * <code>Default Constructor.</code>
     */
    public RateSourceDto() {

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
     * Gets the <code>description</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-55 AnyCharacters.
     * <p>
     * <b>Example: </b><br>
     * IATA published rate source.
     * <p>
     * 
     * @return the current value of the <code>description</code> property.
     */
    public String getDescription() {
        return this.description;
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
     * Gets the <code>participantAccountExists</code> property.
     * <p>
     * <b>Possible Values:</b><br>
     * 
     * <pre>
     * true  - valid for actual rate if the participant account number exist.
     * false - Not valid for actual rate.
     * </pre>
     * <p>
     * 
     * @return the current value of the <code>participantAccountExists</code> property.<br>
     */
    public boolean getParticipantAccountExists() {
        return this.participantAccountExists;
    }

    /**
     * Gets the <code>participantAccountNotExists</code> property.
     * <p>
     * <b>Possible Values:</b><br>
     * 
     * <pre>
     * true  - valid for actual rate if the participant account number not exists.
     * false - Not valid for actual rate.
     * </pre>
     * <p>
     * 
     * @return the current value of the <code>participantAccountNotExists</code> property.<br>
     */
    public boolean getParticipantAccountNotExists() {
        return this.participantAccountNotExists;
    }

    /**
     * Gets the <code>publishedIndicator</code> property.
     * <p>
     * <b>Possible Values:</b><br>
     * 
     * <pre>
     * true  - IATA or ATPCO published Rate Source.
     * false - Private Rate Source.
     * </pre>
     * <p>
     * 
     * @return the current value of the <code>publishedIndicator</code> property.<br>
     */
    public boolean getPublishedIndicator() {
        return this.publishedIndicator;
    }

    /**
     * Gets the <code>rateSourceCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Characters
     * <p>
     * <b>Example: </b><br>
     * IRI
     * <p>
     * 
     * @return the current value of the <code>rateSourceCode</code> property.
     */
    public String getRateSourceCode() {
        return this.rateSourceCode;
    }

    /**
     * Gets the <code>rateTypes</code> property.
     * <p>
     * 
     * @return the current value of the <code>rateTypes</code> property.
     */
    public List<String> getRateTypes() {
        if (this.rateTypes == null) {
            this.rateTypes = new ArrayList<String>();
        }
        return this.rateTypes;
    }

    /**
     * Gets the <code>ratingConventionType</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * I or D
     * <p>
     * 
     * @return the current value of the <code>ratingConventionType</code> property.
     */
    public RatingConventionType getRatingConventionType() {
        return this.ratingConventionType;
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
     * Sets the <code>description</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-55 AnyCharacters.
     * <p>
     * <b>Example: </b><br>
     * IRI
     * <p>
     * 
     * @param pDescription
     *            the new value of the <code>description</code> property.
     */
    public void setDescription(final String pDescription) {
        this.description = pDescription;
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
     * Sets the <code>participantAccountExists</code> property.
     * <p>
     * <b>Possible Values:</b><br>
     * 
     * <pre>
     * true  - valid for actual rate if the participant account number exist.
     * false - Not valid for actual rate.
     * </pre>
     * <p>
     * 
     * @param pParticipantAccountExists
     *            the new value of the <code>participantAccountExists</code> property.<br>
     */
    public void setParticipantAccountExists(
                final boolean pParticipantAccountExists) {
        this.participantAccountExists = pParticipantAccountExists;
    }

    /**
     * Sets the <code>participantAccountNotExists</code> property.
     * <p>
     * <b>Possible Values:</b><br>
     * 
     * <pre>
     * true  - valid for actual rate if the participant account number not exists.
     * false - Not valid for actual rate.
     * </pre>
     * <p>
     * 
     * @param pParticipantAccountNotExists
     *            the new value of the <code>participantAccountNotExists</code> property.<br>
     */
    public void setParticipantAccountNotExists(
                final boolean pParticipantAccountNotExists) {
        this.participantAccountNotExists = pParticipantAccountNotExists;
    }

    /**
     * Sets the <code>publishedIndicator</code> property.
     * <p>
     * <b>Possible Values:</b><br>
     * 
     * <pre>
     * true  - IATA or ATPCO published Rate Source.
     * false - Private Rate Source.
     * </pre>
     * <p>
     * 
     * @param pPublishedIndicator
     *            the new value of the <code>publishedIndicator</code> property.<br>
     */
    public void setPublishedIndicator(final boolean pPublishedIndicator) {
        this.publishedIndicator = pPublishedIndicator;
    }

    /**
     * Sets the <code>rateSourceCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * IRI
     * <p>
     * 
     * @param pRateSourceCode
     *            the new value of the <code>rateSourceCode</code> property.
     */
    public void setRateSourceCode(final String pRateSourceCode) {
        this.rateSourceCode = ContractUtility
                    .convertToUpperCase(pRateSourceCode);
    }

    /**
     * Sets the <code>rateTypes</code> property.
     * 
     * @param pRateTypes
     *            the new value of the <code>rateTypes</code> property.
     */

    public void setRateTypes(final List<String> pRateTypes) {
        this.rateTypes = pRateTypes;
    }

    /**
     * Sets the <code>ratingConventionType</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * I or D
     * <p>
     * 
     * @param pRatingConventionType
     *            the new value of the <code>ratingConventionType</code> property.
     */
    public void setRatingConventionType(
                final RatingConventionType pRatingConventionType) {
        this.ratingConventionType = pRatingConventionType;
    }
}
