/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

import java.util.List;

/**
 * <code>CountryTaxResponse</code> contains <code>CountryTaxDto</code> object which will be sent to the web
 * client, swing client or any other client via web service.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>countryTaxes
 * </code>
 * </ul>
 */
public class CountryTaxResponse extends AbstractResponse {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -5853712000842424541L;

    /**
     * Attribute to hold <code>countryTaxes</code> property.
     */
    private List<CountryTaxDto> countryTaxes;

    /**
     * <code>Default constructor.</code>
     */
    public CountryTaxResponse() {
    }

    /**
     * Gets the value of the <code>countryTaxes</code> property.
     * <p>
     * 
     * @return the current value of the <code>countryTaxes</code> property.<br>
     */
    public List<CountryTaxDto> getCountryTaxes() {
        return this.countryTaxes;
    }

    /**
     * Sets the value of the <code>countryTaxes</code> property.
     * <p>
     * 
     * @param pCountryTaxDtos the new value of the <code>countryTaxes</code> property.<br>
     */
    public void setCountryTaxes(final List<CountryTaxDto> pCountryTaxDtos) {
        this.countryTaxes = pCountryTaxDtos;
    }
}
