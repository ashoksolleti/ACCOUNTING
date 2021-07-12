/* Copyright (c) 2013 Unisys Corporation. */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.CRAParticipantAccountType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.utils.dto.AttachmentsDto;

/**
 * <code>AccountingParticipantDto</code> class contain information specific to a AccountingParticipant.<br>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>billingAccountNumber
 * <li>accountType
 * <li>billingInfo
 * <li>creditInfoDto
 * <li>oId
 * <li>iataAccountNumber
 * <li>salesInfoDto
 * <li>accountingOperationsDto
 * <li>cassNumber
 * <li>participantOutstandingAmountDto
 * </code>
 * </ul>
 */
public class AccountingParticipantDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -7056105049789479043L;

    /**
     * Attribute to hold <code>accountType</code> property.
     */
    private CRAParticipantAccountType accountType;

    /**
     * Attribute to hold <code>billingAccountNumber</code> property.
     */
    private String billingAccountNumber;

    /**
     * Attribute to hold <code>billingInfo</code> property.
     */
    private List<BillingInfoDto> billingInfo;

    /**
     * Attribute to hold <code>cassNumber</code> property.
     */
    private String cassNumber;

    /**
     * Attribute to hold <code>creditInfoDto</code> property.
     */
    private CreditInfoDto creditInfoDto;

    /**
     * Attribute to hold <code>iataAccountNumber</code> property.
     */
    private String iataAccountNumber;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>salesInfoDto</code> property.
     */
    private SalesInfoDto salesInfoDto;

     
    private PaymentOutstandingAmountDto paymentOutstandingAmountDto;
    
    /**
     * Attribute to hold AttachmentDto.
     */
    private List<AttachmentsDto> attachmentsDtos;
    
    /**
     * Gets the <code>attachmentsDtos</code> property.
     * <p>
     * 
     * @return the current value of the <code>attachmentsDtos</code> property.
     */
    public List<AttachmentsDto> getAttachmentsDtos() {
        return this.attachmentsDtos;
    }


    /**
     * Sets the <code>pAttachmentsDtos</code>.
     * <p>
     * 
     * @param pAttachmentsDtos
     *            holds the new value of <code>attachmentsDtos</code>
     */
    public void setAttachmentsDtos(final List<AttachmentsDto> pAttachmentsDtos) {
        this.attachmentsDtos = pAttachmentsDtos;
    }
	  
	/**
     * Gets the <code>accountType</code> property.
     * <p>
     * 
     * @return the current value of the <code>accountType</code> property.
     */
    public CRAParticipantAccountType getAccountType() {
        return this.accountType;
    }

    /**
     * Gets the <code>billingAccountNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>billingAccountNumber</code> property.
     */
    public String getBillingAccountNumber() {
        return this.billingAccountNumber;
    }

    

    /**
     * Gets the <code>cassNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>cassNumber</code> property.
     */
    public String getCassNumber() {
        return this.cassNumber;
    }

    /**
     * Gets the <code>creditInfoDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>creditInfoDto</code> property.
     */
    public CreditInfoDto getCreditInfoDto() {
        if (creditInfoDto == null) {
            creditInfoDto = new CreditInfoDto();
        }
        return this.creditInfoDto;
    }

    /**
     * Gets the <code>iataAccountNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>iataAccountNumber</code> property.
     */
    public String getIataAccountNumber() {
        return this.iataAccountNumber;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return this.the current value of the <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>salesInfoDto</code> property.
     * <p>
     * 
     * @return this.the current value of the <code>salesInfoDto</code> property.
     */
    public SalesInfoDto getSalesInfoDto() {
        if (this.salesInfoDto == null) {
            this.salesInfoDto = new SalesInfoDto();
        }
        return this.salesInfoDto;
    }
    
    /**
     * Sets the <code>accountType</code> property.
     * <p>
     * 
     * @param pAccountType the new value of the <code>accountType</code> property.
     */
    public void setAccountType(final CRAParticipantAccountType pAccountType) {
        this.accountType = pAccountType;
    }

    /**
     * Sets the <code>billingAccountNumber</code> property.
     * <p>
     * 
     * @param pBillingAccountNumber the new value of the <code>billingAccountNumber</code> property.
     */
    public void setBillingAccountNumber(final String pBillingAccountNumber) {
        this.billingAccountNumber = pBillingAccountNumber;
    }

    /**
     * Sets the <code>billingInfo</code> property.
     * <p>
     * 
     * @param pBillingInfo the new value of the <code>billingInfo</code> property.
     */
 

    /**
     * Sets the <code>cassNumber</code> property.
     * <p>
     * 
     * @param pCassNumber the new value of the <code>cassNumber</code> property.
     */
    public void setCassNumber(final String pCassNumber) {
        this.cassNumber = pCassNumber;
    }

    /**
     * Sets the <code>creditInfoDto</code> property.
     * <p>
     * 
     * @param pCreditInfoDto the new value of the <code>creditInfoDto</code> property.
     */
    public void setCreditInfoDto(final CreditInfoDto pCreditInfoDto) {
        this.creditInfoDto = pCreditInfoDto;
    }

    /**
     * Sets the <code>iataAccountNumber</code> property.
     * <p>
     * 
     * @param pIataAccountNumber the new value of the <code>iataAccountNumber</code> property.
     */
    public void setIataAccountNumber(final String pIataAccountNumber) {
        this.iataAccountNumber = pIataAccountNumber;
    }

    /**
     * Sets the <code>OId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>salesInfoDto</code> property.
     * <p>
     * 
     * @param pSalesInfoDto the new value of the <code>salesInfoDto</code> property.
     */
    public void setSalesInfoDto(final SalesInfoDto pSalesInfoDto) {
        this.salesInfoDto = pSalesInfoDto;
    }


    /**
     * Gets the <code>paymentOutstandingAmountDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>paymentOutstandingAmountDto</code> property.
     */
    public PaymentOutstandingAmountDto getPaymentOutstandingAmountDto() {
        return this.paymentOutstandingAmountDto;
    }


    /**
     * Sets the <code>pPaymentOutstandingAmountDto</code>.
     * <p>
     * 
     * @param pPaymentOutstandingAmountDto
     *            holds the new value of <code>paymentOutstandingAmountDto</code>
     */
    public void setPaymentOutstandingAmountDto(final PaymentOutstandingAmountDto pPaymentOutstandingAmountDto) {
        this.paymentOutstandingAmountDto = pPaymentOutstandingAmountDto;
    }


	/**
	 * @return the billingInfo
	 */
	public List<BillingInfoDto> getBillingInfo() {
		if(billingInfo == null){
			billingInfo = new ArrayList<BillingInfoDto>();
		}
		return billingInfo;
	}


	/**
	 * @param billingInfo the billingInfo to set
	 */
	public void setBillingInfo(List<BillingInfoDto> billingInfo) {
		this.billingInfo = billingInfo;
	}
    
    
   
}
