package com.unisys.trans.logistics.lms.framework.dto.constants.operation;

public enum STAIndicatorType {
    Yes("Yes"),

    No("No"),

    NA("N/A");

    private String code;

    /**
     * Constructor with pCode as an argument.
     * <p>
     * 
     * @param pCode
     *            Holds the pCode.
     */

    STAIndicatorType(final String pCode) {
        this.code = pCode;
    }

    /**
     * Gets the value of the <code>GoodsStatusType</code> string.
     * <p>
     * 
     * @return the current value of <code>anGoodsStatusType</code>.
     */

    public static STAIndicatorType getGoodsStatusType(
                final String pSTAIndicatorTypeCode) {
        STAIndicatorType anSTAIndicatorType = null;
        for (final STAIndicatorType aType : STAIndicatorType.values()) {
            if (pSTAIndicatorTypeCode.equalsIgnoreCase(aType.name())
                        || pSTAIndicatorTypeCode.equalsIgnoreCase(aType.getCode())) {
                anSTAIndicatorType = aType;
                break;
            }
        }

        return anSTAIndicatorType;
    }

    /**
     * Gets the value of the <code>code</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>code</code> property.
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the <code>code</code> property.
     * <p>
     * 
     * @param <code>code</code> Holds the new value of the <code>code</code> property.
     */
    public void setCode(String code) {
        this.code = code;
    }
}
