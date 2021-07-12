package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.utils.dto.OfficeQueueItemDto;

public class AirWaybillQueueDto extends OfficeQueueItemDto{

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;
    
	private String airWaybillNumber;
	
	private String origin;
	
	private String destination;

	public String getAirWaybillNumber() {
		return this.airWaybillNumber;
	}

	public void setAirWaybillNumber(final String pAirWaybillNumber) {
		this.airWaybillNumber = pAirWaybillNumber;
	}

	public String getOrigin() {
		return this.origin;
	}

	public void setOrigin(final String pOrigin) {
		this.origin = pOrigin;
	}

	public String getDestination() {
		return this.destination;
	}

	public void setDestination(final String pDestination) {
		this.destination = pDestination;
	}
	
}
