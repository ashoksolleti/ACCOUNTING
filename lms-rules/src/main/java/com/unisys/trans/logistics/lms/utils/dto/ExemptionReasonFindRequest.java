package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class ExemptionReasonFindRequest extends AbstractRequest {

	/**
	 * Unique serial version UID.
	 */
	private static final long serialVersionUID = 1L;
	
	private String country;
	
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	
}
