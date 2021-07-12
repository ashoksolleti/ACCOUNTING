/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.rating.dto.constants.SecurityType;
import com.unisys.trans.logistics.lms.rating.dto.constants.SecurityUserType;

/**
 * <code>RatingSecurityFindRequest</code> is used for retrieving <code>RatingSecurity</code> information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>identifier</code>
 * <li><code>securityType</code>
 * <li><code>userType</code>
 * </ul>
 */
public class RatingSecurityFindRequest extends AbstractRequest {

    /**
     * Default Serial Version ID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>identifier</code> property.
     */
    private String identifier;

    /**
     * Attribute to hold <code>securityType</code> property.
     */

    private SecurityType securityType;

    /**
     * Attribute to hold <code>userType</code> property.
     */
    private SecurityUserType userType;

    /**
     * Gets the <code>Identifier</code> property.
     * <p>
     * 
     * @return the current value of the <code>identifier</code> property.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * Gets the <code>SecurityType</code> property.
     * <p>
     * 
     * @return the current value of the <code>securityType</code> property.
     */
    public SecurityType getSecurityType() {
        return this.securityType;
    }

    /**
     * Gets the <code>UserType</code> property.
     * <p>
     * 
     * @return the current value of the <code>userType</code> property.
     */
    public SecurityUserType getUserType() {
        return this.userType;
    }

    /**
     * Sets the <code>Identifier</code> property.
     * <p>
     * 
     * @param pIdentifier
     *            the new value of the <code>Identifier</code> property.
     */
    public void setIdentifier(final String pIdentifier) {
        this.identifier = ContractUtility.convertToUpperCase(pIdentifier);
    }

    /**
     * Sets the <code>pSecurityType</code> property.
     * <p>
     * 
     * @param pSecurityType
     *            the new value of the <code>SecurityType</code> property.
     */
    public void setSecurityType(final SecurityType pSecurityType) {
        this.securityType = pSecurityType;
    }

    /**
     * Sets the <code>UserType</code> property.
     * <p>
     * 
     * @param pUserType
     *            the new value of the <code>UserType</code> property.
     */
    public void setUserType(final SecurityUserType pUserType) {
        this.userType = pUserType;
    }

}
