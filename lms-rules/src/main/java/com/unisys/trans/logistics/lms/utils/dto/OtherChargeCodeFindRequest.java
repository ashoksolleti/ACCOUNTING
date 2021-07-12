/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import java.util.List;

/**
 * <code>OtherChargeCodeFindRequest</code> class is the request to find OtherChargeCode information.
 * <p>
 * <code>OtherChargeCodeFindRequest</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>exactMatchRequiredIndicator
 * <li>otherChargeCode
 * </code>
 * </ul>
 */

public class OtherChargeCodeFindRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1778950364488755804L;

    /**
     * Attribute to hold the <code>exactMatchRequiredIndicator</code> property.
     * <p>
     * true if exact match is required to find otherChargeCode. false if exact match is not required to find
     * otherChargeCode.
     */
    private boolean exactMatchRequiredIndicator;
    
    private boolean otherCharSubCode;

    public boolean isOtherCharSubCode() {
		return otherCharSubCode;
	}

	public void setOtherCharSubCode(boolean otherCharSubCode) {
		this.otherCharSubCode = otherCharSubCode;
	}

	/**
     * Attribute to hold the <code>otherChargeCode</code> property.
     */
    private String otherChargeCode;

    /**
     * Attribute to hold the <code>otherChargeCode</code> property.
     */
    private List<String> otherChargeCodes;

    /**
     * Attribute to hold the <code>otherChargeSubCode</code> property.
     */
    private String otherChargeSubCode;
    
    /**
     * Attribute to hold the <code>otherChargeCodeSyncInd</code> property.
     */
    private boolean otherChargeCodeSyncInd;

    /**
     * <code>Default constructor</code>.
     */
    public OtherChargeCodeFindRequest() {

    }

    /**
     * Gets the <code>otherChargeCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>otherChargeCode</code> property.
     */
    public String getOtherChargeCode() {
        return this.otherChargeCode;
    }

    /**
     * Gets the <code>otherChargeCodes</code> property.
     * <p>
     * 
     * @return the current value of the <code>otherChargeCodes</code> property.
     */
    public List<String> getOtherChargeCodes() {
        return this.otherChargeCodes;
    }

    /**
     * Gets the <code>otherChargeSubCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>otherChargeSubCode</code> property.
     */
    public String getOtherChargeSubCode() {
        return this.otherChargeSubCode;
    }

    /**
     * Gets the <code>exactMatchRequiredIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * true or false
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @return the current value of the <code>exactMatchRequiredIndicator</code> property.
     */
    public boolean isExactMatchRequiredIndicator() {
        return this.exactMatchRequiredIndicator;
    }

    /**
     * Sets the <code>exactMatchRequiredIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * true or false
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @param pExactMatchRequiredIndicator the new value of the <code>exactMatchRequiredIndicator</code>
     *            property.
     */
    public void setExactMatchRequiredIndicator(final boolean pExactMatchRequiredIndicator) {
        this.exactMatchRequiredIndicator = pExactMatchRequiredIndicator;
    }

    /**
     * Sets the <code>otherChargeCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 alpha numeric
     * <p>
     * <b>Example: </b><br>
     * MY
     * <p>
     * 
     * @param pOtherChargeCode the new value of the <code>otherChargeCode</code> property.
     */
    public void setOtherChargeCode(final String pOtherChargeCode) {
        this.otherChargeCode = ContractUtility.convertToUpperCase(pOtherChargeCode);
    }

    /**
     * Sets the <code>otherChargeCodes</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 alpha numeric
     * <p>
     * <b>Example: </b><br>
     * MY
     * <p>
     * 
     * @param pOtherChargeCodes the new value of the <code>otherChargeCodes</code> property.
     */
    public void setOtherChargeCodes(final List<String> pOtherChargeCodes) {
        this.otherChargeCodes = pOtherChargeCodes;
    }

    /**
     * Sets the <code>otherChargeSubCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 alpha numeric
     * <p>
     * <b>Example: </b><br>
     * MY
     * <p>
     * 
     * @param pOtherChargeSubCode the new value of the <code>otherChargeSubCode</code> property.
     */
    public void setOtherChargeSubCode(final String pOtherChargeSubCode) {
        this.otherChargeSubCode = ContractUtility.convertToUpperCase(pOtherChargeSubCode);
    }

    /**
     * Gets the <code>otherChargeCodeSyncInd</code> property.
     * <p>
     * 
     * @return the current value of the <code>otherChargeCodeSyncInd</code> property.
     */
    public boolean getOtherChargeCodeSyncInd() {
        return this.otherChargeCodeSyncInd;
    }

    /**
     * Sets the <code>otherChargeCodeSyncInd</code> property.
     * <p>
     * 
     * @param pOtherChargeCodeSyncInd the new value of the <code>otherChargeCodeSyncInd</code> property.
     */
    public void setOtherChargeCodeSyncInd(final boolean pOtherChargeCodeSyncInd) {
        this.otherChargeCodeSyncInd = pOtherChargeCodeSyncInd;
    }

}
