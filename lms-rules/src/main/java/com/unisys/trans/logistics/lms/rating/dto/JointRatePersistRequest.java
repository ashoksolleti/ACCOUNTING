/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>JointRatePersistRequest</code> class represents the request to create
 * and update JointRateinformation details.
 * <p>
 * <code>JointRatePersistRequest</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>JointRateDto
 * <li>oId
 * </code>
 * </ul>
 */
public class JointRatePersistRequest extends AbstractRequest {
    /**
     * Default serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>jointRateDto</code> property.
     */
    private JointRateDto jointRateDto;

    /**
     * Attribute to hold the <code>oId</code> object.
     */
    private Long oId;

    /**
     * Gets the <code>JointRateDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>jointRateDto</code> property.
     */
    public JointRateDto getJointRateDto() {
        return this.jointRateDto;
    }

    /**
     * Gets the <code>OId</code> property.
     * <p>
     * 
     * @return the current value of <code>oId</code> property.
     */

    public Long getOId() {
        return oId;
    }

    /**
     * Sets the <code>jointRateDto</code> property.
     * <p>
     * 
     * @param pJointRateDto
     *            the current value of the <code>jointRateDto</code> property.
     */
    public void setJointRateDto(final JointRateDto pJointRateDto) {
        this.jointRateDto = pJointRateDto;
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