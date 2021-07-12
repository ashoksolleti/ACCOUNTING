package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum PartShipmentIndicator {
	
	PART("P");
    
	private String label;


	PartShipmentIndicator(final String label) {
		this.label = label;
	}

	
	public String getLabel() {
		return label;
	}

	public String value() {
		return this.name();
	}
}
