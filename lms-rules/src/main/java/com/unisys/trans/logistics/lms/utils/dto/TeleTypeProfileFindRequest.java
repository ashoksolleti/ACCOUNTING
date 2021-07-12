/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>TeleTypeProfileFindRequest</code> is used to retrieve teletype profile informations for the input
 * message type.
 * <p>
 * This contains the following attribute:
 * <ul>
 * <li><code>teleTypeProfile</code>
 * </ul>
 */
public class TeleTypeProfileFindRequest extends AbstractRequest {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -2449107187273672737L;

    /**
     * Attribute to hold <code>teleTypeProfile</code> property.
     */
    private TeleTypeProfileDto teleTypeProfile;

    /**
     * <code>Default constructor.</code>
     */
    public TeleTypeProfileFindRequest() {

    }

    /**
     * Gets the <code>teleTypeProfile</code> property.
     * <p>
     * 
     * @return the current value of <code>teleTypeProfile</code> property.
     */
    public TeleTypeProfileDto getTeleTypeProfile() {
        return this.teleTypeProfile;
    }

    /**
     * Sets the <code>teleTypeProfile</code> property.
     * <p>
     * 
     * @param pTeleTypeProfile the new value of <code>teleTypeProfile</code> property.
     */
    public void setTeleTypeProfile(final TeleTypeProfileDto pTeleTypeProfile) {
        this.teleTypeProfile = pTeleTypeProfile;
    }

}
