/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>ClassRatingRuleResponse</code> contains the response of the maintenance
 * request received by <code>ClassRatingRuleService</code>.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>ClassRatingRuleDto
 * </code>
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleDto
 */

public class ClassRatingRuleResponse extends AbstractResponse {

    /**
     * Default Serial Version id.
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>ClassRatingRuleDto</code> property.
     * <p>
     * <code>ClassRatingRuleDto</code> contains the classRatingRule information.
     */

    private ClassRatingRuleDto classRatingRuleDto;

    /**
     * Gets the <code>ClassRatingRuleDto</code> property.
     * <p>
     * 
     * @return the current value of <code>classRatingRuleDto</code> property.
     */

    public ClassRatingRuleDto getClassRatingRuleDto() {
        return this.classRatingRuleDto;
    }

    /**
     * Sets the <code>ClassRatingRuleDto</code> property.
     * <p>
     * 
     * @param pClassRatingRuleDto
     *            the new value of <code>ClassRatingRuleDto</code> information.<br>
     */
    public void setClassRatingRuleDto(final ClassRatingRuleDto pClassRatingRuleDto) {
        this.classRatingRuleDto = pClassRatingRuleDto;
    }
}
