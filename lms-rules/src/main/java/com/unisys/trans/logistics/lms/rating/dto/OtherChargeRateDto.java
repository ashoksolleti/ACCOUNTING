/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.rating.dto.constants.OtherChargeRateType;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <code>OtherChargeRateDto</code> class contain detail information applicable for an otherCharge rate type.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>oId
 * <li>otherChargeRateDetailsOId
 * <li>effectiveDate
 * <li>endDate
 * <li>biDirectionalIndicator
 * <li>currency
 * <li>weightUOM
 * <li>otherChargeRateType
 * <li>maximumCharge
 * <li>minimumCharge
 * </code>
 * </ul>
 */
public class OtherChargeRateDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -746910207273051207L;

    /**
     * Attribute to hold <code>biDirectionalIndicator</code>.
     * <p>
     * Indicates how the rates apply between the given geographiclocation1 and geographiclocation2.
     */
    private boolean biDirectionalIndicator;

    /**
     * Attribute to hold <code>currency</code>.
     * <p>
     * Represents the currency code of the rates displayed.
     */
    private String currency;

    /**
     * Attribute to hold <code>effectiveDate</code>.
     * <p>
     * Represents the date on which the other charge rate begins to apply is the effective date.
     */
    private Date effectiveDate;

    /**
     * Attribute to hold <code>endDate</code>.
     * <p>
     * Represents the date on which the other charge rate ceases to apply is the end date.
     */
    private Date endDate;

    /**
     * Attribute to hold <code>maximumCharge</code>.
     * <p>
     * Represents the maximum amount applicable for the other charge per air waybill.
     */
    private BigDecimal maximumCharge;

    /**
     * Attribute to hold <code>minimumCharge</code>.
     * <p>
     * Represents the minimum amount applicable for the other charge per air waybill.
     */
    private BigDecimal minimumCharge;

    /**
     * Attribute to hold <code>oId</code>.
     * <p>
     * This hold the Unique key value for <code>OtherChargeRateDto</code>.
     */
    private Long oId;

    /**
     * Attribute to hold <code>otherChargeRateDetailsOId</code>.
     * <p>
     * Represents the Unique key value for <code>OtherChargeDetailDto</code>.
     */
    private Long otherChargeRateDetailsOId;

    /**
     * Attribute to hold <code>otherChargeRateType</code>.
     * <p>
     * Represents the rate type code controls how the rates are applied.
     */
    private OtherChargeRateType otherChargeRateType;

    /**
     * Attribute to hold <code>weightUOM</code>.
     * <p>
     * Represents the unit of measurement (UoM) for weight.
     */
    private WeightUOMType weightUOMType;

    /**
     * <code>Default constructor</code>.
     */
    public OtherChargeRateDto() {

    }

    /**
     * Gets the <code>currency</code> property.
     * <p>
     * Represents the currency code of the rates displayed.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets(Upper Case)
     * <p>
     * <b>Example: </b><br>
     * USD
     * <p>
     * 
     * @return the current value of the <code>currency</code> property.<br>
     */
    public String getCurrency() {
        return this.currency;
    }

    /**
     * Gets the <code>effectiveDate</code> property.
     * <p>
     * Represents the date on which the other charge rate begins to apply is the effective date.
     * <p>
     * <b>Format:</b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT DATEFORMAT}
     * <p>
     * <b>Example:</b><br>
     * 07JUL08
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
     * Represents the date on which the other charge rate ceases to apply is the end date.
     * <p>
     * <b>Format:</b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT DATEFORMAT}
     * <p>
     * <b>Example:</b><br>
     * 07JUL08
     * <p>
     * 
     * @return the current value of <code>endDate</code> property.
     */
    public Date getEndDate() {
        return ContractUtility.getClonedDate(this.endDate);
    }

    /**
     * Gets the <code>maximumCharge</code> property.
     * <p>
     * Represents the maximum amount applicable for the other charge per air waybill.
     * <p>
     * <b>Format: </b><br>
     * 1-9 BigDecimal
     * <p>
     * <b>Example: </b><br>
     * 100
     * <p>
     * 
     * @return the current value of the <code>maximumCharge</code> property.<br>
     */
    public BigDecimal getMaximumCharge() {
        return this.maximumCharge;
    }

    /**
     * Gets the <code>minimumCharge</code> property.
     * <p>
     * Represents the minimum amount applicable for the other charge per air waybill.
     * <p>
     * <b>Format: </b><br>
     * 1-9 BigDecimal
     * <p>
     * <b>Example: </b><br>
     * 100
     * <p>
     * 
     * @return the current value of the <code>minimumCharge</code> property.<br>
     */
    public BigDecimal getMinimumCharge() {
        return this.minimumCharge;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * Unique key to identify the <code>OtherChargeRateDto</code>.It is of type Long.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>otherChargeRateDetailsOId</code> property.
     * <p>
     * Represents the Unique key value for <code>OtherChargeDetailDto</code>.It is of type Long.
     * <p>
     * 
     * @return the current value of the <code>otherChargeRateDetailsOId</code> property.<br>
     */
    public Long getOtherChargeRateDetailsOId() {
        return this.otherChargeRateDetailsOId;
    }

    /**
     * Gets the <code>otherChargeRateType</code> property.
     * <p>
     * Represents the rate type code controls how the rates are applied.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @return the current value of the <code>otherChargeRateType</code> property.<br>
     */
    public OtherChargeRateType getOtherChargeRateType() {
        return this.otherChargeRateType;
    }

    /**
     * Gets the <code>weightUOMType</code> property.
     * <p>
     * Represents the unit of measurement (UoM) for weight.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabets(Upper Case)
     * <p>
     * <b>Example: </b><br>
     * KG
     * <p>
     * 
     * @return the current value of the <code>weightUOMType</code> property.<br>
     */
    public WeightUOMType getWeightUOMType() {
        return this.weightUOMType;
    }

    /**
     * Gets the <code>biDirectionalIndicator</code> property.
     * <p>
     * Indicates how the rates apply between the given geographiclocation1 and geographiclocation2.
     * <p>
     * <b>Possible Values:</b><br>
     * <li><code>true</code><br>
     * The rates apply between geographiclocation1 (origin) and geographiclocation2 (destination) and vice
     * versa.
     * <li><code>false</code><br>
     * The rates apply between geographiclocation1(origin) and geographiclocation2 (destination) only.
     * <p>
     * 
     * @return the current value of the <code>biDirectionalIndicator</code> property.<br>
     */
    public boolean isBiDirectionalIndicator() {
        return this.biDirectionalIndicator;
    }

    /**
     * Sets the value of the <code>biDirectionalIndicator</code> property.
     * <p>
     * Indicates how the rates apply between the given geographiclocation1 and geographiclocation2.
     * <p>
     * <b>Possible Values:</b><br>
     * <li><code>true</code><br>
     * The rates apply between geographiclocation1 (origin) and geographiclocation2 (destination) and vice
     * versa.
     * <li><code>false</code><br>
     * The rates apply between geographiclocation1(origin) and geographiclocation2 (destination) only.
     * <p>
     * 
     * @param pBiDirectionalIndicator the new value of the <code>biDirectionalIndicator</code> property.<br>
     */
    public void setBiDirectionalIndicator(final boolean pBiDirectionalIndicator) {
        this.biDirectionalIndicator = pBiDirectionalIndicator;
    }

    /**
     * Sets the <code>currency</code> property.
     * <p>
     * Represents the currency code of the rates displayed.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * USD
     * <p>
     * 
     * @param pCurrency the new value of the <code>currency</code> property.
     */
    public void setCurrency(final String pCurrency) {
        this.currency = ContractUtility.convertToUpperCase(pCurrency);
    }

    /**
     * Sets the <code>effectiveDate</code> property.
     * <p>
     * Represents the date on which the other charge rate begins to apply is the effective date.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT}
     * <p>
     * <b>Example:</b><br>
     * 10AUG07
     * <p>
     * 
     * @param pEffectiveDate the new value of the <code>effectiveDate</code> property.
     */
    public void setEffectiveDate(final Date pEffectiveDate) {
        this.effectiveDate = ContractUtility.getClonedDate(pEffectiveDate);
    }

    /**
     * Sets the <code>effectiveDate</code> property.
     * <p>
     * Represents the date on which the other charge rate ceases to apply is the end date.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT}
     * <p>
     * <b>Example:</b><br>
     * 10AUG07
     * <p>
     * 
     * @param pEndDate the new value of the <code>endDate</code> property.
     */
    public void setEndDate(final Date pEndDate) {
        this.endDate = ContractUtility.getClonedDate(pEndDate);
    }

    /**
     * Sets the <code>maximumCharge</code> property.
     * <p>
     * Represents the maximum amount applicable for the other charge per air waybill.
     * <p>
     * <b>Format: </b><br>
     * 1-9 BigDecimal
     * <p>
     * <b>Example: </b><br>
     * 100
     * <p>
     * 
     * @param pMaximumCharge the new value of the <code>maximumCharge</code> property.
     */
    public void setMaximumCharge(final BigDecimal pMaximumCharge) {
        this.maximumCharge = pMaximumCharge;
    }

    /**
     * Sets the <code>minimumCharge</code> property.
     * <p>
     * Represents the minimum amount applicable for the other charge per air waybill.
     * <p>
     * <b>Format: </b><br>
     * 1-9 BigDecimal
     * <p>
     * <b>Example: </b><br>
     * 100
     * <p>
     * 
     * @param pMinimumCharge the new value of the <code>minimumCharge</code> property.
     */
    public void setMinimumCharge(final BigDecimal pMinimumCharge) {
        this.minimumCharge = pMinimumCharge;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * Unique key to identify the <code>OtherChargeRateDto</code>.It is of type Long.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>otherChargeRateDetailsOId</code> property.
     * <p>
     * Unique key to identify the <code>OtherChargeDetailDto</code>.It is of type Long.
     * <p>
     * 
     * @param pOtherChargeRateDetailsOId the new value of the <code>otherChargeRateDetailsOId</code> property.<br>
     */
    public void setOtherChargeRateDetailsOId(final Long pOtherChargeRateDetailsOId) {
        this.otherChargeRateDetailsOId = pOtherChargeRateDetailsOId;
    }

    /**
     * Sets the <code>otherChargeRateType</code> property.
     * <p>
     * Represents the rate type code controls how the rates are applied.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @param pOtherChargeRateType the new value of the <code>otherChargeRateType</code> property.
     */
    public void setOtherChargeRateType(final OtherChargeRateType pOtherChargeRateType) {
        this.otherChargeRateType = pOtherChargeRateType;
    }

    /**
     * Sets the <code>weightUOMType</code> property.
     * <p>
     * Represents the unit of measurement (UoM) for weight.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphabets
     * <p>
     * <b>Example: </b><br>
     * KG
     * <p>
     * 
     * @param pWeightUOMType the new value of the <code>weightUOMType</code> property.
     */
    public void setWeightUOMType(final WeightUOMType pWeightUOMType) {
        this.weightUOMType = pWeightUOMType;
    }

}
