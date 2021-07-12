/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>AirportPersistRequest</code> is used for creating and updating the <code>airport</code>.
 * <p>
 * This contains the following attribute:<br>
 * <ul>
 * <li><code>airportDto</code>
 * </ul>
 */
public class AirportPersistRequest extends AbstractRequest {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1754484391567530835L;

    /**
     * Attribute to hold the <code>airportDto</code> property.
     */
    private AirportDto airportDto;

    /**
     * <code>Default constructor.</code>
     */

    public AirportPersistRequest() {

    }

    /**
     * Gets the <code>airportDto</code> property.
     * <p>
     * 
     * @return the current value of <code>airportDto</code> property.
     */
    public final AirportDto getAirportDto() {

        return this.airportDto;

    }

    /**
     * Sets the <code>airportDto</code> property.
     * <p>
     * 
     * @param pAirportDto the new value of <code>airportDto</code> property.
     */
    public final void setAirportDto(final AirportDto pAirportDto) {
        this.airportDto = pAirportDto;
    }
}
