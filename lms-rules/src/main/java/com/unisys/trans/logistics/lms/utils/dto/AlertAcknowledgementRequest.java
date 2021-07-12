/**
 * 
 */
package com.unisys.trans.logistics.lms.utils.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * @author 31975
 *
 */

public class AlertAcknowledgementRequest extends AbstractRequest {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	private AlertAcknowledgementDto alertAcknowledgement;



	/**
	 * @return the alertAcknowledgement
	 */
	public AlertAcknowledgementDto getAlertAcknowledgement() {
		return alertAcknowledgement;
	}



	/**
	 * @param alertAcknowledgement the alertAcknowledgement to set
	 */
	public void setAlertAcknowledgement(AlertAcknowledgementDto alertAcknowledgement) {
		this.alertAcknowledgement = alertAcknowledgement;
	}
	
	

}
