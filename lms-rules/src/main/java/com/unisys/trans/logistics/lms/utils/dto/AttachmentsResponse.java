//* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class AttachmentsResponse extends AbstractResponse {
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    /**
     * Attribute to hold <code>List collectionAgent Information</code> property.
     */    
    private List<AttachmentsDto> attachmentsListDtos;
    
    
    /**
     * Attribute to hold <code>List collectionAgent Information</code> property.
     */    
    private AttachmentsDto attachmentsDtos;


    /**
     * Gets the <code>attachmentsListDtos</code> property.
     * <p>
     * 
     * @return the current value of the <code>attachmentsListDtos</code> property.
     */
    public List<AttachmentsDto> getAttachmentsListDtos() {
        return this.attachmentsListDtos;
    }


    /**
     * Sets the <code>pAttachmentsListDtos</code>.
     * <p>
     * 
     * @param pAttachmentsListDtos
     *            holds the new value of <code>attachmentsListDtos</code>
     */
    public void setAttachmentsListDtos(final List<AttachmentsDto> pAttachmentsListDtos) {
        this.attachmentsListDtos = pAttachmentsListDtos;
    }


    /**
     * Gets the <code>attachmentsDtos</code> property.
     * <p>
     * 
     * @return the current value of the <code>attachmentsDtos</code> property.
     */
    public AttachmentsDto getAttachmentsDtos() {
        return this.attachmentsDtos;
    }


    /**
     * Sets the <code>pAttachmentsDtos</code>.
     * <p>
     * 
     * @param pAttachmentsDtos
     *            holds the new value of <code>attachmentsDtos</code>
     */
    public void setAttachmentsDtos(final AttachmentsDto pAttachmentsDtos) {
        this.attachmentsDtos = pAttachmentsDtos;
    }


 





}
