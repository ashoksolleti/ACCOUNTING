package com.unisys.trans.logistics.lms.framework.constants;

public enum PaymentType {
	
	BRL("BANK RELEASE DOCUMENT"),
	
	COD("CASH ON DELIVERY"),
	
	GBL("GOVERNMENT BILL OF LANDING DOCUMENT"),
	
	MINUS("MINUS (-)"),
	
	PLUS("PLUS (+)");
	
	
	
	private String paymentType;
	
	PaymentType(final String pPayemntType) {
		this.paymentType=pPayemntType;
	}

	/**
	 * @return the paymentType
	 */
	public String getPaymentType() {
		return paymentType;
	}

	/**
	 * @param paymentType the paymentType to set
	 */
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	
	/**
	 * Gives the string format of <code>paymentType</code>.
	 * <p>
	 * 
	 * @return the enumerated value of the <code>paymentType</code>.<br>
	 */
	public String value() {
		return this.paymentType;
	}

}
