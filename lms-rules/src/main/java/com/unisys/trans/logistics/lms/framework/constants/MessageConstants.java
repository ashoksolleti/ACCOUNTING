/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.framework.constants;

import java.util.HashMap;
/**
 * <code>MessageConstants</code> class maintains a list of message constants pertaining to the LMS module.
 */
public final class MessageConstants {

    /* ====================================== */
    /* Framework related constants. */
    /* ====================================== */
    /**
     * This constant is used to specify the occurrence of concurrent modification error code.
     * <p>
     * value = {@value}
     */
    public static final int CONCURRENT_MODIFICATION_ERROR = 2;

    /**
     * This constant is used to specify that a security error has occurred due to a mismatch in user's stated
     * credentials.
     * <p>
     * value = {@value}
     */
    public static final int CREDENTIALS_MISMATCH = 100;

    /**
     * This constant is used to verify whether two legs have same destination station.
     * <p>
     * value = {@value}
     */
    public static final int DUPLICATE_DESTINATION_STATIONS_ARE_NOT_ALLOWED_FOR_DIFFERENT_LEGS = 10;

    /**
     * This constant is used to verify whether the entity already exists.
     * <p>
     * value = {@value}
     */
    public static final int ENTITY_ALREADY_EXIST = 4;

    /**
     * This constant is used to specify the invalid input XML error code.
     * <p>
     * value = {@value}
     */
    public static final int INVALID_INPUTXML = 3;

    /**
     * This constant is used to verify whether the origin station is same as the destination of the preceding
     * for the legs other than the first.
     * <p>
     * value = {@value}
     */
    public static final int LEGS_OTHER_THAN_FIRST_ORIGIN_MUST_BE_SAME_AS_DESTINATION_OF_THE_PRECEDING = 9;

    /**
     * This constant is used to specify the system error code.
     * <p>
     * value = {@value}
     */
    public static final int LMS_SYSTEM_ERROR = 1;

    /**
     * This constant is used to verify whether browse messages from the queue successfully or not.
     * <p>
     * value = {@value}
     */
    public static final int MESSAGE_BROWSE_FAIL = 53;

    /**
     * This constant is used to verify whether browse messages from the queue successfully or not.
     * <p>
     * value = {@value}
     */
    public static final int MESSAGE_IS_MANDATORY = 55;

    /**
     * This constant is used to verify whether message is send to the queue successfully or not.
     * <p>
     * value = {@value}
     */
    public static final int MESSAGE_SEND_FAIL = 52;

    /**
     * This constant is used to verify whether message is send to the queue successfully or not.
     * <p>
     * value = {@value}
     */
    public static final int MESSAGE_SEND_SUCCESS = 51;

    /* ====================================== */
    /* Message harness related constants. */
    /* 51-60 */
    /* ====================================== */

    /**
     * This constant is used to verify that there is no exact match.
     * <p>
     * value = {@value}
     */
    public static final int NO_EXACT_MATCH = 5;

    /**
     * This constant is used to verify that the object does not exist.
     * <p>
     * value = {@value}
     */
    public static final int OBJECT_DOES_NOT_EXIST = 6;

    /**
     * This constant is used to specify that the parameter does not exist in the system.
     * <p>
     * value = {@value}
     */
    public static final int PARAMETER_DOES_NOT_EXIST = 103;

    /**
     * This constant is used to verify whether browse messages from the queue successfully or not.
     * <p>
     * value = {@value}
     */
    public static final int QUEUE_NAME_IS_INCORRECT = 54;

    /**
     * This constant is used to verify whether the leg origin is same as the leg destination.
     * <p>
     * value = {@value}
     */
    public static final int THE_LEG_ORIGIN_MUST_NOT_BE_SAME_AS_THE_LEG_DESTINATION = 8;

    /**
     * This constant is used to verify whether any error has occurred while converting an object to XML or
     * vice versa.
     * <p>
     * value = {@value}
     */
    public static final int XML_CONVERSION_ERROR = 11;

    /**
     * This constant is used to verify whether the authority function is available or not.
     * <p>
     * value = {@value}
     */
    public static final int AUTHORITY_FUNCTION_NOT_AVAILABLE = 201;

    /**
     * This constant is used to verify command line format.
     * <p>
     * value = {@value}
     */
    public static final int COMMANLINEFORMAT = 5000;

    /**
     * This constant is used to describe the context close error.
     * <p>
     * value = {@value}
     */
    public static final int CONTEXT_CLOSE_ERROR = 5011;

