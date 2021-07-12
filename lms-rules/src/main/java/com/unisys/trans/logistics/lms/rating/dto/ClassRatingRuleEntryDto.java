/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.DateRangeDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.UserAuditDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.rating.dto.constants.ActionType;
import com.unisys.trans.logistics.lms.rating.dto.constants.ClassRatingType;
import com.unisys.trans.logistics.lms.rating.dto.constants.RatingRuleType;

/**
 * <code>ClassRatingRuleEntryDto</code> contain details of
 * ClassRatingRuleEntries.
 * <p>
 * This contains all information about ClassRatingRule.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>oId
 * <li>actionType
 * <li>biDirectionalIndicator
 * <li>classRatingType
 * <li>currencyCode
 * <li>ratingRuleType
 * <li>weightUnit
 * <li>amount
 * <li>ruleReference
 * <li>minimumWeight
 * <li>percentage
 * <li>rateTypeCode
 * <li>origin
 * <li>destination
 * <li>userAuditDto
 * <li>dateRangeDto
 * <li>error
 * </ul>
 */
public class ClassRatingRuleEntryDto extends PersistenceObjectDto {

    /**
     * Default serial Version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>actionType</code> property.
     */

    private ActionType actionType;

    /**
     * Attribute to hold <code>amount</code> property.
     */

    private BigDecimal amount;

    /**
     * Attribute to hold <code>biDirectionalIndicator</code> property.
     */

    private boolean biDirectionalIndicator;

    /**
     * Attribute to hold <code>classRatingType</code> property.
     */

    private ClassRatingType classRatingType;

    /**
     * Attribute to hold <code>currencyCode</code> property.
     */

    private String currencyCode;

    /**
     * Attribute to hold <code>dateRangeDto</code> property.
     */

    private DateRangeDto dateRangeDto;

    /**
     * Attribute to hold <code>destination</code> property.
     */

    private GeographicDataDto destination;

    /**
     * Attribute to hold <code>error</code> property.
     */

    private boolean error;

    /**
     * Attribute to hold <code>iataAreaCodeFrom</code> property.
     */

    private int iataAreaCodeFrom;

    /**
     * Attribute to hold <code>iataAreaCodeTo</code> property.
     */

    private int iataAreaCodeTo;

    /**
     * Attribute to hold <code>iataDispPriority</code> property.
     */

    private int iataDispPriority;

    /**
     * Attribute to hold <code>minimumWeight</code> property.
     */

    private BigDecimal minimumWeight;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>oriDstDisplayPriority</code> property.
     */

    private int oriDstDisplayPriority;

    /**
     * Attribute to hold <code>origin</code> property.
     */

    private GeographicDataDto origin;

    /**
     * Attribute to hold <code>percentage</code> property.
     */

    private Integer percentage;

    /**
     * Attribute to hold <code>rateTypeCode</code> property.
     */

    private String rateTypeCode;

    /**
     * Attribute to hold <code>rateTypePriority</code> property.
     */
    private Integer rateTypePriority;

    /**
     * Attribute to hold <code>classRatingRuleType</code> property.
     */

    private RatingRuleType ratingRuleType;

    /**
     * Attribute to hold <code>ruleReference</code> property.
     */

    private String ruleReference;

    /**
     * Attribute to hold <code>userAuditDto</code> property.
     */

    private UserAuditDto userAuditDto;

    /**
     * Attribute to hold <code>weightUnit</code> property.
     */

    private WeightUOMType weightUnit;

