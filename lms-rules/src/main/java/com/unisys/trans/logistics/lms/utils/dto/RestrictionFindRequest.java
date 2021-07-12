/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.preferences.CheckType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.util.List;

/**
 * <code>RestrictionFindRequest</code> is used for finding the Restriction.<br>
 * <ul>
 * <code>
 * <li>carrierCode
 * <li>restrictionSearch
 * <li>stationCode
 * <li>systemWideIndicator
 * </code>
 * </ul>
 */
public class RestrictionFindRequest extends AbstractRequest {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 3351320147947125245L;

    /**
     * Attribute to hold <code>carrierCode</code> property.
     * <p>
     * Carrier code for which the restriction information is to be displayed. If not entered, it defaults to
     * the host carrier.
     */
    private String carrierCode;

    /**
     * Attribute to hold <code>restrictionSearch</code> property.
     * <P>
     * Contains necessary information to retrieve a restriction.it is of <code>RestrictionSearchDto</code>
     * type.
     */
    private RestrictionSearchDto restrictionSearch;

    /**
     * Attribute to hold <code>stationCode</code> property.
     * <p>
     * Station for which the restriction information is to be displayed.
     */
    private String stationCode;

    /**
     * Attribute to hold <code>systemWideIndicator</code> property.
     * <p>
     * Indicator to denote that the restriction is for all the station in the system.
     * <li><code>true</code> �System wide restrictions.
     * <li><code>false</code>�Not a system wide restriction.
     */
    private boolean systemWideIndicator;

    private boolean awbRestriction;

    private String countryCode;

    private boolean hiddenSegmentsFound;

    private CheckType checkTypeCode;

    private List<String> carrierCodes;
    
    private boolean fromCollectCharge;

    /**
     * <code>Default constructor.</code>
     */
    public RestrictionFindRequest() {

    }

    /**
     * Gets the value of the <code>carrierCode</code> property.
     * <p>
     * Unique key identify the <code>RestrictionDto</code>.It is of type Long.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphanumeric<br>
     * <b>Example: </b><br>
     * UW
     * 
     * @return the current value of the <code>carrierCode</code> property.
     */
    public String getCarrierCode() {
        return this.carrierCode;
    }

    /**
     * Gets the <code>restrictionSearch</code> property.
     * <p>
     * Contains necessary information to retrieve a restriction.it is of <code>RestrictionSearchDto</code>
     * type.
     * <p>
     * 
     * @return the current value of the <code>restrictionSearch</code> property.
     */
    public RestrictionSearchDto getRestrictionSearch() {
        return this.restrictionSearch;
    }

    /**
     * Gets the value of the <code>stationCode</code> property.
     * <p>
     * Station for which the restriction information is to be displayed.
     * <p>
     * <b>Format: </b><br>
     * 3 or 5 Alphabets<br>
     * <b>Example: </b><br>
     * MSP
     * 
     * @return the current value of the <code>stationCode</code> property.
     */
    public String getStationCode() {
        return this.stationCode;
    }

    /**
     * Gets the value of <code>systemWideIndicator</code> property.
     * <p>
     * Indicator to denote that the restriction is for all the station in the system.
     * <li><code>true</code> �Indicator to denote that the restriction is for all the stations in the system
     * <li><code>false</code>�Indicator to denote that the restriction is not for all the stations in the
     * system.
     * <p>
     * 
     * @return <code>boolean</code> the new value of the systemWideIndicator Property.
     */
    public boolean isSystemWideIndicator() {
        return this.systemWideIndicator;
    }

    /**
     * Sets the <code>carrierCode</code> property.
     * <p>
     * Unique key identify the <code>RestrictionDto</code>.It is of type Long.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphanumeric<br>
     * <b>Example: </b><br>
     * UW
     * <p>
     * 
     * @param pCarrierCode the new value of the <code>carrierCode</code> property.
     */
    public void setCarrierCode(final String pCarrierCode) {
        this.carrierCode = ContractUtility.convertToUpperCase(pCarrierCode);
    }

    /**
     * Sets the <code>restrictionSearch</code> property.
     * <p>
     * Contains necessary information to retrieve a restriction.it is of <code>RestrictionSearchDto</code>
     * type.
     * <p>
     * 
     * @param pRestrictionSearchDto the new value of the <code>restrictionSearch</code> property.
     */
    public void setRestrictionSearch(final RestrictionSearchDto pRestrictionSearchDto) {
        this.restrictionSearch = pRestrictionSearchDto;
    }

    /**
     * Sets the <code>stationCode</code> property.
     * <p>
     * Station for which the restriction information is to be displayed.
     * <p>
     * <b>Format: </b><br>
     * 3 or 5 Alphabets<br>
     * <b>Example: </b><br>
     * MSP
     * 
     * @param pStationCode the new value of the <code>stationCode</code> property.
     */
    public void setStationCode(final String pStationCode) {
        this.stationCode = ContractUtility.convertToUpperCase(pStationCode);
    }

    /**
     * Sets the <code>systemWideIndicator </code>property.
     * <p>
     * Indicator to denote that the restriction is for all the station in the system.
     * <li><code>true</code> �Indicator to denote that the restriction is for all the stations in the system
     * <li><code>false</code>�Indicator to denote that the restriction is not for all the stations in the
     * system.
     * <p>
     * <b>Possible Values: </b><br>
     * <code>true</code> Indicator to denote that the restriction is for all the stations in the system.<br>
     * <code>false</code> Indicator to denote that the restriction is not for all the stations in the system.
     * <br>
     * 
     * @param pSystemWideIndicator the new value of the <code>systemWideIndicator</code> property.
     */
    public void setSystemWideIndicator(final boolean pSystemWideIndicator) {
        this.systemWideIndicator = pSystemWideIndicator;
    }

    public boolean isAwbRestriction() {
        return awbRestriction;
    }

    public void setAwbRestriction(boolean awbRestriction) {
        this.awbRestriction = awbRestriction;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public boolean isHiddenSegmentsFound() {
        return hiddenSegmentsFound;
    }

    public void setHiddenSegmentsFound(boolean hiddenSegmentsFound) {
        this.hiddenSegmentsFound = hiddenSegmentsFound;
    }

    public CheckType getCheckTypeCode() {
        return checkTypeCode;
    }

    public void setCheckTypeCode(CheckType checkTypeCode) {
        this.checkTypeCode = checkTypeCode;
    }

    public List<String> getCarrierCodes() {
        return carrierCodes;
    }

    public void setCarrierCodes(List<String> carrierCodes) {
        this.carrierCodes = carrierCodes;
    }

	public boolean isFromCollectCharge() {
		return fromCollectCharge;
	}

	public void setFromCollectCharge(boolean fromCollectCharge) {
		this.fromCollectCharge = fromCollectCharge;
	}

}
