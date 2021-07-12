package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum AccountingPostingErrorType {
	
	Invoice_Date_Null("Invoice Date Null"),
	Document_Date_Null("Document Date Null"),
	Missing_Vendor_Invoice_tag_OAC_inward("Missing Vendor Invoice tag, inward"),
	Missing_Account_no_for_Vendor_tag("Missing Account no for Vendor tag"),
	Duplication_of_entries_in_SAP("Duplication of entries in SAP"),
	Reference_tag_for_vendor_invoice("Reference tag for vendor invoice");
	
	public String value() {
		return this.name();
	}
	
	private final String type;
	
	AccountingPostingErrorType(final String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
}