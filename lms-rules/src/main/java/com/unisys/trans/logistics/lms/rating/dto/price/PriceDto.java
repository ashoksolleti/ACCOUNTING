/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto.price;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.rating.dto.GeographicDataDto;
import com.unisys.trans.logistics.lms.framework.dto.ValidityTimeDto;
import com.unisys.trans.logistics.lms.rating.dto.constants.RateIndicatorType;
import com.unisys.trans.logistics.lms.rating.dto.constants.RatingConventionType;
import com.unisys.trans.logistics.lms.rating.dto.constants.RatingType;
import com.unisys.trans.logistics.lms.rating.dto.constants.SelectIdentifierType;
import com.unisys.trans.logistics.lms.rating.dto.constants.ULDChargeType;
import com.unisys.trans.logistics.lms.utils.dto.constants.RateClassType;

/**
 * <code>Price</code> holds the rate information for the requested rating line.
 * 
 * Price information contains two sets of attributes <br/>
 * 1. Attributes derived rating tables (ex: minimum weight, pivot weight, rate
 * source, tariff rate) <br/>
 * 2. Attributes that contain calculated rates for the shipment (ex: amount in
 * awb currency). Refer {@link PriceCalculator} for details <br/>
 * 
 */
public class PriceDto implements Serializable {
    /**
     * Generated serial version id.
     */
    private static final long serialVersionUID = 1600359211661536960L;

    /**
     * Attribute to hold <code>allInSraPricingIndicator</code> property.
     */
    private boolean allInSraPricingIndicator;

    /**
     * Attribute to hold <code>amount</code> property.
     */
    private BigDecimal amount;

    /**
     * Attribute to hold <code>applicableMinimumRate</code> property.
     */
    private BigDecimal applicableMinimumRate;

    /**
     * Attribute to hold <code>carrier</code> property.
     */
    private String carrier;

    /**
     * Attribute to hold <code>chargeableWeight</code> property.
     */
    private BigDecimal chargeableWeight;

    /**
     * Attribute to hold <code>classRatePrice</code> property.
     */
    private ClassRatePrice classRatePrice;

    /**
     * Attribute to hold <code>commodityNumber</code> property.
     */
    private String commodityNumber;

    /**
     * Attribute to hold <code>currencyCode</code> property.
     */
    private String currencyCode;

    /**
     * Attribute to hold <code>currencyConversionLine</code> property.
     */
    private String currencyConversionLine;

    /**
     * Attribute to hold <code>destinationDto</code> property.
     */
    private GeographicDataDto destinationDto;

    /**
     * Attribute to hold <code>discontinueDate</code> property.
     */
    private Date discontinueDate;

    /**
     * Attribute to hold <code>flightNumber</code> property.
     */
    private String flightNumber;

    /**
     * Attribute to hold <code>flightSpecificRateInd</code> property.
     */
    private boolean flightSpecificRateInd;

    /**
     * Attribute to hold <code>grossWeight</code> property.
     */
    private BigDecimal grossWeight;

    /**
     * Attribute to hold <code>jointRatePriceDto</code> property.
     */
    private JointRatePriceDto jointRatePriceDto;

    /**
     * Attribute to hold <code>kPriceDto</code> property.
     */
    private KPriceDto kPriceDto;

    /**
     * Attribute to hold <code>minimumWeight</code> property.
     */
    private BigDecimal minimumWeight;

    /**
     * Attribute to hold <code>originCurrencyInd</code> property.
     */
    private boolean originCurrencyInd;

    /**
     * Attribute to hold <code>originDto</code> property.
     */
    private GeographicDataDto originDto;

    /**
     * Attribute to hold <code>overPivotRate</code> property.
     */
    private BigDecimal overPivotRate;

    /**
     * Attribute to hold <code>overPivotRateCharge</code> property.
     */
    private BigDecimal overPivotRateCharge;

    /**
     * Attribute to hold <code>pendingGovernmentAppInd</code> property.
     */
    private boolean pendingGovernmentAppInd;

    /**
     * Attribute to hold <code>pivotWeight</code> property.
     */
    private BigDecimal pivotWeight;

    /**
     * Attribute to hold the <code>publishedRateInd</code> property. Used to
     * specify whether Published rating is done or Actual Rating is Done.
     */
    private boolean publishedRateInd;

    /**
     * Attribute to hold <code>rateCharge</code> property.
     */
    private BigDecimal rateCharge;

    /**
     * Attribute to hold <code>rateClassCode</code> property.
     */
    private RateClassType rateClassCode;

    /**
     * Attribute to hold <code>rateIndicator</code> property. Indicator for rate
     * (Flat/Per Unit/Per Piece).Allowed Values are: F - Flat Rate U - Per Unit
     * of weight rate P - Flat Rate, Per Piece
     */
    private RateIndicatorType rateIndicator;

    /**
     * Attribute to hold <code>rateSourceCode</code> property.
     */
    private String rateSourceCode;

    /**
     * Attribute to hold <code>rateSourceHierarchy</code> property.
     */
    private int rateSourceHierarchy;

