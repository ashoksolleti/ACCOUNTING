/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>CurrencyRestoreRequest</code> class represents the request to restore the currency information.
 * <p>
 * <code>CurrencyRestoreRequest</code> holds the following attribute:
 * <ul>
 * <code>
 * <li>currency
 * </code>
 * </ul>
 */
public class CurrencyRestoreRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -2260836328653812307L;

    /**
     * Attribute to hold <code>currency</code> property.
     * <p>
     * The <code>CurrencyDto</code> includes currency information and its associated rounding factor
     * information.
     */
    private CurrencyDto currency;

    /**
     * <code>Default constructor.</code>
     */
    public CurrencyRestoreRequest() {

    }

    /**
     * Gets the <code>currency</code> property.
     * <p>
     * Represents the <code>CurrencyDto</code> which holds all the attributes that are specific to currency.
     * <p>
     * 
     * @return the current value of the <code>currency</code> property.
     */
    public CurrencyDto getCurrency() {
        return this.currency;
    }

    /**
     * Sets the <code>currency</code> property.
     * <p>
     * Represents the <code>CurrencyDto</code> which holds all the attributes that are specific to currency.
     * <p>
     * 
     * @param pCurrencyDto the new value of the <code>currency</code> property.<br>
     */
    public void setCurrency(final CurrencyDto pCurrencyDto) {
        this.currency = pCurrencyDto;
    }
}
