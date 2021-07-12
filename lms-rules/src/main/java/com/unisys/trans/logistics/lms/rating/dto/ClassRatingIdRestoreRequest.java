/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>ClassRatingIdRestoreRequest</code> class represents the request to restore the ClassRatingId
 * information.
 * <p>
 * <code>ClassRatingIdRestoreRequest</code> holds the following attributes:
 * <ul>
 * <code>
 * <li>classRatingId
 * </code>
 * </ul>
 */
public class ClassRatingIdRestoreRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -4219156949902188159L;

    /**
     * Attribute to hold <code>classRatingId</code> property. ClassRatingId
     * which is unique to identify the ClassRatingId in the system.
     */
    private String classRatingId;

    /**
     * Gets the <code>classRatingId</code> property.
     * <p>
     * Represents the ClassRatingId which is a unique Id to identify the ClassRatingId.
     * <p>
     * <b>Format: </b><br>
     * 3-6 Alphanumeric with first 2 characters being alphabets.
     * <p>
     * <b>Example: </b><br>
     * AUTOS
     * <p>
     * 
     * @return the current value of the <code>classRatingId</code> property.<br>
     */
    public String getClassRatingId() {
        return this.classRatingId;
    }

    /**
     * Sets the <code>classRatingId</code> property.
     * <p>
     * Represents the id which is a unique code to identify the ClassRatingId.
     * <p>
     * <b>Format: </b><br>
     * 3-6 Alphanumeric with first 2 characters being alphabets.
     * <p>
     * <b>Example: </b><br>
     * AUTOS
     * <p>
     * 
     * @param pClassRatingId
     *            the new value of the <code>classRatingId</code> property.
     */

    public void setClassRatingId(final String pClassRatingId) {
        this.classRatingId = ContractUtility.convertToUpperCase(pClassRatingId);
    }

}
