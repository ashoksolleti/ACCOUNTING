/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * <code>CurrencyResponse </code> represents the response object of the maintenance request received by
 * <code>Currency</code>.
 * <p>
 * <code>CurrencyResponse </code> contains the following attribute:<br>
 * <ul>
 * <code>
 * <li>currencies
 * </code>
 * </ul>
 */
public class CurrencyResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -3437197141018274023L;

    // As per NG standards,elements are added one by one to the assembler which
    // eliminates the usage of a
    // setter method and thus,it is replaced by the 'addCurrency' method.
    /**
     * Attribute to hold list of <code>CurrencyDto</code> property.
     * <p>
     * The <code>CurrencyDto</code> includes currency information and its associated rounding factor
     * information.
     */
    private final List<CurrencyDto> currencies = new ArrayList<CurrencyDto>(); // NOPMD

    /**
     * <code>Default constructor.</code>
     */
    public CurrencyResponse() {

    }

    /**
     * Adds the currency information to the <code>currencies</code> property.
     * <p>
     * The currency information associated with the currency.
     * <p>
     * 
     * @param pCurrencyDto the new currency information to be added to the <code>currencies</code> property.
     */
    public void addCurrency(final CurrencyDto pCurrencyDto) {
        this.currencies.add(pCurrencyDto);
    }

    /**
     * Gets the <code>currencies</code> property.
     * <p>
     * The currency information associated with the currency.
     * <p>
     * 
     * @return the current value of <code>currencies</code> property.
     */
    public List<CurrencyDto> getCurrencies() {
        return this.currencies;
    }
}
