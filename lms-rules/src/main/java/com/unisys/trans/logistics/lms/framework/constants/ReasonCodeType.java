package com.unisys.trans.logistics.lms.framework.constants;

import static com.unisys.trans.logistics.lms.framework.constants.Enum_constants.QUEUE_WORD;
public enum ReasonCodeType {

    ACTIVE_ALLOTMENT_INTERFACE_QUEUE("Active Allotment Interface Queue", false, null, "AI"),

    ACTIVE_ALLOTMENT_QUEUE("Active Allotment Change Queue", true, null, "GJ"),

    ACTUAL_RATE_QUEUE("Actual Rate Queue", true, "Queue - Actual Rate", "AR"),

    ADVISORY_QUEUE_CODE("Advisory Queue Code", false, null, "UV"),

    AIRWAYBILL_PROCESSING_QUEUE("Air Waybill Processing Queue", true, "Queue - FWB ESI Processing", "GO"),

    ALLOTMENT_CHANGE_BOOKING_QUEUE("Allotment Change Booking Queue", false, null, "BQ"),

    ALLOTMENT_REPLY_QUEUE("Allotment Reply Queue", true, null, "XN"),

    ALLOTMENT_REQUEST_QUEUE("Allotment Request Queue", true, null, "XL"),

    AUTOMATIC_FLIGHT_FINALIZATION_AND_CHECKIN("Automatic Flight Finalization and Check-in",
                false, null, "PB"),

    AWB_STOCK_REQUEST_QUEUE("AWB Stock Request Queue", true, null, "RS"),

    AWB_STOCK_WARNING_QUEUE("AWB Stock Warning", false, null, "ST"),

    BANK_SELLING_RATE_QUEUE("Bank Selling Rate Queue", false, null, "RB"),

    BKG_ANSWER_MSG_ERROR_QUEUE("Booking Answer Message Error Queue", false,
                null, "BE"),

    BKG_INTERFACE_QUEUE("Booking Interface Queue", false, null, "BI"),

    BKG_REQ_CTRL_QUEUE("Booking Request Control Queue", true, "Queue - Booking Request", "GG"),

    BKG_REQ_MSG_QUEUE("Booking Request Message Queue", false, null, "GA"),

    BOOKING_ANSWER_ADVISORY_QUEUE("Booking Answer Advisory Queue", true, "Queue - GH", "GH"),

    BOOKING_ANSWER_MESSAGE_QUEUE("Booking Answer Message", false, null, "GB"),

    BOOKING_INFORMATION_DELETE_EXPORT_STATION_QUEUE("Booking Information Delete Queue - Export Station",
                true, QUEUE_WORD, "EB"),

    BOOKING_INFORMATION_DELETE_IMPORT_STATION_QUEUE("Booking Information Delete Queue - Import Station",
                true, QUEUE_WORD, "IB"),

    BOOKING_INFORMATION_QUEUE("Booking Information Queue", true, null, "IQ"),

    BOOKING_SERVICE_QUEUE("Booking Service queue", false, null, "IK"),

    BOOKING_SERVICE_REQUEST_REJECT_QUEUE("Booking Service Request - Reject queue", false, null, "IU"),

    CARGO_GENERAL_MSG_QUEUE("Cargo General Message Queue", false, null, "GF"),

    CENTRAL_AUTHORITY_QUEUE("Central Authority", false, null, "XA"),

    CRU_INDICATOR_QUEUE("CRU Indicator Queue", true, null, ""),

    CRU_NORMAL_QUEUE("CRU Normal Queue", true, "Queue - CRU AWB Normal", "AB"),

    CRU_PRIORITY_QUEUE("CRU Priority Queue", true, "Queue - CRU AWB Priority", "AA"),

    // DEFAULT_STATUS_REQUEST_MESSAGE_QUEUE("Default Status Request Message Queue", false, null, "GC"),

    CUSTOMS_ERROR_MSG_QUEUE("Customs Message Queue", false, null, "AE"),

    CUSTOMS_MESSAGE_REJECT_QUEUE("Customs Message Reject Queue", true, null, "GM"),

    DEFAULT_OFFICE_QUEUE("Default Office Queue", false, null, "GQ"),

    DELETE_SENSITIVE_BOOKINGS_QUEUE("Delete Sensitive Bookings queue", true,
                "Queue - Delete Sensitive", "DL"),

