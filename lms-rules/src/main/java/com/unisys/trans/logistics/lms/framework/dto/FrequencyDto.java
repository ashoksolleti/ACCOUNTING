package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;

/**
 * <code>FrequencyDto</code> contains specific data applicable to the flight.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>daysOfOperation
 * </code>
 * </ul>
 */
public class FrequencyDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -8178615839449932420L;

    /**
     * Attribute to hold <code>daysOfOperation</code> property.
     */
    private String daysOfOperation;

    /**
     * Gets the <code>daysOfOperation</code> property.
     * <p>
     * Days of Operation of the flight in this date range.
     * <p>
     * <b>Format: </b><br>
     * 7 Alphanumeric.
     * <p>
     * <b>Example: </b><br>
     * 123
     * <p>
     * 
     * @return the current value of the <code>daysOfOperation</code> property.
     */
    public String getDaysOfOperation() {
        return this.daysOfOperation;
    }

    /**
     * Sets the <code>daysOfOperation</code> property.
     * <p>
     * Days of Operation of the flight in this date range
     * <p>
     * <b>Format: </b><br>
     * 7 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * 123
     * <p>
     * 
     * @param pDaysOfOperation the current value of the <code>daysOfOperation</code> property.
     */
    public void setDaysOfOperation(final String pDaysOfOperation) {
        this.daysOfOperation = pDaysOfOperation;
    }

}
