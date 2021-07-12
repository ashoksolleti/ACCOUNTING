/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.rating.dto.constants.ActionType;
import com.unisys.trans.logistics.lms.rating.dto.constants.RateAdjustmentType;
import com.unisys.trans.logistics.lms.rating.dto.constants.TariffActionType;
import com.unisys.trans.logistics.lms.rating.dto.constants.ULDChargeType;
import com.unisys.trans.logistics.lms.utils.dto.constants.RateClassType;

/**
 * <code>Tariff Rate Administration Dto</code> contains specific data applicable to the tariff rate
 * administration task.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>action
 * <li>allCarrier
 * <li>carrier
 * <li>commodityNumber
 * <li>currency
 * <li>destination
 * <li>effectiveDate
 * <li>error
 * <li>expirationDate
 * <li>minimumWeight
 * <li>oId
 * <li>origin
 * <li>overPivotRateAdjustment
 * <li>overPivotRateAdjustmentType
 * <li>rateAdjustment
 * <li>rateAdjustmentType
 * <li>rateClass
 * <li>rateSource
 * <li>rateType
 * <li>rateTypePriority
 * <li>retainEffectiveDate
 * <li>retainExpirationDate
 * <li>selectFutureDate
 * <li>selectionDate
 * <li>tariffActionType
 * <li>uldCharge
 * <li>uldType
 * <li>weightUnit
 * </code>
 * </ul>
 */
public class TariffRateAdminDto extends PersistenceObjectDto {

    /**
     * Generated serial version id.
     */
    private static final long serialVersionUID = -9166391886734814310L;

    /**
     * Attribute to hold <code>action</code> property.
     */
    private ActionType action;

    /**
     * Attribute to hold <code>allCarrier</code> property.
     */
    private boolean allCarrier;

    /**
     * Attribute to hold <code>carrier</code> property.
     */
    private String carrier;

    /**
     * Attribute to hold <code>commodityNumber</code> property.
     */
    private String commodityNumber;

    /**
     * Attribute to hold <code>currency</code> property.
     */
    private String currency;

    /**
     * Attribute to hold <code>destination</code> property.
     */
    private GeographicDataDto destination;

    /**
     * Attribute to hold <code>effectiveDate</code> property.
     */
    private Date effectiveDate;

    /**
     * Attribute to hold <code>error</code> property.
     */
    private boolean error;

    /**
     * Attribute to hold <code>errorRateCriteria</code> property.
     */
    private String errorRateCriteria;

    /**
     * Attribute to hold <code>expirationDate</code> property.
     */
    private Date expirationDate;

    /**
     * Attribute to hold <code>ignoreTaskIndicator</code> property.
     */
    private boolean ignoreTaskIndicator;

    /**
     * Attribute to hold <code>ignoreTaskReasonType</code> property.
     */
    private String ignoreTaskReasonType;

    /**
     * Attribute to hold <code>minimumWeight</code> property.
     */
    private BigDecimal minimumWeight;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>origin</code> property.
     */
    private GeographicDataDto origin;

    /**
     * Attribute to hold <code>overPivotRateAdjustment</code> property.
     */
    private BigDecimal overPivotRateAdjustment;

    /**
     * Attribute to hold <code>overPivotRateAdjustmentType</code> property.
     */
    private RateAdjustmentType overPivotRateAdjustmentType;

    /**
     * Attribute to hold <code>rateAdjustment</code> property.
     */
    private BigDecimal rateAdjustment;

    /**
     * Attribute to hold <code>rateAdjustmentType</code> property.
     */
    private RateAdjustmentType rateAdjustmentType;

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
     * Attribute to hold <code>rateTypePriority</code> property.
     */
    private Integer rateTypePriority;

    /**
     * Attribute to hold <code>retainEffectiveDate</code> property.
     */
    private boolean retainEffectiveDate;

    /**
     * Attribute to hold <code>retainExpirationDate</code> property.
     */
    private boolean retainExpirationDate = true;

    /**
     * Attribute to hold <code>selectFutureDate</code> property.
     */
    private boolean selectFutureDate;

    /**
     * Attribute to hold <code>selectionDate</code> property.
     */
    private Date selectionDate;

    /**
     * Attribute to hold <code>tariffActionType</code> property.
     */
    private TariffActionType tariffActionType;

    /**
     * Attribute to hold <code>uldCharge</code> property.
     */
    private ULDChargeType uldCharge;

