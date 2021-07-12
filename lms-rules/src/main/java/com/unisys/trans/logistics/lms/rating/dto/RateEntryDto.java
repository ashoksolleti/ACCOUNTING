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
 * <code>RateEntryDto</code> contain details of RateEntryDto.
 * <p>
 * This contains all information about RateEntryDto.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>allCommodity
 * <li>allMinimumWeight
 * <li>allUldType
 * <li>classRatingId
 * <li>commodity
 * <li>minimumShipmentSize
 * <li>minimumWeight
 * <li>oId
 * <li>pivotWeight
 * <li>rate
 * <li>rateAdjustment
 * <li>rateClass
 * <li>rateSource
 * <li>rateType
 * <li>ratingWeightUnitType
 * <li>sraDefinition
 * <li>uldChargeCode
 * <li>uldType
 * </ul>
 */
public class RateEntryDto extends PersistenceObjectDto {

    /**
     * Default serial version id.
     */
    private static final long serialVersionUID = -4858080583386649631L;

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
     * Attribute to hold <code>error</code> property.
     */
    private boolean error;

    /**
     * Attribute to hold <code>minimumShipmentSize</code> property.
     */
    private BigDecimal minimumShipmentSize;

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
     * Attribute to hold <code>sraDefinition</code> property.
     */
    private ContractDefinitionType sraDefinition;

    /**
     * Attribute to hold <code>sraDefinitionString</code> property.
     */
    private String sraDefinitionString;

    /**
     * Attribute to hold <code>uldChargeCode</code> property.
     */
    private ULDChargeType uldChargeCode;

    /**
     * Attribute to hold <code>uldType</code> property.
     */
    private String uldType;

    /**
     * Gets the <code>RateEntry</code> property.
     * <p>
     * <b>Format: </b><br>
     * boolean
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @param pObj the new value of the <code>object</code> property.
     * @return the current value of the <code>RateEntry</code> property.
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
        else if (!(pObj instanceof RateEntryDto)) {
            isEqual = false;
        }
        else {
            final RateEntryDto other = (RateEntryDto) pObj;
            if (sraDefinition != other.getSraDefinition()) {
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

            else if (minimumShipmentSize == null && other.getMinimumShipmentSize() != null) {
                isEqual = false;
            }
            else if (minimumShipmentSize != null
                        && !minimumShipmentSize.equals(other.getMinimumShipmentSize())) {
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
     * Gets the <code>allCommodity</code> property.
     * <p>
     * 
     * @return the current value of the <code>allCommodity</code> property.
     */
    public boolean getAllCommodity() {
        return this.allCommodity;
    }

    /**
     * Gets the <code>allMinimumWeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>allMinimumWeight</code> property.
     */
    public boolean getAllMinimumWeight() {
        return this.allMinimumWeight;
    }

    /**
     * Gets the <code>allUldType</code> property.
     * <p>
     * 
     * @return the current value of the <code>allUldType</code> property.
     */
    public boolean getAllUldType() {
        return this.allUldType;
    }

    /**
     * Gets the <code>classRatingId</code> property.
     * <p>
     * 
     * @return the current value of the <code>classRatingId</code> property.
     */
    public String getClassRatingId() {
        return this.classRatingId;
    }

    /**
     * Gets the <code>commodity</code> property.
     * <p>
     * 
     * @return the current value of the <code>commodity</code> property.
     */
    public String getCommodityNumber() {
        return this.commodityNumber;
    }

    /**
     * Gets the <code>commodityType</code> property.
     * <p>
     * 
     * @return the current value of the <code>commodityType</code> property.
     */
    public RatingConventionType getCommodityType() {
        return this.commodityType;
    }

    /**
     * Gets the <code>error</code> property.
     * <p>
     * 
     * @return the current value of the <code>error</code> property.
     */
    public boolean getError() {
        return this.error;
    }

    /**
     * Gets the <code>minimumShipmentSize</code> property.
     * <p>
     * 
     * @return the current value of the <code>minimumShipmentSize</code> property.
     */
    public BigDecimal getMinimumShipmentSize() {
        return this.minimumShipmentSize;
    }

