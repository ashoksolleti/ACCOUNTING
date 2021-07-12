/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.io.Serializable;

import com.unisys.trans.logistics.lms.framework.constants.GeographicType;
import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto;
import com.unisys.trans.logistics.lms.utils.dto.constants.AggregateType;

/**
 * <code>GeographicDataDto</code> contain details of GeographicData.
 * <p>
 * This contains all information about GeographicData.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>countryCode
 * <li>cityCode
 * <li>stateCode
 * <li>regionCode
 * <li>countryName
 * <li>airportName
 * <li>type
 * <li>code
 * <li>currency
 * </ul>
 */
public class GeographicDataDto implements Serializable {

    /**
     * Generated serial version id.
     */
    private static final long serialVersionUID = -6199378587680581417L;

    /**
     * Attribute to hold <code>airportName</code> property.
     */
    private String airportName;

    /**
     * Attribute to hold <code>baseAggregateType</code> property.
     */
    private AggregateType baseAggregateType;

    /**
     * Attribute to hold <code>cityCode</code> property.
     */
    private String cityCode;

    /**
     * Attribute to hold <code>cityName</code> property.
     */
    private String cityName;

    /**
     * Attribute to hold <code>code</code> property.
     */
    private String code;

    /**
     * Attribute to hold <code>countryCode</code> property.
     */
    private String countryCode;

    /**
     * Attribute to hold <code>countryName</code> property.
     */
    private String countryName;

    /**
     * Attribute to hold <code>currency</code> property.
     */
    private RatingInfoDto currency;

    /**
     * Attribute to hold <code>iataAreaCode</code> property.
     * <p>
     * Represents the first character of the country’s IATA region code.<br>
     */
    private int iataAreaCode;

    /**
     * Attribute to hold <code>regionCode</code> property.
     */
    private String regionCode;
    
    /**
     * Attribute to hold <code>stateCode</code> property.
     */
    private String stateCode;

    /**
     * Attribute to hold <code>type</code> property.
     */
    private GeographicType type;

    /**
     * Attribute to hold <code>weightUnit</code> property.
     * <p>
     * Represents the weight unit used for the country.
     */
    private WeightUOMType weightUnit;

    /**
     * Default Constructor .
     */
    public GeographicDataDto() {
    }

    /**
     * Parameterized Constructor .
     * 
     * @param pCode
     *            holds the code value.
     */
    public GeographicDataDto(final String pCode) {
        this.code = pCode;
    }

    /**
     * Parameterized Constructor .
     * 
     * @param pCode
     *            holds the code value.
     * @param pGeographicType
     *            holds the geographic type value.
     */
    public GeographicDataDto(final String pCode, final GeographicType pGeographicType) {
        this.code = pCode;
        this.type = pGeographicType;
    }

    /**
     * Parameterized Constructor .
     * 
     * @param pCode
     *            holds the code value.
     * @param pGeographicType
     *            holds the geographic type value.
     * @param pAggregateType
     *            holds the aggregate type.
     */
    public GeographicDataDto(final String pCode, final GeographicType pGeographicType,
                final AggregateType pAggregateType) {
        this.code = pCode;
        this.type = pGeographicType;
        this.baseAggregateType = pAggregateType;
    }

    /**
     * Gets the <code>AirportName</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-29 Integer
     * <p>
     * <b>Example: </b><br>
     * O’HARE INTL
     * <p>
     * 
     * @return the current value of the <code>airportName</code> property.
     */
    public String getAirportName() {
        return this.airportName;
    }

    /**
     * Gets the list of<code>MemberType</code> property.
     * <p>
     * 
     * @return the current value of the <code>MemberType</code> property.
     */
    public AggregateType getBaseAggregateType() {
        return this.baseAggregateType;
    }

    /**
     * Gets the <code>CityCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabetic
     * <p>
     * <b>Example: </b><br>
     * CHI
     * <p>
     * 
     * @return the current value of the <code>cityCode</code> property.
     */
    public String getCityCode() {
        return this.cityCode;
    }

