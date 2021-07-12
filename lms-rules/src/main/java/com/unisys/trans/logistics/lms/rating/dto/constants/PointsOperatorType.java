package com.unisys.trans.logistics.lms.rating.dto.constants;

public enum PointsOperatorType {
	
	
	/**
	 * Attribute to hold <code>ADD</code> property.
	 */
	ADD, 
	 /**
     * Attribute to hold <code>SUBTRACT</code> property.
     */
	SUBTRACT;

	
	public String value() {
		return name();
	}

	public static PointsOperatorType fromValue(String v) {
		return valueOf(v);
	}
}
