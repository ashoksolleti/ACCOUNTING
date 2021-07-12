/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>ClassRatingIdPurgeRequest</code> class represents the request to purge the ClassRatingIdVersion
 * information.
 * <p>
 * <code>ClassRatingIdPurgeRequest</code> holds the following attributes:
 * <ul>
 * <code>
 * <li>versionOId
 * <li>classRatingIdOId
 * </code>
 * </ul>
 */
public class ClassRatingIdPurgeRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -3253318682521948183L;

    /**
     * Attribute to hold <code>classRatingIdOID</code>.
     * <p>
     * This hold the Unique key value for <code>ClassRatingId</code>.
     */
    private Long classRatingIdOId;

    /**
     * Attribute to hold <code>versionOId</code>.
     * <p>
     * This hold the Unique key value for <code>ClassRatingIdVersion</code>.
     */
    private Long versionOId;

    /**
     * Gets the <code>classRatingIdOId</code> property.
     * <p>
     * Unique key to identify the <code>ClassRatingId</code>.It is of type Long.
     * <p>
     * 
     * @return the current value of the <code>classRatingIdOID</code> property.<br>
     */
    public Long getClassRatingIdOId() {
        return this.classRatingIdOId;
    }

    /**
     * Gets the <code>versionOId</code> property.
     * <p>
     * Unique key to identify the <code>ClassRatingIdVersionDto</code>.It is of type Long.
     * <p>
     * 
     * @return the current value of the <code>versionOId</code> property.<br>
     */
    public Long getVersionOId() {
        return this.versionOId;
    }

    /**
     * Sets the <code>ClassRatingIdOId</code> property.
     * <p>
     * Unique key to identify the <code>ClassRatingId</code>.It is of type Long.
     * <p>
     * 
     * @param pClassRatingIdOId
     *            the new value of the <code>classRatingIdOId</code> property.<br>
     */

    public void setClassRatingIdOId(final Long pClassRatingIdOId) {
        this.classRatingIdOId = pClassRatingIdOId;
    }

    /**
     * Sets the <code>versionOId</code> property.
     * <p>
     * Unique key to identify the <code>ClassRatingIdVersionDto</code>.It is of type Long.
     * <p>
     * 
     * @param pVersionOId
     *            the new value of the <code>versionOId</code> property.<br>
     */
    public void setVersionOId(final Long pVersionOId) {
        this.versionOId = pVersionOId;
    }

}
