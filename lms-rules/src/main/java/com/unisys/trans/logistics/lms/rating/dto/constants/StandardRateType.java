package com.unisys.trans.logistics.lms.rating.dto.constants;

/**
 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
 * 
 * @generated 
 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public enum StandardRateType {
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	GEN("GEN"),
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	SCR("SCR"),
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	GCR("GCR"),
	/**
     * <!-- begin-UML-doc --> <!-- end-UML-doc -->
     * 
     * @generated 
     *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
     */
    STF("STF"),
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	ULD("ULD");

	private final String rateTypeCode;

	StandardRateType(String pRateType) {
		this.rateTypeCode = pRateType;
	}

	public String getRateTypeCode() {
		return rateTypeCode;
	}

	public static boolean isStandardRateType(String pRateType) {
		boolean isValid = false;
		if (GEN.getRateTypeCode().equalsIgnoreCase(pRateType)
				|| GCR.getRateTypeCode().equalsIgnoreCase(pRateType)
				|| SCR.getRateTypeCode().equalsIgnoreCase(pRateType)
				|| STF.getRateTypeCode().equalsIgnoreCase(pRateType)
				|| ULD.getRateTypeCode().equalsIgnoreCase(pRateType)) {
			isValid = true;
		}
		return isValid;
	}
}
