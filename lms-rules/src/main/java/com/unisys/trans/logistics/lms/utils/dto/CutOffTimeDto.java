/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.io.Serializable;

/**
 * <code>CutOffTimeDto</code> contain details of CutOffTimeDto.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>connectionTime
 * <li>dropOffTime
 * <li>recoveryTime
 * <li>specialHandlingCode
 * </code>
 * </ul>
 */
public class CutOffTimeDto implements Serializable {

    /**
     * Default serial version id.
     */
    private static final long serialVersionUID = -5038756476402078862L;

    /**
     * Attribute to hold <code>connectionTime</code> property.
     */
    private String connectionTime;

    /**
     * Attribute to hold <code>dropOffTime</code> property.
     */
    private String dropOffTime;

    /**
     * Attribute to hold <code>recoveryTime</code> property.
     */
    private String recoveryTime;

    /**
     * Attribute to hold <code>specialHandlingCode</code> property.
     */
    private String specialHandlingCode;

    /**
     * Gets the <code>connectionTime</code> property.
     * <p>
     * 
     * @return the current value of the <code>connectionTime</code> property.
     */
    public String getConnectionTime() {
        return this.connectionTime;
    }

    /**
     * Gets the <code>dropOffTime</code> property.
     * <p>
     * 
     * @return the current value of the <code>dropOffTime</code> property.
     */
    public String getDropOffTime() {
        return this.dropOffTime;
    }

    /**
     * Gets the <code>recoveryTime</code> property.
     * <p>
     * 
     * @return the current value of the <code>recoveryTime</code> property.
     */
    public String getRecoveryTime() {
        return this.recoveryTime;
    }

    /**
     * Gets the <code>specialHandlingCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>specialHandlingCode</code> property.
     */
    public String getSpecialHandlingCode() {
        return this.specialHandlingCode;
    }

    /**
     * Sets the <code>connectionTime</code> property.
     * <p>
     * 
     * @param pConnectionTime
     *            the current value of the <code>connectionTime</code> property.
     */
    public void setConnectionTime(final String pConnectionTime) {
        this.connectionTime = pConnectionTime;
    }

    /**
     * Sets the <code>dropOffTime</code> property.
     * <p>
     * 
     * @param pDropOffTime
     *            the current value of the <code>dropOffTime</code> property.
     */
    public void setDropOffTime(final String pDropOffTime) {
        this.dropOffTime = pDropOffTime;
    }

    /**
     * Sets the <code>recoveryTime</code> property.
     * <p>
     * 
     * @param pRecoveryTime
     *            the current value of the <code>recoveryTime</code> property.
     */
    public void setRecoveryTime(final String pRecoveryTime) {
        this.recoveryTime = pRecoveryTime;
    }

    /**
     * Sets the <code>specialHandlingCode</code> property.
     * <p>
     * 
     * @param pSpecialHandlingCode
     *            the current value of the <code>specialHandlingCode</code> property.
     */
    public void setSpecialHandlingCode(final String pSpecialHandlingCode) {
        this.specialHandlingCode = pSpecialHandlingCode;
    }

}
