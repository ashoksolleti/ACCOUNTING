package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum BillingCode {

	P("P"),

	C("C");

	private String label;

	BillingCode(final String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public String value() {
		return this.name();
	}

}
