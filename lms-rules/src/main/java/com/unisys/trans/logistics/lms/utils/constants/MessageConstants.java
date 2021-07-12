/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.constants;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.exception.CodeMessage;

/**
 * <code>MessageConstants</code> maintains a list of message constants.
 * <p>
 */
public final class MessageConstants {

	/**
	 * Invalid Accept Message Indicator. Valid values are Y and N.
	 */
	public static final int ACCEPT_MESSAGE_INDICATOR_INVALID = 1499;

	/**
	 * Invalid Accept Message Indicator. Valid values are Y and N.
	 */
	public static final int ACCEPT_MESSAGE_INDICATOR_MANDATORY = 1516;

	/**
	 * This constant is used to find the additional tariff currency is valid.
	 * Failed because of invalid additional tariff currency.
	 * <p>
	 * Value = {@value}
	 */
	public static final int ADDITIONAL_TARIFF_DOES_NOT_EXIST = 243;

	public static final int CARRIER_CODE_MANDATORY = 10004;
	public static final int NO_HOST_CARRIER_AUTHORITY = 10005;
	/**
	 * 
	 * This constant is used to verify weather the aggregate will allow tariff
	 * rate. Failed because it will be allowable only for country.
	 * 
	 */

	public static final int AGGREGATE_ALLOW_TARIFF_RATE_INVALID = 1024;

	/**
	 * 
	 * This constant is used to verify weather the aggregate will allow tariff
	 * rate. Failed because type should be true or false.
	 * 
	 */
	public static final int AGGREGATE_ALLOW_TARIFF_RATE_TYPE_INVALID = 1025;

	/**
	 * Failed because Aggregate Cache reset exception.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AGGREGATE_CACHE_RESET_EXCEPTION = 1026;

	/**
	 * This constant is used to verify the aggregate code. Failed because of
	 * invalid aggregate code instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AGGREGATE_CODE_INVALID_OBJECT_INSTANCE = 682;

	/**
	 * This constant is used to verify the deleteIndicator. Failed because
	 * aggregate code is already marked for deletion.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AGGREGATE_CODE_MARKED_FOR_DELETION = 701;

	/**
	 * This constant is used to verify the deleteIndicator. Failed because
	 * aggregate is not marked for deletion.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AGGREGATE_CODE_NOT_MARKED_FOR_DELETION = 699;

	/**
	 * This constant is used to verify whether the aggregate code and usage type
	 * combination already exists. Failed because aggregate code and usage type
	 * combination already exists.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AGGREGATE_CODE_TYPE_ALREADY_EXIST = 697;

	/**
	 * This constant is used to give the success message for create operation
	 * with both code and usageType.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AGGREGATE_CODE_TYPE_CREATE_SUCCESSFUL = 754;

	/**
	 * This constant is used to give the success message for delete operation
	 * with both code and usageType.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AGGREGATE_CODE_TYPE_DELETE_SUCCESSFUL = 755;

	/**
	 * This constant is used to give the success message for marking record for
	 * delete operation with both code and usageType.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AGGREGATE_CODE_TYPE_MARKED_DELETE_SUCCESSFUL = 758;

	/**
	 * This constant is used to verify the deleteIndicator. Failed because
	 * aggregate code and usage type is marked for deletion.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AGGREGATE_CODE_TYPE_MARKED_FOR_DELETION = 702;

	/**
	 * This constant is used to verify the deleteIndicator. Failed because
	 * aggregate code and usage type is not marked for deletion.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AGGREGATE_CODE_TYPE_NOT_MARKED_FOR_DELETION = 700;

	/**
	 * This constant is used to give the success message for restore operation
	 * with both code and usageType.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AGGREGATE_CODE_TYPE_RESTORE_SUCCESSFUL = 757;

	/**
	 * This constant is used to give the success message for update operation
	 * with both code and usageType.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AGGREGATE_CODE_TYPE_UPDATE_SUCCESSFUL = 756;

	/**
	 * This constant is used to give the success message for create operation.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AGGREGATE_CREATE_SUCCESSFUL = 747;

	/**
	 * This constant is used to give the success message for delete operation.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AGGREGATE_DELETE_SUCCESSFUL = 748;

	/**
	 * This constant is used to verify the aggregate type. Failed because of
	 * invalid aggregate end date.
	 * <p>
	 * value = {@value}
	 */
	public static final int AGGREGATE_END_DATE_INVALID_OBJECT_INSTANCE = 738;

	/**
	 * This constant is used to verify whether end date is entered during
	 * persist. Failed because the end date is entered for Create / Update.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AGGREGATE_ENDDATE_NOT_NEEDED_FOR_PERSIST = 760;

	/**
	 * This constant is used to verify the end date. Failed because end date
	 * should not be lesser than the current date.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AGGREGATE_ENDDATE_SHOULD_BE_TODAY_OR_LATER = 745;

	/**
	 * This constant is used to verify the instance of aggregate object. Failed
	 * because of invalid aggregate object instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AGGREGATE_INVALID_OBJECT_INSTANCE = 684;

	/**
	 * This constant is used to verify the object OID instance. Failed because
	 * of invalid object OID.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AGGREGATE_INVALID_OID_OBJECT_INSTANCE = 691;

	/**
	 * This constant is used to give the success message for marking record for
	 * delete operation.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AGGREGATE_MARKED_DELETE_SUCCESSFUL = 751;

	/*
	 * =========================================================================
	 * =
	 * 
	 * END of Maintain RCA Information
	 * ==========================================
	 * ================================
	 */

	/**
	 * This constant is used to verify the deleteIndicator. Failed because
	 * aggregate is already marked for deletion.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AGGREGATE_MARKED_FOR_DELETION_UPDATE = 698;

	/**
	 * This constant is used to verify if there are members to be included.
	 * Failed because there are no members to include.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AGGREGATE_NO_INCLUDED_MEMBERS = 753;

	/**
	 * This constant is used to give the success message for restore operation.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AGGREGATE_RESTORE_SUCCESSFUL = 750;
	/**
	 * This constant is used to give the success message for restore operation.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AGGREGATE_MEMBERS_OF_SAME_LOWER_HIERARCHY_GEOGRAPHY = 1725;

	// Newly added Error Constants
	/**
	 * This constant is used to verify the aggregate type. Failed because of
	 * aggregate type overlap.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AGGREGATE_TYPE_GEOGRAPHICAL_OVERLAP_NOT_ALLOWED = 707;

	/**
	 * This constant is used to verify the aggregate type. Failed because of
	 * invalid aggregate type instance.
	 * <p>
	 * value = {@value}
	 */
	public static final int AGGREGATE_TYPE_INVALID_OBJECT_INSTANCE = 683;

	/**
	 * This constant is used to give the success message for update operation.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AGGREGATE_UPDATE_SUCCESSFUL = 749;

	/**
	 * This constant is used to verify whether the aggregate entity already
	 * exists. Failed because aggregate already exists.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AGGREGATESERVICE_ENTITY_ALREADY_EXIST = 696;

	/**
	 * This constant is used to verify whether the aggregate exist in the
	 * system. Failed because aggregate does not exist.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AGGREGATESERVICE_OBJECT_DOES_NOT_EXIST = 752;

	/**
	 * This constant is used to verify the aircraft code.
	 * <p>
	 * Value = {@value}
	 */

	public static final int AIRCRAFT_CODE_INVALID = 1800;

	/**
	 * This constant is used to verify whether aircraft code is mandatory.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AIRCRAFT_CODE_MANDATORY = 1802;

	/**
	 * This constant is used to specify that an aircraft code with the wild card
	 * has been already created.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AIRCRAFT_CODE_NO_WILDCARD_CAN_BE_CREATED = 1818;

	/**
	 * This constant is used to verify the aircraft code is three character
	 * alphanumeric.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AIRCRAFT_CODE_THREE_CHAR_ALPHANUMERIC = 1804;

	/**
	 * This constant is used to verify if the aircraft code unique.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AIRCRAFT_CODE_UNIQUE = 1808;

	/**
	 * This constant is used to specify that an aircraft code with the wild card
	 * has been already created.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AIRCRAFT_CODE_WILDCARD_AVAILABLE = 1817;

	/**
	 * This constant is used to specify that no aircraft codes found in the
	 * system.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AIRCRAFT_CODES_NOT_FOUND_IN_THE_SYSTEM = 1816;

	/**
	 * This constant is used to verify whether the aircraft code does not exist.
	 * <p>
	 * Value = {@value}
	 */

	public static final int AIRCRAFT_DOES_NOT_EXIST = 1801;

	/**
	 * This constant is used to specify that an aircraft height is invalid and
	 * should be maximum of 3 digits followed by maximum 2 deimal palces.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AIRCRAFT_HEIGHT_INVALID = 1820;

	/**
	 * This constant is used to specify that the aircraft heights are
	 * manadatory.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AIRCRAFT_HEIGHT_MANDATORY = 1832;

	/**
	 * This constant is used to specify that the aircraft package height must be
	 * numeric..
	 * <p>
	 * Value = {@value}
	 */

	public static final int AIRCRAFT_HEIGHT_NUMERIC = 1812;

	/**
	 * This constant is used to specify height values in the header repeats.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AIRCRAFT_HEIGHT_REPEATING = 1828;

	/**
	 * This constant is used to specify that the aircraft heights must be in
	 * ascending order.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AIRCRAFT_HEIGHTS_MUST_BE_IN_ASCENDING_ORDER = 1830;

	/**
	 * . This constant is used to verify aircraft is valid.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AIRCRAFT_INVALID_INSTANCE = 1803;

	/**
	 * This constant is used to specify that the aircraft package length in the
	 * given cell must have a value for the given maximum package width and
	 * maximum package height combination.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AIRCRAFT_LENGTH_CELL_VALUE_MANDATORY = 1814;

	/**
	 * This constant is used to specify that the aircraft package length in the
	 * given cell must not be zero.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AIRCRAFT_LENGTH_CELL_VALUE_NOT_ZERO = 1815;

	/**
	 * This constant is used to specify that an aircraft length is invalid and
	 * should be maximum of 3 digits followed by maximum 2 deimal palces.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AIRCRAFT_LENGTH_INVALID = 1819;

	/**
	 * This constant is used to specify that the aircraft lengths are
	 * manadatory.
	 * <p>
	 * Value = {@value}
	 */

	public static final int AIRCRAFT_LENGTH_LENGTH_MANDATORY = 1834;

	/**
	 * This constant is used to specify that an aircraft max height is invalid
	 * and should be maximum of 3 digits followed by maximum 2 deimal palces.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AIRCRAFT_MAX_HEIGHT_INVALID = 1823;

	/* ====================================== */
	/* UC002 Maintain Carrier Information */
	/* ====================================== */

	/**
	 * This constant is used to specify that an aircraft max width is invalid
	 * and should be maximum of 3 digits followed by maximum 2 deimal palces.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AIRCRAFT_MAX_WIDTH_INVALID = 1822;

	/**
	 * This constant is used to specify aircraft maximum package height's range
	 * is invalid.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AIRCRAFT_MAXIMUM_PACKAGE_HEIGHT_INCORRECT_RANGE = 1827;

	/**
	 * This constant is used to specify aircraft maximum package height is
	 * mandatory.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AIRCRAFT_MAXIMUM_PACKAGE_HEIGHT_MANDATORY = 1825;

	/**
	 * This constant is used to specify aircraft maximum package width's range
	 * is invalid.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AIRCRAFT_MAXIMUM_PACKAGE_WIDTH_INCORRECT_RANGE = 1826;

	public static final int OTHERCHARGECODE_PRORATION_CANNOT_BE_INCLUDED = 827;

	/**
	 * This constant is used to specify aircraft maximum package width is
	 * mandatory.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AIRCRAFT_MAXIMUM_PACKAGE_WIDTH_MANDATORY = 1824;

	/**
	 * This constant is used to specify that the aircraft package created
	 * successfully.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AIRCRAFT_PACKAGE_CREATED_SUCCESSFULLY = 1810;

	/**
	 * This constant is used to specify that the aircraft package deleted
	 * successfully.
	 * <p>
	 * Value = {@value}
	 */

	public static final int AIRCRAFT_PACKAGE_DELETED_SUCCESSFULLY = 1809;

	/**
	 * This constant is used to specify that the aircraft package updated
	 * successfully..
	 * <p>
	 * Value = {@value}
	 */
	public static final int AIRCRAFT_PACKAGE_UPDATED_SUCCESSFULLY = 1811;

	/**
	 * This constant is used to specify that an aircraft width is invalid and
	 * should be maximum of 3 digits followed by maximum 2 deimal palces.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AIRCRAFT_WIDTH_INVALID = 1821;

	/**
	 * This constant is used to specify that the aircraft widths are manadatory.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AIRCRAFT_WIDTH_MANDATORY = 1833;

	/**
	 * This constant is used to specify that the aircraft package width must be
	 * numeric..
	 * <p>
	 * Value = {@value}
	 */

	public static final int AIRCRAFT_WIDTH_NUMERIC = 1813;

	/**
	 * This constant is used to specify width values in the header repeats.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AIRCRAFT_WIDTH_REPEATING = 1829;

	/**
	 * This constant is used to specify that the aircraft heights must be in
	 * ascending order.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AIRCRAFT_WIDTHS_MUST_BE_IN_ASCENDING_ORDER = 1831;

	/**
	 * This constant is used to specify that the Airport is already marked for
	 * deletion.<br>
	 * Value ={@value}
	 */
	public static final int AIRPORT_ALREADY_MARKED_FOR_DELETION = 100071;

	/**
	 * This constant is used to specify that the City Code is mandatory.<br>
	 * Value ={@value}
	 */
	public static final int AIRPORT_CITY_CODE_MANDATORY = 100020;

	/**
	 * This constant is used to specify that City Code must be of three
	 * alphabetic characters.
	 * <p>
	 * value = {@value}
	 */
	public static final int AIRPORT_CITY_CODE_THREE_CHAR_ALPHABETIC = 100019;

	/**
	 * This constant is used to specify that the Airport Code is mandatory.<br>
	 * Value ={@value}
	 */
	public static final int AIRPORT_CODE_MANDATORY = 100015;

	/**
	 * This constant is used to verify whether it is a city or airport code.
	 * <p>
	 * A warning will be raised if the airport code is replaced with the
	 * airport's city code.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int AIRPORT_CODE_REPLACED_WITH_AIRPORTS_CITY_CODE = 1127;

	/**
	 * This constant is used to specify that the Airport Code must be of three
	 * alphabetic characters.
	 * <p>
	 * value = {@value}
	 */

	public static final int AIRPORT_CODE_THREE_CHAR_ALPHABETIC = 100016;

	/**
	 * This constant is used to specify that the AirportCode is Unique.<br>
	 * Value ={@value}
	 */
	public static final int AIRPORT_CODE_UNIQUE = 100027;

	/**
	 * This constant is used to specify that the airport create operation is
	 * successful.
	 * <p>
	 * Value ={@value}
	 */
	public static final int AIRPORT_CREATED_SUCCESSFULLY = 1211;

	/**
	 * This constant is used to specify that the Airport is Default.<br>
	 * Value ={@value}
	 */
	public static final int AIRPORT_DEFAULT_INDICATOR = 100031;

	/**
	 * This constant is used to specify that the deletion date cannot preceed
	 * current System Date. <br>
	 * Value ={@value}
	 */
	public static final int AIRPORT_DELETION_DATE_MUSTNOT_PROCEED_CURRENTDATE = 100074;

	/**
	 * This constant is used to specify that the airport does not exist.
	 * <p>
	 * Value ={@value}
	 */
	public static final int AIRPORT_DOES_NOT_EXISTS = 1214;

	// ++++++++++++++++++++++++++++++
	/**
	 * This constant is used to specify the invalid airport object.
	 * <p>
	 * Value ={@value}
	 */
	public static final int AIRPORT_INVALID_INSTANCE = 100014;

	/**
	 * This constant is used to specify that the Latitude's format [Degrees
	 * (0-90), minutes (0-59), seconds (0-59) followed by direction (N or S)].
	 * <br>
	 * Value ={@value}
	 */

	public static final int AIRPORT_LATITUDE_INVALID = 100021;

	/**
	 * This constant is used to specify that the Latitude is mandatory.<br>
	 * Value ={@value}
	 */
	public static final int AIRPORT_LATITUDE_MANDATORY = 100022;

	/**
	 * This constant is used to specify that the Longitude's format [Degrees
	 * (0-90), minutes (0-59), seconds (0-59) followed by direction (E or W)].
	 * <br>
	 * Value ={@value}
	 */
	public static final int AIRPORT_LONGITUDE_INVALID = 100023;

	/**
	 * This constant is used to specify that the Longitude is mandatory.<br>
	 * Value ={@value}
	 */
	public static final int AIRPORT_LONGITUDE_MANDATORY = 100024;

	/**
	 * This constant is used to specify that the Airport is marked for deletion.
	 * <br>
	 * Value ={@value}
	 */
	public static final int AIRPORT_MARKED_FOR_DELETION = 100070;

	/**
	 * This constant is used to specify that the Airport Name is mandatory.
	 * <p>
	 * value = {@value}
	 */
	public static final int AIRPORT_NAME_MANDATORY = 100017;

	/**
	 * This constant is used to specify that Airport name up to 29 characters
	 * are accepted.
	 * <p>
	 * value = {@value}
	 */
	public static final int AIRPORT_NAME_OF_ANY_CHAR = 100018;

	/**
	 * This constant is used to specify that the airport restore operation is
	 * successful.
	 * <p>
	 * Value ={@value}
	 */
	public static final int AIRPORT_RESTORED_SUCCESSFULLY = 1213;

	/**
	 * This constant is used to specify that the airport update operation is
	 * successful.
	 * <p>
	 * Value ={@value}
	 */
	public static final int AIRPORT_UPDATED_SUCCESSFULLY = 1212;

	/**
	 * This constant is used to verify the all aggregate. Failed because
	 * aggregate already exists.
	 * <p>
	 * Value = {@value}
	 */
	public static final int ALL_AGGREGATE_ALREADY_EXISTS = 730;

	/**
	 * This constant is used to verify whether this aggregate is identical.
	 * Failed because the aggregates are identical.
	 * <p>
	 * Value = {@value}
	 */
	public static final int ALL_AGGREGATE_CODE_TYPE_IDENTICAL = 759;

	/**
	 * This constant is used to verify all aggregate. Failed because the
	 * aggregates are identical.
	 * <p>
	 * Value = {@value}
	 */
	public static final int ALL_AGGREGATE_IDENTICAL = 731;

	/**
	 * This constant is used to verify the area code. Failed because of invalid
	 * area code.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AREA_CODE_INVALID_OBJECT_INSTANCE = 695;

	/* ====================================== */
	/* UC003 Maintain Product Code */
	/* ====================================== */

	/**
	 * This constant is used to verify the area. Failed because area does not
	 * exist.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AREA_DOES_NOT_EXIT = 712;

	/**
	 * This constant is used to verify the Area. Failed because of duplicate
	 * area.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AREA_DUPLICATE_NOT_ALLOWED = 713;

	/**
	 * This constant is used to verify the area. Failed because the area is
	 * prohibited.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AREAS_PROHIBITED_OBJECT_INSTANCE = 693;

	/**
	 * This constant is used to verify the instance of automatic add charge code
	 * object.
	 * <p>
	 * Failed because invalid automatic add charge code not exists.<br>
	 */
	public static final int AUTOMATICADDCHARGECODE_NOTEXISTS = 761;

	/**
	 * This constant is used to find the billing currency is valid. Failed
	 * because of invalid billing currency.
	 * <p>
	 * Value = {@value}
	 */
	public static final int BILLING_CURRENCY_DOES_NOT_EXIST = 239;

	/**
	 * This constant is used to verify whether the delete type is all or
	 * selected.
	 * <p>
	 * value = {@value}
	 * <p>
	 * Can not delete all.<br>
	 */
	public static final int CAN_NOT_DELETE_ALL = 1310;

	/**
	 * This constant is used to verify whether the delete type is all or
	 * selected.
	 * <p>
	 * value = {@value}
	 * <p>
	 * Can not delete selected.<br>
	 */
	public static final int CAN_NOT_DELETE_SELECTED = 1309;

	/**
	 * This constant is used to specify that the Default Airport cannot be
	 * deleted.<br>
	 * Value ={@value}
	 */
	public static final int CANNOT_DELETE_DEFAULT_AIPORT = 100030;

	/**
	 * This constant is used to check whether office queue item is selected for
	 * deletion.
	 * <p>
	 * value = {@value}
	 * <p>
	 * There is no office Queue Item is selected for deletion.<br>
	 */
	public static final int CANNOT_DELETE_EMPTY_OFFICE_QUEUE_ITEMS = 1314;

	/**
	 * This constant is used to specify that the cannot restore an alive
	 * airport. <br>
	 * Value ={@value}
	 */
	public static final int CANNOT_RESTORE_ALIVE_AIRPORT = 100073;

	/**
	 * This constant is used to verify whether the alliance is unique for a
	 * carrier.
	 * <p>
	 * The carrier alliances have to be unique.
	 * <p>
	 * value = {@value}
	 */
	public static final int CARRIER_ALLIANCE_UNIQUE = 156;

	/**
	 * This constant is used to verify whether the Carrier is already marked for
	 * deletion.
	 * <p>
	 * value = {@value}
	 */
	public static final int CARRIER_ALREADY_MARKED_FOR_DELETION = 165;

	/**
	 * This constant is used to verify whether Carrier code is already present.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CARRIER_CODE_ALREADY_EXIST = 535;

	/**
	 * This constant is used to specify that the create operation is successful.
	 * <p>
	 * value = {@value}
	 */
	public static final int CARRIER_CREATE_SUCCESSFUL = 157;

	/**
	 * This constant is used to specify that the delete operation is successful.
	 * <p>
	 * value = {@value}
	 */
	public static final int CARRIER_DELETE_SUCCESSFUL = 158;

	/**
	 * This constant is used to verify the instance of address object.
	 * <p>
	 * The Carrier Address can contain characters of size 1-36 holding
	 * Alphanumeric, hyphen (-), and period (.) including spaces.
	 * <p>
	 * value={@value}
	 */
	public static final int CARRIER_INVALID_ADDRESS_OBJECT_INSTANCE = 145;

	/**
	 * This constant is used to verify the address of the carrier.
	 * <p>
	 * Address of the carrier if mandatory for the creation of carrier
	 * information.
	 * <p>
	 * value = {@value}
	 */
	public static final int CARRIER_INVALID_ADDRESSREQUIRED_OBJECT_INSTANCE = 134;

	/**
	 * This constant is used to verify whether the Alliance field number is
	 * valid.
	 * <p>
	 * The Alliance field number must contain only 1-5 characters of
	 * Alphanumeric.
	 * <p>
	 * value = {@value}
	 */

	public static final int CARRIER_INVALID_CARRIERALLIANCE_OBJECT_INSTANCE = 153;

	/**
	 * This constant is used to verify whether the city is valid.
	 * <p>
	 * The City of the Carrier can contain characters of size 1-17 holding
	 * Alphanumeric, hyphen (-), and period (.) including spaces.
	 * <p>
	 * value = {@value}
	 */
	public static final int CARRIER_INVALID_CITY_OBJECT_INSTANCE = 146;

	/**
	 * This constant is used to verify the city of the carrier.
	 * <p>
	 * City of the carrier is mandatory for the creation of carrier information.
	 * <p>
	 * value ={@value}
	 */
	public static final int CARRIER_INVALID_CITYREQUIRED_OBJECT_INSTANCE = 135;

	/**
	 * This constant is used to verify whether the carrier code is valid.
	 * <p>
	 * The carrier code should be alphanumeric of size 2 or 3 with at least one
	 * character.
	 * <p>
	 * value ={@value}
	 */
	public static final int CARRIER_INVALID_CODE_OBJECT_INSTANCE = 140;

	/**
	 * This constant is used to verify whether the carrier code/carrier number
	 * is present.
	 * <p>
	 * Either carrier code or carrier number is mandatory.
	 * <p>
	 * value = {@value}
	 */
	public static final int CARRIER_INVALID_CODEORNUMBER_OBJECT_INSTANCE = 155;

	/**
	 * This constant is used to verify the carrier code.
	 * <p>
	 * Carrier code is mandatory for the creation of carrier information.
	 * <p>
	 * value = {@value}
	 */
	public static final int CARRIER_INVALID_CODEREQUIRED_OBJECT_INSTANCE = 131;

	/**
	 * This constant is used to verify the size of the carrier code.
	 * <p>
	 * The carrier code should be 2 or 3 characters long.
	 * <p>
	 * value={@value}
	 */
	public static final int CARRIER_INVALID_CODESIZE_OBJECT_INSTANCE = 138;

	/**
	 * This constant is used to verify whether the country of the carrier is
	 * valid.
	 * <p>
	 * The Country of the Carrier must contain only 2 characters of alphabets.
	 * <p>
	 * value = {@value}
	 */
	public static final int CARRIER_INVALID_COUNTRY_OBJECT_INSTANCE = 149;

	/**
	 * This constant is used to verify the country of the carrier.
	 * <p>
	 * Country of the carrier is mandatory for the creation of carrier
	 * information.
	 * <p>
	 * value ={@value}
	 */
	public static final int CARRIER_INVALID_COUNTRYREQUIRED_OBJECT_INSTANCE = 136;

	/**
	 * This constant is used to verify whether the fax number is valid.
	 * <p>
	 * The fax number of the Carrier can contain characters of size 1-18 holding
	 * Alphanumeric, hyphen (-), and period (.) including spaces.
	 * <p>
	 * value = {@value}
	 */
	public static final int CARRIER_INVALID_FAXNUMBER_OBJECT_INSTANCE = 151;

	/**
	 * This constant is used to verify whether the carrier name is valid.
	 * <p>
	 * Carrier name can contain 1 - 34 size of Alphanumeric, hyphen (-),
	 * ampersand (&), single quotation mark (') and period (.), including
	 * spaces.
	 * <p>
	 * value = {@value}
	 */

	public static final int CARRIER_INVALID_NAME_OBJECT_INSTANCE = 143;

	/**
	 * This constant is used to verify the carrier name.
	 * <p>
	 * Carrier name is mandatory for the creation of carrier information.
	 * <p>
	 * value = {@value}
	 */
	public static final int CARRIER_INVALID_NAMEREQUIRED_OBJECT_INSTANCE = 133;

	/**
	 * This constant is used to verify the type of the carrier number.
	 * <p>
	 * The carrier number should be numeric.
	 * <p>
	 * value = {@value}
	 */

	public static final int CARRIER_INVALID_NUMBER_OBJECT_INSTANCE = 144;

	/**
	 * This constant is used to verify the carrier number.
	 * <p>
	 * Carrier number is mandatory for the creation of carrier information.
	 * <p>
	 * value = {@value}
	 */
	public static final int CARRIER_INVALID_NUMBERREQUIRED_OBJECT_INSTANCE = 132;

	/**
	 * This constant is used to verify whether the carrier number is valid.
	 * <p>
	 * The carrier number should contain 3 digits.
	 * <p>
	 * value={@value}
	 */
	public static final int CARRIER_INVALID_NUMBERSIZE_OBJECT_INSTANCE = 139;

	/**
	 * This constant is used to verify the instance of object.
	 * <p>
	 * Invalid carrier handling Object Instance.
	 * <p>
	 * value = {@value}
	 */

	public static final int CARRIER_INVALID_OBJECT_INSTANCE = 142;

	/**
	 * This constant is used to verify the instance of OID object.
	 * <p>
	 * Invalid carrier OID instance.
	 * <p>
	 * value = {@value}
	 */
	public static final int CARRIER_INVALID_OID_OBJECT_INSTANCE = 141;

	/**
	 * This constant is used to verify whether the phone number is valid.
	 * <p>
	 * The phone number of the Carrier can contain characters of size 1-18
	 * holding Alphanumeric, hyphen (-), and period (.) including spaces.
	 * <p>
	 * value = {@value}
	 */

	public static final int CARRIER_INVALID_PHONENUMBER_OBJECT_INSTANCE = 150;

	/**
	 * This constant is used to verify whether the postal code is valid.
	 * <p>
	 * The Postal code of the Carrier can contain characters of size 1-9 holding
	 * Alphanumeric, hyphen (-), and period (.) including spaces.
	 * <p>
	 * value = {@value}
	 */

	public static final int CARRIER_INVALID_POSTALCODE_OBJECT_INSTANCE = 148;

	/**
	 * This constant is used to verify whether the handled carrier transfer is
	 * valid.
	 * <p>
	 * Indicates whether handled carrier transfer manifests are printed by the
	 * daily maintenance programs for transfers from this carrier to the host
	 * carrier and from the host carrier to this carrier.
	 * <p>
	 * The print handled carrier transfer must contain only one character of Y
	 * /N option.
	 * <p>
	 * value = {@value}
	 */

	public static final int CARRIER_INVALID_PRINTFREIGHT_OBJECT_INSTANCE = 152;

	/**
	 * This constant is used to verify the instance of print freight bill
	 * address object.
	 * <p>
	 * The Print Freight Bill Address is required for the creation of carrier
	 * information.
	 * <p>
	 * value = {@value}
	 */
	public static final int CARRIER_INVALID_PRINTFREIGHTREQUIRED_OBJECT_INSTANCE = 137;

	/**
	 * This constant is used to verify whether the state is valid.
	 * <p>
	 * The State of the Carrier can contain characters of size 1-9 holding
	 * Alphanumeric, hyphen (-), and period (.) including spaces.
	 * <p>
	 * value = {@value}
	 */

	public static final int CARRIER_INVALID_STATE_OBJECT_INSTANCE = 147;

	/**
	 * This constant is used to verify whether the Carrier is marked for
	 * deletion or not.
	 * <p>
	 * value = {@value}
	 */
	public static final int CARRIER_IS_NOT_MARKED_FOR_DELETION = 169;

	/**
	 * This constant is used to show message that Carrier is marked for
	 * deletion.
	 * <p>
	 * Carrier code object does not exist.
	 * <p>
	 * value = {@value}
	 */
	public static final int CARRIER_MARKED_FOR_DELETION = 164;

	/**
	 * This constant is used to specify that the given Airlinecode Number does
	 * not exist.
	 */

	public static final int CARRIER_NUMBER_ALREADY_EXIST = 170;

	/**
	 * This constant is used to verify whether the Carrier is restored
	 * successfully.
	 * <p>
	 * value = {@value}
	 */
	public static final int CARRIER_RESTORED_SUCCESSFULLY = 168;

	/**
	 * This constant is used to specify that the update operation is successful.
	 * <p>
	 * value = {@value}
	 */
	public static final int CARRIER_UPDATE_SUCCESSFUL = 159;

	/**
	 * This constant is used to verify that given carrier code exists.
	 * <p>
	 * The Carrier Code does not exist in the system.
	 * <p>
	 * value = {@value}
	 */

	public static final int CARRIERCODE_NOTEXISTS = 160;

	/**
	 * This constant is used to verify that given carrier number exists.
	 * <p>
	 * The Carrier Number does not exist in the system.
	 * <p>
	 * value = {@value}
	 */
	public static final int CARRIERNUMBER_NOTEXISTS = 161;

	/**
	 * This constant is used to verify the instance of carrier code object.
	 * <p>
	 * The Carrier Code or the Airline Code Number already exists.
	 * <p>
	 * value = {@value}
	 */
	public static final int CARRIERSERVICE_ENTITY_ALREADY_EXIST = 154;

	/**
	 * This constant is used to verify whether the object exists .
	 * <p>
	 * Carrier code object does not exist.
	 * <p>
	 * value = {@value}
	 */
	public static final int CARRIERSERVICE_OBJECT_DOES_NOT_EXIST = 162;

	/**
	 * This constant is used to verify if the city details can be restored.
	 * <p>
	 * Only cities that are marked for deletion (city delete date exist) can be
	 * restored.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_CANNOT_BE_DELETED = 1129;

	/* ====================================== */
	/* UC004 Maintain Country Information */
	/* ====================================== */

	/**
	 * This constant is used to verify if the city code is valid.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_CODE_INVALID = 1100;

	/**
	 * This constant is used to verify the city. Failed because of invalid city.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_CODE_INVALID_OBJECT_INSTANCE = 690;

	/**
	 * This constant is used to verify if the city code exist in the system.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_CODE_NOT_EXISTS = 1125;

	/**
	 * This constant is used to verify whether the city code is present in the
	 * request.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_CODE_REQUIRED = 1092;

	/**
	 * This constant is used to verify whether the country code is present in
	 * the request.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_COUNTRY_CODE_REQUIRED = 1094;

	/**
	 * This constant is used to verify if the country code is valid.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_COUNTRYCODE_INVALID = 1103;

	/**
	 * This constant is used to verify if any city exists for the country code.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_COUNTRYCODE_NOT_EXISTS = 1126;

	/**
	 * This constant is used to specify that the city create operation is
	 * successful.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_CREATED_SUCCESSFULLY = 1114;

	/**
	 * This constant is used to verify the city end date.
	 * <p>
	 * DST start date must be less than or equal to the DST end date.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_DATE_CONTENT_INVALID = 1123;

	/**
	 * This constant is used to verify if the city end date is of format
	 * DDMMMYY.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_DATE_INVALID = 1112;

	/**
	 * This constant is used to specify that the city delete operation is
	 * successful.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_DELETED_SUCCESSFULLY = 1117;

	/**
	 * This constant is used to verify if the city end date is valid.
	 * <p>
	 * The End Date must be today or later and cannot be greater than the number
	 * of days specified in the run time parameter -
	 * {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_DAYS}
	 * .
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_DELETEENDDATE_INVALID = 1113;

	/**
	 * This constant is used to specify that the City does not exist.<br>
	 * Value ={@value}
	 */
	public static final int CITY_DOES_NOT_EXIST = 100029;

	/**
	 * This constant is used to verify the city. Failed because city does not
	 * exist.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_DOES_NOT_EXIT = 725;

	/**
	 * This constant is used to verify whether the city DST end date is present
	 * in the request.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_DST_ENDDATE_REQUIRED = 1097;

	/**
	 * This constant is used to verify whether the city DST end time is present
	 * in the request.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_DST_ENDTIME_REQUIRED = 1099;

	/**
	 * This constant is used to verify whether the city DST start date is
	 * present in the request.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_DST_STARTDATE_REQUIRED = 1096;

	/**
	 * This constant is used to verify whether the city DST start time is
	 * present in the request.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_DST_STARTTIME_REQUIRED = 1098;

	/**
	 * This constant is used to verify whether the city DST variation is present
	 * in the request.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_DST_VARIATION_REQUIRED = 1095;

	/**
	 * This constant is used to verify the city DST Date.
	 * <p>
	 * DST start date of variation 2 must be greater than DST end date of
	 * variation 1.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_DSTDATE_CONTENT_INVALID = 1124;

	/**
	 * This constant is used to verify if the city DST end date is of the format
	 * DDMMMYY.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_DSTENDDATE_FORMAT_INVALID = 1109;

	/**
	 * This constant is used to verify if the city DST end time is valid.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_DSTENDTIME_FORMAT_INVALID = 1111;

	/**
	 * This constant is used to verify if the city DST start date is of the
	 * format DDMMMYY.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_DSTSTARTDATE_FORMAT_INVALID = 1108;

	/**
	 * This constant is used to verify if the city DST start time is valid.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_DSTSTARTTIME_FORMAT_INVALID = 1110;

	/**
	 * This constant is used to verify if the city DST variation is valid.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_DSTVARIATION_INVALID = 1107;

	/**
	 * This constant is used to verify the city. Failed because duplicate city
	 * is not allowed.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_DUPLICATE_NOT_ALLOWED = 726;

	/**
	 * This constant is used to verify whether the city end date is entered for
	 * deleting a city.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_ENDDATE_REQUIRED = 1120;

	/**
	 * This constant is used to verify whether the city is in use.
	 * <p>
	 * A city is in-use if it is used in a aggregate or as an origin or
	 * destination in the definition of a ULD Type.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_IN_USE = 1121;

	/**
	 * This constant is used to verify if the city object is valid.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_INVALID_OBJECT = 1091;

	/**
	 * This constant is used to verify the City.<br>
	 * Failed because the city is mandatory for creating an office.<br>
	 */
	public static final int CITY_MANDATORY_FOR_OFFICE = 1360;

	/**
	 * This constant is used to specify that the City marked for Deletion.<br>
	 * Value ={@value}
	 */
	public static final int CITY_MARKED_FOR_DELETE = 100028;

	/**
	 * This constant is used to verify if the city retrieved from the system is
	 * marked for deletion.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_MARKED_FOR_DELETION = 1130;

	/**
	 * This constant is used to verify if the city can be updated.
	 * <p>
	 * Cities marked for deletion cannot be updated.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_MARKED_FOR_DELETION_CANNOT_UPDATE = 1128;

	/**
	 * This constant is used to verify the city. Failed because city is already
	 * marked for deletion.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_MARKED_FOR_DELETION_UPDATE = 727;

	/**
	 * This constant is used to verify if the city name is valid.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_NAME_INVALID = 1101;

	/**
	 * This constant is used to verify whether the city name is present in the
	 * request.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_NAME_REQUIRED = 1093;

	/**
	 * This constant is used to specify that the city restore operation is
	 * successful.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_RESTORED_SUCCESSFULLY = 1116;

	/**
	 * This constant is used to verify whether the search text is present in the
	 * request.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_SEARCHCODE_REQUIRED = 1118;

	/**
	 * This constant is used to verify if the state code is valid.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_STATECODE_INVALID = 1102;

	/**
	 * This constant is used to verify if the state name is of valid format.
	 * <p>
	 * State name up to 24 characters are accepted.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_STATENAME_INVALID = 1122;

	/**
	 * This constant is used to specify that the city update operation is
	 * successful.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_UPDATED_SUCCESSFULLY = 1115;

	/**
	 * This constant is used to verify if the city UTC variation is valid.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_UTCVARIATION_INVALID = 1104;

	/**
	 * This constant is used to verify if the city UTC variation fall within the
	 * boundary limit.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_UTCVARIATION_INVALID_LIMIT = 1105;

	/**
	 * This constant is used to verify whether the city marked for deletion has
	 * airports associated with it.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_WITHAIRPORTS = 1119;

	/**
	 * This constant is used to verify the city. Failed because of invalid city.
	 * *
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_WITHIN_AGGREGATE_MEMBERSHIP = 728;

	/**
	 * This constant is used to verify if the city DST object is valid.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITYDST_INVALID_OBJECT = 1106;

	/**
	 * This constant is used to verify the aggregate code. Failed because
	 * aggregate code is mandatory.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CODE_MANDATORY_OBJECT_INSTANCE = 704;

	/**
	 * This constant is used to verify the countries.
	 * <p>
	 * Failed because the country is prohibited.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRIES_PROHIBITED_OBJECT_INSTANCE = 688;

	/**
	 * This constant is used to verify the country code exist. Failed because of
	 * country code is already exist.
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_CODE_ALREADY_EXISTS = 268;

	/**
	 * This constant is used to verify the country. Failed because of invalid
	 * country.
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_CODE_INVALID_OBJECT_INSTANCE = 694;

	/**
	 * This constant is used to verify the country code.
	 * <p>
	 * Failed because country code is mandatory.<br>
	 * </p>
	 */
	public static final int COUNTRY_CODE_USAGE = 1422;

	/**
	 * This constant is used to verify the country code/numeric code.
	 * <p>
	 * Failed because of existing country code or numeric code.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_CODEORNUMERICCODE_ALREADY_EXIST = 294;

	/**
	 * This constant is used to specify that the create operation is successful.
	 * <p>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_CREATE_SUCCESSFUL = 308;

	/**
	 * This constant is used to verify whether the country exists.
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_DOES_NOT_EXIST = 527;

	/**
	 * This constant is used to verify the country. Failed because country does
	 * not exist.
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_DOES_NOT_EXIT = 722;

	/**
	 * This constant is used to verify the country type. Failed because of
	 * duplicate country.
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_DUPLICATE_NOT_ALLOWED = 721;

	/**
	 * This constant is used to verify that Edifact From and To address are
	 * prohibited while the reporting method is TTY.
	 * <p>
	 * Failed because of Edifact From and/or To Address.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_EDIFACT_ADDRESS_PROHIBITED = 312;

	/**
	 * This constant is used to verify the additional tariff rate currency.
	 * <p>
	 * Failed because of empty publication currency and additional tariff rate
	 * currency.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_ADDITIONALTARIFFCURRENCYPROHIBITED = 306;

	/**
	 * This constant is used to verify the AWB active days.
	 * <p>
	 * Failed because of invalid AWB active days.<br>
	 * <p>
	 * Value = {@value}
	 */

	public static final int COUNTRY_INVALID_AWBACTIVEDAYS_OBJECT_INSTANCE = 259;

	/**
	 * This constant is used to verify the AWB active days.
	 * <p>
	 * Failed because of invalid awb active days.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_AWBACTIVEDAYSUSORCA_OBJECT_INSTANCE = 279;

	/**
	 * This constant is used to verify the AWB archived retained days.
	 * <p>
	 * Failed because of invalid AWB archived retained days.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_AWBARCHIVEDRETAINEDDAYS_OBJECT_INSTANCE = 260;

	/**
	 * This constant is used to verify the AWB archived retained days.
	 * <p>
	 * Failed because of invalid AWB archived retained days.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_AWBARCHIVEDRETAINEDDAYSUSORCA_OBJECT_INSTANCE = 280;

	/**
	 * This constant is used to verify the AWB days before reuse.
	 * <p>
	 * Failed because of invalid AWB days before reuse.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_AWBDAYSBEFOREREUSE_OBJECT_INSTANCE = 261;

	/**
	 * This constant is used to verify the AWB days before reuse.
	 * <p>
	 * Failed because of invalid AWB days before reuse.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_AWBDAYSBEFOREREUSEUSORCA_OBJECT_INSTANCE = 281;

	/**
	 * This constant is used to verify the billing currency code.
	 * <p>
	 * Failed because of invalid billing currency code.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_BILLINGCURRENCYCODE_OBJECT_INSTANCE = 247;

	/**
	 * This constant is used to verify the billing currency code.
	 * <p>
	 * Failed because of invalid billing currency code.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_BILLINGCURRENCYCODEREQUIRED_OBJECT_INSTANCE = 227;

	/**
	 * This constant is used to verify the country code.
	 * <p>
	 * Failed because of invalid country code.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_CODE_OBJECT_INSTANCE = 233;

	/**
	 * This constant is used to verify the country code.
	 * <p>
	 * Failed because of invalid country code.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_CODENOTEXIST = 267;

	/**
	 * This constant is used to verify the country code.
	 * <p>
	 * Failed because of invalid country code.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_CODEREQUIRED_OBJECT_INSTANCE = 222;

	/**
	 * This constant is used to verify the country code.
	 * <p>
	 * Failed because of invalid country code.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_CODESIZE_OBJECT_INSTANCE = 232;

	/**
	 * This constant is used to verify the country code.
	 * <p>
	 * Failed because of invalid country code.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_CODEUPDATE_OBJECT_INSTANCE = 265;

	/**
	 * This constant is used to verify whether the date value is entered.
	 * <p>
	 * Failed because date is empty.
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_CURRENTEFFECTIVEDATEREQUIRED_OBJECT_INSTANCE = 303;

	/**
	 * This constant is used to verify the customs area.
	 * <p>
	 * Failed because of invalid customs area.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_CUSTOMSAREA_OBJECT_INSTANCE = 252;

	/**
	 * This constant is used to verify the customs queue.
	 * <p>
	 * Failed because of invalid customs queue.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_CUSTOMSQUEUE_OBJECT_INSTANCE = 258;

	/**
	 * This constant is used to verify the customs queue.
	 * <p>
	 * Failed because of invalid customs queue.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_CUSTOMSQUEUEMANDATORY_OBJECT_INSTANCE = 271;

	/**
	 * This constant is used to verify the customs queue office.
	 * <p>
	 * Failed because of invalid customs queue office.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_CUSTOMSQUEUEOFFICE_OBJECT_INSTANCE = 257;

	/**
	 * This constant is used to verify the customs queue office.
	 * <p>
	 * Failed because of invalid customs queue office.<br>
	 * <p>
	 * Value = {@value}
	 */

	public static final int COUNTRY_INVALID_CUSTOMSQUEUEOFFICEMANDATORY_OBJECT_INSTANCE = 270;

	/**
	 * This constant is used to verify the customs queue station.
	 * <p>
	 * Failed because of invalid customs queue station.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_CUSTOMSQUEUESTATION_OBJECT_INSTANCE = 256;

	/**
	 * This constant is used to verify the discontinue value.
	 * <p>
	 * Failed because of invalid discontinue value .<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_DISCONTINUEDATEVALUE_OBJECT_INSTANCE = 288;

	/**
	 * This constant is used to verify the EDIFACT from network ID.
	 * <p>
	 * Failed because of invalid EDIFACT from network ID.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_EDIFACTFROMNETWORKID_OBJECT_INSTANCE = 266;

	/**
	 * This constant is used to verify the EDIFACT from network ID.
	 * <p>
	 * Failed because of invalid EDIFACT from network ID.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_EDIFACTFROMNETWORKIDREQUIRED_OBJECT_INSTANCE = 284;

	/**
	 * This constant is used to verify the EDIFACT from address and EDIFACT to
	 * address.
	 * <p>
	 * Failed because of existing EDIFACT from address and EDIFACT to address.
	 * <br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_EDIFACTFROMTONOTSAME_OBJECT_INSTANCE = 300;

	/*
	 * =========================================================================
	 * = =======
	 */
	/* Start of UC005 Station Information Constants 1603 - 1780 */
	/*
	 * =========================================================================
	 * = =======
	 */

	/**
	 * This constant is used to verify the EDIFACT to network ID.
	 * <p>
	 * Failed because of invalid EDIFACT to network ID.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_EDIFACTTONETWORKID_OBJECT_INSTANCE = 296;

	/**
	 * This constant is used to verify the EDIFACT to network ID.
	 * <p>
	 * Failed because of invalid EDIFACT to network ID.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_EDIFACTTONETWORKIDREQUIRED_OBJECT_INSTANCE = 285;

	/**
	 * This constant is used to verify the date value.
	 * <p>
	 * Failed because of invalid date value.<br>
	 * <p>
	 * Value = {@value}
	 */

	public static final int COUNTRY_INVALID_EFFECTIVEDATEEQUALORGREATERVALUE_OBJECT_INSTANCE = 301;

	/**
	 * This constant is used when the user enters effective date without the
	 * publication currency.
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_EFFECTIVEDATEPROHIBITED_OBJECT_INSTANCE = 305;

	/**
	 * This constant is used to verify the effective date.
	 * <p>
	 * Failed because of invalid effective date.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_EFFECTIVEDATEVALUE_OBJECT_INSTANCE = 287;

	/**
	 * This constant is used to verify the embargo number.
	 * <p>
	 * Failed because of invalid embargo number.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_EMBARGONUMBER_OBJECT_INSTANCE = 237;

	/**
	 * This constant is used to used to verify the effective date value. Failed
	 * because date is lesser than previous efffective date.
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_GREATER_THAN_PREVIOUS_EFFECTIVEDATE_OBJECT_INSTANCE = 289;

	/**
	 * This constant is used to verify the awb association flight final code.
	 * <p>
	 * Failed because of invalid house awb association flight final code.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_HAWBASSOFLIGHTFINALCODE_OBJECT_INSTANCE = 292;

	/**
	 * This constant is used to verify the house awb association code.
	 * <p>
	 * Failed because of invalid house awb association code.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_HAWBAUTOASSOCODE_OBJECT_INSTANCE = 293;

	/**
	 * This constant is used to verify the hours before arrival report.
	 * <p>
	 * Failed because of invalid hours before arrival report.
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_HOURSBEFOREARIVAL_OBJECT_INSTANCE = 302;

	/**
	 * This constant is used to verify the hours before arrival report.
	 * <p>
	 * Failed because of invalid hours before arrival report.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_HOURSBEFOREARRIVALREPORT_OBJECT_INSTANCE = 262;

	/**
	 * This constant is used to verify the hours before arrival to report.
	 * <p>
	 * Failed because of invalid hours before arrival to report.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_HOURSBEFOREARRIVALTOREPORTREQUIRED_OBJECT_INSTANCE = 286;

	/**
	 * This constant is used to verify the IATA region code.
	 * <p>
	 * Failed because of invalid IATA region code.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_IATAREGIONCODE_OBJECT_INSTANCE = 246;

	/**
	 * This constant is used to verify the IATA Region code.
	 * <p>
	 * Failed because of invalid IATA Region code.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_IATAREGIONCODEREQUIRED_OBJECT_INSTANCE = 226;

	/**
	 * This constant is used to verify the local currency code.
	 * <p>
	 * Failed because of invalid local currency code.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_LOCALCURRENCYCODE_OBJECT_INSTANCE = 248;

	/**
	 * This constant is used to verify the local currency code.
	 * <p>
	 * Failed because of invalid local currency code.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_LOCALCURRENCYCODEREQUIRED_OBJECT_INSTANCE = 228;

	/**
	 * This constant is used to verify the local rating currency code.
	 * <p>
	 * Failed because of invalid local rating currency code.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_LOCALRATINGCURRENCYCODE_OBJECT_INSTANCE = 249;

	/**
	 * This constant is used to verify the local rating currency code.
	 * <p>
	 * Failed because of invalid local rating currency code.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_LOCALRATINGCURRENCYCODEREQUIRED_OBJECT_INSTANCE = 229;

	/**
	 * This constant is used to verify the country name.
	 * <p>
	 * Failed because of invalid country name.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_NAME_OBJECT_INSTANCE = 235;

	/**
	 * This constant is used to verify the country name.
	 * <p>
	 * Failed because of invalid country name.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_NAMEREQUIRED_OBJECT_INSTANCE = 223;

	/**
	 * This constant is used to verify the numeric code.
	 * <p>
	 * Failed because of invalid numeric code.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_NUMERICCODE_OBJECT_INSTANCE = 236;

	/**
	 * This constant is used to verify the numeric code.
	 * <p>
	 * Failed because of invalid numeric code.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_NUMERICCODEREQUIRED_OBJECT_INSTANCE = 224;

	/**
	 * This constant is used to verify the numeric code.
	 * <p>
	 * Failed because of invalid numeric code.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_NUMERICCODEUPDATE_OBJECT_INSTANCE = 273;

	/**
	 * This constant is used to verify the object instance.
	 * <p>
	 * Failed because of invalid object instance.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_OBJECT_INSTANCE = 221;

	/**
	 * This constant is used to verify the object OID instance.
	 * <p>
	 * Failed because of invalid object OID instance.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_OID_OBJECT_INSTANCE = 234;

	/**
	 * This constant is used to verify the pending publication currency.
	 * <p>
	 * Failed because of invalid pending publication currency.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_PENDING_PUBLICATION_CURRENCY = 253;

	/**
	 * This constant is used to verify the pending additional tariff rate.
	 * <p>
	 * Failed because of invalid pending additional tariff rate.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_PENDINGADDNLTARIFFRATE_OBJECT_INSTANCE = 255;

	/**
	 * This constant is used to verify the pending effective date.
	 * <p>
	 * Failed because of invalid pending effective date.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_PENDINGEFFECTIVEDATE_OBJECT_INSTANCE = 254;

	/**
	 * This constant is used to verify the publication currency.
	 * <p>
	 * Failed because publication currency cannot be other than local rating
	 * currency or USD.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_PUBLICCURRENCY_USD_OR_LOCALCURRENCY = 299;

	/**
	 * This constant is used to verify the publication currency and billing
	 * currency.
	 * <p>
	 * Failed because of publication currency .<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_PUBLICCURRENCYMATCH_OBJECT_INSTANCE = 310;

	/**
	 * This constant is used to verify the publication currency.
	 * <p>
	 * Failed because publication currency cannot be additional rating currency.
	 * <br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_PUBLICCURRENCYNOTADDITIONALCURRENCY_OBJECT_INSTANCE = 298;

	/**
	 * This constant is used when the user has entered queue office without
	 * having queue station.
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_QUEUEOFFFICEPROBHITED_OBJECT_INSTANCE = 304;

	/**
	 * This constant is used when the user has entered queue without queue
	 * station and queue office.
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_QUEUEPROBHITED_OBJECT_INSTANCE = 307;

	/**
	 * This constant is used to verify the reporting method code.
	 * <p>
	 * Failed because of invalid reporting method code.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_REPORTINGMETHODCODE_OBJECT_INSTANCE = 291;

	/**
	 * This constant is used to verify the shut off message code.
	 * <p>
	 * Failed because of invalid shut off message code.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_SHUTOFFMSGCODE_OBJECT_INSTANCE = 290;

	/**
	 * This constant is used to verify the TTY from address.
	 * <p>
	 * Failed because of invalid TTY from address.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_TTYFROMADDRESS_OBJECT_INSTANCE = 263;

	/**
	 * This constant is used to verify the TTY from address.
	 * <p>
	 * Failed because of invalid TTY from address.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_TTYFROMADDRESSREQUIRED_OBJECT_INSTANCE = 282;

	/**
	 * This constant is used to verify the TTY from address and TTY to address.
	 * <p>
	 * Failed because of existing TTY from address and TTY to address.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_TTYFROMTONOTSAME_OBJECT_INSTANCE = 274;

	/**
	 * This constant is used to verify the TTY to address.
	 * <p>
	 * Failed because of invalid TTY to address.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_TTYTOADDRESS_OBJECT_INSTANCE = 264;

	/**
	 * This constant is used to verify the TTY to address .
	 * <p>
	 * Failed because of invalid other TTY to address.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_TTYTOADDRESSREQUIRED_OBJECT_INSTANCE = 283;

	/**
	 * This constant is used to verify the USD permit indicator.
	 * <p>
	 * Failed because of true value of USD permit indicator.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_USDPERMITIND_OBJECT_INSTANCE = 297;

	/**
	 * This constant is used to verify the weight unit.
	 * <p>
	 * Failed because of invalid weight unit.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_WEIGHTUNIT_OBJECT_INSTANCE = 338;

	/**
	 * This constant is used to verify weight unit.
	 * <p>
	 * Failed because of invalid weight unit.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_INVALID_WEIGHTUNITREQUIRED_OBJECT_INSTANCE = 225;

	/**
	 * This constant is used to verify the country. Failed because country is
	 * already marked for deletion.
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_MARKED_FOR_DELETION_UPDATE = 723;

	/**
	 * This constant is used to verify the region code.
	 * <p>
	 * Failed due to invalid region code.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_REGIONCODE = 295;

	/**
	 * This constant is used to check whether the station is there or not.
	 * Failed because station does not exist.
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_STATION_DOES_NOT_EXIST = 245;

	/**
	 * This constant is used to verify that TTY From and To address are
	 * prohibited while the reporting method is Edifact.
	 * <p>
	 * Failed because of TTY From and/or To Address.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_TTYADDRESS_PROHIBITED = 311;

	/**
	 * This constant is used to specify that the update operation is successful.
	 * <p>
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_UPDATE_SUCCESSFUL = 309;

	/**
	 * This constant is used to verify the country. Failed because of invalid
	 * country.
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_WITHIN_AGGREGATE_MEMBERSHIP = 724;

	/**
	 * This constant is used to verify if the currency is already marked for
	 * deletion.
	 * <p>
	 * The currency is already marked for deletion.
	 * <p>
	 * value = {@value}
	 */
	public static final int CURRENCY_ALREADY_DELETED = 884;

	/**
	 * This constant is used to specify that the currency create operation is
	 * successful.
	 * <p>
	 * value = {@value}
	 */
	public static final int CURRENCY_CREATE_SUCCESSFUL = 910;

	/**
	 * This constant is used when the default rounding factor information is
	 * deleted.
	 * <p>
	 * The default rounding factor information cannot be deleted.
	 * <p>
	 * value = {@value}
	 */
	public static final int CURRENCY_DEFAULT_ROUNDINGFACTOR_CANNOT_BE_DELETED = 908;

	/**
	 * This constant is used to specify that the currency delete rounding factor
	 * operation is successful.
	 * <p>
	 * value = {@value}
	 */
	public static final int CURRENCY_DELETE_ROUNDINGFACTOR_SUCCESSFUL = 912;

	/**
	 * This constant is used to specify that the currency delete operation is
	 * successful.
	 * <p>
	 * value = {@value}
	 */
	public static final int CURRENCY_DELETE_SUCCESSFUL = 913;

	/**
	 * This constant is used to verify whether the euro start date is prohibited
	 * for EUR currency.
	 * <p>
	 * The euro start date is prohibited for EUR currency.
	 * <p>
	 * value = {@value}
	 */
	public static final int CURRENCY_EUROSTARTDATE_PROHIBITED_FOR_EUR = 916;

	/**
	 * This constant is used to verify if the future rounding factor record
	 * which is not the latest is deleted.
	 * <p>
	 * The future rounding factor record which is not the latest is deleted.
	 * <p>
	 * value = {@value}
	 */
	public static final int CURRENCY_FUTURE_ROUNDINGFACTOR_NOT_LATEST = 888;

	/**
	 * This constant is used to verify whether the effective date is greater
	 * than latest effective date and it must be greater than today.
	 * <p>
	 * The effective date is not greater than latest effective date and it is
	 * not greater than today.
	 * <p>
	 * value = {@value}
	 */
	public static final int CURRENCY_INVALID_CONTENT_EFFECTIVEDATE = 890;

	/**
	 * This constant is used to verify the end date information.
	 * <p>
	 * End date is less than today.
	 * <p>
	 * value = {@value}
	 */
	public static final int CURRENCY_INVALID_CONTENT_ENDDATE_WITH_CURRENTDATE = 883;

	/**
	 * This constant is used to verify the end date information.
	 * <p>
	 * End date is less than the latest effective date.
	 * <p>
	 * value = {@value}
	 */
	public static final int CURRENCY_INVALID_CONTENT_ENDDATE_WITH_EFFECTIVEDATE = 882;

	/**
	 * This constant is used to verify the end date information.
	 * <p>
	 * End date is less than Euro start date.
	 * <p>
	 * value = {@value}
	 */
	public static final int CURRENCY_INVALID_CONTENT_ENDDATE_WITH_EUROSTARTDATE = 881;

	/**
	 * This constant is used to verify whether the Euro start date is greater
	 * than today.
	 * <p>
	 * The Euro start date is not greater than today.
	 * <p>
	 * value = {@value}
	 */
	public static final int CURRENCY_INVALID_CONTENT_EUROSTARTDATE = 889;

	/**
	 * This constant is used to verify whether the effective date is past or
	 * in-effect.
	 * <p>
	 * The effective date is the past or in-effect effective date.
	 * <p>
	 * value = {@value}
	 */
	public static final int CURRENCY_INVALID_CONTENT_PAST_INEFFECT_EFFECTIVEDATE = 915;

	/**
	 * This constant is used to verify the instance of currency code.
	 * <p>
	 * Invalid currency code object instance.
	 * <p>
	 * value = {@value}
	 */
	public static final int CURRENCY_INVALID_CURRENCYCODE_OBJECT_INSTANCE = 900;

	/**
	 * This constant is used to verify whether the currency code is entered.
	 * <p>
	 * The currency code is empty.
	 * <p>
	 * value = {@value}
	 */
	public static final int CURRENCY_INVALID_CURRENCYCODEREQUIRED_OBJECT_INSTANCE = 895;

	/**
	 * This constant is used to verify the decimal position entered is valid.
	 * <p>
	 * The decimal position is not valid.
	 * <p>
	 * value = {@value}
	 */
	public static final int CURRENCY_INVALID_DECIMALPOSITION_OBJECT_INSTANCE = 905;

	/**
	 * This constant is used to verify whether the decimal position is entered.
	 * <p>
	 * The decimal position is empty.
	 * <p>
	 * value = {@value}
	 */
	public static final int CURRENCY_INVALID_DECIMALPOSITIONREQUIRED_OBJECT_INSTANCE = 897;

	/**
	 * This constant is used to verify whether the description entered is valid.
	 * <p>
	 * The currency description is not valid.
	 * <p>
	 * value = {@value}
	 */
	public static final int CURRENCY_INVALID_DESCRIPTION_OBJECT_INSTANCE = 901;

	/**
	 * This constant is used to verify whether the description is entered.
	 * <p>
	 * The description is empty.
	 * <p>
	 * value = {@value}
	 */
	public static final int CURRENCY_INVALID_DESCRIPTIONREQUIRED_OBJECT_INSTANCE = 896;

	/**
	 * This constant is used to verify whether the effective date is entered.
	 * <p>
	 * The effective date is empty.
	 * <p>
	 * value = {@value}
	 */
	public static final int CURRENCY_INVALID_EFFECTIVEDATEREQUIRED_OBJECT_INSTANCE = 899;

	/**
	 * This constant is used to verify whether the end date is entered.
	 * <p>
	 * The end date is not entered.
	 * <p>
	 * value = {@value}
	 */
	public static final int CURRENCY_INVALID_ENDDATEREQUIRED_OBJECT_INSTANCE = 906;

	/**
	 * This constant is used to verify whether the numeric code entered is
	 * valid.
	 * <p>
	 * The numeric code is not valid.
	 * <p>
	 * value = {@value}
	 */
	public static final int CURRENCY_INVALID_NUMERICCODE_OBJECT_INSTANCE = 903;

	/**
	 * This constant is used to verify whether the numeric code is entered.
	 * <p>
	 * The numeric code is not entered.
	 * <p>
	 * value = {@value}
	 */
	public static final int CURRENCY_INVALID_NUMERICCODEREQUIRED_OBJECT_INSTANCE = 902;

	/**
	 * This constant is used to verify the instance of object.
	 * <p>
	 * Invalid currency object instance.
	 * <p>
	 * value = {@value}
	 */
	public static final int CURRENCY_INVALID_OBJECT_INSTANCE = 893;

	/**
	 * This constant is used to verify the instance of OID object.
	 * <p>
	 * Invalid currency OID object instance.
	 * <p>
	 * value = {@value}
	 */
	public static final int CURRENCY_INVALID_OID_OBJECT_INSTANCE = 894;

	/**
	 * This constant is used to verify the rounding factor object instance.
	 * <p>
	 * The invalid rounding factor object instance.
	 * <p>
	 * value = {@value}
	 */
	public static final int CURRENCY_INVALID_ROUNDINGFACTOR_OBJECT_INSTANCE = 904;

	/**
	 * This constant is used to verify whether the rounding factor is entered.
	 * <p>
	 * The rounding factor is empty.
	 * <p>
	 * value = {@value}
	 */
	public static final int CURRENCY_INVALID_ROUNDINGFACTORREQUIRED_OBJECT_INSTANCE = 898;

	/**
	 * This constant is used to verify whether the currency code already exists.
	 * <p>
	 * The currency code already exists.
	 * <p>
	 * value = {@value}
	 */
	public static final int CURRENCY_ISOCODE_ALREADY_EXISTS = 891;

	/**
	 * This constant is used to verify whether the currency code exists in the
	 * system.
	 * <p>
	 * The currency does not exist in the system.
	 * <p>
	 * value = {@value}
	 */
	public static final int CURRENCY_ISOCODE_NOT_EXIST = 886;

	/**
	 * This constant is used when no currency information exists during retrieve
	 * all operation.
	 * <p>
	 * No currency information exists.
	 * <p>
	 * value = {@value}
	 */
	public static final int CURRENCY_NO_ISOCODE_EXISTS = 909;

	/**
	 * This constant is used to verify if the currency is not marked for
	 * deletion.
	 * <p>
	 * The currency is not marked for deletion.
	 * <p>
	 * value = {@value}
	 */
	public static final int CURRENCY_NOT_MARKED_FOR_DELETION = 885;

	/**
	 * This constant is used to verify whether the numeric code already exists.
	 * <p>
	 * The numeric code already exists.
	 * <p>
	 * value = {@value}
	 */
	public static final int CURRENCY_NUMERICCODE_ALREADY_EXISTS = 892;

	/**
	 * This constant is used to specify that the currency restore operation is
	 * successful.
	 * <p>
	 * value = {@value}
	 */
	public static final int CURRENCY_RESTORE_SUCCESSFUL = 914;

	/**
	 * This constant is used to verify whether the past/in-effect rounding
	 * factor record is deleted.
	 * <p>
	 * The past/in-effect rounding factor record is deleted.
	 * <p>
	 * value = {@value}
	 */
	public static final int CURRENCY_ROUNDINGFACTOR_PAST_NOT_DELETED = 887;

	/**
	 * This constant is used to specify that the currency update operation is
	 * successful.
	 * <p>
	 * value = {@value}
	 */
	public static final int CURRENCY_UPDATE_SUCCESSFUL = 911;

	/**
	 * This constant is used to specify that the customs status code cannot be
	 * updated.
	 */
	public static final int CUSTOMS_SATUS_CODE_CANNOT_BE_UPDATED = 1411;

	/**
	 * This constant is used to specify that the delete operation is successful.
	 * <p>
	 * {0} - Deleted customs status code.<br>
	 */
	public static final int CUSTOMS_STATUS_CODE_DELETE_SUCCESSFUL = 1425;

	/**
	 * This constant is used to specify that the delete operation is successful.
	 * <p>
	 * {0} - Deleted Customs Status code.<br>
	 */
	public static final int CUSTOMS_STATUS_CODE_UPDATE_SUCCESSFUL = 1413;

	/**
	 * This constant is used to specify that the create operation is successful.
	 * <p>
	 * {0}- Created customs status code.<br>
	 */
	public static final int CUSTOMSSTATUS_CODE_CREATE_SUCCESSFUL = 1424;

	/**
	 * This constant is used to verify the customs status description.
	 * <p>
	 * Failed because of invalid description.<br>
	 */
	public static final int CUSTOMSSTATUS_CODE_DESCRIPTION_INVALID = 1414;

	/**
	 * This constant is used to verify the customs status code's type and size
	 * while persisting.
	 * <p>
	 * Failed because of invalid customs status code.<br>
	 */
	public static final int CUSTOMSSTATUS_CODE_INVALID = 1416;

	/**
	 * This constant is used to verify the customs status code's type and size
	 * while retrieving.
	 * <p>
	 * Failed because of invalid customs status code.<br>
	 */
	public static final int CUSTOMSSTATUS_CODE_RETRIEVE_INVALID = 1417;

	/**
	 * This constant is used to verify the customs status code.
	 * <p>
	 * Failed because customs status code is mandatory.<br>
	 * </p>
	 */
	public static final int CUSTOMSSTATUS_CODE_USAGE = 1420;

	/**
	 * This constant is used to verify the customs status country.
	 * <p>
	 * Failed because of invalid country.<br>
	 */
	public static final int CUSTOMSSTATUS_COUNTRY_CODE_INVALID = 1415;

	/**
	 * This constant is used to verify the description.
	 * <p>
	 * Failed because description is mandatory.<br>
	 * </p>
	 */
	public static final int CUSTOMSSTATUS_DESCRIPTION_USAGE = 1423;

	/**
	 * This constant is used to verify the instance of customs status code
	 * object.
	 * <p>
	 * Failed because of invalid customs status code object instance.<br>
	 */
	public static final int CUSTOMSSTATUS_INVALID_OBJECT_INSTANCE = 1419;

	/**
	 * This constant is used to verify the instance of customs status code OID
	 * object.
	 * <p>
	 * Failed because of invalid customs status code OID object instance.<br>
	 */
	public static final int CUSTOMSSTATUS_INVALID_OID_OBJECT_INSTANCE = 1418;

	/**
	 * This constant is used to verify whether the office is a default office or
	 * not<br>
	 * Failed because the default office cannot be in-activated.<br>
	 */
	public static final int DEFAULT_OFFICE_INACTIVE_INVALID = 1340;

	/**
	 * This constant is used to specify that the deletion date is mandatory.
	 * <br>
	 * Value ={@value}
	 */
	public static final int DELETION_DATE_MANDATORY = 100072;

	/**
	 * This constant is used to verify whether the deletion date is future or
	 * not.
	 * <p>
	 * value = {@value}
	 */
	public static final int DELETION_DATE_MUST_BE_FUTURE = 166;

	/**
	 * This constant is used to verify whether the deletion date is given as
	 * input or not.
	 * <p>
	 * value = {@value}
	 */
	public static final int DELETION_DATE_REQUIRED = 167;

	/**
	 * This constant is used to verify if the dimension unit mandatory.
	 * <p>
	 * Value = {@value}
	 */
	public static final int DIMENSION_UNIT_MANDATORY = 1807;

	/**
	 * Invalid Double Signature Carrier Code.
	 */
	public static final int DOUBLE_SIGNATURE_CARRIER_CODE_INVALID = 1532;

	/**
	 * This constant is used when the double signature carrier code is not
	 * provided.
	 * <p>
	 * The Double Signature Carrier Code is mandatory if Double Signature is not
	 * given.
	 * <p>
	 * value = {@value}
	 */
	public static final int DOUBLE_SIGNATURE_CARRIER_CODE_MANDATORY = 1540;

	/**
	 * This constant is used to verify double signature.
	 * <p>
	 * Invalid Double Signature.
	 * <p>
	 * value = {@value}
	 */
	public static final int DOUBLE_SIGNATURE_INVALID = 1541;

	/**
	 * This constant is used to ensure the second business rule. It checks
	 * whether country code already exists for the customs status code.
	 * <p>
	 * Failed because duplicate entries are not permitted.<br>
	 */
	public static final int DUPLICATE_CUSTOMSSTATUS_COUNTRY_COMBINATION = 1421;

	/**
	 * This constant is used to verify whether the contour code already exists
	 * for the pallet code.
	 * <p>
	 * Duplicate pallet contour combination.
	 * <p>
	 * value = {@value}
	 */
	public static final int DUPLICATE_PALLET_CONTOUR_COMBINATION = 1196;

	/**
	 * This constant is used when terminal location names inputed has duplicate
	 * entries.
	 * <p>
	 * value = {@value}
	 */
	public static final int DUPLICATE_TERMINAL_LOCATION_NAMES = 626;

	/**
	 * This constant is used to specify that the effective date is greater or
	 * equal to system date.
	 * <p>
	 * Value = {@value}
	 */

	public static final int EFFECTIVE_DATE_GREATER_THAN_OR_EQUAL_TO_CURRENT_SYSTEM_DATE = 215;

	/**
	 * This constant is used to specify that effective date must be less than
	 * expiration.
	 * <p>
	 * Value = {@value}
	 */
	public static final int EFFECTIVE_DATE_MUST_BE_LESS_THAN_EXPIRATION = 218;

	/**
	 * This constant is used to specify that effective product code cannot be
	 * deleted.
	 * <p>
	 * Value = {@value}
	 */
	public static final int EFFECTIVE_PRODUCT_CODE_CANNOT_BE_DELETED = 217;

	/*
	 * =========================================================================
	 * = ======
	 */
	/* End of Maintain Parameter Information */
	/*
	 * =========================================================================
	 * = ======
	 */
	/**
	 * This constant is used to specify that the effective date is greater than
	 * system date.
	 * <p>
	 * Value = {@value}
	 */
	public static final int EFFECTIVEDATE_GREATER_THAN_CURRENT_SYSTEMDATE = 214;

	/**
	 * Invalid Email Notification Indicator. Valid values are S and E.
	 */
	public static final int EMAIL_NOTIFICATION_INDICATOR_INVALID = 1488;

	/**
	 * The Email Notification Indicator is required if the TPR Address is of
	 * type Email.
	 */
	public static final int EMAIL_NOTIFICATION_MANDATORY_IF_TPR_IS_EMAIL = 1538;

	/**
	 * Either Network Indicator or Email Notification Indicator must be blank.
	 */
	public static final int EMAIL_NOTIFICATION_OR_NETWORK_INDICATOR_MUST_BE_BLANK = 1489;

	/**
	 * This constant is used to verify the end date. Failed because end date is
	 * mandatory.
	 * <p>
	 * Value = {@value}
	 */
	public static final int ENDDATE_MANDATORY_OBJECT_INSTANCE = 703;

	/**
	 * Failed because EURO currency rounding factor does not exist in the
	 * system.
	 * <p>
	 * Value = {@value}
	 */
	public static final int EURO_CURRENCY_ROUNDING_FACTOR_DOES_NOT_EXIST = 679;

	/**
	 * Failed because entered effective date is after end date.
	 * <p>
	 * Value = {@value}
	 */
	public static final int EXCHANGE_RATE_EFFECTIVEDATE_AFTER_ENDDATE = 678;

	/**
	 * Size of the amount rate is invalid.Amount can contain only numbers and
	 * periods up to 12 digits.
	 * <p>
	 * Value = {@value}
	 */

	public static final int EXCHANGE_RATE_INVALID_AMOUNT_LENGTH = 654;

	/**
	 * Amount is mandatory.
	 * <p>
	 * Value = {@value}
	 */
	public static final int EXCHANGE_RATE_INVALID_AMOUNT_OBJECT_INSTANCE = 652;

	/**
	 * A valid effective Date is required.
	 * <p>
	 * Value = {@value}
	 */
	public static final int EXCHANGE_RATE_INVALID_EFFECTIVEDATE_OBJECT_INSTANCE = 644;

	/**
	 * This constant is used to verify if the exchange rate type. Failed because
	 * end date is not valid.
	 * <p>
	 * Value = {@value}
	 */
	public static final int EXCHANGE_RATE_INVALID_ENDDATE = 665;

	/**
	 * Size of the exchange rate is invalid.Exchange rate must contain numbers,
	 * periods up to 8 digits.
	 * <p>
	 * Value = {@value}
	 */

	public static final int EXCHANGE_RATE_INVALID_BANKSELLING_LENGTH = 651;
	public static final int EXCHANGE_RATE_INVALID_IATA_LENGTH = 1079;

	/**
	 * Exchange rate is required.
	 * <p>
	 * Value = {@value}
	 */
	public static final int EXCHANGE_RATE_INVALID_EXCHANGERATE_OBJECT_INSTANCE = 643;

	/**
	 * From Currency is mandatory.
	 * <p>
	 * Value = {@value}
	 */
	public static final int EXCHANGE_RATE_INVALID_FROMCURRENCY_OBJECT_INSTANCE = 646;

	/**
	 * Size of the from currency code is invalid.Currency code must contain only
	 * letters with 3 characters.
	 * <p>
	 * Value = {@value}
	 */
	public static final int EXCHANGE_RATE_INVALID_FROMCURRENCY_SIZE = 648;

	/**
	 * Invalid exchange rate information object instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int EXCHANGE_RATE_INVALID_OBJECT_INSTANCE = 641;

	/**
	 * Invalid exchange rate oid object instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int EXCHANGE_RATE_INVALID_OID_OBJECT_INSTANCE = 642;

	/**
	 * To Currency is mandatory.
	 * <p>
	 * Value = {@value}
	 */
	public static final int EXCHANGE_RATE_INVALID_TOCURRENCY_OBJECT_INSTANCE = 645;

	/**
	 * Size of the to currency code is invalid.Currency code must contain only
	 * letters with 3 characters.
	 * <p>
	 * Value = {@value}
	 */
	public static final int EXCHANGE_RATE_INVALID_TOCURRENCY_SIZE = 647;

	/**
	 * No exchange rate present in the system for the given currency pair.
	 * <p>
	 * Value= {@value}
	 */

	public static final int EXCHANGE_RATE_NOT_AVAILABLE = 661;

	/**
	 * Conversion is not possible when the former EURO currency is no longer
	 * valid tender.
	 * <p>
	 * Value = {@value}
	 */
	public static final int EXCHANGERATE_CONVERSION_NOT_POSSIBLE = 666;

	/**
	 * This constant is used to specify that the create operation is successful.
	 * <p>
	 * {0}- Created Exchange Rate.<br>
	 */
	public static final int EXCHANGERATE_CREATE_SUCCESSFUL = 670;

	/**
	 * This constant is used to specify that the delete operation is successful.
	 * <p>
	 * {0}- Deleted Exchange Rate.<br>
	 */
	public static final int EXCHANGERATE_DELETE_SUCCESSFUL = 671;

	/**
	 * Failed because newly entered effective date is before or equals the
	 * effective date of the latest exchange rate.
	 * <p>
	 * Value = {@value}
	 */
	public static final int EXCHANGERATE_EFFECTIVEDATE_BEFORE_ENDDATE = 676;

	/**
	 * Euro Currency does not exist in the system.
	 * <p>
	 * Value = {@value}
	 */
	public static final int EXCHANGERATE_EUROCURRENCY_DOES_NOT_EXIST = 669;

	/**
	 * Both from currency and to currency don't exist in the system.
	 * <p>
	 * Value = {@value}
	 */
	public static final int EXCHANGERATE_FROM_TO_CURRENCY_CODE_DO_NOT_EXIST = 672;

	/**
	 * From currency does not exist in the system.
	 * <p>
	 * Value = {@value}
	 */
	public static final int EXCHANGERATE_FROMCURRENCY_DOES_NOT_EXIST = 667;

	/**
	 * Failed due because the entered effective date of the new rate is before
	 * or same as the effective date of the currently effective exchange rate.
	 * <p>
	 * Value = {@value}
	 */

	public static final int EXCHANGERATE_INVALID_DELETE_DATE = 659;

	/**
	 * OId of the exchange rate getting deleted is not equal to the oid of
	 * latest effective exchange rate present in system.
	 * <p>
	 * value = {@value}
	 */

	public static final int EXCHANGERATE_INVALID_DELETE_OID = 662;

	/**
	 * Failed When the entered effective date of the new rate is before or same
	 * as the effective date of the currently effective exchange rate.
	 * <p>
	 * Value = {@value}
	 */
	public static final int EXCHANGERATE_INVALID_EFFECTIVE_DATE = 656;

	/**
	 * This constant is used to verify the control parameter for effective date.
	 * Failed because effective date is past date or today's date.
	 * <p>
	 * Value = {@value}
	 */
	public static final int EXCHANGERATE_INVALID_EFFECTIVEDATE_LATER = 674;

	/**
	 * This constant is used to verify the control parameter for effective date.
	 * Failed because effective date is a past date.
	 * <p>
	 * Value = {@value}
	 */
	public static final int EXCHANGERATE_INVALID_EFFECTIVEDATE_TODAY_OR_LATER = 675;

	/**
	 * Failed because both from currency and to currency are equal.
	 * <p>
	 * Value = {@value}
	 */

	public static final int EXCHANGERATE_INVALID_INVALID_FROM_TO = 663;

	/**
	 * To currency and control parameter both are same.
	 * <p>
	 * Value = {@value}
	 */
	public static final int EXCHANGERATE_INVALID_INVALID_TOCURRENCY = 664;

	/**
	 * Failed because there is time gap between two versions of IATA exchange
	 * rate.
	 * <p>
	 * Value = {@value}
	 */
	public static final int EXCHANGERATE_NO_TIME_GAP = 677;

	/**
	 * To currency does not exist in the system.
	 * <p>
	 * Value = {@value}
	 */
	public static final int EXCHANGERATE_TOCURRENCY_DOES_NOT_EXIST = 668;

	/**
	 * Exchange rate for the currency pair to convert amount is not exist in the
	 * system.
	 * <p>
	 * Value = {@value}
	 */
	public static final int EXCHANGERATES_UNAVAILBLE = 660;

	/**
	 * Exchange rate is already exist.
	 * <p>
	 * Value = {@value}
	 */

	public static final int EXCHANGERATESERVICE_ENTITY_ALREADY_EXIST = 657;

	/**
	 * This constant is used to specify that the expiration date is greater or
	 * equal to effective date.
	 * <p>
	 * Value = {@value}
	 */
	public static final int EXPIRATION_DATE_MUST_BE_EQUAL_OR_GREATER_THAN_EFFECTIVE_DATE = 216;

	/**
	 * The FBL Special Message can have a maximum of 1 character. The only
	 * option available is J.
	 */
	public static final int FBL_SPECIAL_MESSAGE_OPTION_INVALID = 1508;

	/**
	 * This constant is used when terminal location names inputed by the user is
	 * present already in the system and the count is greater than twenty.
	 * <p>
	 * value = {@value}
	 */
	public static final int FEW_TERMINAL_LOCATIONS_ALREADY_EXISTS = 628;

	/**
	 * This constant is used when terminal location names inputed by the user is
	 * present already in the system and the count is greater than twenty during
	 * a terminal area creation.
	 * <p>
	 * value = {@value}
	 */
	public static final int FEW_TERMINAL_LOCATIONS_ALREADY_EXISTS_FOR_NEW_AREA = 630;

	/**
	 * This constant is used when few location names the user is trying to enter
	 * already exists in the database.
	 * <p>
	 * value = {@value}
	 */
	public static final int FEW_TERMINAL_LOCATIONS_ALREADY_EXISTS_LESS_THAN_TWENTY = 625;

	/**
	 * This constant is used when few location names the user is trying to enter
	 * already exists in the database during a terminal area creation.
	 * <p>
	 * value = {@value}
	 */
	public static final int FEW_TERMINAL_LOCATIONS_ALREADY_EXISTS_LESS_THAN_TWENTY_FOR_NEW_AREA = 629;

	/**
	 * The FFA Special Message Option can have a maximum of 3 characters.
	 * Options available are H, U and F.
	 */
	public static final int FFA_SPECIAL_MESSAGE_OPTION_INVALID = 1503;

	/**
	 * The FFM Special Message can have a maximum of 1 character. Options
	 * available are N and Y.
	 */
	public static final int FFM_SPECIAL_MESSAGE_INVALID = 1506;

	/**
	 * The FFR Special Message Option can have a maximum of 3 characters.
	 * Options available are A, C, D and N.
	 */
	public static final int FFR_SPECIAL_MESSAGE_OPTION_INVALID = 1502;

	/**
	 * The FHL Special Message can have a maximum of 2 characters. The first
	 * character must be T, E or S. The second character can be Y or N.
	 */
	public static final int FHL_SPECIAL_MESSAGE_OPTION_INVALID = 1509;

	/**
	 * This constant is used to verify the Invalid flight carrier code. Failed
	 * because of invalid flight carrier code.
	 * <p>
	 * value = {@value}
	 */
	public static final int FLIGHT_CARRIERCODE_INVALID = 1009;

	/**
	 * This constant is used to verify the Invalid flight number. Failed because
	 * of invalid Invalid flight number.
	 * <p>
	 * value = {@value}
	 */
	public static final int FLIGHT_NUMBER_INVALID = 1008;

	/**
	 * This constant is used to verify the Invalid flight suffix code. Failed
	 * because of invalid Invalid flight suffix code.
	 * <p>
	 * value = {@value}
	 */
	public static final int FLIGHT_SUFFIX_INVALID = 1007;

	/**
	 * The FSA Special Message can have a maximum of 1 character. The only
	 * option available is A.
	 */
	public static final int FSA_SPECIAL_MESSAGE_INVALID = 1504;

	/**
	 * The FSU Message flag is mandatory.
	 */
	public static final int FSU_MESSAGE_FLAG_MANDATORY = 1518;

	/**
	 * The FSU Special Message can have a maximum of 1 character. The only
	 * option available is B.
	 */
	public static final int FSU_SPECIAL_MESSAGE_INVALID = 1505;

	/**
	 * Invalid FSU Status Code. Valid values are: RCT, RCF, BKD, RCS, OFL, MAN,
	 * TRM, TFD, DDL, RCC, RCD, FOH, AWD, NFD, DLV, DIS, CRC, CCD, PRE, DEP,
	 * ARR, AWR, FPS and TGC.
	 */
	public static final int FSU_STATUS_CODE_INVALID = 1513;

	/**
	 * Invalid FSU Status Code ObjecID.
	 */
	public static final int FSU_STATUS_CODE_INVALID_OID = 1529;

	/**
	 * The FSU Status Code is mandatory.
	 */
	public static final int FSU_STATUS_CODE_MANDATORY_ALL_VALUE = 1512;

	/**
	 * The FSU Status Option for FSU Status Code {0} is mandatory. Valid values
	 * are N, and Y.
	 */
	public static final int FSU_STATUS_CODE_MANDATORY_ONLY_Y_AND_N = 1536;

	/**
	 * Invalid FSU Status Option. Valid values are Y and N.
	 */
	public static final int FSU_STATUS_OPTION_INVALID_MESSAGE_1 = 1514;

	/**
	 * Invalid FSU Status Option. Valid values are N, Y, H, B and X.
	 */
	public static final int FSU_STATUS_OPTION_INVALID_MESSAGE_2 = 1515;

	/**
	 * The FVR Special Message can have a maximum of 1 character. The only
	 * option available is T.
	 */
	public static final int FVR_SPECIAL_MESSAGE_INVALID = 1507;

	/**
	 * This constant is used to specify if maximum gross weight is within the
	 * limits of 'maximum weight' and 'minimum weight' parameters.
	 * <p>
	 * value = {@value}
	 * <p>
	 * Maximum Gross Weight must be within the limits of dynamic parameter -
	 * {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#MAXIMUM_WEIGHT
	 * MAXIMUM_WEIGHT} and
	 * {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#MINIMUM_WEIGHT
	 * MINIMUM_WEIGHT}
	 */
	public static final int GROSS_WEIGHT_LIMIT_INVALID = 955;

	/**
	 * The group name does not exist in the system.
	 * <p>
	 * value = {@value}
	 */

	public static final int GROUP_NAME_DOES_NOT_EXIST_IN_THE_SYSTEM = 1614;

	/**
	 * This constant is used to verify the aircraft type.
	 * <p>
	 * The aircraft type is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int HISTORY_INVALID_AIRCRAFTTYPE_INSTANCE = 1170;

	/**
	 * This constant is used to verify the B type container code.
	 * <p>
	 * The B type container code is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int HISTORY_INVALID_BTYPE_CONTAINER_CODE = 1164;

	/**
	 * This constant is used to verify the customs status code.
	 * <p>
	 * The customs status code is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int HISTORY_INVALID_CUSTOMS_STATUSCODE = 1165;

	/**
	 * This constant is used to verify the manifest group header code.
	 * <p>
	 * The manifest group header code is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int HISTORY_INVALID_MANIFEST_GROUP_HEADER_CODE = 1166;

	/**
	 * This constant is used to verify the history object instance.
	 * <p>
	 * The invalid history object instance
	 * <p>
	 * value = {@value}
	 */

	public static final int HISTORY_INVALID_OBJECT_INSTANCE = 1161;

	/**
	 * This constant is used to verify whether the history owner is valid or
	 * not.
	 * <p>
	 * The history owner is not valid.
	 * <p>
	 * value = {@value}
	 */
	public static final int HISTORY_INVALID_OWNER = 1163;

	/**
	 * This constant is used to verify whether the owner is entered.
	 * <p>
	 * The history owner is empty.
	 * <p>
	 * value = {@value}
	 */
	public static final int HISTORY_INVALID_OWNER_REQUIRED = 1162;

	/**
	 * This constant is used to verify the pallet code .
	 * <p>
	 * The pallet code is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int HISTORY_INVALID_PALLET_CODE = 1167;

	/**
	 * This constant is used to verify the product code station exception.
	 * <p>
	 * The product code station exception is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int HISTORY_INVALID_PRODUCTCODE_STATION_EXCEPTION = 1168;

	/**
	 * Holiday created.
	 * <p>
	 * value = {@value}
	 */
	public static final int HOLIDAY_CREATE_SUCCESSFUL = 100032;

	/**
	 * Date already exist in the system.
	 * <p>
	 * value = {@value}
	 */
	public static final int HOLIDAY_DATE_ALREADY_EXISTS = 100035;

	/**
	 * The entered date already exists in the standard holiday list.
	 * <p>
	 * value = {@value}
	 */
	public static final int HOLIDAY_DATE_ALREADY_EXISTS_IN_STANDARD = 100044;

	/**
	 * Invalid Holiday date.
	 * <p>
	 * value = {@value}
	 */
	public static final int HOLIDAY_DATE_INVALID = 100042;

	/**
	 * Invalid Holiday.
	 * <p>
	 * value = {@value}
	 */

	public static final int HOLIDAY_INVALID_OBJECT = 100040;

	/**
	 * Holiday type is mandatory.
	 * <p>
	 * value = {@value}
	 */
	public static final int HOLIDAY_TYPE_MANDATORY = 100041;

	/**
	 * Holiday updated.
	 * <p>
	 * value = {@value}
	 */
	public static final int HOLIDAY_UPDATE_SUCCESSFUL = 100043;

	/**
	 * This constant is used to verify the aggregate type. Failed because the
	 * IATA area does not exist.
	 * <p>
	 * Value = {@value}
	 */
	public static final int IATA_AREA_DOES_NOT_EXIST = 742;

	/**
	 * This constant is used to verify the aggregate type. Failed because the
	 * IATA city does not exist.
	 * <p>
	 * Value = {@value}
	 */
	public static final int IATA_CITY_DOES_NOT_EXIST = 744;

	/**
	 * This constant is used to verify the aggregate type. Failed because the
	 * IATA country does not exist.
	 * <p>
	 * Value = {@value}
	 */
	public static final int IATA_COUNTRY_DOES_NOT_EXIST = 743;

	/**
	 * This constant is used to verify the aggregate type. Failed because the
	 * IATA region does not exist.
	 * <p>
	 * Value = {@value}
	 */
	public static final int IATA_REGION_DOES_NOT_EXIST = 734;

	/**
	 * This constant is used to verify the aggregate type. Failed because the
	 * IATA subarea does not exist.
	 * <p>
	 * Value = {@value}
	 */
	public static final int IATA_SUBAREA_DOES_NOT_EXIST = 741;

	/**
	 * This constant is used to verify the Inactive Offices.<br>
	 * Failed because the inactive offices cannot be updated.<br>
	 */
	public static final int INACTIVE_OFFICE_UPDATE_INVALID = 1337;

	/**
	 * This constant is used to verify the inclusion/exclusion. Failed because
	 * inclusion/exclusion is mandatory.
	 * <p>
	 * Value = {@value}
	 */
	public static final int INCLUSION_EXCLUSION_MANDATORY_OBJECT_INSTANCE = 729;

	/* ====================================== */
	/* UC006 Maintain ULD Serial Ranges */
	/* ====================================== */

	/**
	 * This constant is used to verify the inclusion/exclusion type. Failed
	 * because of invalid inclusion/exclusion type.
	 * <p>
	 * Value = {@value}
	 */
	public static final int INCLUSION_EXCLUSION_SAME_GEOGRAPHIC_TYPE = 716;

	/**
	 * Invalid Incoming Double Signature Indicator. Valid values are Y and N.
	 */
	public static final int INCOMING_DOUBLE_SIGNATURE_INVALID = 1510;

	/**
	 * Total number of characters in the Incoming message should be greater than
	 * 0 and less than 9999999999.
	 */
	public static final int INCOMING_NO_OF_CHARS_INVALID = 1525;

	/**
	 * This constant is used to specify the invalid data during create.
	 * <p>
	 * Value ={@value}
	 */
	public static final int INVALID_DATA_AIRPORT_CANNOT_CREATED = 1215;

	/**
	 * This constant is used to specify the invalid data during create.
	 * <p>
	 * Value ={@value}
	 */
	public static final int INVALID_DATA_AIRPORT_CANNOT_DELETED = 1217;

	/**
	 * This constant is used to specify the invalid data during create.
	 * <p>
	 * Value ={@value}
	 */
	public static final int INVALID_DATA_AIRPORT_CANNOT_UPDATED = 1216;
	
	public static final int INVALID_FIELD_FORMAT = 12044;

	/**
	 * This constant is used to find the local currency is valid. Failed because
	 * of invalid local currency.
	 * <p>
	 * Value = {@value}
	 */
	public static final int LOCAL_CURRENCY_DOES_NOT_EXIST = 240;

	/**
	 * This constant is used to find local rating currency is valid. Failed
	 * because of invalid local rating currency.
	 * <p>
	 * Value = {@value}
	 */
	public static final int LOCAL_RATING_CURRENCY_DOES_NOT_EXIST = 241;

	/**
	 * This constant is used to verify if the maximumpackageheight mandatory.
	 * <p>
	 * Value = {@value}
	 */
	public static final int MAXIMUM_PACKAGE_HEIGHT_MANDATORY = 1805;

	/**
	 * This constant is used to verify if the maximumpackagewidth mandatory.
	 * <p>
	 * Value = {@value}
	 */
	public static final int MAXIMUM_PACKAGE_WIDTH_MANDATORY = 1806;

	/**
	 * This constant is used to specify if maximum volume is within the limits
	 * of 'maximum volume' and 'minimum volume' parameters.
	 * <p>
	 * value = {@value}
	 * <p>
	 * Maximum Volume must be within the limits of dynamic parameter -
	 * {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#MAXIMUM_VOLUME
	 * MAXIMUM_VOLUME} and
	 * {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#MINIMUM_VOLUME
	 * MINIMUM_VOLUME}
	 */
	public static final int MAXVOLUME_LIMIT_INVALID = 954;

	/**
	 * This constant is used to verify whether any one member is entered. Failed
	 * because member is mandatory.
	 * <p>
	 * Value = {@value}
	 */
	public static final int MEMBER_MANDATORY_OBJECT_INSTANCE = 692;

	/**
	 * This constant is used to verify the aggregate type. Failed because of
	 * invalid membership area code.
	 * <p>
	 * Value = {@value}
	 */
	public static final int MEMBERSHIP_AREA_CODE_INVALID_OBJECT_INSTANCE = 735;

	/**
	 * This constant is used to verify the membership area. Failed because
	 * membership area does not exist.
	 * <p>
	 * Value = {@value}
	 */
	public static final int MEMBERSHIP_AREA_DOES_NOT_EXIT = 708;

	/**
	 * This constant is used to verify the aggregate type. Failed because of
	 * invalid membership country code.
	 * <p>
	 * Value = {@value}
	 */
	public static final int MEMBERSHIP_COUNTRY_CODE_INVALID_OBJECT_INSTANCE = 737;

	/**
	 * This constant is used to verify the membership country. Failed because
	 * membership country does not exist.
	 * <p>
	 * Value = {@value}
	 */
	public static final int MEMBERSHIP_COUNTRY_DOES_NOT_EXIT = 711;

	/**
	 * This constant is used to verify the membership region type. Failed
	 * because of invalid membership region code.
	 * <p>
	 * Value = {@value}
	 */
	public static final int MEMBERSHIP_REGION_CODE_INVALID_OBJECT_INSTANCE = 718;

	/**
	 * This constant is used to verify the membership region. Failed because
	 * membership region does not exist.
	 * <p>
	 * Value = {@value}
	 */
	public static final int MEMBERSHIP_REGION_DOES_NOT_EXIT = 710;

	/**
	 * This constant is used to verify the aggregate type. Failed because of
	 * invalid membership subarea code object.
	 * <p>
	 * Value = {@value}
	 */
	public static final int MEMBERSHIP_SUBAREA_CODE_INVALID_OBJECT_INSTANCE = 736;

	/**
	 * This constant is used to verify the membership subarea. Failed because
	 * membership subarea does not exist.
	 * <p>
	 * Value = {@value}
	 */
	public static final int MEMBERSHIP_SUBAREA_DOES_NOT_EXIT = 709;

	/**
	 * This constant is used to verify the membership type. Failed because
	 * membership type is mandatory.
	 * <p>
	 * Value = {@value}
	 */
	public static final int MEMBERSHIP_TYPE_MANDATORY_OBJECT_INSTANCE = 685;

	/**
	 * This constant is used to verify the membership world. Failed because
	 * membership world does not exist.
	 * <p>
	 * Value = {@value}
	 */
	public static final int MEMBERSHIP_WORLD_DOES_NOT_EXIST = 746;

	/**
	 * This constant is used to verify whether message length.
	 * <p>
	 * value = {@value}
	 */
	public static final int MESSAGE_CHARACTER_LENGTH_INVALID = 2000154;
	
	/**
	 * This constant is used to verify whether message length. is numeric.
	 * <p>
	 * value = {@value}
	 */
	public static final int MESSAGE_VERSION_MANDATORY = 12045;
	/**
	 * The Message Link does not exist in the system.
	 */
	public static final int MESSAGE_LINK_DOES_NOT_EXIST = 1537;

	/**
	 * The Message Link can have alphabet, number, hyphen (-), period (.) and
	 * space up to 20 characters. Other special characters are not accepted.
	 */
	public static final int MESSAGE_LINK_INVALID = 1496;

	/**
	 * This constant is used to verify whether the Queue Message Text is
	 * entered.
	 * <p>
	 * value = {@value}
	 * <p>
	 * The Queue Message Text is mandatory.<br>
	 */
	public static final int MESSAGE_TEXT_MANDATORY_OBJECT_INSTANCE = 1317;

	/**
	 * Invalid Message Type Detail ObjecID.
	 */
	public static final int MESSAGE_TYPE_DETAIL_INVALID_OID = 1528;

	/**
	 * Only the following Message Types are supported: FFR, FFA, FSR, FSA, FSU,
	 * FFM, FAD, FWB, FWR, FVR, FVA, FOR, FOA, FMA, FBL, FBR, FNA, FZC, FZD, FZE
	 * and FHL.
	 */
	public static final int MESSAGE_TYPE_INVALID = 1498;

	/**
	 * The Message Type is mandatory.
	 */
	public static final int MESSAGE_TYPE_MANDATORY = 1497;

	/**
	 * This constant is used to verify whether the Queue Message Type is
	 * entered.
	 * <p>
	 * value = {@value}
	 * <p>
	 * The Queue Message Type is mandatory.<br>
	 */
	public static final int MESSAGE_TYPE_MANDATORY_OBJECT_INSTANCE = 1315;

	/**
	 * The Message Version must be numeric not exceeding 2 digits.
	 */
	public static final int MESSAGE_VERSION_INVALID = 1500;

	/**
	 * The Message Link is mandatory.
	 */
	public static final int MESSAGELINK_MANDATORY = 1526;

	/**
	 * Invalid Network Indicator. Valid values are T, A, G, X, D and B.
	 */
	public static final int NETWORK_INDICATOR_INVALID = 1487;

	/**
	 * This constant is used to check the Aggregate existence.
	 * <p>
	 * Failed because no match was found.
	 * <p>
	 * Value = {@value}
	 */
	public static final int NO_AGGREGATE_CODE_MATCH = 681;

	/**
	 * This constant is used to verify the aggregate type. Failed because of
	 * aggregate code type mismatch.
	 * <p>
	 * Value = {@value}
	 */
	public static final int NO_AGGREGATE_CODE_TYPE_MATCH = 732;

	/**
	 * This constant is used to verify the aggregate type. Failed because of
	 * aggregate type mismatch.
	 * <p>
	 * Value = {@value}
	 */
	public static final int NO_AGGREGATE_TYPE_MATCH = 733;

	/**
	 * This constant is used to verify whether the history details are returned
	 * for the retrieve action.
	 * <p>
	 * No history records are retrieved.
	 * <p>
	 * value = {@value}
	 */
	public static final int NO_HISTORY_MATCH = 1169;

	/**
	 * This constant is used to verify the aggregate type. Failed because of
	 * IATA code mismatch.
	 * <p>
	 * Value = {@value}
	 */
	public static final int NO_IATA_AGGREGATE_CODE_MATCH = 740;

	/**
	 * This constant is used to indicate that the pallet code entity is not
	 * found in the system.
	 * <p>
	 * Pallet code entity not found in the system.
	 * <p>
	 * value = {@value}
	 */
	public static final int NO_PALLETCODE_ENTITY_FOUND = 1202;

	/**
	 * This constant is used to verify whether any parameter exists in the
	 * system.
	 * <p>
	 * No parameter exists in the system.
	 * <p>
	 * value = {@value}
	 */
	public static final int NO_PARAMETER_EXISTS_IN_THE_SYSTEM = 1562;

	/**
	 * No parameter found for free form text.
	 * <p>
	 * value = {@value}
	 */

	public static final int NO_PARAMETER_FOUND_FOR_FREE_FORM_TEXT = 1626;

	/**
	 * No participant associated with the given Message Link.
	 */
	public static final int NO_PARTICIPANTS_ASSOCIATED_WITH_MSG_LINK = 1533;

	/**
	 * This constant is used to check if the product code exists in the system.
	 * <p>
	 * Value = {@value}
	 */
	public static final int NO_PRODUCTCODE_EXACT_MATCH = 196;

	/*
	 * =========================================================================
	 * = =======
	 */
	/*
	 * End of UC028 Maintain City Information
	 */
	/*
	 * =========================================================================
	 * = =======
	 */
	/*
	 * =========================================================================
	 * = =======
	 */
	/*
	 * Start of UC0259 Maintain City Information /*
	 * ==============================
	 * ===================================================
	 */
	/**
	 * This constant is used to specify that no record found for the given
	 * search input.
	 * <p>
	 * Value = {@value}
	 */
	public static final int NO_RECORD_FOUND = 1141;

	/**
	 * No TTY Address associated with the given Message Link.
	 */
	public static final int NO_TTY_ADDR_PROFILE_ASSOCIATED_WITH_MSG_LINK = 1534;

	/**
	 * This constant is used to verify if any teletype profile exists.
	 * <p>
	 * Failed because no teletype profile for the message type exists in the
	 * system.
	 * <p>
	 * Value = {@value}
	 */
	public static final int NO_TTYPROFILE_EXISTS = 1063;

	/**
	 * This constant is used to verify the ULD Prefix.
	 * <p>
	 * Value = {@value}
	 * <p>
	 * The ULD Prefix does not exist. i.e.There is no match for the specified
	 * ULD Prefix.
	 */
	public static final int NO_ULD_MATCH = 575;

	/**
	 * This constant is used to specify that the combination of ULD and carrier
	 * code does not exists in the system.
	 * <p>
	 * Value = {@value}
	 */

	public static final int NO_ULDCARRIER_MATCH = 577;

	/* ====================================== */
	/* UC008 Terminal Area Location */
	/* ====================================== */

	/**
	 * This constant is used to verify whether the Queue Unique key is entered.
	 * <p>
	 * value = {@value}
	 * <p>
	 * The Queue Unique key is mandatory.<br>
	 */
	public static final int OBJECT_ID_MANDATORY_OBJECT_INSTANCE = 1316;

	/**
	 * This constant is used to verify whether the OfficeQueue instance exists
	 * or not.
	 * <p>
	 * value = {@value}
	 * <p>
	 * The OfficeQueue instance does not exist.<br>
	 */
	public static final int OFF_INVALID_OFFICEQUEUE_INSTANCE = 1290;

	/**
	 * This constant is used to verify the office can be activated.<br>
	 * Failed because the Office cannot be deleted.<br>
	 */
	public static final int OFFICE_ACTIVATED_SUCCESSFULLY = 1367;

	/**
	 * This constant is used to verify the Office Status.<br>
	 * Failed because the office is already active.<br>
	 */
	public static final int OFFICE_ACTIVE = 1338;

	/**
	 * This constant is used to verify the Office Address.<br>
	 * Failed because the Office Address is invalid.<br>
	 */
	public static final int OFFICE_ADDRESS_INVALID = 1351;

	/**
	 * This constant is used to verify the Alternate Office.<br>
	 * Failed because the Alternate Office does not exist in the system.<br>
	 */
	public static final int OFFICE_ALTERNATE_OFFICE_DOES_NOT_EXIST = 1361;

	/**
	 * This constant is used to verify the Alternate Office.<br>
	 * Failed because the alternate office is not present in request.<br>
	 */
	public static final int OFFICE_ALTERNATE_OFFICE_FOR_INACTIVATION = 1336;

	/**
	 * This constant is used to verify the Alternate Office.<br>
	 * Failed because the Alternate Office is invalid.<br>
	 */
	public static final int OFFICE_ALTERNATE_OFFICE_INVALID = 1350;

	/**
	 * This constant is used to verify the City.<br>
	 * Failed because the City is invalid.<br>
	 */
	public static final int OFFICE_CITY_INVALID = 1352;

	/**
	 * This constant is used to verify the City.<br>
	 * Failed because the City is not present in the request.<br>
	 */
	public static final int OFFICE_CITY_REQUIRED = 1347;

	/**
	 * This constant is used to verify the Country Code.<br>
	 * Failed because the Country Code does not exist in the system.<br>
	 */
	public static final int OFFICE_COUNTRY_CODE_DOES_NOT_EXIST = 1346;

	/**
	 * This constant is used to verify the Country.<br>
	 * Failed because the Country is invalid.<br>
	 */
	public static final int OFFICE_COUNTRY_INVALID = 1353;

	/**
	 * This constant is used to verify the office can be created.<br>
	 * Failed because the Office cannot be created.<br>
	 */
	public static final int OFFICE_CREATED_SUCCESSFULLY = 1363;

	/**
	 * This constant is used to verify the office can be deleted.<br>
	 * Failed because the Office cannot be deleted.<br>
	 */
	public static final int OFFICE_DELETED_SUCCESSFULLY = 1365;

	/**
	 * This constant is used to verify the Office Designator.<br>
	 * Failed because the Office Designator is invalid.<br>
	 */
	public static final int OFFICE_DESIGNATOR_INVALID = 1349;

	/**
	 * This constant is used to verify the Email.<br>
	 * Failed because the Email entered is invalid.<br>
	 */
	public static final int OFFICE_EMAIL_INVALID = 1356;

	/**
	 * This constant is used to verify the fax.<br>
	 * Failed because the fax entered is invalid.<br>
	 */
	public static final int OFFICE_FAX_INVALID = 1355;

	/**
	 * This constant is used to verify the Office Identifier.<br>
	 * Failed because the identifier does not exist in the system.<br>
	 */
	public static final int OFFICE_IDENTIFIER_DOES_NOT_EXIST = 1332;

	/**
	 * This constant is used to verify the Office Identifier.<br>
	 * Failed because the Office Identifier is invalid.<br>
	 */
	public static final int OFFICE_IDENTIFIER_INVALID = 1348;

	/**
	 * This constant is used to verify that either Office identifier/Office
	 * Station is present for Status update and Find request.<br>
	 * Failed because both are not present.<br>
	 */
	public static final int OFFICE_IDENTIFIER_OR_STATION_REQUIRED = 1331;

	/**
	 * This constant is used to verify the Office Identifier.<br>
	 * Failed because the identifier is not present in the request.<br>
	 */
	public static final int OFFICE_IDENTIFIER_REQUIRED = 1333;

	/**
	 * This constant is used to verify the Office Identifier of an Office.<br>
	 * Failed because the identifier of an office is not unique.<br>
	 */
	public static final int OFFICE_IDENTIFIER_UNIQUE = 1334;

	/**
	 * This constant is used to verify the Office Identifier.<br>
	 * Failed because the identifier cannot be updated.<br>
	 */
	public static final int OFFICE_IDENTIFIER_UPDATE_INVALID = 1335;

	/**
	 * This constant is used to verify the office can be activated.<br>
	 * Failed because the Office cannot be deleted.<br>
	 */
	public static final int OFFICE_INACTIVATED_SUCCESSFULLY = 1368;

	/**
	 * This constant is used to verify the Office Status.<br>
	 * Failed because the office is already in active.<br>
	 */
	public static final int OFFICE_INACTIVE = 1339;

	/**
	 * This constant is used to verify that the Office Status before deleting
	 * <br>
	 * Failed because the office must be inactive before deleting.<br>
	 */
	public static final int OFFICE_INACTIVE_BEFORE_DELETION = 1341;

	/**
	 * This constant is used to verify whether the queue item oid is given in
	 * the input or not.
	 * <p>
	 * value = {@value}
	 * <p>
	 * No items in Office Queue.<br>
	 */
	public static final int OFFICE_ITEM_OID_MANDATORY = 1322;

	/*
	 * =========================================================================
	 * = =======
	 */
	/*
	 * =========================================================================
	 * = ======
	 */
	/* Start of UC251 Maintain Office Information */
	/*
	 * =========================================================================
	 * = ======
	 */
	/**
	 * This constant is used to verify the instance of Office.<br>
	 * Failed because the object is invalid.<br>
	 */
	public static final int OFFICE_OBJECT_INVALID = 1330;

	/**
	 * This constant is used to verify the Phone.<br>
	 * Failed because the Phone is invalid.<br>
	 */
	public static final int OFFICE_PHONE_INVALID = 1354;

	/**
	 * This constant is used to verify the Postal Code.<br>
	 * Failed because the Postal Code is invalid.<br>
	 */
	public static final int OFFICE_POSTAL_CODE_INVALID = 1358;

	/**
	 * This constant is used to verify the Office Queue Items.<br>
	 * Failed because the office has queues with active queue items.<br>
	 */
	public static final int OFFICE_QUEUE_EXIST = 1342;

	/**
	 * This constant is used to display success message for deletion.
	 * <p>
	 * value = {@value}
	 * <p>
	 * Office Queue Item deleted succesfully.<br>
	 */
	public static final int OFFICE_QUEUE_ITEM_DELETED_SUCCESSFULLY = 1306;

	/**
	 * This constant is used to verify whether the queue item is present or not.
	 * <p>
	 * value = {@value}
	 * <p>
	 * No items in Office Queue.<br>
	 */
	public static final int OFFICE_QUEUE_ITEM_EMPTY = 1321;

	/**
	 * This constant is used to display success message for resubmission.
	 * <p>
	 * value = {@value}
	 * <p>
	 * Office Queue Item resubmitted succesfully.<br>
	 */
	public static final int OFFICE_QUEUE_ITEM_RESUBMITED_SUCCESSFULLY = 1319;

	/**
	 * This constant is used to display success message for deletion.
	 * <p>
	 * value = {@value}
	 * <p>
	 * OfficeQueueItems Deleted succesfully.<br>
	 */
	public static final int OFFICE_QUEUE_ITEMS_DELETED_SUCCESSFULLY = 1312;

	/**
	 * This constant is used to verify whether the queue items are present or
	 * not.
	 * <p>
	 * value = {@value}
	 * <p>
	 * No items in Office Queue.<br>
	 */
	public static final int OFFICE_QUEUE_ITEMS_EMPTY = 1320;

	/**
	 * This constant is used to verify whether the OfficeQueueItems is exist or
	 * not.
	 * <p>
	 * value = {@value}
	 * <p>
	 * OfficeQueueItems does not exist.<br>
	 */
	public static final int OFFICE_QUEUE_ITEMS_NOT_EXIST = 1308;

	/**
	 * This constant is used to verify the State Name.<br>
	 * Failed because the State Name entered is invalid.<br>
	 */
	public static final int OFFICE_STATE_INVALID = 1357;

	/**
	 * This constant is used to verify the Station Code.<br>
	 * Failed because the Station Code is not present in request.<br>
	 */
	public static final int OFFICE_STATION_CODE_REQUIRED = 1344;

	/**
	 * This constant is used to verify the state name.<br>
	 * Failed because the station name is invalid.<br>
	 */
	public static final int OFFICE_STATION_INVALID = 1345;

	/**
	 * This constant is used to verify the Station Code.<br>
	 * Failed because the Station Code is neither an airport nor city.<br>
	 */
	public static final int OFFICE_STATION_NOT_AIRPORT_OR_CITY = 1362;

	/**
	 * This constant is used to verify the office can be updated.<br>
	 * Failed because the Office cannot be updated.<br>
	 */
	public static final int OFFICE_UPDATED_SUCCESSFULLY = 1364;

	/**
	 * This constant is used to verify whether the message type is valid or not.
	 * <p>
	 * value = {@value}
	 * <p>
	 * The message type is invalid.<br>
	 */
	public static final int OFFICEQUEUE_FLIGHT_MESSAGE_TYPE = 1305;

	/**
	 * This constant is used to verify whether the flight suffix code is valid
	 * or not.
	 * <p>
	 * value = {@value}
	 * <p>
	 * The flight suffix code is invalid.<br>
	 */
	public static final int OFFICEQUEUE_FLIGHT_SUFFIX_CODE = 1302;

	/**
	 * This constant is used to verify whether the carrier code is valid or not.
	 * <p>
	 * value = {@value}
	 * <p>
	 * The carrier code is invalid.<br>
	 */
	public static final int OFFICEQUEUE_INVALID_CARRIER_CODE = 1301;

	/**
	 * This constant is used to verify whether the destination station code is
	 * valid or not.
	 * <p>
	 * value = {@value}
	 * <p>
	 * The destination station code is invalid.<br>
	 */
	public static final int OFFICEQUEUE_INVALID_DESTINATION_STATION_CODE = 1300;

	/**
	 * This constant is used to specify that the Flight Date instance is
	 * invalid.<br>
	 */
	/**
	 * This constant is used to verify whether the flight date is valid or not.
	 * <p>
	 * value = {@value}
	 * <p>
	 * The flight date is invalid.<br>
	 */
	public static final int OFFICEQUEUE_INVALID_FLIGHT_DATE = 1303;

	/**
	 * This constant is used to verify whether the flight deadline is valid or
	 * not.
	 * <p>
	 * value = {@value}
	 * <p>
	 * The flight deadline is invalid.<br>
	 */
	public static final int OFFICEQUEUE_INVALID_FLIGHT_DEADLINE = 1304;

	/**
	 * This constant is used to verify whether the flight Number is valid or
	 * not.
	 * <p>
	 * value = {@value}
	 * <p>
	 * The flight Number is invalid.<br>
	 */
	public static final int OFFICEQUEUE_INVALID_FLIGHT_NUMBER = 1297;

	/**
	 * This constant is used to verify whether the message age is valid or not.
	 * <p>
	 * value = {@value}
	 * <p>
	 * The message age is invalid.<br>
	 */
	public static final int OFFICEQUEUE_INVALID_MESSAGE_AGE = 1298;

	/**
	 * This constant is used to verify whether the number of items field is
	 * valid or not.
	 * <p>
	 * value = {@value}
	 * <p>
	 * The number of items field is invalid.<br>
	 */
	public static final int OFFICEQUEUE_INVALID_NUMBER_OF_ITEMS = 1296;
	
	/**
	 * This constant is used to verify whether the number of items field is
	 * valid or not. 
	 * <p>
	 * value = {@value}
	 * <p>
	 * The number of items field is invalid.<br>
	 */
	public static final int CRA_OFFICEQUEUE_INVALID_NUMBER_OF_ITEMS = 1323;

	/**
	 * This constant is used to verify whether the Office Queue instance is
	 * valid or not.
	 * <p>
	 * value = {@value}
	 * <p>
	 * The Office Queue instance is invalid.<br>
	 */
	public static final int OFFICEQUEUE_INVALID_OBJECT_INSTANCE = 1293;

	/**
	 * This constant is used to verify whether the origin station code is valid
	 * or not.
	 * <p>
	 * value = {@value}
	 * <p>
	 * The origin station code is invalid.<br>
	 */
	public static final int OFFICEQUEUE_INVALID_ORIGIN_STATION_CODE = 1299;

	/**
	 * This constant is used to verify whether the queue name is valid or not.
	 * <p>
	 * value = {@value}
	 * <p>
	 * The queue name is invalid.<br>
	 */
	public static final int OFFICEQUEUE_INVALID_QUEUE_NAME = 1295;

	/**
	 * This constant is used to verify whether the Office Queue is valid or not.
	 * <p>
	 * value = {@value}
	 * <p>
	 * The Office Queue is invalid.<br>
	 */
	public static final int OFFICEQUEUE_INVALID_QUEUE_OFFICE = 1294;

	/**
	 * This constant is used to verify whether the queue type is valid or not.
	 * <p>
	 * value = {@value}
	 * <p>
	 * The queue type is invalid.<br>
	 */
	public static final int OFFICEQUEUE_INVALID_QUEUE_TYPE = 1318;

	/**
	 * This constant is used to verify whether the OfficeQueue is exist or not.
	 * <p>
	 * value = {@value}
	 * <p>
	 * The OfficeQueue does not exist in the system.<br>
	 */
	public static final int OFFICEQUEUE_NOT_EXIST = 1307;

	/**
	 * This constant is used to verify the instance description object.
	 * <p>
	 * Failed because description is mandatory .<br>
	 */
	public static final int OTHERCHARGECODE_AUTOADDCHARGECODENOTFORDELETE_OBJECT_INSTANCE = 813;

	/**
	 * This constant is used to verify the instance of other charge code object.
	 * <p>
	 * Failed because other charge code can not be deleted rate for automatic
	 * add charge code.<br>
	 */
	public static final int OTHERCHARGECODE_CANNOT_BE_DELETED_RATEEXISTFOR_AUTOMATICADDCHARGECODE = 825;

	/**
	 * This constant is used to verify the instance of other charge code object.
	 * <p>
	 * Failed because other charge code can not be deleted rate exist for other
	 * charge code.<br>
	 */
	public static final int OTHERCHARGECODE_CANNOT_BE_DELETED_RATEEXISTFOR_OTHERCHARGECODE = 826;

	/* ==================================================== */
	/* UC008 Terminal Area Location */
	/* ==================================================== */

	/* ====================================== */
	/* UC13/14 Exchange Rate */
	/* ====================================== */

	/**
	 * This constant is used to verify the instance of other charge code object.
	 * <p>
	 * Failed because other charge code refers cash drawer module.<br>
	 */
	public static final int OTHERCHARGECODE_CDM_INVALID_OBJECT_INSTANCE = 823;

	/**
	 * This constant is used to verify the instance of other charge code collect
	 * rate table indicator mandatory object.
	 * <p>
	 * Failed because invalid collect rate table indicator mandatory object
	 * instance.<br>
	 */
	public static final int OTHERCHARGECODE_COLLECTRATETABLEINDICATORMANDATORY_OBJECT_INSTANCE = 795;

	/*
	 * =========================================================================
	 * =
	 */
	/*
	 * UC022 OtherChargeCode and UC244 OtherChargeSubCode Constants 761 to 830
	 */
	/*
	 * =========================================================================
	 */
	/**
	 * This constant is used to specify that the create operation is successful.
	 * <p>
	 * {0}- Created Other Charge Code.<br>
	 */
	public static final int OTHERCHARGECODE_CREATE_SUCCESSFUL = 814;

	/**
	 * This constant is used to specify that the create operation is successful.
	 * <p>
	 * {0}- Deleted Other Charge Code.<br>
	 */
	public static final int OTHERCHARGECODE_DELETE_SUCCESSFUL = 815;

	/**
	 * This constant is used to verify the instance description object.
	 * <p>
	 * Failed because description is mandatory .<br>
	 */
	public static final int OTHERCHARGECODE_DESCRIPTIONMANDATORY_OBJECT_INSTANCE = 808;

	/**
	 * This constant is used to verify the instance description object.
	 * <p>
	 * Failed because description is not allowed when description required
	 * indicator is false.<br>
	 */
	public static final int OTHERCHARGECODE_DESCRIPTIONNOTALLOWED_OBJECT_INSTANCE = 809;

	/**
	 * This constant is used to verify the instance of other charge code due
	 * indicator object.
	 * <p>
	 * Failed because invalid due code indicator object instance.<br>
	 */
	public static final int OTHERCHARGECODE_DUEINDICATORMANDATORY_OBJECT_INSTANCE = 793;

	/**
	 * This constant is used to verify the instance of other charge code
	 * generation code indicator mandatory object.
	 * <p>
	 * Failed because invalid generation code indicator mandatory object
	 * instance.<br>
	 */
	public static final int OTHERCHARGECODE_GENERATIONINDICATORMANDATORY_OBJECT_INSTANCE = 799;

	/**
	 * This constant is used to verify the aggregate object instance.
	 * <p>
	 * Failed because of invalid aggregate type indicator.<br>
	 */
	public static final int OTHERCHARGECODE_INVALID_AGGREGATE_OBJECT_INSTANCE = 762;

	/**
	 * This constant is used to verify the instance of aggregate type object.
	 * <p>
	 * Failed because invalid aggregate type object instance.<br>
	 */
	public static final int OTHERCHARGECODE_INVALID_AGGREGATETYPE_OBJECT_INSTANCE = 763;

	/**
	 * This constant is used to verify the instance of other charge code
	 * allowable currency code object.
	 * <p>
	 * Failed because invalid allowable currency code object instance.<br>
	 */
	public static final int OTHERCHARGECODE_INVALID_ALLOWABLECURRENCYCODE_OBJECT_INSTANCE = 766;

	/**
	 * This constant is used to verify the instance of other charge code
	 * allowable currency indicator mandatory object.
	 * <p>
	 * Failed because invalid allowable currency indicator mandatory object
	 * instance.<br>
	 */
	public static final int OTHERCHARGECODE_INVALID_ALLOWABLECURRENCYINDICATORMANDATORY_OBJECT_INSTANCE = 796;

	/**
	 * This constant is used to verify the allowable usage code type.
	 * <p>
	 * Failed because invalid allowable usage code type object instance.<br>
	 */
	public static final int OTHERCHARGECODE_INVALID_ALLOWABLEUSAGECODE_OBJECT_INSTANCE = 764;

	/**
	 * This constant is used to verify the instance of other charge code
	 * allowable usage indicator object.
	 * <p>
	 * Failed because invalid object instance.<br>
	 */
	public static final int OTHERCHARGECODE_INVALID_ALLOWABLEUSAGEINDICATORMANDATORY_OBJECT_INSTANCE = 791;

	/**
	 * This constant is used to verify the automatic add charge code type.
	 * <p>
	 * Failed because invalid automatic add charge code type object instance.
	 * <br>
	 */
	public static final int OTHERCHARGECODE_INVALID_AUTOMATICADDCHARGECODE_OBJECT_INSTANCE = 788;

	/**
	 * This constant is used to verify the collect crate table code type.
	 * <p>
	 * Failed because invalid collect crate table code type object instance.<br>
	 */
	public static final int OTHERCHARGECODE_INVALID_COLLECTRATETABLECODE_OBJECT_INSTANCE = 765;

	/**
	 * This constant is used to verify the instance of default sub code object.
	 * <p>
	 * Failed because default sub code refers cash drawer module.<br>
	 */
	public static final int OTHERCHARGECODE_INVALID_DEFAULTSUBCODE_O_CDM_OBJECT_INSTANCE = 821;

	/**
	 * This constant is used to verify the default sub code type.
	 * <p>
	 * Failed because invalid default sub code type object instance.<br>
	 */
	public static final int OTHERCHARGECODE_INVALID_DEFAULTSUBCODE_OBJECT_INSTANCE = 810;

	/**
	 * This constant is used to verify the instance of sub code object.
	 * <p>
	 * Failed because invalid sub code object instance.<br>
	 */
	public static final int OTHERCHARGECODE_INVALID_DEFAULTSUBCODEFOR_A_OBJECT_INSTANCE = 769;

	/**
	 * This constant is used to verify the instance of sub code object.
	 * <p>
	 * Failed because invalid sub code object instance.<br>
	 */
	public static final int OTHERCHARGECODE_INVALID_DEFAULTSUBCODEFOR_D_OBJECT_INSTANCE = 768;

	/**
	 * This constant is used to verify the instance of sub code object.
	 * <p>
	 * Failed because invalid sub code object instance.<br>
	 */
	public static final int OTHERCHARGECODE_INVALID_DEFAULTSUBCODEFOR_N_OBJECT_INSTANCE = 767;

	/**
	 * This constant is used to verify the instance of sub code object.
	 * <p>
	 * Failed because invalid sub code object instance.<br>
	 */
	public static final int OTHERCHARGECODE_INVALID_DEFAULTSUBCODEFOR_O_OR_E_OBJECT_INSTANCE = 771;

	/**
	 * This constant is used to verify the instance of sub code object.
	 * <p>
	 * Failed because invalid sub code object instance.<br>
	 */
	public static final int OTHERCHARGECODE_INVALID_DEFAULTSUBCODEFOR_S_OBJECT_INSTANCE = 773;

	/**
	 * This constant is used to verify the instance description object.
	 * <p>
	 * Failed because description is not allowed when description required
	 * indicator is false.<br>
	 */
	public static final int OTHERCHARGECODE_INVALID_DEFAULTSUBCODEFORA_OBJECT_INSTANCE = 770;

	/**
	 * This constant is used to verify the description.
	 * <p>
	 * Failed because of invalid description indicator.<br>
	 */
	public static final int OTHERCHARGECODE_INVALID_DESCRIPTION_OBJECT_INSTANCE = 802;

	/**
	 * This constant is used to check if the size of the other charge code
	 * description limit.
	 * <p>
	 * Failed because invalid other charge code description limit size over.<br>
	 */
	public static final int OTHERCHARGECODE_INVALID_DESCRIPTIONEXEEDSLIMIT_OBJECT_INSTANCE = 774;

	/**
	 * This constant is used to verify the instance of other charge code
	 * description required mandatory object.
	 * <p>
	 * Failed because invalid object instance.<br>
	 */
	public static final int OTHERCHARGECODE_INVALID_DESCRIPTIONREQUIREDINDICATORMANDATORY_OBJECT_INSTANCE = 792;

	/**
	 * This constant is used to verify the due code type.
	 * <p>
	 * Failed because invalid due code type object instance.<br>
	 */
	public static final int OTHERCHARGECODE_INVALID_DUECODE_OBJECT_INSTANCE = 775;

	/**
	 * This constant is used to verify the instance of default sub code object.
	 * <p>
	 * Failed because default sub code refers cash drawer module.<br>
	 */
	public static final int OTHERCHARGECODE_INVALID_E_OR_S_CDM_OBJECT_INSTANCE = 822;

	/**
	 * This constant is used to verify the find other charge code type.
	 * <p>
	 * Failed because invalid find other charge code type object instance.<br>
	 */
	public static final int OTHERCHARGECODE_INVALID_FINDOTHERCHARGECODE_INSTANCE = 776;

	/**
	 * This constant is used to verify the generation code type.
	 * <p>
	 * Failed because invalid generation code type object instance.<br>
	 */
	public static final int OTHERCHARGECODE_INVALID_GENERATIONCODE_OBJECT_INSTANCE = 777;

	/**
	 * This constant is used to verify the instance of other charge code
	 * mandatory object.
	 * <p>
	 * Failed because invalid mandatory object instance.<br>
	 */
	public static final int OTHERCHARGECODE_INVALID_MANDATORY_OBJECT_INSTANCE = 789;

	/**
	 * This constant is used to verify the instance of other charge code object.
	 * <p>
	 * Failed because other charge code object is mandatory if exact match
	 * indicator is true.<br>
	 */
	public static final int OTHERCHARGECODE_INVALID_MANDATORYFOREXACTMATCHIND_OBJECT_INSTANCE = 805;

	/**
	 * This constant is used to verify the instance of object.
	 * <p>
	 * Failed because invalid other charge code object instance.<br>
	 */
	public static final int OTHERCHARGECODE_INVALID_OBJECT_INSTANCE = 778;

	/* ====================================== */
	/* UC015 Maintain Aggregate Region */
	/* ====================================== */

	/**
	 * This constant is used to verify the object ID code type.
	 * <p>
	 * Failed because invalid object ID code type object instance.<br>
	 */
	public static final int OTHERCHARGECODE_INVALID_OID_OBJECT_INSTANCE = 812;

	/**
	 * This constant is used to verify the other charge code type.
	 * <p>
	 * Failed because invalid other charge code type object instance.<br>
	 */
	public static final int OTHERCHARGECODE_INVALID_OTHERCHARGECODE_OBJECT_INSTANCE = 1458;

	/**
	 * This constant is used to verify the prepaid rate table code type.
	 * <p>
	 * Failed because invalid prepaid rate table code type object instance.<br>
	 */
	public static final int OTHERCHARGECODE_INVALID_PREPAIDRATETABLECODE_OBJECT_INSTANCE = 798;

	/**
	 * This constant is used to verify the required participant code type.
	 * <p>
	 * Failed because invalid required participant code type object instance.
	 * <br>
	 */
	public static final int OTHERCHARGECODE_INVALID_REQUIREDPARTICIPANTCODE_OBJECT_INSTANCE = 807;

	/**
	 * This constant is used to verify the special validation rule type.
	 * <p>
	 * Failed because invalid special validation rule type object instance.<br>
	 */
	public static final int OTHERCHARGECODE_INVALID_SPECIALVALIDATIONRULE_OBJECT_INSTANCE = 800;

	/**
	 * This constant is used to verify the sub code required type.
	 * <p>
	 * Failed because invalid sub code required type object instance.<br>
	 */
	public static final int OTHERCHARGECODE_INVALID_SUBCODEREQUIRED_OBJECT_INSTANCE = 806;

	/**
	 * This constant is used to verify the instance of other charge code object.
	 * <p>
	 * Failed because invalid object instance.<br>
	 */
	public static final int OTHERCHARGECODE_INVALID_SUBCODEREQUIREDCODEMANDATORY_OBJECT_INSTANCE = 790;

	/**
	 * This constant is used to verify the instance of other charge code object.
	 * <p>
	 * Failed because other charge code is not updateable object instance.<br>
	 */
	public static final int OTHERCHARGECODE_IS_NOT_UPDATABLE = 804;

	/**
	 * This constant is used to verify the other charge code.
	 * <p>
	 * The Other charge code must be an alphanumeric of size 2.
	 * <p>
	 * value = {@value}
	 */
	public static final int OTHERCHARGECODE_NOT_VALID = 123;

	/**
	 * This constant is used to verify the instance of other charge code prepaid
	 * rate table code mandatory object.
	 * <p>
	 * Failed because invalid prepaid rate table code mandatory object instance.
	 * <br>
	 */
	public static final int OTHERCHARGECODE_PREPAIDRATETABLEINDICATORMANDATORY_OBJECT_INSTANCE = 794;

	/**
	 * This constant is used to verify the instance of other charge code special
	 * validation rule mandatory object.
	 * <p>
	 * Failed because invalid special validation rule mandatory object instance.
	 * <br>
	 */
	public static final int OTHERCHARGECODE_SPECIALVALIDATIONRULESMANDATORY_OBJECT_INSTANCE = 797;

	/**
	 * This constant is used to verify the instance description object.
	 * <p>
	 * Failed because description is mandatory .<br>
	 */
	public static final int OTHERCHARGECODE_SUBCODE_DESCRIPTIONMANDATORY_OBJECT_INSTANCE = 811;

	/**
	 * This constant is used to specify that the create operation is successful.
	 * <p>
	 * {0}- Updated Other Charge Code.<br>
	 */
	public static final int OTHERCHARGECODE_UPDATE_SUCCESSFUL = 816;

	/**
	 * This constant is used to verify the other charge code instance of object.
	 * <p>
	 * The other charge code already exist in the system.<br>
	 */
	public static final int OTHERCHARGECODESERVICE_ENTITY_ALREADY_EXIST = 787;

	/**
	 * This constant is used to verify the instance of other charge code object.
	 * <p>
	 * Failed because invalid other charge code object not exists.<br>
	 */
	public static final int OTHERCHARGECODESERVICE_OBJECT_DOES_NOT_EXIST = 779;

	/**
	 * This constant is used to specify that the create operation is successful.
	 * <p>
	 * {0}- Created Other Charge Sub Code.<br>
	 */
	public static final int OTHERCHARGESUBCODE_CREATE_SUCCESSFUL = 817;

	/**
	 * This constant is used to specify that the create operation is successful.
	 * <p>
	 * {0}- Deleted Other Charge Sub Code.<br>
	 */
	public static final int OTHERCHARGESUBCODE_DELETE_SUCCESSFUL = 818;

	/**
	 * This constant is used to verify the instance of other charge sub code
	 * description object.
	 * <p>
	 * Failed because invalid description object instance.<br>
	 */
	public static final int OTHERCHARGESUBCODE_INVALID_DESCRIPTION_OBJECT_INSTANCE = 803;

	/**
	 * This constant is used to check if the size of the other charge sub code
	 * description limit.
	 * <p>
	 * Failed because invalid other charge sub code description limit size over.
	 * <br>
	 */
	public static final int OTHERCHARGESUBCODE_INVALID_DESCRIPTIONEXEEDSLIMIT_OBJECT_INSTANCE = 780;

	/**
	 * This constant is used when the other charge sub code the user is trying
	 * to find doesn't exist.
	 */
	public static final int OTHERCHARGESUBCODE_INVALID_FINDOTHERCHARGECODE_INSTANCE = 781;

	/**
	 * This constant is used to verify the instance of other charge sub code
	 * mandatory object.
	 * <p>
	 * Failed because invalid mandatory object instance.<br>
	 */
	public static final int OTHERCHARGESUBCODE_INVALID_MANDATORY_OBJECT_INSTANCE = 801;

	/**
	 * This constant is used to verify the instance of other charge sub code
	 * object.
	 * <p>
	 * Failed because invalid other charge sub code object instance.<br>
	 */
	public static final int OTHERCHARGESUBCODE_INVALID_OBJECT_INSTANCE = 782;

	/**
	 * This constant is used to verify the instance of the other charge sub code
	 * object ID object.
	 * <p>
	 * Failed because invalid the other charge sub code object ID instance.<br>
	 */
	public static final int OTHERCHARGESUBCODE_INVALID_OID_OBJECT_INSTANCE = 783;

	/**
	 * This constant is used to verify the instance of other charge sub code
	 * object.
	 * <p>
	 * Failed because invalid other charge sub code object value.<br>
	 */
	public static final int OTHERCHARGESUBCODE_INVALID_OTHERCHARGESUBCODE_OBJECT_INSTANCE = 784;

	/**
	 * This constant is used to verify the instance sub code object.
	 * <p>
	 * Failed because sub code is not updatable.<br>
	 */
	public static final int OTHERCHARGESUBCODE_NOT_UPDATABLE = 824;

	/**
	 * This constant is used to specify that the create operation is successful.
	 * <p>
	 * {0}- Updated Other Charge Sub Code.<br>
	 */
	public static final int OTHERCHARGESUBCODE_UPDATE_SUCCESSFUL = 819;

	/**
	 * This constant is used to verify the other charge sub code already exist
	 * or not.
	 * <p>
	 * Failed because of invalid other charge sub code already exist.<br>
	 */
	public static final int OTHERCHARGESUBCODESERVICE_ENTITY_ALREADY_EXIST = 786;

	/**
	 * This constant is used to verify the instance of other charge sub code
	 * object.
	 * <p>
	 * The other charge sub code does not exist in the system.<br>
	 */
	public static final int OTHERCHARGESUBCODESERVICE_OBJECT_DOES_NOT_EXIST = 785;

	/**
	 * Invalid Outgoing Double Signature Indicator. Valid values are F and A.
	 */
	public static final int OUTGOING_DOUBLE_SIGNATURE_INVALID = 1511;

	/**
	 * Only 1-20 number of TTY/TPR Addresse(s) allowed in Outgoing message.
	 */
	public static final int OUTGOING_MSG_MAX_TTY_TPR_ADDRESS = 1530;

	/**
	 * This constant is used to indicate successful pallet code creation.
	 * <p>
	 * Pallet code creates successfully.
	 * <p>
	 * value = {@value}
	 */
	public static final int PALLET_CODE_CREATE_SUCCESSFUL = 1199;

	/**
	 * This constant is used to indicate that the pallet code deleted
	 * successfully.
	 * <p>
	 * Pallet code deleted successfully.
	 * <p>
	 * value = {@value}
	 */
	public static final int PALLET_CODE_DELETE_SUCCESSFUL = 1201;

	/**
	 * This constant is used to verify whether pallet code is invalid or not.
	 * <p>
	 * The pallet code is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int PALLET_CODE_INVALID = 1193;

	/**
	 * This constant is used to indicate that the pallet code entered is invalid
	 * during retrieval.
	 * <p>
	 * Invalid pallet code.
	 * <p>
	 * value = {@value}
	 */
	public static final int PALLET_CODE_RETRIEVE_INVALID = 1204;

	/**
	 * This constant is used to indicate that the pallet code update is
	 * successful.
	 * <p>
	 * Pallet code updated successfully.
	 * <p>
	 * value = {@value}
	 */
	public static final int PALLET_CODE_UPDATE_SUCCESSFUL = 1203;

	/**
	 * This constant is used to verify whether pallet code is given as an input.
	 * <p>
	 * The pallet code is required.
	 * <p>
	 * value = {@value}
	 */
	public static final int PALLET_CODE_USAGE = 1192;

	/**
	 * This constant is used to indicate that the pallet code volume exceeds the
	 * limit which is defined.
	 * <p>
	 * Pallet code volume can not be greater than runtime parameter - 'Maximum
	 * Volume'.
	 * <p>
	 * value = {@value}
	 */
	public static final int PALLET_CODE_VOLUME_NOT_IN_LIMITS = 1207;

	/**
	 * This constant is used to indicate that the pallet contour code can not be
	 * updated.
	 * <p>
	 * Pallet contour code can not be updated.
	 * <p>
	 * value = {@value}
	 */
	public static final int PALLET_CONTOUR_CANNOT_BE_UPDATED = 1200;

	/**
	 * This constant is used to verify the pallet code object.
	 * <p>
	 * The pallet code is invalid
	 * <p>
	 * value = {@value}
	 */
	public static final int PALLET_INVALID_OBJECT_INSTANCE = 1197;

	/**
	 * This constant is used to verify the pallet code object.
	 * <p>
	 * The pallet object id invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int PALLET_INVALID_OID_OBJECT_INSTANCE = 1198;

	/**
	 * This constant is used to verify the pallet contour code.
	 * <p>
	 * The pallet contour code is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int PALLETCODE_CONTOUR_CODE_INVALID = 1195;

	/**
	 * This constant is used to verify the pallet code description.
	 * <p>
	 * The pallet code description is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int PALLETCODE_DESCRIPTION_INVALID = 1194;

	/**
	 * This constant is used to verify the pallet code volume.
	 * <p>
	 * The pallet code volume is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int PALLETCODE_VOLUME_INVALID = 1191;

	/**
	 * This constant is used to indicate that the pallet code entity already
	 * exists.
	 * <p>
	 * The pallet code entity already exists.
	 * <p>
	 * value = {@value}
	 */
	public static final int PALLETCODESERVICE_ENTITY_ALREADY_EXIST = 1205;

	/**
	 * This constant is used to indicate that the pallet code entity does not
	 * exist in the system.
	 * <p>
	 * The pallet code entity does not exist in the system.
	 * <p>
	 * value = {@value}
	 */
	public static final int PALLETCODESERVICE_OBJECT_DOES_NOT_EXIST = 1206;

	/**
	 * The parameter description is mandatory.
	 * <p>
	 * value = {@value}
	 */

	public static final int PARAMETER_DESCRIPTION_MANDATORY = 1605;

	/**
	 * The parameter description must be 1-5000 characters.
	 * <p>
	 * value = {@value}
	 */

	public static final int PARAMETER_DESCRIPTION_TYPE = 1609;

	/**
	 * This constant is used to verify whether the required parameter exists in
	 * the system.
	 * <p>
	 * The required parameter does not exist in the system.
	 * <p>
	 * value = {@value}
	 */
	public static final int PARAMETER_DOES_NOT_EXIST_IN_THE_SYSTEM = 1563;

	/**
	 * The group name is mandatory.
	 * <p>
	 * value = {@value}
	 */

	public static final int PARAMETER_GROUP_NAME_MANDATORY = 1603;

	/**
	 * The group name must be 1-100 characters.
	 * <p>
	 * value = {@value}
	 */

	public static final int PARAMETER_GROUP_NAME_TYPE = 1602;

	/**
	 * The parameter is invalid.
	 * <p>
	 * value = {@value}
	 */

	public static final int PARAMETER_INVALID = 1604;

	/**
	 * The module name must be one of LMS NG Modules - AWB, Customs, Flights,
	 * Participants, Rating, Reservations, Routing, Space, ULD Control,
	 * Utilities and Warehouse.
	 * <p>
	 * value = {@value}
	 */

	public static final int PARAMETER_MODULE_DOES_NOT_EXIST = 1613;

	/**
	 * The module name is mandatory.
	 * <p>
	 * value = {@value}
	 */

	public static final int PARAMETER_MODULE_MANDATORY = 1607;

	/**
	 * The module name must be a valid LMS G module name.
	 * <p>
	 * value = {@value}
	 */

	public static final int PARAMETER_MODULE_TYPE = 1611;

	/**
	 * The parameter name does not exist in the system.
	 * <p>
	 * value = {@value}
	 */

	public static final int PARAMETER_NAME_DOES_NOT_EXIST_IN_THE_SYSTEM = 1615;

	/**
	 * The parameter name is mandatory.
	 * <p>
	 * value = {@value}
	 */

	public static final int PARAMETER_NAME_MANDATORY = 1601;

	/**
	 * The parameter name must be 6-100 characters.
	 * <p>
	 * value = {@value}
	 */

	public static final int PARAMETER_NAME_TYPE = 1600;

	/**
	 * The Validation Rules are mandatory.
	 * <p>
	 * value = {@value}
	 */

	public static final int PARAMETER_VALIDATION_EXPRESSION_MANDATORY = 1608;

	/**
	 * The validation rules must be a regular expression.
	 * <p>
	 * value = {@value}
	 */

	public static final int PARAMETER_VALIDATION_EXPRESSION_TYPE = 1612;

	/**
	 * This constant is used to verify whether the parameter value matches the
	 * validation expression.
	 * <p>
	 * The parameter value does not match the validation expression.
	 * <p>
	 * value = {@value}
	 */
	public static final int PARAMETER_VALUE_DOES_NOT_MATCH_VALIDATION_EXPRESSION = 1561;

	/**
	 * The parameter value is mandatory.
	 * <p>
	 * value = {@value}
	 */

	public static final int PARAMETER_VALUE_MANDATORY = 1606;

	/**
	 * The parameter must be 1-1000 alphanumeric characters or a Yes or No
	 * value.
	 * <p>
	 * value = {@value}
	 */

	public static final int PARAMETER_VALUE_TYPE = 1610;

	/**
	 * This constant is used to indicate whether the parameter is updated
	 * successfully.
	 * <p>
	 * value = {@value}
	 */
	public static final int PARAMETER_VALUE_UPDATED_SUCCESSFULLY = 1564;

	/**
	 * This constant is used to specify whether postal code exists.
	 * <p>
	 * Postal Code does not exist in the system.
	 * <p>
	 * value = {@value}
	 */
	public static final int POSTAL_CODE_DOES_NOT_EXIST = 163;

	/**
	 * This constant is used to verify the postal code with data base.
	 * <p>
	 * The postal code does not exist.
	 * <p>
	 * value = {@value}
	 */
	public static final int POSTALCODE_CODE_DOES_NOT_EXIST = 1449;

	/**
	 * This constant is used to verify the postal code.
	 * <p>
	 * The postal code is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int POSTALCODE_CODE_INVALID = 1432;

	/**
	 * This constant is used to verify the postal code is provided or not.
	 * <p>
	 * The postal code is required.
	 * <p>
	 * value = {@value}
	 */
	public static final int POSTALCODE_CODE_REQUIRED = 1431;

	/**
	 * This constant is used to verify the country code.
	 * <p>
	 * The country code is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int POSTALCODE_COUNTRY_CODE_INVALID = 1436;

	/**
	 * This constant is used to verify the country code.
	 * <p>
	 * The country code is required.
	 * <p>
	 * value = {@value}
	 */
	public static final int POSTALCODE_COUNTRY_CODE_REQUIRED = 1435;

	/**
	 * This constant is used to verify the country code with data base.
	 * <p>
	 * The country code does not exist.
	 * <p>
	 * value = {@value}
	 */
	public static final int POSTALCODE_COUNTRY_DOES_NOT_EXIST = 1451;

	/**
	 * This constant is used to verify whether Postal code create operation is
	 * successful.
	 * <p>
	 * value = {@value}
	 */
	public static final int POSTALCODE_CREATED_SUCCESSFULLY = 1456;

	/**
	 * This constant is used to verify the delivery time.
	 * <p>
	 * The delivery time is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int POSTALCODE_DELIVERY_TIME_INVALID = 1444;

	/**
	 * This constant is used to verify the delivery time.
	 * <p>
	 * The delivery time is required.
	 * <p>
	 * value = {@value}
	 */
	public static final int POSTALCODE_DELIVERY_TIME_REQUIRED = 1443;

	/**
	 * This constant is used to verify the driving distance.
	 * <p>
	 * The driving distance is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int POSTALCODE_DRIVING_DISTANCE_INVALID = 1440;

	/**
	 * This constant is used to verify the driving distance.
	 * <p>
	 * The driving distance is required.
	 * <p>
	 * value = {@value}
	 */
	public static final int POSTALCODE_DRIVING_DISTANCE_REQUIRED = 1439;

	/**
	 * This constant is used to verify whether the duplicate postal code exists.
	 * <p>
	 * Duplicate postal code information.
	 * <p>
	 * value = {@value}
	 */
	public static final int POSTALCODE_DUPLICATE_CODE = 1452;

	/**
	 * This constant is used to verify the station entry.
	 * <p>
	 * Duplicate station entity.
	 * <p>
	 * value = {@value}
	 */
	public static final int POSTALCODE_DUPLICATE_STATION = 1454;

	/**
	 * This constant is used to verify the express operator account number.
	 * <p>
	 * The express operator account number is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int POSTALCODE_EXPRESS_OPERATOR_ACCOUNT_NUMBER_INVALID = 1446;

	/**
	 * This constant is used to verify whether the object instance is valid.
	 * <p>
	 * The postal code object instance is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int POSTALCODE_INVALID_OBJECT_INSTANCE = 1455;

	/**
	 * This constant is used to verify the normal operator account number.
	 * <p>
	 * The normal operator account number is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int POSTALCODE_NORMAL_OPERATOR_ACCOUNT_NUMBER_INVALID = 1445;

	/**
	 * This constant is used to verify the pick up time.
	 * <p>
	 * The pick up time is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int POSTALCODE_PICKUP_TIME_INVALID = 1442;

	/**
	 * This constant is used to verify the pick up time.
	 * <p>
	 * The pick up time is required.
	 * <p>
	 * value = {@value}
	 */
	public static final int POSTALCODE_PICKUP_TIME_REQUIRED = 1441;

	/**
	 * This constant is used to verify the standard day offset.
	 * <p>
	 * The standard day offset is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int POSTALCODE_STANDARD_DAY_OFFSET_INVALID = 1448;

	/**
	 * This constant is used to verify the station code.
	 * <p>
	 * The station is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int POSTALCODE_STATION_CODE_INVALID = 1434;

	/**
	 * This constant is used to verify the station.
	 * <p>
	 * The station is required.
	 * <p>
	 * value = {@value}
	 */
	public static final int POSTALCODE_STATION_CODE_REQUIRED = 1433;

	/**
	 * This constant is used to verify whether the station belong to the
	 * inputted country code.
	 * <p>
	 * The station doesn't belong to the inputted country code.
	 * <p>
	 * value = {@value}
	 */
	public static final int POSTALCODE_STATION_DOES_NOT_BELONG_TO_THE_COUNTRY = 1462;

	/* ====================================== */
	/* UC240 Maintain ULD Configuration List */
	/* ====================================== */

	/**
	 * This constant is used to verify the station information.
	 * <p>
	 * The station not exist.
	 * <p>
	 * value = {@value}
	 */
	public static final int POSTALCODE_STATION_DOES_NOT_EXIST = 1450;

	/**
	 * This constant is used to verify the Station is airport or not.
	 * <p>
	 * The station is not an airport.
	 * <p>
	 * value = {@value}
	 */
	public static final int POSTALCODE_STATION_MUST_BE_AIRPORT = 1453;

	/**
	 * This constant is used to verify the time definite day offset.
	 * <p>
	 * The time definite day offset is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int POSTALCODE_TIME_DEFINITE_DAY_OFFSET_INVALID = 1447;

	/**
	 * This constant is used to verify whether the Postal code update operation
	 * is successful.
	 * <p>
	 * value = {@value}
	 */
	public static final int POSTALCODE_UPDATED_SUCCESSFULLY = 1457;

	/**
	 * This constant is used to verify the zone.
	 * <p>
	 * The zone is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int POSTALCODE_ZONE_INVALID = 1438;

	/**
	 * This constant is used to verify the zone.
	 * <p>
	 * The zone is required.
	 * <p>
	 * value = {@value}
	 */
	public static final int POSTALCODE_ZONE_REQUIRED = 1437;

	/**
	 * This constant is used to verify whether Postal code delete operation is
	 * successful.
	 * <p>
	 * value = {@value}
	 */
	public static final int POSTALCODEDETAIL_DELETED_SUCCESSFULLY = 1458;

	/**
	 * This constant is used to verify whether the postalCodeDetail which is not
	 * selected by user is sent as input.
	 * <p>
	 * The postalCodeDetail which is not selected by user is sent as input.
	 * <p>
	 * value = {@value}
	 */
	public static final int POSTALCODEDETAIL_NOT_SELECTED_BY_THE_USER = 1461;

	/**
	 * This constant is used to verify whether the postal code entity already
	 * exists.
	 * <p>
	 * The postal code entity already exists.
	 * <p>
	 * value = {@value}
	 */
	public static final int POSTALCODESERVICE_ENTITY_ALREADY_EXIST = 1459;

	/**
	 * This constant is used to verify whether the postal code object exists.
	 * <p>
	 * The postal code object does not exist.
	 * <p>
	 * value = {@value}
	 */
	public static final int POSTALCODESERVICE_OBJECT_DOES_NOT_EXIST = 1460;

	/**
	 * This constant is used to specify that the given user does not have any
	 * associated user preference information does not exist.
	 */
	public static final int PREFERENCES_DETAILS_NOT_FOUND_FOR_USR = 5001;

	/**
	 * This constant is used to specify that the given user does not have any
	 * associated user preference information does not exist,so the default
	 * group preferences is selected.
	 */
	public static final int PREFERENCES_DETAILS_OF_GROUP_SELECTED = 5005;

	/**
	 * This constant is used to specify that the given user does not have any
	 * associated user preference information does not existand no group
	 * preferences exists as well. So selecting the global default preferences.
	 */
	public static final int PREFERENCES_DETAILS_OF_GLOBAL_DEFAULT_SELECTED = 5009;

	/**
	 * This constant is used to specify that the given preferences function does
	 * not exist. does not exist.
	 */
	public static final int PREFERENCES_FUNCTION_NOT_FOUND = 5000;

	/**
	 * This constant is used to specify that an empty preferences list has been
	 * send to creation. does not exist.
	 */
	public static final int PREFERENCES_INFO_EMPTY = 5004;

	/**
	 * This constant is used to specify that an empty preferences list has been
	 * send to creation. does not exist.
	 */
	public static final int PREFERENCES_NOT_FOUND_FOR_PROFILE = 5008;

	/**
	 * This constant is used to specify that an empty preferences list has been
	 * send to creation. does not exist.
	 */
	public static final int PREFERENCES_NOT_SELECTED_FOR_USER = 5007;

	/**
	 * This constant is used to specify that the Preference information has been
	 * created successfully. does not exist.
	 */

	public static final int PREFERNCES_CREATED_SUCESSFULLY = 5002;

	/**
	 * This constant is used to specify that the Preference information has been
	 * updated successfully. does not exist.
	 */
	public static final int PREFERNCES_UPDATED_SUCESSFULLY = 5003;

	public static final int PREFERNCES_UPDATED_RETIREVE_AGAIN = 5006;
	/**
	 * This constant is used to verify whether the product code has been
	 * modified during update operation.
	 * <p>
	 * Product code cannot be updated.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_CANNOT_BE_UPDATED = 213;

	/**
	 * This constant is used to verify whether Product code is already present.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_CODE_ALREADY_EXIST = 536;

	/**
	 * This constant is used to verify the product code instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_CODE_DOES_NOT_EXIST = 516;

	/**
	 * This constant is used to specify that the create operation is successful.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_CREATE_SUCCESSFUL = 208;

	/**
	 * This constant is used to specify that the delete operation is successful.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_DELETE_SUCCESSFUL = 209;

	/**
	 * This constant is used to verify if the other charge code exist in the
	 * system.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_INCORRECT_OTHERCHARGECODES = 194;

	/**
	 * This constant is used to verify if the special handling codes exist.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_INCORRECT_SPLCODES = 180;

	/**
	 * This constant is used to verify if the instance of alliance code object
	 * is valid.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_INVALID_ALLIANCECODE_OBJECT_INSTANCE = 173;

	/**
	 * This constant is used to verify if the instance of connection time
	 * difference object is valid.
	 * <p>
	 * Connection Offset time difference must be a numeric up to Four digits
	 * with a decimal point allowed.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_INVALID_CONNECTIONTIMEDIFFERENCE_OBJECT_INSTANCE = 185;

	/**
	 * This constant is used to verify if the instance of connection time
	 * difference object is valid.
	 * <p>
	 * The Connection Offset must contain only two digits after the decimal
	 * point.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_INVALID_CONNECTIONTIMEDIFFERENCEDECIMALPOINT_OBJECT_INSTANCE = 184;

	/**
	 * This constant is used to verify if the connection time difference exceeds
	 * maximum value.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_INVALID_CONNECTIONTIMEDIFFERENCEEXCEEDSLIMIT_OBJECT_INSTANCE = 193;

	/**
	 * This constant is used to verify if the instance of description object is
	 * valid.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_INVALID_DESCRIPTION_OBJECT_INSTANCE = 174;

	/**
	 * This constant is used to verify if the description is entered for product
	 * code.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_INVALID_DESCRIPTIONREQUIRED_OBJECT_INSTANCE = 197;

	/**
	 * This constant is used to verify if the instance of drop-off offset is
	 * valid.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_INVALID_DROPOFFOFFSET_OBJECT_INSTANCE = 171;

	/**
	 * This constant is used to verify if the instance of drop-off offset object
	 * is valid.
	 * <p>
	 * The Drop-off Offset must contain only two digits after the decimal point.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_INVALID_DROPOFFOFFSETDECIMALPOINT_OBJECT_INSTANCE = 182;

	/**
	 * This constant is used to verify if the drop-off offset exceeds maximum
	 * value.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_INVALID_DROPOFFOFFSETEXCEEDSLIMIT_OBJECT_INSTANCE = 191;

	/**
	 * This constant is used to verify if the due hour and due text is present
	 * in the request.
	 * <p>
	 * A Product Code should not have both Due Hours and Due Text.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_INVALID_DUEHOURANDTEXT_OBJECT_INSTANCE = 190;

	/**
	 * This constant is used to verify if the instance of due hours object is
	 * valid.
	 * <p>
	 * The Due Hours must be Numeric of range 1-999.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_INVALID_DUEHOURS_OBJECT_INSTANCE = 179;

	/**
	 * This constant is used to verify if the instance of due text object is
	 * alphabetic.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_INVALID_DUETEXT_OBJECT_INSTANCE = 181;

	/**
	 * This constant is used to verify if the incoming service code is unique.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_INVALID_INCOMING_SERVICECODE = 189;

	/**
	 * This constant is used to verify if the instance of incoming service code
	 * object is alphabetic.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_INVALID_INCOMINGSERVICECODE_OBJECT_INSTANCE = 175;

	/**
	 * This constant is used to verify the instance of latest acceptance time
	 * object is valid.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_INVALID_LATESTACCEPTANCETIME_OBJECT_INSTANCE = 206;

	/**
	 * This constant is used to verify if the instance of product code object is
	 * valid.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_INVALID_OBJECT_INSTANCE = 198;

	/**
	 * This constant is used to verify if the instance of product code OID
	 * object is valid.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_INVALID_OID_OBJECT_INSTANCE = 199;

	/**
	 * This constant is used to verify the instance of other charge code is 2
	 * character alphabetic.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_INVALID_OTHERCHARGECODE_OBJECT_INSTANCE = 211;

	/**
	 * This constant is used to verify if the other charge code is unique.
	 * <p>
	 * The Other Charges Codes for a Product Code must be unique.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_INVALID_OTHERCHARGEUNIQUE_OBJECT_INSTANCE = 187;

	/**
	 * This constant is used to verify if the instance of outgoing service code
	 * object is alphabetic.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_INVALID_OUTGOINGSERVICECODE_OBJECT_INSTANCE = 176;

	/**
	 * This constant is used to verify if the instance of product code object is
	 * 3 characters alphanumeric.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_INVALID_PRODUCTCODE_OBJECT_INSTANCE = 201;

	/**
	 * This constant is used to verify if the instance of product code object is
	 * available in the request.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_INVALID_PRODUCTCODEREQUIRED_OBJECT_INSTANCE = 200;

	/**
	 * This constant is used to verify if the instance of queue reason code
	 * object is valid.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_INVALID_QUEUEREASONCODE_OBJECT_INSTANCE = 178;

	/**
	 * This constant is used to verify the instance of rate type object is
	 * valid.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_INVALID_RATETYPECODE_OBJECT_INSTANCE = 203;

	/**
	 * This constant is used to verify if the instance of recovery time
	 * difference object is valid.
	 * <p>
	 * Drop-off offset time difference must be a numeric up to Four digits with
	 * a decimal point allowed.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_INVALID_RECOVERYTIMEDIFFERENCE_OBJECT_INSTANCE = 172;

	/**
	 * This constant is used to verify if the instance of recovery time
	 * difference object is valid.
	 * <p>
	 * The Recovery Offset must contain only two digits after the decimal point.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_INVALID_RECOVERYTIMEDIFFERENCEDECIMALPOINT_OBJECT_INSTANCE = 183;

	/**
	 * This constant is used to verify if the recovery time difference exceeds
	 * maximum value.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_INVALID_RECOVERYTIMEDIFFERENCEEXCEEDSLIMIT_OBJECT_INSTANCE = 192;

	/**
	 * This constant is used to verify if the instance of service level code
	 * object is valid.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_INVALID_SERVICELEVEL_OBJECT_INSTANCE = 204;

	/**
	 * This constant is used to verify if the small package express code present
	 * in the request is duplicate.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_INVALID_SMALLEXPRESSCODE = 188;

	/**
	 * This constant is used to verify if the instance of small package express
	 * object is valid.
	 * <p>
	 * The Small Package Express Indicator must be P, X or L.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_INVALID_SMALLPACKAGEEXPRESS_OBJECT_INSTANCE = 177;

	/**
	 * This constant is used to verify if the instance of special handling code
	 * object is 3 characters alpha.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_INVALID_SPLCODE_OBJECT_INSTANCE = 202;

	/**
	 * This constant is used to verify if the special handling codes is unique.
	 * <p>
	 * The Special Handling Codes for a Product Code must be unique.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_INVALID_SPLCODEUNIQUE_OBJECT_INSTANCE = 186;

	/**
	 * This constant is used to verify the instance of time definite object is
	 * valid.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_INVALID_TIMEDEFINITE_OBJECT_INSTANCE = 205;

	/**
	 * This constant is used to verify the instance of time definite type is
	 * valid.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_INVALID_TIMEDEFINITETYPE_OBJECT_INSTANCE = 207;

	/**
	 * This constant is used to specify that the update operation is successful.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCT_UPDATE_SUCCESSFUL = 210;

	/**
	 * This constant is used to verify whether the product code entity already
	 * exists.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCTCODESERVICE_ENTITY_ALREADY_EXIST = 195;

	/**
	 * This constant is used to verify whether the product code object exists.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PRODUCTCODESERVICE_OBJECT_DOES_NOT_EXIST = 212;

	/**
	 * This constant is used to find the publication currency. Failed because of
	 * invalid publication currency.
	 * <p>
	 * Value = {@value}
	 */
	public static final int PUBLICATION_CURRENCY_DOES_NOT_EXIST = 242;

	/**
	 * The Queue Indicator is mandatory.
	 */
	public static final int QUEUE_INDICATOR_MANDATORY = 1524;

	/**
	 * This constant is used to verify whether the queue type is restricted or
	 * not.
	 * <p>
	 * value = {@value}
	 * <p>
	 * Queue is restricted for operation.<br>
	 */
	public static final int QUEUE_IS_RESTRICTED = 1311;

	/**
	 * This constant is used to verify whether the Queue Name is entered.
	 * <p>
	 * value = {@value}
	 * <p>
	 * The Queue Name is mandatory.<br>
	 */
	public static final int QUEUENAME_MANDATORY_OBJECT_INSTANCE = 1292;

	/**
	 * This constant is used to verify whether the Queue Office is entered.
	 * <p>
	 * value = {@value}
	 * <p>
	 * The Queue Office is mandatory.<br>
	 */
	public static final int QUEUEOFFICE_MANDATORY_OBJECT_INSTANCE = 1291;

	/**
	 * This constant is used to verify the quick ramp transfer.
	 * <p>
	 * Value = {@value}
	 */
	public static final int QUICK_RAMP_TRANSFER_DOES_NOT_EXIST = 531;

	/**
	 * The Rate Construction Area is already marked for deletion.
	 */
	public static final int RCA_ALREADY_DELETED = 1722;

	/**
	 * The Rate Construction Area already exists in the system.
	 */
	public static final int RCA_ALREADY_EXISTS = 1707;

	/**
	 * Area is mandatory if no members are Included.
	 */
	public static final int RCA_AREA_MANDATORY_IF_NO_INCLUSION = 1724;

	/**
	 * At least one Inclusion/Exclusion is mandatory.
	 */
	public static final int RCA_ATLEAST_ONE_INCL_EXCL_MANDATORY = 1705;

	/**
	 * Area invalid for Rate Construction Area code.
	 */
	public static final int RCA_BASE_NOT_WITHIN_RCA_CODE = 1723;

	/**
	 * The Rate Construction Area Code is mandatory.
	 */
	public static final int RCA_CODE_MANDATORY = 1702;

	/**
	 * The Rate Construction Area Code must be 3 numeric characters.
	 */
	public static final int RCA_CODE_THREE_CHAR_NUMERIC = 1703;

	/**
	 * The rate construction area is created.
	 */
	public static final int RCA_CREATED = 1718;

	/**
	 * The rate construction area that is marked for deletion must not be
	 * updated.
	 */
	public static final int RCA_DELETED_CANT_UPDATE = 1709;

	/**
	 * The Rate Construction Area Deletion Date must not precede current date.
	 */
	public static final int RCA_DELETION_DATE_GREATER_THAN_CURRENT_DATE = 1711;

	/**
	 * The Rate Construction Area Deletion Date is mandatory for delete action.
	 */
	public static final int RCA_DELETION_DATE_MANDATORY_FOR_DELETE = 1704;

	/**
	 * The Rate Construction Area Code does not exist in the system.
	 */
	public static final int RCA_DOES_NOT_EXIST = 1706;

	/**
	 * Duplicate Inclusion/Exclusion data item entry is not allowed.
	 */
	public static final int RCA_DUPLICATE_INCLUSION_EXCLUSION = 1712;

	/**
	 * Exclusions must be lower in hierarchy than Inclusions.
	 */
	public static final int RCA_EXCLUSION_LOWER_TO_INCLUSION = 1716;

	/**
	 * Exclusion within a previously specified Exclusion.
	 */
	public static final int RCA_EXCLUSION_WITHIN_EXCLUSION = 1715;

	/*
	 * =========================================================================
	 * =
	 * 
	 * Start of Maintain RCA Information
	 * ========================================
	 * ==================================
	 */
	/**
	 * Inclusion/Exclusion is not within IATA Area.
	 */
	public static final int RCA_INCL_EXCL_NOT_WITHIN_IATA = 1701;

	/*
	 * =========================================================================
	 * = =======
	 */
	/*
	 * End of UC022 OtherChargeCode and UC244 OtherChargeSubCode Constants 761
	 */
	/* to 830 */
	/*
	 * =========================================================================
	 * = =======
	 */
	/*
	 * =========================================================================
	 * = =======
	 */
	/* Start of UC245 Maintain Currency Information */
	/*
	 * =========================================================================
	 * = =======
	 */

	/**
	 * Inclusion within a previously specified Inclusion.
	 */
	public static final int RCA_INCLUSION_WITHIN_INCLUSION = 1714;

	/**
	 * The rate construction area is marked for deletion.
	 */
	public static final int RCA_MARKED_FOR_DELETE = 1717;

	/**
	 * Member code is mandatory.
	 */
	public static final int RCA_MEMBER_CODE_MANDATORY = 1721;

	/**
	 * No Rate Construction Area exists in the system.
	 */
	public static final int RCA_NO_ENTRIES_IN_DB = 1708;

	/**
	 * The restoration must not be done if the rate construction area is not
	 * marked for deletion.
	 */
	public static final int RCA_NOT_DELETED_CANT_RESTORE = 1710;

	/**
	 * The rate construction area is restored.
	 */
	public static final int RCA_RESTORED = 1720;

	/**
	 * This rate construction area information already exists with Rate
	 * Construction Area Code {0}.
	 */
	public static final int RCA_SAME_AS_ANOTHER_RCA = 1713;

	/**
	 * The rate construction area is updated.
	 */
	public static final int RCA_UPDATED = 1719;

	/**
	 * This constant is used to state that queue reached maximum limit.
	 * <p>
	 * value = {@value}
	 * <p>
	 * Queue reached the limit of 9999 and items cannot be queued.<br>
	 */
	public static final int REACHED_MAX_LIMIT = 1313;

	/**
	 * This constant is used to verify the region. Failed because of invalid
	 * region.
	 * <p>
	 * Value = {@value}
	 */
	public static final int REGION_CODE_INVALID_OBJECT_INSTANCE = 705;

	/**
	 * This constant is used to verify the region type. Failed because region
	 * does not exist.
	 * <p>
	 * Value = {@value}
	 */
	public static final int REGION_DOES_NOT_EXIT = 719;

	/**
	 * This constant is used to verify the region type. Failed because of
	 * duplicate region.
	 * <p>
	 * Value = {@value}
	 */
	public static final int REGION_DUPLICATE_NOT_ALLOWED = 720;

	/**
	 * This constant is used to verify the aggregate type. Failed because the
	 * region is already within the aggregate membership.
	 * <p>
	 * Value = {@value}
	 */
	public static final int REGION_WITHIN_AGGREGATE_MEMBERSHIP = 739;

	/**
	 * This constant is used to verify the regions. Failed because the region is
	 * prohibited.
	 * <p>
	 * Value = {@value}
	 */
	public static final int REGIONS_PROHIBITED_OBJECT_INSTANCE = 687;

	/**
	 * This constant is used when rejected message type is not given.
	 * <p>
	 * The Rejected Message Type is mandatory if Message Type is FNA.
	 * <p>
	 * value = {@value}
	 */
	public static final int REJECTED_MESSAGE_TYPE_MANDATORY = 1539;

	/**
	 * This constant is used to specify that the Removal Reason create operation
	 * is successful.<br>
	 */
	public static final int REMOVAL_REASON_CODE_ACK_CREATED = 1233;

	/**
	 * This constant is used to specify that the Removal Reason delete operation
	 * is successful.<br>
	 */
	public static final int REMOVAL_REASON_CODE_ACK_DELETED = 1235;

	/**
	 * This constant is used to specify that the Removal Reason update operation
	 * is successful.<br>
	 */
	public static final int REMOVAL_REASON_CODE_ACK_UPDATED = 1234;

	/**
	 * This constant is used to specify that the The Removal Reason Code cannot
	 * be updated.<br>
	 */
	public static final int REMOVAL_REASON_CODE_CANNOT_BE_UPDATED = 1223;

	/**
	 * This constant is used to specify that the The Description of the Removal
	 * Reason Code must be 1-64 characters alphanumeric.<br>
	 */
	public static final int REMOVAL_REASON_CODE_DESCRIPTION_INVALID = 1228;

	/**
	 * This constant is used to specify that the The Description of the Removal
	 * Reason Code is mandatory.<br>
	 */
	public static final int REMOVAL_REASON_CODE_DESCRIPTION_MANDATORY = 1227;

	/**
	 * This constant is used to specify that the The Removal Reason Code already
	 * exists and duplicates are not allowed.<br>
	 */
	public static final int REMOVAL_REASON_CODE_DUPLICATE_NOT_ALLOWED = 1226;

	/**
	 * This constant is used to specify that the The Removal Reason Code must be
	 * 1-3 characters alphanumeric.<br>
	 */
	public static final int REMOVAL_REASON_CODE_INVALID = 1222;

	/**
	 * This constant is used to specify that the Invalid ObjectID.<br>
	 */
	public static final int REMOVAL_REASON_CODE_INVALID_OID = 1232;

	/**
	 * This constant is used to specify that the Invalid Removal Reason Code
	 * Object Instance.<br>
	 */
	public static final int REMOVAL_REASON_CODE_INVALID_PERSIST_OBJECT = 1230;

	/**
	 * This constant is used to specify that the Invalid Removal Reason Code
	 * request object.<br>
	 */
	public static final int REMOVAL_REASON_CODE_INVALID_REQUEST = 1231;

	/**
	 * This constant is used to specify that the The Removal Reason Code is
	 * mandatory.<br>
	 */
	public static final int REMOVAL_REASON_CODE_MANDATORY = 1221;

	/**
	 * This constant is used to specify that the Removal Reason Code does not
	 * exist.<br>
	 */
	public static final int REMOVAL_REASON_CODE_NO_ENTITY_FOUND = 1236;

	/**
	 * This constant is used to specify that the Only one Removal Reason Code of
	 * type Location Change Code is allowed.<br>
	 */
	public static final int REMOVAL_REASON_CODE_ONLY_ONE_FOR_TYPE_L_ALLOWED = 1225;

	/**
	 * This constant is used to specify that the Only one Removal Reason Code of
	 * type Offload Change Code is allowed.<br>
	 */
	public static final int REMOVAL_REASON_CODE_ONLY_ONE_FOR_TYPE_O_ALLOWED = 1224;

	/**
	 * This constant is used to specify that the The Removal Reason Code Type is
	 * invalid.<br>
	 */
	public static final int REMOVAL_REASON_CODE_TYPE_INVALID = 1229;

	/**
	 * This constant is used to verify the Aircraft Equipment Code. Failed
	 * because of invalid Aircraft Equipment Code.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_AIRCRAFT_EQUIPMENT_CODE_INVALID = 976;

	/**
	 * This constant is used to verify the Aircraft Registration Code. Failed
	 * because of invalid Aircraft Registration Code.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_AIRCRAFT_REGISTRATION_CODE_INVALID = 977;

	/**
	 * This constant is used to verify the aircraft registration code. Failed
	 * because of unavailable aircraft registration code.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_AIRCRAFT_REGISTRATION_CODE_REQUIRED = 1012;

	/**
	 * This constant is used to verify the Aircraft Registration Number. Failed
	 * because of invalid Aircraft Registration Number.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_AIRCRAFT_REGISTRATION_NUMBER_INVALID = 978;

	/**
	 * This constant is used to verify the aircraft registration number. Failed
	 * because of unavailable aircraft registration number.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_AIRCRAFT_REGISTRATION_NUMBER_REQUIRED = 1011;

	/*
	 * =========================================================================
	 * = =======
	 */
	/*
	 * End of UC245 Maintain Currency Information
	 */
	/*
	 * =========================================================================
	 * = =======
	 */

	/**
	 * This constant is used to verify the station Code. Failed because of
	 * invalid station Code.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_CANNOT_CREATE_SAME_STATION = 992;

	/**
	 * This constant is used to verify the carrier Code. Failed because of
	 * invalid carrier code.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_CARRIER_CANNOT_BE_UPDATE = 1006;

	/**
	 * This constant is used to verify the carrier code. Failed because of
	 * invalid carrier code.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_CARRIER_CODE_INVALID = 975;

	/**
	 * This constant is used to verify the restriction code instance. Failed
	 * because unavailable restriction code object.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_CODE_DOES_NOT_EXIST = 1020;

	/**
	 * This constant is used to verify the restriction code object ID. Failed
	 * because invalid restriction code object ID.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_CODE_INVALID_OID = 1021;

	/**
	 * This constant is used to verify the Invalid Counrty code. Failed because
	 * of invalid Invalid Counrty code.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_COUNTRY_CODE_INVALID = 986;

	/**
	 * This constant is used to verify the country code instance. Failed because
	 * unavailable country code.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_COUNTRY_CODENOTEXIST = 1017;

	/**
	 * This constant is used to verify the effective date. Failed because of
	 * invalid effective date.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_CPARAM_EFFECTIVE_DATE_INVALID_ONE = 1010;

	/**
	 * This constant is used to verify the effective date. Failed because of
	 * invalid effective date
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_CPARAM_EFFECTIVE_DATE_INVALID_ZERO = 1001;

	/**
	 * This constant is used to verify the end date. Failed because of invalid
	 * end date
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_CPARAM_END_DATE_INVALID = 1002;

	/**
	 * This constant is used to verify the effective date. Failed because of
	 * invalid effective date
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_CPARAM_START_DATE_INVALID = 1013;

	/**
	 * This constant is used to specify that the create operation is successful.
	 * {0}- Created restriction.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_CREATE_SUCCESSFUL = 1003;

	/**
	 * This constant is used to verify the Days. Failed because of invalid Days.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_DAYS_OF_RESTRICTION_INVALID = 979;

	/**
	 * This constant is used to specify that the delete operation is successful.
	 * {0}- Deleted restriction.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_DELETE_SUCCESSFUL = 1005;

	/**
	 * This constant is used to verify the restriction detail instance. Failed
	 * because unavailable restriction detail object.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_DETAIL_DOES_NOT_EXIST = 1019;

	/**
	 * This constant is used to verify the restriction detail object ID. Failed
	 * because invalid restriction detail object ID..
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_DETAIL_INVALID_OID = 1023;

	/**
	 * This constant is used to verify the display remarks. Failed because of
	 * invalid display remarks.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_DISPLAY_REMARKS_INVALID = 974;

	/**
	 * This constant is used to verify whether restriction is existed in the
	 * system. Failed because restriction is not existed in the system..
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_DOES_NOT_EXIST = 999;

	/**
	 * This constant is used to verify duplicate Counrty Code. Failed because
	 * duplicate Counrty Code found.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_DUPLICATE_COUNTRY_CODE = 995;

	/**
	 * This constant is used to verify duplicate product Code. Failed because
	 * duplicate product Code found.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_DUPLICATE_PRODUCT_CODE = 993;

	/**
	 * This constant is used to verify duplicate record. Failed because
	 * duplicate record found.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_DUPLICATE_RECORD = 989;

	/**
	 * This constant is used to verify duplicate Special handling Code. Failed
	 * because duplicate Special handling Code found.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_DUPLICATE_SPL_CODE = 994;

	/**
	 * This constant is used to verify duplicate station Code. Failed because
	 * duplicate station Code found.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_DUPLICATE_STATION_CODE = 996;

	/**
	 * This constant is used to verify the effective date. Failed because of
	 * invalid effective date.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_EFFECTIVE_DATE_GREATER_THAN_END_DATE = 997;

	/**
	 * This constant is used to verify the Effective date. Failed because of
	 * invalid Effective date.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_EFFECTIVE_DATE_INVALID = 981;

	/**
	 * This constant is used to verify whether effective date is entered. Failed
	 * because effective date is empty.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_EFFECTIVEDATE_REQUIRED = 972;

	/**
	 * This constant is used to verify the End date. Failed because of invalid
	 * End date.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_END_DATE_INVALID = 980;

	/**
	 * This constant is used to verify the Enforcement Indicator. Failed because
	 * of invalid Enforcement Indicator.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_ENFORCEMENT_CODE_INVALID = 982;

	/*
	 * =========================================================================
	 * = =======
	 */
	/*
	 * Start of UC039 Maintain Restriction Information
	 */
	/*
	 * =========================================================================
	 * = =======
	 */
	/**
	 * This constant is used to verify whether enforcement code is entered.
	 * Failed because enforcement code is empty.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_ENFORCEMENTCODE_REQUIRED = 971;

	/**
	 * This constant is used to verify the restriction object ID. Failed because
	 * invalid restriction object ID.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_INVALID_OID = 1022;

	/**
	 * This constant is used to verify the restriction. Failed because of
	 * invalid restriction.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_INVALID_RESTRICTION = 991;

	/**
	 * This constant is used to verify the product code instance. Failed because
	 * unavailable product code.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_PRODUCT_CODE_DOES_NOT_EXIST = 1014;

	/**
	 * This constant is used to verify the Product code. Failed because of
	 * invalid Product code.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_PRODUCT_CODE_INVALID = 984;

	/**
	 * This constant is used to verify the remarks. Failed because of invalid
	 * remarks.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_REMARKS_INVALID = 973;

	/**
	 * This constant is used to verify whether remarks is entered. Failed
	 * because remarks is empty.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_REMARKS_REQUIRED = 990;

	/**
	 * This constant is used to verify whether restriction type is entered.
	 * Failed because restriction type is empty.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_RESTRICTION_TYPE_REQUIRED = 998;

	/**
	 * This constant is used to verify the spl code instance. Failed because
	 * unavailable spl code.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_SPECIALHANDLINGCODE_OBJECT_DOES_NOT_EXIST = 1015;

	/**
	 * This constant is used to verify the Special handling code. Failed because
	 * of invalid Special handling code.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_SPL_CODE_INVALID = 985;

	/**
	 * This constant is used to verify the station Code. Failed because of
	 * invalid station code.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_STATION_CANNOT_BE_UPDATE = 1000;

	/**
	 * This constant is used to verify the Invalid station code. Failed because
	 * of invalid Invalid station code.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_STATION_CODE_INVALID = 987;

	/**
	 * This constant is used to verify the station code instance. Failed because
	 * unavailable station code.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_STATION_DOES_NOT_EXIST = 1016;

	/**
	 * This constant is used to verify the Restriction Type Code. Failed because
	 * of invalid Restriction Type Code.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_TYPE_CODE_INVALID = 983;

	/**
	 * This constant is used to verify the user authorized to do the operation.
	 * Failed because user Unauthorized to do the operation.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_UNAUTHORIZATION_STATION_CODE = 988;

	/**
	 * This constant is used to specify that the update operation is successful.
	 * {0}- Updated restriction.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTION_UPDATE_SUCCESSFUL = 1004;

	/**
	 * This constant is used to verify the restriction instance. Failed because
	 * unavailable restriction information.
	 * <p>
	 * value = {@value}
	 */
	public static final int RESTRICTIONSERVICE_OBJECT_DOES_NOT_EXIST = 1018;

	/**
	 * This constant is used to verify the instance of rounding factor.
	 * <p>
	 * Invalid rounding factor object instance.
	 * <p>
	 * value = {@value}
	 */
	public static final int ROUNDINGFACTOR_INVALID_OBJECT_INSTANCE = 907;

	/**
	 * This constant is used to verify the members. Failed because of invalid
	 * member.
	 * <p>
	 * Value = {@value}
	 */
	public static final int SAME_MEMBER_TYPE = 706;

	/**
	 * The Search Text is mandatory.
	 * <p>
	 * value = {@value}
	 */

	public static final int SEARCHTEXT_IS_MANDATORY = 1616;

	/**
	 * The Search text must be 1 to 5000 characters.
	 * <p>
	 * value = {@value}
	 */

	public static final int SEARCHTEXT_MUST_BE_1_TO_5000_CHARACTERS = 1617;

	/**
	 * This constant is used to specify that the destination station code does
	 * not exist in the system.
	 * <p>
	 * value = {@value}
	 */
	public static final int SHIPMENTDIMENSION_DESTINATION_STATION_DOES_NOT_EXIST = 1270;

	/**
	 * This constant is used to specify that the destination station code is
	 * mandatory.
	 * <p>
	 * value = {@value}
	 */
	public static final int SHIPMENTDIMENSION_DESTINATION_STATION_MANDATORY = 1253;

	/**
	 * This constant is used to specify that dimensional pieces are mandatory.
	 * <p>
	 * value = {@value}
	 */
	public static final int SHIPMENTDIMENSION_DIMENSIONAL_PIECES_MANDATORY = 1257;

	/*
	 * =========================================================================
	 * = =======
	 */
	/*
	 * End of UC039 Maintain Restriction Information
	 */
	/*
	 * =========================================================================
	 * = =======
	 */

	/**
	 * This constant is used to specify that the dimensional unit is mandatory.
	 * <p>
	 * value = {@value}
	 */
	public static final int SHIPMENTDIMENSION_DIMENSIONAL_UOM_MANDATORY = 1261;

	/**
	 * This constant is used to specify that the height is mandatory.
	 * <p>
	 * value = {@value}
	 */

	public static final int SHIPMENTDIMENSION_HEIGHT_MANDATORY = 1258;

	/*
	 * =========================================================================
	 * = =======
	 */
	/*
	 * UC031 Calculate Shipment Dimensions
	 */
	/*
	 * =========================================================================
	 * = =======
	 */
	/**
	 * This constant is used to verify the object instance.
	 * <p>
	 * Failed because of invalid object instance.
	 * <p>
	 * value = {@value}
	 */
	public static final int SHIPMENTDIMENSION_INVALID = 1251;

	/**
	 * This constant is used to specify that the destination station code is
	 * invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int SHIPMENTDIMENSION_INVALID_DESTINATION_STATION = 1263;

	/**
	 * This constant is used to specify that the height is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int SHIPMENTDIMENSION_INVALID_HEIGHT = 1267;

	/**
	 * This constant is used to specify that the length is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int SHIPMENTDIMENSION_INVALID_LENGTH = 1266;

	/**
	 * This constant is used to specify that the origin station code is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int SHIPMENTDIMENSION_INVALID_ORIGIN_STATION = 1262;

	/**
	 * This constant is used to specify that the pieces are invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int SHIPMENTDIMENSION_INVALID_PIECES = 1264;

	/**
	 * This constant is used to specify that total pieces are less than total
	 * dimensional pieces.
	 * <p>
	 * value = {@value}
	 */
	public static final int SHIPMENTDIMENSION_INVALID_TOTAL_DIMENSIONAL_PIECES = 1272;

	/**
	 * This constant is used to specify that the combination of unit of measure
	 * is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int SHIPMENTDIMENSION_INVALID_UOM_COMBINATION = 1271;

	/**
	 * This constant is used to specify that the total weight is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int SHIPMENTDIMENSION_INVALID_WEIGHT = 1265;

	/**
	 * This constant is used to specify that the width is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int SHIPMENTDIMENSION_INVALID_WIDTH = 1268;

	/**
	 * This constant is used to specify that the length is mandatory.
	 * <p>
	 * value = {@value}
	 */
	public static final int SHIPMENTDIMENSION_LENGTH_MANDATORY = 1259;

	/**
	 * This constant is used to specify that the origin station code does not
	 * exist in the system.
	 * <p>
	 * value = {@value}
	 */
	public static final int SHIPMENTDIMENSION_ORIGIN_STATION_DOES_NOT_EXIST = 1269;

	/**
	 * This constant is used to specify that the origin station code is
	 * mandatory.
	 * <p>
	 * value = {@value}
	 */
	public static final int SHIPMENTDIMENSION_ORIGIN_STATION_MANDATORY = 1252;

	/**
	 * This constant is used to specify that total pieces are mandatory.
	 * <p>
	 * value = {@value}
	 */
	public static final int SHIPMENTDIMENSION_TOTAL_PIECES_MANDATORY = 1254;

	/**
	 * This constant is used to specify that total volume is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int SHIPMENTDIMENSION_TOTAL_VOLUME_INVALID = 1274;

	/**
	 * This constant is used to specify that total weight is invalid.
	 * <p>
	 * value = {@value}
	 */
	public static final int SHIPMENTDIMENSION_TOTAL_WEIGHT_INVALID = 1273;

	/**
	 * This constant is used to specify that total weight is mandatory.
	 * <p>
	 * value = {@value}
	 */
	public static final int SHIPMENTDIMENSION_TOTAL_WEIGHT_MANDATORY = 1255;

	/**
	 * This constant is used to specify that the unit of weight is mandatory.
	 * <p>
	 * value = {@value}
	 */
	public static final int SHIPMENTDIMENSION_WEIGHT_UOM_MANDATORY = 1256;

	/**
	 * This constant is used to specify that the width is mandatory.
	 * <p>
	 * value = {@value}
	 */
	public static final int SHIPMENTDIMENSION_WIDTH_MANDATORY = 1260;

	/**
	 * Teletype Address Profile successfully created.
	 */
	public static final int SPECIAL_MESSAGE_OPTION_INVALID = 1520;

	/**
	 * A Special Message Option is required for FHL message.
	 */
	public static final int SPECIAL_MESSAGE_OPTION_MANDATORY_FOR_FHL = 1501;

	/**
	 * This constant is used to verify whether the product code already exists.
	 * <p>
	 * The Special Handling code cannot be deleted, if a product code is
	 * associated with this Special Handling code.
	 * <p>
	 * value = {@value}
	 */
	public static final int SPECIALHANDLINGCODE_PRODUCTCODE_EXISTS = 121;

	/**
	 * This constant is used to verify whether the special handling code entity
	 * already exists.
	 * <p>
	 * value = {@value}
	 */
	public static final int SPECIALHANDLINGCODESERVICE_ENTITY_ALREADY_EXIST = 116;

	/**
	 * This constant is used to verify whether the object exists.
	 * <p>
	 * value = {@value}
	 */
	public static final int SPECIALHANDLINGCODESERVICE_OBJECT_DOES_NOT_EXIST = 117;

	/**
	 * This constant is used to verify whether the special handling code has
	 * been modified during update operation.
	 * <p>
	 * Special handling code is modified during update operation.
	 * <p>
	 * value = {@value}
	 */
	public static final int SPL_CANNOT_BE_UPDATED = 124;

	/**
	 * This constant is used to specify that the create operation is successful.
	 * <p>
	 * value = {@value}
	 */
	public static final int SPL_CREATE_SUCCESSFUL = 118;

	/**
	 * This constant is used to specify that the delete operation is successful.
	 * <p>
	 * value = {@value}
	 */
	public static final int SPL_DELETE_SUCCESSFUL = 119;

	/**
	 * This constant is used to verify the instance of alert group code object.
	 * <p>
	 * value = {@value}
	 */
	public static final int SPL_INVALID_ALERTGROUPCODE = 103;

	/**
	 * This constant is used to verify the instance of dangerous goods code
	 * object.
	 * <p>
	 * value = {@value}
	 */
	public static final int SPL_INVALID_DANGEROUSGOODSCODE = 104;

	/**
	 * This constant is used to verify the instance of object.
	 * <p>
	 * value = {@value}
	 * <p>
	 * Invalid special handling code description object instance.
	 */
	public static final int SPL_INVALID_DESCRIPTION = 105;

	/**
	 * This constant is used to verify the description.
	 * <p>
	 * The Description exceeds maximum value '50'.
	 * <p>
	 * value = {@value}
	 */
	public static final int SPL_INVALID_DESCRIPTIONEXEEDSLIMIT = 115;

	/**
	 * This constant is used to verify the instance of force booking code
	 * object.
	 * <p>
	 * value = {@value}
	 */
	public static final int SPL_INVALID_FORCEDBOOKINGCODE = 106;

	/**
	 * This constant is used to verify the instance of the IATA code object.
	 * <p>
	 * value = {@value}
	 */
	public static final int SPL_INVALID_IATACODE = 107;

	/**
	 * This constant is used to verify the instance of OID object.
	 * <p>
	 * value = {@value}
	 */
	public static final int SPL_INVALID_OID = 108;

	/**
	 * This constant is used to verify the instance of other charge code object.
	 * <p>
	 * value = {@value}
	 */
	public static final int SPL_INVALID_OTHERCHARGECODE = 109;

	/**
	 * This constant is used to verify the instance of queue reason code object.
	 * <p>
	 * value = {@value}
	 */
	public static final int SPL_INVALID_QUEUEREASONCODE = 110;

	/**
	 * This constant is used to verify the instance of rate class code object.
	 * <p>
	 * value = {@value}
	 */
	public static final int SPL_INVALID_RATECLASSCODE = 111;

	/**
	 * This constant is used to verify the instance of sort priority object.
	 * <p>
	 * value = {@value}
	 */
	public static final int SPL_INVALID_SORTPRIORITY = 112;

	/**
	 * This constant is used to verify the instance of special handling code
	 * object.
	 * <p>
	 * value = {@value}
	 */
	public static final int SPL_INVALID_SPLCODE = 113;

	/**
	 * This constant is used to verify the instance of object.
	 * <p>
	 * value = {@value}
	 */
	public static final int SPL_INVALID_SPLOBJECT = 102;

	/**
	 * This constant is used to verify whether the object already exists.
	 * <p>
	 * The special handling code object already exists.
	 * <p>
	 * value = {@value}
	 */
	public static final int SPL_OBJECT_ALREADY_EXIST = 114;

	/**
	 * This constant is used to verify the special handling code.
	 * <p>
	 * Special handling code must be an alphabet whose size must not exceed 3.
	 * <p>
	 * value = {@value}
	 */
	public static final int SPL_SPLCODE_INVALID = 125;

	/**
	 * This constant is used to verify the special handling code.
	 * <p>
	 * The special handling code was not present.
	 * <p>
	 * value = {@value}
	 */
	public static final int SPL_SPLCODE_REQD = 126;

	/**
	 * This constant is used to specify that the update operation is successful.
	 * <p>
	 * value = {@value}
	 */
	public static final int SPL_UPDATE_SUCCESSFUL = 120;

	/**
	 * standard holiday already exist in the system.
	 * <p>
	 * value = {@value}
	 */
	public static final int STANDARD_HOLIDAY_ALREADY_EXISTS = 100034;

	/**
	 * Standard Holiday does not exist in the system.
	 * <p>
	 * value = {@value}
	 */
	public static final int STANDARD_HOLIDAY_DOES_NOT_EXIST = 100036;

	/*
	 * =========================================================================
	 * = =======
	 */
	/*
	 * End of UC019 Maintain Teletype Sending Profile
	 */
	/*
	 * =========================================================================
	 * = =======
	 */

	/*
	 * =========================================================================
	 * = =======
	 */
	/*
	 * Start of UC028 Maintain City Information
	 */
	/*
	 * =========================================================================
	 * = =======
	 */

	/**
	 * State and Province abbreviation must be two to three alphabetic
	 * characters.
	 * <p>
	 * value = {@value}
	 */
	public static final int STATE_PROVINCE_ABBREVIATION_TWO_OR_THREE_CHAR_ALPHABETIC = 1587;

	/**
	 * state and province already exists for the country and duplicates are not
	 * allowed.
	 * <p>
	 * value = {@value}
	 */
	public static final int STATE_PROVINCE_ALREADY_EXIST = 1589;

	/**
	 * State and Province Code is mandatory.
	 * <p>
	 * value = {@value}
	 */
	public static final int STATE_PROVINCE_CODE_MANDATORY = 1583;

	/*
	 * =========================================================================
	 * = ======
	 */
	/* Start of Maintain State and Province Information UC-257 */
	/*
	 * =========================================================================
	 * = ======
	 */
	/**
	 * State and Province Code must be two alphabetic characters.
	 * <p>
	 * value = {@value}
	 */
	public static final int STATE_PROVINCE_CODE_TWO_CHAR_ALPHABETIC = 1581;

	/**
	 * Country Code is mandatory.
	 * <p>
	 * value = {@value}
	 */
	public static final int STATE_PROVINCE_COUNTRY_CODE_MANDATORY = 1582;

	/**
	 * Country Code must be two alphabetic characters.
	 * <p>
	 * value = {@value}
	 */
	public static final int STATE_PROVINCE_COUNTRY_CODE_TWO_CHAR_ALPHABETIC = 1586;

	/**
	 * The state and province already exists for the country and duplicates are
	 * not allowed.
	 * <p>
	 * value = {@value}
	 */
	public static final int STATE_PROVINCE_COUNTRY_COMBINATION_ALREADY_EXIST = 1596;

	/**
	 * country, state and province combination does not exist in the system.
	 * <p>
	 * value = {@value}
	 */
	public static final int STATE_PROVINCE_COUNTRY_COMBINATION_NOT_EXIST = 1588;

	/**
	 * Country does not exist in the system.
	 * <p>
	 * value = {@value}
	 */
	public static final int STATE_PROVINCE_COUNTRY_NOT_EXIST = 1590;

	/**
	 * State and Province created.
	 * <p>
	 * value = {@value}
	 */
	public static final int STATE_PROVINCE_CREATED = 1591;

	/**
	 * State and Province deleted.
	 * <p>
	 * value = {@value}
	 */
	public static final int STATE_PROVINCE_DELETED = 1593;

	/**
	 * Invalid State Province.
	 * <p>
	 * value = {@value}
	 */
	public static final int STATE_PROVINCE_INVALID = 1595;

	/**
	 * Invalid OID.
	 * <p>
	 * value = {@value}
	 */
	public static final int STATE_PROVINCE_INVALID_OID = 1594;

	/**
	 * State and Province Name must be alphabetic characters and no special
	 * characters are allowed.
	 * <p>
	 * value = {@value}
	 */
	public static final int STATE_PROVINCE_NAME_ALPHABETIC = 1584;

	/**
	 * State and Province Name is mandatory.
	 * <p>
	 * value = {@value}
	 */
	public static final int STATE_PROVINCE_NAME_MANDATORY = 1585;

	/**
	 * No state and province exist for Country in the system.
	 * <p>
	 * value = {@value}
	 */
	public static final int STATE_PROVINCE_NOT_EXIST_FOR_COUNTRY = 1597;

	/**
	 * State and Province updated.
	 * <p>
	 * value = {@value}
	 */
	public static final int STATE_PROVINCE_UPDATED = 1592;

	/**
	 * This constant is used when the station entered exists already.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_ALREADY_EXIST = 342;

	/**
	 * This constant is used to verify the notice of arrival automatic
	 * generation code instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_ARRIVAL_AUTO_GENERATION_CODE_INVALID_OBJECT_INSTANCE = 404;

	/**
	 * This constant is used to verify the automatic association booked flight
	 * code instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_AUTOAOSSO_BOOKED_FLIGHT_CODE_INVALID_OBJECT_INSTANCE = 426;

	/**
	 * This constant is used to verify the automatic checkIn all by product code
	 * instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_AUTOCHECK_INALL_PRODUCT_INVALID_OBJECT_INSTANCE = 499;

	/**
	 * This constant is used to verify the instance of object.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_AUTOCHECK_PRODUCT_CODE_INVALID_OBJECT_INSTANCE = 423;

	/**
	 * This constant is used to verify the instance of OID object.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_AUTOCHECK_PRODUCT_CODE_INVALID_OID_OBJECT_INSTANCE = 422;

	/**
	 * This constant is used to verify the automatic checkin by flight arrival
	 * instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_AUTOCHECKIN_BY_FLIGHT_ARRIVAL_MANDATORY_OBJECT_INSTANCE = 505;

	/**
	 * This constant is used to verify the automatic check in by flight arrival
	 * instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_AUTOCHECKIN_FLIGHT_ARRIVAL_INVALID_OBJECT_INSTANCE = 388;

	/**
	 * This constant is used to verify the automatic check in by flight arrival
	 * minutes instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_AUTOCHECKIN_FLIGHT_ARRIVAL_MINUTES_INVALID_OBJECT_INSTANCE = 389;

	/**
	 * This constant is used to verify the automatic check in by flight arrival
	 * instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_AUTOCHECKIN_FLIGHT_ARRIVAL_NO_OPTION_INVALID_OBJECT_INSTANCE = 517;

	/**
	 * This constant is used to verify the automatic check in product code
	 * instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_AUTOCHECKIN_PRODUCT_CODE_MANDATORY_OBJECT_INSTANCE = 501;

	/**
	 * This constant is used to verify the automatic confirmation discrepancy
	 * code instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_AUTOCONFIRM_DISCREPANCY_CODE_INVALID_OBJECT_INSTANCE = 510;

	/**
	 * This constant is used to verify the automatic enter flight final
	 * international instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_AUTOENTER_FLIGHT_FINAL_INTERNATIONAL_INVALID_OBJECT_INSTANCE = 393;

	/**
	 * This constant is used to verify the automatic enter flight final printer
	 * instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_AUTOENTER_FLIGHT_FINAL_PRINTER_INVALID_OBJECT_INSTANCE = 394;

	/**
	 * This constant is used to verify the automatic flight final domestic code
	 * instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_AUTOFLIGHT_FINAL_DOMESTIC_CODE_INVALID_OBJECT_INSTANCE = 395;

	/**
	 * This constant is used to verify the automatic flight final domestic code
	 * instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_AUTOFLIGHT_FINAL_DOMESTIC_CODE_MANDATORY_OBJECT_INSTANCE = 440;

	/**
	 * This constant is used to verify the automatic enter flight final
	 * international code instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_AUTOFLIGHT_FINAL_INTERNATIONAL_CODE_MANDATORY_OBJECT_INSTANCE = 439;

	/**
	 * This constant is used to verify the automatic flight final initiate US
	 * customs flight departure message code instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_AUTOFLIGHT_FINAL_USCUSTOMS_DEPMSG_CODE_MANDATORY_OBJECT_INSTANCE = 441;

	/**
	 * This constant is used to verify the automatic US customs flight departure
	 * message code instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_AUTOUS_CUSTOMS_FLIGHT_DEPMSGCODE_INVALID_OBJECT_INSTANCE = 390;

	/**
	 * This constant is used to verify the awb clears import code value
	 * instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_AWB_CLEARS_IMPCODE_INVALID_OBJECT_INSTANCE = 504;

	/**
	 * This constant is used to verify the carrier code instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_CARRIER_CODE_INVALID_OBJECT_INSTANCE = 495;

	/**
	 * This constant is used to verify the carrier default instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_CARRIER_DEFAULT_ALREADY_EXISTS = 457;

	/**
	 * This constant is used to verify the carrier default instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_CARRIER_DEFAULT_DOES_NOT_EXIST = 456;

	/**
	 * This constant is used to verify the instance of object.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_CARRIER_DEFAULT_INVALID_OBJECT_INSTANCE = 425;

	/*
	 * =========================================================================
	 * = =======
	 */
	/*
	 * End of UC0259 Maintain City Information
	 */
	/*
	 * =========================================================================
	 * = =======
	 */

	/*
	 * =========================================================================
	 * = =======
	 */
	/*
	 * Start of UC237 /*
	 * ========================================================
	 * =========================
	 */

	/**
	 * This constant is used to verify the instance of OID object.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_CARRIER_DEFAULT_INVALID_OID_OBJECT_INSTANCE = 424;

	/**
	 * This constant is used to verify the carrier code instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_CARRIER_DOES_NOT_EXIST = 511;

	/**
	 * This constant is used when the user is trying to retrieve a carrier
	 * default that does not exist.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_CARRIER_EXTENTION_DOES_NOT_EXIST = 444;

	/**
	 * This constant is used to verify the CCD FSU message control code
	 * instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_CCD_FSUMSG_CTRLCODE_INVALID_OBJECT_INSTANCE = 411;

	/**
	 * This constant is used to verify the charge corrective advice instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_CHARGE_CORRECTIVE_INVALID_ADVICE_OBJECT_INSTANCE = 506;

	/**
	 * This constant is used to verify the check in default locations instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_CHECKIN_DEFAULT_LOCATION_DOES_NOT_EXIST = 515;

	/**
	 * This constant is used to verify the checkIn all default location format.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_CHECKIN_DEFAULT_LOCATIONS_INVALID_LOCATIONFORMAT_OBJECT_INSTANCE = 489;

	/**
	 * This constant is used to verify the check in all default locations unit
	 * instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_CHECKIN_DEFAULT_LOCATIONS_INVALID_OBJECT_INSTANCE = 369;

	/**
	 * This constant is used to verify the city code instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_CITY_CODE_INVALID_OBJECT_INSTANCE = 345;

	/**
	 * This constant is used to verify the city code instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_CITY_DOES_NOT_EXIST = 447;

	/*
	 * =========================================================================
	 * = =======
	 */
	/*
	 * End of UC252 -Retrieve Static Data Maintenance History /*
	 * ================
	 * =================================================================
	 */

	/*
	 * =========================================================================
	 * = =======
	 */
	/*
	 * Start of UC243 Maintain Pallet Codes /*
	 * ==================================
	 * ===============================================
	 */

	/**
	 * This constant is used to verify the city code instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_CITY_MANDATORY_OBJECT_INSTANCE = 458;

	/**
	 * This constant is used to verify whether Station code is already present.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_CODE_ALREADY_EXIST = 534;

	/**
	 * This constant is used to verify the station code.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_CODE_CANNOT_BE_UPDATED = 454;

	/**
	 * This constant is used to verify the Station Code.<br>
	 * Failed because the Station Code does not exist.<br>
	 */
	public static final int STATION_CODE_DOES_NOT_EXIST = 1343;

	/**
	 * Station is mandatory for the station holiday list.
	 * <p>
	 * value = {@value}
	 */
	public static final int STATION_CODE_MANDATORY = 100038;

	/**
	 * This constant is used to verify the station code instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_CODE_MANDATORY_OBJECT_INSTANCE = 494;

	/**
	 * Station must be 3 alphabetic characters.
	 * <p>
	 * value = {@value}
	 */
	public static final int STATION_CODE_THREE_CHAR_ALPHABETIC = 100039;

	/**
	 * This constant is used to verify the station control parameter instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_CONTROL_PARAMETER_INVALID_OBJECT_INSTANCE = 502;

	/**
	 * This constant is used to verify the instance of OID object.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_CONTROL_PARAMETER_INVALID_OID_OBJECT_INSTANCE = 503;

	/**
	 * This constant is used to verify the country instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_COUNTRY_CODE_INVALID_OBJECT_INSTANCE = 346;

	/**
	 * This constant is used to verify the country code instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_COUNTRY_DOES_NOT_EXIST = 446;

	/**
	 * This constant is used to verify the country code instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_COUNTRY_MANDATORY_OBJECT_INSTANCE = 1778;

	/**
	 * This constant is used to specify that the create station operation is
	 * successful.
	 * <p>
	 * {0}- Station created.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_CREATE_SUCCESSFUL = 521;

	/**
	 * This constant is used to verify the customs area instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_CUSTOMS_AREA_INVALID_OBJECT_INSTANCE = 396;

	/**
	 * This constant is used to verify the customs automatic port selection code
	 * instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_CUSTOMS_AUTOPORT_SELECTCODE_INVALID_FORMAT_OBJECT_INSTANCE = 498;

	/**
	 * This constant is used to verify the customs automatic port selection code
	 * instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_CUSTOMS_AUTOPORT_SELECTCODE_INVALID_OBJECT_INSTANCE = 397;

	/**
	 * This constant is used to verify the customs automatic port selection code
	 * instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_CUSTOMS_AUTOPORT_SELECTION_CODE_MANDATORY_OBJECT_INSTANCE = 438;

	/*
	 * =========================================================================
	 * = =======
	 */
	/*
	 * End of UC243 Maintain Pallet Codes /*
	 * ====================================
	 * =============================================
	 */

	/*
	 * =========================================================================
	 * = =======
	 */
	/*
	 * UC258 Maintain Airport Information
	 */
	/*
	 * =========================================================================
	 * = =======
	 */

	/**
	 * This constant is used to verify the customs port number instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_CUSTOMS_PORT_NUMBER_INVALID_OBJECT_INSTANCE = 370;

	/**
	 * This constant is used to verify the customs remarks instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_CUSTOMS_REMARKS_INVALID_OBJECT_INSTANCE = 371;

	/**
	 * This constant is used to verify the delay to accounting export days
	 * instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_DELAY_ACCOUNTING_EXPDAYS_INVALID_OBJECT_INSTANCE = 398;

	/**
	 * This constant is used to verify the delay to accounting import days
	 * instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_DELAY_ACCOUNTING_IMPDAYS_INVALID_OBJECT_INSTANCE = 399;

	/**
	 * This constant is used to verify the delivery account express cargo
	 * instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_DELIVERY_ACCEXP_CARGO_INVALID_OBJECT_INSTANCE = 372;

	/**
	 * This constant is used to verify the delivery account normal cargo
	 * instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_DELIVERY_ACCNOR_CARGO_INVALID_OBJECT_INSTANCE = 373;

	/**
	 * This constant is used to verify the delivery hours instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_DELIVERY_OPERATOR_CLOSED_OBJECT_INSTANCE = 460;

	/**
	 * This constant is used to verify the DEP FSU message control code
	 * instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_DEPFSU_MSGCTRL_CODE_INVALID_OBJECT_INSTANCE = 412;

	/**
	 * This constant is used to verify the discrepancy control station code
	 * instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_DISCREPANCY_CTRL_STATION_INVALID_OBJECT_INSTANCE = 400;

	/**
	 * This constant is used to verify the discepancy control station instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_DISCREPANCY_STATION_DOES_NOT_EXIST = 481;

	/**
	 * This constant is used to verify the DIS FSU message control code
	 * instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_DISFSU_MSGCTRL_CODE_INVALID_OBJECT_INSTANCE = 413;

	/**
	 * This constant is used to verify the DLV FSU message control code
	 * instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_DLVFSU_MSGCTRL_CODE_INVALID_OBJECT_INSTANCE = 414;

	/**
	 * This constant is used when the user is trying to retrieve a station that
	 * does not exist.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_DOES_NOT_EXIST = 341;

	/**
	 * This constant is used to verify the driving time to airport instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_DRIVING_TIMETO_AIRPORT_EXCEED_MAX_OBJECT_INSTANCE = 462;

	/**
	 * This constant is used to verify the driving time to airport instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_DRIVING_TIMETO_AIRPORT_INVALID_OBJECT_INSTANCE = 374;

	/**
	 * This constant is used to verify the dropoff time documents instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_DROPOFF_DOCUMENTS_EXCEED_MAX_OBJECT_INSTANCE = 463;

	/**
	 * This constant is used to verify the dropoff time express instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_DROPOFF_EXPRESS_EXCEED_MAX_OBJECT_INSTANCE = 464;

	/**
	 * This constant is used to verify the dropoff time frame instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_DROPOFF_FRAME_EXCEED_MAX_OBJECT_INSTANCE = 465;

	/**
	 * This constant is used to verify the dropoff time normal instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_DROPOFF_NORMAL_EXCEED_MAX_OBJECT_INSTANCE = 466;

	/**
	 * This constant is used to verify the dropoff time documents instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_DROPOFFTIME_DOCUMENTS_INVALID_OBJECT_INSTANCE = 375;

	/**
	 * This constant is used to verify the dropoff time express instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_DROPOFFTIME_EXPRESS_INVALID_OBJECT_INSTANCE = 376;

	/**
	 * This constant is used to verify dropoff time frame instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_DROPOFFTIME_FRAME_INVALID_OBJECT_INSTANCE = 377;

	/**
	 * This constant is used to verify the dropoff time normal instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_DROPOFFTIME_NORMAL_INVALID_OBJECT_INSTANCE = 378;

	/*
	 * =========================================================================
	 * = =======
	 */
	/*
	 * End of UC258 Maintain Airport Information
	 */
	/*
	 * =========================================================================
	 * = =======
	 */

	/*
	 * =========================================================================
	 * = =======
	 */
	/*
	 * Start of UC082 Maintain Removal Reason Code
	 */
	/*
	 * =========================================================================
	 * = =======
	 */

	/**
	 * This constant is used to verify the host handled by instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_ENTER_HOST_HANDLED_BY_OBJECT_INSTANCE = 474;

	/**
	 * This constant is used to verify the entity type instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_ENTER_TYPE_OBJECT_INSTANCE = 475;

	/**
	 * This constant is used to verify the entity type instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_ENTTTY_TYPE_INVALID_OBJECT_INSTANCE = 473;

	/**
	 * This constant is used to verify the export default locations instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_EXPDEFAULT_LOCATIONS_INVALID_OBJECT_INSTANCE = 402;

	/**
	 * This constant is used to verify the export default locations instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_EXPORT_DEFAULT_LOCATION_DOES_NOT_EXIST = 513;

	/**
	 * This constant is used to verify the export default location format.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_EXPORT_DEFAULT_LOCATIONS_INVALID_LOCATIONFORMAT_OBJECT_INSTANCE = 491;

	/**
	 * This constant is used to verify the export fax number.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_EXPORT_FAX_INVALID_OBJECT_INSTANCE = 349;

	/**
	 * This constant is used to verify the export phone number.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_EXPORT_PHONE_INVALID_OBJECT_INSTANCE = 350;

	/**
	 * This constant is used to verify the export teletype instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_EXPORT_TELETYPE_INVALID_OBJECT_INSTANCE = 347;

	/**
	 * This constant is used to verify the express orsmall package default
	 * location format.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_EXPRESS_DEFAULT_LOCATIONS_INVALID_LOCATIONFORMAT_OBJECT_INSTANCE = 488;

	/**
	 * This constant is used to verify the express default location instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_EXPRESS_DEFAULT_LOCATIONS_INVALID_OBJECT_INSTANCE = 486;

	/**
	 * This constant is used to verify the express delivery hours. Failed since
	 * the express delivery hours is open when the office hours is closed.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_EXPRESS_DELIVERY_OPERATOR_CLOSED = 532;

	/**
	 * This constant is used to verify the express pickup hours instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_EXPRESS_PICKUP_OPERATOR_CLOSED_OBJECT_INSTANCE = 461;

	/**
	 * This constant is used to verify the flight manifest assignment status
	 * code instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_FLIGHT_MANIFEST_ASSIGNSTATUS_CODE_INVALID_OBJECT_INSTANCE = 401;

	/**
	 * This constant is used to verify the flight summary future hours instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_FLIGHT_SUMFUTURE_HOURS_INVALID_OBJECT_INSTANCE = 403;

	/**
	 * This constant is used to verify the handled carrier instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_HANDLED_CARRIER_DOES_NOT_EXIST = 445;

	/*
	 * =========================================================================
	 * = =======
	 */
	/*
	 * Start of UC082 Maintain Removal Reason Code
	 */
	/*
	 * =========================================================================
	 * = =======
	 */

	/**
	 * This constant is used to verify the handled carrier instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_HANDLED_CARRIER_INVALID_FORMAT_OBJECT_INSTANCE = 472;

	/**
	 * This constant is used to verify the instance of object.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_HANDLED_CARRIER_INVALID_OBJECT_INSTANCE = 392;

	/**
	 * This constant is used to verify the instance of OID object.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_HANDLED_CARRIER_INVALID_OID_OBJECT_INSTANCE = 391;

	/**
	 * This constant is used to verify the handled carrier instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_HANDLED_CARRIERS_INVALID_OBJECT_INSTANCE = 500;

	/**
	 * station holiday already exist in the system.
	 * <p>
	 * value = {@value}
	 */
	public static final int STATION_HOLIDAY_ALREADY_EXISTS = 100033;

	/**
	 * This constant is used to verify the holiday close hour instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_HOLIDAY_CLOSE_HOUR_INVALID_OBJECT_INSTANCE = 427;

	/**
	 * Station Holiday does not exist in the system.
	 * <p>
	 * value = {@value}
	 */
	public static final int STATION_HOLIDAY_DOES_NOT_EXIST = 100037;

	/**
	 * This constant is used to verify the holiday open hour instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_HOLIDAY_OPEN_HOUR_INVALID_OBJECT_INSTANCE = 428;

	/**
	 * This constant is used to verify the host handled by instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_HOST_HANDLED_BY_DOES_NOT_EXIST = 496;

	/**
	 * This constant is used to verify the host handled by instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_HOST_HANDLED_BY_INVALID_OBJECT_INSTANCE = 471;

	/**
	 * This constant is used to verify the host handled by instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_HOST_HANDLED_CARRIER_INVALID_OBJECT_INSTANCE = 476;

	/**
	 * This constant is used to verify the host handled by instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_HOST_HANDLED_TERMINAL_OPERATOR_INVALID_OBJECT_INSTANCE = 478;

	/**
	 * This constant is used to verify the host handled by instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_HOST_HANDLED_USCS_INVALID_OBJECT_INSTANCE = 477;

	/**
	 * This constant is used to verify the house airway bill association
	 * enforcement code instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_HWAB_ASSO_ENFORCEMENT_CODE_INVALID_OBJECT_INSTANCE = 435;

	/**
	 * This constant is used to verify the HWAB automatic association code
	 * instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_HWAB_AUTO_ASSO_CODE_INVALID_OBJECT_INSTANCE = 434;

	/**
	 * This constant is used to verify the IATA district code.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_IATA_DISTRICT_INVALID_OBJECT_INSTANCE = 351;

	/**
	 * This constant is used to verify the IATA sub district code.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_IATA_SUB_DISTRICT_INVALID_OBJECT_INSTANCE = 352;

	/**
	 * This constant is used to verify the import default locations instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_IMPORT_DEFAULT_LOCATION_DOES_NOT_EXIST = 514;

	/**
	 * This constant is used to verify the import default location format.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_IMPORT_DEFAULT_LOCATIONS_INVALID_LOCATIONFORMAT_OBJECT_INSTANCE = 490;

	/**
	 * This constant is used to verify the import default locations instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_IMPORT_DEFAULT_LOCATIONS_INVALID_OBJECT_INSTANCE = 379;

	/**
	 * This constant is used to verify the import fax number.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_IMPORT_FAX_INVALID_OBJECT_INSTANCE = 353;

	/**
	 * This constant is used to verify the import phone number.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_IMPORT_PHONE_INVALID_OBJECT_INSTANCE = 354;

	/**
	 * This constant is used to verify the import teletype instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_IMPORT_TELETYPE_INVALID_OBJECT_INSTANCE = 355;

	/**
	 * This constant is used to verify the address.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_INVALID_ADDRESS_OBJECT_INSTANCE = 348;

	/**
	 * This constant is used to verify the next time change.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_INVALID_NEXT_TIME_CHANGE_OBJECT_INSTANCE = 442;

	/*
	 * =========================================================================
	 * = =======
	 */
	/*
	 * End of UC031 Calculate Shipment Dimensions
	 */
	/*
	 * =========================================================================
	 * = =======
	 */

	/*
	 * =========================================================================
	 * = =======
	 */
	/*
	 * UC052 - Retrieve Office Queue Items
	 */
	/*
	 * =========================================================================
	 * = =======
	 */

	/**
	 * This constant is used to verify the instance of object.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_INVALID_OBJECT_INSTANCE = 343;

	/**
	 * This constant is used to verify the instance of OID object.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_INVALID_OID_OBJECT_INSTANCE = 367;

	/**
	 * This constant is used to verify the postal code.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_INVALID_POSTALCODE_OBJECT_INSTANCE = 357;

	/**
	 * This constant is used to verify the station name value.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_INVALID_STATION_NAME_OBJECT_INSTANCE = 361;

	/**
	 * This constant is used to verify the station instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_INVALID_STATION_OBJECT_INSTANCE = 344;

	/**
	 * This constant is used to verify the teletype value.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_INVALID_TELETYPE_OBJECT_INSTANCE = 360;

	/**
	 * This constant is used to verify the MAN FSU message control code
	 * instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_MANFSU_MSGCTRL_CODE_INVALID_OBJECT_INSTANCE = 415;

	/**
	 * This constant is used to verify the automatic check in by flight arrival
	 * instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_NO_AUTOMATIC_CHECK_MECHANISED_STATION_OBJECT_INSTANCE = 485;

	/**
	 * This constant is used to verify the status for non mechanized checkIn
	 * instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_NON_MECHANIZED_CHECKIN_INVALID_OBJECT_INSTANCE = 443;

	/**
	 * This constant is used to verify the instance of object.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_NONQUEUE_REASON_CODE_INVALID_OBJECT_INSTANCE = 420;

	/**
	 * This constant is used to verify the instance of OID object.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_NONQUEUE_REASON_CODE_INVALID_OID_OBJECT_INSTANCE = 419;

	/**
	 * This constant is used to verify the notice of arrival number of copies
	 * instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_NOTICE_ARRIVAL_NOOFCOPIES_INVALID_OBJECT_INSTANCE = 405;

	/**
	 * This constant is used to verify the other office charge queues instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_OFFICE_CHARGE_QUEUES_INVALID_OBJECT_INSTANCE = 380;

	/**
	 * This constant is used to verify the office charges queues instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_OFFICE_CHARGES_QUEUES_MANDATORY_OBJECT_INSTANCE = 497;

	/**
	 * This constant is used to verify the office other charge queues is
	 * prohibited.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_OFFICE_CHARGES_QUEUES_PROHIBITED = 533;

	/**
	 * This constant is used to verify the office hour object.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_OFFICE_HOUR_INVALID_OBJECT_INSTANCE = 453;

	/**
	 * This constant is used to verify the station other charges queues
	 * instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_OTHER_CHARGE_QUEUE_INVALID_OBJECT_INSTANCE = 408;

	/**
	 * This constant is used to verify the other charge queue station instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_OTHER_CHARGE_QUEUE_STATION_DOES_NOT_EXIST = 484;

	/**
	 * This constant is used to verify whether other stations.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_OTHER_SIZE_FIVE_REQUIRED_OBJECT_INSTANCE = 519;

	/**
	 * This constant is used to verify whether other stations.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_OTHER_SIZE_THREE_REQUIRED_OBJECT_INSTANCE = 518;

	/**
	 * This constant is used to verify the express or small package default
	 * locations instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_PACKAGE_DEFAULT_LOCATION_DOES_NOT_EXIST = 512;

	/**
	 * This constant is used to verify the phone number.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_PHONE_INVALID_OBJECT_INSTANCE = 356;

	/**
	 * This constant is used to verify the pickup account express cargo
	 * instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_PICKUP_ACCEXPR_CARGO_INVALID_OBJECT_INSTANCE = 381;

	/**
	 * This constant is used to verify the pickup account normal cargo instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_PICKUP_ACCNOR_CARGO_INVALID_OBJECT_INSTANCE = 382;

	/**
	 * This constant is used to verify the pickup hours instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_PICKUP_OPERATOR_CLOSED_OBJECT_INSTANCE = 459;

	/**
	 * This constant is used to verify the delivery slip instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_PRINT_DELIVERY_SLIP_INVALID_OBJECT_INSTANCE = 507;

	/**
	 * This constant is used to verify the print freight bill instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_PRINT_FREIGHT_BILL_INVALID_OBJECT_INSTANCE = 509;

	/**
	 * This constant is used to verify the PFB credit message instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_PRINT_PFB_CREDITMSG_INVALID_OBJECT_INSTANCE = 508;

	/**
	 * This constant is used to verify the product code instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_PRODUCT_CODE_DOES_NOT_EXIST = 448;

	/**
	 * This constant is used to verify the quick ramp transfer value.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_QUICK_RAMP_TRANSFER_INVALID_OBJECT_INSTANCE = 358;

	/**
	 * This constant is used to verify the rate queue office instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_RATE_QUEUE_OFFICE_INVALID_OBJECT_INSTANCE = 406;

	/*
	 * =========================================================================
	 * = =======
	 */
	/*
	 * End of UC052 - Retrieve Office Queue Items
	 */
	/*
	 * =========================================================================
	 * = =======
	 */

	/**
	 * This constant is used to verify the rate queue office instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_RATE_QUEUE_OFFICE_MANDATORY_OBJECT_INSTANCE = 487;

	/**
	 * This constant is used to verify the rate queue office information.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_RATE_QUEUE_OFFICE_PROHIBITED_OBJECT_INSTANCE = 452;

	/**
	 * This constant is used to verify the restriction control station instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_RATE_QUEUE_STATION_DOES_NOT_EXIST = 483;

	/**
	 * This constant is used to verify the rate queue station instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_RATE_QUEUE_STATION_INVALID_OBJECT_INSTANCE = 407;

	/**
	 * This constant is used to verify the RCF FSU message control code
	 * instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_RCFFSU_MSGCTRL_CODE_INVALID_OBJECT_INSTANCE = 416;

	/**
	 * This constant is used to verify the RCS FSU message control code
	 * instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_RCSFSU_MSGCTRL_CODE_INVALID_OBJECT_INSTANCE = 417;

	/**
	 * This constant is used to verify the RCT FSU message control code
	 * instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_RCTFSU_MSGCTRL_CODE_INVALID_OBJECT_INSTANCE = 418;

	/**
	 * This constant is used to verify the station remarks object.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_REAMRKS_DOES_NOT_EXIST = 530;

	/**
	 * This constant is used to verify the reason code instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_REASON_CODE_DOES_NOT_EXIST = 449;

	/**
	 * This constant is used to verify the reason code not queued instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_REASON_CODE_NOT_QUEUED_INVALID_OBJECT_INSTANCE = 421;

	/**
	 * This constant is used to verify the recovery time documents instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_RECOVERY_DOCUMENTS_EXCEED_MAX_OBJECT_INSTANCE = 467;

	/**
	 * This constant is used to verify the recovery time express instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_RECOVERY_EXPRESS_EXCEED_MAX_OBJECT_INSTANCE = 468;

	/**
	 * This constant is used to verify the recovery time frame instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_RECOVERY_FRAME_EXCEED_MAX_OBJECT_INSTANCE = 469;

	/**
	 * This constant is used to verify the recovery time normal instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_RECOVERY_NORMAL_EXCEED_MAX_OBJECT_INSTANCE = 470;

	/**
	 * This constant is used to verify the recovery time documents instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_RECOVERYTIME_DOCUMENTS_INVALID_OBJECT_INSTANCE = 383;

	/**
	 * This constant is used to verify the recovery time express instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_RECOVERYTIME_EXPRESS_INVALID_OBJECT_INSTANCE = 384;

	/**
	 * This constant is used to verify recovery time frame instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_RECOVERYTIME_FRAME_INVALID_OBJECT_INSTANCE = 385;

	/**
	 * This constant is used to verify the recovery time normal instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_RECOVERYTIME_NORMAL_INVALID_OBJECT_INSTANCE = 386;

	/**
	 * This constant is used to verify the station remarks object.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_REMARKS_INVALID_OBJECT_INSTANCE = 529;

	/**
	 * This constant is used to verify the station remarks object ID.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_REMARKS_INVALID_OID_OBJECT_INSTANCE = 528;

	/**
	 * This constant is used to verify the restriction control station instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_RESTRICTION_CONTROL_STATION_DOES_NOT_EXIST = 482;

	/**
	 * This constant is used to verify the station restrictions control station
	 * instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_RESTRICTIONS_CONTROL_STATION_INVALID_OBJECT_INSTANCE = 409;

	/**
	 * This constant is used to verify the saturday close hour instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_SATURDAY_CLOSE_HOUR_INVALID_OBJECT_INSTANCE = 429;

	/**
	 * This constant is used to verify the saturday open hour instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_SATURDAY_OPEN_HOUR_INVALID_OBJECT_INSTANCE = 430;

	/**
	 * This constant is used to verify the station service.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_SERVICE_INVALID_OBJECT_INSTANCE = 368;

	/**
	 * This constant is used to verify the instance of OID object.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_SERVICE_INVALID_OID_OBJECT_INSTANCE = 367;

	/**
	 * This constant is used to verify the service remarks instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_SERVICE_REMARKS_INVALID_OBJECT_INSTANCE = 387;

	/**
	 * This constant is used to verify the station code instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_SIZE_FIVE_REQUIRED_OBJECT_INSTANCE = 480;

	/**
	 * This constant is used to verify the station code instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_SIZE_THREE_REQUIRED_OBJECT_INSTANCE = 479;

	/**
	 * This constant is used to verify the state value.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_STATE_INVALID_OBJECT_INSTANCE = 359;

	/**
	 * This constant is used to verify the state instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_STATE_MANDATORY_OBJECT_INSTANCE = 436;

	/**
	 * This constant is used to verify the state instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_STATE_PROHIBITED_OBJECT_INSTANCE = 437;

	/**
	 * This constant is used to verify the sunday close hour instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_SUNDAY_CLOSE_HOUR_INVALID_OBJECT_INSTANCE = 431;

	/**
	 * This constant is used to verify the sunday open hour instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_SUNDAY_OPEN_HOUR_INVALID_OBJECT_INSTANCE = 432;

	/**
	 * This constant is used to verify the TCON prefix code instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_TCON_PREFIX_CODE_INVALID_OBJECT_INSTANCE = 410;

	/**
	 * This constant is used to verify the terminal operator value.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_TERMINAL_OPERATOR_INVALID_OBJECT_INSTANCE = 362;

	/**
	 * This constant is used to verify the TFD FSU message control code
	 * instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_TFDFSU_MSGCTRL_CODE_INVALID_OBJECT_INSTANCE = 450;

	/**
	 * This constant is used to verify the time after flight departure minutes
	 * value.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_TIME_AFTER_FLIGHT_DEP_MINUTES_INVALID_OBJECT_INSTANCE = 492;

	/*
	 * =========================================================================
	 * = ======
	 */
	/* End of UC251 Maintain Office Information */
	/*
	 * =========================================================================
	 * = ======
	 */

	/* ==================================================== */
	/* UC008 Terminal Area Location - messages */
	/* ==================================================== */

	/**
	 * This constant is used to verify the time after flight departure
	 * percentage value.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_TIME_AFTER_FLIGHT_DEP_PERCENTAGE_INVALID_OBJECT_INSTANCE = 493;

	/**
	 * This constant is used to verify the TRM FSU message control code
	 * instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_TRMFSU_MSGCTRL_CODE_INVALID_OBJECT_INSTANCE = 451;

	/**
	 * This constant is used to verify the truck fax number.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_TRUCK_FAX_INVALID_OBJECT_INSTANCE = 363;

	/**
	 * This constant is used to verify the truck phone number.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_TRUCK_PHONE_INVALID_OBJECT_INSTANCE = 364;

	/**
	 * This constant is used to verify the truck teletype instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_TRUCK_TELETYPE_INVALID_OBJECT_INSTANCE = 365;

	/**
	 * This constant is used to verify the Station.<br>
	 * Failed because the station cannot be updated.<br>
	 */
	public static final int STATION_UPDATE_INVALID = 1359;

	/**
	 * This constant is used to specify that the update station operation is
	 * successful.
	 * <p>
	 * {0}- Station updated.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_UPDATE_SUCCESSFUL = 522;

	/**
	 * This constant is used to verify the weekday close hour instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_WEEKDAY_CLOSE_HOUR_INVALID_OBJECT_INSTANCE = 433;

	/**
	 * This constant is used to verify the weekday open hour instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATION_WEEKDAY_OPEN_HOUR_INVALID_OBJECT_INSTANCE = 520;

	/**
	 * This constant is used to verify whether the station entity already
	 * exists.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATIONSERVICE_ENTITY_ALREADY_EXIST = 525;

	/**
	 * This constant is used to verify whether the object exists.
	 * <p>
	 * Value = {@value}
	 */
	public static final int STATIONSERVICE_OBJECT_DOES_NOT_EXIST = 526;

	/**
	 * This constant is used to verify the subarea code. Failed because of
	 * invalid subarea code.
	 * <p>
	 * Value = {@value}
	 */
	public static final int SUBAREA_CODE_INVALID_OBJECT_INSTANCE = 689;

	/**
	 * This constant is used to verify the subarea. Failed because subarea does
	 * not exists.
	 * <p>
	 * Value = {@value}
	 */
	public static final int SUBAREA_DOES_NOT_EXIT = 714;

	/**
	 * This constant is used to verify the subarea. Failed because of duplicate
	 * subarea.
	 * <p>
	 * Value = {@value}
	 */
	public static final int SUBAREA_DUPLICATE_NOT_ALLOWED = 715;

	/**
	 * This constant is used to verify the subarea type. Failed because of
	 * invalid subarea.
	 * <p>
	 * Value = {@value}
	 */
	public static final int SUBAREA_WITHIN_AGGREGATE_MEMBERSHIP_AREA = 717;

	/**
	 * This constant is used to verify the subarea. Failed because the subarea
	 * is prohibited.
	 * <p>
	 * Value = {@value}
	 */
	public static final int SUBAREAS_PROHIBITED_OBJECT_INSTANCE = 686;

	/**
	 * This constant is used to verify whether the substitute IATA code is a
	 * host defined special handling code.
	 * <p>
	 * value = {@value}
	 */
	public static final int SUBSTITUTE_IATACODE_HOSTDEFINED = 122;

	/**
	 * This constant is used to specify if tare weight is within the limits of
	 * 'maximum weight' and 'minimum weight' parameters.
	 * <p>
	 * value = {@value}
	 * <p>
	 * Tare Weight must be within the limits of dynamic parameter -
	 * {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#MAXIMUM_WEIGHT
	 * MAXIMUM_WEIGHT} and
	 * {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#MINIMUM_WEIGHT
	 * MINIMUM_WEIGHT}
	 */
	public static final int TARE_WEIGHT_LIMIT_INVALID = 956;

	/**
	 * This constant is used when the terminal details being inputed exists
	 * already in the database.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_ALREADY_EXIST = 581;

	/**
	 * This constant is used when the terminal area entered exists already.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_AREA_ALREADY_EXISTS = 599;

	/* ==================================================== */
	/* End UC008 Terminal Area Location - messages */
	/* ==================================================== */

	/* ==================================================== */
	/* Start UC289 Maintain Customs Status Codes */
	/* ==================================================== */

	/**
	 * This constant is used to verify the terminal area can be deleted or not.
	 * <p>
	 * Failed because any of the terminal location present in the terminal area
	 * is associated with Goods , ULD or TCON.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_AREA_ASSOCIATED_WITH_GOODS_OR_CONTAINERS_CANNOT_BE_DELETED = 1395;

	/**
	 * This constant is used to verify the terminal area can be deleted or not.
	 * <p>
	 * Failed because any of the terminal location present in the terminal area
	 * is associated with work order.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_AREA_ASSOCIATED_WITH_WORKORDER_CANNOT_BE_DELETED = 1398;

	/**
	 * This constant is used to verify the terminal area can be closed or not.
	 * <p>
	 * Failed because work order is associated with any of the terminal location
	 * present in the terminal area.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_AREA_CANNOT_BE_CLOSED = 1396;

	/**
	 * This constant is used when the user is trying to locate a terminal area
	 * that does not exist in the database.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_AREA_CANNOT_BE_FOUND = 615;

	/**
	 * This constant is used to specify if the status change of terminal area is
	 * successful.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_AREA_CLOSE_STATUS_CHANGE_SUCCESSFUL = 621;

	/**
	 * This constant is used to specify if the create operation is successful.
	 * <p>
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_AREA_CREATE_SUCCESSFUL = 617;

	/**
	 * This constant is used to specify if the delete area operation is
	 * successful.
	 * <p>
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_AREA_DELETE_SUCCESSFUL = 618;

	/**
	 * This constant is used to specify the destination terminal area contains
	 * invalid characters.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_AREA_DESTINATION_CONTAINS_INVALID_CHARACTERS = 1381;

	/**
	 * This constant is used to specify the destination terminal area does not
	 * exist.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_AREA_DESTINATION_DOES_NOT_EXIST = 1383;

	/**
	 * This constant is used when the new terminal location name is not inputed.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_AREA_DESTINATION_MANDATORY = 1382;

	/**
	 * This constant is used to verify the terminal location count.
	 * <p>
	 * Failed because of invalid terminal location count object instance.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_AREA_INVALID_LOCATION_COUNT_OBJECT_INSTANCE = 594;

	/**
	 * This constant is used to verify the terminal area name.
	 * <p>
	 * Failed because of invalid terminal area name instance.
	 * <p>
	 * value = {@value}
	 * </p>
	 */
	public static final int TERMINAL_AREA_INVALID_NAME_OBJECT_INSTANCE = 590;

	/**
	 * This constant is used to verify the instance of object.
	 * <p>
	 * Failed because of invalid terminal area object instance.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_AREA_INVALID_OBJECT_INSTANCE = 586;

	/**
	 * This constant is used to verify the instance of OID object.
	 * <p>
	 * Failed because of invalid terminal area OID object instance.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_AREA_INVALID_OID_OBJECT_INSTANCE = 582;

	/**
	 * This constant is used to verify the terminal area type.
	 * <p>
	 * Failed because of invalid terminal area type object instance.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_AREA_INVALID_TYPE_OBJECT_INSTANCE = 593;

	/* ==================================================== */
	/* End UC289 Maintain Customs Status Codes */
	/* ==================================================== */

	/*
	 * =========================================================================
	 * = ======
	 */
	/* Start of UC208 Maintain Postal Codes */
	/*
	 * =========================================================================
	 * = ======
	 */

	/**
	 * This constant is used when the terminal area the user is trying to close
	 * is already in the closed status.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_AREA_IS_ALREADY_CLOSED = 600;

	/**
	 * This constant is used when the user is trying to open a terminal area
	 * that is already closed.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_AREA_IS_ALREADY_OPEN = 601;

	/**
	 * This constant is used to specify the successful change of terminal area
	 * name.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_AREA_NAME_CHANGE_SUCCESSFUL = 1386;

	/**
	 * This constant is used to verify the terminal area name.
	 * <p>
	 * Failed because of unavailable terminal area name object value.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_AREA_NAMEREQUIRED_OBJECT_INSTANCE = 587;

	/**
	 * This constant is used when the terminal area new name already exist in
	 * the station.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_AREA_NEW_NAME_ALREADY_EXISTS = 634;

	/**
	 * This constant is used when the terminal area new name contains invalid
	 * characters.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_AREA_NEW_NAME_CONTAINS_INVALID_CHARACTERS = 632;

	/**
	 * This constant is used when the new terminal area name is not inputed.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_AREA_NEW_NAME_MANDATORY = 633;

	/**
	 * This constant is used to specify if the status change of terminal area is
	 * successful.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_AREA_OPEN_STATUS_CHANGE_SUCCESSFUL = 619;

	/**
	 * This constant is used to specify the destination terminal area is same as
	 * origin terminal area.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_AREA_ORIGIN_DESTINATION_ARE_SAME = 1389;

	/**
	 * This constant is used to specify the successful restriction of terminal
	 * area.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_AREA_RESTRICT_SUCCESSFUL = 1384;

	/**
	 * This constant is used to specify that the create terminal operation is
	 * successful.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_CREATE_SUCCESSFUL = 616;

	/**
	 * This constant is used to verify the terminal name.
	 * <p>
	 * Failed because of invalid terminal name object instance.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_INVALID_NAME_OBJECT_INSTANCE = 596;

	/**
	 * This constant is used to verify the instance of object.
	 * <p>
	 * Failed because of invalid terminal object instance.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_INVALID_OBJECT_INSTANCE = 584;

	/**
	 * This constant is used to verify the instance of OID object.
	 * <p>
	 * Failed because of invalid terminal OID object instance.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_INVALID_OID_OBJECT_INSTANCE = 597;

	/**
	 * This constant is used to verify the station code.
	 * <p>
	 * Failed because of invalid terminal station code object instance.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_INVALID_STATION_CODE_OBJECT_INSTANCE = 592;

	/**
	 * This constant is used to verify the station code.
	 * <p>
	 * Failed because of unavailable station code object value.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_INVALID_STATIONCODEREQUIRED_OBJECT_INSTANCE = 585;

	/**
	 * This constant is used to verify the terminal location can be deleted or
	 * not.
	 * <p>
	 * Failed because terminal location is associated with Goods , ULD or TCON.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_LOCATION_ASSOCIATED_WITH_GOODS_OR_CONTAINERS_CANNOT_BE_DELETED = 1394;

	/**
	 * This constant is used to verify the terminal location can be deleted or
	 * not.
	 * <p>
	 * Failed because terminal location is associated with work order.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_LOCATION_ASSOCIATED_WITH_WORKORDER_CANNOT_BE_DELETED = 1399;

	/**
	 * This constant is used to verify the terminal location can be closed or
	 * not.
	 * <p>
	 * Failed because work order is associated with the terminal location.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_LOCATION_CANNOT_BE_CLOSED = 1397;

	/**
	 * This constant is used when the user is trying to perform operations like
	 * delete, find, close, open for a non existing terminal location.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_LOCATION_CANNOT_BE_FOUND = 610;

	/* ==================================================== */
	/* UC008 Terminal Area Location - TR */
	/* ==================================================== */
	/**
	 * This constant is used when the terminal location cannot be restricted
	 * because the area is closed.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_LOCATION_CANNOT_BE_RESTRICTED = 631;

	/**
	 * This constant is used to specify if the status change of terminal
	 * location is successful.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_LOCATION_CLOSE_STATUS_CHANGE_SUCCESSFUL = 622;

	/**
	 * This constant is used to specify the successful creation of terminal
	 * location.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_LOCATION_CREATE_SUCCESSFUL = 627;

	/**
	 * This constant is used to specify if the delete location operation is
	 * successful.
	 * <p>
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_LOCATION_DELETE_SUCCESSFUL = 623;

	/**
	 * This constant is used when the terminal location the user trying to find,
	 * does not exist.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_LOCATION_DOES_NOT_EXIST = 604;

	/**
	 * This constant is used to check if the size of the location names when
	 * inputed as range is equal on both the sides of the hyphen.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_LOCATION_INCOMPATIBLE_RANGE_OBJECT_INSTANCE = 614;

	/**
	 * This constant is used to specify that the insert location operation is
	 * successful.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_LOCATION_INSERT_SUCCESSFUL = 624;

	/**
	 * This constant is used to verify the terminal location name.
	 * <p>
	 * Failed because of invalid terminal location name instance.
	 * <p>
	 * value = {@value}
	 * </p>
	 */
	public static final int TERMINAL_LOCATION_INVALID_NAME_OBJECT_INSTANCE = 591;

	/**
	 * This constant is used to verify the instance of object.
	 * <p>
	 * Failed because of invalid terminal location object instance.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_LOCATION_INVALID_OBJECT_INSTANCE = 588;

	/**
	 * This constant is used to verify the instance of OID object.
	 * <p>
	 * Failed because of invalid terminal location OID object instance.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_LOCATION_INVALID_OID_OBJECT_INSTANCE = 583;

	/**
	 * This constant is used to verify the terminal location type.
	 * <p>
	 * Failed because of invalid terminal location type object instance.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_LOCATION_INVALID_TYPE_OBJECT_INSTANCE = 595;

	/**
	 * This constant is used when the user tries to change the status of a
	 * particular terminal location to open whose status is already open.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_LOCATION_IS_ALREADY_CLOSED = 603;

	/*
	 * =========================================================================
	 * = ======
	 */
	/* End of UC208 Maintain Postal Codes */
	/*
	 * =========================================================================
	 * = ======
	 */

	/**
	 * This constant is used when the user tries to change the status of a
	 * particular terminal location (whose status is already open ) to open.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_LOCATION_IS_ALREADY_OPEN = 602;

	/**
	 * This constant is used to specify the successful movement of terminal
	 * location.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_LOCATION_MOVEMENT_SUCCESSFUL = 1388;

	/**
	 * This constant is used when the terminal location name cannot be changed
	 * because it has goods/containers associated with it.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_LOCATION_NAME_CANNOT_BE_CHANGED = 640;

	/**
	 * This constant is used to specify the successful change of terminal
	 * location name.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_LOCATION_NAME_CHANGE_SUCCESSFUL = 1387;

	/**
	 * This constant is used when the terminal location name contains invalid
	 * characters.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_LOCATION_NAME_CONTAINS_INVALID_CHARACTERS = 635;

	/**
	 * This constant is used when the terminal location name exceeds nine
	 * characters.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_LOCATION_NAME_INVALID_SIZE = 613;

	/**
	 * This constant is used to verify the terminal location name has hyphen
	 * while being input as name instead or range.
	 * <p>
	 * Failed because the location name had hyphen while being input as name.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_LOCATION_NAME_INVALID_WHEN_INPUT_AS_RANGE = 1400;

	/**
	 * This constant is used to verify the location name maximum range.
	 * <p>
	 * Failed because of invalid location name range.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_LOCATION_NAME_MAX_RANGE = 609;

	/**
	 * This constant is used to verify the terminal location name.
	 * <p>
	 * Failed because of unavailable terminal location name object value.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_LOCATION_NAME_REQUIRED_OBJECT_INSTANCE = 1393;

	/**
	 * This constant is used when the new terminal location name already exist
	 * in the station.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_LOCATION_NEW_NAME_ALREADY_EXISTS = 639;

	/**
	 * This constant is used when the new terminal location name contains
	 * invalid characters.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_LOCATION_NEW_NAME_CONTAINS_INVALID_CHARACTERS = 636;

	/**
	 * This constant is used when the new terminal location name exceeds it's
	 * size.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_LOCATION_NEW_NAME_INVALID_SIZE = 637;

	/**
	 * This constant is used when the new terminal location name is not inputed.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_LOCATION_NEW_NAME_MANDATORY = 638;

	/**
	 * This constant is used to specify if the status change of terminal
	 * location is successful.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_LOCATION_OPEN_STATUS_CHANGE_SUCCESSFUL = 620;

	/**
	 * This constant is used when the user is trying to open a terminal area
	 * that is already closed.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_LOCATION_OTHERTYPE_CANNOT_BE_ADDED = 612;

	/**
	 * This constant is used to specify the location with the type other than
	 * ULD cannot be moved to area which is of type ULD.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_LOCATION_OTHERTYPE_CANNOT_BE_MOVED = 1391;

	/**
	 * This constant is used to specify the successful restriction of terminal
	 * location.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_LOCATION_RESTRICT_SUCCESSFUL = 1385;

	/**
	 * This constant is used when the user is trying to add a location of type
	 * ULD into an area which is not meant for ULD types.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_LOCATION_ULDTYPE_CANNOT_BE_ADDED = 611;

	/**
	 * This constant is used to specify the location with the ULD type cannot be
	 * moved to the area which is not an ULD type.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_LOCATION_ULDTYPE_CANNOT_BE_MOVED = 1390;

	/**
	 * This constant is used to verify the location name 1.
	 * <p>
	 * Failed because of invalid location name 1 object instance.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_LOCATION1_INVALID_NAME_OBJECT_INSTANCE = 606;

	/**
	 * This constant is used to verify the terminal location1 name.
	 * <p>
	 * Failed because of unavailable terminal location1 name object value.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_LOCATION1_NAME_REQUIRED_OBJECT_INSTANCE = 589;

	/**
	 * This constant is used to verify the location name 2.
	 * <p>
	 * Failed because of invalid location name 2 object instance.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_LOCATION2_INVALID_NAME_OBJECT_INSTANCE = 607;

	/**
	 * This constant is used to verify the location name 3.
	 * <p>
	 * Failed because of invalid location name 3 object instance.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_LOCATION3_INVALID_NAME_OBJECT_INSTANCE = 608;

	/**
	 * This constant is used when all the terminal locations entered exists
	 * already.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_LOCATIONS_ALREADY_EXISTS = 598;

	/**
	 * This constant is used when the user is trying to retrieve the terminal
	 * information with a non existing station code.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_STATION_CODE_DOES_NOT_EXIST = 605;

	/**
	 * This constant is used to specify the ULD terminal area for a station must
	 * be unique.
	 * <p>
	 * value = {@value}
	 */
	public static final int TERMINAL_UNIQUE_ULD_TERMINAL_AREA = 1392;

	/**
	 * The start date must be less than the end date.
	 * <p>
	 * value = {@value}
	 */

	public static final int THE_START_DATE_MUST_BE_LESS_THAN_THE_END_DATE = 1618;

	/**
	 * Failed because To currency rounding factor does not exist in the system.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TO_CURRENCY_ROUNDING_FACTOR_DOES_NOT_EXIST = 680;

	/**
	 * The Total Message Limit must be numeric not exceeding 9 digits.
	 */
	public static final int TOTAL_MESSAGE_LIMIT_INVALID = 1495;

	/**
	 * The Total Message Limit is mandatory.
	 */
	public static final int TOTAL_MESSAGE_LIMIT_MANDATORY = 1494;

	/**
	 * This constant is used to specify if total weight is within the limits of
	 * 'maximum weight' and 'minimum weight' parameters.
	 * <p>
	 * value = {@value}
	 * <p>
	 * Total Weight must be within the limits of dynamic parameter -
	 * {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#MAXIMUM_WEIGHT
	 * MAXIMUM_WEIGHT} and
	 * {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#MINIMUM_WEIGHT
	 * MINIMUM_WEIGHT}
	 */
	public static final int TOTAL_WEIGHT_LIMIT_INVALID = 1275;

	/**
	 * The TPR Address can have any printable ASCII characters up to 132
	 * characters.
	 */
	public static final int TPR_ADDRESS_INVALID = 1485;

	/**
	 * The TPR Address is required if the Email Notification Indicator is set.
	 */
	public static final int TPR_ADDRESS_MANDATORY = 1517;

	/**
	 * An Email address is required in the TPR Address field.
	 */
	public static final int TPR_EMAIL_MANDATORY = 1484;

	/**
	 * The TTY address must be seven characters alphanumeric.
	 */
	public static final int TTY_ADDRESS_INVALID = 1483;

	/**
	 * The TTY address is mandatory.
	 */
	public static final int TTY_ADDRESS_MANDATORY = 1531;

	/*
	 * =========================================================================
	 * = ======
	 */
	/* Start of UC018 Maintain And Process Teletype Address Information */
	/*
	 * =========================================================================
	 * = ======
	 */
	/**
	 * The TTY Address is required if the TPR Address is not of type Email.
	 */
	public static final int TTY_ADDRESS_MANDATORY_IF_TPR_NOT_OF_TYPE_EMAIL = 1481;

	/**
	 * Teletype Address Profile successfully created.
	 */
	public static final int TTY_ADDRESS_PROFILE_CREATED_ACK = 1519;

	/**
	 * Teletype Address Profile successfully updated.
	 */
	public static final int TTY_ADDRESS_PROFILE_UPDATED_ACK = 1521;

	/**
	 * The TTY Address is prohibited if the Email Notification Indicator is set.
	 */
	public static final int TTY_ADDRESS_PROHIBITED = 1482;

	/**
	 * If the TPR Address field contains an Email Address, the TTY Address is
	 * prohibited.
	 */
	public static final int TTY_ADDRESS_PROHIBITED_FIND = 1522;

	/**
	 * Invalid TTY Delete Indicator. Valid values are Y and N.
	 */
	public static final int TTY_DELETE_INDICATOR_INVALID = 1491;

	/**
	 * Atleast one of TTY/TPR address should be provided for retrieval.
	 */
	public static final int TTY_OR_TPR_ADDRESS_REQUIRED = 1535;

	/**
	 * Invalid TTY Report Indicator. Valid values are Y and N.
	 */
	public static final int TTY_REPORT_INDICATOR_INVALID = 1490;

	/**
	 * The TTY/TPR address does not exist.
	 */
	public static final int TTY_TPR_ADDRESS_DOES_NOT_EXISTS = 1523;

	/**
	 * The TTY/TPR address already exists and duplicates are not allowed.
	 */
	public static final int TTY_TPR_ADDRESS_DUPLICATE = 1486;

	/**
	 * The TTY/TPR Address can have alphabet, number, hyphen (-), period (.) and
	 * space up to 35 characters. Other special characters are not accepted.
	 */
	public static final int TTY_TPR_ADDRESS_INVALID = 1493;

	/**
	 * Invalid TTY/TPR Address ObjecID.
	 */
	public static final int TTY_TPR_ADDRESS_PROFILE_INVALID_OID = 1527;

	/**
	 * The TTY/TPR Name can have alphabet, number, hyphen (-), period (.) and
	 * space up to 35 characters. Other special characters are not accepted.
	 */
	public static final int TTY_TPR_NAME_INVALID = 1492;

	/**
	 * This constant is used to verify if any teletype address object exists.
	 * <p>
	 * Failed because no teletype profile exists in the system.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYADDRESS_OBJECT_NOT_EXIST = 1078;

	/**
	 * This constant is used to verify if any valid teletype profile object id
	 * exists.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPEPROFILE_INVALID_OID = 1064;

	/**
	 * This constant is used to verify if the carrier code is valid.
	 * <p>
	 * The carrier code must be two characters alphanumeric.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_CARRIERCODE_INVALID = 1044;

	/**
	 * This constant is used to verify that no carrier code exists for the
	 * message type.
	 * <p>
	 * Carrier code is applicable for FFM, FFR, FWB, FHL and FBL message types
	 * and prohibited for FSU and FAD.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_CARRIERCODE_PROHIBITED = 1043;

	/**
	 * This constant is used to verify if the carrier number is valid.
	 * <p>
	 * The airline code number must be three characters numeric.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_CARRIERNUMBER_INVALID = 1046;

	/**
	 * This constant is used to verify if any carrier number exists for the
	 * message type.
	 * <p>
	 * Airline Code number is applicable for FSU, FWB, FAD and FHL message types
	 * and prohibited for FFM, FFR and FBL message types.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_CARRIERNUMBER_PROHIBITED = 1045;

	/**
	 * This constant is used to verify if any teletype address is similar to
	 * central teletype address.
	 * <p>
	 * The central teletype address is based on the dynamic parameters -
	 * {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#CENTRAL_TTY_STATION_CODE}
	 * ,
	 * {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#CENTRAL_TTY_OFFICE_CODE}
	 * ,
	 * {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#HOST_CARRIER_CODE}
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_CNTRLTTYADDR_PROHIBITED = 1062;

	/**
	 * This constant is used to specify that the create operation is successful.
	 * <p>
	 */
	public static final int TTYPROFILE_CREATE_SUCCESSFUL = 1065;

	/**
	 * This constant is used to specify that the delete operation is successful.
	 * <p>
	 */
	public static final int TTYPROFILE_DELETE_SUCCESSFUL = 1066;

	/**
	 * This constant is used to verify if the destination area is valid.
	 * <p>
	 * The destination area must be one character numeric.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_DESTNAREA_INVALID = 1076;

	/**
	 * This constant is used to verify if the destination area exists.
	 * <p>
	 * Failed because the destination area does not exist in the system.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_DESTNAREA_NOT_EXIST = 1072;

	/**
	 * This constant is used to verify if the specified destination country is
	 * valid.
	 * <p>
	 * The destination country must be two characters alphabetic.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_DESTNCOUNTRY_INVALID = 1039;

	/*
	 * =========================================================================
	 * = ======
	 */
	/* End of UC018 Maintain And Process Teletype Address Information */
	/*
	 * =========================================================================
	 * = ======
	 */

	/**
	 * This constant is used to verify if the destination country exists.
	 * <p>
	 * Failed because the destination country does not exist in the system.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_DESTNCOUNTRY_NOT_EXIST = 1040;

	/**
	 * This constant is used to verify if destination station belongs to the
	 * destination country/area.
	 * <p>
	 * Failed because the destination station does not belong to the destination
	 * country/area.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_DESTNSTATION_EXISTCOUNTRY = 1070;

	/**
	 * This constant is used to verify if the destination station is valid.
	 * <p>
	 * The destination station code must be three characters alphabetic.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_DESTNSTATION_INVALID = 1041;

	/**
	 * This constant is used to verify if the destination station exists.
	 * <p>
	 * Failed because the destination station does not exist in the system.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_DESTNSTATION_NOT_EXIST = 1042;

	/**
	 * This constant is used to verify if the flight is valid.
	 * <p>
	 * The flight is a combination of carrier code, flight number and suffix
	 * code. The length is of 3-7.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_FLIGHT_INVALID = 1048;

	/**
	 * This constant is used to verify if no flight exists for the message type.
	 * <p>
	 * Flight is applicable for FFM, FWB, and FHL message types and prohibited
	 * for FSU, FFR, FAD and FBL message types.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_FLIGHT_PROHIBITED = 1047;

	/**
	 * This constant is used to verify if the flight number has been specified.
	 * <p>
	 * Failed because no flight number is specified.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_FLIGHTNUMBER_REQUIRED = 1073;

	/**
	 * This constant is used to verify if the FWB Message sending code is valid.
	 * <p>
	 * Failed because the FWB Message sending code is invalid.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_FWBMSGCODE_INVALID = 1057;

	/**
	 * This constant is used to verify that no FWB Message sending code exists
	 * for the message type.
	 * <p>
	 * FWB message sending option is applicable for FWB message type and
	 * prohibited for FFM, FFR, FSU, FHL, FBL and FAD message types.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_FWBMSGCODE_PROHIBITED = 1055;

	/**
	 * This constant is used to verify if the FWB Message sending option is
	 * valid.
	 * <p>
	 * The FWB message sending option must be one character alpha.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_FWBMSGOPTION_INVALID = 1056;

	/**
	 * This constant is used to verify if the message type matches the input
	 * message type.
	 * <p>
	 * The message type associated with the unique key does not match the input
	 * message type.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_MESSAGETYPE_DOES_NOT_MATCH = 1077;

	/**
	 * This constant is used to verify if the message type is valid.
	 * <p>
	 * The message type must be three characters alphabetic.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_MSGTYPE_INVALID = 1033;

	/**
	 * This constant is used to verify if message type exists.
	 * <p>
	 * Failed because no teletype profile message type exists in the system.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_MSGTYPE_NOT_EXIST = 1034;

	/**
	 * This constant is used to specify the teletype profile message type is
	 * required.
	 * <p>
	 * Failed because no teletype profile message type is provided.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_MSGTYPE_REQUIRED = 1032;

	/**
	 * This constant is used to verify if the combination of teletype sending
	 * profile is unique.
	 * <p>
	 * Failed because the combination of teletype sending profile is not unique.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_MSGTYPE_UNIQUE = 1060;

	/*
	 * =========================================================================
	 * = =======
	 */
	/*
	 * Start of UC019 Maintain Teletype Sending Profile
	 */
	/*
	 * =========================================================================
	 * = =======
	 */
	/**
	 * This constant is used to verify if any teletype profile object exists.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_OBJECT_NOT_EXIST = 1031;

	/**
	 * This constant is used to verify if origin station belongs to the origin
	 * country/area.
	 * <p>
	 * Failed because the origin station does not belong to the origin
	 * country/area.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_ORGNSTATION_EXISTCOUNTRY = 1069;

	/*
	 * =========================================================================
	 * = ======
	 */
	/* End of Maintain State and Province Information UC-257 */
	/*
	 * =========================================================================
	 * = ======
	 */

	/*
	 * =========================================================================
	 * = ======
	 */
	/* Start of UC282 Maintain Holiday Information */
	/*
	 * =========================================================================
	 * = ======
	 */

	/**
	 * This constant is used to verify if the origin area is valid.
	 * <p>
	 * The origin area must be one character numeric.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_ORIGINAREA_INVALID = 1075;

	/**
	 * This constant is used to verify if the origin area exists.
	 * <p>
	 * Failed because the origin area does not exist in the system.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_ORIGINAREA_NOT_EXIST = 1071;

	/**
	 * This constant is used to verify if the specified origin country is valid.
	 * <p>
	 * The origin country must be two characters alphabetic.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_ORIGINCOUNTRY_INVALID = 1035;

	/**
	 * This constant is used to verify if the origin country exists.
	 * <p>
	 * Failed because the origin country does not exist in the system.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_ORIGINCOUNTRY_NOT_EXIST = 1036;

	/**
	 * This constant is used to verify if the origin station is valid.
	 * <p>
	 * The destination station code must be three characters alphabetic.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_ORIGINSTATION_INVALID = 1037;

	/**
	 * This constant is used to verify if the origin station exists.
	 * <p>
	 * Failed because the origin station does not exist in the system.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_ORIGINSTATION_NOT_EXIST = 1038;

	/**
	 * This constant is used to verify if the product code is valid.
	 * <p>
	 * The product code must be three characters alphanumeric.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_PRODUCTCODE_INVALID = 1050;

	/**
	 * This constant is used to verify if any product code exists.
	 * <p>
	 * Failed because the product code does not exists in the system.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_PRODUCTCODE_NOT_EXIST = 1051;

	/**
	 * This constant is used to verify that no product code exists for the
	 * message type.
	 * <p>
	 * Product code is applicable for FSU message type and prohibited for FFM,
	 * FFR, FWB, FHL, FBL and FAD message types.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_PRODUCTCODE_PROHIBITED = 1049;

	/**
	 * This constant is used to verify if the special handling code is valid.
	 * <p>
	 * The special handling code must be three characters alphabetic.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_SPLHANDLINGCODE_INVALID = 1053;

	/**
	 * This constant is used to verify if any special handling code exists.
	 * <p>
	 * Failed because no special handling code exists in the system.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_SPLHANDLINGCODE_NOT_EXIST = 1054;

	/**
	 * This constant is used to verify that no special handling code exists for
	 * the message type.
	 * <p>
	 * Special Handling code is applicable for FSU message type and prohibited
	 * for FFM, FFR, FWB, FHL, FBL and FAD message types.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_SPLHANDLINGCODE_PROHIBITED = 1052;

	/**
	 * This constant is used to verify if the origin and destination stations
	 * are the same.
	 * <p>
	 * Failed because both the stations are same.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_STATIONCODE_CANNOTBESAME = 1068;

	/*
	 * =========================================================================
	 * = ======
	 */
	/* End of UC282 Maintain Holiday Information */
	/*
	 * =========================================================================
	 * = ======
	 */

	/*
	 * =========================================================================
	 * = ======
	 */
	/* Start of Maintain Parameter Information */
	/*
	 * =========================================================================
	 * = ======
	 */

	/**
	 * This constant is used to verify if the teletype address conforms to IATA
	 * standard.
	 * <p>
	 * The characters 1 through 3 must be alphabet, characters 4 through 5 must
	 * be alphanumeric and characters 6 through 7 must be alphanumeric.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_TTYADDR_STD_INVALID = 1061;

	/**
	 * This constant is used to verify if any duplicate teletype address exists.
	 * <p>
	 * Failed because duplicate teletype address exists in the system.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_TTYADDRESS_DUPLICATE_PROHIBITTED = 1074;

	/**
	 * This constant is used to verify if the teletype address is valid.
	 * <p>
	 * The teletype address must be seven characters alphanumeric.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_TTYADDRESS_INVALID = 1059;

	/**
	 * This constant is used to specify that the teletype profile address is
	 * required.
	 * <p>
	 * Value = {@value}
	 */
	public static final int TTYPROFILE_TTYADDRESS_REQUIRED = 1058;

	/**
	 * This constant is used to specify that the update operation is successful.
	 * <p>
	 */
	public static final int TTYPROFILE_UPDATE_SUCCESSFUL = 1067;

	/**
	 * This constant is used to verify whether maximum gross weight usage is
	 * valid.
	 * <p>
	 * <p>
	 * Value = {@value}
	 * <p>
	 * Maximum Gross Weight is a mandatory field.
	 */
	public static final int ULD_INVALID_MAXGROSSWTUSAGE_OBJECT_INSTANCE = 555;

	/**
	 * This constant is used to verify whether maximum volume usage is valid.
	 * <p>
	 * Value = {@value}
	 * <p>
	 * Maximum Volume is mandatory.
	 */
	public static final int ULD_INVALID_MAXVOLUMEUSAGE_OBJECT_INSTANCE = 556;

	/**
	 * This constant is used to verify whether ULD prefix name usage is valid.
	 * <p>
	 * Value = {@value}
	 * <p>
	 * The ULD Prefix is mandatory.
	 */
	public static final int ULD_INVALID_ULDPREFIXNAMEUSAGE_OBJECT_INSTANCE = 557;

	/**
	 * This constant is used to verify the manufacturer code.
	 * <p>
	 * Value = {@value}
	 * <p>
	 * The manufacturer's code is mandatory.
	 */

	public static final int ULD_MANUFACTURERCODE_REQUIRED = 578;

	/**
	 * This constant is used to verify the start station.
	 * <p>
	 * Value = {@value}
	 * <p>
	 * The start station is mandatory.
	 */

	public static final int ULD_STARTSTATION_REQUIRED = 579;

	/**
	 * This constant is used to specify that the create ULD Configuration
	 * operation is successful.
	 * <p>
	 * Value = {@value}
	 */
	public static final int ULDCONFIGURATION_CREATE_SUCCESSFUL = 846;

	/**
	 * This constant is used to specify that the delete operation is successful.
	 * <p>
	 * Value = {@value}
	 */
	public static final int ULDCONFIGURATION_DELETE_SUCCESSFUL = 848;

	/**
	 * This constant is used to verify the instance of aircraft type object.
	 * <p>
	 * The aircraft type instance is invalid.
	 * <p>
	 * Value = {@value}
	 */
	public static final int ULDCONFIGURATION_INVALID_AIRCRAFTTYPE_INSTANCE = 836;

	/**
	 * This constant is used to verify whether the aircraft type is valid.
	 * <p>
	 * Invalid aircraft type.
	 * <p>
	 * Value = {@value}
	 */
	public static final int ULDCONFIGURATION_INVALID_AIRCRAFTTYPE_LENGTH_TYPE = 834;

	/**
	 * This constant is used to verify whether the carrier code instance is
	 * valid or not.
	 * <p>
	 * The carrier code instance is invalid.
	 * <p>
	 * Value = {@value}
	 */
	public static final int ULDCONFIGURATION_INVALID_CARRIERCODE_INSTANCE = 839;

	/**
	 * This constant is used to verify whether the carrier code is valid or not.
	 * <p>
	 * The carrier code is invalid.
	 * <p>
	 * Value = {@value}
	 */
	public static final int ULDCONFIGURATION_INVALID_CARRIERCODE_LENGTH_TYPE = 838;

	/**
	 * This constant is used to verify whether the maxvolumefloor is valid or
	 * not.
	 * <p>
	 * The maxvolumefloor is invalid.
	 * <p>
	 * Value = {@value}
	 */
	public static final int ULDCONFIGURATION_INVALID_MAXVOLUMEFLOOR_LENGTH_TYPE = 840;

	/**
	 * This constant is used to verify whether the maxvolumefloor is provided or
	 * not.
	 * <p>
	 * The maximum volume floor is not provided.
	 * <p>
	 * Value = {@value}
	 */
	public static final int ULDCONFIGURATION_INVALID_MAXVOLUMEFLOOR_USAGE = 841;

	/**
	 * This constant is used to verify whether the maxvolumelowerdeck is valid
	 * or not.
	 * <p>
	 * The maxvolumelowerdeck is invalid.
	 * <p>
	 * Value = {@value}
	 */
	public static final int ULDCONFIGURATION_INVALID_MAXVOLUMELOWERDECK_LENGTH_TYPE = 842;

	/**
	 * This constant is used to verify whether the maximum volume lowerdeck is
	 * provided.
	 * <p>
	 * The maximum volume lowerdeck is required.
	 * <p>
	 * value = {@value}
	 */
	public static final int ULDCONFIGURATION_INVALID_MAXVOLUMELOWERDECK_USAGE = 843;

	/**
	 * This constant is used to verify the invalid ULD configuration object
	 * instance.
	 * <p>
	 * The ULD configuration object instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int ULDCONFIGURATION_INVALID_OBJECT_INSTANCE = 844;

	/**
	 * This constant is used to verify the instance of OID object.
	 * <p>
	 * Invalid ULD Configuration OID instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int ULDCONFIGURATION_INVALID_OID_OBJECT_INSTANCE = 845;

	/**
	 * This constant is used to verify whether the ULD category is required.
	 * <p>
	 * The ULD category is required.
	 * <p>
	 * Value = {@value}
	 */
	public static final int ULDCONFIGURATION_INVALID_ULDCATEGORY_USAGE = 835;

	/**
	 * This constant is used to verify the instance of ULD Prefix object.
	 * <p>
	 * Invalid ULD Prefix object instance.
	 * <p>
	 * Value = {@value}
	 */
	public static final int ULDCONFIGURATION_INVALID_ULDPREFIX_INSTANCE = 833;

	/**
	 * This constant is used to verify whether the ULDPrefix is valid.
	 * <p>
	 * Invalid ULDPrefix.
	 * <p>
	 * Value = {@value}
	 */
	public static final int ULDCONFIGURATION_INVALID_ULDPREFIX_LENGTH_TYPE = 831;

	/**
	 * This constant is used to verify whether the ULD Prefix is provided or
	 * not.
	 * <p>
	 * The ULD Prefix is required.
	 * <p>
	 * Value = {@value}
	 */
	public static final int ULDCONFIGURATION_INVALID_ULDPREFIX_USAGE = 832;

	/**
	 * This constant is used to specify that the update operation is successful.
	 * <p>
	 * Value = {@value}
	 */
	public static final int ULDCONFIGURATION_UPDATE_SUCCESSFUL = 847;

	/*
	 * =========================================================================
	 * = =======
	 */
	/* Start of Aircraft Dimension */
	/*
	 * =========================================================================
	 * = =======
	 */

	/**
	 * This constant is used to verify the Duplicate Entry of ULD Configuration.
	 * <p>
	 * The ULD Configuration already exists.
	 * <p>
	 * Value = {@value}
	 */
	public static final int ULDCONFIGURATIONSERVICE_ENTITY_ALREADY_EXIST = 837;

	/**
	 * This constant is used to verify if carrier code exists .
	 * <p>
	 * Value = {@value}
	 * <p>
	 * If the Carrier Code does not exist in the system.
	 */
	public static final int ULDPREFIX_CARRIERCODE_NOTEXISTS = 562;

	/**
	 * This constant is used to verify the ULD prefix name.
	 * <p>
	 * Value = {@value}
	 * <p>
	 * The combination of ULD Prefix/Carrier code already exists in the system.
	 */
	public static final int ULDPREFIX_CARRIERNAME_EXIST = 561;

	/**
	 * This constant is used to specify that the create operation is successful.
	 * <p>
	 * Value = {@value}
	 */
	public static final int ULDPREFIX_CREATE_SUCCESSFUL = 571;

	/**
	 * This constant is used to specify that the delete operation is successful.
	 * <p>
	 * Value = {@value}
	 */
	public static final int ULDPREFIX_DELETE_SUCCESSFUL = 574;

	/**
	 * This constant is used to verify the input carrier code.
	 * <p>
	 * Value = {@value}
	 * <p>
	 * Invalid carrier code instance.
	 */
	public static final int ULDPREFIX_INVALID_CARRIERCODE_OBJECT_INSTANCE = 542;

	/**
	 * This constant is used to verify the contour.
	 * <p>
	 * Value = {@value}
	 * <p>
	 * Contour provided must be 1 or 2 characters alphanumeric.
	 */
	public static final int ULDPREFIX_INVALID_CONTOUR_OBJECT_INSTANCE = 543;

	/**
	 * This constant is used to verify the manufacturer code.
	 * <p>
	 * Value = {@value}
	 * <p>
	 * The manufacturer's code must not exceed two characters.
	 */

	public static final int ULDPREFIX_INVALID_MANUFACTURERCODE = 580;

	/**
	 * This constant is used to verify the maximum gross weight.
	 * <p>
	 * Value = {@value}
	 * <p>
	 * Maximum gross weight must be 1 to 5 characters of Numeric / 1 to 7
	 * characters of Numeric inclusive of a decimal point.
	 */
	public static final int ULDPREFIX_INVALID_MAXIMUMGROSSWEIGHT_OBJECT_INSTANCE = 544;

	/**
	 * This constant is used to verify the maximum volume.
	 * <p>
	 * value = {@value}
	 * <p>
	 * Maximum volume must be 1 to 6 characters of Numeric / 1 to 9 characters
	 * of Numeric inclusive of a decimal point.
	 */
	public static final int ULDPREFIX_INVALID_MAXIMUMVOLUME_OBJECT_INSTANCE = 545;

	/**
	 * This constant is used to verify the instance of ULDPrefix object.
	 * <p>
	 * Value = {@value}
	 * <p>
	 * Invalid ULDPrefix object instance.
	 */
	public static final int ULDPREFIX_INVALID_OBJECT_INSTANCE = 541;

	/**
	 * This constant is used to verify the instance of OID object.
	 * <p>
	 * Value = {@value}
	 * <p>
	 * Invalid ULD prefix OId instance.
	 */
	public static final int ULDPREFIX_INVALID_OID_OBJECT_INSTANCE = 546;

	/**
	 * This constant is used to verify if the serial range is valid.
	 * <p>
	 * Value = {@value}
	 * <p>
	 * Failed because of invalid serial range.
	 */
	public static final int ULDPREFIX_INVALID_SERIALRANGE_OBJECT_INSTANCE = 563;

	/**
	 * This constant is used to verify the start station.
	 * <p>
	 * Value = {@value}
	 * <p>
	 * The start station must be three characters alphabetic.
	 */

	public static final int ULDPREFIX_INVALID_STARTSTATION = 951;

	/**
	 * This constant is used to verify the ULD group number.
	 * <p>
	 * Value = {@value}
	 * <p>
	 * Invalid ULD group number.
	 */
	public static final int ULDPREFIX_INVALID_ULDGROUPNUMBER = 952;

	/**
	 * This constant is used to verify the ULD prefix name.
	 * <p>
	 * Value = {@value}
	 * <p>
	 * ULD prefix name must be three characters of alphanumeric where first
	 * character must be an alphabet.
	 */
	public static final int ULDPREFIX_INVALID_ULDPREFIXNAME_OBJECT_INSTANCE = 548;

	/**
	 * This constant is used to verify the ULD prefix name size.
	 * <p>
	 * Value = {@value}
	 * <p>
	 * The ULD Prefix must contain 3 characters.
	 */
	public static final int ULDPREFIX_INVALID_ULDPREFIXNAME_SIZE = 558;

	/**
	 * This constant is used to specify that the update operation is successful.
	 * <p>
	 * Value = {@value}
	 */
	public static final int ULDPREFIX_UPDATE_SUCCESSFUL = 573;

	/**
	 * This constant is used to specify that the delete operation is successful.
	 * <p>
	 * Value = {@value}
	 */
	public static final int ULDPREFIXSERIALRANGE_DELETE_SUCCESSFUL = 572;

	/**
	 * This constant is used to verify the ULD Prefix's existence.
	 * <p>
	 * Value = {@value}
	 * <p>
	 * The ULD Prefix entity already exists.
	 */
	public static final int ULDPREFIXSERIALRANGESERVICE_ENTITY_ALREADY_EXIST = 576;

	/**
	 * This constant is used to verify if the end range size is valid.
	 * <p>
	 * Value = {@value}
	 * <p>
	 * Serial Range End must be 4-5 characters long.
	 */
	public static final int ULDSERIALRANGE_INVALID_ENDRANGE_LENGTH = 567;

	/**
	 * This constant is used to verify the end range.
	 * <p>
	 * Value = {@value}
	 * <p>
	 * End range must be 4 characters of alphanumeric or 4 to 5 characters of
	 * Numeric.
	 */
	public static final int ULDSERIALRANGE_INVALID_ENDRANGE_OBJECT_INSTANCE = 550;

	/**
	 * This constant is used to verify the serial range number.
	 * <p>
	 * Value = {@value}
	 * <p>
	 * End Range should contain only numerals. No exact match found for the
	 * given serial range number.
	 */
	public static final int ULDSERIALRANGE_INVALID_ENDRANGE_OBJECT_INSTANCE_ALPHABET = 570;

	/**
	 * This constant is used to verify that the end range usage is valid.
	 * <p>
	 * Value = {@value}
	 * <p>
	 * Serial Range End is mandatory.
	 */
	public static final int ULDSERIALRANGE_INVALID_ENDRANGEUSAGE = 565;

	/**
	 * This constant is used to verify the ULD serial range object.
	 * <p>
	 * Value = {@value}
	 * <p>
	 * Invalid ULD serial range object.
	 */
	public static final int ULDSERIALRANGE_INVALID_OBJECT_INSTANCE = 554;

	/**
	 * This constant is used to verify the ULD serial range OID.
	 * <p>
	 * Value = {@value}
	 * <p>
	 * Invalid ULD serial range OId.
	 */
	public static final int ULDSERIALRANGE_INVALID_OID_OBJECT_INSTANCE = 551;

	/**
	 * This constant is used to verify that the start range is valid.
	 * <p>
	 * Value = {@value}
	 * <p>
	 * Serial Range End must be greater than or equal to Serial Range Start.
	 */
	public static final int ULDSERIALRANGE_INVALID_STARTANDENDRANGE = 560;

	/**
	 * This constant is used to verify that the start range size is valid.
	 * <p>
	 * Value = {@value}
	 * <p>
	 * Serial Range Start must be 4-5 characters long.
	 */
	public static final int ULDSERIALRANGE_INVALID_STARTRANGE_LENGTH = 566;

	/**
	 * This constant is used to verify the start range.
	 * <p>
	 * Value = {@value}
	 * <p>
	 * Start range must be 4 characters of alphanumeric or 4 to 5 characters of
	 * Numeric.
	 */
	public static final int ULDSERIALRANGE_INVALID_STARTRANGE_OBJECT_INSTANCE = 549;

	/**
	 * This constant is used to verify the start serial range number.
	 * <p>
	 * Value = {@value}
	 * <p>
	 * Start Range should contain only numerals. No exact match found for the
	 * given start serial range number.
	 */
	public static final int ULDSERIALRANGE_INVALID_STARTRANGE_OBJECT_INSTANCE_ALPHABET = 569;

	/**
	 * This constant is used to verify that the tare weight is valid.
	 * <p>
	 * Value = {@value}
	 * <p>
	 * Tare Weight must be less than Maximum Gross Weight.
	 */
	public static final int ULDSERIALRANGE_INVALID_TAREWEIGHT = 559;

	/**
	 * This constant is used to verify the tare weight.
	 * <p>
	 * Value = {@value}
	 * <p>
	 * Tare weight must be 1 to 5 characters of Numeric / 1 to 7 characters of
	 * Numeric inclusive of a decimal point.
	 */
	public static final int ULDSERIALRANGE_INVALID_TAREWEIGHT_OBJECT_INSTANCE = 552;

	/**
	 * This constant is used to verify the tare weight usage.
	 * <p>
	 * Value = {@value}
	 * <p>
	 * Tare Weight is Mandatory.
	 */
	public static final int ULDSERIALRANGE_INVALID_TAREWEIGHT_USAGE = 568;

	/**
	 * This constant is used to verify the ULD prefix OID.
	 * <p>
	 * Value = {@value}
	 * <p>
	 * Invalid ULD prefix OId .
	 */
	public static final int ULDSERIALRANGE_INVALID_ULDPREFIXOID_OBJECT_INSTANCE = 553;

	/**
	 * This constant is used to verify the overlapping of serial range.
	 * <p>
	 * Value = {@value}
	 * <p>
	 * Serial Range Start is mandatory.
	 */
	public static final int ULDSERIALRANGE_OVERLAPPING_STARTANDENDRANGE = 564;

	// persist

	/**
	 * This constant is used to specify that the create operation is successful.
	 * <p>
	 * {0}- created ULDStation code.
	 * <p>
	 * Value = {@value}
	 */
	public static final int ULDSTATION_CREATE_SUCCESSFUL = 523;

	/**
	 * This constant is used to check that the ULD station exists.
	 * <p>
	 * Value = {@value}
	 * <p>
	 * The start station does not exist as the ULD station.
	 */
	public static final int ULDSTATION_NOTEXISTS = 953;

	/**
	 * This constant is used to specify that the update operation is successful.
	 * <p>
	 * {0}- Updated ULDStation code.
	 * <p>
	 * Value = {@value}
	 */
	public static final int ULDSTATION_UPDATE_SUCCESSFUL = 524;

	/**
	 * This constant is used to specify that the updated customs status code
	 * does not exist.
	 */
	public static final int UPDATED_CUSTOMS_SATUS_CODE_DOES_NOT_EXIST = 1412;

	/**
	 * This constant is used to specify if the volume is within the limits.
	 * <p>
	 * value = {@value}
	 */
	public static final int VOLUME_LIMIT_INVALID = 849;

	/**
	 * This constant is used to specify that the aircraft max height mismatched.
	 * <p>
	 * value = {@value}
	 */

	public static final int AIRCRAFT_MAX_HEIGHT_MISMATCH = 1835;

	/**
	 * This constant is used to specify that the aircraft max width mismatched.
	 * <p>
	 * value = {@value}
	 */
	public static final int AIRCRAFT_MAX_WIDTH_MISMATCH = 1836;

	public static final int STATION_ADMIN_LABLES_NOT_FOUND_FOR_ANY_SECTION = 8000;

	public static final int STATION_ADMIN_INVALID_OBJECT_INSTANCE = 8001;

	public static final int STATION_ADMIN_SECTION_NAME_CANT_BE_EMPTY = 8002;

	public static final int STATION_ADMIN_AGENCY_HOURS_SECTION_NOT_EMPTY = 8003;

	public static final int STATION_ADMIN_FACILITY_CONTACTS_SECTION_NOT_EMPTY = 8004;

	public static final int STATION_ADMIN_FACILITY_ATTRIBUTES_SECTION_NOT_EMPTY = 8005;

	public static final int STATION_ADMIN_SUPPLEMENTAL_SECTION_NOT_EMPTY = 8006;

	public static final int HANDLING_DETAIL_SECTION_NOT_EMPTY = 8007;

	public static final int STATION_ADMIN_LABEL_TEXT_NOT_EMPTY = 8008;

	public static final int STATION_ADMIN_LABEL_ORDER_NOT_EMPTY = 8009;

	public static final int STATION_ADMIN_ORDER_NOT_ZERO_LESS_THAN_99 = 8010;

	public static final int STATION_ADMIN_LABEL_TEXT_LENGTH_GREATER_THAN_80 = 8011;

	public static final int STATION_ADMIN_LABEL_TEXT_DUPLICATED = 8012;

	public static final int STATION_ADMIN_DISPLAY_ORDER_DUPLICATED = 8013;

	public static final int STATION_ADMIN_HANDLING_DETAIL_SECTION_LABEL_NOT_EMPTY = 8014;

	public static final int STATION_ADMIN_INFORMATION_UPDATED_SUCESSFULLY = 8015;

	public static final int STATION_INFO_LOCATIONS_ATLEAST_ONE_VALUE_MANDATORY = 8050;

	public static final int SPECIAL_INST_ATLEAST_ONE_VALUE_MANDATORY = 8051;

	public static final int SUPPLE_HOUR_ATLEAST_ONE_VALUE_MANDATORY = 8052;

	public static final int AGENCY_HOUR_ATLEAST_ONE_VALUE_MANDATORY = 8053;

	public static final int AGENCY_HOL_ATLEAST_ONE_VALUE_MANDATORY = 8054;

	public static final int SUPPLE_HOL_ATLEAST_ONE_VALUE_MANDATORY = 8055;

	public static final int STATION_LOCATION_ADDRESS_INVALID = 8100;

	public static final int STATION_SALES_TITLE_INVALID = 8101;

	public static final int STATION_SALES_NAME_INVALID = 8102;

	public static final int STATION_SALES_LOCATION_INVALID = 8103;

	public static final int STATION_SALES_SCHEDULED_HOURS_INVALID = 8104;

	public static final int STATION_SALES_SHEDULED_DAYS_OFF_INVALID = 8105;

	public static final int STATION_SALES_OFFICE_NO_INVALID = 8106;

	public static final int STATION_SALES_CELL_NO_INVALID = 8107;

	public static final int STATION_SALES_FAX_NO_INVALID = 8108;

	public static final int STATION_SALES_EMAIL_INVALID = 8109;

	public static final int STATION_SUPPLEMENTAL_STATION_HOURS_HOUR_INVALID = 8110;

	public static final int STATION_HOLIDAY_HOURS_DATE_INVALID = 8111;

	public static final int STATION_INVALID_TIME_FORMAT = 8112;

	public static final int STATION_AGENCY_STATION_HOURS_HOUR_INVALID = 8113;

	public static final int STATION_AGENCY_HOLIDAY_HOURS_INVALID = 8114;

	public static final int STAITON_SUPPLEMENTAL_HOLIDAY_HOURS_HOUR_INVALID = 8115;

	public static final int PHYSICAL_MAILING_ADDRESS_COUNTRY_DOES_NOT_EXIST = 8116;

	public static final int CLOSING_TIME_CANNOT_BE_LESS_THAN_OPENING_TIME = 8117;

	public static final int SCHEDULE_DAYS_OFF_INCLUDE_WEEK_DAYS = 8118;

	public static final int STATION_CONTTROL_CARRIER_DOES_NOT_EXIST = 8119;

	public static final int STATION_STATION_DOES_NOT_EXIST = 8120;

	public static final int SPL_CODE_NOT_FOUND = 8121;

	public static final int DATE_IS_INVALID = 8122;

	public static final int STATION_HANDLING_COMMENT_INVALID = 8123;

	public static final int STATION_CUSTOM_DETAILS_ADDRESS_INVALID = 8124;

	public static final int STATION_CUSTOM_DETAILS_PHONE_INVALID = 8125;

	public static final int STATION_CUSTOM_DETAILS_FRMS_INVALID = 8126;

	public static final int STATION_CUSTOM_DETAILS_SSD_PRINTER_ID_INVALID = 8127;

	public static final int STATION_CUSTOM_DETAILS_PERCENT_SHIPMENT_INSPECTED_INVALID = 8128;

	public static final int STATION_CODE_IS_MANDATORY = 8129;

	public static final int STATION_OTHER_SPL_INS_CARRIER_CODE_MANDATORY = 8130;

	public static final int STATION_OTHER_SPL_INS_RSTRICTION_TYPE = 8131;

	public static final int STATION_OTHER_SPL_INS_TYPE = 8132;

	public static final int STATION_OTHER_SPL_INS_START_DATE = 8133;

	public static final int STATION_OTHER_SPL_INS_SPECIAL_INSTRUCTIONS = 8134;

	public static final int STATION_OTHER_SPL_INS_SUPP_STATION_HOURS_MANDATORY = 8135;

	public static final int STATION_OTHER_SPL_INS_SUPP_HOLIDAY_HOURS_MANDATORY = 8136;

	public static final int STATION_OTHER_SPL_INS_AGENCY_HOURS_MANDATORY = 8137;

	public static final int STATION_OTHER_SPL_INS_AGENCY_HOLIDAY_HOURS_MANDATORY = 8138;

	public static final int STATION_PHYSICAL_ADDRESS_LOCATION_MANDATORY = 8139;

	public static final int STATION_PHYSICAL_ADDRESS_ADDRESS_MANDATORY = 8140;

	public static final int STATION_PHYSICAL_ADDRESS_CITY_MANDATORY = 8141;

	public static final int STATION_PHYSICAL_ADDRESS_COUNTRY_MANDATORY = 8142;

	public static final int STATION_UNABLE_TO_RETRIEVE = 8143;

	public static final int STATION_INFO_DUMP_STATION_LOCATION_DOES_N0T_EXIST = 8144;

	public static final int STAITON_INFO_DUMP_STAION_OPERATIONAL_CONTACT_DOES_NOT_EXIST = 8145;

	public static final int STATION_INFO_DUMP_STATION_SALES_CONTACT_DOES_NOT_EXIST = 8146;

	public static final int STATION_INFO_GIVEN_LABEL_DOES_NOT_EXIST = 8147;

	public static final int STATION_INFO_GIVEN_FACILITY_ATTRIBUTE_LABEL_DOES_NOT_EXIST = 8148;

	public static final int STATION_INFO_DELETED_SUCCESSFULLY = 8149;

	public static final int STATION_INFO_DUMP_HANDLING_DETAILS_QUESTION_NOT_FOUND = 8150;

	public static final int STATION_INFO_DUMP_HANDLING_DETAILS_ANSWER_NOT_FOUND = 8151;

	public static final int STATION_INFO_DUMP_STATION_SUPPLEMENTAL_HOURS_LABEL_NOT_FOUND = 8152;

	public static final int STATION_INFO_DUMP_STATION_AGENCY_HOURS_LABEL_NOT_FOUND = 8153;

	public static final int STATION_INFO_DUMP_STATION_DOES_NOT_EXIST_FOR_GIVEN_OID = 8154;

	public static final int STATION_INFO_DUMP_STATION_GIVEN_STATION_CODE_TO_CREATE_IS_ALREADY_EXIST = 8155;

	public static final int STATION_INFO_DUMP_STATION_GIVEN_STATION_LOCATION_OID_OBJECT_DOES_NOT_EXIST = 8156;

	public static final int STATION_INFO_DUMP_STATION_FACILITY_CONTACT_LABEL_ALREADY_EXIST = 8157;

	public static final int STATION_INFO_DUMP_STATION_SUPPLEMENTAL_HOUR_LABLE_ALREADY_EXIST = 8158;

	public static final int STATION_INFO_DUMP_STATION_AGENCY_HOUR_LABLE_ALREADY_EXIST = 8159;

	public static final int STATION_INFO_SUPPLEMENTAL_HOLIDAY_HOURS_INVALID = 8160;

	public static final int STATION_INFO_AGENCY_HOLIDAY_HOURS_INVALID = 8161;

	public static final int STATION_INFO_AGENCY_HOURS_INVALID = 8162;

	public static final int STATION_INFO_SUPPLEMENTAL_HOURS_INVALID = 8163;

	public static final int STATION_INFO_FACILITY_ATTRIBUTE_LOCATION_INVALID = 8164;

	public static final int STATION_INFO_FACILITY_ATTRIBUTE_ADDITIONAL_INFO_INVALID = 8165;

	public static final int STATION_INFO_ADDRESS_CITY_DOES_NOT_EXIST = 8166;

	public static final int STATION_INFO_COUNTRY_DOESNOT_EXIST = 8167;

	public static final int STATION_OTHER_SPL_INS_CARRIER_CODE_INVALID = 8168;

	public static final int STATION_OTHER_SPL_INS_PRODUCT_CODE_INVALID = 8169;

	public static final int STATION_OTHER_SPL_INS_START_DATE_INVALID = 8170;

	public static final int STATION_OTHER_SPL_INS_END_DATE_INVALID = 8171;

	public static final int STATION_OTHER_SPL_INS_SPL_INS_INVALID = 8172;

	public static final int STATION_OTHER_SPL_INS_MONDAY_HOURS_INVALID = 8173;

	public static final int STATION_OTHER_SPL_INS_TUESDAY_HOURS_INVALID = 8174;

	public static final int STATION_OTHER_SPL_INS_WEDNESDAY_HOURS_INVALID = 8175;

	public static final int STATION_OTHER_SPL_INS_THURSDAY_HOURS_INVALID = 8176;

	public static final int STATION_OTHER_SPL_INS_FRIDAY_HOURS_INVALID = 8177;

	public static final int STATION_OTHER_SPL_INS_SATURDAY_HOURS_INVALID = 8178;

	public static final int STATION_OTHER_SPL_INS_SUNDAY_HOURS_INVALID = 8179;

	public static final int DUPLICATE_STATION_LOCATION = 8180;

	public static final int STATION_SALES_SHEDULED_DAYS_OFF_HAS_DUPLICATES = 8181;

	public static final int STATION_INFO_OPERATIONAL_CONTACT_SCHEDULED_HOURS_NOT_CONSECUTIVE = 8182;

	public static final int STATION_ADMIN_DISPLAY_ORDERS_NOT_CONTINUOUS = 8183;

	public static final int STATION_INFO_AGENCY_HOLIDAY_HOURS_HAS_DUPLICATES = 8184;

	public static final int STATION_INFO_SUPLIMENTAL_STATION_HOLIDAY_HOURS_HAS_DUPLICATES = 8185;

	public static final int STATION_DOES_NOT_EXIST_IN_LMS_SYSTEM = 8186;

	public static final int STATION_INFO_SALES_CONTACTS_ATLEAST_ONE_VALUE_MANDATORY = 8187;

	public static final int STATION_INFO_OPERATIONAL_CONTACTS_ATLEAST_ONE_VALUE_MANDATORY = 8188;

	public static final int STATION_INFO_CAN_BE_CREATED_ONLY_IN_MIGRATION_MODE = 8201;

	public static final int STATIOIN_INFO_LOAD_OBJECT_DOES_NOT_EXIST = 8202;

	public static final int STATION_INFO_LOAD_LABEL_VALUE_ALREADY_EXIST = 8203;

	public static final int STATION_INFO_FACILITY_ATTRIBUTE_DOESNOT_EXIST = 8204;

	public static final int STATION_INFO_SUPPLEMENTAL_HOLIDAY_HOURS_DOESNOT_EXIST = 8205;

	public static final int STATION_INFO_AGENCY_HOLIDAY_HOURS_DOESNOT_EXIST = 8206;

	public static final int STATION_INFO_AGENCY_HOURS_DOESNOT_EXIST = 8207;

	public static final int STATION_INFO_SUPPLEMENTAL_HOURS_DOESNOT_EXIST = 8208;

	public static final int STATION_INFO_LOCATION_DOESNOT_EXIST = 8209;

	public static final int STATION_INFO_HANDLING_DETAILS_DOESNOT_EXIST = 8210;

	public static final int STATION_INFO_CONTACT_DETAILS_DOESNOT_EXIST = 8211;

	public static final int STATION_INFO_DOES_NOT_EXIST = 8212;

	public static final int STATION_INFO_OBJECT_DOESNOT_EXIST = 8213;

	public static final int STATION_LABEL_ALREADY_EXIST = 8214;

	public static final int STATION_DRIVING_DIRECTIONS_INVALID = 8215;

	public static final int STN_FAC_CONTACT_LABEL_MISMATCH = 8216;

	public static final int STN_FAC_SEC_ATTRIBUTE_LABEL_MISMATCH = 8217;

	public static final int STN_LOCATION_MAILING_ADDRESS_MANDATORY = 8218;

	public static final int ATLEAST_ONE_DATE_IN_AGENCY_MANDATORY = 8219;

	public static final int ATLEAST_ONE_DATE_IN_SUPPLEMENTAL_MANDATORY = 8220;

	public static final int STATION_INFO_OUTSIDE_FAX_INVALID = 8221;

	public static final int STATION_INFO_OUTSIDE_PHONE_INVALID = 8222;

	public static final int STATION_INFO_INNER_CITY_FAX_INVALID = 8223;

	public static final int STATION_INFO_INNER_CITY_PHONE_INVALID = 8224;

	public static final int STATION_INFO_CARGO_TTY_INFO_INVALID = 8225;

	public static final int STATION_INFO_CUSTOMS_INFO_INVALID = 8226;

	public static final int CFMSTN_HANDLING_COMMENTS_INVALID = 8227;

	public static final int CFMSTN_LOC_ADDRESS_INVALID = 8228;

	public static final int CFMSTN_LOC_CITY_INVALID = 8229;

	public static final int CFMSTN_SUPPLHR_INVALID = 8230;
	public static final int CFMSTN_SUPPLHR_COMBO_INVALID = 8231;
	public static final int CFMSTN_SUPPLHR_INTERVAL_INVALID = 8232;

	public static final int CFMSTN_SUPPLHR_HOL_INVALID = 8233;
	public static final int CFMSTN_SUPPLHR_HOL_COMBO_INVALID = 8234;
	public static final int CFMSTN_SUPPLHR_HOL_INTERVAL_INVALID = 8235;

	public static final int CFMSTN_AGENCYHR_INVALID = 8236;
	public static final int CFMSTN_AGENCYHR_COMBO_INVALID = 8237;
	public static final int CFMSTN_AGENCYHR_INTERVAL_INVALID = 8238;

	public static final int CFMSTN_AGENCYHR_HOL_INVALID = 8239;
	public static final int CFMSTN_AGENCYHR_HOL_COMBO_INVALID = 8240;
	public static final int CFMSTN_AGENCYHR_HOL_INTERVAL_INVALID = 8241;

	public static final int CFMSTN_OPTL_TITLE_INVALID = 8242;
	public static final int CFMSTN_OPTL_NAME_INVALID = 8243;
	public static final int CFMSTN_OPTL_LOC_INVALID = 8244;
	public static final int CFMSTN_OPTLHR_INVALID = 8245;
	public static final int CFMSTN_OPTLHR_COMBO_INVALID = 8246;
	public static final int CFMSTN_OPTLHR_INTERVAL_INVALID = 8247;

	public static final int CFMSTN_OPTL_OFFICE_PH_INVALID = 8248;

	public static final int CFMSTN_OPTL_CELL_INVALID = 8249;
	public static final int CFMSTN_OPTL_FAX_INVALID = 8250;
	public static final int CFMSTN_OPTL_EMAIL_INVALID = 8251;

	/**
	 * This constant is used to specify history does not exist.
	 * <p>
	 * value = {@value}
	 */
	public static final int NO_HISTORY_EXIST = 1837;

	/**
	 * This constant is used to specify history does not exist.
	 * <p>
	 * value = {@value}
	 */
	public static final int HARD_DELETE_HISTORY_DELETED_SUCCESSFULLY = 1838;

	/**
	 * This constant is used to specify history does not exist.
	 * <p>
	 * value = {@value}
	 */
	public static final int PREFERENCES_DETAILS_NOT_FOUND_FOR_PROFILE = 5010;

	public static final int LOCAL_AWB_INFORMATION_DOES_NOT_EXIST = 8189;

	public static final int LOCAL_AWB_INFORMATION_ALREADY_EXIST = 8190;

	public static final int LOCAL_AWB_INFORMATION_ACK = 8191;

	public static final int LOCAL_OTHER_CHARGE_CODE_DOES_NOT_EXIST = 8192;

	public static final int LOCAL_OTHER_CHARGE_CODE_ALREADY_EXIST = 8193;

	public static final int LOCAL_OTHER_CHARGE_CODE_ACK = 8194;

	public static final int LOCAL_OTHER_CHARGE_SUB_CODE_DOES_NOT_EXIST = 8195;

	public static final int LOCAL_OTHER_CHARGE_SUB_CODE_ALREADY_EXIST = 8196;

	public static final int LOCAL_OTHER_CHARGE_SUB_CODE_ACK = 8197;

	public static final int LOCAL_MANIFEST_CODE_DOES_NOT_EXIST = 8198;

	public static final int LOCAL_MANIFEST_CODE_ALREADY_EXIST = 8199;

	public static final int LOCAL_MANIFEST_CODE_ACK = 8200;

	public static final int LOCAL_OTHER_CHARGE_DBKEY_CODE_IS_MANDATORY = 8252;

	public static final int LOCAL_OTHER_CHARGE_SUB_CODE_DBKEY_IS_MANDATORY = 8253;

	public static final int LOCAL_OTHER_CHARGE_CODE_IS_MANDATORY = 8254;

	public static final int LOCAL_OTHER_CHARGE_SUB_CODE_IS_MANDATORY = 8255;

	public static final int SPL_INS_PROD_SPL_DOES_NOT_EXIST = 8256;
	public static final int SPL_INS_INSTRUCTIONS_INVALID = 8257;
	public static final int STATION_OTHER_SPL_INS_HOURS_INVALID = 8258;
	public static final int GENERAL_EXCEPTION = 8259;

	// Geographic Data Manager -Start
	/**
	 * This constant is used to specify the SpotRate Entry.
	 * <p>
	 * Code does not exists.
	 * <p>
	 * value = {@value}
	 */
	public static final int CODE_DOES_NOT_EXIST = 2001;

	/**
	 * This Constant is used to specify city code does not exist.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_CODE_DOES_NOT_EXIST = 2002;

	/**
	 * This Constant is used to specify airport code does not exist.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AIRPORT_CODE_DOES_NOT_EXIST = 2003;

	/**
	 * This constant is used to verify the existence of the aggregate provided
	 * in other charge rate information.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AGGREGATE_DOES_NOT_EXIST = 2004;

	/**
	 * This Constant is used to specify country code does not exists.
	 * <p>
	 * Value = {@value}
	 */
	public static final int COUNTRY_CODE_DOES_NOT_EXIST = 2005;

	/**
	 * This Constant is used to specify Contract origin and destination are
	 * same.
	 * <p>
	 * Value = {@value}
	 */
	public static final int ORIGIN_DESTINATION_SAME = 2006;

	/**
	 * This Constant is used to specify aggregate is marked for deletion.
	 * <p>
	 * Value = {@value}
	 */
	public static final int AGGREGATE_MARKED_FOR_DELETION = 2007;

	/**
	 * This Constant is used to specify city code is marked for deletion.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CITY_CODE_MARKED_FOR_DELETION = 2008;

	// Geographic Data Manager - End

	// Currency Criteria Manager - Start
	/**
	 * This constant is used to verify the currencu code.
	 * <p>
	 * Failed if currency does not have rounding factor and decimal.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int GLOBAL_CURRENCY_DOES_NOT_HAVE_ROUNDING_AND_DECIMAL = 5101;

	/**
	 * This constant is used to verify the currency code.
	 * <p>
	 * Failed if currency code is marked for deletion.<br>
	 * <p>
	 * Value = {@value}
	 */
	public static final int GLOBAL_CURRENCY_CODE_MARKED_FOR_DELETION = 5102;

	/**
	 * This Constant is used to specify over pivot rate is round off.
	 * <p>
	 * Value = {@value}
	 */
	public static final int OVER_PIVOT_RATE_MUST_BE_ROUNDED_OFF = 5103;

	/**
	 * This Constant is used to specify whether the number of decimal in over
	 * pivot rate and currency same.
	 * <p>
	 * Value = {@value}
	 */
	public static final int NUMBER_OF_DECIMAL_IN_OVER_PIVOT_RATE_AND_CURRENCY_MUST_SAME = 5104;

	/**
	 * This Constant is used to specify whether rate must be round off.
	 * <p>
	 * Value = {@value}
	 */
	public static final int RATE_MUST_BE_ROUNDED_OFF = 5105;

	/**
	 * This Constant is used to specify whether number of decimal in rate and
	 * currency must is same.
	 * <p>
	 * Value = {@value}
	 */
	public static final int NUMBER_OF_DECIMAL_IN_RATE_AND_CURRENCY_MUST_SAME = 5106;

	/**
	 * This Constant is used to specify currency must have rounding factor.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CURRENCY_MUST_HAVE_ROUNDING_FACTOR_AND_DECIMAL = 5107;

	/**
	 * This Constant is used to specify currency code does not match with
	 * currency of origin country.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CURRENCY_CODE_NOT_MATCH_WITH_CURRENCY_OF_ORIGIN_COUNTRY = 5108;

	/**
	 * This Constant is used to specify currency code not exists.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CURRENCY_CODE_DOES_NOT_EXIST = 5109;

	/**
	 * This Constant is used to specify Account Number is mandatory.
	 * <p>
	 * Value = {@value}
	 */
	public static final int ACCOUNT_NUMBER_MANDATORY = 5110;

	/**
	 * This Constant is used to specify Account Number is marked for deletion.
	 * <p>
	 * Value = {@value}
	 */
	public static final int ACCOUNT_NUMBER_MARKED_FOR_DELETION = 5111;

	/**
	 * This Constant is used to specify that the currency's date range is not
	 * valid for the given input date range.
	 * <p>
	 * Value = {@value}
	 */
	public static final int CURRENCY_CODE_WITH_ROUNDING_FACTOR_NOT_VALID_FOR_GIVEN_INPUT_DATE = 917;

	public static final int OFFICE_RESUBMIT_UPDATED_SUCESSFULLY = 5113;

	public static final int RESUBMISSION_FAILURE = 5114;

	public static final int POST_FAILURE = 5115;

	/**
	 * This Constant is used to specify Settlement Method is required for the
	 * given Account Number.
	 * <p>
	 * Value = {@value}
	 */
	public static final int SETTLEMENT_METHOD_REQUIRED = 5116;

	// MH021
	public static final int INVALID_24HRS_TIME_FORMAT = 5117;
	public static final int APS_DAILY_START_TIME_MANDATORY = 5118;
	public static final int APS_DAILY_END_TIME_MANDATORY = 5119;
	public static final int APS_DAILY_START_AND_END_TIME_SHOULD_NOT_BE_SAME = 5120;

	public static final List<CodeMessage> CARRIERACCTNUMBER_NOTEXISTS = null;

	// Currency Criteria Manager - End

	// SK253A
	public static final int INVALID_FBL_TRIGGER_HOURS = 5400;

	/**
	 * <code>Private constructor.</code>
	 */
	private MessageConstants() {

	}

	public static final int ALERT_ACKNOWLEDGED_SUCCESSFULLY = 5402;

	public static final int ALERT_CREATED_SUCCESSFULLY = 5403;

	public static final int ALERT_ID_DOES_NOT_EXIST = 5404;

	public static final int ALERT_ACKNOWLEDGMENT_DOES_NOT_EXIST = 5405;

	public static final int ALERT_UPDATED_SUCCESSFULLY = 5406;
	public static final int ALERT_ID_MANDATORY = 5407;
	public static final int EFFECTIVE_DATE_IS_MANDATORY = 5408;
	public static final int EFFECTIVE_DATE_GREATER_THAN_CURRENT_DATE = 5409;

	public static final int NO_OF_REPEATS_IS_MANDATORY = 5410;

	public static final int MESSAGE_IS_MANDATORY = 5411;

	public static final int EMAIL_SUBJECT_IS_MANDATORY = 5412;
	public static final int ALERT_ID_INVALID = 5413;
	public static final int Alert_DELETED_SUCCESSFULLY = 5414;
	public static final int ALEAST_ONE_STATION_MUST_BE_ENTERED = 5415;
	public static final int ALEAST_ONE_COUNTRY_MUST_BE_ENTERED = 5416;
	public static final int ALEAST_ONE_COUNTRY_AND_STATION_MUST_BE_ENTERED = 5417;
	public static final int ALEAST_ONE_PROFILE_MUST_BE_ENTERED = 5418;

	public static final int NO_ALERTS_FOUND_FOR_FILTERS = 5419;
	public static final int NO_OF_REPEATS_IS_INVALID = 5420;

	public static final int ALERT_MESSAGE_FEATURE_TURNED_OFF = 5421;

	public static final int NO_ALERTS_TO_DISPLAY = 5422;

	public static final int ATLEAST_ONE_ALERT_TYPE_MUST_BE_ENTERED = 5423;

	public static final int ALERT_ID_ALREADY_EXISTS = 5424;

	public static final int NO_ALERTS_FOR_USER = 5425;

	public static final int STATION_NOT_WITHIN_THE_COUNTRY = 5426;

	public static final int FILTER_MATCHES_ONLY_THIS_ALERT = 5427;

	public static final int ENTER_ALERTID_OR_MATCHING_CONDITION = 5428;

	public static final int COUNTRY_CODE_IS_DUPLICATED = 5429;

	public static final int STATION_CODE_IS_DUPLICATED = 5430;

	public static final int ENTER_ALERTID_TO_VIEW_ACKNOWLEDGMENTS = 5431;

	public static final int APPLIES_TO_LOCATION_MANDATORY = 5432;
	// dl638
	public static final int NO_LIST_TO_DISPLAY = 5433;
	public static final int FILTER_MATCHES_ONLY_THIS_COMBINATION = 5434;
    public static final int FILTER_MATCHES_TWO_COMBINATION = 5434;

	public static final int DETAILS_ALREADY_EXISTS = 5435;
    public static final int FUNCTION_ADMIN_PROCESSED_SUCCESSFULLY = 5436;
    public static final int PRODUCT_CODE_IS_MANDATORY=5437;
    public static final int FUNCTION_DELETED_SUCCESSFULLY=5438;
    
    public static final int USER_CREATION_SUCCESSFULL = 5451;
    public static final int USER_CREATION_FAILED = 5452;
    public static final int USER_CONFORMATION_SUCCESSFULL = 5453;
    public static final int USER_CONFORMATION_FAILED = 5454;
    public static final int USER_DELETION_SUCCESSFULL = 5455;
    public static final int USER_DELETION_FAILED = 5456;
    public static final int DUP_USER_CREATION_FAILED = 5457;
    
    public static final int PROFILEID_MANDATORY=5458;
    public static final int USERID_MANDATORY=5459;
    public static final int STATION_MANDATORY=5460;
	/**
	 * This constant is used to specify that the File name is mandatory.<br>
	 * Value ={@value}
	 */
	public static final int SUPPORT_DATA_FILENAME_IS_MANDATORY = 5470;
	
	/**
	 * This constant is used to specify that the File name is incorrect.<br>
	 * Value ={@value}
	 */
	public static final int CONTRACT_UPLOAD_FILENAME_INCORRECT = 5471;
	
	/**
	 * This constant is used to specify that the File name is incorrect.<br>
	 * Value ={@value}
	 */
	public static final int SPOTRATE_UPLOAD_FILENAME_INCORRECT = 5472;
	
	/**
	 * This constant is used to specify that the File name is incorrect.<br>
	 * Value ={@value}
	 */
	public static final int TARIFF_RATE_UPLOAD_FILENAME_INCORRECT = 5473;
	
	/**
	 * This constant is used to specify that the File name is incorrect.<br>
	 * Value ={@value}
	 */
	public static final int AGGREGATE_UPLOAD_FILENAME_INCORRECT = 5474;
	
	/**
	 * This constant is used to specify that the File name is incorrect.<br>
	 * Value ={@value}
	 */
	public static final int PART_GROUP_UPLOAD_FILENAME_INCORRECT = 5475;
	
	/**
	 * This constant is used to specify that the File name is incorrect.<br>
	 * Value ={@value}
	 */
	public static final int STATION_RESTRICTION_UPLOAD_FILENAME_INCORRECT = 5618;
	
	/**
	 * This constant is used to specify that the support data does not exist.
	 * <p>
	 * Value ={@value}
	 */
	public static final int SUPPORT_DATA_DOES_NOT_EXIST = 5476;
	
	public static final int SUPPORT_FILENAME_EXISTS = 5478;
	
	public static final int UPLOAD_IN_PROGRESS = 5479;
	
	public static final int SUPPORT_DATA_FILE_UPLOADED_SUCCESSFULLY = 5480;
	
	public static final int SELECT_A_VALID_CSV_FILE = 5481;

	public static final int FILE_IS_MANDATORY_FOR_UPLOAD = 5482;
	
	public static final int USERID_INVALID = 5483;
	
	public static final int FROMDATE_MANDATORY_FOR_TODATE_INPUT = 5484;
	
	public static final int FILE_SIZE_EXCEEDS_MAXIMUM_SIZE = 5485;
	
	public static final int INVALID_HEADER_FORMAT = 5486; 
	
	public static final int FILENAME_IS_INVALID = 5487;
	
    public static final int STATION_CARRIER_COMBINATION_NOTEXITS = 5450;
    
    public static final int EMAIL_ID_INVALID = 5469;
    
    public static final int SELECT_BATCH_JOB = 5449;
    
    public static final int BATCH_JOB_TRIGGERED = 5447;
    
    public static final int SELECT_BATCH_JOB_AND_EMAIL_ID = 5446;
    
    public static final int ENTER_EMAIL_ID = 5445;
    
    
	public static final int FCTL_UPDATE_UPDATED = 5500;
  
	/**
     * 
     * <p>
     * The FFM message format is invalid, five character new fctl is required.
     * <p>
     * value = {@value}
     */
	public static final int NEW_FCTL = 5505;
	/**
     * 
     * <p>
     * The FFM message format is invalid, five character flight number is required.
     * <p>
     * value = {@value}
     */
	
	public static final int CARRIER_CODE_THREE_CHARACTERS = 178317;
	
	public static final int FLIGHT_NUMBER_THREE_CHARACTERS = 178318;
	
	public static final int VALIDATOR_FLIGHT_NUMBER = 5503;

	public static final int VALIDATOR_NEW_FCTL_OFFICE = 5504;

	public static final int CARRIER_CODE_INVALID = 5501;
	
	public static final int DATE_FORMATE = 5506;
	
	public static final int FLIGHT_NUMBER_MANDATORY =5507;
	
	public static final int FCTL_UPDATE_NOT_EXIST = 5508;
	
	public static final int OLD_FCTL_MANDATORY = 5509;
	
	public static final int NEW_FCTL_MANDATORY = 5510;
	
	public static final int NEW_FCTL_OFFICE_MANDATORY = 5511;
	
	public static final int FCTL_UPDATE_ROW_DELETED = 5512;
	
	public static final int CANCEL_EDIT = 5513;
	
	public static final int ROW_EDIT_CANCEL = 5514;
	
	public static final int ROW_DELETE = 5515;
	
	public static final int ROW_ADD = 5516;
	
	public static final int INPUT_FCTL_FILE_MANDATORY = 5517;
	
	public static final int OLD_FCTL = 5502;
	
	//UIS157
	public static final int VALIDATOR_STATION = 5518;

	public static final int STATION_RESTRICTION_AUTHORITY = 5619;

	public static final int RESTRICTION_OVERLAPPING_EXIST = 5647;

	public static final int STARTDATE_CANNOT_BE_PASTDATE = 5648;

	public static final int INVALID_TIME_RANGE_STATION_RESTRICTION = 5649;

	public static final int FROMDATE_IS_REQUIRES = 5650;

	public static final int ENDDATE_MUST_BE_GREATER_THAN_THE_STARTDATE = 5651;

	public static final int INVALID_STATION_CODE = 5525;

	public static final int STATION_CODE_DOES_NOT_EXIST_1 = 5526;

	public static final int INVALID_PRODUCT_CODE = 5527;

	public static final int PRODUCT_CODE_DOES_NOT_EXIST_1 = 5528;

	public static final int INVALID_CARRIER_CODE_1 = 5529;

	public static final int CARRIER_CODE_DOES_NOT_EXIST = 5530;

	public static final int INVALID_COUNTRY_CODE = 5531;

	public static final int COUNTRY_CODE_DOES_NOT_EXIST_1 = 5532;

	public static final int INVALID_SPL_HANDLING_CODE = 5533;

	public static final int SPL_HANDLING_CODE_DOES_NOT_EXIST = 5534;

	public static final int INVALID_FLIGHT_NUMBER = 5535;

	public static final int INVALID_COMMODITY_CODE = 5536;

	public static final int INVALID_AIRCRAFT_TYPE = 5537;

	public static final int INVALID_AIRCRAFT_REGISTRATION_NUMBER = 5538;


	public static final int STATION_COUNTRY_CONFLICT = 5539;

	public static final int FROM_STATION_FROM_COUNTRY_CONFLICT = 5540;

	public static final int TO_STATION_TO_COUNTRY_CONFLICT = 5541;

	public static final int RESTRICTION_TYPE_MUST_BE_EITHER_EXPORT_TRANSIT_AND_IMPORT = 5542;

	public static final int RESTRICTION_CONDITION_REQUIRED = 5543;

	public static final int ENFORCEMENT_CODE_MUST_BE_EITHER_RES_WAR_ERR_AND_CC = 5544;

	public static final int DIRECTION_MUST_BE_EITHER_UP_DOWN_BOTH = 5545;

	public static final int ONE_STATION_OR_COUNTRY_REQUIRED = 5546;

	public static final int START_DATE_MUST_BE_IN_DDMMMYY_FORMAT = 5547;

	public static final int END_DATE_MUST_BE_IN_DDMMMYY_FORMAT = 5548;

	public static final int STARTDATE_ENDDATE_CANNOT_BE_PASTDATE = 5549;

	public static final int MONDAY_SHOULD_BE_IN_HHMM_HHMM = 5550;

	public static final int TUESDAY_TIME_SHOULD_BE_IN_HHMM_HHMM = 5551;

	public static final int WEDNESDAY_SHOULD_BE_IN_HHMM_HHMM = 5552;

	public static final int THURSDAY_SHOULD_BE_IN_HHMM_HHMM = 5553;

	public static final int FRIDAY_SHOULD_BE_IN_HHMM_HHMM = 5554;

	public static final int SATURDAY_SHOULD_BE_IN_HHMM_HHMM = 5555;

	public static final int SUNDAY_SHOULD_BE_IN_HHMM_HHMM = 5556;

	public static final int START_TIME_SHOULD_BE_IN_HHMM = 5557;

	public static final int END_TIME_SHOULD_BE_IN_HHMM = 5558;

	public static final int PARTICIPANT_ACCOUNT_MUST_NOT_BE = 5559;

	public static final int WEIGHT_SHOULD_BE_PROPER = 5560;

	public static final int WEIGHT_UNIT_SHOULD_BE_PROPER = 5561;

	public static final int DIMENSION_SHOULD_BE_PROPER = 5562;

	public static final int DIMENSION_UNIT_SHOULD_BE_PROPER = 5563;

	public static final int SHIPMENT_IMPACTED_EITHER_ALL_OR_NOT_ACCEPTED = 5564;

	public static final int ALERT_MUST_BE_IN_PROPER_FORMAT = 5565;

	public static final int ALL_VALUE_SHOULD_BE_VALID = 5566;

	public static final int AGENT_VALUE_SHOULD_BE_VALID = 5567;

	public static final int SHIPPER_VALUE_SHOULD_BE_VALID = 5568;

	public static final int FORWARDER_VALUE_SHOULD_BE_VALID = 5569;

	public static final int BILL_SHIPPER_VALUE_SHOULD_BE_VALID = 5570;

	public static final int BILL_CONSIGNEE_VALUE_SHOULD_BE_VALID = 5571;

	public static final int WORLD_VALUE_SHOULD_BE_VALID = 5572;

	public static final int ATLEASET_ONE_STATION_SHOULD_BE_THERE = 5573;

	public static final int EXCEPT_STATION_SHOULD_BE_Y_OR_N = 5574;

	public static final int ATLEASET_ONE_TO_STATION_SHOULD_BE_THERE = 5575;

	public static final int EXCEPT_TO_STATION_SHOULD_BE_Y_OR_N = 5576;

	public static final int ATLEASET_ONE_FROM_STATION_SHOULD_BE_THERE = 5577;

	public static final int EXCEPT_FROM_STATION_SHOULD_BE_Y_OR_N = 5578;

	public static final int ATLEASET_ONE_COUNTRY_SHOULD_BE_THERE = 5579;

	public static final int EXCEPT_COUNTRY_SHOULD_BE_Y_OR_N = 5580;

	public static final int ATLEASET_ONE_TO_COUNTRY_SHOULD_BE_THERE = 5581;

	public static final int EXCEPT_TO_COUNTRY_SHOULD_BE_Y_OR_N = 5582;

	public static final int ATLEASET_ONE_FROM_COUNTRY_SHOULD_BE_THERE = 5583;

	public static final int EXCEPT_FROM_COUNTRY_SHOULD_BE_Y_OR_N = 5584;

	public static final int ATLEASET_ONE_CARRIER_SHOULD_BE_THERE = 5585;

	public static final int EXCEPT_CARRIER_SHOULD_BE_Y_OR_N = 5586;

	public static final int ATLEASET_ONE_FLIGHT_SHOULD_BE_THERE = 5587;

	public static final int EXCEPT_FLIGHT_SHOULD_BE_Y_OR_N = 5588;

	public static final int ATLEASET_ONE_AIRCRAFT_TYPE_SHOULD_BE_THERE = 5589;

	public static final int EXCEPT_AIRCRAFT_TYPE_SHOULD_BE_Y_OR_N = 5590;

	public static final int ATLEASET_ONE_AIRCRAFT_REGISTARTION_NUMBER_SHOULD_BE_THERE = 5591;

	public static final int EXCEPT_AIRCRAFT_REGISTARTION_NUMBER_SHOULD_BE_Y_OR_N = 5592;

	public static final int ATLEASET_ONE_COMMODITY_CODE_SHOULD_BE_THERE = 5593;

	public static final int EXCEPT_COMMODITY_CODE_SHOULD_BE_Y_OR_N = 5594;

	public static final int ATLEASET_ONE_PRODUCT_CODE_SHOULD_BE_THERE = 5595;

	public static final int EXCEPT_PRODUCT_CODE_SHOULD_BE_Y_OR_N = 5596;

	public static final int ATLEASET_ONE_SPL_CODE_SHOULD_BE_THERE = 5597;

	public static final int EXCEPT_SPL_CODE_SHOULD_BE_Y_OR_N = 5598;

	public static final int RESTRICTION_TYPE_IS_REQUIRED = 5599;

	public static final int CONDITION_IS_REQUIRED = 5600;

	public static final int STARTDATE_IS_REQUIRED = 5601;

	public static final int MISSING_STATION_EXCPETION = 5602;

	public static final int MISSING_COUNTRY_EXCPETION = 5603;

	public static final int MISSING_TO_STATION_EXCPETION = 5604;

	public static final int MISSING_FROM_STATION_EXCPETION = 5605;

	public static final int MISSING_TO_COUNTRY_EXCPETION = 5606;

	public static final int MISSING_FROM_COUNTRY_EXCPETION = 5607;

	public static final int MISSING_CARRIERS_EXCPETION = 5608;

	public static final int MISSING_FLIGHT_EXCPETION = 5609;

	public static final int MISSING_AIR_CRAFTTYPE_EXCPETION = 5610;

	public static final int MISSING_AIR_REG_EXCPETION = 5611;

	public static final int MISSING_PRODUCT_CODE_EXCPETION = 5612;

	public static final int MISSING_SPL_CODE_EXCPETION = 5613;

	public static final int MISSING_COMM_CODE_EXCPETION = 5614;

	public static final int CARRIER_OR_STATION_OR_COUNTRY_IS_REQUIRED = 5615;

	public static final int ENDDATE_CANNOT_BE_GREATER_THAN_ALLOWABLE_DAYS = 5616;

	public static final int VALID_FROM_TO_TIME = 5617;

	public static final int ATLEASET_ONE_SPL_ALERT_GROUP_SHOULD_BE_THERE = 5620;

	public static final int EXCEPT_SPL_ALERT_GROUP_SHOULD_BE_Y_OR_N = 5621;

	public static final int DIRECTION_NOT_APPLICABLE_FOR_IMPORT_OR_EXPORT = 5622;

	public static final int FROM_STATION_NOT_APPLICABLE_FOR_EXPORT_RESTRICTION = 5623;

	public static final int TO_STATION_NOT_APPLICABLE_FOR_IMPORT_RESTRICTION = 5624;

	public static final int COLLECT_CHARGES_NOT_APPLICABLE_FOR_EXPORT_AND_TRANSIT_RESTRICTIONS = 5625;

	public static final int WORLD_CANNOT_BE_ENTERED_WHEN_STATION_OR_COUNTRY_IS_ENTERED = 5626;

	public static final int INPUT_STATION_COUNT_CANNOT_BE_MORE_THAN_40 = 5627;

	public static final int INPUT_FROM_STATION_COUNT_CANNOT_BE_MORE_THAN_20 = 5628;

	public static final int INPUT_TO_STATION_COUNT_CANNOT_BE_MORE_THAN_20 = 5629;

	public static final int INPUT_CARRIER_COUNT_CANNOT_BE_MORE_THAN_20 = 5630;

	public static final int INPUT_AIRCRAFT_TYPE_COUNT_CANNOT_BE_MORE_THAN_20 = 5631;

	public static final int INPUT_PRODUCT_CODE_COUNT_CANNOT_BE_MORE_THAN_20 = 5632;

	public static final int INPUT_COMMODITY_CODE_COUNT_CANNOT_BE_MORE_THAN_20 = 5633;

	public static final int INPUT_COUNTRY_COUNT_CANNOT_BE_MORE_THAN_20 = 5634;

	public static final int INPUT_FROM_COUNTRY_COUNT_CANNOT_BE_MORE_THAN_20 = 5635;

	public static final int INPUT_TO_COUNTRY_COUNT_CANNOT_BE_MORE_THAN_20 = 5636;

	public static final int INPUT_FLIGHT_COUNT_CANNOT_BE_MORE_THAN_20 = 5637;

	public static final int INPUT_AIRCRAFT_REGISTRATION_NUMBER_COUNT_CANNOT_BE_MORE_THAN_20 = 5638;

	public static final int INPUT_SPL_CODES_COUNT_CANNOT_BE_MORE_THAN_20 = 5639;

	public static final int INPUT_SPL_ALERT_GROUP_COUNT_CANNOT_BE_MORE_THAN_20 = 5640;

	public static final int STATION_RESTRICTION_WARNING = 9080;
	public static final int ONLY_EXPIRED_OR_FUTURE_EFFECTIVE_RESTRICTION_CAN_BE_DELETED = 5641;

	public static final int ONLY_EXPIRATION_DATE_CAN_BE_UPDATED = 5642;

	public static final int EXPIRATION_DATE_AND_DAYS_OF_WEEK_CAN_BE_UPDATED = 5643;

	public static final int SYSTEM_UNABLE_TO_IDENTIFY_UNIQUE_RECORD = 5644;
	
	public static final int EXPORT_STATION_PROHIBITED = 9090;
	
	public static final int IMPORT_STATION_PROHIBITED = 9091;
	
	public static final int TRANSIT_STATION_PROHIBITED = 9092;
	
	public static final int RESTRICTION_REMARKS = 9093;

	public static final int COMMODITY_CODE_DOES_NOT_EXIST = 5645;

	public static final int NOT_A_VALID_ACTION_TYPE = 5646;

	public static final int DIRECTION_SHOULD_BE_BOTH_FOR_RESTRICTION_AND_WARNING_CONDITIONS = 5652;

	public static final int ENTER_VALID_TIME_RANGE = 5653;

	//UIS157
	public static final int SELECT_SUPPORT_DATA_TYPE = 11344;

	public static final int FILE_NAME_IS_MANDATORY_FOR_TARGETS_UPLOAD = 11345;

	public static final int TARGET_FILE_UPLOAD_SUCCESSFUL = 11346;

	public static final int SELECT_A_VALID_CSV_FILE_STATION_RES = 11347;

	public static final int FILE_UPLOAD_SUCCESSFULLY = 11348;

	public static final int ACTIVE_ALLOTMENT_UPDATE_SUCCESSFUL = 11349;

	public static final int ENTER_A_VALID_USER_ID = 11350;

	public static final int ENTER_A_VALID_STATION = 11351;

	public static final int FROM_DATE_CANNOT_BE_LATER_THAN_TO_DATE = 11352;

	public static final int FILE_LENGTH_INVALID = 11353;

	public static final int INVALID_FILE_SIZE = 11354;
	
	public static final int STATION_RESTRICTIONS_CACHE_RESET_EXCEPTION = 11355;

	public static final int NO_RECORDS_FOUND = 15000;
	//UIS157

	public static final int MAXIMUM_STICKY_NOTES_24 = 5519;

    
	public static final int STATION_REQUIRED = 5520;
	
	public static final int FUNCTION_REQUIRED = 5521;
	
	public static final int FUNCTION_NAME_INVALID = 5522;
	
	public static final int FUNCTION_CODE_INVALID = 5523;
	
	public static final int LANGUAGE_REQUIRED = 5524;
	
	// LMSC-11111 UIS158 Start
	public static final int PAGE_INVALID = 1927;
	public static final int FIELD_ID_INVALID = 1928;
	public static final int FIELD_DOESNT_EXIST = 1923;
	public static final int TRANSLATION_DOESNT_EXISTS = 1921;
	public static final int MESSAGE_LANGUAGE_MANDATORY = 1916;
	public static final int PAGE_MANDATORY = 1926;
	public static final int FIELD_ID_MANDATORY = 1925;
	public static final int FIELD_ID_TYPE_MANDATORY = 1929;
	public static final int PARTICIPANT_NAME_NOT_EXIST = 8533; //LMS-69979 && LMSC-11132 UIS158
	// LMSC-11111 UIS158 End
	
	public static final int STATION_AND_COUNTRY_CONFLICT = 11356;

	public static final int FROM_STATION_AND_FROM_COUNTRY_CONFLICT = 11357;

	public static final int TO_STATION_AND_TO_COUNTRY_CONFLICT = 11358;
}
