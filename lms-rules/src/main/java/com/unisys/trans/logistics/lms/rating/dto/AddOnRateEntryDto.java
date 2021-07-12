/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.framework.dto.DateRangeDto;
import com.unisys.trans.logistics.lms.framework.dto.TapeRateEntry;
import com.unisys.trans.logistics.lms.framework.dto.UserAuditDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.rating.dto.constants.ActionType;
import com.unisys.trans.logistics.lms.rating.dto.constants.DirectionType;
import com.unisys.trans.logistics.lms.rating.dto.constants.ULDChargeType;
import com.unisys.trans.logistics.lms.rating.dto.constants.UpdateSourceType;
import com.unisys.trans.logistics.lms.utils.dto.constants.RateClassType;

/**
 * <code>AddOnRateEntryDto</code> contain details of AddOnRate.
 * <p>
 * This contains all information about AddOnRate.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>amount
 * <li>oId
 * <li>currencyCode
 * <li>dateRange
 * <li>minimumWeight
 * <li>overPivotRate
 * <li>rateSource
 * <li>rateType
 * <li>uldChargeCode
 * <li>uldTypeCode
 * <li>iataAreaZone
 * <li>plusOrMinusIndicator
 * <li>direction
 * <li>userAudit
 * <li>rateClassCode
 * <li>cityCode
 * <li>rateConstructionAreaCode
 * </ul>
 */
public class AddOnRateEntryDto extends TapeRateEntry {
	

   

	/**
     * Default serial version id.
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
     * Attribute to hold <code>cityCode</code> property.
     */

    private String cityCode;

    /**
     * Attribute to hold <code>currencyCode</code> property.
     */
    private String currencyCode;

    /**
     * Attribute to hold <code>dateRangeDto</code> property.
     */
    private DateRangeDto dateRangeDto;

    /**
     * Attribute to hold <code>direction</code> property.
     */
    private DirectionType direction;

    /**
     * Attribute to hold <code>error</code> property.
     */
    private boolean error;

    /**
     * Attribute to hold <code>iataAreaZone</code> property.
     */

    private int iataAreaZone;

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
     * Attribute to hold <code>plusOrMinusIndicator</code> property.
     */
    private String plusOrMinusIndicator;

    /**
     * Attribute to hold <code>rateClassCode</code> property.
     */
    private RateClassType rateClassCode;

    /**
     * Attribute to hold <code>rateConstructionAreaCode</code> property.
     */
    private Integer rateConstructionAreaCode;

    /**
     * Attribute to hold <code>rateSourceCode</code> property.
     */
    private String rateSourceCode;

    /**
     * Attribute to hold <code>rateTypeCode</code> property.
     */

    private String rateTypeCode;

    /**
     * Attribute to hold <code>rateTypePriority</code> property.
     */
    private Integer rateTypePriority;

    /**
     * Attribute to hold <code>uldChargeCode</code> property.
     */
    private ULDChargeType uldChargeCode;

    /**
     * Attribute to hold <code>uldType</code> property.
     */
    private String uldTypeCode;

    /**
     * Attribute to hold <code>userAudit</code> property.
     */

    private UserAuditDto userAudit;

    /**
     * Attribute to hold <code>updateSource</code> property.
     */
    private UpdateSourceType updateSource;

