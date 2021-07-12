/* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class AttachmentsDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 447110167079583152L;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>attachmentID</code> property.
     */

    private Long attachmentID;

    /**
     * Attribute to hold <code>attachmentType</code> property.
     */

    private String attachmentType;

    /**
     * Attribute to hold <code>attachment</code> property.
     */
    private byte[] attachment;
 

    /**
     * Gets the <code>attachmentID</code> property.
     * <p>
     * 
     * @return the current value of the <code>attachmentID</code> property.
     */
    public Long getAttachmentID() {
        return this.attachmentID;
    }

    /**
     * Sets the <code>pAttachmentID</code>.
     * <p>
     * 
     * @param pAttachmentID
     *            holds the new value of <code>attachmentID</code>
     */
    public void setAttachmentID(final Long pAttachmentID) {
        this.attachmentID = pAttachmentID;
    }

    /**
     * Gets the <code>attachmentType</code> property.
     * <p>
     * 
     * @return the current value of the <code>attachmentType</code> property.
     */
    public String getAttachmentType() {
        return this.attachmentType;
    }

    /**
     * Sets the <code>pAttachmentType</code>.
     * <p>
     * 
     * @param pAttachmentType
     *            holds the new value of <code>attachmentType</code>
     */
    public void setAttachmentType(final String pAttachmentType) {
        this.attachmentType = pAttachmentType;
    }

    /**
     * Gets the <code>attachment</code> property.
     * <p>
     * 
     * @return the current value of the <code>attachment</code> property.
     */
    public byte[] getAttachment() {
        return this.attachment;
    }

    /**
     * Sets the <code>pAttachment</code>.
     * <p>
     * 
     * @param pAttachment
     *            holds the new value of <code>attachment</code>
     */
    public void setAttachment(final byte[] pAttachment) {
        this.attachment = pAttachment;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return this.the current value of the <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

}
