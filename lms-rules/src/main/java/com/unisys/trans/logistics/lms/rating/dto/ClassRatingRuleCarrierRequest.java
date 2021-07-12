/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>ClassRatingRuleCarrierRequest</code> class represents the request to update
 * ClassRatingRuleCarrier Information details.
 * <p>
 * <code>ClassRatingRuleCarrierRequest</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>classRatingId
 * <li>rateSource
 * </code>
 * </ul>
 */

public class ClassRatingRuleCarrierRequest extends AbstractRequest {

    /**
     * Default serial version UID.
     */
    private static final long serialVersionUID = 3264752427886253201L;

    /**
     * Attribute to hold <code>classRatingId</code> property.
     */

    private String classRatingId;

    /**
     * Attribute to hold <code>rateSource</code> property.
     */

    private String rateSource;

    /**
     * Gets the <code>classRatingId</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2A(1-4AN)(UC)
     * <p>
     * <b>Example: </b><br>
     * AUTOS
     * <p>
     * 
     * @return
     *         returns the class rating id.
     */

    public String getClassRatingId() {
        return this.classRatingId;
    }

    /**
     * Gets the <code>RateSource</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * ATP
     * <p>
     * 
     * @return the current value of the <code>rateSource</code> property.
     */

    public String getRateSource() {
        return this.rateSource;
    }

    /**
     * Sets the <code>classRatingId</code> property.
     * <p>
     * This domain object contains the the class rating id.
     * <p>
     * 
     * @param pClassRatingId
     *            the new value of the <code>classRatingId</code> property.<br>
     */

    public void setClassRatingId(final String pClassRatingId) {
        this.classRatingId = pClassRatingId;
    }

    /**
     * Sets the <code>RateSource</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * ATP
     * <p>
     * 
     * @param pRateSource
     *            the new value of the <code>rateSource</code> property.
     */

    public void setRateSource(final String pRateSource) {
        this.rateSource = pRateSource;
    }

}
