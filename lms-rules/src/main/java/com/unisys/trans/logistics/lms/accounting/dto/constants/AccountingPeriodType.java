package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum AccountingPeriodType {

	    GLP("General Ledger Period"),
	    PP("Payment Period");

	  
	  
	    public String value() {
	        return this.name();
	    }
	    
	   
	    private final String type;

	   

	    AccountingPeriodType(final String type) {
	        this.type = type;
	    }

	  
	    public String getType() {
	        return this.type;
	    }
}
