package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum GLCodeAI {
	
		MAIL_REVENUE("Mail Revenue"),
		CARGO_REVENUE("Cargo Revenue"),
		CARGO_REVENUE_OAL("Cargo Revenue OAL"),
		OUTWARD_BILLING_SUSPENSE_CARGO("Outward Billing Suspense-Cargo"),
		INTERLINE_BILLING_IN_PROVISION_CARGO_ACCOUNT("Interline Billing in Provision Cargo Account"),
		CARGO_RECEIVABLE("Cargo Receivable"),
		MAIL_RECEIVABLES_ACC("Mail Receivables A/C"),
		SUNDRY_DEBTORS_ICH_CARGO("Sundry Debtors ICH Cargo"),
		SUNDRY_DEBTORS_NON_ICH_CARGO("Sundry Debtors Non-ICH Cargo"),
		IATA_CARGO_CLAIMS_CLEARING_ACC("IATA Cargo Claims Clearing A/C"),
		INWARD_BILLED_OAL("Inward Billed OAL"),
		NON_IATA_CARGO_CLAIMS("Non-IATA Cargo Claims"),
		COMMISSION_PAID_TO_BOOKING_AGENT_CARGO("Commission paid to Booking Agents – Cargo"),
	    COMMISSION_EARNED_ON_BOOKINGS_CARGO("Commission earned on Bookings-Cargo");
	
		   public String value() {
		        return this.name();
		    }
		    
		   private final String type;
	
	
		   GLCodeAI(final String pType) {
		        this.type = pType;
		    }
	
		  
		    public String getType() {
		        return this.type;
		    }
}
