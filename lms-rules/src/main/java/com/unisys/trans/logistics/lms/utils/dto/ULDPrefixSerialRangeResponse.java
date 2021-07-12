/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>ULDPrefixSerialRangeResponse</code> contains the response of the maintenance request received by
 * <code>ULDPrefixSerialRange</code>.
 * <p>
 * This contains the following attribute:
 * <ul>
 * <li><code>uldPrefixDto</code>
 * </ul>
 */
public class ULDPrefixSerialRangeResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -482522346918686721L;

    /**
     * Attribute to hold <code>uldPrefixDto</code> property.
     */
    private ULDPrefixDto uldPrefix;

    /**
     * <code>Default constructor.</code>
     */
    public ULDPrefixSerialRangeResponse() {

    }

    /**
     * Gets the <code>uldPrefixDto</code> property.
     * <p>
     * 
     * @return the current value of <code>uldPrefix</code> property.
     */
    public ULDPrefixDto getUldPrefix() {
        return this.uldPrefix;
    }

    /**
     * Sets the <code>uldPrefixDto</code> property.
     * <p>
     * 
     * @param pUldPrefixDto the new value of the <code>uldPrefix</code> property.
     */
    public void setUldPrefix(final ULDPrefixDto pUldPrefixDto) {
        this.uldPrefix = pUldPrefixDto;
    }

}
