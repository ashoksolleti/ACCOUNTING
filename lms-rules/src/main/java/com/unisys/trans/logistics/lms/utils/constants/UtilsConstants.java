/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.constants;

/**
 * <code>UtilsConstants</code> maintains the list of constants pertaining to UTILS module.
 * <p>
 */
public final class UtilsConstants {

    /**
     * Holds the literal value to indicate Direct City members to be stored in DB.
     * <p>
     * Value = {@value}
     */
    public static final String AGGREGATE_DIRECT_CITY_MEMBER = "D";

    /**
     * Holds the literal value to indicate exploded City members to be stored in DB.
     * <p>
     * Value = {@value}
     */
    public static final String AGGREGATE_EXPLODED_CITY_MEMBER = "E";

    /**
     * Holds the Aggregate Area value for Error message.
     * <p>
     * Value = {@value}
     */
    public static final String AGGREGATE_MEMBER_AREA = "areas";

    /**
     * Holds the Aggregate city value for Error message.
     * <p>
     * Value = {@value}
     */
    public static final String AGGREGATE_MEMBER_CITY = "cities";

    /**
     * Holds the Aggregate country value for Error message.
     * <p>
     * Value = {@value}
     */
    public static final String AGGREGATE_MEMBER_COUNTRY = "countries";

    /**
     * Holds the Aggregate region value for Error message.
     * <p>
     * Value = {@value}
     */
    public static final String AGGREGATE_MEMBER_REGION = "regions";

    /**
     * Holds the Aggregate subarea value for Error message.
     * <p>
     * Value = {@value}
     */
    public static final String AGGREGATE_MEMBER_SUBAREA = "subareas";

    /**
     * This constant holds the value of Automatic Check-In By Flight Arrival. Value 'A' means check-in all
     * loose goods, ULDs, and goods within carrier built ULDs on the flight.
     * <p>
     * Value = {@value}
     */
    public static final String AUTOMATIC_CHECK_IN_ALL_LOOSE_GOODS_ULDS = "A";

    /**
     * Holds the size of the numeric code.
     * <p>
     * Value = {@value}
     */
    public static final int CURRENCY_NUMERIC_CODE_SIZE = 3;

    /**
     * This constant holds the date time format.
     * <p>
     * Value = {@value}
     */
    public static final String DATE_TIME_FORMAT = "ddMMyyyy kkmm";

    /**
     * This constant holds the default value for the Aircraft Registration Type. The default value 'O'
     * indicates that only the entered Aircraft Registration number is restricted.
     * <p>
     * Value = {@value}
     */
    public static final String DEFAULT_AIRCRAFT_REGISTRATION_CODE = "O";

    /**
     * This constant holds default value for Automatic Assignment To Booked Fight indicator.
     * <p>
     * Booked Fight indicator controls whether automatic flight assignment to the booked flight for booked
     * goods or ULDs is attempted.Default value is 'S' which indicates Automatic flight assignment to the
     * booked flight is attempted based on system level parameter.
     * <p>
     * value = {@value}
     */
    public static final String DEFAULT_AUTO_ASSIGN_BOOKED_FLIGHT = "S";

    /**
     * This constant holds the default value for Automatic Confirm Discrepancy.
     * <p>
     * Automatic Confirm Discrepancy indicates if loose goods discrepancies declared at the station are to be
     * automatically confirmed by the system. The default value is N which indicates that the discrepancies at
     * the station are not automatically confirmed by the system.
     * <p>
     * value = {@value}
     */
    public static final String DEFAULT_AUTO_CONFIRM_DISCREPANCY = "N";

    /**
     * This constant holds the default value 'NO' for Automatic Check-In By Flight Arrival.
     * <p>
     * A value of NO means that no automatic Goods Check In is performed.
     * <p>
     * value = {@value}
     */
    public static final String DEFAULT_AUTOCHECK_INFLIGHT_ARRIVAL = "NO";

    /**
     * This constant holds the default value 'G' for Air Waybill clears import audit based on Finalization Of
     * Goods / FSU DLV.
     * <p>
     * The value 'G'indicates finalization of Goods.
     * <p>
     * value = {@value}
     */
    public static final String DEFAULT_AWB_CLEARS_IMPORT_CODE = "G";

