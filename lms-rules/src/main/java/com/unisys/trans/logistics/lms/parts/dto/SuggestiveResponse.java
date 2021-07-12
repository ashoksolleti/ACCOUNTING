package com.unisys.trans.logistics.lms.parts.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class SuggestiveResponse extends AbstractResponse{
	
	/**
     * 
     */
    private static final long serialVersionUID = 1L;

    List<ParticipantSearchDto> participantSearchDtos;
	
	List<String> participants;
	
	/*private ParticipantDto participantDto; 

	public SuggestiveResponse() {}

    public ParticipantDto getParticipantDto() {
		return participantDto;
	}

	public void setParticipantDto(ParticipantDto participantDto) {
		this.participantDto = participantDto;
	}*/

	/**
	 * @return the participantSearchDtos
	 */
	public List<ParticipantSearchDto> getParticipantSearchDtos() {
		return participantSearchDtos;
	}

	/**
	 * @param participantSearchDtos the participantSearchDtos to set
	 */
	public void setParticipantSearchDtos(
			List<ParticipantSearchDto> participantSearchDtos) {
		this.participantSearchDtos = participantSearchDtos;
	}

	

	/**
	 * @return the participants
	 */
	public List<String> getParticipants() {
		return participants;
	}

	/**
	 * @param participants the participants to set
	 */
	public void setParticipants(List<String> participants) {
		this.participants = participants;
	}
	

	

}
