/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.rating.dto;

import java.io.Serializable;

import com.unisys.trans.logistics.lms.framework.dto.DateRangeDto;

/**
 * <code>CommodityVersionDto</code> represents the version for a commodity
 * information.<br>
 * Commodity has at least one version and can hold multiple versions each with
 * an effective and end date.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>description
 * <li>effectiveDate
 * <li>expirationDate
 * <li>rateComparisonIndicator
 * <li>Id
 * </code>
 * </ul>
 */
public class CommodityVersionDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 2991461606743456769L;

    /**
     * Attribute to hold <code>dateRangeDto</code> property.
     */
    private DateRangeDto dateRangeDto;

    /**
     * Attribute to hold <code>description</code> property.
     * <p>
     * Description for the commodity.
     */
    private String description;

    /**
     * Attribute to hold <code>formattedDescription</code>.
     * <p>
     * Represents the description that is transformed to html content.
     */
    private String formattedDescription;

    /**
     * Attribute to hold <code>oId</code> property.
     * <p>
     * Unique key for CommodityVersion.
     */
    private Long oId;

    /**
     * Attribute to hold <code>rateComparisonIndicator</code> property.
     * <p>
     * Indicator to compare the commodity rate with the general commodity rate at air waybill rating time.
     */
    // The name of getter method (isRateComparisonAllowed) is a meaningful
    // condition.
    private boolean rateComparisonIndicator; // NOPMD
    private String specificAirline;
    public String getSpecificAirline() {
		return specificAirline;
	}
	public void setSpecificAirline(String pSpecificAirline) {
		if(pSpecificAirline != null) {
		this.specificAirline = pSpecificAirline.toUpperCase();
		}
		else {
			this.specificAirline = pSpecificAirline;
		}
	}

    /**
     * Default constructor.
     */
    public CommodityVersionDto() {

    }

    /**
     * Gets the <code>dateRangeDto</code> property.
     * <p>
     * 
     * @return pDateRangeDto the current value of the <code>dateRangeDto</code> property.
     */
    public DateRangeDto getDateRangeDto() {
        return this.dateRangeDto;
    }

    /**
     * Gets the <code>description</code> property.
     * <p>
     * Holds the description for a commodity version.
     * <p>
     * <b>Format: </b><br>
     * 25 characters of alphabets, numbers or any special characters.
     * <p>
     * <b>Example: </b><br>
     * Perishable
     * <p>
     * 
     * @return the current value of the <code>description</code> property.<br>
     */
    public final String getDescription() {
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
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of <code>oId</code> property.<br>
     */
    public final Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>rateComparisonIndicator</code> property.
     * <p>
     * 
     * @return the current value of <code>rateComparisonIndicator</code> property.<br>
     */
    public final boolean getRateComparisonIndicator() {
        return this.rateComparisonIndicator;
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
     * 25 characters of alphabets, numbers or any special characters.
     * <p>
     * <b>Example: </b><br>
     * Perishable
     * <p>
     * 
     * @param pDescription
     *            the new value of the <code>description</code>property.<br>
     */
    public final void setDescription(final String pDescription) {
        this.description = pDescription;
    }

    /**
     * Sets the <code>formattedDescription</code> property.
     * <p>
     * contains the description which is converted from plain text to html data.
     * 
     * @param pFormattedDescription the formattedDescription to set
     */
    public void setFormattedDescription(final String pFormattedDescription) {
        this.formattedDescription = pFormattedDescription;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of <code>oId</code> property.<br>
     */
    public final void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>rateComparisonIndicator</code> property.
     * <p>
     * 
     * @param pRateComparisonIndicator
     *            the new value of <code>rateComparisonIndicator</code> property.<br>
     */
    public final void setRateComparisonIndicator(
                final boolean pRateComparisonIndicator) {
        this.rateComparisonIndicator = pRateComparisonIndicator;
    }
}
