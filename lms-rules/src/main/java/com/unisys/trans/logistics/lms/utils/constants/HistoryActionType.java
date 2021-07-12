/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.constants;

/**
 * <code>HistoryActionType</code> class holds the HistoryActionType constants.
 * <p>
 */
public enum HistoryActionType {

    /**
     * 'ADD' - Add status of history.
     */
    ADD("ADD"),

    /**
     * 'DEL' - Delete status of history.
     */
    DELETE("DEL"),

    /**
     * 'UPD' - Update status of history.
     */
    UPDATE("UPD");

    /**
     * Attribute to hold the history <code>actionType</code>.
     */
    private final String actionType;

    /**
     * Constructor with <code>actionType</code> as an argument.
     * <p>
     * 
     * @param pActionType the new value of the <code>actionType</code>.<br>
     */
    HistoryActionType(final String pActionType) {
        this.actionType = pActionType;
    }

    /**
     * Gets the value of the <code>actionType</code> string.
     * <p>
     * 
     * @return the current value of <code>actionType</code>.
     */
    public String getActionType() {
        return this.actionType;
    }

    /**
     * The <code>value</code> method gives the string format of history action type.
     * <p>
     * 
     * @return the enumerated value of the <code>actionType</code>.
     */
    public String value() {
        return this.name();
    }
}
