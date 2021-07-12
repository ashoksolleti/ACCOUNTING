/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The <code>CityDto</code> contains all the information about the city.
 * <p>
 * Each <code>CityDto</code> holds two <code>CityDSTDtos</code> (Daylight Saving Time information) and
 * multiple <code>AirportDtos</code>'s (airport information).
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>airports
 * <li>cityCode
 * <li>cityName
 * <li>countryCode
 * <li>cityDSTs
 * <li>cityServiceIndicator
 * <li>standardUTCVariation
 * <li>stateCode
 * <li>stateName
 * </code>
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.utils.dto.AirportDto
 * @see com.unisys.trans.logistics.lms.utils.dto.CityDSTDto
 */
public class CityDto extends PersistenceObjectDto {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 3582345654797277533L;

    /**
     * Attribute to hold <code>airports</code> property.
     * <p>
     * The list of <code>AirportDto</code>'s associated with a city.
     */
    private List<AirportDto> airports = new ArrayList<AirportDto>();

    /**
     * Attribute to hold <code>cityCode</code> property.
     * <p>
     * The IATA city code that uniquely represents a city.
     */
    private String cityCode;

    /**
     * Attribute to hold <code>cityDST</code>'s property.
     * <p>
     * The list of cityDSTDtos associated with a city.
     */
    private List<CityDSTDto> cityDSTs = new ArrayList<CityDSTDto>();

    /**
     * Attribute to hold <code>cityName</code> property.
     * <p>
     * Represents the name of the city. The field is mandatory while creating/ updating city information.
     */
    private String cityName;

    /**
     * Attribute to hold <code>cityServiceIndicator</code> property.
     * <p>
     * The service city indicator that determines if the city is serviced by an airline or not.
     * <li><code>true</code><br>
     * City is serviced by the airline.
     * <li><code>false</code><br>
     * City is not serviced by the airline.
     */
    private Boolean cityServiceIndicator;

    /**
     * Attribute to hold <code>countryCode</code> property.
     * <p>
     * The country code represents the country to which the city belongs.
     */
    private String countryCode;

    /**
     * Attribute to hold <code>endDate</code> property.
     */
    private Date endDate;

    /**
     * Attribute to hold <code>oId</code> property.
     */

    private Long oId;

    /**
     * Attribute to hold <code>standardVariationUTC</code> property.
     * <p>
     * This is the time value to add to UTC to get the local time for this city. It is always specified in
     * minutes.
     */
    private Integer standardUTCVariation;

    /**
     * Attribute to hold <code>stateCode</code> property.
     * <p>
     * The state or province abbreviation code. Mandatory for cities in US, CA, and AU prohibited otherwise.
     */
    private String stateCode;

    /**
     * Attribute to hold <code>stateName</code> property.
     * <p>
     * The name of the city's state or province. This value is not provided in the
     * <code>CityPersistRequest</code> during the create operation. The corresponding state name is determined
     * dynamically as per the provided state code and is set in the <code>CityResponse</code>.
     */
    private String stateName;

    /**
     * <code>Default constructor.</code>
     */
    public CityDto() {

    }

    /**
     * Constructor with city code and country code as an argument.
     * <p>
     * 
     * @param pCityCode the new value of the <code>cityCode</code>. <br>
     * @param pCountryCode the new value the <code>countryCode</code>.<br>
     */
    public CityDto(final String pCityCode, final String pCountryCode) {
        this.cityCode = pCityCode;
        this.countryCode = pCountryCode;
    }

    /**
     * Gets the list of <code>AirportDto</code> details for a city.
     * <p>
     * 
     * @return the current list of <code>AirportDto</code> details.<br>
     */
    public List<AirportDto> getAirports() {
        return this.airports;
    }

    /**
     * Gets the <code>cityCode</code> property.
     * <p>
     * Indicates the IATA city code.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets(Upper Case)
     * <p>
     * <b>Example: </b><br>
     * CHI
     * <p>
     * 
     * @return the current value of <code>cityCode</code> of the city.<br>
     */
    public String getCityCode() {
        return this.cityCode;
    }

    /**
     * Gets the list of <code>CityDSTDto</code> associated with the city.
     * <p>
     * 
     * @return the current list of <code>CityDSTDto</code> associated with a city.<br>
     */
    public List<CityDSTDto> getCityDSTs() {
        return this.cityDSTs;
    }