    /**
     * Attribute to hold <code>rateTotalCharges</code> property.
     */

    private BigDecimal rateTotalCharges;

    /**
     * Attribute to hold <code>rateTypeCode</code> property.
     */
    private String rateTypeCode;

    /**
     * Attribute to hold <code>rateTypePercentagePrice</code> property.
     */
    private RateTypePercentagePrice rateTypePercentagePrice;

    /**
     * Attribute to hold <code>rateTypePriority</code> property.
     */
    private Integer rateTypePriority;

    /**
     * Attribute to hold <code>rateValidityHierarchy</code> property.
     */
    private int rateValidityHierarchy;

    /**
     * Attribute to hold list of<code>rateValidityTimeDtos</code> property.
     */
    private List<ValidityTimeDto> rateValidityTimeDtos;

    /**
     * Attribute to hold <code>ratingConventionType</code> property.
     */
    private RatingConventionType ratingConventionType;

    /**
     * Attribute to hold <code>ratingNoteCode</code> property.
     */
    private String ratingNoteCode;

    /**
     * Attribute to hold <code>ratingNoteDesc</code> property.
     */
    private String ratingNoteDesc;

    /**
     * Attribute to hold <code>ratingNoteDescription</code> property.
     */
    private String ratingNoteDescription;

    /**
     * Attribute to hold <code>ratingType</code> property.
     */
    private RatingType ratingType;

    /**
     * Attribute to hold <code>selectIdentifierType</code> property.
     */
    private SelectIdentifierType selectIdentifierType;

    /**
     * Attribute to hold <code>sequenceNumber</code> of the Rating line. This
     * must map to the {@link com.unisys.trans.logistics.lms.rating.dto.price.RatingLineDto#rateLineNumber
     * RatingLineDto.rateLineNumber}
     */
    private Integer sequenceNumber;

    /*
     * @Override public boolean equals(Object pObj) {
     * 
     * boolean value = true;
     * 
     * if (this == pObj) { value = true; } else if (pObj == null) { value =
     * false; } else if (getClass() != pObj.getClass()) { value = false; } else
     * { PriceDto other = (PriceDto) pObj;
     * 
     * // Rate Source OID if (ContractUtility.isEmpty(this.rateSourceCode)) { if
     * (!ContractUtility.isEmpty(other.rateSourceCode)) { value = false; } }
     * else if (ContractUtility.isEmpty(other.rateSourceCode)) { value = false;
     * } else if (!this.rateSourceCode.equalsIgnoreCase( other.rateSourceCode))
     * { value = false; }
     * 
     * // Rate Type OID if (ContractUtility.isEmpty(this.rateTypeCode)) { if
     * (!ContractUtility.isEmpty(other.rateTypeCode)) { value = false; } } else
     * if (ContractUtility.isEmpty(other.rateTypeCode)) { value = false; } else
     * if (!this.rateTypeCode.equalsIgnoreCase( other.rateTypeCode)) { value =
     * false; }
     * 
     * // Rate Class Type if (this.rateClassCode != other.rateClassCode) { value
     * = false; }
     * 
     * // Minimum Weight if (this.minimumWeight == null) { if
     * (other.minimumWeight != null) { value = false; } } else if
     * (other.minimumWeight != null &&
     * this.minimumWeight.compareTo(other.minimumWeight) != 0) { value = false;
     * }
     * 
     * // Pivot Weight if (this.pivotWeight == null) { if (other.pivotWeight !=
     * null) { value = false; } } else if (other.pivotWeight != null &&
     * this.pivotWeight.compareTo(other.pivotWeight) != 0) { value = false; }
     * 
     * // Commodity Number if (ContractUtility.isEmpty(this.commodityNumber)) {
     * if (!ContractUtility.isEmpty(other.commodityNumber)) { value = false; } }
     * else if (ContractUtility.isEmpty(other.commodityNumber)) { value = false;
     * } else if (!this.commodityNumber.equalsIgnoreCase(
     * other.commodityNumber)) { value = false; }
     * 
     * // Rating Note if (ContractUtility.isEmpty(this.ratingNoteCode)) { if
     * (!ContractUtility.isEmpty(other.ratingNoteCode)) { value = false; } }
     * else if (ContractUtility.isEmpty(other.ratingNoteCode)) { value = false;
     * } else if (!this.ratingNoteCode.equalsIgnoreCase( other.ratingNoteCode))
     * { value = false; }
     * 
     * // ULD Type if (ContractUtility.isEmpty(this.uldTypeCode)) { if
     * (!ContractUtility.isEmpty(other.uldTypeCode)) { value = false; } } else
     * if (ContractUtility.isEmpty(other.uldTypeCode)) { value = false; } else
     * if (!this.uldTypeCode.equalsIgnoreCase( other.uldTypeCode)) { value =
     * false; }
     * 
     * // ULD Charge Type if (this.uldChargeCode != other.uldChargeCode) { value
     * = false; }
     * 
     * // Currency Code if (ContractUtility.isEmpty(this.currencyCode)) { if
     * (!ContractUtility.isEmpty(other.currencyCode)) { value = false; } } else
     * if (ContractUtility.isEmpty(other.currencyCode)) { value = false; } else
     * if (!this.currencyCode.equalsIgnoreCase( other.currencyCode)) { value =
     * false; }
     * 
     * } return value; }
     */
    /**
     * Attribute to hold <code>specialRatePrice</code> property.
     */
    private SpecialRatePrice specialRatePrice;

