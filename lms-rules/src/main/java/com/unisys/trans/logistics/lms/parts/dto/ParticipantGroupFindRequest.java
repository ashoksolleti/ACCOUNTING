/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.parts.dto.constants.ParticipantAccountType;

/**
 * <code>ParticipantGroupFindRequest</code> holds information to retrieve participant group information.
 * <p>
 * This requests is for three different types of retrieve options based upon the values. If groupNumber is not
 * null, system retrieves participant group information for the participant group number. If
 * participantAccountNumber is not null and participantAccountType is not null, system retrieves all
 * participant group information for the participant. If groupNumber is null, participantAccountNumber is also
 * null and participantAccountType is null, system retrieves all the participant group numbers.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>groupNumber
 * <li>participantAccountNumber
 * <li>participantAccountType
 * <li>retrieveType
 * </ul>
 * </code>
 */
public class ParticipantGroupFindRequest extends AbstractRequest {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 4797623903860633965L;

    /**
     * Attribute to hold <code>exactMatchIndicator</code> property.
     */
    private Boolean exactMatchIndicator;

    /**
     * Attribute to hold <code>groupNumber</code> property.
     */
    private String groupNumber;

    /**
     * Attribute to hold <code>participantAccountNumber</code> property.
     */
    private String participantAccountNumber;

    /**
     * Attribute to hold <code>participantAccountType</code> property.
     */
    private ParticipantAccountType participantAccountType;
    

    /**
     * Attribute to hold <code>retrieveType</code> property.
     */
    private String retrieveType;
    
    /**
     * Attribute to hold <code>updatedFromDate</code> property.
     */
    private Date updatedFromDate;
    
    /**
     * Attribute to hold <code>updatedToDate</code> property.
     */
    private Date updatedToDate;
    
    /**
     * Attribute to hold <code>effectiveDate</code> property.
     */
    private Date effectiveDate;
    
    /**
     * <code>Default constructor.</code>
     */
 
    
    public ParticipantGroupFindRequest() {

    }

    /**
     * Gets the value of <code>exactMatchRequiredIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <ul>
     * <li><code>true</code><br>
     * To find a particular participant group.
     * <li><code>false</code><br>
     * To find all the participant groups.
     * </ul>
     * <p>
     * 
     * @return the current value of <code>exactMatchRequiredIndicator</code> property.
     */
    public Boolean getExactMatchIndicator() {
        return this.exactMatchIndicator;
    }

    /**
     * Gets the value of the <code>groupNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alpha numeric characters
     * <p>
     * <b>Example: </b><br>
     * GR0000BE
     * <p>
     * 
     * @return the current value of <code>groupNumber</code> property.
     */
    public String getGroupNumber() {

        return this.groupNumber;

    }

    /**
     * Gets the value of the <code>participantAccountNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Character set for alphabet, number, hyphen, dot, slash and space.
     * <p>
     * <b>Example: </b><br>
     * GR0000BE
     * <p>
     * 
     * @return the current value of <code>participantAccountNumber</code> property.
     */
    public String getParticipantAccountNumber() {

        return this.participantAccountNumber;

    }

    /**
     * Gets the value of the <code>participantAccountType</code> property.
     * <p>
     * 
     * @return the current value of <code>participantAccountType</code> property.
     */
    public ParticipantAccountType getParticipantAccountType() {

        return this.participantAccountType;
    }

    /**
     * Gets the value of the <code>retrieveType</code> property.
     * <p>
     * <b>Possible values:</b>
     * <ul>
     * <li><code>G</code><br>
     * Retrieve participant group by group number.
     * <li><code>P</code><br>
     * Retrieve all groups for a participant.
     * </ul>
     * <p>
     * 
     * @return the current value of <code>retrieveType</code> property.
     */
    public String getRetrieveType() {
        return this.retrieveType;
    }

    /**
     * Sets the value of the <code>exactMatchRequiredIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <ul>
     * <li><code>true</code><br>
     * To find a particular participant group.<br>
     * <li><code>false</code><br>
     * To find all the participant groups.<br>
     * </ul>
     * <p>
     * 
     * @param pExactMatchRequiredIndicator the new value of the <code>exactMatchRequiredIndicator</code>
     *            property.
     */
    public void setExactMatchIndicator(final Boolean pExactMatchRequiredIndicator) {
        this.exactMatchIndicator = pExactMatchRequiredIndicator;
    }

    /**
     * Sets the value of <code>groupNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Alpha numeric characters
     * <p>
     * <b>Example: </b><br>
     * GR0000BE
     * <p>
     * 
     * @param pGroupNumber the current value of <code>groupNumber</code>property.
     */
    public void setGroupNumber(final String pGroupNumber) {

        this.groupNumber = ContractUtility.convertToUpperCase(pGroupNumber);

    }

    /**
     * Sets the value of <code>participantAccountNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-14 Character set for alphabet, number, hyphen, dot, slash and space.
     * <p>
     * <b>Example: </b><br>
     * GR0000BE
     * <p>
     * 
     * @param pParticipantAccountNumber the new value of <code>participantAccountNumber</code> of the
     *            participant group.
     */
    public void setParticipantAccountNumber(final String pParticipantAccountNumber) {

        this.participantAccountNumber = pParticipantAccountNumber;

    }

    /**
     * Sets the value of <code>participantAccountType</code> property.
     * <p>
     * 
     * @param pParticipantAccountType the new value of <code>participantAccountType</code> property.
     */
    public void setParticipantAccountType(final ParticipantAccountType pParticipantAccountType) {

        this.participantAccountType = pParticipantAccountType;

    }

    /**
     * Sets the value of <code>retrieveType</code> property.
     * <p>
     * <b>Possible values:</b>
     * <ul>
     * <li><code>G</code><br>
     * Retrieve participant group by group number.
     * <li><code>P</code><br>
     * Retrieve all groups for a participant.
     * </ul>
     * <p>
     * 
     * @param pRetrieveType the new value of<code>retrieveType</code> property.
     */
    public void setRetrieveType(final String pRetrieveType) {
        this.retrieveType = pRetrieveType;
    }

	/**
	 * @return the updatedFromDate
	 */
	public Date getUpdatedFromDate() {
		return updatedFromDate;
	}

	/**
	 * @param updatedFromDate the updatedFromDate to set
	 */
	public void setUpdatedFromDate(Date updatedFromDate) {
		this.updatedFromDate = updatedFromDate;
	}

	/**
	 * @return the updatedToDate
	 */
	public Date getUpdatedToDate() {
		return updatedToDate;
	}

	/**
	 * @param updatedToDate the updatedToDate to set
	 */
	public void setUpdatedToDate(Date updatedToDate) {
		this.updatedToDate = updatedToDate;
	}

    /**
     * @return the effectiveDate
     */
    public Date getEffectiveDate() {
        return this.effectiveDate;
    }

    /**
     * @param pEffectiveDate the effectiveDate to set
     */
    public void setEffectiveDate(final Date pEffectiveDate) {
        this.effectiveDate = pEffectiveDate;
    }
}
