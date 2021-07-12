/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>CountryResponse</code> contains the response of the maintenance request received by
 * <code>CountryService</code>.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <li><code>countryDto</code></li>
 * </ul>
 */
public class CountryResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -8233818906977809959L;

    /**
     * Attribute to hold <code>country</code> property.
     * <p>
     */
    private CountryDto country;

    /**
     * <code>Default constructor</code>.
     * <p>
     */
    public CountryResponse() {

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
     * @param pCountryDto the new value of the <code>country</code>.<br>
     */
    public void setCountry(final CountryDto pCountryDto) {
        this.country = pCountryDto;
    }
    
    public List<CountryDto> countryDtos;

	public List<CountryDto> getCountryDtos() {
		return countryDtos;
	}

	public void setCountryDtos(List<CountryDto> countryDtos) {
		this.countryDtos = countryDtos;
	}


}
