/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>CarrierRestoreRequest</code> is used for restoring the carrier information.
 * <p>
 * The object ID of the carrier is required to restore the carrier information.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <li><code>oId</code> <br>
 * <li><code>carrierCode</code> <br>
 * </ul>
 */
public class CarrierRestoreRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 6893372601110259403L;

    /**
     * Attribute to hold the <code>carrierCode</code> property.
     */
    private String carrierCode;

    /**
     * Attribute to hold the <code>oId</code> property.
     */
    private Long oId;

    /**
     * <code>Default constructor.</code>
     */
    public CarrierRestoreRequest() {
    }

    /**
     * Gets the <code>carrierCode</code> property.
     * <p>
     * <b>Format </b>:<br>
     * 3 Alphanumeric (Now the size being used is 2)
     * <p>
     * <b>Example :</b><br>
     * NH
     * <p>
     * 
     * @return the current value of the <code>carrierCode</code> property.
     */
    public String getCarrierCode() {
        return this.carrierCode;
    }

    /**
     * Gets the <code>oId </code>property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Sets the <code>carrierCode</code> property.
     * <p>
     * <b>Format </b>:<br>
     * 3 Alphanumeric (Now the size being used is 2)
     * <p>
     * <b>Example :</b><br>
     * NH
     * <p>
     * 
     * @param pCarrierCode the new value of the <code>carrierCode</code> property.
     */
    public void setCarrierCode(final String pCarrierCode) {
        this.carrierCode = pCarrierCode;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

}
