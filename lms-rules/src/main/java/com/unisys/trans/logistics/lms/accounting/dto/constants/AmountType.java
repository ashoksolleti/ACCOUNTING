//@formatter:off
/* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.accounting.dto.constants;

/**
 * <code>AmountType</code> holds the constants to indicate type of the charges.
 * <p>
 * Following are the possible AmountType type:<br>
 * <ul>
 * <li>IATA_AGENT_CHARGE
 * <li>OTHER_CHARGE
 * <li>VALUATION_CHARGE
 * <li>COD_CHARGE
 * <li>ISC_CHARGE
 * <li>WEIGHT_CHARGE
 * <li>VAT_CHARGE
 * </ul>
 */
public enum AmountType {

	/**
     * Constant used for Other Charges.
     */
    IATA_AGENT_CHARGE("I", "IATA Agent Charge"),
    /**
     * Constant used for Other Charges.
     */
    OTHER_CHARGE("O", "Other Charge"),
    /**
     * Constant used for Valuation Charges.
     */
    VALUATION_CHARGE("V", "Valuation Charge"),
    /**
     * Constant used for Cash On Delivery Charges.
     */
    COD_CHARGE("C", "COD Charge"),
    /**
     * Constant used for ISC Charges.
     */
    ISC_CHARGE("I", "ISC Charge"),
    /**
     * Constant used for Weight Charges.
     */
    WEIGHT_CHARGE("W", "Weight Charge"),
    
    /**
     * Constant used for Weight Charges.
     */
    VAT_CHARGE("A", "Vat charge"),
    
    /**
     * Constant used for TDS.
     */
    TDS("T", "TDS"),

    /**
     * Constant used for TDS.
     */

    /**
     * Constant used for TDS.
     */
    GSA_COMMISSION("T", "GSA Commission"),

    //AI026 LMSC-20437

    A("Advance Payment"),

    S("Security Deposit");

    /**
     * Attribute to hold the <code>amount</code> property.
     */
    private String amount;

    private String value;

    /**
     * Parameterize constructor.
     * 
     * @param pAmount
     *            the amount.
     */
    AmountType(final String pAmount, final String pValue) {
        this.amount = pAmount;
        this.value = pValue;
    }

    AmountType(String pValue) {
        this.value = pValue;
    }

    /**
     * @return the amount
     */
    public String getAmount() {
        return this.amount;
    }

    /**
     * Gives the string format of enumerated <code>FWBType</code>.
     * <p>
     * 
     * @return the current string value of the <code>FWBType</code>.
     */
    public String value() {
        return this.name();
    }

    /**
     * This method <code>getAmountByCode</code> returns the AmountType.
     * 
     * @param pAmount
     *            <code>String</code><br>
     *            The value of amount code.<br>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.accounting.dto.constants.AmountType
     *         pAmount}</code><br>
     *         Returns the type of AmountType <br>
     *         </p>
     */
    public static AmountType getAmountByCode(final String pAmount) {

        AmountType aMatchedAmount = null;

        for (final AmountType anAmount : AmountType.values()) {
            if (anAmount.getAmount().equalsIgnoreCase(pAmount)) {
                aMatchedAmount = anAmount;
                break;
            }
        }
        return aMatchedAmount;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
