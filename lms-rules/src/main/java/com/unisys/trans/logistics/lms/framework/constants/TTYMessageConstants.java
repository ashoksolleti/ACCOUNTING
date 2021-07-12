package com.unisys.trans.logistics.lms.framework.constants;

import static com.unisys.trans.logistics.lms.framework.constants.Enum_constants.EXPRESSION_FOUR;
import static com.unisys.trans.logistics.lms.framework.constants.Enum_constants.EXPRESSION_ONE;
import static com.unisys.trans.logistics.lms.framework.constants.Enum_constants.EXPRESSION_THREE;
import static com.unisys.trans.logistics.lms.framework.constants.Enum_constants.EXPRESSION_TWO;
public class TTYMessageConstants {

    public static final String AIRCRAFT_IDENTIFICATION_PATTERN = "([A-Za-z0-9]{1,10})";

    public static final String AIRCRAFT_REGISTRATION_NUMBER = "^[A-Za-z0-9]{5,10}";

    public static final String AIRLINE_PREFIX = "^[0-9]{3}";

    public static final String AIRPORT_CODE = "^[A-Za-z]{3,5}";

    public static final String AIRPORT_CODE_PATTERN = "([A-Za-z]{3})";

    public static final String AIRPORT_FLIGHT_PATTERN =
                "([A-Za-z]{3})(?:([A-Za-z0-9]{2})([0-9]{3,4})([A-Za-z]?))?";

    public static final String ARR_DEP_TIME_PATTERN = "([A-Za-z])([0-9]{4})(-([A-Za-z]))?";

    public static final String AWB_DESCRIPTION = "^[A-Za-z0-9 .-]{1,15}";

    public static final String AWB_DETAIL_PATTERN =
                "([0-9]{3})-([0-9]{8})([Xx])?(([A-Za-z]{3})([A-Za-z]{3}))?";

    public static final String AWB_PATTERN = "(^[0-9]{1,3}[-]{1}[0-9]{8}[A-Z]{6}$)";

    public static final String AWB_PATTERN_X = "(^[0-9]{1,3}[-]{1}[0-9]{8}[X|x]{1}[A-Z]{6}$)";

    /**
     * Attribute to hold the name of <code>Booking Answar message error queue</code>.
     */
    public static final String BOOKING_ANSWER_MESSAGE_ERROR_QUEUE = "Booking Answer Message Error Queue";

    public static final String CARRIER_CODE = "^[A-Za-z]{2}";

    public static final String CARRIER_CODE_PATTERN = "([A-Za-z0-9]{2})";

    public static final String CARRIER_CODE_THREE_CHAR = "^[A-Za-z]{3}";

    public static final String CONSIGNMENT_PIECES_PATTERN = "([a-zA-Z\\d.]*[T]{1}[0-9]{1,4}$)";

    public static final String CONTROL_INFO_IDENTIFIER_PATTERN = "([A-Za-z])";

    public static final String COUNTRY_CODE_PATTERN = "([A-Za-z]{2})";

    public static final String DATE_FORMAT_DDMON = "ddMMM";

    public static final String DATE_FORMAT_DDMONTIME = "ddMMMHHmm";

    public static final String DATE_FORMAT_DDMONYY = "ddMMMyy";

    public static final String DATETIME_FORMAT_EXCEPTION = "DateTime Format Exception";

    public static final String DAY_MONTH_TIME_PATTERN = "([0-9]{2})?([A-Za-z]{3})?([0-9]{4})?(-([A-Za-z]))?";

    public static final String DENSITY_IND = "DG";

    public static final String DIM_DETAILS_PATTERN =
                "(?i)(CMT|FOT|INH|MTR)([0-9]{1,5})-([0-9]{1,5})-([0-9]{1,5})";

    public static final String DIM_FIRST = "\\/[KL][0-9.]{0,6}[0-9]\\";

    public static final String DIM_NUMBER_PATTERN = "\\w+";

    public static final String DIM_PATTERN = "(^[0-9]{1,5}[-]{1}[0-9]{1,5}[-]{1}[0-9]{1,5})";

    public static final String DIM_PIECES_PATTERN = "([0-9]{1,4})";

    public static final String DIM_QTY_PATTERN =
                "(^[0-9]*[1-9]+[0-9]*\\.[0-9]*$)|(^[0-9]*\\.[0-9]*[1-9]+[0-9]*$)|(^[0-9]*[1-9]+[0-9]*$)";

    public static final String DIM_SECOND = "/[A-Za-z]{1,3}[0-9]{1,5}\\-[0-9]{1,5}\\-[0-9]{1,5}\\";

