package com.unisys.trans.logistics.lms.parts.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class ParticipantContactEcspcsFindRequest extends AbstractRequest {
	
	 /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>telex</code> property.
     */
    private String telexInd;
    /**
     * Attribute to hold <code>emailInd</code> property.
     */
    private String emailInd;
    /**
     * Attribute to hold <code>exportRoleInd</code> property.
     */
    private String exportRoleInd;
    /**
     * Attribute to hold <code>importRoleInd</code> property.
     */
    private String importRoleInd;
    /**
     * Attribute to hold <code>ccaRolInd</code> property.
     */
    private String ccaRoleInd;
    /**
     * Attribute to hold <code>fsuOnlyInd</code> property.
     */
    private String fsuOnlyInd;
 
    /**
     * Attribute to hold <code>aParticipantNotificationDtos</code> property.
     */
    List<ParticipantNotificationDto> participantNotificationDtos;

	/**
	 * @return the telexInd
	 */
	public String getTelexInd() {
		return telexInd;
	}

	/**
	 * @param telexInd the telexInd to set
	 */
	public void setTelexInd(String telexInd) {
		this.telexInd = telexInd;
	}

	/**
	 * @return the emailInd
	 */
	public String getEmailInd() {
		return emailInd;
	}

	/**
	 * @param emailInd the emailInd to set
	 */
	public void setEmailInd(String emailInd) {
		this.emailInd = emailInd;
	}

	/**
	 * @return the exportRoleInd
	 */
	public String getExportRoleInd() {
		return exportRoleInd;
	}

	/**
	 * @param exportRoleInd the exportRoleInd to set
	 */
	public void setExportRoleInd(String exportRoleInd) {
		this.exportRoleInd = exportRoleInd;
	}

	/**
	 * @return the importRoleInd
	 */
	public String getImportRoleInd() {
		return importRoleInd;
	}

	/**
	 * @param importRoleInd the importRoleInd to set
	 */
	public void setImportRoleInd(String importRoleInd) {
		this.importRoleInd = importRoleInd;
	}

	/**
	 * @return the fsuOnlyInd
	 */
	public String getFsuOnlyInd() {
		return fsuOnlyInd;
	}

	/**
	 * @param fsuOnlyInd the fsuOnlyInd to set
	 */
	public void setFsuOnlyInd(String fsuOnlyInd) {
		this.fsuOnlyInd = fsuOnlyInd;
	}

	/**
	 * @return the ccaRoleInd
	 */
	public String getCcaRoleInd() {
		return ccaRoleInd;
	}

	/**
	 * @param ccaRoleInd the ccaRoleInd to set
	 */
	public void setCcaRoleInd(String ccaRoleInd) {
		this.ccaRoleInd = ccaRoleInd;
	}

	/**
	 * @return the participantNotificationDtos
	 */
	public List<ParticipantNotificationDto> getParticipantNotificationDtos() {
		if(this.participantNotificationDtos == null){
			this.participantNotificationDtos = new ArrayList<ParticipantNotificationDto>();
		}
		return this.participantNotificationDtos;
	}

	/**
	 * @param participantNotificationDtos the participantNotificationDtos to set
	 */
	public void setParticipantNotificationDtos(List<ParticipantNotificationDto> participantNotificationDtos) {
		this.participantNotificationDtos = participantNotificationDtos;
	}

}
