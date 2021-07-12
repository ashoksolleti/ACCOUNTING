package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class ParticipantAgreementsPersistRequest extends AbstractRequest{
	
private static final long serialVersionUID = 1L;
	
    private ParticipantAgreementsDetailDto participantAgreementsDetailDto = new ParticipantAgreementsDetailDto();
	private List<ParticipantAgreementsDetailDto> participantAgreementsDetailDtos = new ArrayList<ParticipantAgreementsDetailDto>();
	  /**
     * Attribute to hold the <code>interlineAgreementsEntryDto</code> property.
     */
    private TDSAgreementsParticipantDto agreementsParticipantsDto;

    /**
     * Attribute to hold the list of <code>interlineAgreementsEntryDtos</code> object.
     */
    private List<TDSAgreementsParticipantDto> agreementsParticipantsDtos;
	private List<ParticipantAgreementsDetailDto> deleteAgreementsListDtos = new ArrayList<ParticipantAgreementsDetailDto>();
	
	private ParticipantAgreementsDetailDto modifiedParticipantAgreementDetailDto;	
	
	public ParticipantAgreementsDetailDto getModifiedParticipantAgreementDetailDto() {
		return modifiedParticipantAgreementDetailDto;
	}
	public void setModifiedParticipantAgreementDetailDto(
			ParticipantAgreementsDetailDto modifiedParticipantAgreementDetailDto) {
		this.modifiedParticipantAgreementDetailDto = modifiedParticipantAgreementDetailDto;
	}
	public ParticipantAgreementsDetailDto getParticipantAgreementsDetailDto() {
		return participantAgreementsDetailDto;
	}
	public void setParticipantAgreementsDetailDto(ParticipantAgreementsDetailDto participantAgreementsDetailDto) {
		this.participantAgreementsDetailDto = participantAgreementsDetailDto;
	}
	public List<ParticipantAgreementsDetailDto> getParticipantAgreementsDetailDtos() {
		return participantAgreementsDetailDtos;
	}
	public void setParticipantAgreementsDetailDtos(List<ParticipantAgreementsDetailDto> participantAgreementsDetailDtos) {
		this.participantAgreementsDetailDtos = participantAgreementsDetailDtos;
	}
	public TDSAgreementsParticipantDto getAgreementsParticipantsDto() {
		return agreementsParticipantsDto;
	}
	public void setAgreementsParticipantsDto(TDSAgreementsParticipantDto agreementsParticipantsDto) {
		this.agreementsParticipantsDto = agreementsParticipantsDto;
	}
	public List<TDSAgreementsParticipantDto> getAgreementsParticipantsDtos() {
		return agreementsParticipantsDtos;
	}
	public void setAgreementsParticipantsDtos(List<TDSAgreementsParticipantDto> agreementsParticipantsDtos) {
		this.agreementsParticipantsDtos = agreementsParticipantsDtos;
	}
	public List<ParticipantAgreementsDetailDto> getDeleteAgreementsListDtos() {
		return deleteAgreementsListDtos;
	}
	public void setDeleteAgreementsListDtos(List<ParticipantAgreementsDetailDto> deleteAgreementsListDtos) {
		this.deleteAgreementsListDtos = deleteAgreementsListDtos;
	}
	
	 private boolean checkEffDateOnUpdate = false;   
		
		/**
		 * @return the checkEffDateOnUpdate
		 */
		public boolean isCheckEffDateOnUpdate() {
			return checkEffDateOnUpdate;
		}
		/**
		 * @param checkEffDateOnUpdate the checkEffDateOnUpdate to set
		 */
		public void setCheckEffDateOnUpdate(boolean checkEffDateOnUpdate) {
			this.checkEffDateOnUpdate = checkEffDateOnUpdate;
		}
	
}