    public static final String DIM_THIRD = "/[0-9]{1,4}";

    public static final String DIM_UNIT_PATTERN = "^[A-Za-z]{3}";

    public static final String DIM_WEIGHT_UNIT_PATTERN = "^[K|L]{1}";

    public static final String DISCREPANCY_CODE_PATTERN = "([A-Za-z]{4})";

    public static final String EMPTY_SPACE = "";

    public static final String EMPTY_SPACE_1 = " ";

    public static final String END_MANIFEST_CODE_PATTERN_CONT = "CONT";

    public static final String END_MANIFEST_CODE_PATTERN_LAST = "LAST";

    public static final String END_MESSAGE_INDICATOR = "LAST|CONT";

    public static final String END_MESSAGE_VALIDATION = "^[A-Za-z]{4}";

    public static final String FBL_CODE = "FBL";

    public static final String FBL_DIM_PATTERN =
                "\\/[KL][0-9.]{0,6}[0-9]\\/[A-Za-z]{1,3}[0-9]{1,5}\\-[0-9]{1,5}\\-[0-9]{1,5}\\/[0-9]{1,4}";

    public static final String FDM_CODE = "FDM";

    public static final String FFA_CODE = "FFA";

    public static final String FFA_FORMAT_EXCEPTION = "Invalid FFA Message Format.";

    // FFM
    public static final String FFM_FORMAT_EXCEPTION = "Format Exception : Invalid FFM Message";

    public static final String FFR_CODE = "FFR";

    public static final String FHL_CODE = "FHL";

    public static final String FHL_FORMAT_EXCEPTION = "Invalid FHL Message Format";

    public static final String FHL_SELECT_OR_REJECT_QUEUE = "FHL Select Or Reject Queue";

    public static final String FLIGHT_PATTERN = "([A-Za-z0-9]{2})([0-9]{3,4}[A-Za-z]?)";

    public static final String FLT_DATE_PATTERN = "(^[0-9]{2}[A-Z]{3})";

    public static final String FLT_INFO_PATTERN = "(^[A-Za-z]{2}[0-9]{3,4}[A-Za-z]{0,1}$)";

    public static final String FLT_NUMBER = "(^[0-9]{4})";

    public static final String FLT_NUMBER_THREE_DIGIT = "(^[0-9]{3})";

    public static final String FLT_SUFFIX = "(^[A-Za-z]{1})";

    public static final String FMA_CODE = "FMA";

    public static final String FNA_CODE = "FNA";

    public static final String FORMAT_EXCEPTION = "Format Exception : Invalid FFR Message";

    public static final String FORMAT_EXCEPTION_FBL = "Format Exception : Invalid FBL Message";

    public static final String FORMAT_EXCEPTION_FER = "Format Exception : Invalid FER Message";

    public static final String FORMAT_EXCEPTION_FERFDM = "Format Exception : Invalid FERFDM Message";

    public static final String FORMAT_EXCEPTION_FSC = "Format Exception : Invalid FSC Message";

    public static final String FORMAT_EXCEPTION_FSN = "Format Exception : Invalid FSN Message";

    public static final String FORMAT_EXCEPTION_FWB = "Format Exception : Invalid FWB Message";

    public static final String FORMAT_EXCEPTION_SPLIT_FWB = "Split FWB Message.";

    public static final String FRC_CODE = "FRC";

    public static final String FRI_CODE = "FRI";

    public static final String FRX_CODE = "FRX";

    public static final String FSN_CODE = "FSN";

    public static final String FSQ_CODE = "FSQ";

    public static final String FSU_FORMAT_EXCEPTION = "Format Exception : Invalid FSU Message";

    public static final String FWB_AUTOMATIC = "Automatic FWB";

    public static final String FWB_AWB_PROCESSING_QUEUE = "Air Waybill Processing Queue";

    public static final String FWB_CODE = "FWB";

    public static final String FWB_DUPLICATE_AWB_FOUND = "Duplicate air waybill found in the system.";

    public static final String FWB_ERROR_QUEUE = "FWB Error Queue";

    public static final String FWB_OCI_LINE_NOT_SUPPORTED =
                "The OCI line is not supported for FWB Message Version lesser than 15.";

    public static final String FWB_PART = "PART/";

    public static final String FWB_QUEUE_STATION_NOT_FOUND = "Queue Station not Found.";

    public static final String FWB_SELECT_REJECT_QUEUE = "FWB SelectOrReject Queue";

    public static final String GOODS_DESCRIPTION_PATTERN = "([A-Za-z]{1,15})";

    public static final String HTS_NOT_ALLOWED = "HTS Message Line Identifier is not allowed";

