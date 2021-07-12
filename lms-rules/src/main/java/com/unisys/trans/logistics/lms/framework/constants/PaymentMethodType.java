//@formatter:off
/* ====================================== */
/* Copyright(c) 2011 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.framework.constants;

/**
 * Payment Method
 * <ul>
 * <li>CA = Cash</li>
 * <li>CH = Check</li>
 * <li>CR = Credit Card</li>
 * <li>MC = MCO Payment</li>
 * <li>DC = Debit Card</li>
 * <li>IN = Invoice</li>
 * <li>DA =
 * <li>DR =
 * <li>DH =
 * <li>CD =
 * </ul>
 * 
 * @author Unisys
 * 
 */
public enum PaymentMethodType {
	/**
	 * This is an enumerated PaymentMethodType constant to specify payment type
	 * CASH.
	 * <p>
	 * value = {@value}
	 */
	CA("CASH"),
	/**
	 * This is an enumerated PaymentMethodType constant to specify payment type
	 * COD MCO.
	 * <p>
	 * value = {@value}
	 */
	DC("CODMCO"),
	/**
	 * This is an enumerated PaymentMethodType constant to specify payment type
	 * CHECK.
	 * <p>
	 * value = {@value}
	 */
	CH("CHECK"),
	/**
	 * This is an enumerated PaymentMethodType constant to specify payment type
	 * CREDIT CARD.
	 * <p>
	 * value = {@value}
	 */
	CR("CREDIT CARD"),
	/**
	 * This is an enumerated PaymentMethodType constant to specify payment type
	 * INVOICE.
	 * <p>
	 * value = {@value}
	 */
	IN("INVOICE"),
	/**
	 * This is an enumerated PaymentMethodType constant to specify purpose type
	 * MCO PAYMENT.
	 * <p>
	 * value = {@value}
	 */
	MC("MCO"),
	/**
	 * This is an enumerated PaymentMethodType constant to specify purpose type
	 * COD CASH.
	 * <p>
	 * value = {@value}
	 */
	DA("CODCASH"),
	/**
	 * This is an enumerated PaymentMethodType constant to specify purpose type
	 * COD CARD.
	 * <p>
	 * value = {@value}
	 */
	DR("CODCARD"),
	/**
	 * This is an enumerated PaymentMethodType constant to specify purpose type
	 * COD CHECK.
	 * <p>
	 * value = {@value}
	 */
	DH("CODCHECK"),
	/**
	 * This is an enumerated PaymentMethodType constant to specify purpose type
	 * INITIAL CASH FLOAT.
	 * <p>
	 * value = {@value}
	 */
	FL("FLOAT"),
	
	/**
	 * This is an enumerated PaymentMethodType constant to specify purpose type
	 * INITIAL CASH FLOAT.
	 * <p>
	 * value = {@value}
	 */
	MOCC("MO/CC"),
	
	/**
     * This is an enumerated PaymentMethodType constant to specify purpose type
     * ADVANCE PAYMENTS BY CUSTOMER AP.
     * <p>
     * value = {@value}
     */
	
	AP("APS"),
	/**
     * This is an enumerated PaymentMethodType constant to specify purpose type
     * INITIAL CASH FLOAT for COD.
     * <p>
     * value = {@value}
     */
    CODMOCC("CODMO/CC");

	public static PaymentMethodType getPaymentMethod(
			final PaymentMethodType aPaymentMethodType) {

		PaymentMethodType aPaymentMethod = null;

		for (final PaymentMethodType aType : PaymentMethodType.values()) {

			if (aPaymentMethodType.value().equals(aType.value())) {
				aPaymentMethod = aType;
				break;
			}
		}

		return aPaymentMethod;

	}

	/** Attribute that holds the string representation for the enum **/
	private String value;

	/**
	 * Parameterized constructor. Accepts the string representation of the enum
	 * as the parameter
	 * 
	 * @param value
	 *            String representaion of the enum
	 */
	PaymentMethodType(final String value) {
		this.value = value;
	}

	public String value() {
		return this.value;
	}

	/**
	 * Parse the given string and find the matching enumeration constant. If no
	 * match is found returns a null value.
	 * 
	 * @param value
	 *            String value defined for the enum constant to be found.
	 * @return Returns PaymentMethod Enumerated value , or <code>null</code> if
	 *         no matching enum is found.
	 */
	PaymentMethodType parse(final String value) {
		PaymentMethodType itemFound = null;
		for (final PaymentMethodType item : PaymentMethodType.values()) {
			if (value.equalsIgnoreCase(item.value)) {
				itemFound = item;
				break;
			}
		}
		return itemFound;
	}

	public String getValue() {
		return value;
	}

	  
    public static PaymentMethodType getPaymentMethodTypeEnumValue(
			final String pPaymentMethodType) {
    	PaymentMethodType aPaymentMethodType = null;
		for (final PaymentMethodType aType : PaymentMethodType
				.values()) {
			if (pPaymentMethodType.equals(aType.name())) {
				aPaymentMethodType = aType;
				break;
			}
		}
		return aPaymentMethodType;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
}
