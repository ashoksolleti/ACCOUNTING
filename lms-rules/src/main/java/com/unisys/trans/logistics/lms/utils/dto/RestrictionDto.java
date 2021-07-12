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
 * <code>RestrictionDto</code> contains specific data applicable to the station and carrier.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>carrierCode
 * <li>oId
 * <li>remarks
 * <li>displayRemarksCode
 * <li>systemWideIndicator
 * <li>restrictionDetails
 * <li>stationCode
 * </code>
 * </ul>
 */
public class RestrictionDto extends PersistenceObjectDto {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 5987468028605845621L;

    /**
     * Attribute to hold <code>carrierCode</code> property.
     * <p>
     * Carrier code for which the restriction information is to be displayed. If not entered, it defaults to
     * the host carrier.
     */
    private String carrierCode;

    /**
     * Attribute to hold <code>oId</code> property.
     * <p>
     * Unique key identify the <code>RestrictionDto</code>.It is of type Long.
     */
    private Long oId;

    /**
     * Attribute to hold <code>remarks</code> property.
     * <p>
     * Collect charges or restriction remarks. If the DISPLAY REMARKS field is set to N, this field is
     * optional; otherwise, it is mandatory.
     */
    private String remarks;

    /**
     * Attribute to hold <code>displayRemarksCode</code> property.
     * <p>
     * Display the remarks field as a warning message instead of the generic warning CC MAY NOT BE ALLOWED or
     * POSSIBLE xxxxxxx RESTR, where "xxxxxxx" is EXPORT, IMPORT, or TRANSIT. Values are blank default to:
     * <li>N - Do not display the remarks field as a warning message.
     * <li>A - Always display the remarks field as a warning message. The remarks are always displayed
     * whenever restrictions and collect charges are checked and an restriction or collect charges warning is
     * found.The generic collect charge and restriction remarks warning will never be displayed.
     * <li>C - The remarks field is collect charges information only. Display this as a warning message in
     * place of the CC MAY NOT BE ALLOWED warning.
     * <li>E - The remarks field is restriction information only. Display this as a warning message in place
     * of the POSSIBLE xxxxxxxx RESTR warning
     * <li>N - Do not display the remarks field in place of the generic collect charges and restriction
     * warning messages.If an agent is restricted from entering collect charges, and restrictions for a
     * station, this field is protected, otherwise, it is optional. This field is applicable only for Import
     * restrictions.
     */
    private String remarksDisplayCode;

    /**
     * Attribute to hold <code>restrictionDetails</code> property.
     * <p>
     * Contains detail of all the restrictions.
     */
    private List<RestrictionDetailDto> restrictionDetails;

    /**
     * Attribute to hold <code>stationCode</code> property.
     * <p>
     * Station for which the restriction information is to be displayed.
     */
    private String stationCode;

    /**
     * Attribute to hold <code>systemWideIndicator</code> property.
     * <p>
     * Indicator to denote that the restriction is for all the station in the system.
     * <li><code>true</code> �System wide restrictions.
     * <li><code>false</code>�Not a system wide restriction.
     */
    private boolean systemWideIndicator;

    private List<com.unisys.trans.logistics.lms.framework.preferences.RestrictionDetailDto> restrictionDetails1;

    /**
     * <code>Default constructor.</code>
     */
    public RestrictionDto() {

    }

    /**
     * <code>Parameterised constructor.</code>
     * <p>
     * 
     * @param pOId the new value of the <code>pOld</code> property.
     *            <p>
     * @param pVersion the new value of the <code>version</code> property.
     *            <p>
     */
    public RestrictionDto(final Long pOId, final long pVersion) {
        this.oId = pOId;
        this.setVersion(pVersion);
    }

    /**
     * Gets the value of the <code>carrierCode</code> property.
     * <p>
     * Unique key identify the <code>RestrictionDto</code>.It is of type Long.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphanumeric<br>
     * <b>Example: </b><br>
     * UW
     * 
     * @return the current value of the <code>carrierCode</code> property.
     */
    public String getCarrierCode() {
        return this.carrierCode;
    }

    /**
     * Gets the value of <code>OID</code> property.
     * <p>
     * 
     * @return the current value of the <code>OID</code> property.
     */
    @Override
    public Long getOId() {

        return this.oId;

    }

    /**
     * Gets the value of the <code>remarks</code> property.
     * <p>
     * Collect charges or restriction remarks. If the DISPLAY REMARKS field is set to N, this field is
     * optional; otherwise, it is mandatory.
     * <p>
     * <b>Format: </b><br>
     * Free format text<br>
     * <b>Example: </b><br>
     * Excellent
     * <p>
     * 
     * @return the current value of the <code>remarks</code> property.<br>
     */
    public String getRemarks() {
        return this.remarks;
    }

    /**
     * Gets the value of the <code>remarksDisplayCode</code> property.
     * <p>
     * Display the remarks field as a warning message instead of the generic warning CC MAY NOT BE ALLOWED or
     * POSSIBLE xxxxxxx RESTR, where "xxxxxxx" is EXPORT, IMPORT, or TRANSIT. Values are blank default to:
     * <li>N - Do not display the remarks field as a warning message.
     * <li>A - Always display the remarks field as a warning message. The remarks are always displayed
     * whenever restrictions and collect charges are checked and an restriction or collect charges warning is
     * found.The generic collect charge and restriction remarks warning will never be displayed.
     * <li>C - The remarks field is collect charges information only. Display this as a warning message in
     * place of the CC MAY NOT BE ALLOWED warning.
     * <li>E - The remarks field is restriction information only. Display this as a warning message in place
     * of the POSSIBLE xxxxxxxx RESTR warning
     * <li>N - Do not display the remarks field in place of the generic collect charges and restriction
     * warning messages.If an agent is restricted from entering collect charges, and restrictions for a
     * station, this field is protected, otherwise, it is optional. This field is applicable only for Import
     * restrictions.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @return the current value of the <code>remarksDisplayCode</code> property.<br>
     */
    public String getRemarksDisplayCode() {
        return this.remarksDisplayCode;
    }

