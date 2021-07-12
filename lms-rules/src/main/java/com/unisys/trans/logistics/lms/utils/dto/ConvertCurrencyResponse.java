/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>ConvertCurrencyResponse</code> contains the response of the maintenance request received by
 * ExchangeRateService.
 * <p>
 * This contains the following attribute:<br>
 * <ul>
 * <li><code>convertCurrency</code>
 * </ul>
 */
public class ConvertCurrencyResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -2292835445920460162L;

    /**
     * Attribute to hold the <code>convertCurrency</code> property.<br>
     */
    private ConvertCurrencyDto convertCurrency;

    /**
     * Default constructor.
     */
    public ConvertCurrencyResponse() {

    }

    /**
     * Gets the <code>convertCurrency</code> proeprty.
     * <p>
     * 
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.ConvertCurrencyDto ConvertCurrencyDto}
     *         </code><br>
     *         the current value of <code>convertCurrency</code> property.
     */
    public ConvertCurrencyDto getConvertCurrency() {

        return this.convertCurrency;
    }

    /**
     * Sets the <code>convertCurrency</code> proeprty.
     * <p>
     * 
     * @param pConvertCurrency <code> {@link com.unisys.trans.logistics.lms.utils.dto.ConvertCurrencyDto
     *            ConvertCurrencyDto}</code><br>
     *            the new value of <code>convertCurrency</code> property.
     */
    public void setConvertCurrency(final ConvertCurrencyDto pConvertCurrency) {

        this.convertCurrency = pConvertCurrency;
    }
}
