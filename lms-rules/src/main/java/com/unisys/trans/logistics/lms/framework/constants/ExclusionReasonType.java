package com.unisys.trans.logistics.lms.framework.constants;

public enum ExclusionReasonType {

	/**
	 * This is an enumerated ExclusionReasonType constant to specify Goods Movement type
	 * SYSTEM PARAMETER.
	 * <p>
	 * value = {@value}
	 */
	N("SYSTEM PARAMETER"),
	
	/**
	 * This is an enumerated ExclusionReasonType constant to specify Goods Movement type
	 * SYSTEM PARAMETER.
	 * <p>
	 * value = {@value}
	 */
	Y(" "),

	/**
	 * This is an enumerated ExclusionReasonType constant to specify Goods Movement type
	 * INTERLINE SHIPMENT.
	 * <p>
	 * value = {@value}
	 */
	I("INTERLINE SHIPMENT"),

	/**
	 * This is an enumerated ExclusionReasonType constant to specify Goods Movement type
	 * NON-HOST AIR WAYBILL.
	 * <p>
	 * value = {@value}
	 */
	H("NON-HOST AIR WAYBILL"),

	/**
	 * This is an enumerated ExclusionReasonType constant to specify Goods Movement type
	 * PRODUCT CODE.
	 * <p>
	 * value = {@value}
	 */
	P("PRODUCT CODE");

	private String exclusionReason;

	private ExclusionReasonType(final String pExclusionReasonType) {
		this.exclusionReason = pExclusionReasonType;
	}

	/**
	 * Gets the value for<code>exclusionReason</code>.
	 * <p>
	 * 
	 * @return the current value of <code>exclusionReason</code> property.
	 */
	public String value() {
		return this.exclusionReason;
	}
}
