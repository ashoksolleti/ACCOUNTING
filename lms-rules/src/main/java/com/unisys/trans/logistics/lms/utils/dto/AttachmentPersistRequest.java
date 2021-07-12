package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>AttachmentPersistRequest</code> class represents the request to create
 * the Attachment Details information.
 * <p>
 * <code>AttachmentPersistRequest</code> holds the following attribute:
 * <ul>
 * <code>
 * <li>attachmentsDto</li>
 * </code>
 * </ul>
 */

public class AttachmentPersistRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold AttachmentsDto.
     */
    private AttachmentsDto attachmentsDto;

    /**
     * Default constructor.
     */
    public AttachmentPersistRequest() {

    }

    /**
     * Gets the <code>attachmentsDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>attachmentsDto</code> property.
     */
    public AttachmentsDto getAttachmentsDto() {
        return this.attachmentsDto;
    }

    /**
     * Sets the <code>pAttachmentsDto</code>.
     * <p>
     * 
     * @param pAttachmentsDto
     *            holds the new value of <code>attachmentsDto</code>
     */
    public void setAttachmentsDto(final AttachmentsDto pAttachmentsDto) {
        this.attachmentsDto = pAttachmentsDto;
    }

}
