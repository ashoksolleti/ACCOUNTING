/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>CarrierPersistRequest</code> is used for create and update of carrier information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>carrier</code>
 * </ul>
 */
public class CarrierPersistRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 9207968565583403279L;

    /**
     * Attribute to hold the <code>carrierDto</code> property.
     */
    private CarrierDto carrier;

    /**
     * <code>Default constructor.</code>
     */
    public CarrierPersistRequest() {

    }

    /**
     * Gets the <code>carrierDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>carrier</code> property.
     */
    public CarrierDto getCarrier() {
        return this.carrier;
    }

    /**
     * Sets the <code>carrierDto</code> property.
     * <p>
     * 
     * @param pCarrierDto the new value of the <code>carrier</code> property.
     */
    public void setCarrier(final CarrierDto pCarrierDto) {
        this.carrier = pCarrierDto;

    }
}
