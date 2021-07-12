package com.unisys.trans.logistics.lms.framework.constants;

public class MHSMessageConstants {

	/**
	 * This constant defines the default time value for outgoing message.
	 */
	public final static String DEFAULT_TIME_VALUE = "00   0000";

	/**
	 * This constant defines the single space.
	 */
	public final static String SPACE = " ";

	/**
	 * This constant defines the single space.
	 */
	public final static String ZERO_SPACE = "";

	/**
	 * This constant defines the hyphen character.
	 */
	public final static String HYPHEN = "-";

	/**
	 * This constant defines the default priority for the outgoing message tty
	 * address.
	 */
	public final static String DEFAULT_PRIORITY = "QD";

	/**
	 * This constant defines the dot character.
	 */
	public final static String DOT = ".";

	/**
	 * This constant defines the slash character.
	 */
	public final static String SLASH = "/";

	/**
	 * This constant defines the four times zero value for outgoing message.
	 */
	public final static String FOUR_ZEROS = "0000";

	/**
	 * This constant defines the dimension alphabetical character as "D".
	 */
	public final static String DIMENSIONS = "D";

	/**
	 * This constant defines the AWB alphabetical character as "A".
	 */
	public final static String AWB = "A";

	/**
	 * This constant defines the ULD alphabetical character as "U".
	 */
	public final static String ULD = "U";

	/**
	 * This constant defines the FLIGHT alphabetical character as "F".
	 */
	public final static String FLIGHT = "F";

	/**
	 * This constant defines the line type as LAST.
	 */
	public final static String LAST = "LAST";

	/**
	 * This constant defines the Message type as AEE.
	 */
	public final static String AEE = "AEE";

	/**
	 * This constant defines the Message type as AEX.
	 */
	public final static String AEX = "AEX";

	/**
	 * This constant defines the Message type as AEP.
	 */
	public final static String AEP = "AEP";

	/**
	 * This constant defines the Message type as UEE.
	 */
	public final static String UEE = "UEE";

	/**
	 * This constant defines the Message type as UEX.
	 */
	public final static String UEX = "UEX";

	/**
	 * This constant defines the To tty address.
	 */
	public final static String TO_TTY_ADDRESS = "KULCWMH";

	/**
	 * This constant defines the From tty address.
	 */
	public final static String FROM_TTY_ADDRESS = "KULFMMH";

	/**
	 * This constant defines the sender name.
	 */
	public final static String SENDER = "MAS";

	/**
	 * This constant defines the default sequence number.
	 */
	public final static String SEQ_NUMBER = "00000";

	/**
	 * This constant defines the station Identifier.
	 */
	public final static String STATION_ID = "MSP";

	/**
	 * This constant defines the FSY message type.
	 */
	public final static String FSU_TYPE = "FSU";

	/**
	 * This constant defines the Pattern for Dimension.
	 */
	public final static String DIM_PATTEREN = "\\((.*?)\\)";

	/**
	 * This constant defines the star(*) character.
	 */
	public final static String STAR = "[*]";

	/**
	 * This constant defines the Pattern for flight date.
	 */
	public static final String FLT_DATE_PATTERN = "(^[0-9]{2}[A-Z]{3})";

	/**
	 * This constant defines the Pattern for airway bill pattern .
	 */
	public static final String AWB_PATTERN = "(^[0-9]{1,3}[-]{1}[0-9]{8}$)";

	/**
	 * This constant defines the Pattern for airway bill pattern with mod X.
	 */
	public static final String AWB_PATTERN_X = "(^[0-9]{1,3}[-]{1}[0-9]{8}[X|x]{1}$)";

	/**
	 * This constant defines the start of the message.
	 */
	public static final char SOH = '\1';

	/**
	 * This constant defines the start of the text.
	 */
	public static final char STX = '\2';

	/**
	 * This constant defines the carriage return.
	 */
	public static final char CR = '\15';

	/**
	 * Attribute to hold <code>CRLF</code> property.
	 */
	public static String CRLF = "[\\r\\n]+";

	/**
	 * This constant defines the next new line.
	 */
	public static final String NEXT_LINE = "\r\n";

	/**
	 * This constant defines the html break <br>
	 * tag.
	 */
	public static final String BR = "<br/>";

