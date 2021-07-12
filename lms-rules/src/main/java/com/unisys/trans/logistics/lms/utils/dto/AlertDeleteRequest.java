package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class AlertDeleteRequest extends AbstractRequest {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7855760283213380016L;
	
	private AlertAdministrationDto alertAdministrationDto;
	private Long oid;
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
	 * @return the oid
	 */
	public Long getOid() {
		return oid;
	}
	/**
	 * @param oid the oid to set
	 */
	public void setOid(Long oid) {
		this.oid = oid;
	}
}