    /**
     * Attribute to hold <code>uldChargeCode</code> property.
     */
    private ULDChargeType uldChargeCode;

    /**
     * Attribute to hold <code>uldTotalRate</code> property.
     */
    private BigDecimal uldTotalRate;

    /**
     * Attribute to hold <code>uldTypeCode</code> property.
     */
    private String uldTypeCode;

    /**
     * Attribute to hold <code>useGrossWeightIndicator</code> property.
     */
    private boolean useGrossWeightIndicator;

    /**
     * Attribute to hold <code>weightUnit</code> property.
     */
    private WeightUOMType weightUnit;

    /**
     * Attribute to hold <code>percentReductionInd</code> property.
     */
    private boolean percentReductionInd;
	/**
     * Gets the <code>allInSraPricingIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>allInSraPricingIndicator</code> property.
     */
    public boolean getAllInSraPricingIndicator() {
        return allInSraPricingIndicator;
    }

    /**
     * Gets the <code>amount</code> property.
     * <p>
     * 
     * @return the current value of the <code>amount</code> property.
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Gets the <code>applicableMinimumRate</code> property.
     * <p>
     * 
     * @return the current value of the <code>applicableMinimumRate</code> property.
     */
    public BigDecimal getApplicableMinimumRate() {
        return this.applicableMinimumRate;
    }

    /**
     * Gets the <code>carrier</code> property.
     * <p>
     * 
     * @return the current value of the <code>carrier</code> property.
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Gets the <code>chargeableWeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>chargeableWeight</code> property.
     */
    public BigDecimal getChargeableWeight() {
        return chargeableWeight;
    }

    /**
     * Gets the <code>classRatePrice</code> property.
     * <p>
     * 
     * @return the current value of the <code>classRatePrice</code> property.
     */
    public ClassRatePrice getClassRatePrice() {
        return this.classRatePrice;
    }

    /**
     * Gets the <code>commodityNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>commodityNumber</code> property.
     */
    public String getCommodityNumber() {
        return commodityNumber;
    }

    /**
     * Gets the <code>currencyCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>currencyCode</code> property.
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Gets the <code>currencyConversionLine</code> property.
     * <p>
     * 
     * @return the current value of the <code>currencyConversionLine</code> property.
     */
    public String getCurrencyConversionLine() {
        return currencyConversionLine;
    }

    /**
     * Gets the <code>destinationDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>destinationDto</code> property.
     */
    public GeographicDataDto getDestinationDto() {
        return this.destinationDto;
    }

    /**
     * Gets the <code>discontinueDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>discontinueDate</code> property.
     */
    public Date getDiscontinueDate() {
        return ContractUtility.getClonedDate(this.discontinueDate);
    }

    /**
     * Gets the <code>flightNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>flightNumber</code> property.
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Gets the <code>grossWeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>grossWeight</code> property.
     */
    public BigDecimal getGrossWeight() {
        return this.grossWeight;
    }

    /**
     * Gets the <code>jointRatePriceDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>jointRatePriceDto</code> property.
     */
    public JointRatePriceDto getJointRatePriceDto() {
        return this.jointRatePriceDto;
    }

    /**
     * Gets the <code>kPriceDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>kPriceDto</code> property.
     */
    public KPriceDto getKPriceDto() {
        return this.kPriceDto;
    }

    /**
     * Gets the <code>minimumWeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>minimumWeight</code> property.
     */
    public BigDecimal getMinimumWeight() {
        return minimumWeight;
    }

    /**
     * Gets the <code>originDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>originDto</code> property.
     */
    public GeographicDataDto getOriginDto() {
        return this.originDto;
    }

    /**
     * Gets the <code>overPivotRate</code> property.
     * <p>
     * 
     * @return the current value of the <code>overPivotRate</code> property.
     */
    public BigDecimal getOverPivotRate() {
        return overPivotRate;
    }

    /**
     * Gets the <code>overPivotRateCharge</code> property.
     * <p>
     * 
     * @return the current value of the <code>overPivotRateCharge</code> property.
     */
    public BigDecimal getOverPivotRateCharge() {
        return this.overPivotRateCharge;
    }

