/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>RateTypePersistRequest</code> contains all the details used to create/update rate type information.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <li><code>rateType</code> <br>
 * </ul>
 */
public class RateTypePersistRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -776560491976262923L;

    /**
     * Attribute to hold <code>rateType</code> property.
     * <p>
     * This attribute represents <code>RateTypeDto</code> object that holds all the rate type class code
     * details.<br>
     */
    private RateTypeDto rateType;

    /**
     * Gets the <code>rateType</code> property.
     * <p>
     * 
     * @return the current value of the <code>rateType</code> property.
     */
    public RateTypeDto getRateType() {
        return this.rateType;
    }

    /**
     * Sets the <code>rateType</code> property.
     * <p>
     * 
     * @param pRateTypeDto the new value of the <code>rateType</code> property.<br>
     */
    public void setRateType(final RateTypeDto pRateTypeDto) {
        this.rateType = pRateTypeDto;
    }
}