package com.unisys.trans.logistics.lms.framework.dto.constants;

/**
 * <code>HistoryActionType</code> class holds the HistoryActionType constants.
 * <p>
 */
public enum HouseAirwaybillHistoryActionType {

    /**
     * 'AAAAAAAAAACHANGE-House AWB Information '
     */
    AAAAAAAAAACHANGE(
                "The participant information changed where ‘aaaaaaaaaa’ can be any of the additional participant types (like Agent, Broker etc.). All available data fields for the participant are included in the NEW and OLD entries. The fields displayed are:"
                            + "(Line 1: Account Name Station)"
                            + "(Line 2: Address)"
                            + "(Line 3: City Country State Postal Code.)"
                            + "(When a participant is added, the OLD fields are blank. When a participant is removed, the NEW fields are blank.)"),

    /**
     * 'CONSIGNEECHANGE'
     */
    CONSIGNEECHANGE(
                "The Consignee information changed.All available data fields for the Consignee are included in the NEW and OLD entries. The fields displayed are:"
                            + "(Account Name Station)"
                            + "( Address)"
                            + "( City Country State  Postal Code.)"
                            + "(When a Consignee is added, the OLD fields are blank. When a Consignee is removed, the NEW fields are blank.)"),

    /**
     * 'CONSIGNEETELEPHONECHANE'
     */
    CONSIGNEETELEPHONECHANE("The Consignee Telephone number changed."),

    /**
     * 'CPSCREATED'
     */
    CPSCREATED("A house air waybill is created using CPS."),

    /**
     * 'CPSDELETED'
     */
    CPSDELETED("A house air waybill is deleted using CPS."),
    /**
     * 'CROSSREFERENCECHANGE'
     */
    CROSSREFERENCECHANGE(
                "One of the Cross Reference entries changed.The Cross Reference Type and Number for both, the Cross Reference 1 and the Cross Reference 2 fields, are included in the NEW and OLD entries if present."),

    /**
     * 'CUSTOMSSTATIONCHANGE'
     */
    CUSTOMSSTATIONCHANGE("The Customs Station changed."),

    /**
     * 'CUSTOMSVALUECHANGE'
     */
    CUSTOMSVALUECHANGE("The Customs Value changed."),

    /**
     * 'DECLAREDVALUECHANGE'
     */
    DECLAREDVALUECHANGE("The Declared Value changed."),

    /**
     * 'DESTINATIONCHANGE'
     */
    DESTINATIONCHANGE("The Destination station code changed."),

    /**
     * 'DESTINATIONCURRENCYCHANGES-House AWB Information'
     */
    DESTINATIONCURRENCYCHANGES("The Destination Currency code changed."),

    /**
     * 'EXECUTIONDATECHANGE-House AWB Information'
     */
    EXECUTIONDATECHANGE("The Execution Date changed."),

    /**
     * 'EXPORTPAYMENTCODECHANGE-House AWB Information'
     */
    EXPORTPAYMENTCODECHANGE("The Export Payment Code changed."),

    /**
     * 'FHLCREATED'
     */
    FHLCREATED("A house air waybill is created by an incoming FHL message."),

    /**
     * 'HOUSEAWBINFORMATIONCREATED-House AWB Information'
     */
    HOUSEAWBINFORMATIONCREATED("A house air waybill is created using the LMS House AWB Information function."),

    /**
     * 'HOUSEAWBINFORMATIONDELETED-House AWB Information'
     */
    HOUSEAWBINFORMATIONDELETED("A house air waybill is deleted using the LMS House AWB Information function."),

    /**
     * 'HOUSEGOODSINFORMATIONCREATED-House Goods Information'
     */
    HOUSEGOODSINFORMATIONCREATED(
                "A house air waybill is created using the LMS House Goods Information function."),

    /**
     * 'HOUSEREMARKSCHANGE-House AWB Information'
     */
    HOUSEREMARKSCHANGE(
                "One of the House Remarks fields changed.Both House Remarks fields are included in the NEW and OLD entries if present."),

    /**
     * 'HTSCODESCHANGES-House AWB Information'
     */
    HTSCODESCHANGES(
                "One of the HTS codes changed.Up to ten HTS codes are included in the NEW and OLD entries if present."),

    /**
     * 'IMPORTPAYMENTCODECHANGE'
     */
    IMPORTPAYMENTCODECHANGE("The Import Payment Code changed."),

