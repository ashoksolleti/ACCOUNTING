/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.framework.dto;

import java.util.HashMap;
import java.util.Map;

/**
 * <code>MultipleFindResponse</code> contains the response that contains the retrieved objects.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>retrievedObjects</code>
 * </ul>
 */
public class MultipleFindResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -6648038542521565498L;

    /**
     * Attribute to hold <code>retrievedObjects</code> property.
     */
    private Map retrievedObjects = new HashMap();

    /**
     * <code>Default constructor.</code>
     */
    public MultipleFindResponse() {

    }

    /**
     * Gets the <code>retrievedObjects</code> property which contains list of possible values.
     * <p>
     * 
     * @return the current value of map of <code>retrievedObjects</code> property.
     */
    public Map getRetrievedObjects() {
        return this.retrievedObjects;
    }

    /**
     * Sets the <code>retrievedObjects</code> property which contains list of possible values.
     * <p>
     * 
     * @param pRetrievedObjects the new value of map of <code>retrievedObjects</code> property.
     */
    public void setRetrievedObjects(final Map pRetrievedObjects) {
        this.retrievedObjects = pRetrievedObjects;
    }

}
