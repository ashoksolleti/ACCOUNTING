package com.unisys.trans.logistics.lms.framework.constants;


public enum PieceStatusChangeType {
	
	AIRLINE_HOLD("Airline Hold"),
	
    AUTHORIZED_HOLD("Authorized Hold"),
	IN_CARRIER_HOLD("In Carrier Hold"),
	
    REMOVED_FROM_HOLD("Removed From Hold"),
    
    GONE_ON_DELIVERY("Gone On Delivery"),
    
    NOTIFY("Notify"),
   
    RETURNED_FROM_DELIVERY("Returned From Delivery"),
    
    BONDED_WAREHOUSE("Bonded Warehouse"),
    
	TRANSFER_TO_BONDED("Transfer To Bonded"),
    
    DELIVERED_ON_SUB_AWB("Delivered on Sub AWB"),
   
    DELIVERED("Delivered"),
	DELIVER("Deliver"),
   
    TRANSFERRED_INTERLINE("Transferred Interline"),
    
    TRANSFERRED_SURFACE("Transferred Surface"),
   
    NOT_DELIVERABLE("Not Deliverable"),
   
    TRANSFERRED_TO_CUSTOMS("Transferred To Customs"),
    
    REJECTED_SCREENING("Rejected Screening"),
    
    IN_CUSTOMS("In Customs"),
    
    IN_CUSTOMS_HOLD("In Customs Hold"),
    
	CLEAR_CARRIER_HOLD("Clear Carrier Hold"),
	
	INBOND_MOVEMENT("Inbond Movement"),
	
	NON_DELIVERABLE("Non Deliverable"),
	
	OUT_FOR_DELIVERY("Out For Delivery"),
	
    CLEARED_CUSTOMS("Cleared Customs");
	
	    private final String value;

	    PieceStatusChangeType(String v) {
	        value = v;
	    }

	    public String value() {
	        return value;
	    }

	    public static PieceStatusChangeType fromValue(String v) {
	    	
	        for (PieceStatusChangeType c: PieceStatusChangeType.values()) {
	            if (c.value.equals(v)) {
	                return c;
	            }
	        }
	       return null;
	    }

}