    /**
     * This constant is used to verify whether the date format failed.
     * <p>
     * value = {@value}
     */
    public static final int DATEFORMATFAILURE = 5014;

    /**
     * This constant is used to verify whether the dom from file failed.
     * <p>
     * value = {@value}
     */
    public static final int DOMFROMFILEFAILURE = 5004;

    /**
     * This constant is used to verify whether the dom failed.
     * <p>
     * value = {@value}
     */
    public static final int DOMLOADFAILURE = 5001;

    /**
     * This constant is used to verify whether the Dom from file failed.
     * <p>
     * value = {@value}
     */
    public static final int DOMTOSTRINGFAILURE = 5002;

    /**
     * This constant is used to verify whether there is response error code.
     * <p>
     * value = {@value}
     */
    public static final String EAACEXRESPONSEERRORCODE = "R1206";

    /**
     * This constant is used to verify whether the EJB look up failed.
     * <p>
     * value = {@value}
     */
    public static final int EJB_LOOKUP_FAILED = 5010;

    /**
     * This constant is used to verify whether there is a host service error.
     * <p>
     * value = {@value}
     */
    public static final int HOSTSERVICEERROR = 5009;

    /**
     * This constant is used to verify whether the identifier load failed.
     * <p>
     * value = {@value}
     */
    public static final int IDENTIFIERLOADFAILURE = 5005;

    /**
     * This constant is used to verify whether the job completed.
     * <p>
     * value = {@value}
     */
    public static final int JOBCOMPLETED = 5007;

    /**
     * This constant is used to verify whether the job failed.
     * <p>
     * value = {@value}
     */
    public static final int JOBFAILURE = 5006;

    /**
     * This constant is used to verify whether the country code exist.
     * <p>
     * value = {@value}
     */
    public static final int NOCOUNTRYCODE = 5014;

    /**
     * This constant is used to verify whether the currency code exist.
     * <p>
     * value = {@value}
     */
    public static final int NOCURRENCYCODE = 5012;

    /**
     * This constant is used to verify whether the property file reader failed.
     * <p>
     * value = {@value}
     */
    public static final int PROPERTYFILEREADFAILURE = 5003;

    /**
     * This constant is used to verify whether the URL post failure occured.
     * <p>
     * value = {@value}
     */
    public static final int URLPOSTFAILURE = 5008;

    /**
     * This constant is used to verify whether the Xpath evaluation failed.
     * <p>
     * value = {@value}
     */
    public static final int XPATHEVALUATIONFAILURE = 5013;

    /**
     * This constant is used to verify whether aircraft package length is numeric.
     * <p>
     * value = {@value}
     */
    public static final int AIRCRAFT_PACKAGE_LENGTH_MUST_BE_NUMERIC = 101;

    /**
     * This constant is used to verify whether the host found in history configuration.
     * <p>
     * value = {@value}
     */
    public static final int HOST_NOT_FOUND_IN_HISTORY_CONFIGURATION = 102;
    
    public static final int HOST_NOT_FOUND = 6015;

    public static final int AWB_NUMBER_INVALID = 6001;
    public static final int AWB_SREF_INVALID = 6002;
    public static final int OVERRIDECODE_INVALID = 6003;
    public static final int AWBNUMBER_INVALID_MOD = 6004;
    
public final static int INTERNAL_ERROR = 10001;
	public final static int SOAP_CONNECTION_CLOSE_ERROR =10002;
	public final static int MQ_CONNECTION_CLOSE_ERROR = 10003;
	public final static int STARTUP_ERROR = 10004;

	
	public final static int PROPERTIES_FILE_NOT_FOUND = 10006;
	public final static int PROPERTIES_FILE_IO_EXCEPTION = 10007;
	public final static int SOAP_EXCEPTION = 10008;
	public final static int SOAP_IO_EXCEPTION = 10009;
	public final static int SOAP_SAX_EXCEPTION = 10010;
	public final static int SOAP_PARSER_CONFIG_EXCEPTION = 10011;
	public final static int SOAP_TRANSFORMER_CONFIG_EXCEPTION = 10012;
	public final static int SOAP_TRANSFORMER_EXCEPTION = 10013;
	public final static int TIMER_CONTEXT_LOOKUP_FAILED = 10014;
	public final static int CRMServiceEJB_LOOKUP_FAILED = 10015;
	public final static int IATATimerServiceEJB_LOOKUP_FAILED = 10016;
	public final static int SOAP_COMMUNICATION_FAILURE = 10017;
    public static final int SQL_EXCEPTION = 6005;

