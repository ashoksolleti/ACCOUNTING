/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>HistoryFindRequest</code> is used for finding history of static data.
 * <p>
 * It fetches the history of static data based on the category, identifier and owner.
 * <ul>
 * <li>If the identifier is empty or null then it returns the list of history of static data for a particular
 * owner.
 * <li>If the identifier is found then it returns the history static data for a particular identifier.
 * </ul>
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>owner
 * <li>identifier
 * <li>category
 * </code>
 * </ul>
 */
public class PartcipantHistoryFindRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -2518131738287604068L;
    /**
     * Attribute to hold <code>lmsDataBaseKey</code> property.
     */
  
    private String lmsDatabaseKey;
    
    private int pageNumber;
    /**
     * Attribute to hold <code>participant</code> property.
     */
    private ParticipantDto participant;
    /**
     * Attribute to hold <code>newParticipantAccount</code> property.
     */
    private List<String> newParticipantAccount;
    
    
   


    public PartcipantHistoryFindRequest() {

    }

    
  

    /**
     * @return the lmsDatabaseKey
     */
    public String getLmsDatabaseKey() {
        return lmsDatabaseKey;
    }


    /**
     * @param lmsDatabaseKey the lmsDatabaseKey to set
     */
    public void setLmsDatabaseKey(String lmsDatabaseKey) {
        this.lmsDatabaseKey = lmsDatabaseKey;
    }




    /**
     * @return the participant
     */
    public ParticipantDto getParticipant() {
        return participant;
    }




    /**
     * @param participant the participant to set
     */
    public void setParticipant(final ParticipantDto participant) {
        this.participant = participant;
    }




    /**
     * @return the newParticipantAccount
     */
    public List<String> getNewParticipantAccount() {
        return newParticipantAccount;
    }




    /**
     * @param newParticipantAccount the newParticipantAccount to set
     */
    public void setNewParticipantAccount(final List<String> newParticipantAccount) {
        this.newParticipantAccount = newParticipantAccount;
    }




	public int getPageNumber() {
		return pageNumber;
	}




	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

   

    

}
