package com.unisys.trans.logistics.lms.framework.dto.constants.operation;

/** 
 * <p>        RCS: Goods Accepted</p>
 * <p>      FSU_RCS_A: FSU RCS Goods Accepted ,(A) - Goods created through FSU.</p>
 * <p>       FSU_RCS_I : FSU RCS  Goods Accepted  FSU, (I) - Information (No goods created through FSU)</p>
 * <p>       TFD : Goods Status Change Interline Transfer</p>
 * <p>       MAN:Assign Goods to Flight</p>
 * <p>        EFM_I : Enter Flight Manifest , (I) - Information</p>
 * <p>        EFM_A : Enter Flight Manifest , (A) - Action</p>
 * <p>        AHD: Goods Status Change  Carrier Hold</p>
 * <p>        OND : Goods Status Change  Gone on Delivery</p>
 * <p>       DLV : Goods Status Change  Delivered</p>
 * <p>       AHL : Goods Status Change  Authorized Carrier Hold</p>
 * <p>        CHC : Goods Status Change  Cleared from Carrier Hold</p>
 * <p>        NFD : Goods Status Change  Notified for Import Pick-up</p>
 * <p>        FWB : Goods Status Change  Forwarded to Bonded Warehouse</p>
 * <p>        GND : Goods Status Change  Not Deliverable</p>
 * <p>        DOS : Goods Status Change  Delivered on a Substitute Air Waybill</p>
 * <p>        TXS : Goods Status Change  Transferred Surface</p>
 * <p>       GRE : Goods Status Change  Returned from Gone on Delivery</p>
 * <p>        DLM : Print Transfer Manifest</p>
 * <p>        TRM : Print Transfer Manifest</p>
 * <p>        FSU_DDL : Goods Door Delivered  FSU</p>
 * <p>        FSU_RFT : Goods Accepted Interline  FSU</p>
 * <p>       FSU_DIS_OFLD_A FSU DIS(OFLD)  Goods Action</p>
 * <p>        FSU_DIS_OFLD_I FSU DIS (OFLD)</p>
 * <p>        FSU_OVI_I FSU DIS (OVI)</p>
 * <p>        FSU_MSC FSU DIS (MSC)</p>
 * <p>        FSU_SSC_I FSU DIS (SSC)</p>
 * <p>        FSU_FDC_I FSU DIS (FDC)</p>
 * <p>        UPDATE_CONTAINER_CLOSE Update Container Information  Close Container</p>
 * <p>        RCT Accept Goods  Accepted Interline</p>
 * <p>        EFM_MAN Enter Flight Manifest  Assign Goods to Flight as Finalized</p>
 * <p>        EFM_FINALIZATION Enter Flight Finalization</p>
 * <p>        Goods Check In  Non-Equipped Station</p>
 * <p>        ANS (If the attribute  Status for Non-Mechanized Check-In is set to Non-Verified )    </p>
 * <p>        UNA Goods Check In  Non-Equipped Station</p>
 * <p>        (If the attribute  Status for Non-Mechanized Check-In is set to Verified by FSU RCF)    </p>
 * <p>        CIU Goods Check In  ULD Breakdown</p>
 * <p>        UED Change Container Information  Empty Container onto Flight</p>
 * <p>        RCF Goods Check In</p>
 * <p>        CIE Goods Check In (for Goods in Transit)</p>
 * <p>        FSU_ULB_A FSU RCF  Goods Action for goods in a breakdown ULD</p>
 * <p>        FSU_CIE_A FSU RCF  Goods Action for goods in a transit ULD</p>
 * <p>        FSU_RCF_A FSU RCF  Goods Action for goods in a terminating ULD that has not been checked-in yet</p>
 * <p>        FDC Goods Discrepancy (Found Cargo)</p>
 * <p>        MSC Goods Discrepancy (Missing Cargo)</p>
 * <p>        SSC Goods Discrepancy (Short Shipped Cargo)</p>
 * <p>        OVI Goods Discrepancy (Over Carried Cargo)</p>
 * <p>        FBA Goods Discrepancy (Balanced Found Cargo)</p>
 * <p>        MSB Goods Discrepancy (Balanced Missing Cargo)</p>
 * <p>        FDI Goods Information (Pieces Increased)</p>
 * <p>        FDD Goods Information (Pieces Decreased)</p>
 * <p>        WGI Goods Information (Weight Increased)</p>
 * <p>        WGD Goods Information (Weight Decreased)</p>
 * <p>        EFM_INTERLINE_GOODS_RECEIVED Enter Transfer Manifest  Interline Goods are Received</p>
 * <p>        EFM_INTERLINE_GOODS_ISSUED Enter Transfer Manifest  Interline Goods are Issued</p>
 * <p>        Remove Goods From Flight</p>
 * <p>        GRF </p>
 * <p>        RFF Documents Arrived</p>
 * <p>        LOC Change Goods Location</p>
 * <p>        SPI Goods Status Change  Surface Pick Up</p>
 * <p>        UPDATE_CONTAINER_CLOSE Change Container Information  Close Container</p>
 * <p></p>
 */