    /**
     * Gets the <code>cityName</code> property.
     * <p>
     * Indicates the name of the city.The field is mandatory while creating/ updating city information.
     * <p>
     * <b>Format: </b><br>
     * 1-16 Any character
     * <p>
     * <b>Example: </b><br>
     * CHICAGO
     * <p>
     * 
     * @return the current value of <code>cityName</code> of the city.<br>
     */
    public String getCityName() {
        return this.cityName;
    }

    /**
     * Gets the <code>serviceCityIndicator</code> property.
     * <p>
     * Indicates if the city is serviced by an airline or not.
     * <p>
     * 
     * @return the current value of <code>serviceCityIndicator</code> property.<br>
     */
    public Boolean getCityServiceIndicator() {
        return this.cityServiceIndicator;
    }

    /**
     * Gets the <code>countryCode</code> property.
     * <p>
     * The country code represents the country to which the city belongs.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabets(Upper Case)
     * <p>
     * <b>Example: </b><br>
     * US
     * <p>
     * 
     * @return the current value of <code>countryCode</code> to which the city belongs.<br>
     */
    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * Gets the <code>DefaultAirport</code> property.
     * <p>
     * Airport name.
     * <p>
     * <b>Format: </b><br>
     * 1-29 Alphabets
     * <p>
     * <b>Example: </b><br>
     * HARE INTL
     * <p>
     * 
     * @return the current value of <code>DefaultAirport</code> to which the city belongs.<br>
     */
    public AirportDto getDefaultAirport() {
        AirportDto anAirport = null;
        final List<AirportDto> pAirportDtos = this.getAirports();
        for (AirportDto anAirportDto : pAirportDtos) {
            if (anAirportDto.isDefaultAirportIndicator()) {
                anAirport = anAirportDto;
                break;
            }
        }
        return anAirport;
    }

