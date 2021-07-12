package com.unisys.trans.logistics.lms.framework.dto.constants.operation;


public enum PhotoMatchIndicatorType {
    Yes("Yes"),
    
    NA("N/A");
    
    private String code;
    
    /**
     * Constructor with pCode as an argument.
     * <p>
     * 
     * @param pCode
     *            Holds the pCode.
     */

    PhotoMatchIndicatorType(final String pCode) {
        this.code = pCode;
    }

    /**
     * Gets the value of the <code>GoodsStatusType</code> string.
     * <p>
     * 
     * @return the current value of <code>anGoodsStatusType</code>.
     */

    public static PhotoMatchIndicatorType getGoodsStatusType(
                final String pPhotoMatchIndicatorTypeCode) {
        PhotoMatchIndicatorType anPhotoMatchIndicatorType = null;
        for (final PhotoMatchIndicatorType aType : PhotoMatchIndicatorType.values()) {
            if (pPhotoMatchIndicatorTypeCode.equalsIgnoreCase(aType.name())
                        || pPhotoMatchIndicatorTypeCode.equalsIgnoreCase(aType.getCode())) {
                anPhotoMatchIndicatorType = aType;
                break;
            }
        }

        return anPhotoMatchIndicatorType;
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
     * @param <code>code</code>
     *        Holds the new value of the <code>code</code> property.
     */
    public void setCode(String code) {
        this.code = code;
    }
}
