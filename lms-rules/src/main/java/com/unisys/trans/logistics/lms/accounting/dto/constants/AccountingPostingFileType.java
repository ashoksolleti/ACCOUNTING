package com.unisys.trans.logistics.lms.accounting.dto.constants;
public enum AccountingPostingFileType {
	
	AR("AR"),
	
	GL("GL"),
	
	SAP("SAP"),
	
	GSTR1("GSTR1");
	
	 public String value() {
        return this.name();
    }
    
   
    private final String type;

    AccountingPostingFileType(final String type) {
        this.type = type;
    }

  
    public String getType() {
        return this.type;
    }
}