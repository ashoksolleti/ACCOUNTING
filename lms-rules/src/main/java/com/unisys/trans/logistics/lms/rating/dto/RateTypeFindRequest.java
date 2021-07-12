/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>RateTypeFindRequest</code> class represents the request to find the rate type class information.
 * <p>
 * Rate type class information can be retrieved in two ways:
 * <ul>
 * <li>Retrieve all the rate type information present in the system.<br>
 * It returns all the rate type information present in the system, by listing only their
 * <code>rateTypeCode</code> and description.
 * <li>Retrieve the rate type information for a given <code>rateTypeCode</code>.<br>
 * If the rate type is marked as 'Deleted', then an advisory message is returned; otherwise the rate type
 * information is returned.
 * </ul>
 * <p>
 * <code>RateTypeFindRequest</code> contains the following attributes:
 * <ul>
 * <code>
 * <li>exactMatchRequiredIndicator
 * <li>rateTypeCode
 * </code>
 * </ul>
 */
public class RateTypeFindRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -5199691456687452646L;

    /**
     * Attribute to hold <code>exactMatchRequiredIndicator</code> property.
     * <p>
     * Indicates that an exact match for the given rate type code is required.
     */
    private boolean exactMatchRequiredIndicator;

    /**
     * Attribute to hold <code>rateTypeCode</code> property. Rate type code which is a unique code to identify
     * the rate type.
     */
    private String rateTypeCode;

    /**
     * Gets the <code>rateTypeCode</code> property.
     * <p>
     * Represents the rate type code which is a unique code to identify the rate type.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * GEN
     * <p>
     * 
     * @return the current value of the <code>rateTypeCode</code> property.<br>
     */
    public String getRateTypeCode() {
        return this.rateTypeCode;
    }

    /**
     * Gets the <code>exactMatchRequiredIndicator</code> property.
     * <p>
     * Indicates if an exact match rate type information for the <code>rateTypeCode</code> is required or not.
     * <p>
     * <b>Possible Values:</b><br>
     * 
     * <pre>
     *  <code>
     * true
     * </code>
     *  - exact match for the
     * <code>
     * rateTypeCode
     * </code>
     *  is required.
     * <code>
     * false
     * </code>
     *  - exact match for the
     * <code>
     * rateTypeCode
     * </code>
     *  is not required.
     * </pre>
     * <p>
     * 
     * @return the current value of the <code>exactMatchRequiredIndicator</code> property.<br>
     */
    public boolean isExactMatchRequiredIndicator() {
        return this.exactMatchRequiredIndicator;
    }

    /**
     * Sets the <code>exactMatchRequiredIndicator</code> property.
     * <p>
     * Indicates if an exact match rate type information for the <code>rateTypeCode</code> is required or not.
     * <p>
     * <b>Possible Values:</b><br>
     * 
     * <pre>
     *  <code>
     * true
     * </code>
     *  - exact match for the
     * <code>
     * rateTypeCode
     * </code>
     *  is required.
     * <code>
     * false
     * </code>
     *  - exact match for the
     * <code>
     * rateTypeCode
     * </code>
     *  is not required.
     * </pre>
     * <p>
     * 
     * @param pExactMatchRequiredIndicator the new value of the <code>exactMatchRequiredIndicator</code>
     *            property.<br>
     */
    public void setExactMatchRequiredIndicator(final boolean pExactMatchRequiredIndicator) {
        this.exactMatchRequiredIndicator = pExactMatchRequiredIndicator;
    }

    /**
     * Sets the <code>rateTypeCode</code> property.
     * <p>
     * Represents the rate type code which is a unique code to identify the rate type.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * GEN
     * <p>
     * 
     * @param pRateTypeCode the new value of the <code>rateTypeCode</code> property.
     */
    public void setRateTypeCode(final String pRateTypeCode) {
        this.rateTypeCode = ContractUtility.convertToUpperCase(pRateTypeCode);
    }
}
