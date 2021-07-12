package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class AlertAdministrationPersistRequest extends AbstractRequest{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4900022454557895595L;
	
	private AlertAdministrationDto alertAdministrationDto;
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

}
