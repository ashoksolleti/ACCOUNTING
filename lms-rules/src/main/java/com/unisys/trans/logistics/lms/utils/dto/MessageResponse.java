package com.unisys.trans.logistics.lms.utils.dto;

import java.util.List;

public class MessageResponse {
	
	private List<MessageDto> messageDtos;

	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<MessageDto> getMessageDtos() {
		return messageDtos;
	}

	public void setMessageDtos(List<MessageDto> messageDtos) {
		this.messageDtos = messageDtos;
	}

	
}
