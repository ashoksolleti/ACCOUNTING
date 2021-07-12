/**
 * 
 */
package com.unisys.trans.logistics.lms.utils.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.UserAuditDto;

/**
 * @author 31975
 *
 */
public class AlertAcknowledgementDto extends PersistenceObjectDto {

	/**
	 * 
	 */
	private static final long serialVersionUID = -588050200518991677L;
	
	
	private Long oId;
	
	
	private String alertId;
	
	
	private String sessionID;
	
	
	private String userId;
	
	private String station;
	
	private Date acknowledgeDateTime;
	

	private String alertType;
	
	
	private String profileId;
	
	private String firstName;
	
	private String lastName;
	
	private String rowindex;
	
	private String emailAddress;

	public String getEmailAddress() {
        return emailAddress;
    }


    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
	 * @return the oId
	 */
	public Long getOId() {
		return oId;
	}


	/**
	 * @param oId the oId to set
	 */
	public void setOId(Long oId) {
		this.oId = oId;
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
	 * @return the sessionId
	 */
	public String getSessionID() {
		return sessionID;
	}


	/**
	 * @param sessionId the sessionId to set
	 */
	public void setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}




	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	/**
	 * @return the alertType
	 */
	public String getAlertType() {
		return alertType;
	}


	/**
	 * @param alertType the alertType to set
	 */
	public void setAlertType(String alertType) {
		this.alertType = alertType;
	}


	/**
	 * @return the profileId
	 */
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
	 * @return the station
	 */
	public String getStation() {
		return station;
	}


	/**
	 * @param station the station to set
	 */
	public void setStation(String station) {
		this.station = station;
	}


	/**
	 * @return the acknowledgeDateTime
	 */
	public Date getAcknowledgeDateTime() {
		return acknowledgeDateTime;
	}


	/**
	 * @param acknowledgeDateTime the acknowledgeDateTime to set
	 */
	public void setAcknowledgeDateTime(Date acknowledgeDateTime) {
		this.acknowledgeDateTime = acknowledgeDateTime;
	}

	/**
	 * @return the rowindex
	 */
	public String getRowindex() {
		return rowindex;
	}


	/**
	 * @param rowindex the rowindex to set
	 */
	public void setRowindex(String rowindex) {
		this.rowindex = rowindex;
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

}