    /**
     * This constant holds the default value for Customs Automated port selection.
     * <p>
     * The default value 'O' indicates that there is no customs facility at the station.
     * <p>
     * value = {@value}
     */
    public static final String DEFAULT_CUSTOMS_AUTOPORT_SELECTION_CODE = "O";

    /**
     * This constant holds the default value for Display Remarks.
     * <p>
     * The default value 'N' means do not display the remarks field as a warning message.
     * <p>
     * value = {@value}
     */
    public static final String DEFAULT_DISPLAY_REMARKS = "N";

    /**
     * This constant holds the default value for Domestic Automatic Enter Flight Final.
     * <p>
     * Domestic Automatic Enter Flight Final indicates the type of departure time used by the batch program
     * which finalizes flights (in LMS CFMCFT) for scheduling an automatic Flight Finalization for domestic
     * flights.The default value 'S' indicates scheduled departure time.
     * <p>
     * value = {@value}
     */
    public static final String DEFAULT_DOMESTIC_AUTO_FLIGHT_CODE = "S";

    /**
     * This constant holds the default value for enforcement code. The default value 'Y' is applicable only
     * for collect charge restriction.
     * <p>
     * value = {@value}
     */
    public static final String DEFAULT_ENFORCEMENT_CODE = "Y";

    /**
     * This constant holds the default value for International Automatic Enter Flight Final.
     * <p>
     * International Automatic Enter Flight Final indicates the type of departure time used by the batch
     * program which finalizes flights (in LMS CFMCFT) for scheduling an automatic Flight Finalization for
     * international flights.The default value 'S' indicates scheduled departure time.
     * <p>
     * value = {@value}
     */
    public static final String DEFAULT_FLIGHT_FINAL_INTERNATIONAL_CODE = "S";

    /**
     * This constant holds the default value for Freight Status Update (FSU) Message Control Flags.
     * <p>
     * The default 'S' means send outgoing FSU/FZE messages only for incoming FSU messages and the status
     * update function.
     * <p>
     * value = {@value}
     */
    public static final String DEFAULT_FSU_MESSAGE_CONTROL_CODE = "S";

    /**
     * This constant holds the default value 'N' for House Air Waybill Association Enforcement which means
     * there is no enforcement.
     * <p>
     * The application will not enforce the association of master goods and house air waybills. The user can
     * associate master goods to house air waybills manually as desired.
     * <p>
     * value = {@value}
     */
    public static final String DEFAULT_HAWB_ASSOCIATION_ENFORCEMENT = "N";

    /**
     * This constant holds the default value 'N' for House Air Waybill Automatic Association.
     * <p>
     * The application means that will not attempt the automatic association of master goods to house air
     * waybills for shipments terminating at this station.
     * <p>
     * value = {@value}
     */
    public static final String DEFAULT_HAWB_AUTOMATIC_ASSOCIATION_CODE = "N";

    /**
     * This constant holds the default value for Enter Flight Manifest Assignment Status.
     * <p>
     * The default value 'F'indicates that the shipment is assigned as finalized.
     * <p>
     * value = {@value}
     */
    public static final String DEFAULT_MANIFEST_ASSIGN_STATUS_CODE = "F";

    /**
     * This constant holds the default value for Status for Non-Mechanized Check-In value which determines the
     * the impact of goods check-in at a non-mechanized station.
     * <p>
     * The default value 'N' indicates that the application is not expecting an incoming FSU RCF message from
     * a handling agent. If an incoming FSU RCF is received it is recorded in history as CHECK-IN –FSU entry.
     * <p>
     * value = {@value}
     */
    public static final String DEFAULT_NON_MECHANIZED_CHECKIN = "N";

    /**
     * This constant holds the default value of Notice of Arrival: Automatic Generation which enables or
     * disables the automatic generation of a Notice of Arrival either for a Master or a House Air Waybill.
     * <p>
     * The default value 'N' indicates that the automatic generation of Notice of Arrival is turned off.
     * <p>
     * value = {@value}
     */
    public static final String DEFAULT_NOTICE_AUTOMATIC_GENERATION_CODE = "N";

