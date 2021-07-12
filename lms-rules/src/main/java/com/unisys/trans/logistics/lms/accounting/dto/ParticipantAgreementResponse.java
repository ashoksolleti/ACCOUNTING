/**
 *
 */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.constants.ActionType;
import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author KV5
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class ParticipantAgreementResponse extends AbstractResponse{
	/**
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
    /**
     * Unique serial version UID.
     */
	private static final long serialVersionUID = 1L;
	private ActionType actionType;
	 /**
     * Attribute to hold the <code>interlineAgreementsDto</code> object.
     */
    private ParticipantAgreementsDetailDto participantAgreementsDetailDto;

    /**
     * Attribute to hold the <code>interlineAgreementsDtos</code> object.
     */
    private List<ParticipantAgreementsDetailDto> participantAgreementsDetailDtos;

    /**
     * Attribute to hold the <code>interlineAgreementsEntryDto</code> property.
     */
    private TDSAgreementsParticipantDto agreementsParticipantsDto;

    /**
     * Attribute to hold the list of <code>interlineAgreementsEntryDtos</code> object.
     */
    private List<TDSAgreementsParticipantDto> agreementsParticipantsDtos;

    /**
     * Attribute to hold <code>InterlineAgreementsFindDto</code> property.
     */
    private ParticipantAgreementsFindDto participantAgreementsFindDto;
    
    private boolean hideFilter;
    
    private boolean clearFilter;
    
    private boolean error;    

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
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

	public ParticipantAgreementsFindDto getParticipantAgreementsFindDto() {
		return participantAgreementsFindDto;
	}

	public void setParticipantAgreementsFindDto(ParticipantAgreementsFindDto participantAgreementsFindDto) {
		this.participantAgreementsFindDto = participantAgreementsFindDto;
	}
	
	
    
	public boolean isHideFilter() {
		return hideFilter;
	}

	public void setHideFilter(boolean hideFilter) {
		this.hideFilter = hideFilter;
	}

	public boolean isClearFilter() {
		return clearFilter;
	}

	public void setClearFilter(boolean clearFilter) {
		this.clearFilter = clearFilter;
	}	
	

	public ActionType getActionType() {
		return actionType;
	}

	public void setActionType(ActionType actionType) {
		this.actionType = actionType;
	}
    
}