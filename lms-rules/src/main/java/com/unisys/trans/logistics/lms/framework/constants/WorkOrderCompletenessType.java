package com.unisys.trans.logistics.lms.framework.constants;

/**
 *
 */

/**
 * <!-- begin-UML-doc -->
 * <p>
 * This constant types are used to change the workorder status.When user is
 * trying to complete the workorder actor have to select one value from
 * completeness drop down from UI.
 * </p>
 * <!-- end-UML-doc -->
 * 
 * @author ATs
 * @generated 
 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public enum WorkOrderCompletenessType {
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	DAMAGED("Damaged"),
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	EMPTY("Empty"),
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	FULLY("Fully"),
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	PARTIAL("Partial");

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
	WorkOrderCompletenessType(final String pType) {
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