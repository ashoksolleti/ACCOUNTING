/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.accounting.dto.constants.ParticipantAccountType;
import com.unisys.trans.logistics.lms.framework.constants.CRAParticipantAccountType;
import com.unisys.trans.logistics.lms.framework.constants.InvoiceFrequencyType;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

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
public class BillingScheduleFindRequest extends AbstractRequest {
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
    private InvoiceFrequencyType invoiceFrequency;

    
    /**
     * Attribute to hold <code>participantAccountType</code> property.
     */
    private String participantAccountType;
    
    private String billingScheduleType;
    
    private Date billingScheduleFromDate;
    
    private Date billingScheduleToDate;
    
    private String clearancePeriodType;
     
    private Date clearancePeriodFromDate;
    
    private Date clearancePeriodToDate;
    
    private String clearanceMonth;
    
    private String participantTypeCountry;

    /**
     * Attribute to hold <code>retrieveType</code> property.
     */
    private String retrieveType;

    /**
     * <code>Default constructor.</code>
     */
    /** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private BillingSchedulesDto billingSchedulesDto;
	
	private String specificAirline;
	 
   
    public BillingScheduleFindRequest() {

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
     * Gets the value of the <code>participantAccountType</code> property.
     * <p>
     * 
     * @return the current value of <code>participantAccountType</code> property.
     */
    public String getParticipantAccountType() {

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
     * Sets the value of <code>participantAccountType</code> property.
     * <p>
     * 
     * @param pParticipantAccountType the new value of <code>participantAccountType</code> property.
     */
    public void setParticipantAccountType(final String pParticipantAccountType) {

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

	

	public InvoiceFrequencyType getInvoiceFrequency() {
		return invoiceFrequency;
	}

	public void setInvoiceFrequency(InvoiceFrequencyType invoiceFrequency) {
		this.invoiceFrequency = invoiceFrequency;
	}

	public String getBillingScheduleType() {
		return billingScheduleType;
	}

	public void setBillingScheduleType(String billingScheduleType) {
		this.billingScheduleType = billingScheduleType;
	}

	public Date getBillingScheduleFromDate() {
		return billingScheduleFromDate;
	}

	public void setBillingScheduleFromDate(Date billingScheduleFromDate) {
		this.billingScheduleFromDate = billingScheduleFromDate;
	}

	public Date getBillingScheduleToDate() {
		return billingScheduleToDate;
	}

	public void setBillingScheduleToDate(Date billingScheduleToDate) {
		this.billingScheduleToDate = billingScheduleToDate;
	}

	public String getClearancePeriodType() {
		return clearancePeriodType;
	}

	public void setClearancePeriodType(String clearancePeriodType) {
		this.clearancePeriodType = clearancePeriodType;
	}

	public Date getClearancePeriodFromDate() {
		return clearancePeriodFromDate;
	}

	public void setClearancePeriodFromDate(Date clearancePeriodFromDate) {
		this.clearancePeriodFromDate = clearancePeriodFromDate;
	}

	public Date getClearancePeriodToDate() {
		return clearancePeriodToDate;
	}

	public void setClearancePeriodToDate(Date clearancePeriodToDate) {
		this.clearancePeriodToDate = clearancePeriodToDate;
	}

	public String getClearanceMonth() {
		return clearanceMonth;
	}

	public void setClearanceMonth(String clearanceMonth) {
		this.clearanceMonth = clearanceMonth;
	}

	public String getParticipantTypeCountry() {
		return participantTypeCountry;
	}

	public void setParticipantTypeCountry(String participantTypeCountry) {
		this.participantTypeCountry = participantTypeCountry;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
	 
	public BillingSchedulesDto getBillingSchedulesDto() {
		return billingSchedulesDto;
	}

	public void setBillingSchedulesDto(BillingSchedulesDto billingSchedulesDto) {
		this.billingSchedulesDto = billingSchedulesDto;
	}

	/**
	 * @return the specificAirline
	 */
	public String getSpecificAirline() {
		return specificAirline;
	}

	/**
	 * @param specificAirline the specificAirline to set
	 */
	public void setSpecificAirline(String specificAirline) {
		this.specificAirline = specificAirline;
	}
	
	
}
