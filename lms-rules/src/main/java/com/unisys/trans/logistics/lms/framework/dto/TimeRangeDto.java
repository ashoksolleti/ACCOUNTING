//@formatter:off
/* ====================================== */
/* Copyright(c) 2012 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;

/**
 * <code>TimeRangeDto</code> contains the following attributes:
 * <ul>
 * <li>operationFromTime
 * <li>operationToTime
 * </ul>
 */
public class TimeRangeDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -7570426661089136802L;

    /**
     * Attribute to hold <code>operationFromTime</code> property.
     */
    private Integer operationFromTime;

    /**
     * Attribute to hold <code>operationToTime</code> property.
     */
    private Integer operationToTime;

    /**
     * Gets the <code>TimeRangeDto</code> property.
     * <p>
     * <b>Format: </b><br>
     * boolean
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @param pObj the new value of the <code>object</code> property.
     * @return the current value of the <code>TimeRangeDto</code> property.
     */
    @Override
    public boolean equals(final Object pObj) {
        if (this == pObj)
            return true;
        if (pObj == null)
            return false;
        if (getClass() != pObj.getClass())
            return false;
        final TimeRangeDto other = (TimeRangeDto) pObj;
        if (this.operationFromTime == null) {
            if (other.operationFromTime != null)
                return false;
        }
        else if (!this.operationFromTime.equals(other.operationFromTime))
            return false;
        if (this.operationToTime == null) {
            if (other.operationToTime != null)
                return false;
        }
        else if (!this.operationToTime.equals(other.operationToTime))
            return false;
        return true;
    }

    /**
     * Gets the <code>FromTime</code> property.
     * <p>
     * 
     * @return the current value of the <code>operationFromTime</code> property.<br>
     */
    public Integer getOperationFromTime() {
        return this.operationFromTime;
    }

    /**
     * Gets the <code>ToTime</code> property.
     * <p>
     * 
     * @return the current value of the <code>operationToTime</code> property.<br>
     */
    public Integer getOperationToTime() {
        return this.operationToTime;
    }

    /**
     * The<code>hashCode </code> object.
     * <p>
     * 
     * @return <code>int</code> hashCode of super class.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.operationFromTime == null) ? 0 : this.operationFromTime.hashCode());
        result = prime * result + ((this.operationToTime == null) ? 0 : this.operationToTime.hashCode());
        return result;
    }

    /**
     * Sets the <code>FromTime</code> property.
     * 
     * @param pOperationFromTime the new value of <code>FromTime</code>.
     */
    public void setOperationFromTime(final Integer pOperationFromTime) {
        this.operationFromTime = pOperationFromTime;
    }

    /**
     * Sets the <code>ToTime</code> property.
     * 
     * @param pToTime the new value of <code>ToTime</code>.
     */
    public void setOperationToTime(final Integer pToTime) {
        this.operationToTime = pToTime;
    }
}
