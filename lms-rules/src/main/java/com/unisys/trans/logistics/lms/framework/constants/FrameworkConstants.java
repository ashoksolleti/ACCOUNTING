/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.framework.constants;

/**
 * <code>FrameworkConstants</code> class maintains the list of constants
 * pertaining to LMS module.
 */

public final class FrameworkConstants {
    /**
     * This constant holds the value ACTION_TYPE_CREATE.
     * 
     */
    public static final String ACTION_TYPE_CREATE = "C";

    /**
     * This constant holds the value ACTION_TYPE_DELETE.
     * 
     */
    public static final String ACTION_TYPE_DELETE = "D";

    /**
     * This constant holds the value ACTION_TYPE_UPDATE.
     * 
     */
    public static final String ACTION_TYPE_UPDATE = "U";

    public static final String ACTION_TYPE_MIGRATE = "M";

    public static final String AWB_ACN = "arcACN";

    public static final String AWB_SREF = "arcSREF";

    /**
     * Attribute to hold <code>AWB_CONV_CONTEXT</code> constant.<br>
     */
    public static final String AWB_CONV_CONTEXT = "awbConversation";

    /**
     * Attribute to hold <code>EL_AWB_CONV_CONTEXT</code> constant.<br>
     */
    public static final String EL_AWB_CONV_CONTEXT = "#{" + AWB_CONV_CONTEXT
                + "}";

    /**
     * This constant holds the length air waybill number. *
     * <p>
     * Value ={@value}
     */
    public static final int AWB_LENGTH = 8;

    /**
     * This constant holds the "LMSNG" Date format.
     * <p>
     * Value ={@value}
     */
    public static final String DATEFORMAT = "ddMMMyy";

    /**
     * This constant holds the "LMSNG" Date format.
     * <p>
     * Value ={@value}
     */
    public static final String DATEFORMAT_YYYYMMDD = "yyyyMMdd";
    
    /**
     * This constant holds the "LMSNG" Date format.
     * <p>
     * Value ={@value}
     */
    public static final String DATE_FORMAT_DDMMMYYYY = "ddMMMyyyy";

    /**
     * This constant holds the "LMSNG" Date format.
     * <p>
     * Value ={@value}
     */
    public static final String DATEFORMAT_YYMMDD = "yyMMdd";

    /**
     * Attribute to hold <code>BATCH</code> String constant.
     */
    public static final String BATCH = "batch";

    /**
     * Attribute to hold <code>BOOLEAN_Y</code> String constant.
     */
    public static final String BOOLEAN_Y = "Y";
    /**
     * Attribute to hold <code>BOOLEAN_Y</code> String constant.
     */
    public static final String BOOLEAN_N = "N";
    public static final String BOOLEAN_I = "I";

    /**
     * This constant holds the value comma.
     * 
     */
    public static final String COMMA = ",";
    
    /**
     * This constant holds the value semi colon.
     * 
     */
    public static final String SEMI_COLON = ";";

	/**
     * This constant holds the value white space.
     * 
     */
    public static final String WHITE_SPACE = " ";

    /**
     * This constant holds the "LMSNG" Date Time format.
     * <p>
     * Value ={@value}
     */
    public static final String DATETIMEFORMAT = "ddMMMyy HH:mm:ss";

    /**
     * This constant holds the "LMSNG" Date Time format - ddMMMyy HH:mm.
     * <p>
     * Value ={@value}
     */
    public static final String DATETIMEFORMAT_DDMMMYYHHMM = "ddMMMyy HH:mm";

    //LMSC-11147 UIS158
    public static final String DATETIMEFORMATOF_DDMMMYYHHMM = "ddMMMyyyy HHmm";

	/**
     * This constant holds the "LMSNG" Date Time format.
     * <p>
     * Value ={@value}
     */
    public static final String DATETIMEFORMAT_DDMMYYHHMMSSMMM = "ddMMyyhhmmssmmm";
    
