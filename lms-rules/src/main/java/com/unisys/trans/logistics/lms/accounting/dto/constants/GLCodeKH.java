package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum GLCodeKH {
	
	FLOWN_REVENUE("Flown Revenue"),
	FLOWN_OUTWARD_PROVISION("Outward Provision"),
	FLOWN_INWARD_PROVISION("Inward Provision"),
	AGENT_DEBTOR("Agent Debtor"),
	OUTWARD_BILLING_DEBTOR("Outward Billing Debtor"),
	BANK_ACCOUNT("Bank Account"),
	ADVANCE_PAYMENT("Advance Payment"),
	INWARD_BILLED_OAL("Inward Billed OAL");
	

	   public String value() {
	        return this.name();
	    }
	    
	   private final String type;


	   GLCodeKH(final String pType) {
	        this.type = pType;
	    }

	  
	    public String getType() {
	        return this.type;
	    }
}
