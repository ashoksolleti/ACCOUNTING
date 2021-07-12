package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum AccountingTriggeringPoints {

	   FLOWN_REVENUE("Flown Revenue"),
	   CASS_BILLING("CASS Billing"),
	   COMMERCIAL_EXPORT_BILLING("Commercial Export Billing"),
	   COMMERCIAL_IMPORT_BILLING("Commercial Import Billing"),
	   INTERLINE_OUTWARD_BILLING("Interline Outward Billing"),
	   INTERLINE_OUTWARD_PROVISION("Interline Outward Provision"),
	   INTERLINE_INWARD_BILLING("Interline Inward Billing"),	   
	   PAYMENT_ENTRIES("Payment Entries"),
	   WRITE_OFF("Write OFF"),
	   ACCRUAL("Accrual"),
	   PAYABLES("Payables"),
	   STATION_CASHIERING("Station Cashiering");
	   
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

	   

	    AccountingTriggeringPoints(final String type) {
	        this.type = type;
	    }

	  
	    public String getType() {
	        return this.type;
	    }
}
