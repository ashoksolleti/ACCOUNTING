/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.dto;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import java.io.Serializable;
import java.util.Date;

/**
 * <code>DateRangeDto</code> contain details of RatingNote.
 * <p>
 * This contains all information about DateRange.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>effectiveDate
 * <li>expirationDate
 * </ul>
 */
public class DateRangeDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1855983323120337578L;

    /**
     * Attribute to hold <code>effectiveDate</code> property.
     */
    private Date effectiveDate;

    /**
     * Attribute to hold <code>expirationDate</code> property.
     */
    private Date expirationDate;

    /**
     * Gets the <code>DateRangeDto</code> property.
     * <p>
     * <b>Format: </b><br>
     * boolean
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @param pObj the new value of the <code>object</code> property.
     * @return the current value of the <code>DateRangeDto</code> property.
     */
    @Override
    public boolean equals(final Object pObj) {

        boolean isEqual = true;
        if (this == pObj) {
            isEqual = true;
        }
        else if (pObj == null) {
            isEqual = false;
        }
        else if (pObj.getClass() == null || getClass() != pObj.getClass()) {
            isEqual = false;
        }
        else {
            // Comparing Date Range
            final DateRangeDto other = (DateRangeDto) pObj;
            if (this.expirationDate != null && other.expirationDate == null && other.effectiveDate != null &&
                        ContractUtility.compareDates(this.expirationDate, other.effectiveDate) < 0) {
                isEqual = false;

            }
            if (other.expirationDate != null && this.expirationDate == null && this.effectiveDate != null) {
                if (ContractUtility.compareDates(other.expirationDate, this.effectiveDate) < 0) {
                    isEqual = false;
                }
            }
            if (this.expirationDate != null && other.expirationDate != null && this.effectiveDate != null
                        && other.effectiveDate != null
                        && (ContractUtility.compareDates(this.expirationDate, other.effectiveDate) < 0
                        || ContractUtility.compareDates(other.expirationDate, this.effectiveDate) < 0)) {
                isEqual = false;

            }
            if(this.effectiveDate == null && other.effectiveDate != null && this.expirationDate != null
                        && ContractUtility.compareDates(this.expirationDate,other.effectiveDate) < 0){
                isEqual = false;
            }
            if(other.effectiveDate == null && this.effectiveDate != null && other.expirationDate!=null
                        && ContractUtility.compareDates(other.expirationDate,this.effectiveDate) < 0){
                isEqual = false;
            }
            
        }
        return isEqual;
    }

    /**
     * Gets the <code>effectiveDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * DDMMMYY
     * <p>
     * <b>Example: </b><br>
     * 26JAN08
     * <p>
     * 
     * @return the current value of the <code>effectiveDate</code> property.
     */
    public Date getEffectiveDate() {
        return ContractUtility.getClonedDate(this.effectiveDate);
    }

    /**
     * Gets the <code>expirationDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * DDMMMYY
     * <p>
     * <b>Example: </b><br>
     * 26JAN08
     * <p>
     * 
     * @return the current value of the <code>expirationDate</code> property.
     */
    public Date getExpirationDate() {
        return ContractUtility.getClonedDate(this.expirationDate);
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
        result = prime * result + ((this.effectiveDate == null) ? 0 : this.effectiveDate.hashCode());
        result = prime * result + ((this.expirationDate == null) ? 0 : this.expirationDate.hashCode());
        return result;
    }

    /**
     * Sets the <code>effectiveDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * DDMMMYY
     * <p>
     * <b>Example: </b><br>
     * 26JAN08
     * <p>
     * 
     * @param pEffectiveDate
     *            the new value of the <code>effectiveDate</code> property.
     */
    public void setEffectiveDate(final Date pEffectiveDate) {
        this.effectiveDate = ContractUtility.getClonedDate(pEffectiveDate);
    }

    /**
     * Sets the <code>expirationDate</code> property.
     * <p>
     * <b>Format: </b><br>
     * DDMMMYY
     * <p>
     * <b>Example: </b><br>
     * 26JAN08
     * <p>
     * 
     * @param pExpirationDate
     *            the new value of the <code>expirationDate</code> property.
     */
    public void setExpirationDate(final Date pExpirationDate) {
        this.expirationDate = ContractUtility.getClonedDate(pExpirationDate);
    }

}