	/**
	 * This constant defines the Shipper ULD.
	 */
	public static final String SU = "SU";

	/**
	 * This constant defines the BULK goods.
	 */
	public static final String BULK = "BULK";

	/**
	 * This constant defines the Booking indicator as B.
	 */
	public static final String BOOKING_INDICATOR = "B";

	/**
	 * This constant defines the Airway bill indicator as A.
	 */
	public static final String AWB_INDICATOR = "A";

	/**
	 * This constant defines the Confirmed booking status as KK.
	 */
	public static final String CONFIRMED_BOOKING_STATUS = "KK";

	/**
	 * This constant defines the no show status as NS.
	 */
	public static final String NO_SHOW_STATUS = "NS";

	/**
	 * This constant defines the no booking status as NN.
	 */
	public static final String NN_BOOKING_STATUS = "NN";

	/**
	 * This constant defines the status as AA.
	 */
	public static final String AA = "AA";

	/**
	 * This constant defines the status as SS.
	 */
	public static final String SS = "SS";

	/**
	 * This constant defines the Airwaybill function EBI.
	 */
	public static final String EBI = "EBI";

	/**
	 * This constant defines the Airwaybill function ESI.
	 */
	public static final String ESI = "ESI";

	/**
	 * This constant defines the default office identifier.
	 */
	public static final String OFFICE_IDENTIFER = "KUL001";

	/**
	 * This constant defines the success code as 00.
	 */
	public static final String SUCCESS_CODE = "00";

	/**
	 * This constant defines the failure code as 20.
	 */
	public static final String FAIL_CODE = "20";

	/**
	 * This constant defines the backslash n for next new line.
	 */
	public static final String BACKSLASH_N = "\n";

	/**
	 * This constant defines the acknowledgement.
	 */
	public static final String ACKNOWLEDGEMENT = "ACK";

	/**
	 * This constant defines the defalut jms corrlation id.
	 */
	public static final String CORRLATION_ID = "0001";

	/**
	 * This constant defines the character for one space with dot(.)character.
	 */
	public static final String SPACE_DOT = " .";

	/**
	 * This constant defines the SVCERROR Info TAG.
	 */
	public static final String SVCERROR_INFO = "//SVCERROR";

	/**
	 * This constant defines the ERROR TEXT Info TAG.
	 */
	public static final String ERRTX_INFO = "//ERRTX";

	/**
	 * This constant defines the ERROR CODE Info TAG.
	 */
	public static final String ERRCD_INFO = "//ERRCD";
	
	/**
	 * This constant defines the ERROR CODE Info TAG.
	 */
	public static final String GOODS_IN_ULD = "GOODS IN ULD";

	/**
	 * This constant defines the ERROR Info TAG.
	 */
	public static final String ERROR_INFO = "//ERROR";

	/**
	 * This constant defines the Message Info TAG.
	 */
	public static final String MSG_INFO = "//MSG";

	/**
	 * This constant defines the under score(_) character.
	 */
	public static final String UNDER_SCORE = "_";

	/**
	 * This constant defines the Message type as FEF.
	 */
	public static final String FEF = "FEF";

	/**
	 * This constant defines the Message type as FIT.
	 */
	public static final String FIT = "FIT";

	/**
	 * This constant defines the Message type as FEA.
	 */
	public static final String FEA = "FEA";

	/**
	 * This constant defines the goods indicator as G.
	 */
	public static final String GOODS_INDICATOR = "G";

	/**
	 * This constant defines the Message type as AEA.
	 */
	public final static String AEA = "AEA";

	/**
	 * This constant defines the Message type as UEA.
	 */
	public final static String UEA = "UEA";

	/**
	 * This constant defines the Message type as RCS.
	 */
	public final static String RCS = "RCS";

	/**
	 * This constant defines status code as MAN.
	 */
	public final static String MAN = "MAN";

	/**
	 * This constant defines status code as DIS.
	 */
	public final static String DIS = "DIS";

	/**
	 * This constant defines the amendment type as C.
	 */
	public final static String AMENDMENT_TYPE_C = "C";

	/**
	 * This constant defines the amendment type as X.
	 */
	public final static String AMENDMENT_TYPE_X = "X";

