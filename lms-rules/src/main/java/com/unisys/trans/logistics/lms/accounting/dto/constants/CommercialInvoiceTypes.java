/**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.dto.constants;

/**
 * @author KurmalNG
 *
 */

public enum CommercialInvoiceTypes {
	PAYABLES("Payables"),
	RECIEVABLES("Recievables");
	
	private String stringValue;
	private final String type;

	public String getStringValue() {
		return stringValue;
	}

	/**
	 * @param stringValue
	 *            the stringValue to set
	 */
	public void setStringValue(final String stringValue) {
		this.stringValue = stringValue;
	}

	public String value() {
		return this.name();
	}
	CommercialInvoiceTypes(final String type) {
		this.type = type;
	}
}
