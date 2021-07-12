/* ====================================== */
/* Copyright (c) 2015 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.dto.operations;

import java.io.Serializable;

import com.unisys.trans.logistics.lms.framework.dto.UserAuditDto;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.ExemptionReasonType;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.ScreeningMethodType;

/**
 * <code>SecurityScreeningInformationDto</code> class represents the SecurityScreeningInformation information.
 * <p>
 * <code>SecurityScreeningInformationDto</code> contains the following attribute:
 * <ul>
 * <code>
 * <li>oId.
 * <li>delayScreening.
 * <li>eligiblePieces.
 * <li>exemptPieces.
 * <li>inspectedBy.
 * <li>methodOfScreeningType.
 * <li>reasonForExemption.
 * <li>returnStatusIndicator.
 * <li>screenedPieces.
 * <li>shipmentOid.
 * <li>skiddedCargoIndicator.
 * </code>
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.framework.dto.constants.operation.ExemptionReasonType
 * @see com.unisys.trans.logistics.lms.framework.dto.constants.operation.ScreeningMethodType
 * 
 * @author Unisys
 * @version 1.0
 * @since 1.0
 */

public class SecurityScreeningInformationDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Attribute to hold the <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold the <code>rowNumber</code> property.
     */
    private int rowNumber;
    
    /**
     * Attribute to hold <code>lineNumber</code> property.
     */
    private Integer lineNumber;
    /**
     * Attribute to hold the <code>delayScreening</code> property.
     */
    private Boolean delayScreening;

    /**
     * Attribute to hold the <code>eligiblePieces</code> property.
     */
    private Integer eligiblePieces;

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
    private ScreeningMethodType methodOfScreeningType;

    /**
     * Attribute to hold the <code>reasonForExemption</code> property.
     */
    private ExemptionReasonType reasonForExemption;

    /**
     * Attribute to hold the <code>returnStatusIndicator</code> property.
     */
    private int returnStatusIndicator;

    /**
     * Attribute to hold the <code>screenedPieces</code> property.
     */
    private Integer screenedPieces;

    /**
     * Attribute to hold the <code>shipmentOid</code> property.
     */
    private Long shipmentOid;

    /**
     * Attribute to hold the <code>skiddedCargoIndicator</code> property.
     */
    private Boolean skiddedCargoIndicator;

    /**
     * Attribute to hold the <code>createUserAudit</code> property.
     */
    private UserAuditDto createUserAudit;

    /**
     * Attribute to hold the <code>updateUserAudit</code> property.
     */
    private UserAuditDto updateUserAudit;
    /**
     * Attribute to hold the <code>screeningLocation</code> property.
     */
    private String screeningLocation;

    public String getScreeningLocation() {
		return screeningLocation;
	}

	public void setScreeningLocation(String screeningLocation) {
		this.screeningLocation = screeningLocation;
	}

	/**
     * <code>Default constructor.</code>
     */
    public SecurityScreeningInformationDto() {
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
    public Boolean getDelayScreening() {
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
    public void setDelayScreening(final Boolean pDelayScreening) {
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
    public ScreeningMethodType getMethodOfScreeningType() {
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
    public void setMethodOfScreeningType(final ScreeningMethodType pMethodOfScreeningType) {
        this.methodOfScreeningType = pMethodOfScreeningType;
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
    public ExemptionReasonType getReasonForExemption() {
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
    public void setReasonForExemption(final ExemptionReasonType pReasonForExemption) {
        this.reasonForExemption = pReasonForExemption;
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
     * Gets the value of the <code>rowNumber</code> property injected by the Inversion of Control (IoC) container.
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
	public int getRowNumber() {
		return rowNumber;
	}

	 /**
     * Sets the value of the <code>rowNumber</code> property injected by the Inversion of Control (IoC) container.
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
	public void setRowNumber(int rowNumber) {
		this.rowNumber = rowNumber;
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