	public final static int CLASS_NOT_FOUND_EXCEPTION = 10019;
	public final static int SQL_CONNECTION_CLOSE_ERROR = 10020;
	public final static int EXCEPTION_IN_TTYADDRESS_IDENTIFIER = 10021;
	public final static int INITIALCONTEXT_EXCEPTION = 10022;
	public final static int SQL_ROLLBACK_EXCEPTION = 10023;
    public static final int PESIMISTIC_LOCK_EXCEPTION = 12;
    
    // OptimisticLockException Exception Error Code 
    public static final int OPTIMISTIC_LOCK_EXCEPTION = 13;

	public final static HashMap<Integer, String> ERROR_MESSAGE_MAP = new HashMap<Integer, String>();
	static {
		ERROR_MESSAGE_MAP.put(10001, "An Internal Error Has Occured.  Please see log for details.");
		ERROR_MESSAGE_MAP.put(10002, "A SOAP Connection Close Error Has Occured.");
		ERROR_MESSAGE_MAP.put(10003, "A MQ Connection Close Error Has Occured.");
		ERROR_MESSAGE_MAP.put(10004, "Error Has Occured during Startup.");
		ERROR_MESSAGE_MAP.put(10005, "Context Close Error Has Occured.");
		ERROR_MESSAGE_MAP.put(10006, "Properties File Not Found.");
		ERROR_MESSAGE_MAP.put(10007, "IO Exception While Accessing Properties File.");
		ERROR_MESSAGE_MAP.put(10008, "SOAP Exception While formatting the SOAP Message.");
		ERROR_MESSAGE_MAP.put(10009, "IO Exception While formatting the SOAP Message.");
		ERROR_MESSAGE_MAP.put(10010, "SAX Exception While formatting the SOAP Message.");
		ERROR_MESSAGE_MAP.put(10011, "Parser Configuration exception while formatting the SOAP Message.");
		ERROR_MESSAGE_MAP.put(10012, "Transformer Configuration exception while formatting the SOAP Message.");
		ERROR_MESSAGE_MAP.put(10013, "Transformer exception while formatting the SOAP Message.");
		ERROR_MESSAGE_MAP.put(10014, "Initial context lookup failed while starting the Timer.");
		ERROR_MESSAGE_MAP.put(10015, "Failed to lookup CRMServiceEJB.");
		ERROR_MESSAGE_MAP.put(10016, "Failed to lookup IATATimerServiceEJB.");
		ERROR_MESSAGE_MAP.put(10017, "SOAP Communication Failure.");
		ERROR_MESSAGE_MAP.put(10018, "SQL Exception.");
		ERROR_MESSAGE_MAP.put(10019, "Class Not Found Exception.");
		ERROR_MESSAGE_MAP.put(10020, "SQL Connection Close Error Has Occured.");
		ERROR_MESSAGE_MAP.put(10021, "Error Occured While finding the TTYAddress.");
		ERROR_MESSAGE_MAP.put(10022, "Exception while InitialContext LookUp.");
		ERROR_MESSAGE_MAP.put(10023, "Exception while SQL RollBack.");
	}
    
	public static String getErrorMessage(int pErrorCode) {
		return ERROR_MESSAGE_MAP.get(pErrorCode);
	}
    
    private MessageConstants() {

    }
    //FIS146A Outgoing XFFM Flight Manifest Message Constants
    /**
     * 
     * <p>
     * The COR line is supported only for FFM version 6 or Higher.
     * <p>
     * value = {@value}
     */
    public static final int COR_SUPPORTED_FOR_VERSION_NOT_LESS_SIX = 178110;
	/**
	 * 
	 * <p>
	 * The Airline Code Number is mandatory.
	 * <p>
	 * value = {@value}
	 */
	public static final int AIRLINE_CODE_NUMBER_MANDATORY = 178043;
	/**
	 * 
	 * <p>
	 * The Airline Code Number must be 3 numeric characters.
	 * <p>
	 * value = {@value}
	 */
	public static final int AIRLINE_CODE_NUMBER_INVALID = 178042;
	/**
	 * 
	 * <p>
	 * The Shipment Reference Number is mandatory.
	 * <p>
	 * value = {@value}
	 */
	public static final int SHIPMENT_REFERENCE_NUMBER_MANDATORY = 178045;
	/**
	 * 
	 * <p>
	 * The Shipment Reference Number must be in the format 8(N)X.
	 * <p>
	 * value = {@value}
	 */
	public static final int SHIPMENT_REFERENCE_NUMBER_INVALID = 178044;
	/**
	 * 
	 * <p>
	 * The Origin Station is mandatory.
	 * <p>
	 * value = {@value}
	 */
	public static final int ORIGIN_STATION_MANDATORY = 178046;
	
