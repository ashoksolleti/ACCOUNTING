package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class StationTTYMessageResponse extends AbstractResponse {
	private StationTTYMessageDto stationTTYMessageDto;
	private String responseCode;
	/**
	 * @return the stationTTYMessageDto
	 */
	public StationTTYMessageDto getStationTTYMessageDto() {
		return stationTTYMessageDto;
	}
	/**
	 * @param stationTTYMessageDto the stationTTYMessageDto to set
	 */
	public void setStationTTYMessageDto(StationTTYMessageDto stationTTYMessageDto) {
		this.stationTTYMessageDto = stationTTYMessageDto;
	}
	/**
	 * @return the responseCode
	 */
	public String getResponseCode() {
		return responseCode;
	}
	/**
	 * @param responseCode the responseCode to set
	 */
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	} 

}
