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

import com.unisys.trans.logistics.lms.utils.dto.constants.RateClassType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ProrationType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.RateGenerationType;
import com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants;
import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>RatingLineEntryDto</code> class contain information specific to an RatingLineEntry.<br>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>chargeableWeight
 * <li>classRatingId
 * <li>commodityNumber
 * <li>deleteIndicator
 * <li>contractNumber
 * <li>grossWeight
 * <li>netNetIndicator
 * <li>oId
 * <li>rateCharge
 * <li>rateClassType
 * <li>rateGenerationType
 * <li>rateNote
 * <li>totalChargeableWeight
 * <li>totalWeightCharges
 * <li>volume
 * <li>weightUnit
 * <li>oId
 * <li>uldType
 * </code>
 * </ul>
 */
public class RatingLineEntryDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -6530682681785759812L;

    /**
     * Attribute to hold <code>actualIndicator</code> property.
     */
    private boolean actualIndicator;

    /**
     * Attribute to hold <code>chargeableWeight</code> property.
     */
    private BigDecimal chargeableWeight;

    /**
     * Attribute to hold <code>classRatingId</code> property.
     */
    private String classRatingId;

    /**
     * Attribute to hold <code>commodityNumber</code> property.
     */
    private String commodityNumber;

    /**
     * Attribute to hold <code>contractNumber</code> property.
     */
    private String contractNumber;

    /**
     * Attribute to hold <code>deleteIndicator</code> property.
     */
    private boolean deleteIndicator;

    /**
     * Attribute to hold <code>faceIndicator</code> property.
     */
    private boolean faceIndicator;

    /**
     * Attribute to hold <code>grossWeight</code> property.
     */
    private BigDecimal grossWeight;

    /**
     * Attribute to hold <code>netNetIndicator</code> property.
     */
    private Boolean netNetIndicator;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>owner</code> property.
     */
    private String owner;

    /**
     * Attribute to hold <code>publishedIndicator</code> property.
     */
    private boolean publishedIndicator;

    /**
     * Gets the <code>dimensionalWeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>dimensionalWeight</code> property.
     */

    private BigDecimal rate;

    /**
     * Attribute to hold <code>rateCharge</code> property.
     */
    private BigDecimal rateCharge;

    /**
     * Attribute to hold <code>rateClassType</code> property.
     */
    private RateClassType rateClassType;
    
    private String rateClassCode;
    
    private String rateClassValue;
    
    private ProrationType prorationMethod;
    
    private BigDecimal revenuePerRatingLine;
    
    private Map<Integer, List<Long>> interLineProrateIds;
    
    private String interLineProrateIdentifier;
    
    private Map<Integer, String> prorationIdentifiers;
    
    private BigDecimal carrierRevenue;
    
    private BigDecimal prorationCurrencyCarrierRevenue;
    
    public String getRateClassValue() {   	
    	return this.rateClassValue;       
	}

	public void setRateClassValue(String rateClassValue) {
		this.rateClassValue = rateClassValue;
	}

	public String getRateClassCode()
    {
    	 if (this.rateClassType != null) {
             if ((this.rateClassType.toString().equalsIgnoreCase("C")) || (this.rateClassType.toString().equalsIgnoreCase("N")) || (this.rateClassType.toString().equalsIgnoreCase("Q"))
                        || (this.rateClassType.toString().equalsIgnoreCase("Y")) || (this.rateClassType.toString().equalsIgnoreCase("B")) || (this.rateClassType.toString().equalsIgnoreCase("E"))
                        || (this.rateClassType.toString().equalsIgnoreCase("K")) || (this.rateClassType.toString().equalsIgnoreCase("X")) || (this.rateClassType.toString().equalsIgnoreCase("M"))) {                    

                 if (this.chargeTypeIndicator != null
                             && (this.chargeTypeIndicator.equalsIgnoreCase("F") || this.chargeTypeIndicator.equalsIgnoreCase("P") || this.chargeTypeIndicator.equalsIgnoreCase("U"))) {
                     return rateClassType + chargeTypeIndicator;
                 }
                 //LMSC-7312 and 8477
                 if (this.chargeTypeIndicator != null
                         && (this.chargeTypeIndicator.equalsIgnoreCase("R") || this.chargeTypeIndicator.equalsIgnoreCase("S"))) {
                	 return chargeTypeIndicator + rateClassType;
                 }
             }
             else if (this.rateClassType.toString().equalsIgnoreCase("U")) {
	                 if (this.chargeTypeIndicator != null && (this.chargeTypeIndicator.equalsIgnoreCase("U") 
	                		 || (this.chargeTypeIndicator.equalsIgnoreCase("F") || this.chargeTypeIndicator.equalsIgnoreCase("P")))) {
	                     return this.rateClassType + chargeTypeIndicator;
	                 }
             }           
             
             /*else if(this.rateClassType.toString().equalsIgnoreCase("S") || this.rateClassType.toString().equalsIgnoreCase("R")) {
	            	 if (this.chargeTypeIndicator != null && (this.chargeTypeIndicator.equalsIgnoreCase("B") || (this.chargeTypeIndicator.equalsIgnoreCase("K")) 
	            			 || (this.chargeTypeIndicator.equalsIgnoreCase("M")) || (this.chargeTypeIndicator.equalsIgnoreCase("N")) 
	            			 || (this.chargeTypeIndicator.equalsIgnoreCase("Q")) || (this.chargeTypeIndicator.equalsIgnoreCase("F")
	            			 || this.chargeTypeIndicator.equalsIgnoreCase("P")))) {
	                     return this.rateClassType + chargeTypeIndicator;
	                 }
             }*/           
             
             else if(this.rateClassType.toString().equalsIgnoreCase("N") ||
            		 this.rateClassType.toString().equalsIgnoreCase("K") || this.rateClassType.toString().equalsIgnoreCase("C")) {
		            	 if (this.chargeTypeIndicator != null && this.chargeTypeIndicator.equalsIgnoreCase("U")) {
		                     return this.rateClassType + chargeTypeIndicator;
		                 }
             }            
         }
    	return rateClassCode;  
    }
    
    public void setRateClassCode(String rateClassCode)
    {
        this.rateClassCode = rateClassCode;
    }
    private String rateClassTypeFormatted;

    /**
     * Attribute to hold <code>rateGenerationType</code> property.
     */
    private RateGenerationType rateGenerationType;

    /**
     * Attribute to hold <code>rateNote</code> property.
     */
    private String rateNote;

    /**
     * Attribute to hold <code>ratePercentage</code> property.
     */
    private Integer ratePercentage;

    /**
     * Attribute to hold <code>ratePieces</code> property.
     */
    private String ratePieces;

    /**
     * Attribute to hold <code>rateRCPIndicator</code> property.
     */
    private boolean rateRCPIndicator;

    /**
     * Attribute to hold <code>rateSource</code> property.
     */
    private String rateSource;

    /**
     * Attribute to hold <code>rateType</code> property.
     */
    private String rateType;

    /**
     * Attribute to hold <code>ratingLineDescription</code> property.
     */
    private String ratingLineDescription;

    /**
     * Attribute to hold <code>sportRateNumber</code> property.
     */
    private String spotRateNumber;

    /**
     * Attribute to hold <code>totalWeightCharge</code> property.
     */
    private BigDecimal totalWeightCharge;

    /**
     * Attribute to hold <code>uldType</code> property.
     */
    private String uldType;
    
    private WeightUOMType unitOfWeight;
    
    //TR-2004305 
    /**
     * Charge Type Indicator for actual rates
     * <ul>
     * <li>F = a flat rate charge</li>
     * <li>U = a per unit of weight charge</li>
     * </ul>
     */

    private String chargeTypeIndicator;

    public String getChargeTypeIndicator()
    {
        return this.chargeTypeIndicator;
    }

    public void setChargeTypeIndicator(String chargeTypeIndicator)
    {
        this.chargeTypeIndicator = chargeTypeIndicator;
    }

    /**
     * Gets the <code>actualIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>actualIndicator</code> property.
     */
    public boolean getActualIndicator() {
        return this.actualIndicator;
    }

    public BigDecimal getChargeableWeight() {
        return this.chargeableWeight;
    }

    /**
     * Gets the <code>dimensionalWeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>dimensionalWeight</code> property.
     */
    public String getClassRatingId() {
        return this.classRatingId;
    }

    /**
     * Gets the <code>dimensionalWeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>dimensionalWeight</code> property.
     */
    public String getCommodityNumber() {
    	if(this.commodityNumber==null){
    		return "";    		
    	}
        return this.commodityNumber;
    }

    /**
     * Gets the <code>dimensionalWeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>dimensionalWeight</code> property.
     */
    public String getContractNumber() {
        return this.contractNumber;
    }

    /**
     * Gets the <code>dimensionalWeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>dimensionalWeight</code> property.
     */
    public boolean getDeleteIndicator() {
        return this.deleteIndicator;
    }

    /**
     * Gets the <code>faceIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>faceIndicator</code> property.
     */

    public boolean getFaceIndicator() {
        return this.faceIndicator;
    }

    /**
     * Gets the <code>dimensionalWeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>dimensionalWeight</code> property.
     */
    public BigDecimal getGrossWeight() {
    	if(this.grossWeight== null){
    		return new BigDecimal(0);
    	}
    	else return this.grossWeight;
    }

    /**
     * Gets the <code>dimensionalWeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>dimensionalWeight</code> property.
     */
    public Boolean getNetNetIndicator() {
        return this.netNetIndicator;
    }

    public String getNetNetIndicatorText() {
        String netNetIndicatorText = null;
        if (this.netNetIndicator != null) {
            if (this.netNetIndicator) {
                netNetIndicatorText = FrameworkConstants.YES_LITERAL;
            }
            else {
                netNetIndicatorText = FrameworkConstants.NO_LITERAL;
            }
        }
        return netNetIndicatorText;
    }

    private String netNetIndicatorText;

    public void setNetNetIndicatorText(final String pNetNetIndicatorText) {
        this.netNetIndicatorText = ContractUtility.convertToUpperCase(pNetNetIndicatorText);
    }

    /**
     * Gets the <code>oId</code> property.
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */

    public Long getOId() {
        return this.oId;
    }

    public String getOwner() {
        return this.owner;
    }

    /**
     * Gets the <code>rate</code> property.
     * <p>
     * 
     * @return the current value of the <code>rate</code> property.
     */
    public BigDecimal getRate() {
    	if(this.rate==null){
    		return new BigDecimal(0);
    	}
        return this.rate;
    }

    /**
     * Gets the <code>rateCharge</code> property.
     * <p>
     * 
     * @return the current value of the <code>rateCharge</code> property.
     */
    public BigDecimal getRateCharge() {
        return this.rateCharge;
    }

    /**
     * Gets the <code>rateClassType</code> property.
     * <p>
     * 
     * @return the current value of the <code>rateClassType</code> property.
     */
    public RateClassType getRateClassType() {

        
        return rateClassType;
    }

    /**
     * Gets the <code>rateGenerationType</code> property.
     * <p>
     * 
     * @return the current value of the <code>rateGenerationType</code> property.
     */
    public RateGenerationType getRateGenerationType() {
        return this.rateGenerationType;
    }

    /**
     * Gets the <code>rateNote</code> property.
     * <p>
     * 
     * @return the current value of the <code>rateNote</code> property.
     */
    public String getRateNote() {
        return this.rateNote;
    }

    /**
     * Gets the <code>ratePercentage</code> property.
     * <p>
     * 
     * @return the current value of the <code>ratePercentage</code> property.
     */
    public Integer getRatePercentage() {
        return this.ratePercentage;
    }

    /**
     * Gets the <code>ratePieces</code> property.
     * <p>
     * 
     * @return the current value of the <code>ratePieces</code> property.
     */
    public String getRatePieces() {
    	if(this.ratePieces==null){
    		return "";
    	}
        return this.ratePieces;
    }

    /**
     * Gets the <code>rateRCPIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>rateRCPIndicator</code> property.
     */
    public boolean getRateRCPIndicator() {
        return this.rateRCPIndicator;
    }

    /**
     * Gets the <code>rateSource</code> property.
     * <p>
     * 
     * @return the current value of the <code>rateSource</code> property.
     */
    public String getRateSource() {
        return this.rateSource;
    }

    /**
     * Gets the <code>rateType</code> property.
     * <p>
     * 
     * @return the current value of the <code>rateType</code> property.
     */
    public String getRateType() {
        return this.rateType;
    }

    /**
     * Gets the <code>ratingLineDescription</code> property.
     * <p>
     * 
     * @return the current value of the <code>ratingLineDescription</code> property.
     */
    public String getRatingLineDescription() {
    	if(this.ratingLineDescription==null){
    		return "";
    	}
        return this.ratingLineDescription;
    }

    /**
     * Gets the <code>spotRateNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>spotRateNumber</code> property.
     */
    public String getSpotRateNumber() {
        return this.spotRateNumber;
    }

    /**
     * Gets the <code>totalWeightCharge</code> property.
     * <p>
     * 
     * @return the current value of the <code>totalWeightCharge</code> property.
     */
    public BigDecimal getTotalWeightCharge() {
    	if(this.totalWeightCharge==null){
    		return new BigDecimal(0);
    	}
    	else return this.totalWeightCharge;
    }

    /**
     * Gets the <code>uldType</code> property.
     * <p>
     * 
     * @return the current value of the <code>uldType</code> property.
     */
    public String getUldType() {
        return this.uldType;
    }

    /**
     * Gets the <code>publishedIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>publishedIndicator</code> property.
     */
    public boolean isPublishedIndicator() {
        return this.publishedIndicator;
    }

    /**
     * Sets the <code>actualIndicator</code>.
     * <p>
     * 
     * @param pActualIndicator
     *            holds the new value of <code>actualIndicator</code>
     */
    public void setActualIndicator(final boolean pActualIndicator) {
        this.actualIndicator = pActualIndicator;
    }

    /**
     * Sets the <code>chargeableWeight</code>.
     * <p>
     * 
     * @param pChargeableWeight
     *            holds the new value of <code>chargeableWeight</code>
     */
    public void setChargeableWeight(final BigDecimal pChargeableWeight) {
        this.chargeableWeight = pChargeableWeight;
    }

    /**
     * Sets the <code>classRatingId</code>.
     * <p>
     * 
     * @param pClassRatingId
     *            holds the new value of <code>classRatingId</code>
     */
    public void setClassRatingId(final String pClassRatingId) {
        this.classRatingId = ContractUtility.convertToUpperCase(pClassRatingId);
    }

    /**
     * Sets the <code>commodityNumber</code>.
     * <p>
     * 
     * @param pCommodityNumber
     *            holds the new value of <code>commodityNumber</code>
     */
    public void setCommodityNumber(final String pCommodityNumber) {
        this.commodityNumber = ContractUtility.convertToUpperCase(pCommodityNumber);
    }

    /**
     * Sets the <code>contractNumber</code>.
     * <p>
     * 
     * @param pContractNumber
     *            holds the new value of <code>contractNumber</code>
     */
    public void setContractNumber(final String pContractNumber) {
        this.contractNumber = ContractUtility.convertToUpperCase(pContractNumber);
    }

    /**
     * Sets the <code>deleteIndicator</code>.
     * <p>
     * 
     * @param pDeleteIndicator
     *            holds the new value of <code>deleteIndicator</code>
     */
    public void setDeleteIndicator(final boolean pDeleteIndicator) {
        this.deleteIndicator = pDeleteIndicator;
    }

    /**
     * Sets the <code>faceIndicator</code>.
     * <p>
     * 
     * @param pFaceIndicator
     *            holds the new value of <code>faceIndicator</code>
     */
    public void setFaceIndicator(final boolean pFaceIndicator) {
        this.faceIndicator = pFaceIndicator;
    }

    /**
     * Sets the <code>grossWeight</code>.
     * <p>
     * 
     * @param pGrossWeight
     *            holds the new value of <code>grossWeight</code>
     */
    public void setGrossWeight(final BigDecimal pGrossWeight) {
        this.grossWeight = pGrossWeight;
    }

    /**
     * Sets the <code>netNetIndicator</code>.
     * <p>
     * 
     * @param pNetNetIndicator
     *            holds the new value of <code>netNetIndicator</code>
     */
    public void setNetNetIndicator(final Boolean pNetNetIndicator) {
        this.netNetIndicator = pNetNetIndicator;
    }

    /**
     * Sets the <code>oId</code> property.
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>owner</code> property.
     * 
     * @param pOwner
     *            the new value of the <code>owner</code> property.<br>
     */
    public void setOwner(final String pOwner) {
        this.owner = ContractUtility.convertToUpperCase(pOwner);
    }

    /**
     * Sets the <code>publishedIndicator</code>.
     * <p>
     * 
     * @param pPublishedIndicator
     *            holds the new value of <code>publishedIndicator</code>
     */
    public void setPublishedIndicator(final boolean pPublishedIndicator) {
        this.publishedIndicator = pPublishedIndicator;
    }

    /**
     * Sets the <code>rate</code>.
     * <p>
     * 
     * @param pRate
     *            holds the new value of <code>rate</code>
     */
    public void setRate(final BigDecimal pRate) {
        this.rate = pRate;
    }

    /**
     * Sets the <code>rateCharge</code>.
     * <p>
     * 
     * @param pRateCharge
     *            holds the new value of <code>rateCharge</code>
     */
    public void setRateCharge(final BigDecimal pRateCharge) {
        this.rateCharge = pRateCharge;
    }

    /**
     * Sets the <code>rateClassType</code>.
     * <p>
     * 
     * @param pRateClassType
     *            holds the new value of <code>rateClassType</code>
     */
    public void setRateClassType(final RateClassType pRateClassType) {
        this.rateClassType = pRateClassType;
    }

    /**
     * Sets the <code>rateGenerationType</code>.
     * <p>
     * 
     * @param pRateGenerationType
     *            holds the new value of <code>rateGenerationType</code>
     */
    public void setRateGenerationType(final RateGenerationType pRateGenerationType) {
        this.rateGenerationType = pRateGenerationType;
    }

    /**
     * Sets the <code>rateNote</code>.
     * <p>
     * 
     * @param pRateNote
     *            holds the new value of <code>rateNote</code>
     */
    public void setRateNote(final String pRateNote) {
        this.rateNote = ContractUtility.convertToUpperCase(pRateNote);
    }

    /**
     * Sets the <code>ratePercentage</code>.
     * <p>
     * 
     * @param pRatePercentage
     *            holds the new value of <code>ratePercentage</code>
     */
    public void setRatePercentage(final Integer pRatePercentage) {
        this.ratePercentage = pRatePercentage;
    }

    /**
     * Sets the <code>ratePieces</code>.
     * <p>
     * 
     * @param pRatePieces
     *            holds the new value of <code>ratePieces</code>
     */
    public void setRatePieces(final String pRatePieces) {
        this.ratePieces = ContractUtility.convertToUpperCase(pRatePieces);
    }

    /**
     * Sets the <code>rateRCPIndicator</code>.
     * <p>
     * 
     * @param pRateRCPIndicator
     *            holds the new value of <code>rateRCPIndicator</code>
     */

    public void setRateRCPIndicator(final boolean pRateRCPIndicator) {
        this.rateRCPIndicator = pRateRCPIndicator;
    }

    /**
     * Sets the <code>rateSource</code>.
     * <p>
     * 
     * @param pRateSource
     *            holds the new value of <code>rateSource</code>
     */
    public void setRateSource(final String pRateSource) {
        this.rateSource = ContractUtility.convertToUpperCase(pRateSource);
    }

    /**
     * Sets the <code>rateType</code>.
     * <p>
     * 
     * @param pRateType
     *            holds the new value of <code>rateType</code>
     */
    public void setRateType(final String pRateType) {
        this.rateType = ContractUtility.convertToUpperCase(pRateType);
    }

    /**
     * Sets the <code>ratingLineDescription</code>.
     * <p>
     * 
     * @param pRatingLineDescription
     *            holds the new value of <code>ratingLineDescription</code>
     */
    public void setRatingLineDescription(final String pRatingLineDescription) {
        this.ratingLineDescription = ContractUtility.convertToUpperCase(pRatingLineDescription);
    }

    /**
     * Sets the <code>spotRateNumber</code>.
     * <p>
     * 
     * @param pSpotRateNumber
     *            holds the new value of <code>spotRateNumber</code>
     */
    public void setSpotRateNumber(final String pSpotRateNumber) {
        this.spotRateNumber = ContractUtility.convertToUpperCase(pSpotRateNumber);
    }

    /**
     * Sets the <code>totalWeightCharge</code>.
     * <p>
     * 
     * @param pTotalWeightCharge
     *            holds the new value of <code>totalWeightCharge</code>
     */
    public void setTotalWeightCharge(final BigDecimal pTotalWeightCharge) {
        this.totalWeightCharge = pTotalWeightCharge;
    }

    /**
     * Sets the <code>uldType</code>.
     * <p>
     * 
     * @param pUldType
     *            holds the new value of <code>uldType</code>
     */
    public void setUldType(final String pUldType) {
        this.uldType = ContractUtility.convertToUpperCase(pUldType);
    }

    /**
     * Attribute to hold <code>rateLineNumber</code> property.
     */
    private Integer rateLineNumber;

    public Integer getRateLineNumber() {
        return this.rateLineNumber;
    }

    public void setRateLineNumber(final Integer pRateLineNumber) {
        this.rateLineNumber = pRateLineNumber;
    }

    @Override
    public String toString() {
        final StringBuilder aStrBuilder = new StringBuilder();

        if (this.getActualIndicator()) {
            aStrBuilder.append("Actual");
            aStrBuilder.append(" ");
        }
        if (this.getFaceIndicator()) {
            aStrBuilder.append("Face");
            aStrBuilder.append(" ");
        }
        if (this.isPublishedIndicator()) {
            aStrBuilder.append("Published");
            aStrBuilder.append(" ");
        }

        if (this.getRateGenerationType() != null && this.getRateGenerationType().getRateGenType() != null) {
            aStrBuilder.append(this.getRateGenerationType().getRateGenType());
            aStrBuilder.append(" ");
        }
        if (this.getRatePieces() != null) {
            aStrBuilder.append(this.getRatePieces());
            aStrBuilder.append(" ");
        }
        if (this.getGrossWeight() != null) {
            aStrBuilder.append(this.getGrossWeight());
            aStrBuilder.append(" ");
        }
        if (this.getRateSource() != null) {
            aStrBuilder.append(this.getRateSource());
            aStrBuilder.append(" ");
        }
        if (this.getRateType() != null) {
            aStrBuilder.append(this.getRateType());
            aStrBuilder.append(" ");
        }
        if (this.getRateClassType() != null) {
            aStrBuilder.append(this.getRateClassType());
            aStrBuilder.append(" ");
        }
        if (this.getUldType() != null) {
            aStrBuilder.append(this.getUldType());
            aStrBuilder.append(" ");
        }
        if (this.getCommodityNumber() != null) {
            aStrBuilder.append(this.getCommodityNumber());
            aStrBuilder.append(" ");
        }
        if (this.getChargeableWeight() != null) {
            aStrBuilder.append(this.getChargeableWeight());
            aStrBuilder.append(" ");
        }
        if (this.getRate() != null) {
            aStrBuilder.append(this.getRate());
            aStrBuilder.append(" ");
        }
        if (this.getRatePercentage() != null) {
            aStrBuilder.append(this.getRatePercentage());
            aStrBuilder.append(" ");
        }
        if (this.getRateNote() != null) {
            aStrBuilder.append(this.getRateNote());
            aStrBuilder.append(" ");
        }
        if (this.getRatingLineDescription() != null) {
            aStrBuilder.append(this.getRatingLineDescription());
            aStrBuilder.append(" ");
        }

        if (this.getContractNumber() != null) {
            aStrBuilder.append(this.getContractNumber());
            aStrBuilder.append(" ");
        }
        if (this.getOwner() != null) {
            aStrBuilder.append(this.getOwner());
            aStrBuilder.append(" ");
        }
        if (this.getNetNetIndicatorText() != null) {
            aStrBuilder.append(this.getNetNetIndicatorText());
            aStrBuilder.append(" ");
        }

        return aStrBuilder.toString();

    }

    private BigDecimal volumetricWeight;

    public BigDecimal getVolumetricWeight() {
        return this.volumetricWeight;
    }

    public void setVolumetricWeight(final BigDecimal pVolumetricWeight) {
        this.volumetricWeight = pVolumetricWeight;
    }

	public String getRateClassTypeFormatted() {
		if(rateClassType!=null){
			return rateClassType.toString();
		}
		else return "";
	}

	public void setRateClassTypeFormatted(String rateClassTypeFormatted) {
		this.rateClassTypeFormatted = rateClassTypeFormatted;
	}

	public String getUnitOfWeight() {
		if(this.unitOfWeight==null){
			return null;
		}
		else return this.unitOfWeight.toString();
	}

	public void setUnitOfWeight(WeightUOMType unitOfWeight) {
		this.unitOfWeight = unitOfWeight;
	}

	public ProrationType getProrationMethod() {
		return prorationMethod;
	}

	public void setProrationMethod(ProrationType prorationMethod) {
		this.prorationMethod = prorationMethod;
	}

	public BigDecimal getRevenuePerRatingLine() {
		return revenuePerRatingLine;
	}

	public void setRevenuePerRatingLine(BigDecimal revenuePerRatingLine) {
		this.revenuePerRatingLine = revenuePerRatingLine;
	}

	public Map<Integer, List<Long>> getInterLineProrateIds() {
		return interLineProrateIds;
	}

	public void setInterLineProrateIds(Map<Integer, List<Long>> interLineProrateIds) {
		this.interLineProrateIds = interLineProrateIds;
	}

	public String getInterLineProrateIdentifier() {
		return interLineProrateIdentifier;
	}

	public void setInterLineProrateIdentifier(String interLineProrateIdentifier) {
		this.interLineProrateIdentifier = interLineProrateIdentifier;
	}
	
	
	
	 public Map<Integer, String> getProrationIdentifiers() {
		return prorationIdentifiers;
	}

	public void setProrationIdentifiers(Map<Integer, String> prorationIdentifiers) {
		this.prorationIdentifiers = prorationIdentifiers;
	}

	public void addProrationIdentifier(Integer rateLineNo, String strProrateIdentifier) {
	        if (this.prorationIdentifiers == null) {
	            this.prorationIdentifiers = new HashMap<Integer, String>();
	        }
	        this.getProrationIdentifiers().put(rateLineNo, strProrateIdentifier);
	    }

	public BigDecimal getCarrierRevenue() {
		return carrierRevenue;
	}

	public void setCarrierRevenue(BigDecimal carrierRevenue) {
		this.carrierRevenue = carrierRevenue;
	}

	public BigDecimal getProrationCurrencyCarrierRevenue() {
		return prorationCurrencyCarrierRevenue;
	}

	public void setProrationCurrencyCarrierRevenue(
			BigDecimal prorationCurrencyCarrierRevenue) {
		this.prorationCurrencyCarrierRevenue = prorationCurrencyCarrierRevenue;
	}

	
	
}
