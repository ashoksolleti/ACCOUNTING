/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractCodeDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.utils.dto.constants.RemovalReasonCodeType;

/**
 * <code>RemovalReasonCodeDto</code> holds all the attributes that are associated to RemovalReasonCode.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>type
 * <li>oId
 * </code>
 * </ul>
 */
public class RemovalReasonCodeDto extends AbstractCodeDto {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 2540388041256282255L;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>type</code> property.
     */
    private RemovalReasonCodeType type;

    /**
     * <code>Default constructor</code>.
     */
    public RemovalReasonCodeDto() {
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>type</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabetic<br>
     * <p>
     * <b>Example: </b><br>
     * E
     * <p>
     * 
     * @return the current value of <code>type</code> property.
     */
    public RemovalReasonCodeType getType() {
        return this.type;
    }

    /**
     * Sets the <code>code</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-3 Alphanumeric<br>
     * <p>
     * <b>Example: </b><br>
     * 35A
     * <p>
     * 
     * @param pCode the new value of <code>code</code> property.<br>
     */
    @Override
    public void setCode(final String pCode) {
        super.setCode(ContractUtility.convertToUpperCase(pCode));
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>type</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 numeric <br>
     * <p>
     * <b>Example: </b><br>
     * 4
     * <p>
     * 
     * @param pType the new value of <code>type</code> property.<br>
     */
    public void setType(final RemovalReasonCodeType pType) {
        this.type = pType;
    }
}
