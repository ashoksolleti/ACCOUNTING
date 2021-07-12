package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.constants.ActionType;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class ManualAdjustmentPersistRequest extends AbstractRequest {
    

    /**
     * Unique version generated.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold the <code>interlineAgreementsDto</code> object.
     */
    private ParticipantReceivableDto participantReceivableDto;
    
    private List<ParticipantReceivableDto> participantReceivableDtos;
    
    private String participantAccNo;
    
    private String specificAirline;

     public String getParticipantAccNo() {
		return this.participantAccNo;
	}

	public void setParticipantAccNo(final String pParticipantAccNo) {
		this.participantAccNo = pParticipantAccNo;
	}

	public List<ParticipantReceivableDto> getParticipantReceivableDtos() {
		return this.participantReceivableDtos;
	}

	public void setParticipantReceivableDtos(final 
			List<ParticipantReceivableDto> pParticipantReceivableDtos) {
		this.participantReceivableDtos = pParticipantReceivableDtos;
	}

	/**
     * Attribute to hold the <code>oId</code> object.
     */
    private Long oId;
    
    private ActionType actionType;
    


    public ActionType getActionType() {
		return this.actionType;
	}

	public void setActionType(final ActionType pActionType) {
		this.actionType = pActionType;
	}

	/**
     * <code>Default Constructor.</code>
     */
    public ManualAdjustmentPersistRequest() {

    }

    /**
     * Gets the <code>interlineAgreementsDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>interlineAgreementsDto</code> property.
     */
    public ParticipantReceivableDto getParticipantReceivableDto() {
  		return this.participantReceivableDto;
  	}

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Sets the <code>interlineAgreementsDto</code> property.
     * <p>
     * 
     * @param pInterlineAgreementsDto
     *            the current value of the <code>interlineAgreementsDto</code> property.
     */
    public void setParticipantReceivableDto(final 
			ParticipantReceivableDto pParticipantReceivableDto) {
		this.participantReceivableDto = pParticipantReceivableDto;
	}

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the current value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

	/**
	 * @return the specificAirline
	 */
	public String getSpecificAirline() {
		return specificAirline;
	}

	/**
	 * @param specificAirline the specificAirline to set
	 */
	public void setSpecificAirline(String specificAirline) {
		this.specificAirline = specificAirline;
	}
    
    


}
