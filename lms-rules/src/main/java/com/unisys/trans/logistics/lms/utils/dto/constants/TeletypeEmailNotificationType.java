/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto.constants;

/**
 * <code>TeletypeEmailNotificationIndicator</code> defines the valid values of Email Notification indicator
 * for Teletype Address Profile Information.<br>
 * Following are the valid values:<br>
 * <ul>
 * <li>S - Standard Email Notification (plain text e-mail).</li>
 * <li>E - Enhanced Email Notification.</li>
 * </ul>
 */
public enum TeletypeEmailNotificationType {
    /**
     * E - Enhanced Email Notification.
     */
    ENHANCED_EMAIL_NOTIFICATION("E"),

    /**
     * S - Standard Email Notification (plain text e-mail).
     */
    STANDARD_EMAIL_NOTIFICATION("S");

    private String ttyEmailNotificationIndicatorCode;

    /**
     * Constructor with email indicator code as an argument.
     * <p>
     * 
     * @param pTtyEmailNotificationIndicatorCode <code>String</code><br>
     *            Holds the email indicator code.<br>
     */
    private TeletypeEmailNotificationType(final String pTtyEmailNotificationIndicatorCode) {
        this.ttyEmailNotificationIndicatorCode = pTtyEmailNotificationIndicatorCode;
    }

    /**
     * Gets <code>TeletypeEmailNotificationIndicator</code> enum from the enum value.
     * <p>
     * 
     * @param pValue <code>String</code><br>
     *            Contains the enum value.<br>
     *            </p>
     * @return <code>{@link com.unisys.trans.logistics.lms.utils.dto.constants.TeletypeEmailNotificationType TeletypeEmailNotificationType}</code>
     * <br>
     *         Returns the Network type.<br>
     */
    public static TeletypeEmailNotificationType getTeletypeEmailNotificationIndicatorFromValue(
                final String pValue) {
        TeletypeEmailNotificationType aKey = null;
        for (final TeletypeEmailNotificationType anIndicator : TeletypeEmailNotificationType.values()) {
            if (anIndicator.value().equals(pValue)) {
                aKey = anIndicator;
                break;
            }
        }
        return aKey;
    }

    /**
     * Returns the value of the <code>TeletypeEmailNotificationIndicator</code> enum.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the value of the <code>TeletypeEmailNotificationIndicator</code> enum.<br>
     */
    public String value() {
        return this.ttyEmailNotificationIndicatorCode;
    }
}