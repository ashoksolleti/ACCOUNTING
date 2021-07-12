/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>TerminalAreaStatusChangeRequest</code> is used for updating the closed indicator status for the
 * <code>TerminalArea</code>.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>status
 * <li>oId
 * <li>terminalAreaName
 * <li>terminalName
 * <li>terminalOId
 * <li>terminalVersion
 * <li>terminalAreaIdentifier
 * </ul>
 * </code>
 */
public class TerminalAreaStatusChangeRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -1379267482760551262L;

    /**
     * Attribute to hold the <code>status</code> property.
     */
    private int status;

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
     * Attribute to hold the <code>terminalVersion</code> property.
     */
    private Long terminalVersion;

    /**
     * <code>Default constructor.</code>
     */
    public TerminalAreaStatusChangeRequest() {

    }

    /**
     * Gets the <code>status</code> property.
     * <p>
     * Indicates if the terminal area is closed or open or restricted.<br>
     * <p>
     * <b>Possible Values: </b><br>
     * <code>0</code> - If the Terminal Area is open.<br>
     * <code>1</code> - If the Terminal Area is closed.<br>
     * <code>2</code> - If the Terminal Area is restricted.<br>
     * <p>
     * 
     * @return the current value of the <code>status</code> property.<br>
     */
    public int getStatus() {
        return this.status;
    }

    /**
     * Gets the <code>areaNameIdentifier</code> property.
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
     * @return the current value of the <code>areaNameIdentifier</code> property.
     */
    public String getTerminalAreaIdentifier() {
        return this.terminalAreaIdentifier;
    }

    /**
     * Gets the <code>terminalAreaName</code> property.
     * <p>
     * The terminal area whose status is to be changed.
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
     * The name of terminal where in all the terminal areas are located.
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
     * Sets the <code>status</code> property.
     * <p>
     * Indicates if the terminal area is closed or open or restricted.<br>
     * <p>
     * <b>Possible Values: </b><br>
     * <code>0</code> - If the Terminal Area is open.<br>
     * <code>1</code> - If the Terminal Area is closed.<br>
     * <code>2</code> - If the Terminal Area is restricted.<br>
     * <p>
     * 
     * @param pStatus the new value of the <code>status</code> property.
     */
    public void setStatus(final int pStatus) {
        this.status = pStatus;
    }

    /**
     * Sets the <code>terminalAreaIdentifier</code> property.
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
     * @param pTerminalAreaIdentifier the new value of the <code>terminalAreaIdentifier</code> property.
     */
    public void setTerminalAreaIdentifier(final String pTerminalAreaIdentifier) {
        this.terminalAreaIdentifier = pTerminalAreaIdentifier;
    }

    /**
     * Sets the <code>terminalAreaName</code> property.
     * <p>
     * The terminal area whose status is to be changed.
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
     * Sets the <code>terminalName</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * MSP
     * 
     * @param pTerminalName the new value of the <code>terminalName</code> property.
     */
    public void setTerminalName(final String pTerminalName) {
        this.terminalName = pTerminalName;
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
