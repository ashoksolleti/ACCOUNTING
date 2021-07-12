/**
 * 
 */
package com.unisys.trans.logistics.lms.framework.constants;

public enum ItemDisplayType {
    GOODS_AT_STATION("Goods at Station"),

    GOODS_IN_FLIGHT("Goods in Flight"),

    GOODS_IN_BREAKDOWN_ULD("Goods in Breakdown"),

    BOOKING("Booking"),

    GOODS_IN_ULD("Goods in ULD"),

    BOOKING_NOT_ASSIGNED("Booking, Not Assigned"),

    BOOKING_ASSIGNED_ALTERNATE_FLIGHT("Booking, Assigned Alternate");

    /**
     * Attribute to hold <code>exceptionType</code> property.
     */
    private String itemDisplay;

    private ItemDisplayType(final String pItemDisplayType) {
        this.itemDisplay = pItemDisplayType;
    }

    /**
     * Gets the <code>exceptionType</code> property.
     * <p>
     * 
     * @return the current value of the <code>exceptionType</code> property.
     */
    public String getItemDisplayType() {
        return this.itemDisplay;

    }

    /**
     * Gives the string format of <code>airWaybillCreationChannelType</code>.
     * <p>
     * 
     * @return the enumerated value of the <code>airWaybillCreationChannelType</code>.<br>
     */
    public String value() {
        return this.itemDisplay;
    }

    @Override
    public String toString() {
        return this.itemDisplay;
    }
}