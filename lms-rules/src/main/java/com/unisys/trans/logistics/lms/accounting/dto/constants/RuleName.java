package com.unisys.trans.logistics.lms.accounting.dto.constants;

// created this as part of RFC UIS 117
public enum RuleName {

	ACCOUNTING_INTERLINE_PROVISION("Accounting Interline Provision"),
	BANC_ACC("Bank Acc"),
	AGENT_DEBTOR("Agent Debtor"),
	INTERLINE_DEBTOR("Interline Debtor"),
	INWARD_PROVISION("InwardProvision"),
	OUTWARD_PROVISION("OutwardProvision"),
	FLOWN_REVENUE("FlownRevenue"),
	ACCOUNTING_FLOWN_REVENUE("Accounting Flown Revenue"),
	COMMISSION_EXPENSE("Commission Expense"),
	AGENT_COMMISSION("AGENTCOMMISSION"),
	ISC_COMMISSION("ISCCOMMISSION");
	
	private String stringValue;
	   public String getStringValue() {
			return stringValue;
		}
		/**
		 * @param stringValue the stringValue to set
		 */
		public void setStringValue(final String stringValue) {
			this.stringValue = stringValue;
		}
	   
	   
	   public String value() {
	        return this.name();
	    }
	    
	   
	    private final String type;

	   

	    RuleName(final String type) {
	        this.type = type;
	    }

	  
	    public String getType() {
	        return this.type;
	    }
	
	
}
