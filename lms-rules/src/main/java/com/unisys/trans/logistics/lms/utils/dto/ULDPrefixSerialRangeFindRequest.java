/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>ULDPrefixSerialRangeFindRequest</code> retrieves the <code>ULDSerialRange</code>.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>carrierCode
 * <li>uldPrefixName</code>
 * </ul>
 */
public class ULDPrefixSerialRangeFindRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 4374128581303457118L;

    /**
     * Attribute to hold <code>carrierCode</code> property.
     * <p>
     * It is the airline carrier code.
     */
    private String carrierCode;

    /**
     * Attribute to hold <code>uldPrefixName</code> property.
     * <p>
     * ULD prefix for which the display of serial ranges has been requested.
     */
    private String uldPrefixName;

    /**
     * <code>Default constructor</code>.
     */
    public ULDPrefixSerialRangeFindRequest() {

    }

    /**
     * Gets the <code>carrierCode</code> property.
     * <p>
     * It is the airline carrier code.
     * <p>
     * <b>Format: </b><br>
     * 2-3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * LH - Lufthansa
     * <p>
     * 
     * @return the current value of the <code>carrierCode</code> property.
     */
    public java.lang.String getCarrierCode() {
        return this.carrierCode;
    }

    /**
     * Gets the <code>uldPrefixName</code> property.
     * <p>
     * ULD prefix for which the serial ranges display has been requested
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric.
     * <p>
     * <b>Example: </b><br>
     * AKE
     * <p>
     * 
     * @return the current value of the <code>uldPrefixName</code> property.
     */
    public java.lang.String getUldPrefixName() {
        return this.uldPrefixName;
    }

    /**
     * Sets the <code>carrierCode</code> property.
     * <p>
     * It is the airline carrier code.
     * <p>
     * <b>Format: </b><br>
     * 2-3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * LH - Lufthansa
     * <p>
     * 
     * @param pCarrierCode the new value of the <code>carrierCode</code>.
     */
    public void setCarrierCode(final java.lang.String pCarrierCode) {
        this.carrierCode = ContractUtility.convertToUpperCase(pCarrierCode);
    }

    /**
     * Sets the <code>uldPrefixName</code> property.
     * <p>
     * ULD prefix for which the serial ranges display has been requested
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric.
     * <p>
     * <b>Example: </b><br>
     * AKE
     * <p>
     * 
     * @param pUldPrefixName the new value of the <code>uldPrefixName</code> property.
     */
    public void setUldPrefixName(final java.lang.String pUldPrefixName) {
        this.uldPrefixName = ContractUtility.convertToUpperCase(pUldPrefixName);
    }
    
    // LMSC-11111 UIS159 Start
    private String volume;

    private String weight;
    
    private boolean demurrageInd;
    
    public void setVolume(final String pVolume) {
        this.volume = pVolume;
    }

    public void setWeight(final String pWeight) {
        this.weight = pWeight;
    }
    
    public String getVolume() {
        return this.volume;
    }

    public String getWeight() {
        return this.weight;
    }
    
	public boolean isDemurrageInd() {
		return demurrageInd;
	}

	public void setDemurrageInd(boolean demurrageInd) {
		this.demurrageInd = demurrageInd;
	}
    // LMSC-11111 UIS159 End
}
