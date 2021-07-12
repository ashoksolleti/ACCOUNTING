package com.unisys.trans.logistics.lms.utils.dto;

import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.DateRangeDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.utils.constants.AppliesToLocation;
import com.unisys.trans.logistics.lms.utils.constants.FrequencyOfDisplayType;

public class AlertAdministrationPfmDto extends PersistenceObjectDto {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	/**
	 * Attribute to hold <code>alertId</code> property.
	 */
	private String alertId;
	/**
	 * Attribute to hold <code>effectivePeroid</code> property.
	 */
	private DateRangeDto effectivePeriod;
	/**
	 * Attribute to hold <code>lastUpdatedDate</code> property.
	 */
	private Date lastUpdatedDate;
	/**
	 * Attribute to hold <code>lastUpdatedUser</code> property.
	 */
	private String lastUpdatedUser;

	/**
	 * Attribute to hold <code>popupAlertIndicator</code> property.
	 */
	private boolean popupAlertIndicator;
	/**
	 * Attribute to hold <code>bannerScrollIndicator</code> property.
	 */
	private boolean bannerScrollIndicator;
	/**
	 * Attribute to hold <code>emailAlertIndicator</code> property.
	 */
	private boolean emailAlertIndicator;
	/**
	 * Attribute to hold <code>noOfRepeats</code> property.
	 */
	private String noOfRepeats;
	/**
	 * Attribute to hold <code>frequencyofDisplay</code> property.
	 */
	private FrequencyOfDisplayType frequencyofDisplay;
	/**
	 * Attribute to hold <code>appliesToLocation</code> property.
	 */
	private AppliesToLocation appliesToLocation;
	/**
	 * Attribute to hold <code>allProfilesIndicator</code> property.
	 */
	private boolean allProfilesIndicator;
	
	/**
	 * Attribute to hold <code>oid</code> property.
	 */
	private Long oId;

	/**
	 * Attribute to hold <code>countries</code> property.
	 */
	private List<String> countries;
	/**
	 * Attribute to hold <code>station</code> property.
	 */
	private List<String> stations;
	/**
	 * Attribute to hold <code>profiles</code> property.
	 */
	
	private List<String> profiles;
	
	/**
     * Attribute to hold <code>rowIndex </code> property.
     * <p>
     * Datatable row index value
     */
    private String rowIndex;

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
	/**
	 * @return the alertId
	 */
	public String getAlertId() {
		return alertId;
	}
	/**
	 * @param alertId the alertId to set
	 */
	public void setAlertId(String alertId) {
		this.alertId = alertId;
		
	}
	/**
	 * @return the effectivePeroid
	 */
	public DateRangeDto getEffectivePeriod() {
		return effectivePeriod;
	}
	/**
	 * @param effectivePeroid the effectivePeroid to set
	 */
	public void setEffectivePeriod(DateRangeDto effectivePeriod) {
		this.effectivePeriod = effectivePeriod;
	}
	/**
	 * @return the lastUpdatedDate
	 */
	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	/**
	 * @param lastUpdatedDate the lastUpdatedDate to set
	 */
	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
	/**
	 * @return the lastUpdatedUser
	 */
	public String getLastUpdatedUser() {
		return lastUpdatedUser;
	}
	/**
	 * @param lastUpdatedUser the lastUpdatedUser to set
	 */
	public void setLastUpdatedUser(String lastUpdatedUser) {
		this.lastUpdatedUser = lastUpdatedUser;
	}
	/**
	 * @return the popupAlertIndicator
	 */
	public boolean getPopupAlertIndicator() {
		return popupAlertIndicator;
	}
	/**
	 * @param popupAlertIndicator the popupAlertIndicator to set
	 */
	public void setPopupAlertIndicator(boolean popupAlertIndicator) {
		this.popupAlertIndicator = popupAlertIndicator;
	}
	/**
	 * @return the bannerScrollIndicator
	 */
	public boolean getBannerScrollIndicator() {
		return bannerScrollIndicator;
	}
	/**
	 * @param bannerScrollIndicator the bannerScrollIndicator to set
	 */
	public void setBannerScrollIndicator(boolean bannerScrollIndicator) {
		this.bannerScrollIndicator = bannerScrollIndicator;
	}
	/**
	 * @return the emailAlertIndicator
	 */
	public boolean getEmailAlertIndicator() {
		return emailAlertIndicator;
	}
	/**
	 * @param emailAlertIndicator the emailAlertIndicator to set
	 */
	public void setEmailAlertIndicator(boolean emailAlertIndicator) {
		this.emailAlertIndicator = emailAlertIndicator;
	}
	/**
	 * @return the noOfRepeats
	 */
	public String getNoOfRepeats() {
		return noOfRepeats;
	}
	/**
	 * @param noOfRepeats the noOfRepeats to set
	 */
	public void setNoOfRepeats(String noOfRepeats) {
		this.noOfRepeats = noOfRepeats;
	}
	/**
	 * @return the frequencyofDisplay
	 */
	public FrequencyOfDisplayType getFrequencyofDisplay() {
		return frequencyofDisplay;
	}
	/**
	 * @param frequencyofDisplay the frequencyofDisplay to set
	 */
	public void setFrequencyofDisplay(FrequencyOfDisplayType frequencyofDisplay) {
		this.frequencyofDisplay = frequencyofDisplay;
	}
	/**
	 * @return the appliesToLocation
	 */
	public AppliesToLocation getAppliesToLocation() {
		return appliesToLocation;
	}
	/**
	 * @param appliesToLocation the appliesToLocation to set
	 */
	public void setAppliesToLocation(AppliesToLocation appliesToLocation) {
		this.appliesToLocation = appliesToLocation;
	}
	/**
	 * @return the allProfilesIndicator
	 */
	public boolean getAllProfilesIndicator() {
		return allProfilesIndicator;
	}
	/**
	 * @param allProfilesIndicator the allProfilesIndicator to set
	 */
	public void setAllProfilesIndicator(boolean allProfilesIndicator) {
		this.allProfilesIndicator = allProfilesIndicator;
	}
	/**
	 * @return the oid
	 */
	public Long getOId() {
		return oId;
	}
	/**
	 * @param oid the oid to set
	 */
	public void setOId(Long oId) {
		this.oId = oId;
	}
	/**
	 * @return the countries
	 */
	public List<String> getCountries() {
		return countries;
	}
	/**
	 * @param countries the countries to set
	 */
	public void setCountries(List<String> countries) {
		this.countries = countries;
	}
	/**
	 * @return the stations
	 */
	public List<String> getStations() {
		return stations;
	}
	/**
	 * @param stations the stations to set
	 */
	public void setStations(List<String> stations) {
		this.stations = stations;
	}
	/**
	 * @return the profiles
	 */
	public List<String> getProfiles() {
		return profiles;
	}
	/**
	 * @param profiles the profiles to set
	 */
	public void setProfiles(List<String> profiles) {
		this.profiles = profiles;
	}
	/**
	 * @return the emailSubject
	 */
	public String getEmailSubject() {
		return emailSubject;
	}
	/**
	 * @param emailSubject the emailSubject to set
	 */
	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * Attribute to hold <code>emailSubject</code> property.
	 */

	private String emailSubject;
	/**
	 * Attribute to hold <code>message</code> property.
	 */
	private String message;
	
	public String toString(){
	    return "oId of AlertPFM Dto "+this.oId +""; 
	}

}
