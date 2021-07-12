/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;
import com.unisys.trans.logistics.lms.utils.dto.CarrierDto;

/**
 * <code>ClassRatingRuleCarrierResponse</code> contains the response
 * of the ClassRatingRuleCarrierRequest received by <code>ClassRatingRuleService</code>.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>CarrierDtos
 * </code>
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleCarrierResponse
 */

public class ClassRatingRuleCarrierResponse extends AbstractResponse {

    /**
     * Default Serial Version UID.
     * 
     */

    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold list of<code>carrierCode</code> property.
     */

    private List<CarrierDto> carrierDtos = new ArrayList<CarrierDto>();

    /**
     * Gets the list of <code>carrierDtos</code> property.
     * <p>
     * 
     * @return the current value of <code>carrierDtos</code> property.
     */

    public List<CarrierDto> getCarrierDtos() {
        return this.carrierDtos;
    }

    /**
     * Sets the list of <code>carrierDtos</code> property.
     * <p>
     * 
     * @param pCarrierDtos
     *            the new value of <code>carrierDtos</code> information.<br>
     */

    public void setCarrierDtos(final List<CarrierDto> pCarrierDtos) {
        this.carrierDtos = pCarrierDtos;
    }

}
