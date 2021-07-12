package com.unisys.trans.logistics.lms.utils.dto;




import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class AttachmentsFindRequest extends AbstractRequest {

    /**
     * 
     */
    private static final long serialVersionUID = 2995052769431191044L;
    
    
    /**
     * Attribute to hold the attachment information DTO.
     */
    private Long attachmentID;
    
    
    /**
     * Attribute to hold the List<AttachmentOID>
     */
    private List<Long> attachmentsID;


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
     * Gets the <code>attachmentsID</code> property.
     * <p>
     * 
     * @return the current value of the <code>attachmentsID</code> property.
     */
    public List<Long> getAttachmentsID() {
        return this.attachmentsID;
    }


    /**
     * Sets the <code>pAttachmentsID</code>.
     * <p>
     * 
     * @param pAttachmentsID
     *            holds the new value of <code>attachmentsID</code>
     */
    public void setAttachmentsID(final List<Long> pAttachmentsID) {
        this.attachmentsID = pAttachmentsID;
    }
        

}
