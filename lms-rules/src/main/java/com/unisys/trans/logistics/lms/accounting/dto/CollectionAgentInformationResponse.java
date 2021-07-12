/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class CollectionAgentInformationResponse extends AbstractResponse {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>collectionAgent Information</code> property.
     */
    private CollectionAgentInformationDto collectionAgentDto;
    
    /**
     * Attribute to hold <code>List collectionAgent Information</code> property.
     */    
    private List<CollectionAgentInformationDto> collectionAgentDtos;

  

    /**
     * Gets the <code>collectionAgentDtos</code> property.
     * <p>
     * 
     * @return the current value of the <code>collectionAgentDtos</code> property.
     */
    public List<CollectionAgentInformationDto> getCollectionAgentDtos() {
        return this.collectionAgentDtos;
    }

    /**
     * Sets the <code>pCollectionAgentDtos</code>.
     * <p>
     * 
     * @param pCollectionAgentDtos
     *            holds the new value of <code>collectionAgentDtos</code>
     */
    public void setCollectionAgentDtos(final List<CollectionAgentInformationDto> pCollectionAgentDtos) {
        this.collectionAgentDtos = pCollectionAgentDtos;
    }

    /**
     * <code>Default constructor</code>.
     * <p>
     */
    public CollectionAgentInformationResponse() {

    }

    /**
     * Gets the <code>collectionAgentDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>collectionAgentDto</code> property.
     */
    public CollectionAgentInformationDto getCollectionAgentDto() {
        return this.collectionAgentDto;
    }

    /**
     * Sets the <code>pCollectionAgentDto</code>.
     * <p>
     * 
     * @param pCollectionAgentDto
     *            holds the new value of <code>collectionAgentDto</code>
     */
    public void setCollectionAgentDto(final CollectionAgentInformationDto pCollectionAgentDto) {
        this.collectionAgentDto = pCollectionAgentDto;
    }

 

}