    /**
     * Attribute to hold <code>uldType</code> property.
     */
    private String uldType;

    /**
     * Attribute to hold <code>weightUnit</code> property.
     */
    private WeightUOMType weightUnit;

    /**
     * Attribute to hold the list of<code>rateCriteriaOIds</code>'s.
     */
    private List<Long> rateCriteriaOIds;

    /**
     * Gets the <code>TariffRateAdminDto</code> property.
     * <p>
     * <b>Format: </b><br>
     * boolean
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @param pObj the new value of the <code>object</code> property.
     * @return the current value of the <code>TariffRateAdminDto</code> property.
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
        else if (!(pObj instanceof TariffRateAdminDto)) {
            isEqual = false;
        }
        else {

            final TariffRateAdminDto other = (TariffRateAdminDto) pObj;

            // Origin code
            if (this.getOrigin().getCode() == null || this.getOrigin().getCode().isEmpty()) {
                if (other.getOrigin().getCode() != null && !other.getOrigin().getCode().isEmpty()) {
                    isEqual = false;
                }
            }
            else if (!this.getOrigin().getCode().equalsIgnoreCase(other.getOrigin().getCode())) {
                isEqual = false;
            }

            if (this.getDestination().getCode() == null || this.getDestination().getCode().isEmpty()) {
                if (other.getDestination().getCode() != null && !other.getDestination().getCode().isEmpty()) {
                    isEqual = false;
                }
            }
            else if (!this.getDestination().getCode().equalsIgnoreCase(other.getDestination().getCode())) {
                isEqual = false;
            }

            if (this.getCarrier() == null || this.getCarrier().isEmpty()) {
                if (other.getCarrier() != null && !other.getCarrier().isEmpty()) {
                    isEqual = false;
                }
            }
            else if (!this.getCarrier().equalsIgnoreCase(other.getCarrier())) {
                isEqual = false;
            }

            if (this.getCurrency() == null || this.getCurrency().isEmpty()) {
                if (other.getCurrency() != null && !other.getCurrency().isEmpty()) {
                    isEqual = false;
                }
            }
            else if (!this.getCurrency().equalsIgnoreCase(other.getCurrency())) {
                isEqual = false;
            }

            if (this.getRateSource() == null || this.getRateSource().isEmpty()) {
                if (other.getRateSource() != null && !other.getRateSource().isEmpty()) {
                    isEqual = false;
                }
            }
            else if (!this.getRateSource().equalsIgnoreCase(other.getRateSource())) {
                isEqual = false;
            }

            if (this.getRateType() == null || this.getRateType().isEmpty()) {
                if (other.getRateType() != null && !other.getRateType().isEmpty()) {
                    isEqual = false;
                }
            }
            else if (!this.getRateType().equalsIgnoreCase(other.getRateType())) {
                isEqual = false;
            }
            if (this.getRateClass() != other.getRateClass()) {
                isEqual = false;
            }

            if (this.getCommodityNumber() == null || this.getCommodityNumber().isEmpty()) {
                if (other.getCommodityNumber() != null && !other.getCommodityNumber().isEmpty()) {
                    isEqual = false;
                }
            }
            else if (!this.getCommodityNumber().equalsIgnoreCase(other.getCommodityNumber())) {
                isEqual = false;
            }

            if (this.getUldType() == null || this.getUldType().isEmpty()) {
                if (other.getUldType() != null && !other.getUldType().isEmpty()) {
                    isEqual = false;
                }
            }
            else if (!this.getUldType().equalsIgnoreCase(other.getUldType())) {
                isEqual = false;
            }

            if (this.getUldCharge() != other.getUldCharge()) {
                isEqual = false;
            }

            if (this.getMinimumWeight() == null) {
                if (other.getMinimumWeight() != null) {
                    isEqual = false;
                }
            }
            else if (other.getMinimumWeight() != null
                        && this.getMinimumWeight().compareTo(other.getMinimumWeight()) != 0) {
                isEqual = false;
            }

            if (this.getWeightUnit() != other.getWeightUnit()) {
                isEqual = false;
            }

            if (this.getSelectionDate() == null && other.getSelectionDate() != null) {
                isEqual = false;
            }
            if (other.getSelectionDate() == null && this.getSelectionDate() != null) {
                isEqual = false;
            }
            if (this.getSelectionDate() != null && other.getSelectionDate() != null) {
                if (ContractUtility.compareDates(this.getSelectionDate(), other.getSelectionDate()) < 0) {
                    isEqual = false;
                }
                if (ContractUtility.compareDates(this.getSelectionDate(), other.getSelectionDate()) > 0) {
                    isEqual = false;
                }
            }
        }
        return isEqual;
    }

    /**
     * Gets the <code>action</code> property.
     * <p>
     * <b>Example: </b><br>
     * CREATE,UPDATE,DELETE
     * <p>
     * 
     * @return the current value of the <code>action</code> property.
     */
    public ActionType getAction() {
        return this.action;
    }