	/**
	 * 
	 * <p>
	 * The Destination Station must be of 3 or 5 alphabetic characters.
	 * <p>
	 * value = {@value}
	 */
	public static final int DESTINATION_STATION_INVALID = 178049;

	/**
	 * 
	 * <p>
	 * The Destination Station is mandatory.
	 * <p>
	 * value = {@value}
	 */
	public static final int DESTINATION_STATION_MANDATORY = 185048;
	/**
	 * 
	 * <p>
	 * The Origin Station must be of 3 or 5 alphabetic characters.
	 * <p>
	 * value = {@value}
	 */
	public static final int ORIGIN_STATION_INVALID = 178047;
	/**
	 * 
	 * <p>
	 * The Consignment Shipment Code is mandatory.
	 * <p>
	 * value = {@value}
	 */
	public static final int CONSIGNMENT_SHIPMENT_CODE_MANDATORY = 178051;
	/**
	 * 
	 * <p>
	 * The Consignment Shipment Code must be 'T', 'P', 'S', 'D' or 'M'.
	 * <p>
	 * value = {@value}
	 */
	public static final int CONSIGNMENT_SHIPMENT_CODE_INVALID = 178050;
	/**
	 * 
	 * <p>
	 * The Number of Pieces is mandatory.
	 * <p>
	 * value = {@value}
	 */
	public static final int NUMBER_OF_PIECES_MANDATORY = 178053;
	
	/**
	 * 
	 * <p>
	 * The Number of Pieces must be 1 â?? 4 numeric characters.
	 * <p>
	 * value = {@value}
	 */
	public static final int NUMBER_OF_PIECES_INVALID = 178052;
	/**
	 * 
	 * <p>
	 * The Weight Unit is mandatory.
	 * <p>
	 * value = {@value}
	 */
	public static final int WEIGHT_UNIT_MANDATORY = 178055;
	/**
	 * 
	 * <p>
	 * The piece length exceeds the limit.
	 * <p>
	 * value = {@value}
	 */
	public static final int PIECE_LENGTH_INVALID = 178193;
	/**
	 * 
	 * <p>
	 * The Weight Unit must be 'K' or 'L'.
	 * <p>
	 * value = {@value}
	 */
	public static final int WEIGHT_UNIT_INVALID = 178054;
	/**
	 * 
	 * <p>
	 * The Weight is mandatory.
	 * <p>
	 * value = {@value}
	 */
	public static final int WEIGHT_MANDATORY = 178057;
	/**
	 * 
	 * <p>
	 * The Weight Unit is prohibited as the weight is not input.
	 * <p>
	 * value = {@value}
	 */
	public static final int WEIGHT_UNIT_PROHIBITED = 178300;
	/**
	 * 
	 * <p>
	 * The Weight Unit must be 1 character.
	 * <p>
	 * value = {@value}
	 */
	public static final int WEIGHT_UNIT_LENGTH_INVALID = 178199;
	/**
	 * 
	 * <p>
	 * The Weight must have maximum 7 digits before the decimal position,
	 * maximum 1 digit after the decimal position.
	 * <p>
	 * value = {@value}
	 */
	public static final int WEIGHT_INVALID = 178056;
	/**
	 * 
	 * <p>
	 * The weight length is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int WEIGHT_LENGTH_INVALID = 178194;
	/**
	 * 
	 * <p>
	 * The weight length exceeds the limit.
	 * <p>
	 * value = {@value}
	 */
	public static final int FFM_WEIGHT_LENGTH_INVALID = 178195;
	/**
	 * 
	 * <p>
	 * The volume length is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int FFM_VOLUME_LENGTH_INVALID = 178197;
	/**
	 * 
	 * <p>
	 * The volume length is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int VOLUME_LENGTH_INVALID = 178196;
	/**
	 * 
	 * <p>
	 * Density Group is not allowed when Goods Volume is Provided.
	 * <p>
	 * value = {@value}
	 */
	public static final int DENSITY_GROUP_NOT_ALLOWED = 178066;
	/**
	 * 
	 * <p>
	 * The Volume Unit must be either 'CF' or 'MC'.
	 * <p>
	 * value = {@value}
	 */
	public static final int VOLUME_UNIT_INVALID = 178059;
	/**
	 * 
	 * <p>
	 * Density Group is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int DENSITY_GROUP_INVALID = 178065;
	/**
	 * 
	 * <p>
	 * The Volume is required.
	 * <p>
	 * value = {@value}
	 */
	public static final int VOLUME_REQUIRED = 178060;
	/**
	 * 
	 * <p>
	 * The Volume must have maximum 9 digits before the decimal position,
	 * maximum 2 digit after the decimal. position.
	 * <p>
	 * value = {@value}
	 */
	public static final int VOLUME_INVALID = 178061;
	/**
	 * 
	 * <p>
	 * The density group is required.
	 * <p>
	 * value = {@value}
	 */
	public static final int DENSITY_GROUP_REQUIRED = 178064;
	/**
	 * 
	 * <p>
	 * The Volume Unit is required.
	 * <p>
	 * value = {@value}
	 */
	public static final int VOLUME_UNIT_REQUIRED = 178058;
	/**
	 * 
	 * <p>
	 * The Volume Unit must be 2 characters.
	 * <p>
	 * value = {@value}
	 */
	public static final int VOLUME_UNIT_LENGTH_INVALID = 178301;

