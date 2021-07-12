/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>RestrictionGenerateResponse</code> holds the retrieved restrictionDto and the generated restriction
 * errors and warnings messages of export, import, transit, systemwide and collect charge restrictions for the
 * given input.The restrictionDto holds restriction output details of export, import, transit, systemwide and
 * collect charge restrictions.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <li><code>restriction</code></li>
 * </ul>
 */

public class RestrictionGenerateResponse extends AbstractResponse {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -800826696111242344L;

    /**
     * Attribute to hold <code>restriction</code> property.
     * <p>
     * Contains specific data applicable to the station and carrier.it is of type <code>RestrictionDto</code>
     * class.
     */
    private List<RestrictionDto> restrictions;

    /**
     * Default constructor.
     */
    public RestrictionGenerateResponse() {

    }

    /**
     * Get <code>restriction</code> property.
     * <p>
     * Contains specific data applicable to the station and carrier.Holds restriction output details of
     * export,import,transit,system wide and collect charge restrictions. It is of type
     * <code>RestrictionDto</code> class.
     * <p>
     * 
     * @return the current value of the <code>restriction</code> property.
     */

    public List<RestrictionDto> getRestrictions() {

        return this.restrictions;

    }

    /**
     * Set operation for the <code>restriction</code> attribute which is of type restrictionDto object.
     * <p>
     * Contains specific data applicable to the station and carrier.Holds restriction output details of
     * export,import,transit,system wide and collect charge restrictions. It is of type
     * <code>RestrictionDto</code>
     * <p>
     * 
     * @param pRestrictions the new value of the <code>restrictions</code> property.
     */

    public void setRestrictions(final List<RestrictionDto> pRestrictions) {
        this.restrictions = pRestrictions;
    }
}