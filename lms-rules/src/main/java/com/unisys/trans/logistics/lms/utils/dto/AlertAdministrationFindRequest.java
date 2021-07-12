package com.unisys.trans.logistics.lms.utils.dto;

import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

public class AlertAdministrationFindRequest extends AbstractRequest {
	private boolean userAcknowledgements;
    
    private boolean viewAllAlerts;
	
    
    private boolean activeInd;
    
    private boolean expiredInd;
    
    private String country;
    
    private String lastName;
    
    private String firstName;
    
    
	public boolean isViewAllAlerts() {
        return this.viewAllAlerts;
    }

    public void setViewAllAlerts(final boolean pViewAllAlerts) {
        this.viewAllAlerts = pViewAllAlerts;
    }

    public boolean isUserAcknowledgements() {
        return this.userAcknowledgements;
    }

    public void setUserAcknowledgements(final boolean pUserAcknowledgements) {
        this.userAcknowledgements = pUserAcknowledgements;
    } 
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8810328100686996891L;
	/**
	 * holds the value of <code>userId</code>.
	 */

	private String userId;
	/**
	 * holds the value of <code>allProfilesIndicator</code>.
	 */
	
	private boolean allProfilesIndicator;
	/**
	 * holds the value of <code>station</code>.
	 */
	
	private String station;
	/**
	 * holds the value of <code>profiles</code>.
	 */
	
	private String profiles;
	
	
	private Date fromDate;
	
	
	private Date toDate;

	
	private String alertId;
	
	private String sessionId;
	/**
	 * @return the profiles
	 */
	public String getProfiles() {
		return profiles;
	}

	private boolean fetchMultpleAlerts;
	/**
	 * @param profiles the profiles to set
	 */
	public void setProfiles(String profiles) {
		this.profiles = ContractUtility.convertToUpperCase(profiles);
	}


	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}


	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
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
	 * @return the station
	 */
	public String getStation() {
		return station;
	}


	/**
	 * @param station the station to set
	 */
	public void setStation(String station) {
		this.station = ContractUtility.convertToUpperCase(station);
	}


	/**
	 * @return the fromDate
	 */
	public Date getFromDate() {
		return fromDate;
	}


	/**
	 * @param fromDate the fromDate to set
	 */
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}


	/**
	 * @return the toDate
	 */
	public Date getToDate() {
		return toDate;
	}


	/**
	 * @param toDate the toDate to set
	 */
	public void setToDate(Date toDate) {
		this.toDate = toDate;
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
		this.alertId = ContractUtility.convertToUpperCase(alertId);
	}


	/**
	 * @return the fetchMultpleAlerts
	 */
	public boolean getFetchMultpleAlerts() {
		return fetchMultpleAlerts;
	}


	/**
	 * @param fetchMultpleAlerts the fetchMultpleAlerts to set
	 */
	public void setFetchMultpleAlerts(boolean fetchMultpleAlerts) {
		this.fetchMultpleAlerts = fetchMultpleAlerts;
	}

	/**
	 * @return the activeInd
	 */
	public boolean isActiveInd() {
		return activeInd;
	}

	/**
	 * @param activeInd the activeInd to set
	 */
	public void setActiveInd(boolean activeInd) {
		this.activeInd = activeInd;
	}

	/**
	 * @return the expiredInd
	 */
	public boolean isExpiredInd() {
		return expiredInd;
	}

	/**
	 * @param expiredInd the expiredInd to set
	 */
	public void setExpiredInd(boolean expiredInd) {
		this.expiredInd = expiredInd;
	}

	/**
	 * @return the sessionId
	 */
	public String getSessionId() {
		return sessionId;
	}

	/**
	 * @param sessionId the sessionId to set
	 */
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

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
		this.country = ContractUtility.convertToUpperCase(country);
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}
