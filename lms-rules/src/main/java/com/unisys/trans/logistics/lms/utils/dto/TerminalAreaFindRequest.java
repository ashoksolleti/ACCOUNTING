/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>TerminalAreaFindRequest</code> is used for finding terminal area information.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>areaNameIdentifier
 * <li>terminalAreaName
 * <li>terminalName
 * </ul>
 * </code>
 */
public class TerminalAreaFindRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 500345078719484341L;

    /**
     * Attribute to hold the <code>areaNameIdentifier</code> property.
     */
    private String areaNameIdentifier;

    /**
     * Attribute to hold the <code>stationCode</code> property.
     */
    private String stationCode;

    /**
     * Attribute to hold the <code>terminalAreaName</code> property.
     */
    private String terminalAreaName;

    /**
     * Attribute to hold the <code>terminalName</code> property.
     */
    private String terminalName;

    /**
     * <code>Default constructor.</code>
     */
    public TerminalAreaFindRequest() {

    }

    /**
     * Gets the <code>areaNameIdentifier</code> property.
     * <p>
     * The string value that the holds the area name being searched for.
     * <p>
     * <b>Format: </b><br>
     * 1-7 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * 2AREA
     * <p>
     * 
     * @return the current value of the <code>areaNameIdentifier</code> property.
     */
    public String getAreaNameIdentifier() {
        return this.areaNameIdentifier;
    }

    /**
     * Gets the <code>stationCode</code> property.
     * <p>
     * The station name from where the user has logged in.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
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
     * Gets the <code>terminalAreaName</code> property.
     * <p>
     * The name of the terminal area.
     * <p>
     * <b>Format: </b><br>
     * 1-7 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * 2AREA
     * <p>
     * 
     * @return the current value of the <code>terminalAreaName</code> property.
     */
    public String getTerminalAreaName() {
        return this.terminalAreaName;
    }

    /**
     * Gets the <code>terminalName</code> property.
     * <p>
     * The name of the terminal where the terminal area resides.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @return the current value of the <code>terminalName</code> property.
     */
    public java.lang.String getTerminalName() {
        return this.terminalName;
    }

    /**
     * Sets the <code>areaNameIdentifier</code> property.
     * <p>
     * The string value that the holds the area name being searched for.
     * <p>
     * <b>Format: </b><br>
     * 1-7 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * 2AREA
     * <p>
     * 
     * @param pAreaNameIdentifier the new value of the <code>areaNameIdentifier</code> property.
     */
    public void setAreaNameIdentifier(final String pAreaNameIdentifier) {
        this.areaNameIdentifier = ContractUtility.convertToUpperCase(pAreaNameIdentifier);
    }

    /**
     * Sets the <code>stationCode</code> property.
     * <p>
     * The station name from where the user has logged in.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @param pStationCode the new value of the <code>stationCode</code> property.
     */
    public void setStationCode(final String pStationCode) {
        this.stationCode = ContractUtility.convertToUpperCase(pStationCode);
    }

    /**
     * Sets the <code>terminalAreaName</code> property.
     * <p>
     * The name of the terminal area.
     * <p>
     * <b>Format: </b><br>
     * 1-7 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * 2AREA
     * <p>
     * 
     * @param pTerminalAreaName the new value of the <code>terminalAreaName</code> property.
     */
    public void setTerminalAreaName(final String pTerminalAreaName) {
        this.terminalAreaName = ContractUtility.convertToUpperCase(pTerminalAreaName);
    }

    /**
     * Sets the <code>terminalName</code> property.
     * <p>
     * The name of the terminal where the terminal area resides.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @param pTerminalName the new value of the <code>terminalName</code> property.
     */
    public void setTerminalName(final java.lang.String pTerminalName) {
        this.terminalName = pTerminalName;
    }

}