    /**
     * This constant holds the "LMSNG" Date Time format - ddMMMyy HH mm.
     * <p>
     * Value ={@value}
     */
    public static final String DATETIMEFORMAT_DDMMMYYHH_MM = "ddMMMyy HHmm";
    /**
     * This constant holds the "LMSNG" Date Time Second format.
     * <p>
     * Value ={@value}
     */
    public static final String DATETIMESECONDFORMAT = "yyyy-MM-dd HH:mm:ss.S";

    /**
     * This constant holds the distance scale value.
     * <p>
     * Value ={@value}
     */
    public static final int DISTANCE_SCALE = 1;

    /**
     * Attribute to hold <code>DOUBLE_QUOTE</code> String constant.
     */
    public static final String DOUBLE_QUOTE = "\"";

    /**
     * This constant holds empty string as value.
     * <p>
     * Value ={@value}
     */
    public static final String EMPTY_STRING = "";
    /**
     * This constant holds Space string as value.
     * <p>
     * Value ={@value}
     */
    public static final String SPACE_STRING = " ";

    public static final String SLASH_ZERO = "/0";
    /**
     * Attribute to hold <code>FORWARD_SLASH</code> String constant.
     */
    public static final String FORWARD_SLASH = "/";

    /**
     * This constant holds the value GMT.
     * 
     */
    public static final String GMT = "GMT";

    /**
     * Attribute to hold <code>JMS_HOST_PROPERTY</code> String constant.
     */
    public static final String JMS_HOST_PROPERTY = "host";

    /**
     * This constant holds the value LENGTH_SCALE value.
     * 
     */
    public static final int LENGTH_SCALE = 2;

    /**
     * This constant holds the value MIGRATION.
     * <p>
     * Value ={@value}
     */
    public static final String MIGRATION = "batch";

    /**
     * Attribute to hold <code>NEW_LINE</code> String constant.
     */
    public static final String NEW_LINE = "\n";

    /**
     * This constant defines the roll back status of a transaction.
     * <p>
     * Used when roll back is not required.
     * <p>
     * Value ={@value}
     */
    public static final int NOROLLBACK = 1;

    /**
     * This constant holds the value one.
     */
    public static final int ONE = 1;

    /**
     * This constant holds the value three.
     */
    public static final int THREE = 3;

    /**
     * This constant holds the value of OPERATIONAL_CONTACTS_IND.
     */
    public static final String OPERATIONAL_CONTACTS_IND = "S";

    /**
     * This constant defines the roll back status of a transaction.
     * <p>
     * Used when roll back is required.
     */
    public static final Integer ROLLBACK = 0;

    /**
     * This constant holds the value of STATION_FACILITY_ATTRIBUTE.
     */
    public static final Object STATION_FACILITY_ATTRIBUTE = "FacilitySection";

    /**
     * This constant holds the value of STATION_FACILITY_CONTACT.
     */
    public static final Object STATION_FACILITY_CONTACT = "FacilityContact";

    /**
     * This constant holds the value of STATION_GENERAL_CUSTOMS.
     */
    public static final Object STATION_GENERAL_CUSTOMS = "GeneralCustoms";

    /**
     * This constant holds the value of STATION_GENERAL_LOCATION.
     */
    public static final Object STATION_GENERAL_LOCATION = "GeneralLocation";

    /**
     * This constant holds the value of STATION_HANDLING_DETAILS.
     */
    public static final Object STATION_HANDLING_DETAILS = "HandlingDetails";

    /**
     * This constant holds the value of STATION_HOST_MECHANIZED_IND.
     */
    public static final Object STATION_HOST_MECHANIZED_IND = "StaitonHostMechanizedInd";

    /**
     * This constant holds the value of STATION_HOURS.
     */
    public static final Object STATION_HOURS = "StationHours";

    /**
     * This constant holds the value of STATION_INFO_SPLITTER.
     */
    public static final String STATION_INFO_SPLITTER = ",(?=([^\"]*\"[^\"]*\")*[^\"]*$)";

    /**
     * This constant holds the value of STATION_OPERATIONAL_SALES_CONTACTS.
     */
    public static final Object STATION_OPERATIONAL_SALES_CONTACTS = "OperationalSalesContact";

