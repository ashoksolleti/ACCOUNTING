package com.unisys.trans.logistics.lms.parts.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class ParticipantCreditResponse extends AbstractResponse {
	
	  /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -8305955872963878036L;
    
    /**
     * <code>Default constructor.</code>
     */
    public ParticipantCreditResponse(){
  
    }
    
    /**
     * Attribute to hold <code>creditInfoRecord</code> property.
     */
    private CreditInfoRecordDto creditInfoRecord;
    /**
     * Gets the <code>creditInfoRecord</code> property.
     * 
     * @return the current value of <code>creditInfoRecord</code> property.<br>
    */
	public CreditInfoRecordDto getCreditInfoRecord() {
		return creditInfoRecord;
	}
	 /**
     * Sets the <code>creditInfoRecord</code> property.
     * 
     * @param pCreditInfoRecord
     *            the current value of <code>creditInfoRecord</code> property.<br>
     */
	public void setCreditInfoRecord(final CreditInfoRecordDto pCreditInfoRecord) {
		this.creditInfoRecord = pCreditInfoRecord;
	}

	
    
}
