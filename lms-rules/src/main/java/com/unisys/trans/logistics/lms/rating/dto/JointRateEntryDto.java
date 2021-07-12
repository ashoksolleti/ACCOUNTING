/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.DateRangeDto;
import com.unisys.trans.logistics.lms.framework.dto.TapeRateEntry;
import com.unisys.trans.logistics.lms.framework.dto.UserAuditDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.rating.dto.constants.ActionType;
import com.unisys.trans.logistics.lms.utils.dto.constants.RateClassType;

/**
 * <code>JointRateEntryDto</code> contain details of JointRateEntryDto.
 * <p>
 * This contains all information about JointRateEntryDto.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>amount
 * <li>oId
 * <li>commodity
 * <li>dateRange
 * <li>minimumWeight
 * <li>overPivotRate
 * <li>rateType
 * <li>ratingNoteCode
 * <li>uldChargeCode
 * <li>uldType
 * <li>rateClass
 * <li>userAudit
 * <li>weightUnit
 * <li>JointRatePercentage
 * </ul>
 */
public class JointRateEntryDto extends TapeRateEntry {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>action</code> property.
     */
    private ActionType action;

    /**
     * Attribute to hold <code>amount</code> property.
     */
    private BigDecimal amount;

    /**
     * Attribute to hold <code>commodityNumber</code> property.
     */

    private String commodityNumber;

    /**
     * Attribute to hold <code>dateRangeDto</code> property.
     */
    private DateRangeDto dateRangeDto;

    /**
     * Attribute to hold <code>error</code> property.
     */
    private boolean error;

    /**
     * Attribute to hold <code>jointRatePercentageDtos</code> property.
     */
    private List<JointRatePercentageDto> jointRatePercentageDtos;

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
     * Attribute to hold <code>rateClass</code> property.
     */
    private RateClassType rateClass;
    
    
    /**
     * Attribute to hold <code>rateSource</code> property.
     */
    private String rateSource;

    /**
     * Attribute to hold <code>rateTypeCode</code> property.
     */
    private String rateTypeCode;

    /**
     * Attribute to hold <code>rateTypePriority</code> property.
     */
    private Integer rateTypePriority;

    /**
     * Attribute to hold <code>ratingNoteCode</code> property.
     */
    private String ratingNoteCode;

    /**
     * Attribute to hold <code>uLDType</code> property.
     */
    private String uldType;

    /**
     * Attribute to hold <code>userAuditDto</code> property.
     */
    private UserAuditDto userAuditDto;

    /**
     * Attribute to hold <code>weightUnit</code> property.
     */
    private WeightUOMType weightUnit;

    /**
     * Gets the <code>JointRateEntryDto</code> property.
     * <p>
     * <b>Format: </b><br>
     * boolean
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @param pObj the new value of the <code>object</code> property.
     * @return the current value of the <code>JointRateEntryDto</code> property.
     */
    @Override
    public boolean equals(final Object pObj) {

        boolean value = true;
        if (this == pObj) {
            value = true;
        }
        if (pObj == null) {
            value = false;
        }
        if (this.getClass() != pObj.getClass()) {
            value = false;
        }
       final JointRateEntryDto other = (JointRateEntryDto) pObj;
        if (this.getRateTypeCode() != null && other.getRateTypeCode() != null) {
            if (!this.getRateTypeCode().equals(other.getRateTypeCode())) {
                value = false;
            }
        }
        if (this.getRateClass() != other.getRateClass()) {
            value = false;
        }
        else if (this.getRateClass() != null && other.getRateClass() != null) {
            if (!this.getRateClass().getRateClassName().equals(other.getRateClass().getRateClassName())) {
                value = false;
            }
        }

        if (this.getCommodityNumber() == null) {
            if (other.getCommodityNumber() != null) {
                value = false;
            }
        }
        else if (this.getCommodityNumber() != null && other.getCommodityNumber() != null) {
            if (!this.getCommodityNumber().equals(other.getCommodityNumber())) {
                value = false;
            }

        }
        if (this.getUldType() == null) {
            if (other.getUldType() != null) {
                value = false;
            }
        }
        else if (other.getUldType() == null) {
            value = false;
        }
        else if (!this.getUldType().equals(other.getUldType())) {
            value = false;
        }

        if (this.getRatingNoteCode() == null) {
            if (other.getRatingNoteCode() != null)
                value = false;
        }
        else if (!this.getRatingNoteCode()
                    .equals(other.getRatingNoteCode()))
            value = false;

        if (this.getMinimumWeight() == null) {
            if (other.getMinimumWeight() != null) {
                value = false;
            }
        }
        else if (!this.getMinimumWeight().equals(other.getMinimumWeight())) {
            value = false;
        }

        if (this.getPivotWeight() == null) {
            if (other.getPivotWeight() != null) {
                value = false;
            }
        }
        else if (!this.getPivotWeight().equals(other.getPivotWeight())) {
            value = false;
        }

        // Overlapping Dates
        if (this.dateRangeDto == null) {
            if (other.dateRangeDto != null) {
                value = false;
            }
        }
        else if (other.dateRangeDto == null) {
            value = false;
        }
        else if (!this.dateRangeDto.equals(other.dateRangeDto)) {
            value = false;
        }

        return value;
    }

