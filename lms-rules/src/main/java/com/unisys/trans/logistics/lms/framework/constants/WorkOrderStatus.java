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
public enum WorkOrderStatus {
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 *
	 * @generated
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	CLOSED("Closed"),
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 *
	 * @generated
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	FULLY_COMPLETE("Fully Complete"),
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 *
	 * @generated
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	OPEN("Open"),

	PARTIAL("Partial"),
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 *
	 * @generated
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	PARTIAL_COMPLETE("Partially Complete"),
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 *
	 * @generated
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	STARTED("Started"),
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 *
	 * @generated
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	UNSERVICEABLE_EMPTY("Unserviceable Empty");

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
	WorkOrderStatus(final String pType) {
		this.type = pType;
	}

	public String getType() {
		return this.type;
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
		return this.type;
	}
}