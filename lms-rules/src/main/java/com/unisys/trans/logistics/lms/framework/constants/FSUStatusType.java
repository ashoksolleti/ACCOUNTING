package com.unisys.trans.logistics.lms.framework.constants;

/**
 * <code>FSUStatusType</code> holds the constants to indicate FSU Status Type applied.
 * <p>
 * Following are the possible FSUStatusType:<br>
 * <ul>
 * <li>RCS
 * <li>RCT
 * <li>RCF
 * <li>BKD
 * <li>MAN
 * <li>DEP
 * <li>PRE
 * <li>TRM
 * <li>TFD
 * <li>NFD
 * <li>AWD
 * <li>CCD
 * <li>DLV
 * <li>DIS
 * <li>CRC
 * <li>DDL
 * <li>TGC
 * <li>ARR
 * <li>AWR
 * <li>FOH
 * <li>FAR
 * <li>FDA
 * <li>FPS
 * <li>RCC
 * <li>RCD
 * <li>RCG
 * <li>ULD
 * <li>OSI
 * </ul>
 */
public enum FSUStatusType {
    /**
     * Constant used for RCS.
     */
    RCS("RCS"),
    /**
     * Constant used for RCT.
     */
    RCT("RCT"),
    /**
     * Constant used for RCF.
     */
    RCF("RCF"),
    /**
     * Constant used for BKD.
     */
    BKD("BKD"),
    /**
     * Constant used for MAN.
     */
    MAN("MAN"),
    /**
     * Constant used for DEP.
     */
    DEP("DEP"),
    /**
     * Constant used for PRE.
     */
    PRE("PRE"),
    /**
     * Constant used for TRM.
     */
    TRM("TRM"),
    /**
     * Constant used for TFD.
     */
    TFD("TFD"),
    /**
     * Constant used for NFD.
     */
    NFD("NFD"),
    /**
     * Constant used for AWD.
     */
    AWD("AWD"),
    /**
     * Constant used for CCD.
     */
    CCD("CCD"),
    /**
     * Constant used for DLV.
     */
    DLV("DLV"),
    /**
     * Constant used for DIS.
     */
    DIS("DIS"),
    /**
     * Constant used for CRC.
     */
    CRC("CRC"),
    /**
     * Constant used for DDL.
     */
    DDL("DDL"),
    /**
     * Constant used for TGC.
     */
    TGC("TGC"),
    /**
     * Constant used for ARR.
     */
    ARR("ARR"),
    /**
     * Constant used for AWR.
     */
    AWR("AWR"),
    /**
     * Constant used for FOH.
     */
    FOH("FOH"),
    /**
     * Constant used for FAR.
     */
    FAR("FAR"),
    /**
     * Constant used for FDA.
     */
    FDA("FDA"),
    /**
     * Constant used for FPS.
     */
    FPS("FPS"),
    /**
     * Constant used for RCC.
     */
    RCC("RCC"),
    /**
     * Constant used for RCG.
     */
    RCG("RCG"),
    /**
     * Constant used for RCD.
     */
    RCD("RCD"),
    /**
     * Constant used for ULD.
     */
    ULD("ULD"),
    /**
     * Constant used for OSI.
     */
    OSI("OSI"),
    //AC416
    /**
     * Constant used for Enhanced FSU-BKD.
     */
    EBK("EBKD");
    /**
     * Attribute to hold the <code>value</code> property.
     */
    private String value;

    /**
     * Constructor with <code>MessageLineType</code> as an argument.
     * <p>
     * 
     * @param pValue
     *            the new value of the <code>value</code>.<br>
     */
    private FSUStatusType(final String pValue) {
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