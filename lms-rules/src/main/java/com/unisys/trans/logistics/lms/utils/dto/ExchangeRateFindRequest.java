/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.util.Date;

/**
 * <code>ExchangeRateFindRequest</code> is used for finding exchange rate information. It allows you to find
 * exchange rate information based on input.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>exchangeRateTypeCode
 * <li>fromCurrencyCode
 * <li>toCurrencyCode
 * </ul>
 * </code>
 */
public class ExchangeRateFindRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -4306011030718265182L;

    /**
     * Attribute to hold <code>effectiveDate</code> property.
     */
    private Date effectiveDate;

    /**
     * Attribute to hold the <code>exchangeRateTypeCode</code> property.
     */
    private char exchangeRateTypeCode;

    /**
     * Attribute to hold the <code>fromCurrencyCode</code> property.
     */
    private String fromCurrencyCode;

    /**
     * Attribute to hold the <code>toCurrencyCode</code> property.
     */
    private String toCurrencyCode;

    /**
     * Default constructor.
     */
    public ExchangeRateFindRequest() {

    }

    /**
     * Gets the value of <code>effectiveDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 07JUL07
     * <p>
     * 
     * @return the current value of the <code>effectiveDate</code> property.
     */
    public Date getEffectiveDate() {
        return ContractUtility.getClonedDate(this.effectiveDate);
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
     * @return the current value value of <code>exchangeRateTypeCode</code> property.
     */
    public char getExchangeRateTypeCode() {

        return this.exchangeRateTypeCode;
    }

    /**
     * Gets the value of the <code>fromCurrencyCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * USD
     * <p>
     * 
     * @return the current value of <code>fromCurrencyCode</code> property.
     */
    public String getFromCurrencyCode() {

        return this.fromCurrencyCode;
    }

    /**
     * Gets the value of the <code>toCurrencyCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * USD
     * <p>
     * 
     * @return the current value of <code>toCurrencyCode</code> property.
     */
    public String getToCurrencyCode() {

        return this.toCurrencyCode;
    }

    /**
     * Sets the value of the <code>effectiveDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 07JUL07
     * <p>
     * 
     * @param pEffectiveDate the new value of the <code>effectiveDate</code> property.
     */
    public void setEffectiveDate(final Date pEffectiveDate) {
        this.effectiveDate = ContractUtility.getClonedDate(pEffectiveDate);
    }

    /**
     * Sets the value of the <code>exchangeRateTypeCode</code> property.
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
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * USD
     * <p>
     * 
     * @param pFromCurrencyCode the new value of the <code>fromCurrencyCode</code> property.
     */
    public void setFromCurrencyCode(final java.lang.String pFromCurrencyCode) {

        this.fromCurrencyCode = ContractUtility.convertToUpperCase(pFromCurrencyCode);
    }

    /**
     * Sets the value of the <code>toCurrencyCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * USD
     * <p>
     * 
     * @param pToCurrencyCode the new value of the <code>toCurrencyCode</code> property.<br>
     */
    public void setToCurrencyCode(final String pToCurrencyCode) {

        this.toCurrencyCode = ContractUtility.convertToUpperCase(pToCurrencyCode);
    }

}
