/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>TeleTypeProfilePersistRequest</code> is used to persist the teletype sending profile information.
 * <p>
 * This contains the following attribute:
 * <ul>
 * <code>
 * <li>teleTypeProfile
 * </code>
 * </ul>
 */
public class TeleTypeProfilePersistRequest extends AbstractRequest {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 4796216177704801461L;

    /**
     * Attribute to hold <code>teleTypeProfile</code> property.
     */
    private TeleTypeProfileDto teleTypeProfile;

    /**
     * <code>Default constructor.</code>
     */
    public TeleTypeProfilePersistRequest() {

    }

    /**
     * Gets the <code>teleTypeProfile</code> property.
     * <p>
     * 
     * @return the current value of <code>TeleTypeProfileDto</code> property.
     */
    public TeleTypeProfileDto getTeleTypeProfile() {
        return this.teleTypeProfile;
    }

    /**
     * Sets the <code>teleTypeProfile</code> property.
     * <p>
     * 
     * @param pTeleTypeProfile the new value of <code>TeleTypeProfileDto</code> property.
     */
    public void setTeleTypeProfile(final TeleTypeProfileDto pTeleTypeProfile) {
        this.teleTypeProfile = pTeleTypeProfile;
    }

}
