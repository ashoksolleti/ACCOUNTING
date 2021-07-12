/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.utils.constants.UserType;

/**
 * <code>PreferencesDeleteRequest</code> is used for retrieving <code>Preferences</code> information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>functionName
 * <li>userIdentifier
 * <li>userType
 * </ul>
 */
public class PreferencesDeleteRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -7876888509077682270L;

    /**
     * Attribute to hold the <code>functionName</code> property.
     */
    private String functionName;

    /**
     * Attribute to hold the <code>userIdentifier</code> property.
     */
    private String userIdentifier;

    /**
     * Attribute to hold the <code>userType</code> property.
     */
    private UserType userType;

    /**
     * Gets the <code>functionName</code> property.
     * <p>
     * 
     * @return the current value of <code>functionName</code> property.<br>
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * Gets the <code>userIdentifier</code> property.
     * <p>
     * 
     * @return the current value of <code>userIdentifier</code> property.<br>
     */
    public String getUserIdentifier() {
        return this.userIdentifier;
    }

    /**
     * Gets the <code>userType</code> property.
     * <p>
     * 
     * @return the current value of <code>userType</code> property.<br>
     */
    public UserType getUserType() {
        return this.userType;
    }

    /**
     * Sets the <code>functionName</code> property.
     * <p>
     * 
     * @param pFunctionName
     *            the current value of the <code>functionName</code> property.
     */
    public void setFunctionName(final String pFunctionName) {
        this.functionName = pFunctionName;
    }

    /**
     * Sets the <code>userIdentifier</code> property.
     * <p>
     * 
     * @param pUserIdentifier
     *            the current value of the <code>userIdentifier</code> property.
     */
    public void setUserIdentifier(final String pUserIdentifier) {
        this.userIdentifier = pUserIdentifier;
    }

    /**
     * Sets the <code>userType</code> property.
     * <p>
     * 
     * @param pUserType
     *            the current value of the <code>userType</code> property.
     */
    public void setUserType(final UserType pUserType) {
        this.userType = pUserType;
    }

}