    /**
     * This constant holds the value of STATION_OTHER_SPL_INS.
     */
    public static final Object STATION_OTHER_SPL_INS = "OtherSpecialInstruction";

    /**
     * This constant holds the value of STATION_SUPPLEMENTAL_AGENCY_HOLIDAY.
     */
    public static final Object STATION_SUPPLEMENTAL_AGENCY_HOLIDAY = "SupplementalAgencyHoliday";

    /**
     * This constant holds the value of STATION_SUPPLEMENTAL_AGENCY_HOURS.
     */
    public static final Object STATION_SUPPLEMENTAL_AGENCY_HOURS = "SupplementalAgencyHours";

    /**
     * This constant holds the parameter value for station code length.
     * <p>
     * Value ={@value}
     */
    public static final int STATIONCODE_LENGTH_FIVE = 5;

    /**
     * This constant holds the parameter value for station code. lenght
     * <p>
     * Value ={@value}
     */
    public static final int STATIONCODE_LENGTH_THREE = 3;
    
    /**
     * This constant holds the value for Partition count of error queue.
     * <p>
     * Value ={@value}
     */    
    public static final int PARTITION_COUNT = 1000;
    
    /**
     * This constant holds the value of SUPPLEMENTAL_HOURS.
     */
    public static final String SUPPLEMENTAL_HOURS = "S";

    // Added for Warehouse gateway - UC041
    /**
     * This constant holds the value of terminal location.
     * <p>
     * Value ={@value}
     */
    public static final String TERMINAL_LOCATION = "LOCATION";

    /**
     * This constant holds the time format .
     * <p>
     * Value ={@value}
     */
    public static final String TIMESECOND_FORMAT = "HH:mm:ss";

    /**
     * This constant holds the time format with seconds .
     * <p>
     * Value ={@value}
     */
    public static final String TIME_FORMAT = "HHmm";

    /**
     * This constant holds the time scale value.
     * <p>
     * Value ={@value}
     */
    public static final int TIME_SCALE = 2;

    /**
     * This constant contains the value to which the query has to be trimmed.
     * <p>
     * value = {@value}
     */
    public static final int TRIM_QUERYLENGTH = 5;

    /**
     * This constant holds Global string as value.
     * <p>
     * Value ={@value}
     */
    public static final String USERNAME_GLOBAL = "Global";

    /**
     * This constant holds the volume scale value.
     * <p>
     * Value ={@value}
     */
    public static final int VOLUME_SCALE = 2;

    /**
     * This constant holds the week day value.
     * <p>
     * Value ={@value}
     */
    public static final int WEEKDAY = 7;

    /**
     * This constant holds the weight scale value.
     * <p>
     * Value ={@value}
     */
    public static final int WEIGHT_SCALE = 1;

    /**
     * This constant holds the weight/volume scale value to be stored in the
     * system.
     * <p>
     * Value ={@value}
     */
    public static final int WEIGHT_VOLUME_DB_SCALE = 10;
    /**
     * This constant holds the Revenue scale value to be stored in the
     * system.
     * <p>
     * Value ={@value}
     */
    public static final int REVENUE_SCALE = 2;

    /**
     * This constant holds the value YES.
     */

    public static final String YES_LITERAL = "YES";

    /**
     * This constant holds the value NO.
     */
    public static final String NO_LITERAL = "NO";

    /**
     * This constant holds the value zero.
     */
    public static final int ZERO = 0;
    public static final String STRING_ZERO = "0";

    public static final String LMS_DATE_FORMAT = "yyMMdd";
    
    public static final String DATE_FORMAT_YYYY_MM_DD = "YYYY-MM-dd";
    public static final String DATE_FORMAT_DDMMMYY = "DD-MMM-YY";
    public static final String LMS_DATE_TIME_FORMAT = "yyMMdd HHmm";

    public static Object MIGRATIONMODE = "MigrationMode";
    
    /**
     * This constant holds the value FIVE value.
     * 
     */
    public static final int FIVE = 5;
    /**
     * This constant holds the time format with seconds .
     * <p>
     * Value ={@value}
     */
    public static final String TIME_FORMAT_HHMM = "HH:mm";
    public static final String EMAIL_CONTENT_TYPE="text/plain";
    