	/**
	 * This constant defines the Agent data info TAG.
	 */
	public static final String MH_AGENT_INFO = "//ESAGNT-OUT/AgentData";

	/**
	 * This constant defines the Agent id number info TAG.
	 */
	public static final String MH_AGENT_INFO_AGENT_ID = "//AgentData/IDNumber/Agent";

	/**
	 * This constant defines the FEC message format exception.
	 */
	public static final String FEC_FORMAT_EXCEPTION = "Message Format Exception : Invalid FEC message Format";

	/**
	 * This constant defines the UEP message format exception.
	 */
	public static final String UEP_FORMAT_EXCEPTION = "Message Format Exception : Invalid UEP Message Format";

	/**
	 * This constant defines the UEI message format exception.
	 */
	public static final String UEI_FORMAT_EXCEPTION = "Format Exception : Invalid UEI Message";

	/**
	 * This constant defines the AEI message format exception.
	 */
	public static final String AEI_FORMAT_EXCEPTION = "Format Exception : Invalid AEI Message";

	/**
	 * This constant defines the CGO-XML Service.
	 */
	// public final static String FLIGHT_SERVICE =
	// "http://usea-ecargo2-esuwdev/cgo-xml.asp";

	/**
	 * This constant defines the response queue name.
	 */
	public final static String RESPONSE_QUEUE_NAME = "OutgoingCWISQueue";
	
	public final static String RESPONSE_ACK_MESSAGE_QUEUE_NAME="ackMessageQueue";

	/**
	 * This constant defines the CWIS Airwaybill level message processing error
	 * queue.
	 */
	public static final String CWIS_AWB_LEVEL_MSG_PROCESSSING_ERROR_QUEUE = "MHSMessageProcessingErrorQ";

	/**
	 * This constant defines the CWIS Airwaybill level message formatting error
	 * queue.
	 */
	public static final String CWIS_AWB_LEVEL_MSG_FORMAT_ERROR_QUEUE = "MHSMessageFormatErrorQ";

	/**
	 * This constant defines the Message type as UEP.
	 */
	public static final String UEP = "UEP";

	/**
	 * This constant defines the string zero.
	 */
	public static final String STR_ZERO = "0";

	/**
	 * This constant defines status code as MAN.
	 */
	public final static String OFLD = "OFLD";

	/**
	 * This constant defines the FIC message format exception.
	 */
	public static final String FIC_FORMAT_EXCEPTION = "Message Format Exception : Invalid FIC Message Format";

	/**
	 * This constant defines the AII message format exception.
	 */
	public static final String AII_FORMAT_EXCEPTION = "Message Format Exception : Invalid AII Message Format";

	/**
	 * This constant defines the UII message format exception.
	 */
	public static final String UII_FORMAT_EXCEPTION = "Message Format Exception : Invalid UII Message Format";

	/**
	 * This constant defines the FEO message format exception.
	 */
	public static final String FEO_FORMAT_EXCEPTION = "Message Format Exception : Invalid FEO Message Format";

	/**
	 * This constant defines the AEo message format exception.
	 */
	public static final String AEO_FORMAT_EXCEPTION = "Message Format Exception : Invalid AEO Message Format";

	/**
	 * This constant defines the FEB message format exception.
	 */
	public static final String FEB_FORMAT_EXCEPTION = "Message Format Exception : Invalid FEB Message Format";

	/**
	 * This constant defines the FEB message format exception.
	 */
	public static final String AAM_FORMAT_EXCEPTION = "Message Format Exception : Invalid AAM Message Format";

	/**
	 * This constant defines status code as PAC.
	 */
	public final static String PAC = "PAC";

	/**
	 * This constant defines status code as UIX.
	 */
	public static final String UIX = "UIX";

	public static final String DIM = "DIM";

	/**
	 * This constant defines the Message type as AIR.
	 */
	public final static String AIR = "AIR";

	public static final String OSI = "OSI";

	public static final String COR = "COR";

	public static final String OCI = "OCI";

	public static final String SCI = "SCI";

	public static final String FFM = "XFM";

	/**
	 * This constant defines the ULD alphabetical character as "U".
	 */
	public final static String ULD_START = "ULD";

	/**
	 * This constant defines the line type as CONT.
	 */
	public final static String CONT = "CONT";

