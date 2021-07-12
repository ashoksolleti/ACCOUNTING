package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class PaymentPersistRequest extends AbstractRequest {

	private static final long serialVersionUID = 1L;
	
	private List<PaymentPeriodDto> paymentPeriodDtos;
	
	private List<PaymentDetailsDto> paymentDetailsDtos;

	public List<PaymentPeriodDto> getPaymentPeriodDtos() {
		return paymentPeriodDtos;
	}

	public void setPaymentPeriodDtos(List<PaymentPeriodDto> paymentPeriodDtos) {
		this.paymentPeriodDtos = paymentPeriodDtos;
	}

	public List<PaymentDetailsDto> getPaymentDetailsDtos() {
		return paymentDetailsDtos;
	}

	public void setPaymentDetailsDtos(List<PaymentDetailsDto> paymentDetailsDtos) {
		this.paymentDetailsDtos = paymentDetailsDtos;
	}
	

	}
