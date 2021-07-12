/**
 * 
 */
package com.unisys.trans.logistics.lms.parts.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;


public class ParticipantContactResponse extends AbstractResponse {
	
	 /**
     * 
     */
    private static final long serialVersionUID = 1L;
    /**
     * Attribute to hold <code>lmsdatabaseKey</code> property.
     */
    private String lmsdatabaseKey;
    /**
     * Attribute to hold <code>accountNumber</code> property.
     */
    private String accountNumber;

    /**
     * Attribute to hold <code>accountType</code> property.
     */
    private String accountType;
    
    private List<ParticipantNotificationDto> participantNotificationDtos;
    
    private Map<String, List<ParticipantNotificationDto>> mapContactsForEcsPcs;
    
    /**
     * Attribute to hold the <code>requestType</code> property.
     */
    private String requestType;

	/**
	 * @return the participantNotificationDtos
	 */
	public List<ParticipantNotificationDto> getParticipantNotificationDtos() {
		return participantNotificationDtos;
	}

	/**
	 * @param participantNotificationDtos the participantNotificationDtos to set
	 */
	public void setParticipantNotificationDtos(List<ParticipantNotificationDto> participantNotificationDtos) {
		this.participantNotificationDtos = participantNotificationDtos;
	}

	/**
	 * @return the lmsdatabaseKey
	 */
	public String getLmsdatabaseKey() {
		return lmsdatabaseKey;
	}

	/**
	 * @param lmsdatabaseKey the lmsdatabaseKey to set
	 */
	public void setLmsdatabaseKey(String lmsdatabaseKey) {
		this.lmsdatabaseKey = lmsdatabaseKey;
	}

	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return accountType;
	}

	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	/**
	 * @return the mapContactsForEcsPcs
	 */
	public Map<String, List<ParticipantNotificationDto>> getMapContactsForEcsPcs() {
		if(this.mapContactsForEcsPcs == null){
			this.mapContactsForEcsPcs = new HashMap<String, List<ParticipantNotificationDto>>();
		}
		return this.mapContactsForEcsPcs;
	}

	/**
	 * @param mapContactsForEcsPcs the mapContactsForEcsPcs to set
	 */
	public void setMapContactsForEcsPcs(Map<String, List<ParticipantNotificationDto>> mapContactsForEcsPcs) {
		this.mapContactsForEcsPcs = mapContactsForEcsPcs;
	}

	/**
	 * @return the requestType
	 */
	public String getRequestType() {
		return requestType;
	}

	/**
	 * @param requestType the requestType to set
	 */
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

}
