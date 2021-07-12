package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum UnitOfWieght {
	KG("K", "Kg"),
    LB("L", "Lb");
    
	private String type, value;


	UnitOfWieght(final String type, final String value) {
		this.type = type;
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public String getValue() {
		return value;
	}

	public String value() {
		return type;
	}
}
