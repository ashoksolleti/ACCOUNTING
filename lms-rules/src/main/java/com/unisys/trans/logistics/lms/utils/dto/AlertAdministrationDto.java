package com.unisys.trans.logistics.lms.utils.dto;

import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.DateRangeDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.utils.constants.AppliesToLocation;
import com.unisys.trans.logistics.lms.utils.constants.AppliesToProfile;
import com.unisys.trans.logistics.lms.utils.constants.FrequencyOfDisplayType;

public class AlertAdministrationDto extends PersistenceObjectDto implements Comparable<AlertAdministrationDto> {

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

	private String profile;

	private String emailAdd;

	public String getRowIndex() {
		return rowIndex;
	}

	/**
	 * @param rowIndex
	 *            the rowIndex to set
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
	 * @param alertId
	 *            the alertId to set
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
	 * @param effectivePeroid
	 *            the effectivePeroid to set
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
	 * @param lastUpdatedDate
	 *            the lastUpdatedDate to set
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
	 * @param lastUpdatedUser
	 *            the lastUpdatedUser to set
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
	 * @param popupAlertIndicator
	 *            the popupAlertIndicator to set
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
	 * @param bannerScrollIndicator
	 *            the bannerScrollIndicator to set
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
	 * @param emailAlertIndicator
	 *            the emailAlertIndicator to set
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
	 * @param noOfRepeats
	 *            the noOfRepeats to set
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
	 * @param frequencyofDisplay
	 *            the frequencyofDisplay to set
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
	 * @param appliesToLocation
	 *            the appliesToLocation to set
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
	 * @param allProfilesIndicator
	 *            the allProfilesIndicator to set
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
	 * @param oid
	 *            the oid to set
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
	 * @param countries
	 *            the countries to set
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
	 * @param stations
	 *            the stations to set
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
	 * @param profiles
	 *            the profiles to set
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
	 * @param emailSubject
	 *            the emailSubject to set
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
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	public String getProfile() {
		/*
		 * if(this.allProfilesIndicator){ this.profile = "All Profiles"; }else
		 * if(this.profiles!=null){ StringBuffer aBuffer = new StringBuffer();
		 * for(String aProfile : this.profiles){ if(aProfile!=null){
		 * aBuffer.append(aProfile); } } this.profile = aBuffer.toString(); }
		 */

		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getEmailAdd() {
		return emailAdd;
	}

	public void setEmailAdd(String emailAdd) {
		this.emailAdd = emailAdd;
	}

	/**
	 * Attribute to hold <code>emailSubject</code> property.
	 */

	private String emailSubject;
	/**
	 * Attribute to hold <code>message</code> property.
	 */
	private String message;

	private String alertTypes;

	private String profileTypes;

	private String listCountries;

	private String listStations;

	public void setAlertTypes(String alertTypes) {
		this.alertTypes = alertTypes;
	}

	public String getAlertTypes() {
		StringBuffer aStringBuffer = new StringBuffer();
		if (this.getPopupAlertIndicator()) {
			aStringBuffer.append("Popup");

		}
		if (this.getBannerScrollIndicator()) {
			if (this.getBannerScrollIndicator() && this.getPopupAlertIndicator()) {
				aStringBuffer.append(", ");
			}
			aStringBuffer.append("Banner");
		}
		if (this.getEmailAlertIndicator()) {
			if (this.getPopupAlertIndicator() && this.getEmailAlertIndicator()) {
				aStringBuffer.append(", ");
			} else if (this.getBannerScrollIndicator() && this.getEmailAlertIndicator()) {
				aStringBuffer.append(", ");
			}
			aStringBuffer.append("Email");
		}
		return aStringBuffer.toString();
	}

	@Override

	public int compareTo(final AlertAdministrationDto pAlertAdministrationDto) {
		int returnVal;
		if (this.noOfRepeats == null || this.noOfRepeats.isEmpty()) {
			if (pAlertAdministrationDto.noOfRepeats == null || pAlertAdministrationDto.noOfRepeats.isEmpty()) {
				returnVal = 0;
			} else {
				returnVal = -1;
			}
		} else if (pAlertAdministrationDto.noOfRepeats == null || pAlertAdministrationDto.noOfRepeats.isEmpty()) {
			returnVal = 1;
		} else {
			returnVal = Integer.valueOf(this.noOfRepeats) - Integer.valueOf(pAlertAdministrationDto.noOfRepeats);
		}
		return returnVal;
	}

