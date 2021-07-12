package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class PaymentInformationResponse extends AbstractResponse {

	 private static final long serialVersionUID = 1L;

	 private Long oId;

	 private PaymentDetailsDto paymentDetailsDto;
	 
	 private List<PaymentDetailsDto> paymentDetailsDtoList = new ArrayList<PaymentDetailsDto>();

	public List<PaymentDetailsDto> getPaymentDetailsDtoList() {
		return paymentDetailsDtoList;
	}

	public void setPaymentDetailsDtoList(
			List<PaymentDetailsDto> paymentDetailsDtoList) {
		this.paymentDetailsDtoList = paymentDetailsDtoList;
	}

	public PaymentDetailsDto getPaymentDetailsDto() {
		return paymentDetailsDto;
	}

	public void setPaymentDetailsDto(PaymentDetailsDto paymentDetailsDto) {
		this.paymentDetailsDto = paymentDetailsDto;
	}
	
	public PaymentInformationResponse()
	{
		
	}
}
