/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>OfficeFindRequest</code> holds all the information to retrieve an Office .
 * <p>
 * The office details are retrieved based on the office identifier or the station code. Using the office
 * identifier the office information for a particular office can be retrieved, whereas the station code is
 * used to retrieve all the offices bound to a particular station. <br>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>officeIdentifier
 * <li>stationCode
 * </code>
 * </ul>
 */
public class OfficeFindRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 510777537981985582L;

    /**
     * Attribute to hold the <code>officeIdentifier</code> property.
     * <p>
     * The office information with the particular identifier will be retrieved.
     */
    private String officeIdentifier;

    /**
     * Attribute to hold the <code>stationCode</code> property.
     * <p>
     * The station code cane be a city or airport.All the offices associated with this station code will be
     * retrieved.
     */
    private String stationCode;

    /**
     * <code>Default constructor.</code>
     */
    public OfficeFindRequest() {

    }

    /**
     * Gets the <code>officeIdentifier</code> property.
     * <p>
     * The office information with the particular identifier will be retrieved.
     * <p>
     * <b>Format: </b><br>
     * 1-20 Alphanumeric
     * <p>
     * <b>Example:</b><br>
     * MSP001
     * <p>
     * 
     * @return the current value of the<code>officeIdentifier</code> property.
     */

    public String getOfficeIdentifier() {
        return this.officeIdentifier;
    }

    /**
     * Gets the<code>stationCode</code> property.
     * <p>
     * The station code cane be a city or airport.All the offices associated with this station code will be
     * retrieved.
     * <p>
     * <b>Format : </b><br>
     * 3 Alphabetic.
     * <p>
     * <b>Example : </b><br>
     * MSP.
     * <p>
     * 
     * @return the current value of the <code>stationCode</code> property.<br>
     */

    public String getStationCode() {
        return this.stationCode;
    }

    /**
     * Sets the <code>officeIdentifier</code> property.<br>
     * <p>
     * The office information with the particular identifier will be retrieved.
     * <p>
     * <b>Format: </b><br>
     * 1-20 Alphanumeric.
     * <p>
     * <b>Example:</b><br>
     * MSP001
     * <p>
     * 
     * @param pOfficeIdentifier the new value of the <code>officeIdentifier</code> property.<br>
     */

    public void setOfficeIdentifier(final String pOfficeIdentifier) {
        this.officeIdentifier = ContractUtility.convertToUpperCase(pOfficeIdentifier);
    }

    /**
     * Sets the <code>stationCode</code> property.
     * <p>
     * The station code cane be a city or airport.All the offices associated with this station code will be
     * retrieved.
     * <p>
     * <b>Format : </b><br>
     * 3 Alphabetic.
     * <p>
     * <b>Example : </b><br>
     * MSP.
     * <p>
     * 
     * @param pStationCode the current value of the <code>stationCode</code> property.<br>
     */

    public void setStationCode(final String pStationCode) {
        this.stationCode = ContractUtility.convertToUpperCase(pStationCode);
    }
}
