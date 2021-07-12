/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>ClassRatingIdDeleteRequest</code> class represents the request to
 * delete the ClassRating Id information.
 * <p>
 * <code>lassRatingId</code> and <code>deletionDate</code> is required to mark the ClassRating Id as deleted.
 * The class rating Id information is not deleted but is marked for deletion. The ClassRating Id marked for
 * deletion can be retrieved but not updated when the DeletionDate exists.
 * <p>
 * <code>ClassRatingIdDeleteRequest</code> holds the following attributes:
 * <ul>
 * <code>
 * <li>deletionDate
 * <li>oId
 * <li>classRatingId 
 * </code>
 * </ul>
 */

public class ClassRatingIdDeleteRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -9066034733363227590L;

    /**
     * Attribute to hold <code>classRatingId</code> property. ClassRating Id
     * which is unique to identify the ClassRating in the system.
     */
    private String classRatingId;

    /**
     * Attribute to hold <code>deletionDate</code> property.
     * <p>
     * Date that rates using this classRating Id must be end-dated with. The Deletion date for the ClassRating
     * Id must be today’s date or later. Deletion Date is mandatory when deleting a ClassRating Id.
     */
    private Date deletionDate;

    /**
     * Attribute to hold <code>oId</code> property.
     * <p>
     * Unique key for ClassRating Id .
     */
    private Long oId;

    /**
     * Gets the <code>classRatingId</code> property.
     * <p>
     * Represents the ClassRating Id which is a unique Id to identify the ClassRating.
     * <p>
     * <b>Format: </b><br>
     * 3-6 Alphanumeric with first 2 characters being alphabets.
     * <p>
     * <b>Example: </b><br>
     * AUTOS
     * <p>
     * 
     * @return the current value of the <code>classRatingId</code> property.<br>
     */

    public String getClassRatingId() {
        return this.classRatingId;
    }

    /**
     * Gets the <code>deletionDate</code> property.
     * <p>
     * classRating Id is marked as 'Deleted' effective from this <code>deletionDate</code>.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT
     * DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 10APR12
     * <p>
     * 
     * @return the current value of the <code>deletionDate</code> property.<br>
     */

    public Date getDeletionDate() {
        return ContractUtility.getClonedDate(this.deletionDate);
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Sets the <code>rateTypeCode</code> property.
     * <p>
     * Represents the rate type code which is a unique code to identify the rate type.
     * <p>
     * <b>Format: </b><br>
     * 3-6 Alphanumeric with first 2 characters being alphabets.
     * <p>
     * <b>Example: </b><br>
     * AUTOS
     * <p>
     * 
     * @param pClassRatingId
     *            the new value of the <code>classRatingId</code> property.
     */
    public void setClassRatingId(final String pClassRatingId) {
        this.classRatingId = pClassRatingId;
    }

    /**
     * Sets the <code>deletionDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT
     * DATEFORMAT}
     * <p>
     * <b>Example: </b><br>
     * 10APR12
     * <p>
     * 
     * @param pDeletionDate
     *            the new value of the <code>deletionDate</code>property.<br>
     */

    public void setDeletionDate(final Date pDeletionDate) {
        this.deletionDate = ContractUtility.getClonedDate(pDeletionDate);
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

}
