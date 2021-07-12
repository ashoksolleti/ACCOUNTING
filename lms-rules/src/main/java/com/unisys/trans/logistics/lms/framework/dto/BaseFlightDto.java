/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.dto;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.io.Serializable;

/**
 * <code>BaseFlightDto</code> contains the top level flight information that is common for implementation
 * classes of other modules like SPACE, WAREHOUSE, etc.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>carrierCode
 * <li>flightNumber
 * <li>suffix
 * </code>
 * </ul>
 */
public class BaseFlightDto implements Serializable {
	@Override
	public String toString() {
		String BaseFlightDto = new String();
		BaseFlightDto = "BaseFlightDto ::: " + "carrierCode :" + carrierCode
				+ "number :" + number + "suffix :" + suffix;
		return BaseFlightDto;
	}

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -7310462193802866980L;

    /**
     * Attribute to hold <code>carrierCode</code> property.
     */
    private String carrierCode;

    /**
     * Attribute to hold <code>number</code> property.
     */
    private String number;

    /**
     * Attribute to hold <code>suffix</code> property.
     */
    private String suffix;

    /**
     * <code>Default Constructor</code>.
     */
    public BaseFlightDto() {

    }

    /**
     * Gets the <code>carrierCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * UW
     * <p>
     * 
     * @return the current value of the <code>carrierCode</code> property.
     */
    public String getCarrierCode() {
        return this.carrierCode;
    }

    /**
     * Gets the <code>number</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3-4 Numeric
     * <p>
     * <b>Example: </b><br>
     * 7500
     * <p>
     * 
     * @return the current value of the <code>number</code> property.
     */
    public String getNumber() {
        return this.number;
    }

    /**
     * Gets the <code>suffix</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabetic
     * <p>
     * <b>Example: </b><br>
     * T
     * <p>
     * 
     * @return the current value of the <code>suffix</code> property.
     */
    public String getSuffix() {
        return this.suffix;
    }

    /**
     * Sets the <code>carrierCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * <b>Format: </b><br>
     * 2 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * UW
     * <p>
     * 
     * @param pFlightCarrierCode the new value of the <code>carrierCode</code> property.<br>
     */
    public void setCarrierCode(final String pFlightCarrierCode) {
        this.carrierCode = ContractUtility.convertToUpperCase(pFlightCarrierCode);
    }

    /**
     * Sets the <code>number</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3-4 Numeric
     * <p>
     * <b>Example: </b><br>
     * 7500
     * <p>
     * 
     * @param pFlightNumber the new value of the <code>number</code> property.<br>
     */
    public void setNumber(final String pFlightNumber) {
        this.number = ContractUtility.convertToUpperCase(pFlightNumber);
    }

    /**
     * Sets the <code>suffix</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabetic
     * <p>
     * <b>Example: </b><br>
     * T
     * <p>
     * 
     * @param pFlightSuffixCode the new value of the <code>suffix</code> property.<br>
     */
    public void setSuffix(final String pFlightSuffixCode) {
        this.suffix = ContractUtility.convertToUpperCase(pFlightSuffixCode);
    }
    
    // LMSC-11111 UIS158 Start
    public String getFlightNumberwithSuffix(){
        final StringBuffer buffer = new StringBuffer();
        if (this.number != null) {
            buffer.append(this.number);
        }
        if (this.suffix != null) {
            buffer.append(this.suffix);
        }
        return buffer.toString();
    }
    // LMSC-11111 UIS158 End
    
	public String getFlightNumber() {
		final StringBuffer flightNumber = new StringBuffer();
		if (this.carrierCode != null) {
			flightNumber.append(this.carrierCode);
		}
		return flightNumber.append(this.getFlightNumberwithSuffix()).toString();
	}

}
