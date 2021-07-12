/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>AirportResponse</code> contains the response of the maintenance request received by the
 * <code>AirportService</code>.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>AirportDto
 * </code>
 * </ul>
 */
public class AirportResponse extends AbstractResponse {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 5413522353351170001L;

    /**
     * Attribute to hold <code>airportDto</code> property.
     */
    private AirportDto airport;

    /**
     * <code>Default constructor.</code>
     */

    public AirportResponse() {

    }

    /**
     * Gets the <code>airportDto</code> property.
     * <p>
     * 
     * @return the current value of <code>airportDto</code> property.
     */
    public final AirportDto getAirport() {

        return this.airport;

    }

    /**
     * Sets the value of <code>airportDto</code> property.
     * <p>
     * 
     * @param pAirport the new value of <code>airportDto</code> property.
     */
    public final void setAirport(final AirportDto pAirport) {

        this.airport = pAirport;
    }
}
