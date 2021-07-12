/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>TeletypeAddressProfilePersistRequest</code> class is used request to create TeletypeAddressProfile.
 * <p>
 * <code>TeletypeAddressProfilePersistRequest</code> holds the following attribute:
 * <ul>
 * <code>
 * <li>teletypeAddressProfile
 * </code>
 * </ul>
 */
public class TeletypeAddressProfilePersistRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 4174167552427964688L;

    /**
     * Attribute to hold the <code>teletypeAddressProfile</code> property.
     */
    private TeletypeAddressProfileDto teletypeAddressProfile;

    /**
     * <code>Default constructor.</code>
     */
    public TeletypeAddressProfilePersistRequest() {
    }

    /**
     * Gets the <code>teletypeAddressProfile</code> property.
     * <p>
     * Represents the <code>TeletypeAddressProfileDto</code> which holds all the attributes that are specific
     * to a TeletypeAddressProfile.
     * <p>
     * 
     * @return the current value of the <code>teletypeAddressProfile</code> property.
     */
    public final TeletypeAddressProfileDto getTeletypeAddressProfile() {
        return this.teletypeAddressProfile;
    }

    /**
     * Sets the <code>teletypeAddressProfile</code> property.
     * <p>
     * Represents the <code>TeletypeAddressProfileDto</code> which holds all the attributes that are specific
     * to a TeletypeAddressProfile.
     * <p>
     * 
     * @param pTeletypeAddressProfile the new value of the <code>teletypeAddressProfile</code> property.<br>
     */
    public final void setTeletypeAddressProfile(final TeletypeAddressProfileDto pTeletypeAddressProfile) {
        this.teletypeAddressProfile = pTeletypeAddressProfile;
    }
}