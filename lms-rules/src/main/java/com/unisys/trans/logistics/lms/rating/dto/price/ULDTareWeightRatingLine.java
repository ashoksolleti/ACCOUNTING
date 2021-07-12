package com.unisys.trans.logistics.lms.rating.dto.price;

import java.io.Serializable;
import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.rating.dto.constants.RateGenerationType;
import com.unisys.trans.logistics.lms.utils.dto.constants.RateClassType;

public class ULDTareWeightRatingLine implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 6019873480131466916L;

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

    private BigDecimal grossWeight;

    private RateClassType rateClass;

    private RateGenerationType rateGeneration;

    /**
     * Rating line number.
     */
    private Integer rateLineNumber;

	/**
	 * @return the cargoLinePointer
	 */
	public String getCargoLinePointer() {
		return cargoLinePointer;
	}

	public BigDecimal getGrossWeight() {
        return this.grossWeight;
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

    /**
	 * @param cargoLinePointer the cargoLinePointer to set
	 */
	public void setCargoLinePointer(String pCargoLinePointer) {
		this.cargoLinePointer = pCargoLinePointer;
	}

    public void setGrossWeight(final BigDecimal pGrossWeight) {
        this.grossWeight = pGrossWeight;
    }

    public void setRateClass(final RateClassType pRateClass) {
        this.rateClass = pRateClass;
    }

	public void setRateGeneration(final RateGenerationType pRateGeneration) {
        this.rateGeneration = pRateGeneration;
    }

	/**
	 * @param rateLineNumber the rateLineNumber to set
	 */
	public void setRateLineNumber(Integer pRateLineNumber) {
		this.rateLineNumber = pRateLineNumber;
	}
}
