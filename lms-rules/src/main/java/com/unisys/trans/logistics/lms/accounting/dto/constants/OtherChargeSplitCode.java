package com.unisys.trans.logistics.lms.accounting.dto.constants;


public enum OtherChargeSplitCode {

	MY("MY"),
	SC("SC"),
	VS("VS"),
	VT("VT");
	  
	   public String value() {
	        return this.name();
	    }
	    
	    private final String type;

	    OtherChargeSplitCode(final String pType) {
	        this.type = pType;
	    }

	    public String getType() {
	        return this.type;
	    }
	 
}

