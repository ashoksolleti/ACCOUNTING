/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <code>RoundingFactorDto</code> contains specific data applicable to the <code>Currency</code>.
 * <p>
 * <code>RoundingFactorDto</code> contains information about rounding factor value and decimal positions and
 * their effective start date and end date values.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>currencyInfoOId
 * <li>decimalPositions
 * <li>discontinueDate
 * <li>effectiveDate
 * <li>oId
 * <li>roundingFactor
 * </code>
 * </ul>
 */
public class RoundingFactorDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -5160087612216381615L;

    /**
     * Attribute to hold <code>currencyInfoOId</code> property.
     */
    private Long currencyInfoOId;

    /**
     * Attribute to hold <code>decimalPositions</code> property.
     * <p>
     * This indicates the number of decimal positions allowed for a currency.<br>
     * Default decimal position’s value is 2.<br>
     */
    private Integer decimalPositions;

    /**
     * Attribute to hold <code>effectiveDate</code> property.
     * <p>
     * <code> EffectiveDate</code> is the start date of the rounding factor and the decimal position.<br>
     * Effective date of rounding factor/decimal position must be at least one day greater than the latest
     * rounding factor's effective date for the currency.<br>
     * It must be greater than the current date (today).<br>
     * Default value of the effective date is system current date + 1 .<br>
     */
    private Date effectiveDate;

    /**
     * Attribute to hold <code>endDate</code> property.
     * <p>
     * <code>EndDate</code> is the ending date of the rounding factor and decimal position.<br>
     * When a new rounding factor/decimal position is created, the current rounding factor and decimal
     * position is end dated to the day before the effective date of new rounding factor and decimal position.
     * This is a generated field.<br>
     */
    private Date endDate;

    /**
     * Attribute to hold <code>oId</code> property.
     * <p>
     * Unique key identify the <code>CurrencyDto</code>.It is of type Long.<br>
     */
    private Long oId;

    /**
     * Attribute to hold <code>roundingFactor</code> property.
     * <p>
     * The rounding factor defaults to 0.01 when value is blank.<br>
     * <code>RoundingFactor</code> has the minimum value of 0.00001
     */
    private BigDecimal roundingFactor;

    /**
     * <code>Default constructor. </code>
     */
    public RoundingFactorDto() {

    }

    /**
     * Gets the <code>currencyInfoOId</code> property.
     * <p>
     * 
     * @return the current value of <code>currencyInfoOId</code> property.
     */
    public Long getCurrencyInfoOId() {
        return this.currencyInfoOId;
    }

    /**
     * Gets the <code>decimalPositions</code> property.
     * <p>
     * decimal positions determine the precision in terms of the number of decimals.
     * <p>
     * <b>Format: </b><br>
     * Numeric<br>
     * Range: 0-5
     * <p>
     * <b>Example: </b><br>
     * 4
     * <p>
     * <b>DefaultValue: </b><br>
     * 2
     * <p>
     * 
     * @return the current value of <code>decimalPositions</code> property.
     */
    public Integer getDecimalPositions() {

        return this.decimalPositions;

    }

    /**
     * Gets the <code>effectiveDate</code> property.
     * <p>
     * <code> EffectiveDate</code> is the start date of the rounding factor and the decimal position.<br>
     * Effective date of rounding factor/decimal position must be at least one day greater than the latest
     * rounding factor's effective date for the currency. It must be greater than today.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 10APR95
     * <p>
     * 
     * @return the current value of <code>effectiveDate</code> property.
     */
    public Date getEffectiveDate() {
        return ContractUtility.getClonedDate(this.effectiveDate);
    }

    /**
     * Gets the <code>endDate</code> property.
     * <p>
     * <code>EndDate</code> is the ending date of the rounding factor and decimal position.<br>
     * When a new rounding factor/decimal position is created, the current rounding factor and decimal
     * position is end dated to the day before the effective date of new rounding factor and decimal position.
     * This is a generated field.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 10APR95
     * <p>
     * 
     * @return the current value of <code>endDate</code> property.
     */
    public Date getEndDate() {
        return ContractUtility.getClonedDate(this.endDate);
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>roundingFactor</code> property.
     * <p>
     * Rounding factor determines the decimal factor that needs to be employed for rounding off currency
     * amounts during currency conversion, amount manipulations etc.
     * <p>
     * <b>Format: </b><br>
     * BigDecimal<br>
     * Range: 0.00001-100
     * <p>
     * <b>Example: </b><br>
     * 0.001
     * <p>
     * <b>DefaultValue: </b><br>
     * 0.01
     * <p>
     * 
     * @return the current value of <code>roundingFactor</code> property.
     */
    public BigDecimal getRoundingFactor() {
        return this.roundingFactor;
    }

    /**
     * Sets the <code>currencyInfoOId</code> property.
     * <p>
     * 
     * @param pCurrencyInfoOId the new value of <code>currencyInfoOId</code> property.<br>
     */
    public void setCurrencyInfoOId(final Long pCurrencyInfoOId) {
        this.currencyInfoOId = pCurrencyInfoOId;
    }

    /**
     * Sets the <code>decimalPositions</code> property.
     * <p>
     * decimal positions determine the precision in terms of the number of decimals.
     * <p>
     * <b>Format: </b><br>
     * Numeric<br>
     * Range: 0-5
     * <p>
     * <b>Example: </b><br>
     * 4
     * <p>
     * <b>DefaultValue: </b><br>
     * 2
     * <p>
     * 
     * @param pDecimalPositions the new value of <code>decimalPositions</code> property.<br>
     */
    public void setDecimalPositions(final Integer pDecimalPositions) {
        this.decimalPositions = pDecimalPositions;
    }

    /**
     * Sets the <code>effectiveDate</code> property.
     * <p>
     * <code> EffectiveDate</code> is the start date of the rounding factor and the decimal position.<br>
     * Effective date of rounding factor/decimal position must be at least one day greater than the latest
     * rounding factor's effective date for the currency. It must be greater than today.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 10APR95
     * <p>
     * 
     * @param pEffectiveDate the new value of <code>effectiveDate</code> property.<br>
     */
    public void setEffectiveDate(final Date pEffectiveDate) {
        this.effectiveDate = ContractUtility.getClonedDate(pEffectiveDate);
    }

    /**
     * Sets the <code>endDate</code> property.
     * <p>
     * <code>EndDate</code> is the ending date of the rounding factor and decimal position.<br>
     * When a new rounding factor/decimal position is created, the current rounding factor and decimal
     * position is end dated to the day before the effective date of new rounding factor and decimal position.
     * This is a generated field.
     * <p>
     * <b>Format: </b><br>
     * See {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 10APR95
     * <p>
     * 
     * @param pEndDate the new value of <code>endDate</code> property.<br>
     */
    public void setEndDate(final Date pEndDate) {
        this.endDate = ContractUtility.getClonedDate(pEndDate);
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>roundingFactor</code> property.
     * <p>
     * Rounding factor determines the decimal factor that needs to be employed for rounding off currency
     * amounts during currency conversion, amount manipulations etc.
     * <p>
     * <b>Format: </b><br>
     * BigDecimal<br>
     * Range: 0.00001-100
     * <p>
     * <b>Example: </b><br>
     * 0.001
     * <p>
     * <b>DefaultValue: </b><br>
     * 0.01
     * <p>
     * 
     * @param pRoundingFactor the new value of <code>roundingFactor</code> property.<br>
     */
    public void setRoundingFactor(final BigDecimal pRoundingFactor) {
        this.roundingFactor = pRoundingFactor;
    }
}
