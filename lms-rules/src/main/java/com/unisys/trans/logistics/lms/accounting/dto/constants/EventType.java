//@formatter:off
/* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.accounting.dto.constants;



/**
 * <code>EventType</code> holds the constants to indicate Event type
 * applied.
 * <p>
 * Following are the possible Event type:<br>
 * <ul>
 * <li>AIRWAYBILL
 * </ul>
 */
public enum EventType {
    ACCNT_AWB_CREATION("ACCOUNTING_AIRWAYBILL_CREATION"),
    ACCNT_AWB_DELETION("ACCOUNTING_AIRWAYBILL_DELETION"),
    ACTUAL_FLOWN("ACTUALFLOWN"),
    AWBDETAIL("AIRWAYBILLDETAIL"),
    AWBPARTICIPANT("AIRWAYBILLPARTICIPANT"),
    AWBROUTE("AIRWAYBILLROUTE"),
    BKNGSEGMENT("BOOKINGROUTE"),
    ACTUAL_ROUTE("ACTUALROUTE"),
    RATING_LINE("RATINGLINE"),
    OTHER_CHARGES("OTHERCHARGE"),
    SPLHANDLINGCODE("SPECIALHANDLINGCODE"),
    ACCNT_STATUS("ACCOUNTINGSTATUS"),
    PAR_PAYABLE_CREATION("PARTICIPANT_PAYABLE_CREATION"),
    PAR_PAYABLE_DELETION("PARTICIPANT_PAYABLE_DELETION"),
    MANUAL_AUDIT("MANUALAUDIT"),
    MANUAL_AUDIT_CREATION("MANUALAUDITCREATION"),
    PAR_PAYABLE_AGENT("AGENT"),
    PAR_PAYABLE_GLOBAL_SALES_AGENT("GLOBALSALESAGENT"),
    PAR_PAYABLE_GROUND_HANDLING_AGENT("GROUND_HANDLING_AGENT"),
    PAR_PAYABLE_PICK_UP("PICKUPOPERATOR"),
    PAR_PAYABLE_DELIVERY("DELIVERYOPERATOR"),
    PAR_RECEIVABLE_CREATION("PARTICIPANT_RECEIVABLE_CREATION"),
    PAR_PREPAID_RECEIVABLE("Prepaid Receivable"),
    PAR_COLLECT_RECEIVABLE("Collect Receivable"),
    CARR_PAYABLE_CREATION("CARRIER_PAYABLE_CREATION"),
    CARR_PAYABLE_UPDATE("CARRIER_PAYABLE_UPDATE"),
    CARR_RECEIVABLE_CREATION("CARRIER_RECEIVABLE_CREATION"),
    REV_CALC_CREATION("REV_CALCULATION_CREATION"),
    INTERLINE_PRORATION("INTERLINEPRORATION"),
    AIRWAYBILLHOSTREVENUE("AIRWAYBILLHOSTREVENUEEVENT"),
    ONLINE_PRORATION("ONLINEPRORATION"),
    BOOKING_EVENT("BOOKINGEVENT"),
    CARR_RECEIVABLE_UPDATE("CARRIER_RECEIVABLE_UPDATE"),
    OTHER_CHARGES_AGENT_CARRIER("Other Charge for Agent and Carrier"),
    TOTAL_CHARGES("TOTALCHARGES"),
    BOOKING_EVENT_CREATION("BOOKINGEVENTCREATION"),
    AIRWAYBILL_EVENT_CREATION("AIRWAYBILLEVENTCREATION"),
    CRA_STATUS("CRASTATUS"),
    AWB_PURGE("AIRWAYBILLPURGE"),
    WEIGHT_CHARGES("WEIGHTCHARGES"),
    DIMENSIONAL_WEIGHT_CHARGES("DIMENSIONALWEIGHTCHARGES"),
    RATING_LINE_DIMENSIONALWEIGHT("RATINGLINEFORDIMENSIONIONALWEIGHT"),
    AWB_ONHOLD("AIRWAYBILLONHOLD"),
    RM_ONHOLD("REJECTIONMEMOONHOLD"),
    AUDIT_STATUS_CHANGE("AUDITSTATUSCHANGE");
 

    
    /**
     * Attribute to hold the <code>event</code> property.
     */
    private String event;

   



    /**
     * @return the event
     */
    public String getEvent() {
        return this.event;
    }



    /**
     * @param event the event to set
     */
    public void setEvent(final String pEvent) {
        this.event = pEvent;
    }



    /**
     * Parameterize constructor.
     * 
     * @param pPad
     *            the value.
     */
    EventType(final String pEvent) {
        this.event = pEvent;
    }

    

    /**
     * Gives the string format of enumerated <code>EventType</code>.
     * <p>
     * 
     * @return the current string value of the <code>EventType</code>.
     */
    public String value() {
        return this.name();
    }

    /**
     *Gets the <code>EventType</code>. <p>
     * 
     * @param pEventType holds the new value of <code>EventType</code>
     * <p>
     * 
     * @return the current value of <code>EventType</code>
     */
    public static EventType getEventType(final String pEventType) {

        EventType aMatchedEventType = null;

        for (final EventType aType : EventType.values()) {

            if (pEventType.equals(aType.getEvent())) {
                aMatchedEventType = aType;
                break;
            }
        }

        return aMatchedEventType;

    }
}
