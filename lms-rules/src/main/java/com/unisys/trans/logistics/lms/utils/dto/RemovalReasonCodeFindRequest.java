/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.utils.dto.constants.RemovalReasonCodeType;

/**
 * <code>RemovalReasonCodeFindRequest</code> class is the request to find RemovalReasonCode information.
 * <p>
 * <code>RemovalReasonCodeFindRequest</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>code
 * <li>type
 * </code>
 * </ul>
 */
public class RemovalReasonCodeFindRequest extends AbstractRequest {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 8469405593177403406L;

    /**
     * Attribute to hold the <code>otherChargeCode</code> property.
     * <p>
     * The code based on which the Removal Reason Codes to be retrieved.<br>
     */
    private String code;

    /**
     * Attribute to hold the <code>type</code> property.
     */
    private RemovalReasonCodeType type;

    /**
     * <code>Default constructor</code>.
     */
    public RemovalReasonCodeFindRequest() {
    }

    /**
     * Gets the <code>code</code> property.
     * <p>
     * 
     * @return the current value of the <code>code</code> property.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Gets the <code>type</code> property.
     * <p>
     * 
     * @return the current value of the <code>type</code> property.
     */
    public RemovalReasonCodeType getType() {
        return this.type;
    }

    /**
     * Sets the <code>code</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 alpha numeric
     * <p>
     * <b>Example: </b><br>
     * MY
     * <p>
     * 
     * @param pCode the new value of the <code>code</code> property.
     */
    public void setCode(final String pCode) {
        this.code = ContractUtility.convertToUpperCase(pCode);
    }

    /**
     * Sets the <code>type</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2 alpha numeric
     * <p>
     * <b>Example: </b><br>
     * MY
     * <p>
     * 
     * @param pType the new value of the <code>type</code> property.
     */
    public void setType(final RemovalReasonCodeType pType) {
        this.type = pType;
    }
}
