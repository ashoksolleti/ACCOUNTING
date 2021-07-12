package com.unisys.trans.logistics.lms.utils.dto;


import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class StationTTYMessageRequest extends AbstractRequest{
	
	/**
     * Serial version UID.
     */
    private static final long serialVersionUID = -6161186877476150127L;
    
    private String message;

    private StationTTYMessageDto stationTTYMessageDto;
    
    private String actionType;

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

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
	 * @return the actionType
	 */
	public String getActionType() {
		return actionType;
	}

	/**
	 * @param actionType the actionType to set
	 */
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}
   
}