    /**
     * Holds the list of <code>RestrictionDetail</code> that contains the restriction details.
     * <p>
     * Contains detail of all the restrictions.
     * <p>
     * 
     * @return the current value of <code>restrictionDetails</code> property.
     */
    public List<RestrictionDetailDto> getRestrictionDetails() {
        return this.restrictionDetails;
    }

    /**
     * Gets the value of the <code>stationCode</code> property.
     * <p>
     * Station for which the restriction information is to be displayed.
     * <p>
     * <b>Format: </b><br>
     * 3 or 5 Alphabets<br>
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
     * Gets the value of <code>systemWideIndicator</code> property.
     * <p>
     * Indicator to denote that the restriction is for all the station in the system.
     * <li><code>true</code> �Indicator to denote that the restriction is for all the stations in the system
     * <li><code>false</code>�Indicator to denote that the restriction is not for all the stations in the
     * system.
     * <p>
     * 
     * @return <code>boolean</code> the new value of the systemWideIndicator Property.
     */
    public boolean isSystemWideIndicator() {
        return this.systemWideIndicator;
    }

    /**
     * Sets the <code>carrierCode</code> property.
     * <p>
     * Unique key identify the <code>RestrictionDto</code>.It is of type Long.
     * <p>
     * <b>Format: </b><br>
     * 2 Alphanumeric<br>
     * <b>Example: </b><br>
     * UW
     * <p>
     * 
     * @param pCarrierCode the new value of the <code>carrierCode</code> property.
     */
    public void setCarrierCode(final String pCarrierCode) {
        this.carrierCode = ContractUtility.convertToUpperCase(pCarrierCode);
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * Unique identifier for <code>Restriction</code>.It is of type Long.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>remarks</code> property.
     * <p>
     * Collect charges or restriction remarks. If the DISPLAY REMARKS field is set to N, this field is
     * optional; otherwise, it is mandatory.
     * <p>
     * <b>Format: </b><br>
     * Free format text<br>
     * <b>Example: </b><br>
     * Excellent
     * <p>
     * 
     * @param pRemarks the new value of the <code>remarks</code> property.
     */
    public void setRemarks(final String pRemarks) {
        this.remarks = pRemarks;
    }

    /**
     * Sets the <code>remarksDisplayCode</code> property.
     * <p>
     * Display the remarks field as a warning message instead of the generic warning CC MAY NOT BE ALLOWED or
     * POSSIBLE xxxxxxx RESTR, where "xxxxxxx" is EXPORT, IMPORT, or TRANSIT. Values are blank default to:
     * <li>N - Do not display the remarks field as a warning message.
     * <li>A - Always display the remarks field as a warning message. The remarks are always displayed
     * whenever restrictions and collect charges are checked and an restriction or collect charges warning is
     * found.The generic collect charge and restriction remarks warning will never be displayed.
     * <li>C - The remarks field is collect charges information only. Display this as a warning message in
     * place of the CC MAY NOT BE ALLOWED warning.
     * <li>E - The remarks field is restriction information only. Display this as a warning message in place
     * of the POSSIBLE xxxxxxxx RESTR warning
     * <li>N - Do not display the remarks field in place of the generic collect charges and restriction
     * warning messages.If an agent is restricted from entering collect charges, and restrictions for a
     * station, this field is protected, otherwise, it is optional. This field is applicable only for Import
     * restrictions.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @param pRemarksDisplayCode the new value of the <code>remarksDisplayCode</code> property.
     */
    public void setRemarksDisplayCode(final String pRemarksDisplayCode) {
        this.remarksDisplayCode = ContractUtility.convertToUpperCase(pRemarksDisplayCode);
    }

    /**
     * Sets the <code>restrictionDetails</code> property.
     * <p>
     * Contains detail of all the restrictions.it is of type <code>RestrictionDetail</code> class.
     * <p>
     * 
     * @param pRestrictionDetails the new value of the <code>restrictionDetails</code> property.
     */
    public void setRestrictionDetails(final List<RestrictionDetailDto> pRestrictionDetails) {
        this.restrictionDetails = pRestrictionDetails;
    }

    /**
     * Sets the <code>stationCode</code> property.
     * <p>
     * Station for which the restriction information is to be displayed.
     * <p>
     * <b>Format: </b><br>
     * 3 or 5 Alphabets<br>
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
     * Sets the <code>systemWideIndicator </code>property.
     * <p>
     * Indicator to denote that the restriction is for all the station in the system.
     * <li><code>true</code> �Indicator to denote that the restriction is for all the stations in the system
     * <li><code>false</code>�Indicator to denote that the restriction is not for all the stations in the
     * system.
     * <p>
     * 
     * @param pSystemWideIndicator the new value of the <code>systemWideIndicator</code> property.
     */
    public void setSystemWideIndicator(final boolean pSystemWideIndicator) {
        this.systemWideIndicator = pSystemWideIndicator;
    }

    public List<com.unisys.trans.logistics.lms.framework.preferences.RestrictionDetailDto> getRestrictionDetails1() {
        return restrictionDetails1;
    }

    public void setRestrictionDetails1(List<com.unisys.trans.logistics.lms.framework.preferences.RestrictionDetailDto> restrictionDetails1) {
        this.restrictionDetails1 = restrictionDetails1;
    }
}
