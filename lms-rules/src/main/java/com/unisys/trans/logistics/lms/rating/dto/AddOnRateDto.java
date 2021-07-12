/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.TapeRateEntry;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>AddOnRateDto</code> contain details of AddOnRate.
 * <p>
 * This contains all information about AddOnRate.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>carrierCode
 * <li>oId
 * <li>cityCode
 * <li>addOnRateEntryDtos
 * </ul>
 */

public class AddOnRateDto extends TapeRateEntry {

    /**
     * Default serial version id.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold list of<code>addOnRateEntryDtos</code> property.
     */

    private List<AddOnRateEntryDto> addOnRateEntryDtos;

    /**
     * Attribute to hold <code>carrierCode</code> property.
     */
    private String carrierCode;

    /**
     * Attribute to hold <code>cityCode</code> property.
     */
    private GeographicDataDto cityCode;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto
     * AddOnRateEntryDto} containing <code>AddOnRateEntryDto</code> details.
     * <p>
     * 
     * @return the current value of the <code>addOnRateEntryDtos</code> property.
     */
    public List<AddOnRateEntryDto> getAddOnRateEntryDtos() {
        if (this.addOnRateEntryDtos == null) {
            this.addOnRateEntryDtos = new ArrayList<AddOnRateEntryDto>();
        }
        return this.addOnRateEntryDtos;
    }

    /**
     * Gets the <code>CarrierCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2-3 AlphaNumeric.
     * <p>
     * <b>Example: </b><br>
     * UW.
     * <p>
     * 
     * @return the current value of the <code>CarrierCode</code> property.
     */
    public String getCarrierCode() {
        return this.carrierCode;
    }

    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.rating.dto.GeographicDataDto
     * GeographicDataDto} containing <code>GeographicDataDto</code> details.
     * <p>
     * 
     * @return the current value of the <code>cityCode</code> property.
     */

    public GeographicDataDto getCityCode() {
        if (this.cityCode == null) {
            this.cityCode = new GeographicDataDto();
        }
        return this.cityCode;
    }

    /**
     * Gets the <code>OId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */

    public Long getOId() {
        return this.oId;
    }

    /**
     * Sets the list of<code>AddOnRateEntry</code> property.
     * <p>
     * 
     * @param pAddOnRateEntryDtos
     *            the current value of the <code>addOnRateEntry</code> property.
     */

    public void setAddOnRateEntryDtos(
                final List<AddOnRateEntryDto> pAddOnRateEntryDtos) {
        this.addOnRateEntryDtos = pAddOnRateEntryDtos;
    }

    /**
     * Sets the <code>CarrierCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2-3 AlphaNumeric.
     * <p>
     * <b>Example: </b><br>
     * UW.
     * <p>
     * 
     * @param pCarrierCode
     *            the current value of the <code>CarrierCode</code> property.
     */

    public void setCarrierCode(final String pCarrierCode) {
        this.carrierCode = ContractUtility
                    .convertToUpperCase(pCarrierCode);
    }

    /**
     * Sets the <code>cityCode</code> property.
     * <p>
     * 
     * @param pCityCode
     *            the current value of the <code>cityCode</code> property.
     */

    public void setCityCode(final GeographicDataDto pCityCode) {
        this.cityCode = pCityCode;
    }

    /**
     * Sets the <code>OId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Adds the list of {@link com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto
     * AddOnRateEntryDto} containing <code>AddOnRateEntryDto</code> details.
     * <p>
     * 
     * @param pEntryDto
     *            the new value of the <code>addOnRateEntryDto</code> property.
     */
    public void addAddOnRateEntryDto(final AddOnRateEntryDto pEntryDto) {
        if (pEntryDto == null) {
            throw new AssertionError("Adding null entry");
        }
        if (this.addOnRateEntryDtos == null) {
            this.addOnRateEntryDtos = new ArrayList<AddOnRateEntryDto>();
        }
        this.addOnRateEntryDtos.add(pEntryDto);
    }
}
