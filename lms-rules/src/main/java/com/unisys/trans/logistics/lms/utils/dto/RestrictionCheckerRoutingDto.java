/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.io.Serializable;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>RestrictionGenerateRoutingDto</code> contains the station code, carrier code and its position. The
 * restriction is generated for an origin station to the destination station through a set of intermediate
 * stations. There can be up to 5 intermediate stations.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>carrierCode
 * <li>position
 * <li>stationCode
 * </code>
 * </ul>
 */

public class RestrictionCheckerRoutingDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 2358134162352949327L;

    /**
     * Attribute to hold <code>carrierCode</code> property.
     * <p>
     * The carrier code in which the air waybill arrives at the station.The default carrier code is the host
     * carrier.
     */
    private String carrierCode;

    /**
     * Attribute to hold <code>position</code> property.
     * <p>
     * The position number of the station available in the routing.
     */

    private int position;

    /**
     * Attribute to hold <code>stationCode</code> property.
     * <p>
     * The 3 letter code representing the station involved in routing for an air waybill.
     */
    private String stationCode;
    
    /**
     * Attribute to hold <code>stationCode</code> property.
     * <p>
     * The 3 letter code representing the station involved in routing for an air waybill.
     */
    private String countryCode;

    /**
     * Default constructor.
     */
    public RestrictionCheckerRoutingDto() {

    }

    /**
     * Gets the <code>carrierCode</code> property in which the air waybill arrives at the station.
     * <p>
     * The default carrier code is the host carrier.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * UW
     * <p>
     * 
     * @return the current value of the <code>carrierCode</code> property.<br>
     */
    public String getCarrierCode() {

        return this.carrierCode;

    }

    /**
     * Gets the <code>position</code> property.
     * <p>
     * The position number of the station available in the routing.
     * <p>
     * <b>Format: </b><br>
     * 1 Numeric
     * <p>
     * <b>Example: </b><br>
     * 2
     * <p>
     * 
     * @return the current value of the <code>position</code> property.<br>
     */
    public int getPosition() {

        return this.position;

    }

    /**
     * Gets the <code>stationCode</code> property.
     * <p>
     * The 3 letter code representing the station involved in routing for an air waybill.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @return current value of the <code>stationCode</code> property.<br>
     */
    public String getStationCode() {

        return this.stationCode;

    }

    /**
     * Sets the <code>carrierCode</code> property in which the air waybill arrives at the station.
     * <p>
     * The default carrier code is the host carrier.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * UW
     * <p>
     * 
     * @param pCarrierCode the new value of the <code>carrierCode</code> property.<br>
     */
    public void setCarrierCode(final String pCarrierCode) {

        this.carrierCode = ContractUtility.convertToUpperCase(pCarrierCode);

    }

    /**
     * Sets the <code>position</code> property.
     * <p>
     * The position number of the station available in the routing.
     * <p>
     * <b>Format: </b><br>
     * Numeric
     * <p>
     * <b>Example: </b><br>
     * 2
     * <p>
     * 
     * @param pPosition the new value of the <code>position</code> property.<br>
     */
    public void setPosition(final int pPosition) {
        this.position = pPosition;
    }

    /**
     * Sets the <code>stationCode</code> property.
     * <p>
     * The 3 letter code representing the station involved in routing for an air waybill.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @param pStationCode the new value of the <code>stationCode</code> property.<br>
     */

    public void setStationCode(final String pStationCode) {

        this.stationCode = ContractUtility.convertToUpperCase(pStationCode);

    }

	/**
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * @param countryCode the countryCode to set
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
}