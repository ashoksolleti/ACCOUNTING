/* ====================================== */
/* Copyright (c) 2015 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.dto.operations;

import java.io.Serializable;

import com.unisys.trans.logistics.lms.framework.dto.UserAuditDto;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.PhotoMatchIndicatorType;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.PrimaryIdType;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.STAIndicatorType;

/**
 * <code>SecurityTenderingInformationDto</code> class represents the SecurityTenderingInformation information.
 * <p>
 * <code>SecurityTenderingInformationDto</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>oId.
 * <li>actualDropOffBy.
 * <li>companyName.
 * <li>employeeName.
 * <li>primaryIDPhotoMatchIndicator.
 * <li>primaryIDType.
 * <li>retainIndicator.
 * <li>returnStatusIndicator.
 * <li>secondaryIDPhotoMatchIndicator.
 * <li>secondaryIDType.
 * <li>shipmentOid.
 * <li>staIndicator.
 * <li>typeOfOtherID.
 * </code>
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.framework.dto.constants.operation.PrimaryIdType
 * 
 * @author Unisys
 * @version 1.0
 * @since 1.0
 */

public class SecurityTenderingInformationDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold the <code>oId</code> property.
     */
    private Long oId;
    
 
    /**
     * Attribute to hold <code>lineNumber</code> property.
     */
    private Integer lineNumber;

    /**
     * Attribute to hold the <code>actualDropOffBy</code> property.
     */
    private String actualDropOffBy;

    /**
     * Attribute to hold the <code>companyName</code> property.
     */
    private String companyName;

    /**
     * Attribute to hold the <code>employeeName</code> property.
     */
    private String employeeName;

    /**
     * Attribute to hold the <code>primaryIDPhotoMatchIndicator</code> property.
     */
    private PhotoMatchIndicatorType primaryIDPhotoMatchIndicator;

    /**
     * Attribute to hold the <code>primaryIDType</code> property.
     */
    private PrimaryIdType primaryIDType;

    /**
     * Attribute to hold the <code>retainIndicator</code> property.
     */
    private Boolean retainIndicator;

    /**
     * Attribute to hold the <code>returnStatusIndicator</code> property.
     */
    private int returnStatusIndicator;

    /**
     * Attribute to hold the <code>secondaryIDPhotoMatchIndicator</code> property.
     */
    private PhotoMatchIndicatorType secondaryIDPhotoMatchIndicator;

    /**
     * Attribute to hold the <code>secondaryIDType</code> property.
     */
    private String secondaryIDType;

    /**
     * Attribute to hold the <code>shipmentOid</code> property.
     */
    private Long shipmentOid;

    /**
     * Attribute to hold the <code>staIndicator</code> property.
     */
    private STAIndicatorType staIndicator;

    /**
     * Attribute to hold the <code>typeOfOtherID</code> property.
     */
    private String typeOfOtherID;

    /**
     * Attribute to hold the <code>createUserAudit</code> property.
     */
    private UserAuditDto createUserAudit;

    /**
     * Attribute to hold the <code>updateUserAudit</code> property.
     */
    private UserAuditDto updateUserAudit;

    /**
     * <code>Default constructor.</code>
     */
    public SecurityTenderingInformationDto() {
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
        return this.employeeName;
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
    public void setEmployeeName(final String pEmployeeName) {
        this.employeeName = pEmployeeName;
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
    public PhotoMatchIndicatorType getPrimaryIDPhotoMatchIndicator() {
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
    public void setPrimaryIDPhotoMatchIndicator(final PhotoMatchIndicatorType pPrimaryIDPhotoMatchIndicator) {
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
    public Boolean getRetainIndicator() {
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
    public void setRetainIndicator(Boolean pRetainIndicator) {
        this.retainIndicator = pRetainIndicator;
    }

    /**
     * Gets the value of the <code>returnStatusIndicator</code> property injected by the Inversion of Control
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
     * @return the current value of <code>returnStatusIndicator</code> property.
     */
    public int getReturnStatusIndicator() {
        return returnStatusIndicator;
    }

    /**
     * Sets the value of the <code>returnStatusIndicator</code> property injected by the Inversion of Control
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
     * @param pReturnStatusIndicator the new value of the <code>returnStatusIndicator</code> property.
     */
    public void setReturnStatusIndicator(int pReturnStatusIndicator) {
        this.returnStatusIndicator = pReturnStatusIndicator;
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
    public PhotoMatchIndicatorType getSecondaryIDPhotoMatchIndicator() {
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
    public void setSecondaryIDPhotoMatchIndicator(
                final PhotoMatchIndicatorType pSecondaryIDPhotoMatchIndicator) {
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
     * Gets the value of the <code>shipmentOid</code> property injected by the Inversion of Control (IoC)
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
     * @return the current value of <code>shipmentOid</code> property.
     */
    public Long getShipmentOid() {
        return this.shipmentOid;
    }

    /**
     * Sets the value of the <code>shipmentOid</code> property injected by the Inversion of Control (IoC)
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
     * @param pShipmentOid the new value of the <code>shipmentOid</code> property.
     */
    public void setShipmentOid(final Long pShipmentOid) {
        this.shipmentOid = pShipmentOid;
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
    public STAIndicatorType getStaIndicator() {
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
    public void setStaIndicator(final STAIndicatorType pStaIndicator) {
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

    /**
     * Gets the value of the <code>oId</code> property injected by the Inversion of Control (IoC) container.
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
     * @return the current value of <code>oId</code> property.
     */
    public Long getoId() {
        return oId;
    }

    /**
     * Sets the value of the <code>oId</code> property injected by the Inversion of Control (IoC) container.
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
     * @param poId the new value of the <code>oId</code> property.
     */
    public void setoId(Long poId) {
        this.oId = poId;
    }

    /**
     * Gets the value of the <code>createUserAudit</code> property.
     * <p>
     *
     * @return Returns the current value of <code>createUserAudit</code> property.
     */
    public UserAuditDto getCreateUserAudit() {
        return createUserAudit;
    }

    /**
     * Sets the value of the <code>createUserAudit</code> property.
     * <p>
     *
     * @param <code>createUserAudit</code>
     *            Holds the new value of the <code>createUserAudit</code> property.
     */
    public void setCreateUserAudit(UserAuditDto createUserAudit) {
        this.createUserAudit = createUserAudit;
    }

    /**
     * Gets the value of the <code>updateUserAudit</code> property.
     * <p>
     *
     * @return Returns the current value of <code>updateUserAudit</code> property.
     */
    public UserAuditDto getUpdateUserAudit() {
        return updateUserAudit;
    }

    /**
     * Sets the value of the <code>updateUserAudit</code> property.
     * <p>
     *
     * @param <code>updateUserAudit</code>
     *            Holds the new value of the <code>updateUserAudit</code> property.
     */
    public void setUpdateUserAudit(UserAuditDto updateUserAudit) {
        this.updateUserAudit = updateUserAudit;
    }


    /**
     * @return the serialversionuid
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    /**
     * @return the lineNumber
     */
    public Integer getLineNumber() {
        return lineNumber;
    }

    /**
     * @param lineNumber the lineNumber to set
     */
    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }
}
