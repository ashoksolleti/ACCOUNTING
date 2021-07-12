package com.unisys.trans.logistics.lms.rating.dto.price;

import java.io.Serializable;
import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.rating.dto.constants.RateGenerationType;
import com.unisys.trans.logistics.lms.utils.dto.constants.RateClassType;

public class ULDDiscountRatingLine implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -2435811263772423874L;

    /**
     * Attribute to hold <code>amount</code> property.
     */
    private BigDecimal amount;

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

    private RateClassType rateClass;
    
    private RateGenerationType rateGeneration;

    private String rateIndicator;
    
    /**
     * Rating line number.
     */
    private Integer rateLineNumber;

	private BigDecimal rateTotalCharges;

	/**
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}
    /**
	 * @return the cargoLinePointer
	 */
	public String getCargoLinePointer() {
		return cargoLinePointer;
	}

    /**
	 * @return the chargeableWeight
	 */
	public BigDecimal getChargeableWeight() {
		return chargeableWeight;
	}

    public RateClassType getRateClass() {
        return this.rateClass;
    }

    public RateGenerationType getRateGeneration() {
        return this.rateGeneration;
    }

    /**
	 * @return the rateIndicator
	 */
	public String getRateIndicator() {
		return rateIndicator;
	}

	/**
	 * @return the rateLineNumber
	 */
	public Integer getRateLineNumber() {
		return rateLineNumber;
	}

	/**
	 * @return the rateTotalCharges
	 */
	public BigDecimal getRateTotalCharges() {
		return rateTotalCharges;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(BigDecimal pAmount) {
		this.amount = pAmount;
	}

	/**
	 * @param cargoLinePointer the cargoLinePointer to set
	 */
	public void setCargoLinePointer(String pCargoLinePointer) {
		this.cargoLinePointer = pCargoLinePointer;
	}

	/**
	 * @param chargeableWeight the chargeableWeight to set
	 */
	public void setChargeableWeight(BigDecimal pChargeableWeight) {
		this.chargeableWeight = pChargeableWeight;
	}

	public void setRateClass(RateClassType pRateClass) {
        this.rateClass = pRateClass;
    }

	public void setRateGeneration(final RateGenerationType pRateGeneration) {
        this.rateGeneration = pRateGeneration;
    }

	/**
	 * @param rateIndicator the rateIndicator to set
	 */
	public void setRateIndicator(String rateIndicator) {
		this.rateIndicator = rateIndicator;
	}

	/**
	 * @param rateLineNumber the rateLineNumber to set
	 */
	public void setRateLineNumber(Integer pRateLineNumber) {
		this.rateLineNumber = pRateLineNumber;
	}

	/**
	 * @param rateTotalCharges the rateTotalCharges to set
	 */
	public void setRateTotalCharges(BigDecimal pRateTotalCharges) {
		this.rateTotalCharges = pRateTotalCharges;
	}

}
