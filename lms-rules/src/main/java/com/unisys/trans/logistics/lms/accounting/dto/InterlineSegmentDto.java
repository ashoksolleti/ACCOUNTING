/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.unisys.trans.logistics.lms.accounting.dto.constants.ProrationType;
import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;

/**
 * <code>BookingSegmentDto</code> contains the details of BookingSegmentDto.
 * <p>
 * This contains all information about BookingSegmentDto.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>oId
 * <li>airwaybillRoute
 * </ul>
 */

public class InterlineSegmentDto implements Serializable {

    /**
	 * 
	 */
    private static final long serialVersionUID = 8982965074940463261L;
    
    private String billingCurrencyCode;

    private BigDecimal billingTotalOtherCharges;

    private BigDecimal billingTotalOtherChargesDueAgent;

    private BigDecimal billingTotalOtherChargesDueCarrier;

    private List<BookingSegmentDto> bookingSegmentDtos;

    private BigDecimal calculatedProrateFactorPercent;

    private BigDecimal carrierISCAmount;

    private BigDecimal carrierISCPercent;

    private BigDecimal carrierRevenue;
    
    private BigDecimal prorationCurrencyCarrierRevenue;

    private BigDecimal chargeableWeight;

    /**
     * Attribute to hold <code>destinationCarrier</code> property.
     */
    private String destinationCarrier;

    /**
     * Attribute to hold <code>destinationStation</code> property.
     */
    private String destinationStation;

    /**
     * Attribute to hold <code>flightNumbers</code> property.
     */
    private List<String> flightNumbers;

    private BigDecimal grossWeight;

    private boolean hostCarier;

    private BigDecimal hostTotalOtherCharges;

    private BigDecimal hostTotalOtherChargesDueAgent;

    private BigDecimal hostTotalOtherChargesDueCarrier;

    private String interLineProrateIdentifier;

    private Map<Integer, List<Long>> interLineProrateIds;

    private BigDecimal interlineSegMileage;
    
    private BigDecimal interlineSegMileageToDisplay;

    private BigDecimal interlineSegMileagePercent;

    /**
     * Attribute to hold <code>originStation</code> property.
     */
    private String originStation;

    private List<OtherChargeSplitDto> otherChargeSplitDtos;

    private Boolean prorationIdIndicator;

    private ProrationType prorationMethod;

    private BigDecimal segmentPercentageAmount;

    private boolean segPartShipmentInd;

    private Integer segPieces;

    private Integer segProrateFactor;
    
    private Integer segProrateFactorToDisplay;

    private BigDecimal segProrateFactorPercent;

    private BigDecimal segWeight;

    private WeightUOMType segWeightUOMType;

    private boolean skipProrationIndicator;

    private BigDecimal totalOtherCharges;

    private BigDecimal totalOtherChargesDueAgent;

    private BigDecimal totalOtherChargesDueCarrier;
    
    private BigDecimal totalProrationCurrencyOtherCharges;

    private BigDecimal totalProrationCurrencyOtherChargesDueAgent;

    private BigDecimal totalProrationCurrencyOtherChargesDueCarrier;

    private BigDecimal valuationCharges;

    private BigDecimal volumetricWeight;

    private BigDecimal weightCharges;
    
    private String currencyAdjIndicator;
    
    private List<RatingLineEntryDto> UniqueRatingLinesToBeProrated;
    
    private boolean skipFBPProration;
    
    public boolean isClubbedSegmentIndicator() {
		return clubbedSegmentIndicator;
	}

	public void setClubbedSegmentIndicator(boolean clubbedSegmentIndicator) {
		this.clubbedSegmentIndicator = clubbedSegmentIndicator;
	}

	private boolean clubbedSegmentIndicator;
    
    public String getBillingCurrencyCode() {
        return this.billingCurrencyCode;
    }

    public BigDecimal getBillingTotalOtherCharges() {
        return billingTotalOtherCharges;
    }

