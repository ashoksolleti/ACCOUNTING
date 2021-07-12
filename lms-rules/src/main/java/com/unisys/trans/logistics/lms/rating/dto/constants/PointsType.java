package com.unisys.trans.logistics.lms.rating.dto.constants;

public enum PointsType {
	/**
	 * Attribute to hold <code>BASE</code> property.
	 */
	BASE,
	/**
	 * Attribute to hold <code>BONUS</code> property.
	 */
	BONUS;
	
	public String value() {
		return name();
	}

	public static PointsType fromValue(String v) {
		return valueOf(v);
	}

}
