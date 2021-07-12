/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>CountryPersistRequest</code> contains all the details used to create/update country information .
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <li><code>countryDto</code></li>
 * </ul>
 */
public class CountryPersistRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -235116200480999588L;

    /**
     * Attribute to hold <code>CountryDto.</code>
     */
    private CountryDto country;

    /**
     * <code>Default Constructor</code>.
     * <p>
     */
    public CountryPersistRequest() {

    }

    /**
     * Gets the <code>country</code> property.
     * <p>
     * 
     * @return the current value of the <code>country</code> property.<br>
     */
    public CountryDto getCountry() {
        return this.country;
    }

    /**
     * Sets the <code>country</code> property.
     * <p>
     * 
     * @param pCountryDto the new value of the <code>country</code> property.<br>
     */
    public void setCountry(final CountryDto pCountryDto) {
        this.country = pCountryDto;
    }

}
