/**
 * 
 */
package com.unisys.trans.logistics.lms.framework.dto.constants;

/**
 * <code>ShipmentDataType</code> class holds the Shipment Data constants.
 * <p>
 */

public enum ShipmentDataType {

    /**
     * AIR_WAYBILL represents the Air Waybill.
     * <p>
     * value = {@value}
     */
    AIR_WAYBILL("Air Waybill"),
    /**
     * BOOKING represents the Booking.
     * <p>
     * value = {@value}
     */
    BOOKING("Booking"),
    /**
     * BOTH represents the Both.
     * <p>
     * value = {@value}
     */
    BOTH("Both");

    /**
     * Attribute to hold the <code>stringValue</code> property.
     * <p>
     * value = {@value}
     */
    private String stringValue;

    /**
     * Parameterize constructor.
     * 
     * @param pShipmentDataType
     *            the value.
     */
    ShipmentDataType(final String pShipmentDataType) {
        this.setStringValue(pShipmentDataType);
    }

    /**
     * Gets the stringValue.
     * <p>
     * 
     * @return the current value of <code>stringValue</code> property.<br>
     */
    public String getStringValue() {
        return this.stringValue;
    }

    /**
     * Sets the stringValue.
     * <p>
     * 
     * @param pStringValue
     *            the current value of <code>stringValue</code> property.<br>
     */
    public void setStringValue(final String pStringValue) {
        this.stringValue = pStringValue;
    }

    /**
     * Gives the string format of enumerated <code>ShipmentDataType</code>.
     * <p>
     * 
     * @return the current string value of the <code>ShipmentDataType</code>.
     */
    public String value() {
        return this.name();
    }

}
