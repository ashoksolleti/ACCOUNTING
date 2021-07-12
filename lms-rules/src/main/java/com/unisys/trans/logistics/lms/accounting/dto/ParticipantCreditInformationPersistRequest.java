/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;


public class ParticipantCreditInformationPersistRequest extends AbstractRequest {

	private static final long serialVersionUID = 1666021940045876955L;

    /**
     * Attribute to hold <code>participantCreditInfoDto</code> property.
     */
    private ParticipantCreditInfoDto participantCreditInfoDto;

	private String requestXmlAsString;

	public ParticipantCreditInfoDto getParticipantCreditInfoDto() {
		return this.participantCreditInfoDto;
	}

	public void setParticipantCreditInfoDto(ParticipantCreditInfoDto participantCreditInfoDto) {
		this.participantCreditInfoDto = participantCreditInfoDto;
	}

	public String getRequestXmlAsString() {
		return requestXmlAsString;
	}

	public void setRequestXmlAsString(String requestXmlAsString) {
		this.requestXmlAsString = requestXmlAsString;
	}
}
