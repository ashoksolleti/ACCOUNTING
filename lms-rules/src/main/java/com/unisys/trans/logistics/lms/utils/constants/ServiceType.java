package com.unisys.trans.logistics.lms.utils.constants;

public enum ServiceType {

	XMLPOST(1),
	EUCUSTOM(2);
	
	private int value;
	ServiceType(final int pValue){
		setValue(pValue);
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}
