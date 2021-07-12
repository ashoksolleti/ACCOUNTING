/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>StationFindRequest</code> is used for station information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>carrierCode
 * <li>searchText
 * <li>stationCode
 * <li>viewCarrierDataDefaultsIndicator
 * </code>
 * </ul>
 */
public class StationFindRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 8178372538166397303L;

    /**
     * Attribute to hold the <code>carrierCode</code> property.
     */
    private String carrierCode;

    /**
     * Attribute to hold the <code>searchText</code> property.
     */
    private String searchText;

    /**
     * Attribute to hold the <code>stationCode</code> property.
     */
    private String stationCode;

    /**
     * Attribute to hold the <code>viewCarrierDataDefaultsIndicator</code> property.
     */
    private boolean viewCarrierDataDefaultsIndicator;

    
    private String countryCode;
    /**
     * <code>Default constructor.</code>
     */
    public StationFindRequest() {

    }

    /**
     * Gets the value of the <code>carrierCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-2 Alpha Numeric
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
     * Gets the value of the <code>searchText</code> property.
     * <p>
     * 
     * @return the current value of the <code>searchText</code> property.<br>
     */

    public String getSearchText() {
        return this.searchText;
    }

    /**
     * Gets the value of the <code>stationCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets<br>
     * <b>Example: </b><br>
     * MSP
     * 
     * @return <code>String</code><br>
     *         Returns the current value of the <code>stationCode</code> property.<br>
     *         </p>
     */
    public String getStationCode() {
        return this.stationCode;
    }

    /**
     * Gets the value of <code>viewCarrierDataDefaultsIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <code>true</code> - If the view carrier defaults indicator is selected.<br>
     * <code>false</code> - If the view carrier defaults indicator is not selected.<br>
     * 
     * @return <code>boolean</code><br>
     *         Returns the current value of the <code>viewCarrierDataDefaultsIndicator</code> property.<br>
     *         </p>
     */
    public boolean isViewCarrierDataDefaultsIndicator() {
        return this.viewCarrierDataDefaultsIndicator;
    }

    /**
     * Sets the value of the <code>carrierCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-2 Alpha Numeric<br>
     * <b>Example: </b><br>
     * UW
     * 
     * @param pCarrierCode <code>String</code><br>
     *            The new value of the <code>carrierCode</code> property.<br>
     *            </p>
     */
    public void setCarrierCode(final String pCarrierCode) {
        this.carrierCode = ContractUtility.convertToUpperCase(pCarrierCode);
    }

    /**
     * Sets the value of the <code>searchText</code> property.
     * <p>
     * 
     * @param pSearchText <code>String</code><br>
     *            The new value of the <code>searchText</code> property.<br>
     *            </p>
     */
    public void setSearchText(final String pSearchText) {
        this.searchText = pSearchText;
    }

    /**
     * Sets the value of the <code>stationCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets<br>
     * <b>Example: </b><br>
     * MSP
     * 
     * @param pStationCode <code>String</code><br>
     *            The new value of the <code>stationCode</code> property.<br>
     *            </p>
     */
    public void setStationCode(final String pStationCode) {
        this.stationCode = ContractUtility.convertToUpperCase(pStationCode);
    }

    /**
     * Sets the value of <code>viewCarrierDataDefaultsIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <code>true</code> - If the view carrier defaults indicator is selected.<br>
     * <code>false</code> - If the view carrier defaults indicator is not selected.<br>
     * 
     * @param pViewCarrierDataDefaultsIndicator <code>boolean</code><br>
     *            The new value of the <code>viewCarrierDataDefaultsIndicator</code> property.<bR>
     *            </p>
     */
    public void setViewCarrierDataDefaultsIndicator(final boolean pViewCarrierDataDefaultsIndicator) {
        this.viewCarrierDataDefaultsIndicator = pViewCarrierDataDefaultsIndicator;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(final String pCountryCode) {
        this.countryCode = pCountryCode;
    }

}