    public static final String TO_EMAIL_COLUMN = "fldEmailIdForPharma";
    
    /**
     * Attribute to hold <code>BATCH_GLOBAL_UPDATES</code> String constant.
     */
    public static final String BATCH_GLOBAL_UPDATES = "Global";
    public static final String TARIFF_RATE_ATP_NEW_COUNT = "Total Number of New Rates";
    public static final String TARIFF_RATE_ATP_CHANGED_COUNT = "Total Number of Changed Rates";
    public static final String TARIFF_RATE_ATP_SKIPPED_COUNT = "Total Number of Rates that Could Not Be Extracted";
    public static final String LOYALTY_ID_VALIDATOR = "LOYALTYID";

    /**
     * Attribute to hold <code> INTERNAL_SERVER_ERROR</code> String constant.
     */
    public static final String INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR";
    public static final String ALPHABET = "[A-Z]";
    public static final int FOUR = 4;    

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
    
    public static final char EOT = '\4';

    /**
     * This constant defines the end of the text.
     */
    public static final char ETX = '\3';
     /* <code>Private constructor.</code>
     */
    private FrameworkConstants() {

    }
    public static String CONTRACT_HEADER_LINE="CTC Header,Contract Number,Effective Date,Expiration Date,Contract Origin Code,Contract Origin Type,Contract All Origin,Contract Destination Code,Contract Destination Type,Contract All Destination,Carrier Code,Carrier Code,Carrier Code,Carrier Code,Allow Routing Compression,Other Charge Contract ID,Status,Default Weight Unit,Currency Code,Use With Add-Ons,Agent Commission,Bi-Directional Indicator,Origin  To Destination Pay Code,Destination To Origin Pay Code,Contract Priority,Enforce Hurdle Rates,Campaign Contract Indicator,Special Handling Code Rule,Special Handling Codes,Special Handling Codes,Special Handling Codes,Special Handling Codes,Special Handling Codes,Special Handling Codes,Special Handling Codes,Special Handling Codes,Special Handling Codes,Special Handling Codes,Special Notes,Contract Hard Delete Indicator,User Identifier,Station,Office,Date / Time,Flight Specific Indicator,Flight,Flight Number,Flight Suffix,All Flights Indicator,Cargo Classification(Passenger),Cargo Classification(Freighter),Cargo Classification(Combination),Allotment Id,Allotment Category,All Days Indicator,Flight Operation Day,Flight Operation From Time,Flight Operation To Time,Flight Operation Day,Flight Operation From Time,Flight Operation To Time,Flight Operation Day,Flight Operation From Time,Flight Operation To Time,Flight Operation Day,Flight Operation From Time,Flight Operation To Time,Flight Operation Day,Flight Operation From Time,Flight Operation To Time,Flight Operation Day,Flight Operation From Time,Flight Operation To Time,Flight Operation Day,Flight Operation From Time,Flight Operation To Time";
    
    public static String CONTRACT_PARTS_LINE="PAR Header,All Participants Indicator,Participant Account Number,Participant Group Indicator,Participant Name,Participant Address,Participant City,Participant State,Participant Country,Participant Postal Code,Shipper,Consignee,Forwarder,Agent,Bill-To Shipper,Bill-To Consignee,Responsible Party,Participant Account Number,Participant Group Indicator,Participant Name,Participant Address,Participant City,Participant State,Participant Country,Participant Postal Code,Shipper,Consignee,Forwarder,Agent,Bill-To Shipper,Bill-To Consignee,Participant Account Number,Participant Group Indicator,Participant Name,Participant Address,Participant City,Participant State,Participant Country,Participant Postal Code,Shipper,Consignee,Forwarder,Agent,Bill-To Shipper,Bill-To Consignee";
    
