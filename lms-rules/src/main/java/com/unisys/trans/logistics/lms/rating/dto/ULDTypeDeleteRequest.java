/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.util.Date;

/**
 * <code>ULDTypeDeleteRequest</code> class represents the request to delete uld type information.
 * <p>
 * ULDType information is deleted based on the following attribute: <code>
 * <ul>
 * <li>deleteDate
 * <li>oId
 * <li>uldType
 * </ul>
 * </code>
 */
public class ULDTypeDeleteRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -156397631888976341L;

    /**
     * Attribute to hold <code>deleteDate</code> property.
     * <p>
     * This is enabled only when the ULD type is active or for rating information not yet in effect.
     */
    private Date deleteDate;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>uldType</code> property.
     * <p>
     * Unique identifier.
     */
    private String uldType;

    /**
     * <code>Default constructor.</code>
     */
    public ULDTypeDeleteRequest() {

    }

    /**
     * Gets the value of <code>deleteDate</code> property.
     * <p>
     * It depends on the run time parameter. <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>
     * {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_EFFECTIVE_DATE}
     * </pre>
     * <p>
     * <b>Format: </b><br>
     * See {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 07JUL07
     * <p>
     * 
     * @return the current value of the <code>deleteDate</code> property.
     */
    public Date getDeleteDate() {
        return ContractUtility.getClonedDate(this.deleteDate);
    }

    /**
     * Gets the <code>oId</code>.
     * <p>
     * The unique database key for an uld type rate. This ID is assigned when the object gets persisted (EOT).
     * <p>
     * 
     * @return the current value of <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>uldType</code> property.
     * <p>
     * Unique Identifier.
     * <p>
     * <b>Format: </b><br>
     * 1-3 Alphabets.<br>
     * <p>
     * <b>Example :</b><br>
     * 1S
     * <p>
     * 
     * @return the current value of the <code>uldType</code> property.
     */
    public String getUldType() {
        return this.uldType;
    }

    /**
     * Sets the <code>deleteDate</code> property.
     * <p>
     * It depends on the run time parameter. <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>
     * {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_EFFECTIVE_DATE}
     * </pre>
     * <p>
     * <b>Format: </b><br>
     * See {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 07JUL07
     * <p>
     * 
     * @param pDeleteDate the new value of the <code>deleteDate</code> property.
     */
    public void setDeleteDate(final Date pDeleteDate) {
        this.deleteDate = ContractUtility.getClonedDate(pDeleteDate);
    }

    /**
     * Sets the value of the oId property.
     * <p>
     * 
     * @param pOId the new value of the oId property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>uldType</code> property.
     * <p>
     * Unique Identifier.
     * <p>
     * <b>Format: </b><br>
     * 1-3 Alphabets.<br>
     * <p>
     * <b>Example :</b><br>
     * 1S
     * <p>
     * 
     * @param pUldType the new value of the <code>uldType</code> property.
     */
    public void setUldType(final String pUldType) {
        this.uldType = pUldType;
    }

}
