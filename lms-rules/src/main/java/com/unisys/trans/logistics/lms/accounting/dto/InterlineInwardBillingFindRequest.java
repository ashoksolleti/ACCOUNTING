package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.accounting.dto.constants.MemoType;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class InterlineInwardBillingFindRequest extends AbstractRequest {

    /**
     * 
     */
    private static final long serialVersionUID = 2235593937987275378L;

    /**
     * Attribute to hold <code>interlineInwardFindDto</code> property.
     */
    private InterlineInwardBillingFindDto interlineInwardFindDto;
    
    private String invoiceCarrier;
    
    private Date executionDate;

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
    public InterlineInwardBillingFindDto getInterlineInwardFindDto() {
        return this.interlineInwardFindDto;
    }

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
    public void setInterlineInwardFindDto(final InterlineInwardBillingFindDto pInterlineInwardFindDto) {
        this.interlineInwardFindDto = pInterlineInwardFindDto;
    }

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

	public boolean isRemoteRequest() {
		return remoteRequest;
	}

	public void setRemoteRequest(boolean remoteRequest) {
		this.remoteRequest = remoteRequest;
	}

	public String getInvoiceCarrier() {
		return invoiceCarrier;
	}

	public void setInvoiceCarrier(String invoiceCarrier) {
		this.invoiceCarrier = invoiceCarrier;
	}

	public Date getExecutionDate() {
		return executionDate;
	}

	public void setExecutionDate(Date executionDate) {
		this.executionDate = executionDate;
	}
	
	
	

}
