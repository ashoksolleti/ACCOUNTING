/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>ClassRatingIdResponse</code> represents the response object of the
 * maintenance request received for <code>ClassRatingId</code>.
 * <p>
 * <code>ClassRatingIdResponse</code> contains the following attribute:<br>
 * <ul>
 * <code>
 * <li>classRatingIds
 * </code>
 * </ul>
 */
public class ClassRatingIdResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -3539062870045894653L;

    /**
     * Attribute to hold list of <code>classRatingIds</code> property.
     * <p>
     * <code>ClassRatingIdDto</code> contains the ClassRatingId information.
     */

    private List<ClassRatingIdDto> classRatingIds = new ArrayList<ClassRatingIdDto>();

    /**
     * Adds the class Rating Ids information to the <code>classRatingIds</code> property.
     * <p>
     * 
     * @param pClassRatingIdDto
     *            the new classRatingId information to be added to the <code>classRatingIds</code> property.
     */
    public void addClassRatingId(final ClassRatingIdDto pClassRatingIdDto) {
        this.classRatingIds.add(pClassRatingIdDto);
    }

    /**
     * Gets the <code>classRatingIds</code> property.
     * <p>
     * The ClassRatingId information for a list of unique ClassRatingId.
     * <p>
     * 
     * @return the current value of <code>classRatingIds</code> property.
     */
    public List<ClassRatingIdDto> getClassRatingIds() {
        return this.classRatingIds;
    }

    /**
     * Sets the <code>classRatingIds</code> property.
     * <p>
     * The ClassRatingId information for a list of unique ClassRatingId.
     * <p>
     * 
     * @param pClassRatingIds the new value of <code>classRatingIds</code> information.<br>
     */
    public void setClassRatingIds(final List<ClassRatingIdDto> pClassRatingIds) {
        this.classRatingIds = pClassRatingIds;
    }
}
