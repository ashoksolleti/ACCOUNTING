/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <code>ExchangeRateDto</code> contains specific data applicable to the exchange rate.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>effectiveDate
 * <li>endDate
 * <li>exchangeRate
 * <li>exchangeRateTypeCode
 * <li>fromCurrencyCode
 * <li>toCurrencyCode
 * </ul>
 * </code>
 */
public class ExchangeRateDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 7156602906868921752L;

    /**
     * Attribute to hold <code>effectiveDate</code> property.
     */
    private Date effectiveDate;

    /**
     * Attribute to hold <code>endDate</code> property.
     */
    private Date endDate;

    /**
     * Attribute to hold <code>exchangeRate</code> property.
     */
    private BigDecimal exchangeRate;

    /**
     * Attribute to hold <code>exchangeRateTypeCode</code> property.
     */
    private char exchangeRateTypeCode;

    /**
     * Attribute to hold <code>fromCurrencyCode</code> property.
     */
    private String fromCurrencyCode;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>toCurrencyCode</code> property.
     */
    private String toCurrencyCode;

    /**
     * This is the default constructor.
     */
    public ExchangeRateDto() {

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
     * Gets the value of the <code>endDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 07JUL07
     * <p>
     * 
     * @return the current value of the <code>endDate</code> property.
     */
    public Date getEndDate() {

        return ContractUtility.getClonedDate(this.endDate);
    }

    /**
     * Gets the value of the <code>exchangeRate</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-8 Floating Point
     * <p>
     * <b>Example: </b><br>
     * 23.456
     * <p>
     * 
     * @return the current value of the <code>exchangeRate</code> property.
     */
    public BigDecimal getExchangeRate() {

        return this.exchangeRate;
    }

    /**
     * Gets the value of the <code>exchangeRateTypeCode</code> property.
     * <p>
     * <b>Possible values:</b>
     * <ul>
     * <li><code>B</code><br>
     * Bank Selling Rate<br>
     * <li><code>I</code><br>
     * IATA Rating Exchange rate<br>
     * <li><code>F</code><br>
     * IATA Five day Exchange rate<br>
     * </ul>
     * <p>
     * 
     * @return Returns the current value of the <code>exchangeRateTypeCode</code> property.
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
     * @return the current value of the <code>fromCurrencyCode</code> property.
     */
    public String getFromCurrencyCode() {

        return this.fromCurrencyCode;
    }

    /**
     * Gets the value of <code>oId</code> property.
     * <p>
     * 
     * @return Returns the current value of the OID property.<br>
     */
    @Override
    public Long getOId() {

        return this.oId;
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
     * Sets the value of the <code>endDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT DATEFORMAT} <br>
     * <b>Example: </b><br>
     * 07JUL07
     * <p>
     * 
     * @param pEndDate the new value of the <code>endDate</code> property.
     */
    public void setEndDate(final Date pEndDate) {

        this.endDate = ContractUtility.getClonedDate(pEndDate);
    }

    /**
     * Sets the value of the <code>exchangeRate</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-8 BigDecimal
     * <p>
     * <b>Example: </b><br>
     * 20.3
     * <p>
     * 
     * @param pExchangeRate the new value of the <code>exchangeRate</code> property.
     */
    public void setExchangeRate(final BigDecimal pExchangeRate) {

        this.exchangeRate = pExchangeRate;
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
    public void setFromCurrencyCode(final String pFromCurrencyCode) {

        this.fromCurrencyCode = ContractUtility.convertToUpperCase(pFromCurrencyCode);
    }

    /**
     * Sets the value of the oId property.
     * <p>
     * 
     * @param pOId the new value of the oId property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
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
     * @param pToCurrencyCode the new value of the <code>toCurrencyCode</code> property.
     */
    public void setToCurrencyCode(final String pToCurrencyCode) {

        this.toCurrencyCode = ContractUtility.convertToUpperCase(pToCurrencyCode);
    }

}
