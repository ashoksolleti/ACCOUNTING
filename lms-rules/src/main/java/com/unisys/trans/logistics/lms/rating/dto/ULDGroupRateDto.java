/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <code>ULDGroupRateDto</code> class is used to maintain other charge for Rate per ULD type table type.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>oId
 * <li>otherChargeULDGroupRateOId
 * <li>uldGroup
 * <li>rate
 * </code>
 * </ul>
 */
public class ULDGroupRateDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -5731559935120410248L;

    /**
     * Attribute to hold <code>oId</code>.
     * <p>
     * Unique key identify the <code>ULDGroupRateDto</code>.It is of type Long.<br>
     */
    private Long oId;

    /**
     * Attribute to hold <code>otherChargeULDGroupRateOId</code>.
     * <p>
     * Represents the unique key value of <code>OtherChargeULDGroupRateDto</code>.It is of type Long.<br>
     */
    private Long otherChargeULDGroupRateOId;

    /**
     * Attribute to hold <code>rate</code>.
     * <p>
     * Represents the rate applicable to the ULD.
     */
    private BigDecimal rate;

    /**
     * Attribute to hold <code>uldGroup</code>.
     * <p>
     * Represents the uld group number.
     */
    private Integer uldGroup;

    /**
     * <code>Default constructor</code>.
     */
    public ULDGroupRateDto() {

    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * Unique key to identify the <code>ULDGroupRateDto</code>.It is of type Long.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>otherChargeULDGroupRateOId</code> property.
     * <p>
     * Unique key to identify the <code>OtherChargeULDGroupRateDto</code>.It is of type Long.
     * <p>
     * 
     * @return the current value of the <code>otherChargeULDGroupRateOId</code> property.<br>
     */
    public Long getOtherChargeULDGroupRateOId() {
        return this.otherChargeULDGroupRateOId;
    }

    /**
     * Gets the <code>rate</code> property.
     * <p>
     * Represents the rate applicable to the ULD.
     * <p>
     * <b>Format: </b><br>
     * 1-9 BigDecimal<br>
     * <b>Example: </b><br>
     * 100.369
     * <p>
     * 
     * @return the current value of the <code>rate</code> property.<br>
     */
    public BigDecimal getRate() {
        return this.rate;
    }

    /**
     * Gets the <code>uldGroup</code> property.
     * <p>
     * Represents the uld group number.
     * <p>
     * <b>Format: </b><br>
     * 1-2 Numeric<br>
     * <b>Example: </b><br>
     * 10
     * <p>
     * 
     * @return the current value of the <code>uldGroup</code> property.<br>
     */
    public Integer getUldGroup() {
        return this.uldGroup;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * Unique key to identify the <code>ULDGroupRateDto</code>.It is of type Long.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>otherChargeULDGroupRateOId</code> property.
     * <p>
     * Unique key to identify the <code>OtherChargeULDGroupRateDto</code>.It is of type Long.
     * <p>
     * 
     * @param pOtherChargeULDGroupRateOId the new value of the <code>otherChargeULDGroupRateOId</code>
     *            property.<br>
     */
    public void setOtherChargeULDGroupRateOId(final Long pOtherChargeULDGroupRateOId) {
        this.otherChargeULDGroupRateOId = pOtherChargeULDGroupRateOId;
    }

    /**
     * Sets the <code>rate</code> property.
     * <p>
     * Represents the rate applicable to the ULD.
     * <p>
     * <b>Format: </b><br>
     * 1-9 BigDecimal<br>
     * <b>Example: </b><br>
     * 100.369
     * <p>
     * 
     * @param pRate the new value of the <code>rate</code>.<br>
     */
    public void setRate(final BigDecimal pRate) {
        this.rate = pRate;
    }

    /**
     * Sets the <code>uldGroup</code> property.
     * <p>
     * Represents the uld group number.
     * <p>
     * <b>Format: </b><br>
     * 1-2 Numeric<br>
     * <b>Example: </b><br>
     * 10
     * <p>
     * 
     * @param pUldGroup the new value of the <code>uldGroup</code>.<br>
     */
    public void setUldGroup(final Integer pUldGroup) {
        this.uldGroup = pUldGroup;
    }

    /**
     * This method overrides toString property.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the string value.<br>
     *         </p>
     */
    @Override
    public String toString() {
        final StringBuilder aCapacity = new StringBuilder();
        aCapacity.append(this.rate);
        aCapacity.append(this.uldGroup);
        return aCapacity.toString();
    }
}
