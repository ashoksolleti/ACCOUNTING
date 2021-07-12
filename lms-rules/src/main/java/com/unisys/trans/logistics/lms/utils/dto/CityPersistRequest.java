/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>CityPersistRequest</code> is used for creating and updating the <code>City</code>.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>city</code>
 * </ul>
 */
public class CityPersistRequest extends AbstractRequest {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 5723326923405927011L;

    /**
     * Attribute to hold the <code>city</code> property.
     */
    private CityDto city;

    /**
     * <code>Default constructor.</code>
     */
    public CityPersistRequest() {

    }

    /**
     * Gets the <code>city</code> property.
     * <p>
     * 
     * @return the current value of <code>CityDto</code>.
     */
    public CityDto getCity() {
        return this.city;
    }

    /**
     * Sets the <code>CityDto</code> property.
     * <p>
     * 
     * @param pCityDto the new value of <code>CityDto</code>.
     */
    public void setCity(final CityDto pCityDto) {
        this.city = pCityDto;
    }
}
