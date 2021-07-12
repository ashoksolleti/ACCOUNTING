/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>ParticipantResponse</code> is the response object which will be sent to the web client, swing client
 * or any other client via webservice.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>participant
 * <li>participantSearchDto
 * </ul>
 * </code>
 */
public class ParticipantSyncResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 6778211689059741410L;

    /**
     * Attribute to hold <code>participant</code> property.
     */
    private ParticipantDto participant;
    
    private  boolean  participantModifiedIndicator;
    
    private  boolean  participantExistIndicator;
    
    private ParticipantDto existingParticipant;
    
    private String actionCode;
    
    private String data;

    /**
     * <code>Default constructor</code>.
     * <p>
     */
    public ParticipantSyncResponse() {

    }

    /**
     * Gets the participant data transfer object.
     * <p>
     * 
     * @return the current value of participant data transfer object.<br>
     */
    public ParticipantDto getParticipant() {
        return this.participant;
    }
    /**
     * Sets the participant data transfer object.
     * <p>
     * 
     * @param pParticipantDto the new value of participant data transfer object<br>
     */
    public void setParticipant(final ParticipantDto pParticipantDto) {
        this.participant = pParticipantDto;
    }

    /**
     * @return the participantModifiedIndicator
     */
    public boolean getParticipantModifiedIndicator() {
        return participantModifiedIndicator;
    }

    /**
     * @param participantModifiedIndicator the participantModifiedIndicator to set
     */
    public void setParticipantModifiedIndicator(boolean participantModifiedIndicator) {
        this.participantModifiedIndicator = participantModifiedIndicator;
    }

    /**
     * @return the actionCode
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * @param actionCode the actionCode to set
     */
    public void setActionCode(final String pActionCode) {
        this.actionCode = pActionCode;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(final String pData) {
        this.data = pData;
    }

	public boolean getParticipantExistIndicator() {
		return participantExistIndicator;
	}

	public void setParticipantExistIndicator(boolean pParticipantExistIndicator) {
		this.participantExistIndicator = pParticipantExistIndicator;
	}

	public ParticipantDto getExistingParticipant() {
		return existingParticipant;
	}

	public void setExistingParticipant(final ParticipantDto pExistingParticipant) {
		this.existingParticipant = pExistingParticipant;
	}


}
