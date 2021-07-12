/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>CarrierResponse</code> contains the response of the maintenance request received by
 * <code>CarrierService</code>.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>CarrierDto</code>
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.utils.dto.CarrierDto CarrierDto
 */
public class CarrierResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 482671421610206879L;

    /**
     * Variable to hold <code>CarrierDto</code> object.<br>
     */
    private CarrierDto carrier;

    /**
     * <code>Default constructor.</code>
     */
    public CarrierResponse() {

    }

    /**
     * Gets the <code>carrier</code> property.
     * <p>
     * 
     * @return the current value of the <code>carrier</code> property.
     */
    public CarrierDto getCarrier() {
        return this.carrier;
    }

    /**
     * Sets the <code>carrier</code> property.
     * <p>
     * 
     * @param pCarrierDto the new value of <code>carrier</code> property.
     */
    public void setCarrier(final CarrierDto pCarrierDto) {
        this.carrier = pCarrierDto;
    }
}
