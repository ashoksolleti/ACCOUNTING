/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>ProductCodeFindRequest</code> holds all the attributes required for finding a
 * <code>productCode</code>.
 * <p>
 * It allows you to find either the specific, close matches, and all product codes based on the
 * <code>exactMatchRequired</code> indicator.<br>
 * <li>If no filter option is input by the actor the system returns all the product codes sorted in
 * alphanumeric order.
 * <li>If the <code>exactMatchIndicator</code> of the <code>ProductCodeFindRequest</code> is true, then only
 * one <code>productCode</code> matching the <code>ProductCodeFilter</code> condition is returned.
 * <li>If no exact match is found, no <code>ProductCode</code> is returned.
 * <li>If the <code>exactMatchIndicator</code> of the <code>ProductCodeFindRequest</code> is false, then all
 * product codes are returned.<br>
 * <li>If <code>ProductCodeFilter</code> is provided but <code>exactMatchIndicator</code> is false in
 * <code>ProductCodeFindRequest</code>, then <code>productCode</code>s are sorted alphabetically and all the
 * <code>productCode</code>s greater than or equal to <code>ProductCodeFilter</code> are returned.<br>
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <li><code>exactMatchRequired</code>
 * <li><code>productCode</code>
 * </ul>
 */
public class ProductCodeFindRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 9129698164506989160L;

    /**
     * Attribute to hold the <code>ExactMatchRequired</code> property.
     * <p>
     * Indicates if the system must do an exact match of the value provided in Code filter condition.
     * <li><code>true</code><br>
     * Exact match required.
     * <li><code>false</code><br>
     * Exact match not required (Default Condition).
     */
    private boolean exactMatchRequired;

    /**
     * Attribute to hold the <code>productCode</code> property.
     * <p>
     * Indicates the <code>productCode</code> that has to be retrieved.
     */
    private String productCode;
    
    /**
     * Attribute to hold the <code>productCodeSyncInd</code> property.
     * <p>
     * Indicates if the productCode is updated / created by sync form LMS.
     */
    private boolean productCodeSyncInd;

    /**
     * <code>Default constructor.</code>
     */
    public ProductCodeFindRequest() {

    }

    /**
     * Gets the <code>productCode</code> property.
     * <p>
     * Represents the value of <code>productCode</code> that has to be retrieved from the system.
     * <p>
     * <b>Format: </b><br>
     * 1-3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * AVI
     * <p>
     * 
     * @return the current value of the <code>productCode</code> property.<br>
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * Gets the <code>exactMatchRequired</code> property.
     * <p>
     * Indicates if the system must do an exact match of the value provided in Code filter condition.
     * <p>
     * <b>Possible Values:</b><br>
     * <li><code>true</code><br>
     * Exact match required.
     * <li><code>false</code><br>
     * Exact match not required (Default Condition).
     * <p>
     * 
     * @return the current value of <code>ExactMatchRequired</code> property.<br>
     */
    public boolean isExactMatchRequired() {
        return this.exactMatchRequired;
    }

    /**
     * Sets the <code>exactMatchRequired</code> property.
     * <p>
     * Indicates if the system must do an exact match of the value provided in Code filter condition.
     * <p>
     * <b>Possible Values:</b><br>
     * <li><code>true</code><br>
     * Exact match required.
     * <li><code>false</code><br>
     * Exact match not required (Default Condition).
     * <p>
     * <b>Format: </b><br>
     * 1-3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * AVI
     * <p>
     * 
     * @param pExactMatchIndicator the new value of the <code>exactMatchRequired</code> property.<br>
     */
    public void setExactMatchRequired(final boolean pExactMatchIndicator) {
        this.exactMatchRequired = pExactMatchIndicator;

    }

    /**
     * Sets the <code>productCode</code> property.
     * <p>
     * Represents the value of <code>productCode</code> that has to be retrieved from the system.
     * <p>
     * 
     * @param pProductCode the new value of the <code>productCode</code> property.<br>
     */
    public void setProductCode(final String pProductCode) {
        this.productCode = ContractUtility.convertToUpperCase(pProductCode);

    }

    /**
     * Gets the <code>productCodeSyncInd</code> property.
     * <p>
     * Indicates if the productCode is updated / created by sync form LMS.
     * <p>
     * 
     * @return the current value of <code>productCodeSyncInd</code> property.<br>
     */
    public boolean getProductCodeSyncInd() {
        return this.productCodeSyncInd;
    }

    /**
     * Sets the <code>productCodeSyncInd</code> property.
     * <p>
     * Indicates if the productCode is updated / created by sync form LMS.
     * <p>
     * 
     * @param pProductCodeSyncInd the new value of the <code>productCodeSyncInd</code> property.<br>
     */
    public void setProductCodeSyncInd(final boolean pProductCodeSyncInd) {
        this.productCodeSyncInd = pProductCodeSyncInd;
    }
}
