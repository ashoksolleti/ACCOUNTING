/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto.constants;

/**
 * <code>WeightType</code> holds the constants to indicates how the other charge
 * should be generated based on the type of weight charges.
 * <p>
 * Valid values for <code>WeightType</code> are:
 * <ul>
 * <li>CHARGEABLE - C
 * <li>DIMENSIONAL - D
 * <li>GROSS - G
 * </ul>
 * Default value is : GROSS
 */
public enum WeightType {
	/**
	 * The other charge is generated based on the chargeable weight.
	 */
	CHARGEABLE("C", "Chargeable"),

	/**
	 * The other charge is generated based on the gross weight.
	 */
	GROSS("G", "Gross"),

	/**
	 * The other charge is generated based on the volumetric weight.
	 */
	VOLUMETRIC("V", "Volumetric");

	private String weightType;

	private String weightTypeValue;

	/**
	 * Constructor with <code>weightType</code> as an argument.
	 * <p>
	 * 
	 * @param pWeightType
	 *            the new value of the <code>weightType</code>.<br>
	 * @param pValue
	 *            the new value of the <code>value</code>.<br>
	 */
	WeightType(final String pWeightType, final String pWeightTypeValue) {
		this.weightType = pWeightType;
		this.weightTypeValue = pWeightTypeValue;
	}

	/**
	 * The <code>fromValue</code> method returns the <code>WeightType</code>
	 * value.
	 * <p>
	 * 
	 * @param pWeightType
	 *            the new value of <code>WeightType</code>.
	 *            <p>
	 * @return the current enumerated value of the <code>WeightType</code>.
	 */
	public static WeightType fromValue(final String pWeightType) {

		WeightType aMatchedWeightType = null;
		for (final WeightType bWeightType : WeightType.values()) {
			if (bWeightType.getWeightType().equals(pWeightType)) {
				aMatchedWeightType = bWeightType;
				break;
			}
		}
		return aMatchedWeightType;
	}

	/**
	 * Gets the <code>weightType</code> property.
	 * <p>
	 * Holds the value of weight type.
	 * <p>
	 * 
	 * @return the current value of the <code>weightType</code> property.<br>
	 */
	public String getWeightType() {
		return this.weightType;
	}

	/**
	 * Gets the <code>weightTypeValue</code> property.
	 * <p>
	 * Holds the value of weight type value.
	 * <p>
	 * 
	 * @return the current value of the <code>weightTypeValue</code> property.<br>
	 */
	public String getWeightTypeValue() {
		return this.weightTypeValue;
	}

	/**
	 * The <code>value</code> method returns the string value of
	 * <code>WeightType</code>.
	 * <p>
	 * 
	 * @return the current enumerated value of the <code>WeightType</code>.<br>
	 */
	public String value() {
		return this.getWeightType();
	}
}