    FFM_ADVISORY_QUEUE("FFM Advisory Queue", false, null, "GE"),

    FFM_MESSAGE_QUEUE("FFM Message Queue", false, null, "GD"),

    FHL_SELECT_OR_REJECT_QUEUE("FHL Select Or Reject Queue", false, null, "GU"),

    FIELD_LEVEL_CRU_AWB_NORMAL("Field Level CRU AWB Normal", false, null, "AD"),

    FIELD_LEVEL_CRU_AWB_PRIORITY("Field Level CRU AWB Priority", false, null, "AC"),

    FLIGHT_CAPACITY_WARNING_LEVEL_QUEUE("Flight Capacity Warning Level", true, null, "XI"),

    FLIGHT_DATE_CAPACITY_CHANGE_QUEUE("Flight Date Capacity Change Queue Reason code", true, null, "GI"),

    FLIGHT_DATE_SPAV_CHANGE_QUEUE("Flight Date SPAV Change", true, null, "XD"),

    FLIGHT_OVERFLOW_QUEUE("Flight Overflow", false, null, "XO"),

    FORCE_BOOKING_REJECT_QUEUE("Force Booking Reject Queue", true, "Queue - Rejected Bookings", "UU"),

    FORCE_BOOKING_REPLY_QUEUE("Force Booking Reply Queue", true, "Queue - Force Booking Reply", "XC"),

    FORCE_BOOKING_REQUEST_QUEUE("Force Booking Request Queue", true,
                "Queue - Force Booking Request", "XB"),

    FRAMEWORK_REJECT_QUEUE("Framework Reject Queue", false, null, "FR"),

    FSR_MESSAGE_QUEUE("FSR Message Queue", false, null, "GC"),

    FSU_MESSAGE_QUEUE("FSU Message Queue", false, null, "GK"),

    FWB_ERROR_QUEUE("FWB Error Queue", false, null, "GL"),

    FWB_SELECTORREJECT_QUEUE("FWB SelectOrReject Queue", true,
                "Queue - FWB Select or Reject", "GN"),

    GENERAL_COMMUNICATIONS("General Communications", false, null, "XG"),

    HOUSE_SHIPMENT_DISCREPANCY_QUEUE("House Shipment Discrepancy Queue", true,
                "Queue - House AWB Discrepancy", "XH"),

    /**	
     * Holds the value of default code value for TM - Interline Transfer Manifest Queue.
     */
    INTERLINE_TRANSFER_MANIFEST_QUEUE("Interline Transfer Manifest Queue", false, null, "TM"),

    INVENTORY_QUEUE_FOR_MESSAGE_ERROR("Inventory Queue For Message Error", false, null, "GT"),

    LUC_REJECT_QUEUE("LUC Reject queue", false, null, "UL"),

    MANUAL_AUDIT_QUEUE("Manual Audit Queue", true, QUEUE_WORD, "XU"),

    MANUAL_RATE_QUEUE("AWB Manual Rate Queue", true, QUEUE_WORD, "XM"),

    MANUAL_TARIFF_RATING_QUEUE("Manual Tariff Rating Queue", true, QUEUE_WORD, ""),

    MASTER_ALLOTMENT_CREATION_REQUEST_QUEUE("Master Allotment Creation Request Queue", true, null, "AQ"),

    
    MINIMUM_MAXIMUM_TOLERANCE_QUEUE("Minimum Maximum Tolerance Queue", true,
                "Queue - Tolerance", "TQ"),

    MISCELLANEOUS_RATE_QUEUE("Miscellaneous Rate Queue", true,
                "Queue - AWB Miscellaneous Rate", "XR"),

    NO_SHOW_NO_GO_BOOKING_QUEUE("No Show Or No Go Bookings Queue", true, "Queue - No Show No Go", "NB"),

    NON_BOOKING_CONTROL_REBOOK_QUEUE("Non-Booking Control Rebook Queue", true,
                "Queue - Non-booking control rebook", "GZ"),

    PARTICIPANT_CREDIT_QUEUE("Participant Credit Queue", false, null, "CL"),

    PARTICIPANT_MANUAL_AUDIT_QUEUE_PRIORITY1("Participant Manual audit queue -priority1", true,
                "Queue - Manual Audit Priority 1", "PX"),

