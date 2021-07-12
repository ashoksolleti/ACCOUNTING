/**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.contract;

import com.unisys.trans.logistics.lms.accounting.dto.PaymentOutstandingRequest;
import com.unisys.trans.logistics.lms.accounting.dto.PaymentOutstandingResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.framework.exception.ValidationException;

/**
 * @author KurmalNG
 * 
 */
public interface PaymentOutstandingService {

	public PaymentOutstandingResponse retrievePaymentOutstandingAmount(
			PaymentOutstandingRequest paymentOutstandingRequest)
			throws LMSException;

	public PaymentOutstandingResponse validatePaymentoutstandingRequest(
			PaymentOutstandingRequest paymentOutstandingRequest)
			throws ValidationException;
}