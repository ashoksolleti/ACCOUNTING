package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum MemoStatus {
	
	QUEUE("Queue"),
	READY_FOR_INVOICING("Ready for Invoicing"),
	ON_HOLD("On hold"),
	INVOICED_AND_PAYMENT_PENDING("Invoiced and Payment Pending");
	
	private String label;

	public String getLabel() {
		return label;
	}

	MemoStatus(final String label) {
	       this.label=label;
	    }
	
	public String value() {
        return this.name();
    }

}