    /**
     * Gets the <code>Action</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * COUNTRYTAXCREATE
     * <p>
     * 
     * @return the current value of the <code>Action</code> property.
     */
    public ActionType getAction() {
        return this.action;
    }

    /**
     * Gets the <code>Amount</code> property.
     * <p>
     * 
     * @return the current value of the <code>amount</code> property.<br>
     */
    public BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * Gets the <code>commodityNumber</code> property.
     * <p>
     * 
     * @return the current value of the <code>commodityNumber</code> property.<br>
     */
    public String getCommodityNumber() {
        return this.commodityNumber;
    }

    /**
     * Gets the <code>DateRangeDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>dateRangeDto</code> property.<br>
     */
    public DateRangeDto getDateRangeDto() {
        if (this.dateRangeDto == null) {
            this.dateRangeDto = new DateRangeDto();
        }
        return this.dateRangeDto;
    }

    /**
     * Gets the <code>jointRatePercentageDtos</code> property.
     * <p>
     * 
     * @return the current value of the <code>jointRatePercentageDtos</code> property.
     */

    public List<JointRatePercentageDto> getJointRatePercentageDtos() {
        if (this.jointRatePercentageDtos == null) {
            this.jointRatePercentageDtos = new ArrayList<JointRatePercentageDto>();
        }
        return this.jointRatePercentageDtos;
    }

    /**
     * Gets the <code>MinimumWeight</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-7.1 Numeric
     * <p>
     * <b>Example: </b><br>
     * 125
     * <p>
     * 
     * @return the current value of the <code>minimumWeight</code> property.
     */
    public BigDecimal getMinimumWeight() {
        return this.minimumWeight;
    }

    /**
     * Gets the <code>OId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>OverPivotRate</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-9.1-4 Numeric
     * <p>
     * <b>Example: </b><br>
     * 123.4567
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
     * 1-7.1 Numeric
     * <p>
     * <b>Example: </b><br>
     * 130
     * <p>
     * 
     * @return the current value of the <code>pivotWeight</code> property.
     */
    public BigDecimal getPivotWeight() {
        return this.pivotWeight;
    }

