package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class InterlineInwardBillingResponse extends AbstractResponse {

    /**
     * Attribute to hold the <code>serialVersionUID</code> object.
     */
    private static final long serialVersionUID = -2459910414426146270L;

    /**
     * Attribute to hold the <code>billingScheduleDto</code> object.
     */
    private AccountingInvoiceBillingScheduleDto billingScheduleDto;

    /**
     * Attribute to hold the <code>oId</code> object.
     */
    private Long oId;

    /**
     * Attribute to hold the <code>billingScheduleDto</code> object.
     */
    private List<SelectionInvoiceDetailDto> selectionInvoiceDetailDtos;
    
    private List<AccountingAirWaybillDto> accountingAirWaybillDtos;
    /**
     * Gets the <code>billingScheduleDto</code> property.
     * <p>
     * 
     * @return the current value of the <code>billingScheduleDto</code> property.
     */
    public AccountingInvoiceBillingScheduleDto getBillingScheduleDto() {
        return this.billingScheduleDto;
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

    /**
     * @return the selectionInvoiceDetailDtos
     */
    public List<SelectionInvoiceDetailDto> getSelectionInvoiceDetailDtos() {
        if (this.selectionInvoiceDetailDtos == null)
        {
            this.selectionInvoiceDetailDtos = new ArrayList<SelectionInvoiceDetailDto>();
        }
        return this.selectionInvoiceDetailDtos;
    }

    /**
     * Sets the <code>billingScheduleDto</code> property.
     * <p>
     * 
     * @param pOId
     *            the current value of the <code>billingScheduleDto</code> property.
     */
    public void setBillingScheduleDto(final AccountingInvoiceBillingScheduleDto pBillingScheduleDto) {
        this.billingScheduleDto = pBillingScheduleDto;
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
     * @param pSelectionInvoiceDetailDtos the selectionInvoiceDetailDtos to set
     */
    public void setSelectionInvoiceDetailDtos(final List<SelectionInvoiceDetailDto> pSelectionInvoiceDetailDtos) {
        this.selectionInvoiceDetailDtos = pSelectionInvoiceDetailDtos;
    }

	public List<AccountingAirWaybillDto> getAccountingAirWaybillDtos() {
		return accountingAirWaybillDtos;
	}

	public void setAccountingAirWaybillDtos(
			List<AccountingAirWaybillDto> accountingAirWaybillDtos) {
		this.accountingAirWaybillDtos = accountingAirWaybillDtos;
	}
    
    

}
