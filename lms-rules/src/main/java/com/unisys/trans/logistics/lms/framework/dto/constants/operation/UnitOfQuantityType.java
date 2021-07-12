/**
 * 
 */
package com.unisys.trans.logistics.lms.framework.dto.constants.operation;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author ATs
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public enum UnitOfQuantityType {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	KG("KG"),
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	G("G"),
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	L("L"),
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	ML("ML"),
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	KBQ("KBQ"),
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	MBQ("MBQ"),
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	GBQ("GBQ"),
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	TBQ("TBQ"),
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	PBQ("PBQ"),
	   /** 
     * <!-- begin-UML-doc -->
     * <!-- end-UML-doc -->
     * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
     */
    LB("LB"), 
    
    TI("TI");
	
	/**
     * Attribute to hold <code>UnitOfQuantityType</code>.
     */
    private String unitOfQuantityType;

    /**
     * Parameterized Constructor.
     * <p>
     * 
     * @param pUnitOfQuantityType
     *            the new value of <code>UnitOfQuantityType</code>.
     */
    private UnitOfQuantityType(final String pUnitOfQuantityType) {
        this.unitOfQuantityType = pUnitOfQuantityType;
    }

    /**
     * Gets the <code>UnitOfQuantityType</code>.
     * <p>
     * 
     * @param pUnitOfQuantityType
     *            the new value of <code>UnitOfQuantityType</code>.
     *            <p>
     * @return the current value of <code>UnitOfQuantityType</code><br>
     */
    public static UnitOfQuantityType getUnitOfQuantityType(final String pUnitOfQuantityType) {

        UnitOfQuantityType aUnitOfQuantityType = null;

        for (final UnitOfQuantityType aType : UnitOfQuantityType.values()) {

            if (pUnitOfQuantityType.equals(aType.value())) {
                aUnitOfQuantityType = aType;
                break;
            }
        }
        return aUnitOfQuantityType;

    }

    /**
     * Gives the string format of enumerated <code>UnitOfQuantityType</code> for an air waybill.
     * <p>
     * 
     * @return the current value of the <code>UnitOfQuantityType</code>.
     */
    public String value() {
        return this.unitOfQuantityType;
    }
}