/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.rating.dto.constants.ContractDefinitionType;
import com.unisys.trans.logistics.lms.rating.dto.constants.RatingConventionType;
import com.unisys.trans.logistics.lms.rating.dto.constants.ULDChargeType;
import com.unisys.trans.logistics.lms.utils.dto.constants.RateClassType;

/**
 * <code>ContractRateEntryDto</code> contain details of Contract.
 * <p>
 * This contains all information about Contract.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>allCommodity
 * <li>allMinimumWeight
 * <li>allUldType
 * <li>classRatingId
 * <li>commodityNumber
 * <li>commodityType
 * <li>contractDefinition
 * <li>minimumShipmentSize
 * <li>minimumWeight
 * <li>pivotWeight
 * <li>rateAdjustment
 * <li>rateClass
 * <li>rateSource
 * <li>rateType
 * <li>ratingWeightUnitType
 * <li>uLDChargeCode
 * <li>rateConstructionInd
 * <li>routeCompressionInd
 * <li>uLDType
 * <li>oId
 * </ul>
 */
public class ContractRateEntryDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -5914146080166201598L;

    /**
     * Attribute to hold <code>allCommodity</code> property.
     */
    private boolean allCommodity;

    /**
     * Attribute to hold <code>allMinimumWeight</code> property.
     */
    private boolean allMinimumWeight;

    /**
     * Attribute to hold <code>allUldType</code> property.
     */
    private boolean allUldType;

    /**
     * Attribute to hold <code>overPivotBRate</code> property.
     */
    private BigDecimal brate;

    /**
     * Attribute to hold <code>classRatingId</code> property.
     */
    private String classRatingId;

    /**
     * Attribute to hold <code>commodityNumber</code> property.
     */
    private String commodityNumber;

    /**
     * Attribute to hold <code>commodityType</code> property.
     */
    private RatingConventionType commodityType;

    /**
     * Attribute to hold <code>contractDefinition</code> property.
     */
    private ContractDefinitionType contractDefinition;

    /**
     * Attribute to hold <code>error</code> property.
     */
    private boolean error;

    /**
     * Attribute to hold <code>minimumShipmentSize</code> property.
     */
    private BigDecimal minimumShipmentSize;

    /**
     * Attribute to hold <code>minimumShipmentSize</code> property.
     */
    private BigDecimal maximumShipmentSize;

    /**
     * Attribute to hold <code>minimumWeight</code> property.
     */
    private BigDecimal minimumWeight;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>overPivotRate</code> property.
     */
    private BigDecimal overPivotRate;

    /**
     * Attribute to hold <code>pivotWeight</code> property.
     */
    private BigDecimal pivotWeight;

    /**
     * Attribute to hold <code>rate</code> property.
     */
    private BigDecimal rate;

    /**
     * Attribute to hold <code>rateAdjustment</code> property.
     */
    private BigDecimal rateAdjustment;

    /**
     * Attribute to hold <code>rateClass</code> property.
     */
    private RateClassType rateClass;

    /**
     * Attribute to hold <code>rateSource</code> property.
     */
    private String rateSource;

    /**
     * Attribute to hold <code>rateType</code> property.
     */
    private String rateType;

    /**
     * Attribute to hold <code>ratingWeightUnitType</code> property.
     */
    private WeightUOMType ratingWeightUnitType;

    /**
     * Attribute to hold <code>uLDChargeCode</code> property.
     */
    private ULDChargeType uldChargeCode;

    /**
     * Attribute to hold <code>uLDType</code> property.
     */
    private String uldType;
    
    
    /**
     * This method validates whether the given <code>String</code> is empty or not.
     * <p>
     * <b>Possible values</b>:
     * <ul>
     * <li><code>true</code><br>
     * <ul>
     * <li>If the object is null.
     * <li>If the object is not null and the length is '0' when the string is trimmed.
     * </ul>
     * <li><code>false</code><br>
     * <li>If the object is not null and the length is not '0' when the string is trimmed.
     * </ul>
     * <p>
     * 
     * @param ptext
     *            holds the String object.
     *            <p>
     * @return <code>true</code> - if the given input string is <code>empty</code>.
     */
    private static boolean isEmpty(final String ptext) {
        return ptext == null || ptext.trim().isEmpty();
    }

    /**
     * Gets the <code>ContractRateEntry</code> property.
     * <p>
     * <b>Format: </b><br>
     * boolean
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @param pObj the new value of the <code>object</code> property.
     * @return the current value of the <code>ContractRateEntry</code> property.
     */
    @Override
    public boolean equals(final Object pObj) {
        boolean isEqual = true;
        if (this == pObj) {
            isEqual = true;
        }
        else if (pObj == null) {
            isEqual = false;
        }
        else if (!(pObj instanceof ContractRateEntryDto)) {
            isEqual = false;
        }
        else {
            final ContractRateEntryDto other = (ContractRateEntryDto) pObj;
            if (allCommodity != other.getAllCommodity()) {
                isEqual = false;
            }
            else if (allMinimumWeight != other.getAllMinimumWeight()) {
                isEqual = false;
            }
            else if (allUldType != other.getAllUldType()) {
                isEqual = false;
            }
            else if (isEmpty(commodityNumber) && !isEmpty(other.getCommodityNumber())) {
                isEqual = false;
            }
            else if (!isEmpty(commodityNumber) && !commodityNumber.equals(other.getCommodityNumber())) {
                isEqual = false;
            }
            else if (isEmpty(classRatingId) && !isEmpty(other.getClassRatingId())) {
                isEqual = false;
            }
            else if (!isEmpty(classRatingId) && !classRatingId.equals(other.getClassRatingId())) {
                isEqual = false;
            }
            else if (contractDefinition != other.getContractDefinition()) {
                isEqual = false;
            }
            else if (minimumShipmentSize == null && other.getMinimumShipmentSize() != null) {
                isEqual = false;
            }
            else if (minimumShipmentSize != null
                        && !minimumShipmentSize.equals(other.getMinimumShipmentSize())) {
                isEqual = false;
            }
            else if (maximumShipmentSize == null && other.getMaximumShipmentSize() != null) {
                isEqual = false;
            }
            else if (maximumShipmentSize != null
                        && !maximumShipmentSize.equals(other.getMaximumShipmentSize())) {
                isEqual = false;
            }
            else if (minimumWeight == null && other.getMinimumWeight() != null) {
                isEqual = false;
            }
            else if (minimumWeight != null && !minimumWeight.equals(other.getMinimumWeight())) {
                isEqual = false;
            }
            else if (overPivotRate == null && other.getOverPivotRate() != null) {
                isEqual = false;
            }
            else if (overPivotRate != null && !overPivotRate.equals(other.getOverPivotRate())) {
                isEqual = false;
            }
            else if (pivotWeight == null && other.getPivotWeight() != null) {
                isEqual = false;
            }
            else if (pivotWeight != null && !pivotWeight.equals(other.getPivotWeight())) {
                isEqual = false;
            }
            if (rateAdjustment == null && other.getRateAdjustment() != null) {
                isEqual = false;
            }
            else if (rateAdjustment != null && !rateAdjustment.equals(other.getRateAdjustment())) {
                isEqual = false;
            }
            else if (rate == null && other.getRate() != null) {
                isEqual = false;
            }
            else if (rate != null && !rate.equals(other.getRate())) {
                isEqual = false;
            }
            else if (rateClass != other.getRateClass()) {
                isEqual = false;
            }
            else if (isEmpty(rateSource) && !isEmpty(other.getRateSource())) {
                isEqual = false;
            }
            else if (!isEmpty(rateSource) && !rateSource.equals(other.getRateSource())) {
                isEqual = false;
            }
            else if (isEmpty(rateType) && !isEmpty(other.getRateType())) {
                isEqual = false;
            }
            else if (!isEmpty(rateType) && !rateType.equals(other.getRateType())) {
                isEqual = false;
            }
            else if (ratingWeightUnitType != other.getRatingWeightUnitType()) {
                isEqual = false;
            }
            else if (uldChargeCode != other.getUldChargeCode()) {
                isEqual = false;
            }
            else if (isEmpty(uldType) && !isEmpty(other.getUldType())) {
                isEqual = false;
            }
            else if (!isEmpty(uldType) && !uldType.equals(other.uldType)) {
                isEqual = false;
            }
        }
        return isEqual;
    }

    /**
     * Gets the <code>AllCommodity</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>AllCommodity</code> property.
     */
    public boolean getAllCommodity() {
        return this.allCommodity;
    }

    /**
     * Gets the <code>AllMinimumWeight</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>AllMinimumWeight</code> property.
     */
    public boolean getAllMinimumWeight() {
        return this.allMinimumWeight;
    }

    /**
     * Gets the <code>AllUldType</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>AllUldType</code> property.
     */
    public boolean getAllUldType() {
        return this.allUldType;
    }

    /**
     * Gets the <code>brate</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-7.0-4 Numeric
     * <p>
     * <b>Example: </b><br>
     * 567.3
     * <p>
     * 
     * @return the current value of the <code>brate</code> property.
     */

    public BigDecimal getBrate() {
        return this.brate;
    }

    /**
     * Gets the <code>ClassRatingId</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3-6 Alphanumeric Characters
     * <p>
     * <b>Example: </b><br>
     * HU#@
     * <p>
     * 
     * @return the current value of the <code>ClassRatingId</code> property.
     */
    public String getClassRatingId() {
        return this.classRatingId;
    }

    /**
     * Gets the <code>CommodityNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 6 AlphaNumeric Characters
     * <p>
     * <b>Example: </b><br>
     * Q5674W
     * <p>
     * 
     * @return the current value of the <code>CommodityNumber</code> property.
     */
    public String getCommodityNumber() {
        return this.commodityNumber;
    }

    /**
     * Gets the <code>CommodityType</code> property.
     * <p>
     * Indicator that denotes the RatingConventionType.
     * <p>
     * <li>D - ATPCO
     * <li>I - IATA
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * I<br>
     * <p>
     * 
     * @return the current value of <code>CommodityType</code> property.<br>
     */

    public RatingConventionType getCommodityType() {
        return this.commodityType;
    }

    /**
     * Gets the <code>ContractDefinition</code> property.
     * <p>
     * Indicator that denotes the ContractDefinitionType.
     * <p>
     * <li>PERCENT_REDUCTION-Percent Reduction
     * <li>PRICE_REDUCTION-Price Reduction
     * <li>FIXED_RATE-Fixed Rate
     * <li>FLAT_RATE-Flat Rate
     * <li>
     * <p>
     * <b>Format: </b><br>
     * 17 Z<br>
     * <p>
     * <b>Example: </b><br>
     * PERCENT_REDUCTION<br>
     * <p>
     * 
     * @return the current value of <code>ContractDefinition</code> property.<br>
     */

    public ContractDefinitionType getContractDefinition() {
        return this.contractDefinition;
    }

    /**
     * Gets the <code>MinimumShipmentSize</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric
     * <p>
     * <b>Example: </b><br>
     * 125
     * <p>
     * 
     * @return the current value of the <code>MinimumShipmentSize</code> property.
     */

    public BigDecimal getMinimumShipmentSize() {
        return this.minimumShipmentSize;
    }

    /**
     * Gets the <code>MinimumWeight</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-5.(0-1) Numeric
     * <p>
     * <b>Example: </b><br>
     * 125.0
     * <p>
     * 
     * @return the current value of the <code>MinimumWeight</code> property.
     */

    public BigDecimal getMinimumWeight() {
        return this.minimumWeight;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>OverPivotRate</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-7.0-4 Numeric
     * <p>
     * <b>Example: </b><br>
     * 567.3
     * <p>
     * 
     * @return the current value of the <code>overPivotRate</code> property.
     */

    public BigDecimal getOverPivotRate() {
        return this.overPivotRate;
    }

    /**
     * Gets the <code>PivotWeight</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric
     * <p>
     * <b>Example: </b><br>
     * 130
     * <p>
     * 
     * @return the current value of the <code>PivotWeight</code> property.
     */
    public BigDecimal getPivotWeight() {
        return this.pivotWeight;
    }

    /**
     * Gets the <code>Rate</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-9.0.4 Numeric
     * <p>
     * <b>Example: </b><br>
     * 130
     * <p>
     * 
     * @return the current value of the <code>Rate</code> property.
     */

    public BigDecimal getRate() {
        return this.rate;
    }

    /**
     * Gets the <code>RateAdjustment</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-9.0.4 Numeric
     * <p>
     * <b>Example: </b><br>
     * 130
     * <p>
     * 
     * @return the current value of the <code>RateAdjustment</code> property.
     */

    public BigDecimal getRateAdjustment() {
        return this.rateAdjustment;
    }

    /**
     * Gets the <code>RateClass</code> property.
     * <p>
     * Indicator that denotes the RateClassType.
     * <p>
     * <li>B-European Basic Charge
     * <li>C-Specific Commodity Rate
     * <li>E-Unit load device over pivot rate
     * <li>K-European Per Kilo Rate
     * <li>M-Minimum Charge
     * <li>N- Normal under 45 kgs (100 lbs)
     * <li>Q-Quantity over 45 kgs (100 lbs)
     * <li>R-Rate Reduction
     * <li>S-Rate Surcharge
     * <li>T- Charter Rate.
     * <li>U-Unit load device basic charge.
     * <li>X-ULD tare weight.
     * <li>Y- ULD Discount.
     * <p>
     * <b>Format: </b><br>
     * 17 Z<br>
     * <p>
     * <b>Example: </b><br>
     * R<br>
     * <p>
     * 
     * @return the current value of <code>RateClass</code> property.<br>
     */

    public RateClassType getRateClass() {
        return this.rateClass;
    }

    /**
     * Gets the <code>RateSource</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 ALPHABETS
     * <p>
     * <b>Example: </b><br>
     * TYR
     * <p>
     * 
     * @return the current value of the <code>RateSource</code> property.
     */

    public String getRateSource() {
        return this.rateSource;
    }

    /**
     * Gets the <code>RateType</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * GEN
     * <p>
     * 
     * @return the current value of the <code>rateType</code> property.
     */

    public String getRateType() {
        return this.rateType;
    }

    /**
     * Gets the <code>RatingWeightUnitType</code> property.
     * <p>
     * <b>Format: </b><br>
     * KG or LB List
     * <p>
     * <b>Example: </b><br>
     * KG
     * <p>
     * 
     * @return the current value of the <code>RatingWeightUnitType</code> property.
     */
    public WeightUOMType getRatingWeightUnitType() {
        return this.ratingWeightUnitType;
    }

    /**
     * Gets the <code>ULDChargeType</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 ALPHABET
     * <p>
     * <b>Example: </b><br>
     * A or B
     * <p>
     * 
     * @return the current value of the <code>uLDChargeCode</code> property.
     */
    public ULDChargeType getUldChargeCode() {
        return this.uldChargeCode;
    }

    /**
     * Gets the <code>uLDType</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-4 AlphaNumeric
     * <p>
     * <b>Example: </b><br>
     * 1S
     * <p>
     * 
     * @return the current value of the <code>uLDType</code> property.
     */
    public String getUldType() {
        return this.uldType;
    }

    /**
     * The<code>hashCode </code> object.
     * <p>
     * 
     * @return <code>int</code> hashCode of super class.
     */
    // SuppressOn:MagicNumber
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (allCommodity ? 1231 : 1237);
        result = prime * result + (allMinimumWeight ? 1231 : 1237);
        result = prime * result + (allUldType ? 1231 : 1237);
        result = prime * result + ((commodityNumber == null) ? 0 : commodityNumber.hashCode());
        result = prime * result + ((contractDefinition == null) ? 0 : contractDefinition.hashCode());
        result = prime * result + ((minimumShipmentSize == null) ? 0 : minimumShipmentSize.hashCode());
        result = prime * result + ((minimumWeight == null) ? 0 : minimumWeight.hashCode());
        result = prime * result + ((overPivotRate == null) ? 0 : overPivotRate.hashCode());
        result = prime * result + ((pivotWeight == null) ? 0 : pivotWeight.hashCode());
        result = prime * result + ((rateAdjustment == null) ? 0 : rateAdjustment.hashCode());
        result = prime * result + ((rateClass == null) ? 0 : rateClass.hashCode());
        result = prime * result + ((rateSource == null) ? 0 : rateSource.hashCode());
        result = prime * result + ((rateType == null) ? 0 : rateType.hashCode());
        result = prime * result + ((ratingWeightUnitType == null) ? 0 : ratingWeightUnitType.hashCode());
        result = prime * result + ((uldChargeCode == null) ? 0 : uldChargeCode.hashCode());
        result = prime * result + ((uldType == null) ? 0 : uldType.hashCode());
        return result;
    }

    /**
     * Gets the <code>error</code> property.
     * <p>
     * 
     * @return the current value of the <code>error</code> property.
     */
    public boolean isError() {
        return this.error;
    }

    // SuppressOff:MagicNumber

    /**
     * Sets the <code>AllCommodity</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pAllCommodity
     *            the current value of the <code>AllCommodity</code> property.
     */
    public void setAllCommodity(final boolean pAllCommodity) {
        this.allCommodity = pAllCommodity;
    }

    /**
     * Sets the <code>AllMinimumWeight</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pAllMinimumWeight
     *            the current value of the <code>AllMinimumWeight</code> property.
     */
    public void setAllMinimumWeight(final boolean pAllMinimumWeight) {
        this.allMinimumWeight = pAllMinimumWeight;
    }

    /**
     * Sets the <code>AllUldType</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pAllUldType
     *            the current value of the <code>AllUldType</code> property.
     */

    public void setAllUldType(final boolean pAllUldType) {
        this.allUldType = pAllUldType;
    }

    /**
     * Sets the <code>brate</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-7.0-4 Numeric
     * <p>
     * <b>Example: </b><br>
     * 567.3
     * <p>
     * 
     * @param pBrate
     *            the current value of the <code>brate</code> property..
     */
    public void setBrate(final BigDecimal pBrate) {
        this.brate = pBrate;
    }

    /**
     * Sets the <code>ClassRatingId</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3-6 Alphanumeric Characters
     * <p>
     * <b>Example: </b><br>
     * HU#@
     * <p>
     * 
     * @param pClassRatingId
     *            the current value of the <code>ClassRatingId</code> property.
     */
    public void setClassRatingId(final String pClassRatingId) {
        this.classRatingId = ContractUtility.convertToUpperCase(pClassRatingId);
    }

    /**
     * Sets the <code>CommodityNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * 6 AlphaNumeric Characters
     * <p>
     * <b>Example: </b><br>
     * Q5674W
     * <p>
     * 
     * @param pCommodityNumber
     *            the current value of the <code>CommodityNumber</code> property.
     */

    public void setCommodityNumber(final String pCommodityNumber) {
        this.commodityNumber = ContractUtility.convertToUpperCase(pCommodityNumber);
    }

    /**
     * Sets the <code>CommodityType</code> property.
     * <p>
     * Indicator that denotes the ContractStatusType.
     * <p>
     * <li>D - ATPCO
     * <li>I - IATA
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * I<br>
     * <p>
     * 
     * @param pCommodityType
     *            <code><@link RatingConventionType></code> the current value of the <code>CommodityType
     *            </code> property.
     */

    public void setCommodityType(final RatingConventionType pCommodityType) {
        this.commodityType = pCommodityType;
    }

    /**
     * Sets the <code>ContractDefinition</code> property.
     * <p>
     * Indicator that denotes the ContractDefinitionType.
     * <p>
     * <li>PERCENT_REDUCTION-Percent Reduction
     * <li>PRICE_REDUCTION-Price Reduction
     * <li>FIXED_RATE-Fixed Rate
     * <li>FLAT_RATE-Flat Rate
     * <li>
     * <p>
     * <b>Format: </b><br>
     * 17 Z<br>
     * <p>
     * <b>Example: </b><br>
     * PERCENT_REDUCTION<br>
     * <p>
     * <p>
     * 
     * @param pContractDefinition
     *            <code>{@link ContractDefinitionType}</code> holds the new value of <code>
     *            ContractDefinitionType</code> type details.
     */

    public void setContractDefinition(
                final ContractDefinitionType pContractDefinition) {
        this.contractDefinition = pContractDefinition;
    }

    /**
     * Sets the <code>error</code> property.
     * <p>
     * 
     * @param pError
     *            holds the new value of <code>
     *            error</code> type details.
     */
    public void setError(final boolean pError) {
        this.error = pError;
    }

    /**
     * Sets the <code>MinimumShipmentSize</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric
     * <p>
     * <b>Example: </b><br>
     * 125
     * <p>
     * 
     * @param pMinimumShipmentSize
     *            the current value of the <code>MinimumShipmentSize</code> property.
     */

    public void setMinimumShipmentSize(final BigDecimal pMinimumShipmentSize) {
        this.minimumShipmentSize = pMinimumShipmentSize;
    }

    /**
     * Sets the <code>MinimumWeight</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-5.(0-1) Numeric
     * <p>
     * <b>Example: </b><br>
     * 125.0
     * <p>
     * 
     * @param pMinimumWeight
     *            the current value of the <code>MinimumWeight</code> property.
     */

    public void setMinimumWeight(final BigDecimal pMinimumWeight) {
        this.minimumWeight = pMinimumWeight;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.
     */

    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>OverPivotRate</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-7.0-4 Numeric
     * <p>
     * <b>Example: </b><br>
     * 567.3
     * <p>
     * 
     * @param pOverPivotRate the current value of the <code>overPivotRate</code> property..
     */
    public void setOverPivotRate(final BigDecimal pOverPivotRate) {
        this.overPivotRate = pOverPivotRate;
    }

    /**
     * Sets the <code>PivotWeight</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric
     * <p>
     * <b>Example: </b><br>
     * 130
     * <p>
     * 
     * @param pPivotWeight
     *            the current value of the <code>PivotWeight</code> property.
     */

    public void setPivotWeight(final BigDecimal pPivotWeight) {
        this.pivotWeight = pPivotWeight;
    }

    /**
     * Sets the <code>Rate</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-9.0.4 Numeric
     * <p>
     * <b>Example: </b><br>
     * 130
     * <p>
     * 
     * @param pRate
     *            the current value of the <code>Rate</code> property.
     */
    public void setRate(final BigDecimal pRate) {
        this.rate = pRate;
    }

    /**
     * Sets the <code>RateAdjustment</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-9.0.4 Numeric
     * <p>
     * <b>Example: </b><br>
     * 130
     * <p>
     * 
     * @param pRateAdjustment
     *            the current value of the <code>RateAdjustment</code> property.
     */
    public void setRateAdjustment(final BigDecimal pRateAdjustment) {
        this.rateAdjustment = pRateAdjustment;
    }

    /**
     * Sets the <code>RateClass</code> property.
     * <p>
     * Indicator that denotes the RateClassType.
     * <p>
     * <li>B-European Basic Charge
     * <li>C-Specific Commodity Rate
     * <li>E-Unit load device over pivot rate
     * <li>K-European Per Kilo Rate
     * <li>M-Minimum Charge
     * <li>N- Normal under 45 kgs (100 lbs)
     * <li>Q-Quantity over 45 kgs (100 lbs)
     * <li>R-Rate Reduction
     * <li>S-Rate Surcharge
     * <li>T- Charter Rate.
     * <li>U-Unit load device basic charge.
     * <li>X-ULD tare weight.
     * <li>Y- ULD Discount.
     * <p>
     * <b>Format: </b><br>
     * 17 Z<br>
     * <p>
     * <b>Example: </b><br>
     * R<br>
     * <p>
     * 
     * @param pRateClass
     *            <code>{@link RateClassType}</code> holds the new value of <code>RateClass</code> type
     *            details.
     */
    public void setRateClass(final RateClassType pRateClass) {
        this.rateClass = pRateClass;
    }

    /**
     * Sets the <code>RateSource</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 ALPHABETS
     * <p>
     * <b>Example: </b><br>
     * TYR
     * <p>
     * 
     * @param pRateSource
     *            the current value of the <code>RateSource</code> property.
     */

    public void setRateSource(final String pRateSource) {
        this.rateSource = ContractUtility.convertToUpperCase(pRateSource);
    }

    /**
     * Sets the <code>RateType</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * GEN
     * <p>
     * 
     * @param pRateType
     *            the current value of the <code>RateType</code> property.
     */

    public void setRateType(final String pRateType) {
        this.rateType = ContractUtility.convertToUpperCase(pRateType);
    }

    /**
     * Sets the <code>RatingWeightUnitType</code> property.
     * <p>
     * <b>Format: </b><br>
     * KG or LB List
     * <p>
     * <b>Example: </b><br>
     * KG
     * <p>
     * 
     * @param pRatingWeightUnitType
     *            <code>{@link WeightUOMType}</code> the current value of the
     *            <code>RatingWeightUnitType</code> property.
     */
    public void setRatingWeightUnitType(
                final WeightUOMType pRatingWeightUnitType) {
        this.ratingWeightUnitType = pRatingWeightUnitType;
    }

    /**
     * Sets the <code>ULDChargeCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 ALPHABET
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @param pUldChargeCode
     *            the current value of the <code>ULDChargeCode</code> property.
     */

    public void setUldChargeCode(final ULDChargeType pUldChargeCode) {
        this.uldChargeCode = pUldChargeCode;
    }

    /**
     * Sets the <code>ULDType</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-4 AlphaNumeric
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @param pUldType
     *            the current value of the <code>ULDType</code> property.
     */

    public void setUldType(final String pUldType) {
        this.uldType = ContractUtility.convertToUpperCase(pUldType);
    }

    /**
     * Gets the <code>MaximumShipmentSize</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric
     * <p>
     * <b>Example: </b><br>
     * 125
     * <p>
     * 
     * @return the current value of the <code>MaximumShipmentSize</code> property.
     */

    public BigDecimal getMaximumShipmentSize() {
        return this.maximumShipmentSize;
    }

    /**
     * Sets the <code>MaximumShipmentSize</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric
     * <p>
     * <b>Example: </b><br>
     * 125
     * <p>
     * 
     * @param pMaximumShipmentSize
     *            the current value of the <code>MaximumShipmentSize</code> property.
     */

    public void setMaximumShipmentSize(final BigDecimal pMaximumShipmentSize) {
        this.maximumShipmentSize = pMaximumShipmentSize;
    }

}
