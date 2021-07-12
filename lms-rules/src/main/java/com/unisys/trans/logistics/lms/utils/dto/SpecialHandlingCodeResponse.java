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
 * <code>SpecialHandlingCodeResponse</code> contains the response of the maintenance request received by
 * <code>SpecialHandlingCodeService</code>.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>specialHandlingCodes
 * <li>sortCode
 * </code>
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.utils.dto.SpecialHandlingCodeDto
 */
public class SpecialHandlingCodeResponse extends AbstractResponse {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 5245624551364942748L;

    /**
     * Attribute to hold list of <code>SpecialHandlingCodeDto</code> object.
     */
    private List<SpecialHandlingCodeDto> specialHandlingCodes = new ArrayList<SpecialHandlingCodeDto>();

    /**
     * <code>Default Constructor.</code>
     */
    public SpecialHandlingCodeResponse() {

    }

    /**
     * Adds the <code>SpecialHandlingCodeDto</code> to the list of <code>SpecialHandlingCodeDto</code>.
     * <p>
     * 
     * @param pSpecialHandlingCodeDto the new value of <code>specialHandlingCodes</code> property.
     */
    public void addSpecialHandlingCode(final SpecialHandlingCodeDto pSpecialHandlingCodeDto) {

        this.specialHandlingCodes.add(pSpecialHandlingCodeDto);
    }

    /**
     * Gets the list of <code>specialHandlingCodes</code> property.
     * <p>
     * 
     * @return the current value of list of <code>specialHandlingCodes</code> property.
     */
    public List<SpecialHandlingCodeDto> getSpecialHandlingCodes() {
        return this.specialHandlingCodes;
    }

    /**
     * Sets the <code>specialHandlingCodes</code> property.
     * <p>
     * 
     * @param pSpecialHandlingCodes the new value of list of <code>specialHandlingCodes</code> property.
     */
    public void setSpecialHandlingCodes(final List<SpecialHandlingCodeDto> pSpecialHandlingCodes) {

        this.specialHandlingCodes = pSpecialHandlingCodes;

    }
}
