//@formatter:off
/* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.framework.constants;

/**
 * <code>PharmaEventType</code> holds the constants to indicate PharmaEvent type applied.
 * <p>
 * Following are the possible AuditStatus type:<br>
 * <ul>
 * <li>ACCEPTANCE
 * <li>WAREHOUSE
 * <li>CHECKIN
 * </ul>
 */
public enum PharmaEventType {

    /**
     * Constant used for Acceptance.
     */
    ACCEPTANCE("Acceptance"),

    /**
     * Constant used for Warehouse.
     */
    WAREHOUSE("Warehouse"),

    /**
     * Constant used for Check in.
     */
    CHECKIN("Check-In");

    /**
     * Attribute to hold the <code>pharmaEvent</code> property.
     */
    private String pharmaEvent;

    /**
     * Parameterize constructor.
     * 
     * @param pPharmaEvent
     *            the value.
     */
    PharmaEventType(final String pPharmaEvent) {
        this.pharmaEvent = pPharmaEvent;
    }

    /**
     * @return the pharmaEvent
     */
    public String getPharmaEvent() {
        return pharmaEvent;
    }

    /**
     * Gives the string format of enumerated <code>PharmaEventType</code>.
     * <p>
     * 
     * @return the current string value of the <code>PharmaEventType</code>.
     */
    public String value() {
        return this.name();
    }
    
    public static PharmaEventType getPharmaEventType(final String pValue) {
        PharmaEventType pharmaEventType = null;
        for(PharmaEventType pharmaEvent : PharmaEventType.values()) {
            if(pValue.equalsIgnoreCase(pharmaEvent.getPharmaEvent()) || pharmaEvent.getPharmaEvent().startsWith(pValue)) {
                pharmaEventType = pharmaEvent;
                break;
            }
        }
        return pharmaEventType;
                    
    }
}
