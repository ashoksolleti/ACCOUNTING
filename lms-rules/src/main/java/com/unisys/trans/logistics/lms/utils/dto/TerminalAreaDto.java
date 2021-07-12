/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

/**
 * <code>TerminalAreaDto</code> contains specific data applicable to the terminal area.
 * <p>
 * <code>
 * <ul>
 * <li>status
 * <li>locationCount
 * <li>name
 * <li>oId
 * <li>terminalLocations
 * <li>type
 * </ul>
 * </code>
 */
public class TerminalAreaDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 6380646363219809368L;

    /**
     * Attribute to hold <code>locationCount</code> property.
     */
    private BigInteger locationCount;

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
     * Attribute to hold <code>terminalLocationDtos</code> property.
     */
    private List<TerminalLocationDto> terminalLocations;

    /**
     * Attribute to hold <code>terminalOId</code> property.
     */
    private Long terminalOId;

    /**
     * Attribute to hold <code>type</code> property.
     */
    private String type;

    /**
     * <code>Default constructor.</code>
     */
    public TerminalAreaDto() {

    }

    /**
     * Gets the <code>locationCount</code> property.
     * <p>
     * The total count of terminal locations within a terminal area.
     * <p>
     * <b>Format: </b><br>
     * Numeric
     * <p>
     * <b>Example: </b><br>
     * 10
     * <p>
     * 
     * @return the current value of the <code>locationCount</code> property.
     */
    public BigInteger getLocationCount() {
        return this.locationCount;
    }

    /**
     * Gets the <code>name</code> property.
     * <p>
     * The name of the terminal area.
     * <p>
     * <b>Format: </b><br>
     * 1-7 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * 2AREA
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
     * @return the current value of the <code>status</code> property.
     */
    public int getStatus() {
        return this.status;
    }

    /**
     * Gets the <code>terminalLocations</code> property.
     * <p>
     * This field holds a list of <code>TerminalAreaDto</code> objects. <code>TerminalAreaDto</code> object
     * holds area related information.
     * <p>
     * 
     * @return the current value of the <code>terminalLocations</code> property.
     */
    public List<TerminalLocationDto> getTerminalLocations() {
        return this.terminalLocations;
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
     * Gets the <code>type</code> property.
     * <p>
     * Identifies the type of the area. The type of the area is determined by the type of the location inside
     * it.
     * <p>
     * <b>Format: </b><br>
     * 2-7 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * BEI
     * <p>
     * 
     * @return the current value of the <code>type</code> property.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Sets the <code>locationCount</code> property.
     * <p>
     * The total count of terminal locations within a terminal area.
     * <p>
     * <b>Format: </b><br>
     * Numeric
     * <p>
     * <b>Example: </b><br>
     * 10
     * <p>
     * 
     * @param pLocationCount the new value of the <code>locationCount</code> property.
     */
    public void setLocationCount(final BigInteger pLocationCount) {
        this.locationCount = pLocationCount;
    }

    /**
     * Sets the <code>name</code> property.
     * <p>
     * The name of the terminal area.
     * <p>
     * <b>Format: </b><br>
     * 1-7 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * 2AREA
     * <p>
     * 
     * @param pTerminalAreaName the new value of the <code>name</code> property.
     */
    public void setName(final String pTerminalAreaName) {
        this.name = ContractUtility.convertToUpperCase(pTerminalAreaName);
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * The unique database key for a terminal area. The ID is assigned when the object gets persisted (EOT).
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
     * Sets the <code>terminalLocations</code> property.
     * <p>
     * This field holds a list of <code>TerminalAreaDto</code> objects. <code>TerminalAreaDto</code> object
     * holds area related information.
     * <p>
     * 
     * @param pTerminalLocationDtos the new value of the <code>terminalLocations</code> property.
     */
    public void setTerminalLocations(final List<TerminalLocationDto> pTerminalLocationDtos) {

        this.terminalLocations = pTerminalLocationDtos;
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
     * Sets the <code>type</code> property.
     * <p>
     * Identifies the type of the area. The type of the area is determined by the type of the location inside
     * it.
     * <p>
     * <b>Format: </b><br>
     * 2-7 Alpha Numeric
     * <p>
     * <b>Example: </b><br>
     * BEI
     * <p>
     * 
     * @param pType the new value of the <code>type</code> property.
     */
    public void setType(final String pType) {
        this.type = pType;
    }

}
