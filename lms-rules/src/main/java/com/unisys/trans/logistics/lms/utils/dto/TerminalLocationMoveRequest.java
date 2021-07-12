/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>TerminalLocationMoveRequest</code> is used for moving the <code>TerminalLocation</code> from one area
 * to another.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>terminalAreaName
 * <li>terminalOId
 * <li>terminalVersion
 * <li>destinationTerminalAreaName
 * <li>originTerminalAreaName
 * <li>terminalLocationName
 * </ul>
 * </code>
 */
public class TerminalLocationMoveRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -6969294569379366809L;

    /**
     * Attribute to hold the <code>destinationTerminalAreaName</code> property.
     */
    private String destinationTerminalAreaName;

    /**
     * Attribute to hold the <code>originTerminalAreaName</code> property.
     */
    private String originTerminalAreaName;

    /**
     * Attribute to hold the <code>terminalAreaName</code> property.
     */
    private String terminalAreaName;

    /**
     * Attribute to hold the <code>terminalLocationName</code> property.
     */
    private String terminalLocationName;

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
    public TerminalLocationMoveRequest() {

    }

    /**
     * Gets the <code>destinationTerminalAreaName</code> property.
     * <p>
     * This field holds the name of the destination terminal area where the location is to be moved.
     * <p>
     * <b>Format: </b><br>
     * 1-7 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * 2AREA
     * 
     * @return the current value of the <code>destinationTerminalAreaName</code> property.
     */
    public String getDestinationTerminalAreaName() {
        return this.destinationTerminalAreaName;
    }

    /**
     * Gets the <code>originTerminalAreaName</code> property.
     * <p>
     * This field holds the name of the terminal area from where the terminal location is being moved.
     * <p>
     * <b>Format: </b><br>
     * 1-7 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * 2AREA
     * 
     * @return the current value of the <code>originTerminalAreaName</code> property.
     */
    public String getOriginTerminalAreaName() {
        return this.originTerminalAreaName;
    }

    /**
     * Gets the <code>terminalAreaName</code> property.
     * <p>
     * This field holds the name of the terminal area.
     * <p>
     * <b>Format: </b><br>
     * 1-7 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * 2AREA
     * 
     * @return the current value of the <code>terminalAreaName</code> property.
     */
    public String getTerminalAreaName() {
        return this.terminalAreaName;
    }

    /**
     * Gets the <code>terminaLocationName</code> property.
     * <p>
     * This field holds the name of the terminal location that is to be moved.
     * <p>
     * <b>Format: </b><br>
     * 1-9 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * 2MISCA
     * 
     * @return the current value of the <code>terminalLocationName</code> property.
     */
    public String getTerminalLocationName() {
        return this.terminalLocationName;
    }

    /**
     * Gets the <code>terminalOId</code> property.
     * <p>
     * The unique database key for terminal. The ID is assigned when the object is persisted (EOT).<br>
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
     * Sets the <code>destinationTerminalAreaName</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-7 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * 2AREA
     * 
     * @param pDestinationTerminalAreaName <br>
     *            the new value of the <code>destinationTerminalAreaName</code> property.<br>
     *            </p>
     */
    public void setDestinationTerminalAreaName(final String pDestinationTerminalAreaName) {
        this.destinationTerminalAreaName = ContractUtility.convertToUpperCase(pDestinationTerminalAreaName);
    }

    /**
     * Sets the <code>originTerminalAreaName</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-7 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * 2AREA
     * 
     * @param pOriginTerminalAreaName <br>
     *            the new value of the <code>originTerminalAreaName </code>property.<br>
     *            </p>
     */
    public void setOriginTerminalAreaName(final String pOriginTerminalAreaName) {
        this.originTerminalAreaName = ContractUtility.convertToUpperCase(pOriginTerminalAreaName);
    }

    /**
     * Sets the <code>terminalAreaName</code> property.
     * <p>
     * This field holds the name of the terminal area.
     * <p>
     * <b>Format: </b><br>
     * 1-7 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * 2AREA
     * 
     * @param pTerminalAreaName <br>
     *            the new value of the <code>terminalAreaName </code>property.<br>
     */
    public void setTerminalAreaName(final String pTerminalAreaName) {
        this.terminalAreaName = ContractUtility.convertToUpperCase(pTerminalAreaName);
    }

    /**
     * Sets the <code>terminaLocationName</code> property.
     * <p>
     * This field holds the name of the terminal location that is to be moved.
     * <p>
     * <b>Format: </b><br>
     * 1-9 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * 2MISCA
     * 
     * @param pTerminalLocationName <br>
     *            the new value of the <code>terminalLocationName</code> property.<br>
     */
    public void setTerminalLocationName(final String pTerminalLocationName) {
        this.terminalLocationName = pTerminalLocationName;
    }

    /**
     * Sets the <code>terminalOId</code> property.
     * <p>
     * The unique database key for terminal. The ID is assigned when the object is persisted (EOT).<br>
     * <p>
     * 
     * @param pTerminalOId <br>
     *            the new value of the <code>terminalOId</code> property.<br>
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
     * @param pTerminalVersion <br>
     *            the new value of the <code>terminalVersion</code> property.<br>
     */
    public void setTerminalVersion(final Long pTerminalVersion) {
        this.terminalVersion = pTerminalVersion;
    }

}
