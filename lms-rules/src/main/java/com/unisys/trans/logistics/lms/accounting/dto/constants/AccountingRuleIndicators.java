package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum AccountingRuleIndicators {
	FLOWN_REVENUE("Flown Revenue"),
	   RM("Rejection Memos"),
	   DCM("Debit Credit Memo"),
	   AWB("AirWayBill"),
	   FR("Flown Revenue"),
	   GSA_AGREEMENT("GSA Commission"),
	   GHA_AGREEMENT("GHA Fees"),
	   PICK_UP_CHARGES("Pick-up Operator Fees"),
	   DELIVERY_CHARGES("Delivery Operator Fees"),
	   INV("INV"),
	   AWBDCM("AWBDCM"),
	   BM("Billing Memos"),
	   CM("Credit Memos"),
	   BM_CM_PROVISION("BM CM Provision"),
       BM_CM_ISC_PROVISION("BM CM ISC Provision"),
	   BM_CM_BILLING("BM CM Billing"),
	   AGENT_COMMISSION("Agent Commission"),
	   ISC_COMMISSION("ISC Commission"),
	   COMMISSION_AWB("Commission AWB"),
	   COMMISSION_DCM("Commission DCM");
	   
	   public String value() {
	        return this.name();
	    }
	    
	   private final String type;


	    AccountingRuleIndicators(final String pType) {
	        this.type = pType;
	    }

	  
	    public String getType() {
	        return this.type;
	    }
}
