package com.unisys.trans.logistics.lms.framework.constants;

public enum GlAccountType {
	
	
	 PROFIT_AND_LOSS("Profit and Loss"),
	 
	 BALANCE_SHEET_ACCOUNT("Balance Sheet"),

	 SUSPENSE("Suspense");
	
	/**
     * Attribute to hold the <code>label</code> property.
     */
    private String label;

	/**
     * Attribute to hold the <code>string value</code> property.
     */
    private String stringValue;
    
    private GlAccountType(String label, String stringValue) {
		this.label = label;
		this.stringValue = stringValue;
	}
    
    private GlAccountType(String stringValue) {
		this.stringValue = stringValue;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getStringValue() {
		return stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}
	
	public static GlAccountType getGlAccountType(
	            final String pGlAccountType) {
	
		GlAccountType aGlAccountType = null;
	
	    for (final GlAccountType aType : GlAccountType.values()) {
	
	        if (pGlAccountType.equals(aType.getStringValue())) {
	        	aGlAccountType = aType;
	            break;
	        }
	    }
	    return aGlAccountType;
	}

}
