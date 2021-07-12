package com.unisys.trans.logistics.lms.framework.dto.constants;

/**
 * <code>BookingSegmentQueueType</code> holds the constants to indicate
 * MCTStatusTypeBookingSegmentQueueType applied.
 * <p>
 * Following are the possible BookingSegmentQueueType:<br>
 * <ul>
 * <li>FORCE_QUEUED_FCTL
 * <li>PLACED_ON_FCTL_QUEUE
 * <li>MESSAGE_NEEDS_TO_BE_POSTED_AND_QUEUED
 * <li>MESSAGE_ADDED_AND_QUEUED_TO_REPLY_QUEUE
 * <li>SPECIAL_HANDLING_CODE_REQUIRES_FCTL_APPROVAL
 * </ul>
 * **/

public enum BookingSegmentQueueType {
    /**
     * This is an enumerated BookingSegmentQueueType constant to specify booking segment queue type -
     * FORCE_QUEUED_FCTL
     * V enum constant returns the value 'FORCE_QUEUED_FCTL'.
     * <p>
     * value = {@value}
     */
    FORCE_QUEUED_FCTL("V"),
    /**
     * This is an enumerated BookingSegmentQueueType constant to specify booking segment queue type -
     * MESSAGE_ADDED_AND_QUEUED_TO_REPLY_QUEUE
     * Y enum constant returns the value 'MESSAGE_ADDED_AND_QUEUED_TO_REPLY_QUEUE'.
     * <p>
     * value = {@value}
     */
    MESSAGE_ADDED_AND_QUEUED_TO_REPLY_QUEUE("Y"),
    /**
     * This is an enumerated BookingSegmentQueueType constant to specify booking segment queue type -
     * MESSAGE_NEEDS_TO_BE_POSTED_AND_QUEUED
     * X enum constant returns the value 'MESSAGE_NEEDS_TO_BE_POSTED_AND_QUEUED'.
     * <p>
     * value = {@value}
     */
    MESSAGE_NEEDS_TO_BE_POSTED_AND_QUEUED("X"),
    /**
     * This is an enumerated BookingSegmentQueueType constant to specify booking segment queue type -
     * PLACED_ON_FCTL_QUEUE
     * W enum constant returns the value 'PLACED_ON_FCTL_QUEUE'.
     * <p>
     * value = {@value}
     */
    PLACED_ON_FCTL_QUEUE("W"),
    /**
     * This is an enumerated BookingSegmentQueueType constant to specify booking segment queue type -
     * SPECIAL_HANDLING_CODE_REQUIRES_FCTL_APPROVAL
     * Z enum constant returns the value 'SPECIAL_HANDLING_CODE_REQUIRES_FCTL_APPROVAL'.
     * <p>
     * value = {@value}
     */
    SPECIAL_HANDLING_CODE_REQUIRES_FCTL_APPROVAL("Z");

    /**
     * Attribute to holds <code> bookingSegmentQueueType</code> property.
     */
    private String bookingSegmentQueueType;

    /**
     * Constructor with BookingSegmentQueueType as an argument.
     * <p>
     * 
     * @param pBookingSegmentQueueType
     *            Holds the BookingSegmentQueueType.
     */
    BookingSegmentQueueType(final String pBookingSegmentQueueType) {
        this.bookingSegmentQueueType = pBookingSegmentQueueType;
    }

    /**
     * Gets the value of the BookingSegmentQueueType property.
     * 
     */

    public String getBookingSegmentQueueType() {
        return this.bookingSegmentQueueType;
    }

    /**
     * Sets the value of the BookingSegmentQueueType property.
     * 
     * @param pBookingSegmentQueueType
     * 
     */

    public void setBookingSegmentQueueType(final String pBookingSegmentQueueType) {
        this.bookingSegmentQueueType = pBookingSegmentQueueType;
    }

    /**
     * Gives the string format of enumerated <code>BookingSegmentQueueType</code>.
     * <p>
     * 
     * @return the current string value of the <code>BookingSegmentQueueType</code>.
     */
    public String value() {
        return this.bookingSegmentQueueType;
    }
}
