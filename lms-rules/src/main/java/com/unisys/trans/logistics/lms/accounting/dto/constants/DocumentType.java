package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum DocumentType {

	DEBIT("Debit"),
	CREDIT("Credit"),
	INWARD_FLOWN_PROVISION("Inward Flown Provision"),
	TWO("2"),
	IOB_AWB("Outward AWB"),
	IOB_CREDIT("Outward Credit"),
	IOB_BILLING("Outward Billing"),
	IOB_REJECTION("Outward Rejection"),
	IIB_DEBIT("Inward Debit"),
	IIB_CREDIT("Inward Credit");


	private final String type;
	
	DocumentType(final String type)
	{
		this.type=type;
	}
	
	 public String getType() {
	        return this.type;
	    }
}
