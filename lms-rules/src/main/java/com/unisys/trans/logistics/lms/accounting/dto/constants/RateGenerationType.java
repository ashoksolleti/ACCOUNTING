package com.unisys.trans.logistics.lms.accounting.dto.constants;

import java.util.ArrayList;
import java.util.List;

public enum RateGenerationType {
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	SRA_WITH_NO_SPECIAL_INSTRUCTIONS("SRA With No Special Instructions","A"),
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	SRA_WITH_SPECIAL_INSTRUCTIONS("SRA With Special Instructions","B"),
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	RATE_CONSTRUCTED_WITH_NO_SPECIAL_INSTRUCTIONS("Rate Constructed With No Special Instructions","D"),
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	ERROR("Error","E"),
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	AUTOMATIC_RATING("Automatic Rating","G"),
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * * @generated
	 * "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	JOINT_RATING("Joint Rating","J"),
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * * @generated
	 * "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	CLASS_RATING("Class Rating","P"),
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	RATE_CONSTRUCTED_WITH_SPECIAL_INSTRUCTIONS("Rate Constructed With Special Instructions ","H"),
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	CONTRACT_WITH_INSTRUCTIONS("Contract With Instructions","I"),
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	CONTRACT_WITH_NO_INSTRUCTIONS("Contract With No Instructions","K"),
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	MANUALLY_ENTERED_BY_AGENT("Manually Entered By Agent","M"),
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	NO_RATE("No Rate","N"),
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	MANUAL_CLASS_RATE("Manual Class Rate","Q"),
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	MANUAL_JOINT_RATE("Manual Joint Rate","T"),
	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	DELETE_RATING_LINE("Delete Rating Line","X"),

	/**
	 * <!-- begin-UML-doc --> <!-- end-UML-doc -->
	 * 
	 * @generated 
	 *            "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	FREE_LINE_FOR_SERVICE_FREIGHT("Free Line For Service Freight","S");

	 /**
     * Attribute to hold the <code>rateGeneration</code> property.
     */
    private String rateGeneration;
    
	/**
     * @return the rateGeneration
     */
    public String getRateGeneration() {
        return this.rateGeneration;
    }

    private String rateGenType;

	RateGenerationType(final String pRateGen,final String pRateGenType) {
		this.rateGeneration = pRateGen; 
	    this.rateGenType = pRateGenType;
	}

	public static RateGenerationType fromValue(final String pRateGenType) {

		RateGenerationType aMatchedRateGenerationType = null;
		for (final RateGenerationType bRateGenerationType : RateGenerationType
				.values()) {
			if (bRateGenerationType.getRateGenType().equalsIgnoreCase(pRateGenType)) {
				aMatchedRateGenerationType = bRateGenerationType;
				break;
			}
		}
		return aMatchedRateGenerationType;
	}

	public void setRateGenType(final String pRateGenType) {
        this.rateGenType = pRateGenType;
    }

    public String getRateGenType() {
		return this.rateGenType;
	}

	// Valid indicators when prices are generated.
	public static List<String> validGenerationInds() {
		final List<String> theValidGenInds = new ArrayList<String>();

		theValidGenInds.add(RateGenerationType.AUTOMATIC_RATING.value());
		theValidGenInds.add(RateGenerationType.JOINT_RATING.value());
		theValidGenInds
				.add(RateGenerationType.RATE_CONSTRUCTED_WITH_NO_SPECIAL_INSTRUCTIONS
						.value());
		theValidGenInds
				.add(RateGenerationType.RATE_CONSTRUCTED_WITH_SPECIAL_INSTRUCTIONS
						.value());
		theValidGenInds.add(RateGenerationType.SRA_WITH_NO_SPECIAL_INSTRUCTIONS
				.value());
		theValidGenInds.add(RateGenerationType.SRA_WITH_SPECIAL_INSTRUCTIONS
				.value());
		theValidGenInds.add(RateGenerationType.CONTRACT_WITH_NO_INSTRUCTIONS
				.value());
		theValidGenInds.add(RateGenerationType.CONTRACT_WITH_INSTRUCTIONS.value());

		return theValidGenInds;
	}

	public String value() {
		return this.getRateGenType();
	}
}
