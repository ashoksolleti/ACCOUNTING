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
 * <code>OtherChargeCodeResponse </code> represents the response object of the maintenance request received by
 * <code>otherChargeSubCode</code>.
 * <p>
 * <code>OtherChargeCodeResponse </code> contains the following attribute:<br>
 * <ul>
 * <code>
 * <li>otherChargeCodeDtos
 * <li>otherChargeSubCodeDto
 * </code>
 * </ul>
 */
public class OtherChargeCodeResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 6980282873703470534L;

    /**
     * Attribute to hold list of <code>otherChargeCodeDtos</code> objects.<br>
     */
    private List<OtherChargeCodeDto> otherChargeCodes = new ArrayList<OtherChargeCodeDto>();

    /**
     * Attribute to hold list of <code>otherChargeSubCodeDtos</code> objects.<br>
     */
    private List<OtherChargeSubCodeDto> otherChargeSubCodes = new ArrayList<OtherChargeSubCodeDto>();

    /**
     * <code>Default constructor</code>.
     */
    public OtherChargeCodeResponse() {

    }

    /**
     * Adds the otherChargeCode information to the <code>otherChargeCodes</code> property.
     * <p>
     * 
     * @param pOtherChargeCodeDto the new currency information to be added to the
     *            <code>otherChargeCodes</code> property.
     */
    public void addOtherChargeCode(final OtherChargeCodeDto pOtherChargeCodeDto) {
        if (this.otherChargeCodes == null) {
            this.otherChargeCodes = new ArrayList<OtherChargeCodeDto>();
        }
        this.otherChargeCodes.add(pOtherChargeCodeDto);
    }

    /**
     * Gets the <code>otherChargeCodeDtos</code> property.
     * <p>
     * 
     * @return the current value of <code>otherChargeCodeDtos</code> property.
     */
    public List<OtherChargeCodeDto> getOtherChargeCodes() {
        return this.otherChargeCodes;
    }

    /**
     * Gets the <code>otherChargeSubCodeDtos</code> property.
     * <p>
     * 
     * @return the current value of <code>otherChargeSubCodeDtos</code> property.
     */
    public List<OtherChargeSubCodeDto> getOtherChargeSubCodes() {
        return this.otherChargeSubCodes;
    }

    /**
     * Sets the <code>otherChargeCodeDtos</code> property.
     * <p>
     * 
     * @param pOtherChargeCodeDtos the new value of the <code>otherChargeCodeDtos</code> property.
     */
    public void setOtherChargeCodes(final List<OtherChargeCodeDto> pOtherChargeCodeDtos) {
        this.otherChargeCodes = pOtherChargeCodeDtos;
    }

    /**
     * Sets the <code>otherChargeSubCodeDtos</code> property.
     * <p>
     * 
     * @param potherChargeSubCodeDtos the new value of the <code>otherChargeSubCodeDtos</code> property.
     */
    public void setOtherChargeSubCodes(final List<OtherChargeSubCodeDto> potherChargeSubCodeDtos) {
        this.otherChargeSubCodes = potherChargeSubCodeDtos;
    }

}
