//* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.BatchResponse;


public class CollectionAlertResponse extends BatchResponse {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    
    
    /**
     * Attribute to hold the CollectionAlertDto
     */
    private CollectionAlertDto collectionAlertDto;



    /**
     * Gets the <code>collectionAlertDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>collectionAlertDto</code> property.
     */
    public CollectionAlertDto getCollectionAlertDto() {
        return this.collectionAlertDto;
    }



    /**
     * Sets the <code>pCollectionAlertDto</code>.
     * <p>
     * 
     * @param pCollectionAlertDto
     *            holds the new value of <code>collectionAlertDto</code>
     */
    public void setCollectionAlertDto(final CollectionAlertDto pCollectionAlertDto) {
        this.collectionAlertDto = pCollectionAlertDto;
    }
}
    
    
    
    
