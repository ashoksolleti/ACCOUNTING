/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>TerminalAreaNameChangeRequest</code> is used for updating the name of the <code>TerminalArea</code>.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>oId
 * <li>terminalAreaName
 * <li>terminalAreaOldName
 * <li>terminalAreaNewName
 * <li>terminalOId
 * <li>terminalVersion
 * <li>terminalAreaIdentifier
 * </ul>
 * </code>
 */
public class TerminalAreaNameChangeRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -8832074812829128444L;

    /**
     * Attribute to hold the <code>terminalAreaName</code> property.
     */
    private String terminalAreaName;

    /**
     * Attribute to hold the <code>terminalAreaNewName</code> property.
     */
    private String terminalAreaNewName;

    /**
     * Attribute to hold the <code>terminalAreaOldName</code> property.
     */
    private String terminalAreaOldName;

    /**
     * Attribute to hold the <code>terminalOId</code> property.
     */
    private Long terminalOId;

    /**
     * Attribute to hold the <code>terminalVersion</code> property.
     */
    private Long terminalVersion;

    /**
     * <code>Default constructor.</code>
     */
    public TerminalAreaNameChangeRequest() {

    }

    /**
     * Gets the <code>terminalAreaName</code> property.
     * <p>
     * The terminal area whose name is to be changed.
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
     * Gets the <code>terminalAreaNewName</code> property.
     * <p>
     * The new name that would replace the existing terminal area name.
     * <p>
     * <b>Format: </b><br>
     * 1-7 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * 2AREA
     * <p>
     * 
     * @return the current value of the <code>terminalAreaNewName</code> property.
     */
    public String getTerminalAreaNewName() {
        return this.terminalAreaNewName;
    }

    /**
     * Gets the <code>terminalAreaName</code> property.
     * <p>
     * The current name of the terminal area that is to be changed.
     * <p>
     * <b>Format: </b><br>
     * 1-7 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * 2AREA
     * <p>
     * 
     * @return the current value of the <code>terminalAreaOldName</code> property.
     */
    public String getTerminalAreaOldName() {
        return this.terminalAreaOldName;
    }

    /**
     * Gets the <code>terminalOId</code> property.
     * <p>
     * The unique database key for a terminal. The ID is assigned when the object gets persisted (EOT).<br>
     * <p>
     * 
     * @return the current value of the <code>terminalOId</code> property.
     */
    public Long getTerminalOId() {
        return this.terminalOId;
    }

    /**
     * Gets the <code>terminalVersion</code> property.
     * <p>
     * The version entry of the terminal record in the database.
     * <p>
     * 
     * @return the current value of the <code>terminalVersion</code> property.
     */
    public Long getTerminalVersion() {
        return this.terminalVersion;
    }

    /**
     * Sets the <code>terminalAreaName</code> property.
     * <p>
     * The terminal area whose name is to be changed.
     * <p>
     * <b>Format: </b><br>
     * 1-7 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * 2AREA
     * <p>
     * 
     * @param pTerminalAreaName the new value of the <code>terminalAreaName </code>property.
     */
    public void setTerminalAreaName(final String pTerminalAreaName) {
        this.terminalAreaName = ContractUtility.convertToUpperCase(pTerminalAreaName);
    }

    /**
     * Sets the <code>terminalAreaNewName</code> property.
     * <p>
     * The new name that would replace the existing terminal area name.
     * <p>
     * <b>Format: </b><br>
     * 1-7 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * 2AREA
     * <p>
     * 
     * @param pTerminalAreaNewName the new value of the <code>terminalAreaNewName</code> property.
     */
    public void setTerminalAreaNewName(final String pTerminalAreaNewName) {
        this.terminalAreaNewName = ContractUtility.convertToUpperCase(pTerminalAreaNewName);
    }

    /**
     * Sets the <code>terminalAreaName</code> property.
     * <p>
     * The current name of the terminal area that needs to be changed.
     * <p>
     * <b>Format: </b><br>
     * 1-7 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * 2AREA
     * <p>
     * 
     * @param pTerminalAreaOldName the new value of the <code>terminalAreaOldName</code>property.
     */
    public void setTerminalAreaOldName(final String pTerminalAreaOldName) {
        this.terminalAreaOldName = ContractUtility.convertToUpperCase(pTerminalAreaOldName);
    }

    /**
     * Sets the <code>terminalOId</code> property.
     * <p>
     * The unique database key for a terminal. The ID is assigned when the object gets persisted (EOT).<br>
     * <p>
     * 
     * @param pTerminalOId the new value of the <code>terminalOId</code> property.
     */
    public void setTerminalOId(final Long pTerminalOId) {
        this.terminalOId = pTerminalOId;
    }

    /**
     * Sets the <code>terminalVersion</code> property.
     * <p>
     * The version entry of the terminal record in the database.
     * <p>
     * 
     * @param pTerminalVersion the new value of the <code>terminalVersion</code> property.
     */
    public void setTerminalVersion(final Long pTerminalVersion) {
        this.terminalVersion = pTerminalVersion;
    }
}
