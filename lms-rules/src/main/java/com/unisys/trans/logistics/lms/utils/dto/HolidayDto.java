/* ====================================== */
/* Copyright(c) 2012 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;
import com.unisys.trans.logistics.lms.utils.dto.constants.HolidayType;
import java.util.ArrayList;
import java.util.List;

/**
 * <code>HolidayDto</code> contains the details of Holiday.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>holidayDates
 * <li>holidayType
 * <li>monthHolidays
 * <li>standardHolidayApplyInd
 * <li>stationCode
 * <li>oId
 * </ul>
 */
public class HolidayDto extends PersistenceObjectDto {

    /**
     * TODO Generated serial version added. add a valid serial version id
     */
    private static final long serialVersionUID = -4604939978746589483L;

    /**
     * Attribute to hold <code>holidayDates</code> property.
     */
    private List<HolidayDateDto> holidayDates;

    /**
     * Attribute to hold <code>holidayType</code> property.
     */
    private HolidayType holidayType;

    /**
     * Attribute to hold <code>monthHolidays</code> property.
     */
    private List<MonthHolidayDto> monthHolidays;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>standardHolidayApplyInd</code> property.
     */
    private boolean standardHolidayApplyInd;

    /**
     * Attribute to hold <code>stationCode</code> property.
     */
    private String stationCode;

    /**
     * Gets the <code>HolidayDates</code> property.
     * <p>
     * <b>Format: </b><br>
     * DDMMMYY
     * <p>
     * <b>Example: </b><br>
     * 26JAN08
     * <p>
     * 
     * @return the current value of the <code>HolidayDates</code> property.
     */
    public List<HolidayDateDto> getHolidayDates() {
        if (this.holidayDates == null) {
            this.holidayDates = new ArrayList<HolidayDateDto>();
        }
        return this.holidayDates;
    }

    /**
     * Gets the <code>holidayType</code> property.
     * <p>
     * 
     * @return holidayType the new value of the <code>holidayType</code> property.
     */
    public HolidayType getHolidayType() {
        return this.holidayType;
    }

    /**
     * Gets the <code>monthHolidays</code> property.
     * <p>
     * 
     * @return monthHolidays the new value of the <code>monthHolidays</code> property.
     */
    public List<MonthHolidayDto> getMonthHolidays() {
        if (this.monthHolidays == null) {
            this.monthHolidays = new ArrayList<MonthHolidayDto>();
        }
        return this.monthHolidays;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the <code>stationCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @return stationCode the new value of the <code>stationCode</code> property.
     */
    public String getStationCode() {
        return this.stationCode;
    }

    /**
     * Gets the <code>standardHolidayApplyInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 boolean
     * <p>
     * <b>Example: </b><br>
     * 0 or 1
     * 
     * @return standardHolidayApplyInd the new value of the <code>standardHolidayApplyInd</code> property.
     */
    public boolean isStandardHolidayApplyInd() {
        return this.standardHolidayApplyInd;
    }

    /**
     * Sets the <code>holidayDates</code> property.
     * <p>
     * <b>Format: </b><br>
     * DDMMMYY
     * <p>
     * <b>Example: </b><br>
     * 26JAN08
     * <p>
     * 
     * @param pHolidayDates the new value of the <code>holidayDates</code> property.
     */
    public void setHolidayDates(final List<HolidayDateDto> pHolidayDates) {
        this.holidayDates = pHolidayDates;
    }

    /**
     * Sets the <code>holidayType</code> property.
     * <p>
     * 
     * @param pHolidayType the new value of the <code>holidayType</code> property.
     */
    public void setHolidayType(final HolidayType pHolidayType) {
        this.holidayType = pHolidayType;
    }

    /**
     * Sets the <code>monthHolidays</code> property.
     * <p>
     * 
     * @param pMonthHolidays the new value of the <code>monthHolidays</code> property.
     */
    public void setMonthHolidays(final List<MonthHolidayDto> pMonthHolidays) {
        this.monthHolidays = pMonthHolidays;
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

    /**
     * Sets the <code>standardHolidayApplyInd</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1 boolean
     * <p>
     * <b>Example: </b><br>
     * 0 or 1
     * 
     * @param pStandardHolidayApplyInd the new value of the <code>standardHolidayApplyInd</code> property.
     */
    public void setStandardHolidayApplyInd(final boolean pStandardHolidayApplyInd) {
        this.standardHolidayApplyInd = pStandardHolidayApplyInd;
    }

    /**
     * Sets the <code>stationCode</code> property.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @param pStationCode the new value of the <code>stationCode</code> property.
     */
    public void setStationCode(final String pStationCode) {
        this.stationCode = ContractUtility.convertToUpperCase(pStationCode);
    }

}