    public static final String HYPHEN = "-";

    public static final String INCOMING_FBL_MESSAGE_SEQUENCE_NUMBER = "(^[0-9]{1,2})";

    public static final String INCOMING_FBL_MESSAGE_VERSION = "(^[0-9]{1,3})";
    
    public static final String INCORRECT_CONFIGURATION_EXCEPTION =
            "Technical exception representing incorrect configuration.";

    public static final String INFO_IDENTIFIER_PATTERN = "([A-Za-z]{3})";

    public static final String LUC_FORMAT_EXCEPTION = "Format Exception : Invalid LUC Message";

    public static final String MESSAGE_SEQUENCE_NUMBER_PATTERN = "([0-9]{1,2})";

    public static final String MOVEMENT_PRIORITY_CODE = "^[A-Za-z]{1}";

    public static final String MSG_SEQ_1 = "1";

    public static final String NIL_CODE = "NIL";

    public static final String NIL_ULD_DETAIL_PATTERN = "(^[\\.N]{2}$)";

    public static final String OCI_NOT_ALLOWED = "OCI Message Line Identifier is not allowed";

    public static final String OFFICE_FILE_REFFERENCE = "([A-Z0-9]{1,15})";

    public static final String OFFICE_MESSAGE_ADDRESS = "([A-Z0-9]{7})";

    public static final String PARTICIPANT_CONTACT_IDENT = "^[A-Za-z]{2,3}";

    public static final String PARTICIPANT_NAME = "(^[A-Za-z0-9. -]{1,36}$)";

    public static final String PARTICIPANT_STATE_REGX = "^[A-Z0-9. -]{1,9}";

    public static final String PARTICIPANT_STATE2_REGX = "^[A-Z]{2}";

    public static final String PATTEREN_QTY = "[A-Za-z]+|[0-9-.]+";

    public static final String PATTERN_ULD = "(^[A-Z-0-9]{3}[0-9]{4,5}[A-Z]{2})";

    public static final String PATTERN_ULD_IND = "(^[A-Z-0-9]{3}[0-9]{4,5}[A-Z]{2}[-]{1}[A-Z]{1})";

    public static final String QTY_PATTERN = "(^[T|P]{1}[0-9]{1,4}[K|L]{1})";

    public static final String QTY_PATTERN_1 = "[0-9-.]+|[a-z]+|[A-Z]+";

    public static final String QUANTITY_DETAIL_PATTERN =
                "([TP])([0-9]{1,4})(([KL])([0-9.]{1,7}))?((T)([0-9]{1,4}))?";

    public static final String QUANTITY_DETAIL_PATTERN_FFM =
                "(?i)([TPSDM])([0-9]{1,4})(?i)([KL])([0-9]{1,7}(?:[.][0-9])?)";

    public static final String QUANTITY_DETAIL_PATTERN_FSU =
                "(?i)([TP])([0-9]{1,4})(?:(?i)([KL])([0-9]{1,7}(?:[.][0-9])?))?(?:(?i)([T])([0-9]{1,4}))?";

    public static final String ROUTING_PATTERN = "^[A-Za-z]{6}";

    public static final String SHIPMENT_DESC_CODE = "P";

    public static final String SHIPMENT_DESC_CODE_P = "P";

    public static final String SHIPMENT_DESC_CODE_T = "T";

    public static final String SHIPMENTREF_PATTERN = "(^[0-9]{8})";

    public static final String SHIPMENTREF_PATTERN_X = "(^[0-9]{8}[X|x]{1}";

    public static final String SLASH = "/";

    public static final String SPACE_ALLCATION_CODE = "CA";

    public static final String SPL_HANDELING_CODE_VALIDATION = "^[A-Za-z]{3}";

    public static final String SPL_NOT_ALLOWED = "Special Handling Codes are not allowed.";

    public static final String SUPPLEMENTARY_INFO = "(^[A-Za-z]{2}[\\s]{1})";

    public static final String TIME_FORMAT_HHMM = "HHmm";

    public static final String TRANSFER_MANIFEST_NUMBER_PATTERN = "([0-9]{6})";

    public static final String UCM_FORMAT_EXCEPTION = "Format Exception : Invalid UCM Message";

    public static final String ULD_DETAIL_PATTERN = "(^[\\.]{1}[A-Za-z]{3}[0-9]{5})";

    public static final String ULD_DSC_PATTERN =
                "([A-Za-z][A-Za-z0-9]{2})([A-Za-z0-9][0-9]{3,4})([A-Za-z0-9]{2})(-([A-Za-z]))?";

