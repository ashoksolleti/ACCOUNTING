/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.io.Serializable;

/**
 * <code>RateTypeProductCodeDto</code> holds Product Code information associated with Rate Type.<br>
 * <p>
 * It contains following attributes:<br>
 * <ul>
 * <li><code>oId</code>
 * <li><code>productCode</code>
 * <li><code>rateTypeOId</code>
 * </ul>
 */
public class RateTypeProductCodeDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 3763127743591262468L;

    /**
     * Attribute to hold <code>oId</code> property.
     * <p>
     * Unique key of the rate type product code information.
     */
    private Long oId;

    /**
     * Attribute to hold <code>productCode</code> property.
     * <p>
     * The product code for which rates with this rate type are valid.
     */
    private String productCode;

    /**
     * Attribute to hold <code>rateTypeOId</code> property.
     * <p>
     * Unique key of the rate type.
     */
    private Long rateTypeOId;

    /**
     * Indicates whether some other object is "equal to" this one.
     * <p>
     * 
     * @param pObject obj the reference object with which to compare.
     * @return true if this object is the same as the obj argument; false otherwise.
     */
    @Override
    public boolean equals(final Object pObject) {
        boolean isRateTypeProductCodeEqual = false;
        if (pObject instanceof RateTypeProductCodeDto) {
            final RateTypeProductCodeDto aRateTypeProductCodeDto = (RateTypeProductCodeDto) pObject;
            if (this.getProductCode().equals(aRateTypeProductCodeDto.getProductCode())) {
                isRateTypeProductCodeEqual = true;
            }
        }
        return isRateTypeProductCodeEqual;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of <code>oId</code> property.<br>
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>productCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * AVI
     * <p>
     * 
     * @return the current value of <code>productCode</code> property.<br>
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * Gets the <code>rateTypeOId</code> property.
     * <p>
     * 
     * @return the current value of <code>rateTypeOId</code> property.<br>
     */
    public Long getRateTypeOId() {
        return this.rateTypeOId;
    }

    /**
     * Returns a hash code value for the object. Returns numeric value of first character of Product Code as
     * hashCode.
     * <p>
     * 
     * @return a hash code value for this object.
     */
    @Override
    public int hashCode() {
        return Character.getNumericValue(this.getProductCode().charAt(0));
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
     * Sets the <code>productCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * AVI
     * <p>
     * 
     * @param pProductCode the new value of <code>productCode</code> property.<br>
     */
    public void setProductCode(final String pProductCode) {
        this.productCode = ContractUtility.convertToUpperCase(pProductCode);
    }

    /**
     * Sets the <code>rateTypeOId</code> property.
     * <p>
     * 
     * @param pRateTypeOId the new value of <code>rateTypeOId</code> property.<br>
     */
    public void setRateTypeOId(final Long pRateTypeOId) {
        this.rateTypeOId = pRateTypeOId;
    }
}