    public BigDecimal getBillingTotalOtherChargesDueAgent() {
        return billingTotalOtherChargesDueAgent;
    }

    public BigDecimal getBillingTotalOtherChargesDueCarrier() {
        return billingTotalOtherChargesDueCarrier;
    }

    public List<BookingSegmentDto> getBookingSegmentDtos() {
        return this.bookingSegmentDtos;
    }

    public BigDecimal getCalculatedProrateFactorPercent() {
        return this.calculatedProrateFactorPercent;
    }

    public BigDecimal getCarrierISCAmount() {
        return this.carrierISCAmount;
    }

    public BigDecimal getCarrierISCPercent() {
        return this.carrierISCPercent;
    }

    public BigDecimal getCarrierRevenue() {
        return this.carrierRevenue;
    }

    public BigDecimal getChargeableWeight() {
        return this.chargeableWeight;
    }

    /**
     * Gets the <code>destinationCarrier</code> property.
     * <p>
     * 
     * @return the current value of the <code>destinationCarrier</code> property.
     */
    public String getDestinationCarrier() {
        return this.destinationCarrier;
    }

    /**
     * Gets the <code>destinationStation</code> property.
     * <p>
     * 
     * @return the current value of the <code>destinationStation</code> property.
     */
    public String getDestinationStation() {
        return this.destinationStation;
    }

    /**
     * Gets the <code>flightNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>flightNumber</code> property.
     */
    public List<String> getFlightNumbers() {
        return this.flightNumbers;
    }

    public BigDecimal getGrossWeight() {
        return this.grossWeight;
    }

    public boolean getHostCarier() {
        return this.hostCarier;
    }

    public BigDecimal getHostTotalOtherCharges() {
        return hostTotalOtherCharges;
    }

    public BigDecimal getHostTotalOtherChargesDueAgent() {
        return hostTotalOtherChargesDueAgent;
    }

    public BigDecimal getHostTotalOtherChargesDueCarrier() {
        return hostTotalOtherChargesDueCarrier;
    }

    public String getInterLineProrateIdentifier() {
        return this.interLineProrateIdentifier;
    }

    public Map<Integer, List<Long>> getInterLineProrateIds() {
        return this.interLineProrateIds;
    }

    public BigDecimal getInterlineSegMileage() {
        return this.interlineSegMileage;
    }
    
    public BigDecimal getInterlineSegMileageToDisplay() {
        return this.interlineSegMileageToDisplay;
    }

    public BigDecimal getInterlineSegMileagePercent() {
        return this.interlineSegMileagePercent;
    }

    /**
     * Gets the <code>originStation</code> property.
     * <p>
     * 
     * @return the current value of the <code>originStation</code> property.
     */
    public String getOriginStation() {
        return this.originStation;
    }

    public List<OtherChargeSplitDto> getOtherChargeSplitDtos() {
        return this.otherChargeSplitDtos;
    }

    public Boolean getProrationIdIndicator() {
        return this.prorationIdIndicator;
    }

    public ProrationType getProrationMethod() {
        return this.prorationMethod;
    }

    public BigDecimal getSegmentPercentageAmount() {
        return this.segmentPercentageAmount;
    }

    public Integer getSegPieces() {
        return this.segPieces;
    }

    public Integer getSegProrateFactor() {
        return this.segProrateFactor;
    }
    
    public Integer getSegProrateFactorToDisplay() {
        return this.segProrateFactorToDisplay;
    }

    public BigDecimal getSegProrateFactorPercent() {
        return this.segProrateFactorPercent;
    }

    public BigDecimal getSegWeight() {
        return this.segWeight;
    }

    public WeightUOMType getSegWeightUOMType() {
        return this.segWeightUOMType;
    }

    public BigDecimal getTotalOtherCharges() {
        return this.totalOtherCharges;
    }

    public BigDecimal getTotalOtherChargesDueAgent() {
        return this.totalOtherChargesDueAgent;
    }

