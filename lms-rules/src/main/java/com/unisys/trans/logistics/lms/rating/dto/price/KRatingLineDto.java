/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto.price;

import java.io.Serializable;
import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.rating.dto.constants.RateGenerationType;
import com.unisys.trans.logistics.lms.utils.dto.constants.RateClassType;

/**
 * Rating Line Information that requires pricing.
 */
public class KRatingLineDto implements Serializable {

    /**
	 * 
	 */
    private static final long serialVersionUID = 3575428460109389630L;

    /**
     * Line pointer in CGO.<br />
     * ACR inserts new rating lines in some cases ($$, E, X, Y, K or RCP) corresponding to the line on screen
     * in CGO (A1LNBR). <br />
     * Source is CGO; Used by ACR to generate A1LPTR for inserted line(s). For $$set to special value of 99. <br />
     * Used by CGO to merge rating lines returned from ACR with the lines CGO sent to ACR for the Cargo
     * Published Rate (PUBRAT)
     * record which has Face &amp; Published rating information. <br />
     * 
     */
    private String cargoLinePointer;

    private BigDecimal rateAmount;

    private RateClassType rateClass;

    private RateGenerationType rateGenerationInd;

    private String rateIndicator;
    
    /**
     * Rating line number.
     */
    private Integer rateLineNumber;

    private BigDecimal rateTotalCharges;

    /**
	 * @return the cargoLinePointer
	 */
	public String getCargoLinePointer() {
		return this.cargoLinePointer;
	}

    /**
     * @return the rateAmount
     */
    public BigDecimal getRateAmount() {
        return this.rateAmount;
    }

    /**
     * @return the rateClass
     */
    public RateClassType getRateClass() {
        return this.rateClass;
    }

    public RateGenerationType getRateGenerationInd() {
        return this.rateGenerationInd;
    }

    public String getRateIndicator() {
        return this.rateIndicator;
    }

    /**
	 * @return the rateLineNumber
	 */
	public Integer getRateLineNumber() {
		return this.rateLineNumber;
	}

    public BigDecimal getRateTotalCharges() {
        return this.rateTotalCharges;
    }

    /**
	 * @param cargoLinePointer the cargoLinePointer to set
	 */
	public void setCargoLinePointer(String pCargoLinePointer) {
		this.cargoLinePointer = pCargoLinePointer;
	}

    /**
     * Sets the <code>rateAmount</code> property.
     * <p>
     * 
     * @param pRateAmount
     *            the current value of the <code>rateAmount</code> property.
     */
    public void setRateAmount(final BigDecimal pRateAmount) {
        this.rateAmount = pRateAmount;
    }

    /**
     * Sets the <code>rateClass</code> property.
     * <p>
     * 
     * @param pRateClass
     *            the current value of the <code>rateClass</code> property.
     */
    public void setRateClass(final RateClassType pRateClass) {
        this.rateClass = pRateClass;
    }

	public void setRateGenerationInd(final RateGenerationType pRateGenerationInd) {
        this.rateGenerationInd = pRateGenerationInd;
    }

	public void setRateIndicator(final String pRateIndicator) {
        this.rateIndicator = pRateIndicator;
    }

	/**
	 * @param rateLineNumber the rateLineNumber to set
	 */
	public void setRateLineNumber(Integer pRateLineNumber) {
		this.rateLineNumber = pRateLineNumber;
	}

	public void setRateTotalCharges(final BigDecimal pRateTotalCharges) {
        this.rateTotalCharges = pRateTotalCharges;
    }
}