/**
 <code>ShipmentHistoryEventType </code> class represents the ShipmentHistoryEventType Information
 */
/**
 <code>ShipmentHistoryEventType </code> class represents the ShipmentHistoryEventType Information
 */
/**
 <code>ShipmentHistoryEventType </code> class represents the ShipmentHistoryEventType Information
 */
/**
 * <code>ShipmentHistoryEventType </code> class represents the
 * ShipmentHistoryEventType Information
 */
public enum ShipmentHistoryEventType {
    RCS("RCS"),
    FSU_RCS_A("FSU_RCS_A"),
    FSU_RCS_I("FSU_RCS_I"),
    TFD("TFD"),
    FSU_TFD_A("FSU_TFD_A"),
    FSU_TFD_I("FSU_TFD_I"),
    MAN("MAN"),
    EFM_A("EFM_A"),
    EFM_I("EFM_I"),
    DLV("DLV"),
    OND("OND"),
    AHD("AHD"),
    AHL("AHL"),
    CHC("CHC"),
    NFD("NFD"),
    FWB("FWB"),
    GND("GND"),
    DOS("DOS"),
    TXS("TXS"),
    GRE("GRE"),
    DLM("DLM"),
    TRM("TRM"),
    FSU_DLV_A("FSU_DLV_A"),
    FSU_DLV_I("FSU_DLV_I"),
    FSU_DDL("FSU_DDL"),
    FSU_RCT("FSU_RCT"),
    FSU_RCF("FSU_RCF"),
    FSU_MAN("FSU_MAN"),
    FSU_DEP("FSU_DEP"),
    FSU_PRE("FSU_PRE"),
    FSU_TRM("FSU_TRM"),
    FSU_AWD("FSU_AWD"),
    FSU_NFD("FSU_NFD"),
    FSU_DIS_OFLD_A("FSU_DIS_OFLD_A"),
    FSU_DIS_OFLD_I("FSU_DIS_OFLD_I"),
    FSU_OVI_I("FSU_OVI_I"),
    FSU_MSC("FSU_MSC"),
    FSU_SSC_I("FSU_SSC_I"),
    FSU_FDC_I("FSU_FDC_I"),
    UPDATE_CONTAINER_CLOSE("UPDATE_CONTAINER_CLOSE"),
    RCT("RCT"),
    DEP("DEP"),
    EFM_DEP("EFM_DEP"),
    ANS("ANS"),
    UNA("UNA"),
    CIU("CIU"),
    UED("UED"),
    RCF("RCF"),
    CIE("CIE"),
    FSU_ULB_A("FSU_ULB_A"),
    FSU_CIE_A("FSU_CIE_A"),
    FSU_RCF_A("FSU_RCF_A"),
    FSU_RCF_I("FSCU_RCF_I"),
    FDC("FDC"),
    MSC("MSC"),
    SSC("SSC"),
    OVI("OVI"),
    FBA("FBA"),
    FOH("FOH"),
    MSB("MSB"),
    FDI("FDI"),
    FDD("FDD"),
    WGI("WGI"),
    WGD("WGD"),
    EFM_INTERLINE_GOODS_RECEIVED("EFM_INTERLINE_GOODS_RECEIVED"),
    EFM_INTERLINE_GOODS_ISSUED("EFM_INTERLINE_GOODS_ISSUED"),
    GRF("GRF"),
    RFF("RFF"),
    LOC("LOC"),
    SPI("SPI"),
    FSU_RCC_I("FSU_RCC_I"),
    FSU_RCD_I("FSU_RCD_I"),
    FSU_FPS_I("FSU_FPS_I"),
    CHANGE_CONTAINER_CLOSE("CHANGE_CONTAINER_CLOSE"),
    FSU_FAR("FSU_FAR"),
    FAR("FAR"),
    FSU_FOH("FSU_FOH"),
    FSU_CCD("FSU_CCD"),
    FSU_CRC("FSU_CRC"),
    FSU_TGC("FSU_TGC"),
    FSU_DIS_M("FSU_DIS_M"),
    CLRD_CUSTMS("CLRD_CUSTMS"),
    IN_CUSTOMS_AUTO("IN_CUSTOMS_AUTO"),
    PART_CLEAR("PART_CLEAR"),
    FSU_DIS_F("FSU_DIS_F"),
    SCRN("SCRN"), 
    DOC_RCVD("DOC_RCVD"),
    TGC("TGC"),
    AWD("AWD"),
    CHN_ULD("CHN_ULD"),
    DOC_DLV("DOC_DLV"),
    DOC_EXP("DOC_EXP"),
    DOC_IMP("DOC_IMP"),
    CLRD_CUSTMS_AUTO("CLRD_CUSTMS_AUTO"),
    AUTH_INB("AUTH_INB"),
    AUTH_LOC("AUTH_LOC"),
    HLD_CLR("HLD_CLR"),
    ULE("ULE"),
    FSU_NFS("FSU_NFS"),
    FSU_AWR("FSU_AWR"),
    DOC_MISSING("DOC_MISSING"),
    DOC_FOUND("DOC_FOUND"),
    DOC_UNDO("DOC_UNDO"),
    DOC_IMP_FOUND("DOC_IMP_FOUND"),
    DOC_IMP_MISSING("DOC_IMP_MISSING"),
    DOC_IMP_UNDO("DOC_IMP_UNDO"),
    DOCUMENT_RCVD_MISSING("DOCUMENT_RCVD_MISSING"),
    DOCUMENT_RCVD_FOUND("DOCUMENT_RCVD_FOUND"),
    DOCUMENT_RCVD_UNDO("DOCUMENT_RCVD_UNDO"),
	IGH("IGH"); // RFC CPS147 Change
     
    /**
     * Attribute to hold <code>shipmentHistoryEventType<code> property
     */
    private String shipmentHistoryEventType;

    /**
     * Default Constructor
     */
    private ShipmentHistoryEventType(final String pShipmentHistoryEventType) {
        this.shipmentHistoryEventType = pShipmentHistoryEventType;
    }

    /**
     * @param pShipmentHistoryEventType
     * @return
     */
    public static ShipmentHistoryEventType getShipmentHistoryEventType(
            final String pShipmentHistoryEventType) {

        ShipmentHistoryEventType aShipmentHistoryEventType = null;

        for (final ShipmentHistoryEventType aType : ShipmentHistoryEventType
                .values()) {

            if (pShipmentHistoryEventType.equals(aType.value())) {
                aShipmentHistoryEventType = aType;
                break;
            }
        }
        return aShipmentHistoryEventType;

    }

    /**
     * @return
     */
    public String value() {
        return this.shipmentHistoryEventType;
    }
}
