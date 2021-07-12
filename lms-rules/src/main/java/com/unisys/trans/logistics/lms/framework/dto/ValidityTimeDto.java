//@formatter:off
/* ====================================== */
/* Copyright(c) 2012 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;

import com.unisys.trans.logistics.lms.framework.dto.constants.WeekDaysType;

/**
 * <code>ValidityTimeDto</code> contain details of ValidityTime.
 * <p>
 * This contains all information about ValidityTime.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>operationDays
 * <li>timeRangeDto
 * <li>validRadio
 * <li>weekDay
 * <li>oId
 * </ul>
 */
public class ValidityTimeDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 3785244451055809651L;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>operationDays</code> property.
     */
    private WeekDaysType operationDays;

    /**
     * Attribute to hold <code>timeRangeDto</code> property.
     */
    private TimeRangeDto timeRangeDto;

    /**
     * Attribute to hold <code>validRadio</code> property.
     */
    private String validRadio;

    /**
     * Attribute to hold <code>weekDay</code> property.
     */
    private boolean weekDay;

    /**
     * Gets the <code>ValidityTimeDto</code> property.
     * <p>
     * <b>Format: </b><br>
     * boolean
     * <p>
     * <b>Example: </b><br>
     * true
     * <p>
     * 
     * @param pObj the new value of the <code>object</code> property.
     * @return the current value of the <code>ValidityTimeDto</code> property.
     */

    @Override
    public boolean equals(final Object pObj) {
        if (this == pObj) {
            return true;
        }
        if (pObj == null) {
            return false;
        }
        if (getClass() != pObj.getClass()) {
            return false;
        }
        final ValidityTimeDto other = (ValidityTimeDto) pObj;
        if ((this.getOperationDays() != other.getOperationDays()) || (this.isWeekDay() != other.isWeekDay())) {
            return false;
        }
        if (this.getTimeRangeDto() == null
                    || (this.getTimeRangeDto().getOperationFromTime() == null && this.getTimeRangeDto()
                                .getOperationToTime() == null)) {
            if (!(other.getTimeRangeDto() == null || (other.getTimeRangeDto().getOperationFromTime() == null && other
                        .getTimeRangeDto().getOperationToTime() == null))) {
                return false;
            }
        }
        else if (!this.getTimeRangeDto().equals(other.getTimeRangeDto()))
            return false;
        return true;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>operationDays</code> property.
     * <p>
     * 
     * @return the current value of the <code>operationDays</code> property.<br>
     */
    public WeekDaysType getOperationDays() {
        return this.operationDays;
    }

    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.framework.dto.TimeRangeDto
     * TimeRangeDto} containing <code>TimeRangeDto</code> details.
     * <p>
     * 
     * @return the current value of the <code>timeRangeDto</code> property.<br>
     */
    public TimeRangeDto getTimeRangeDto() {
        if (this.timeRangeDto == null) {
            this.timeRangeDto = new TimeRangeDto();
        }
        return this.timeRangeDto;
    }

    /**
     * Gets the <code>validRadio</code> property.
     * <p>
     * 
     * @return the current value of the <code>validRadio</code> property.<br>
     */
    public String getValidRadio() {
        return this.validRadio;
    }

    /**
     * The<code>hashCode </code> object.
     * <p>
     * 
     * @return <code>int</code> hashcode of super class.
     */
    @Override
    public int hashCode() {
        int result = 31 * 1;
        result = result + ((this.operationDays == null) ? 0 : this.operationDays.hashCode());
        result = result + ((this.timeRangeDto == null) ? 0 : this.timeRangeDto.hashCode());
        return result;
    }

    /**
     * Gets the <code>weekDay</code> property.
     * <p>
     * 
     * @return the current value of the <code>weekDay</code> property.<br>
     */
    public boolean isWeekDay() {
        return this.weekDay;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId the new value of the <code>oId</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the <code>operationDays</code> property.
     * 
     * @param pOperationDays the new value of <code>operationDays</code>.
     */
    public void setOperationDays(final WeekDaysType pOperationDays) {
        this.operationDays = pOperationDays;
        if (this.operationDays != null) {
            this.setWeekDay(true);
        }
    }

    /**
     * Sets the <code>timeRangeDto</code> property.
     * 
     * @param pTimeRangeDto the new value of <code>timeRangeDto</code>.
     */
    public void setTimeRangeDto(final TimeRangeDto pTimeRangeDto) {
        this.timeRangeDto = pTimeRangeDto;
        if (pTimeRangeDto != null && (pTimeRangeDto.getOperationFromTime() != null
                    || pTimeRangeDto.getOperationToTime() != null)) {
            this.setValidRadio("T");
        }
        else {
            this.setValidRadio("A");
        }
    }

    /**
     * Sets the <code>validRadio</code> property.
     * 
     * @param pValidRadio
     *            the new value of <code>validRadio</code>.
     */
    public void setValidRadio(final String pValidRadio) {
        this.validRadio = pValidRadio;
    }

    /**
     * Sets the <code>weekDay</code> property.
     * 
     * @param pWeekDay
     *            the new value of <code>weekDay</code>.
     */
    public void setWeekDay(final boolean pWeekDay) {
        this.weekDay = pWeekDay;
    }

}
