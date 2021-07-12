/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto.price;

import java.io.Serializable;
import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.rating.dto.constants.PayCodeType;
import com.unisys.trans.logistics.lms.rating.dto.constants.RatingConventionType;

public class SpecialRatePrice implements Serializable {

    /**
     * Generated serial version id.
     */
    private static final long serialVersionUID = 8471542043491752083L;

    /**
     * Attribute to hold <code>additionalParticipant1Type</code> property.
     */
    private String additionalParticipant1Type;

    /**
     * Attribute to hold <code>additionalParticipant2Type</code> property.
     */
    private String additionalParticipant2Type;

    /**
     * Attribute to hold <code>additionalParticipantIndicator</code> property.
     */
    private boolean additionalParticipantIndicator;

    /**
     * Attribute to hold <code>agentCommission</code> property.
     */
    private boolean agentCommission;

    /**
     * Attribute to hold <code>allDestinationIndicator</code> property.
     */
    private boolean allDestinationIndicator;

    /**
     * Attribute to hold <code>allOriginIndicator</code> property.
     */
    private boolean allOriginIndicator;

    /**
     * Attribute to hold <code>allotmentId</code> property.
     */
    private String allotmentId;
    /**
     * Attribute to hold <code>destOriginPayCode</code> property.
     */
    private PayCodeType destOriginPayCode;

    /**
     * Attribute to hold <code>allotmentType</code> property.
     */
    private String allotmentType;

    /**
     * Attribute to hold <code>bestRateIndicator</code> property.
     */
    private boolean bestRateIndicator;

    /**
     * Attribute to hold <code>campaignInd</code> property.
     */
    private boolean campaignInd;

    /**
     * Attribute to hold <code>contractPriority</code> property.
     */
    private String contractPriority;

    /**
     * Attribute to hold <code>contractWeightUnit</code> property.
     */
    private WeightUOMType contractWeightUnit;

    /**
     * Attribute to hold <code>enforceHurdleRate</code> property.
     */
    private boolean enforceHurdleRate;

    /**
     * Attribute to hold <code>flightAllotmentRestrictionIndicator</code> property.
     */
    private boolean flightAllotmentRestrictionIndicator;

    /**
     * Attribute to hold <code>interlineRoutingIndicator</code> property.
     */
    private boolean interlineRoutingIndicator;

    private boolean minimumRateIndicator;

    /**
     * Attribute to hold <code>minimumShipmentSize</code> property.
     */
    private BigDecimal minimumShipmentSize;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>otherChargeContractId</code> property.
     */
    private String otherChargeContractId;

    /**
     * Attribute to hold <code>participantAccNo</code> property.
     */
    private String participantAccNo;

    /**
     * Attribute to hold <code>participantGroupIndicator</code> property.
     */
    private boolean participantGroupIndicator;

    /**
     * Attribute to hold <code>participantIndex</code> property.
     */
    private int participantIndex;

    /**
     * Attribute to hold <code>participantType</code> property.
     */
    private String participantType;

    /**
     * Attribute to hold <code>rateAdjustment</code> property.
     */
    private BigDecimal rateAdjustment;

    private boolean rateConstructionIndicator;

    /**
     * Attribute to hold <code>specialHandlingCodes</code> property.
     */
    private String specialHandlingCodes;

    /**
     * Attribute to hold <code>specialInstructions</code> property.
     */
    private String specialInstructions;

    /**
     * Attribute to hold <code>specialRateCode</code> property.
     */
    private String specialRateCode;

    /**
     * Attribute to hold <code>specialRateHierarchy</code> property.
     */
    private Integer specialRateHierarchy;

    /**
     * Attribute to hold <code>spotRateRatingConvention</code> property.
     */
    private RatingConventionType spotRateRatingConvention;

    /**
     * Attribute to hold <code>sraIndicator</code> property.
     */
    private boolean sraIndicator;

