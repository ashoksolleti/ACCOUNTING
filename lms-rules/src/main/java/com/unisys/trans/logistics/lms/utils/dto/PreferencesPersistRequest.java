/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>PreferencesPersistRequest</code> is used to persist
 * <code>Preferences</code> information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>functionName
 * <li>preferencesUserInfoDto
 * </ul>
 */
public class PreferencesPersistRequest extends AbstractRequest {

	/**
	 * Unique serial version UID.
	 */
	private static final long serialVersionUID = 2052197476986939330L;

	/**
	 * Attribute to hold the <code>functionName</code> property.
	 */
	private String functionName;

	/**
	 * Attribute to hold the <code>preferencesUserInfoDto</code> property.
	 */
	private UserPreferences preferencesUserInfoDto;

	/**
	 * Attribute to hold the <code>isProfileAdmin</code> property.
	 */
	private boolean isProfileAdmin;

	/**
	 * Gets the <code>functionName</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>functionName</code> property.
	 */
	public String getFunctionName() {
		return this.functionName;
	}

	/**
	 * Gets the <code>preferencesUserInfoDto</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>preferencesUserInfoDto</code>
	 *         property.
	 */
	public UserPreferences getPreferencesUserInfoDto() {
		return this.preferencesUserInfoDto;
	}

	/**
	 * Sets the <code>functionName</code> property.
	 * <p>
	 * 
	 * @param pFunctionName
	 *            the new value of the <code>functionName</code> property.<br>
	 */
	public void setFunctionName(final String pFunctionName) {
		this.functionName = pFunctionName;
	}

	/**
	 * Sets the <code>preferencesUserInfoDto</code> property.
	 * <p>
	 * 
	 * @param pPreferencesUserInfoDto
	 *            the new value of the <code>preferencesUserInfoDto</code>
	 *            property.<br>
	 */
	public void setPreferencesUserInfoDto(
			final UserPreferences pPreferencesUserInfoDto) {
		this.preferencesUserInfoDto = pPreferencesUserInfoDto;
	}

	/**
	 * Gets the <code>isProfileAdmin</code> property.
	 * <p>
	 * 
	 * @return the current value of <code>isProfileAdmin</code> property.<br>
	 */
	public boolean isProfileAdmin() {
		return isProfileAdmin;
	}

	/**
	 * Sets the <code>isProfileAdmin</code> property.
	 * <p>
	 * 
	 * @param pUserType
	 *            the current value of the <code>isProfileAdmin</code> property.
	 */
	public void setProfileAdmin(final boolean pProfileAdmin) {
		this.isProfileAdmin = pProfileAdmin;
	}
}
