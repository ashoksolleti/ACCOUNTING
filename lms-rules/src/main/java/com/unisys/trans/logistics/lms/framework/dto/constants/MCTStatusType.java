package com.unisys.trans.logistics.lms.framework.dto.constants;

/**
 * <code>MCTStatusType</code> holds the constants to indicate MCTStatusType
 * applied.
 * <p>
 * Following are the possible MCTStatusType:<br>
 * <ul>
 * <li>IMPOSSIBLE
 * <li>NO_ISSUES
 * <li>INSUFFICIENT
 * 
 * </ul>
 * **/

public enum MCTStatusType {
    /**
     * This is an enumerated MCTStatusType constant to specify MCT status type -
     * IMPOSSIBLE
     * <p>
     * value = {@value}
     */
    IMPOSSIBLE("2"),
    /**
     * This is an enumerated MCTStatusType constant to specify MCT status type -
     * INSUFFICIENT
     * <p>
     * value = {@value}
     */
    INSUFFICIENT("1"),
    /**
     * This is an enumerated MCTStatusType constant to specify MCT status type -
     * NO_ISSUES
     * <p>
     * value = {@value}
     */
    NO_ISSUES("0");
    /**
     * Attribute to holds <code> mCTStatusType</code> property.
     */
    private String mCTStatusType;

    /**
     * Constructor with StatusType as an argument.
     * <p>
     * 
     * @param pStatusType
     *            Holds the mCTStatusType.
     */
    private MCTStatusType(final String pStatusType) {
        this.mCTStatusType = pStatusType;
    }

    /**
     * Gets the value of the MCTStatusType property.
     * 
     */
    public String getMCTStatusType() {
        return this.mCTStatusType;
    }

    /**
     * Sets the value of the MCTStatusType property.
     * 
     */

    public void setMCTStatusType(final String pMCTStatusType) {
        this.mCTStatusType = pMCTStatusType;
    }

    /**
     * Gives the string format of enumerated <code>MCTStatusType</code>.
     * <p>
     * 
     * @return the current string value of the <code>MCTStatusType</code>.
     */
    public String value() {
        return this.mCTStatusType;
    }
}
