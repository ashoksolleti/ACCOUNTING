package com.unisys.trans.logistics.lms.utils.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class AlertAdministrationResponse extends AbstractResponse {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6803602151025319146L;
	
	/**
	 * holds the value of <code>userId</code>.
	 */
	private String userId;
	/**
	 * holds the value of <code>profileId</code>.
	 */
	
	private String profileId;
	/**
	 * holds the value of <code>AlertAdministrationDto</code>.
	 */
	private AlertAdministrationDto alertAdministrationDto;
	
	private List<AlertAdministrationDto> alertAdministrationDtos = new ArrayList<AlertAdministrationDto>();

	private List<ProfileDto> profileDtos = new ArrayList<ProfileDto>();

	private List<AlertAcknowledgementDto> alertAcknowledgementDtos;

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the profileId
	 */
	public String getProfileId() {
		return profileId;
	}

	/**
	 * @param profileId the profileId to set
	 */
	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}
	
	/**
	 * @return the alertAdministrationDto
	 */
	public AlertAdministrationDto getAlertAdministrationDto() {
		return alertAdministrationDto;
	}

	/**
	 * @param alertAdministrationDto the alertAdministrationDto to set
	 */
	public void setAlertAdministrationDto(AlertAdministrationDto alertAdministrationDto) {
		this.alertAdministrationDto = alertAdministrationDto;
	}

	/**
	 * @return the alertAdministrationDtos
	 */
	public List<AlertAdministrationDto> getAlertAdministrationDtos() {
		return alertAdministrationDtos;
	}

	/**
	 * @param alertAdministrationDtos the alertAdministrationDtos to set
	 */
	public void setAlertAdministrationDtos(List<AlertAdministrationDto> alertAdministrationDtos) {
		this.alertAdministrationDtos = alertAdministrationDtos;
	}

	/**
	 * @return the profileDtos
	 */
	public List<ProfileDto> getProfileDtos() {
		return profileDtos;
	}

	/**
	 * @param profileDtos the profileDtos to set
	 */
	public void setProfileDtos(List<ProfileDto> profileDtos) {
		this.profileDtos = profileDtos;
	}

	
	    public void setAlertAcknowledgementDtos(final List<AlertAcknowledgementDto> pAlertAcknowledgements) {
	        // TODO Auto-generated method stub
	       this.alertAcknowledgementDtos = pAlertAcknowledgements; 
	    }

	    public List<AlertAcknowledgementDto> getAlertAcknowledgementDtos() {
	        return this.alertAcknowledgementDtos;
	    } 
	
	
}
