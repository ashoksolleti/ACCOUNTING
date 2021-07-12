/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.dto.constants;

/**
 * <code>HistoryRateType</code> holds the constants to indicate history rate type
 * applied.
 * <p>
 * Following are the possible HistoryRateType type:<br>
 * <ul>
 * <li>1 - CONTRACT
 * <li>2 - SPOTRATE
 * <li>3 - TARIFFRATEOANDD
 * </ul>
 */

public enum HistoryRateType {

    /**
     * Constant used for Zone 1.
     */

    CONTRACT(1),

    /**
     * Constant used for Zone 2.
     */

    SPOTRATE(2),

    /**
     * Constant used for Zone 3.
     */

    TARIFFRATEOANDD(3);

    /**
     * Attribute to hold the <code>historyRateType</code> property.
     */

    private Integer historyRateType;

    /**
     * Parameterize constructor.
     * 
     * @param pHistoryRateType
     *            the value.
     */

    HistoryRateType(final Integer pHistoryRateType) {
        this.setHistoryRateType(pHistoryRateType);
    }

    /**
     * Gets the historyRateType.
     * <p>
     * 
     * @return the current value of <code>historyRateType</code> property.<br>
     */

    public Integer getHistoryRateType() {
        return this.historyRateType;
    }

    /**
     * Sets the historyRateType.
     * <p>
     * 
     * @param pHistoryRateType
     *            the current value of <code>historyRateType</code> property.<br>
     */

    public void setHistoryRateType(final Integer pHistoryRateType) {
        this.historyRateType = pHistoryRateType;
    }

}
