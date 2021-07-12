/**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * @author KurmalNG
 *
 */
public class PaymentOutstandingResponse extends AbstractResponse{

	private static final long serialVersionUID = 1L;
	
	private List<PaymentOutstandingAmountDto> paymentOutstandingAmountDtos;
	
	BigDecimal paymentTotalOutStanding = new BigDecimal(0);
	BigDecimal totalunAppliedAmount = new BigDecimal(0);
	BigDecimal totalunBilledAmount = new BigDecimal(0);

	/**
	 * @return the paymentOutstandingAmountDtos
	 */
	public List<PaymentOutstandingAmountDto> getPaymentOutstandingAmountDtos() {
		return paymentOutstandingAmountDtos;
	}

	/**
	 * @param paymentOutstandingAmountDtos the paymentOutstandingAmountDtos to set
	 */
	public void setPaymentOutstandingAmountDtos(
			List<PaymentOutstandingAmountDto> paymentOutstandingAmountDtos) {
		this.paymentOutstandingAmountDtos = paymentOutstandingAmountDtos;
	}

	/**
	 * @return the paymentTotalOutStanding
	 */
	public BigDecimal getPaymentTotalOutStanding() {
		return paymentTotalOutStanding;
	}

	/**
	 * @param paymentTotalOutStanding the paymentTotalOutStanding to set
	 */
	public void setPaymentTotalOutStanding(BigDecimal paymentTotalOutStanding) {
		this.paymentTotalOutStanding = paymentTotalOutStanding;
	}

	/**
	 * @return the totalunAppliedAmount
	 */
	public BigDecimal getTotalunAppliedAmount() {
		return totalunAppliedAmount;
	}

	/**
	 * @param totalunAppliedAmount the totalunAppliedAmount to set
	 */
	public void setTotalunAppliedAmount(BigDecimal totalunAppliedAmount) {
		this.totalunAppliedAmount = totalunAppliedAmount;
	}

	/**
	 * @return the totalunBilledAmount
	 */
	public BigDecimal getTotalunBilledAmount() {
		return totalunBilledAmount;
	}

	/**
	 * @param totalunBilledAmount the totalunBilledAmount to set
	 */
	public void setTotalunBilledAmount(BigDecimal totalunBilledAmount) {
		this.totalunBilledAmount = totalunBilledAmount;
	}

}
