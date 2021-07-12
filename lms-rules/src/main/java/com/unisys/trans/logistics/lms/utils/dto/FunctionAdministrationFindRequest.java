package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class FunctionAdministrationFindRequest extends AbstractRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String productCode;
	private String userProfile;
	private boolean viewAllAlerts;
	/**
	 * @return the viewAllAlerts
	 */
	public boolean isViewAllAlerts() {
		return viewAllAlerts;
	}

	/**
	 * @param viewAllAlerts the viewAllAlerts to set
	 */
	public void setViewAllAlerts(boolean viewAllAlerts) {
		this.viewAllAlerts = viewAllAlerts;
	}

	/**
	 * @return the userProfile
	 */
	public String getUserProfile() {
		return userProfile;
	}

	/**
	 * @param userProfile
	 *            the userProfile to set
	 */
	public void setUserProfile(String userProfile) {
		this.userProfile = userProfile;
	}

	/**
	 * @return the productCode
	 */
	public String getProductCode() {
		return productCode;
	}

	/**
	 * @param productCode
	 *            the productCode to set
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
}
