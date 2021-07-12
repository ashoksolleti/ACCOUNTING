package com.unisys.trans.logistics.lms.framework.constants;

/**
 * <code>ElementType</code> holds the constants to indicate ElementType
 * applied.
 * <p>
 * Following are the possible ElementType:<br>
 * <ul>
 * <li>A
 * <li>F
 * <li>D
 * <li>U
 * <li>R
 * <li>W
 * <li>C
 * <li>AEE
 * <li>AEX
 * <li>AEP
 * <li>AEC
 * <li>AAM
 * **/

public enum ElementType {

    /**
     * Constant used for AWB.
     */
    A("A"),
    /**
     * Constant used for CNE.
     */
    F("F"),
    /**
     * Constant used for COI.
     */
    D("D"),
    /**
     * Constant used for CUS.
     */
    U("U"),
    /**
     * Constant used for DES.
     */
    R("R"),
    /**
     * Constant used for DIM.
     */
    W("W"),
    /**
     * Constant used for C.
     */
    C("CONFIG"),

    /**
     * Constant used for LAST.
     */
    L("LAST"),

    /**
     * Constant used for AEE.
     */
    AEE("AEE"),

    /**
     * Constant used for LAST.
     */
    LAST("LAST"),

    AEI("AEI"),

    UEI("UEI"),

    AEC("AEC"),

    UEC("UEC"),

    UEW("UEW"),

    UEP("UEP"),

    FEC("FEC"),

    AII("AII"),

    UII("UII"),

    AID("AID"),

    UIC("UIC"),

    FEO("FEO"),

    AEO("AEO"),

    AIU("AIU"),

    AAM("AAM"),

    FEB("FEB"),

    FIC("FIC"),

    AIS("AIS"),
    
    AIP("AIP"),
    
    APS("APS"),
    
    AIL("AIL"),
    
    UNC("UNC"),
    FFM("FFM"),
    // LMSC-11111 UIS158 Start
    UWS("UWS"),
    
    SEQ("SEQ"),
    
    UCR("UCR"),
    
    UCM("UCM"),
    
    TTL("TTL"),
    
    ULD("ULD"),
    
    LUR("LUR"),
    
    LUC("LUC"),
    
    LDC("LDC"),
    
    RUI("RUI"),
    
    RUS("RUS"),
    
    MUC("MUC"),

    SSR("SSR"),
    
    SI("SI"),
    
    SCM("SCM"),
    
    MVT("MVT");
    // LMSC-11111 UIS158 End   
	
	public static ElementType getIMPMessageType(final String pMessageType) {

        ElementType anIMPMessageTypeValue = null;
        for (final ElementType aType : ElementType.values()) {
            if (aType.getValue().equals(pMessageType)) {
                anIMPMessageTypeValue = aType;
                break;
            }
        }
        return anIMPMessageTypeValue;

    }
	
    private String value;

    /**
     * Constructor with <code>MessageLineType</code> as an argument.
     * <p>
     * 
     * @param pValue
     *            the new value of the <code>value</code>.<br>
     */
    private ElementType(final String pValue) {
        this.value = pValue;
    }

    /**
     * Gets the value.
     * <p>
     * 
     * @return the current value of <code>value</code> property.<br>
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Sets the value.
     * <p>
     * 
     * @param pValue
     *            the current value of <code>value</code> property.<br>
     */
    public void setValue(final String pValue) {
        this.value = pValue;
    }

}
