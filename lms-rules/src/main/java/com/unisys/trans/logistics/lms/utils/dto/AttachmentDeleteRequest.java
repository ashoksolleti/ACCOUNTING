//* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class AttachmentDeleteRequest extends AbstractRequest {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    
    private Long attachmentID;


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
    
    
    

}
