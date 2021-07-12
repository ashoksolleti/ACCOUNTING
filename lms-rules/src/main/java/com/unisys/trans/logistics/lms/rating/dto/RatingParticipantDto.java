package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.ContactDto;

public class RatingParticipantDto {

	private ContactDto contactDto;

	private String participantAccountNumber;

	private boolean participantGroupIndicator;

	public ContactDto getContactDto() {
		return this.contactDto;
	}

	public String getParticipantAccountNumber() {
		return this.participantAccountNumber;
	}

	public void setContactDto(final ContactDto pContactDto) {
		this.contactDto = pContactDto;
	}

	public void setParticipantAccountNumber(
			final String pParticipantAccountNumber) {
		this.participantAccountNumber = pParticipantAccountNumber;
	}

	public boolean getParticipantGroupIndicator() {
		return this.participantGroupIndicator;
	}

	public void setParticipantGroupIndicator(
			final boolean pParticipantGroupIndicator) {
		this.participantGroupIndicator = pParticipantGroupIndicator;
	}

}
