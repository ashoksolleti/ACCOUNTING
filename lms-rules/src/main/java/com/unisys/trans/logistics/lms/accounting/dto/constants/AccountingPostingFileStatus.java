package com.unisys.trans.logistics.lms.accounting.dto.constants;
public enum AccountingPostingFileStatus {

	FILEGENERATIONINITIATED("File Generation Initiated"),
	
	FILEGENERATED("File Generated"),
	
	FILEPOSTINGINITIATED("File Posting Initiated"),
	
	FILEPOSTED("File Posted");
	public String value() {
        return this.name();
    }
    
   
    private final String type;

   

    AccountingPostingFileStatus(final String type) {
        this.type = type;
    }

  
    public String getType() {
        return this.type;
    }
	
}