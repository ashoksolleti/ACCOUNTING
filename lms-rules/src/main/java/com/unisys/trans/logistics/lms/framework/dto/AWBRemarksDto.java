package com.unisys.trans.logistics.lms.framework.dto;

import com.unisys.trans.logistics.lms.framework.constants.AlertEventType;
import com.unisys.trans.logistics.lms.framework.constants.AlertType;
import com.unisys.trans.logistics.lms.framework.constants.RemarksType;

/**
 * <code>AWBRemarksDto</code> is used for find Airwaybill Remarks.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>actionType
 * <li>activeIndicator
 * <li>airWaybillFindDto
 * <li>alert
 * <li>alertType
 * <li>oId
 * <li>remarks
 * <li>remarksType
 * <li>status
 * <li>userAuditDto
 * </ul>
 */
public class AWBRemarksDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -3633466416302142997L;

    /**
     * Attribute to hold <code>actionType</code> property.
     */
    private String actionType;

    /**
     * Attribute to hold <code>activeIndicator</code> property.
     */
    private Boolean activeIndicator;

    /**
     * Attribute to hold <code>airWaybillFindDto</code> property.
     */
    private AirWaybillFindDto airWaybillFindDto;

    /**
     * Attribute to hold <code>alert</code> property.
     */
    private Boolean alert;

    /**
     * Attribute to hold <code>alertType</code> property.
     */
    private AlertType alertType;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>remarks</code> property.
     */
    private String remarks;

    /**
     * Attribute to hold <code>remarksType</code> property.
     */
    private RemarksType remarksType;

    /**
     * Attribute to hold <code>alert</code> property.
     */
    private AlertEventType status;

    /**
     * Attribute to hold <code>userAuditDto</code> property.
     */
    private UserAuditDto userAuditDto;

    /**
     * Attribute to hold <code>deleteIndicator</code> property.
     */
    private Boolean deleteIndicator;
    
    /**
     * Gets the <code>actionType</code> property.
     * 
     * @return actionType the current value of <code>actionType</code> property.
     */
    public String getActionType() {
        return this.actionType;
    }

    /**
     * Gets the <code>activeIndicator</code> property.
     * 
     * @return activeIndicator the current value of <code>activeIndicator</code> property.
     */
    public Boolean getActiveIndicator() {
        return this.activeIndicator;
    }

    /**
     * Gets the <code>airWaybillFindDto</code> property.
     * 
     * @return airWaybillFindDto the current value of <code>airWaybillFindDto</code> property.
     */
    public AirWaybillFindDto getAirWaybillFindDto() {
        if (this.airWaybillFindDto == null) {
            this.airWaybillFindDto = new AirWaybillFindDto();
        }
        return this.airWaybillFindDto;
    }

    /**
     * Gets the <code>alert</code> property.
     * 
     * @return alert the current value of <code>alert</code> property.
     */
    public Boolean getAlert() {
        return this.alert;
    }

    /**
     * Gets the <code>alertType</code> property.
     * 
     * @return alertType the current value of <code>alertType</code> property.
     */
    public AlertType getAlertType() {
        return this.alertType;
    }

    /**
     * Gets the <code>oId</code> property.
     * 
     * @return oId the current value of <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>remarks</code> property.
     * 
     * @return remarks the current value of <code>remarks</code> property.
     */
    public String getRemarks() {
        return this.remarks;
    }

    /**
     * Gets the <code>remarksType</code> property.
     * 
     * @return remarksType the current value of <code>remarksType</code> property.
     */
    public RemarksType getRemarksType() {
        return this.remarksType;
    }

    /**
     * Gets the <code>status</code> property.
     * 
     * @return status the current value of <code>status</code> property.
     */
    public AlertEventType getStatus() {
        return this.status;
    }

    /**
     * Gets the <code>userAuditDto</code> property.
     * 
     * @return userAuditDto the current value of <code>userAuditDto</code> property.
     */
    public UserAuditDto getUserAuditDto() {
        return this.userAuditDto;
    }

    /**
     * Sets the <code>actionType</code> property.
     * <p>
     * 
     * @param pActionType
     *            holds the new value of <code>actionType</code>.<br>
     */
    public void setActionType(final String pActionType) {
        this.actionType = pActionType;
    }

    /**
     * Sets the <code>activeIndicator</code> property.
     * <p>
     * 
     * @param pActiveIndicator
     *            holds the new value of <code>activeIndicator</code>.<br>
     */
    public void setActiveIndicator(final Boolean pActiveIndicator) {
        this.activeIndicator = pActiveIndicator;
    }

    /**
     * Sets the <code>airWaybillFindDto</code> property.
     * <p>
     * 
     * @param pAirWaybillFindDto
     *            holds the new value of <code>airWaybillFindDto</code>.<br>
     */
    public void setAirWaybillFindDto(final AirWaybillFindDto pAirWaybillFindDto) {
        this.airWaybillFindDto = pAirWaybillFindDto;
    }

    /**
     * Sets the <code>alert</code> property.
     * <p>
     * 
     * @param pAlert
     *            holds the new value of <code>alert</code>.<br>
     */
    public void setAlert(final Boolean pAlert) {
        this.alert = pAlert;
    }

    /**
     * Sets the <code>alertType</code> property.
     * <p>
     * 
     * @param pAlertType
     *            holds the new value of <code>alertType</code>.<br>
     */
    public void setAlertType(final AlertType pAlertType) {
        this.alertType = pAlertType;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            holds the new value of <code>oId</code>.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>remarks</code> property.
     * <p>
     * 
     * @param pRemarks
     *            holds the new value of <code>remarks</code>.<br>
     */
    public void setRemarks(final String pRemarks) {
        this.remarks = pRemarks;
    }

    /**
     * Sets the <code>remarksType</code> property.
     * <p>
     * 
     * @param pRemarksType
     *            holds the new value of <code>remarksType</code>.<br>
     */
    public void setRemarksType(final RemarksType pRemarksType) {
        this.remarksType = pRemarksType;
    }

    /**
     * Sets the <code>status</code> property.
     * <p>
     * 
     * @param pStatus
     *            holds the new value of <code>status</code>.<br>
     */
    public void setStatus(final AlertEventType pStatus) {
        this.status = pStatus;
    }

    /**
     * Sets the <code>userAuditDto</code> property.
     * <p>
     * 
     * @param pUserAuditDto
     *            holds the new value of <code>userAuditDto</code>.<br>
     */
    public void setUserAuditDto(final UserAuditDto pUserAuditDto) {
        this.userAuditDto = pUserAuditDto;
    }

	/**
	 * @return the oId
	 */
	public Long getoId() {
		return oId;
	}

	/**
	 * @param oId the oId to set
	 */
	public void setoId(Long oId) {
		this.oId = oId;
	}

	/**
	 * @return the deleteIndicator
	 */
	public Boolean getDeleteIndicator() {
		return deleteIndicator;
	}

	/**
	 * @param deleteIndicator the deleteIndicator to set
	 */
	public void setDeleteIndicator(Boolean deleteIndicator) {
		this.deleteIndicator = deleteIndicator;
	}

}
