package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class StationControlMessageRequest extends AbstractRequest{
	/**
     * Serial version UID.
     */
    private static final long serialVersionUID = -6161186877476150128L;
    
    private String message;
    
    private StationDto stationDto;

    

	public StationDto getStationDto() {
		return stationDto;
	}

	public void setStationDto(StationDto stationDto) {
		this.stationDto = stationDto;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
}
