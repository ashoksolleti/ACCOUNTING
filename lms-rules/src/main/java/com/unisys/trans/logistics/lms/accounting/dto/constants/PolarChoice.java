package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum PolarChoice {

	YES("Yes"),
    NO("No");
    
	private String label;


	PolarChoice(final String label) {
		this.label = label;
		
	}

	public String getLabel() {
		return this.label ;
	}

	public String value() {
		return this.name();
	}
}
