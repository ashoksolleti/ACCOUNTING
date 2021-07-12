package com.unisys.trans.logistics.lms.rating.dto.constants;
/**
 * <code>RateAdjustmentType</code> holds the constants to indicate RateAdjustmentType applied.
 * <p>
 * Following are the possible RateAdjustmentType:<br>
 * <ul>
 * <li>PERCENT_INCREASE - Percent Increase
 * <li>PERCENT_DECREASE - Percent Decrease
 * <li>AMOUNT_INCREASE - Amount Increase
 * <li>AMOUNT_DECREASE - Amount Decrease
 * </ul>
 */
public enum RateAdjustmentType {

    /**
     *PERCENT_INCREASE represents Percent Increase.
     */
    PERCENT_INCREASE("Percent Increase"),

    /**
     * PERCENT_DECREASE represents Percent Decrease.
     */
    PERCENT_DECREASE("Percent Decrease"),

    /**
     * AMOUNT_INCREASE represents Amount Increase.
     */
    AMOUNT_INCREASE("Amount Increase"),

    /**
     * AMOUNT_DECREASE represents Amount Decrease.
     */
    AMOUNT_DECREASE("Amount Decrease");

    /**
     * Attribute to hold the <code>ContractStatusName</code> property.
     */

    private String rateAdjustmentType;

    /**
     * Gets the <code>rateAdjustmentType</code> property.
     * <p>
     * Holds the rateAdjustmentType code applicable for a contract .
     * <p>
     * 
     * @return the current value of the <code>rateAdjustmentType</code> property.<br>
     */
    public String getRateAdjustmentType() {
        return this.rateAdjustmentType;
    }
    /**
     * Sets the rateAdjustmentType value.
     * <p>
     * 
     * @param pRateAdjustmentType
     *            the current value of <code>rateAdjustmentType</code> property.<br>
     */
    public void setRateAdjustmentType(final String pRateAdjustmentType) {
        this.rateAdjustmentType = pRateAdjustmentType;
    }
    /**
     * Constructor with <code>ContractStatusType</code> as an argument.
     * <p>
     * 
     * @param pType
     *            the new value of the <code>type</code>.<br>
     * @param pName
     *            the new value of the <code>Name</code>.<br>
     */
    private RateAdjustmentType(final String rateAdjustmentType) {
        this.rateAdjustmentType = rateAdjustmentType;
    }

    /**
     * Gets the value.
     * <p>
     * 
     * @return the current value of <code>name</code> property.<br>
     */
    public String value() {
        return this.name();
    }
}
