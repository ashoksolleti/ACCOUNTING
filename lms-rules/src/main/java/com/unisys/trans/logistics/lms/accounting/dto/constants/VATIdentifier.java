package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum VATIdentifier {

	WC("Weight Charge"),
	VA("Val Charge"),
	OC("Other Charge"),
	IS ("ISC"),
    OT("Others");
    
	private String label;

	VATIdentifier(final String label) {
		this.label = label;
	}	
	
	public String getLabel() {
		return label;
	}

	public String value() {
		return this.name();
	}
}