    PARTICIPANT_MANUAL_AUDIT_QUEUE_PRIORITY2("Participant Manual audit queue -priority2", true,
                "Queue - Manual Audit Priority 2", "PY"),

    PARTICIPANT_MANUAL_AUDIT_QUEUE_PRIORITY3("Participant Manual audit queue -priority3", true,
                "Queue - Manual Audit Priority 3", "PZ"),

    PARTICIPANT_QUEUE("Participant Queue", true, "Queue - AWB Participant", "XP"),

    PLT_REJECT_QUEUE("PLT Reject Queue", false, null, "PW"),

    PLT_SCANNER_REJECT_QUEUE("PLT Scanner Reject Queue", false, null, "PS"),

    PRINT_SHIPMENT_LABEL_QUEUE("Print Shipment Label Queue", false, null, "SL"),

    PROFILE_MESSAGE_QUEUE("Profile Message queue", false, null, "XZ"),

    RATING_ERROR_QUEUE("Rating Error Queue", false, null, "RE"),

    REJ_SSM_OR_ASM_QUEUE("REJ SSM or ASM", true, null, "SS"),

    RUI_REJECT_QUEUE("RUI Reject Queue", false, null, "UR"),

    RUS_REJECT_QUEUE("RUS Reject Queue", false, null, "US"),

    SCHEDULE_CHANGE_ACTIVE_ALLOTMENT_QUEUE(
                "Schedule Change Active Allotment Queue", true, "AllotmentList", "SX"),

    SCHEDULE_CHANGE_BOOKING_LIST_QUEUE("Schedule Change Booking List", false, null, "SB"),

    SCHEDULE_CHANGE_BOOKING_QUEUES("Schedule Change Booking Queue", true,
                "Queue - Schedule Change Booking", "XQ"),

    SCHEDULE_CHANGE_ERROR_QUEUES("Schedule Change Error Queue", true, null, "SC"),

    SCHEDULE_CHANGE_FLIGHT_ASSIGNMENTS_QUEUE("Schedule Change Flight Assignments", true, null, "XS"),

    SCHEDULE_CHANGE_MASTER_ALLOTMENT_QUEUE(
                "Master Allotment schedule change Queue", true, "AllotmentList", "XK"),

    SPECIAL_HANDLING_CODE_ALTERNATE_QUEUE("Special Handling code alternate queue", true,
                "Alternate Booking Request Queue -XE", "XE"),

    SRA_AUTHORIZATION_REQUEST_QUEUE("SRA Authorization Request Queue", false, "Queue - Spot Rate List", "SR"),

    SRA_AUTHORIZATION_RESPONSE_ACCEPT_QUEUE("SRA Authorization Response Queue - Accepted As-Is", false, 
    		"Queue - Spot Rate List", "SA"),

    SRA_AUTHORIZATION_RESPONSE_ACCEPT_WITH_UPDATE_QUEUE("SRA AuthorizationResponseQueue-AcceptedWithUpdates",
                false, "Queue - Spot Rate List", "SU"),

    SRA_AUTHORIZATION_RESPONSE_REJECT_QUEUE("SRA Authorization Response Queue - Rejected", false, 
    		"Queue - Spot Rate List", "SE"),

    STATION_INTERFACE_QUEUE("Station Interface Queue", false, null, "SI"),

    TERMINAL_DISCREPANCY_QUEUE("Terminal Discrepancy Queue", true,
                "Queue - Terminal Discrepancy", "XT"),
    THROW_RUNTIME_EXCEPTION_QUEUE("Throw Runtime Exception Queue",false, null, "EX"),

    UCM_REJECT_QUEUE("UCM Reject Queue", false, null, "UM"),

    UCS_CONTROL_CENTRE_PRINT_QUEUE("UCS Control Centre Print Queue", false, null, "UC"),

    ULD_CONTROL_REJECT_QUEUE("ULD Control Reject Queue", false, null, "UF"),

    UTILS_ERROR_QUEUE("Utils Error Queue", false, null, "UE"),

    WAREHOUSE_REJECT_QUEUE("Warehouse Reject Queue", false, null, "WR"),

    XF_QUEUE("Flight Period Spav Change", false, null, "XF"),

    XJ_QUEUE("Flight Period Spav Change 2", true, null, "XJ"),
    XW_QUEUE("Abnormal Air Waybill Queue", true, "Queue - Actual Rate", "XW"),
    