    /**
     * Gets the <code>AddOnRateEntryDto</code> property.
     * <p>
     * <b>Format: </b><br>
     * boolean
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @param pObj
     *            the new value of the <code>object</code> property.
     * @return the current value of the <code>AddOnRateEntryDto</code> property.
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
        else if (!(pObj instanceof AddOnRateEntryDto)) {
            isEqual = false;
        }
        else {

            final AddOnRateEntryDto other = (AddOnRateEntryDto) pObj;

            // City of construction
            if (this.getCityCode() == null || this.getCityCode().isEmpty()) {
                if (other.getCityCode() != null && !other.getCityCode().isEmpty()) {
                    isEqual = false;
                }
            }
            else if (!this.getCityCode().equalsIgnoreCase(other.getCityCode())) {
                isEqual = false;
            }

            // currency code
            if (this.getCurrencyCode() == null || this.getCurrencyCode().isEmpty()) {
                if (other.getCurrencyCode() != null && !other.getCurrencyCode().isEmpty()) {
                    isEqual = false;
                }
            }
            else if (!this.getCurrencyCode().equalsIgnoreCase(other.getCurrencyCode())) {
                isEqual = false;
            }

            // date range
            if (this.dateRangeDto == null) {
                if (other.dateRangeDto != null) {
                    isEqual = false;
                }
            }
            else if (!this.dateRangeDto.equals(other.dateRangeDto)) {
                isEqual = false;
            }

            // minimum weight
            if (this.getMinimumWeight() == null) {
                if (other.getMinimumWeight() != null) {
                    isEqual = false;
                }
            }
            else if (other.getMinimumWeight() != null
                        && this.getMinimumWeight().compareTo(other.getMinimumWeight()) != 0) {
                isEqual = false;
            }

            // Rate construction Area
            if (this.getRateConstructionAreaCode() == null) {
                if (other.getRateConstructionAreaCode() != null) {
                    isEqual = false;
                }
            }
            else if (other.getRateConstructionAreaCode() != null
                        && this.getRateConstructionAreaCode()
                                    .compareTo(other.getRateConstructionAreaCode()) != 0) {
                isEqual = false;
            }
            // Over pivot rate
            if (this.getOverPivotRate() == null) {
                if (other.getOverPivotRate() != null) {
                    isEqual = false;
                }
            }
            else if (other.getOverPivotRate() != null
                        && this.getOverPivotRate().compareTo(other.getOverPivotRate()) != 0) {
                isEqual = false;
            }

            // Pivot weight
            if (this.getPivotWeight() == null) {
                if (other.getPivotWeight() != null) {
                    isEqual = false;
                }
            }
            else if (other.getPivotWeight() != null
                        && this.getPivotWeight().compareTo(other.getPivotWeight()) != 0) {
                isEqual = false;
            }

            // Rate class
            if (this.getRateClassCode() != other.getRateClassCode()) {
                isEqual = false;
            }

            // Rate Source
            if (this.getRateSourceCode() == null || this.getRateSourceCode().isEmpty()) {
                if (other.getRateSourceCode() != null && !other.getRateSourceCode().isEmpty()) {
                    isEqual = false;
                }
            }
            else if (!this.getRateSourceCode().equalsIgnoreCase(other.getRateSourceCode())) {
                isEqual = false;
            }

            // Rate Type
            if (this.getRateTypeCode() == null || this.getRateTypeCode().isEmpty()) {
                if (other.getRateTypeCode() != null && !other.getRateTypeCode().isEmpty()) {
                    isEqual = false;
                }
            }
            else if (!this.getRateTypeCode().equalsIgnoreCase(other.getRateTypeCode())) {
                isEqual = false;
            }

            // Uld charge code
            if (this.getUldChargeCode() != other.getUldChargeCode()) {
                isEqual = false;
            }

            // DirectionType
            if (this.getDirection() == null) {
                if (other.getDirection() != null) {
                    isEqual = false;
                }
            }
            else if (!this.getDirection().equals(other.getDirection())) {
                isEqual = false;
            }
            // Uld type
            if (this.getUldTypeCode() == null || this.getUldTypeCode().isEmpty()) {
                if (other.getUldTypeCode() != null && !other.getUldTypeCode().isEmpty()) {
                    isEqual = false;
                }
            }
            else if (!this.getUldTypeCode().equals(other.getUldTypeCode())) {
                isEqual = false;
            }
        }
        return isEqual;
    }

    /**
     * Gets the <code>ActionType</code> property.
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
     * Gets the <code>Amount</code> property.
     * <p>
     * 
     * @return the current value of the <code>amount</code> property.<br>
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Gets the <code>cityCode</code> property.
     * <p>
     * Indicates the IATA city code.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets(Upper Case)
     * <p>
     * <b>Example: </b><br>
     * CHI
     * <p>
     * 
     * @return the current value of <code>cityCode</code> of the city.<br>
     */
    public String getCityCode() {
        return this.cityCode;
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
     * @return the current value of the <code>currencyCode</code> property.
     */

    public String getCurrencyCode() {
        return this.currencyCode;
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
     * Gets the <code>direction</code> property.
     * <p>
     * <b>Format: </b><br>
     * <p>
     * <b>Example: </b><br>
     * B, F , T
     * <p>
     * 
     * @return the current value of the <code>direction</code> property.
     */
    public DirectionType getDirection() {
        return this.direction;
    }

    /**
     * Gets the <code>iataAreaZone</code> property.
     * <p>
     * 
     * @return the current value of the <code>iataAreaZone</code> property.
     */

    public int getIataAreaZone() {
        return this.iataAreaZone;
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
     * Gets the <code>oId</code> property.
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
     * Gets the <code>plusOrMinusIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>plusOrMinusIndicator</code> property.<br>
     */
    public String getPlusOrMinusIndicator() {
        return this.plusOrMinusIndicator;
    }

    /**
     * Gets the <code>RateClassCode</code> property.
     * <p>
     * <b>Example: </b><br>
     * M
     * <p>
     * 
     * @return the current value of the <code>rateClassCode</code> property.
     */
    public RateClassType getRateClassCode() {
        return this.rateClassCode;
    }

    /**
     * Gets the <code>rateConstructionAreaCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Numeric
     * <p>
     * <b>Example: </b><br>
     * 201
     * <p>
     * 
     * @return the current value of the <code>rateConstructionAreaCode</code> property.
     */
    public Integer getRateConstructionAreaCode() {
        return this.rateConstructionAreaCode;
    }

    /**
     * Gets the <code>rateSourceCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Characters
     * <p>
     * <b>Example: </b><br>
     * IRI
     * <p>
     * 
     * @return the current value of the <code>rateSourceCode</code> property.
     */

    public String getRateSourceCode() {
        return this.rateSourceCode;
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
     * Gets the <code>ULDChargeType</code> property.
     * <p>
     * <b>Format: </b><br>
     * List
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @return the current value of the <code>uldChargeCode</code> property.
     */
    public ULDChargeType getUldChargeCode() {
        return this.uldChargeCode;
    }

    /**
     * Gets the <code>uldTypeCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-3 AlphaNumeric
     * <p>
     * <b>Example: </b><br>
     * 1S
     * <p>
     * 
     * @return the current value of the <code>uldTypeCode</code> property.
     */
    public String getUldTypeCode() {
        return this.uldTypeCode;
    }

    /**
     * Gets the <code>UserAuditDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>userAudit</code> property.
     */
    public UserAuditDto getUserAudit() {
        if (this.userAudit == null) {
            this.userAudit = new UserAuditDto();
        }
        return this.userAudit;
    }

    /**
     * Gets the <code>UpdateSourceType</code> property.
     * <p>
     * 
     * @return the current value of the <code>updateSource</code> property.
     */
    public UpdateSourceType getUpdateSource() {
        return this.updateSource;
    }

    /**
     * The<code>hashCode </code> object.
     * <p>
     * 
     * @return <code>int</code> hashCode of super class.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((action == null) ? 0 : action.hashCode());
        result = prime * result + ((amount == null) ? 0 : amount.hashCode());
        result = prime * result
                    + ((cityCode == null) ? 0 : cityCode.hashCode());
        result = prime * result
                    + ((currencyCode == null) ? 0 : currencyCode.hashCode());
        result = prime * result
                    + ((dateRangeDto == null) ? 0 : dateRangeDto.hashCode());
        result = prime * result
                    + ((direction == null) ? 0 : direction.hashCode());
        result = prime * result + iataAreaZone;
        result = prime * result
                    + ((minimumWeight == null) ? 0 : minimumWeight.hashCode());
        result = prime * result + ((oId == null) ? 0 : oId.hashCode());
        result = prime * result
                    + ((overPivotRate == null) ? 0 : overPivotRate.hashCode());
        result = prime * result
                    + ((pivotWeight == null) ? 0 : pivotWeight.hashCode());
        result = prime
                    * result
                    + ((plusOrMinusIndicator == null) ? 0 : plusOrMinusIndicator
                                .hashCode());
        result = prime * result
                    + ((rateClassCode == null) ? 0 : rateClassCode.hashCode());
        result = prime
                    * result
                    + ((rateConstructionAreaCode == null) ? 0
                                : rateConstructionAreaCode.hashCode());
        result = prime * result
                    + ((rateSourceCode == null) ? 0 : rateSourceCode.hashCode());
        result = prime * result
                    + ((rateTypeCode == null) ? 0 : rateTypeCode.hashCode());
        result = prime * result
                    + ((uldChargeCode == null) ? 0 : uldChargeCode.hashCode());
        result = prime * result
                    + ((uldTypeCode == null) ? 0 : uldTypeCode.hashCode());
        result = prime * result
                    + ((userAudit == null) ? 0 : userAudit.hashCode());
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
     * Sets the <code>cityCode</code> property.
     * <p>
     * Indicates the IATA city code.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets(Upper Case)
     * <p>
     * <b>Example: </b><br>
     * CHI
     * <p>
     * 
     * @param pCityCode
     *            the new value of the <code>cityCode</code>.
     */

    public void setCityCode(final String pCityCode) {
        this.cityCode = ContractUtility.convertToUpperCase(pCityCode);
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
        this.currencyCode = ContractUtility
                    .convertToUpperCase(pCurrencyCode);
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
     * Sets the <code>DirectionType</code> property.
     * <p>
     * <b>Format: </b><br>
     * <p>
     * <b>Example: </b><br>
     * B, F, T
     * <p>
     * 
     * @param pDirection
     *            the current value of the <code>direction</code> property.
     */

    public void setDirection(final DirectionType pDirection) {
        this.direction = pDirection;
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
     * Sets the <code>iataAreaZone</code> property.
     * <p>
     * 
     * @param pIataAreaZone
     *            the current value of the <code>iataAreaZone</code> property.<br>
     */
    public void setIataAreaZone(final int pIataAreaZone) {
        this.iataAreaZone = pIataAreaZone;
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
     * Sets the <code>plusOrMinusIndicator</code> property.
     * <p>
     * 
     * @param pPlusOrMinusIndicator
     *            the current value of the <code>plusOrMinusIndicator</code> property.<br>
     */

    public void setPlusOrMinusIndicator(final String pPlusOrMinusIndicator) {
        this.plusOrMinusIndicator = pPlusOrMinusIndicator;
    }

    /**
     * Sets the <code>RateClassCode</code> property.
     * <p>
     * <b>Example: </b><br>
     * M
     * <p>
     * 
     * @param pRateClassCode
     *            the current value of the <code>RateClassCode</code> property.
     */
    public void setRateClassCode(final RateClassType pRateClassCode) {
        this.rateClassCode = pRateClassCode;
    }

    /**
     * Sets the <code>rateConstructionAreaCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Numeric
     * <p>
     * <b>Example: </b><br>
     * 201
     * <p>
     * 
     * @param pRateConstructionAreaCode
     *            the current value of the <code>rateConstructionAreaCode</code> property.
     */
    public void setRateConstructionAreaCode(
                final Integer pRateConstructionAreaCode) {
        this.rateConstructionAreaCode = pRateConstructionAreaCode;
    }

    /**
     * Sets the <code>rateSourceCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * IRI
     * <p>
     * 
     * @param pRateSourceCode
     *            the new value of the <code>rateSourceCode</code> property.
     */

    public void setRateSourceCode(final String pRateSourceCode) {
        this.rateSourceCode = ContractUtility
                    .convertToUpperCase(pRateSourceCode);
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
     *            the current value of the <code>rateTypeCode</code> property.
     */

    public void setRateTypeCode(final String pRateTypeCode) {
        this.rateTypeCode = ContractUtility
                    .convertToUpperCase(pRateTypeCode);
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
     * Sets the <code>uldChargeCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * List
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @param pUldChargeCode
     *            the current value of the <code>uldChargeCode</code> property.
     */
    public void setUldChargeCode(final ULDChargeType pUldChargeCode) {
        this.uldChargeCode = pUldChargeCode;
    }

    /**
     * Sets the <code>uldTypeCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-3 AlphaNumeric
     * <p>
     * <b>Example: </b><br>
     * 1S
     * <p>
     * 
     * @param pUldTypeCode
     *            the current value of the <code>uldTypeCode</code> property.
     */
    public void setUldTypeCode(final String pUldTypeCode) {
        this.uldTypeCode = ContractUtility
                    .convertToUpperCase(pUldTypeCode);
    }

    /**
     * Sets the <code>UserAuditDto</code> property.
     * <p>
     * <b>Format: </b><br>
     * KG or LB List
     * <p>
     * <b>Example: </b><br>
     * KG
     * <p>
     * 
     * @param pUserAudit
     *            the current value of the <code>userAudit</code> property.
     */
    public void setUserAudit(final UserAuditDto pUserAudit) {
        this.userAudit = pUserAudit;
    }

    /**
     * Sets the <code>UpdateSourceType</code> property.
     * <p>
     * <b>Format: </b><br>
     * KG or LB List
     * <p>
     * <b>Example: </b><br>
     * KG
     * <p>
     * 
     * @param pUpdateSource
     *            the current value of the <code>updateSource</code> property.
     */
    public void setUpdateSource(final UpdateSourceType pUpdateSource) {
        this.updateSource = pUpdateSource;
    }

}
