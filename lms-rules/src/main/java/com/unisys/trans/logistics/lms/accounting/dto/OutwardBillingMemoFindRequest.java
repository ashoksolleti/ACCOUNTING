package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.accounting.dto.constants.MemoType;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class OutwardBillingMemoFindRequest extends AbstractRequest {

    /**
     * 
     */
    private static final long serialVersionUID = 2235593937987275378L;

    /**
     * Attribute to hold <code>interlineInwardFindDto</code> property.
     */
    private OutwardBillingMemoFindDto billingMemoFindDto;

    /**
     * Attribute to hold <code>memoType</code> property.
     */
    private MemoType memoType;
    
    private boolean remoteRequest = false;

    /**
     * Gets the <code>interlineInwardFindDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>interlineInwardFindDto</code> property.
     */
   

    /**
     * Gets the <code>memoType</code> property.
     * <p>
     * 
     * @return the current value of the <code>memoType</code> property.
     */
    public MemoType getMemoType() {
        return this.memoType;
    }

    /**
     * Sets the <code>interlineInwardFindDto</code> property.
     * <p>
     * 
     * @param pInterlineInwardFindDto
     *            the current value of the <code>interlineInwardFindDto</code> property.
     */
   
    /**
     * Sets the <code>memoType</code> property.
     * <p>
     * 
     * @param pMemoType
     *            the current value of the <code>memoType</code> property.
     */
    public void setMemoType(final MemoType pMemoType) {
        this.memoType = pMemoType;
    }

	/**
	 * @return the billingMemoFindDto
	 */
	public OutwardBillingMemoFindDto getBillingMemoFindDto() {
		return billingMemoFindDto;
	}

	/**
	 * @param billingMemoFindDto the billingMemoFindDto to set
	 */
	public void setBillingMemoFindDto(OutwardBillingMemoFindDto billingMemoFindDto) {
		this.billingMemoFindDto = billingMemoFindDto;
	}

	public boolean isRemoteRequest() {
		return remoteRequest;
	}

	public void setRemoteRequest(boolean remoteRequest) {
		this.remoteRequest = remoteRequest;
	}

}
