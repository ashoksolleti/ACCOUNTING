/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.constants;

/**
 * <code>CommunicationType</code> class holds the HistoryCommunication type constants.
 * <p>
 */
public enum HistoryCommunicationType {

    /**
     * Holds the Asynchronous communication type of history.
     */
    ASYNCHRONOUS,

    /**
     * Holds the synchronous communication type of history.
     */
    SYNCHRONOUS;

    /**
     * The <code>value</code> method returns the communicationType String.
     * <p>
     * 
     * @return the enumerated value of the communicationType.
     */
    public String value() {
        return this.name();
    }
}
