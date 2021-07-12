/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.parts.dto;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.io.Serializable;

/**
 * <code>UldDetailDto</code> contains ULD details of a participant.
 * <p>
 * This contains the following attributes: <code>
 * <ul>
 * <li>blacklistedIndicator
 * <li>oId
 * <li>remarks
 * <li>sitaTelexAddress
 * <li>telex
 * <li>uldParticipantType
 * </ul>
 * </code>
 */
public class UldDetailDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 6537705171624727322L;

    /**
     * Attribute to hold <code>blacklistedIndicator</code> property.
     */
    private Boolean blacklistedIndicator;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>remarks</code> property.
     */
    private String remarks;

    /**
     * Attribute to hold <code>sitaTelexAddress</code> property.
     */
    private String sitaTelexAddress;

    /**
     * Attribute to hold <code>telex</code> property.
     */
    private String telex;

    /**
     * Attribute to hold <code>uldParticipantType</code> property.
     */
    private String uldParticipantType;

    /**
     * <code>Default constructor.</code>
     */
    public UldDetailDto() {

    }

    /**
     * Gets the <code>blacklistedIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <code><li>True</code> The participant has been blacklisted.<br>
     * <code><li>False</code> The participant has not been blacklisted.<br>
     * <p>
     * 
     * @return the current value of <code>blacklistedIndicator</code> property.<br>
     */
    public Boolean getBlacklistedIndicator() {
        return this.blacklistedIndicator;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>remarks</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-68 character set for all types<br>
     * <p>
     * <b>Example: </b><br>
     * Remarks1
     * <p>
     * 
     * @return the current value of <code>remarks</code> entered by the participant.<br>
     */
    public String getRemarks() {
        return this.remarks;
    }

    /**
     * Gets the <code>sitaTelexAddress</code> property.
     * <p>
     * <b>Format: </b><br>
     * 7-10 Alphanumeric, hyphen (-), and period (.) including spaces<br>
     * <p>
     * <b>Example: </b><br>
     * TEL 123
     * <p>
     * 
     * @return the current value of <code>sitaTelexAddress</code> property.<br>
     */
    public String getSitaTelexAddress() {
        return this.sitaTelexAddress;
    }

    /**
     * Gets the <code>telex</code> property.
     * <p>
     * <b>Format: </b><br>
     * 7-10 Alphanumeric, hyphen (-), and period (.) including spaces<br>
     * <p>
     * <b>Example: </b><br>
     * MSPKKUW
     * <p>
     * 
     * @return the current value of <code>telex</code> property.<br>
     */
    public String getTelex() {
        return this.telex;
    }

    /**
     * Gets the <code>uldParticipantType</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * M
     * <p>
     * 
     * @return the current value of <code>uldParticipantType</code> property.<br>
     */
    public String getUldParticipantType() {
        return this.uldParticipantType;
    }

    /**
     * Sets the <code>blacklistedIndicator</code> property.
     * <p>
     * <b>Possible Values: </b><br>
     * <li><code>true</code><br>
     * The participant has been blacklisted.
     * <li><code>false</code><br>
     * The participant has not been blacklisted.
     * <p>
     * 
     * @param pBlacklistedIndicator the new value of <code>blacklistedIndicator</code> property.<bR>
     */
    public void setBlacklistedIndicator(final Boolean pBlacklistedIndicator) {
        this.blacklistedIndicator = pBlacklistedIndicator;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pId the new value of <code>oId</code> property.<br>
     */
    public void setOId(final Long pId) {
        this.oId = pId;
    }

    /**
     * Sets the <code>remarks</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-68 character set for all types <br>
     * <p>
     * <b>Example: </b><br>
     * Remarks1
     * <p>
     * 
     * @param pRemarks the new value of <code>remarks</code> property.<br>
     */
    public void setRemarks(final String pRemarks) {
        this.remarks = pRemarks;
    }

    /**
     * Sets the <code>sitaTelexAddress</code> property.
     * <p>
     * <b>Format: </b><br>
     * 7-10 Alphanumeric, hyphen (-), and period (.) including spaces <br>
     * <p>
     * <b>Example: </b><br>
     * TEL 123
     * <p>
     * 
     * @param pSitaTelexAddress the new value of <code>sitaTelexAddress</code> property.<br>
     */
    public void setSitaTelexAddress(final String pSitaTelexAddress) {
        this.sitaTelexAddress = pSitaTelexAddress;
    }

    /**
     * Sets the <code>telex</code> property.
     * <p>
     * <b>Format: </b><br>
     * 7-10 Alphanumeric, hyphen (-), and period (.) including spaces <br>
     * <p>
     * <b>Example: </b><br>
     * MSPKKUW
     * <p>
     * 
     * @param pTelex the new value of <code>telex</code> property.<br>
     */
    public void setTelex(final String pTelex) {
        this.telex = pTelex;
    }

    /**
     * Sets the <code>uldParticipantType</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 alphabet<br>
     * <p>
     * <b>Example: </b><br>
     * M - Master air waybill recurring
     * <p>
     * 
     * @param pUldParticipantType the new value of <code>uldParticipantType</code> property.<br>
     */
    public void setUldParticipantType(final String pUldParticipantType) {
        this.uldParticipantType = ContractUtility.convertToUpperCase(pUldParticipantType);
    }
}
