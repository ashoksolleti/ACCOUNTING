//* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.AttachmentDeleteRequest;
import com.unisys.trans.logistics.lms.utils.dto.AttachmentPersistRequest;
import com.unisys.trans.logistics.lms.utils.dto.AttachmentsFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.AttachmentsResponse;

public interface AttachmentService {

    /**
     * This method is used to retrieve the list of attachments
     * 
     * @return AttachmentsDto
     * @throws LMSException
     */
    AttachmentsResponse retrieveAttachments(AttachmentsFindRequest pAttachmentsFindRequest) throws LMSException;
    
    /**
     * This method is to persist the attachment details.
     * @param pAttachmentPersistRequest
     * @throws LMSException
     */
    void create(AttachmentPersistRequest pAttachmentPersistRequest) throws LMSException;
    
    /**
     * This method is used to retrieve the list of attachments by credit
     * 
     * @return AttachmentsDto
     * @throws LMSException
     */
    AttachmentsResponse retrieveAttachmentsList(AttachmentsFindRequest pAttachmentsFindRequest) throws LMSException;
    
    /**
     * This method is to persist the attachment details.
     * @param pAttachmentPersistRequest
     * @throws LMSException
     */
    void delete(AttachmentDeleteRequest pAttachmentDeleteRequest) throws LMSException;
    
    
    
}
