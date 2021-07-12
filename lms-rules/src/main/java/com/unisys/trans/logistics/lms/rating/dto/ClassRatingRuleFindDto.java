/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.rating.dto.constants.IATAAreaZoneType;

/**
 * <code>ClassRatingRuleFindDto</code> contain details to retrieve
 * ClassRatingRule Information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>iataAreaTo
 * <li>iataAreaFrom
 * <li>classRatingId
 * <li>rateSource
 * <li>carrierCode
 * </ul>
 */
public class ClassRatingRuleFindDto extends AbstractRequest {

    /**
     * Default serial version UID.
     */
    private static final long serialVersionUID = 6546216710209739476L;

    /**
     * Attribute to hold <code>carrierCode</code> property.
     */
    private String carrierCode;

    /**
     * Attribute to hold <code>classRatingId</code> property.
     */

    private String classRatingId;

    /**
     * Attribute to hold <code>iataAreaFrom</code> property.
     */
    private IATAAreaZoneType iataAreaFrom;

    /**
     * Attribute to hold <code>iataAreaTo</code> property.
     */

    private IATAAreaZoneType iataAreaTo;

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
     * 
     * @return the current value of the <code>classRatingId</code> property.
     */

    public String getClassRatingId() {
        return this.classRatingId;
    }

    /**
     * Gets the <code>iataAreaFrom</code> property.
     * <p>
     * 
     * @return the current value of the <code>iataAreaFrom</code> property.
     */
    public IATAAreaZoneType getIataAreaFrom() {
        return this.iataAreaFrom;
    }

    /**
     * Gets the <code>iataAreraTo</code> property.
     * <p>
     * 
     * @return the current value of the <code>iataAreraTo</code> property.
     */
    public IATAAreaZoneType getIataAreaTo() {
        return this.iataAreaTo;
    }

    /**
     * Gets the <code>RateSource</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Characters
     * <p>
     * <b>Example: </b><br>
     * IRI
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
        this.carrierCode = ContractUtility.convertToUpperCase(pCarrierCode);
    }

    /**
     * Sets the <code>classRatingId</code> property.
     * <p>
     * 
     * @param pClassRatingId
     *            the current value of the <code>classRatingId</code> property.
     */

    public void setClassRatingId(final String pClassRatingId) {
        this.classRatingId = ContractUtility.convertToUpperCase(pClassRatingId);
    }

    /**
     * Sets the <code>iataAreaFrom</code> property.
     * <p>
     * 
     * @param pIataAreaFrom
     *            the current value of the <code>iataAreaFrom</code> property.
     */
    public void setIataAreaFrom(final IATAAreaZoneType pIataAreaFrom) {
        this.iataAreaFrom = pIataAreaFrom;
    }

    /**
     * Sets the <code>iataAreaTo</code> property.
     * <p>
     * 
     * @param pIataAreaTo
     *            the current value of the <code>iataAreaTo</code> property.
     */
    public void setIataAreaTo(final IATAAreaZoneType pIataAreaTo) {
        this.iataAreaTo = pIataAreaTo;
    }

    /**
     * Sets the <code>RateSource</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * IRI
     * <p>
     * 
     * @param pRateSource
     *            the new value of the <code>rateSource</code> property.
     */

    public void setRateSource(final String pRateSource) {
        this.rateSource = ContractUtility.convertToUpperCase(pRateSource);
    }

}
