/* ====================================== */
/* Copyright(c) 2012 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.utils.dto.constants.AggregateType;

/**
 * <code>AggregateMemberDto</code> class contain information specific to a
 * AggregateMember.<br>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>memberCodes
 * <li>memberType
 * <li>exclusionIndicator
 * </code>
 * </ul>
 */
public class AggregateMemberDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 7898486064654433998L;

    /**
     * Attribute to hold <code>exclusionIndicator</code> property.
     */
    private boolean exclusionIndicator;

    /**
     * Attribute to hold <code>memberCodes</code> property.
     */
    private List<String> memberCodes;

    /**
     * Attribute to hold <code>memberType</code> property.
     */
    private AggregateType memberType;

    /**
     * Gets the <code>exclusionIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>exclusionIndicator</code> property.
     */
    public boolean getExclusionIndicator() {
        return this.exclusionIndicator;
    }

    /**
     * Gets the <code>memberCodes</code> property.
     * <p>
     * 
     * @return the current value of the <code>memberCodes</code> property.
     */
    public List<String> getMemberCodes() {
        return this.memberCodes;
    }

    /**
     * Gets the <code>memberType</code> property.
     * <p>
     * 
     * @return the current value of the <code>memberType</code> property.
     */
    public AggregateType getMemberType() {
        return this.memberType;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * Unique key to identify the <code>SpotRateId</code>.It is of type Long.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    @Override
    public Long getOId() {
        // return this.oId;
        return null;
    }

    /**
     * Sets the <code>ExclusionIndicator</code> property.
     * <p>
     * 
     * @param pExclusionIndicator
     *            the new value of the <code>ExclusionIndicator</code> property.<br>
     */
    public void setExclusionIndicator(final boolean pExclusionIndicator) {
        this.exclusionIndicator = pExclusionIndicator;
    }

    /**
     * Sets the <code>memberCodes</code> property.
     * <p>
     * 
     * @param pMemberCodes
     *            the new value of the <code>memberCodes</code> property.<br>
     */
    public void setMemberCodes(final List<String> pMemberCodes) {
        this.memberCodes = pMemberCodes;
    }

    /**
     * Sets the <code>memberType</code> property.
     * <p>
     * 
     * @param pMemberType
     *            the new value of the <code>memberType</code> property.<br>
     */
    public void setMemberType(final AggregateType pMemberType) {
        this.memberType = pMemberType;
    }

}
