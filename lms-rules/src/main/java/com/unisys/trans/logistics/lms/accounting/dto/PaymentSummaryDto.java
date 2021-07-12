package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class PaymentSummaryDto extends PersistenceObjectDto {

	private static final long serialVersionUID = 1L;

    private Long oId;
    private BigDecimal numberOfAWBs;
	private BigDecimal numberOfDCMs;
	private BigDecimal totalPaymentCommission;
	private BigDecimal totalPaymentNetamount;
	private BigDecimal totalPaymentOcda;
	private BigDecimal totalPaymentOcdc;
	private BigDecimal totalPaymentTax;
	private BigDecimal totalPaymentValuationcharges;
	private BigDecimal totalPaymentWeightcharges;

	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return this.oId;
	}

	public BigDecimal getNumberOfAWBs() {
		return numberOfAWBs;
	}

	public void setNumberOfAWBs(BigDecimal numberOfAWBs) {
		this.numberOfAWBs = numberOfAWBs;
	}

	public BigDecimal getNumberOfDCMs() {
		return numberOfDCMs;
	}

	public void setNumberOfDCMs(BigDecimal numberOfDCMs) {
		this.numberOfDCMs = numberOfDCMs;
	}

	public BigDecimal getTotalPaymentCommission() {
		return totalPaymentCommission;
	}

	public void setTotalPaymentCommission(BigDecimal totalPaymentCommission) {
		this.totalPaymentCommission = totalPaymentCommission;
	}

	public BigDecimal getTotalPaymentNetamount() {
		return totalPaymentNetamount;
	}

	public void setTotalPaymentNetamount(BigDecimal totalPaymentNetamount) {
		this.totalPaymentNetamount = totalPaymentNetamount;
	}

	public BigDecimal getTotalPaymentOcda() {
		return totalPaymentOcda;
	}

	public void setTotalPaymentOcda(BigDecimal totalPaymentOcda) {
		this.totalPaymentOcda = totalPaymentOcda;
	}

	public BigDecimal getTotalPaymentOcdc() {
		return totalPaymentOcdc;
	}

	public void setTotalPaymentOcdc(BigDecimal totalPaymentOcdc) {
		this.totalPaymentOcdc = totalPaymentOcdc;
	}

	public BigDecimal getTotalPaymentTax() {
		return totalPaymentTax;
	}

	public void setTotalPaymentTax(BigDecimal totalPaymentTax) {
		this.totalPaymentTax = totalPaymentTax;
	}

	public Long getoId() {
		return oId;
	}

	public void setoId(Long oId) {
		this.oId = oId;
	}

	public BigDecimal getTotalPaymentValuationcharges() {
		return totalPaymentValuationcharges;
	}

	public void setTotalPaymentValuationcharges(
			BigDecimal totalPaymentValuationcharges) {
		this.totalPaymentValuationcharges = totalPaymentValuationcharges;
	}

	public BigDecimal getTotalPaymentWeightcharges() {
		return totalPaymentWeightcharges;
	}

	public void setTotalPaymentWeightcharges(
			BigDecimal totalPaymentWeightcharges) {
		this.totalPaymentWeightcharges = totalPaymentWeightcharges;
	}

}
