package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum ReceivableDueType {
	/**
	 * Indicates that the ReceivableDueType is Agent.
	 */
	AGENT("Agent"),
	/**
	 * Indicates that the ReceivableDueType is Carrier.
	 */
	CARRIER("Carrier");

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
	ReceivableDueType(final String pValue) {
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
	public static ReceivableDueType getReceivableDueType(
			final String pReceivableAmountType) {

		ReceivableDueType aMatchedReceivableDueType = null;

		for (final ReceivableDueType aType : ReceivableDueType.values()) {

			if (pReceivableAmountType.equals(aType.getVal())) {
				aMatchedReceivableDueType = aType;
				break;
			}
		}

		return aMatchedReceivableDueType;

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
