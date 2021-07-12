package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum ReceivableAmountType {
	/**
	 * Indicates that the ReceivableAmountType is Other Charge.
	 */
	OTHER_CHARGE("Other Charge"),
	/**
	 * Indicates that the ReceivableAmountType is Valution Charge.
	 */
	VALUATION_CHARGE("Valution Charge"),
	/**
	 * Indicates that the ReceivableAmountType is VAT.
	 */
	VAT("VAT"),
	/**
	 * Indicates that the ReceivableAmountType is Weight Charge.
	 */
	WEIGHT_CHARGE("Weight Charge");

	/**
	 * Attribute to hold the <code>val</code> property.
	 */
	private String val;

	/**
	 * Parameterize constructor.
	 * 
	 * @param pValue
	 *            the value.
	 */
	ReceivableAmountType(final String pValue) {
		this.val = pValue;
	}

	/**
	 * Gets the <code>aReceivableStatusType</code>.
	 * <p>
	 * 
	 * @param pReceivableStatusType
	 *            holds the new value of <code>aReceivableStatusType</code>
	 *            <p>
	 * @return the value of <code>aReceivableStatusType</code>
	 */
	public static ReceivableAmountType getReceivableAmountType(
			final String pReceivableAmountType) {

		ReceivableAmountType aMatchedReceivableAmountType = null;

		for (final ReceivableAmountType aType : ReceivableAmountType.values()) {

			if (pReceivableAmountType.equals(aType.getVal())) {
				aMatchedReceivableAmountType = aType;
				break;
			}
		}

		return aMatchedReceivableAmountType;

	}

	/**
	 * Gets the <code>val</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>val</code> property.
	 */
	public String getVal() {
		return this.val;
	}

	/**
	 * Sets the <code>val</code> property.
	 * <p>
	 * 
	 * @param pVal
	 *            the new value of the <code>val</code> property.
	 */
	public void setVal(final String pVal) {
		this.val = pVal;
	}

	/**
	 * Gives the string format of enumerated <code>AccountRegionType</code>.
	 * <p>
	 * 
	 * @return the current value of the <code>AccountRegionType</code>
	 */
	public String value() {
		return this.name();
	}

}