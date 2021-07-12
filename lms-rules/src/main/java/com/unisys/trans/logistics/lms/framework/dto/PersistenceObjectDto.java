/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;

/**
 * <code>PersistenceObjectDto</code> is the base data transfer object extended by all DTOs.
 * <p>
 * It has the version of an entity. At the time of persistence the version number of the DTO is matched with
 * the entity to avoid any dirty writing (i.e. overwriting of some other user's data).
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>version</code>
 * </ul>
 */
public abstract class PersistenceObjectDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 784610817712801765L;

    /**
     * Attribute to hold the <code>version</code> property.
     */
    private long version;

    /**
     * <code>Default constructor.</code>
     */
    public PersistenceObjectDto() {

    }

    /**
     * Gets the object identifier property.
     * <p>
     * 
     * @return the current value of the object identifier property.
     */
    public abstract Long getOId();

    /**
     * Gets the <code>version</code> property.
     * <p>
     * 
     * @return the current value of the <code>version</code> property.
     */
    public long getVersion() {
        return this.version;
    }

    /**
     * Sets the <code>version</code> property.
     * <p>
     * 
     * @param pVersion the new value of the <code>version</code> property.
     */
    public void setVersion(final long pVersion) {
        this.version = pVersion;
    }
}
