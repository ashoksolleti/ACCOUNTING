package com.unisys.trans.logistics.lms.rating.dto.constants;

public enum PricingBookingSourceType {
	
	ENTERPRISE("E"),
	FFR("F"),
	XML("X"),
	CPS("S"),
	PORTAL("P");
	
private String source;
	
	PricingBookingSourceType(final String psource){
		this.setSource(psource);
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public static PricingBookingSourceType fromValue(final String pValue) {
        return valueOf(pValue);
    }

	 public static PricingBookingSourceType getPricingBookingSourceType(
             final String pPricingBookingSourceType) {

		 PricingBookingSourceType anPricingBookingSourceType = null;

     for (final PricingBookingSourceType aType : PricingBookingSourceType.values()) {
         if (pPricingBookingSourceType.equals(aType.value())) {
             anPricingBookingSourceType = aType;
             break;
         }
     }
     return anPricingBookingSourceType;
 }
	 
	    public String value() {
	        return this.source;
	    }

}