    /**
     * This compareDifferenceForUpdate used to compare values. It checks the
     * current and passing object values and returns boolean value accordingly
     * 
     * @param pObj
     *            the current value of the <code>Object</code> property.
     * @return boolean value
     */
    @Override
    public boolean equals(final Object pObj) {

        boolean value = true;
        if (this == pObj) {
            value = true;
        }
        else if (pObj == null) {

            value = false;
        }
        else if (getClass() != pObj.getClass()) {
            value = false;
        }
        else {

            final ClassRatingRuleEntryDto other = (ClassRatingRuleEntryDto) pObj;

            if (this.getRateTypeCode() != null && !this.getRateTypeCode().equalsIgnoreCase(
                other.getRateTypeCode())) {
                value = false;
            }

            if (value && this.getMinimumWeight() == null) {
                if (other.getMinimumWeight() != null) {
                    value = false;
                }
            }
            else if (value
                        && (other.getMinimumWeight() == null || (this
                                    .getMinimumWeight() != null && this
                                    .getMinimumWeight().compareTo(
                                        other.getMinimumWeight()) != 0))) {
                value = false;
            }

            if (value && this.getRatingRuleType() == null) {
                if (other.getRatingRuleType() != null) {
                    value = false;
                }
            }
            else if (value
                        && (other.getRatingRuleType() == null || this
                                    .getRatingRuleType() != other.getRatingRuleType())) {
                value = false;
            }
            if (value && this.getClassRatingType() == null) {
                if (other.getClassRatingType() != null) {
                    value = false;
                }
            }
            else if (value
                        && (other.getClassRatingType() == null || this
                                    .getClassRatingType() != other.getClassRatingType())) {
                value = false;
            }
            // Overlapping Dates
            if (value) {
                if (this.getDateRangeDto() == null) {
                    if (other.getDateRangeDto() != null) {
                        value = false;
                    }
                }
                else if (other.getDateRangeDto() == null) {
                    value = false;
                }
                else if (this.getDateRangeDto() != null && !this.getDateRangeDto().equals(
                    other.getDateRangeDto())) {
                    value = false;
                }
            }
            if (value) {
                if (this.getOrigin().getCode() != null && !this.getOrigin().getCode()
                            .equalsIgnoreCase(other.getOrigin().getCode())) {
                    value = false;
                }
                if (value
                            && this.getDestination()
                                        .getCode() != null && !this.getDestination()
                                        .getCode()
                                        .equalsIgnoreCase(
                                            other.getDestination().getCode())) {
                    value = false;
                }
                if (this.getOrigin().getCode()
                            .equalsIgnoreCase(other.getDestination().getCode())
                            && this.getDestination().getCode()
                                        .equalsIgnoreCase(other.getOrigin().getCode())) {
                    if (!this.getOrigin().getCode().equals(this.getDestination().getCode())) {
                        value = this.biDirectionalIndicator && other.biDirectionalIndicator;
                    }
                }

            }
        }
        return value;
    }

    /**
     * Gets the <code>ActionType</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * COUNTRYTAXCREATE
     * <p>
     * 
     * @return the current value of the <code>ActionType</code> property.
     */

    public ActionType getActionType() {
        return this.actionType;
    }

    /**
     * Gets the <code>Amount</code> property.
     * <p>
     * 
     * @return the current value of the <code>Amount</code> property.<br>
     */

    public BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * Gets the <code>BiDirectionalIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>BiDirectionalIndicator</code> property.
     */

    public boolean getBiDirectionalIndicator() {
        return this.biDirectionalIndicator;
    }

    /**
     * Gets the <code>ClassRatingType</code> property.
     * <p>
     * <b>Format: </b><br>
     * Enum
     * <p>
     * <b>Example: </b><br>
     * Join Class Rating
     * <p>
     * 
     * @return the current value of the <code>classRatingType</code> property.
     */

    public ClassRatingType getClassRatingType() {
        return this.classRatingType;
    }

