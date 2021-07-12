/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>CustomsStatusCodeFindRequest</code> CustomsStatusCodeFindRequest is used for finding customsStatus
 * code details. It allows you to find if a complete customsStatus code (2 character) is provided system
 * retrieves all the customsStatus codes that match this customsStatus code and those that follow in
 * alphabetically ascending order. - All customsStatus codes when customsStatus code and contour code are
 * null.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <li><code>customsStatusCode</code></li>
 * </ul>
 */
public class CustomsStatusCodeFindRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -5299518969909511931L;

    /**
     * Attribute to hold <code>customsStatusCode</code> property.
     */
    private String customsStatusCode;

    /**
     * <code>Default constructor.</code>
     */
    public CustomsStatusCodeFindRequest() {
    }

    /**
     * Gets the value of the <code>customsStatusCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-2 Alphanumeric<br>
     * <b>Example: </b><br>
     * P1
     * 
     * @return <code>String</code>.<br>
     *         Returns the <code>customsStatusCode</code> of the customsStatus.<br>
     *         </p>
     */
    public String getCustomsStatusCode() {
        return this.customsStatusCode;
    }

    /**
     * Sets the <code>customsStatusCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-2 Alphanumeric<br>
     * <b>Example: </b><br>
     * P1
     * 
     * @param pCustomsStatusCode the new value of the <code>customsStatusCode</code> property.
     */
    public void setCustomsStatusCode(final String pCustomsStatusCode) {

        this.customsStatusCode = ContractUtility.convertToUpperCase(pCustomsStatusCode);

    }
}