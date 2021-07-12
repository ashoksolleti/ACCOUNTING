/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * <code>TeleTypeProfileResponse</code> contains the response of the request received by
 * <code>TeleTypeProfileService</code> for maintaining the teletype profile information.
 * <p>
 * This contains the following attribute:
 * <ul>
 * <li><code>teleTypeProfiles</code></li>
 * </ul>
 */
public class TeleTypeProfileResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -8961459473798228392L;

    /**
     * Attribute to hold <code>teleTypeProfiles</code> property.
     */
    private List<TeleTypeProfileDto> teleTypeProfiles = new ArrayList<TeleTypeProfileDto>();

    /**
     * <code>Default constructor.</code>
     */
    public TeleTypeProfileResponse() {

    }

    /**
     * Gets the <code>teleTypeProfile</code> property.
     * <p>
     * 
     * @return the current list of <code>teleTypeProfile</code> property.
     */
    public List<TeleTypeProfileDto> getTeleTypeProfiles() {
        return this.teleTypeProfiles;
    }

    /**
     * Sets the <code>teleTypeProfile</code> property.
     * <p>
     * 
     * @param pTeleTypeProfiles the new list of <code>teleTypeProfile</code> property.
     */
    public void setTeleTypeProfiles(final List<TeleTypeProfileDto> pTeleTypeProfiles) {
        this.teleTypeProfiles = pTeleTypeProfiles;
    }

}
