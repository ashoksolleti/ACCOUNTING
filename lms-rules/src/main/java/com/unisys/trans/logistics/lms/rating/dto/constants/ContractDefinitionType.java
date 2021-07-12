//@formatter:off
/* ====================================== */
/* Copyright(c) 2012 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.rating.dto.constants;

/**
 * <code>ContractDefinitionType</code> holds the constants to indicate ContractDefinition type applied.
 * <p>
 * Following are the possible ContractDefinition type:<br>
 * <ul>
 * <li>FIXED_RATE - Fixed Rate
 * <li>FLAT_RATE - Flat Rate
 * <li>PERCENT_REDUCTION - Percent Reduction
 * <li>PRICE_REDUCTION - Price Reduction
 * </ul>
 */

public enum ContractDefinitionType {

    /**
     * Constant used for Percent Reduction.
     */
    PERCENT_REDUCTION("Percent Reduction", "PERCENT"),

    /**
     * Constant used for Price Reduction.
     */
    PRICE_REDUCTION("Price Reduction", "PRICE"),
    /**
     * Constant used for Fixed Rate.
     */
    FIXED_RATE("Fixed Rate", "FIXED"),

    /**
     * Constant used for Flat Rate.
     */
    FLAT_RATE("Flat Rate", "FLAT");

    /**
     * Attribute to hold the <code>stringValue</code> property.
     */
    private String stringValue;

    /**
     * Attribute to hold the <code>label</code> property.
     */
    private String label;

    /**
     * Parameterize constructor.
     * 
     * @param pContractDefinitionType
     *            the value.
     */
    ContractDefinitionType(final String pContractDefinitionType) {
        this.setStringValue(pContractDefinitionType);
    }

    /**
     * Parameterize constructor.
     * 
     * @param pContractDefinitionType
     *            the value.
     * @param pLabel
     *            the value.
     */
    ContractDefinitionType(final String pContractDefinitionType, final String pLabel) {
        this.setStringValue(pContractDefinitionType);
        this.setLabel(pLabel);
    }

    /**
     * Gets the label.
     * <p>
     * 
     * @return the current value of <code>label</code> property.<br>
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * Sets the label.
     * <p>
     * 
     * @param pLabel
     *            the current value of <code>label</code> property.<br>
     */
    public void setLabel(final String pLabel) {
        this.label = pLabel;
    }

    /**
     * Gets the stringValue.
     * <p>
     * 
     * @return the current value of <code>stringValue</code> property.<br>
     */
    public String getStringValue() {
        return this.stringValue;
    }

    /**
     * Sets the stringValue.
     * <p>
     * 
     * @param pStringValue
     *            the current value of <code>stringValue</code> property.<br>
     */
    public void setStringValue(final String pStringValue) {
        this.stringValue = pStringValue;
    }

    /**
     * Default constructor.
     * 
     * @return the current value of <code>name</code> property.<br>
     * 
     */
    public String value() {
        return this.name();
    }

}
