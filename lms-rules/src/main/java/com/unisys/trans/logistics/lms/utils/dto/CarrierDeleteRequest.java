/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>CarrierDeleteRequest</code> is used for deleting the carrier information.
 * <p>
 * The object ID of the carrier is required to delete the carrier information.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <li><code>oId</code> <br>
 * <li><code>carrierCode</code> <br>
 * <li><code>deletionDate</code> <br>
 * </ul>
 */
public class CarrierDeleteRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 6893372601110259403L;

    /**
     * Attribute to hold the <code>carrierCode</code> property.
     */
    private String carrierCode;

    /**
     * Attribute to hold the <code>oId</code> property.
     */

    /**
     * Attribute to hold <code>deletionDate</code> property.
     */
    private Date deletionDate;

    private Long oId;

    /**
     * <code>Default constructor.</code>
     */

    public CarrierDeleteRequest() {
    }

    /**
     * Gets the <code>carrierCode</code> property.
     * <p>
     * <b>Format </b>:<br>
     * 3 Alphanumeric (Now the size being used is 2)
     * <p>
     * <b>Example :</b><br>
     * NH
     * <p>
     * 
     * @return the current value of the <code>carrierCode</code> property.
     */
    public String getCarrierCode() {
        return this.carrierCode;
    }

    /**
     * Gets the <code>deletionDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * DDMMMYY
     * <p>
     * <b>Example: </b><br>
     * 26JAN08
     * <p>
     * 
     * @return the current value of the <code>deletionDate</code> property.
     */
    public Date getDeletionDate() {
        return ContractUtility.getClonedDate(this.deletionDate);
    }

    /**
     * Gets the <code>oId </code>property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Sets the <code>carrierCode</code> property.
     * <p>
     * <b>Format </b>:<br>
     * 3 Alphanumeric (Now the size being used is 2)
     * <p>
     * <b>Example :</b><br>
     * NH
     * <p>
     * 
     * @param pCarrierCode the new value of the <code>carrierCode</code> property.
     */
    public void setCarrierCode(final String pCarrierCode) {
        this.carrierCode = pCarrierCode;
    }

    /**
     * Sets the <code>deletionDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * DDMMMYY
     * <p>
     * <b>Example: </b><br>
     * 26JAN08
     * <p>
     * 
     * @param pDeletionDate
     *            the new value of the <code>deletionDate</code> property.
     */
    public void setDeletionDate(final Date pDeletionDate) {
        this.deletionDate = ContractUtility.getClonedDate(pDeletionDate);
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

}
