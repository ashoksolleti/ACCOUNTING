/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto.price;

import java.io.Serializable;

import com.unisys.trans.logistics.lms.rating.dto.constants.RateGenerationType;

/**
 * Rating General description line.
 * 
 */
public class RatingDescriptionLineDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6699518198468499372L;

	/**
	 * Line pointer in CGO.<br />
	 * ACR inserts new rating lines in some cases ($$, E, X, Y, K or RCP) corresponding to the line on screen
	 * in CGO (A1LNBR). <br />
	 * Source is CGO; Used by ACR to generate A1LPTR for inserted line(s). For $$set to special value of 99. <br />
	 * Used by CGO to merge rating lines returned from ACR with the lines CGO sent to ACR for the Cargo
	 * Published Rate (PUBRAT) record which has Face &amp; Published rating information. <br />
	 * 
	 */
	private String cargoLinePointer;

	private Boolean dimensionIndicator;

	private RateGenerationType rateGeneration;

	/**
	 * Rating line number.
	 */
	private Integer rateLineNumber;

	private String ratingLineDescription;

	/**
	 * @return the cargoLinePointer
	 */
	public String getCargoLinePointer() {
		return cargoLinePointer;
	}

	/**
	 * @return the dimensionIndicator
	 */
	public Boolean getDimensionIndicator() {
		return this.dimensionIndicator;
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
	 * @return the ratingLineDescription
	 */
	public String getRatingLineDescription() {
		return ratingLineDescription;
	}

	/**
	 * @param cargoLinePointer
	 *            the cargoLinePointer to set
	 */
	public void setCargoLinePointer(String pCargoLinePointer) {
		this.cargoLinePointer = pCargoLinePointer;
	}

	/**
	 * @param dimensionIndicator
	 *            the dimensionIndicator to set
	 */
	public void setDimensionIndicator(Boolean pDimensionIndicator) {
		this.dimensionIndicator = pDimensionIndicator;
	}

	public void setRateGeneration(final RateGenerationType pRateGeneration) {
		this.rateGeneration = pRateGeneration;
	}

	/**
	 * @param rateLineNumber
	 *            the rateLineNumber to set
	 */
	public void setRateLineNumber(Integer pRateLineNumber) {
		this.rateLineNumber = pRateLineNumber;
	}

	/**
	 * @param ratingLineDescription
	 *            the ratingLineDescription to set
	 */
	public void setRatingLineDescription(String pRatingLineDescription) {
		this.ratingLineDescription = pRatingLineDescription;
	}

}
