package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;

/**
 * <code>BookingDeletionDetailDto</code> is used for find BookingDeletionDetail information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>deleteIndicator
 * <li>oId
 * <li>remarks
 * <li>userAudit
 * 
 * </ul>
 */

public class BookingDeletionDetailDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 8408304427115063600L;

    /**
     * Attribute to hold <code>bookingDeleteIndicator</code> property.
     */
    private boolean deleteIndicator;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>remarks</code> property.
     */
    private String remarks;

    /**
     * Attribute to hold the <code> userAudit</code> property.
     */
    private UserAuditDto userAudit;

    /**
     * 
     * Gets the <code>oId</code> property.
     * 
     * @return the current value of the <code>oId</code> property. <br>
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * 
     * Gets the <code>remarks</code> property.
     * 
     * @return the current value of the <code>remarks</code> property. <br>
     */
    public String getRemarks() {
        return this.remarks;
    }

    /**
     * 
     * Gets the <code>userAudit</code> property.
     * 
     * @return the current value of the <code>userAudit</code> property. <br>
     */
    public UserAuditDto getUserAudit() {
        return this.userAudit;
    }

    /**
     * 
     * Gets the <code>deleteIndicator</code> property.
     * 
     * @return the current value of the <code>deleteIndicator</code> property. <br>
     */
    public boolean isDeleteIndicator() {
        return this.deleteIndicator;
    }

    /**
     * Sets the <code>deleteIndicator</code> property.
     * 
     * @param pDeleteIndicator
     *            the new value of the <code>deleteIndicator</code> property.
     */
    public void setDeleteIndicator(final boolean pDeleteIndicator) {
        this.deleteIndicator = pDeleteIndicator;
    }

    /**
     * Sets the <code>oId</code> property.
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>remarks</code> property.
     * 
     * @param pRemarks
     *            the new value of the <code>remarks</code> property.
     */
    public void setRemarks(final String pRemarks) {
        this.remarks = pRemarks;
    }

    /**
     * Sets the <code>userAudit</code> property.
     * 
     * @param pUserAudit
     *            the new value of the <code>userAudit</code> property.
     */
    public void setUserAudit(final UserAuditDto pUserAudit) {
        this.userAudit = pUserAudit;
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

}