	/**
	 * 
	 * <p>
	 * The density Indicator is required.
	 * <p>
	 * value = {@value}
	 */
	public static final int DENSITY_INDICATOR_REQUIRED = 178062;
	/**
	 * 
	 * <p>
	 * The Density Indicator is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int DENSITY_INDICATOR_INVALID = 178063;
	/**
	 * 
	 * <p>
	 * Volume details or Density Group is required.
	 * <p>
	 * value = {@value}
	 */
	public static final int VOLUME_DETAILS_OR_DENSITY_GROUP_REQUIRED = 178067;
	/**
	 * 
	 * <p>
	 * Total Congsingment Shipment Code is mandatory.
	 * <p>
	 * value = {@value}
	 */
	public static final int TOTAL_CONSIGNMENT_SHIPMENT_CODE_MANDATORY = 178069;
	/**
	 * 
	 * <p>
	 * Total Congsingment Shipment Code must be 'T'.
	 * <p>
	 * value = {@value}
	 */
	public static final int TOTAL_CONSIGNMENT_SHIPMENT_CODE_INVALID = 178068;
	/**
	 * 
	 * <p>
	 * Total Number of Pieces must be 1 - 4 numeric characters.
	 * <p>
	 * value = {@value}
	 */
	public static final int TOTAL_NUMBER_OF_PIECES_INVALID = 178070;
	/**
	 * 
	 * <p>
	 * Total Number of Pieces is mandatory.
	 * <p>
	 * value = {@value}
	 */
	public static final int TOTAL_NUMBER_OF_PIECES_MANDATORY = 178071;
	/**
	 * 
	 * <p>
	 * The Goods Description is mandatory.
	 * <p>
	 * value = {@value}
	 */
	public static final int GOODS_DESCRIPTION_MANDATORY = 178072;
	/**
	 * 
	 * <p>
	 * The Length of Goods Description is must be 1-15 characters.
	 * <p>
	 * value = {@value}
	 */
	public static final int GOODS_DESCRIPTION_LENGTH_INVALID = 178073;
	/**
	 * 
	 * <p>
	 * The special handling code is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int SPL_CODE_INVALID = 178198;
	/**
	 * 
	 * <p>
	 * The Measurement Unit is mandatory.
	 * <p>
	 * value = {@value}
	 */
	public static final int MEASUREMENT_UNIT_MANDATORY = 178074;
	/**
	 * 
	 * <p>
	 * The Measurement Unit must be either ''CMT, ‘FOT’, 'INH' or 'MTR'.
	 * <p>
	 * value = {@value}
	 */
	public static final int MEASUREMENT_UNIT_INVALID = 178075;
	/**
	 * 
	 * <p>
	 * The Dimension Length is mandatory.
	 * <p>
	 * value = {@value}
	 */
	public static final int DIMENSION_LENGTH_MANDATORY = 178077;
	/**
	 * 
	 * <p>
	 * The Dimension Length must 1-5 numeric characters.
	 * <p>
	 * value = {@value}
	 */
	public static final int DIMENSION_LENGTH_INVALID = 178076;
	/**
	 * 
	 * <p>
	 * The Dimension Width is mandatory.
	 * <p>
	 * value = {@value}
	 */
	public static final int DIMENSION_WIDTH_MANDATORY = 178079;
	/**
	 * 
	 * <p>
	 * The Dimension Width must 1-5 numeric characters.
	 * <p>
	 * value = {@value}
	 */
	public static final int DIMENSION_WIDTH_INVALID = 178078;
	/**
	 * 
	 * <p>
	 * The Dimension Height is mandatory.
	 * <p>
	 * value = {@value}
	 */
	public static final int DIMENSION_HEIGHT_MANDATORY = 178081;
	/**
	 * 
	 * <p>
	 * The Dimension Height must 1-5 numeric characters.
	 * <p>
	 * value = {@value}
	 */
	public static final int DIMENSION_HEIGHT_INVALID = 178080;
	/**
	 * 
	 * <p>
	 * The Dimension Pieces is mandatory.
	 * <p>
	 * value = {@value}
	 */
	public static final int DIMENSION_PIECES_MANDATORY = 178083;
	/**
	 * 
	 * <p>
	 * The Dimension Pieces must 1-4 numeric characters.
	 * <p>
	 * value = {@value}
	 */
	public static final int DIMENSION_PIECES_INVALID = 178082;
	/**
	 * 
	 * <p>
	 * The Message Sequence Number is mandatory.
	 * <p>
	 * value = {@value}
	 */
	public static final int MESSAGE_SEQUENCE_NUMBER_MANDATORY = 178015;
	/**
	 * 
	 * <p>
	 * The Message Sequence Number is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int MESSAGE_SEQUENCE_NUMBER_INVALID = 178016;
	/**
	 * 
	 * <p>
	 * The Flight is mandatory.
	 * <p>
	 * value = {@value}
	 */
	public static final int FFM_FLIGHT_IS_MANDATORY = 178191;
	/**
	 * 
	 * <p>
	 * The Flight Carrier Code is mandatory.
	 * <p>
	 * value = {@value}
	 */
	public static final int FLIGHT_CARRIER_CODE_MANDATORY = 178018;

