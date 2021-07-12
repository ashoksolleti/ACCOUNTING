/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.dto.constants;

/**
 * <code>MessageType</code> enum maintains a list of component type constants pertaining to LMS module.
 */
public enum MessageType {
    /**
     * This is an enumerated action type constant to specify Message type.
     */
    TEXT;

    /**
     * Gets the <code>MessageType</code>.
     * <p>
     * 
     * @param pValue the new value of <code>MessageType</code>
     *            <p>
     * @return the current value of <code>MessageType</code>
     */
    public static MessageType fromValue(final String pValue) {
        return valueOf(pValue);
    }

    /**
     * Gets the <code>MessageType</code>.
     * <p>
     * 
     * @param pMessageType the new value of <code>MessageType</code>
     *            <p>
     * @return the current value of <code>MessageType</code>
     */
    public static MessageType getMessageType(final String pMessageType) {

        MessageType aMessageType = null;

        for (final MessageType aType : MessageType.values()) {

            if (pMessageType.equals(aType.value())) {
                aMessageType = aType;
                break;
            }
        }

        return aMessageType;

    }

    /**
     * Gives the string format of enumerated <code>MessageType</code>.
     * <p>
     * 
     * @return the current value of the <code>MessageType</code>
     */
    public String value() {
        return this.name();
    }

}
