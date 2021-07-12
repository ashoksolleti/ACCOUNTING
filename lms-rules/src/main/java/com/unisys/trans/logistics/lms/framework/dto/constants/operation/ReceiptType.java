package com.unisys.trans.logistics.lms.framework.dto.constants.operation;

/**
 * 
 */


/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author FlowerHeart
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public enum ReceiptType {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	PRINT("PRINT"),
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	EMAIL("EMAIL");
	
	 private final String value;

	   private ReceiptType(String value) {
	     this.value = value;
	   }

	   public String getValue() {
	     return value;
	   }
}