package com.unisys.trans.logistics.lms.parts.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class ParticipantCreditPersistRequest extends AbstractRequest{
	
	 /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -1153605016888086827L;

    /**
     * <code>Default constructor.</code>
     */
    public ParticipantCreditPersistRequest() {

    	
    }
    
    /**
     * Attribute to hold <code>creditInfoRecordDto</code> property.
     */
    private CreditInfoRecordDto creditInfoRecordDto;
    
    /**
     * Gets the <code>creditInfoRecordDto</code> property.
     * 
     * @return the current value of <code>creditInfoRecordDto</code> property.<br>
    */
	public CreditInfoRecordDto getCreditInfoRecordDto() {
		return creditInfoRecordDto;
	}

	 /**
     * Sets the <code>creditInfoRecordDto</code> property.
     * 
     * @param pCreditInfoRecordDto
     *            the current value of <code>creditInfoRecordDto</code> property.<br>
     */
	public void setCreditInfoRecordDto(final CreditInfoRecordDto pCreditInfoRecordDto) {
		this.creditInfoRecordDto = pCreditInfoRecordDto;
	}
    
    

}
