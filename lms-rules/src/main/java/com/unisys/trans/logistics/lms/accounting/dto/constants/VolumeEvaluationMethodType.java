//@formatter:off
/* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.accounting.dto.constants;

/**
 * <code>UnitType</code> holds the constants to indicate UnitType type applied.
 * <p>
 * Following are the possible UnitType type:<br>
 * <ul>
 * <li>CF
 * <li>CI
 * <li>MC
 * <li>CC
 * </ul>
 */
public enum VolumeEvaluationMethodType {

	/**
	 * Constant used for MANUALLYENTEREDACTUALVOLUME- VolumeEvaluationMethod.
	 */
	MANUALLY_ENTERED_ACTUAL_VOLUME("Manually Entered Actual Volume", "A"),

	/**
	 * Constant used for VolumeEvaluationMethod.
	 */
	MANUALLY_ENTERED_ESTIMATED_VOLUME("Manually Entered Estimated Volume", "E"),

	/**
	 * Constant used for VolumeEvaluationMethod.
	 */
	SYSTEM_GENERATED_VOLUME("System Generated Dimensional Volume", "G"),

	/**
	 * Constant used for Shipper.
	 */
	SYSTEM_GENERATED_TW_VOLUME("System Generated TW Volume", "T");

	/**
	 * Attribute to hold the <code>unit</code> property.
	 */
	private String unit;

	/**
	 * Parameterize constructor.
	 * 
	 * @param pUnit
	 *            the value.
	 */
	VolumeEvaluationMethodType(final String pUnit, final String pCode) {
		this.unit = pUnit;
		this.code = pCode;
	}

	/**
	 * @return the unit
	 */
	public String getUnit() {
		return this.unit;
	}

	/**
	 * Attribute to hold the <code>unit</code> property.
	 */
	private String code;

	/**
	 * @return the unit
	 */
	public String getCode() {
		return this.code;
	}

	/**
	 * Gives the string format of enumerated <code>UnitType</code>.
	 * <p>
	 * 
	 * @return the current string value of the <code>UnitType</code>.
	 */
	public String value() {
		return this.name();
	}

	public static VolumeEvaluationMethodType getVolumeEvaluationMethodType(
			final String pVolumeEvaluationMethodType) {

		VolumeEvaluationMethodType aMatchedVolumeEvaluationMethodType = null;

		for (final VolumeEvaluationMethodType aType : VolumeEvaluationMethodType
				.values()) {

			if (pVolumeEvaluationMethodType.equals(aType.value())) {
				aMatchedVolumeEvaluationMethodType = aType;
				break;
			}
		}

		return aMatchedVolumeEvaluationMethodType;

	}

	public static VolumeEvaluationMethodType getVolumeEvaluationMethodTypeByCode(
			final String pCode) {

		VolumeEvaluationMethodType aMatchedVolumeEvaluationMethodType = null;

		for (final VolumeEvaluationMethodType aType : VolumeEvaluationMethodType
				.values()) {

			if (aType.getCode().equalsIgnoreCase(pCode)) {
				aMatchedVolumeEvaluationMethodType = aType;
				break;
			}
		}

		return aMatchedVolumeEvaluationMethodType;

	}
}
