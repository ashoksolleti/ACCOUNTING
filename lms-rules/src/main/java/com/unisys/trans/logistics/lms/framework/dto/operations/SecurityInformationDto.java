/* ====================================== */
/* Copyright (c) 2015 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.dto.operations;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.ExemptionReasonType;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.PrimaryIdType;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.ScreeningMethodType;

/**
 * <code>SecurityInformationDto</code> class represents the SecurityInformation information.
 * <p>
 * <code>SecurityInformationDto</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>oId.
 * <li>acceptedPieces.
 * <li>actualDropOffBy.
 * <li>companyName.
 * <li>delayScreening.
 * <li>eligiblePieces.
 * <li>employeeName.
 * <li>exemptPieces.
 * <li>inspectedBy.
 * <li>methodOfScreeningType.
 * <li>primaryIDPhotoMatchIndicator.
 * <li>primaryIDType.
 * <li>reasonForExemption.
 * <li>retainIndicator.
 * <li>screenedPieces.
 * <li>secondaryIDPhotoMatchIndicator.
 * <li>secondaryIDType.
 * <li>shipmentDto.
 * <li>skiddedCargoIndicator.
 * <li>staIndicator.
 * <li>typeOfOtherID.
 * </code>
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto
 * @see com.unisys.trans.logistics.lms.framework.dto.constants.operation.ExemptionReasonType
 * @see com.unisys.trans.logistics.lms.framework.dto.constants.operation.PrimaryIdType
 * @see com.unisys.trans.logistics.lms.framework.dto.constants.operation.ScreeningMethodType
 * 
 * @author Unisys
 * @version 1.0
 * @since 1.0
 */