    /**
     * Gets the <code>RateClass</code> property.
     * <p>
     * <b>Example: </b><br>
     * M
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
     * Gets the <code>RateTypeCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * GEN
     * <p>
     * 
     * @return the current value of the <code>rateTypeCode</code> property.
     */
    public String getRateTypeCode() {
        return this.rateTypeCode;
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
     * Gets the <code>RatingNoteCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-2 for ATPCO or 4 for IATA Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * IA01,T1,R
     * <p>
     * 
     * @return the current value of the <code>ratingNoteCode</code> property.
     */
    public String getRatingNoteCode() {
        return this.ratingNoteCode;
    }

    /**
     * Gets the <code>UldType</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-3 AlphaNumeric
     * <p>
     * <b>Example: </b><br>
     * 1S
     * <p>
     * 
     * @return the current value of the <code>uldType</code> property.
     */

    public String getUldType() {
        return this.uldType;
    }

    /**
     * Gets the {@link com.unisys.trans.logistics.lms.framework.dto.UserAuditDto
     * UserAuditDto} containing <code>UserAuditDto</code> details.
     * <p>
     * 
     * @return the current value of <code>UserAuditDto</code> details.
     */
    public UserAuditDto getUserAuditDto() {
        if (this.userAuditDto == null) {
            this.userAuditDto = new UserAuditDto();
        }
        return this.userAuditDto;
    }

    /**
     * Gets the <code>WeightUnit</code> property.
     * <p>
     * <b>Format: </b><br>
     * KG or LB List
     * <p>
     * <b>Example: </b><br>
     * KG
     * <p>
     * 
     * @return the current value of the <code>WeightUnit</code> property.
     */
    public WeightUOMType getWeightUnit() {
        return this.weightUnit;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((amount == null) ? 0 : amount.hashCode());
        result = prime * result + ((commodityNumber == null) ? 0 : commodityNumber.hashCode());
        result = prime * result + ((dateRangeDto == null) ? 0 : dateRangeDto.hashCode());
        result = prime * result + (error ? 1231 : 1237);
        result =
                    prime
                                * result
                                + ((jointRatePercentageDtos == null) ? 0 : jointRatePercentageDtos.hashCode());
        result = prime * result + ((minimumWeight == null) ? 0 : minimumWeight.hashCode());
        result = prime * result + ((overPivotRate == null) ? 0 : overPivotRate.hashCode());
        result = prime * result + ((pivotWeight == null) ? 0 : pivotWeight.hashCode());
        result = prime * result + ((rateClass == null) ? 0 : rateClass.hashCode());
        result = prime * result + ((rateTypeCode == null) ? 0 : rateTypeCode.hashCode());
        result = prime * result + ((rateTypePriority == null) ? 0 : rateTypePriority.hashCode());
        result = prime * result + ((ratingNoteCode == null) ? 0 : ratingNoteCode.hashCode());
        result = prime * result + ((uldType == null) ? 0 : uldType.hashCode());
        result = prime * result + ((userAuditDto == null) ? 0 : userAuditDto.hashCode());
        result = prime * result + ((weightUnit == null) ? 0 : weightUnit.hashCode());
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

    /**
     * Sets the <code>Action</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * COUNTRYTAXCREATE
     * <p>
     * 
     * @param pAction
     *            the current value of the <code>Action</code> property.
     */
    public void setAction(final ActionType pAction) {
        this.action = pAction;
    }

    /**
     * Sets the <code>Amount</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>Amount</code> property.<br>
     */
    public void setAmount(final BigDecimal pAmount) {
        this.amount = pAmount;
    }

    /**
     * Sets the <code>commodityNumber</code> property.
     * <p>
     * <b>Format: </b><br>
     * IATA or ATPCO List
     * <p>
     * <b>Example: </b><br>
     * IATA
     * <p>
     * 
     * @param pCommodityNumber
     *            the current value of the <code>commodityNumber</code> property.
     */
    public void setCommodityNumber(final String pCommodityNumber) {
        this.commodityNumber = ContractUtility.convertToUpperCase(pCommodityNumber);
    }

    /**
     * Sets the <code>DateRangeDto</code> property.
     * <p>
     * 
     * @param pDateRangeDto
     *            the current value of the <code>dateRangeDto</code> property.<br>
     */
    public void setDateRangeDto(final DateRangeDto pDateRangeDto) {
        this.dateRangeDto = pDateRangeDto;
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
     * Sets the <code>jointRatePercentageDtos</code> property.
     * <p>
     * 
     * @param pJointRatePercentageDtos
     *            the current value of the <code>jointRatePercentageDtos</code> property.
     */
    public void setJointRatePercentageDtos(final List<JointRatePercentageDto> pJointRatePercentageDtos) {
        if (this.jointRatePercentageDtos == null) {
            this.jointRatePercentageDtos = new ArrayList<JointRatePercentageDto>();
        }
        this.jointRatePercentageDtos = pJointRatePercentageDtos;
    }

    /**
     * Sets the <code>MinimumWeight</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-7.1 Numeric
     * <p>
     * <b>Example: </b><br>
     * 125
     * <p>
     * 
     * @param pMinimumWeight
     *            the current value of the <code>MinimumWeight</code> property.
     */
    public void setMinimumWeight(final BigDecimal pMinimumWeight) {
        this.minimumWeight = pMinimumWeight;
    }

    /**
     * Sets the <code>OId</code> property.
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
     * 1-9.1-4 Numeric
     * <p>
     * <b>Example: </b><br>
     * 123.4567
     * <p>
     * 
     * @param pOverPivotRate
     *            the current value of the <code>OverPivotRate</code> property.
     */
    public void setOverPivotRate(final BigDecimal pOverPivotRate) {
        this.overPivotRate = pOverPivotRate;
    }

    /**
     * Sets the <code>PivotWeight</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-7.1 Numeric
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
     * Sets the <code>RateClass</code> property.
     * <p>
     * <b>Example: </b><br>
     * M
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
        this.rateSource =ContractUtility.convertToUpperCase(pRateSource);
    }

    /**
     * Sets the <code>RateTypeCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * GEN
     * <p>
     * 
     * @param pRateTypeCode
     *            the current value of the <code>RateTypeCode</code> property.
     */
    public void setRateTypeCode(final String pRateTypeCode) {
        this.rateTypeCode = ContractUtility.convertToUpperCase(pRateTypeCode);
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
     * Sets the <code>RatingNoteCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-2 for ATPCO or 4 for IATA Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * IA01,T1,R
     * <p>
     * 
     * @param pRatingNoteCode
     *            the new value of the <code>ratingNoteCode</code> property.
     */
    public void setRatingNoteCode(final String pRatingNoteCode) {
        this.ratingNoteCode = ContractUtility.convertToUpperCase(pRatingNoteCode);
    }

    /**
     * Sets the <code>UldType</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-3 AlphaNumeric
     * <p>
     * <b>Example: </b><br>
     * 1S
     * <p>
     * 
     * @param pUldType
     *            the current value of the <code>uldType</code> property.
     */
    public void setUldType(final String pUldType) {
        this.uldType = ContractUtility.convertToUpperCase(pUldType);
    }
    /**
     * Sets the <code>UserAudit</code> property.
     * <p>
     * 
     * @param pUserAuditDto
     *            the current value of the <code>UserAuditDto</code> property.<br>
     * 
     */

    public void setUserAuditDto(final UserAuditDto pUserAuditDto) {
        this.userAuditDto = pUserAuditDto;
    }
    /**
     * Sets the <code>WeightUnit</code> property.
     * <p>
     * <b>Format: </b><br>
     * KG or LB List
     * <p>
     * <b>Example: </b><br>
     * KG
     * <p>
     * 
     * @param pWeightUnit
     *            the current value of the <code>WeightUnit</code> property.
     */
    public void setWeightUnit(final WeightUOMType pWeightUnit) {
        this.weightUnit = pWeightUnit;
    }
}