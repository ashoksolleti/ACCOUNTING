//@formatter:off
/* ====================================== */
/* Copyright(c) 2011 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.framework.constants;

/**
 * 
 * Creation/update source
 * <ul>
 * 
 * <li>S = ESI</li>
 * <li>E = EGI</li>
 * <li>B = EBI OR FFR</li>
 * <li>A = GAC OR GCI mask changes to a lower ordered AWB</li>
 * <li>F = EFM OR FFM</li>
 * <li>D = EGD</li>
 * <li>G = GCI:ACP</li>
 * <li>M = AWB with minimum data the indicators are hierarchical: transactions whose FICSRC setting is higher
 * on the list can update AWB data if the AWB FICSRC is lower on the list. The FICSRC is then overwritten with
 * the new level indicator.</li>
 * <li>T = the indicators are hierarchical: transactions whose FICSRC setting is higher on the list can update
 * AWB data if the AWB FICSRC is lower on the list. The FICSRC is then overwritten with the new level
 * indicator.</li>
 * <li>R = ESI of a REF AWB (ACN = C$RACN)</li>
 * </ul>
 * 
 * @author Unisys
 * 
 */
public enum AirWaybillSourceType {
    /**
     * Constant used for Goods Acceptance.
     */
    A("A","Goods Acceptance"),
    /**
     * Constant used for Booking Information or CIMP FFR message.
     */
    B("B","Booking Information"),
    /**
     * Constant used for Goods Discrepancy.
     */
    D("D"),
    /**
     * Constant used for Enter Goods Information service.
     */
    E("E"),
    /**
     * Constant used for Enter Flight Final service.
     */
    EFF("EFF"),
    /**
     * Constant used for Enter Flight manifest service.
     */
    EFM("EFM"),
   
    /**
     * Constant used for Inbound FSU Messages.
     */
    FSU("FSU"),
    /**
     * Constant used for CIMP FFM message (Flight Manifest) or Enter Flight Manifest.
     */
    F("F"),
    /**
     * Constant used for Check-in Goods/Containers.
     */
    CG("CG"),
    /**
     * Constant used for Non Mechanized Check-in Goods/Containers.
     */
    NCG("NCG"),
    /**
     * Constant used for on Check-in.
     */
    G("G"),
    /**
     * Constant used for Goods Status Change.
     */
    GSC("SC"),   
    /**
     * Constant used for Flight Manifest.
     */
    FM("FM"),
    /**
     * Constant used for Air waybill with minimum data.
     */
    M("M"),
    /**
     * Constant used for Shipment Data Capture of reference air waybill.
     */
    R("R"),
    /**
     * Constant used for Shipment Data Capture of non-reference air waybill.
     */
    S("S","Airwaybill Information"),
    /**
     * Constant used for Express air waybill.
     */
    EA("EA"),
    /**
     * Constant used for air Waybill Charges.
     */
    AC("AC"),
    /**
     * Constant used for INBound Express AWB..
     */
    IB("IB");

    /**
     * The <code>value</code> method gives the string format of action type.
     * <p>
     * 
     * @return <code>String</code><br>
     *         Returns the enumerated value of the action type.<br>
     */
    private String value;
    
    private String description;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private AirWaybillSourceType(String value, String description) {
        this.value = value;
        this.description = description;
    }

    /**
     * Parameterized constructor. Accepts the string representation of the enum
     * as the parameter
     * 
     * @param pValue
     *            String representaion of the enum
     */
    AirWaybillSourceType(final String pValue) {
        this.value = pValue;
    }

    /**
     * Parse the given string and find the matching enumeration constant. If no
     * match is found returns a null value.
     * 
     * @param pValue
     *            String value defined for the enum constant to be found.
     * @return Returns AirWaybillCreationSource Enumerated value , or <code>null</code> if no matching enum is
     *         found.
     */
    AirWaybillSourceType parse(final String pValue) {
        AirWaybillSourceType itemFound = null;
        for (final AirWaybillSourceType item : AirWaybillSourceType
                    .values()) {
            if (pValue.equalsIgnoreCase(item.value)) {
                itemFound = item;
                break;
            }
        }
        return itemFound;
    }
    
    public static boolean isTeleTypeRequest(final AirWaybillSourceType pAirWaybillSourceType){
        return pAirWaybillSourceType !=null && "Teletype"
                    .equalsIgnoreCase(pAirWaybillSourceType.getDescription());
    }
    
    public static boolean isXMLRequest(final AirWaybillSourceType pAirWaybillSourceType){
        return pAirWaybillSourceType !=null && "XML"
                    .equalsIgnoreCase(pAirWaybillSourceType.getDescription());
    }
    
    public static boolean isMessagingRequest(final AirWaybillSourceType pAirWaybillSourceType){
        return isTeleTypeRequest(pAirWaybillSourceType) || isXMLRequest(pAirWaybillSourceType);
    }

}
