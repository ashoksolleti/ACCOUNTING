//@formatter:off
/* ====================================== */
/* Copyright(c) 2015 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.framework.constants;

/**
 * <code>BookingCreationSource</code> class maintains a list of source type of booking creation.
 * <p>
 * 
 */
public enum BookingCreationSourceType {

    E("Enterprise Services"),
    F("FFR"),
    P("Portal"),
    I("Client Services"),
    X("GF-X"),
    W("XFFR"),
    G("LMS UI"),
    A("Airline Portal");

    /**
     * Attribute to hold <code>bookingCreationSourceType</code> .
     */
    private String bookingCreationSourceType;

    /**
     * Constructor with <code>BookingCreationSourceType</code> as an argument.
     * <p>
     * 
     * @param pBookingCreationSourceType
     *            the new value of the <code>bookingCreationSourceType</code> .
     */
    private BookingCreationSourceType(final String pBookingCreationSourceType) {
        this.bookingCreationSourceType = pBookingCreationSourceType;
    }

    /**
     * Gets the <code>BookingCreationSource</code>.
     * <p>
     * 
     * @param pExportPaymentType
     *            the pBookingCreationSourceType value of <code>ExportPaymentType</code>.
     *            <p>
     * @return the current value of <code>ExportPaymentType</code>.
     */
    public static String getBookingCreationSource(final String pBookingCreationSourceType) {

        String aBookingCreationSource = null;

        for (final BookingCreationSourceType aType : BookingCreationSourceType.values()) {

            if (pBookingCreationSourceType.equals(aType.name())) {
                aBookingCreationSource = aType.value();
                break;
            }
        }

        return aBookingCreationSource;

    }

    public String getBookingCreationSourceType() {
        return bookingCreationSourceType;
    }
    
    /**
     * Gives the string format of <code>BookingCreationSourceType</code>.
     * <p>
     * 
     * @return the enumerated value of the <code>BookingCreationSourceType</code>.<br>
     */
    public String value() {
        return this.bookingCreationSourceType;
    }

}
