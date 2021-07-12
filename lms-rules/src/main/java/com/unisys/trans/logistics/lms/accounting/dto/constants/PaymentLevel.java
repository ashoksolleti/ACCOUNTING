package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum PaymentLevel {
	 INVOICE("Invoice"),
	 AWB("AWB");
	
	  private final String type;
	  
	  private String stringValue;

	public String getStringValue() {
		return stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}

	public String getType() {
		return type;
	}

	private PaymentLevel(String type) {
		this.type = type;
	}
	  
	
	

}