	/**
	 * 
	 * <p>
	 * The Flight Carrier Code must be 2 - 3 alphanumeric characters.
	 * <p>
	 * value = {@value}
	 */
	public static final int FLIGHT_CARRIER_CODE_INVALID = 178017;
	/**
	 * 
	 * <p>
	 * The Flight Number is mandatory
	 * <p>
	 * value = {@value}
	 */
	public static final int FLIGHT_NUMBER_MANDATORY = 178020;
	/**
	 * 
	 * <p>
	 * The Flight Number must be of 3 - 4N(A) format.
	 * <p>
	 * value = {@value}
	 */
	public static final int FLIGHT_NUMBER_INVALID = 178019;
	/**
	 * 
	 * <p>
	 * The Flight date is mandatory.
	 * <p>
	 * value = {@value}
	 */
	public static final int FLIGHT_DATE_MANDATORY = 178022;
	
	/**
	 * 
	 * <p>
	 * The Flight Time must be in a 24 hour clock format (HHMM).
	 * <p>
	 * value = {@value}
	 */
	public static final int FLIGHT_TIME_INVALID = 178023;
	
	/**
	 * 
	 * <p>
	 * The Flight Date is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int FLIGHT_DATE_INVALID = 178021;
	
	/**
	 * 
	 * <p>
	 * The Boarding station is mandatory.
	 * <p>
	 * value = {@value}
	 */
	public static final int BOARDING_STATION_MANDATORY = 178024;
	

	/**
	 * 
	 * <p>
	 * The Boarding station must be 3 or 5 alphabetic characters.
	 * <p>
	 * value = {@value}
	 */
	public static final int BOARDING_STATION_INVALID = 178025;
	
	/**
	 * 
	 * <p>
	 * The Aircraft Identification is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int AIRCRAFT_IDENTIFICATION_INVALID = 178026;
	
	/**
	 * 
	 * <p>
	 * The country code length is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int COUNTRY_CODE_LENGTH_INVALID = 178192;
	
	/**
	 * 
	 * <p>
	 * The ISO Country code must be 2 alphabetic characters.
	 * <p>
	 * value = {@value}
	 */
	public static final int ISO_COUNTRY_CODE_INVALID = 178094;
	
