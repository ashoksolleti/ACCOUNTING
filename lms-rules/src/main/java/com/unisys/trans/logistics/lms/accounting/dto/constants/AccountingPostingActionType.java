package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum AccountingPostingActionType {
	
	POST("Post"),
	
	GENERATE("Generate"),
	
	GENERATE_POST("Generate Post"),
	
	FIND("Find");
	 public String value() {
        return this.name();
    }
    
   
    private final String type;

   

    AccountingPostingActionType(final String type) {
        this.type = type;
    }

  
    public String getType() {
        return this.type;
    }
}