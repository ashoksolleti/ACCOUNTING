/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.io.Serializable;

import com.unisys.trans.logistics.lms.framework.dto.constants.WeekDaysType;

/**
 * <code>StationHourDto</code> contain details of StationHourDto.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>countryWideHoliday
 * <li>customsHours
 * <li>day
 * <li>dayOfTheWeek
 * <li>deliveryHours
 * <li>expressDeliveryHours
 * <li>expressPickUpHours
 * <li>officeHours
 * <li>pickupHours
 * <li>wareHouseHours
 * <li>weekDay
 * </code>
 * </ul>
 */

public class StationHourDto implements Serializable {

    /**
     * Default serial version id.
     */
    private static final long serialVersionUID = -1471739411875521579L;

    /**
     * Attribute to hold <code>countryWideHoliday</code> property.
     */
    private Boolean countryWideHoliday;

    /**
     * Attribute to hold <code>customsHours</code> property.
     */
    private String customsHours;

    /**
     * Attribute to hold <code>day</code> property.
     */
    private String day;

    /**
     * Attribute to hold <code>dayOfTheWeek</code> property.
     */
    private int dayOfTheWeek;

    /**
     * Attribute to hold <code>deliveryHours</code> property.
     */
    private String deliveryHours;

    /**
     * Attribute to hold <code>expressDeliveryHours</code> property.
     */
    private String expressDeliveryHours;

    /**
     * Attribute to hold <code>expressPickUpHours</code> property.
     */
    private String expressPickUpHours;

    /**
     * Attribute to hold <code>officeHours</code> property.
     */
    private String officeHours;

    /**
     * Attribute to hold <code>pickupHours</code> property.
     */
    private String pickupHours;

    /**
     * Attribute to hold <code>wareHouseHours</code> property.
     */
    private String wareHouseHours;

    /**
     * Attribute to hold <code>weekDay</code> property.
     */
    private WeekDaysType weekDay;

    /**
     * Gets the <code>countryWideHoliday</code> property.
     * <p>
     * 
     * @return the current value of the <code>countryWideHoliday</code> property.
     */
    public Boolean getCountryWideHoliday() {
        return this.countryWideHoliday;
    }

    /**
     * Gets the <code>customsHours</code> property.
     * <p>
     * 
     * @return the current value of the <code>customsHours</code> property.
     */
    public String getCustomsHours() {
        return this.customsHours;
    }
    
    /**
     * Gets the <code>customsHours</code> property value with new line as separator.
     * <p>
     * 
     * @return the current value of the <code>customsHours</code> property.
     */
    public String getCustomsHoursToDisplay() {
        String customsHours=null;
        if (this.customsHours != null && this.customsHours.length() > 0) {
            customsHours = this.customsHours.replaceAll(",", "<BR>");
        }
        return customsHours;
    }

    /**
     * Gets the <code>day</code> property.
     * <p>
     * 
     * @return the current value of the <code>day</code> property.
     */
    public String getDay() {
        return this.day;
    }

    /**
     * Gets the <code>dayOfTheWeek</code> property.
     * <p>
     * 
     * @return the current value of the <code>dayOfTheWeek</code> property.
     */
    public int getDayOfTheWeek() {
        return this.dayOfTheWeek;
    }

    /**
     * Gets the <code>deliveryHours</code> property.
     * <p>
     * 
     * @return the current value of the <code>deliveryHours</code> property.
     */
    public String getDeliveryHours() {
        return this.deliveryHours;
    }
    
    /**
     * Gets the <code>deliveryHours</code> property value with new line as separator.
     * <p>
     * 
     * @return the current value of the <code>deliveryHours</code> property.
     */
    public String getDeliveryHoursToDisplay() {
        String deliveryHours=null;
        if (this.deliveryHours != null && this.deliveryHours.length() > 0) {
            deliveryHours = this.deliveryHours.replaceAll(",", "<BR>");
        }
        return deliveryHours;
    }

    /**
     * Gets the <code>expressDeliveryHours</code> property.
     * <p>
     * 
     * @return the current value of the <code>expressDeliveryHours</code> property.
     */
    public String getExpressDeliveryHours() {
        return this.expressDeliveryHours;
    }
    
    /**
     * Gets the <code>expressDeliveryHours</code> property value with new line as separator.
     * <p>
     * 
     * @return the current value of the <code>expressDeliveryHours</code> property.
     */
    public String getExpressDeliveryHoursToDisplay() {
        String expressDeliveryHours=null;
        if (this.expressDeliveryHours != null && this.expressDeliveryHours.length() > 0) {
            expressDeliveryHours = this.expressDeliveryHours.replaceAll(",", "<BR>");
        }
        return expressDeliveryHours;
    }

    /**
     * Gets the <code>expressPickUpHours</code> property.
     * <p>
     * 
     * @return the current value of the <code>expressPickUpHours</code> property.
     */
    public String getExpressPickUpHours() {
        return this.expressPickUpHours;
    }
    
    /**
     * Gets the <code>expressPickUpHours</code> property value with new line as separator.
     * <p>
     * 
     * @return the current value of the <code>expressPickUpHours</code> property.
     */
    public String getExpressPickUpHoursToDisplay() {
        String expressPickUpHours=null;
        if (this.expressPickUpHours != null && this.expressPickUpHours.length() > 0) {
            expressPickUpHours = this.expressPickUpHours.replaceAll(",", "<BR>");
        }
        return expressPickUpHours;
    }

