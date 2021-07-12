/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto.price;

import java.io.Serializable;

import com.unisys.trans.logistics.lms.rating.dto.constants.ClassRatingType;
import com.unisys.trans.logistics.lms.rating.dto.constants.RatingRuleType;

public class ClassRatePrice implements Serializable {

    /**
     * Generated serial version id.
     */
    private static final long serialVersionUID = 1229372311550929364L;

    /**
     * Attribute to hold <code>classRatingType</code> property.
     */
    private ClassRatingType classRatingType;

    /**
     * Attribute to hold <code>percentage</code> property.
     */
    private Integer percentage;

    /**
     * Attribute to hold <code>ratingRuleType</code> property.
     */
    private RatingRuleType ratingRuleType;

    /**
     * Gets the <code>classRatingType</code> property.
     * <p>
     * 
     * @return the current value of the <code>classRatingType</code> property.
     */
    public ClassRatingType getClassRatingType() {
        return this.classRatingType;
    }

    /**
     * Gets the <code>percentage</code> property.
     * <p>
     * 
     * @return the current value of the <code>percentage</code> property.
     */
    public Integer getPercentage() {
        return this.percentage;
    }

    /**
     * Gets the <code>ratingRuleType</code> property.
     * <p>
     * 
     * @return the current value of the <code>ratingRuleType</code> property.
     */
    public RatingRuleType getRatingRuleType() {
        return this.ratingRuleType;
    }

    /**
     * Sets the <code>classRatingType</code> property.
     * <p>
     * 
     * @param pClassRatingType
     *            the current value of the <code>classRatingType</code> property.<br>
     */
    public void setClassRatingType(final ClassRatingType pClassRatingType) {
        this.classRatingType = pClassRatingType;
    }

    /**
     * Sets the <code>percentage</code> property.
     * <p>
     * 
     * @param pPercentage
     *            the current value of the <code>percentage</code> property.<br>
     */
    public void setPercentage(final Integer pPercentage) {
        this.percentage = pPercentage;
    }

    /**
     * Sets the <code>ratingRuleType</code> property.
     * <p>
     * 
     * @param pRatingRuleType
     *            the current value of the <code>ratingRuleType</code> property.<br>
     */
    public void setRatingRuleType(final RatingRuleType pRatingRuleType) {
        this.ratingRuleType = pRatingRuleType;
    }

}
