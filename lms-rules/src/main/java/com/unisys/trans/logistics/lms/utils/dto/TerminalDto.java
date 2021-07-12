/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.util.List;

/**
 * <code>TerminalDto</code> contains specific data applicable to the terminal.
 * <p>
 * This contains the following attributes:<br>
 * <code>
 * <ul>
 * <li>name
 * <li>oId
 * <li>stationCode
 * <li>terminalAreas
 * </ul>
 * </code>
 */
public class TerminalDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -2787916779193891186L;

    /**
     * Attribute to hold <code>name</code> property.
     */
    private String name;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>stationCode</code> property.
     */
    private String stationCode;

    /**
     * Attribute to hold <code>terminalAreas</code> property.
     */
    private List<TerminalAreaDto> terminalAreas;

    /**
     * <code>Default constructor.</code>
     */
    public TerminalDto() {

    }

    /**
     * Gets the <code>name</code> property.
     * <p>
     * This field holds the name of the terminal.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * MSP
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
     * The unique database key for terminal. The ID is assigned when the object is persisted (EOT).<br>
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>stationCode</code> property.
     * <p>
     * This field holds the station name from where the user has logged in.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @return the current value of the <code>stationCode</code> property.
     */
    public String getStationCode() {

        return this.stationCode;
    }

    /**
     * Gets the <code>terminalAreas</code> property.
     * <p>
     * This field holds the list of <code>TerminalAreaDto</code> objects. <code>TerminalAreaDto</code> holds
     * the area specific information.
     * <p>
     * 
     * @return the current value of the <code>terminalAreas</code> property.
     */
    public List<TerminalAreaDto> getTerminalAreas() {
        return this.terminalAreas;
    }

    /**
     * Sets the <code>name</code> property.
     * <p>
     * This field holds the name of the terminal.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @param pTerminalName the new value of the <code>name </code>property.
     */
    public void setName(final String pTerminalName) {
        this.name = pTerminalName;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * The unique database key for terminal. The ID is assigned when the object is persisted (EOT).<br>
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>stationCode </code>property.
     * <p>
     * This field holds the station name from where the user has logged in.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @param pStationCode the new value of the <code>stationCode</code> property.
     */
    public void setStationCode(final String pStationCode) {
        this.stationCode = ContractUtility.convertToUpperCase(pStationCode);
    }

    /**
     * Sets the <code>terminalAreas</code> property.
     * <p>
     * This field holds the list of <code>TerminalAreaDto</code> objects. <code>TerminalAreaDto</code> holds
     * the area specific information.
     * <p>
     * 
     * @param pTerminalAreaDtos the new value of the <code>terminalAreas</code> property.
     */
    public void setTerminalAreas(final List<TerminalAreaDto> pTerminalAreaDtos) {
        this.terminalAreas = pTerminalAreaDtos;
    }

}
