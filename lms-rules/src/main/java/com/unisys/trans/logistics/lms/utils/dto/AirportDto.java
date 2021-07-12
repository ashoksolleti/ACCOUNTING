/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * The <code>AirportDto</code> contains information about the airports that are provided in the<br>
 * response object to the client.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>airportCode
 * <li>airportName
 * <li>cityCode
 * <li>latitude
 * <li>longitude
 * <li>isServiceAirport
 * <li>isDefaultAirport
 * </code>
 * </ul>
 */
public class AirportDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 7987424720553928611L;

    /**
     * Attribute to hold <code>airportCode</code> property.
     */
    private String airportCode;

    /**
     * Attribute to hold <code>airportName</code> property.
     */
    private String airportName;

    /**
     * Attribute to hold <code>airportServiceIndicator</code> property.
     */
    private boolean airportServiceIndicator;

    /**
     * Attribute to hold <code>cityCode</code> property.
     */
    private String cityCode;

    /**
     * Attribute to hold <code>countryCode</code> property.
     * <p>
     * The country code represents the country to which the airport belongs.
     */
    private String countryCode;

    /**
     * Attribute to hold <code>defaultAirportIndicator</code> property.
     */
    private boolean defaultAirportIndicator;

    /**
     * Attribute to hold <code>deletionDate</code> property.
     */
    private Date deletionDate;

    /**
     * Attribute to hold <code>latitude</code> property.
     */
    private String latitude;

    /**
     * Attribute to hold <code>longitude</code> property.
     */
    private String longitude;

    /**
     * Attribute to hold <code>oId</code> property.
     */

    private Long oId;

    /**
     * Attribute to hold <code>stateCode</code> property.
     * <p>
     * The state or province abbreviation code.
     */
    private String stateCode;

    /**
     * Gets the <code>airportCode</code> property.
     * <p>
     * The Airport code.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * ZZA
     * <p>
     * 
     * @return the current value of <code>airportCode</code> property.
     */
    public final String getAirportCode() {
        return this.airportCode;
    }

    /**
     * Gets the <code>airportName</code> property.
     * <p>
     * Airport name.
     * <p>
     * <b>Format: </b><br>
     * 1-29 Alphabets
     * <p>
     * <b>Example: </b><br>
     * O�HARE INTL
     * <p>
     * 
     * @return the current value of <code>airportName</code> property.
     */
    public final String getAirportName() {
        return this.airportName;
    }

    /**
     * Gets the <code>cityCode</code> property.
     * <p>
     * City code to which the airport is associated.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * CHI
     * <p>
     * 
     * @return the current value of the <code>cityCode</code> property.
     */
    public final String getCityCode() {
        return this.cityCode;
    }

    /**
     * Gets the <code>countryCode</code> property.
     * <p>
     * The country code represents the country to which the airport belongs.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabets(Upper Case)
     * <p>
     * <b>Example: </b><br>
     * US
     * <p>
     * 
     * @return the current value of <code>countryCode</code> to which the airport belongs.<br>
     */
    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * Gets the <code>deletionDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * DDMMMYY
     * <p>
     * <b>Example: </b><br>
     * 26JAN08
     * <p>
     * 
     * @return the current value of the <code>deletionDate</code> property.
     */
    public Date getDeletionDate() {
        return ContractUtility.getClonedDate(this.deletionDate);
    }

    /**
     * Gets the <code>latitude</code> property.
     * <p>
     * Latitude of the airport given in degrees and minutes. This latitude is calculated beginning at the
     * south pole as 0 latitude and continues north.
     * <p>
     * <b>Format: </b><br>
     * 1-2N.1-2N.1-2N.1A
     * <p>
     * <b>Example: </b><br>
     * 12.25.14N
     * <p>
     * 
     * @return the current value of <code>latitude</code> property.
     */
    public final String getLatitude() {
        return this.latitude;
    }

    /**
     * Gets the <code>longitude</code> property.
     * <p>
     * Longitude of the airport given in degrees and minutes. The longitude is calculated beginning at the
     * prime meridian.
     * <p>
     * <b>Format: </b><br>
     * 1-2N.1-2N.1-2N.1A
     * <p>
     * <b>Example: </b><br>
     * 12.25.14N
     * <p>
     * 
     * @return the current value of <code>longitude</code> property.
     */
    public final String getLongitude() {
        return this.longitude;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    @Override
    public final Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>stateCode</code> property.
     * <p>
     * The state or province abbreviation code.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabets(Upper Case)
     * <p>
     * <b>Example: </b><br>
     * IL
     * <p>
     * 
     * @return the current value of <code>stateCode</code> of the airport.<br>
     */
    public String getStateCode() {
        return this.stateCode;
    }

    /**
     * Determines if the <code>airportServiceIndicator</code> property is true.
     * <p>
     * The service airport indicator.
     * <p>
     * <b>Possible Values: </b><br>
     * <code>true</code> - The airport is a service airport.<br>
     * <code>false</code> - The airport is not a service airport.<br>
     * <p>
     * 
     * @return the current value of <code>airportServiceIndicator</code> property.
     */
    public final boolean isAirportServiceIndicator() {
        return this.airportServiceIndicator;
    }

    /**
     * Determines if the <code>defaultAirportIndicator</code> property is true.
     * <p>
     * <b>Possible Values: </b><br>
     * <code>true</code> - The airport is a default airport.<br>
     * <code>false</code> - The airport is not a default airport.<br>
     * <p>
     * 
     * @return The current value of <code>defaultAirportIndicator</code> property.
     */
    public final boolean isDefaultAirportIndicator() {
        return this.defaultAirportIndicator;
    }

    /**
     * Sets the <code>airportCode</code> property.
     * <p>
     * The Airport code.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * ZZA
     * <p>
     * 
     * @param pAirportCode the new value of <code>airportCode</code> property.
     */
    public final void setAirportCode(final String pAirportCode) {
        this.airportCode = ContractUtility.convertToUpperCase(pAirportCode);
    }

    /**
     * Sets the <code>airportName</code> property.
     * <p>
     * Airport name.
     * <p>
     * <b>Format: </b><br>
     * 1-29 Alphabets
     * <p>
     * <b>Example: </b><br>
     * O�HARE INTL
     * <p>
     * 
     * @param pAirportName the new value of <code>airportName</code> property.
     */
    public final void setAirportName(final String pAirportName) {
        this.airportName = pAirportName;
    }

    /**
     * Sets the value of the <code>airportServiceIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <code>true</code> - The airport is a service airport.<br>
     * <code>false</code> - The airport is not a service airport.<br>
     * <p>
     * 
     * @param pIsServiceAirport the new value of the <code>airportServiceIndicator</code> property.
     */
    public final void setAirportServiceIndicator(final boolean pIsServiceAirport) {
        this.airportServiceIndicator = pIsServiceAirport;
    }

    /**
     * Sets the <code>cityCode</code> property.
     * <p>
     * City code to which the airport is associated.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * CHI
     * <p>
     * 
     * @param pCityCode the new value of <code>cityCode</code> property.
     */
    public final void setCityCode(final String pCityCode) {
        this.cityCode = ContractUtility.convertToUpperCase(pCityCode);
    }

    /**
     * Sets the <code>countryCode</code> property.
     * <p>
     * The country code represents the country to which the airport belongs.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabets(Upper Case)
     * <p>
     * <b>Example: </b><br>
     * US
     * <p>
     * 
     * @param pCountryCode the new value of <code>countryCode</code>.<br>
     */
    public void setCountryCode(final String pCountryCode) {
        this.countryCode = ContractUtility.convertToUpperCase(pCountryCode);
    }

    /**
     * Sets the value of the <code>defaultAirportIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <code>true</code> - The airport is a default airport.<br>
     * <code>false</code> - The airport is not a default airport.<br>
     * <p>
     * 
     * @param pIsDefaultAirport the new value of the <code>defaultAirportIndicator</code> property.
     */
    public final void setDefaultAirportIndicator(final boolean pIsDefaultAirport) {
        this.defaultAirportIndicator = pIsDefaultAirport;
    }

    /**
     * Sets the <code>deletionDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * DDMMMYY
     * <p>
     * <b>Example: </b><br>
     * 26JAN08
     * <p>
     * 
     * @param pDeletionDate
     *            the new value of the <code>deletionDate</code> property.
     */
    public void setDeletionDate(final Date pDeletionDate) {
        this.deletionDate = ContractUtility.getClonedDate(pDeletionDate);
    }

    /**
     * Sets the <code>latitude</code> property.
     * <p>
     * Latitude of the airport given in degrees and minutes. This latitude is calculated beginning at the
     * south pole as 0 latitude and continues north.
     * <p>
     * <b>Format: </b><br>
     * 1-2N.1-2N.1-2N.1Ap
     * <p>
     * <b>Example: </b><br>
     * 12.25.14N
     * <p>
     * 
     * @param pLatitude the new value of <code>latitude</code> property.
     */
    public final void setLatitude(final String pLatitude) {
        this.latitude = ContractUtility.convertToUpperCase(pLatitude);
    }

    /**
     * Sets the <code>longitude</code> property.
     * <p>
     * Longitude of the airport given in degrees and minutes. The longitude is calculated beginning at the
     * prime meridian.
     * <p>
     * <b>Format: </b><br>
     * 1-2N.1-2N.1-2N.1A
     * <p>
     * <b>Example: </b><br>
     * 12.25.14N
     * <p>
     * 
     * @param pLongitude the new value of <code>longitude</code> property.
     */
    public final void setLongitude(final String pLongitude) {
        this.longitude = ContractUtility.convertToUpperCase(pLongitude);
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.<br>
     */
    public final void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Gets the <code>stateCode</code> property.
     * <p>
     * The state or province abbreviation code.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabets(Upper Case)
     * <p>
     * <b>Example: </b><br>
     * IL
     * <p>
     * 
     * @param pStateCode the new value of <code>StateCode</code> of the airport.<br>
     */
    public void setStateCode(final String pStateCode) {
        this.stateCode = ContractUtility.convertToUpperCase(pStateCode);
    }

}
