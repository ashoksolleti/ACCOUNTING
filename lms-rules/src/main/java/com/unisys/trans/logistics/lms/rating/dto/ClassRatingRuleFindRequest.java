/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>ClassRatingRuleFindRequest</code> is used for retrieving <code>ClassRatingRule</code> information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>ClassRatingRuleFindDto</code>
 * </ul>
 */

public class ClassRatingRuleFindRequest extends AbstractRequest {

    /**
     * Default Serial Version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>classRatingRuleFindDto</code> property.
     */

    private ClassRatingRuleFindDto classRatingRuleFindDto;

    /**
     * Gets the <code>ClassRatingRuleFindDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>classRatingRuleFindDto</code> property.
     */

    public ClassRatingRuleFindDto getClassRatingRuleFindDto() {
        return this.classRatingRuleFindDto;
    }

    /**
     * Sets the <code>ClassRatingRuleFindDto</code> property.
     * <p>
     * 
     * @param pClassRatingRuleFindDto
     *            the current value of the <code>classRatingRuleFindDto</code> property.
     */

    public void setClassRatingRuleFindDto(final ClassRatingRuleFindDto pClassRatingRuleFindDto) {
        this.classRatingRuleFindDto = pClassRatingRuleFindDto;
    }

}
