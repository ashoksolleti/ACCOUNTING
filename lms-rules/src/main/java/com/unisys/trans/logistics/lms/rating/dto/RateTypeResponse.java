/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * <code>RateTypeResponse</code> represents the response object of the maintenance request received for
 * <code>RateType</code>.
 * <p>
 * <code>RateTypeResponse</code> contains the following attribute:<br>
 * <ul>
 * <code>
 * <li>rateTypes
 * </code>
 * </ul>
 */
public class RateTypeResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -832903931337918244L;

    /**
     * Attribute to hold list of <code>RateTypeDto</code> property.
     * <p>
     * <code>RateTypeDto</code> contains the rate type class information.
     */
    private List<RateTypeDto> rateTypes = new ArrayList<RateTypeDto>();

    /**
     * Adds the rate type information to the <code>rateTypes</code> property.
     * <p>
     * 
     * @param pRateTypeDto the new rate type information to be added to the <code>rateTypes</code> property.
     */
    public void addRateType(final RateTypeDto pRateTypeDto) {
        this.rateTypes.add(pRateTypeDto);
    }

    /**
     * Gets the <code>rateTypes</code> property.
     * <p>
     * The rate type information for a list of unique rate type codes.
     * <p>
     * 
     * @return the current value of <code>rateTypes</code> property.
     */
    public List<RateTypeDto> getRateTypes() {
        return this.rateTypes;
    }

    /**
     * Sets the <code>rateTypes</code> property.
     * <p>
     * The rate type information for a list of unique rate type codes.
     * <p>
     * 
     * @param pRateTypes the new value of <code>rateTypes</code> information.<br>
     */
    public void setRateTypes(final List<RateTypeDto> pRateTypes) {
        this.rateTypes = pRateTypes;
    }
}
