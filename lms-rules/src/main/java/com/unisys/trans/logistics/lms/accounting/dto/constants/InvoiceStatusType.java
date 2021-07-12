package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum InvoiceStatusType {

	
	   DRAFT("Draft"),
	   PRELIMINARY("Preliminary"),
	   FINAL("Final"),
	   FILEGENERATED("File Generated"),
	   FILESENT("File Sent"),
	   ARCHIVED("Archived"),
	   EMAILSENT("Email Sent");
	     
	   
	   public String value() {
	        return this.name();
	    }
	    
	   
	    private final String type;

	   

	    InvoiceStatusType(final String type) {
	        this.type = type;
	    }

	  
	    public String getType() {
	        return this.type;
	    }
	    
	 
}
