/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>StationPersistRequest</code> is used for creating and updating the <code>Station</code>.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>station
 * </code>
 * </ul>
 */
public class StationPersistRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 3251192633858838988L;

    /**
     * Attribute to hold the <code>station</code> property.
     * <p>
     * The station data transfer object which holds the information that needs to be persisted.
     */
    private StationDto station;

    /**
     * <code>Default constructor.</code>
     */
    public StationPersistRequest() {

    }

    /**
     * Gets the <code>station</code>.
     * <p>
     * The station data transfer object which holds the information that needs to be persisted.
     * <p>
     * 
     * @return the current value of the <code>station</code> property.<br>
     */
    public StationDto getStation() {
        return this.station;
    }

    /**
     * Sets the <code>StationDto</code>.
     * <p>
     * The station data transfer object which holds the information that needs to be persisted.
     * <p>
     * 
     * @param pStationDto the new value of the <code>station</code> property.<br>
     */
    public void setStation(final StationDto pStationDto) {
        this.station = pStationDto;

    }
}