    /**
     * Gets the <code>additionalParticipant1Type</code> property.
     * <p>
     * 
     * @return the current value of the <code>additionalParticipant1Type</code> property.<br>
     */
    public String getAdditionalParticipant1Type() {
        return this.additionalParticipant1Type;
    }

    /**
     * Gets the <code>additionalParticipant2Type</code> property.
     * <p>
     * 
     * @return the current value of the <code>additionalParticipant2Type</code> property.<br>
     */
    public String getAdditionalParticipant2Type() {
        return this.additionalParticipant2Type;
    }

    /**
     * Gets the <code>agentCommission</code> property.
     * <p>
     * 
     * @return the current value of the <code>agentCommission</code> property.<br>
     */
    public boolean getAgentCommission() {
        return this.agentCommission;
    }

    /**
     * Gets the <code>allotmentId</code> property.
     * <p>
     * 
     * @return the current value of the <code>allotmentId</code> property.<br>
     */
    public String getAllotmentId() {
        return allotmentId;
    }

    /**
     * Gets the <code>allotmentType</code> property.
     * <p>
     * 
     * @return the current value of the <code>allotmentType</code> property.<br>
     */
    public String getAllotmentType() {
        return allotmentType;
    }

    /**
     * Gets the <code>bestRateIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>bestRateIndicator</code> property.<br>
     */
    public boolean getBestRateIndicator() {
        return this.bestRateIndicator;
    }

    /**
     * Gets the <code>CampaignInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>CampaignInd</code> property.
     */
    public boolean getCampaignInd() {
        return this.campaignInd;
    }

    /**
     * Gets the <code>contractPriority</code> property.
     * <p>
     * 
     * @return the current value of the <code>contractPriority</code> property.<br>
     */
    public String getContractPriority() {
        return this.contractPriority;
    }

    /**
     * Gets the <code>contractWeightUnit</code> property.
     * <p>
     * 
     * @return the current value of the <code>contractWeightUnit</code> property.<br>
     */
    public WeightUOMType getContractWeightUnit() {
        return this.contractWeightUnit;
    }

    /**
     * Gets the <code>enforceHurdleRate</code> property.
     * <p>
     * 
     * @return the current value of the <code>enforceHurdleRate</code> property.<br>
     */
    public boolean getEnforceHurdleRate() {
        return this.enforceHurdleRate;
    }

    /**
     * Gets the <code>minimumRateIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>minimumRateIndicator</code> property.<br>
     */
    public boolean getMinimumRateIndicator() {
        return this.minimumRateIndicator;
    }

