/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class ParticipantCreditInformationResponse extends AbstractResponse {

    private static final long serialVersionUID = 1L;
    
    
    private List<ParticipantCreditInfoDto> participantCreditInfoDtos;
    
    private ParticipantCreditInfoDto participantCreditInfoDto;

	private String responseXmlAsString;

	public List<ParticipantCreditInfoDto> getParticipantCreditInfoDtos() {
		return participantCreditInfoDtos;
	}

	public void setParticipantCreditInfoDtos(List<ParticipantCreditInfoDto> participantCreditInfoDtos) {
		this.participantCreditInfoDtos = participantCreditInfoDtos;
	}

	public ParticipantCreditInfoDto getParticipantCreditInfoDto() {
		return participantCreditInfoDto;
	}

	public String getResponseXmlAsString() {
		return responseXmlAsString;
	}

	public void setResponseXmlAsString(String responseXmlAsString) {
		this.responseXmlAsString = responseXmlAsString;
	}

	public void setParticipantCreditInfoDto(ParticipantCreditInfoDto participantCreditInfoDto) {
		this.participantCreditInfoDto = participantCreditInfoDto;
	}


}
