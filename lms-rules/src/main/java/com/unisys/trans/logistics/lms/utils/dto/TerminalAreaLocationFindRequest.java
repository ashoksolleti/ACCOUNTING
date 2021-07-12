/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>TerminalAreaLocationFindRequest</code> is used for finding terminal location information.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>terminalLocationName
 * <li>stationCode
 * </ul>
 * </code>
 */
public class TerminalAreaLocationFindRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 6583292904968539179L;

    /**
     * Attribute to hold the <code>stationCode</code> property.
     */
    private String stationCode;

    /**
     * Attribute to hold the <code>terminalLocationName</code> property..
     */
    private String terminalLocationName;

    /**
     * Gets the <code>stationCode</code> property.
     * <p>
     * The station code string from where the user has logged in.
     * <p>
     * <b>Format: </b><br>
     * 3 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @return the current value of the <code>stationCode</code> property.
     */
    public String getStationCode() {
        return this.stationCode;
    }

    /**
     * Gets the <code>terminalLocationName</code> property.
     * <p>
     * The name of the terminal location that is being searched for.
     * <p>
     * <b>Format: </b><br>
     * 1-9 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * 1MSCA
     * <p>
     * 
     * @return the current value of the <code>terminalLocationName</code> property.
     */
    public java.lang.String getTerminalLocationName() {
        return this.terminalLocationName;
    }

    /**
     * Sets the <code>stationCode</code> property.
     * <p>
     * The station code string from where the user has logged in.
     * <p>
     * <b>Format: </b><br>
     * 3 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * 1MSCA
     * <p>
     * 
     * @param pStationCode <br>
     *            the new value of the <code>stationCode</code> property.<br>
     */
    public void setStationCode(final String pStationCode) {
        this.stationCode = pStationCode;
    }

    /**
     * Sets the <code>terminalLocationName</code> property.
     * <p>
     * The name of the terminal location that is being searched for.
     * <p>
     * <b>Format: </b><br>
     * 1-9 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * 1MSCA
     * <p>
     * 
     * @param pTerminalLocationName <br>
     *            the new value of the <code>terminalLocationName</code> property.<br>
     */
    public void setTerminalLocationName(final java.lang.String pTerminalLocationName) {
        this.terminalLocationName = pTerminalLocationName;
    }
}
