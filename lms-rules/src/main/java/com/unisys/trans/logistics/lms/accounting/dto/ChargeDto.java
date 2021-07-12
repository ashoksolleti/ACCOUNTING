/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.constants.UnitType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.VolumeEvaluationMethodType;
import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

/**
 * <code>ChargeDto</code> class contain information specific to an Charge.<br>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>actualIndicator
 * <li>currencyCode
 * <li>dimensionalWeight
 * <li>faceIndicator
 * <li>faceIndicator
 * <li>carrierReceivables
 * <li>flightDate
 * <li>flightNumber
 * <li>oId
 * <li>publishedIndicator
 * <li>ratingLineEntries
 * <li>totalCashOnDeliveryCOD
 * <li>totalChargeableWeight
 * <li>totalWeightCharges
 * <li>volume
 * <li>weightUnit
 * <li>oId
 * <li>unitType
 * </code>
 * </ul>
 */
public class ChargeDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 6195234026060577300L;

    /**
     * Attribute to hold <code>actualIndicator</code> property.
     */
    private boolean actualIndicator;

    /**
     * Attribute to hold <code>currencyCode</code> property.
     */
    private String currencyCode;

    /**
     * Attribute to hold <code>dimensionalWeight</code> property.
     */
    private BigDecimal dimensionalWeight;

    /**
     * Attribute to hold <code>faceIndicator</code> property.
     */
    private boolean faceIndicator;

    /**
     * Attribute to hold <code>flightDate</code> property.
     */
    private Date flightDate;

    /**
     * Attribute to hold <code>flightNumber</code> property.
     */
    private String flightNumber;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>publishedIndicator</code> property.
     */
    private boolean publishedIndicator;

    /**
     * Attribute to hold <code>ratingLineEntries</code> property.
     */
    private List<RatingLineEntryDto> ratingLineEntries;

    /**
     * Attribute to hold <code>totalCashOnDeliveryCOD</code> property.
     */
    private BigDecimal totalCashOnDeliveryCOD;

    /**
     * Attribute to hold <code>totalChargeableWeight</code> property.
     */
    private BigDecimal totalChargeableWeight;

    /**
     * Attribute to hold <code>totalWeightCharges</code> property.
     */
    private BigDecimal totalWeightCharges;

    /**
     * Attribute to hold <code>volume</code> property.
     */
    private Integer volume;

    /**
     * Attribute to hold <code>weightUnit</code> property.
     */
    private WeightUOMType weightUnit;

    /**
     * Attribute to hold <code>unitType</code> property.
     */
    private UnitType unitType;
    /**
     * Attribute to hold <code>volumeEvaluationMethod</code> property.
     */
    private VolumeEvaluationMethodType volumeEvaluationMethod;

    /**
     * Gets the <code>actualIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>actualIndicator</code> property.
     */
    public boolean getActualIndicator() {
        return this.actualIndicator;
    }

    /**
     * Gets the <code>currencyCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>currencyCode</code> property.
     */
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * Gets the <code>dimensionalWeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>dimensionalWeight</code> property.
     */
    public BigDecimal getDimensionalWeight() {
        return this.dimensionalWeight;
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
     * Gets the <code>flightDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>flightDate</code> property.
     */
    public Date getFlightDate() {
        return this.flightDate;
    }

    /**
     * Gets the <code>flightNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>flightNumber</code> property.
     */
    public String getFlightNumber() {
        return this.flightNumber;
    }

    /**
     * Gets the <code>oId</code> property.
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */

    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>ratingLineEntries</code> property.
     * <p>
     * 
     * @return the current value of the <code>ratingLineEntries</code> property.
     */
    public List<RatingLineEntryDto> getRatingLineEntries() {
        return this.ratingLineEntries;
    }

    /**
     * Gets the <code>totalCashOnDeliveryCOD</code> property.
     * <p>
     * 
     * @return the current value of the <code>totalCashOnDeliveryCOD</code> property.
     */
    public BigDecimal getTotalCashOnDeliveryCOD() {
        return this.totalCashOnDeliveryCOD;
    }

    /**
     * Gets the <code>totalChargeableWeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>totalChargeableWeight</code> property.
     */
    public BigDecimal getTotalChargeableWeight() {
        return this.totalChargeableWeight;
    }

    /**
     * Gets the <code>totalWeightCharges</code> property.
     * <p>
     * 
     * @return the current value of the <code>totalWeightCharges</code> property.
     */
    public BigDecimal getTotalWeightCharges() {
        return this.totalWeightCharges;
    }

    public UnitType getUnitType() {
        return unitType;
    }

    /**
     * Gets the <code>volume</code> property.
     * <p>
     * 
     * @return the current value of the <code>volume</code> property.
     */
    public Integer getVolume() {
        return this.volume;
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

    public boolean isPublishedIndicator() {
        return publishedIndicator;
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
     * Sets the <code>currencyCode</code>.
     * <p>
     * 
     * @param pCurrencyCode
     *            holds the new value of <code>currencyCode</code>
     */
    public void setCurrencyCode(final String pCurrencyCode) {
        this.currencyCode = pCurrencyCode;
    }

    /**
     * Sets the <code>dimensionalWeight</code>.
     * <p>
     * 
     * @param pDimensionalWeight
     *            holds the new value of <code>dimensionalWeight</code>
     */
    public void setDimensionalWeight(final BigDecimal pDimensionalWeight) {
        this.dimensionalWeight = pDimensionalWeight;
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
     * Sets the <code>flightDate</code>.
     * <p>
     * 
     * @param pFlightDate
     *            holds the new value of <code>flightDate</code>
     */
    public void setFlightDate(final Date pFlightDate) {
        this.flightDate = pFlightDate;
    }

    /**
     * Sets the <code>flightNumber</code>.
     * <p>
     * 
     * @param pFlightNumber
     *            holds the new value of <code>flightNumber</code>
     */
    public void setFlightNumber(final String pFlightNumber) {
        this.flightNumber = pFlightNumber;
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

    public void setPublishedIndicator(final boolean publishedIndicator) {
        this.publishedIndicator = publishedIndicator;
    }

    /**
     * Sets the <code>ratingLineEntries</code>.
     * <p>
     * 
     * @param pRatingLineEntries
     *            holds the new value of <code>ratingLineEntries</code>
     */
    public void setRatingLineEntries(final List<RatingLineEntryDto> pRatingLineEntries) {
        this.ratingLineEntries = pRatingLineEntries;
    }

    /**
     * Sets the <code>pTotalCashOnDeliveryCOD</code>.
     * <p>
     * 
     * @param pTotalCashOnDeliveryCOD
     *            holds the new value of <code>pTotalCashOnDeliveryCOD</code>
     */
    public void setTotalCashOnDeliveryCOD(final BigDecimal pTotalCashOnDeliveryCOD) {
        this.totalCashOnDeliveryCOD = pTotalCashOnDeliveryCOD;
    }

    /**
     * Sets the <code>totalChargeableWeight </code>.
     * <p>
     * 
     * @param pTotalChargeableWeight
     *            holds the new value of <code>totalChargeableWeight</code>
     */
    public void setTotalChargeableWeight(final BigDecimal pTotalChargeableWeight) {
        this.totalChargeableWeight = pTotalChargeableWeight;
    }

    /**
     * Sets the <code>totalWeightCharges</code>.
     * <p>
     * 
     * @param pTotalWeightCharges
     *            holds the new value of <code>totalWeightCharges</code>
     */
    public void setTotalWeightCharges(final BigDecimal pTotalWeightCharges) {
        this.totalWeightCharges = pTotalWeightCharges;
    }

    public void setUnitType(UnitType unitType) {
        this.unitType = unitType;
    }

    /**
     * Sets the <code>volume</code>.
     * <p>
     * 
     * @param pVolume
     *            holds the new value of <code>volume</code>
     */
    public void setVolume(final Integer pVolume) {
        this.volume = pVolume;
    }

    /**
     * Sets the <code>weightUnit</code>.
     * <p>
     * 
     * @param pWeightUnit
     *            holds the new value of <code>weightUnit</code>
     */
    public void setWeightUnit(final WeightUOMType pWeightUnit) {
        this.weightUnit = pWeightUnit;
    }
    /**
     * Gets the <code>volumeEvaluationMethod</code> property.
     * <p>
     * 
     * @return the current value of the <code>volumeEvaluationMethod</code> property.
     */
    public VolumeEvaluationMethodType getVolumeEvaluationMethod() {
        return volumeEvaluationMethod;
    }
    /**
     * Sets the <code>volumeEvaluationMethod</code>.
     * <p>
     * 
     * @param pVolumeEvaluationMethod
     *            holds the new value of <code>volumeEvaluationMethod</code>
     */
    public void setVolumeEvaluationMethod(final VolumeEvaluationMethodType pVolumeEvaluationMethod) {
        this.volumeEvaluationMethod = pVolumeEvaluationMethod;
    }

}