    public static final String ULD_STOCK_DETAIL_PATTERN = "(^[\\.]{1}[A-Za-z]{3}[\\.]{1}[0-9]{5})";

    public static final String VALIDATOR_CURRENCYCODE = "(^[A-Za-z]{3}$)";

    public static final String VALIDATOR_RATE_AMOUNT = "(^[0-9]{1}[0-9.]{1,7}[0-9]{1}|[0-9]{1,9}$)";

    public static final String VOLUME_CODE_1 = "MC";

    public static final String VOLUME_CODE_2 = "CF";

    public static final String VOLUME_QUANTITY_PATTERN = "(MC|CF)([0-9.]{1,9})(([A-Za-z]{2})([0-9]{2}))?";

    public static final String VOLUME_QUANTITY_PATTERN_FFM =
                "(?:(?i)(MC|CC|CF)([0-9]{1,9}(?:[.][0-9]{1,2})?))?(?:([A-Za-z]{2})([0-9]{1,2}))?(?:(?i)([T])([0-9]{1,4}))?";

    public static final String VOLUME_QUANTITY_PATTERN_FSU =
                "(?i)(MC|CC|CF)([0-9]{1,9}(?:[.][0-9]{1,2})?)(?:([A-Za-z]{2})([0-9]{2}))?";

    public static final String WEIGHT_CODE_1 = "K";

    public static final String WEIGHT_CODE_2 = "L";

    public static final String WEIGHT_QUANTITY_PATTERN = "(?i)([KL])([0-9]{1,7}(?:[.][0-9])?)";
    public static final String AWB_DETAIL_LINE_PATTERN =
            "([A-Za-z0-9.&!@#$%^&*/ -]{0,3})-([A-Za-z0-9.&!@#$%^&*/ -]{0,8})([Xx])?(([A-Za-z]{3})([A-Za-z]{3}))?";
    public static final String FFM_AIRPORT_LINE_PATTERN = "(^[a-zA-Z]{3}$)";
    public static final String FFM_MESSAGE_SEQUENCE_NUMBER_PATTERN = EXPRESSION_FOUR;
    public static final String FFM_AIRLINE_CODE_PATTERN = "([0-9]{3})";
    
    public static final String FFM_SHIPMENT_REFERENCE_PATTERN = "([0-9]{8})";

    public static final String FFM_SHIPMENT_REFERENCE_WITH_SUFFIX_PATTERN = "([0-9]{8})([Xx]?)";
    public static final String FFM_AIRPORT_CODE_PATTERN = EXPRESSION_THREE;
    public static final String FFM_SHIPMENT_DESC_CODE_PATTERN = "([TPSDMtpsdm])";
    public static final String FFM_PIECES_PATTERN = EXPRESSION_ONE;
    public static final String FFM_WEIGHT_UNIT_PATTERN = "([KLkl])";
    public static final String FFM_NUMERIC_LENGTH_EXCEEDS_PATTERN = "([1-9])";
    public static final String FFM_ALPHABET_EXCEEDS_PATTERN = "([A-Za-z])";
    public static final String FFM_VOLUME_UNIT_PATTERN = "(?i)(MC|CC|CF)";
    
    public static final String FFM_WEIGHT_PATTERN = "([0-9]{1,7}(?:[.][0-9])?)";
    
    public static final String FFM_TOTAL_SHIPMENT_DESC_CODE_PATTERN = "([Tt])";
    
    public static final String FFM_VOLUME_PATTERN = "([0-9]{1,9}(?:[.][0-9]{1,2})?)";
    
    public static final String FFM_DENSITY_INDICATOR_PATTERN = EXPRESSION_TWO;
    
    public static final String FFM_DENSITY_GROUP_PATTERN = EXPRESSION_FOUR;
    
    public static final String FFM_VOLUME_DECIMAL_PATTERN = "([.][0-9]{1,2})";

    public static final String FFM_DENSITY_GROUP_INVALID_PATTERN = "([0-9]{3})";
    
    public static final String FFM_TOTAL_PIECES_PATTERN = EXPRESSION_ONE;
    
    public static final String FFM_TOTAL_PIECES_INVALID_PATTERN = "([0-9]{5})";
    
    public static final String FFM_DIM_MEASUREMENT_UNIT_PATTERN = "(?i)(CMT|FOT|INH|MTR)";
   
    public static final String FFM_DIM_PATTERN = "([0-9]{1,5})";    

    public static final String FFM_DIM_INVALID_PATTERN = "([0-9]{6})";
    
    public static final String FFM_DIM_PIECE_INVALID_PATTERN = "([0-9]{5})";