    /**
     * Gets the <code>allCarrier</code> property.
     * <p>
     * 
     * @return the current value of the <code>allCarrier</code> property.<br>
     */
    public boolean getAllCarrier() {
        return this.allCarrier;
    }

    /**
     * Gets the <code>carrier</code> property.
     * <p>
     * 
     * @return the current value of the <code>carrier</code> property.
     */
    public String getCarrier() {
        return this.carrier;
    }

    /**
     * Gets the <code>commodityNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>commodityNumber</code> property.
     */
    public String getCommodityNumber() {
        return this.commodityNumber;
    }

    /**
     * Gets the <code>currency</code> property.
     * <p>
     * 
     * @return the current value of the <code>currency</code> property.
     */
    public String getCurrency() {
        return this.currency;
    }

    /**
     * Gets the <code>destination</code> property.
     * <p>
     * 
     * @return the current value of the <code>destination</code> property.
     */
    public GeographicDataDto getDestination() {
        if (this.destination == null) {
            this.destination = new GeographicDataDto();
        }
        return this.destination;
    }

    /**
     * Gets the <code>effectiveDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * DDMMMYY
     * <p>
     * <b>Example: </b><br>
     * 26JAN08
     * <p>
     * 
     * @return the current value of the <code>effectiveDate</code> property.
     */
    public Date getEffectiveDate() {
        return ContractUtility.getClonedDate(this.effectiveDate);
    }

    /**
     * Gets the value for the <code>errorRateCriteria</code> property.
     * <p>
     * 
     * @return the current value of the <code>errorRateCriteria</code> property.<br>
     */
    public String getErrorRateCriteria() {
        return errorRateCriteria;
    }

    /**
     * Gets the <code>expirationDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * DDMMMYY
     * <p>
     * <b>Example: </b><br>
     * 26JAN08
     * <p>
     * 
     * @return the current value of the <code>expirationDate</code> property.
     */
    public Date getExpirationDate() {
        return ContractUtility.getClonedDate(this.expirationDate);
    }