    public BigDecimal getTotalOtherChargesDueCarrier() {
        return this.totalOtherChargesDueCarrier;
    }

    public BigDecimal getValuationCharges() {
        return this.valuationCharges;
    }

    /**
     * @return the volumetricWeight
     */
    public BigDecimal getVolumetricWeight() {
        return this.volumetricWeight;
    }

    public BigDecimal getWeightCharges() {
        return this.weightCharges;
    }

    public boolean isSegPartShipmentInd() {
        return this.segPartShipmentInd;
    }

    public boolean isSkipProrationIndicator() {
        return skipProrationIndicator;
    }
    
    public void setBillingCurrencyCode(final String pBillingCurrencyCode){
        this.billingCurrencyCode = pBillingCurrencyCode;
    }

    public void setBillingTotalOtherCharges(BigDecimal billingTotalOtherCharges) {
        this.billingTotalOtherCharges = billingTotalOtherCharges;
    }

    public void setBillingTotalOtherChargesDueAgent(BigDecimal billingTotalOtherChargesDueAgent) {
        this.billingTotalOtherChargesDueAgent = billingTotalOtherChargesDueAgent;
    }

    public void setBillingTotalOtherChargesDueCarrier(BigDecimal billingTotalOtherChargesDueCarrier) {
        this.billingTotalOtherChargesDueCarrier = billingTotalOtherChargesDueCarrier;
    }

    public void setBookingSegmentDtos(final List<BookingSegmentDto> pBookingSegmentDtos) {
        this.bookingSegmentDtos = pBookingSegmentDtos;
    }

    public void setCalculatedProrateFactorPercent(final BigDecimal pCalculatedProrateFactorPercent) {
        this.calculatedProrateFactorPercent = pCalculatedProrateFactorPercent;
    }

    public void setCarrierISCAmount(final BigDecimal pCarrierISCAmount) {
        this.carrierISCAmount = pCarrierISCAmount;
    }

    public void setCarrierISCPercent(final BigDecimal pCarrierISCPercent) {
        this.carrierISCPercent = pCarrierISCPercent;
    }

    public void setCarrierRevenue(final BigDecimal pCarrierRevenue) {
        this.carrierRevenue = pCarrierRevenue;
    }

    public void setChargeableWeight(final BigDecimal pChargeableWeight) {
        this.chargeableWeight = pChargeableWeight;
    }

    /**
     * Sets the <code>destinationCarrier</code>.
     * <p>
     * 
     * @param pDestinationCarrier
     *            holds the new value of <code>destinationCarrier</code>
     */
    public void setDestinationCarrier(final String pDestinationCarrier) {
        this.destinationCarrier = pDestinationCarrier;
    }

    /**
     * Sets the <code>destinationStation</code>.
     * <p>
     * 
     * @param pDestinationStation
     *            holds the new value of <code>destinationStation</code>
     */
    public void setDestinationStation(final String pDestinationStation) {
        this.destinationStation = pDestinationStation;
    }

    /**
     * Sets the <code>flightNumber</code>.
     * <p>
     * 
     * @param pFlightNumber
     *            holds the new value of <code>flightNumber</code>
     */
    public void setFlightNumbers(final List<String> pFlightNumbers) {
        this.flightNumbers = pFlightNumbers;
    }

    public void setGrossWeight(final BigDecimal pGrossWeight) {
        this.grossWeight = pGrossWeight;
    }

    public void setHostCarier(final boolean pIsHostCarier) {
        this.hostCarier = pIsHostCarier;
    }

    public void setHostTotalOtherCharges(BigDecimal hostTotalOtherCharges) {
        this.hostTotalOtherCharges = hostTotalOtherCharges;
    }

    public void setHostTotalOtherChargesDueAgent(final BigDecimal pHostTotalOtherChargesDueAgent) {
        this.hostTotalOtherChargesDueAgent = pHostTotalOtherChargesDueAgent;
    }

