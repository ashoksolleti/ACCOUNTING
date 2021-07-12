package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class CollectionAgentInformationPersistRequest extends AbstractRequest{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	  /**
     * Attribute to hold <code>participant</code> property.
     */
    private CollectionAgentInformationDto collectionAgentInfo;

    /**
     * <code>Default constructor</code>.
     * <p>
     */
    public CollectionAgentInformationPersistRequest() {

    }

    /**
     * Gets the <code>collectionAgentInfo</code> property.
     * <p>
     * 
     * @return the current value of the <code>collectionAgentInfo</code> property.
     */
    public CollectionAgentInformationDto getCollectionAgentInfo() {
        return this.collectionAgentInfo;
    }

    /**
     * Sets the <code>pCollectionAgentInfo</code>.
     * <p>
     * 
     * @param pCollectionAgentInfo
     *            holds the new value of <code>collectionAgentInfo</code>
     */
    public void setCollectionAgentInfo(final CollectionAgentInformationDto pCollectionAgentInfo) {
        this.collectionAgentInfo = pCollectionAgentInfo;
    }


   
	


  

}
