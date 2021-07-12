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
 * <code>ClassRatingIdFindRequest</code> class represents the request to find
 * the ClassRatingId information.
 * <p>
 * ClassRatingId information can be retrieved in two ways:
 * <ul>
 * <li>Retrieve all the ClassRatingId information present in the system.<br>
 * It returns all the ClassRatingId information present in the system, by listing only their
 * <code>ClassRatingId </code> and description.
 * <li>Retrieve the ClassRatingId information for a given <code> Date </code>.<br>
 * If the ClassRatingId is marked as 'Deleted', then an advisory message is returned; otherwise the
 * ClassRatingId information is returned.
 * </ul>
 * <p>
 * <code>ClassRatingIdFindRequest</code> contains the following attributes:
 * <ul>
 * <code>
 * <li>classRatingId
 * <li>date
 * </code>
 * </ul>
 */
public class ClassRatingIdFindRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -8723150272007765898L;

    /**
     * Attribute to hold <code>classRatingId</code> property. ClassRatingId
     * which is unique to identify the ClassRatingId in the system.
     */
    private String classRatingId;

    /**
     * Attribute to hold <code>date</code>.
     * <p>
     * Represents the date on which the ClassRatingId version to be retrieved.
     */
    private Date date;

	private boolean exactMatchRequiredIndicator;

    /**
     * Gets the <code>classRatingId</code> property.
     * <p>
     * Represents the ClassRatingId which is a unique Id to identify the ClassRatingId.
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
     * Gets the <code>date</code> property.
     * <p>
     * Represents the date on which the ClassRatingId version is to be retrieved.
     * <p>
     * <b>Format:</b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT
     * DATEFORMAT}
     * <p>
     * <b>Example:</b><br>
     * 07JUL12
     * <p>
     * 
     * @return the current value of <code>date</code> property.
     */

    public Date getDate() {
        return ContractUtility.getClonedDate(this.date);
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
        this.classRatingId = ContractUtility.convertToUpperCase(pClassRatingId);
    }

    /**
     * Sets the <code>date</code> property.
     * <p>
     * Represents the date on which the ClassRatingId version to be retrieved.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT}
     * <p>
     * <b>Example:</b><br>
     * 10AUG12
     * <p>
     * 
     * @param pDate
     *            the new value of the <code>date</code> property.
     */

    public void setDate(final Date pDate) {
        this.date = ContractUtility.getClonedDate(pDate);
    }

    public void setExactMatchRequiredIndicator(final boolean pExactMatchRequiredIndicator) {
        this.exactMatchRequiredIndicator = pExactMatchRequiredIndicator;
    }
    public boolean isExactMatchRequiredIndicator() {
        return this.exactMatchRequiredIndicator;
    }

}