    /**
     * Gets the <code>pivotWeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>pivotWeight</code> property.
     */
    public BigDecimal getPivotWeight() {
        return pivotWeight;
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
     * Gets the <code>rateClassCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>rateClassCode</code> property.
     */
    public RateClassType getRateClassCode() {
        return rateClassCode;
    }

    /**
     * Gets the <code>rateIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>rateIndicator</code> property.
     */
    public RateIndicatorType getRateIndicator() {
        return rateIndicator;
    }

    /**
     * Gets the <code>rateSourceCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>rateSourceCode</code> property.
     */
    public String getRateSourceCode() {
        return rateSourceCode;
    }
    
    /**
     * Gets the <code>rateSourceHierarchy</code> property.
     * <p>
     * 
     * @return the current value of the <code>rateSourceHierarchy</code> property.
     */
    public int getRateSourceHierarchy() {
        return this.rateSourceHierarchy;
    }

    /*
     * public SelectionPriceDto getSelectionPriceDto() { return
     * this.selectionPriceDto; }
     */

    /**
     * Gets the <code>rateTotalCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>rateTotalCharges</code> property.
     */
    public BigDecimal getRateTotalCharges() {
        return rateTotalCharges;
    }

    /**
     * Gets the <code>rateTypeCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>rateTypeCode</code> property.
     */
    public String getRateTypeCode() {
        return rateTypeCode;
    }

    /**
     * Gets the <code>rateTypePercentagePrice</code> property.
     * <p>
     * 
     * @return the current value of the <code>rateTypePercentagePrice</code> property.
     */
    public RateTypePercentagePrice getRateTypePercentagePrice() {
        return this.rateTypePercentagePrice;
    }

    /**
     * Gets the <code>rateTypePriority</code> property.
     * <p>
     * Rate Type Priority with which rates for this rate type must be initially displayed.
     * <p>
     * <b>Range: </b><br>
     * 0-999<br>
     * <p>
     * 
     * @return the current value of <code>rateTypePriority</code> property.<br>
     */
    public Integer getRateTypePriority() {
        return this.rateTypePriority;
    }

    /**
     * Gets the <code>rateValidityHierarchy</code> property.
     * <p>
     * Rate Validity Hierarchy with which rates for this rate type must be initially displayed.
     * 
     * @return the current value of <code>rateValidityHierarchy</code> property.<br>
     */
    public int getRateValidityHierarchy() {
        return rateValidityHierarchy;
    }

    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.rating.dto.ValidityTimeDto
     * ValidityTimeDto} containing <code>ValidityTimeDto</code> details.
     * <p>
     * 
     * @return the current value of <code>ValidityTimeDto</code> details.
     */
    public List<ValidityTimeDto> getRateValidityTimeDtos() {
        if (this.rateValidityTimeDtos == null) {
            this.rateValidityTimeDtos = new ArrayList<ValidityTimeDto>();
        }
        return this.rateValidityTimeDtos;
    }

    /**
     * Gets the <code>ratingConventionType</code> property.
     * <p>
     * 
     * @return the current value of the <code>ratingConventionType</code> property.
     */
    public RatingConventionType getRatingConventionType() {
        return ratingConventionType;
    }

    /*
     * @Override public int hashCode() { int result = 1; return result; }
     */

    /**
     * Gets the <code>ratingNoteCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>ratingNoteCode</code> property.
     */
    public String getRatingNoteCode() {
        return ratingNoteCode;
    }

    /**
     * Gets the <code>ratingNoteDesc</code> property.
     * <p>
     * 
     * @return the current value of the <code>ratingNoteDesc</code> property.
     */
    public String getRatingNoteDesc() {
        return this.ratingNoteDesc;
    }

    /**
     * Gets the <code>ratingNoteDescription</code> property.
     * <p>
     * 
     * @return the current value of the <code>ratingNoteDescription</code> property.
     */
    public String getRatingNoteDescription() {
        return this.ratingNoteDescription;
    }

    /**
     * Gets the <code>ratingType</code> property.
     * <p>
     * 
     * @return the current value of the <code>ratingType</code> property.
     */
    public RatingType getRatingType() {
        return this.ratingType;
    }

    /**
     * Gets the <code>selectIdentifierType</code> property.
     * <p>
     * 
     * @return the current value of the <code>selectIdentifierType</code> property.
     */
    public SelectIdentifierType getSelectIdentifierType() {
        return this.selectIdentifierType;
    }

    /**
     * Gets the <code>sequenceNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>sequenceNumber</code> property.
     */
    public int getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Gets the <code>specialRatePrice</code> property.
     * <p>
     * 
     * @return the current value of the <code>specialRatePrice</code> property.
     */
    public SpecialRatePrice getSpecialRatePrice() {
        /*
         * if (this.specialRatePrice == null) { this.specialRatePrice = new
         * SpecialRatePrice(); }
         */
        return this.specialRatePrice;
    }

    /**
     * Gets the <code>uldChargeCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>uldChargeCode</code> property.
     */
    public ULDChargeType getUldChargeCode() {
        return uldChargeCode;
    }

    /**
     * Gets the <code>uldTotalRate</code> property.
     * <p>
     * 
     * @return the current value of the <code>uldTotalRate</code> property.
     */
    public BigDecimal getUldTotalRate() {
        return this.uldTotalRate;
    }