    /**
     * 'INBONDCHANGE'
     */
    INBONDCHANGE("The Inbond Indicator changed."),

    /**
     * 'INSURANCEVALUEANDCODECHANGE'
     */
    INSURANCEVALUEANDCODECHANGE(
                "The Insurance Value or Insurance Code changed.Both, the Insurance Value and the Insurance Code fields are included in the NEW and OLD entries."),

    /**
     * 'ORIGINCHANGE'
     */
    ORIGINCHANGE("The Origin station code changed."),

    /**
     * 'ORIGINCURRENCYCHANGE'
     */
    ORIGINCURRENCYCHANGE("The Origin Currency code changed."),

    /**
     * 'OTHERCHARGESCHANGE - House AWB Information '
     */
    OTHERCHARGESCHANGE(
                "The Other Charges information changed. All available data fields for all detail lines in the Other Charges section are included in the NEW and OLD entries.The fields displayed are:"
                            + "( Genid  Paycode  Charge Code  Subcode  Due  Amount  Description  Time.)"
                            + "(When the first Other Charges detail line is added, the OLD fields are blank.)"
                            + "( When the last Other Charges detail line is removed, the NEW fields are blank.)"),

    /**
     * 'RATINGDETAILSCHANGE'
     */
    RATINGDETAILSCHANGE(
                "The Rating Details information changed. All available data fields for both detail lines in the Rating Details section are included in the NEW and OLD entries. The fields displayed are:"
                            + "( Pieces   Gross Weight   Chargeable Weight   Rate   Description.)"
                            + "(When the first Rating Details line is added, the OLD fields are blank. When the last Rating Details line is removed, the NEW fields are blank.)"),

    /**
     * 'SHIPPERCHANGE'
     */
    SHIPPERCHANGE(
                "The Shipper information changed. All available data fields for the Shipper are included in the NEW and OLD entries. The fields displayed are:"
                            + ("Account Name Station")
                            + ("Address")
                            + ("City  Country  State  Postal Code.")
                            + ("When a Shipper is added, the OLD fields are blank. When a Shipper is removed, the NEW fields are blank.")),

    /**
     * 'SPECIALHANDLINGCODESCHANGE'
     */
    SPECIALHANDLINGCODESCHANGE(
                "One of the Special Handling Codes changed.Up to five Special Handling Codes are included in the NEW and OLD entries if present."),

    /**
     * 'UNITOFWEIGHTCHANGE'
     */
    UNITOFWEIGHTCHANGE("The Unit of Weight changed."),

    /**
     * 'UNNUMBERSCHANGE'
     */
    UNNUMBERSCHANGE(
                "One of the UN Numbers changed.Up to four UN Numbers are included in the NEW and OLD entries if present."),

    /**
     * 'XMLFHLCREATED - IATA XML House Air Waybill Message'
     */
    XMLFHLCREATED("A house air waybill is created by an incoming IATA XML House Air Waybill (XFHL) message.");

    /**
     * Attribute to hold <code>code</code> property.
     */
    private String code;

    /**
     * default constructor
     */
    HouseAirwaybillHistoryActionType() {

    }

    /**
     * Constructor with <code>actionType</code> as an argument.
     * <p>
     * 
     * @param pCode the new value of the <code>code</code>.<br>
     */
    HouseAirwaybillHistoryActionType(String pCode) {
        this.code = pCode;
    }

    /**
     * Gets the value of the <code>HouseAirwaybillHistoryActionType</code> string.
     * <p>
     * 
     * @return the current value of <code>anHouseAirwaybillHistoryActionType</code>.
     */
    public static HouseAirwaybillHistoryActionType getHouseAirwaybillHistoryActionType(
                final String pHouseAirwaybillHistoryActionTypeCode) {
        HouseAirwaybillHistoryActionType anHouseAirwaybillHistoryActionType = null;
        for (final HouseAirwaybillHistoryActionType aType : HouseAirwaybillHistoryActionType.values()) {
            if (pHouseAirwaybillHistoryActionTypeCode.equalsIgnoreCase(aType.name())
                        || pHouseAirwaybillHistoryActionTypeCode.equalsIgnoreCase(aType.getCode())) {
                anHouseAirwaybillHistoryActionType = aType;
                break;
            }
        }

        return anHouseAirwaybillHistoryActionType;
    }

    /**
     * Attribute to hold the history <code>code</code>.
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
