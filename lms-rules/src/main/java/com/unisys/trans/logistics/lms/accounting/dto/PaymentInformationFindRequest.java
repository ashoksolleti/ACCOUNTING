package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.accounting.dto.constants.PaymentLevel;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class PaymentInformationFindRequest  extends AbstractRequest{
	
	 private static final long serialVersionUID = 1L;
	
	private String invoiceNumber;
	
	private String paymentIdentifier;

	private String airwaybillNumber;

	private PaymentLevel paymentLevel;

	public String getInvoiceNumber() {
		if(invoiceNumber!=null)
			invoiceNumber = invoiceNumber.toUpperCase();
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getPaymentIdentifier() {
		if(paymentIdentifier!=null)
		{
			paymentIdentifier = paymentIdentifier.toUpperCase();
		}
		return paymentIdentifier;
	}

	public void setPaymentIdentifier(String paymentIdentifier) {
		this.paymentIdentifier = paymentIdentifier;
	}

	public String getAirwaybillNumber() {
		return airwaybillNumber;
	}

	public void setAirwaybillNumber(String airwaybillNumber) {
		this.airwaybillNumber = airwaybillNumber;
	}

	public PaymentLevel getPaymentLevel() {
		return paymentLevel;
	}

	public void setPaymentLevel(PaymentLevel paymentLevel) {
		this.paymentLevel = paymentLevel;
	}
}
