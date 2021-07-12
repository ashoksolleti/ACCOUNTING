/**
 * 
 */
package com.unisys.trans.logistics.lms.utils.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * @author 31975
 *
 */
public class AlertAcknowledgementResponse extends AbstractResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9123862577077684229L;
	
	
	private AlertAcknowledgementDto alertAcknowledgementDto ;


	/**
	 * @return the alertAcknowledgementDto
	 */
	public AlertAcknowledgementDto getAlertAcknowledgementDto() {
		return alertAcknowledgementDto;
	}


	/**
	 * @param alertAcknowledgementDto the alertAcknowledgementDto to set
	 */
	public void setAlertAcknowledgementDto(AlertAcknowledgementDto alertAcknowledgementDto) {
		this.alertAcknowledgementDto = alertAcknowledgementDto;
	}


	


}
