/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>OtherChargeSubCodeFindRequest</code> class is the find OtherChargeSubCode.
 * <p>
 * <code>OtherChargeSubCodeFindRequest</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>otherChargeCode
 * </code>
 * </ul>
 */

public class OtherChargeSubCodeFindRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1751120294004081076L;

    /**
     * Attribute to hold the <code>OtherChargeCode</code> property.
     */
    private String otherChargeCode;

    /**
     * Gets the <code>otherChargeCodeDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>otherChargeCodeDto</code> property.
     */
    public String getOtherChargeCode() {
        return this.otherChargeCode;
    }

    /**
     * Sets the <code>otherChargeCode</code> property.
     * <p>
     * 
     * @param pOtherChargeCode the new value of the <code>otherChargeCode</code> property.
     */
    public void setOtherChargeCode(final String pOtherChargeCode) {
        this.otherChargeCode = ContractUtility.convertToUpperCase(pOtherChargeCode);
    }
}
