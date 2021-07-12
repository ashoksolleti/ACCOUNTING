//@formatter:off
/* ====================================== */
/* Copyright(c) 2012 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.utils.dto;

import java.util.List;
import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>PreferencesResponse</code> contains the response of the maintenance
 * request received by <code>PreferencesService</code>.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>preferencesFunctionDto
 * <li>userPreferencesDto
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.utils.dto.PreferencesFunctionDto
 */
public class PreferencesResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 2881789229163785241L;

    /**
     * Attribute to hold <code>preferencesFunctionDto</code> property.
     */
    private PreferencesFunctionDto preferencesFunctionDto;

    /**
     * Attribute to hold <code>userPreferencesDto</code> property.
     */
    private UserPreferences userPreferencesDto;
    private List<String> groupNames;

    /**
     * Attribute to hold <code>preferencesFunctionDto</code> property.
     */
    private List<PreferencesFunctionEntityDto> preferencesFunctionEntityDtos;

    /**
     * Gets the <code>userPreferencesDto</code> property.
     * 
     * @return the userPreferencesDto
     */
    public UserPreferences getUserPreferencesDto() {
        return userPreferencesDto;
    }

    /**
     * Sets the value of <code>userPreferencesDto</code> property.
     * 
     * @param pUserPreferencesDto the userPreferencesDto to set
     */
    public void setUserPreferencesDto(final UserPreferences pUserPreferencesDto) {
        this.userPreferencesDto = pUserPreferencesDto;
    }

    /**
     * Get the <code>preferencesFunctionDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>preferencesFunctionDto</code> property.
     */
    public PreferencesFunctionDto getPreferencesFunctionDto() {
        return this.preferencesFunctionDto;
    }

    /**
     * Get the <code>userPreferencesDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>userPreferencesDto</code> property.
     */
    public UserPreferences getPreferencesUserInfoDto() {
        return this.userPreferencesDto;
    }

    /**
     * Sets the <code>preferencesFunctionDto</code> property.
     * <p>
     * 
     * @param pPreferencesFunctionDto
     *            the current value of the <code>preferencesFunctionDto</code> property.
     */
    public void setPreferencesFunctionDto(
                final PreferencesFunctionDto pPreferencesFunctionDto) {
        this.preferencesFunctionDto = pPreferencesFunctionDto;
    }

    /**
     * Sets the <code>userPreferencesDto</code> property.
     * <p>
     * 
     * @param pUserPreferencesDto
     *            the current value of the <code>userPreferencesDto</code> property.
     */
    public void setPreferencesUserInfoDto(
                final UserPreferences pUserPreferencesDto) {
        this.userPreferencesDto = pUserPreferencesDto;
    }

	public List<PreferencesFunctionEntityDto> getPreferencesFunctionEntityDtos() {
		return preferencesFunctionEntityDtos;
	}

	public void setPreferencesFunctionEntityDtos(List<PreferencesFunctionEntityDto> preferencesFunctionEntityDtos) {
		this.preferencesFunctionEntityDtos = preferencesFunctionEntityDtos;
	}

    
	public List<String> getGroupNames() {
		return groupNames;
	}

	public void setGroupNames(List<String> groupNames) {
		this.groupNames = groupNames;
	}
}
