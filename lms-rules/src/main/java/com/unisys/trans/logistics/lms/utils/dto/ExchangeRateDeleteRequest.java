/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>ExchangeRateDeleteRequest</code> contains the input attributes those are used for deleting the
 * exchange rate.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>exchangeRateTypeCode
 * <li>fromCurrencyCode
 * <li>toCurrencyCode
 * <li>oId
 * </ul>
 * </code>
 */
public class ExchangeRateDeleteRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -3924588195890485541L;

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
     * Attribute to hold <code>version</code> property.
     */
    private Long version;

    /**
     * Default constructor.
     */
    public ExchangeRateDeleteRequest() {

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
     * @return the current value of<code>exchangeRateTypeCode</code> property.
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
     * Gets the value of <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the OID property.
     */
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
     * @return the <code>toCurrencyCode</code> property.
     */
    public String getToCurrencyCode() {

        return this.toCurrencyCode;
    }

    /**
     * Gets the value of <code>version</code> property.
     * <p>
     * 
     * @return the current value of the version property.
     */
    public Long getVersion() {
        return this.version;
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
     * 3 Alphabet <br>
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
     * @param pOId the new value of the OID property.
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

    /**
     * Sets the value of the <code>version</code> property.
     * <p>
     * 
     * @param pVersion the new value of the version property.
     */
    public void setVersion(final Long pVersion) {
        this.version = pVersion;
    }
}
