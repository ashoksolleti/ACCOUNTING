/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>StationResponse</code> contains the response of the maintenance request received by
 * <code>StationService</code>.
 * <p>
 * <ul>
 * <li><code>station</code></li>
 * </ul>
 */
public class StationResponse extends AbstractResponse {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -4451403452111684010L;

    /**
     * Attribute to hold <code>station</code> property. The station data transfer object which holds the
     * station information that needs to be returned to client.
     */

    private StationDto station;

    /**
     * <code>Default constructor.</code>
     */
    public StationResponse() {

    }

    /**
     * Gets the <code>station</code>.
     * <p>
     * 
     * @return <code>{@link com.unisys.trans.logistics.lms.utils.dto.StationDto StationDto}</code><br>
     *         Returns the <code>StationDto</code>.
     *         </p>
     */
    public StationDto getStation() {
        return this.station;
    }

    /**
     * Sets the <code>StationDto</code>.
     * <p>
     * 
     * @param pStationDto <code> {@link com.unisys.trans.logistics.lms.utils.dto.StationDto StationDto}</code><br>
     *            The station data transfer object
     *            </p>
     */
    public void setStation(final StationDto pStationDto) {
        this.station = pStationDto;
    }

}