	/**
	 * 
	 * <p>
	 * The Scheduled Arrival Time must be in a 24 hour clock format (HHMM).
	 * <p>
	 * value = {@value}
	 */
	public static final int FLIGHT_ARRIVAL_TIME_INVALID = 178031;
	

	/**
	 * 
	 * <p>
	 * The Country code must be 2 alphabetic characters.
	 * <p>
	 * value = {@value}
	 */
	public static final int COUNTRY_CODE_INVALID = 178027;
	
	/**
	 * 
	 * <p>
	 * The Scheduled Arrival Date is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int FLIGHT_ARRIVAL_DATE_INVALID = 178029;
	
	/**
	 * 
	 * <p>
	 * The Arrival station must be 3 or 5 alphabetic characters.
	 * <p>
	 * value = {@value}
	 */
	public static final int ARRIVAL_STATION_INVALID = 178032;
	

	/**
	 * 
	 * <p>
	 * The Arrival Information is incomplete.
	 * <p>
	 * value = {@value}
	 */
	public static final int ARRIVAL_INFORMATION_INCOMPLETE = 178034;
	

	/**
	 * 
	 * <p>
	 * The offload station is mandatory.
	 * <p>
	 * value = {@value}
	 */
	public static final int OFFLOAD_STATION_MANDATORY = 178035;
	
	/**
	 * 
	 * <p>
	 * The offload station must be 3 or 5 alphabetic characters.
	 * <p>
	 * value = {@value}
	 */
	public static final int OFFLOAD_STATION_INVALID = 178036;
	
	/**
	 * 
	 * <p>
	 * The Offload Scheduled Departure Time must be in a 24 hour clock format
	 * (HHMM).
	 * <p>
	 * value = {@value}
	 */
	public static final int OFFLOAD_DEPARTURE_TIME_INVALID = 178041;
	

	/**
	 * 
	 * <p>
	 * The Offload Scheduled Departure Date is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int OFFLOAD_DEPARTURE_DATE_INVALID = 178039;
	
	/**
	 * 
	 * <p>
	 * The Information Identifier must be 1-3 alphabetic characters.
	 * <p>
	 * value = {@value}
	 */
	public static final int INFORMATION_IDENTIFIER_INVALID = 178095;
	
	/**
	 * 
	 * <p>
	 * The Customs, Security and Regulatory Control Information Identifier must
	 * be 1-2 alphabetic characters.
	 * <p>
	 * value = {@value}
	 */
	public static final int CUSTOMS_SECURITY_AND_REGULATORY_CONTROL_INFORMATION_IDENTIFIER_INVALID = 178097;
	
	/**
	 * 
	 * <p>
	 * The Supplementary Customs, Security and Regulatory Control Information
	 * must be 1-35 character set of all alphabets, numbers, hyphen, space and
	 * dot.
	 * <p>
	 * value = {@value}
	 */
	public static final int SUPPLEMENTARY_CUSTOMS_SECURITY_AND_REGULATORY_CONTROL_INFORMATION_INVALID = 178099;
	
	/**
	 * 
	 * <p>
	 * The consignment Remarks is required.
	 * <p>
	 * value = {@value}
	 */
	public static final int CONSIGMENT_REMARKS_REQUIRED = 178304;
	

	/**
	 * 
	 * <p>
	 * The consignment Remarks must be 1-65 character set of all alphabets,
	 * numbers, hyphen, space and dot.
	 * <p>
	 * value = {@value}
	 */
	public static final int CONSIGMENT_REMARKS_INVALID = 178305;
	
	/**
	 * 
	 * <p>
	 * The air waybill onward Destination Station is mandatory.
	 * <p>
	 * value = {@value}
	 */
	public static final int AWB_DESTINATION_STATION_MANDATORY = 185084;
	

	/**
	 * 
	 * <p>
	 * The priority must be in the range 1-9.
	 * <p>
	 * value = {@value}
	 */
	public static final int FFM_PRIORITY_CODE_INVALID = 178302;
	
	/**
	 * 
	 * <p>
	 * The air waybill onward Destination Station must be of 3 alphabetic
	 * characters.
	 * <p>
	 * value = {@value}
	 */
	public static final int AWB_DESTINATION_STATION_INVALID = 178085;

	/**
	 * 
	 * <p>
	 * The Carrier Code associated with the air waybill onward destination must
	 * be 2 alphanumeric characters.
	 * <p>
	 * value = {@value}
	 */
	public static final int AWB_DESTINATION_CARRIER_CODE_INVALID = 178086;
	