    public static String CONTRACT_MULTISEGMENT_LINE="MS Header,Multi-Segment Origin Code,Multi-Segment All Origin,Multi-Segment Allow Routing Compression,Multi-Segment Intermediate Station Code,Multi-Segment All Intermediate Station,Multi-Segment Carrier Code,Multi-Segment Carrier Code,Multi-Segment Carrier Code,Multi-Segment Carrier Code,Multi-Segment Intermediate Station Code,Multi-Segment All Intermediate Station,Multi-Segment Carrier Code,Multi-Segment Carrier Code,Multi-Segment Carrier Code,Multi-Segment Carrier Code,Multi-Segment Intermediate Station Code,Multi-Segment All Intermediate Station,Multi-Segment Carrier Code,Multi-Segment Carrier Code,Multi-Segment Carrier Code,Multi-Segment Carrier Code,Multi-Segment Intermediate Station Code,Multi-Segment All Intermediate Station,Multi-Segment Carrier Code,Multi-Segment Carrier Code,Multi-Segment Carrier Code,Multi-Segment Carrier Code";
    
    public static String CONTRACT_RATING_LINE="RAT Header,Contract Definition,Rate Source,Rate Type,Rate Class,Commodity Number,All Commodity Indicator,Class Rating ID,ULD Type,All ULD Type Indicator,ULD Charge,Minimum Weight,All Minimum Weight,Rate Adjustment,Rate Percentage Adjustment,Pivot Weight,Over Pivot / B Rate,Minimum Shipment Size,Maximum Shipment Size,Rating Weight Unit";

    public static String SPOTRATE_HEADER_LINE="SRA Header,SRA Number,Effective Date,Expiration Date,Spot Rate Origin Code,Spot Rate Origin Type,Spot Rate Intermediate Station Code, Spot Rate Intermediate Station Type,Spot Rate Intermediate Station Carrier Code,Spot Rate Intermediate Station Code, Spot Rate Intermediate Station Type,Spot Rate Intermediate Station Carrier Code,Spot Rate Intermediate Station Code, Spot Rate Intermediate Station Type,Spot Rate Intermediate Station Carrier Code,Spot Rate Intermediate Station Code, Spot Rate Intermediate Station Type,Spot Rate Intermediate Station Carrier Code,Spot Rate Intermediate Station Code, Spot Rate Intermediate Station Type,Spot Rate Intermediate Station Carrier Code,Allow Routing Compression,Agent Commission,Pay Code,Status,Enforce Hurdle Rates,All In Pricing Indicator,Airline Code Number,Shipment Reference Number,Air Waybill Unique Key,Flight Number,Flight Date,Product Code,Default Weight Unit,Currency Code,Special Notes,Remarks,Spot Rate Hard Delete Indicator,Authorization User,Agent ID,Station Code,Office Code,Date / Time,Authorization Code,Authorization Queue Office,Last Updated User,Station Code,Office Code,Date / Time,Participant Account Number,Defer Participant Input,Participant Group Indicator,Participant Name,Participant Address,Participant City,Participant State,Participant Country,Participant Postal Code";
    
    public static String SPOTRATE_RATING_LINE="RAT Header,Spot Rate Definition,Rate Source,Rate Type,Rate Class,Commodity Number,All Commodity Indicator,Class Rating ID,ULD Type,All ULD Type Indicator,ULD Charge,Minimum Weight,ALL Minimum Weight Indicator,Rate Adjustment,Rate Percentage Adjustment,Pivot Weight,Over Pivot/B Rate,Estimated Shipment Size,Rating Weight Unit";
    
    public static String TARIFFRATE_LINE = "Origin Code,Destination Code,Carrier Code,Rate Source,Rate Type,Rate Class,Commodity Number,ULD Type,ULD Charge,Rating Note,Minimum Weight,Rate,Currency Code,Pivot Weight,Over Pivot Rate,Effective Date,Expiration Date,Weight Unit,Rate Construction Indicator,Pending Government Approval Indicator,Flight Specific Indicator,All Flights Indicator,Flight Carrier Code,Flight Number,All Days Indicator,Flight Operation Day,Flight Operation From Time,Flight Operation To Time,Flight Operation Day,Flight Operation From Time,Flight Operation To Time,Flight Operation Day,Flight Operation From Time,Flight Operation To Time,Flight Operation Day,Flight Operation From Time,Flight Operation To Time,Flight Operation Day,Flight Operation From Time,Flight Operation To Time,Flight Operation Day,Flight Operation From Time,Flight Operation To Time,Flight Operation Day,Flight Operation From Time,Flight Operation To Time,Tariff Rate Hard Delete Indicator";
    