    /**
     * Gets the <code>minimumShipmentSize</code> property.
     * <p>
     * 
     * @return the current value of the <code>minimumShipmentSize</code> property.<br>
     */
    public BigDecimal getMinimumShipmentSize() {
        return minimumShipmentSize;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    public Long getOId() {
        return this.oId;
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

    /**
     * Gets the <code>participantAccNo</code> property.
     * <p>
     * 
     * @return the current value of the <code>participantAccNo</code> property.<br>
     */
    public String getParticipantAccNo() {
        return this.participantAccNo;
    }

    /**
     * Gets the <code>participantGroupIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>participantGroupIndicator</code> property.<br>
     */
    public boolean getParticipantGroupIndicator() {
        return this.participantGroupIndicator;
    }

    /**
     * Gets the <code>participantIndex</code> property.
     * <p>
     * 
     * @return the current value of the <code>participantIndex</code> property.<br>
     */
    public int getParticipantIndex() {
        return this.participantIndex;
    }

    /**
     * Gets the <code>participantType</code> property.
     * <p>
     * 
     * @return the current value of the <code>participantType</code> property.<br>
     */
    public String getParticipantType() {
        return this.participantType;
    }

    /**
     * Gets the <code>rateAdjustment</code> property.
     * <p>
     * 
     * @return the current value of the <code>rateAdjustment</code> property.<br>
     */
    public BigDecimal getRateAdjustment() {
        return this.rateAdjustment;
    }

    public boolean getRateConstructionIndicator() {
        return this.rateConstructionIndicator;
    }

    /**
     * Gets the <code>specialHandlingCodes</code> property.
     * <p>
     * 
     * @return the current value of the <code>specialHandlingCodes</code> property.<br>
     */
    public String getSpecialHandlingCodes() {
        return this.specialHandlingCodes;
    }

    /**
     * Gets the <code>specialInstructions</code> property.
     * <p>
     * 
     * @return the current value of the <code>specialInstructions</code> property.<br>
     */
    public String getSpecialInstructions() {
        return this.specialInstructions;
    }

    /**
     * Gets the <code>specialRateCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>specialRateCode</code> property.<br>
     */
    public String getSpecialRateCode() {
        return this.specialRateCode;
    }

    /**
     * Gets the <code>specialRateHierarchy</code> property.
     * <p>
     * 
     * @return the current value of the <code>specialRateHierarchy</code> property.<br>
     */
    public Integer getSpecialRateHierarchy() {
        return this.specialRateHierarchy;
    }

    /**
     * Gets the <code>spotRateRatingConvention</code> property.
     * <p>
     * 
     * @return the current value of the <code>spotRateRatingConvention</code> property.<br>
     */
    public RatingConventionType getSpotRateRatingConvention() {
        return this.spotRateRatingConvention;
    }

    /**
     * Gets the <code>sraIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>sraIndicator</code> property.<br>
     */
    public boolean getSraIndicator() {
        return this.sraIndicator;
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
     * Gets the <code>allDestinationIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>allDestinationIndicator</code> property.<br>
     */
    public boolean isAllDestinationIndicator() {
        return this.allDestinationIndicator;
    }

    /**
     * Gets the <code>allOriginIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>allOriginIndicator</code> property.<br>
     */
    public boolean isAllOriginIndicator() {
        return this.allOriginIndicator;
    }

    /**
     * Gets the <code>flightAllotmentRestrictionIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>flightAllotmentRestrictionIndicator</code> property.<br>
     */
    public boolean isFlightAllotmentRestrictionIndicator() {
        return this.flightAllotmentRestrictionIndicator;
    }

    /**
     * Gets the <code>interlineRoutingIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>interlineRoutingIndicator</code> property.<br>
     */
    public boolean isInterlineRoutingIndicator() {
        return this.interlineRoutingIndicator;
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

    /**
     * Sets the <code>agentCommission</code> property.
     * <p>
     * 
     * @param pAgentCommission
     *            the current value of the <code>agentCommission</code> property.<br>
     */
    public void setAgentCommission(final boolean pAgentCommission) {
        this.agentCommission = pAgentCommission;
    }

    /**
     * Sets the <code>allDestinationIndicator</code> property.
     * <p>
     * 
     * @param pAllDestinationIndicator
     *            the current value of the <code>allDestinationIndicator</code> property.<br>
     */
    public void setAllDestinationIndicator(final boolean pAllDestinationIndicator) {
        this.allDestinationIndicator = pAllDestinationIndicator;
    }

    /**
     * Sets the <code>allOriginIndicator</code> property.
     * <p>
     * 
     * @param pAllOriginIndicator
     *            the current value of the <code>allOriginIndicator</code> property.<br>
     */
    public void setAllOriginIndicator(final boolean pAllOriginIndicator) {
        this.allOriginIndicator = pAllOriginIndicator;
    }

    /**
     * Sets the <code>allotmentId</code> property.
     * <p>
     * 
     * @param pAllOriginIndicator
     *            the current value of the <code>allotmentId</code> property.<br>
     */
    public void setAllotmentId(final String pAllotmentId) {
        this.allotmentId = pAllotmentId;
    }

    /**
     * Sets the <code>allotmentType</code> property.
     * <p>
     * 
     * @param pAllOriginIndicator
     *            the current value of the <code>allotmentType</code> property.<br>
     */
    public void setAllotmentType(final String pAllotmentType) {
        this.allotmentType = pAllotmentType;
    }

    /**
     * Sets the <code>bestRateIndicator</code> property.
     * <p>
     * 
     * @param pBestRateIndicator
     *            the current value of the <code>bestRateIndicator</code> property.<br>
     */
    public void setBestRateIndicator(final boolean pBestRateIndicator) {
        this.bestRateIndicator = pBestRateIndicator;
    }

    /**
     * Sets the <code>CampaignInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No Boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pCampaignInd
     *            the current value of the <code>CampaignInd</code> property.
     */
    public void setCampaignInd(boolean pCampaignInd) {
        this.campaignInd = pCampaignInd;
    }

    /**
     * Sets the <code>contractPriority</code> property.
     * <p>
     * 
     * @param pContractPriority
     *            the current value of the <code>contractPriority</code> property.<br>
     */
    public void setContractPriority(final String pContractPriority) {
        this.contractPriority = pContractPriority;
    }

    /**
     * Sets the <code>contractWeightUnit</code> property.
     * <p>
     * 
     * @param pContractWeightUnit
     *            the current value of the <code>contractWeightUnit</code> property.<br>
     */
    public void setContractWeightUnit(final WeightUOMType pContractWeightUnit) {
        this.contractWeightUnit = pContractWeightUnit;
    }

    /**
     * Sets the <code>enforceHurdleRate</code> property.
     * <p>
     * 
     * @param pEnforceHurdleRate
     *            the current value of the <code>enforceHurdleRate</code> property.<br>
     */
    public void setEnforceHurdleRate(final boolean pEnforceHurdleRate) {
        this.enforceHurdleRate = pEnforceHurdleRate;
    }

    /**
     * Sets the <code>flightAllotmentRestrictionIndicator</code> property.
     * <p>
     * 
     * @param pFlightAllotmentRestrictionIndicator
     *            the current value of the <code>flightAllotmentRestrictionIndicator</code> property.<br>
     */
    public void setFlightAllotmentRestrictionIndicator(final boolean pFlightAllotmentRestrictionIndicator) {
        this.flightAllotmentRestrictionIndicator = pFlightAllotmentRestrictionIndicator;
    }

    /**
     * Sets the <code>interlineRoutingIndicator</code> property.
     * <p>
     * 
     * @param pInterlineRoutingIndicator
     *            the current value of the <code>interlineRoutingIndicator</code> property.<br>
     */
    public void setInterlineRoutingIndicator(final boolean pInterlineRoutingIndicator) {
        this.interlineRoutingIndicator = pInterlineRoutingIndicator;
    }

    /**
     * Sets the <code>minimumRateIndicator</code> property.
     * <p>
     * 
     * @param pMinimumRateIndicator
     *            the current value of the <code>minimumRateIndicator</code> property.<br>
     */
    public void setMinimumRateIndicator(final boolean pMinimumRateIndicator) {
        this.minimumRateIndicator = pMinimumRateIndicator;
    }

    /**
     * Sets the <code>minimumShipmentSize</code> property.
     * <p>
     * 
     * @param pMinimumShipmentSize
     *            the current value of the <code>minimumShipmentSize</code> property.<br>
     */
    public void setMinimumShipmentSize(final BigDecimal pMinimumShipmentSize) {
        this.minimumShipmentSize = pMinimumShipmentSize;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the current value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
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

    /**
     * Sets the <code>participantAccNo</code> property.
     * <p>
     * 
     * @param pParticipantAccNo
     *            the current value of the <code>participantAccNo</code> property.<br>
     */
    public void setParticipantAccNo(final String pParticipantAccNo) {
        this.participantAccNo = pParticipantAccNo;
    }

    /**
     * Sets the <code>participantIndex</code> property.
     * <p>
     * 
     * @param pParticipantIndex
     *            the current value of the <code>participantIndex</code> property.<br>
     */
    public void setParticipantIndex(final int pParticipantIndex) {
        this.participantIndex = pParticipantIndex;
    }

    /**
     * Sets the <code>participantGroupIndicator</code> property.
     * <p>
     * 
     * @param pParticipantGroupIndicator
     *            the current value of the <code>participantGroupIndicator</code> property.<br>
     */
    public void setParticipantGroupIndicator(final boolean pParticipantGroupIndicator) {
        this.participantGroupIndicator = pParticipantGroupIndicator;
    }

    /**
     * Sets the <code>participantType</code> property.
     * <p>
     * 
     * @param pParticipantType
     *            the current value of the <code>participantType</code> property.<br>
     */
    public void setParticipantType(final String pParticipantType) {
        this.participantType = pParticipantType;
    }

    /**
     * Sets the <code>rateAdjustment</code> property.
     * <p>
     * 
     * @param pRateAdjustment
     *            the current value of the <code>rateAdjustment</code> property.<br>
     */
    public void setRateAdjustment(final BigDecimal pRateAdjustment) {
        this.rateAdjustment = pRateAdjustment;
    }

    public void setRateConstructionIndicator(final boolean pRateConstructionIndicator) {
        this.rateConstructionIndicator = pRateConstructionIndicator;
    }

    /**
     * Sets the <code>specialHandlingCodes</code> property.
     * <p>
     * 
     * @param pSpecialHandlingCodes
     *            the current value of the <code>specialHandlingCodes</code> property.<br>
     */
    public void setSpecialHandlingCodes(final String pSpecialHandlingCodes) {
        this.specialHandlingCodes = pSpecialHandlingCodes;
    }

    /**
     * Sets the <code>specialInstructions</code> property.
     * <p>
     * 
     * @param pSpecialInstructions
     *            the current value of the <code>specialInstructions</code> property.<br>
     */
    public void setSpecialInstructions(final String pSpecialInstructions) {
        this.specialInstructions = pSpecialInstructions;
    }

    /**
     * Sets the <code>specialRateCode</code> property.
     * <p>
     * 
     * @param pSpecialRateCode
     *            the current value of the <code>specialRateCode</code> property.<br>
     */
    public void setSpecialRateCode(final String pSpecialRateCode) {
        this.specialRateCode = pSpecialRateCode;
    }

    /**
     * Sets the <code>specialRateHierarchy</code> property.
     * <p>
     * 
     * @param pSpecialRateHierarchy
     *            the current value of the <code>specialRateHierarchy</code> property.<br>
     */
    public void setSpecialRateHierarchy(final Integer pSpecialRateHierarchy) {
        this.specialRateHierarchy = pSpecialRateHierarchy;
    }

    /**
     * Sets the <code>spotRateRatingConvention</code> property.
     * <p>
     * 
     * @param pSpotRateRatingConvention
     *            the current value of the <code>spotRateRatingConvention</code> property.<br>
     */
    public void setSpotRateRatingConvention(final RatingConventionType pSpotRateRatingConvention) {
        this.spotRateRatingConvention = pSpotRateRatingConvention;
    }

    /**
     * Sets the <code>sraIndicator</code> property.
     * <p>
     * 
     * @param pSraIndicator
     *            the current value of the <code>sraIndicator</code> property.<br>
     */
    public void setSraIndicator(final boolean pSraIndicator) {
        this.sraIndicator = pSraIndicator;
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

    /**
     * Attribute to hold <code>compareTariffClassRateIndicator</code> property.
     */
    private boolean compareTariffClassRateIndicator;

	/**
	 * @return the compareTariffClassRateIndicator
	 */
	public boolean isCompareTariffClassRateIndicator() {
		return compareTariffClassRateIndicator;
	}

	/**
	 * @param pCompareTariffClassRateIndicator the compareTariffClassRateIndicator to set
	 */
	public void setCompareTariffClassRateIndicator(final boolean pCompareTariffClassRateIndicator) {
		this.compareTariffClassRateIndicator = pCompareTariffClassRateIndicator;
	}
    

}