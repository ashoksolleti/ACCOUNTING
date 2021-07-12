package com.unisys.trans.logistics.lms.framework.constants;

public enum BookingQueueReasonType {

    A("All"),
	C("Capacity"),
	
	L("Loadability Dimensions"),
	F("Flight Booking Restrictions"),
	H("Hurdle Rate"),
	T("Insufficient Connection Time"),
	S("Special Handling Code"),
	R("Station Restrictions"),
	D("Density Check"),
	M("Multiple"),
	W("FWB/XFWB BOOKING PCS/WGT/VOL CHANGE");	
	
	BookingQueueReasonType(String pReasonDesc) {
		
		this.reason=pReasonDesc;
	}
	
	private String reason;

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	
	public static String getReason(String pReasonCode) {
		
		String reasonDesc = null;
		
		if(pReasonCode != null) {
			for(BookingQueueReasonType reasonType : BookingQueueReasonType.values()) {
				if(reasonType.name().equalsIgnoreCase(pReasonCode)) {
				
					reasonDesc = reasonType.getReason();
				}
			}
		}
		return reasonDesc;
	}
}
