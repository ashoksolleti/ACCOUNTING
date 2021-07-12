/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>ClassRatingIdPersistRequest</code> contains all the details used to create/update ClassRatingId and
 * ClassRatingId version information.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <li><code>classRatingId</code> <br>
 * </ul>
 */

public class ClassRatingIdPersistRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 7157459757206974730L;

    /**
     * Attribute to hold <code>classRatingId</code> property.
     * <p>
     * This attribute represents <code>ClassRatingIdDto</code> object that holds all the classRatingId
     * details.<br>
     */
    private ClassRatingIdDto classRatingId;

    /**
     * Gets the <code>classRatingId</code> property.
     * <p>
     * Holds the reference of the <code>ClassRatingIdDto</code> which holds the ClassRatingId information.
     * <p>
     * 
     * @return the current value of the <code>classRatingId</code> property.
     */
    public ClassRatingIdDto getClassRatingId() {
        return this.classRatingId;
    }

    /**
     * Sets the <code>pClassRatingId</code> property.
     * <p>
     * Holds the reference of the <code>ClassRatingIdDto</code> which holds the ClassRatingId information.
     * <p>
     * 
     * @param pClassRatingId
     *            the value of the <code>classRatingId</code> property.
     */

    public void setClassRatingId(final ClassRatingIdDto pClassRatingId) {
        this.classRatingId = pClassRatingId;
    }
}
