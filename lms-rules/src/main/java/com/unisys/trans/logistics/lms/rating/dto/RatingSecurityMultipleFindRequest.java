/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.rating.dto.constants.SecurityUserType;

/**
 * <code>RatingSecurityFindRequest</code> is used for retrieving <code>RatingSecurity</code> information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>securityUserType</code>
 * </ul>
 */
public class RatingSecurityMultipleFindRequest extends AbstractRequest {
    /**
     * Generated serial version id.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>securityUserType</code> property.
     */
    private SecurityUserType securityUserType;

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
