/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>ClassRatingRuleDeleteRequest</code> class represents the request to delete
 * ClassRatingRule details.
 * <p>
 * <code>ClassRatingRuleDeleteRequest</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>oId
 * <li>classRatingId
 * <li>carrierCode
 * <li>rateSource
 * </code>
 * </ul>
 */

public class ClassRatingRuleDeleteRequest extends AbstractRequest {

    /**
     * Default Serial Version UID.
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>carrierCode</code> property.
     */

    private String carrierCode;

    /**
     * Attribute to hold <code>classRatingId</code> property.
     */

    private String classRatingId;

    /**
     * Attribute to hold <code>oId</code> property.
     */

    private Long oId;

    /**
     * Attribute to hold <code>rateSource</code> property.
     */

    private String rateSource;

    /**
     * Gets the <code>CarrierCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2-3 AlphaNumeric.
     * <p>
     * <b>Example: </b><br>
     * UW.
     * <p>
     * 
     * @return the current value of the <code>CarrierCode</code> property.
     */

    public String getCarrierCode() {
        return this.carrierCode;
    }

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
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */

    public Long getOId() {
        return this.oId;
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
     * Sets the <code>CarrierCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2-3 AlphaNumeric.
     * <p>
     * <b>Example: </b><br>
     * UW.
     * <p>
     * 
     * @param pCarrierCode
     *            the current value of the <code>CarrierCode</code> property.
     */

    public void setCarrierCode(final String pCarrierCode) {
        this.carrierCode = pCarrierCode;
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
