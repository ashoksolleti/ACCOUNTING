//@formatter:off
/* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.accounting.dto.constants;

/**
 * <code>adjustmentSource</code> holds the constants to indicate the source of
 * adjustment.
 * <p>
 * Following are the possible adjustment Source type:<br>
 * <ul>
 * <li>L
 * <li>U
 * </ul>
 */
public enum AdjustmentSourceType {

	/**
	 * Constant used for Load Air Waybill.
	 */
	L("Load Air Waybill"),

	/**
	 * Constant used for Update Air Waybill.
	 */
	U("Update Air Waybill"),
	
	M("Manual Adjustment"),
	
	W("Write Off");

	/**
	 * Attribute to hold the <code>adjustmentSource</code> property.
	 */
	private String adjustmentSource;

	/**
	 * Parameterize constructor.
	 * 
	 * @param pAdjustmentSource
	 *            the value.
	 */
	AdjustmentSourceType(final String pAdjustmentSource) {
		this.adjustmentSource = pAdjustmentSource;
	}

	/**
	 * @return the adjustmentSource
	 */
	public String getAdjustmentSource() {
		return this.adjustmentSource;
	}

	/**
	 * Gives the string format of enumerated <code>adjustmentSourceType</code>.
	 * <p>
	 * 
	 * @return the current string value of the <code>adjustmentSourceType</code>
	 *         .
	 */
	public String value() {
		return this.name();
	}
}
