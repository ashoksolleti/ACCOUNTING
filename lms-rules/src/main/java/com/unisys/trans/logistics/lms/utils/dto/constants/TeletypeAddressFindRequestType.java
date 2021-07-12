/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto.constants;

/**
 * <code>TeletypeAddressFindRequestType</code> defines the possible values for find indicator in
 * <code>TeletyeAddressFindRequest</code>.<br>
 * Following are the Valid values are:<br>
 * <ul>
 * <li>MESSAGE_LINK - Find by Message Link indicator.</li>
 * <li>PARTICIPANT - Find by Participant indicator.</li>
 * <li>TELETYPE_ADDRESS - Find by TTY/TPR Address indicator.</li>
 * </ul>
 */
public enum TeletypeAddressFindRequestType {
    /**
     * Find by Message Link indicator.
     */
    MESSAGE_LINK,
    /**
     * Find by Participant indicator.
     */
    PARTICIPANT,
    /**
     * Find by TTY/TPR Address indicator.
     */
    TELETYPE_ADDRESS
}