    /**
     * Gets the <code>endDate</code>of the city.
     * <p>
     * <b>Format:</b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT}
     * <p>
     * <b>Example:</b><br>
     * 30JAN2008
     * <p>
     * 
     * @return the current value of <code>endDate</code>of the city.
     */
    public Date getEndDate() {
        return ContractUtility.getClonedDate(this.endDate);
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>standardUTCVariation</code> property.
     * <p>
     * The Standard variation to UTC is the time value to add to UTC to get the local time for this city. It
     * is always specified in minutes.
     * <p>
     * <b>Format: </b><br>
     * sHHMM where s is an optional sign (+/-), HH is hours (00-23) and MM is minutes (00-59).
     * <p>
     * <b>Example: </b><br>
     * 2300, -2310
     * <p>
     * 
     * @return the current value of <code>standardUTCVariation</code> of the city.<br>
     */
    public Integer getStandardUTCVariation() {
        return this.standardUTCVariation;
    }

    /**
     * Gets the <code>stateCode</code> property.
     * <p>
     * The state or province abbreviation code.Mandatory for cities in US, CA, and AU prohibited otherwise.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabets(Upper Case)
     * <p>
     * <b>Example: </b><br>
     * IL
     * <p>
     * 
     * @return the current value of <code>stateCode</code> of the city.<br>
     */
    public String getStateCode() {
        return this.stateCode;
    }

    /**
     * Gets the <code>stateName</code> property.
     * <p>
     * Name of the city’s state or province.When the state code is provided the state name is returned from
     * the respective state code and name table. <br>
     * This value is not provided in the <code>CityPersistRequest</code> during the create operation. The
     * corresponding state name is determined dynamically as per the provided state code and is set in the
     * <code>CityResponse</code>.
     * <p>
     * <b>Format: </b><br>
     * 1-24 Alphabets
     * <p>
     * <b>Example: </b><br>
     * ILLINOIS
     * <p>
     * 
     * @return the curent value of <code>stateName</code> of the city. <br>
     */
    public String getStateName() {
        return this.stateName;
    }

    /**
     * Sets the list of <code>AirportDto</code>'s for a city.
     * <p>
     * 
     * @param pAirports the list of the <code>AirportDto</code> for the city.
     */
    public void setAirports(final List<AirportDto> pAirports) {
        this.airports = pAirports;
    }

    /**
     * Sets the <code>cityCode</code> property.
     * <p>
     * Indicates the IATA city code.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets(Upper Case)
     * <p>
     * <b>Example: </b><br>
     * CHI
     * <p>
     * 
     * @param pCityCode the new value of the <code>cityCode</code>.
     */
    public void setCityCode(final String pCityCode) {
        this.cityCode = ContractUtility.convertToUpperCase(pCityCode);
    }

    /**
     * Sets the list of <code>CityDSTDto</code> associated with a city .
     * <p>
     * 
     * @param pCityDSTs the new list of <code>CityDSTDto</code> associated with a city.<br>
     */
    public void setCityDSTs(final List<CityDSTDto> pCityDSTs) {
        this.cityDSTs = pCityDSTs;
    }

    /**
     * Sets the <code>cityName</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-16 Any character
     * <p>
     * <b>Example: </b><br>
     * CHICAGO
     * <p>
     * 
     * @param pCityName the new value of <code>cityName</code> of the city.
     */
    public void setCityName(final String pCityName) {
        this.cityName = pCityName;
    }

    /**
     * Sets the <code>serviceCityIndicator</code> property.
     * <p>
     * Indicates if the city is serviced by an airline or not.
     * <p>
     * <b>Possible Values:</b><br>
     * <li><code>true</code> <br>
     * City is serviced by the airline.
     * <li><code>false</code> <br>
     * City is not serviced by the airline.
     * <p>
     * 
     * @param pCityServiceIndicator the new value of <code>serviceCityIndicator</code> property.<br>
     */
    public void setCityServiceIndicator(final Boolean pCityServiceIndicator) {
        this.cityServiceIndicator = pCityServiceIndicator;
    }

    /**
     * Sets the <code>countryCode</code> property.
     * <p>
     * The country code represents the country to which the city belongs.
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
     * Sets the <code>endDate</code> of the city.
     * <p>
     * <b>Format:</b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT}
     * <p>
     * <b>Example:</b><br>
     * 30JAN2008
     * <p>
     * 
     * @param pEndDate the new value of <code>endDate</code> of the city.
     */
    public void setEndDate(final Date pEndDate) {
        this.endDate = ContractUtility.getClonedDate(pEndDate);
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>standardUTCVariation</code> property.
     * <p>
     * The Standard variation to UTC is the time value to add to UTC to get the local time for this city. It
     * is always specified in minutes.
     * <p>
     * <b>Format: </b><br>
     * HHMM where s is an optional sign (+/-), HH is hours (00-23) and MM is minutes (00-59).
     * <p>
     * <b>Example: </b><br>
     * 2300, -2310
     * <p>
     * 
     * @param pStandardUTCVariation the new value of <code>standardUTCVariation</code> of the city.<br>
     */
    public void setStandardUTCVariation(final Integer pStandardUTCVariation) {
        this.standardUTCVariation = pStandardUTCVariation;
    }

    /**
     * Gets the <code>stateCode</code> property.
     * <p>
     * The state or province abbreviation code.Mandatory for cities in US, CA, and AU prohibited otherwise.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabets(Upper Case)
     * <p>
     * <b>Example: </b><br>
     * IL
     * <p>
     * 
     * @param pStateCode the new value of <code>StateCode</code> of the city.<br>
     */
    public void setStateCode(final String pStateCode) {
        this.stateCode = ContractUtility.convertToUpperCase(pStateCode);
    }

    /**
     * Sets the <code>stateName</code> property.
     * <p>
     * Name of the city’s state or province.When the state code is provided the state name is returned from
     * the respective state code and name table. <br>
     * This value is not provided in the <code>CityPersistRequest</code> during the create operation. The
     * corresponding state name is determined dynamically as per the provided state code and is set in the
     * <code>CityResponse</code>.
     * <p>
     * <b>Format: </b><br>
     * 1-24 Alphabets
     * <p>
     * <b>Example: </b><br>
     * ILLINOIS
     * <p>
     * 
     * @param pStateName the new value of <code>stateName</code> of the city.<br>
     */
    public void setStateName(final String pStateName) {
        this.stateName = pStateName;
    }

    /**
     * Attribute to hold <code>iataNumericCode</code> property.
     */
    private Integer iataNumericCode;

    public Integer getIataNumericCode() {
        return iataNumericCode;
    }

    public void setIataNumericCode(Integer iataNumericCode) {
        this.iataNumericCode = iataNumericCode;
    }

}