    public void setHostTotalOtherChargesDueCarrier(final BigDecimal pHostTotalOtherChargesDueCarrier) {
        this.hostTotalOtherChargesDueCarrier = pHostTotalOtherChargesDueCarrier;
    }

    public void setInterLineProrateIdentifier(final String pInterLineProrateIdentifier) {
        this.interLineProrateIdentifier = pInterLineProrateIdentifier;
    }

    public void setInterLineProrateIds(Map<Integer, List<Long>> pInterLineProrateIds) {
        this.interLineProrateIds = pInterLineProrateIds;
    }

    public void setInterlineSegMileage(final BigDecimal pInterlineSegMileage) {
        this.interlineSegMileage = pInterlineSegMileage;
    }
    
    public void setInterlineSegMileageToDisplay(final BigDecimal pInterlineSegMileageToDisplay) {
        this.interlineSegMileageToDisplay = pInterlineSegMileageToDisplay;
    }

    public void setInterlineSegMileagePercent(final BigDecimal pInterlineSegMileagePercent) {
        this.interlineSegMileagePercent = pInterlineSegMileagePercent;
    }

    /**
     * Sets the <code>originStation</code>.
     * <p>
     * 
     * @param pOriginStation
     *            holds the new value of <code>originStation</code>
     */
    public void setOriginStation(final String pOriginStation) {
        this.originStation = pOriginStation;
    }

    public void setOtherChargeSplitDtos(final List<OtherChargeSplitDto> pOtherChargeSplitDtos) {
        this.otherChargeSplitDtos = pOtherChargeSplitDtos;
    }

    public void setProrationIdIndicator(final Boolean pProrationIdIndicator) {
        this.prorationIdIndicator = pProrationIdIndicator;
    }

    public void setProrationMethod(final ProrationType pProrationMethod) {
        this.prorationMethod = pProrationMethod;
    }

    public void setSegmentPercentageAmount(final BigDecimal pSegmentPercentageAmount) {
        this.segmentPercentageAmount = pSegmentPercentageAmount;
    }

    public void setSegPartShipmentInd(final boolean pSegPartShipmentInd) {
        this.segPartShipmentInd = pSegPartShipmentInd;
    }

    public void setSegPieces(final Integer pSegPieces) {
        this.segPieces = pSegPieces;
    }

    public void setSegProrateFactor(final Integer pSegProrateFactor) {
        this.segProrateFactor = pSegProrateFactor;
    }
    
    public void setSegProrateFactorToDisplay(final Integer pSegProrateFactorToDisplay) {
        this.segProrateFactorToDisplay = pSegProrateFactorToDisplay;
    }

    public void setSegProrateFactorPercent(final BigDecimal pSegProrateFactorPercent) {
        this.segProrateFactorPercent = pSegProrateFactorPercent;
    }

    public void setSegWeight(final BigDecimal pSegWeight) {
        this.segWeight = pSegWeight;
    }

    public void setSegWeightUOMType(final WeightUOMType pSegWeightUOMType) {
        this.segWeightUOMType = pSegWeightUOMType;
    }

    public void setSkipProrationIndicator(final boolean pSkipProrationIndicator) {
        this.skipProrationIndicator = pSkipProrationIndicator;
    }

    public void setTotalOtherCharges(final BigDecimal pTotalOtherCharges) {
        this.totalOtherCharges = pTotalOtherCharges;
    }

    public void setTotalOtherChargesDueAgent(final BigDecimal pTotalOtherChargesDueAgent) {
        this.totalOtherChargesDueAgent = pTotalOtherChargesDueAgent;
    }

    public void setTotalOtherChargesDueCarrier(BigDecimal pTotalOtherChargesDueCarrier) {
        this.totalOtherChargesDueCarrier = pTotalOtherChargesDueCarrier;
    }

    public void setValuationCharges(final BigDecimal pValuationCharges) {
        this.valuationCharges = pValuationCharges;
    }

