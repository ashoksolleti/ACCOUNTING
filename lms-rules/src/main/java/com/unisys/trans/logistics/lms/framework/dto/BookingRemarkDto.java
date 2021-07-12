package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;

/**
 * <code>BookingRemarkDto</code> is used for find BookingRemark information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>bookingRemark
 * <li>oId
 * <li>shipperRemarks
 * <li>suppInformation1
 * <li>suppInformation2
 * 
 * </ul>
 */

public class BookingRemarkDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>bookingRemark</code> property.
     */
    private String remarks;

    /**
     * Attribute to hold <code>shipperRemarks</code> property.
     */
    private String shipperRemarks;

    /**
     * Attribute to hold <code>suppInformation1</code> property.
     */
    private String suppInformation1;

    /**
     * Attribute to hold <code>suppInformation2</code> property.
     */
    private String suppInformation2;

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>remarks</code> property.
     * <p>
     * 
     * @return the current value of the <code>remarks</code> property.
     */
    public String getRemarks() {
        return this.remarks;
    }

    /**
     * Gets the <code>shipperRemarks</code> property.
     * <p>
     * 
     * @return the current value of the <code>shipperRemarks</code> property.
     */
    public String getShipperRemarks() {
        return this.shipperRemarks;
    }

    /**
     * Gets the <code>suppInformation1</code> property.
     * <p>
     * 
     * @return the current value of the <code>suppInformation1</code> property.
     */
    public String getSuppInformation1() {
        return this.suppInformation1;
    }

    /**
     * Gets the <code>suppInformation2</code> property.
     * <p>
     * 
     * @return the current value of the <code>suppInformation2</code> property.
     */
    public String getSuppInformation2() {
        return this.suppInformation2;
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
     * Sets the <code>shipperRemarks</code> property.
     * 
     * @param pShipperRemarks
     *            the new value of the <code>shipperRemarks</code> property.
     */
    public void setShipperRemarks(final String pShipperRemarks) {
        this.shipperRemarks = pShipperRemarks;
    }

    /**
     * Sets the <code>suppInformation1</code> property.
     * 
     * @param pSuppInformation1
     *            the new value of the <code>suppInformation1</code> property.
     */
    public void setSuppInformation1(final String pSuppInformation1) {
        this.suppInformation1 = pSuppInformation1;
    }

    /**
     * Sets the <code>suppInformation2</code> property.
     * 
     * @param pSuppInformation2
     *            the new value of the <code>suppInformation2</code> property.
     */
    public void setSuppInformation2(final String pSuppInformation2) {
        this.suppInformation2 = pSuppInformation2;
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
