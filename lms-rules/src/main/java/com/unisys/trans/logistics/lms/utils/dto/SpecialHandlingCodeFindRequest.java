/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>SpecialHandlingCodeFindRequest</code> is used for finding special handling code.
 * <p>
 * It allows to find specific, close matches, and all special handling codes.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>exactMatchRequiredIndicator
 * <li>specialHandlingCode
 * <li>sortCode</code>
 * </ul>
 */
public class SpecialHandlingCodeFindRequest extends AbstractRequest {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 253019753792429389L;

    /**
     * Attribute to hold the <code>exactMatchRequiredIndicator</code> property.
     * <p>
     * Indicates if the system should return an exact match of the special handling provided as a filter.
     */
    private boolean exactMatchRequiredIndicator;

    /**
     * Attribute to hold the <code>sortCode</code> property.
     */
    private String sortCode;

    /**
     * Attribute to hold the <code>specialHandlingCode</code> property.
     * <p>
     * The special handling code provided for filtering.
     */
    private String specialHandlingCode;
    /**
     * Attribute to hold the <code>splCodeSyncInd</code> property.
     * <p>
     * The special handling code provided for filtering.
     */
    private boolean splCodeSyncInd;
    

    /**
     * <code>Default Constructor.</code>
     */
    public SpecialHandlingCodeFindRequest() {

    }

    /**
     * Gets the <code>exactMatchRequiredIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <ul>
     * <li><code>true</code> <br>
     * If the exact match is required
     * <li><code>false</code> <br>
     * If the exact match is not required
     * </ul>
     * <p>
     * 
     * @return the current value of <code>exactMatchRequiredIndicator</code> property.
     */
    public boolean getExactMatchRequiredIndicator() {
        return this.exactMatchRequiredIndicator;
    }

    /**
     * Gets the <code>sortCode</code> property.
     * <p>
     * 
     * @return the current value of <code>sortCode</code> property.
     */
    public String getSortCode() {
        return this.sortCode;
    }

    /**
     * Gets the <code>specialHandlingCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * AVI
     * <p>
     * 
     * @return the current value of the <code>specialHandlingCode</code> property.
     */
    public String getSpecialHandlingCode() {
        return this.specialHandlingCode;
    }

    /**
     * Gets the <code>exactMatchRequiredIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <code>true</code> <br>
     * If the exact match is required<br>
     * <code>false</code> <br>
     * If the exact match is not required<br>
     * <p>
     * 
     * @return the current value of <code>exactMatchRequiredIndicator</code> property.
     */
    public boolean isExactMatchRequired() {
        return this.exactMatchRequiredIndicator;
    }

    /**
     * Sets the <code>exactMatchRequiredIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <ul>
     * <li><code>true</code> <br>
     * If the exact match is required.
     * <li><code>false</code> <br>
     * If the exact match is not required.
     * </ul>
     * <p>
     * 
     * @param pExactMatchRequiredIndicator the new value of the <code>exactMatchRequiredIndicator</code>
     *            property.
     */
    public void setExactMatchRequiredIndicator(final boolean pExactMatchRequiredIndicator) {
        this.exactMatchRequiredIndicator = pExactMatchRequiredIndicator;
    }

    /**
     * Sets the <code>sortCode</code> property.
     * <p>
     * 
     * @param pSortCode the new value of <code>sortCode</code> property.
     */
    public void setSortCode(final String pSortCode) {
        this.sortCode = pSortCode;
    }

    /**
     * Sets the <code>specialHandlingCode</code> property.
     * <p>
     * 
     * @param pSpecialHandlingCode the new value of the <code>specialHandlingCode</code> property.
     */
    public void setSpecialHandlingCode(final String pSpecialHandlingCode) {
        this.specialHandlingCode = ContractUtility.convertToUpperCase(pSpecialHandlingCode);
    }

    /**
     * Gets the <code>splCodeSyncInd</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <code>true</code> <br>
     * If special code is created/updated throw sync from LMS<br>
     * <code>false</code> <br>
     * If not<br>
     * <p>
     * 
     * @return the current value of <code>splCodeSyncInd</code> property.
     */
    public boolean getSplCodeSyncInd() {
        return this.splCodeSyncInd;
    }

    /**
     * Sets the <code>splCodeSyncInd</code> property.
     * <p>
     * 
     * @param pSplCodeSyncInd the new value of the <code>splCodeSyncInd</code> property.
     */
    
    public void setSplCodeSyncInd(final boolean pSplCodeSyncInd) {
        this.splCodeSyncInd = pSplCodeSyncInd;
    }

}
