//@formatter:off
/* ====================================== */
/* Copyright(c) 2012 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.DateRangeDto;
import java.io.Serializable;

/**
 * <code>RatingNoteVersionDto</code> contain details of RatingNoteVersion.
 * <p>
 * This contains all information about RatingNoteVersion.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>description
 * <li>iataResolutionNumber
 * <li>oId
 * </ul>
 */
public class RatingNoteVersionDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -6418664683725011979L;

    /**
     * Attribute to hold <code>dateRangeDto</code> property.
     */
    private DateRangeDto dateRangeDto;

    /**
     * Attribute to hold <code>description</code> property.
     */
    private String description;

    /**
     * Attribute to hold <code>formattedDescription</code>.
     * <p>
     * Represents the description that is transformed to html content.
     */
    private String formattedDescription;

    /**
     * Attribute to hold <code>iataResolutionNumber</code> property.
     */
    private String iataResolutionNumber;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * <code>Default constructor.</code>
     */
    public RatingNoteVersionDto() {

    }

    /**
     * Gets the <code>Dates</code> property.
     * <p>
     * <b>Format: </b><br>
     * boolean
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @param pObject the new value of the <code>object</code> property.
     * @return the current value of the <code>Date</code> property.
     */
    @Override
    public boolean equals(final Object pObject) {
        // equals to be checked only in case of update / delete scenario, which
        // will definitely have oId
        boolean isEqual = false;
        final RatingNoteVersionDto anotherRatingNoteVersionDto;
        if (pObject == null) {
            isEqual = false;
        }
        else if (pObject.getClass() == null
                    || this.getClass() != pObject.getClass()) {
            isEqual = false;
        }
        else {
            anotherRatingNoteVersionDto = (RatingNoteVersionDto) pObject;
            if (anotherRatingNoteVersionDto.getOId() == null) {
                isEqual = this.getOId() == null;
            }
            else {
                isEqual = anotherRatingNoteVersionDto.getOId().equals(
                    this.getOId());
            }
        }
        return isEqual;
    }

    /**
     * Gets the <code>dateRangeDto</code> property.
     * <p>
     * 
     * @return dateRangeDto the current value of the <code>dateRangeDto</code> property.
     */
    public DateRangeDto getDateRangeDto() {
        return this.dateRangeDto;
    }

    /**
     * Gets the <code>description</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-5000 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * CONTAINERS OF THE SAME TYPE ARE TENDERED TO THE CARRIER BY ONE
     * <p>
     * 
     * @return the current value of the <code>description</code> property.<br>
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Gets the <code>formattedDescription</code> property.
     * <p>
     * contains the description which is converted from plain text to html data.
     * 
     * @return the formattedDescription
     */
    public String getFormattedDescription() {
        return formattedDescription;
    }

    /**
     * Gets the <code>iataResolutionNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-10 Any character
     * <p>
     * <b>Example: </b><br>
     * IRIS
     * <p>
     * 
     * @return the current value of the <code>iataResolutionNumber</code> property.<br>
     */
    public String getIataResolutionNumber() {
        return this.iataResolutionNumber;
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
     * The<code>hashCode </code> object.
     * <p>
     * 
     * @return <code>int</code> hashcode of super class.
     */
    @Override
    public int hashCode() {
        final int result;
        if (this.oId == null) {
            result = 0;
        }
        else {
            result = this.oId.hashCode();
        }
        return result;
    }

    /**
     * Sets the <code>dateRangeDto</code> property.
     * <p>
     * 
     * @param pDateRangeDto
     *            the new value of the <code>dateRangeDto</code> property.
     */
    public void setDateRangeDto(final DateRangeDto pDateRangeDto) {
        this.dateRangeDto = pDateRangeDto;
    }

    /**
     * Sets the <code>description</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-5000 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * CONTAINERS OF THE SAME TYPE ARE TENDERED TO THE CARRIER BY ONE
     * <p>
     * 
     * @param pDescription
     *            the new value of the <code>description</code> property.
     */

    public void setDescription(final String pDescription) {
        this.description = pDescription;
    }

    /**
     * Sets the <code>formattedDescription</code> property.
     * <p>
     * contains the description which is converted from plain text to html data.
     * 
     * @param pFormattedDescription
     *            the formattedDescription to set
     */
    public void setFormattedDescription(final String pFormattedDescription) {
        this.formattedDescription = pFormattedDescription;
    }

    /**
     * Sets the <code>iataResolutionNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-10 Any character
     * <p>
     * <b>Example: </b><br>
     * IRIS
     * <p>
     * 
     * @param pIataResolutionNumber
     *            the new value of the <code>iataResolutionNumber</code> property.
     */
    public void setIataResolutionNumber(final String pIataResolutionNumber) {
        this.iataResolutionNumber = pIataResolutionNumber;
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

}