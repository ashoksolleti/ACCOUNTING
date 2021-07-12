package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.unisys.trans.logistics.lms.accounting.dto.constants.MemoType;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class OutwardBillingMemoPersistRequest extends AbstractRequest {

    /**
     * 
     */
    private static final long serialVersionUID = 1359975318990335789L;

    /**
     * Indicates if the request is in BATCH mode.
     */
    private boolean batchIndicator;

    /**
     * Attribute to hold the <code>billingScheduleDto</code> object.
     */
    private AccountingInvoiceBillingScheduleDto billingScheduleDto;

    /**
     * Attribute to hold the <code>memoType</code> object.
     */
    private MemoType memoType;
    
    private BigDecimal totalAmountToBilled;
    
    private String billingCurrency;
    
    private Date executionDate;
    
    private String airWayBillNumber;

    private byte[] inwardAttachment;
    /**
     * Attribute to hold the <code>oId</code> object.
     */
    private Long oId;

    public boolean getBatchIndicator() {
        return this.batchIndicator;
    }

    /**
     * Gets the <code>billingScheduleDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>billingScheduleDto</code> property.
     */
    public AccountingInvoiceBillingScheduleDto getBillingScheduleDto() {
        return this.billingScheduleDto;
    }

    public MemoType getMemoType() {
        return this.memoType;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    public void setBatchIndicator(final boolean pBatchIndicator) {
        this.batchIndicator = pBatchIndicator;
    }

    /**
     * Sets the <code>billingScheduleDto</code> property.
     * <p>
     * 
     * @param pBillingScheduleDto
     *            the current value of the <code>billingScheduleDto</code> property.
     */
    public void setBillingScheduleDto(final 
                AccountingInvoiceBillingScheduleDto pBillingScheduleDto) {
        this.billingScheduleDto = pBillingScheduleDto;
    }

    public void setMemoType(final MemoType pMemoType) {
        this.memoType = pMemoType;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            the current value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

	/**
	 * @return the totalAmountToBilled
	 */
	public BigDecimal getTotalAmountToBilled() {
		return totalAmountToBilled;
	}

	/**
	 * @param totalAmountToBilled the totalAmountToBilled to set
	 */
	public void setTotalAmountToBilled(BigDecimal totalAmountToBilled) {
		this.totalAmountToBilled = totalAmountToBilled;
	}

	/**
	 * @return the billingCurrency
	 */
	public String getBillingCurrency() {
		return billingCurrency;
	}

	/**
	 * @param billingCurrency the billingCurrency to set
	 */
	public void setBillingCurrency(String billingCurrency) {
		this.billingCurrency = billingCurrency;
	}

	/**
	 * @return the executionDate
	 */
	public Date getExecutionDate() {
		return executionDate;
	}

	/**
	 * @param executionDate the executionDate to set
	 */
	public void setExecutionDate(Date executionDate) {
		this.executionDate = executionDate;
	}

	/**
	 * @return the airWayBillNumber
	 */
	public String getAirWayBillNumber() {
		return airWayBillNumber;
	}

	/**
	 * @param airWayBillNumber the airWayBillNumber to set
	 */
	public void setAirWayBillNumber(String airWayBillNumber) {
		this.airWayBillNumber = airWayBillNumber;
	}

	/**
	 * @return the inwardAttachment
	 */
	public byte[] getInwardAttachment() {
		return inwardAttachment;
	}

	/**
	 * @param inwardAttachment the inwardAttachment to set
	 */
	public void setInwardAttachment(byte[] inwardAttachment) {
		this.inwardAttachment = inwardAttachment;
	}
    
    

}
