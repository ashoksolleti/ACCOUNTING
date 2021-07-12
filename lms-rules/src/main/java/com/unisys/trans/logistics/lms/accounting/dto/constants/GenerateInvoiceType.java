package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum GenerateInvoiceType {

	   VIEW("View"),
	   REGEN("Re-generate"),
	   NEW("New");
	
	
	 public String value() {
	        return this.name();
	    }
	    
	   
	    private final String type;

	   

	    GenerateInvoiceType(final String type) {
	        this.type = type;
	    }

	  
	    public String getType() {
	        return this.type;
	    }
}
