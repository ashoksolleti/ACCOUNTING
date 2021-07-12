/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>CityFindRequest</code> is used for retrieving city and its associated
 * airports information based on <code>code</code> or <code>countryCode</code>.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>code
 * <li>countryCode
 * </code>
 * </ul>
 */
public class CityFindRequest extends AbstractRequest {
	/**
	 * Unique serial version UID.
	 */
	private static final long serialVersionUID = -187785970882398889L;

	/**
	 * Attribute to hold <code>code</code> property.
	 * <p>
	 * The code represents either the city code or the airport code.
	 */
	private String code;

	/**
	 * Attribute to hold <code>countryCode</code> property.
	 * <p>
	 * The country code represents the country to which the city belongs.
	 */
	private String countryCode;

	/**
	 * Attribute to hold the <code>searchText</code> property.
	 * <p>
	 * The search text represents either the city/airport code or the
	 * city/airport name.
	 */
	private String searchText;

	/**
	 * Attribute to hold the <code>dstInformationRequired</code> property.
	 * <p>
	 * This attribute if set to true indicates that City DST information is
	 * needed on the response
	 */
	private boolean dstInformationRequired;

	/**
	 * <code>Default constructor. </code>
	 */
	public CityFindRequest() {

	}

	/**
	 * Gets the <code>code</code> property.
	 * <p>
	 * The code represents either the city code or the airport code.<br>
	 * <p>
	 * <b>Format: </b><br>
	 * 3 Alphabets
	 * <p>
	 * <b>Example: </b><br>
	 * CHI
	 * <p>
	 * 
	 * @return the current value of <code>code</code> of the city.<br>
	 */
	public String getCode() {
		return this.code;
	}

	/**
	 * Gets the <code>countryCode</code> property.
	 * <p>
	 * The country code represents the country to which the city belongs.
	 * <p>
	 * <b>Format: </b><br>
	 * 2 Alphabets
	 * <p>
	 * <b>Example: </b><br>
	 * US
	 * <p>
	 * 
	 * @return the current value of <code>countryCode</code>.<br>
	 *         </p>
	 */
	public String getCountryCode() {
		return this.countryCode;
	}

	/**
	 * Gets the <code>searchText</code> property.
	 * <p>
	 * Indicates either the city/airport code or the city/airport name.
	 * <p>
	 * <b>Format: </b><br>
	 * 1- 39 Alphabet.
	 * <p>
	 * <b>Example: </b><br>
	 * Chicago
	 * <p>
	 * 
	 * @return the current value of <code>searchText</code> field.
	 */
	public String getSearchText() {
		return this.searchText;
	}

	/**
	 * Sets the <code>code</code> property.
	 * <p>
	 * The code represents either the city code or the airport code.
	 * <p>
	 * <b>Format: </b><br>
	 * 3 Alphabets
	 * <p>
	 * <b>Example: </b><br>
	 * CHI
	 * <p>
	 * 
	 * @param pCode
	 *            the new value of <code>code</code> for a city.<br>
	 */
	public void setCode(final String pCode) {
		this.code = ContractUtility.convertToUpperCase(pCode);
	}

	/**
	 * Gets the <code>countryCode</code> property.
	 * <p>
	 * The country code represents the country to which the city belongs.
	 * <p>
	 * <b>Format: </b><br>
	 * 2 Alphabets
	 * <p>
	 * <b>Example: </b><br>
	 * US
	 * <p>
	 * 
	 * @param pCountryCode
	 *            the new value of <code>countryCode</code>.<br>
	 */
	public void setCountryCode(final String pCountryCode) {
		this.countryCode = ContractUtility.convertToUpperCase(pCountryCode);
	}

	/**
	 * Sets the <code>searchText</code> property.
	 * <p>
	 * Indicates either the city/airport code or the city/airport name.
	 * <p>
	 * <b>Format: </b><br>
	 * 1- 39 Alphabet.
	 * <p>
	 * <b>Example: </b><br>
	 * Chicago
	 * <p>
	 * 
	 * @param pSearchText
	 *            the new value of <code>searchText</code> field.<br>
	 */
	public void setSearchText(final String pSearchText) {
		this.searchText = pSearchText;
	}

	/**
	 * Gets the <code>dstInformationRequired</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * Yes/No Boolean
	 * <p>
	 * <b>Example: </b><br>
	 * Yes
	 * <p>
	 * 
	 * @return the current value of the <code>dstInformationRequired</code>
	 *         property.
	 */
	public boolean isDstInformationRequired() {
		return this.dstInformationRequired;
	}

	/**
	 * Sets the <code>dstInformationRequired</code> property.
	 * <p>
	 * <b>Format: </b><br>
	 * Yes/No Boolean
	 * <p>
	 * <b>Example: </b><br>
	 * Yes
	 * <p>
	 * 
	 * @param pDstInformationRequired
	 *            the current value of the <code>dstInformationRequired</code>
	 *            property.
	 */
	public void setDstInformationRequired(final boolean pDstInformationRequired) {
		this.dstInformationRequired = pDstInformationRequired;
	}
}
