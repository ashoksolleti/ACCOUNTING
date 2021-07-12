/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.utils.dto.constants.TerminalLocationType;

import java.io.Serializable;

/**
 * <code>TerminalLocationDto</code> contains specific data applicable to the terminal location. <code>
 * <ul>
 * <li>status
 * <li>name
 * <li>oId
 * <li>type
 * </ul>
 * </code>
 */
public class TerminalLocationDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -2535299430423910269L;

    /**
     * Attribute to hold <code>name</code> property.
     */
    private String name;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>status</code> property.
     */
    private int status;

    /**
     * Attribute to hold <code>terminalAreaOId</code> property.
     */
    private Long terminalAreaOId;

    /**
     * Attribute to hold <code>type</code> property.
     */
    private TerminalLocationType type;

    /**
     * <code>Default constructor.</code>
     */
    public TerminalLocationDto() {

    }

    /**
     * Constructor with name as an argument.
     * <p>
     * 
     * @param pName the new value of the <code>name</code> property.<br>
     */
    public TerminalLocationDto(final String pName) {
        this.name = pName;
    }

    /**
     * Constructor with name, status and location type as an argument.
     * <p>
     * 
     * @param pName the new value of the <code>name</code> property.
     * @param pStatus the new value of the <code>status</code> property.
     * @param pType the new value of the <code>type</code> property.
     */
    public TerminalLocationDto(final String pName, final int pStatus, final TerminalLocationType pType) {
        this.name = pName;
        this.status = pStatus;
        this.type = pType;
    }

    /**
     * Gets the <code>name</code> property.
     * <p>
     * This field holds the name of the terminal location.
     * <p>
     * <b>Format: </b><br>
     * 1-9 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * 1MSCA
     * <p>
     * 
     * @return the current value of the <code>name</code> property.
     */
    public String getName() {
        return this.name;
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
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>status</code> property.
     * <p>
     * Indicates if the terminal location is closed or open or restricted.<br>
     * <p>
     * <b>Possible Values: </b><br>
     * <code>0</code> - If the Terminal Location is open.<br>
     * <code>1</code> - If the Terminal Location is closed.<br>
     * <code>2</code> - If the Terminal Location is restricted.<br>
     * <p>
     * 
     * @return the current value of the <code>status</code> property,
     */
    public int getStatus() {
        return this.status;
    }

    /**
     * Gets the <code>terminalAreaOId</code> property.
     * <p>
     * The unique database key for terminal area. The ID is assigned when the object is persisted (EOT).<br>
     * <p>
     * 
     * @return the current value of the <code>terminalAreaOId</code> property.
     */
    public Long getTerminalAreaOId() {
        return this.terminalAreaOId;
    }

    /**
     * Gets the <code>type</code> property.
     * <p>
     * This field holds the type of the location.
     * <p>
     * 
     * @return the current value of the <code>type</code> property.
     */
    public TerminalLocationType getType() {

        return this.type;
    }

    /**
     * Sets the <code>name</code> property.
     * <p>
     * This field holds the name of the terminal location.
     * <p>
     * <b>Format: </b><br>
     * 1-9 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * 1MSCA
     * <p>
     * 
     * @param pLocationName the new value of the <code>name</code> property.
     */
    public void setName(final String pLocationName) {
        this.name = ContractUtility.convertToUpperCase(pLocationName);
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
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>status</code> property.
     * <p>
     * Indicates if the terminal location is closed or open or restricted.<br>
     * <p>
     * <b>Possible Values: </b><br>
     * <code>0</code> - If the Terminal Location is open.<br>
     * <code>1</code> - If the Terminal Location is closed.<br>
     * <code>2</code> - If the Terminal Location is restricted.<br>
     * <p>
     * 
     * @param pStatus the new value of the <code>status</code> property.
     */
    public void setStatus(final int pStatus) {
        this.status = pStatus;
    }

    /**
     * Sets the <code>terminalAreaOId</code> property.
     * <p>
     * The unique database key for terminal area. The ID is assigned when the object is persisted (EOT).<br>
     * <p>
     * 
     * @param pTerminalAreaOId the new value of the <code>terminalAreaOId</code> property.
     */
    public void setTerminalAreaOId(final Long pTerminalAreaOId) {
        this.terminalAreaOId = pTerminalAreaOId;
    }

    /**
     * Sets the <code>type</code> property.
     * <p>
     * This field holds the type of the location.
     * <p>
     * 
     * @param pLocationType the new value of the <code>type </code>property.
     */
    public void setType(final TerminalLocationType pLocationType) {
        this.type = pLocationType;
    }

}