    /**
     * Gets the <code>uldTypeCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>uldTypeCode</code> property.
     */
    public String getUldTypeCode() {
        return uldTypeCode;
    }

    /**
     * Gets the <code>useGrossWeightIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>useGrossWeightIndicator</code> property.
     */
    public boolean getUseGrossWeightIndicator() {
        return this.useGrossWeightIndicator;
    }

    /**
     * Gets the <code>weightUnit</code> property.
     * <p>
     * 
     * @return the current value of the <code>weightUnit</code> property.
     */
    public WeightUOMType getWeightUnit() {
        return this.weightUnit;
    }

    /**
     * Gets the <code>flightSpecificRateInd</code> property.
     * <p>
     * 
     * @return the current value of the <code>flightSpecificRateInd</code> property.
     */
    public boolean isFlightSpecificRateInd() {
        return this.flightSpecificRateInd;
    }

    /**
     * Gets the <code>originCurrencyInd</code> property.
     * <p>
     * 
     * @return the current value of the <code>originCurrencyInd</code> property.
     */
    public boolean isOriginCurrencyInd() {
        return this.originCurrencyInd;
    }

    /**
     * Gets the <code>pendingGovernmentAppInd</code> property.
     * <p>
     * 
     * @return the current value of the <code>pendingGovernmentAppInd</code> property.
     */
    public boolean isPendingGovernmentAppInd() {
        return this.pendingGovernmentAppInd;
    }

    /**
     * Gets the <code>publishedRateInd</code> property.
     * <p>
     * 
     * @return the current value of the <code>publishedRateInd</code> property.
     */
    public boolean isPublishedRateInd() {
        return this.publishedRateInd;
    }
    /**
     * Gets the <code>percentReductionInd</code> property.
     * <p>
     * 
     * @return the current value of the <code>percentReductionInd</code> property.
     */
    public boolean isPercentReductionInd() {
		return percentReductionInd;
	}

