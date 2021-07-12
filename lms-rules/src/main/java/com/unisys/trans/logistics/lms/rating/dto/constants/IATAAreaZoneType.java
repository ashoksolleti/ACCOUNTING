/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto.constants;

/**
 * <code>IATAAreaZoneType</code> holds the constants to indicate IATAArea Zone type
 * applied.
 * <p>
 * Following are the possible IATAAreaZone type:<br>
 * <ul>
 * <li>1 - Zone1
 * <li>2 - Zone2
 * <li>3 - Zone3
 * </ul>
 */

public enum IATAAreaZoneType {

    /**
     * Constant used for Zone 1.
     */

    ZONE1(1),

    /**
     * Constant used for Zone 2.
     */

    ZONE2(2),

    /**
     * Constant used for Zone 3.
     */

    ZONE3(3);

    /**
     * Attribute to hold the <code>zoneType</code> property.
     */

    private Integer zoneType;

    /**
     * Parameterize constructor.
     * 
     * @param pZoneType
     *            the value.
     */

    IATAAreaZoneType(final Integer pZoneType) {
        this.setZoneType(pZoneType);
    }

    /**
     * Gets the zoneType.
     * <p>
     * 
     * @return the current value of <code>zoneType</code> property.<br>
     */

    public Integer getZoneType() {
        return this.zoneType;
    }

    /**
     * Sets the zoneType.
     * <p>
     * 
     * @param pZoneType
     *            the current value of <code>zoneType</code> property.<br>
     */

    public void setZoneType(final Integer pZoneType) {
        this.zoneType = pZoneType;
    }

}
