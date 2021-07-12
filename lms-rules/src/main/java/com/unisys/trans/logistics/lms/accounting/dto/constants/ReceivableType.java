package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum ReceivableType {

	/**
	 * Indicates that the ReceivableType is Prepaid Receivable.
	 */
	PREPAID_RECEIVABLE("Prepaid Receivable"),
	/**
	 * Indicates that the ReceivableType is Collect Receivable.
	 */
	COLLECT_RECEIVABLE("Collect Receivable");

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
	ReceivableType(final String pValue) {
		this.val = pValue;
	}

	/**
	 * Gets the <code>AccountRegionType</code>.
	 * <p>
	 * 
	 * @param pAccountRegionType
	 *            holds the new value of <code>ReceivableType</code>
	 *            <p>
	 * @return the value of <code>AccountRegionType</code>
	 */
	public static ReceivableStatusType getPaymentStatusType(
			final String pPaymentStatusType) {

		ReceivableStatusType aMatchedPaymentStatusType = null;

		for (final ReceivableStatusType aType : ReceivableStatusType.values()) {

			if (pPaymentStatusType.equals(aType.getVal())) {
				aMatchedPaymentStatusType = aType;
				break;
			}
		}

		return aMatchedPaymentStatusType;

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
	 * Gives the string format of enumerated <code>ReceivableType</code>.
	 * <p>
	 * 
	 * @return the current value of the <code>ReceivableType</code>
	 */
	public String value() {
		return this.name();
	}

}
