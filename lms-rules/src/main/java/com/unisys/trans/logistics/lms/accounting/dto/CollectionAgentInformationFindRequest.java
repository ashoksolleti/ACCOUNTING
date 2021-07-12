/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>CollectionAgentInformationFindRequest</code> class represents the request to find
 * CollectionAgentInformation details .
 * <p>
 * <code>CollectionAgentInformationFindRequest</code> contains the following attribute:
 * <ul>
 * <li>collectionID
 * <li>Name
 * <li>station
 * </ul>
 */
public class CollectionAgentInformationFindRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -8933454008877619984L;
    
    
    /**
     * Attribute to hold the collection information DTO.
     */
    private CollectionAgentInformationFindDto collectionAgentInformationFindDto;


    /**
     * Gets the <code>collectionAgentInformationFindDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>collectionAgentInformationFindDto</code> property.
     */
    public CollectionAgentInformationFindDto getCollectionAgentInformationFindDto() {
        return this.collectionAgentInformationFindDto;
    }


    /**
     * Sets the <code>pCollectionAgentInformationFindDto</code>.
     * <p>
     * 
     * @param pCollectionAgentInformationFindDto
     *            holds the new value of <code>collectionAgentInformationFindDto</code>
     */
    public void setCollectionAgentInformationFindDto(
                final CollectionAgentInformationFindDto pCollectionAgentInformationFindDto) {
        this.collectionAgentInformationFindDto = pCollectionAgentInformationFindDto;
    }
    
  

}
