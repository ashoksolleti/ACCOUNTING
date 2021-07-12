/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.constants;

/**
 * <code>HistoryRecordingType</code> class holds the HistoryRecordingType constants.
 * <p>
 */
public enum HistoryRecordingType {
    /**
     * Holds the RecordingType 'Complete'.
     */
    COMPLETE,

    /**
     * Holds the RecordingType 'Difference'.
     */
    DIFFERENCE;

    /**
     * The <code>value</code> method returns the HistoryRecordingType String.
     * <p>
     * 
     * @return the enumerated value of the HistoryRecordingType.
     */
    public String value() {
        return this.name();
    }
}