    /**
     * Gets the value for the <code>ignoreTaskReasonType</code> property.
     * <p>
     * 
     * @return the current value of the <code>ignoreTaskReasonType</code> property.<br>
     */
    public String getIgnoreTaskReasonType() {
        return ignoreTaskReasonType;
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
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>origin</code> property.
     * <p>
     * 
     * @return the current value of the <code>origin</code> property.
     */
    public GeographicDataDto getOrigin() {
        if (this.origin == null) {
            this.origin = new GeographicDataDto();
        }
        return this.origin;
    }

    /**
     * Gets the <code>overPivotRateAdjustment</code> property.
     * <p>
     * 
     * @return the current value of the <code>overPivotRateAdjustment</code> property.
     */
    public BigDecimal getOverPivotRateAdjustment() {
        return this.overPivotRateAdjustment;
    }

    /**
     * Gets the <code>overPivotRateAdjustmentType</code> property.
     * <p>
     * 
     * @return the current value of the <code>overPivotRateAdjustmentType</code> property.
     */
    public RateAdjustmentType getOverPivotRateAdjustmentType() {
        return this.overPivotRateAdjustmentType;
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
     * Gets the <code>rateAdjustmentType</code> property.
     * <p>
     * 
     * @return the current value of the <code>rateAdjustmentType</code> property.
     */
    public RateAdjustmentType getRateAdjustmentType() {
        return this.rateAdjustmentType;
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
     * Gets the <code>rateCriteriaOIds</code>.
     * <p>
     * 
     * @return <code>rateCriteriaOIds</code><br>
     *         </p>
     *
     */
    public List<Long> getRateCriteriaOIds() {
        return this.rateCriteriaOIds;
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
     * Gets the <code>retainEffectiveDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>retainEffectiveDate</code> property.
     */
    public boolean getRetainEffectiveDate() {
        return this.retainEffectiveDate;
    }

    /**
     * Gets the <code>retainExpirationDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>retainExpirationDate</code> property.
     */
    public boolean getRetainExpirationDate() {
        return this.retainExpirationDate;
    }

    /**
     * Gets the <code>selectFutureDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>selectFutureDate</code> property.
     */
    public boolean getSelectFutureDate() {
        return this.selectFutureDate;
    }

    /**
     * Gets the <code>selectionDate</code> property.
     * <p>
     * 
     * @return the current value of the <code>selectionDate</code> property.
     */
    public Date getSelectionDate() {
        return ContractUtility.getClonedDate(this.selectionDate);
    }

    /**
     * Gets the <code>tariffActionType</code> property.
     * <p>
     * 
     * @return the current value of the <code>tariffActionType</code> property.
     */
    public TariffActionType getTariffActionType() {
        return this.tariffActionType;
    }

    /**
     * Gets the <code>uldCharge</code> property.
     * <p>
     * 
     * @return the current value of the <code>uldCharge</code> property.
     */
    public ULDChargeType getUldCharge() {
        return this.uldCharge;
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
     * Gets the <code>weightUnit</code> property.
     * <p>
     * 
     * @return the current value of the <code>weightUnit</code> property.
     */
    public WeightUOMType getWeightUnit() {
        return this.weightUnit;
    }

    /**
     * The<code>hashCode </code> object.
     * <p>
     * 
     * @return <code>int</code> hashcode of super class.
     */
    @Override
    public int hashCode() {
        // SuppressOn:MagicNumber
        final int prime = 31;
        int result = 1;
        result = prime * result + ((action == null) ? 0 : action.hashCode());
        result = prime * result + ((commodityNumber == null) ? 0 : commodityNumber.hashCode());
        result = prime * result + ((carrier == null) ? 0 : carrier.hashCode());
        result = prime * result + ((currency == null) ? 0 : currency.hashCode());
        result = prime * result + ((destination == null) ? 0 : destination.hashCode());
        result = prime * result + ((minimumWeight == null) ? 0 : minimumWeight.hashCode());
        result = prime * result + ((oId == null) ? 0 : oId.hashCode());
        result = prime * result + ((origin == null) ? 0 : origin.hashCode());
        result =
                    prime
                                * result
                                + ((overPivotRateAdjustment == null) ? 0 : overPivotRateAdjustment.hashCode());
        result =
                    prime
                                * result
                                + ((overPivotRateAdjustmentType == null) ? 0 : overPivotRateAdjustmentType
                                            .hashCode());
        result = prime * result + ((rateAdjustment == null) ? 0 : rateAdjustment.hashCode());
        result = prime * result + ((rateAdjustmentType == null) ? 0 : rateAdjustmentType.hashCode());
        result = prime * result + ((rateClass == null) ? 0 : rateClass.hashCode());
        result = prime * result + ((rateSource == null) ? 0 : rateSource.hashCode());
        result = prime * result + ((rateType == null) ? 0 : rateType.hashCode());
        result = prime * result + (retainEffectiveDate ? 1231 : 1237);
        result = prime * result + (retainExpirationDate ? 1231 : 1237);
        result = prime * result + (selectFutureDate ? 1231 : 1237);
        result = prime * result + ((selectionDate == null) ? 0 : selectionDate.hashCode());
        result = prime * result + ((tariffActionType == null) ? 0 : tariffActionType.hashCode());
        result = prime * result + ((uldCharge == null) ? 0 : uldCharge.hashCode());
        result = prime * result + ((uldType == null) ? 0 : uldType.hashCode());
        result = prime * result + ((weightUnit == null) ? 0 : weightUnit.hashCode());
        return result;
        // SuppressOff:MagicNumber
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

    /**
     * Gets the value of <code>ignoreTaskIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * Ignore task indicator is included for task.
     * <li><code>false</code><br>
     * Ignore task indicator is not included for task.
     * <p>
     * 
     * @return the current value of the <code>ignoreTaskIndicator</code> property.<br>
     */
    public boolean isIgnoreTaskIndicator() {
        return ignoreTaskIndicator;
    }

    /**
     * Sets the <code>ActionType</code> property.
     * <p>
     * <b>Example: </b><br>
     * CREATE,UPDATE,DELETE
     * <p>
     * 
     * @param pAction
     *            the current value of the <code>action</code> property.
     */
    public void setAction(final ActionType pAction) {
        this.action = pAction;
    }

    /**
     * Sets the <code>allCarrier</code> property.
     * <p>
     * 
     * @param pAllCarrier
     *            the current value of the <code>allCarrier</code> property.<br>
     */
    public void setAllCarrier(final boolean pAllCarrier) {
        this.allCarrier = pAllCarrier;
    }

    /**
     * Sets the <code>carrier</code> property.
     * <p>
     * 
     * @param pCarrier
     *            the current value of the <code>carrier</code> property.<br>
     */
    public void setCarrier(final String pCarrier) {
        this.carrier = ContractUtility.convertToUpperCase(pCarrier);
    }

    /**
     * Sets the <code>commodityNumber</code> property.
     * <p>
     * 
     * @param pCommodityNumber
     *            the current value of the <code>commodityNumber</code> property.<br>
     */
    public void setCommodityNumber(final String pCommodityNumber) {
        this.commodityNumber = ContractUtility.convertToUpperCase(pCommodityNumber);
    }

    /**
     * Sets the <code>currency</code> property.
     * <p>
     * 
     * @param pCurrency
     *            the current value of the <code>currency</code> property.<br>
     */
    public void setCurrency(final String pCurrency) {
        this.currency = ContractUtility.convertToUpperCase(pCurrency);
    }

    /**
     * Sets the <code>destination</code> property.
     * <p>
     * 
     * @param pDestination
     *            the current value of the <code>destination</code> property.<br>
     */
    public void setDestination(final GeographicDataDto pDestination) {
        this.destination = pDestination;
    }

    /**
     * Sets the <code>effectiveDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * DDMMMYY
     * <p>
     * <b>Example: </b><br>
     * 26JAN08
     * <p>
     * 
     * @param pEffectiveDate
     *            the new value of the <code>effectiveDate</code> property.
     */
    public void setEffectiveDate(final Date pEffectiveDate) {
        this.effectiveDate = ContractUtility.getClonedDate(pEffectiveDate);
    }

    /**
     * Sets the <code>error</code> details.
     * <p>
     * 
     * @param pError
     *            holds the new value of <code>error</code> type details.<br>
     */
    public void setError(final boolean pError) {
        this.error = pError;
    }

    /**
     * Sets the value of the <code>errorRateCriteria</code> property.
     * <p>
     * 
     * @param pErrorRateCriteria
     *            the new value of the <code>errorRateCriteria</code> property.<br>
     */
    public void setErrorRateCriteria(final String pErrorRateCriteria) {
        this.errorRateCriteria = pErrorRateCriteria;
    }

    /**
     * Sets the <code>expirationDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * DDMMMYY
     * <p>
     * <b>Example: </b><br>
     * 26JAN08
     * <p>
     * 
     * @param pExpirationDate
     *            the new value of the <code>expirationDate</code> property.
     */
    public void setExpirationDate(final Date pExpirationDate) {
        this.expirationDate = ContractUtility.getClonedDate(pExpirationDate);
    }

    /**
     * Sets the value of the <code>ignoreTaskIndicator</code> property.
     * <p>
     * 
     * @param pIgnoreTaskIndicator
     *            the new value of the <code>ignoreTaskIndicator</code> property.<br>
     */
    public void setIgnoreTaskIndicator(final boolean pIgnoreTaskIndicator) {
        this.ignoreTaskIndicator = pIgnoreTaskIndicator;
    }

    /**
     * Sets the value of the <code>ignoreTaskReasonType</code> property.
     * <p>
     * 
     * @param pIgnoreTaskReasonType
     *            the new value of the <code>ignoreTaskReasonType</code> property.<br>
     */
    public void setIgnoreTaskReasonType(final String pIgnoreTaskReasonType) {
        this.ignoreTaskReasonType = pIgnoreTaskReasonType;
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
     * Sets the <code>origin</code> property.
     * <p>
     * 
     * @param pOrigin
     *            the current value of the <code>origin</code> property.<br>
     */
    public void setOrigin(final GeographicDataDto pOrigin) {
        this.origin = pOrigin;
    }

    /**
     * Sets the <code>overPivotRateAdjustment</code> property.
     * <p>
     * 
     * @param pOverPivotRateAdjustment
     *            the current value of the <code>overPivotRateAdjustment</code> property.<br>
     */
    public void setOverPivotRateAdjustment(final BigDecimal pOverPivotRateAdjustment) {
        this.overPivotRateAdjustment = pOverPivotRateAdjustment;
    }

    /**
     * Sets the <code>overPivotRateAdjustmentType</code> property.
     * <p>
     * 
     * @param pOverPivotRateAdjustmentType
     *            the current value of the <code>overPivotRateAdjustmentType</code> property.<br>
     */
    public void setOverPivotRateAdjustmentType(final RateAdjustmentType pOverPivotRateAdjustmentType) {
        this.overPivotRateAdjustmentType = pOverPivotRateAdjustmentType;
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

    /**
     * Sets the <code>rateAdjustmentType</code> property.
     * <p>
     * 
     * @param pRateAdjustmentType
     *            the current value of the <code>rateAdjustmentType</code> property.<br>
     */
    public void setRateAdjustmentType(final RateAdjustmentType pRateAdjustmentType) {
        this.rateAdjustmentType = pRateAdjustmentType;
    }

    /**
     * Sets the <code>rateClass</code> property.
     * <p>
     * 
     * @param pRateClass
     *            the current value of the <code>rateClass</code> property.<br>
     */
    public void setRateClass(final RateClassType pRateClass) {
        this.rateClass = pRateClass;
    }
    
    /**
     * Sets the <code>rateCriteriaOIds</code> property.
     * <p>
     * 
     * @param prateCriteriaOIds
     *            the current value of the <code>rateCriteriaOIds</code> property.<br>
     */
    public void setRateCriteriaOIds(List<Long> prateCriteriaOIds) {
        this.rateCriteriaOIds = prateCriteriaOIds;
    }

    /**
     * Sets the <code>rateSource</code> property.
     * <p>
     * 
     * @param pRateSource
     *            the current value of the <code>rateSource</code> property.<br>
     */
    public void setRateSource(final String pRateSource) {
        this.rateSource = ContractUtility.convertToUpperCase(pRateSource);
    }

    /**
     * Sets the <code>rateType</code> property.
     * <p>
     * 
     * @param pRateType
     *            the current value of the <code>rateType</code> property.<br>
     */
    public void setRateType(final String pRateType) {
        this.rateType = ContractUtility.convertToUpperCase(pRateType);
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
     * Sets the <code>retainEffectiveDate</code> property.
     * <p>
     * 
     * @param pRetainEffectiveDate
     *            the current value of the <code>retainEffectiveDate</code> property.<br>
     */
    public void setRetainEffectiveDate(final boolean pRetainEffectiveDate) {
        this.retainEffectiveDate = pRetainEffectiveDate;
    }

    /**
     * Sets the <code>retainExpirationDate</code> property.
     * <p>
     * 
     * @param pRetainExpirationDate
     *            the current value of the <code>retainExpirationDate</code> property.<br>
     */
    public void setRetainExpirationDate(final boolean pRetainExpirationDate) {
        this.retainExpirationDate = pRetainExpirationDate;
    }

    /**
     * Sets the <code>selectFutureDate</code> property.
     * <p>
     * 
     * @param pSelectFutureDate
     *            the current value of the <code>selectFutureDate</code> property.<br>
     */
    public void setSelectFutureDate(final boolean pSelectFutureDate) {
        this.selectFutureDate = pSelectFutureDate;
    }

    /**
     * Sets the <code>selectionDate</code> property.
     * <p>
     * 
     * @param pSelectionDate
     *            the current value of the <code>selectionDate</code> property.<br>
     */
    public void setSelectionDate(final Date pSelectionDate) {
        this.selectionDate = ContractUtility.getClonedDate(pSelectionDate);
    }

    /**
     * Sets the <code>tariffActionType</code> property.
     * <p>
     * 
     * @param pTariffActionType
     *            the current value of the <code>tariffActionType</code> property.<br>
     */
    public void setTariffActionType(final TariffActionType pTariffActionType) {
        this.tariffActionType = pTariffActionType;
    }

    /**
     * Sets the <code>uldCharge</code> property.
     * <p>
     * 
     * @param pUldCharge
     *            the current value of the <code>uldCharge</code> property.<br>
     */
    public void setUldCharge(final ULDChargeType pUldCharge) {
        this.uldCharge = pUldCharge;
    }

    /**
     * Sets the <code>uldType</code> property.
     * <p>
     * 
     * @param pUldType
     *            the current value of the <code>uldType</code> property.<br>
     */
    public void setUldType(final String pUldType) {
        this.uldType = ContractUtility.convertToUpperCase(pUldType);
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

}