    /**
     * @param volumetricWeight the volumetricWeight to set
     */
    public void setVolumetricWeight(final BigDecimal pVolumetricWeight) {
        this.volumetricWeight = pVolumetricWeight;
    }

    public void setWeightCharges(final BigDecimal pWeightCharges) {
        this.weightCharges = pWeightCharges;
    }
    
    private Map<Integer, String> prorationIdentifiers;
    
    public Map<Integer, String> getProrationIdentifiers() {
        return this.prorationIdentifiers;
    }

    public void setProrationIdentifiers(Map<Integer, String> pProrationIdentifiers) {
        this.prorationIdentifiers = pProrationIdentifiers;
    }

    public void addProrationIdentifier(Integer rateLineNo, String strProrateIdentifier) {
        if (this.prorationIdentifiers == null) {
            this.prorationIdentifiers = new HashMap<Integer, String>();
        }
        this.getProrationIdentifiers().put(rateLineNo, strProrateIdentifier);
    }
    
    private BigDecimal totalChargeableWeight;
    
    public BigDecimal getTotalChargeableWeight() {
        return this.totalChargeableWeight;
    }
    
    public void setTotalChargeableWeight(final BigDecimal pTotalChargeableWeight) {
        this.totalChargeableWeight = pTotalChargeableWeight;
    }
    
    private BigDecimal segmentYield;
    
    public BigDecimal getSegmentYield() {
        return segmentYield;
    }
    
    public void setSegmentYield(BigDecimal segmentYield) {
        this.segmentYield = segmentYield;
    }

    public BigDecimal getProrationCurrencyCarrierRevenue() {
        return prorationCurrencyCarrierRevenue;
    }

    public void setProrationCurrencyCarrierRevenue(BigDecimal prorationCurrencyCarrierRevenue) {
        this.prorationCurrencyCarrierRevenue = prorationCurrencyCarrierRevenue;
    }

    public BigDecimal getTotalProrationCurrencyOtherCharges() {
        return totalProrationCurrencyOtherCharges;
    }

    public void setTotalProrationCurrencyOtherCharges(BigDecimal totalProrationCurrencyOtherCharges) {
        this.totalProrationCurrencyOtherCharges = totalProrationCurrencyOtherCharges;
    }

    public BigDecimal getTotalProrationCurrencyOtherChargesDueAgent() {
        return totalProrationCurrencyOtherChargesDueAgent;
    }

    public void setTotalProrationCurrencyOtherChargesDueAgent(
                BigDecimal totalProrationCurrencyOtherChargesDueAgent) {
        this.totalProrationCurrencyOtherChargesDueAgent = totalProrationCurrencyOtherChargesDueAgent;
    }

    public BigDecimal getTotalProrationCurrencyOtherChargesDueCarrier() {
        return totalProrationCurrencyOtherChargesDueCarrier;
    }

    public void setTotalProrationCurrencyOtherChargesDueCarrier(
                BigDecimal totalProrationCurrencyOtherChargesDueCarrier) {
        this.totalProrationCurrencyOtherChargesDueCarrier = totalProrationCurrencyOtherChargesDueCarrier;
    }

	public String getCurrencyAdjIndicator() {
		return currencyAdjIndicator;
	}

	public void setCurrencyAdjIndicator(String currencyAdjIndicator) {
		this.currencyAdjIndicator = currencyAdjIndicator;
	}

	public List<RatingLineEntryDto> getUniqueRatingLinesToBeProrated() {
		return UniqueRatingLinesToBeProrated;
	}

	public void setUniqueRatingLinesToBeProrated(
			List<RatingLineEntryDto> uniqueRatingLinesToBeProrated) {
		UniqueRatingLinesToBeProrated = uniqueRatingLinesToBeProrated;
	}

	public boolean isSkipFBPProration() {
		return skipFBPProration;
	}

	public void setSkipFBPProration(boolean skipFBPProration) {
		this.skipFBPProration = skipFBPProration;
	}
    
    

}
