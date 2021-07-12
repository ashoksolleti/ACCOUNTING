package com.unisys.trans.logistics.lms.utils.dto.ucs;

import java.io.Serializable;


/**
 * <code>StationHoursDto</code> contain details of Station Hours.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>customsHours
 * <li>deliveryHours
 * <li>expressDeliveryHours
 * <li>expressPickupHours
 * <li>officeHours
 * <li>pickupHours
 * <li>warehouseHours
 * </code>
 * </ul>
 */
public class StationHoursDto implements Serializable {

    /**
     * Generated serial version added. add a valid serial version id.
     */
    private static final long serialVersionUID = 8921122412528392330L;

    /**
     * Attribute to hold the <code>customsHours</code> property.
     */
    private ServiceHourDto customsHours;

    /**
     * Attribute to hold the <code>deliveryHours</code> property.
     */
    private ServiceHourDto deliveryHours;

    /**
     * Attribute to hold the <code>expressDeliveryHours</code> property.
     */
    private ServiceHourDto expressDeliveryHours;

    /**
     * Attribute to hold the <code>expressPickupHours</code> property.
     */
    private ServiceHourDto expressPickupHours;

    /**
     * Attribute to hold the <code>officeHours</code> property.
     */
    private ServiceHourDto officeHours;

    /**
     * Attribute to hold the <code>pickupHours</code> property.
     */
    private ServiceHourDto pickupHours;

    /**
     * Attribute to hold the <code>warehouseHours</code> property.
     */
    private ServiceHourDto warehouseHours;

    /**
     * Gets the <code>customsHours</code> property.
     * <p>
     * 
     * @return the current value of <code>customsHours</code> property.
     */
    public ServiceHourDto getCustomsHours() {
        return this.customsHours;
    }

    /**
     * Gets the <code>deliveryHours</code> property.
     * <p>
     * 
     * @return the current value of <code>deliveryHours</code> property.
     */
    public ServiceHourDto getDeliveryHours() {
        return this.deliveryHours;
    }

    /**
     * Gets the <code>expressDeliveryHours</code> property.
     * <p>
     * 
     * @return the current value of <code>expressDeliveryHours</code> property.
     */
    public ServiceHourDto getExpressDeliveryHours() {
        return this.expressDeliveryHours;
    }

    /**
     * Gets the <code>expressPickupHours</code> property.
     * <p>
     * 
     * @return the current value of <code>expressPickupHours</code> property.
     */
    public ServiceHourDto getExpressPickupHours() {
        return this.expressPickupHours;
    }

    /**
     * Gets the <code>officeHours</code> property.
     * <p>
     * 
     * @return the current value of <code>officeHours</code> property.
     */
    public ServiceHourDto getOfficeHours() {
        return this.officeHours;
    }

    /**
     * Gets the <code>pickupHours</code> property.
     * <p>
     * 
     * @return the current value of <code>pickupHours</code> property.
     */
    public ServiceHourDto getPickupHours() {
        return this.pickupHours;
    }

    /**
     * Gets the <code>warehouseHours</code> property.
     * <p>
     * 
     * @return the current value of <code>warehouseHours</code> property.
     */
    public ServiceHourDto getWarehouseHours() {
        return this.warehouseHours;
    }

    /**
     * Sets the value of the <code>customsHours</code> property.
     * <p>
     * Office hours of the station for customs service. It has the open and close time details of weekdays,
     * Saturdays, Sundays and holidays.
     * <p>
     * <b>Format: </b><br>
     * 4n-4n
     * <p>
     * <b>Example: </b><br>
     * 0800-1600
     * <p>
     * 
     * @param pCustomsHours the new value of the <code>customsHours</code> property.<br>
     */
    public void setCustomsHours(final ServiceHourDto pCustomsHours) {
        this.customsHours = pCustomsHours;
    }

    /**
     * Sets the value of the <code>deliveryHours</code> property.
     * <p>
     * Office hours of the station to delivery goods. It has the open and close time details of weekdays,
     * Saturdays, Sundays and holidays.
     * <p>
     * <b>Format: </b><br>
     * 4n-4n
     * <p>
     * <b>Example: </b><br>
     * 0800-1600
     * <p>
     * 
     * @param pDeliveryHours the new value of the <code>deliveryHours</code> property.<br>
     */
    public void setDeliveryHours(final ServiceHourDto pDeliveryHours) {
        this.deliveryHours = pDeliveryHours;
    }

    /**
     * Sets the value of the <code>expressDeliveryHours</code> property.
     * <p>
     * Office hours of the station for the express delivery pick ups. It has the open and close time details
     * of weekdays, Saturdays, Sundays and holidays.
     * <p>
     * <b>Format: </b><br>
     * 4n-4n
     * <p>
     * <b>Example: </b><br>
     * 0800-1600
     * <p>
     * 
     * @param pExpressDeliveryHours the new value of the <code>expressDeliveryHours</code> property.<br>
     */
    public void setExpressDeliveryHours(final ServiceHourDto pExpressDeliveryHours) {
        this.expressDeliveryHours = pExpressDeliveryHours;
    }

    /**
     * Sets the value of the <code>expressPickUpHours</code> property.
     * <p>
     * Office hours of the station for the express pick ups. It has the open and close time details of
     * weekdays, Saturdays, Sundays and holidays.
     * <p>
     * <b>Format: </b><br>
     * 4n-4n
     * <p>
     * <b>Example: </b><br>
     * 0800-1600
     * <p>
     * 
     * @param pExpressPickupHours the new value of the <code>expressPickUpHours</code> property.<br>
     */
    public void setExpressPickupHours(final ServiceHourDto pExpressPickupHours) {
        this.expressPickupHours = pExpressPickupHours;
    }

    /**
     * Sets the value of the <code>officeHours</code> property.
     * 
     * 
     * @param pOfficeHours the new value of the <code>officeHours</code> property.<br>
     */
    public void setOfficeHours(final ServiceHourDto pOfficeHours) {
        this.officeHours = pOfficeHours;
    }

    /**
     * Sets the value of the <code>pickUpHours</code> property.
     * <p>
     * Office hours of the station for the express pick ups. It has the open and close time details of
     * weekdays, Saturdays, Sundays and holidays.
     * <p>
     * <b>Format: </b><br>
     * 4n-4n
     * <p>
     * <b>Example: </b><br>
     * 0800-1600
     * <p>
     * 
     * @param pPickupHours the new value of the <code>pickUpHours</code> property.<br>
     */
    public void setPickupHours(final ServiceHourDto pPickupHours) {
        this.pickupHours = pPickupHours;
    }

    /**
     * Sets the value of the <code>wareHouseHours</code> property.
     * <p>
     * Office hours of the station for the warehouse services. It has the open and close time details of
     * weekdays, Saturdays, Sundays and holidays.
     * <p>
     * <b>Format: </b><br>
     * 4n-4n
     * <p>
     * <b>Example: </b><br>
     * 0800-1600
     * <p>
     * 
     * @param pWarehouseHours the new value of the <code>wareHouseHours</code> property.<br>
     */
    public void setWarehouseHours(final ServiceHourDto pWarehouseHours) {
        this.warehouseHours = pWarehouseHours;
    }

}