	/**
	 * This constant defines the ULD alphabetical character as "U".
	 */
	public final static String FIA = "FIA";

	/**
	 * This constant defines the ULD alphabetical character as "U".
	 */
	public final static String UIE = "UIE";

	/**
	 * This constant defines status code as AWR.
	 */
	public final static String AWR = "AWR";

	/**
	 * This constant defines status code as PRE.
	 */
	public final static String PRE = "PRE";

	/**
	 * This constant defines status code as SLULD.
	 */
	public final static String SLULD = "SLU";

	/**
	 * This constant defines status code as DEP.
	 */
	public final static String DEP = "DEP";

	/**
	 * This constant defines status code as RCF.
	 */
	public final static String RCF = "RCF";

	/**
	 * This constant defines status code as DLV.
	 */
	public final static String DLV = "DLV";

	/**
	 * This constant defines status code as SPLIT.
	 */
	public final static String SPLIT = "Split";

	/**
	 * This constant defines status code as WEIGHT.
	 */
	public final static String WEIGHT = "Weight";

	/**
	 * This constant defines status code as VOLUME.
	 */
	public final static String VOLUME = "Volume";

	/**
	 * This constant defines status code as REL_00.
	 */
	public final static String REL_00 = "00";

	/**
	 * This constant defines status code as REL_01.
	 */
	public final static String REL_01 = "01";

	/**
	 * This constant defines status code as REL_02.
	 */
	public final static String REL_02 = "02";

	/**
	 * This constant defines status code as DB_KEY_IND.
	 */
	public final static String DB_KEY_IND = "B";

	/**
	 * This constant defines status code as AII_ACK_PATH_ONE.
	 */
	public final static String AII_ACK_PATH_ONE = "//ECTGCI-OUT/MSGS/GCI-MSG/ENTRY/TEXT";

	/**
	 * This constant defines status code as AII_ACK_PATH_TWO.
	 */
	public final static String AII_ACK_PATH_TWO = "//ECTGCI-OUT/OBJECT/MSGS/GCI-MSG/ENTRY/TEXT";

	/**
	 * This constant defines status code as AII_ACK_PATH_TWO.
	 */
	public final static String ACK_COLON = "ACK:";

	/**
	 * This constant defines status code as JOIN_INDICATOR_J.
	 */
	public final static String JOIN_INDICATOR_F = "F";

	/**
	 * This constant defines status code as JOIN_INDICATOR_J.
	 */
	public final static String JOIN_INDICATOR_J = "J";

	/**
	 * This constant defines status code as JMS_ID.
	 */
	public final static String JMS_ID = "0001";

	/**
	 * This constant defines status code as TRANSIT_IND.
	 */
	public final static String SHIPMENT_TERMINATING_IND = "T";

	/**
	 * This constant defines status code as SPL_CODES_IND.
	 */
	public final static String SPL_CODES_IND = "SPL";

	/**
	 * This constant defines status code as SHIPMENT_ONLINE_TRANSFER_IND.
	 */
	public final static String SHIPMENT_ONLINE_TRANSFER_IND = "O";

	/**
	 * This constant defines status code as SHIPMENT_INTERLINE_TRANSFER_IND.
	 */
	// public final static String SHIPMENT_INTERLINE_TRANSFER_IND = "I";

	/**
	 * This constant defines the ULD alphabetical character as "AET".
	 */
	public final static String AET = "AET";

	/**
	 * This constant defines the ULD alphabetical character as "UET".
	 */
	public final static String UET = "UET";

	/**
	 * This constant defines status code as SPL_CODES_IND.
	 */
	public final static String UIE_QUEUE = "UIE Queue";

	/**
	 * This constant defines status code as SPL_CODES_IND.
	 */
	public final static String AEAT_QUEUE = "AEAT Queue";

	/**
	 * This constant defines status code as TRANSFER_IND.
	 */
	public final static String TRANSFER_IND = "IT";

	/**
	 * This constant defines the Message type as AIT.
	 */
	public final static String AIT = "AIT";

	/**
	 * This constant defines the Message type as UIT.
	 */
	public final static String UIT = "UIT";

	/**
	 * This constant defines the Message type as EXPORT_TRANSFER_IND.
	 */
	public final static String EXPORT_TRANSFER_IND = "ET";

