/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>JointRateFindRequest</code> is used for retrieving <code> JointRate</code> information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>JointRateDto</code>
 * <li><code>rateTypeCode</code>
 * </ul>
 */
public class JointRateFindRequest extends AbstractRequest {

    /**
     * Default serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>jointRateDto</code> property.
     */
    private JointRateDto jointRateDto;

    /**
     * Attribute to hold <code>rateTypeCode</code> property.
     */

    private String rateTypeCode;

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
     * Gets the <code>RateTypeCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * GEN
     * <p>
     * 
     * @return the current value of the <code>rateTypeCode</code> property.
     */
    public String getRateTypeCode() {
        return this.rateTypeCode;
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
     * Sets the <code>RateTypeCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * GEN
     * <p>
     * 
     * @param pRateTypeCode
     *            the current value of the <code>rateTypeCode</code> property.
     */
    public void setRateTypeCode(final String pRateTypeCode) {
        this.rateTypeCode = ContractUtility.convertToUpperCase(pRateTypeCode);
    }

}