    /**
     * Sets the <code>percentReductionInd</code> property.
     * <p>
     * 
     * @param pPercentReductionInd
     *            the current value of the <code>percentReductionInd</code> property.<br>
     */
	public void setPercentReductionInd(boolean pPercentReductionInd) {
		this.percentReductionInd = pPercentReductionInd;
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

    /**
     * Sets the <code>amount</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>amount</code> property.<br>
     */
    public void setAmount(final BigDecimal pAmount) {
        this.amount = pAmount;
    }

    /**
     * Sets the <code>applicableMinimumRate</code> property.
     * <p>
     * 
     * @param pApplicableMinimumRate
     *            the current value of the <code>applicableMinimumRate</code> property.<br>
     */
    public void setApplicableMinimumRate(final BigDecimal pApplicableMinimumRate) {
        this.applicableMinimumRate = pApplicableMinimumRate;
    }

    /**
     * Sets the <code>carrier</code> property.
     * <p>
     * 
     * @param pCarrierCode
     *            the current value of the <code>carrier</code> property.<br>
     */
    public void setCarrier(final String pCarrierCode) {
        this.carrier = pCarrierCode;
    }

    /**
     * Sets the <code>chargeableWeight</code> property.
     * <p>
     * 
     * @param pChargeableWeight
     *            the current value of the <code>chargeableWeight</code> property.<br>
     */
    public void setChargeableWeight(final BigDecimal pChargeableWeight) {
        this.chargeableWeight = pChargeableWeight;
    }

    /**
     * Sets the <code>classRatePrice</code> property.
     * <p>
     * 
     * @param pClassRatePrice
     *            the current value of the <code>classRatePrice</code> property.<br>
     */
    public void setClassRatePrice(final ClassRatePrice pClassRatePrice) {
        this.classRatePrice = pClassRatePrice;
    }

    /**
     * Sets the <code>commodityNumber</code> property.
     * <p>
     * 
     * @param pCommodityNumber
     *            the current value of the <code>commodityNumber</code> property.<br>
     */
    public void setCommodityNumber(final String pCommodityNumber) {
        this.commodityNumber = pCommodityNumber;
    }

    /**
     * Sets the <code>currencyCode</code> property.
     * <p>
     * 
     * @param pCurrencyCode
     *            the current value of the <code>currencyCode</code> property.<br>
     */
    public void setCurrencyCode(final String pCurrencyCode) {
        this.currencyCode = pCurrencyCode;
    }

    /**
     * Sets the <code>currencyConversionLine</code> property.
     * <p>
     * 
     * @param pCurrencyConversionLine
     *            the current value of the <code>currencyConversionLine</code> property.<br>
     */
    public void setCurrencyConversionLine(final String pCurrencyConversionLine) {
        this.currencyConversionLine = pCurrencyConversionLine;
    }

    /**
     * Sets the <code>destinationDto</code> property.
     * <p>
     * 
     * @param pDestinationDto
     *            the current value of the <code>destinationDto</code> property.<br>
     */
    public void setDestinationDto(final GeographicDataDto pDestinationDto) {
        this.destinationDto = pDestinationDto;
    }

    /**
     * Sets the <code>discontinueDate</code> property.
     * <p>
     * 
     * @param pDiscontinueDate
     *            the current value of the <code>discontinueDate</code> property.<br>
     */
    public void setDiscontinueDate(final Date pDiscontinueDate) {
        this.discontinueDate = ContractUtility.getClonedDate(pDiscontinueDate);
    }

    /**
     * Sets the <code>flightNumber</code> property.
     * <p>
     * 
     * @param pFlightNumber
     *            the current value of the <code>flightNumber</code> property.<br>
     */
    public void setFlightNumber(final String pFlightNumber) {
        this.flightNumber = pFlightNumber;
    }

    /**
     * Sets the <code>flightSpecificRateInd</code> property.
     * <p>
     * 
     * @param pFlightSpecificRateInd
     *            the current value of the <code>flightSpecificRateInd</code> property.<br>
     */
    public void setFlightSpecificRateInd(final boolean pFlightSpecificRateInd) {
        this.flightSpecificRateInd = pFlightSpecificRateInd;
    }

    /**
     * Sets the <code>grossWeight</code> property.
     * <p>
     * 
     * @param pGrossWeight
     *            the current value of the <code>grossWeight</code> property.<br>
     */
    public void setGrossWeight(final BigDecimal pGrossWeight) {
        this.grossWeight = pGrossWeight;
    }

    /**
     * Sets the <code>jointRatePriceDto</code> property.
     * <p>
     * 
     * @param pJointRatePriceDto
     *            the current value of the <code>jointRatePriceDto</code> property.<br>
     */
    public void setJointRatePriceDto(final JointRatePriceDto pJointRatePriceDto) {
        this.jointRatePriceDto = pJointRatePriceDto;
    }

    /**
     * Sets the <code>kPriceDto</code> property.
     * <p>
     * 
     * @param pKPriceDto
     *            the current value of the <code>kPriceDto</code> property.<br>
     */
    public void setKPriceDto(final KPriceDto pKPriceDto) {
        this.kPriceDto = pKPriceDto;
    }

    /**
     * Sets the <code>minimumWeight</code> property.
     * <p>
     * 
     * @param pMinimumWeight
     *            the current value of the <code>minimumWeight</code> property.<br>
     */
    public void setMinimumWeight(final BigDecimal pMinimumWeight) {
        this.minimumWeight = pMinimumWeight;
    }

    /**
     * Sets the <code>originCurrencyInd</code> property.
     * <p>
     * 
     * @param pOriginCurrencyInd
     *            the current value of the <code>originCurrencyInd</code> property.<br>
     */
    public void setOriginCurrencyInd(boolean pOriginCurrencyInd) {
        this.originCurrencyInd = pOriginCurrencyInd;
    }

    /**
     * Sets the <code>originDto</code> property.
     * <p>
     * 
     * @param pOriginDto
     *            the current value of the <code>originDto</code> property.<br>
     */
    public void setOriginDto(final GeographicDataDto pOriginDto) {
        this.originDto = pOriginDto;
    }

    /**
     * Sets the <code>overPivotRate</code> property.
     * <p>
     * 
     * @param pOverPivotRate
     *            the current value of the <code>overPivotRate</code> property.<br>
     */
    public void setOverPivotRate(final BigDecimal pOverPivotRate) {
        this.overPivotRate = pOverPivotRate;
    }

    /**
     * Sets the <code>overPivotRateCharge</code> property.
     * <p>
     * 
     * @param pOverPivotRateCharge
     *            the current value of the <code>overPivotRateCharge</code> property.<br>
     */
    public void setOverPivotRateCharge(final BigDecimal pOverPivotRateCharge) {
        this.overPivotRateCharge = pOverPivotRateCharge;
    }

    /*
     * public void setSelectionPriceDto(SelectionPriceDto pSelectionPriceDto) {
     * this.selectionPriceDto = pSelectionPriceDto; }
     */
    /**
     * Sets the <code>pendingGovernmentAppInd</code> property.
     * <p>
     * 
     * @param pPendingGovernmentAppInd
     *            the current value of the <code>pendingGovernmentAppInd</code> property.<br>
     */
    public void setPendingGovernmentAppInd(
                final boolean pPendingGovernmentAppInd) {
        this.pendingGovernmentAppInd = pPendingGovernmentAppInd;
    }

    /**
     * Sets the <code>pivotWeight</code> property.
     * <p>
     * 
     * @param pPivotWeight
     *            the current value of the <code>pivotWeight</code> property.<br>
     */
    public void setPivotWeight(final BigDecimal pPivotWeight) {
        this.pivotWeight = pPivotWeight;
    }

    /**
     * Sets the <code>publishedRateInd</code> property.
     * <p>
     * 
     * @param pPublishedRateInd
     *            the current value of the <code>publishedRateInd</code> property.<br>
     */
    public void setPublishedRateInd(final boolean pPublishedRateInd) {
        this.publishedRateInd = pPublishedRateInd;
    }

    /**
     * Sets the <code>rateCharge</code> property.
     * <p>
     * 
     * @param pRateCharge
     *            the current value of the <code>rateCharge</code> property.<br>
     */
    public void setRateCharge(final BigDecimal pRateCharge) {
        this.rateCharge = pRateCharge;
    }

    /**
     * Sets the <code>rateClassCode</code> property.
     * <p>
     * 
     * @param pRateClassCode
     *            the current value of the <code>rateClassCode</code> property.<br>
     */
    public void setRateClassCode(final RateClassType pRateClassCode) {
        this.rateClassCode = pRateClassCode;
    }

    /**
     * Sets the <code>rateIndicator</code> property.
     * <p>
     * 
     * @param pRateIndicator
     *            the current value of the <code>rateIndicator</code> property.<br>
     */
    public void setRateIndicator(final RateIndicatorType pRateIndicator) {
        this.rateIndicator = pRateIndicator;
    }

    /**
     * Sets the <code>rateSourceCode</code> property.
     * <p>
     * 
     * @param pRateSourceCode
     *            the current value of the <code>rateSourceCode</code> property.<br>
     */
    public void setRateSourceCode(final String pRateSourceCode) {
        this.rateSourceCode = pRateSourceCode;
    }
    
    /**
     * Sets the <code>rateSourceHierarchy</code> property.
     * <p>
     * 
     * @param pRateSourceCode
     *            the current value of the <code>rateSourceHierarchy</code> property.<br>
     */
    public void setRateSourceHierarchy(int pRateSourceHierarchy) {
        this.rateSourceHierarchy = pRateSourceHierarchy;
    }

    /**
     * Sets the <code>rateTotalCharges</code> property.
     * <p>
     * 
     * @param pRateTotalCharges
     *            the current value of the <code>rateTotalCharges</code> property.<br>
     */
    public void setRateTotalCharges(final BigDecimal pRateTotalCharges) {
        this.rateTotalCharges = pRateTotalCharges;
    }

    /**
     * Sets the <code>rateTypeCode</code> property.
     * <p>
     * 
     * @param pRateTypeCode
     *            the current value of the <code>rateTypeCode</code> property.<br>
     */
    public void setRateTypeCode(final String pRateTypeCode) {
        this.rateTypeCode = pRateTypeCode;
    }

    /**
     * Sets the <code>rateTypePercentagePrice</code> property.
     * <p>
     * 
     * @param pRateTypePercentagePrice
     *            the current value of the <code>rateTypePercentagePrice</code> property.<br>
     */
    public void setRateTypePercentagePrice(
                final RateTypePercentagePrice pRateTypePercentagePrice) {
        this.rateTypePercentagePrice = pRateTypePercentagePrice;
    }

    /**
     * Sets the <code>rateTypePriority</code> property.
     * <p>
     * RateType Priority with which rates for this rate type must be initially displayed.
     * <p>
     * 
     * @param pRateTypePriority
     *            the new value of the <code>rateTypePriority</code> property.
     */
    public void setRateTypePriority(final Integer pRateTypePriority) {
        this.rateTypePriority = pRateTypePriority;
    }

    /**
     * Sets the <code>rateValidityHierarchy</code> property.
     * <p>
     * Rate Validity Hierarchy with which rates for this rate type must be initially displayed.
     * <p>
     * 
     * @param pRateValidityHierarchy
     *            the new value of the <code>rateValidityHierarchy</code> property.
     */
    public void setRateValidityHierarchy(int pRateValidityHierarchy) {
        this.rateValidityHierarchy = pRateValidityHierarchy;
    }

    /**
     * Sets the list of {@link com.unisys.trans.logistics.lms.rating.dto.ValidityTimeDto
     * ValidityTimeDto} containing <code>ValidityTimeDto</code> details.
     * <p>
     * 
     * @param pRateValidityTimeDtos
     *            the current value of the <code>rateValidityTimeDtos</code> property.
     */
    public void setRateValidityTimeDtos(
                final List<ValidityTimeDto> pRateValidityTimeDtos) {
        this.rateValidityTimeDtos = pRateValidityTimeDtos;
    }

    /**
     * Sets the <code>ratingConventionType</code> property.
     * <p>
     * 
     * @param pRatingConventionType
     *            the current value of the <code>ratingConventionType</code> property.<br>
     */
    public void setRatingConventionType(
                final RatingConventionType pRatingConventionType) {
        this.ratingConventionType = pRatingConventionType;
    }

    /**
     * Sets the <code>ratingNoteCode</code> property.
     * <p>
     * 
     * @param pRatingNoteCode
     *            the current value of the <code>ratingNoteCode</code> property.<br>
     */
    public void setRatingNoteCode(final String pRatingNoteCode) {
        this.ratingNoteCode = pRatingNoteCode;
    }

    /**
     * Sets the <code>ratingNoteDesc</code> property.
     * <p>
     * 
     * @param pRatingNoteDesc
     *            the current value of the <code>ratingNoteDesc</code> property.<br>
     */
    public void setRatingNoteDesc(final String pRatingNoteDesc) {
        this.ratingNoteDesc = pRatingNoteDesc;
    }

    /**
     * Sets the <code>ratingNoteDescription</code> property.
     * <p>
     * 
     * @param pRatingNoteDescription
     *            the current value of the <code>ratingNoteDescription</code> property.<br>
     */
    public void setRatingNoteDescription(final String pRatingNoteDescription) {
        this.ratingNoteDescription = pRatingNoteDescription;
    }

    /**
     * Sets the <code>ratingType</code> property.
     * <p>
     * 
     * @param pRatingType
     *            the current value of the <code>ratingType</code> property.<br>
     */
    public void setRatingType(final RatingType pRatingType) {
        this.ratingType = pRatingType;
    }

    /**
     * Sets the <code>selectIdentifierType</code> property.
     * <p>
     * 
     * @param pSelectIdentifierType
     *            the current value of the <code>selectIdentifierType</code> property.<br>
     */
    public void setSelectIdentifierType(
                final SelectIdentifierType pSelectIdentifierType) {
        this.selectIdentifierType = pSelectIdentifierType;
    }

    /**
     * Sets the <code>sequenceNumber</code> property.
     * <p>
     * 
     * @param pSequenceNumber
     *            the current value of the <code>sequenceNumber</code> property.<br>
     */
    public void setSequenceNumber(final int pSequenceNumber) {
        this.sequenceNumber = pSequenceNumber;
    }

    /**
     * Sets the <code>specialRatePrice</code> property.
     * <p>
     * 
     * @param pSpecialRatePrice
     *            the current value of the <code>specialRatePrice</code> property.<br>
     */
    public void setSpecialRatePrice(final SpecialRatePrice pSpecialRatePrice) {
        this.specialRatePrice = pSpecialRatePrice;
    }

    /**
     * Sets the <code>uldChargeCode</code> property.
     * <p>
     * 
     * @param pUldChargeCode
     *            the current value of the <code>uldChargeCode</code> property.<br>
     */
    public void setUldChargeCode(final ULDChargeType pUldChargeCode) {
        this.uldChargeCode = pUldChargeCode;
    }

    /**
     * Sets the <code>uldTotalRate</code> property.
     * <p>
     * 
     * @param pUldTotalRate
     *            the current value of the <code>uldTotalRate</code> property.<br>
     */
    public void setUldTotalRate(final BigDecimal pUldTotalRate) {
        this.uldTotalRate = pUldTotalRate;
    }

    /**
     * Sets the <code>uldTypeCode</code> property.
     * <p>
     * 
     * @param pUldTypeCode
     *            the current value of the <code>uldTypeCode</code> property.<br>
     */
    public void setUldTypeCode(final String pUldTypeCode) {
        this.uldTypeCode = pUldTypeCode;
    }

    /**
     * Sets the <code>useGrossWeightIndicator</code> property.
     * <p>
     * 
     * @param pUseGrossWeightIndicator
     *            the current value of the <code>useGrossWeightIndicator</code> property.<br>
     */
    public void setUseGrossWeightIndicator(
                final boolean pUseGrossWeightIndicator) {
        this.useGrossWeightIndicator = pUseGrossWeightIndicator;
    }

    /**
     * Sets the <code>weightUnit</code> property.
     * <p>
     * 
     * @param pWeightUnit
     *            the current value of the <code>weightUnit</code> property.<br>
     */
    public void setWeightUnit(final WeightUOMType pWeightUnit) {
        this.weightUnit = pWeightUnit;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Price [carrier=" + carrier + ", amount=" + amount
                    + ", publishedRateInd=" + publishedRateInd
                    + ", chargeableWeight=" + chargeableWeight
                    + ", commodityNumber=" + commodityNumber + ", currencyCode="
                    + currencyCode + ", currencyConversionLine="
                    + currencyConversionLine + ", flightNumber=" + flightNumber
                    + ", minimumWeight=" + minimumWeight + ", overPivotRate="
                    + overPivotRate + ", pendingGovernmentAppInd="
                    + pendingGovernmentAppInd + ", pivotWeight=" + pivotWeight
                    + ", rateClassCode=" + rateClassCode + ", rateIndicator="
                    + rateIndicator + ", rateSourceCode=" + rateSourceCode
                    + ", rateTotalCharges=" + rateTotalCharges + ", ratingType="
                    + ratingType + ", useGrossWeightIndicator="
                    + useGrossWeightIndicator + ", rateTypeCode=" + rateTypeCode
                    + ", rateValidityHierarchy" + rateValidityHierarchy
                    + ", ratingConventionType=" + ratingConventionType
                    + ", ratingNoteCode=" + ratingNoteCode + ", sequenceNumber="
                    + sequenceNumber + ", uldChargeCode=" + uldChargeCode
                    + ", uldTypeCode=" + uldTypeCode + ", weightUnit=" + weightUnit
                    + "]" + "\n";
    }
}
