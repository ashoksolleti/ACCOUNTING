/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>TerminalLocationStatusChangeRequest</code> is used for updating the closed indicator status for the
 * Terminal Location.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>status
 * <li>oId
 * <li>terminalLocationName
 * </ul>
 * </code>
 */
public class TerminalLocationStatusChangeRequest extends TerminalAreaStatusChangeRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -564882583866671794L;

    /**
     * Attribute to hold the <code>status</code> property.
     */
    private int status;

    /**
     * Attribute to hold the <code>terminalLocationName</code> property.
     */
    private String terminalLocationName;

    /**
     * <code>Default constructor.</code>
     */
    public TerminalLocationStatusChangeRequest() {

    }

    /**
     * Gets the <code>status</code> property.
     * <p>
     * Indicates if the terminal location is closed or open or restricted.<br>
     * <p>
     * <b>Possible Values: </b><br>
     * <code>0</code> - If the Terminal Location is open.<br>
     * <code>1</code> - If the Terminal Location is closed.<br>
     * <code>2</code> - If the Terminal Location is restricted.
     * <p>
     * 
     * @return the current value of the <code>status</code> property.
     */
    @Override
    public int getStatus() {
        return this.status;
    }

    /**
     * Gets the <code>terminalLocationName</code> property.
     * <p>
     * This field holds the name of the terminal location whose status is to be changed.
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
    public String getTerminalLocationName() {
        return this.terminalLocationName;
    }

    /**
     * Sets the <code>status</code> property.
     * <p>
     * Indicates if the terminal location is closed or open or restricted.
     * <p>
     * <b>Possible Values: </b><br>
     * <code>0</code> - If the Terminal Location is open.<br>
     * <code>1</code> - If the Terminal Location is closed.<br>
     * <code>2</code> - If the Terminal Location is restricted.
     * <p>
     * 
     * @param pStatus the new value of the <code>status</code> property.
     */
    @Override
    public void setStatus(final int pStatus) {
        this.status = pStatus;
    }

    /**
     * Sets the <code>terminalLocationName</code> property.
     * <p>
     * This field holds the name of the terminal location whose status is to be changed.
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
    public void setTerminalLocationName(final String pTerminalLocationName) {
        this.terminalLocationName = ContractUtility.convertToUpperCase(pTerminalLocationName);
    }

}
