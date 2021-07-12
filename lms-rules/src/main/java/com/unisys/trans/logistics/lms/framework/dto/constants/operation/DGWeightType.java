/**
 * 
 */
package com.unisys.trans.logistics.lms.framework.dto.constants.operation;

/**
 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
 * 
 * @author ATs
 * @generated
 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public enum DGWeightType {
    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->
     * 
     * @generated
     *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
     */
    NET("Net"),

    GROSS("Gross");

    private String dgWeightType;

    /**
     * Parameterized Constructor.
     * <p>
     * 
     * @param pDGWeightType
     *            the new value of <code>DGWeightType</code>.
     */
    private DGWeightType(final String pDGWeightType) {
        this.dgWeightType = pDGWeightType;
    }

    /**
     * Gets the <code>DGWeightType</code>.
     * <p>
     * 
     * @param pDGWeightType
     *            the new value of <code>DGWeightType</code>.
     *            <p>
     * @return the current value of <code>DGWeightType</code><br>
     */
    public static DGWeightType getDGWeightType(final String pDGWeightType) {

        DGWeightType aDGWeightType = null;

        for (final DGWeightType aType : DGWeightType.values()) {

            if (pDGWeightType.equals(aType.value())) {
                aDGWeightType = aType;
                break;
            }
        }
        return aDGWeightType;

    }

    /**
     * Gives the string format of enumerated <code>DGWeightType</code> for an
     * air waybill.
     * <p>
     * 
     * @return the current value of the <code>DGWeightType</code>.
     */
    public String value() {
        return this.dgWeightType;
    }

}