    /**
     * Gets the <code>CurrencyCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * USD
     * <p>
     * 
     * @return the current value of the <code>CurrencyCode</code> property.
     */

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.framework.dto.DateRangeDto
     * DateRangeDto} containing <code>DateRangeDto</code> details.
     * <p>
     * 
     * @return the current value of <code>DateRangeDto</code> details.
     */
    public DateRangeDto getDateRangeDto() {

        if (this.dateRangeDto == null) {
            this.dateRangeDto = new DateRangeDto();
        }
        return this.dateRangeDto;
    }

    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.rating.dto.GeographicDataDto
     * GeographicDataDto} containing <code>GeographicDataDto</code> details.
     * <p>
     * 
     * @return the current value of the <code>Destination</code> property.
     */

    public GeographicDataDto getDestination() {
        if (this.destination == null) {
            this.destination = new GeographicDataDto();
        }
        return this.destination;
    }

    /**
     * Gets the <code>IataAreaCodeFrom</code> property.
     * <p>
     * 
     * @return the current value of the <code>iataAreaCodeFrom</code> property.<br>
     */

    public int getIataAreaCodeFrom() {
        return this.iataAreaCodeFrom;
    }

    /**
     * Gets the <code>iataAreaCodeTo</code> property.
     * <p>
     * 
     * @return the current value of the <code>iataAreaCodeTo</code> property.<br>
     */

    public int getIataAreaCodeTo() {
        return this.iataAreaCodeTo;
    }

    /**
     * Gets the <code>IataDispPriority</code> property.
     * <p>
     * 
     * @return the current value of the <code>iataDispPriority</code> property.<br>
     */

    public int getIataDispPriority() {
        return this.iataDispPriority;
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
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>OriDstDisplayPriority</code> property.
     * <p>
     * 
     * @return the current value of the <code>oriDstDisplayPriority</code> property.<br>
     */

    public int getOriDstDisplayPriority() {
        return this.oriDstDisplayPriority;
    }

    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.rating.dto.GeographicDataDto
     * GeographicDataDto} containing <code>GeographicDataDto</code> details.
     * <p>
     * 
     * @return the current value of the <code>Origin</code> property.
     */

    public GeographicDataDto getOrigin() {
        if (this.origin == null) {
            this.origin = new GeographicDataDto();
        }
        return this.origin;
    }

    /**
     * Gets the <code>Percentage</code> property.
     * <p>
     * <b>Format: </b><br>
     * Numeric
     * <p>
     * <b>Example: </b><br>
     * 100
     * <p>
     * 
     * @return the current value of the <code>Percentage</code> property.
     */

    public Integer getPercentage() {
        return this.percentage;
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
     * Gets the <code>RatingRuleType</code> property.
     * <p>
     * <b>Format: </b><br>
     * Enum
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @return the current value of the <code>ratingRuleType</code> property.
     */

    public RatingRuleType getRatingRuleType() {
        return this.ratingRuleType;
    }

    /**
     * Gets the <code>RuleReference</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-3 AN
     * <p>
     * <b>Example: </b><br>
     * D
     * <p>
     * 
     * @return the current value of the <code>RuleReference</code> property.
     */

    public String getRuleReference() {
        return this.ruleReference;
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

    /**
     * Gets the <code>Error</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @return the current value of the <code>Error</code> property.
     */

    public boolean isError() {
        return this.error;
    }

    /**
     * Sets the <code>ActionType</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * COUNTRYTAXCREATE
     * <p>
     * 
     * @param pActionType
     *            the current value of the <code>ActionType</code> property.
     */

    public void setActionType(final ActionType pActionType) {
        this.actionType = pActionType;
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
     * Sets the <code>BiDirectionalIndicator</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pBiDirectionalIndicator
     *            the current value of the <code>BiDirectionalIndicator</code> property.
     */
    public void setBiDirectionalIndicator(final boolean pBiDirectionalIndicator) {
        this.biDirectionalIndicator = pBiDirectionalIndicator;
    }

    /**
     * Sets the <code>ClassRatingType</code> property.
     * <p>
     * <b>Format: </b><br>
     * Enum
     * <p>
     * <b>Example: </b><br>
     * Join Class Rating
     * <p>
     * 
     * @param pClassRatingType
     *            the current value of the <code>ClassRatingType</code> property.
     */

    public void setClassRatingType(final ClassRatingType pClassRatingType) {
        this.classRatingType = pClassRatingType;
    }

    /**
     * Sets the <code>CurrencyCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * USD
     * <p>
     * 
     * @param pCurrencyCode
     *            the current value of the <code>CurrencyCode</code> property.
     */
    public void setCurrencyCode(final String pCurrencyCode) {
        this.currencyCode = ContractUtility.convertToUpperCase(pCurrencyCode);
    }

    /**
     * Sets the list of {@link com.unisys.trans.logistics.lms.framework.dto.DateRangeDto
     * DateRangeDto} containing <code>DateRange</code> details.
     * <p>
     * 
     * @param pDateRangeDto
     *            holds the new value of <code>DateRangeDto</code> type details.<br>
     */
    public void setDateRangeDto(final DateRangeDto pDateRangeDto) {
        this.dateRangeDto = pDateRangeDto;
    }

    /**
     * Sets the list of {@link com.unisys.trans.logistics.lms.rating.dto.GeographicDataDto
     * GeographicDataDto} containing <code>GeographicDataDto</code> details.
     * <p>
     * 
     * @param pDestination
     *            the current value of the <code>Destination</code> property.
     */

    public void setDestination(final GeographicDataDto pDestination) {

        this.destination = pDestination;
    }

    /**
     * Sets the <code>Error</code> property.
     * <p>
     * <b>Format: </b><br>
     * Yes/No boolean
     * <p>
     * <b>Example: </b><br>
     * Yes
     * <p>
     * 
     * @param pError
     *            the current value of the <code>error</code> property.
     */

    public void setError(final boolean pError) {
        this.error = pError;
    }

    /**
     * Sets the <code>IataAreaCodeFrom</code> property.
     * <p>
     * 
     * @param pIataAreaCodeFrom
     *            the current value of the <code>iataAreaCodeFrom</code> property.
     */

    public void setIataAreaCodeFrom(final int pIataAreaCodeFrom) {
        this.iataAreaCodeFrom = pIataAreaCodeFrom;
    }

    /**
     * Sets the <code>IataAreaCodeTo</code> property.
     * <p>
     * 
     * @param pIataAreaCodeTo
     *            the current value of the <code>iataAreaCodeTo</code> property.
     */

    public void setIataAreaCodeTo(final int pIataAreaCodeTo) {
        this.iataAreaCodeTo = pIataAreaCodeTo;
    }

    /**
     * Sets the <code>IataDispPriority</code> property.
     * <p>
     * 
     * @param pIataDispPriority
     *            the current value of the <code>iataDispPriority</code> property.
     */
    public void setIataDispPriority(final int pIataDispPriority) {
        this.iataDispPriority = pIataDispPriority;
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
     * Sets the <code>OriDstDisplayPriority</code> property.
     * <p>
     * 
     * @param pOriDstDisplayPriority
     *            the current value of the <code>oriDstDisplayPriority</code> property.
     */
    public void setOriDstDisplayPriority(final int pOriDstDisplayPriority) {
        this.oriDstDisplayPriority = pOriDstDisplayPriority;
    }

    /**
     * Sets the list of {@link com.unisys.trans.logistics.lms.rating.dto.GeographicDataDto
     * GeographicDataDto} containing <code>GeographicDataDto</code> details.
     * <p>
     * 
     * @param pOrigin
     *            the current value of the <code>Origin</code> property.
     */

    public void setOrigin(final GeographicDataDto pOrigin) {
        this.origin = pOrigin;
    }

    /**
     * Sets the <code>Percentage</code> property.
     * <p>
     * <b>Format: </b><br>
     * Numeric
     * <p>
     * <b>Example: </b><br>
     * 125
     * <p>
     * 
     * @param pPercentage
     *            the current value of the <code>Percentage</code> property.
     */
    public void setPercentage(final Integer pPercentage) {
        this.percentage = pPercentage;
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
     * Gets the <code>RatingRuleType</code> property.
     * <p>
     * <b>Format: </b><br>
     * Enum
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @param pRatingRuleType
     *            the current value of the <code>ratingRuleType</code> property.
     */

    public void setRatingRuleType(final RatingRuleType pRatingRuleType) {
        this.ratingRuleType = pRatingRuleType;
    }

    /**
     * Sets the <code>RuleReference</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-3 AN
     * <p>
     * <b>Example: </b><br>
     * D
     * <p>
     * 
     * @param pRuleReference
     *            the current value of the <code>RuleReference</code> property.
     */

    public void setRuleReference(final String pRuleReference) {
        this.ruleReference = ContractUtility.convertToUpperCase(pRuleReference);
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
