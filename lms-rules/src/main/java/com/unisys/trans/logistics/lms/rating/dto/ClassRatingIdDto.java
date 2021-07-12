/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>ClassRatingIdDto</code> class contain information specific to an Class Rating Id.<br>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>oId
 * <li>deletionDate
 * <li>classRatingId
 * <li>userInfo
 * <li>classRatingVersions
 * </code>
 * </ul>
 */
public class ClassRatingIdDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -1929225012831427986L;

    /**
     * Attribute to hold <code>classRatingId</code>.
     * <p>
     * This holds the value of Class Rating Id
     * <p>
     */
    private String classRatingId;

    /**
     * Attribute to hold <code>classRatingVersions</code>'s property.
     * <p>
     * The list of <code>ClassRatingVersion</code>classRatingVersions associated with a ClassRatingId.
     */
    private List<ClassRatingIdVersionDto> classRatingIdVersions = new ArrayList<ClassRatingIdVersionDto>();

    /**
     * Attribute to hold <code>deletionDate</code>.
     * <p>
     * All rates that use this ClassRatingId will have an Expiration Date set to this date during the next run
     * of periodic file maintenance.
     * <p>
     */
    private Date deletionDate;

    /**
     * Attribute to hold <code>oId</code>.
     * <p>
     * This hold the Unique key value for <code>ClassRatingId</code>.
     */
    private Long oId;

    /**
     * Gets the <code>classRatingId</code> property.
     * <p>
     * <b>Format: </b><br>
     * 2A(1-4AN)(UC)
     * <p>
     * <b>Example: </b><br>
     * AUTOS
     * <p>
     * 
     * @return
     *         returns the class rating id.
     */
    public String getClassRatingId() {
        return this.classRatingId;
    }

    /**
     * Gets the list of <code>classRatingVersions</code> associated with the ClassRatingIdDto.
     * <p>
     * 
     * @return the current list of <code>classRatingVersions</code> associated with a ClassRatingIdDto
     */
    public List<ClassRatingIdVersionDto> getClassRatingIdVersions() {
        return this.classRatingIdVersions;
    }

    /**
     * Gets the <code>deletionDate</code> property.
     * <p>
     * All rates that use this ClassRatingId will have an Expiration Date set to this date during the next run
     * of periodic file maintenance.
     * <p>
     * <b>Format:</b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT DATEFORMAT}
     * <p>
     * <b>Example:</b><br>
     * 07JUL08
     * <p>
     * 
     * @return the current value of <code>deletionDate</code> property.
     */
    public Date getDeletionDate() {
        return ContractUtility.getClonedDate(this.deletionDate);
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * Unique key to identify the <code>ClassRatingId</code>.It is of type Long.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Sets the <code>classRatingId</code> property.
     * <p>
     * This domain object contains the the class rating id.
     * <p>
     * 
     * @param pClassRatingId
     *            the new value of the <code>classRatingId</code> property.<br>
     */
    public void setClassRatingId(final String pClassRatingId) {
        this.classRatingId = pClassRatingId;
    }

    /**
     * Sets the list of <code>ClassRatingIdVersions</code> associated with ClassRatingIdDto.
     * <p>
     * 
     * @param pClassRatingIdVersions
     *            the new list of <code>ClassRatingIdVersions</code> associated with ClassRatingIdDto.<br>
     */
    public void setClassRatingIdVersions(final List<ClassRatingIdVersionDto> pClassRatingIdVersions) {
        this.classRatingIdVersions = pClassRatingIdVersions;
    }

    /**
     * Sets the <code>deletionDate</code> property.
     * <p>
     * All rates that use this ClassRatingId will have an Expiration Date set to this date during the next run
     * of periodic file maintenance.
     * <p>
     * <b>Format: </b><br>
     * {@link com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants#DATEFORMAT}
     * <p>
     * <b>Example:</b><br>
     * 10AUG07
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
     * Unique key to identify the <code>ClassRatingId</code>.It is of type Long.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

}
