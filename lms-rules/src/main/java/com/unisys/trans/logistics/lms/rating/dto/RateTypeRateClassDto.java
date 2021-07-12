/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.rating.dto.constants.RatingConventionType;
import com.unisys.trans.logistics.lms.utils.dto.constants.RateClassType;

import java.io.Serializable;

/**
 * <code>RateTypeRateClassDto</code> holds Rate Class information associated with the Rate Type.<br>
 * <p>
 * It contains following attributes:<br>
 * <ul>
 * <li><code>oId</code>
 * <li><code>rateClass</code>
 * <li><code>rateTypeOId</code>
 * <li><code>ratingConventionType</code>
 * </ul>
 */
public class RateTypeRateClassDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -3653254230009690380L;

    /**
     * Attribute to hold <code>oId</code> property.
     * <p>
     * Unique Key for rate class information.
     */
    private Long oId;

    /**
     * Attribute to hold <code>rateClass</code> property.
     * <p>
     * Rate Class associated with the Rate Type.
     */
    private RateClassType rateClass;

    /**
     * Attribute to hold <code>rateTypeOId</code> property.
     * <p>
     * Unique Key for rate type.
     */
    private Long rateTypeOId;

    /**
     * Attribute to hold <code>ratingConventionType</code> property.
     * <p>
     * Specifies the Rate Convention Type for which rate class is defined. It can be IATA or ATPCO.
     */
    private RatingConventionType ratingConventionType;

    /**
     * Indicates whether some other object is "equal to" this one.
     * <p>
     * 
     * @param pObject obj the reference object with which to compare.
     * @return true if this object is the same as the obj argument; false otherwise.
     */
    @Override
    public boolean equals(final Object pObject) {
        boolean isRateTypeRateClassEqual = false;
        if (pObject instanceof RateTypeRateClassDto) {
            final RateTypeRateClassDto aRateTypeRateClassDto = (RateTypeRateClassDto) pObject;
            if (this.getRateClass().equals(aRateTypeRateClassDto.getRateClass())
                        && this.getRatingConventionType().equals(
                            aRateTypeRateClassDto.getRatingConventionType())) {
                isRateTypeRateClassEqual = true;
            }
        }
        return isRateTypeRateClassEqual;
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
     * Gets the <code>rateClass</code> property.
     * <p>
     * 
     * @return the current value of <code>rateClass</code> property.<br>
     */
    public RateClassType getRateClass() {
        return this.rateClass;
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
     * Gets the <code>ratingConventionType</code> property.
     * <p>
     * <b>Possible Values:</b><br>
     * 
     * <pre>
     *  <code>
     * D</code>
     *  -
     * <code>
     * ATPCO
     * </code>
     *  <code>
     * I</code>
     *  -
     * <code>
     * IATA
     * </code>
     * </pre>
     * <p>
     * 
     * @return the current value of <code>ratingConventionType</code> property.<br>
     */
    public RatingConventionType getRatingConventionType() {
        return this.ratingConventionType;
    }

    /**
     * Returns a hash code value for the object. Returns numeric value of first character of Rate Class as
     * hashCode.
     * <p>
     * 
     * @return a hash code value for this object.
     */
    @Override
    public int hashCode() {
        return Character.getNumericValue(this.getRateClass().toString().charAt(0));
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
     * Sets the <code>rateClass</code> property.
     * <p>
     * 
     * @param pRateClass the new value of <code>rateClass</code> property.<br>
     */
    public void setRateClass(final RateClassType pRateClass) {
        this.rateClass = pRateClass;
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

    /**
     * Sets the <code>ratingConventionType</code> property.
     * <p>
     * <b>Possible Values:</b><br>
     * 
     * <pre>
     *  <code>
     * D</code>
     *  -
     * <code>
     * ATPCO
     * </code>
     *  <code>
     * I</code>
     *  -
     * <code>
     * IATA
     * </code>
     * </pre>
     * <p>
     * 
     * @param pRatingConventionType the new value of <code>ratingConventionType</code> property.<br>
     */
    public void setRatingConventionType(final RatingConventionType pRatingConventionType) {
        this.ratingConventionType = pRatingConventionType;
    }
}
