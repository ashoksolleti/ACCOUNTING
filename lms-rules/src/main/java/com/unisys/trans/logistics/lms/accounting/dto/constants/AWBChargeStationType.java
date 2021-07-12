package com.unisys.trans.logistics.lms.accounting.dto.constants;


public enum AWBChargeStationType {

 EXPORT("EXPORT"),

 IMPORT("IMPORT");
 

 /**
	 * Attribute to hold <code>awbChargeStationType</code> property.
	 */
	private String awbChargeStationType;

	/**
	 * Constructor with AWBChargeStationType as an argument.
	 * <p>
	 * 
	 * @param pType
	 *            <code>String</code> Holds the AWBChargeStationType.
	 */

	AWBChargeStationType(final String pType) {
		this.awbChargeStationType = pType;
	}

	public static AWBChargeStationType getStation(final String pAWBChargeStationType) {

		AWBChargeStationType aAWBChargeStationType = null;

		for (final AWBChargeStationType aType : AWBChargeStationType.values()) {

			if (pAWBChargeStationType.equals(aType.value())) {
				aAWBChargeStationType = aType;
				break;
			}
		}

		return aAWBChargeStationType;

	}

	public String getAWBChargeStationType() {
		return this.awbChargeStationType;
	}

	public void setAWBChargeStationType(final String pAWBChargeStationType) {
		this.awbChargeStationType = pAWBChargeStationType;
	}

	/**
	 * The <code>value</code> method gives the string format of station type.
	 * <p>
	 * 
	 * @return <code>String</code><br>
	 *         Returns the enumerated value of the station type.
	 */
	public String value() {
		return this.awbChargeStationType;
	}
}