    /**
     * Gets the <code>CityName</code> property.
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
        return cityName;
    }

    /**
     * Gets the <code>Code</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabetic
     * <p>
     * <b>Example: </b><br>
     * CHI
     * <p>
     * 
     * @return the current value of the <code>code</code> property.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Gets the <code>CountryCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Numeric
     * <p>
     * <b>Example: </b><br>
     * 320
     * <p>
     * 
     * @return the current value of the <code>countryCode</code> property.
     */
    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * Gets the <code>CountryName</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-20 Text
     * <p>
     * <b>Example: </b><br>
     * Germany
     * <p>
     * 
     * @return the current value of the <code>countryName</code> property.
     */
    public String getCountryName() {
        return this.countryName;
    }

    /**
     * Gets the list of<code>Currency</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabetic
     * <p>
     * <b>Example: </b><br>
     * CAD
     * <p>
     * 
     * @return the current value of the <code>currency</code> property.
     */
    public RatingInfoDto getCurrency() {
        return this.currency;
    }

    /**
     * Gets the <code>iataAreaCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Numeric<br>
     * <p>
     * <b>Example: </b><br>
     * 48
     * <p>
     * 
     * @return the current value of the <code>iataAreaCode</code>.<br>
     */
    public int getIataAreaCode() {
        return this.iataAreaCode;
    }

    /**
     * Gets the <code>regionCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 4 AlphaNumeric
     * <p>
     * <b>Example: </b><br>
     * 3A01
     * <p>
     * 
     * @return the current value of the <code>regionCode</code> property.
     */
    public String getRegionCode() {
        return this.regionCode;
    }
    
    /**
     * Gets the <code>StateCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabetic
     * <p>
     * <b>Example: </b><br>
     * IL
     * <p>
     * 
     * @return the current value of the <code>stateCode</code> property.
     */
    public String getStateCode() {
        return this.stateCode;
    }

    /**
     * Gets the <code>Type</code> property.
     * <p>
     * <b>Example: </b><br>
     * AIRPORT,CITY,COUNTRY,AGGREGATE
     * <p>
     * 
     * @return the current value of the <code>type</code> property.
     */
    public GeographicType getType() {
        return this.type;
    }

    /**
     * Gets the <code>weightUnit</code> property.
     * <p>
     * This denotes the weight unit used for the country.
     * <p>
     * <b>Possible values</b>:
     * <ul>
     * <li>
     * <code>{@link com.unisys.trans.logistics.lms.framework.constants.WeightUOMType#KG KG}</code>
     * <li>
     * <code>{@link com.unisys.trans.logistics.lms.framework.constants.WeightUOMType#LB LB}</code>
     * </ul>
     * <p>
     * 
     * @return the current value of <code>weightUnit</code>property.
     */
    public WeightUOMType getWeightUnit() {
        return this.weightUnit;
    }

    /**
     * Sets the <code>AirportName</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-29 Integer
     * <p>
     * <b>Example: </b><br>
     * O’HARE INTL
     * <p>
     * 
     * @param pAirportName
     *            the current value of the <code>airportName</code> property.
     */
    public void setAirportName(final String pAirportName) {
        this.airportName = pAirportName;
    }

    /**
     * Sets the <code>baseAggregateType</code> property.
     * <p>
     * 
     * @param pBaseAggregateType
     *            the current value of the <code>baseAggregateType</code> property.
     */
    public void setBaseAggregateType(final AggregateType pBaseAggregateType) {
        this.baseAggregateType = pBaseAggregateType;
    }

    /**
     * Sets the <code>CityCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabetic
     * <p>
     * <b>Example: </b><br>
     * CHI
     * <p>
     * 
     * @param pCityCode
     *            the current value of the <code>cityCode</code> property.
     */
    public void setCityCode(final String pCityCode) {
        this.cityCode = pCityCode;
    }

    /**
     * Sets the <code>CityName</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-16 Any character
     * <p>
     * <b>Example: </b><br>
     * CHICAGO
     * <p>
     * 
     * @param pCityName
     *            the new value of <code>cityName</code> of the city.
     */
    public void setCityName(final String pCityName) {
        this.cityName = pCityName;
    }