    /**
     * Gets the <code>minimumWeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>minimumWeight</code> property.
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
     * Gets the <code>overPivotRate</code> property.
     * <p>
     * 
     * @return the current value of the <code>overPivotRate</code> property.
     */
    public BigDecimal getOverPivotRate() {
        return this.overPivotRate;
    }

    /**
     * Gets the <code>pivotWeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>pivotWeight</code> property.
     */

    public BigDecimal getPivotWeight() {
        return this.pivotWeight;
    }

    /**
     * Gets the <code>rate</code> property.
     * <p>
     * 
     * @return the current value of the <code>rate</code> property.
     */
    public BigDecimal getRate() {
        return this.rate;
    }

    /**
     * Gets the <code>rateAdjustment</code> property.
     * <p>
     * 
     * @return the current value of the <code>rateAdjustment</code> property.
     */
    public BigDecimal getRateAdjustment() {
        return this.rateAdjustment;
    }

    /**
     * Gets the <code>rateClass</code> property.
     * <p>
     * 
     * @return the current value of the <code>rateClass</code> property.
     */
    public RateClassType getRateClass() {
        return this.rateClass;
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
     * Gets the <code>ratingWeightUnitType</code> property.
     * <p>
     * 
     * @return the current value of the <code>ratingWeightUnitType</code> property.
     */
    public WeightUOMType getRatingWeightUnitType() {
        return this.ratingWeightUnitType;
    }

    /**
     * Gets the <code>sraDefinition</code> property.
     * <p>
     * 
     * @return the current value of the <code>sraDefinition</code> property.
     */
    public ContractDefinitionType getSraDefinition() {
        return this.sraDefinition;
    }
    
    /**
     * Gets the <code>sraDefinitionString</code> property.
     * <p>
     * 
     * @return the current value of the <code>sraDefinitionString</code> property.
     */
    public String getSraDefinitionString() {
        return this.sraDefinitionString;
    }

    /**
     * Gets the <code>uldChargeCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>uldChargeCode</code> property.
     */
    public ULDChargeType getUldChargeCode() {
        return this.uldChargeCode;
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
        result = prime * result + ((sraDefinition == null) ? 0 : sraDefinition.hashCode());
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
     * Sets the <code>allCommodity</code> property.
     * <p>
     * 
     * @param pAllCommodity
     *            the current value of the <code>allCommodity</code> property.
     */
    public void setAllCommodity(final boolean pAllCommodity) {
        this.allCommodity = pAllCommodity;
    }

    /**
     * Sets the <code>allMinimumWeight</code> property.
     * <p>
     * 
     * @param pAllMinimumWeight
     *            the current value of the <code>allMinimumWeight</code> property.
     */
    public void setAllMinimumWeight(final boolean pAllMinimumWeight) {
        this.allMinimumWeight = pAllMinimumWeight;
    }

    /**
     * Sets the <code>allUldType</code> property.
     * <p>
     * 
     * @param pAllUldType
     *            the current value of the <code>allUldType</code> property.
     */
    public void setAllUldType(final boolean pAllUldType) {
        this.allUldType = pAllUldType;
    }

    /**
     * Sets the <code>classRatingId</code> property.
     * <p>
     * 
     * @param pClassRatingId
     *            the current value of the <code>classRatingId</code> property.
     */
    public void setClassRatingId(final String pClassRatingId) {
        this.classRatingId = ContractUtility.convertToUpperCase(pClassRatingId);
    }

    /**
     * Sets the <code>commodityNumber</code> property.
     * <p>
     * 
     * @param pCommodityNumber
     *            the current value of the <code>commodityNumber</code> property.
     */
    public void setCommodityNumber(final String pCommodityNumber) {
        this.commodityNumber = ContractUtility.convertToUpperCase(pCommodityNumber);
    }

    /**
     * Sets the <code>commodityType</code> property.
     * <p>
     * 
     * @param pCommodityType
     *            the current value of the <code>commodityType</code> property.
     */
    public void setCommodityType(final RatingConventionType pCommodityType) {
        this.commodityType = pCommodityType;
    }

    /**
     * Sets the <code>error</code> details.
     * <p>
     * 
     * @param pError
     *            holds the new value of <code>error</code> type
     *            details.<br>
     */
    public void setError(final boolean pError) {
        this.error = pError;
    }

    /**
     * Sets the <code>minimumShipmentSize</code> property.
     * <p>
     * 
     * @param pMinimumShipmentSize
     *            the current value of the <code>minimumShipmentSize</code> property.
     */
    public void setMinimumShipmentSize(final BigDecimal pMinimumShipmentSize) {
        this.minimumShipmentSize = pMinimumShipmentSize;
    }

    /**
     * Sets the <code>minimumWeight</code> property.
     * <p>
     * 
     * @param pMinimumWeight
     *            the current value of the <code>minimumWeight</code> property.
     */
    public void setMinimumWeight(final BigDecimal pMinimumWeight) {
        this.minimumWeight = pMinimumWeight;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the current value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>overPivotRate</code> property.
     * <p>
     * 
     * @param pOverPivotRate
     *            the current value of the <code>overPivotRate</code> property.
     */
    public void setOverPivotRate(final BigDecimal pOverPivotRate) {
        this.overPivotRate = pOverPivotRate;
    }

    /**
     * Sets the <code>pivotWeight</code> property.
     * <p>
     * 
     * @param pPivotWeight
     *            the current value of the <code>pivotWeight</code> property.
     */
    public void setPivotWeight(final BigDecimal pPivotWeight) {
        this.pivotWeight = pPivotWeight;
    }

    /**
     * Sets the <code>rate</code> property.
     * <p>
     * 
     * @param pRate
     *            the current value of the <code>rate</code> property.
     */
    public void setRate(final BigDecimal pRate) {
        this.rate = pRate;
    }

    /**
     * Sets the <code>rateAdjustment</code> property.
     * <p>
     * 
     * @param pRateAdjustment
     *            the current value of the <code>rateAdjustment</code> property.
     */
    public void setRateAdjustment(final BigDecimal pRateAdjustment) {
        this.rateAdjustment = pRateAdjustment;
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

    /**
     * Sets the <code>rateSource</code> property.
     * <p>
     * 
     * @param pRateSource
     *            the current value of the <code>rateSource</code> property.
     */
    public void setRateSource(final String pRateSource) {
        this.rateSource = ContractUtility.convertToUpperCase(pRateSource);
    }

    /**
     * Sets the <code>rateType</code> property.
     * <p>
     * 
     * @param pRateType
     *            the current value of the <code>rateType</code> property.
     */
    public void setRateType(final String pRateType) {
        this.rateType = ContractUtility.convertToUpperCase(pRateType);
    }

    /**
     * Sets the <code>ratingWeightUnitType</code> property.
     * <p>
     * 
     * @param pRatingWeightUnitType
     *            the current value of the <code>ratingWeightUnitType</code> property.
     */
    public void setRatingWeightUnitType(final WeightUOMType pRatingWeightUnitType) {
        this.ratingWeightUnitType = pRatingWeightUnitType;
    }

    /**
     * Sets the <code>sraDefinition</code> property.
     * <p>
     * 
     * @param pSraDefinition
     *            the current value of the <code>sraDefinition</code> property.
     */
    public void setSraDefinition(final ContractDefinitionType pSraDefinition) {
        this.sraDefinition = pSraDefinition;
    }

    
    /**
     * Sets the <code>sraDefinitionString</code> property.
     * <p>
     * 
     * @param pSraDefinitionString
     *            the current value of the <code>sraDefinitionString</code> property.
     */
    public void setSraDefinitionString(final String pSraDefinitionString) {
        this.sraDefinitionString = pSraDefinitionString;
    }
    
    /**
     * Sets the <code>uldChargeCode</code> property.
     * <p>
     * 
     * @param pUldChargeCode
     *            the current value of the <code>uldChargeCode</code> property.
     */
    public void setUldChargeCode(final ULDChargeType pUldChargeCode) {
        this.uldChargeCode = pUldChargeCode;
    }

    /**
     * Sets the <code>uldType</code> property.
     * <p>
     * 
     * @param pUldType
     *            the current value of the <code>uldType</code> property.
     */
    public void setUldType(final String pUldType) {
        this.uldType = ContractUtility.convertToUpperCase(pUldType);
    }

}
