/**
 * 
 */
package com.unisys.trans.logistics.lms.framework.constants;

/**
 * @author Unisys
 *
 */
public enum RatingDescriptionType {

    /**
     * This is an enumerated GenIdType constant to specify GenId Type C.
     */
    GENERATED_DETAILS("Generated Details"),

    /**
     * This is an enumerated GenIdType constant to specify GenId Type D.
     */
    DIMENSIONS("Dimensions"),

    /**
     * This is an enumerated GenIdType constant to specify GenId Type E.
     */
    DESCRIPTION("Description"),

    /**
     * This is an enumerated GenIdType constant to specify GenId Type F.
     */
    ULD_IDENTIFIERS("ULD Identifiers");

    /**
     * Attribute to hold the <code>PayCodeType</code> property.
     */
    private String type;
    
    /**
     * Constructor with <code>PayCodeType</code> as an argument.
     * <p>
     * 
     * @param pType
     *            the new value of the <code>type</code>.<br>
     */

    private RatingDescriptionType(final String pType) {
        this.setType(pType);
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * The <code>value</code> method gives the string format of PayCodeType.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the enumerated value of the PayCodeType.<br>
     */
    public String value() {
        return this.type;
    }
}
