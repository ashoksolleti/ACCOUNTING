/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto.constants;

/**
 * The MessageFilterType enum represents the filter attributes for retrieving the office queue items.
 */
public enum MessageFilterType {
    /**
     * Represents the filter attribute Carrier Code. Type : AN Size : 3 Example : UW. 9W
     */
    CARRIER_CODE("Airline"),
    /**
     * Represents the filter attribute Destination Station Code. Type : A Size : 3 Example : ORD
     */
    DESTINATION_STATION_CODE("Destination"),
    /**
     * Represents the filter attribute Flight Date. Type : DTE Size : DDMMYYYY
     */
    FLIGHT_DATE("Date"),
    /**
     * Represents the filter attribute Flight Number. Type : N Size : 3-4 Example : 101
     */
    FLIGHT_NUMBER("Flight"),
    /**
     * Represents the filter attribute Flight Suffix. Type : A Size : 1 Example : C
     */
    FLIGHT_SUFFIX("FlightSuffix"),
    /**
     * Represents the filter attribute Message Age in Hours. Type : N Size : 1-9 Example : 24
     */
    MESSAGE_AGE("Age"),
    /**
     * Represents the filter attribute Deadline Date. The deadline date specifies the date on which the queued
     * item needs to be purged from the queue. Type : DTE Size : DDMMYYYY
     */
    MESSAGE_DEADLINE("Deadline"),
    /**
     * Represents the filter attribute Message Type. The Message Type can be of either Message (M) or
     * Non-Message(N) Type : A Size : 1 Example : M
     */
    MESSAGE_TYPE("MsgType"),
    /**
     * Represents the filter attribute Origin Station Code. Type A Size : 3 Example : ORD
     */
    ORIGIN_STATION_CODE("Origin"),
    /**
     * Represents the filter attribute QueueItemType. The Message Type can be Airway bill(A) Type : A Size : 1
     * Example : A
     */
    QUEUE_ITEM_TYPE("QueueItemType");

    /**
     * Attribute to hold the <code>value</code> property.
     */
    private String value;

    /**
     * <code>Parameterized Constructor.</code>
     * 
     * @param pValue <code>String</code><br>
     *            Contains the enum value.<br>
     */
    MessageFilterType(final String pValue) {
        this.value = pValue;
    }

    /**
     * Gets the key of the enum.
     * <p>
     * 
     * @param pValue <code>String</code><br>
     *            The value of the enumerated type.<br>
     *            </p>
     *            <p>
     * @return <code>QueueType</code><br>
     *         Returns the value.<br>
     *         </p>
     */

    public static MessageFilterType getKey(final String pValue) {
        MessageFilterType aMessageFilterType = null;

        for (final MessageFilterType aType : MessageFilterType.values()) {
            if (pValue.equals(aType.value())) {
                aMessageFilterType = aType;
                break;
            }
        }
        return aMessageFilterType;
    }

    /**
     * Gets the value of the enum constant.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the value.<br>
     *         </p>
     */
    public String getValue() {
        return this.value;
    }

    /**
     * This method gives the string format of queue type.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the enumerated value of the queue type.<br>
     */
    public String value() {
        return this.name();
    }
}
