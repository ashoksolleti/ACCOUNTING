/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>TerminalLocationNameChangeRequest</code> is used for updating the name of the Terminal Location.
 * <p>
 * This contains the following attributes: <code>
 * <ul>
 * <li>terminalAreaName
 * <li>terminalOId
 * <li>terminalVersion
 * <li>terminalAreaIdentifier
 * <li>terminalLocationOldName
 * <li>terminalLocationNewName
 * <li>terminalLocationOId
 * </ul>
 * </code>
 */
public class TerminalLocationNameChangeRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -4164831780653897692L;

    /**
     * Attribute to hold the <code>terminalAreaIdentifier</code> property.
     */
    private String terminalAreaIdentifier;

    /**
     * Attribute to hold the <code>terminalAreaName</code> property.
     */
    private String terminalAreaName;

    /**
     * Attribute to hold the <code>terminalLocationNewName</code> property.
     */
    private String terminalLocationNewName;

    /**
     * Attribute to hold the <code>terminalAreaOldName</code> property.
     */
    private String terminalLocationOldName;

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
    public TerminalLocationNameChangeRequest() {

    }

    /**
     * Gets the <code>terminalAreaIdentifier</code> property.
     * <p>
     * Identifier which decided what data to display to the user on successful update of the terminal area.
     * <p>
     * There are two scenarios possible:
     * <p>
     * 1. When the area name identifier is left blank and the status of a existing area in the terminal is
     * changed, then all the terminal areas within the terminal as displayed to user along with the updated
     * terminal area.<br>
     * 2. When the area name identifier is entered and the status of the area is changed then only the updated
     * terminal area is displayed to the user.
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
     * This field holds the name of the terminal area where the location is residing.
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
     * Gets the <code>terminalLocationNewName</code> property.
     * <p>
     * This field holds the name of the terminal location which would replace the current location name.
     * <p>
     * <b>Format: </b><br>
     * 1-9 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * 2AREA
     * <p>
     * 
     * @return the current value of the <code>terminalLocationNewName</code> property.
     */
    public String getTerminalLocationNewName() {
        return this.terminalLocationNewName;
    }

    /**
     * Gets the <code>terminalLocationOldName</code> property.
     * <p>
     * This field holds the name of the terminal location that would be replaced by the new name.
     * <p>
     * <b>Format: </b><br>
     * 1-9 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * 2AREA
     * <p>
     * 
     * @return the current value of the <code>terminalLocationOldName</code> property.
     */
    public String getTerminalLocationOldName() {
        return this.terminalLocationOldName;
    }

    /**
     * Gets the <code>terminalOId</code> property.
     * <p>
     * The unique database key for terminal. This ID is assigned when the object is persisted (EOT).<br>
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
     * Sets the <code>terminalAreaIdentifier</code> property.
     * <p>
     * Identifier which decided what data to display to the user on successful update of the terminal area.
     * <p>
     * There are two scenarios possible:
     * <p>
     * <ul>
     * <li>When the area name identifier is left blank and the status of a existing area in the terminal is
     * changed, then all the terminal areas within the terminal as displayed to user along with the updated
     * terminal area.
     * <li>When the area name identifier is entered and the status of the area is changed then only the
     * updated terminal area is displayed to the user.
     * </ul>
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
     * This field holds the name of the terminal area where the location is residing.
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
        this.terminalAreaName = ContractUtility.convertToUpperCase(pTerminalAreaName);
    }

    /**
     * Sets the <code>terminalLocationNewName</code> property.
     * <p>
     * This field holds the name of the terminal location which would replace the current location name.
     * <p>
     * <b>Format: </b><br>
     * 1-7 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * 2AREA
     * <p>
     * 
     * @param pTerminalLocationNewName the new value of the <code>terminalLocationNewName</code> property.
     */
    public void setTerminalLocationNewName(final String pTerminalLocationNewName) {
        this.terminalLocationNewName = ContractUtility.convertToUpperCase(pTerminalLocationNewName);
    }

    /**
     * Sets the <code>terminalLocationOldName</code> property.
     * <p>
     * This field holds the name of the terminal location that would be replaced by the new name.
     * <p>
     * <b>Format: </b><br>
     * 1-7 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * 2AREA
     * <p>
     * 
     * @param pTerminalLocationOldName the new value of the <code>terminalLocationOldName</code> property.
     */
    public void setTerminalLocationOldName(final String pTerminalLocationOldName) {
        this.terminalLocationOldName = ContractUtility.convertToUpperCase(pTerminalLocationOldName);
    }

    /**
     * Sets the <code>terminalOId</code> property.
     * <p>
     * The unique database key for terminal. This ID is assigned when the object is persisted (EOT).<br>
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
