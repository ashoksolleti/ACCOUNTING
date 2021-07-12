/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.rating.dto.constants.CheckInDayType;
import com.unisys.trans.logistics.lms.rating.dto.constants.StorageChargeType;

import java.math.BigDecimal;

/**
 * <code>StorageRateDto</code> class is used to maintain other charge for Storage per shipment per day,
 * Storage per weight unit and Storage per piece/ULD table type.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>oId
 * <li>breakPointTable
 * <li>freeHours
 * <li>startTime
 * <li>excludeHolidayIndicator
 * <li>storageChargeType
 * <li>shipmentMinimumCharge
 * <li>fixedCharge
 * <li>checkInDayType
 * <li>dateToUseCode
 * </code>
 * </ul>
 */
public class StorageRateDto extends OtherChargeRateDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 8831578039371582829L;

    /**
     * Attribute to hold <code>breakPointTable</code>.
     * <p>
     * Represents the instance of <code>BreakPointTableDto</code>.
     */
    private BreakPointTableDto breakPointTable;

    /**
     * Attribute to hold <code>checkInDayType</code>.
     * <p>
     * This indicates whether the next day is free if the goods are checked in on a Friday.
     */
    private CheckInDayType checkInDayType;

    /**
     * Attribute to hold <code>dateToUseCode</code>.
     * <p>
     * This indicates the date and time from when the number of days to apply storage charges would be
     * computed.
     */
    private String dateToUseCode;

    /**
     * Attribute to hold <code>excludeHolidayIndicator</code>.
     * <p>
     * Represents the indicator for excluding holidays in free time calculation.
     */
    private boolean excludeHolidayIndicator;

    /**
     * Attribute to hold <code>fixedCharge</code>.
     * <p>
     * Represents the fixed charge to be added.
     */
    private BigDecimal fixedCharge;

    /**
     * Attribute to hold <code>freeHours</code>.
     * <p>
     * This hold the number of free hours allowed after which storage charge is applicable.
     */
    private int freeHours;

    /**
     * Attribute to hold <code>shipmentMinimumCharge</code>.
     * <p>
     * This hold the minimum shipment charge for the other charge.
     */
    private BigDecimal shipmentMinimumCharge;

    /**
     * Attribute to hold <code>startTime</code>.
     * <p>
     * This hold the start time for calculating storage charges after the expiry of free hours. Valid values
     * (0000 – 2359) and exact time (9999).
     */
    private String startTime;

    /**
     * Attribute to hold <code>storageChargeType</code>.
     * <p>
     * This indicates whether the charge is per day (Single) or for all days (Multiple).
     */
    private StorageChargeType storageChargeType;

    /**
     * <code>Default constructor</code>.
     */
    public StorageRateDto() {

    }

    /**
     * Gets the <code>breakPointTable</code> property.
     * <p>
     * Represents the instance of <code>BreakPointTableDto</code>.
     * <p>
     * 
     * @return the current value of the <code>breakPointTable</code> property.<br>
     */
    public BreakPointTableDto getBreakPointTable() {
        return this.breakPointTable;
    }

    /**
     * Gets the <code>checkInDayType</code> property.
     * <p>
     * This indicates whether the next day is free if the goods are checked in on a Friday.
     * <p>
     * 
     * @return the current value of the <code>checkInDayType</code> property.<br>
     */
    public CheckInDayType getCheckInDayType() {
        return this.checkInDayType;
    }

    /**
     * Gets the <code>dateToUseCode</code> property.
     * <p>
     * Represents the date and time from when the number of days to apply storage charges would be computed.
     * <p>
     * 
     * @return the current value of the <code>dateToUseCode</code> property.<br>
     */
    public String getDateToUseCode() {
        return this.dateToUseCode;
    }

    /**
     * Gets the <code>fixedCharge</code> property.
     * <p>
     * Represents the fixed charge to be added.
     * <p>
     * <b>Format: </b><br>
     * 1-9 BigDecimal<br>
     * <b>Example: </b><br>
     * 100.369
     * <p>
     * 
     * @return the current value of the <code>fixedCharge</code> property.<br>
     */
    public BigDecimal getFixedCharge() {
        return this.fixedCharge;
    }

    /**
     * Gets the <code>freeHours</code> property.
     * <p>
     * Represents the number of free hours allowed after which storage charge is applicable.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric<br>
     * <b>Example: </b><br>
     * 10
     * <p>
     * 
     * @return the current value of the <code>freeHours</code> property.<br>
     */
    public int getFreeHours() {
        return this.freeHours;
    }

    /**
     * Gets the <code>shipmentMinimumCharge</code> property.
     * <p>
     * Represents the shipment minimum charge to be added.
     * <p>
     * <b>Format: </b><br>
     * 1-9 BigDecimal<br>
     * <b>Example: </b><br>
     * 100.369
     * <p>
     * 
     * @return the current value of the <code>shipmentMinimumCharge</code> property.<br>
     */
    public BigDecimal getShipmentMinimumCharge() {
        return this.shipmentMinimumCharge;
    }

    /**
     * Gets the <code>startTime</code> property.
     * <p>
     * This hold the start time for calculating storage charges after the expiry of free hours. Valid values
     * (0000 – 2359) and exact time (9999).
     * <p>
     * <b>Format: </b><br>
     * 4 Numeric<br>
     * <b>Example: </b><br>
     * 2251
     * <p>
     * 
     * @return the current value of the <code>startTime</code> property.<br>
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * Gets the <code>storageChargeType</code> property.
     * <p>
     * This indicates whether the charge is per day (Single) or for all days (Multiple).
     * <p>
     * 
     * @return the current value of the <code>storageChargeType</code> property.<br>
     */
    public StorageChargeType getStorageChargeType() {
        return this.storageChargeType;
    }

    /**
     * Gets the <code>excludeHolidayIndicator</code> property.
     * <p>
     * Represents the indicator for excluding holidays in free time calculation.<br>
     * <b>Possible Values:</b><br>
     * <li><code>true</code>Holidays are excluded in free time calculation.
     * <li><code>false</code>Holidays are included in free time calculation.
     * <p>
     * 
     * @return the current value of the <code>excludeHolidayIndicator</code> property.<br>
     */
    public boolean isExcludeHolidayIndicator() {
        return this.excludeHolidayIndicator;
    }

    /**
     * Sets the <code>breakPointTable</code> property.
     * <p>
     * Represents the instance of <code>BreakPointTableDto</code>.
     * <p>
     * 
     * @param pBreakPointTable the new value of the <code>breakPointTable</code>.<br>
     */
    public void setBreakPointTable(final BreakPointTableDto pBreakPointTable) {
        this.breakPointTable = pBreakPointTable;
    }

    /**
     * Sets the <code>checkInDayType</code> property.
     * <p>
     * This indicates whether the next day is free if the goods are checked in on a Friday.
     * <p>
     * 
     * @param pCheckInDayType the new value of the <code>checkInDayType</code>.<br>
     */
    public void setCheckInDayType(final CheckInDayType pCheckInDayType) {
        this.checkInDayType = pCheckInDayType;
    }

    /**
     * Sets the <code>dateToUseCode</code> property.
     * <p>
     * This indicates the date and time from when the number of days to apply storage charges would be
     * computed.
     * <p>
     * 
     * @param pDateToUseCode the new value of the <code>dateToUseCode</code>.<br>
     */
    public void setDateToUseCode(final String pDateToUseCode) {
        this.dateToUseCode = pDateToUseCode;
    }

    /**
     * Sets the <code>excludeHolidayIndicator</code> property.
     * <p>
     * This hold the indicator for excluding holidays in free time calculation.<br>
     * <b>Possible Values:</b><br>
     * <li><code>true</code>Holidays are excluded in free time calculation.
     * <li><code>false</code>Holidays are included in free time calculation.
     * <p>
     * 
     * @param pExcludeHolidayIndicator the new value of the <code>excludeHolidayIndicator</code>.<br>
     */
    public void setExcludeHolidayIndicator(final boolean pExcludeHolidayIndicator) {
        this.excludeHolidayIndicator = pExcludeHolidayIndicator;
    }

    /**
     * Sets the <code>fixedCharge</code> property.
     * <p>
     * Represents the fixed charge to be added.
     * <p>
     * <b>Format: </b><br>
     * 1-9 BigDecimal<br>
     * <b>Example: </b><br>
     * 100.369
     * <p>
     * 
     * @param pFixedCharge the new value of the <code>fixedCharge</code>.<br>
     */
    public void setFixedCharge(final BigDecimal pFixedCharge) {
        this.fixedCharge = pFixedCharge;
    }

    /**
     * Sets the <code>freeHours</code> property.
     * <p>
     * Represents the number of free hours allowed after which storage charge is applicable.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric<br>
     * <b>Example: </b><br>
     * 10
     * <p>
     * 
     * @param pFreeHours the new value of the <code>freeHours</code>.<br>
     */
    public void setFreeHours(final int pFreeHours) {
        this.freeHours = pFreeHours;
    }

    /**
     * Sets the <code>shipmentMinimumCharge</code> property.
     * <p>
     * Represents the minimum shipment charge for the other charge.
     * <p>
     * <b>Format: </b><br>
     * 1-9 BigDecimal<br>
     * <b>Example: </b><br>
     * 100.369
     * <p>
     * 
     * @param pShipmentMinimumCharge the new value of the <code>shipmentMinimumCharge</code>.<br>
     */
    public void setShipmentMinimumCharge(final BigDecimal pShipmentMinimumCharge) {
        this.shipmentMinimumCharge = pShipmentMinimumCharge;
    }

    /**
     * Sets the <code>startTime</code> property.
     * <p>
     * This hold the start time for calculating storage charges after the expiry of free hours. Valid values
     * (0000 – 2359) and exact time (9999).
     * <p>
     * <b>Format: </b><br>
     * 4 Numeric<br>
     * <b>Example: </b><br>
     * 2251
     * <p>
     * 
     * @param pStartTime the new value of the <code>startTime</code>.<br>
     */
    public void setStartTime(final String pStartTime) {
        this.startTime = pStartTime;
    }

    /**
     * Sets the <code>storageChargeType</code> property.
     * <p>
     * This indicates whether the charge is per day (Single) or for all days (Multiple).
     * <p>
     * 
     * @param pStorageChargeType the new value of the <code>storageChargeType</code>.<br>
     */
    public void setStorageChargeType(final StorageChargeType pStorageChargeType) {
        this.storageChargeType = pStorageChargeType;
    }

    /**
     * This method overrides toString property.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the string value.<br>
     *         </p>
     */
    @Override
    public String toString() {
        final StringBuilder aCapacity = new StringBuilder();
        aCapacity.append(this.isBiDirectionalIndicator());
        aCapacity.append(this.getCurrency());
        aCapacity.append(this.getMaximumCharge());
        aCapacity.append(this.getMinimumCharge());
        aCapacity.append(this.getOtherChargeRateType().value());
        aCapacity.append(this.getWeightUOMType().value());
        aCapacity.append(this.excludeHolidayIndicator);
        aCapacity.append(this.freeHours);
        aCapacity.append(this.startTime);
        aCapacity.append(this.checkInDayType);
        aCapacity.append(this.storageChargeType);
        aCapacity.append(this.fixedCharge);
        aCapacity.append(this.shipmentMinimumCharge);
        aCapacity.append(this.dateToUseCode);
        return aCapacity.toString();
    }
}