	/**
	 * This constant defines the Message type as "FEP".
	 */
	public final static String FEP = "FEP";

	/**
	 * This constant defines the Message type as "REMARKS".
	 */
	public final static String REMARKS = "R";

	/**
	 * This constant defines the Message type as "LOWER DECK".
	 */
	public final static String LOWER_DECK = "LOWER DECK";

	/**
	 * This constant defines the Message type as "UPPER DECK".
	 */
	public final static String UPPER_DECK = "UPPER DECK";

	/**
	 * This constant defines the Message type as "CONTAINER LOAD".
	 */
	public final static String CONTAINER_LOAD = "CONTAINER LOAD";

	/**
	 * This constant defines the Message type as "AWB POSITION".
	 */
	public final static String AWB_POSITION = "AWB DISPO";

	/**
	 * This constant defines the Message type as "FREE TEXT".
	 */
	public final static String FREE_TEXT = "FREE TEXT";

	/**
	 * This constant defines the Message type as "AIS_FORMAT_EXCEPTION".
	 */
	public final static String AIS_FORMAT_EXCEPTION = "Invalid AIS Message Format";

	/**
	 * This constant defines the Message type as "REMARKS".
	 */
	public final static String AIP_FORMAT_EXCEPTION = "Invalid AIP Message Format";

	/**
	 * This constant defines the Message type as "FLIGHT_DEPARTING_ERROR".
	 */
	public final static String FLIGHT_DEPARTING_ERROR = "The flight is not departing from a Warehouse Handling Interface (CWIS) station";

	/**
	 * This constant defines the Message type as "F0819_ERROR_CODE".
	 */
	public final static String F0819_ERROR_CODE = "F0819";

	/**
	 * This constant defines the Message type as "IMPORT_IND".
	 */
	public final static String IMPORT_IND = "I";

	/**
	 * This constant defines the Message type as "WEIGHT_IND".
	 */
	public final static String WEIGHT_IND = "W";

	/**
	 * This constant defines the Message type as "INVALID_FLIGHT_NUMBER_DATE".
	 */
	public final static String INVALID_FLIGHT_NUMBER_DATE = "Invalid Flight Nummber or Flight Date";

	/**
	 * This constant defines the Message type as
	 * "INVALID_FLIGHT_NUMBER_DATE_ERROR_CODE".
	 */
	public final static String INVALID_FLIGHT_NUMBER_DATE_ERROR_CODE = "F0001";

	/**
	 * This constant defines the Message type as "WEIGHT_IND".
	 */
	public final static String NEW = "NEW";

	/**
	 * This constant defines the Message type as "WEIGHT_IND".
	 */
	public final static String OLD = "OLD";

	/**
	 * This constant defines the Message type as "APM".
	 */
	public static final String APM = "APM";

	/**
	 * This constant defines the Message type as "APC".
	 */
	public static final String APC = "APC";

	/**
	 * This constant defines the Message type as "AIS_FORMAT_EXCEPTION".
	 */
	public final static String AIL_FORMAT_EXCEPTION = "Invalid AIL Message Format";

	/**
	 * This constant defines the Message type as "APS_FORMAT_EXCEPTION".
	 */
	public final static String APS_FORMAT_EXCEPTION = "Invalid APS Message Format";

	/**
	 * This constant defines status code as DISCREP_DB_KEY_IND.
	 */
	public final static String DISCREP_DB_KEY_IND = "D";

	/**
	 * This constant defines status code as SDC_COMPLETED_IND.
	 */
	public final static String SDC_COMPLETED_IND = "S";

	/**
	 * This constant defines the Message type as "UNC".
	 */
	public static final String UNC = "UNC";

	/**
	 * This constant defines the Message type as "UNC_FORMAT_EXCEPTION".
	 */
	public final static String UNC_FORMAT_EXCEPTION = "Invalid UNC Message Format";

	/**
	 * This constant defines the Date format as "DATEFORMAT_DDMMMHH_MM".
	 */
	public final static String DATEFORMAT_DDMMMHH_MM = "ddMMMHHmm";

	/**
	 * This constant defines the Export_Import type as "I".
	 */
	public final static String FSU_EXPORT_TRANSFER_IND = "I";

