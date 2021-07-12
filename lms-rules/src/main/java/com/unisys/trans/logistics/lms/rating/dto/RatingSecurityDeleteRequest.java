/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.rating.dto.constants.SecurityUserType;

/**
 * <code>RatingSecurityDeleteRequest</code> is used for deleting <code>RatingSecurity</code> information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>oId</code>
 * <li><code>securityUserType</code>
 * <li><code>identifier</code>
 * </ul>
 */
public class RatingSecurityDeleteRequest extends AbstractRequest {

    /**
     * Generated serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>identifier</code> property.
     */
    private String identifier;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>securityUserType</code> property.
     */
    private SecurityUserType securityUserType;

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
     * Gets the <code>OId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>SecurityUserType</code> property.
     * <p>
     * 
     * @return the current value of the <code>securityUserType</code> property.
     */
    public SecurityUserType getSecurityUserType() {
        return this.securityUserType;
    }

    /**
     * Sets the <code>Identifier</code> property.
     * <p>
     * 
     * @param pIdentifier
     *            the new value of the <code>Identifier</code> property.
     */
    public void setIdentifier(final String pIdentifier) {
        this.identifier = pIdentifier;
    }

    /**
     * Sets the <code>OId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>SecurityUserType</code> property.
     * <p>
     * 
     * @param pSecurityUserType
     *            the new value of the <code>SecurityUserType</code> property.
     */
    public void setSecurityUserType(final SecurityUserType pSecurityUserType) {
        this.securityUserType = pSecurityUserType;
    }

}
