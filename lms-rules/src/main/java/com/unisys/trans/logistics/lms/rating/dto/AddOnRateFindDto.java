/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>AddOnRateFindDto</code> contain details to retrieve AddOnRate
 * Information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>carrierCode
 * <li>currencyCode
 * <li>cityToBeConstructedCode
 * <li>cityOfConstructionCode
 * <li>iataAreaZone
 * <li>rateSourceCode
 * <li>rateTypeCode
 * </ul>
 */
public class AddOnRateFindDto extends AbstractRequest {

    /**
     * Default serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>carrierCode</code> property.
     */
    private String carrierCode;

    /**
     * Attribute to hold <code>cityOfConstructionCode</code> property.
     */
    private String cityOfConstructionCode;

    /**
     * Attribute to hold <code>cityToBeConstructedCode</code> property.
     */
    private String cityToBeConstructedCode;

    /**
     * Attribute to hold <code>currencyCode</code> property.
     */
    private String currencyCode;

    /**
     * Attribute to hold <code>iataAreaZone</code> property.
     */

    private Integer iataAreaZone;

    /**
     * Attribute to hold <code>rateSourceCode</code> property.
     */

    private String rateSourceCode;

    /**
     * Attribute to hold <code>rateTypeCode</code> property.
     */
    private String rateTypeCode;

    /**
     * Gets the <code>CarrierCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2-3 AlphaNumeric.
     * <p>
     * <b>Example: </b><br>
     * UW.
     * <p>
     * 
     * @return the current value of the <code>CarrierCode</code> property.
     */
    public String getCarrierCode() {
        return this.carrierCode;
    }

    /**
     * Gets the <code>cityOfConstructionCode</code> property.
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
     * @return the current value of <code>cityOfConstructionCode</code> of the
     *         city.<br>
     */
    public String getCityOfConstructionCode() {
        return this.cityOfConstructionCode;
    }

    /**
     * Gets the <code>cityToBeConstructedCode</code> property.
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
     * @return the current value of <code>cityToBeConstructedCode</code> of the
     *         city.<br>
     */
    public String getCityToBeConstructedCode() {
        return this.cityToBeConstructedCode;
    }

    /**
     * Gets the <code>currencyCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * USD
     * <p>
     * 
     * @return the current value of the <code>currencyCode</code> property.
     */
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * Gets the <code>iataAreaZone</code> property.
     * <p>
     * 
     * @return the current value of the <code>iataAreaZone</code> property.
     */

    public Integer getIataAreaZone() {
        return this.iataAreaZone;
    }

    /**
     * Gets the <code>RateSource</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Characters
     * <p>
     * <b>Example: </b><br>
     * IRI
     * <p>
     * 
     * @return the current value of the <code>rateSource</code> property.
     */

    public String getRateSourceCode() {
        return this.rateSourceCode;
    }

    /**
     * Gets the <code>RateTypeCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * GEN
     * <p>
     * 
     * @return the current value of the <code>rateTypeCode</code> property.
     */
    public String getRateTypeCode() {
        return this.rateTypeCode;
    }

    /**
     * Sets the <code>CarrierCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2-3 AlphaNumeric.
     * <p>
     * <b>Example: </b><br>
     * UW.
     * <p>
     * 
     * @param pCarrierCode
     *            the current value of the <code>CarrierCode</code> property.
     */

    public void setCarrierCode(final String pCarrierCode) {
        this.carrierCode = ContractUtility
                    .convertToUpperCase(pCarrierCode);
    }

    /**
     * Sets the <code>cityOfConstructionCode</code> property.
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
     * @param pCityOfConstructionCode
     *            the new value of the <code>cityOfConstructionCode</code>.
     */
    public void setCityOfConstructionCode(final String pCityOfConstructionCode) {
        this.cityOfConstructionCode = ContractUtility
                    .convertToUpperCase(pCityOfConstructionCode);
    }

    /**
     * Sets the <code>cityToBeConstructedCode</code> property.
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
     * @param pCityToBeConstructedCode
     *            the new value of the <code>cityToBeConstructedCode</code>.
     */
    public void setCityToBeConstructedCode(final String pCityToBeConstructedCode) {
        this.cityToBeConstructedCode = ContractUtility
                    .convertToUpperCase(pCityToBeConstructedCode);
    }

    /**
     * Sets the <code>CurrencyCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * USD
     * <p>
     * 
     * @param pCurrencyCode
     *            the current value of the <code>CurrencyCode</code> property.
     */
    public void setCurrencyCode(final String pCurrencyCode) {
        this.currencyCode = ContractUtility
                    .convertToUpperCase(pCurrencyCode);
    }

    /**
     * Sets the <code>iataAreaZone</code> property.
     * <p>
     * 
     * @param pIataAreaZone
     *            the current value of the <code>iataAreaZone</code> property.<br>
     */
    public void setIataAreaZone(final Integer pIataAreaZone) {
        this.iataAreaZone = pIataAreaZone;
    }

    /**
     * Sets the <code>rateSourceCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * IRI
     * <p>
     * 
     * @param pRateSourceCode
     *            the new value of the <code>rateSourceCode</code> property.
     */
    public void setRateSourceCode(final String pRateSourceCode) {
        this.rateSourceCode = ContractUtility
                    .convertToUpperCase(pRateSourceCode);
    }

    /**
     * Sets the <code>RateTypeCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * GEN
     * <p>
     * 
     * @param pRateTypeCode
     *            the current value of the <code>rateTypeCode</code> property.
     */

    public void setRateTypeCode(final String pRateTypeCode) {
        this.rateTypeCode = ContractUtility
                    .convertToUpperCase(pRateTypeCode);
    }

}
