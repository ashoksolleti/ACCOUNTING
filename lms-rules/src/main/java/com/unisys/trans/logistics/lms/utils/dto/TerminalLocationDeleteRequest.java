/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

/**
 * <code>TerminalLocationDeleteRequest</code> is used for deleting the terminal location information. The
 * terminal location name is required to delete the terminal location.<br>
 * <code>
 * <ul>
 * <li>terminalLocationName
 * <li>oId
 * </ul>
 * </code>
 */
public class TerminalLocationDeleteRequest extends TerminalAreaDeleteRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -1898179164818902827L;

    /**
     * Attribute to hold the <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold the <code>terminalLocationName</code> property.
     */
    private String terminalLocationName;

    /**
     * <code>Default constructor.</code>
     */
    public TerminalLocationDeleteRequest() {

    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * The unique database key for terminal location. The ID is assigned when the object is persisted (EOT).
     * <br>
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>terminalLocationName</code> property.
     * <p>
     * The name of the terminal location thats needs to be deleted.
     * <p>
     * <b>Format: </b><br>
     * 1-9 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * 1MSCA
     * <p>
     * 
     * @return the current value of the <code>terminalLocationName</code> property.
     */
    public java.lang.String getTerminalLocationName() {
        return this.terminalLocationName;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * The unique database key for terminal location. The ID is assigned when the object is persisted (EOT).
     * <br>
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.
     */
    @Override
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>terminalLocationName</code> property.
     * <p>
     * The name of the terminal location thats needs to be deleted.
     * <p>
     * <b>Format: </b><br>
     * 1-9 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * 1MSCA
     * <p>
     * 
     * @param pTerminalLocationName the new value of the <code>terminalLocationName</code> property.
     */
    public void setTerminalLocationName(final java.lang.String pTerminalLocationName) {
        this.terminalLocationName = pTerminalLocationName;
    }
}
