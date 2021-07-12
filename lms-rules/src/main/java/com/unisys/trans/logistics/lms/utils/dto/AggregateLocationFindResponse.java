/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>AggregateLocationFindResponse</code> retrieves the <code>Aggregate information</code>.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>sourceInTarget
 * </code>
 * </ul>
 */

public class AggregateLocationFindResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>sourceInTarget</code> property.
     */
    private List<String> foundLocations;

    /**
     * Attribute to hold <code>sourceInTarget</code> property.
     */
    private boolean sourceInTarget;

    /**
     * Gets the <code>foundLocations</code> property.
     * <p>
     * 
     * @return the current value of the <code>foundLocations</code> property.<br>
     */
    public List<String> getFoundLocations() {
        return this.foundLocations;
    }

    /**
     * Gets the <code>sourceInTarget</code> property.
     * <p>
     * 
     * @return the current value of the <code>sourceInTarget</code> property.<br>
     */
    public boolean getSourceInTarget() {
        return this.sourceInTarget;
    }

    /**
     * Sets the <code>foundLocations</code> property.
     * 
     * <p>
     * 
     * @param pFoundLocations the new value of the <code>foundLocations</code> property.<br>
     */
    public void setFoundLocations(final List<String> pFoundLocations) {
        this.foundLocations = pFoundLocations;
    }

    /**
     * Sets the <code>sourceInTarget</code> property.
     * 
     * <p>
     * 
     * @param pSourceInTarget the new value of the <code>sourceInTarget</code> property.<br>
     */
    public void setSourceInTarget(final boolean pSourceInTarget) {
        this.sourceInTarget = pSourceInTarget;

    }

}
