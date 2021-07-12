/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto.constants;

/**
 * <code>SecurityGeoType</code> holds the constants to indicate SecurityGeoType.
 * applied.
 * <p>
 * Following are the possible SecurityGeoType:<br>
 * <ul>
 * <li>S - User Sign-in StationRajalakshmiB@hexaware.com
 * <li>R - All
 * </ul>
 */
public enum SecurityGeoType {
    /**
     * Constant used for All Station.
     */
    A("All Station"),
    /**
     * Constant used for User Sign-in Station.
     */
    S("User Sign-in Station");

    /**
     * Attribute to hold the <code>geoType</code> property.
     */
    private String geoType;

    /**
     * Parameterized Constructor.
     * 
     * @param pType
     *            holds the Type.
     */
    SecurityGeoType(final String pType) {
        this.geoType = pType;
    }

    /**
     * Gets Security Geo Type.
     * 
     * @return the current value of geoType
     */

    public String getGeoType() {
        return this.geoType;
    }

}
