/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>OfficeDeleteRequest</code> holds the information used to delete the office information.
 * <p>
 * The office identifier of the office being deleted is required to delete the office information. <br>
 * This contains the following attributes:<br>
 * <ul>
 * <li><code>officeIdentifier</code>
 * </ul>
 */

public class OfficeDeleteRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 7956590451577172152L;

    /**
     * Attribute to hold <code>officeIdentifier</code> attribute.
     * <p>
     * Office identifier of an office must be unique.
     */
    private String officeIdentifier;

    /**
     * Gets the <code>officeIdentifier</code> attribute which is unique for an office.
     * <p>
     * 
     * @return the current value of <code>officeIdentifier</code> attribute.<br>
     */

    public String getOfficeIdentifier() {
        return this.officeIdentifier;
    }

    /**
     * Sets the <code>officeIdentifier</code> attribute which is unique for an office.
     * <p>
     * <b>Format: </b><br>
     * 1-20 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * 0MSP001
     * <p>
     * 
     * @param pOfficeIdentifier the current value of the <code>officeIdentifier</code> attribute.
     */

    public void setOfficeIdentifier(final String pOfficeIdentifier) {
        this.officeIdentifier = ContractUtility.convertToUpperCase(pOfficeIdentifier);
    }

}
