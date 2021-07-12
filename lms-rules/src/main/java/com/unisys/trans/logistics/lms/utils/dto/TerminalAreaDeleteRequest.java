/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>TerminalAreaDeleteRequest</code> is used for deleting the terminal area information.
 * <p>
 * The name of the terminal area to be deleted is required to delete the terminal area information.
 * <p>
 * <code>
 * <ul>
 * <li>oId
 * <li>terminalAreaIdentifier
 * <li>terminalAreaName
 * <li>terminalName
 * <li>terminalOId
 * <li>terminalVerison
 * </ul>
 * </code>
 */
public class TerminalAreaDeleteRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 2654567442893001390L;

    /**
     * Attribute to hold the <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold the <code>terminalAreaIdentifier</code> property.
     */
    private String terminalAreaIdentifier;

    /**
     * Attribute to hold the <code>terminalAreaName</code> property.
     */
    private String terminalAreaName;

    /**
     * Attribute to hold the <code>terminalName</code> property.
     */
    private String terminalName;

    /**
     * Attribute to hold the <code>terminalOId</code> property.
     */
    private Long terminalOId;

    /**
     * Attribute to hold the <code>terminalVerison</code> property.
     */
    private Long terminalVerison;

    /**
     * <code>Default constructor.</code>
     */
    public TerminalAreaDeleteRequest() {

    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * The unique database key for a terminal area. The ID is assigned when the object gets persisted (EOT).
     * <br>
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>terminalAreaIdentifier</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-7 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * 2AREA
     * <p>
     * 
     * @return the current value of the <code>terminalAreaIdentifier</code> property.
     */
    public String getTerminalAreaIdentifier() {
        return this.terminalAreaIdentifier;
    }

    /**
     * Gets the <code>terminalAreaName</code> property.
     * <p>
     * The name of the terminal area that has to be deleted.
     * <p>
     * <b>Format: </b><br>
     * 1-7 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * 2AREA
     * <p>
     * 
     * @return the current value of the <code>terminalAreaName</code> property.
     */
    public String getTerminalAreaName() {
        return this.terminalAreaName;
    }

    /**
     * Gets the <code>terminalName</code> property.
     * <p>
     * The name of the terminal inside which the terminal area resides.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @return the current value of the <code>terminalName</code> property.
     */
    public String getTerminalName() {
        return this.terminalName;
    }

    /**
     * Gets the <code>terminalOId </code>property.
     * <p>
     * The unique database key for the terminal. The ID is assigned when the object gets persisted (EOT).<br>
     * <p>
     * 
     * @return the current value of the <code>terminalOId</code> property.
     */
    public Long getTerminalOId() {
        return this.terminalOId;
    }

    /**
     * Gets the <code>terminalVerison</code> property.
     * <p>
     * The version entry of the terminal record in the database.
     * <p>
     * 
     * @return the current value of the <code>terminalVerison</code> property.
     */
    public Long getTerminalVerison() {
        return this.terminalVerison;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * The unique database key for a terminal area. The ID is assigned when the object gets persisted (EOT).
     * <br>
     * <p>
     * 
     * @param pOId <br>
     *            the new value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>terminalAreaIdentifier</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-7 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * 2AREA
     * <p>
     * 
     * @param pTerminalAreaIdentifier the new value of the <code>terminalAreaIdentifier</code> property.
     */
    public void setTerminalAreaIdentifier(final String pTerminalAreaIdentifier) {
        this.terminalAreaIdentifier = pTerminalAreaIdentifier;
    }

    /**
     * Sets the <code>terminalAreaName</code> property.
     * <p>
     * The name of the terminal area
     * <p>
     * <b>Format: </b><br>
     * 1-7 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * 2AREA
     * <p>
     * 
     * @param pTerminalAreaName the new value of the <code>terminalAreaName</code> property.
     */
    public void setTerminalAreaName(final String pTerminalAreaName) {
        this.terminalAreaName = pTerminalAreaName;
    }

    /**
     * Sets the <code>terminalName</code> property.
     * <p>
     * The name of the terminal inside which the terminal area resides.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @param pTerminalName the new value of the <code>terminalName</code> property.
     */
    public void setTerminalName(final String pTerminalName) {

        this.terminalName = pTerminalName;
    }

    /**
     * Sets the <code>terminalOId</code> property.
     * <p>
     * The unique database key for the terminal. The ID is assigned when the object gets persisted (EOT).<br>
     * <p>
     * 
     * @param pTerminalOId the new value of the <code>terminalOId</code> property.
     */
    public void setTerminalOId(final Long pTerminalOId) {
        this.terminalOId = pTerminalOId;
    }

    /**
     * Sets the <code>terminalVerison</code> property.
     * <p>
     * The version entry of the terminal record in the database.
     * <p>
     * 
     * @param pTerminalVerison the new value of the <code>terminalVerison</code> property.
     */
    public void setTerminalVerison(final Long pTerminalVerison) {
        this.terminalVerison = pTerminalVerison;
    }

}
