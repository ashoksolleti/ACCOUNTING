/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>CarrierFindRequest</code> is used for finding carrier information. It allows you to find carrier
 * information based on carrier code or carrier number.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>carrierCode
 * <li>airlineCodeNumber
 * <li>carrierCode</code>
 * </ul>
 */
public class CarrierFindRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -1283744401384095316L;

    /**
     * Attribute to hold the <code>carrierNumber</code> property.
     */
    private String airlineCodeNumber;

    /**
     * Attribute to hold the <code>carrierCode</code> property.
     */
    private String carrierCode;

    /**
     * Attribute to hold the <code>carrierCode</code> property.
     */
    private String accountNumber;
    
    private boolean isRequestFromUldControl;

    public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
     * <code>Default constructor.</code>
     */
    public CarrierFindRequest() {

    }

    /**
     * Gets the <code>airlineCodeNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Numeric.
     * <p>
     * <b>Example: </b><br>
     * 014
     * <p>
     * 
     * @return the current value of the <code>airlineCodeNumber</code> property.<br>
     */
    public String getAirlineCodeNumber() {
        return this.airlineCodeNumber;
    }

    /**
     * Gets the <code>carrierCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphanumeric.
     * <p>
     * <b>Example: </b><br>
     * AC
     * <p>
     * 
     * @return the current value of the <code>carrierCode</code> property.<br>
     */
    public String getCarrierCode() {
        return this.carrierCode;
    }

    /**
     * Sets the <code>airlineCodeNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Numeric.
     * <p>
     * <b>Example: </b><br>
     * 014
     * <p>
     * 
     * @param pAirlineCodeNumber the new value of the <code>airlineCodeNumber</code> property.<br>
     */
    public void setAirlineCodeNumber(final String pAirlineCodeNumber) {
        this.airlineCodeNumber = pAirlineCodeNumber;
    }

    /**
     * Sets the <code>carrierCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphanumeric.
     * <p>
     * <b>Example: </b><br>
     * AC
     * <p>
     * 
     * @param pCarrierCode the new value of the <code>carrierCode</code> property.<br>
     */
    public void setCarrierCode(final String pCarrierCode) {
        this.carrierCode = ContractUtility.convertToUpperCase(pCarrierCode);
    }
    
    // LMSC-11111 UIS158 Start
    private String participantName;
    
	public String getParticipantName() {
		return participantName;
	}

	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}
    // LMSC-11111 UIS158 End

	public boolean isRequestFromUldControl() {
		return isRequestFromUldControl;
	}

	public void setRequestFromUldControl(boolean isRequestFromUldControl) {
		this.isRequestFromUldControl = isRequestFromUldControl;
	}
}
