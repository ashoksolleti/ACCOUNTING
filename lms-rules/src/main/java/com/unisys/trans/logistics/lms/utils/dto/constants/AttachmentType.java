/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto.constants;

public enum AttachmentType {

    /**
     * 'D' DunningLetter.
     */
    D("DunningLetter");

    /**
     * Attribute to hold <code>attachmentType</code>.
     */
    private final String attachmentType;

    /**
     * Constructor with <code>attachmentType</code> as an argument.
     * <p>
     * 
     * @param pattachmentType the new value of the <code>attachmentType</code>.<br>
     */
    AttachmentType(final String pAttachmentType) {
        this.attachmentType = pAttachmentType;
    }

    /**
     * Gets the <code>AttachmentType</code>.
     * <p>
     * 
     * @param pAttachmentType <code>AttachmentType</code><br>
     *            Contains the enum type.<br>
     *            </p>
     * @return Returns the avalue.
     */
    public static String getAttachmentType(final AttachmentType pAttachmentType) {

        String avalue = null;

        for (final AttachmentType aType : AttachmentType.values()) {

            if (pAttachmentType.equals(aType)) {
                avalue = aType.getAttachmentType();
                break;
            }
        }

        return avalue;

    }

    /**
     * Gets the value of the <code>ActionType</code> string.
     * <p>
     * 
     * @return the current value of <code>attachmentType</code>.
     */
    public String getActionType() {
        return this.attachmentType;
    }

    /**
     * Gets the value of the <code>attachmentType</code> string.
     * 
     * @return attachmentType
     */
    public String getAttachmentType() {
        return attachmentType;
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
