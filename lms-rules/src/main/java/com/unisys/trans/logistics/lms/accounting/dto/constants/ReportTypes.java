/**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.dto.constants;

/**
 * @author KurmalNG
 *
 */
public enum ReportTypes {
	TRIAL("Trial Balance Report"),
	OUTSTANDING("Outstanding Balance Report");
	
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
	ReportTypes(final String type) {
		this.type = type;
	}
}
