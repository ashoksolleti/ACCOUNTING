package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum ReceivableStatusType {

	/**
	 * Indicates that the ReceivableStatusType is Ready For Invoicing.
	 */
	READY_FOR_INVOICING("Ready for Invoicing"),//

	IN_PROGRESS("In Progress"),
	
	//lavanya
	/**
	 * Indicates that the ReceivableStatusType is On hold.
	 */
	ON_HOLD("On hold"),
	/**
	 * Indicates that the ReceivableStatusType is Invoiced and Payment Pending.
	 */
	INVOICED_AND_PAYMENT_PENDING("Invoiced and Payment Pending"),
	/**
	 * Indicates that the ReceivableStatusType is Station Cash Payment
	 * Completed.
	 */
	STATION_CASH_PAYMENT_COMPLETED("Station Cash Payment Completed"),
	/**
	 * Indicates that the ReceivableStatusType is Invoice Payment Completed.
	 */
	INVOICE_PAYMENT_COMPLETED("Invoiced Payment Completed"),
	/**
	 * Indicates that the ReceivableStatusType is Invoice Payment Partially
	 * Received.
	 */
	INVOICE_PAYMENT_PARTIALLY_RECEIVED("Invoiced Payment Partially Received"),
	/**
	 * Indicates that the ReceivableStatusType is Payment Received.
	 */
	PAYMENT_RECEIVED("Payment Received"),
	
	/**
	 * Indicates that ReceivableStatusType is Payment Writtern Off
	 */

	PAYMENT_WRITTEN_OFF("Payment Written Off"),
	
	//Deeps
	/**
	 * Indicates that ReceivableStatusType is Payment Writtern Off
	 */

	INVOICE_ON_HOLD("Invoice onHold"),
	
	READY_FOR_APPROVAL("Ready for Approval"),
	
	READY_FOR_PAYMENTS("Ready for Payments");
	
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
	ReceivableStatusType(final String pValue) {
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
	public static ReceivableStatusType getReceivableStatusType(
			final String pReceivableStatusType) {

		ReceivableStatusType aMatchedReceivableStatusType = null;

		for (final ReceivableStatusType aType : ReceivableStatusType.values()) {

			if (pReceivableStatusType.equals(aType.getVal())) {
				aMatchedReceivableStatusType = aType;
				break;
			}
		}

		return aMatchedReceivableStatusType;

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
