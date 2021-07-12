/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto.constants;

/**
 * <code>QueueRestrictionType</code> class holds the Type of Queue.
 * <p>
 */
public enum QueueRestrictionType {

    /**
     * 'N' -Non-messaged.
     */
    N("Non Restricted"),

    /**
     * 'R' -Messaged.
     */
    R("Restricted");

    /**
     * Attribute to hold <code>queueRestrictionType</code>.
     */
    private final String queueRestrictionType;

    /**
     * Constructor with <code>queueRestrictionType</code> as an argument.
     * <p>
     * 
     * @param pQueueRestrictionType the new value of the <code>queueRestrictionType</code>.<br>
     */
    QueueRestrictionType(final String pQueueRestrictionType) {
        this.queueRestrictionType = pQueueRestrictionType;
    }

    /**
     * Gets the <code>QueueRestrictionType</code>.
     * <p>
     * 
     * @param pQueueRestrictionType <code>QueueRestrictionType</code><br>
     *            Contains the enum type.<br>
     *            </p>
     * @return Returns the avalue.
     */
    public static String getQueueRestrictionType(final QueueRestrictionType pQueueRestrictionType) {

        String avalue = null;

        for (final QueueRestrictionType aType : QueueRestrictionType.values()) {

            if (pQueueRestrictionType.equals(aType)) {
                avalue = aType.getQueueRestrictionType();
                break;
            }
        }

        return avalue;

    }

    /**
     * Gets the value of the <code>ActionType</code> string.
     * <p>
     * 
     * @return the current value of <code>queueRestrictionType</code>.
     */
    public String getActionType() {
        return this.queueRestrictionType;
    }

    /**
     * Gets the value of the <code>queueRestrictionType</code> string.
     * 
     * @return queueRestrictionType
     */
    public String getQueueRestrictionType() {
        return queueRestrictionType;
    }

    /**
     * The <code>value</code> method gives the restriction type of queue.
     * <p>
     * 
     * @return the enumerated value of the <code>queueRestrictionType</code>.
     */
    public String value() {
        return this.name();
    }
}