	/**
	 * @return the profileTypes
	 */
	public String getProfileTypes() {
		StringBuffer aStringBuffer = new StringBuffer();
		if (this.getAllProfilesIndicator()) {
			aStringBuffer.append("All Profiles");
		} else {
			for (int i = 0; i < this.getProfiles().size(); i++) {
				aStringBuffer.append(this.getProfiles().get(i));
				if (i < this.getProfiles().size() - 1) {
					aStringBuffer.append(", ");
				}
			}
		}
		return aStringBuffer.toString();
	}

	/**
	 * @param profileTypes
	 *            the profileTypes to set
	 */
	public void setProfileTypes(String profileTypes) {
		this.profileTypes = profileTypes;
	}

	/**
	 * @return the listCountries
	 */
	public String getListCountries() {
		StringBuffer aStringBuffer = new StringBuffer();
		if (this.getCountries() != null) {
			for (int i = 0; i < this.getCountries().size(); i++) {
				aStringBuffer.append(this.getCountries().get(i));

				if (i < this.getCountries().size() - 1) {
					aStringBuffer.append(", ");
				}
			}
		}
		return aStringBuffer.toString();
	}

	/**
	 * @param listCountries
	 *            the listCountries to set
	 */
	public void setListCountries(String listCountries) {
		this.listCountries = listCountries;
	}

	/**
	 * @return the listStations
	 */
	public String getListStations() {
		StringBuffer aStringBuffer = new StringBuffer();
		if (this.getStations() != null) {
			for (int i = 0; i < this.getStations().size(); i++) {
				aStringBuffer.append(this.getStations().get(i));

				if (i < this.getStations().size() - 1) {
					aStringBuffer.append(", ");
				}
			}
		}
		return aStringBuffer.toString();
	}

	/**
	 * @param listStations
	 *            the listStations to set
	 */
	public void setListStations(String listStations) {
		this.listStations = listStations;
	}

	public String toString() {
		// SuppressOn:MagicNumber
		final StringBuffer csvString = new StringBuffer();
		// SuppressOff:MagicNumber

		csvString.append(this.prefixSuffixByQuotes(this.getAlertId()));
		if(this.effectivePeriod!=null){
		    csvString.append(this.prefixSuffixByQuotes(ContractUtility.getFormattedDate(
		        "ddMMMyy HH:mm",this.effectivePeriod.getEffectiveDate())));
    		csvString.append(this.prefixSuffixByQuotes(ContractUtility.getFormattedDate(
                "ddMMMyy HH:mm",this.effectivePeriod.getExpirationDate())));
		}else{
		    csvString.append(",,");
		}

		csvString.append(this.prefixSuffixByQuotes(this.getAlertTypes()));

		if (FrequencyOfDisplayType.O.equals(this.getFrequencyofDisplay())) {
			csvString.append(this.prefixSuffixByQuotes("O"));
		} else {
			csvString.append(this.prefixSuffixByQuotes("R"));
		}
		
		if(this.getProfiles() != null){
			csvString.append(this.prefixSuffixByQuotes(this.getProfileTypes()));
		} else {
			csvString.append(this.prefixSuffixByQuotes("All Profiles"));
		}
		if (this.getCountries() != null) {

			csvString.append(this.prefixSuffixByQuotes(this.getListCountries()));
		}
		else{
			csvString.append(this.prefixSuffixByQuotes(""));
		}

		if (this.getStations() != null) {
			csvString.append(this.prefixSuffixByQuotes(this.getListStations()));
		}
		else{
			csvString.append(this.prefixSuffixByQuotes(""));
		}

		csvString.append(this.prefixSuffixByQuotes(this.getMessage()));

		return csvString.toString();
	}

	/**
	 * prefixes and suffixes a given string with open quotes.
	 * 
	 * @param pString
	 *            the new value of the <code>value</code>.
	 * 
	 * @return aModifiedString the new value of the <code>aModifiedString</code>
	 *         .
	 * 
	 * 
	 */
	private String prefixSuffixByQuotes(final String pString) {
		final String aQUOTATION = "\"";
		final String aCOMMA = ",";

		final StringBuffer aModifiedString = new StringBuffer();
		aModifiedString.append(aQUOTATION);
		aModifiedString.append(pString);
		aModifiedString.append(aQUOTATION);
		aModifiedString.append(aCOMMA);

		return aModifiedString.toString();
	}
}
