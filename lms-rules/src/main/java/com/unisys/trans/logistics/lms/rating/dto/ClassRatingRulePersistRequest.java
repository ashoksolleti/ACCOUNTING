/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>ClassRatingRulePersistRequest</code> class represents the request to
 * create and update ClassRatingRule information details.
 * <p>
 * <code>ClassRatingRulePersistRequest</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>ClassRatingRuleDto
 * <li>oId
 * </code>
 * </ul>
 */

public class ClassRatingRulePersistRequest extends AbstractRequest {

    /**
     * Default Serial Version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold the <code>classRatingRuleDto</code> object.
     */

    private ClassRatingRuleDto classRatingRuleDto;

    /**
     * Attribute to hold the <code>oId</code> object.
     */
    private Long oId;

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
     * Gets the <code>OId</code> property.
     * <p>
     * 
     * @return the current value of <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Sets the <code>ClassRatingRuleDto</code> property.
     * <p>
     * 
     * @param pClassRatingRuleDto
     *            the new value of the <code>classRatingRuleDto</code> property.
     */
    public void setClassRatingRuleDto(final ClassRatingRuleDto pClassRatingRuleDto) {
        this.classRatingRuleDto = pClassRatingRuleDto;
    }

    /**
     * Sets the <code>OId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>OId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

}
