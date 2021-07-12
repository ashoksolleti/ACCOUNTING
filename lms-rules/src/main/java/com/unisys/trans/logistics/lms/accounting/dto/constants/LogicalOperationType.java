/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto.constants;

/**
 * <code>LogicalOperationType</code> holds the constants to indicate Logical
 * Operation type applied.
 * <p>
 * Following are the possible Logical Operation type:<br>
 * <ul>
 * <li>OR - O
 * <li>AND - A
 * <li>NOT - N
 * </ul>
 */

public enum LogicalOperationType {
	/**
	 * Indicates that the Logical Operation type is AND.
	 */
	AND("A", "Apply If AWB Has All"),
	/**
	 * Indicates that the Logical Operation type is NOT.
	 */
	NOT("N", "Do not Apply If AWB Has Any"),
	/**
	 * Indicates that the Logical Operation type is OR.
	 */
	OR("O", "Apply if AWB Has Any");

	/**
	 * Attribute to hold the <code>type</code> property.
	 */
	private String type;
	
	/**
	 * Attribute to hold the <code>label</code> property.
	 */
	private String label;

	/**
	 * Constructor with <code>LogicalOperationType</code> as an argument.
	 * <p>
	 * 
	 * @param pType
	 *            the new value of the <code>type</code>.<br>
	 */

	private LogicalOperationType(final String pType, final String pLabel) {
		this.type = pType;
		this.label = pLabel;
	}

	/**
	 * Gets the <code>LogicalOperationType</code> based on the given string.
	 * 
	 * @param pValue
	 *            the string representation of <code>LogicalOperationType</code>
	 * @return A enum of type <code>LogicalOperationType</code>
	 */
	public static LogicalOperationType fromValue(final String pValue) {
		return valueOf(pValue);
	}

	/**
	 * This method <code>getLogicalOperationType</code> returns the
	 * ContractStatusType.
	 * 
	 * @param pLogicalOperationType
	 *            <code>String</code><br>
	 *            The value of due code.<br>
	 *            <p>
	 * @return <code>
	 *         {@link com.unisys.trans.logistics.lms.rating.dto.constants.LogicalOperationType
	 *         pLogicalOperationType}</code><br>
	 *         Returns the type of Contract <br>
	 *         </p>
	 */

	public static LogicalOperationType getLogicalOperationType(
			final String pLogicalOperationType) {

		LogicalOperationType aMatchedLogicalOperationType = null;

		for (final LogicalOperationType aType : LogicalOperationType.values()) {
			if (pLogicalOperationType.equals(aType.value())) {
				aMatchedLogicalOperationType = aType;
				break;
			}
		}
		return aMatchedLogicalOperationType;
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
