/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * <code>CityResponse</code> contains the response of the maintenance request received by
 * <code>CityService</code>.
 * <p>
 * This contains the following attribute:<br>
 * <ul>
 * <li><code>cities</code>
 * </ul>
 */
public class CityResponse extends AbstractResponse {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -8305955872963878036L;

    /**
     * Attribute to hold <code>cities</code>.
     * <p>
     * Refers to a collection/list of <code>CityDto</code>.
     */
    private List<CityDto> cities = new ArrayList<CityDto>();

    /**
     * <code>Default constructor</code>.
     */
    public CityResponse() {

    }

    /**
     * Gets the <code>cities</code> property.
     * <p>
     * Refers to a collection/list of <code>CityDto</code>.
     * <p>
     * 
     * @return the current list of <code>CityDto</code>.<br>
     */
    public List<CityDto> getCities() {
        return this.cities;
    }

    /**
     * Sets the <code>cities</code> property.
     * <p>
     * Refers to a collection/list of <code>CityDto</code>.
     * <p>
     * 
     * @param pCities the new list of <code>CityDto</code>.<br>
     */
    public void setCities(final List<CityDto> pCities) {
        this.cities = pCities;
    }

}
