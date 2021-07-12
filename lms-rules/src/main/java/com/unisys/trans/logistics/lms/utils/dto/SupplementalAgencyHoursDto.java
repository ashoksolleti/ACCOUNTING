/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.constants.WeekDaysType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>SupplementalAgencyHoursDto</code> contain details of SupplementalAgencyHoursDto.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>date
 * <li>day
 * <li>oId
 * <li>specialIndicator
 * <li>stationInfoDayHoursDtos
 * </code>
 * </ul>
 */
public class SupplementalAgencyHoursDto extends PersistenceObjectDto {

    /**
     * Default serial version id.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>date</code> property.
     */
    private Date date;

    /**
     * Attribute to hold <code>day</code> property.
     */
    private WeekDaysType day;

    /**
     * Attribute to hold <code>oId</code> property. Unique identifier for
     * station
     */
    private Long oId;

    /**
     * Attribute to hold <code>specialIndicator</code> property.
     */
    private boolean specialIndicator = true;

    /**
     * Attribute to hold list of<code>stationHourDtos</code> property.
     */
    private List<StationInfoDayHoursDto> stationInfoDayHoursDtos;

    @Override
    public boolean equals(Object obj) {
        boolean isEqual = true;
        if (this == obj)
            isEqual =  true;
        if (obj == null)
            isEqual =  false;
        if (getClass() != obj.getClass())
            isEqual =  false;
        final SupplementalAgencyHoursDto other = (SupplementalAgencyHoursDto) obj;
        if (date == null) {
            if (other.date != null)
                isEqual =  false;
        }
        else if (!date.equals(other.date))
            isEqual =  false;
        return isEqual;
    }

    /**
     * Gets the <code>date</code> property.
     * <p>
     * 
     * @return the current value of the <code>date</code> property.
     */
    public Date getDate() {
        return ContractUtility.getClonedDate(this.date);
    }

    /**
     * Gets the <code>day</code> property.
     * <p>
     * 
     * @return the current value of the <code>day</code> property.
     */
    public WeekDaysType getDay() {
        return this.day;
    }

    /**
     * Gets the value of <code>oId</code> property.
     * <p>
     * Unique identifier for station.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.<br>
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the list of {@link com.unisys.trans.logistics.lms.utils.dto.StationHourDto
     * StationHourDto} containing <code>StationHourDto</code> details.
     * <p>
     * 
     * @return the current value of the <code>stationHourDtos</code> property.
     */
    public List<StationInfoDayHoursDto> getStationInfoDayHoursDtos() {
        if (this.stationInfoDayHoursDtos == null) {
            this.stationInfoDayHoursDtos = new ArrayList<StationInfoDayHoursDto>();
        }
        return this.stationInfoDayHoursDtos;
    }

    @Override
    public int hashCode() {
        return FrameworkConstants.ONE;
    }

    /**
     * Gets the <code>area</code> property.
     * <p>
     * 
     * @return the current value of the <code>area</code> property.
     */
    public boolean isSpecialIndicator() {
        return this.specialIndicator;
    }

    /**
     * Sets the list of<code>date</code> property.
     * <p>
     * 
     * @param pDate
     *            the current value of the <code>date</code> property.
     */
    public void setDate(final Date pDate) {
        this.date = ContractUtility.getClonedDate(pDate);
    }

    /**
     * Sets the list of<code>WeekDaysType</code> property.
     * <p>
     * 
     * @param pDay
     *            the current value of the <code>WeekDaysType</code> property.
     */
    public void setDay(final WeekDaysType pDay) {
        this.day = pDay;
    }

    /**
     * Sets the value of the <code>OID</code> property.
     * <p>
     * Unique identifier for station.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>OID</code> property.<br>
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Sets the list of<code>specialIndicator</code> property.
     * <p>
     * 
     * @param pSpecialIndicator
     *            the current value of the <code>specialIndicator</code> property.
     */
    public void setSpecialIndicator(final boolean pSpecialIndicator) {
        this.specialIndicator = pSpecialIndicator;
    }

    /**
     * Sets the list of<code>stationInfoDayHoursDtos</code> property.
     * <p>
     * 
     * @param pStationInfoDayHoursDtos
     *            the current value of the <code>stationInfoDayHoursDtos</code> property.
     */
    public void setStationInfoDayHoursDtos(final List<StationInfoDayHoursDto> pStationInfoDayHoursDtos) {
        this.stationInfoDayHoursDtos = pStationInfoDayHoursDtos;
    }

}
