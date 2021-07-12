package com.unisys.trans.logistics.lms.rating.dto.price;

import java.io.Serializable;
import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.rating.dto.constants.RateGenerationType;
import com.unisys.trans.logistics.lms.rating.dto.constants.ULDChargeType;
import com.unisys.trans.logistics.lms.utils.dto.constants.RateClassType;

public class ULDOverPivotRatingLine implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 7646703064684612462L;

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

    private BigDecimal chargeableWeight;

    private BigDecimal rateAmount;

    private RateClassType rateClass;

    private RateGenerationType rateGeneration;

    /**
     * Rating line number.
     */
    private Integer rateLineNumber;

    private ULDChargeType uldChargeType;

    /**
	 * @return the cargoLinePointer
	 */
	public String getCargoLinePointer() {
		return cargoLinePointer;
	}

    public BigDecimal getChargeableWeight() {
        return this.chargeableWeight;
    }

    public BigDecimal getRateAmount() {
        return this.rateAmount;
    }

    public RateClassType getRateClass() {
        return this.rateClass;
    }

    public RateGenerationType getRateGeneration() {
        return this.rateGeneration;
    }

    /**
	 * @return the rateLineNumber
	 */
	public Integer getRateLineNumber() {
		return rateLineNumber;
	}

    public ULDChargeType getUldChargeType() {
        return this.uldChargeType;
    }

    /**
	 * @param cargoLinePointer the cargoLinePointer to set
	 */
	public void setCargoLinePointer(String pCargoLinePointer) {
		this.cargoLinePointer = pCargoLinePointer;
	}

    public void setChargeableWeight(final BigDecimal pChargeableWeight) {
        this.chargeableWeight = pChargeableWeight;
    }

    public void setRateAmount(final BigDecimal pRateAmount) {
        this.rateAmount = pRateAmount;
    }
    
	public void setRateClass(final RateClassType pRateClass) {
        this.rateClass = pRateClass;
    }

	public void setRateGeneration(RateGenerationType pRateGeneration) {
        this.rateGeneration = pRateGeneration;
    }

	/**
	 * @param rateLineNumber the rateLineNumber to set
	 */
	public void setRateLineNumber(Integer pRateLineNumber) {
		this.rateLineNumber = pRateLineNumber;
	}

	public void setUldChargeType(ULDChargeType pUldChargeType) {
        this.uldChargeType = pUldChargeType;
    }

}
