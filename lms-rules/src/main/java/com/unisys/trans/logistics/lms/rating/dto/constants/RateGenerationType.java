/**
 * 
 */
package com.unisys.trans.logistics.lms.rating.dto.constants;

import java.util.ArrayList;
import java.util.List;

/**
 * <!-- begin-UML-doc. -->
 * <!-- end-UML-doc. -->
 * 
 * @author MuthusaB1
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public enum RateGenerationType {
    /**
     * <!-- begin-UML-doc -->
     * <!-- end-UML-doc -->
     * 
     * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
     */
    SRA_WITH_NO_SPECIAL_INSTRUCTIONS("A"),
    /**
     * <!-- begin-UML-doc -->
     * <!-- end-UML-doc -->
     * 
     * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
     */
    SRA_WITH_SPECIAL_INSTRUCTIONS("B"),
    /**
     * <!-- begin-UML-doc -->
     * <!-- end-UML-doc -->
     * 
     * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
     */
    RATE_CONSTRUCTED_WITH_NO_SPECIAL_INSTRUCTIONS("D"),
    /**
     * <!-- begin-UML-doc -->
     * <!-- end-UML-doc -->
     * 
     * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
     */
    ERROR("E"),
    /**
     * <!-- begin-UML-doc -->
     * <!-- end-UML-doc -->
     * 
     * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
     */
    AUTOMATIC_RATING("G"),
    /**
     * <!-- begin-UML-doc -->
     * <!-- end-UML-doc -->
     * 
     * * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
     */
    JOINT_RATING("J"),
    /**
     * <!-- begin-UML-doc -->
     * <!-- end-UML-doc -->
     * 
     * * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
     */
    CLASS_RATING("P"),
    /**
     * <!-- begin-UML-doc -->
     * <!-- end-UML-doc -->
     * 
     * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
     */
    RATE_CONSTRUCTED_WITH_SPECIAL_INSTRUCTIONS("H"),
    /**
     * <!-- begin-UML-doc -->
     * <!-- end-UML-doc -->
     * 
     * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
     */
    CONTRACT_WITH_INSTRUCTIONS("I"),
    /**
     * <!-- begin-UML-doc -->
     * <!-- end-UML-doc -->
     * 
     * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
     */
    CONTRACT_WITH_NO_INSTRUCTIONS("K"),
    /**
     * <!-- begin-UML-doc -->
     * <!-- end-UML-doc -->
     * 
     * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
     */
    MANUALLY_ENTERED_BY_AGENT("M"),
    /**
     * <!-- begin-UML-doc -->
     * <!-- end-UML-doc -->
     * 
     * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
     */
    NO_RATE("N"),
    /**
     * <!-- begin-UML-doc -->
     * <!-- end-UML-doc -->
     * 
     * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
     */
    MANUAL_CLASS_RATE("Q"),
    /**
     * <!-- begin-UML-doc -->
     * <!-- end-UML-doc -->
     * 
     * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
     */
    MANUAL_JOINT_RATE("T"),
    /**
     * <!-- begin-UML-doc -->
     * <!-- end-UML-doc -->
     * 
     * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
     */
    DELETE_RATING_LINE("X");

    private String rateGenType;

    RateGenerationType(final String pRateGenType) {
        this.rateGenType = pRateGenType;
    }

    public static RateGenerationType fromValue(final String pRateGenType) {

        RateGenerationType aRateGenerationType = null;
        for (final RateGenerationType bRateGenerationType : RateGenerationType.values()) {
            if (bRateGenerationType.getRateGenType().equals(pRateGenType)) {
                aRateGenerationType = bRateGenerationType;
                break;
            }
        }
        return aRateGenerationType;
    }

    public String getRateGenType() {
        return this.rateGenType;
    }

    // Valid indicators when prices are generated.
    public static List<String> validGenerationInds() {
        final List<String> validGenInds = new ArrayList<String>();

        validGenInds.add(RateGenerationType.AUTOMATIC_RATING.value());
        validGenInds.add(RateGenerationType.JOINT_RATING.value());
        validGenInds.add(RateGenerationType.RATE_CONSTRUCTED_WITH_NO_SPECIAL_INSTRUCTIONS.value());
        validGenInds.add(RateGenerationType.RATE_CONSTRUCTED_WITH_SPECIAL_INSTRUCTIONS.value());
        validGenInds.add(RateGenerationType.SRA_WITH_NO_SPECIAL_INSTRUCTIONS.value());
        validGenInds.add(RateGenerationType.SRA_WITH_SPECIAL_INSTRUCTIONS.value());
        validGenInds.add(RateGenerationType.CONTRACT_WITH_NO_INSTRUCTIONS.value());
        validGenInds.add(RateGenerationType.CONTRACT_WITH_INSTRUCTIONS.value());

        return validGenInds;
    }

    public String value() {
        return this.getRateGenType();
    }
}