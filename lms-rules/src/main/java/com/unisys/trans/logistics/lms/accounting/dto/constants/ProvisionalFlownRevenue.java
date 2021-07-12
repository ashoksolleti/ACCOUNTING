package com.unisys.trans.logistics.lms.accounting.dto.constants;

	public enum ProvisionalFlownRevenue {
		
		PROVISIONAL("Provisional"),
		FINAL("final");
		  
		   
		   public String value() {
		        return this.name();
		    }
		    
		   
		    private final String type;

		   

		    ProvisionalFlownRevenue(final String type) {
		        this.type = type;
		    }

		  
		    public String getType() {
		        return this.type;
		    }
		    
		 
	}