    public static String PARTS_GROUP_LINE_PARA_ON = "Group Participant Account,Group Description,Account Number,Account Type,MemberHardDeleteIndicator,"
    		+ "Delete/Restore,Deletion Date,Effective Date,Expiration Date";
    public static String PARTS_GROUP_LINE_PARA_OFF="Group Participant Account,Group Description,Account Number,Account Type,"
    		+ "MemberHardDeleteIndicator,Delete/Restore,Deletion Date";
    public static String AGGREGATE_LINE = "Aggregate,Aggregate description,Membership Type,Membership Value,Allow Tariff Rates,Delete/Restore,Deletion Date,Include/Exclude,Include/Exclude Type,Include/Exclude Value";
    //UIS110
    /**
 	 * This constant defines the default office identifier.
 	 */
 	public static final String OFFICE_IDENTIFER = "KUL110";
 	/**
	 * This constant defines the CWIS Airwaybill level message formatting error
	 * queue.
	 */
	public static final String STATION_SYNC_ERROR_QUEUE= "StationSyncErrorQueue";
	
	public static final String TRUE_STRING= "TRUE";
	
	public static final String YES_FULL= "YES";
	
	public static final String NO_FULL= "NO";
	
	public static final int ZERO_2DECIMAL =0; 
	
	public static final String AWB_OID= "AWBOID";
	
	public static final String RETRY_COUNTER= "RETRY_COUNTER";
	
	public static final String RETRY_INTERVAL= "RETRY_INTERVAL";
	
	public static final int FULL_DAY_HOURS = 2359;

    public static final int FOUR_ZERO = 0000;

    public static final String DATEFORMAT_AUTOFBL = "dd-MMM-yy";

    public static final String BLANK_SPACE = " ";

    public static final String DAY_MONTH_TIME_PATTERN = "([0-9]{2})([0-9]{2})([0-9]{2})";

    public static final String DELETE_REQUEST_TYPE = "DELETE";
	
	// copied from ng for PLT
    public static final String YES = "Y";
	public static final String NO = "N";
    
    // LMSC-11111 UIS158 Start
    public static final String CARRIAGE_RETURN = "\r\n";
    
    public static final String SIX_STRING= "6";
    
    public static final String PARTICIPANTG= "participantG";
    
    public static final String SINGLE_CODES = "'";
    
    public static final int TWO = 2;
    
    public static final String JMS_USER_PROPERTY = "user";
    // LMSC-11111 UIS158 End
    
    /**
     * Attribute to hold <code>JMS_HOST_PROPERTY</code> String constant.
     */
    public static final String JMS_QUEUE_NAME = "QueueName";

	
	/**
	 * Attribute to hold <code>token</code> String constant.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final String TOKEN = "token";

	/**
	 * Attribute to hold <code>TokenData</code> String constant.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final String TOKENDATA = "TokenData";

	/**
	 * Attribute to hold <code>TokenKey</code> String constant.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final String TOKENKEY = "TokenKey";

	/**
	 * This constant holds the Login Attribute Separator.
	 * 
	 */
	public static final String LOGIN_ATTRIBUTES_SEPARATOR = "&!@#%";

	public static final String AGENT_OFFICE_CODE = "LMSC_DEFAULT_AGENT_OFFICE";

	public static final String RESTWEBSERVICE = "Rest Webservices Initiated Request";
	
    /**
     * This constant holds the value NO_SCALE value.
     * 
     */
    public static final int NO_SCALE = 0;

    public static final String CRACTION_RA = "RA";

    public static final String CRACTION_RD = "RD";
    
    public static final String STRING_THREE = "3";
    
    public static final char BLANK_SPACE_CHARACTER = ' ';
	
}