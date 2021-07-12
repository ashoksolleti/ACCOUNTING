package com.unisys.trans.logistics.lms.utils.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;



public class ProfileDto extends PersistenceObjectDto{
	

	/**
	 * Attribute to hold <code>ProfileId</code> property.
	 */
	private String profileId;
	/**
	 * Attribute to hold <code>profileName</code> property.
	 */
	private String profileName;
	/**
	 * Attribute to hold <code>Checkbox</code> property.
	 */
	private boolean profileIndicators;
	/**
	 * @return the profileId
	 */
	/**
     * Attribute to hold <code>rowIndex </code> property.
     * <p>
     * Datatable row index value
     */
    private String rowIndex;
    
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
	 * @return the profileName
	 */
	public String getProfileName() {
		return profileName;
	}
	/**
	 * @param profileName the profileName to set
	 */
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
	/**
	 * @return the profileIndicators
	 */
	public boolean getProfileIndicators() {
		return profileIndicators;
	}
	/**
	 * @param profileIndicators the profileIndicators to set
	 */
	public void setProfileIndicators(boolean profileIndicators) {
		this.profileIndicators = profileIndicators;
	}
	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * @return the rowIndex
	 */
	public String getRowIndex() {
		return rowIndex;
	}
	/**
	 * @param rowIndex the rowIndex to set
	 */
	public void setRowIndex(String rowIndex) {
		this.rowIndex = rowIndex;
	}
	
}