/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.io.Serializable;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>SpotRateStationDto</code> contain details of SpotRateStationDto.
 * <p>
 * This contains all information about SpotRateStationDto.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>carrier
 * <li>routeOrder
 * <li>station
 * </ul>
 */

public class SpotRateStationDto implements Serializable {

    /**
     * Default serial version id.
     */
    private static final long serialVersionUID = 6165984201125571288L;

    /**
     * Attribute to hold <code>carrier</code> property.
     */
    private String carrier;

    /**
     * Attribute to hold <code>routeOrder</code> property.
     */
    private long routeOrder;

    /**
     * Attribute to hold <code>station</code> property.
     */
    private GeographicDataDto station;

    /**
     * Gets the <code>Carrier</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2-3 AlphaNumeric.
     * <p>
     * <b>Example: </b><br>
     * UW.
     * <p>
     * 
     * @return the current value of the <code>Carrier</code> property.
     */
    public String getCarrier() {
        return this.carrier;
    }

    /**
     * Gets the <code>routeOrder</code> property.
     * <p>
     * 
     * @return the current value of the <code>routeOrder</code> property.
     */
    public long getRouteOrder() {
        return this.routeOrder;
    }

    /**
     * Gets the <code>station</code> property.
     * <p>
     * 
     * @return the current value of the <code>station</code> property.
     */
    public GeographicDataDto getStation() {
        return this.station;
    }

    /**
     * Sets the <code>Carrier</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2-3 AlphaNumeric.
     * <p>
     * <b>Example: </b><br>
     * UW.
     * <p>
     * 
     * @param pCarrier
     *            the current value of the <code>Carrier</code> property.
     */
    public void setCarrier(final String pCarrier) {
        this.carrier = ContractUtility.convertToUpperCase(pCarrier);
    }

    /**
     * Sets the <code>routeOrder</code> property.
     * <p>
     * 
     * @param pRouteOrder
     *            the current value of the <code>routeOrder</code> property.
     */
    public void setRouteOrder(final long pRouteOrder) {
        this.routeOrder = pRouteOrder;
    }

    /**
     * Sets the <code>station</code> property.
     * <p>
     * 
     * @param pStation
     *            the current value of the <code>station</code> property.
     */
    public void setStation(final GeographicDataDto pStation) {
        this.station = pStation;
    }
}
