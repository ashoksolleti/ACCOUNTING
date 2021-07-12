package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum CommissionType {
	/**
	 * percentage.
	 */
	PERCENTAGE("Percentage"),
	/**
	 * flat.
	 */
	FLAT("Flat"),

	/**
	 * Rate.
	 */
	RATE("Rate"),

    /**
     * Sliding scale.
     */
    SLIDING_SCALE("Sliding scale");
    
	/**
	 * Attribute to hold <code>commissionType</code> property.
	 */
	private String commissionType;

	/**
	 * Constructor with CommissionType as an argument.
	 * <p>
	 * 
	 * @param pType
	 *            <code>String</code> Holds the CommissionType.
	 */

	CommissionType(final String pType) {
		this.commissionType = pType;
	}

	/**
	 * This method <code>getCommission</code> returns the commission type.
	 * <p>
	 * 
	 * @param pCommissionType
	 *            <code>String</code><br>
	 *            The value of commission type.
	 *            <p>
	 * @return <code>
	 *         {@link com.unisys.trans.logistics.lms.parts.dto.constants.CommissionType
	 *         CommissionType}</code><br>
	 *         Returns the enumerated value of the Commission Type.
	 */
	public static CommissionType getCommission(final String pCommissionType) {

		CommissionType aCommissionType = null;

		for (final CommissionType aType : CommissionType.values()) {

			if (pCommissionType.equals(aType.value())) {
				aCommissionType = aType;
				break;
			}
		}

		return aCommissionType;

	}

	public String getCommissionType() {
		return this.commissionType;
	}

	public void setCommissionType(final String pCommissionType) {
		this.commissionType = pCommissionType;
	}

	/**
	 * The <code>value</code> method gives the string format of commission type.
	 * <p>
	 * 
	 * @return <code>String</code><br>
	 *         Returns the enumerated value of the commission type.
	 */
	public String value() {
		return this.commissionType;
	}
}
