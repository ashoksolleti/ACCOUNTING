/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.io.Serializable;
import java.util.Date;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>HolidayDateDto</code> contain details of Holiday date.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>date
 * <li>holidayOid
 * <li>oId
 * </ul>
 */
public class HolidayDateDto implements Serializable {

    /**
     * TODO Generated serial version added. add a valid serial version id
     */
    private static final long serialVersionUID = 3842106945940648211L;

    /**
     * Attribute to hold <code>date</code> property.
     */
    private Date date;

    /**
     * Attribute to hold <code>holidayOid</code> property.
     */
    private Long holidayOid;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Compares a <code>HolidayDateDto</code> property with this object.
     * <p>
     * <b>Format: </b><br>
     * boolean
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @param pObject It holds the value.
     * 
     * @return whether the passed object is equal to this object.
     */
    @Override
    public boolean equals(final Object pObject) {
        boolean value = true;
        if (this == pObject) {
            value = true;
        }
        else if (pObject == null) {
            value = false;
        }
        else if (pObject.getClass() == null || this.getClass() != pObject.getClass()) {
            value = false;
        }
        else {
            final HolidayDateDto other = (HolidayDateDto) pObject;
            if (this.date == null) {
                if (other.getDate() != null) {
                    value = false;
                }
            }
            else if (!this.date.equals(other.getDate())) {
                value = false;
            }
        }
        return value;
    }

    /**
     * Gets the <code>date</code> property.
     * <p>
     * <b>Format: </b><br>
     * DDMMMYY
     * <p>
     * <b>Example: </b><br>
     * 26JAN08
     * <p>
     * 
     * @return date the new value of the <code>date</code> property.
     */
    public Date getDate() {
        return ContractUtility.getClonedDate(this.date);
    }

    /**
     * Gets the <code>holidayOid</code> property.
     * <p>
     * 
     * @return holidayOid the new value of the <code>holidayOid</code> property.
     */
    public Long getHolidayOid() {
        return this.holidayOid;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return oId the new value of the <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * The<code>hashCode </code> object.
     * <p>
     * 
     * @return <code>int</code> hashcode of super class.
     */
    @Override
    public int hashCode() {
        int result = 1;
        if (date != null) {
            result = result + date.hashCode();
        }
        return result;
    }

    /**
     * Sets the <code>pDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * DDMMMYY
     * <p>
     * <b>Example: </b><br>
     * 26JAN08
     * <p>
     * 
     * @param pDate the new value of the <code>pDate</code> property.
     */
    public void setDate(final Date pDate) {
        this.date = ContractUtility.getClonedDate(pDate);
    }

    /**
     * Sets the <code>holidayOid</code> property.
     * <p>
     * 
     * @param pHolidayOid the new value of the <code>holidayOid</code> property.
     */
    public void setHolidayOid(final Long pHolidayOid) {
        this.holidayOid = pHolidayOid;
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
