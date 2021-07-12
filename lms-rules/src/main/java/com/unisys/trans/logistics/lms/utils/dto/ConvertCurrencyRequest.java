/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <code>ConvertCurrencyRequest</code> is used for convert FromCurrency code to ToCurrency code.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>amount
 * <li>billingCurrencyCode
 * <li>conversionDate
 * <li>exchangeRateTypeCode
 * <li>fromCurrencyCode
 * <li>toCurrencyCode
 * </ul>
 * </code>
 */
public class ConvertCurrencyRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -3414032124382634123L;

    /**
     * Attribute to hold the <code>amount</code> property.<br>
     */
    private BigDecimal amount;

    /**
     * Attribute to hold the <code>billingCurrencyCode</code> property.<br>
     */
    private String billingCurrencyCode;

    /**
     * Attribute to hold the <code>conversionDate</code> property.<br>
     */
    private Date conversionDate;

    /**
	/**
     * Attribute to hold the <code>defaultConversion</code> property.<br>
     */
    private boolean defaultConversion;

    /**
     * Attribute to hold the <code>exchangeRateTypeCode</code> property.<br>
     */
    private char exchangeRateTypeCode;

    /**
     * Attribute to hold the <code>fromCurrencyCode</code> property.<br>
     */
    private String fromCurrencyCode;

    /**
     * Attribute to hold the <code>currencyHierarchyInd</code> property.<br>
     * Default value 0 - B I F.<br>
     * Value 1 - B F I.<br>
     * Value 2 - I F B.<br>
     */
    private int currencyHierarchyInd;

    /**
     * Attribute to hold the <code>toCurrencyCode</code> property.<br>
     */
    private String toCurrencyCode;

    /**
     * This is the Default Constructor.
     */
    public ConvertCurrencyRequest() {

    }

    /**
     * Access method for the <code>amount</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-12 Floating Point<br>
     * <b>Example: </b><br>
     * 12.12
     * <p>
     * 
     * @return the current value of the <code>amount</code> property.
     */
    public BigDecimal getAmount() {

        return this.amount;
    }

    /**
     * Access method for the <code>getBillingCurrencyCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * USD
     * <p>
     * 
     * @return the current value of the <code>getBillingCurrencyCode</code> property.
     */
    public String getBillingCurrencyCode() {
        return this.billingCurrencyCode;
    }

    /**
     * Access method for the <code>conversionDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * See {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 07JUL07
     * <p>
     * 
     * @return the current value of the <code>conversionDate</code> property.
     */
    public Date getConversionDate() {

        return ContractUtility.getClonedDate(this.conversionDate);
    }

    /**
     * Access method for the <code>exchangeRateTypeCode</code> property.
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
     * @return the current value of the <code>exchangeRateTypeCode</code> property.<br>
     */
    public char getExchangeRateTypeCode() {

        return this.exchangeRateTypeCode;
    }

    /**
     * Access method for the <code>fromCurrencyCode</code> property.
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
     * Access method for the <code>toCurrencyCode</code> property.
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
     * Gets the <code>currencyHierarchyInd</code> property.
     * <p>
     * 
     * @return the current value of the <code>currencyHierarchyInd</code> property.
     */
    public int getCurrencyHierarchyInd() {
        return this.currencyHierarchyInd;
    }

    /**
     * Sets the value of the <code>amount</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-12 Numeric,Precision
     * <p>
     * <b>Example: </b><br>
     * 12.2
     * <p>
     * 
     * @param pAmount the new value of the <code>amount</code> property.
     */
    public void setAmount(final BigDecimal pAmount) {

        this.amount = pAmount;
    }

    /**
     * Sets the value of the <code>billingCurrencyCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * USD
     * <p>
     * 
     * @param pBillingCurrencyCode the new value of the <code>billingCurrencyCode</code> property.
     */
    public void setBillingCurrencyCode(final String pBillingCurrencyCode) {
        this.billingCurrencyCode = pBillingCurrencyCode;
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
     * Sets the <code>currencyHierarchyInd</code> property.
     * <p>
     * 
     * @param pCurrencyHierarchyInd
     *            the current value of the <code>currencyHierarchyInd</code> property.<br>
     */
    public void setCurrencyHierarchyInd(int pCurrencyHierarchyInd) {
        this.currencyHierarchyInd = pCurrencyHierarchyInd;
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
	
	 public boolean isDefaultConversion() {
		return defaultConversion;
	}

	 public void setDefaultConversion(boolean pDefaultConversion) {
		this.defaultConversion = pDefaultConversion;
	}

}