    public static final String FFM_DIM_PIECES_PATTERN = EXPRESSION_ONE;

    public static final String FFM_MESSAGE_SEQUENCE_NUMBER_WITH_ERROR_PATTERN = "([0-9]{1,2}[E])";

	private static final String EXPRESSION_ALPHA_NUMERIC = "([A-Za-z0-9]{1,2})";
    
    public static final String FFM_FLIGHT_CARRIER_PATTERN = EXPRESSION_ALPHA_NUMERIC;    

    public static final String FFM_FLIGHT_NUMBER_PATTERN = "([0-9]{3,4})([A-Za-z])?";
    
    public static final String FFM_FLIGHT_DATE_PATTERN = "([0-9]{2})([A-Za-z]{3})";
    
    public static final String FFM_FLIGHT_TIME_PATTERN = "((?:[0-1][0-9])|(?:2[0-3]))([0-5][0-9])";
    
    public static final String FFM_AIRCRAFT_IDENTIFICATION_PATTERN = "([A-Za-z0-9]{1,10})";
    
    public static final String FFM_COUNTRY_CODE_PATTERN = EXPRESSION_TWO;
    
    public static final String FFM_OCI_INFO_IDENTIFIER_PATTERN = "(AGT|DCL|EXP|IMP|TID|TRA|HWB)";
    
    public static final String FFM_OCI_CONTROL_INFO_IDENTIFIER_PATTERN = "(A|F|M|T|I)";
    
    public static final String FFM_AWB_PRIORITY = "(H|L|S|E|X)";
    
    public static final String EU_CUSTOMS_CODE_PATTERN = "([A-Za-z0-9]{1,2})";
    
    public static final String FFM_ULD_DSC_PATTERN ="([A-Za-z0-9]{1,3}[0-9]{4,5}[A-Za-z0-9]{2,3})(?:-([A-Za-z]))?";
    
    public static final String FFM_ULD_VOLUME_AVAILABLE_CODE = "([1-9])";
    
    public static final String HOUSEAWB_PATTERN = "(^[0-9]{1,3}[-]{1}[0-9]{8}$)";
    
    public static final String HOUSEAWB_PATTERN_PATTERN_X = "(^[0-9]{1,3}[-]{1}[0-9]{8}[X|x]{1}$)";
    
	public static final String CONSIGNMENT_PATTERN = "(^[0-9]{1,3}[-]{1}[0-9]{8}[A-Z0-9]{1,12}[A-Za-z]{6}|[0-9]{1,3}[-]{1}[0-9]{8}[X|x]{1}[A-Z0-9]{1,12}[A-Za-z]{6}|[0-9]{1,3}[-]{1}[0-9]{8}[X|x]{1}[A-Z0-9]{1,12}|[0-9]{1,3}[-]{1}[0-9]{8}[A-Z0-9]{1,12}$)";

    public static final String CUSTOMS_AWB_MOD_PATTERN = "([0-9]{1,3}[-]{1}[0-9]{8}[A-Za-z]{1}$)";
    
    public static final String CUSTOMS_AWB_PATTERN = "([0-9]{1,3}[-]{1}[0-9]{8}$)";    

    public static final String CUSTOMS_HOUSEIDENTIFIER = "(^[A-Za-z0-9 ]{1,12}$)";
    
    // LMSC-11111 UIS158 Start
    public static final String STATION_CODE_PATTERN = "(^[A-Za-z]{3,5}$)";
    
    public static final String ULD_PREFIX = "(^[A-Za-z]{3}$)";
    
    public static final String ULD_EXTEND_PATTERN = "(^[0-9]{4,5}[A-Z]{2}$)";
    
    public static final String PATTERN_ULD_SERIALNO = "(^[0-9]{4,5}$)";
    
    public static final String ULD_TOTAL_PATTERN = "(^[A-Za-z]{1}[0-9]{1,3})";
    
    public static final String AIRCRAFT_REGISTRATION_NUMBER1 = "^[A-Za-z0-9]{5,9}";
    
    public static final String ULD_FULL_PATTERN = "(^[A-Z-0-9]{3}[0-9]{4,5}[A-Z]{2}$)";

    public static final String ULD_NOCARRIER_PATTERN = "(^[A-Z-0-9]{3}[0-9]{4,5}$)";
    
    public static final String RECEIVING_CARRIER_FORMAT_EXCEPTION =
            "Receiving Participant  carrier code must be 2 Alphanumeric characters";
    
    public static final String RELEASING_CARRIER_FORMAT_EXCEPTION =
            "Releasing Participant  carrier code must be 2 Alphanumeric characters";   
    // LMSC-11111 UIS158 End
   
}