public class SecurityInformationDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Attribute to hold the <code>oId</code> property.
     */
    private Long oId;
    
    /**
     * Attribute to hold the <code>acceptedPieces</code> property.
     */
    private int acceptedPieces;

    /**
     * Attribute to hold the <code>actualDropOffBy</code> property.
     */
    private String actualDropOffBy;

    /**
     * Attribute to hold the <code>companyName</code> property.
     */
    private String companyName;

    /**
     * Attribute to hold the <code>delayScreening</code> property.
     */
    private boolean delayScreening;

    /**
     * Attribute to hold the <code>eligiblePieces</code> property.
     */
    private Integer eligiblePieces;

    /**
     * Attribute to hold the <code>employeeName</code> property.
     */
    private String employeeName;

    /**
     * Attribute to hold the <code>exemptPieces</code> property.
     */
    private Integer exemptPieces;

    /**
     * Attribute to hold the <code>inspectedBy</code> property.
     */
    private String inspectedBy;

    /**
     * Attribute to hold the <code>methodOfScreeningType</code> property.
     */
    private String methodOfScreeningType;

    /**
     * Attribute to hold the <code>primaryIDPhotoMatchIndicator</code> property.
     */
    private String primaryIDPhotoMatchIndicator;

    /**
     * Attribute to hold the <code>primaryIDType</code> property.
     */
    private PrimaryIdType primaryIDType;

    /**
     * Attribute to hold the <code>reasonForExemption</code> property.
     */
    private String reasonForExemption;

    /**
     * Attribute to hold the <code>retainIndicator</code> property.
     */
    private boolean retainIndicator;

    /**
     * Attribute to hold the <code>screenedPieces</code> property.
     */
    private Integer screenedPieces;

    /**
     * Attribute to hold the <code>secondaryIDPhotoMatchIndicator</code> property.
     */
    private String secondaryIDPhotoMatchIndicator;

    /**
     * Attribute to hold the <code>secondaryIDType</code> property.
     */
    private String secondaryIDType;

    /**
     * Attribute to hold the <code>shipmentDto</code> property.
     */
    private ShipmentDto shipmentDto;

    /**
     * Attribute to hold the <code>skiddedCargoIndicator</code> property.
     */
    private Boolean skiddedCargoIndicator;

    /**
     * Attribute to hold the <code>staIndicator</code> property.
     */
    private String staIndicator;

    /**
     * Attribute to hold the <code>typeOfOtherID</code> property.
     */
    private String typeOfOtherID;
    
    private String stationSecurityIndicator;

    private boolean csdIndicator;

    public String getStationSecurityIndicator() {
        return this.stationSecurityIndicator;
    }

    public void setStationSecurityIndicator(final String pStationSecurityIndicator) {
        this.stationSecurityIndicator = pStationSecurityIndicator;
    }

    /**
     * <code>Default constructor.</code>
     */
    public SecurityInformationDto() {
    }

    /**
     * Gets the value of the <code>acceptedPieces</code> property injected by the Inversion of Control (IoC)
     * container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @return the current value of <code>acceptedPieces</code> property.
     */
    public int getAcceptedPieces() {
        return this.acceptedPieces;
    }

    /**
     * Sets the value of the <code>acceptedPieces</code> property injected by the Inversion of Control (IoC)
     * container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pAcceptedPieces the new value of the <code>acceptedPieces</code> property.
     */
    public void setAcceptedPieces(final int pAcceptedPieces) {
        this.acceptedPieces = pAcceptedPieces;
    }

    /**
     * Gets the value of the <code>actualDropOffBy</code> property injected by the Inversion of Control (IoC)
     * container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @return the current value of <code>actualDropOffBy</code> property.
     */
    public String getActualDropOffBy() {
        return this.actualDropOffBy;
    }

    /**
     * Sets the value of the <code>actualDropOffBy</code> property injected by the Inversion of Control (IoC)
     * container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pActualDropOffBy the new value of the <code>actualDropOffBy</code> property.
     */
    public void setActualDropOffBy(final String pActualDropOffBy) {
        this.actualDropOffBy = pActualDropOffBy;
    }

    /**
     * Gets the value of the <code>companyName</code> property injected by the Inversion of Control (IoC)
     * container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @return the current value of <code>companyName</code> property.
     */
    public String getCompanyName() {
        return this.companyName;
    }

    /**
     * Sets the value of the <code>companyName</code> property injected by the Inversion of Control (IoC)
     * container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pCompanyName the new value of the <code>companyName</code> property.
     */
    public void setCompanyName(final String pCompanyName) {
        this.companyName = pCompanyName;
    }

    /**
     * Gets the value of the <code>delayScreening</code> property injected by the Inversion of Control (IoC)
     * container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @return the current value of <code>delayScreening</code> property.
     */
    public boolean getDelayScreening() {
        return this.delayScreening;
    }

    /**
     * Sets the value of the <code>delayScreening</code> property injected by the Inversion of Control (IoC)
     * container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pDelayScreening the new value of the <code>delayScreening</code> property.
     */
    public void setDelayScreening(final boolean pDelayScreening) {
        this.delayScreening = pDelayScreening;
    }

    /**
     * Gets the value of the <code>eligiblePieces</code> property injected by the Inversion of Control (IoC)
     * container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @return the current value of <code>eligiblePieces</code> property.
     */
    public Integer getEligiblePieces() {
        return this.eligiblePieces;
    }

    /**
     * Sets the value of the <code>eligiblePieces</code> property injected by the Inversion of Control (IoC)
     * container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pEligiblePieces the new value of the <code>eligiblePieces</code> property.
     */
    public void setEligiblePieces(final Integer pEligiblePieces) {
        this.eligiblePieces = pEligiblePieces;
    }

    /**
     * Gets the value of the <code>employeeName</code> property injected by the Inversion of Control (IoC)
     * container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @return the current value of <code>employeeName</code> property.
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * Sets the value of the <code>employeeName</code> property injected by the Inversion of Control (IoC)
     * container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pEmployeeName the new value of the <code>employeeName</code> property.
     */
    public void setEmployeeName(String pEmployeeName) {
        this.employeeName = pEmployeeName;
    }

    /**
     * Gets the value of the <code>exemptPieces</code> property injected by the Inversion of Control (IoC)
     * container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @return the current value of <code>exemptPieces</code> property.
     */
    public Integer getExemptPieces() {
        return this.exemptPieces;
    }

    /**
     * Sets the value of the <code>exemptPieces</code> property injected by the Inversion of Control (IoC)
     * container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pExemptPieces the new value of the <code>exemptPieces</code> property.
     */
    public void setExemptPieces(final Integer pExemptPieces) {
        this.exemptPieces = pExemptPieces;
    }

    /**
     * Gets the value of the <code>inspectedBy</code> property injected by the Inversion of Control (IoC)
     * container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @return the current value of <code>inspectedBy</code> property.
     */
    public String getInspectedBy() {
        return this.inspectedBy;
    }

    /**
     * Sets the value of the <code>inspectedBy</code> property injected by the Inversion of Control (IoC)
     * container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pInspectedBy the new value of the <code>inspectedBy</code> property.
     */
    public void setInspectedBy(final String pInspectedBy) {
        this.inspectedBy = pInspectedBy;
    }

    /**
     * Gets the value of the <code>methodOfScreeningType</code> property injected by the Inversion of Control
     * (IoC) container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @return the current value of <code>methodOfScreeningType</code> property.
     */
    public String getMethodOfScreeningType() {
        return this.methodOfScreeningType;
    }

    /**
     * Sets the value of the <code>methodOfScreeningType</code> property injected by the Inversion of Control
     * (IoC) container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pMethodOfScreeningType the new value of the <code>methodOfScreeningType</code> property.
     */
    public void setMethodOfScreeningType(final String pMethodOfScreeningType) {
        this.methodOfScreeningType = pMethodOfScreeningType;
    }

    /**
     * Gets the value of the <code>OId</code> property injected by the Inversion of Control (IoC) container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @return the current value of <code>OId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Sets the value of the <code>OId</code> property injected by the Inversion of Control (IoC) container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pOId the new value of the <code>OId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Gets the value of the <code>primaryIDPhotoMatchIndicator</code> property injected by the Inversion of
     * Control (IoC) container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @return the current value of <code>primaryIDPhotoMatchIndicator</code> property.
     */
    public String getPrimaryIDPhotoMatchIndicator() {
        return this.primaryIDPhotoMatchIndicator;
    }

    /**
     * Sets the value of the <code>primaryIDPhotoMatchIndicator</code> property injected by the Inversion of
     * Control (IoC) container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pPrimaryIDPhotoMatchIndicator the new value of the <code>primaryIDPhotoMatchIndicator</code>
     *            property.
     */
    public void setPrimaryIDPhotoMatchIndicator(final String pPrimaryIDPhotoMatchIndicator) {
        this.primaryIDPhotoMatchIndicator = pPrimaryIDPhotoMatchIndicator;
    }

    /**
     * Gets the value of the <code>primaryIDType</code> property injected by the Inversion of Control (IoC)
     * container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @return the current value of <code>primaryIDType</code> property.
     */
    public PrimaryIdType getPrimaryIDType() {
        return this.primaryIDType;
    }

    /**
     * Sets the value of the <code>primaryIDType</code> property injected by the Inversion of Control (IoC)
     * container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pPrimaryIDType the new value of the <code>primaryIDType</code> property.
     */
    public void setPrimaryIDType(final PrimaryIdType pPrimaryIDType) {
        this.primaryIDType = pPrimaryIDType;
    }

    /**
     * Gets the value of the <code>reasonForExemption</code> property injected by the Inversion of Control
     * (IoC) container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @return the current value of <code>reasonForExemption</code> property.
     */
    public String getReasonForExemption() {
        return this.reasonForExemption;
    }

    /**
     * Sets the value of the <code>reasonForExemption</code> property injected by the Inversion of Control
     * (IoC) container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pReasonForExemption the new value of the <code>reasonForExemption</code> property.
     */
    public void setReasonForExemption(final String pReasonForExemption) {
        this.reasonForExemption = pReasonForExemption;
    }

    /**
     * Gets the value of the <code>retainIndicator</code> property injected by the Inversion of Control (IoC)
     * container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @return the current value of <code>retainIndicator</code> property.
     */
    public boolean isRetainIndicator() {
        return retainIndicator;
    }

    /**
     * Sets the value of the <code>retainIndicator</code> property injected by the Inversion of Control (IoC)
     * container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pRetainIndicator the new value of the <code>retainIndicator</code> property.
     */
    public void setRetainIndicator(boolean pRetainIndicator) {
        this.retainIndicator = pRetainIndicator;
    }

    /**
     * Gets the value of the <code>screenedPieces</code> property injected by the Inversion of Control (IoC)
     * container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @return the current value of <code>screenedPieces</code> property.
     */
    public Integer getScreenedPieces() {
        return this.screenedPieces;
    }

    /**
     * Sets the value of the <code>screenedPieces</code> property injected by the Inversion of Control (IoC)
     * container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pScreenedPieces the new value of the <code>screenedPieces</code> property.
     */
    public void setScreenedPieces(final Integer pScreenedPieces) {
        this.screenedPieces = pScreenedPieces;
    }

    /**
     * Gets the value of the <code>secondaryIDPhotoMatchIndicator</code> property injected by the Inversion of
     * Control (IoC) container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @return the current value of <code>secondaryIDPhotoMatchIndicator</code> property.
     */
    public String getSecondaryIDPhotoMatchIndicator() {
        return this.secondaryIDPhotoMatchIndicator;
    }

    /**
     * Sets the value of the <code>secondaryIDPhotoMatchIndicator</code> property injected by the Inversion of
     * Control (IoC) container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pSecondaryIDPhotoMatchIndicator the new value of the <code>secondaryIDPhotoMatchIndicator</code>
     *            property.
     */
    public void setSecondaryIDPhotoMatchIndicator(final String pSecondaryIDPhotoMatchIndicator) {
        this.secondaryIDPhotoMatchIndicator = pSecondaryIDPhotoMatchIndicator;
    }

    /**
     * Gets the value of the <code>secondaryIDType</code> property injected by the Inversion of Control (IoC)
     * container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @return the current value of <code>secondaryIDType</code> property.
     */
    public String getSecondaryIDType() {
        return this.secondaryIDType;
    }

    /**
     * Sets the value of the <code>secondaryIDType</code> property injected by the Inversion of Control (IoC)
     * container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pSecondaryIDType the new value of the <code>secondaryIDType</code> property.
     */
    public void setSecondaryIDType(final String pSecondaryIDType) {
        this.secondaryIDType = pSecondaryIDType;
    }

    /**
     * Gets the value of the <code>shipmentDto</code> property injected by the Inversion of Control (IoC)
     * container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @return the current value of <code>shipmentDto</code> property.
     */
    public ShipmentDto getShipmentDto() {
        if (this.shipmentDto == null) {
            this.shipmentDto = new ShipmentDto();
        }
        return shipmentDto;
    }

    /**
     * Sets the value of the <code>shipmentDto</code> property injected by the Inversion of Control (IoC)
     * container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pShipmentDto the new value of the <code>shipmentDto</code> property.
     */
    public void setShipmentDto(ShipmentDto pShipmentDto) {
        this.shipmentDto = pShipmentDto;
    }

    /**
     * Gets the value of the <code>skiddedCargoIndicator</code> property injected by the Inversion of Control
     * (IoC) container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @return the current value of <code>skiddedCargoIndicator</code> property.
     */
    public Boolean getSkiddedCargoIndicator() {
        return this.skiddedCargoIndicator;
    }

    /**
     * Sets the value of the <code>skiddedCargoIndicator</code> property injected by the Inversion of Control
     * (IoC) container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pSkiddedCargoIndicator the new value of the <code>skiddedCargoIndicator</code> property.
     */
    public void setSkiddedCargoIndicator(final Boolean pSkiddedCargoIndicator) {
        this.skiddedCargoIndicator = pSkiddedCargoIndicator;
    }

    /**
     * Gets the value of the <code>staIndicator</code> property injected by the Inversion of Control (IoC)
     * container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @return the current value of <code>staIndicator</code> property.
     */
    public String getStaIndicator() {
        return this.staIndicator;
    }

    /**
     * Sets the value of the <code>staIndicator</code> property injected by the Inversion of Control (IoC)
     * container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pStaIndicator the new value of the <code>staIndicator</code> property.
     */
    public void setStaIndicator(final String pStaIndicator) {
        this.staIndicator = pStaIndicator;
    }

    /**
     * Gets the value of the <code>typeOfOtherID</code> property injected by the Inversion of Control (IoC)
     * container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @return the current value of <code>typeOfOtherID</code> property.
     */
    public String getTypeOfOtherID() {
        return this.typeOfOtherID;
    }

    /**
     * Sets the value of the <code>typeOfOtherID</code> property injected by the Inversion of Control (IoC)
     * container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pTypeOfOtherID the new value of the <code>typeOfOtherID</code> property.
     */
    public void setTypeOfOtherID(final String pTypeOfOtherID) {
        this.typeOfOtherID = pTypeOfOtherID;
    }

    public boolean isCsdIndicator() {
        return this.csdIndicator;
    }

    public void setCsdIndicator(final boolean pCsdIndicator) {
        this.csdIndicator = pCsdIndicator;
    }
   
    private String methodOfScreeningTypeCode;
    private String reasonForExemptionCode;
    public String getMethodOfScreeningTypeCode() {
        return methodOfScreeningTypeCode;
    }
    public void setMethodOfScreeningTypeCode(final String pMethodOfScreeningTypeCode) {
        this.methodOfScreeningTypeCode = pMethodOfScreeningTypeCode;
    }
    public String getReasonForExemptionCode() {
        return reasonForExemptionCode;
    }
    public void setReasonForExemptionCode(final String pReasonForExemptionCode) {
        this.reasonForExemptionCode = pReasonForExemptionCode;
    }
}
