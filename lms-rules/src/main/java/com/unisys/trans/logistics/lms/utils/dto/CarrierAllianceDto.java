/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.io.Serializable;

/**
 * <code>CarrierAllianceDto</code> contains brand name of the alliance , where <code>Carrier</code> is a
 * member.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <li><code>allianceCode</code>
 * <li><code>carrierOId</code>
 * <li><code>oId</code>
 * </ul>
 */
public class CarrierAllianceDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -2213267840906518496L;

    /**
     * Attribute to hold <code>allianceCode</code> property.
     */
    private String allianceCode;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * <code>Default constructor.</code>
     */
    public CarrierAllianceDto() {

    }

    /**
     * Gets the <code>allianceCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * WOW
     * <p>
     * 
     * @return the current value of the <code>allianceCode</code> property.<br>
     */
    public String getAllianceCode() {
        return this.allianceCode;
    }

    /**
     * Gets the value of the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Sets the value of the <code>allianceCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * WOW
     * <p>
     * 
     * @param pAllianceCode the new value of the <code>allianceCode</code> property.<br>
     */
    public void setAllianceCode(final String pAllianceCode) {
        this.allianceCode = ContractUtility.convertToUpperCase(pAllianceCode);
    }

    /**
     * Sets the value of the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }
}
