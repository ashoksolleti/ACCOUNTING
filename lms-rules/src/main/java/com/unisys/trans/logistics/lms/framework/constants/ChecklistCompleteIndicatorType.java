/**
 * 
 */
package com.unisys.trans.logistics.lms.framework.constants;

/**
 * @author NaikUmak
 *
 */
/**
 * <code>ChecklistCompleteIndicatorType</code> class holds the action type constants.
 */
public enum ChecklistCompleteIndicatorType {
	 /**
     * This is an enumerated action type constant to specify acknowledgment.
     */
    YES("Y"),
    NO("N");

    /**
     * Attribute to hold <code>type</code> property.
     */
    private String type;

    /**
     * <code>Parameterized Constructor.</code>
     * <p>
     * 
     * @param ptype
     *            holds the new value of <code>ptype</code> property.
     */
    private ChecklistCompleteIndicatorType(final String ptype) {
        this.type = ptype;
    }

    /**
     * Gets the <code>ChecklistCompleteIndicatorType</code>.
     * <p>
     * 
     * @param pValue
     *            holds the new value of <code>ChecklistCompleteIndicatorType</code>
     *            <p>
     * @return the current value of <code>ChecklistCompleteIndicatorType</code>
     */
    public static ChecklistCompleteIndicatorType fromValue(final String pValue) {
        return valueOf(pValue);
    }

    /**
     * Gets the <code>type</code> property.
     * <p>
     * 
     * @return the current value of the <code>type</code> property.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Gives the string format of enumerated <code>ChecklistCompleteIndicatorType</code>.
     * <p>
     * 
     * @return the current value of the <code>ChecklistCompleteIndicatorType</code>
     */
    public String value() {
        return this.name();
    }

}
