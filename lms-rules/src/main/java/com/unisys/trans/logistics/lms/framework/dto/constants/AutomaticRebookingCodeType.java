package com.unisys.trans.logistics.lms.framework.dto.constants;

/**
 * <code>AutomaticRebookingCodeType</code> holds the constants to indicate
 * AutomaticRebookingCodeType applied.
 * <p>
 * Following are the possible MCTStatusTypeAutomaticRebookingCodeType:<br>
 * <ul>
 * <li>NO_BOOKING
 * <li>AUTO_REBOOK_FOR_NORMAL_GOODS_ACCEPTANCE
 * <li>AUTO_REBOOK_FOR_GOODS_ACCEPTANCE_WITH_OVERRIDE
 * <li>AUTO_REBOOK_FOR_FLIGHT_ASSIGNMENT
 * </ul>
 * **/

public enum AutomaticRebookingCodeType {
    /**
     * This is an enumerated AutomaticRebookingCodeType constant to specify automatic rebooking code type -
     * AUTO_REBOOK_FOR_FLIGHT_ASSIGNMENT.
     * <p>
     * value = {@value}
     */
    AUTO_REBOOK_FOR_FLIGHT_ASSIGNMENT("3"),
    /**
     * This is an enumerated AutomaticRebookingCodeType constant to specify automatic rebooking code type -
     * AUTO_REBOOK_FOR_GOODS_ACCEPTANCE_WITH_OVERRIDE.
     * <p>
     * value = {@value}
     */
    AUTO_REBOOK_FOR_GOODS_ACCEPTANCE_WITH_OVERRIDE("2"),
    /**
     * This is an enumerated AutomaticRebookingCodeType constant to specify automatic rebooking code type -
     * AUTO_REBOOK_FOR_NORMAL_GOODS_ACCEPTANCE.
     * <p>
     * value = {@value}
     */
    AUTO_REBOOK_FOR_NORMAL_GOODS_ACCEPTANCE("1"),
    /**
     * This is an enumerated AutomaticRebookingCodeType constant to specify automatic rebooking code type -
     * NO_BOOKING.
     * <p>
     * value = {@value}
     */

    NO_BOOKING("0");
    /**
     * Attribute to holds <code> automaticRebookingCode</code> property.
     */
    private String automaticRebookingCodeType;

    /**
     * Constructor with AutomaticRebookingCodeType as an argument.
     * <p>
     * 
     * @param pAutomaticRebookingCode
     *            Holds the AutomaticRebookingType.
     */
    private AutomaticRebookingCodeType(final String pAutomaticRebookingCode) {
        this.automaticRebookingCodeType = pAutomaticRebookingCode;
    }

    /**
     * Gets the value of the automaticRebookingCodeType property.
     * 
     * @return the current value of <code>automaticRebookingCodeType</code>.
     */

    public String getAutomaticRebookingCodeType() {
        return this.automaticRebookingCodeType;
    }

    /**
     * Sets the value of the AutomaticRebookingCodeType property.
     * 
     * @param pAutomaticRebookingCodeType
     *            the current value of <code>AutomaticRebookingCodeType</code> property.<br>
     */
    public void setAutomaticRebookingCodeType(
                final String pAutomaticRebookingCodeType) {
        this.automaticRebookingCodeType = pAutomaticRebookingCodeType;
    }

    /**
     * Gives the string format of enumerated <code>AutomaticRebookingCode</code> .
     * <p>
     * 
     * @return the current string value of the <code>AutomaticRebookingCode</code>.
     */
    public String value() {
        return this.automaticRebookingCodeType;

    }
}