package com.unisys.trans.logistics.lms.rating.dto.price;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class PricingOtherChargeDto extends PersistenceObjectDto {

	@Override
	public String toString() {
		String pricingOtherChargeDto = new String();
		pricingOtherChargeDto = "pricingOtherChargeDto ::: " + "otherChargeCode :" + otherChargeCode
				+ "otherChargeSubcode :" + otherChargeSubcode + "otherChargeAmount :" + otherChargeAmount;
		return pricingOtherChargeDto;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = -9100951629046360599L;
	/**
     * Attribute to hold <code>otherChargeCode</code> property.
     */
	private String otherChargeCode;
	/**
     * Attribute to hold <code>otherChargeSubcode</code> property.
     */
	private String otherChargeSubcode;
	/**
     * Attribute to hold <code>otherChargeAmount</code> property.
     */
	private String otherChargeAmount;
	/**
     * Gets the <code>otherChargeCode</code> property.
     * <p>
     * 
     * @return the current value of the <code>otherChargeCode</code> property.<br>
     */
	public String getOtherChargeCode() {
		return this.otherChargeCode;
	}
	/**
     * Gets the <code>otherChargeSubcode</code> property.
     * <p>
     * 
     * @return the current value of the <code>otherChargeSubcode</code> property.<br>
     */
	public String getOtherChargeSubcode() {
		return this.otherChargeSubcode;
	}
	/**
     * Gets the <code>otherChargeAmount</code> property.
     * <p>
     * 
     * @return the current value of the <code>otherChargeAmount</code> property.<br>
     */
	public String getOtherChargeAmount() {
		return this.otherChargeAmount;
	}
	 /**
     * Sets the <code>otherChargeCode</code> property.
     * <p>
     * 
     * @param pOtherChargeCode
     *            the current value of the <code>otherChargeCode</code> property.
     */
	public void setOtherChargeCode(final String pOtherChargeCode) {
		this.otherChargeCode = pOtherChargeCode;
	}
	 /**
     * Sets the <code>otherChargeSubcode</code> property.
     * <p>
     * 
     * @param pOtherChargeSubcode
     *            the current value of the <code>otherChargeSubcode</code> property.
     */
	public void setOtherChargeSubcode(final String pOtherChargeSubcode) {
		this.otherChargeSubcode = pOtherChargeSubcode;
	}
	 /**
     * Sets the <code>otherChargeAmount</code> property.
     * <p>
     * 
     * @param pOtherChargeAmount
     *            the current value of the <code>otherChargeAmount</code> property.
     */
	public void setOtherChargeAmount(final String pOtherChargeAmount) {
		this.otherChargeAmount = pOtherChargeAmount;
	}
	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return null;
	}

}