    /**
     * Sets the <code>Code</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabetic
     * <p>
     * <b>Example: </b><br>
     * CHI
     * <p>
     * 
     * @param pCode
     *            the current value of the <code>code</code> property.
     */
    public void setCode(final String pCode) {
        this.code = ContractUtility.convertToUpperCase(pCode);
    }

    /**
     * Sets the <code>CountryCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Numeric
     * <p>
     * <b>Example: </b><br>
     * 320
     * <p>
     * 
     * @param pCountryCode
     *            the current value of the <code>countryCode</code> property.
     */
    public void setCountryCode(final String pCountryCode) {
        this.countryCode = pCountryCode;
    }

    /**
     * Sets the <code>CountryName</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-20 Text
     * <p>
     * <b>Example: </b><br>
     * Germany
     * <p>
     * 
     * @param pCountryName
     *            the current value of the <code>countryName</code> property.
     */
    public void setCountryName(final String pCountryName) {
        this.countryName = pCountryName;
    }

    /**
     * Sets the list of<code>Currency</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabetic
     * <p>
     * <b>Example: </b><br>
     * CAD
     * <p>
     * 
     * @param pCurrency
     *            the current value of the <code>currency</code> property.
     */
    public void setCurrency(final RatingInfoDto pCurrency) {
        this.currency = pCurrency;
    }

    /**
     * Sets the <code>iataAreaCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Numeric <br>
     * <p>
     * <b>Example: </b><br>
     * 2
     * <p>
     * 
     * @param pIataAreaCode
     *            the new value of the <code>iataAreaCode</code> property.<br>
     */
    public void setIataAreaCode(final int pIataAreaCode) {
        this.iataAreaCode = pIataAreaCode;
    }

    /**
     * Sets the <code>regionCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 4 AlphaNumric
     * <p>
     * <b>Example: </b><br>
     * 3A01
     * <p>
     * 
     * @param pRegionCode
     *            the current value of the <code>regionCode</code> property.
     */
    public void setRegionCode(final String pRegionCode) {
        this.regionCode = pRegionCode;
    }
    
    /**
     * Sets the <code>StateCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabetic
     * <p>
     * <b>Example: </b><br>
     * IL
     * <p>
     * 
     * @param pStateCode
     *            the current value of the <code>stateCode</code> property.
     */
    public void setStateCode(final String pStateCode) {
        this.stateCode = pStateCode;
    }

    /**
     * Sets the <code>Type</code> property.
     * <p>
     * <b>Example: </b><br>
     * AIRPORT,CITY,COUNTRY,AGGREGATE
     * <p>
     * 
     * @param pType
     *            the current value of the <code>type</code> property.
     */
    public void setType(final GeographicType pType) {
        this.type = pType;
    }

    /**
     * Sets the <code>weightUnit</code> property.
     * <p>
     * This is the weight unit used for the country.
     * <p>
     * <b>Possible values</b>:
     * <ul>
     * <li>
     * <code>{@link com.unisys.trans.logistics.lms.framework.constants.WeightUOMType#KG KG}</code>
     * <li>
     * <code>{@link com.unisys.trans.logistics.lms.framework.constants.WeightUOMType#LB LB}</code>
     * </ul>
     * <p>
     * 
     * @param pWeightUnit
     *            the new value of the <code>weightUnit</code> property.
     */
    public void setWeightUnit(final WeightUOMType pWeightUnit) {
        this.weightUnit = pWeightUnit;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    /**
     * {@inheritDoc}
     * 
     */
    @Override
    public String toString() {
        return "GeographicDataDto [airportName=" + airportName
                    + ", baseAggregateType=" + baseAggregateType + ", cityCode="
                    + cityCode + ", cityName=" + cityName + ", code=" + code
                    + ", countryCode=" + countryCode + ", countryName="
                    + countryName + ", currency=" + currency + ", iataAreaCode="
                    + iataAreaCode + ", stateCode=" + stateCode + ", type=" + type
                    + ", weightUnit=" + weightUnit + "]";
    }

}
