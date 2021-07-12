/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.CRAParticipantAccountType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

/**
 * <code>AccountingDto</code> class contain information specific to a Accounting.<br>
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
 * </code>
 * <li>partsOutstandingAmountDto
 * </ul>
 */
public class AccountingDto extends PersistenceObjectDto {

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
    private List<BillingPartsInfoDto> billingInfo;

    /**
     * Attribute to hold <code>cassNumber</code> property.
     */
    private String cassNumber;

    /**
     * Attribute to hold <code>creditInfoDto</code> property.
     */
    private CreditPartsInfoDto creditInfoDto;

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
    private SalesPartsInfoDto salesInfoDto;
    
    
    private PartsOutstandingAmountDto partsOutstandingAmountDto;
    
    /**
     * Attribute to hold AttachmentDto.
     */
    private List<AttachmentsPartsDto> attachmentsPartsDtos;
    


    /**
     * Gets the <code>attachmentsPartsDtos</code> property.
     * <p>
     * 
     * @return the current value of the <code>attachmentsPartsDtos</code> property.
     */
    public List<AttachmentsPartsDto> getAttachmentsPartsDtos() {
        return this.attachmentsPartsDtos;
    }

    /**
     * Sets the <code>pAttachmentsPartsDtos</code>.
     * <p>
     * 
     * @param pAttachmentsPartsDtos
     *            holds the new value of <code>attachmentsPartsDtos</code>
     */
    public void setAttachmentsPartsDtos(final List<AttachmentsPartsDto> pAttachmentsPartsDtos) {
        this.attachmentsPartsDtos = pAttachmentsPartsDtos;
    }

    /**
     * Gets the <code>PartsOutstandingAmountDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>PartsOutstandingAmountDto</code> property.
     */
    public PartsOutstandingAmountDto getPartsOutstandingAmountDto() {
        if (partsOutstandingAmountDto == null) {
            partsOutstandingAmountDto = new PartsOutstandingAmountDto();
        }
		return partsOutstandingAmountDto;
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
     * Gets the <code>billingInfo</code> property.
     * <p>
     * 
     * @return the current value of the <code>billingInfo</code> property.
     */
    public List<BillingPartsInfoDto> getBillingInfo() {
        if (billingInfo == null) {
            billingInfo = new ArrayList<BillingPartsInfoDto>();
        }
        return this.billingInfo;
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
    public CreditPartsInfoDto getCreditInfoDto() {
        if (creditInfoDto == null) {
            creditInfoDto = new CreditPartsInfoDto();
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
    public SalesPartsInfoDto getSalesInfoDto() {
        if (salesInfoDto == null) {
            salesInfoDto = new SalesPartsInfoDto();
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
    public void setBillingInfo(final List<BillingPartsInfoDto> pBillingInfo) {
        this.billingInfo = pBillingInfo;
    }

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
    public void setCreditInfoDto(final CreditPartsInfoDto pCreditInfoDto) {
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
    public void setSalesInfoDto(final SalesPartsInfoDto pSalesInfoDto) {
        this.salesInfoDto = pSalesInfoDto;
    }
    
    /**
     * Sets the <code>setPartsOutstandingAmountDto</code> property.
     * <p>
     * 
     * @param pPartsOutstandingAmountDto the new value of the <code>setPartsOutstandingAmountDto</code> property.
     */
    public void setPartsOutstandingAmountDto(
			final PartsOutstandingAmountDto pPartsOutstandingAmountDto) {
		this.partsOutstandingAmountDto = pPartsOutstandingAmountDto;
	}

}
