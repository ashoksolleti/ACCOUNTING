/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>AirportDeleteRequest</code> represents the request to delete an airport information.
 * <p>
 * Airport information is deleted based on the following attribute:
 * <ul>
 * <code>
 * <li>airportCode</li>
 * <li>cityCode</li>
 * </code>
 * </ul>
 */
public class AirportDeleteRequest extends AbstractRequest {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 8365271464818052980L;

    /**
     * Attribute to hold <code>airportCode</code> property.
     * <p>
     * The airport code that uniquely represents an airport.
     */

    private String airportCode;

    /**
     * Attribute to hold <code>cityCode</code> property.
     * <p>
     * The IATA city code that uniquely represents a city.
     */
    private String cityCode;

    /**
     * Attribute to hold <code>deleteDate</code> property.
     * <p>
     * End date of the commodity during ‘delete’ action. Mandatory for ‘delete’ action. The End Date must be
     * today or later.
     */
    private Date deletionDate;

    /**
     * <code>Default constructor.</code>
     */
    public AirportDeleteRequest() {
    }

    /**
     * Gets the <code>airportCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * ZZA
     * <p>
     * 
     * @return the current value of <code>airportCode</code> property.
     */

    public final String getAirportCode() {

        return this.airportCode;
    }

    /**
     * Gets the <code>cityCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * CHI
     * <p>
     * 
     * @return the new value of <code>cityCode</code> property.
     */
    public final String getCityCode() {
        return this.cityCode;
    }

    /**
     * Gets the <code>deletionDate</code> property.
     * <p>
     * Represents the value of the <code>endDate</code> to check whether the commodity is marked for deletion.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 10APR95
     * <p>
     * 
     * @return the current value of the <code>deletionDate</code> property.<br>
     */
    public final Date getDeletionDate() {
        return ContractUtility.getClonedDate(this.deletionDate);
    }

    /**
     * Sets the <code>airportCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * ZZA
     * <p>
     * 
     * @param pAirportCode the new value of <code>airportCode</code> property.
     */
    public final void setAirportCode(final String pAirportCode) {
        this.airportCode = pAirportCode;
    }

    /**
     * Sets the <code>cityCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * CHI
     * <p>
     * 
     * @param pCityCode the new value of <code>cityCode</code> property.
     */
    public final void setCityCode(final String pCityCode) {
        this.cityCode = pCityCode;
    }

    /**
     * Sets the <code>deleteDate</code> property.
     * <p>
     * Represents the value of the <code>endDate</code> to check whether the commodity is marked for deletion.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 10APR95
     * <p>
     * 
     * @param pDeletionDate the new value of the <code>deleteDate</code>property.<br>
     */
    public final void setDeletionDate(final Date pDeletionDate) {
        this.deletionDate = ContractUtility.getClonedDate(pDeletionDate);
    }
}
