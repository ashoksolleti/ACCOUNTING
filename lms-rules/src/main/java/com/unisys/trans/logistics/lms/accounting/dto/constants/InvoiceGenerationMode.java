package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum InvoiceGenerationMode {
	   BATCH("Batch"),
	   ONDEMAND("On-Demand"),
	   MANUAL("Manual");
	   
	   
	   public String value() {
	        return this.name();
	    }
	    
	   
	    private final String type;

	   

	    InvoiceGenerationMode(final String type) {
	        this.type = type;
	    }

	  
	    public String getType() {
	        return this.type;
	    }
	    
	 
}