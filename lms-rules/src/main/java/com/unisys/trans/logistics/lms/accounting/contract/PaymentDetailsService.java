package com.unisys.trans.logistics.lms.accounting.contract;

import com.unisys.trans.logistics.lms.accounting.dto.PaymentDetailsResponse;
import com.unisys.trans.logistics.lms.accounting.dto.PaymentInformationPersistRequest;
import com.unisys.trans.logistics.lms.accounting.dto.PaymentPersistRequest;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;

public interface PaymentDetailsService {

	public PaymentDetailsResponse savePaymentInformation(
			PaymentInformationPersistRequest paymentInformationPersistRequest) throws LMSException;
	
	
	
}
