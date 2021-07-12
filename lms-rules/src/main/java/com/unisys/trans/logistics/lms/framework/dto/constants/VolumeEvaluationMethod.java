//@formatter:off
/* ====================================== */
/* Copyright(c) 2011 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.framework.dto.constants;

/**
 * <code>volumeEvaluationMethod</code> holds the constants to indicate
 * volumeEvaluationMethod type applied.
 * <p>
 * Following are the possible ExportPayCode type:<br>
 * <ul>
 * <li>MANUALLY ENTERED ACTUAL VOLUME
 * <li>MANUALLY ENTERED ESTIMATED VOLUME
 * <li>SYSTEM GENERATED DIMENSIONAL VOLUME
 * <li>SYSTEM GENERATED TW VOLUME
 */
public enum VolumeEvaluationMethod {

	/**
	 * Constant used for MANUALLY ENTERED ESTIMATED VOLUME.
	 */
	EV("Manually Entered Estimated Volume"),

	/**
	 * Constant used for MANUALLY ENTERED ACTUAL VOLUME.
	 */
	AV("Manually Entered Actual Volume"),

	/**
	 * Constant used for SYSTEM GENERATED DIMENSIONAL VOLUME.
	 */
	DV("System Generated Dimensional Volume"),

	/**
	 * Constant used for SYSTEM GENERATED TW VOLUME.
	 */
	TV("System Generated TW Volume"),
	/**
	 * Constant used for SYSTEM GENERATED TW VOLUME.
	 */
	FV("FWB Volume");

	/**
	 * Attribute to hold the <code>volumeEvaluationMethod</code> property.
	 */
	private String volumeEvaluationMethod;

	/**
	 * Parameterize constructor.
	 * 
	 * @param pDue
	 *            the value.
	 */
	VolumeEvaluationMethod(final String pVolumeEvaluationMethod) {
		this.volumeEvaluationMethod = pVolumeEvaluationMethod;
	}

	/**
	 * @return the volumeEvaluationMethod
	 */
	public String getVolumeEvaluationMethod() {
		return this.volumeEvaluationMethod;
	}

	/**
	 * Gives the string format of enumerated <code>volumeEvaluationMethod</code>
	 * .
	 * <p>
	 * 
	 * @return the current string value of the
	 *         <code>volumeEvaluationMethod</code>.
	 */
	public String value() {
		return this.name();
	}

}
