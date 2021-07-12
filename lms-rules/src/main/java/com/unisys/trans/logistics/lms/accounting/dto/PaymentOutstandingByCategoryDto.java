package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.framework.constants.PaymentOutstandingCategory;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class PaymentOutstandingByCategoryDto extends PersistenceObjectDto {
	private static final long serialVersionUID = 1L;
	
	private BigDecimal amount;
	
	private PaymentOutstandingCategory paymentOutstandingCategory;
	
	/**
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}



	/**
	 * @param amount the amount to set
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}



	/**
	 * @return the paymentOutstandingCategory
	 */
	public PaymentOutstandingCategory getPaymentOutstandingCategory() {
		return paymentOutstandingCategory;
	}



	/**
	 * @param paymentOutstandingCategory the paymentOutstandingCategory to set
	 */
	public void setPaymentOutstandingCategory(
			PaymentOutstandingCategory paymentOutstandingCategory) {
		this.paymentOutstandingCategory = paymentOutstandingCategory;
	}



	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return null;
	}

}