	/**
	 * 
	 * <p>
	 * The air waybill onward routing Flight Number must be of 3 - 4N(A) format.
	 * <p>
	 * value = {@value}
	 */
	public static final int AWB_FLIGHT_NUMBER_INVALID = 178087;
	/**
	 * 
	 * <p>
	 * The air waybill onward routing Flight Date is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int AWB_FLIGHT_DATE_INVALID = 178088;
	
	 /**
     * 
     * <p>
     * SCI remarks is not allowed for FFM version greater than 5.
     * <p>
     * value = {@value}
     */
    public static final int SCI_LINE_SUPPORTED_FOR_VERSION_NOT_GREATER_FIVE = 178105;
    /**
	 * 
	 * <p>
	 * The SCI remarks must be 1-15 character set of of all alphabets, numbers,
	 * hyphen, space and dot.
	 * <p>
	 * value = {@value}
	 */
	public static final int SCI_REMARKS_INVALID = 178092;
	/**
	 * 
	 * <p>
	 * The EU customs must be of 2 alphanumeric characters.
	 * <p>
	 * value = {@value}
	 */
	public static final int EU_CUSTOMS_INVALID = 178090;

	/**
	 * 
	 * <p>
	 * The container id is mandatory.
	 * <p>
	 * value = {@value}
	 */
	public static final int CONTAINER_ID_MANDATORY = 178102;
	/**
	 * 
	 * <p>
	 * The ULD load indicator must be 1 alphabetic character.
	 * <p>
	 * value = {@value}
	 */
	public static final int ULD_LOAD_INDICATOR_INVALID = 178103;

	/**
	 * 
	 * <p>
	 * The container id must at least be 2-10 alphanumeric characters.
	 * <p>
	 * value = {@value}
	 */
	public static final int CONTAINER_ID_INVALID = 178101;
	
	/**
	 * 
	 * <p>
	 * The ULD remarks must be 1-53character set of all alphabets, numbers,
	 * hyphen, space and dot.
	 * <p>
	 * value = {@value}
	 */
	public static final int ULD_REMARKS_INVALID = 178104;
	/**
	 * 
	 * <p>
	 * The ULD onward Destination Station is mandatory.
	 * <p>
	 * value = {@value}
	 */
	public static final int ULD_DESTINATION_STATION_MANDATORY = 185105;
	/**
	 * 
	 * <p>
	 * The ULD onward Destination Station must be of 3 alphabetic characters.
	 * <p>
	 * value = {@value}
	 */
	public static final int ULD_DESTINATION_STATION_INVALID = 178106;
	/**
	 * 
	 * <p>
	 * The Carrier Code associated with the ULD onward destination must be 2
	 * alphanumeric characters.
	 * <p>
	 * value = {@value}
	 */
	public static final int ULD_DESTINATION_CARRIER_CODE_INVALID = 178107;

	/**
	 * 
	 * <p>
	 * The ULD onward routing Flight Number must be of 3 - 4N(A) format.
	 * <p>
	 * value = {@value}
	 */
	public static final int ULD_FLIGHT_NUMBER_INVALID = 178108;

	/**
	 * 
	 * <p>
	 * The ULD onward routing Flight Date is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int ULD_FLIGHT_DATE_INVALID = 178109;
    /**
     * 
     * <p>
     * The FFM message format is invalid, minimum three lines required.
     * <p>
     * value = {@value}
     */
    public static final int FFM_MESSAGE_MINIMUM_LINES_REQUIRED = 178313;
    /**
     * 
     * <p>
     * The FFM message format is invalid, flight line required.
     * <p>
     * value = {@value}
     */
    public static final int FFM_MESSAGE_FLIGHT_LINE_REQUIRED = 178314;
    /**
     * 
     * <p>
     * The FFM message format is invalid, offload line required.
     * <p>
     * value = {@value}
     */
    public static final int FFM_MESSAGE_OFFLOAD_LINE_REQUIRED = 178315;
    /**
     * 
     * <p>
     * The FFM message format is invalid, end of line required.
     * <p>
     * value = {@value}
     */
    public static final int FFM_MESSAGE_LAST_CONT_REQUIRED = 178316;
    
    // LMSC-11111 UIS158 Start
    public static final int INVALID_CARRIER_CODE_TYPE = 50302;
    // LMSC-11111 UIS158 End

}
