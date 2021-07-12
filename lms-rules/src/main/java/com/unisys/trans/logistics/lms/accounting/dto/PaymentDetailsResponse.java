package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class PaymentDetailsResponse extends AbstractResponse{
	
	private static final long serialVersionUID = 1L;
	
	private List<PaymentPeriodDto> paymentPeriodDtoList = new ArrayList<PaymentPeriodDto>();

	public List<PaymentPeriodDto> getPaymentPeriodDtoList() {
		return paymentPeriodDtoList;
	}

	public void setPaymentPeriodDtoList(List<PaymentPeriodDto> paymentPeriodDtoList) {
		this.paymentPeriodDtoList = paymentPeriodDtoList;
	}
	
	
}
