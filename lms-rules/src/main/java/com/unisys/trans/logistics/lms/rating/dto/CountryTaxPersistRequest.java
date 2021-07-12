/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>CountryTaxPersistRequest</code> contains CountryTaxDto which is to be persisted.
 * <p>
 * This contains the following attribute:
 * <ul>
 * <code>
 * <li>countryTax
 * </code>
 * </ul>
 */
public class CountryTaxPersistRequest extends AbstractRequest {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 898760168418542017L;

    /**
     * Attribute to hold <code>countryTax</code> property.
     */
    private CountryTaxDto countryTax;

    /**
     * <code>Default constructor.</code>
     */
    public CountryTaxPersistRequest() {

    }

    /**
     * Gets the value of the <code>countryTax</code> property.
     * <p>
     * 
     * @return the current value of the <code>countryTax</code> property.<br>
     */
    public CountryTaxDto getCountryTax() {
        return this.countryTax;
    }

    /**
     * Sets the value of the <code>countryTax</code> property.
     * <p>
     * 
     * @param pCountryTaxDto the new value of the <code>countryTax</code> property.<br>
     */
    public void setCountryTax(final CountryTaxDto pCountryTaxDto) {
        this.countryTax = pCountryTaxDto;
    }
}
