/**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.dto.constants;

/**
 * @author KurmalNG
 *
 */
public enum ReportConsolidationTypes {
	AWB("AWB"), 
	GLACC("GL Account Number"), 
	ACCPERIOD("Account Period");

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

	ReportConsolidationTypes(final String type) {
		this.type = type;
	}
}
