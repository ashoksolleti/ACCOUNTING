/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.io.Serializable;

/**
 * <code>TeleTypeAddressDto</code> contains data related to teletype address.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>oId
 * <li>teleTypeAddress
 * <li>teleTypeProfileInfoOId
 * </code>
 * </ul>
 */
public class TeleTypeAddressDto implements Serializable {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -7375383185425200885L;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>teleTypeAddress</code> property.
     */
    private String teleTypeAddress;

    /**
     * Attribute to hold <code>teleTypeProfileInfoOId</code> property.
     */
    private Long teleTypeProfileInfoOId;

    /**
     * <code>Default constructor.</code>
     */
    public TeleTypeAddressDto() {

    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * Unique key to identify the teletype address.
     * <p>
     * 
     * @return the current value of <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>teleTypeAddress</code> property.
     * <p>
     * <b>Format: </b><br>
     * 7 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * MSPCTUW
     * <p>
     * 
     * @return the current value of <code>teleTypeAddress</code> property.
     */
    public String getTeleTypeAddress() {
        return this.teleTypeAddress;
    }

    /**
     * Gets the <code>teleTypeProfileInfoOId</code> property.
     * <p>
     * 
     * @return the current value of <code>teleTypeProfileInfoOId</code> property.
     */
    public Long getTeleTypeProfileInfoOId() {
        return this.teleTypeProfileInfoOId;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * Unique key to identify the teletype address.
     * <p>
     * 
     * @param pOId the new value of <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>teleTypeAddress</code> property.
     * <p>
     * <b>Format: </b><br>
     * 7 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * MSPCTUW
     * <p>
     * 
     * @param pTeleTypeAddress the new value of <code>teleTypeAddress</code> property.
     */
    public void setTeleTypeAddress(final String pTeleTypeAddress) {
        this.teleTypeAddress = ContractUtility.convertToUpperCase(pTeleTypeAddress);
    }

    /**
     * Sets the <code>teleTypeProfileInfoOId</code> property.
     * <p>
     * 
     * @param pTeleTypeProfileInfoOId the new value of <code>teleTypeProfileInfoOId</code> property.
     */
    public void setTeleTypeProfileInfoOId(final Long pTeleTypeProfileInfoOId) {
        this.teleTypeProfileInfoOId = pTeleTypeProfileInfoOId;
    }
}