	/**
	 * This constant defines the UEC message format exception.
	 */
	public static final String UEC_FORMAT_EXCEPTION = "Format Exception : Invalid UEC Message";

	/**
	 * This constant defines goods status code as MSCA.
	 */
	public final static String MSCA = "MSCA";

	/**
	 * This constant defines the Data as "UPDATE".
	 */
	public final static String UPDATE = "UPDATE";

	/**
	 * This constant defines the Data as "UPDATE_NEW".
	 */
	public final static String UPDATE_NEW = "UPDATE_NEW";

	/**
	 * This constant defines the Station as "KUL".
	 */
	public final static String KUL = "KUL";

	/**
	 * This constant hold the error message of "FLIGHT_FINALIZED".
	 */
	public final static String FLIGHT_FINALIZED = "The flight is finalized. Check Flight Message History to view FEP messages already sent for this flight.";

	/**
	 * This constant defines the Station as "CWIS".
	 */
	public final static String CWIS = "CWIS";

	/**
	 * This constant defines status code as RCT.
	 */
	public final static String RCT = "RCT";

	/**
	 * This constant defines the Message type as "AID".
	 */
	public static final String AID = "AID";

	/**
	 * This constant defines the Message type as "AIS".
	 */
	public static final String AIS = "AIS";

	/**
	 * This constant defines the Message type as "AAM".
	 */
	public static final String AAM = "AAM";

	/**
	 * This constant defines the Message type as FPS.
	 */
	public final static String FPS = "FPS";

	/**
	 * This constant defines the Error Code as L030.
	 */
	public final static String L030 = "L030";

	/**
	 * This constant defines the Message type as AII.
	 */
	public final static String AII = "AII";

	/**
	 * This constant defines the SVCERROR/ERRCD Info TAG.
	 */
	public static final String SVCERROR_ERRCD_INFO = "//SVCERROR/ERRCD";

	/**
	 * This constant defines the Error Code as Q415.
	 */
	public final static String Q415 = "Q415";

	/**
	 * This constant defines the Error Code as L116.
	 */
	public final static String L116 = "L116";

	/**
	 * This constant defines the Error Code as L048.
	 */
	public final static String L048 = "L048";

	/**
	 * This constant defines the dimension alphabetical character as "P".
	 */
	public final static String PARTSHIPMENT_IND = "P";

	/**
	 * This constant defines the Message type as APS.
	 */
	public final static String APS = "APS";

	/**
	 * This constant defines the Message type as AIP.
	 */
	public final static String AIP = "AIP";
	/**
	 * This constant defines the Message type as GCI.
	 */
	public final static String GCI = "GCI";

	/**
	 * This constant defines the Error Code as M164.
	 */
	public final static String M164 = "M164";

	/**
	 * This constant defines the Message type as AIL.
	 */
	public final static String AIL = "AIL";
	/**
	 * This constant defines the start of the text.
	 */
	public static final char ETX = '\3';
	/**
	 * This constant defines the Message type as FEO.
	 */
	public final static String FEO = "FEO";
	/**
	 * This constant defines goods status code as FDCA.
	 */
	public final static String FDCA = "FDCA";

	/**
	 * This constant defines goods status code as FDAW.
	 */
	public final static String FDAW = "FDAW";

	/**
	 * This constant defines the Airwaybill function FFR.
	 */
	public static final String FFR = "FFR";

	/**
	 * This constant defines the Airwaybill participant as OWN.
	 */
	public static final String OWN = "OWN";

	/**
	 * This constant defines the Agent as MASGO.
	 */
	public static final String MASGO = "MASGO";
	
	/**
	 * This constant defines the Message type as AEO.
	 */
	public final static String AEO = "AEO";
	
	/**
     * This constant defines the Airwaybill function ESC.
     */
    public static final String ESC = "ESC";
    
    /**
     * This constant defines the Airwaybill function PNA.
     */
    public static final String PNA = "PNA";
    /**
     * This constant defines status code as AII_PSEUDO-ULD_PATH.
     */
    public final static String AII_PSEUDO_PATH = "//CONTAINER-INFO/ULD-INFO/PSEUDO-ULD";
    /**
     * This constant defines the Error Code as L048.
     */
    public final static String L043 = "L043";

    /**
     * This constant defines the Error Code as P076.
     */
    public final static String P076 = "P076";
}
