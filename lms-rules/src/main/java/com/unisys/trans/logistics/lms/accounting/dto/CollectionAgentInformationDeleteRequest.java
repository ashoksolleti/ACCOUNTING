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
public class CollectionAgentInformationDeleteRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -8933454008877619984L;
    
   
    /**
     * Attribute to hold CollectionAgent Domain.
     */
    private CollectionAgentInformationDto collectionAgentInformationDto;
    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;
    
    /**
     * <code>Default constructor.</code>
     */
    public CollectionAgentInformationDeleteRequest() {

    }
    
    
    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    public Long getoId() {
        return this.oId;
    }

    /**
     * Sets the <code>pOId</code>.
     * <p>
     * 
     * @param pOId
     *            holds the new value of <code>oId</code>
     */
    public void setoId(final Long pOId) {
        this.oId = pOId;
    }


    /**
     * Gets the <code>collectionAgentInformationDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>collectionAgentInformationDto</code> property.
     */
    public CollectionAgentInformationDto getCollectionAgentInformationDto() {
        return this.collectionAgentInformationDto;
    }


    /**
     * Sets the <code>pCollectionAgentInformationDto</code>.
     * <p>
     * 
     * @param pCollectionAgentInformationDto
     *            holds the new value of <code>collectionAgentInformationDto</code>
     */
    public void setCollectionAgentInformationDto(final CollectionAgentInformationDto pCollectionAgentInformationDto) {
        this.collectionAgentInformationDto = pCollectionAgentInformationDto;
    }


}