    /**
     * This constant holds the default value for Automatic Enter Flight Final: And Initiate US Customs &
     * Flight Departure Message.
     * <p>
     * The default value 'S' means scheduled departure time.
     * <p>
     * value = {@value}
     */
    public static final String DEFAULT_USCUSTOMS_FLIGHT_DEP_MSGCODE = "S";

    /**
     * Holds the static data category of history.
     * <p>
     * Value = {@value}
     */
    public static final String HISTORY_CATEGORY_STATICDATA = "STATICDATA";

    /**
     * Holds the value of description length.
     * <p>
     * Value = {@value}
     */
    public static final int OHTERCHARGECODE_DESCRIPTION_LENGTH = 50;

    /**
     * Holds the value of description length.
     * <p>
     * Value = {@value}
     */
    public static final int OHTERCHARGESUBCODE_DESCRIPTION_LENGTH = 50;

    /**
     * Holds the value of product offset time.
     * <p>
     * Value = {@value}
     */
    public static final int PRODUCT_OFFSET_TIME = 2100;

    /**
     * Holds the value of product small package express code.
     * <p>
     * Value = {@value}
     */
    public static final String PRODUCT_SMALLPACKAGEEXPRESSCODE = "L";

    /**
     * This constant holds the code which indicates that the restriction is a collect charge restriction.
     * <p>
     * value = {@value}
     */
    public static final String RESTRICTION_COLLECT_CHARGE = "C";

    /**
     * Holds the value of description length.
     * <p>
     * value = {@value}
     */
    public static final int SPL_DESCRIPTION_LENGTH = 50;

    /**
     * This constant holds the value 'C' which indicates that the station remarks entered is a customs remark.
     * <p>
     * Value = {@value}
     */
    public static final String STATION_CUSTOMS_REMARKS_CODE = "C";

    /**
     * Holds the maximum size for station name.
     * <p>
     * Value = {@value}
     */
    public static final int STATION_NAME_SIZE = 34;

    /**
     * This constant holds the value 'S' which indicates that the station remarks entered is a service remark.
     * <p>
     * Value = {@value}
     */
    public static final String STATION_SERVICE_REMARKS_CODE = "S";

    /**
     * Holds the literal value of hyphen value.
     */
    public static final String STRING_HYPHEN = "-";

    /**
     * Holds the terminal area type ULD value.
     * <p>
     * Value = {@value}
     */
    public static final String TERMINAL_AREA_TYPE_ULD = "U";

    /**
     * This constant holds the value 'M' which indicates that the Time After Flight Departure for a station is
     * entered in minutes.
     * <p>
     * Value = {@value}
     */
    public static final String TIME_AFTER_FLIGHT_DEP_MINUTES = "M";

    /**
     * This constant holds the value 'M' which indicates that the Time After Flight Departure for a station is
     * entered in percentage.
     * <p>
     * Value = {@value}
     */
    public static final String TIME_AFTER_FLIGHT_DEP_PERCENTAGE = "P";

    /**
     * Holds the value of UldCategory.
     */
    public static final String ULDCONFIGURATION_ULDCATEGORY_VALUE = "B";

    /**
     * Holds the maximum character value.
     * <p>
     * value = {@value}
     */
    public static final int ULDPREFIX_MAXIMUM_CHARACTER_VALUE = 91;

    /**
     * Holds the maximum value through which the iteration should proceed in case of three digits suffix.
     * <p>
     * value = {@value}
     */
    public static final int ULDPREFIX_MAXIMUM_ITERATION_VALUE = 999;

    /* UC252 * */

    /**
     * Holds the maximum ULD prefix length.
     * <p>
     * value = {@value}
     */
    public static final int ULDPREFIX_MAXIMUM_LENGTH_VALUE = 3;

    /* End UC252 * */

    /* UC237 * */

    /**
     * Holds the maximum value through which the iteration should proceed in case of four digits.
     * <p>
     * value = {@value}
     */
    public static final int ULDPREFIX_MAXIMUM_NUMERAL_ITERATION_VALUE = 9999;

