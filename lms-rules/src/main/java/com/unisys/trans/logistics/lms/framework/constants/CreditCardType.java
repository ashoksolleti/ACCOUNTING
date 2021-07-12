package com.unisys.trans.logistics.lms.framework.constants;

//@formatter:off
/* ====================================== */
/* Copyright(c) 2011 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
/**
 * Enumerated values for the CreditCardType. Possible values are,
 * <ul>
 * <li>AX = American Express
 * <li>MC = Master
 * <li>V = Visa
 * <li>DC = Diners Club
 * <li>D = Discover
 * <li>CB= Carte Blanche
 * <li>TP= UATPAUTP
 * <li>SO = SOLLO
 * </ul>
 * 
 * 
 * @author Unisys
 * 
 */
public enum CreditCardType {
    /**
     * This is an enumerated CreditCardType constant to specify American Express.
     */
    AX("American Express"),

    /**
     * This is an enumerated CreditCardType constant to specify Master Card.
     */
    MC("Master Card"),
    /**
     * This is an enumerated CreditCardType constant to specify Visa.
     */
    VI("Visa"),
    /**
     * This is an enumerated CreditCardType constant to specify Diners Club.
     */
    DC("Diners Club"),
    /**
     * This is an enumerated CreditCardType constant to specify Discover.
     */
    DS("Discover"),

    /**
     * This is an enumerated CreditCardType constant to specify Carte Blanche.
     */
    CB("Carte Blanche"),
    /**
     * This is an enumerated CreditCardType constant to specify UATPAUTP.
     */
    TP("UATPAUTP"),
    /**
     * This is an enumerated CreditCardType constant to specify SOLLO.
     */
    SO("SOLLO");

    private String definition;

    /**
     * Constructor with <code>CreditCardType</code> as an argument.
     * <p>
     * 
     * @param pDef
     *            the new value of the <code>def</code>.<br>
     */
    CreditCardType(final String pDef) {
        this.definition = pDef;

    }

    /**
     * Gets the definition.
     * <p>
     * 
     * @return the current value of <code>definition</code> property.<br>
     */
    public String getDefinition() {
        return this.definition;
    }

}
