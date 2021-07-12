/**
 * 
 */
package com.unisys.trans.logistics.lms.framework.dto.constants.operation;

/**
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * 
 * @author ATs
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public enum UNIDType {
    /**
     * <!-- begin-UML-doc -->
     * <!-- end-UML-doc -->
     * 
     * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
     */
    C("Cargo Only"),
    /**
     * <!-- begin-UML-doc -->
     * <!-- end-UML-doc -->
     * 
     * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
     */
    L("Limited Quantity"),
    /**
     * <!-- begin-UML-doc -->
     * <!-- end-UML-doc -->
     * 
     * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
     */
    P("Passenger");

    /**
     * Gets the <code>UNIDType</code>.
     * <p>
     * 
     * @param pUNIDType
     *            the new value of <code>UNIDType</code>.
     *            <p>
     * @return the current value of <code>UNIDType</code><br>
     */
    public static UNIDType getUNIDType(final String pUNIDType) {

        UNIDType aUNIDType = null;

        for (final UNIDType aType : UNIDType.values()) {

            if (pUNIDType.equals(aType.value())) {
                aUNIDType = aType;
                break;
            }
        }
        return aUNIDType;

    }

    /**
     * Attribute to hold <code>UNIDType</code>.
     */
    private String unidType;

    /**
     * Parameterized Constructor.
     * <p>
     * 
     * @param pUNIDType
     *            the new value of <code>UNIDType</code>.
     */
    private UNIDType(final String pUNIDType) {
        this.unidType = pUNIDType;
    }

    /**
     * Gives the string format of enumerated <code>UNIDType</code> for an air waybill.
     * <p>
     * 
     * @return the current value of the <code>UNIDType</code>.
     */
    public String value() {
        return this.unidType;
    }
}