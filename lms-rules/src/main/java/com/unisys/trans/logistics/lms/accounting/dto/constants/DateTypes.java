package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum DateTypes {

	AIRWAYBILL_EXECUTION_DATE("E"),
	AIRWAYBILL_CREATION_DATE("C"),
	AIRWAYBILL_FLOWN_DATE("F");
		
	private String stringValue;
	public String getStringValue() {
		return stringValue;
	}
	/**
	 * @param stringValue the stringValue to set
	 */
	public void setStringValue(final String stringValue) {
		this.stringValue = stringValue;
	}
	   
	   
	public String value() {
	    return this.name();
	}
	    
	
	private final String type;
	
	   
	DateTypes(final String type) {
	    this.type = type;
	}
	
	  
	public String getType() {
	    return this.type;
	}
}
