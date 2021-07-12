package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum OutstandingAmountLevel {
	AWB("AWB/DCM"),
	PARTICIPANT("Participant"),
	INVOICE("Invoice");
	
	OutstandingAmountLevel(final String type){
		this.stringValue = type;
	}
	
	private String stringValue;

	/**
	 * @return the stringValue
	 */
	public String getStringValue() {
		return stringValue;
	}
	
	public String value() {
		return this.name();
	}
	
	/**
	 * @param stringValue the stringValue to set
	 */
	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}
	
	
}