    //FIS136 PH1 start
  	ACASERRORQ("ACASErrorQ", false, null, "AS"),  
  	AWB_REVIEW_REQUIRED("AWB Review Required", true,"Queue - Actual Rate","CB"), //AC406
	//FIS136 PH1 end

  	// Delay FSU Start
  	FSU_DELAY_QUEUE("FSU Delay Queue",false, null, "FD"),
    // Delay FSU END
	// ADDED FOR AC367A
	CURRENCY_EXCHANGE_RATE_QUEUE("Currency Exchange Rate Queue", false,null,"CE");//AC367

    
    private String preferenceFunction;

    private String queueCode;

    private String reasonCodeType;

    private boolean workItemIndicator;

    /**
     * Constructor with BookingStatus as an argument.
     * <p>
     * 
     * @param pBookingStatus
     *            Holds the BookingStatusType.
     */

    ReasonCodeType(final String pReasonCodeType, final boolean pWorkItem,
                final String pPreferenceFunction, final String pQueueCode) {
        this.reasonCodeType = pReasonCodeType;
        this.workItemIndicator = pWorkItem;
        this.preferenceFunction = pPreferenceFunction;
        this.queueCode = pQueueCode;
    }

    public static ReasonCodeType getReasonCodeByName(
                final String pReasonCodeName) {
        ReasonCodeType matchedReasonCodeType = null;
        for (final ReasonCodeType aReasonCodeType : ReasonCodeType.values()) {
            if (aReasonCodeType.getReasonCodeType().equalsIgnoreCase(
                pReasonCodeName)) {
                matchedReasonCodeType = aReasonCodeType;
                break;
            }
        }
        return matchedReasonCodeType;
    }

    public static ReasonCodeType getReasonCodeType(final String pQueueCode) {
        ReasonCodeType aReasonCodeType = null;
        for (final ReasonCodeType anEachReasonCodeType : ReasonCodeType.values()) {
            if (anEachReasonCodeType.getQueueCode().equalsIgnoreCase(
                pQueueCode)) {
                aReasonCodeType = anEachReasonCodeType;
                break;
            }
        }
        return aReasonCodeType;
    }

    public static boolean isActiveAllotment(final ReasonCodeType pReasonCode) {
        boolean queueInd = false;
        if (ReasonCodeType.ACTIVE_ALLOTMENT_QUEUE
                    .equals(pReasonCode)
                    || ReasonCodeType.SCHEDULE_CHANGE_ACTIVE_ALLOTMENT_QUEUE
                                .equals(pReasonCode)) {
            queueInd = true;
        }
        return queueInd;

    }

    public static boolean isAirwaybill(final ReasonCodeType pReasonCode) {
        boolean queueInd = false;
        if (isAWBFWBQueue(pReasonCode)
                    || isBookingQueue(pReasonCode)
                    || isCRUQueue(pReasonCode)
                    || isDiscToleranceXWQueue(pReasonCode)
                    || isRateQueue(pReasonCode)
                    || isParticipantQueue(pReasonCode)
                    || ReasonCodeType.SPECIAL_HANDLING_CODE_ALTERNATE_QUEUE.equals(pReasonCode)) {
            queueInd = true;
        }
        return queueInd;

    }

    public static boolean isBooking(final ReasonCodeType pReasonCode) {
        boolean queueInd = false;
        if (ReasonCodeType.BKG_REQ_CTRL_QUEUE.equals(pReasonCode)
                    || ReasonCodeType.BOOKING_ANSWER_ADVISORY_QUEUE.equals(pReasonCode)
                    || ReasonCodeType.BOOKING_INFORMATION_QUEUE.equals(pReasonCode)
                    || ReasonCodeType.DELETE_SENSITIVE_BOOKINGS_QUEUE.equals(pReasonCode)
                    || ReasonCodeType.FORCE_BOOKING_REQUEST_QUEUE.equals(pReasonCode)
                    || ReasonCodeType.SCHEDULE_CHANGE_BOOKING_QUEUES.equals(pReasonCode)
                    || ReasonCodeType.NO_SHOW_NO_GO_BOOKING_QUEUE.equals(pReasonCode)) {
            queueInd = true;
        }
        return queueInd;

    }

    public static boolean isCustoms(final ReasonCodeType pReasonCode) {
        boolean queueInd = false;
        if (ReasonCodeType.CUSTOMS_MESSAGE_REJECT_QUEUE
                    .equals(pReasonCode)) {
            queueInd = true;
        }
        return queueInd;

    }

