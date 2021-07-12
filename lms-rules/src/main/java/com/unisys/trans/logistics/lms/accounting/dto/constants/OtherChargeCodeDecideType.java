/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto.constants;


public enum OtherChargeCodeDecideType {
	/**
	 * Indicates that the Logical Operation type is AND.
	 */
	ONLINE_MAINTENANCE("O", "Use Online Maintenance"),
	/**
	 * Indicates that the Logical Operation type is NOT.
	 */
	SPA_LIST("S", "Use SPA List"),
	/**
	 * Indicates that the Logical Operation type is OR.
	 */
	BOTH("B", "Use Both");

	/**
	 * Attribute to hold the <code>type</code> property.
	 */
	private String type;
	
	/**
	 * Attribute to hold the <code>label</code> property.
	 */
	private String label;

	/**
	 * Constructor with <code>OtherChargeCodeDecideType</code> as an argument.
	 * <p>
	 * 
	 * @param pType
	 *            the new value of the <code>type</code>.<br>
	 */

	private OtherChargeCodeDecideType(final String pType, final String pLabel) {
		this.type = pType;
		this.label = pLabel;
	}

	/**
	 * Gets the <code>OtherChargeCodeDecideType</code> based on the given string.
	 * 
	 * @param pValue
	 *            the string representation of <code>OtherChargeCodeDecideType</code>
	 * @return A enum of type <code>OtherChargeCodeDecideType</code>
	 */
	public static OtherChargeCodeDecideType fromValue(final String pValue) {
		return valueOf(pValue);
	}

	/**
	 * This method <code>getOtherChargeCodeDecideType</code> returns the
	 * OtherChargeCodeDecideType.
	 * 
	 * @param pOtherChargeCodeDecideType
	 *            <code>String</code><br>
	 *            The value of due code.<br>
	 *            <p>
	 * @return <code>
	 *         {@link com.unisys.trans.logistics.lms.accounting.dto.constants.OtherChargeCodeDecideType
	 *         pOtherChargeCodeDecideType}</code><br>
	 *         Returns the type of Contract <br>
	 *         </p>
	 */

	public static OtherChargeCodeDecideType getOtherChargeCodeDecideType(
			final String pOtherChargeCodeDecideType) {

		OtherChargeCodeDecideType aMatchedOtherChargeCodeDecideType = null;

		for (final OtherChargeCodeDecideType aType : OtherChargeCodeDecideType.values()) {
			if (pOtherChargeCodeDecideType.equals(aType.value())) {
				aMatchedOtherChargeCodeDecideType = aType;
				break;
			}
		}
		return aMatchedOtherChargeCodeDecideType;
	}

	/**
	 * Gets the <code>type</code> property.
	 * <p>
	 * Holds the classification type code applicable for a contract status type
	 * <p>
	 * 
	 * @return the current value of the <code>type</code> property.<br>
	 */
	public String getType() {
		return this.type;
	}
	

	/**
	 * Gets the <code>label</code> property.
	 * <p>
	 * Holds the classification label applicable for a contract status type
	 * <p>
	 * 
	 * @return the current value of the <code>label</code> property.<br>
	 */
	public String getLabel() {
		return this.label;
	}

	/**
	 * Sets the <code>type</code> property.
	 * <p>
	 * Holds the classification type code applicable for a Logical Operation
	 * type
	 * <p>
	 * 
	 * @param pType
	 *            the new value of the <code>type</code> property.<br>
	 */
	public void setType(final String pType) {
		this.type = pType;
	}
	
	/**
	 * Sets the <code>label</code> property.
	 * <p>
	 * Holds the classification label applicable for a Logical Operation
	 * type
	 * <p>
	 * 
	 * @param pLabel
	 *            the new value of the <code>label</code> property.<br>
	 */
	public void setLabel(final String pLabel) {
		this.label = pLabel;
	}

	/**
	 * The <code>value</code> method gives the string format of Logical
	 * Operation type.
	 * <p>
	 * <p>
	 * 
	 * @return <code>String</code><br>
	 *         Returns the enumerated value of the contract Logical Operation
	 *         type.<br>
	 */
	public String value() {
		return this.type;
	}

}
