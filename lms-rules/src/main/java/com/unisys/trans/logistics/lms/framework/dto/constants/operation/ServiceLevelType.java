package com.unisys.trans.logistics.lms.framework.dto.constants.operation;

/**
 * Service Level Types. <br>
 * <ul>
 * <li>EXPRESS
 * <li>NORMAL
 * </ul>
 */
public enum ServiceLevelType {
    /**
     * Express service level type.
     */
    EXPRESS("E"),

    /**
     * Normal service level type.
     */
    NORMAL("N");

    /**
     * /** Attribute to hold the <code>value</code> property.
     */
    private String value;

    /**
     * <code>Parameterized Constructor.</code>
     * 
     * @param pValue
     *            Contains the enum value.<br>
     */
    ServiceLevelType(final String pValue) {
        this.value = pValue;
    }

    /**
     * Gets the enum constant.
     * <p>
     * 
     * @return the current value of the <code>val</code>.
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Gets the string value of the enum.
     * <p>
     * 
     * @return the current value of the <code>name</code>.
     */
    public String value() {
        return this.name();
    }
}