    public static boolean isFlight(final ReasonCodeType pReasonCode) {
        boolean queueInd = false;
        if (ReasonCodeType.FLIGHT_CAPACITY_WARNING_LEVEL_QUEUE
                    .equals(pReasonCode) || ReasonCodeType.FLIGHT_DATE_CAPACITY_CHANGE_QUEUE
                    .equals(pReasonCode) || ReasonCodeType.FLIGHT_DATE_SPAV_CHANGE_QUEUE
                    .equals(pReasonCode) || ReasonCodeType.REJ_SSM_OR_ASM_QUEUE
                    .equals(pReasonCode) || ReasonCodeType.SCHEDULE_CHANGE_FLIGHT_ASSIGNMENTS_QUEUE
                    .equals(pReasonCode) || ReasonCodeType.XJ_QUEUE
                    .equals(pReasonCode)) {
            queueInd = true;
        }
        return queueInd;

    }

    public static boolean isMasterAllotment(final ReasonCodeType pReasonCode) {
        boolean queueInd = false;
        if (ReasonCodeType.ALLOTMENT_REQUEST_QUEUE.equals(pReasonCode)
                    || ReasonCodeType.ALLOTMENT_REPLY_QUEUE.equals(pReasonCode)
                    || ReasonCodeType.MASTER_ALLOTMENT_CREATION_REQUEST_QUEUE
                                .equals(pReasonCode)
                    || ReasonCodeType.SCHEDULE_CHANGE_MASTER_ALLOTMENT_QUEUE
                                .equals(pReasonCode)) {
            queueInd = true;
        }
        return queueInd;

    }

    public static boolean isPreference(final String pReasonCode) {
        boolean prefInd = false;
        for (final ReasonCodeType aReasonCodeType : ReasonCodeType.values()) {
            if (aReasonCodeType.getReasonCodeType().equalsIgnoreCase(
                pReasonCode)) {
                if (aReasonCodeType.getPreferenceFunction() != null) {
                    prefInd = true;
                    break;
                }
            }
        }
        return prefInd;

    }

    public static boolean isULD(final ReasonCodeType pReasonCode) {
        boolean queueInd = false;
        if (ReasonCodeType.ADVISORY_QUEUE_CODE
                    .equals(pReasonCode) || ReasonCodeType.LUC_REJECT_QUEUE
                    .equals(pReasonCode) || ReasonCodeType.UCM_REJECT_QUEUE
                    .equals(pReasonCode)) {
            queueInd = true;
        }
        return queueInd;

    }

    public static boolean isWorkItem(final String pReasonCode) {
        boolean workItemInd = false;
        for (final ReasonCodeType aReasonCodeType : ReasonCodeType.values()) {
            if (aReasonCodeType.getReasonCodeType().equalsIgnoreCase(
                pReasonCode)) {
                workItemInd = aReasonCodeType.getWorkItemIndicator();
                break;
            }
        }
        return workItemInd;

    }
  //removed "ReasonCodeType.AWB_STOCK_REQUEST_QUEUE.equals(pReasonCode)"  from the "if" statement below as it's affecting DL600 flow
    private static boolean isAWBFWBQueue(final ReasonCodeType pReasonCode) {
        boolean queueInd = false;
        if (ReasonCodeType.AIRWAYBILL_PROCESSING_QUEUE.equals(pReasonCode)
                    
                    || ReasonCodeType.FWB_SELECTORREJECT_QUEUE.equals(pReasonCode)
                    || ReasonCodeType.MANUAL_AUDIT_QUEUE.equals(pReasonCode)) {
            queueInd = true;
        }
        return queueInd;
    }

    private static boolean isBookingQueue(final ReasonCodeType pReasonCode) {
        boolean queueInd = false;
        if (ReasonCodeType.BOOKING_INFORMATION_DELETE_EXPORT_STATION_QUEUE.equals(pReasonCode)
                    || ReasonCodeType.BOOKING_INFORMATION_DELETE_IMPORT_STATION_QUEUE.equals(pReasonCode)
                    || ReasonCodeType.FORCE_BOOKING_REJECT_QUEUE.equals(pReasonCode)
                    || ReasonCodeType.FORCE_BOOKING_REPLY_QUEUE.equals(pReasonCode)
                    || ReasonCodeType.NON_BOOKING_CONTROL_REBOOK_QUEUE.equals(pReasonCode)) {
            queueInd = true;
        }
        return queueInd;
    }