    /**
     * Gets the <code>officeHours</code> property.
     * <p>
     * 
     * @return the current value of the <code>officeHours</code> property.
     */
    public String getOfficeHours() {
        return this.officeHours;
    }
    
    /**
     * Gets the <code>officeHours</code> property value with new line as separator.
     * <p>
     * 
     * @return the current value of the <code>officeHours</code> property.
     */
    public String getOfficeHoursToDisplay() {
        String officeHours=null;
        if (this.officeHours != null && this.officeHours.length() > 0) {
            officeHours = this.officeHours.replaceAll(",", "<BR>");
        }
        return officeHours;
    }

    /**
     * Gets the <code>pickupHours</code> property.
     * <p>
     * 
     * @return the current value of the <code>pickupHours</code> property.
     */
    public String getPickupHours() {
        return this.pickupHours;
    }
    
    /**
     * Gets the <code>pickupHours</code> property value with new line as separator.
     * <p>
     * 
     * @return the current value of the <code>pickupHours</code> property.
     */
    public String getPickupHoursToDisplay() {
        String pickupHours=null;
        if (this.pickupHours != null && this.pickupHours.length() > 0) {
            pickupHours = this.pickupHours.replaceAll(",", "<BR>");
        }
        return pickupHours;
    }

    /**
     * Gets the <code>wareHouseHours</code> property.
     * <p>
     * 
     * @return the current value of the <code>wareHouseHours</code> property.
     */
    public String getWareHouseHours() {
        return this.wareHouseHours;
    }
    
    /**
     * Gets the <code>wareHouseHours</code> property value with new line as separator.
     * <p>
     * 
     * @return the current value of the <code>wareHouseHours</code> property.
     */
    public String getWareHouseHoursToDisplay() {
        String wareHouseHours=null;
        if (this.wareHouseHours != null && this.wareHouseHours.length() > 0) {
            wareHouseHours = this.wareHouseHours.replaceAll(",", "<BR>");
        }
        return wareHouseHours;
    }

    /**
     * Gets the <code>weekDay</code> property.
     * <p>
     * 
     * @return the current value of the <code>weekDay</code> property.
     */
    public WeekDaysType getWeekDay() {
        return this.weekDay;
    }

    /**
     * Sets the <code>countryWideHoliday</code> property.
     * <p>
     * 
     * @param pCountryWideHoliday
     *            the current value of the <code>countryWideHoliday</code> property.
     */
    public void setCountryWideHoliday(final Boolean pCountryWideHoliday) {
        this.countryWideHoliday = pCountryWideHoliday;
    }

    /**
     * Sets the <code>customsHours</code> property.
     * <p>
     * 
     * @param pCustomsHours
     *            the current value of the <code>customsHours</code> property.
     */
    public void setCustomsHours(final String pCustomsHours) {
        this.customsHours = pCustomsHours;
    }

    /**
     * Sets the <code>day</code> property.
     * <p>
     * 
     * @param pDay
     *            the current value of the <code>day</code> property.
     */
    public void setDay(final String pDay) {
        this.day = pDay;
    }

    /**
     * Sets the <code>dayOfTheWeek</code> property.
     * <p>
     * 
     * @param pDayOfTheWeek
     *            the current value of the <code>dayOfTheWeek</code> property.
     */
    public void setDayOfTheWeek(final int pDayOfTheWeek) {
        this.dayOfTheWeek = pDayOfTheWeek;
    }

    /**
     * Sets the <code>deliveryHours</code> property.
     * <p>
     * 
     * @param pDeliveryHours
     *            the current value of the <code>deliveryHours</code> property.
     */
    public void setDeliveryHours(final String pDeliveryHours) {
        this.deliveryHours = pDeliveryHours;
    }

    /**
     * Sets the <code>expressDeliveryHours</code> property.
     * <p>
     * 
     * @param pExpressDeliveryHours
     *            the current value of the <code>expressDeliveryHours</code> property.
     */
    public void setExpressDeliveryHours(final String pExpressDeliveryHours) {
        this.expressDeliveryHours = pExpressDeliveryHours;
    }

    /**
     * Sets the <code>expressPickUpHours</code> property.
     * <p>
     * 
     * @param pExpressPickUpHours
     *            the current value of the <code>expressPickUpHours</code> property.
     */
    public void setExpressPickUpHours(final String pExpressPickUpHours) {
        this.expressPickUpHours = pExpressPickUpHours;
    }

    /**
     * Sets the <code>officeHours</code> property.
     * <p>
     * 
     * @param pOfficeHours
     *            the current value of the <code>officeHours</code> property.
     */
    public void setOfficeHours(final String pOfficeHours) {
        this.officeHours = pOfficeHours;
    }

    /**
     * Sets the <code>pickupHours</code> property.
     * <p>
     * 
     * @param pPickupHours
     *            the current value of the <code>pickupHours</code> property.
     */
    public void setPickupHours(final String pPickupHours) {
        this.pickupHours = pPickupHours;
    }

    /**
     * Sets the <code>wareHouseHours</code> property.
     * <p>
     * 
     * @param pWareHouseHours
     *            the current value of the <code>wareHouseHours</code> property.
     */
    public void setWareHouseHours(final String pWareHouseHours) {
        this.wareHouseHours = pWareHouseHours;
    }

    /**
     * Sets the <code>weekDay</code> property.
     * <p>
     * 
     * @param pWeekDay
     *            the current value of the <code>weekDay</code> property.
     */
    public void setWeekDay(final WeekDaysType pWeekDay) {
        this.weekDay = pWeekDay;
    }

}
