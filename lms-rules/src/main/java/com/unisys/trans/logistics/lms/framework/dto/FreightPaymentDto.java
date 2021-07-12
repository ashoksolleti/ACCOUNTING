package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.framework.constants.PaymentMethodType;

public class FreightPaymentDto implements Serializable {

	/**
	 * Unique Serial version UID.
	 */
	private static final long serialVersionUID = 6225625810304360381L;

	/**
	 * Attribute to hold the <code>collectionPointInd</code> property.
	 */
	private int collectionPointInd;

	/**
	 * Attribute to hold the <code>freightCashDrawer</code> property.
	 */
	private String freightCashDrawer;

	/**
	 * Attribute to hold the <code>freightCurrencyCode</code> property.
	 */
	private String freightCurrencyCode;

	/**
	 * Attribute to hold the <code>freightOtherChargesAmt</code> property.
	 */
	private BigDecimal freightOtherChargesAmt;

	/**
	 * Attribute to hold the <code>freightPaymentAmt</code> property.
	 */
	private BigDecimal freightPaymentAmt;

	/**
	 * Attribute to hold the <code>freightPaymentMethod</code> property.
	 */
	private PaymentMethodType freightPaymentMethod;

	/**
	 * Attribute to hold the <code>freightWeightChargesAmt</code> property.
	 */
	private BigDecimal freightWeightChargesAmt;

	/**
	 * @return the collectionPointInd
	 */
	public int getCollectionPointInd() {
		return this.collectionPointInd;
	}

	/**
	 * @return the freightCashDrawer
	 */
	public String getFreightCashDrawer() {
		return this.freightCashDrawer;
	}

	/**
	 * @return the freightCurrencyCode
	 */
	public String getFreightCurrencyCode() {
		return this.freightCurrencyCode;
	}

	/**
	 * @return the freightOtherChargesAmt
	 */
	public BigDecimal getFreightOtherChargesAmt() {
		return this.freightOtherChargesAmt;
	}

	/**
	 * @return the freightPaymentAmt
	 */
	public BigDecimal getFreightPaymentAmt() {
		return this.freightPaymentAmt;
	}

	/**
	 * @return the freightPaymentMethod
	 */
	public PaymentMethodType getFreightPaymentMethod() {
		return this.freightPaymentMethod;
	}

	/**
	 * @return the freightWeightChargesAmt
	 */
	public BigDecimal getFreightWeightChargesAmt() {
		return this.freightWeightChargesAmt;
	}

	/**
	 * @param collectionPointInd
	 *            the collectionPointInd to set
	 */
	public void setCollectionPointInd(final int pCollectionPointInd) {
		this.collectionPointInd = pCollectionPointInd;
	}

	/**
	 * @param freightCashDrawer
	 *            the freightCashDrawer to set
	 */
	public void setFreightCashDrawer(final String pFreightCashDrawer) {
		this.freightCashDrawer = pFreightCashDrawer;
	}

	/**
	 * @param freightCurrencyCode
	 *            the freightCurrencyCode to set
	 */
	public void setFreightCurrencyCode(final String pFreightCurrencyCode) {
		this.freightCurrencyCode = pFreightCurrencyCode;
	}

	/**
	 * @param freightOtherChargesAmt
	 *            the freightOtherChargesAmt to set
	 */
	public void setFreightOtherChargesAmt(
			final BigDecimal pFreightOtherChargesAmt) {
		this.freightOtherChargesAmt = pFreightOtherChargesAmt;
	}

	/**
	 * @param freightPaymentAmt
	 *            the freightPaymentAmt to set
	 */
	public void setFreightPaymentAmt(final BigDecimal pFreightPaymentAmt) {
		this.freightPaymentAmt = pFreightPaymentAmt;
	}

	/**
	 * @param freightPaymentMethod
	 *            the freightPaymentMethod to set
	 */
	public void setFreightPaymentMethod(
			final PaymentMethodType pFreightPaymentMethod) {
		this.freightPaymentMethod = pFreightPaymentMethod;
	}

	/**
	 * @param freightWeightChargesAmt
	 *            the freightWeightChargesAmt to set
	 */
	public void setFreightWeightChargesAmt(
			final BigDecimal pFreightWeightChargesAmt) {
		this.freightWeightChargesAmt = pFreightWeightChargesAmt;
	}

}
