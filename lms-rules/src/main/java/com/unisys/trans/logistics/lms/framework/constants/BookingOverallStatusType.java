package com.unisys.trans.logistics.lms.framework.constants;

public enum BookingOverallStatusType {

	C("All Confirmed"),
	N("Check Segments");	
	
    BookingOverallStatusType(String pOverallStatus) {
		this.setOverallStatus(pOverallStatus);
	}
	
	private String overallStatus;

	
	public static String getStatus(String pOverallStatus) {
		
		String overallStatus = null;
		
		if(pOverallStatus != null) {
			for(BookingOverallStatusType statusType : BookingOverallStatusType.values()) {
				if(statusType.name().equalsIgnoreCase(pOverallStatus)) {
					overallStatus = statusType.getOverallStatus();
				}
			}
		}
		return overallStatus;
	}


	/**
	 * @return the overallStatus
	 */
	public String getOverallStatus() {
		return overallStatus;
	}


	/**
	 * @param overallStatus the overallStatus to set
	 */
	public void setOverallStatus(String overallStatus) {
		this.overallStatus = overallStatus;
	}

}
