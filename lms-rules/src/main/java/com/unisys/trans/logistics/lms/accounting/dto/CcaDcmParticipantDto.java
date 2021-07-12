package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.unisys.trans.logistics.lms.accounting.dto.constants.AWBParticipantType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ParticipantAccountType;
import com.unisys.trans.logistics.lms.framework.domain.Contact;
import com.unisys.trans.logistics.lms.framework.dto.ContactDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>AccountingAirWaybillParticipant</code> domain contain details of AccountingAirWaybillParticipant.
 * <p>
 * This contains all information about AccountingAirWaybillParticipant.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>billToAccountNumber
 * <li>iataAccountNumber
 * <li>contactDetails
 * <li>deleteIndicator
 * <li>frequentFlyerNumber
 * <li>oId
 * <li>participantName
 * <li>participantType
 * <li>station
 * </ul>
 */

public class CcaDcmParticipantDto implements Serializable {

    /**
     * Unique Serial version Id UID
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to holds <code>billToAccountNumber</code> property.
     */
    private String billToAccountNumber;

    /**
     * Attribute to holds <code>accountNumber</code> property.
     */
    private String iataAccountNumber;

    /**
     * Attribute to holds <code>contactDetails</code> property.
     */
    private ContactDto contactDetails;

    /**
     * Attribute to holds <code>deleteIndicator</code> property.
     */
    private boolean deleteIndicator;

    /**
     * Attribute to holds <code>frequentFlyerNumber</code> property.
     */
    private String frequentFlyerNumber;

    /**
     * Attribute to holds <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to holds <code>participantName</code> property.
     */
    private String participantName;

    /**
     * Attribute to holds <code>participantType</code> property.
     */
    private AWBParticipantType participantType;

    /**
     * Attribute to holds <code>participantType</code> property.
     */
   /* @Enumerated(EnumType.STRING)
    @Column(name = "PARTICIPANTACCOUNTTYPE", length = 17, nullable = false)
    private ParticipantAccountType participantAccountType;*/

    /**
     * Attribute to holds <code>station</code> property.
     */
    private String station;
    
    private String accountNumberToDisplay;
    
    private String address;

    public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

    /**
     * Gets the <code>billToAccountNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>billToAccountNumber</code> property.<br>
     */
    public String getBillToAccountNumber() {
        return this.billToAccountNumber;
    }

    /**
     * Gets the <code>iataAccountNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>iataAccountNumber</code> property.<br>
     */
    public String getIataAccountNumber() {
        return this.iataAccountNumber;
    }


    /**
     * Gets the <code>frequentFlyerNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>frequentFlyerNumber</code> property.<br>
     */

    public String getFrequentFlyerNumber() {
        return this.frequentFlyerNumber;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>participantName</code> property.
     * <p>
     * 
     * @return the current value of the <code>participantName</code> property.<br>
     */
    public String getParticipantName() {
        return this.participantName;
    }

    /**
     * Gets the <code>participantType</code> property.
     * <p>
     * 
     * @return the current value of the <code>participantType</code> property.<br>
     */
    public AWBParticipantType getParticipantType() {
        return this.participantType;
    }

    /**
     * Gets the <code>station</code> property.
     * <p>
     * 
     * @return the current value of the <code>station</code> property.<br>
     */

    public String getStation() {
        return this.station;
    }

    /**
     * Gets the <code>deleteIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>deleteIndicator</code> property.<br>
     */

    public boolean getDeleteIndicator() {
        return this.deleteIndicator;
    }

    /**
     * Sets the <code>billToAccountNumber</code> property.
     * <p>
     * 
     * @param pBillToAccountNumber
     *            the new value of the <code>billToAccountNumber</code> property.
     */
    public void setBillToAccountNumber(final String pBillToAccountNumber) {
        this.billToAccountNumber = pBillToAccountNumber;
    }

    /**
     * Sets the <code>iataAccountNumber</code> property.
     * <p>
     * 
     * @param pIataAccountNumber
     *            the new value of the <code>iataAccountNumber</code> property.
     */
    public void setIataAccountNumber(final String pIataAccountNumber) {
        this.iataAccountNumber = pIataAccountNumber;
    }


    /**
     * Sets the <code>deleteIndicator</code> property.
     * <p>
     * 
     * @param pDeleteIndicator
     *            the new value of the <code>deleteIndicator</code> property.
     */
    public void setDeleteIndicator(boolean pDeleteIndicator) {
        this.deleteIndicator = pDeleteIndicator;
    }

    /**
     * Sets the <code>frequentFlyerNumber</code> property.
     * <p>
     * 
     * @param pFrequentFlyerNumber
     *            the new value of the <code>frequentFlyerNumber</code> property.
     */

    public void setFrequentFlyerNumber(String pFrequentFlyerNumber) {
        this.frequentFlyerNumber = pFrequentFlyerNumber;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.
     */

    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>participantName</code> property.
     * <p>
     * 
     * @param pParticipantName
     *            the new value of the <code>participantName</code> property.
     */

    public void setParticipantName(final String pParticipantName) {
        this.participantName = pParticipantName;
    }

    /**
     * Sets the <code>participantType</code> property.
     * <p>
     * 
     * @param pParticipantType
     *            the new value of the <code>participantType</code> property.
     */

    public void setParticipantType(final AWBParticipantType pParticipantType) {
        this.participantType = pParticipantType;
    }

    /**
     * Sets the <code>station</code> property.
     * <p>
     * 
     * @param pStation
     *            the new value of the <code>station</code> property.
     */

    public void setStation(final String pStation) {
        this.station = pStation;
    }

	/**
	 * @return the contactDetails
	 */
	public ContactDto getContactDetails() {
		return contactDetails;
	}

	/**
	 * @param contactDetails the contactDetails to set
	 */
	public void setContactDetails(ContactDto contactDetails) {
		this.contactDetails = contactDetails;
	}

	/**
	 * @return the oId
	 */
	public Long getoId() {
		return oId;
	}

	/**
	 * @param oId the oId to set
	 */
	public void setoId(Long oId) {
		this.oId = oId;
	}
	
	public String getAccountNumberToDisplay() {

        if (AWBParticipantType.A.equals(this.participantType)) {
            if (this.iataAccountNumber != null && !this.iataAccountNumber.isEmpty()) {
                accountNumberToDisplay = this.iataAccountNumber;
            }
            else {
                accountNumberToDisplay = this.billToAccountNumber;
            }
        }
        else {
            if (this.billToAccountNumber != null && !this.billToAccountNumber.isEmpty()) {
                accountNumberToDisplay = this.billToAccountNumber;
            }
            else {
                accountNumberToDisplay = this.iataAccountNumber;
            }
        }
        return accountNumberToDisplay;
    }

    public void setAccountNumberToDisplay(final String pAccountNumberToDisplay) {
        if (AWBParticipantType.A.equals(this.participantType)) {
            this.iataAccountNumber = ContractUtility.convertToUpperCase(pAccountNumberToDisplay);
            this.billToAccountNumber = null;
        }
        else {
            this.billToAccountNumber = ContractUtility.convertToUpperCase(pAccountNumberToDisplay);
            this.iataAccountNumber = null;
        }

    }
}
