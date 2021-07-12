package com.unisys.trans.logistics.lms.awb.dto;

import com.unisys.trans.logistics.lms.framework.constants.ParticipantCodeType;
import com.unisys.trans.logistics.lms.framework.dto.ContactDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class AirWaybillParticipantDto extends PersistenceObjectDto {
	


    /**
	 * 
	 */
	private static final long serialVersionUID = -4853212732399235747L;

	/**
     * Attribute to holds <code>accountNumber</code> property.
     */
    private String accountNumber1;
    
    /**
     * Attribute to holds <code>accountNumber</code> property.
     */
    private String accountNumber2;
    
    /**
     * Attribute to holds <code>contactDetails</code> property.
     */
    private ContactDto contactDetails;

    private String customerSegmentation;

	/**
     * Attribute to holds <code>deleteIndicator</code> property.
     */
    private boolean deleteIndicator;

	/**
     * Attribute to holds <code>frequentFlyerNumber</code> property.
     */
    private String frequentFlyerNumber;

	/**
     * Attribute to holds <code>accountNumber</code> property.
     */
    private String iataAccount;

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
    private ParticipantCodeType participantType;
    
    /**
     * Attribute to holds <code>station</code> property.
     */
    private String station;
    
    private String prefAccountNumber;
    
    public String getPrefAccountNumber() {
		return prefAccountNumber;
	}

	public void setPrefAccountNumber(String prefAccountNumber) {
		this.prefAccountNumber = prefAccountNumber;
	}

	/**
     * Gets the <code>accountNumber</code> property.
     * <p>
     * 
     */
    public String getAccountNumber1() {
       return this.accountNumber1;
    }

	public String getAccountNumber2() {
		return accountNumber2;
	}

	/**
     * Gets the <code>contactDetails</code> property.
     * <p>
     * 
     */

    public ContactDto getContactDetails() {
       return this.contactDetails;
    }

    public String getCustomerSegmentation() {
		return customerSegmentation;
	}

    /**
     * Gets the <code>deleteIndicator</code> property.
     * <p>
     * 
     */

    public boolean getDeleteIndicator() {
       return this.deleteIndicator;
    }

    /**
     * Gets the <code>frequentFlyerNumber</code> property.
     * <p>
     * 
     */

    public String getFrequentFlyerNumber() {
       return this.frequentFlyerNumber;
    }
    
    

    public String getIataAccount() {
		return iataAccount;
	}

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     */
    public Long getOId() {
       return this.oId;
    }

    /**
     * Gets the <code>participantName</code> property.
     * <p>
     * 
     */
    public String getParticipantName() {
       return this.participantName;
    }

    /**
     * Gets the <code>participantType</code> property.
     * <p>
     * 
     */
    public ParticipantCodeType getParticipantType() {
       return this.participantType;
    }

    /**
     * Gets the <code>station</code> property.
     * <p>
     * 
     */

    public String getStation() {
       return this.station;
    }

    /**
     * Sets the <code>accountNumber</code> property.
     * <p>
     * 
     *            the new value of the <code>accountNumber</code> property.
     */
    public void setAccountNumber1(final String pAccountNumber1) {
        this.accountNumber1 = pAccountNumber1;
    }

    public void setAccountNumber2(String accountNumber2) {
		this.accountNumber2 = accountNumber2;
	}

    /**
     * Sets the <code>contactDetails</code> property.
     * <p>
     * 
     *            the new value of the <code>contactDetails</code> property.
     */
    public void setContactDetails(final ContactDto pContactDetails) {
        this.contactDetails = pContactDetails;
    }

    public void setCustomerSegmentation(String customerSegmentation) {
		this.customerSegmentation = customerSegmentation;
	}

    /**
     * Sets the <code>deleteIndicator</code> property.
     * <p>
     * 
     *            the new value of the <code>deleteIndicator</code> property.
     */
    public void setDeleteIndicator(boolean pDeleteIndicator) {
        this.deleteIndicator = pDeleteIndicator;
    }

    /**
     * Sets the <code>frequentFlyerNumber</code> property.
     * <p>
     * 
     *            the new value of the <code>frequentFlyerNumber</code> property.
     */

    public void setFrequentFlyerNumber(String pFrequentFlyerNumber) {
        this.frequentFlyerNumber = pFrequentFlyerNumber;
    }

    public void setIataAccount(String iataAccount) {
		this.iataAccount = iataAccount;
	}

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     *            the new value of the <code>oId</code> property.
     */

    public void setoId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>participantName</code> property.
     * <p>
     * 
     *            the new value of the <code>participantName</code> property.
     */

    public void setParticipantName(final String pParticipantName) {
        this.participantName = pParticipantName;
    }

    /**
     * Sets the <code>participantType</code> property.
     * <p>
     * 
     *            the new value of the <code>participantType</code> property.
     */

    public void setParticipantType(final ParticipantCodeType pParticipantType) {
        this.participantType = pParticipantType;
    }

    /**
     * Sets the <code>station</code> property.
     * <p>
     * 
     *            the new value of the <code>station</code> property.
     */

    public void setStation(final String pStation) {
        this.station = pStation;
    }
    


    /**
     * Attribute to holds <code>responsibleForPayment</code> property.
     */
    private String responsibleForPayment;


    /**
     * @return the responsibleForPayment
     */
	public String getResponsibleForPayment() {
		return responsibleForPayment;
	}


    /**
     * @param pResponsibleForPayment the responsibleForPayment to set
     */
	public void setResponsibleForPayment(String pResponsibleForPayment) {
		this.responsibleForPayment = pResponsibleForPayment;
	}

}
