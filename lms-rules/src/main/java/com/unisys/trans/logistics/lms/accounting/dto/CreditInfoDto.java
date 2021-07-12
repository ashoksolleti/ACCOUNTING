/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>CreditInfoDto</code> class contain information specific to a CreditInfo.<br>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>agingAnalysisDate
 * <li>amountsUnapplied
 * <li>amountsUnbilled
 * <li>oId
 * <li>collectorId
 * <li>totalOutstanding
 * <li>collectionEmail
 * <li>collectionMedia
 * <li>collectionAgent
 * <li>collectionResult
 * </code>
 * </ul>
 */
public class CreditInfoDto extends PersistenceObjectDto {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 447110167079583152L;

    /**
     * Attribute to hold <code>agingAnalysisDate</code> property.
     */
    private Date agingAnalysisDate;

    /**
     * Attribute to hold <code>amountsUnapplied</code> property.
     */
    private BigDecimal amountsUnapplied;

    /**
     * Attribute to hold <code>amountsUnbilled</code> property.
     */
    private BigDecimal amountsUnbilled;

    /**
     * Attribute to hold <code>collectorId</code> property.
     */
    private String collectorId;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>totalOutstanding</code> property.
     */
    private BigDecimal totalOutstanding;

    private BigDecimal toleranceLimit;

    /**
     * Attribute to hold <code>collectionEmail</code> property.
     */
    private String collectionEmail;

    /**
     * Attribute to hold <code>collectionMedia</code> property.
     */
    private Boolean collectionMedia;

    /**
     * Attribute to hold <code>collectionResultDto</code> property.
     */
    private CreditCollectionResultDto collectionResultDto;
    
    private String paymentMethod;

    /**
     * Gets the <code>collectionResultDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>collectionResultDto</code> property.
     */
    public CreditCollectionResultDto getCollectionResultDto() {
        
        if (collectionResultDto == null) {
            collectionResultDto = new CreditCollectionResultDto();
        }
        return this.collectionResultDto;
    }

    /**
     * Sets the <code>pCollectionResultDto</code>.
     * <p>
     * 
     * @param pCollectionResultDto
     *            holds the new value of <code>collectionResultDto</code>
     */
    public void setCollectionResultDto(final CreditCollectionResultDto pCollectionResultDto) {
        this.collectionResultDto = pCollectionResultDto;
    }

    /**
     * Gets the <code>collectionMedia</code> property.
     * <p>
     * 
     * @return the current value of the <code>collectionMedia</code> property.
     */
    public Boolean getCollectionMedia() {
        return this.collectionMedia;
    }

    /**
     * Sets the <code>pCollectionMedia</code>.
     * <p>
     * 
     * @param pCollectionMedia
     *            holds the new value of <code>collectionMedia</code>
     */
    public void setCollectionMedia(final Boolean pCollectionMedia) {
        this.collectionMedia = pCollectionMedia;
    }

    /**
     * Gets the <code>collectionEmail</code> property.
     * <p>
     * 
     * @return the current value of the <code>collectionEmail</code> property.
     */
    public String getCollectionEmail() {
        return this.collectionEmail;
    }

    /**
     * Sets the <code>pCollectionEmail</code>.
     * <p>
     * 
     * @param pCollectionEmail
     *            holds the new value of <code>collectionEmail</code>
     */
    public void setCollectionEmail(final String pCollectionEmail) {
        this.collectionEmail = pCollectionEmail;
    }

    /**
     * Gets the <code>toleranceLimit</code> property.
     * <p>
     * 
     * @return the current value of the <code>toleranceLimit</code> property.
     */
    public BigDecimal getToleranceLimit() {
        return this.toleranceLimit;
    }

    /**
     * Gets the <code>agingAnalysisDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>agingAnalysisDate</code> property.
     */
    public Date getAgingAnalysisDate() {
        return ContractUtility.getClonedDate(this.agingAnalysisDate);
    }

    /**
     * Gets the <code>amountsUnapplied</code> property.
     * <p>
     * 
     * @return the current value of the <code>amountsUnapplied</code> property.
     */
    public BigDecimal getAmountsUnapplied() {
        return this.amountsUnapplied;
    }

    /**
     * Gets the <code>amountsUnbilled</code> property.
     * <p>
     * 
     * @return the current value of the <code>amountsUnbilled</code> property.
     */
    public BigDecimal getAmountsUnbilled() {
        return this.amountsUnbilled;
    }

    /**
     * Gets the <code>collectorId</code> property.
     * <p>
     * 
     * @return the current value of the <code>collectorId</code> property.
     */
    public String getCollectorId() {
        return ContractUtility.convertToUpperCase(this.collectorId);
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
     * Gets the <code>totalOutstanding</code> property.
     * <p>
     * 
     * @return the current value of the <code>totalOutstanding</code> property.
     */
    public BigDecimal getTotalOutstanding() {
        return this.totalOutstanding;
    }

    /**
     * Sets the <code>agingAnalysisDate</code> property.
     * <p>
     * 
     * @param pAgingAnalysisDate the new value of the <code>agingAnalysisDate</code> property.
     */
    public void setAgingAnalysisDate(final Date pAgingAnalysisDate) {
        this.agingAnalysisDate = ContractUtility.getClonedDate(pAgingAnalysisDate);
    }

    /**
     * Sets the <code>amountsUnapplied</code> property.
     * <p>
     * 
     * @param pAmountsUnapplied the new value of the <code>amountsUnapplied</code> property.
     */
    public void setAmountsUnapplied(final BigDecimal pAmountsUnapplied) {
        this.amountsUnapplied = pAmountsUnapplied;
    }

    /**
     * Sets the <code>amountsUnbilled</code> property.
     * <p>
     * 
     * @param pAmountsUnbilled the new value of the <code>amountsUnbilled</code> property.
     */
    public void setAmountsUnbilled(final BigDecimal pAmountsUnbilled) {
        this.amountsUnbilled = pAmountsUnbilled;
    }

    /**
     * Sets the <code>collectorId</code> property.
     * <p>
     * 
     * @param pCollectorId the new value of the <code>collectorId</code> property.
     */
    public void setCollectorId(final String pCollectorId) {
        this.collectorId = pCollectorId;
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
     * Sets the <code>toleranceLimit</code> property.
     * <p>
     * 
     * @param pToleranceLimit the new value of the <code>toleranceLimit</code> property.
     */
    public void setToleranceLimit(final BigDecimal pToleranceLimit) {
        this.toleranceLimit = pToleranceLimit;
    }

    /**
     * Sets the <code>totalOutstanding</code> property.
     * <p>
     * 
     * @param pTotalOutstanding the new value of the <code>totalOutstanding</code> property.
     */
    public void setTotalOutstanding(final BigDecimal pTotalOutstanding) {
        this.totalOutstanding = pTotalOutstanding;
    }

	/**
	 * @return the paymentMethod
	 */
	public String getPaymentMethod() {
		return paymentMethod;
	}

	/**
	 * @param paymentMethod the paymentMethod to set
	 */
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
    
    

}
