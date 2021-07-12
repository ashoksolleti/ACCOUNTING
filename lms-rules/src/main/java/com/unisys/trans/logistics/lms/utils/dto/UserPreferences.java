/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.io.Serializable;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.exception.CodeMessage;

/**
 * <code>UserPreferences</code> class contain information specific to a
 * UserPreferences.<br>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>ListOfColumns
 * <li>alertMessage
 * </code>
 * </ul>
 */
public class UserPreferences implements Serializable {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 8886287076019786299L;

    /**
     * Attribute to hold <code>alertMessage</code> property.
     */
    private List<CodeMessage> alertMessage;

    /**
     * Attribute to hold <code>ListOfColumns</code> property.
     */
    private List<UserPreferenceColumnDto> listOfColumns;

    /**
     * Gets the <code>alertMessage</code> property.
     * <p>
     * 
     * @return the current value of the <code>alertMessage</code> property.
     */
    public List<CodeMessage> getAlertMessage() {
        return this.alertMessage;
    }

    /**
     * Gets the <code>ListOfColumns</code> property.
     * <p>
     * 
     * @return the current value of the <code>ListOfColumns</code> property.
     */
    public List<UserPreferenceColumnDto> getListOfColumns() {
        return this.listOfColumns;
    }

    /**
     * Sets the <code>alertMessage</code> property.
     * <p>
     * 
     * @param pAlertMessage
     *            the new value of the <code>alertMessage</code> property.<br>
     */
    public void setAlertMessage(final List<CodeMessage> pAlertMessage) {
        this.alertMessage = pAlertMessage;
    }

    /**
     * Sets the <code>ListOfColumns</code> property.
     * <p>
     * 
     * @param pListOfColumns
     *            the new value of the <code>ListOfColumns</code> property.<br>
     */
    public void setListOfColumns(
                final List<UserPreferenceColumnDto> pListOfColumns) {
        this.listOfColumns = pListOfColumns;
    }

}
