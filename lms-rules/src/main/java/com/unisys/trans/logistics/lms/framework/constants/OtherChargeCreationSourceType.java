/**
 * 
 */
package com.unisys.trans.logistics.lms.framework.constants;

/**
 * @author Unisys
 * This enum class is to indicate the source from which the other charges are created.
 */
public enum OtherChargeCreationSourceType {

    /**
     * This is an enumerated OtherChargeCreationSourceType constant to specify GenId Type C.
     */
    PDT("Product code based"),

    /**
     * This is an enumerated GenIdType constant to specify GenId Type D.
     */
    SPL("Special Handling code based"),
    
    /**
     * UC022 has an attribute, automatically add OC.
     * the below enum will be set if the other charge is automatically added from UC022 data set up.
     */
    AUT("Automatically added from othercharge code"),
    
    /**
     * This is an enumerated GenIdType constant to specify GenId Type E.
     * The below enum will be set if the other charge is automatically added based on auto gen parameter.
     */
    PAR("Parameter based OC Addition"),
    
    /**
     * This is an enumerated GenIdType constant to specify GenId Type E.
     */
    TAX("Tax based OC Addition"),
    
    /**
     * This is an enumerated GenIdType constant to specify GenId Type E.
     */
    STN("Station Charge code based");

    /**
     * Attribute to hold the <code>genId</code> property.
     */
    private String ocCreationSrc;

    /**
     * Parameterize constructor.
     * 
     * @param pGenId
     *            the value.
     */
    OtherChargeCreationSourceType(final String pOCCreationSrc) {
        this.ocCreationSrc = pOCCreationSrc;
    }

    /**
     * The <code>value</code> method gives the string format of AccountNumberType.
     * <p>
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the enumerated value of the AccountNumberType.<br>
     */
    public String getOCCreationSrc() {
        return this.ocCreationSrc;
    }

    /**
     * Gives the string format of enumerated <code>GenIdType</code>.
     * <p>
     * 
     * @return the current string value of the <code>GenIdType</code>.
     */
    public String value() {
        return this.name();
    }
}
