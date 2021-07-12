/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * <code>RemovalReasonCodeResponse </code> represents the response object of the maintenance request received
 * by <code>RemovalReasonCode</code>.
 * <p>
 * <code>RemovalReasonCodeResponse </code> contains the following attribute:<br>
 * <ul>
 * <code>
 * <li>removalReasonCodes
 * </code>
 * </ul>
 */
public class RemovalReasonCodeResponse extends AbstractResponse {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 7238493513414160286L;

    /**
     * Attribute to hold list of <code>RemovalReasonCode</code> objects.<br>
     */
    private List<RemovalReasonCodeDto> removalReasonCodes = new ArrayList<RemovalReasonCodeDto>();

    /**
     * <code>Default constructor</code>.
     */
    public RemovalReasonCodeResponse() {
    }

    /**
     * Adds the RemovalReasonCode information to the <code>removalReasonCodes</code> property.
     * <p>
     * 
     * @param pRemovalReasonCodeDto the new removalReasonCode information to be added to the
     *            <code>removalReasonCodes</code> property.
     */
    public void addRemovalReasonCodeDto(final RemovalReasonCodeDto pRemovalReasonCodeDto) {
        this.removalReasonCodes.add(pRemovalReasonCodeDto);
    }

    /**
     * Gets the <code>removalReasonCodes</code> property.
     * <p>
     * 
     * @return the current value of <code>removalReasonCodes</code> property.
     */
    public List<RemovalReasonCodeDto> getRemovalReasonCodes() {
        return this.removalReasonCodes;
    }

    /**
     * Sets the <code>removalReasonCodes</code> property.
     * <p>
     * 
     * @param pRemovalReasonCodes the new value of the <code>removalReasonCodes</code> property.
     */
    public void setRemovalReasonCodes(final List<RemovalReasonCodeDto> pRemovalReasonCodes) {
        this.removalReasonCodes = pRemovalReasonCodes;
    }
}
