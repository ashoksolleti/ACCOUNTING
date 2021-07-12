/**
 * 
 */
package com.unisys.trans.logistics.lms.framework.dto.constants;

/**
 * <code>ShipmentDataType</code> class holds the Shipment Data constants.
 * <p>
 */

public enum CommercialControlType {

    /**
     * AIR_WAYBILL represents the Air Waybill.
     * <p>
     * value = {@value}
     */
    ON("On"),
    /**
     * BOOKING represents the Booking.
     * <p>
     * value = {@value}
     */
    OFF("Off"),
    /**
     * BOTH represents the Both.
     * <p>
     * value = {@value}
     */
    TRANSITION("Transition");

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
    CommercialControlType(final String pShipmentDataType) {
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
