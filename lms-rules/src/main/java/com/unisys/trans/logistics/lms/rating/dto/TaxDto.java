/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.math.BigDecimal;
import java.util.Date;

/**
 * <code>TaxDto</code> contains tax some details of Tax.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>effectiveDate
 * <li>endDate
 * <li>rate
 * <li>oId
 * </code>
 * </ul>
 */
public abstract class TaxDto extends PersistenceObjectDto {
    /**
     * Attribute to hold <code>effectiveDate</code> property.
     */
    private Date effectiveDate;

    /**
     * Attribute to hold <code>endDate</code> property.
     */
    private Date endDate;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>rate</code> property.
     */
    private BigDecimal rate;

    /**
     * <code>Default constructor.</code>
     */
    public TaxDto() {
    }

    /**
     * Gets the value of the <code>effectiveDate</code> property.
     * <p>
     * The date from when the tax is mad effective.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 30JUN07
     * <p>
     * 
     * @return the current value of the <code>effectiveDate</code> property.<br>
     */
    public Date getEffectiveDate() {
        return ContractUtility.getClonedDate(this.effectiveDate);
    }

    /**
     * Gets the value of the <code>endDate</code> property.
     * <p>
     * The date on which the tax ceases to be effective. In case the end date is open-ended (indefinite) then
     * the previous entry is end dated to the day before the effective date of the new tax rate.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 30JUN07
     * <p>
     * 
     * @return the current value of the <code>endDate</code> property.<br>
     */
    public Date getEndDate() {
        return ContractUtility.getClonedDate(this.endDate);
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the value of the <code>rate</code> property.
     * <p>
     * The tax percentage rate of the tax. For the U.S. Government tax, a tax percentage rate greater than
     * zero is mandatory. For VAT tax, a tax rate percentage for a station in European Community is mandatory,
     * and can be equal or greater than zero.
     * <p>
     * <b>Format: </b><br>
     * Numeric with decimal point.Two digits after decimal point
     * <p>
     * <b>Example: </b><br>
     * 16.00
     * <p>
     * 
     * @return the current value of the <code>rate</code> property.<br>
     */
    public BigDecimal getRate() {
        return this.rate;
    }

    /**
     * Sets the value of <code>effectiveDate</code> property.
     * <p>
     * The date from when the tax is mad effective.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 30JUN07
     * <p>
     * 
     * @param pEffectiveDate the new value of the <code>effectiveDate</code> property.<br>
     */
    public void setEffectiveDate(final Date pEffectiveDate) {
        this.effectiveDate = ContractUtility.getClonedDate(pEffectiveDate);
    }

    /**
     * Sets the value of <code>endDate</code> property.
     * <p>
     * The date on which the tax ceases to be effective. In case the end date is open-ended (indefinite) then
     * the previous entry is end dated to the day before the effective date of the new tax rate.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 30JUN07
     * <p>
     * 
     * @param pEndDate the new value of the <code>endDate</code> property.<br>
     */
    public void setEndDate(final Date pEndDate) {
        this.endDate = ContractUtility.getClonedDate(pEndDate);
    }

    /**
     * Sets the value of the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the value of <code>rate</code> property.
     * <p>
     * The tax percentage rate of the tax. For the U.S. Government tax, a tax percentage rate greater than
     * zero is mandatory. For VAT tax, a tax rate percentage for a station in European Community is mandatory,
     * and can be equal or greater than zero.
     * <p>
     * <b>Format: </b><br>
     * Numeric with decimal point.Two digits after decimal point
     * <p>
     * <b>Example: </b><br>
     * 16.00
     * <p>
     * 
     * @param pRate the new value of the <code>rate</code> property.<br>
     */
    public void setRate(final BigDecimal pRate) {
        this.rate = pRate;
    }
}
