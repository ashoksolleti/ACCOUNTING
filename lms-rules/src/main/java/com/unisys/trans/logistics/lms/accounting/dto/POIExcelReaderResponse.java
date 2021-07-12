package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class POIExcelReaderResponse extends AbstractResponse{

	private static final long serialVersionUID = 1L;
	
	private List<PaymentDetailsDto> paymentDetailsDtoList = new ArrayList<PaymentDetailsDto>();
	
	List<AccountingInvoiceAWBDto> accountingInvoiceAWBDtos= new ArrayList<AccountingInvoiceAWBDto>();

	/**
	 * @return the paymentDetailsDtoList
	 */
	public List<PaymentDetailsDto> getPaymentDetailsDtoList() {
		return paymentDetailsDtoList;
	}

	/**
	 * @param paymentDetailsDtoList the paymentDetailsDtoList to set
	 */
	public void setPaymentDetailsDtoList(
			List<PaymentDetailsDto> paymentDetailsDtoList) {
		this.paymentDetailsDtoList = paymentDetailsDtoList;
	}

	public List<AccountingInvoiceAWBDto> getAccountingInvoiceAWBDtos() {
		return accountingInvoiceAWBDtos;
	}

	public void setAccountingInvoiceAWBDtos(
			List<AccountingInvoiceAWBDto> accountingInvoiceAWBDtos) {
		this.accountingInvoiceAWBDtos = accountingInvoiceAWBDtos;
	}
	
	
}
