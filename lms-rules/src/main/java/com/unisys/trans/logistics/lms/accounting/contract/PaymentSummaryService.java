/**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.contract;

import com.unisys.trans.logistics.lms.accounting.dto.PaymentDetailRequest;
import com.unisys.trans.logistics.lms.accounting.dto.PaymentDetailResponse;
import com.unisys.trans.logistics.lms.accounting.dto.PaymentSummaryRequest;
import com.unisys.trans.logistics.lms.accounting.dto.PaymentSummaryResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

/**
 * @author KurmalNG
 *
 */
public interface PaymentSummaryService {
	
	public PaymentSummaryResponse retrievePaymentSummary(PaymentSummaryRequest paymentSummaryRequest) throws LMSException;
	
	public PaymentDetailResponse retrievePaymentDetails(PaymentDetailRequest detailRequest) throws LMSException;
}
