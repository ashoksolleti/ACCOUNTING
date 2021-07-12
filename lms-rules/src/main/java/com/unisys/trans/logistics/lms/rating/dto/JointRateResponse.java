/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>JointRateResponse</code> is used for retrieving <code> JointRate</code> information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>JointRateDto</code>
 * </ul>
 */
public class JointRateResponse extends AbstractResponse {
    /**
     * Default serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>jointRateDto</code> property.
     */

    private JointRateDto jointRateDto;

    /**
     * Gets the <code>JointRateDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>jointRateDto</code> property.
     */
    public JointRateDto getJointRateDto() {
        if (this.jointRateDto == null) {
            this.jointRateDto = new JointRateDto();
        }
        return this.jointRateDto;
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

}