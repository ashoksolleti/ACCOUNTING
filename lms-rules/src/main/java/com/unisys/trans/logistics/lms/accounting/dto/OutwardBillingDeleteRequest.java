package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.List;
import java.util.Set;

import com.unisys.trans.logistics.lms.accounting.dto.constants.InwardInvoiceStatus;
import com.unisys.trans.logistics.lms.accounting.dto.constants.MemoType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ReceivableStatusType;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class OutwardBillingDeleteRequest extends AbstractRequest {

    /**
     * Default serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>billingScheduleDto</code> property.
     */
    AccountingInvoiceBillingScheduleDto billingScheduleDto;

    /**
     * Attribute to hold <code>billingScheduleDto</code> property.
     */
    ReceivableStatusType receivableStatusType;
    
    private List<AccountingInvoiceAWBDto> accountingInvoiceAWBDtos;
    

    /**
     * Attribute to hold <code>carriers</code> property.
     */
    private Set<String> carriers;

    /**
     * Attribute to hold <code>memoType</code> property.
     */
    private MemoType memoType;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    public AccountingInvoiceBillingScheduleDto getBillingScheduleDto() {
        return this.billingScheduleDto;
    }

    public Set<String> getCarriers() {
        return this.carriers;
    }

   

    public MemoType getMemoType() {
        return this.memoType;
    }

    /**
     * Gets the <code>OId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    public Long getOId() {
        return this.oId;
    }

    public void setBillingScheduleDto(final AccountingInvoiceBillingScheduleDto pBillingScheduleDto) {
        this.billingScheduleDto = pBillingScheduleDto;
    }

    public void setCarriers(final Set<String> pCarriers) {
        this.carriers = pCarriers;
    }

 

    /**
	 * @return the receivableStatusType
	 */
	public ReceivableStatusType getReceivableStatusType() {
		return receivableStatusType;
	}

	/**
	 * @param receivableStatusType the receivableStatusType to set
	 */
	public void setReceivableStatusType(ReceivableStatusType receivableStatusType) {
		this.receivableStatusType = receivableStatusType;
	}

	public void setMemoType(final MemoType pMemoType) {
        this.memoType = pMemoType;
    }

    /**
     * Sets the <code>OId</code> property.
     * <p>
     * 
     * @param pOId
     *            the new value of the <code>oId</code> property.
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

	/**
	 * @return the accountingInvoiceAWBDtos
	 */
	public List<AccountingInvoiceAWBDto> getAccountingInvoiceAWBDtos() {
		return accountingInvoiceAWBDtos;
	}

	/**
	 * @param accountingInvoiceAWBDtos the accountingInvoiceAWBDtos to set
	 */
	public void setAccountingInvoiceAWBDtos(
			List<AccountingInvoiceAWBDto> accountingInvoiceAWBDtos) {
		this.accountingInvoiceAWBDtos = accountingInvoiceAWBDtos;
	}
    
    

}
