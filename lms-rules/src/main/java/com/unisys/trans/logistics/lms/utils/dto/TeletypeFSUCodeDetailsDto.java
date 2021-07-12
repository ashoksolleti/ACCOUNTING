/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.utils.dto.constants.FSUOptionType;
import com.unisys.trans.logistics.lms.utils.dto.constants.FSUType;

import java.io.Serializable;

/**
 * <code>TeletypeFSUCodeDetailsDto</code> holds all the attributes that are associated to a TeletypeFSUCode.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>oId
 * <li>statusCode
 * <li>statusOption
 * <li>ttyAddressProfileOId
 * </code>
 * </ul>
 */
public class TeletypeFSUCodeDetailsDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 7778214044827508339L;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>statusCode</code> property.
     */
    private FSUType statusCode;

    /**
     * Attribute to hold <code>statusOption</code> property.
     */
    private FSUOptionType statusOption;

    /**
     * Attribute to hold <code>ttyAddressProfileOId</code> property.<br>
     * <p>
     * This contains id of the parent TeletypeAddressProfile entity.
     */
    private Long ttyAddressProfileOId;

    /**
     * <code>Default constructor. </code>
     */
    public TeletypeFSUCodeDetailsDto() {
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of <code>oId</code> property.
     */
    public final Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>statusCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabetic
     * <p>
     * <b>Example: </b><br>
     * RCT
     * <p>
     * 
     * @return the current value of <code>statusCode</code> property.
     */
    public final FSUType getStatusCode() {
        return this.statusCode;
    }

    /**
     * Gets the <code>statusOption</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabetic
     * <p>
     * <b>Example: </b><br>
     * N
     * <p>
     * 
     * @return the current value of <code>statusOption</code> property.
     */
    public final FSUOptionType getStatusOption() {
        return this.statusOption;
    }

    /**
     * Gets the <code>ttyAddressProfileOId</code> property.
     * <p>
     * 
     * @return the current value of <code>ttyAddressProfileOId</code> property.
     */
    public final Long getTtyAddressProfileOId() {
        return this.ttyAddressProfileOId;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of <code>oId</code> property.<br>
     */
    public final void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>statusCode</code> property.<br>
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabetic
     * <p>
     * <b>Example: </b><br>
     * RCT
     * <p>
     * 
     * @param pStatusCode the new value of <code>statusCode</code> property.<br>
     */
    public final void setStatusCode(final FSUType pStatusCode) {
        this.statusCode = pStatusCode;
    }

    /**
     * Sets the <code>statusOption</code> property.<br>
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabetic
     * <p>
     * <b>Example: </b><br>
     * N
     * <p>
     * 
     * @param pStatusOption the new value of <code>statusOption</code> property.<br>
     */
    public final void setStatusOption(final FSUOptionType pStatusOption) {
        this.statusOption = pStatusOption;
    }

    /**
     * Sets the <code>ttyAddressProfileOId</code> property.
     * <p>
     * 
     * @param pTtyAddressProfileOId the new value of <code>ttyAddressProfileOId</code> property.<br>
     */
    public final void setTtyAddressProfileOId(final Long pTtyAddressProfileOId) {
        this.ttyAddressProfileOId = pTtyAddressProfileOId;
    }
}