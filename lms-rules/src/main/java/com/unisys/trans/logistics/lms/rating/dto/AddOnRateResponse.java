/* ====================================== */
/* Copyright(c) 2012 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;
import com.unisys.trans.logistics.lms.utils.dto.CityDto;

/**
 * <code>AddOnRateResponse</code> contains the response of the maintenance
 * request received by <code>AddOnRateService</code>.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>AddOnRateDto
 * </code>
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.rating.dto.AddOnRateDto
 */
public class AddOnRateResponse extends AbstractResponse {

    /**
     * Default serial version id.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold the <code>AddOnRateDto</code> object.
     */
    private AddOnRateDto addOnRateDto;

    /**
     * Attribute to hold <code>CityDto</code> property.
     * <p>
     * <code>CityDto</code> contains the list of city information.
     */
    private List<CityDto> cityDtos = new ArrayList<CityDto>();

    /**
     * <code>Default Constructor.</code>
     */
    public AddOnRateResponse() {

    }

    /**
     * Gets the <code>AddOnRateDto</code> property.
     * <p>
     * 
     * @return the current value of <code>AddOnRateDto</code> property.
     */

    public AddOnRateDto getAddOnRateDto() {
        return this.addOnRateDto;
    }

    /**
     * Gets the <code>CityDto</code> property.
     * <p>
     * 
     * @return the the list of current value of <code>cityDtos</code> property.
     */

    public List<CityDto> getCityDtos() {
        return this.cityDtos;
    }

    /**
     * Sets the <code>AddOnRateDto</code> property.
     * <p>
     * 
     * @param pAddOnRateDto
     *            the new value of the <code>AddOnRateDto</code> property.
     */
    public void setAddOnRateDto(final AddOnRateDto pAddOnRateDto) {
        this.addOnRateDto = pAddOnRateDto;
    }

    /**
     * Sets the <code>CityDto</code> property.
     * <p>
     * 
     * @param pCityDtos
     *            the new value of the <code>cityDtos</code> property.
     */
    public void setCityDtos(final List<CityDto> pCityDtos) {
        this.cityDtos = pCityDtos;
    }

}
