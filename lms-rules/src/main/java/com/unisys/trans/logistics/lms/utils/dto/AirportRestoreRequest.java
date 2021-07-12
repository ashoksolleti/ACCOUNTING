/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>RatingNoteRestoreRequest</code> class represents the request to restore
 * the Rating Note information.
 * <p>
 * <code>RatingNoteRestoreRequest</code> holds the following attribute:
 * <ul>
 * <code>
 * <li>airportCode</li>
 * <li>cityCode</li>
 * </code>
 * </ul>
 */
public class AirportRestoreRequest extends AbstractRequest {

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
     * <code>Default constructor.</code>
     */
    public AirportRestoreRequest() {
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
}