    /**
     * Holds the maximum ULD prefix range length.
     * <p>
     * value = {@value}
     */
    public static final int ULDPREFIX_MAXIMUM_RANGE_LENGTH = 5;

    /**
     * Holds the minimum character value.
     * <p>
     * value = {@value}
     */
    public static final int ULDPREFIX_MINIMUM_CHARACTER_VALUE = 64;

    /**
     * Holds the minimum ULD prefix range length.
     * <p>
     * value = {@value}
     */
    public static final int ULDPREFIX_MINIMUM_RANGE_LENGTH = 4;

    /**
     * Holds the maximum length in case of purely digits.
     * <p>
     * value = {@value}
     */
    public static final int ULDPREFIX_MOST_DIGIT_MAXIMUM_LENGTH = 5;

    /* End UC237 * */

    /**
     * Holds the value that is to be added.
     * <p>
     * value = {@value}
     */
    public static final String ULDPREFIX_ZERO = "0";

    // END OF UC243 -- Maintain Pallet Codes

    /**
     * Holds the maximum end range length.
     * <p>
     * value = {@value}
     */
    public static final int ULDSERIAL_MAXIMUM_END_RANGE_LENGTH = 5;

    // Start of UC047 - Maintain Commodity Information

    /**
     * Holds the maximum start range length.
     * <p>
     * value = {@value}
     */
    public static final int ULDSERIAL_MAXIMUM_START_RANGE_LENGTH = 5;

    /**
     * Holds the minimum start range length.
     * <p>
     * value = {@value}
     */
    public static final int ULDSERIAL_MINIMUM_START_RANGE_LENGTH = 4;

    /**
     * Holds the value of zero.
     * <p>
     * Value = {@value}
     */

    public static final int ZERO = 0;

    /**
     * Holds the value of INDEF.
     * <p>
     * Value = {@value}
     */
    public static final String INDEF = "INDEF";

    /**
     * Holds the value of semi colon.
     * <p>
     * Value = {@value}
     */
    public static final String SEMI_COLON = ";";

    /**
     * Holds the value of colon.
     * <p>
     * Value = {@value}
     */
    public static final String COLON = ":";

    /**
     * Holds the value of space.
     * <p>
     * Value = {@value}
     */
    public static final String SPACE = " ";
    
    /**
     * Holds the value of Reject Queue.
     * <p>
     * Value = {@value}
     */
    
    /**
     * Following field holds value of MQand office queue names.
     */
    public static final String TTYMESSAGEREJQUE="TTYMESSAGEREJECTQ";
    
    public static final String EUCUSTOMREJQUE="EUCUSTOMREJECTQ";
    
    public static final String ESPVALQ="ESPVALQ";
    
    public static final String ESPVALREJQUE="ESPVALREJECTQ";
    
    public static final String XMLPOSTREJQUE="XMLPOSTREJECTQ";
    
    public static final String FTPMESSAGEREJQUE="FTPMESSAGEREJQUE";
    
    public static final String XMAILREJQUE="XMAILREJECTQ";
    
    public static final String FTPSERVERREJQUE="FTPSERVERREJECTQ";
    
    public static final String TTYMESSAGEQUEUE="TTYMESSAGEQ";
    
    public static final String EUCUSTOMQUEUE="EUCUSTOMQ";
    
    public static final String XMLPOSTQUEUE="XMLPOSTQ";
    
    public static final String FTPMESSAGEQUEUE="FTPMESSAGEQ";
    
    public static final String XMAILQUEUE="XMAILQ";
    
    public static final String FTPSERVERQUEUE="FTPSERVERQ";
    
    public static final String INCOMINGMESSAGEHISTORYQUEUE="INCOMINGMESSAGEHISTORYQ";
    
    public static final String OUTGOINGMESSAGEHISTORYQUEUE="OUTGOINGMESSAGEHISTORYQ";
    
    public static final String FTPSERVER="FTPSERVERQ";
    
    
    /**
     * <code>Private Constructor.</code>
     */
    private UtilsConstants() {

    }
}
