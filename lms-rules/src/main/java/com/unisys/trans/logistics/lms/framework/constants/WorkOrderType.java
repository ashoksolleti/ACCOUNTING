package com.unisys.trans.logistics.lms.framework.constants;

/**
 *
 */

/**
 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
 *
 * @author ATs
 * @generated
 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public enum WorkOrderType {
    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->
     *
     * @generated
     *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
     */
    GENERAL("General"),

    TCON("Tcon"),
    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->
     *
     * @generated
     *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
     */
    TERMINAL_CONTAINER("Terminal Container"),
    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->
     *
     * @generated
     *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
     */
    TERMINAL_LOCATION("Terminal Location"),

    /**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->
     *
     * @generated
     *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
     */
    ULD("ULD");

    /**
     * The <code>value</code> method gives the string format of action type.
     * <p>
     *
     * @return <code>String</code><br>
     *         Returns the enumerated value of the action type.<br>
     */
    private String type;

    /**
     * Constructor with PayCode as an argument.
     * <p>
     *
     * @param pPayCode
     *            Holds the AWBPaycodeType.
     */
    WorkOrderType(final String pType) {
        type = pType;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    /**
     * Gives the string format of <code>ExportPaymentType</code>.
     * <p>
     *
     * @return the enumerated value of the <code>ExportPaymentType</code>.<br>
     */
    public String value() {
        return type;
    }
}