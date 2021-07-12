/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <code>ConvertCurrencyDto</code> contains specific data applicable to the convert currency.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>amount
 * <li>conversionDate
 * <li>convertedAmount
 * <li>exchangeRateTypeCode
 * <li>fromCurrencyCode
 * <li>toCurrencyCode
 * </ul>
 * </code>
 */
public class ConvertCurrencyDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -5399979233620970925L;

    /**
     * Attribute to hold the <code>amount</code> property.<br>
     */
    private BigDecimal amount;

    /**
     * Attribute to hold the <code>conversionDate</code> property.<br>
     */
    private Date conversionDate;

    /**
     * Attribute to hold the <code>convertedAmount</code> property.<br>
     */
    private BigDecimal convertedAmount;

    /**
     * Attribute to hold the <code>exchangeRateTypeCode</code> property.<br>
     */
    private char exchangeRateTypeCode;

    /**
     * Attribute to hold the <code>fromCurrencyCode</code> property.<br>
     */
    private String fromCurrencyCode;

    /**
     * Attribute to hold the <code>toCurrencyCode</code> property.<br>
     */
    private String toCurrencyCode;

    /**
     * This is the Default Constructor.
     */
    public ConvertCurrencyDto() {

    }

    /**
     * Gets the value of the <code>amount</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-12 Floating Point
     * <p>
     * <b>Example: </b><br>
     * 12.12
     * <p>
     * 
     * @return Returns the current value of the <code>amount</code> property.<br>
     */
    public BigDecimal getAmount() {

        return this.amount;
    }

    /**
     * Gets the value of the <code>conversionDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * See {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 07JUL07
     * <p>
     * 
     * @return the current value of the <code>conversionDate</code> property.<br>
     */
    public Date getConversionDate() {

        return ContractUtility.getClonedDate(this.conversionDate);
    }

    /**
     * Gets the value of the <code>convertedAmount</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-12 Floating Point
     * <p>
     * <b>Example: </b><br>
     * 12.12
     * <p>
     * 
     * @return the current value of the <code>convertedAmount</code> property.<br>
     */
    public BigDecimal getConvertedAmount() {

        return this.convertedAmount;
    }

    /**
     * Gets the value of the <code>exchangeRateTypeCode</code> property.
     * <p>
     * <ul>
     * <b>Possible values:</b>
     * <li><code>B</code><br>
     * Bank Selling Rate<br>
     * <li><code>I</code><br>
     * IATA Rating Exchange rate<br>
     * <li><code>F</code><br>
     * IATA Five day Exchange rate<br>
     * </ul>
     * <p>
     * 
     * @return the current value of the <code>exchangeRateTypeCode</code> property.
     */
    public char getExchangeRateTypeCode() {

        return this.exchangeRateTypeCode;
    }

    /**
     * Gets the value of the <code>fromCurrencyCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * USD
     * <p>
     * 
     * @return the current value of the <code>fromCurrencyCode</code> property.
     */
    public String getFromCurrencyCode() {

        return this.fromCurrencyCode;
    }

    /**
     * Gets the value of the <code>toCurrencyCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * USD
     * <p>
     * 
     * @return the current value of the <code>toCurrencyCode</code> property.
     */
    public String getToCurrencyCode() {

        return this.toCurrencyCode;
    }

    /**
     * Sets the value of the <code>amount</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-12 Floating Point
     * <p>
     * <b>Example: </b><br>
     * 12.12
     * <p>
     * 
     * @param pAmount the new value of the <code>amount</code> property.
     */
    public void setAmount(final BigDecimal pAmount) {
        this.amount = pAmount;
    }

    /**
     * Sets the value of the <code>conversionDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * See {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 07JUL07
     * <p>
     * 
     * @param pConversionDate the new value of the <code>conversionDate</code> property.
     */
    public void setConversionDate(final Date pConversionDate) {
        this.conversionDate = ContractUtility.getClonedDate(pConversionDate);
    }

    /**
     * Sets the value of the <code>convertedAmount</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-12 Floating Point
     * <p>
     * <b>Example: </b><br>
     * 12.12
     * <p>
     * 
     * @param pConvertedAmount the new value of the <code>convertedAmount</code> property.
     */
    public void setConvertedAmount(final BigDecimal pConvertedAmount) {
        this.convertedAmount = pConvertedAmount;
    }

    /**
     * Sets the value of the <code>uldPrefix</code> property.
     * <p>
     * <ul>
     * <b>Possible values:</b>
     * <li><code>B</code><br>
     * Bank Selling Rate<br>
     * <li><code>I</code><br>
     * IATA Rating Exchange rate<br>
     * <li><code>F</code><br>
     * IATA Five day Exchange rate<br>
     * </ul>
     * <p>
     * 
     * @param pExchangeRateTypeCode the new value of the <code>exchangeRateTypeCode</code> property.
     */
    public void setExchangeRateTypeCode(final char pExchangeRateTypeCode) {
        this.exchangeRateTypeCode = pExchangeRateTypeCode;
    }

    /**
     * Sets the value of the <code>fromCurrencyCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * USD
     * <p>
     * 
     * @param pFromCurrencyCode the new value of the <code>fromCurrencyCode</code> property.
     */
    public void setFromCurrencyCode(final String pFromCurrencyCode) {

        this.fromCurrencyCode = ContractUtility.convertToUpperCase(pFromCurrencyCode);
    }

    /**
     * Sets the value of the <code>toCurrencyCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * USD
     * <p>
     * 
     * @param pToCurrencyCode the new value of the <code>toCurrencyCode</code> property.
     */
    public void setToCurrencyCode(final String pToCurrencyCode) {

        this.toCurrencyCode = ContractUtility.convertToUpperCase(pToCurrencyCode);
    }
}
