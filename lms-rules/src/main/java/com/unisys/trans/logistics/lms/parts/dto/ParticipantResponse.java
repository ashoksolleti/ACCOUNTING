/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

import java.util.List;

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
public class ParticipantResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 6778211689059741410L;

    /**
     * Attribute to hold <code>participant</code> property.
     */
    private ParticipantDto participant;

    /**
     * Attribute to hold <code>participantSearch</code> property.
     */
    private List<ParticipantSearchDto> participantSearch;

    /**
     * Attribute to hold <code>newParticipantAccount</code> property.
     */
    private List<String> newParticipantAccount;
  
    
	

	/**
     * <code>Default constructor</code>.
     * <p>
     */
    public ParticipantResponse() {

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
     * Gets the list of {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantSearchDto
     * ParticipantSearchDto} containing <code>participantSearchDto</code> details.
     * <p>
     * 
     * @return the current value of <code>ParticipantSearchDto</code> details.<br>
     */
    public List<ParticipantSearchDto> getParticipantSearch() {
        return this.participantSearch;
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
     * Sets the list of {@link com.unisys.trans.logistics.lms.parts.dto.ParticipantSearchDto
     * ParticipantSearchDto} containing <code>participantSearchDto</code> details.
     * <p>
     * 
     * @param pParticipantSearchDto the new value of <code>ParticipantSearchDto</code> type details.
     */
    public void setParticipantSearch(final List<ParticipantSearchDto> pParticipantSearchDto) {
        this.participantSearch = pParticipantSearchDto;
    }

    /**
     * Gets the list of String containing <code>ParticipantAccount</code> details.
     * <p>
     * 
     * @return the current value of <code>newParticipantAccount</code> details.<br>
     */
    public List<String> getNewParticipantAccount() {
        return this.newParticipantAccount;
    }

    /**
     * Sets the list of String containing <code>newParticipantAccount</code> details.
     * <p>
     * 
     * @param pNewParticipantAccount the new value of <code>newParticipantAccount</code> type details.
     */
    public void setNewParticipantAccount(final List<String> pNewParticipantAccount) {
        this.newParticipantAccount = pNewParticipantAccount;
    }
    
    // LMSC-11111 UIS158 Start
    private int participantListSize;
    
    private List<ParticipantDto> participantList;
    
    public int getParticipantListSize() {
        return this.participantListSize;
    }
    
    public void setParticipantListSize(final int pParticipantListSize) {
        this.participantListSize = pParticipantListSize;
    }
    
	public List<ParticipantDto> getParticipantList() {
		return participantList;
	}

	public void setParticipantList(List<ParticipantDto> participantList) {
		this.participantList = participantList;
	}
    // LMSC-11111 UIS158 End

}
