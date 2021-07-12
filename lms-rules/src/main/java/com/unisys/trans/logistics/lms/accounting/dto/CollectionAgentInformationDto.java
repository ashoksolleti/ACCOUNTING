/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.accounting.dto.constants.CollectionAgentType;
import com.unisys.trans.logistics.lms.framework.dto.ContactDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>CollectionAgentInformationDto</code> class contain information specific
 * to an CollectionInformationDetails.<br>
 * This contains the following attributes:<br>
 * <ul>
 * <li>agentName</li>
 * <li>agentStation</li>
 * <li>agentAddress</li>
 * <li>contactDetailsDto</li>
 * <li>agentType</li>
 * <li>employeeID</li>
 * <li>agentEmailId1</li>
 * <li>agentEmailId2</li>
 * <li>agentPhone1</li>
 * <li>agentPhone2</li>
 * <li>agentPhone3</li>
 * <li>agentRemarks</li>
 * <li>collectorId</li>
 * <li>defaultEmail1</li>
 * <li>defaultEmail2</li>
 * </ul>
 */

public class CollectionAgentInformationDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>agentName</code> property.
     */
    private String agentName;

    /**
     * Attribute to hold <code>agentStation</code> property.
     */
    private String agentStation;

    /**
     * Attribute to hold <code>contactDetails</code> property.
     */
    private ContactDto contactDetailsDto;

    /**
     * Attribute to hold <code>agentType</code> property.
     */
    private CollectionAgentType agentType;

    /**
     * Attribute to hold <code>agentID</code> property.
     */
    private String employeeID;

    /**
     * Attribute to hold <code>agentEmailId1</code> property.
     */
    private String agentEmailId1;

    /**
     * Attribute to hold <code>agentEmailId2</code> property.
     */
    private String agentEmailId2;

    /**
     * Attribute to hold <code>agentPhone1</code> property.
     */
    private String agentPhone1;

    /**
     * Attribute to hold <code>agentPhone2</code> property.
     */
    private String agentPhone2;

    /**
     * Attribute to hold <code>agentPhone3</code> property.
     */
    private String agentPhone3;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>agentRemarks</code> property.
     */
    private String agentRemarks;

    /**
     * Attribute to hold <code>collectorId</code> property.
     */
    private String collectorId;

    /**
     * Attribute to hold <code>defaultEmail1</code> property.
     */
    private boolean defaultEmail1;

    /**
     * Attribute to hold <code>defaultEmail2</code> property.
     */
    private boolean defaultEmail2;

    /**
     * Gets the <code>agentName</code> property.
     * <p>
     * 
     * @return the current value of the <code>agentName</code> property.
     */
    public String getAgentName() {
        return ContractUtility.convertToUpperCase(this.agentName);
    }

    /**
     * Gets the <code>agentStation</code> property.
     * <p>
     * 
     * @return the current value of the <code>agentStation</code> property.
     */
    public String getAgentStation() {
        return ContractUtility.convertToUpperCase(this.agentStation);
    }

    /**
     * Gets the <code>agentEmailId1</code> property.
     * <p>
     * 
     * @return the current value of the <code>agentEmailId1</code> property.
     */
    public String getAgentEmailId1() {
        return this.agentEmailId1;
    }

    /**
     * Gets the <code>agentEmailId2</code> property.
     * <p>
     * 
     * @return the current value of the <code>agentEmailId2</code> property.
     */
    public String getAgentEmailId2() {
        return this.agentEmailId2;
    }

    /**
     * Gets the <code>agentPhone1</code> property.
     * <p>
     * 
     * @return the current value of the <code>agentPhone1</code> property.
     */
    public String getAgentPhone1() {
        return this.agentPhone1;
    }

    /**
     * Gets the <code>agentPhone2</code> property.
     * <p>
     * 
     * @return the current value of the <code>agentPhone2</code> property.
     */
    public String getAgentPhone2() {
        return this.agentPhone2;
    }

    /**
     * Gets the <code>agentPhone3</code> property.
     * <p>
     * 
     * @return the current value of the <code>agentPhone3</code> property.
     */
    public String getAgentPhone3() {
        return this.agentPhone3;
    }

    /**
     * Gets the <code>agentRemarks</code> property.
     * <p>
     * 
     * @return the current value of the <code>agentRemarks</code> property.
     */
    public String getAgentRemarks() {
        return this.agentRemarks;
    }

    /**
     * Sets the <code>agentName</code>.
     * <p>
     * 
     * @param pAgentName
     *            holds the new value of <code>agentName</code>
     */
    public void setAgentName(final String pAgentName) {
        this.agentName = ContractUtility.convertToUpperCase(pAgentName);
    }

    /**
     * Sets the <code>agentStation</code>.
     * <p>
     * 
     * @param pAgentStation
     *            holds the new value of <code>agentStation</code>
     */
    public void setAgentStation(final String pAgentStation) {
        this.agentStation = ContractUtility.convertToUpperCase(pAgentStation);
    }

    /**
     * Sets the <code>agentEmailId1</code>.
     * <p>
     * 
     * @param pAgentEmailId1
     *            holds the new value of <code>agentEmailId1</code>
     */
    public void setAgentEmailId1(final String pAgentEmailId1) {
        this.agentEmailId1 = pAgentEmailId1;
    }

    /**
     * Sets the <code>agentEmailId2</code>.
     * <p>
     * 
     * @param pAgentEmailId2
     *            holds the new value of <code>agentEmailId2</code>
     */
    public void setAgentEmailId2(final String pAgentEmailId2) {
        this.agentEmailId2 = pAgentEmailId2;
    }

    /**
     * Sets the <code>agentPhone1</code>.
     * <p>
     * 
     * @param pAgentPhone1
     *            holds the new value of <code>agentPhone1</code>
     */
    public void setAgentPhone1(final String pAgentPhone1) {
        this.agentPhone1 = pAgentPhone1;
    }

    /**
     * Sets the <code>agentPhone2</code>.
     * <p>
     * 
     * @param pAgentPhone2
     *            holds the new value of <code>agentPhone2</code>
     */
    public void setAgentPhone2(final String pAgentPhone2) {
        this.agentPhone2 = pAgentPhone2;
    }

    /**
     * Sets the <code>agentPhone3</code>.
     * <p>
     * 
     * @param pAgentPhone3
     *            holds the new value of <code>agentPhone3</code>
     */
    public void setAgentPhone3(final String pAgentPhone3) {
        this.agentPhone3 = pAgentPhone3;
    }

    /**
     * Sets the <code>oId</code>.
     * <p>
     * 
     * @param pOId
     *            holds the new value of <code>oId</code>
     */
    public void setoId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>agentRemarks</code>.
     * <p>
     * 
     * @param pAgentRemarks
     *            holds the new value of <code>agentRemarks</code>
     */
    public void setAgentRemarks(final String pAgentRemarks) {
        this.agentRemarks = pAgentRemarks;
    }

    /**
     * Gets the <code>collectorId</code> property.
     * <p>
     * 
     * @return the current value of the <code>collectorId</code> property.
     */
    public String getCollectorId() {
        return ContractUtility.convertToUpperCase(this.collectorId);
    }

    /**
     * Sets the <code>pCollectorId</code>.
     * <p>
     * 
     * @param pCollectorId
     *            holds the new value of <code>collectorId</code>
     */
    public void setCollectorId(final String pCollectorId) {
        this.collectorId = ContractUtility.convertToUpperCase(pCollectorId);
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * Unique key to identify the <code>SpotRateId</code>.It is of type Long.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */

    @Override
    public Long getOId() {

        return this.oId;
    }

    /**
     * Gets the <code>defaultEmail1</code> property.
     * <p>
     * 
     * @return the current value of the <code>defaultEmail1</code> property.
     */
    public boolean isDefaultEmail1() {
        return this.defaultEmail1;
    }

    /**
     * Sets the <code>pDefaultEmail1</code>.
     * <p>
     * 
     * @param pDefaultEmail1
     *            holds the new value of <code>defaultEmail1</code>
     */
    public void setDefaultEmail1(final boolean pDefaultEmail1) {
        this.defaultEmail1 = pDefaultEmail1;
    }

    /**
     * Gets the <code>defaultEmail2</code> property.
     * <p>
     * 
     * @return the current value of the <code>defaultEmail2</code> property.
     */
    public boolean isDefaultEmail2() {
        return this.defaultEmail2;
    }

    /**
     * Sets the <code>pDefaultEmail2</code>.
     * <p>
     * 
     * @param pDefaultEmail2
     *            holds the new value of <code>defaultEmail2</code>
     */
    public void setDefaultEmail2(final boolean pDefaultEmail2) {
        this.defaultEmail2 = pDefaultEmail2;
    }

    /**
     * Gets the <code>employeeID</code> property.
     * <p>
     * 
     * @return the current value of the <code>employeeID</code> property.
     */
    public String getEmployeeID() {
        return this.employeeID;
    }

    /**
     * Sets the <code>pEmployeeID</code>.
     * <p>
     * 
     * @param pEmployeeID
     *            holds the new value of <code>employeeID</code>
     */
    public void setEmployeeID(final String pEmployeeID) {
        this.employeeID = pEmployeeID;
    }

    /**
     * Gets the <code>agentType</code> property.
     * <p>
     * 
     * @return the current value of the <code>agentType</code> property.
     */
    public CollectionAgentType getAgentType() {
        return this.agentType;
    }

    /**
     * Sets the <code>pAgentType</code>.
     * <p>
     * 
     * @param pAgentType
     *            holds the new value of <code>agentType</code>
     */
    public void setAgentType(final CollectionAgentType pAgentType) {
        this.agentType = pAgentType;
    }

    /**
     * Gets the <code>contactDetailsDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>contactDetailsDto</code> property.
     */
    public ContactDto getContactDetailsDto() {
        return this.contactDetailsDto;
    }

    /**
     * Sets the <code>pContactDetailsDto</code>.
     * <p>
     * 
     * @param pContactDetailsDto
     *            holds the new value of <code>contactDetailsDto</code>
     */
    public void setContactDetailsDto(final ContactDto pContactDetailsDto) {
        this.contactDetailsDto = pContactDetailsDto;
    }

}
