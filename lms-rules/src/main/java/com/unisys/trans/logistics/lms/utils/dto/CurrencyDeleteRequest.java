/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>CurrencyDeleteRequest</code> class represents the request to delete the currency information.
 * <p>
 * <code>EndDate</code> is required to update the PFM and mark the currency as deleted. The currency code is
 * not deleted but is marked for deletion. Currency marked for deletion can be retrieved but not updated when
 * the end date exists.
 * <p>
 * <code>CurrencyDeleteRequest</code> holds the following attribute:
 * <ul>
 * <code>
 * <li>currency
 * </code>
 * </ul>
 */
public class CurrencyDeleteRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -7315931848479446645L;

    /**
     * Attribute to hold <code>currency</code> property.
     * <p>
     * The <code>CurrencyDto</code> includes the currency information and its associated rounding factor
     * information.
     */
    private CurrencyDto currency;

    /**
     * <code>Default constructor.</code>
     */
    public CurrencyDeleteRequest() {

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
