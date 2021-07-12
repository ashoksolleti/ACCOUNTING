/**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * @author KurmalNG
 *
 */
public class PaymentSummaryResponse extends AbstractResponse{

	private static final long serialVersionUID = 1L;
	
	private List<PaymentDetailsDto> paymentDetailsDtos = new ArrayList<PaymentDetailsDto>();

	/**
	 * @return the paymentDetailsDtos
	 */
	public List<PaymentDetailsDto> getPaymentDetailsDtos() {
		return paymentDetailsDtos;
	}

	/**
	 * @param paymentDetailsDtos the paymentDetailsDtos to set
	 */
	public void setPaymentDetailsDtos(List<PaymentDetailsDto> paymentDetailsDtos) {
		this.paymentDetailsDtos = paymentDetailsDtos;
	}

}
