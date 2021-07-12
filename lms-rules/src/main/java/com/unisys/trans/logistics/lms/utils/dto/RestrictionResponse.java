/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>RestrictionResponse</code> contains the response of the maintenance request received by
 * <code>RestrictionService</code>.
 * <p>
 * <ul>
 * <code>
 * <li>restriction
 * </code>
 * </ul>
 */
public class RestrictionResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -9054717220731424718L;

    /**
     * Attribute to hold <code>restriction</code> property.
     * <p>
     * Contains specific data applicable to the station and carrier.it is of type <code>RestrictionDto</code>
     * class.
     */
    private RestrictionDto restriction;

    /**
     * <code>Default constructor.</code>
     */
    public RestrictionResponse() {

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
    public RestrictionDto getRestriction() {
        return this.restriction;
    }

    /**
     * Set operation for the <code>restriction</code> attribute which is of type restrictionDto object.
     * <p>
     * Contains specific data applicable to the station and carrier.Holds restriction output details of
     * export,import,transit,system wide and collect charge restrictions. It is of type
     * <code>RestrictionDto</code>
     * <p>
     * 
     * @param pRestrictionDto the new value of the <code>restriction</code> property.
     */
    public void setRestriction(final RestrictionDto pRestrictionDto) {
        this.restriction = pRestrictionDto;
    }
}
