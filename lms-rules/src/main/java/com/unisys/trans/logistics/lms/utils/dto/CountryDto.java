/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>CountryDto</code> contains specific data applicable to the country, customs and rating information.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>code
 * <li>customsInfo
 * <li>embargoNumber
 * <li>iataAreaCode
 * <li>iataAreaName
 * <li>iataRegionCode
 * <li>iataRegionName
 * <li>iataSubareaCode
 * <li>iataSubareaName
 * <li>name
 * <li>numericCode
 * <li>oId
 * <li>ratingInfo
 * <li>weightUnit
 * </code>
 * </ul>
 */
public class CountryDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -9084357602900740479L;

    /**
     * Attribute to hold <code>code</code> property.
     * <p>
     * Represents the Country code which is required to retrieve country information.<br>
     */
    private String code;

    /**
     * Attribute to hold <code>customsInfoDto</code> property.
     * <p>
     * Represents the <code>CustomsInfoDto</code> object which holds all the attributes that constitutes the
     * custom information.<br>
     */
    private CustomsInfoDto customsInfo;

    /**
     * Attribute to hold <code>embargoNumber</code> property.
     * <p>
     * Represents the Embargo number.<br>
     */
    private String embargoNumber;

    /**
     * Attribute to hold <code>iataAreaCode</code> property.
     * <p>
     * Represents the first character of the country’s IATA region code.<br>
     */
    private int iataAreaCode;

    /**
     * Attribute to hold <code>iataAreaName</code> property.
     * <p>
     * Represents the IATA area name.<br>
     */
    private String iataAreaName;

    /**
     * Attribute to hold <code>iataRegionCode</code> property.
     * <p>
     * Represents the IATA region code. The first 2 characters of IATA region code must be the same as the
     * country's IATA Sub area Code as they denote the sub area of the region.<br>
     */
    private String iataRegionCode;

    /**
     * Attribute to hold <code>iataRegionName</code> property.
     * <p>
     * Represent the IATA region name.<br>
     */
    private String iataRegionName;

    /**
     * Attribute to hold <code>iataSubareaCode</code> property.
     * <p>
     * Represents the first two characters of the country’s IATA region code. <br>
     */
    private String iataSubAreaCode;

    /**
     * Attribute to hold <code>iataSubareaName</code> property.
     * <p>
     * Represents the IATA sub area name.
     */
    private String iataSubAreaName;

    /**
     * Attribute to hold <code>name</code> property.
     * <p>
     * Represents the name of the country.<br>
     */
    private String name;

    /**
     * Attribute to hold <code>numericCode</code> property.
     * <p>
     * Represents the ISO code of the country. This code must be unique for each country.<br>
     */
    private int numericCode;

    /**
     * Attribute to hold <code>oId</code> property.
     * <p>
     * Unique key identify the <code>AirWaybillDto</code>.It is of type Long. <br>
     */
    private Long oId;

    /**
     * Attribute to hold <code>RatingInfoDto</code> property.
     * <p>
     * Represents the <code>RatingInfoDto</code> object which holds all the attributes that are specific to an
     * rating information.<br>
     */
    private RatingInfoDto ratingInfo;

    /**
     * Attribute to hold <code>weightUnit</code> property.
     * <p>
     * Represents the weight unit used for the country.
     */
    private WeightUOMType weightUnit;
    
    private Boolean eAwbMultilateral;

    /**
     * <code>Default constructor.</code>
     */
    public CountryDto() {

    }

    /**
     * Constructor with country code as an argument.
     * <p>
     * 
     * @param pCode the new value the <code>countryCode</code>.<br>
     */
    public CountryDto(final String pCode) {
        this.code = pCode;
    }

    /**
     * Constructor with country code and oId as an argument.
     * <p>
     * 
     * @param pCode the new value the <code>countryCode</code>.<br>
     * @param pOId the new value the <code>oId</code>.<br>
     * @param pIATARegionCode the new value the <code>iataRegionCode</code>.<br>
     */
    public CountryDto(final String pCode, final Long pOId, final String pIATARegionCode) {
        this.code = pCode;
        this.oId = pOId;
        this.iataRegionCode = pIATARegionCode;
    }

    /**
     * Constructor with country code, name, iata region code, area, local currency code and billing currency
     * code as an argument.
     * <p>
     * <p>
     * 
     * @param pCode the new value the <code>countryCode</code>.<br>
     * @param pOId the new value the <code>oId</code>.<br>
     * @param pName the new value the <code>name</code>.<br>
     * @param pIATARegionCode the new value the <code>iataRegionCode</code>.<br>
     * @param pArea the new value the <code>area</code>.<br>
     * @param pLocalCurrencyCode the new value the <code>localCurrencyCode</code>.<br>
     * @param pBillingCurrencyCode the new value the <code>billingCurrencyCode</code>.<br>
     * @param pAutomatedImportIndicator the new value the <code>automatedImportIndicator</code>.<br>
     */

    public CountryDto(final String pCode, final Long pOId, final String pName, final String pIATARegionCode,
                final String pArea, final String pLocalCurrencyCode, final String pBillingCurrencyCode,
                final boolean pAutomatedImportIndicator, final Boolean pEAwbMultilateral) {
        this.code = pCode;
        this.oId = pOId;
        this.name = pName;
        this.iataRegionCode = pIATARegionCode;
        this.customsInfo = new CustomsInfoDto();
        this.customsInfo.setArea(pArea);
        this.customsInfo.setAutomatedImportIndicator(pAutomatedImportIndicator);
        this.ratingInfo = new RatingInfoDto();
        this.ratingInfo.setBillingCurrencyCode(pBillingCurrencyCode);
        this.ratingInfo.setLocalCurrencyCode(pLocalCurrencyCode);
        this.eAwbMultilateral = pEAwbMultilateral;
    }

    /**
     * Gets the <code>code</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * DE
     * <p>
     * 
     * @return the current value of the <code>code</code> property.<br>
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Gets the value of the <code>customsInfo</code> object.
     * <p>
     * 
     * @return the current value of the <code>CustomsInfoDto</code>.
     */
    public CustomsInfoDto getCustomsInfo() {
        return this.customsInfo;
    }

    /**
     * Gets the <code>embargoNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric<br>
     * <p>
     * <b>Example: </b><br>
     * A23
     * <p>
     * 
     * @return the current value of the <code>embargoNumber</code>.
     */
    public String getEmbargoNumber() {
        return this.embargoNumber;
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
     * Gets the <code>iataAreaName</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Alphanumeric<br>
     * <p>
     * <b>Example: </b><br>
     * ZONE2
     * <p>
     * 
     * @return the current value of the <code>iataAreaName</code>.<br>
     */
    public String getIataAreaName() {
        return this.iataAreaName;
    }

    /**
     * Gets the <code>iataRegionCode</code> property.
     * <p>
     * Represents the IATA region code. The first 2 characters of IATA region code must be the same as the
     * country's IATA Sub area Code as they denote the sub area of the region.<br>
     * <p>
     * <b>Format: </b><br>
     * 4 Alphanumeric (1N+1A+2N)<br>
     * <p>
     * <b>Example: </b><br>
     * 2A04
     * <p>
     * 
     * @return the current value of the <code>iataRegionCode</code>.<br>
     */
    public String getIataRegionCode() {
        return this.iataRegionCode;
    }

    /**
     * Gets the <code>iataRegionName</code> property.
     * <p>
     * Represent the IATA region name
     * <p>
     * <b>Format: </b><br>
     * 1-36 Alphanumeric, hyphen (-), and period (.) including spaces
     * <p>
     * <b>Example: </b><br>
     * SOUTH EUROPE
     * <p>
     * 
     * @return the current value of the <code>iataRegionName</code>.<br>
     */
    public String getIataRegionName() {
        return this.iataRegionName;
    }

    /**
     * Gets the <code>iataSubareaCode</code> property.
     * <p>
     * Represents the first two characters of the country’s IATA region code.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * 2A
     * <p>
     * 
     * @return the current value of the <code>iataSubareaCode</code>.<br>
     */
    public String getIataSubAreaCode() {
        return this.iataSubAreaCode;
    }

    /**
     * Gets the <code>iataSubareaName</code> property.
     * <p>
     * Represents the IATA sub area name.
     * <p>
     * <b>Format: </b><br>
     * 1-18 Alphabetic<br>
     * <p>
     * <b>Example: </b><br>
     * EUROPE
     * <p>
     * 
     * @return the current value of <code>iataSubareaName</code>.<br>
     */
    public String getIataSubAreaName() {
        return this.iataSubAreaName;
    }

    /**
     * Gets the <code>countryName</code> attribute.
     * <p>
     * <b>Format: </b><br>
     * 1-20 Alphanumeric, hyphen (-), and period (.) including spaces
     * <p>
     * <b>Example: </b><br>
     * Germany
     * <p>
     * 
     * @return the current value of country name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the <code>countryNumericCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Numeric<br>
     * <p>
     * <b>Example: </b><br>
     * 320
     * <p>
     * 
     * @return the current value of <code>numericCode</code> <br>
     */
    public int getNumericCode() {
        return this.numericCode;
    }

    /**
     * Get the <code>oid</code> property.
     * <p>
     * 
     * @return the current value of <code>oId</code>.<br>
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>ratingInfo</code> objects.
     * <p>
     * 
     * @return the current value of <code>ratingInfo</code> property.<br>
     */
    public RatingInfoDto getRatingInfo() {
        return this.ratingInfo;
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
     * Sets the <code>code</code> property.
     * <p>
     * Country code is required to retrieve the country information. It is mandatory and the size is limited
     * to 2 alphabets.e.g.: DE.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabetic<br>
     * <p>
     * <b>Example: </b><br>
     * DE
     * <p>
     * 
     * @param pCode the new value of the <code>code</code> property.<br>
     */
    public void setCode(final String pCode) {

        this.code = ContractUtility.convertToUpperCase(pCode);
    }

    /**
     * Sets the <code>customsInfo</code> property.
     * <p>
     * 
     * @param pCustoms the new value of the <code>customsInfo</code> property.<br>
     */
    public void setCustomsInfo(final CustomsInfoDto pCustoms) {
        this.customsInfo = pCustoms;
    }

    /**
     * Sets the <code>embargoNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric<br>
     * <p>
     * <b>Example: </b><br>
     * A23
     * <p>
     * 
     * @param pEmbargoNumber the new value of the <code>embargoNumber</code> property.<br>
     */
    public void setEmbargoNumber(final String pEmbargoNumber) {
        this.embargoNumber = pEmbargoNumber;
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
     * @param pIataAreaCode the new value of the <code>embargoNumber</code> property.<br>
     */
    public void setIataAreaCode(final int pIataAreaCode) {
        this.iataAreaCode = pIataAreaCode;
    }

    /**
     * Sets the <code>iataAreaName</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Alphanumeric<br>
     * <p>
     * <b>Example: </b><br>
     * ZONE2
     * <p>
     * 
     * @param pIataAreaName the new value of the <code>embargoNumber</code> property.<br>
     */
    public void setIataAreaName(final String pIataAreaName) {

        this.iataAreaName = ContractUtility.convertToUpperCase(pIataAreaName);

    }

    /**
     * Sets the <code>iataRegionCode</code> property.
     * <p>
     * The first 2 characters must be the same as the country's IATA Sub area Code. It is mandatory and the
     * size is limited to 4 alphanumeric characters. e.g:2A04.
     * <p>
     * <b>Format: </b><br>
     * 4 Alphanumeric (1N+1A+2N)
     * <p>
     * <b>Example: </b><br>
     * 2A04
     * <p>
     * 
     * @param pIataRegionCode the new value of the <code>iataRegionCode</code> property.<br>
     */
    public void setIataRegionCode(final String pIataRegionCode) {

        this.iataRegionCode = ContractUtility.convertToUpperCase(pIataRegionCode);
    }

    /**
     * Sets the <code>iataRegionName</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-36 Alphanumeric, hyphen (-), and period (.) including spaces<br>
     * <p>
     * <b>Example: </b><br>
     * SOUTH EUROPE
     * <p>
     * 
     * @param pIataRegionName the new value of the <code>iataRegionName</code> property.<br>
     */
    public void setIataRegionName(final String pIataRegionName) {

        this.iataRegionName = ContractUtility.convertToUpperCase(pIataRegionName);
    }

    /**
     * Sets the <code>iataSubAreaCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphanumeric<br>
     * <p>
     * <b>Example: </b><br>
     * 2A
     * <p>
     * 
     * @param pIataSubAreaCode the new value of the <code>iataSubAreaCode</code> property.<br>
     */
    public void setIataSubAreaCode(final String pIataSubAreaCode) {

        this.iataSubAreaCode = ContractUtility.convertToUpperCase(pIataSubAreaCode);
    }

    /**
     * Sets the <code>iataSubAreaName</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-18 Alphabetic<br>
     * <p>
     * <b>Example: </b><br>
     * EUROPE
     * <p>
     * 
     * @param pIataSubAreaName the new value of the <code>iataSubAreaName</code> property.<br>
     */
    public void setIataSubAreaName(final String pIataSubAreaName) {

        this.iataSubAreaName = ContractUtility.convertToUpperCase(pIataSubAreaName);
    }

    /**
     * Sets the <code>name</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-20 Alphanumeric, hyphen (-), and period (.) including spaces<br>
     * <p>
     * <b>Example: </b><br>
     * GERMANY
     * <p>
     * 
     * @param pName the new value of the <code>name</code> property.<br>
     */
    public void setName(final String pName) {
        this.name = pName;
    }

    /**
     * Sets the <code>numericCode</code> property.
     * <p>
     * This is the ISO code of the country. This code must be unique for each country.
     * <p>
     * <b>Format: </b><br>
     * 3 Numeric<br>
     * <p>
     * <b>Example: </b><br>
     * 320
     * <p>
     * 
     * @param pNumericCode the new value of the <code>numericCode</code> property.<br>
     */
    public void setNumericCode(final int pNumericCode) {
        this.numericCode = pNumericCode;
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
     * Sets the <code>ratingInfo</code> property.
     * <p>
     * 
     * @param pRating the new value of the <code>ratingInfo</code> property.<br>
     */
    public void setRatingInfo(final RatingInfoDto pRating) {
        this.ratingInfo = pRating;
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
     * @param pWeightUnit the new value of the <code>weightUnit</code> property.
     */
    public void setWeightUnit(final WeightUOMType pWeightUnit) {
        this.weightUnit = pWeightUnit;
    }

	public Boolean geteAwbMultilateral() {
		return eAwbMultilateral;
	}

	public void seteAwbMultilateral(Boolean eAwbMultilateral) {
		this.eAwbMultilateral = eAwbMultilateral;
	}

    //UIS157
    /**
     * Constructor with country code and oId as an argument.
     * <p>
     *
     * @param pCode
     *            the new value the <code>countryCode</code>.<br>
     * @param pOId
     *            the new value the <code>oId</code>.<br>
     * @param pIATARegionCode
     *            the new value the <code>iataRegionCode</code>.<br>
     */
    public CountryDto(final String pCode, final Long pOId,
                      final String pIATARegionCode, final String pName) {
        this.code = pCode;
        this.oId = pOId;
        this.iataRegionCode = pIATARegionCode;
        this.name = pName;
    }
    //UIS157
}
