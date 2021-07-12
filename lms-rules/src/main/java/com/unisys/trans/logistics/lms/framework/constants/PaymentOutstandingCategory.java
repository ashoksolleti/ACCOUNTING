/**
 * 
 */
package com.unisys.trans.logistics.lms.framework.constants;

public enum PaymentOutstandingCategory {
	CATEGORY_ONE("Category One"),
	CATEGORY_TWO("Category Two"),
	CATEGORY_THREE("Category Three"),
	CATEGORY_FOUR("Category Four"),
	CATEGORY_FIVE("Category Five");
	
	private String stringValue;

	/**
	 * @return the stringValue
	 */
	public String getStringValue() {
		return stringValue;
	}

	/**
	 * @param stringValue the stringValue to set
	 */
	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}
	
	PaymentOutstandingCategory(final String type){
		this.stringValue = type;
	}
	
	
}
