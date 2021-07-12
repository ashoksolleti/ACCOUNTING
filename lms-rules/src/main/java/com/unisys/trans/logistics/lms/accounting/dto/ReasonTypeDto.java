/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.accounting.dto.constants.ActionType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>ReasonTypeDto</code> entity holds history of static data.
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>reason
 * <li>description
 * <li>action
 * <li>error
 * <li>oId
 * </code>
 * </ul>
 */
public class ReasonTypeDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -6418664683725011979L;

    /**
     * Attribute to hold <code>action</code> property.
     */
    private ActionType action;

    /**
     * Attribute to hold <code>description</code> property.
     */
    private String description;

    /**
     * Attribute to hold <code>error</code> property.
     */
    private boolean error;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>reason</code> property.
     */
    private String reason;

    /**
     * Gets the <code>action</code> property.
     * 
     * @return the current value of the <code>action</code> property.<br>
     */
    public ActionType getAction() {
        return this.action;
    }

    /**
     * Gets the <code>description</code> property.
     * 
     * @return the current value of the <code>description</code> property.<br>
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Gets the <code>error</code> property.
     * 
     * @return the current value of the <code>error</code> property.<br>
     */
    public boolean getError() {
        return this.error;
    }

    /**
     * Gets the <code>oId</code> property.
     * 
     * @return the current value of the <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>reason</code> property.
     * 
     * @return the current value of the <code>reason</code> property.<br>
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * Sets the <code>Action</code> property.
     * 
     * @param pAction
     *            the new value of the <code>action</code> property.
     */
    public void setAction(final ActionType pAction) {
        this.action = pAction;
    }

    /**
     * Sets the <code>description</code> property.
     * 
     * @param pDescription
     *            the new value of the <code>description</code> property.
     */
    public void setDescription(final String pDescription) {
        this.description = ContractUtility.convertToUpperCase(pDescription);
    }

    /**
     * Sets the <code>error</code> property.
     * 
     * @param pError the error to set
     */
    public void setError(final boolean pError) {
        this.error = pError;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.
     */

    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>reason</code> property.
     * 
     * @param pReason
     *            the new value of the <code>reason</code> property.
     */
    public void setReason(final String pReason) {
        this.reason = ContractUtility.convertToUpperCase(pReason);
    }

}
