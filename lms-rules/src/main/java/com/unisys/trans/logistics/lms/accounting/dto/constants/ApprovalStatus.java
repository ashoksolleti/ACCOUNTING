package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum ApprovalStatus {
	
	APPROVED("Approved"),
	PENDING("Pending Approval");
	
	private String label;

	public String getLabel() {
		return label;
	}

	ApprovalStatus(final String label) {
	       this.label=label;
	    }
	
	public String value() {
        return this.name();
    }

}
