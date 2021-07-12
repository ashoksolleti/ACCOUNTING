/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>AirportFindRequest</code> is used for retrieving airport.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <li><code>airportCode</code></li>
 * </ul>
 */
public class AirportFindRequest extends AbstractRequest {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 4413326683703293781L;

    /**
     * Attribute to hold <code>airPortcode</code> property.
     * <p>
     * The code represents the airport code.
     */
    private String airportCode;

    /**
     * <code>Default constructor. </code>
     */
    public AirportFindRequest() {

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

}
