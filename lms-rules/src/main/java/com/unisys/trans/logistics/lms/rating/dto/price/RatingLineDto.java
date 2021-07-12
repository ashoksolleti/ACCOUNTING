/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto.price;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.rating.dto.GeographicDataDto;
import com.unisys.trans.logistics.lms.rating.dto.constants.AllotmentCategoryType;
import com.unisys.trans.logistics.lms.rating.dto.constants.PayCodeType;
import com.unisys.trans.logistics.lms.rating.dto.constants.RateGenerationType;
import com.unisys.trans.logistics.lms.rating.dto.constants.RatingConventionType;
import com.unisys.trans.logistics.lms.rating.dto.constants.RatingLineType;
import com.unisys.trans.logistics.lms.utils.dto.constants.RateClassType;

/**
 * Rating Line Information that requires pricing.
 */
public class RatingLineDto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 3575428460109389630L;

    private String a1InputIndicator;

    /**
     * Attribute to hold <code>additionalParticipant1Type</code> property.
     */
    private String additionalParticipant1Type;

    /**
     * Attribute to hold <code>additionalParticipant2Type</code> property.
     */
    private String additionalParticipant2Type;

    private Boolean aircraftUldIndicator;

    private Boolean allAirlineIndicator;

    /**
     * Attribute to hold <code>allInSraPricingIndicator</code> property.
     */
    private boolean allInSraPricingIndicator;

    private AllotmentCategoryType allotmentCategory;

    private String allotmentId;

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

    /**
     * Airline/Carrier of interest for rating.
     */
    private String carrierCode;

    /**
     * Chargeable weight of the rate.
     */
    private BigDecimal chargeableWeight;

    private String classRatingId;

    private boolean classRatingIdIndicator;

    private Boolean classRatingIndicator;

    private String commodityCode;

    private boolean commodityCompareInd;

    private Boolean contractAddnlParts;

    private Boolean contractInterline;

    private String contractNumber;

    private Integer contractPriority;

    /**
     * Attribute to hold <code>additionalParticipantIndicator</code> property.
     */
    private boolean additionalParticipantIndicator;
    
    private Boolean contractSplInstructionIndicator;

    // added for SK164C campaign, starts here
    private boolean contractToApplyIndicator;

    // added for SK164C campaign, ends here

    private String currencyConversionLine;

    private GeographicDataDto destination;

    private Integer destinationRouteOrder = null;

    private Boolean dimensionIndicator;

    private String equipWeight;

    private BigDecimal fwbRate;

    /**
     * Gross weight of the rate.
     */
    private BigDecimal grossWeight;

    private Boolean hostOnlyRateInd;

    /**
     * Input chargeable weight of the rate
     * 
     */
    private BigDecimal inputChargeableWeight;

    private Boolean interlineRateInd;

    private boolean jointRateIndicator;

    private BigDecimal jointRateProration;

    private KRatingLineDto kActualRatingLineDto;

    private KRatingLineDto kRatingLineDto;

    /**
     * Indicator to determine if rate is entered manually.<br />
     * 0 = No rate has been entered manually<br />
     * 1 = A rate has been entered manually.<br />
     */
    private boolean manualRateIndicator;

    private boolean multiSegmentInd;

    // Changed from Boolean to boolean since the default value will be false
    private boolean multiSegmentRateInd;

    private Boolean netOnNetIndicator;

    // ********************************* End of Newly added Fields
    // ****************************************************

    // newly added fields October 5

    private Integer noOfSegments;

    private GeographicDataDto origin;

    private Integer originRouteOrder = null;

    /**
     * Attribute to hold <code>otherChargeContractId</code> property.
     */
    private String otherChargeContractId;

    private String participantAccountNumber;

    private String partTypeOwningContract;

    private BigDecimal percentage;

    /**
     * Previous chargeable weight of the rate.
     * 
     */
    private BigDecimal previousChargeableWeight;

    private boolean quoteGenerationIndicator;

    /**
     * Rate amount
     */
    private BigDecimal rateAmount;

    private Boolean rateAppliedIndicator;

    /**
     * Rate class code.
     */
    private RateClassType rateClass;

    private String rateCombinationPoint;

    private RateGenerationType rateGenerationInd;

    private String rateIndicator;

    /**
     * Rating line number.
     */
    private Integer rateLineNumber;

    private Integer rateLineSegmentNo;

    /**
     * Rating note code.
     */
    private String rateNoteCode;

    private RatePerKiloLine ratePerKiloActualLine;

    private RatePerKiloLine ratePerKiloLine;

    /**
     * Pieces or rate combination point with carrier.
     */
    private Integer ratePieces;

    private String ratePiecesExtra;

    /**
     * Indicator to determine if Rate Pieces has Pieces or Rate Combination Point. <br />
     * ‘P’ - No. of pieces is present &amp; <br />
     * ‘R’ - ‘RCP’ (Rate Combination Point) is present
     */
    private boolean rateRCPIndicator;

    /**
     * Rate source code.
     */
    private String rateSourceCode;

    private BigDecimal rateTotalCharges;

    /**
     * Type of the rating.
     */
    private String rateTypeCode;

    /**
     * Rating Convention to be used during pricing of this rating line
     */
    private RatingConventionType ratingConvention;

    private List<RatingDescriptionLineDto> ratingDescriptionLineDtos;

    /**
     * Contains rating line description.
     * 
     * 
     */
    private String ratingLineDescription;

    private String ratingLineFWBNumber;

    private BigDecimal revenueWeight;

    private String securityIndicator;

    private List<SelectedPriceEntry> selectedPriceEntries;

    private boolean selectionDisplaySuppressedIndicator;

    /**
     * Service rating line generation indicator. <br />
     * A - Rate generated using an SRA with no special instructions (indicator generated by system). <br />
     * B - Rate generated using an SRA with special instructions (indicator generated by system). <br />
     * G - Rate and indicator generated by automatic rating. <br />
     * I - Rate generated using a contract with instructions (indicator generated by system). <br />
     * K - Rate generated using a contract with no instructions (indicator generated by system). <br />
     * M - Rate manually entered by agent (indicator generated by system). <br />
     * N - No rate input and unable to generate a rate. <br />
     * Q - Manual class rate. <br />
     * S - Free line for service freight (entered by agent). <br />
     * T - Manual joint rate. <br />
     * X - Delete rating line (entered by agent).
     * 
     */

    private String serviceRateGenerationInd;

    private String splContractCode;

    private String uldChargeCode;

    private ULDDiscountRatingLine uldDiscountActualRatingLine;

    private ULDDiscountRatingLine uldDiscountRatingLine;

    private ULDOverPivotRatingLine uldOverPivotActualRatingLine;

    private ULDOverPivotRatingLine uldOverPivotRatingLine;

    private Integer uldPositions;

    private ULDTareWeightRatingLine uldTareWeightActualRatingLine;

    private ULDTareWeightRatingLine uldTareWeightRatingLine;

    private String uldTypeCode;

    private BigDecimal uLDWeight;
    
    private RatingConventionType commodityConvention;
    
    
    /**
     * Attribute to hold <code>destOriginPayCode</code> property.
     */
    private PayCodeType destOriginPayCode;

    public RatingConventionType getCommodityConvention() {
        return commodityConvention;
    }
    /**
     * Gets the <code>additionalParticipantIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>additionalParticipantIndicator</code> property.<br>
     */
    public boolean isAdditionalParticipantIndicator() {
        return this.additionalParticipantIndicator;
    }
    
    /**
     * Sets the <code>additionalParticipantIndicator</code> property.
     * <p>
     * 
     * @param pAdditionalParticipantIndicator
     *            the current value of the <code>additionalParticipantIndicator</code> property.<br>
     */
    public void setAdditionalParticipantIndicator(final boolean pAdditionalParticipantIndicator) {
        this.additionalParticipantIndicator = pAdditionalParticipantIndicator;
    }

	public void setCommodityConvention(RatingConventionType commodityConvention) {
		this.commodityConvention = commodityConvention;
	}

	/**
     * 
     * @param pRatingDescriptionLineDto
     */
    public void addRatingDescriptionLineDto(RatingDescriptionLineDto pRatingDescriptionLineDto) {
        if (this.ratingDescriptionLineDtos == null) {
            this.ratingDescriptionLineDtos = new ArrayList<RatingDescriptionLineDto>();
        }
        this.ratingDescriptionLineDtos.add(pRatingDescriptionLineDto);
    }

    public String getA1InputIndicator() {
        return this.a1InputIndicator;
    }

    /**
     * Gets the <code>additionalParticipant1Type</code> property.
     * <p>
     * 
     * @return the current value of the <code>additionalParticipant1Type</code> property.<br>
     */
    public String getAdditionalParticipant1Type() {
        return this.additionalParticipant1Type;
    }

    // private String serviceRateGenIndicator;

    /**
     * Gets the <code>additionalParticipant2Type</code> property.
     * <p>
     * 
     * @return the current value of the <code>additionalParticipant2Type</code> property.<br>
     */
    public String getAdditionalParticipant2Type() {
        return this.additionalParticipant2Type;
    }

    public Boolean getAircraftUldIndicator() {
        return this.aircraftUldIndicator;
    }

    public Boolean getAllAirlineIndicator() {
        return this.allAirlineIndicator;
    }

    /**
     * Gets the <code>allInSraPricingIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>allInSraPricingIndicator</code> property.
     */
    public boolean getAllInSraPricingIndicator() {
        return allInSraPricingIndicator;
    }

    public AllotmentCategoryType getAllotmentCategory() {
        return this.allotmentCategory;
    }

    public String getAllotmentId() {
        return this.allotmentId;
    }

    /**
     * @return the cargoLinePointer
     */
    public String getCargoLinePointer() {
        return this.cargoLinePointer;
    }

    /**
     * @return the carrierCode
     */
    public String getCarrierCode() {
        return this.carrierCode;
    }

    /**
     * @return the chargeableWeight
     */
    public BigDecimal getChargeableWeight() {
        return this.chargeableWeight;
    }

    public String getClassRatingId() {
        return this.classRatingId;
    }

    public boolean getClassRatingIdIndicator() {
        return this.classRatingIdIndicator;
    }

    public Boolean getClassRatingIndicator() {
        return this.classRatingIndicator;
    }

    public String getCommodityCode() {
        return this.commodityCode;
    }

    public Boolean getContractAddnlParts() {
        return this.contractAddnlParts;
    }

    public Boolean getContractInterline() {
        return this.contractInterline;
    }

    public String getContractNumber() {
        return this.contractNumber;
    }

    public Integer getContractPriority() {
        return this.contractPriority;
    }

    public Boolean getContractSplInstructionIndicator() {
        return this.contractSplInstructionIndicator;
    }

    // added for SK164C campaign, starts here
    public boolean getContractToApplyIndicator() {
        return this.contractToApplyIndicator;
    }

    // added for SK164C campaign, ends here

    public String getCurrencyConversionLine() {
        return currencyConversionLine;
    }

    /**
     * @return the destination
     */
    public GeographicDataDto getDestination() {
        return this.destination;
    }

    public Integer getDestinationRouteOrder() {
        return this.destinationRouteOrder;
    }

    public Boolean getDimensionIndicator() {
        return this.dimensionIndicator;
    }

    public String getEquipWeight() {
        return this.equipWeight;
    }

    public BigDecimal getFwbRate() {
        return this.fwbRate;
    }

    /**
     * @return the grossWeight
     */
    public BigDecimal getGrossWeight() {
        return this.grossWeight;
    }

    public Boolean getHostOnlyRateInd() {
        return hostOnlyRateInd;
    }

    /**
     * @return the inputChargeableWeight
     * 
     */
    public BigDecimal getInputChargeableWeight() {
        return this.inputChargeableWeight;
    }

    public Boolean getInterlineRateInd() {
        return interlineRateInd;
    }

    public boolean getJointRateIndicator() {
        return this.jointRateIndicator;
    }

    public BigDecimal getJointRateProration() {
        return this.jointRateProration;
    }

    public KRatingLineDto getKActualRatingLineDto() {
        return this.kActualRatingLineDto;
    }

    public KRatingLineDto getKRatingLineDto() {
        return this.kRatingLineDto;
    }

    /**
     * @return the manualRateIndicator
     */
    public boolean getManualRateIndicator() {
        return this.manualRateIndicator;
    }

    public boolean getMultiSegmentInd() {
        return multiSegmentInd;
    }

    public boolean getMultiSegmentRateInd() {
        return multiSegmentRateInd;
    }

    public Boolean getNetOnNetIndicator() {
        return this.netOnNetIndicator;
    }

    public Integer getNoOfSegments() {
        return noOfSegments;
    }

    /**
     * @return the originCode
     */
    public GeographicDataDto getOrigin() {
        return this.origin;
    }

    public Integer getOriginRouteOrder() {
        return this.originRouteOrder;
    }

    /**
     * Gets the <code>otherChargeContractId</code> property.
     * <p>
     * 
     * @return the current value of the <code>otherChargeContractId</code> property.<br>
     */
    public String getOtherChargeContractId() {
        return otherChargeContractId;
    }

    public String getParticipantAccountNumber() {
        return this.participantAccountNumber;
    }

    public String getPartTypeOwningContract() {
        return this.partTypeOwningContract;
    }

    public BigDecimal getPercentage() {
        return this.percentage;
    }

    /**
     * @return the previousChargeableWeight
     */
    public BigDecimal getPreviousChargeableWeight() {
        return this.previousChargeableWeight;
    }

    public boolean getQuoteGenerationIndicator() {
        return this.quoteGenerationIndicator;
    }

    /**
     * @return the rateAmount
     */
    public BigDecimal getRateAmount() {
        return this.rateAmount;
    }

    public Boolean getRateAppliedIndicator() {
        return this.rateAppliedIndicator;
    }

    /**
     * @return the rateClass
     */
    public RateClassType getRateClass() {
        return this.rateClass;
    }

    public String getRateCombinationPoint() {
        return this.rateCombinationPoint;
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

    public Integer getRateLineSegmentNo() {
        return this.rateLineSegmentNo;
    }

    /**
     * @return the rateNoteCode
     */
    public String getRateNoteCode() {
        return this.rateNoteCode;
    }

    public RatePerKiloLine getRatePerKiloActualLine() {
        return this.ratePerKiloActualLine;
    }

    public RatePerKiloLine getRatePerKiloLine() {
        return this.ratePerKiloLine;
    }

    /**
     * @return the ratePieces
     * 
     */
    public Integer getRatePieces() {
        return this.ratePieces;
    }

    public String getRatePiecesExtra() {
        return this.ratePiecesExtra;
    }

    /**
     * @return the rateRCPIndicator
     * 
     */
    public boolean getRateRCPIndicator() {
        return this.rateRCPIndicator;
    }

    /**
     * @return the rateSourceCode
     */
    public String getRateSourceCode() {
        return this.rateSourceCode;
    }

    public BigDecimal getRateTotalCharges() {
        return this.rateTotalCharges;
    }

    /**
     * @return the rateTypeCode
     */
    public String getRateTypeCode() {
        return this.rateTypeCode;
    }

    public RatingConventionType getRatingConvention() {
        return this.ratingConvention;
    }

    /**
     * @return the ratingDescriptionLineDtos
     */
    public List<RatingDescriptionLineDto> getRatingDescriptionLineDtos() {
        return ratingDescriptionLineDtos;
    }

    public String getRatingLineDescription() {
        return this.ratingLineDescription;
    }

    public String getRatingLineFWBNumber() {
        return this.ratingLineFWBNumber;
    }

    public BigDecimal getRevenueWeight() {
        return this.revenueWeight;
    }

    public String getSecurityIndicator() {
        return this.securityIndicator;
    }

    public List<SelectedPriceEntry> getSelectedPriceEntries() {
        if (this.selectedPriceEntries == null) {
            this.selectedPriceEntries = new ArrayList<SelectedPriceEntry>();
        }
        return this.selectedPriceEntries;
    }

    public List<SelectedPriceEntry> getSelectedPriceEntries(RatingLineType pRatingLineType) {
        List<SelectedPriceEntry> selectedEntries = new ArrayList<SelectedPriceEntry>();
        if (this.selectedPriceEntries != null && !this.selectedPriceEntries.isEmpty()) {
            for (SelectedPriceEntry selectedPriceEntry : this.selectedPriceEntries) {
                if (selectedPriceEntry.getRatingLineType().equals(pRatingLineType)) {
                    selectedEntries.add(selectedPriceEntry);
                }
            }
        }
        return selectedEntries;
    }

    public boolean getSelectionDisplaySuppressedIndicator() {
        return selectionDisplaySuppressedIndicator;
    }

    public String getServiceRateGenerationInd() {
        return this.serviceRateGenerationInd;
    }

    public String getSplContractCode() {
        return this.splContractCode;
    }

    public String getUldChargeCode() {
        return this.uldChargeCode;
    }

    public ULDDiscountRatingLine getUldDiscountActualRatingLine() {
        return this.uldDiscountActualRatingLine;
    }

    public ULDDiscountRatingLine getUldDiscountRatingLine() {
        return this.uldDiscountRatingLine;
    }

    public ULDOverPivotRatingLine getUldOverPivotActualRatingLine() {
        return this.uldOverPivotActualRatingLine;
    }

    public ULDOverPivotRatingLine getUldOverPivotRatingLine() {
        return this.uldOverPivotRatingLine;
    }

    public Integer getUldPositions() {
        return this.uldPositions;
    }

    public ULDTareWeightRatingLine getUldTareWeightActualRatingLine() {
        return this.uldTareWeightActualRatingLine;
    }

    public ULDTareWeightRatingLine getUldTareWeightRatingLine() {
        return this.uldTareWeightRatingLine;
    }

    public String getUldTypeCode() {
        return this.uldTypeCode;
    }

    public BigDecimal getuLDWeight() {
        return this.uLDWeight;
    }

    /**
     * @return true if chargable weight is present else false
     */
    public boolean isChargeableWeightPresent() {
        boolean valid = false;
        if (this.chargeableWeight != null && this.chargeableWeight.doubleValue() != 0) {
            valid = true;
        }
        return valid;
    }

    public boolean isCommodityCompareInd() {
        return commodityCompareInd;
    }

    // end of adding new fields and its corresponding setters and getters. October 5

    public void setA1InputIndicator(final String pA1InputIndicator) {
        this.a1InputIndicator = pA1InputIndicator;
    }

    /**
     * Sets the <code>additionalParticipant1Type</code> property.
     * <p>
     * 
     * @param pAdditionalParticipant1Type
     *            the current value of the <code>additionalParticipant1Type</code> property.<br>
     */
    public void setAdditionalParticipant1Type(final String pAdditionalParticipant1Type) {
        this.additionalParticipant1Type = pAdditionalParticipant1Type;
    }

    /**
     * Sets the <code>additionalParticipant2Type</code> property.
     * <p>
     * 
     * @param pAdditionalParticipant2Type
     *            the current value of the <code>additionalParticipant2Type</code> property.<br>
     */
    public void setAdditionalParticipant2Type(final String pAdditionalParticipant2Type) {
        this.additionalParticipant2Type = pAdditionalParticipant2Type;
    }

    public void setAircraftUldIndicator(final Boolean pAircraftUldIndicator) {
        this.aircraftUldIndicator = pAircraftUldIndicator;
    }

    public void setAllAirlineIndicator(final Boolean pAllAirlineIndicator) {
        this.allAirlineIndicator = pAllAirlineIndicator;
    }

    /**
     * Sets the <code>allInSraPricingIndicator</code> property.
     * <p>
     * 
     * @param pAllInSraPricingIndicator
     *            the current value of the <code>allInSraPricingIndicator</code> property.<br>
     */
    public void setAllInSraPricingIndicator(final boolean pAllInSraPricingIndicator) {
        this.allInSraPricingIndicator = pAllInSraPricingIndicator;
    }

    /*
     * public String isServiceRateGenIndicator() {
     * return this.serviceRateGenIndicator;
     * }
     */

    public void setAllotmentCategory(final AllotmentCategoryType pAllotmentCategory) {
        this.allotmentCategory = pAllotmentCategory;
    }

    public void setAllotmentId(final String pAllotmentId) {
        this.allotmentId = pAllotmentId;
    }

    /**
     * Sets the <code>cargoLinePointer</code> property.
     * <p>
     * 
     * @param pCargoLinePointer
     *            the current value of the <code>cargoLinePointer</code> property.
     */
    public void setCargoLinePointer(final String pCargoLinePointer) {
        this.cargoLinePointer = pCargoLinePointer;
    }

    /**
     * Sets the <code>carrierCode</code> property.
     * <p>
     * 
     * @param pCarrierCode
     *            the current value of the <code>carrierCode</code> property.
     */
    public void setCarrierCode(final String pCarrierCode) {
        this.carrierCode = pCarrierCode;
    }

    /**
     * Sets the <code>chargeableWeight</code> property.
     * <p>
     * 
     * @param pChargeableWeight
     *            the current value of the <code>chargeableWeight</code> property.
     */
    public void setChargeableWeight(final BigDecimal pChargeableWeight) {
        this.chargeableWeight = pChargeableWeight;
    }

    public void setClassRatingId(final String pClassRatingId) {
        this.classRatingId = ContractUtility.convertToUpperCase(pClassRatingId);
    }

    public void setClassRatingIdIndicator(final boolean pClassRatingIdIndicator) {
        this.classRatingIdIndicator = pClassRatingIdIndicator;
    }

    public void setClassRatingIndicator(final Boolean pClassRatingIndicator) {
        this.classRatingIndicator = pClassRatingIndicator;
    }

    public void setCommodityCode(final String pCommodityCode) {
        this.commodityCode = pCommodityCode;
    }

    public void setCommodityCompareInd(boolean commodityCompareInd) {
        this.commodityCompareInd = commodityCompareInd;
    }

    public void setContractAddnlParts(final Boolean pContractAddnlParts) {
        this.contractAddnlParts = pContractAddnlParts;
    }

    public void setContractInterline(final Boolean pContractInterline) {
        this.contractInterline = pContractInterline;
    }

    public void setContractNumber(final String pContractNumber) {
        this.contractNumber = pContractNumber;
    }

    public void setContractPriority(final Integer pContractPriority) {
        this.contractPriority = pContractPriority;
    }

    public void setContractSplInstructionIndicator(final Boolean pContractSplInstructionIndicator) {
        this.contractSplInstructionIndicator = pContractSplInstructionIndicator;
    }

    // added for SK164C campaign, starts here
    public void setContractToApplyIndicator(final boolean pContractToApplyIndicator) {
        this.contractToApplyIndicator = pContractToApplyIndicator;
    }

    // added for SK164C campaign, ends here

    public void setCurrencyConversionLine(String currencyConversionLine) {
        this.currencyConversionLine = currencyConversionLine;
    }

    /**
     * Sets the <code>destinationCode</code> property.
     * <p>
     * 
     * @param pDestination
     *            the current value of the <code>destinationCode</code> property.
     */
    public void setDestination(final GeographicDataDto pDestination) {
        this.destination = pDestination;
    }

    public void setDestinationRouteOrder(final Integer pDestinationRouteOrder) {
        this.destinationRouteOrder = pDestinationRouteOrder;
    }

    public void setDimensionIndicator(final Boolean pDimensionIndicator) {
        this.dimensionIndicator = pDimensionIndicator;
    }

    public void setEquipWeight(final String pEquipWeight) {
        this.equipWeight = pEquipWeight;
    }

    public void setFwbRate(final BigDecimal pFwbRate) {
        this.fwbRate = pFwbRate;
    }

    /**
     * Sets the <code>grossWeight</code> property.
     * <p>
     * 
     * @param pGrossWeight
     *            the current value of the <code>grossWeight</code> property.
     */
    public void setGrossWeight(final BigDecimal pGrossWeight) {
        this.grossWeight = pGrossWeight;
    }

    public void setHostOnlyRateInd(Boolean hostOnlyRateInd) {
        this.hostOnlyRateInd = hostOnlyRateInd;
    }

    /**
     * Sets the <code>inputChargeableWeight</code> property.
     * <p>
     * 
     * @param pInputChargeableWeight
     *            the current value of the <code>inputChargeableWeight</code> property.
     */
    public void setInputChargeableWeight(final BigDecimal pInputChargeableWeight) {
        this.inputChargeableWeight = pInputChargeableWeight;
    }

    public void setInterlineRateInd(Boolean interlineRateInd) {
        this.interlineRateInd = interlineRateInd;
    }

    public void setJointRateIndicator(final boolean pJointRateIndicator) {
        this.jointRateIndicator = pJointRateIndicator;
    }

    public void setJointRateProration(final BigDecimal pJointRateProration) {
        this.jointRateProration = pJointRateProration;
    }

    public void setKctualRatingLineDto(final KRatingLineDto pKActualRatingLineDto) {
        this.kActualRatingLineDto = pKActualRatingLineDto;
    }

    public void setKRatingLineDto(KRatingLineDto pKRatingLineDto) {
        this.kRatingLineDto = pKRatingLineDto;
    }

    /**
     * Sets the <code>manualRateIndicator</code> property.
     * <p>
     * 
     * @param pManualRateIndicator
     *            the current value of the <code>manualRateIndicator</code> property.
     */
    public void setManualRateIndicator(final boolean pManualRateIndicator) {
        this.manualRateIndicator = pManualRateIndicator;
    }

    public void setMultiSegmentInd(boolean multiSegmentInd) {
        this.multiSegmentInd = multiSegmentInd;
    }

    public void setMultiSegmentRateInd(boolean multiSegmentRateInd) {
        this.multiSegmentRateInd = multiSegmentRateInd;
    }

    public void setNetOnNetIndicator(final Boolean pNetOnNetIndicator) {
        this.netOnNetIndicator = pNetOnNetIndicator;
    }

    public void setNoOfSegments(Integer noOfSegments) {
        this.noOfSegments = noOfSegments;
    }

    /**
     * Sets the <code>originCode</code> property.
     * <p>
     * 
     * @param pOrigin
     *            the current value of the <code>originCode</code> property.
     */
    public void setOrigin(final GeographicDataDto pOrigin) {
        this.origin = pOrigin;
    }

    public void setOriginRouteOrder(final Integer pOriginRouteOrder) {
        this.originRouteOrder = pOriginRouteOrder;
    }

    /**
     * Sets the <code>otherChargeContractId</code> property.
     * <p>
     * 
     * @param pOtherChargeContractId
     *            the current value of the <code>otherChargeContractId</code> property.<br>
     */
    public void setOtherChargeContractId(final String pOtherChargeContractId) {
        this.otherChargeContractId = pOtherChargeContractId;
    }

    public void setParticipantAccountNumber(final String pParticipantAccountNumber) {
        this.participantAccountNumber = pParticipantAccountNumber;
    }

    public void setPartTypeOwningContract(final String pPartTypeOwningContract) {
        this.partTypeOwningContract = pPartTypeOwningContract;
    }

    public void setPercentage(final BigDecimal pPercentage) {
        this.percentage = pPercentage;
    }

    /**
     * Sets the <code>previousChargeableWeight</code> property.
     * <p>
     * 
     * @param pPreviousChargeableWeight
     *            the current value of the <code>previousChargeableWeight</code> property.
     */
    public void setPreviousChargeableWeight(final BigDecimal pPreviousChargeableWeight) {
        this.previousChargeableWeight = pPreviousChargeableWeight;
    }

    public void setQuoteGenerationIndicator(final boolean pQuoteGenerationIndicator) {
        this.quoteGenerationIndicator = pQuoteGenerationIndicator;
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

    public void setRateAppliedIndicator(final Boolean pRateAppliedIndicator) {
        this.rateAppliedIndicator = pRateAppliedIndicator;
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

    public void setRateCombinationPoint(final String pRateCombinationPoint) {
        this.rateCombinationPoint = pRateCombinationPoint;
    }

    public void setRateGenerationInd(final RateGenerationType pRateGenerationInd) {
        this.rateGenerationInd = pRateGenerationInd;
    }

    public void setRateIndicator(final String pRateIndicator) {
        this.rateIndicator = pRateIndicator;
    }

    /**
     * Sets the <code>rateLineNumber</code> property.
     * <p>
     * 
     * @param pRateLineNumber
     *            the current value of the <code>rateLineNumber</code> property.
     */
    public void setRateLineNumber(final Integer pRateLineNumber) {
        this.rateLineNumber = pRateLineNumber;
    }

    public void setRateLineSegmentNo(Integer pRateLineSegmentNo) {
        this.rateLineSegmentNo = pRateLineSegmentNo;
    }

    /**
     * Sets the <code>rateNoteCode</code> property.
     * <p>
     * 
     * @param pRateNoteCode
     *            the current value of the <code>rateNoteCode</code> property.
     */
    public void setRateNoteCode(final String pRateNoteCode) {
        this.rateNoteCode = pRateNoteCode;
    }

    public void setRatePerKiloActualLine(final RatePerKiloLine pRatePerKiloActualLine) {
        this.ratePerKiloActualLine = pRatePerKiloActualLine;
    }

    public void setRatePerKiloLine(RatePerKiloLine pRatePerKiloLine) {
        this.ratePerKiloLine = pRatePerKiloLine;
    }

    /**
     * Sets the <code>ratePieces</code> property.
     * <p>
     * 
     * @param pRatePieces
     *            the current value of the <code>ratePieces</code> property.
     */
    public void setRatePieces(final Integer pRatePieces) {
        this.ratePieces = pRatePieces;
    }

    public void setRatePiecesExtra(final String pRatePiecesExtra) {
        this.ratePiecesExtra = pRatePiecesExtra;
    }

    /**
     * Sets the <code>rateRCPIndicator</code> property.
     * <p>
     * 
     * @param pRateRCPIndicator
     *            the current value of the <code>rateRCPIndicator</code> property.
     */
    public void setRateRCPIndicator(final boolean pRateRCPIndicator) {
        this.rateRCPIndicator = pRateRCPIndicator;
    }

    /**
     * Sets the <code>rateSourceCode</code> property.
     * <p>
     * 
     * @param pRateSourceCode
     *            the current value of the <code>rateSourceCode</code> property.
     */
    public void setRateSourceCode(final String pRateSourceCode) {
        this.rateSourceCode = pRateSourceCode;
    }

    public void setRateTotalCharges(final BigDecimal pRateTotalCharges) {
        this.rateTotalCharges = pRateTotalCharges;
    }

    /**
     * Sets the <code>rateTypeCode</code> property.
     * <p>
     * 
     * @param pRateTypeCode
     *            the current value of the <code>rateTypeCode</code> property.
     */
    public void setRateTypeCode(final String pRateTypeCode) {
        this.rateTypeCode = pRateTypeCode;
    }

    /*
     * public void setServiceRateGenIndicator(final String pServiceRateGenIndicator) {
     * this.serviceRateGenIndicator = pServiceRateGenIndicator;
     * }
     */

    /**
     * Sets the <code>ratingConvention</code> property.
     * <p>
     * 
     * @param pRatingConvention
     *            the current value of the <code>ratingConvention</code> property.
     */
    public void setRatingConvention(final RatingConventionType pRatingConvention) {
        this.ratingConvention = pRatingConvention;
    }

    /**
     * @param ratingDescriptionLineDtos the ratingDescriptionLineDtos to set
     */
    public void setRatingDescriptionLineDtos(
                List<RatingDescriptionLineDto> ratingDescriptionLineDtos) {
        this.ratingDescriptionLineDtos = ratingDescriptionLineDtos;
    }

    public void setRatingLineDescription(final String pRatingLineDescription) {
        this.ratingLineDescription = pRatingLineDescription;
    }

    public void setRatingLineFWBNumber(final String pRatingLineFWBNumber) {
        this.ratingLineFWBNumber = pRatingLineFWBNumber;
    }

    public void setRevenueWeight(final BigDecimal pRevenueWeight) {
        this.revenueWeight = pRevenueWeight;
    }

    public void setSecurityIndicator(final String pSecurityIndicator) {
        this.securityIndicator = pSecurityIndicator;
    }

    public void setSelectedPriceEntries(final List<SelectedPriceEntry> pSelectedPriceEntries) {
        this.selectedPriceEntries = pSelectedPriceEntries;
    }

    public void setSelectionDisplaySuppressedIndicator(final boolean pSelectionDisplaySuppressedIndicator) {
        this.selectionDisplaySuppressedIndicator = pSelectionDisplaySuppressedIndicator;
    }

    public void setServiceRateGenerationInd(final String pServiceRateGenerationInd) {
        this.serviceRateGenerationInd = pServiceRateGenerationInd;
    }

    public void setSplContractCode(final String pSplContractCode) {
        this.splContractCode = pSplContractCode;
    }

    public void setUldChargeCode(final String pUldChargeCode) {
        this.uldChargeCode = pUldChargeCode;
    }

    public void setUldDiscountActualRatingLine(final ULDDiscountRatingLine pUldDiscountActualRatingLine) {
        this.uldDiscountActualRatingLine = pUldDiscountActualRatingLine;
    }

    public void setUldDiscountRatingLine(final ULDDiscountRatingLine pUldDiscountRatingLine) {
        this.uldDiscountRatingLine = pUldDiscountRatingLine;
    }

    public void setUldOverPivotActualRatingLine(final ULDOverPivotRatingLine pUldOverPivotActualRatingLine) {
        this.uldOverPivotActualRatingLine = pUldOverPivotActualRatingLine;
    }

    public void setUldOverPivotRatingLine(final ULDOverPivotRatingLine pUldOverPivotRatingLine) {
        this.uldOverPivotRatingLine = pUldOverPivotRatingLine;
    }

    public void setUldPositions(final Integer pUldPositions) {
        this.uldPositions = pUldPositions;
    }

    public
                void
                setUldTareWeightActualRatingLine(final ULDTareWeightRatingLine pUldTareWeightActualRatingLine) {
        this.uldTareWeightActualRatingLine = pUldTareWeightActualRatingLine;
    }

    public void setUldTareWeightRatingLine(final ULDTareWeightRatingLine pUldTareWeightRatingLine) {
        this.uldTareWeightRatingLine = pUldTareWeightRatingLine;
    }

    public void setUldTypeCode(final String pUldTypeCode) {
        this.uldTypeCode = pUldTypeCode;
    }

    public void setuLDWeight(final BigDecimal pULDWeight) {
        this.uLDWeight = pULDWeight;
    }


    private boolean enforceHurdleRate;
    
    
    public boolean getEnforceHurdleRate() {
        return this.enforceHurdleRate;
    }

    public void setEnforceHurdleRate(final boolean pEnforceHurdleRate) {
        // TODO Auto-generated method stub
        this.enforceHurdleRate = pEnforceHurdleRate;
    }
    /**
     * @return the destOriginPayCode
     */
    public PayCodeType getDestOriginPayCode() {
        return destOriginPayCode;
    }
    /**
     * @param destOriginPayCode the destOriginPayCode to set
     */
    public void setDestOriginPayCode(PayCodeType destOriginPayCode) {
        this.destOriginPayCode = destOriginPayCode;
    }
}