    private static boolean isCRUQueue(final ReasonCodeType pReasonCode) {
        boolean queueInd = false;
        if (ReasonCodeType.CRU_INDICATOR_QUEUE.equals(pReasonCode)
                    || ReasonCodeType.CRU_NORMAL_QUEUE.equals(pReasonCode)
                    || ReasonCodeType.CRU_PRIORITY_QUEUE.equals(pReasonCode)) {
            queueInd = true;
        }
        return queueInd;
    }
    //AC406 starts
    public static boolean isLMShost(final ReasonCodeType pReasonCode) {
        boolean queueInd = false;
        if (ReasonCodeType.AWB_REVIEW_REQUIRED.equals(pReasonCode)) {
            queueInd = true;
        }
        return queueInd;
    }
    //Ac406 ends
    

    private static boolean isDiscToleranceXWQueue(final ReasonCodeType pReasonCode) {
        boolean queueInd = false;
        if (ReasonCodeType.HOUSE_SHIPMENT_DISCREPANCY_QUEUE.equals(pReasonCode)
                    || ReasonCodeType.MINIMUM_MAXIMUM_TOLERANCE_QUEUE.equals(pReasonCode)
                    || ReasonCodeType.TERMINAL_DISCREPANCY_QUEUE.equals(pReasonCode)
                    || ReasonCodeType.XW_QUEUE.equals(pReasonCode)) {
            queueInd = true;
        }
        return queueInd;
    }

    private static boolean isParticipantQueue(final ReasonCodeType pReasonCode) {
        boolean queueInd = false;
        if (ReasonCodeType.PARTICIPANT_MANUAL_AUDIT_QUEUE_PRIORITY1.equals(pReasonCode)
                    || ReasonCodeType.PARTICIPANT_MANUAL_AUDIT_QUEUE_PRIORITY2.equals(pReasonCode)
                    || ReasonCodeType.PARTICIPANT_MANUAL_AUDIT_QUEUE_PRIORITY3.equals(pReasonCode)
                    || ReasonCodeType.PARTICIPANT_QUEUE.equals(pReasonCode)) {
            queueInd = true;
        }
        return queueInd;
    }

    private static boolean isRateQueue(final ReasonCodeType pReasonCode) {
        boolean queueInd = false;
        if (ReasonCodeType.MISCELLANEOUS_RATE_QUEUE.equals(pReasonCode)
                    || ReasonCodeType.ACTUAL_RATE_QUEUE.equals(pReasonCode)
                    || ReasonCodeType.MANUAL_RATE_QUEUE.equals(pReasonCode)
                    || ReasonCodeType.MANUAL_TARIFF_RATING_QUEUE.equals(pReasonCode)) {
            queueInd = true;
        }
        return queueInd;
    }

    /**
     * @return the preferenceFunction
     */
    public String getPreferenceFunction() {
        return this.preferenceFunction;
    }

    public String getQueueCode() {
        return this.queueCode;
    }

    public String getReasonCodeType() {
        return this.reasonCodeType;
    }

    public boolean getWorkItemIndicator() {
        return this.workItemIndicator;
    }

    /**
     * @param preferenceFunction
     *            the preferenceFunction to set
     */
    public void setPreferenceFunction(final String preferenceFunction) {
        this.preferenceFunction = preferenceFunction;
    }

    public void setQueueCode(final String queueCode) {
        this.queueCode = queueCode;
    }

    public void setWorkItemIndicator(final boolean pWorkItemIndicator) {
        this.workItemIndicator = pWorkItemIndicator;
    }

    /**
     * Gives the string format of enumerated <code>LanguageType</code>.
     * <p>
     * 
     * @return the current value of the <code>LanguageType</code>.
     */
    public String value() {
        return this.name();
    }
  //DL600 starts
    public static boolean isAWBStockRequest(final ReasonCodeType pReasonCode){
        	
        	boolean queueInd = false;
        	if(ReasonCodeType.AWB_STOCK_REQUEST_QUEUE
                    .equals(pReasonCode))	{
        		queueInd=true;
        	}
    		return queueInd;
        }
  //DL600 ends
}
