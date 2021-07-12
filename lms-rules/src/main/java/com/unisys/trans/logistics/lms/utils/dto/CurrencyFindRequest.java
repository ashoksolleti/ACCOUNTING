/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>CurrencyFindRequest</code> class represents the request to find the
 * currency information.
 * <p>
 * It is used to find currency information based on isoCode. If currency code is
 * present, it returns all currency information of a particular currency code.
 * Else, it returns all the currency codes with the effective rounding factor
 * information.
 * <p>
 * <code>CurrencyFindRequest</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>isoCode
 * </code>
 * </ul>
 */
public class CurrencyFindRequest extends AbstractRequest {

	/**
	 * Unique serial version UID.
	 */
	private static final long serialVersionUID = 7822418222861175451L;

	/**
	 * Attribute to hold <code>isoCode</code> property.
	 * <p>
	 * The <code>currency code</code> is unique and it is a predefined ISO code.
	 */
	private String isoCode;
	/**
	 * Attribute to hold <code>executionDate</code> property.
	 */
	private Date executionDate;

	/**
	 * <code>Default constructor. </code>
	 */
	public CurrencyFindRequest() {

	}

	/**
	 * Gets the <code>isoCode</code> property.
	 * <p>
	 * isoCode of the currency which is a 3 letter unique code to identify a
	 * currency.
	 * <p>
	 * <b>Format: </b><br>
	 * 3 Alphabet
	 * <p>
	 * <b>Example: </b><br>
	 * CAD
	 * <p>
	 * 
	 * @return the current value of the <code>isoCode</code> property.
	 */
	public String getIsoCode() {

		return this.isoCode;

	}

	/**
	 * Sets the <code>isoCode</code> property.
	 * <p>
	 * isoCode of the currency which is a 3 letter unique code to identify a
	 * currency.
	 * <p>
	 * <b>Format: </b><br>
	 * 3 Alphabet
	 * <p>
	 * <b>Example: </b><br>
	 * CAD
	 * <p>
	 * 
	 * @param pISOCode
	 *            the new value of the <code>isoCode</code> property.
	 */
	public void setIsoCode(final String pISOCode) {
		this.isoCode = ContractUtility.convertToUpperCase(pISOCode);
	}

	/**
	 * Gets the <code>ExecutionDate</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * DDMMMYY
	 * <p>
	 * <b>Example: </b><br>
	 * 26JAN08
	 * <p>
	 * 
	 * @return the current value of the <code>ExecutionDate</code> property.
	 */
	public Date getExecutionDate() {
		return ContractUtility.getClonedDate(this.executionDate);
	}

	/**
	 * Sets the <code>ExecutionDate</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * DDMMMYY
	 * <p>
	 * <b>Example: </b><br>
	 * 26JAN08
	 * <p>
	 * 
	 * @param pExecutionDate
	 *            the new value of the <code>ExecutionDate</code> property.
	 */
	public void setExecutionDate(final Date pExecutionDate) {
		this.executionDate = ContractUtility.getClonedDate(pExecutionDate);
	}

}
