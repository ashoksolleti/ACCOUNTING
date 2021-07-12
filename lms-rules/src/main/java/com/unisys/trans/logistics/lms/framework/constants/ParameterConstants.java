/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/* All rights reserved. */
/* UNISYS CONFIDENTIAL */
/* ====================================== */

package com.unisys.trans.logistics.lms.framework.constants;

/**
 * <code>ParameterConstants</code> class maintains the list of runtime parameter
 * constants for LMS NG.
 */


public final class ParameterConstants {

	/**
	 * This constant denotes a runtime parameter that specifies if air waybill
	 * capture is required at flight assignment time.
	 * <p>
	 * <b>Possible runtime parameter values:</b>
	 * <ul>
	 * <li>N <br>
	 * No mandatory air waybill capture at flight assignment time.
	 * <li>H <br>
	 * Mandatory air waybill capture for host flights only.
	 * <li>A <br>
	 * Mandatory air waybill capture for all flights.
	 * <li>C <br>
	 * Mandatory air waybill capture for all air waybills assigned to flights
	 * operated by carriers that have �SDC Required� attribute set to �Y�.
	 * </ul>
	 * <p>
	 * value = {@value}
	 */
	public static final String AIRWAYBILL_CAPTURE = "AIRWAYBILL_CAPTURE";
	public static final String CARGO_LOYAL_INDICATOR = "CARGO_LOYALTY_MANAGEMENT";
	public static final String PARTS = "PARTS";

	/**
	 * This constant denotes a runtime parameter that specifies the
	 * configuration value for the AWB capture station authority.
	 * <p>
	 * <b>Possible runtime parameter values:</b>
	 * <ul>
	 * <li><code> 0 </code><br>
	 * Air waybill capture is restricted to stations that are in the air waybill
	 * routing.
	 * <li><code> 1 </code><br>
	 * Air waybill capture can be performed by following:
	 * <ul>
	 * <li>Stations that are in the air waybill routing.
	 * <li>Tariff rating station defined for the stations present in the air
	 * waybill routing.
	 * <li>IATA agents' station or its equivalent station.
	 * <li>Forwarders' station or its equivalent station.
	 * <li>Station that did export quality audit.
	 * </ul>
	 * <li><code> 2 </code><br>
	 * Air waybill capture can be performed by any station.
	 * </ul>
	 * <p>
	 * Value = {@value}
	 */
	public static final String AIRWAYBILL_CAPTURE_STATION_AUTHORITY = "AIRWAYBILL_CAPTURE_STATION_AUTHORITY";

	/**
	 * This constant holds parameter to maintain the airwaybill for spot rates.
	 *
	 * <p>
	 * Value = {@value}
	 */

	public static final String AIRWAYBILL_FOR_SPOTRATES = "AIRWAYBILL_FOR_SPOTRATES";

	/**
	 * This constant denotes a runtime parameter that defines if the Flight
	 * Finalization function can automatically close the flight or not..
	 * <p>
	 * <ul>
	 * <li><code> 0 </code><br>
	 * Flight Finalization cannot automatically close the flight.
	 * <li><code> 1 </code><br>
     * Flight Finalization can automatically close the flight.
     * </ul>
     * value = {@value}
	 */
	public static final String ALLOW_FLIGHT_CLOSE_DURING_FLIGHT_FINALIZATION = "ALLOW_FLIGHT_CLOSE_DURING_FLIGHT_FINALIZATION";

	/**
	 * This constant holds whether to allow indefinite expiry date.
	 * <p>
	 * Value = {@value}
	 */
	public static final String ALLOW_INDEFINITE_EXPIRY_DATE = "ALLOW_INDEFINITE_EXPIRY_DATE";

	/**
	 * This constant holds the runtime parameter that indicates the number of
	 * future allowable days from current date.
	 * <p>
	 * Value = {@value}
	 */
	public static final String ALLOWABLE_DAYS = "ALLOWABLE_DAYS";

	/**
	 * This constant denotes a run-time parameter which identifies whether
	 * <code>OtherChargeDescription</code> for an air waybill can be entered or
	 * not.
	 * <p>
	 * <b>Possible runtime parameter values:</b>
	 * <ul>
	 * <li><code> 0 </code><br>
	 * Other charge descriptions are not mandatory.
	 * <li><code> 1 </code><br>
	 * Other charge descriptions are mandatory. The system always retrieves the
	 * description from the other charge subcode or from the other charge code
	 * table.
	 * <li><code> 2 </code><br>
	 * Other charge descriptions are mandatory. Either the actor has to provide
	 * it or the system retrieves the description from the other charge subcode
	 * or from the other charge code table.
	 * </ul>
	 * <p>
	 * Value = {@value}
	 */
	public static final String ALLOWABLE_DESCRIPTION = "ALLOWABLE_DESCRIPTION";

	/**
	 * This constant denotes a run-time parameter which defines the effective
	 * date that could be allowed.
	 * <p>
	 * <b>Possible runtime parameter values:</b>
	 * <ul>
	 * <li><code>1</code><br>
	 * The effective date must be later than today�s date.
	 * <li><code>0</code><br>
	 * The effective date must be equal or later than today�s date.
	 * </ul>
	 * <p>
	 * Value = {@value}
	 */
	public static final String ALLOWABLE_EFFECTIVE_DATE = "ALLOWABLE_EFFECTIVE_DATE";

	/**
	 * This constant denotes a run-time parameter which is used to Control the
	 * display and authority check for Flight's Restriction Controlling Station
	 * (RCTL)and Flight Controlling Station (FCTL) for Flight Booking
	 * Restrictions.
	 * <p>
	 * <ul>
	 * <li><code> 0 </code><br>
	 * Use the user's authority. Do not display RCTL, FCTL or Hours before FCTL
	 * update.
	 * <li><code> 1 </code><br>
     * Display and use RCTL and FCTL for Flight Booking Restrictions check.
     * </ul>
     * Value ={@value}
	 */
	public static final String ALLOWABLE_RCTL_AND_FCTL_AUTHORITY_CHECK = "ALLOWABLE_RCTL_AND_FCTL_AUTHORITY_CHECK";

	/**
	 * This constant denotes a run-time parameter which determines whether the
	 * agent has the authority to enter the pieces or let the system calculate
	 * the pieces.
	 * <p>
	 * <b>Possible runtime parameter values:</b>
	 * <ul>
	 * <li>Y <br>
	 * Agent need not enter the pieces. The system calculates the pieces if
	 * pieces not entered.
	 * <li>N <br>
	 * Agent must enter the pieces.
	 * </ul>
	 * <p>
	 * value = {@value}
	 */
	public static final String AUTHORITY_TO_PROVIDE_DEFAULT_PIECES = "AUTHORITY_TO_PROVIDE_DEFAULT_PIECES";

	/**
	 * This constant denotes a runtime parameter that controls automatic
	 * confirmations of space protection during allotment create/update for
	 * users' for whom the authority function �Non-Flight Control Station
	 * Allotment Space Authorization� is enabled.
	 * <p>
	 * <b>Possible runtime parameter values:</b>
	 * <ul>
	 * <li>Y <br>
	 * Auto Confirm the space request.
	 * <li>N <br>
	 * Do not auto confirm the space request and manual input of �FC� is
	 * required.
	 * </ul>
	 * <p>
	 * Value ={@value}
	 */
	public static final String AUTO_CONFIRMATION_FOR_NON_FLIGHT_CONTROL_STATION = "AUTO_CONFIRMATION_FOR_NON_FLIGHT_CONTROL_STATION";

	/**
	 * This constant denotes a runtime parameter that specifies if a container
	 * can be closed automatically by the Flight Finalization function.
	 * <p>
	 * <b>Possible runtime parameter values:</b>
	 * <ul>
	 * <li>Y <br>
	 * Flight Finalization can close containers automatically.
	 * <li>N <br>
	 * Flight Finalization cannot close containers automatically.
	 * </ul>
	 * <p>
	 * value = {@value}
	 */
	public static final String AUTOMATIC_CONTAINER_CLOSE_ON_FLIGHT_FINALIZATION = "AUTOMATIC_CONTAINER_CLOSE_ON_FLIGHT_FINALIZATION";

	/**
	 * This constant denotes a runtime parameter that specifies if an automatic
	 * offload carrier code change to the flight carrier code can be attempted
	 * at flight assignment time.
	 * <p>
	 * <b>Possible runtime parameter values:</b>
	 * <li>Y <br>
	 * Attempt to change offload carrier code to flight carrier code.
	 * <li>N <br>
	 * No automatic offload carrier code change.
	 * <p>
	 * value = {@value}
	 */
	public static final String AUTOMATIC_OFFLOAD_CARRIER_CODE_CHANGE_INDICATOR = "AUTOMATIC_OFFLOAD_CARRIER_CODE_CHANGE_INDICATOR";

	/**
	 * This constant denotes a runtime parameter that specifies the average
	 * density factor in kilogram per cubic meter.
	 * <p>
	 * Value = {@value}
	 */
	public static final String AVERAGE_DENSITY_FACTOR = "AVERAGE_DENSITY_FACTOR";

	/**
	 * This constant is used as a control parameter to define the Central
	 * Teletype address of the Host airline for the external system.
	 * <p>
	 * Value = {@value}
	 */
	public static final String CENTRAL_TTY_ADDRESS_EXTERNAL_SYSTEM = "CENTRAL_TTY_ADDRESS_EXTERNAL_SYSTEM";

	/**
	 * This constant is used as a control parameter to define the host�s Central
	 * receiving Teletype address of the ISM system.
	 * <p>
	 * Value = {@value}
	 */
	public static final String CENTRAL_TTY_ADDRESS_ISM_SYSTEM = "CENTRAL_TTY_ADDRESS_ISM_SYSTEM";

	/**
	 * This constant denotes a runtime parameter which specifies the office of
	 * the central teletype address.
	 * <p>
	 * Value = {@value}
	 */
	public static final String CENTRAL_TTY_OFFICE_CODE = "CENTRAL_TTY_OFFICE_CODE";

	/**
	 * This constant denotes a runtime parameter which specifies the station of
	 * the central teletype address.
	 * <p>
	 * Value = {@value}
	 */
	public static final String CENTRAL_TTY_STATION_CODE = "CENTRAL_TTY_STATION_CODE";

	/**
	 * This constant holds the parameter for charter product.
	 * <p>
	 * Value = {@value}
	 */
	public static final String CHARTER_PRODUCT_CODE = "CHARTER_PRODUCT_CODE";

	/**
	 * This constant holds parameter to maintain the commodity code for Spot
	 * Rates.
	 * <p>
	 * Value = {@value}
	 */
	public static final String COMMODITY_CODE_FOR_SPOTRATES = "COMMODITY_CODE_FOR_SPOTRATES";

	/**
	 * This constant holds the parameter for company material product.
	 * <p>
	 * Value = {@value}
	 */
	public static final String COMPANY_MATERIAL_PRODUCT = "COMPANY_MATERIAL_PRODUCT";

	/**
	 * This constant holds the value of defauylt expiry dates.
	 * <p>
	 * Value = {@value}
	 */
	public static final String CONTRACT_DEFAULT_EXPIRY_DAYS = "CONTRACT_DEFAULT_EXPIRY_DAYS";

	/**
	 * This constant holds a runtime parameter which identifies whether the
	 * European Customs status is automatically generated.
	 * <p>
	 * Value = {@value}
	 */
	public static final String CONTROL_AUTO_GENERATE_EUROPEAN_CUSTOMS_STATUS_X = "CONTROL_AUTO_GENERATE_EUROPEAN_CUSTOMS_STATUS_X";

	/**
	 * This constant holds a runtime parameter which identifies whether the
	 * European Customs status is manually entered.
	 * <p>
	 * Value = {@value}
	 */
	public static final String CONTROL_MANUAL_ENTRY_EUROPEAN_CUSTOMS_STATUS = "CONTROL_MANUAL_ENTRY_EUROPEAN_CUSTOMS_STATUS";

	/**
	 * This constant denotes a runtime parameter which is used to check if
	 * participant country name is required.
	 * <p>
	 * <b>Possible runtime parameter values:</b>
	 * <ul>
	 * <li>Y <br>
	 * The country name is required.
	 * <li>N <br>
	 * The country name is not required.
	 * </ul>
	 * <p>
	 * value = {@value}
	 */
	public static final String COUNTRY_REQUIRED_INDICATOR = "COUNTRY_REQUIRED_INDICATOR";

	/**
	 * This constant determines the type of credit limit used.
	 * <p>
	 * Value ={@value}
	 */
	public static final String CREDIT_LIMIT_TYPE = "CREDIT_LIMIT_TYPE";

	/**
	 * This constant denotes a run-time parameter that defines the decimal
	 * position for currency.
	 * <p>
	 * Value = {@value}
	 */
	public static final String CURRENCY_DECIMAL_POSITION = "CURRENCY_DECIMAL_POSITION";

	/**
	 * This constant denotes a runtime parameter that defines the default
	 * rounding factor for currency. Its value varies from 0.00001 to 100.
	 * <p>
	 * Value = {@value}
	 */
	public static final String CURRENCY_ROUNDING_FACTOR = "CURRENCY_ROUNDING_FACTOR";

	/**
	 * This constant denotes a runtime parameter that defines the number of days
	 * before master allotment deletion.
	 * <p>
	 * value = {@value}
	 */
	public static final String DAYS_BEFORE_MASTER_ALLOTMENT_DELETION = "DAYS_BEFORE_MASTER_ALLOTMENT_DELETION";

	/**
	 * This constant denotes a runtime parameter which defines the default
	 * export location.
	 * <p>
	 * Value = {@value}
	 */
	public static final String DEFAULT_EXPORT_LOCATION = "DEFAULT_EXPORT_LOCATION";

	/**
	 * This constant denotes a runtime parameter that defines the configuration
	 * value for the default host currency code.
	 * <p>
	 * Value = {@value}
	 */
	public static final String DEFAULT_HOST_CURRENCY_CODE = "DEFAULT_HOST_CURRENCY_CODE";

	/**
	 * This constant denotes a runtime parameter that defines the default
	 * message options for FAD.
	 * <p>
	 * <b>Possible runtime parameter values:</b>
	 * <ul>
	 * <li><u>1st Character:</u> Message Accept Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Accepted.
	 * <li><code> N </code><br>
	 * Not accepted.
	 * </ul>
	 * <li><u>2nd Character:</u> Incoming double signature (DS) Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Host DS accepted.
	 * <li><code> N </code><br>
	 * Host DS Not accepted.
	 * </ul>
	 * <li><u>3rd Character:</u> Outgoing double signature (DS).
	 * <ul>
	 * <li><code> F </code><br>
	 * FLT and ACN.
	 * <li><code> A </code><br>
	 * Last 2 characters of TTY Address.
	 * <li>Blank indicates no DS.
	 * </ul>
	 * </ul>
	 * <p>
	 * Value = {@value}
	 */
	public static final String DEFAULT_MESSAGE_OPTIONS_FOR_FAD = "DEFAULT_MESSAGE_OPTIONS_FOR_FAD";

	/**
	 * This constant denotes a runtime parameter that defines the default
	 * message options for FBL.
	 * <p>
	 * <b>Possible runtime parameter values:</b>
	 * <ul>
	 * <li><u>1st Character:</u> Message Accept Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Accepted.
	 * <li><code> N </code><br>
	 * Not accepted.
	 * </ul>
	 * <li><u>2nd Character:</u> Incoming double signature (DS) Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Host DS accepted.
	 * <li><code> N </code><br>
	 * Host DS Not accepted.
	 * </ul>
	 * <li><u>3rd Character:</u> Outgoing double signature (DS).
	 * <ul>
	 * <li><code> F </code><br>
	 * FLT and ACN.
	 * <li><code> A </code><br>
	 * Last 2 characters of TTY Address.
	 * <li>Blank indicates no DS.
	 * </ul>
	 * </ul>
	 * <p>
	 * Value = {@value}
	 */
	public static final String DEFAULT_MESSAGE_OPTIONS_FOR_FBL = "DEFAULT_MESSAGE_OPTIONS_FOR_FBL";

	/**
	 * This constant denotes a runtime parameter that defines the default
	 * message options for FBR.
	 * <p>
	 * <b>Possible runtime parameter values:</b>
	 * <ul>
	 * <li><u>1st Character:</u> Message Accept Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Accepted.
	 * <li><code> N </code><br>
	 * Not accepted.
	 * </ul>
	 * <li><u>2nd Character:</u> Incoming double signature (DS) Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Host DS accepted.
	 * <li><code> N </code><br>
	 * Host DS Not accepted.
	 * </ul>
	 * <li><u>3rd Character:</u> Outgoing double signature (DS).
	 * <ul>
	 * <li><code> F </code><br>
	 * FLT and ACN.
	 * <li><code> A </code><br>
	 * Last 2 characters of TTY Address.
	 * <li>Blank indicates no DS.
	 * </ul>
	 * </ul>
	 * <p>
	 * Value = {@value}
	 */
	public static final String DEFAULT_MESSAGE_OPTIONS_FOR_FBR = "DEFAULT_MESSAGE_OPTIONS_FOR_FBR";

	/**
	 * This constant denotes a runtime parameter that defines the default
	 * message options for FFA.
	 * <p>
	 * <b>Possible runtime parameter values:</b>
	 * <ul>
	 * <li><u>1st Character:</u> Message Accept Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Accepted.
	 * <li><code> N </code><br>
	 * Not accepted.
	 * </ul>
	 * <li><u>2nd Character:</u> Incoming double signature (DS) Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Host DS accepted.
	 * <li><code> N </code><br>
	 * Host DS Not accepted.
	 * </ul>
	 * <li><u>3rd Character:</u> Outgoing double signature (DS).
	 * <ul>
	 * <li><code> F </code><br>
	 * FLT and ACN.
	 * <li><code> A </code><br>
	 * Last 2 characters of TTY Address.
	 * <li>Blank indicates no DS.
	 * </ul>
	 * <li><u>4th Character:</u>.
	 * <ul>
	 * <li><code> H </code><br>
	 * Do not send HK and HL FFA.
	 * <li>Blank indicates send HK and HL FFA.
	 * </ul>
	 * </ul>
	 * <p>
	 * Value = {@value}
	 */
	public static final String DEFAULT_MESSAGE_OPTIONS_FOR_FFA = "DEFAULT_MESSAGE_OPTIONS_FOR_FFA";

	/**
	 * This constant denotes a runtime parameter that defines the default
	 * message options for FFM.
	 * <p>
	 * <b>Possible runtime parameter values:</b>
	 * <ul>
	 * <li><u>1st Character:</u> Message Accept Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Accepted.
	 * <li><code> N </code><br>
	 * Not accepted.
	 * </ul>
	 * <li><u>2nd Character:</u> Incoming double signature (DS) Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Host DS accepted.
	 * <li><code> N </code><br>
	 * Host DS Not accepted.
	 * </ul>
	 * <li><u>3rd Character:</u> Outgoing double signature (DS).
	 * <ul>
	 * <li><code> F </code><br>
	 * FLT and ACN.
	 * <li><code> A </code><br>
	 * Last 2 characters of TTY Address.
	 * <li>Blank indicates no DS.
	 * </ul>
	 * <li><u>4th Character:</u>.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Skip NIL FFM.
	 * <li><code> N </code><br>
	 * Send NIL FFM.
	 * <li>Blank indicates send NIL FFA.
	 * </ul>
	 * </ul>
	 * <p>
	 * Value = {@value}
	 */
	public static final String DEFAULT_MESSAGE_OPTIONS_FOR_FFM = "DEFAULT_MESSAGE_OPTIONS_FOR_FFM";

	/**
	 * This constant denotes a runtime parameter that defines the default
	 * message options for FFR.
	 * <p>
	 * <b>Possible runtime parameter values:</b>
	 * <ul>
	 * <li><u>1st Character:</u> Message Accept Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Accepted.
	 * <li><code> N </code><br>
	 * Not accepted.
	 * </ul>
	 * <li><u>2nd Character:</u> Incoming double signature (DS) Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Host DS accepted.
	 * <li><code> N </code><br>
	 * Host DS Not accepted.
	 * </ul>
	 * <li><u>3rd Character:</u> Outgoing double signature (DS).
	 * <ul>
	 * <li><code> F </code><br>
	 * FLT and ACN.
	 * <li><code> A </code><br>
	 * Last 2 characters of TTY Address.
	 * <li>Blank indicates no DS.
	 * </ul>
	 * <li><u>4th Character:</u>.
	 * <ul>
	 * <li><code> D </code><br>
	 * Include XX segment information in FFA response.
	 * <li>Blank indicates not to include XX segment information in FFA
	 * response.
	 * </ul>
	 * </ul>
	 * <p>
	 * Value = {@value}
	 */
	public static final String DEFAULT_MESSAGE_OPTIONS_FOR_FFR = "DEFAULT_MESSAGE_OPTIONS_FOR_FFR";

	/**
	 * This constant denotes a runtime parameter that defines the default
	 * message options for FHL.
	 * <p>
	 * <b>Possible runtime parameter values:</b>
	 * <ul>
	 * <li><u>1st Character:</u> Message Accept Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Accepted.
	 * <li><code> N </code><br>
	 * Not accepted.
	 * </ul>
	 * <li><u>2nd Character:</u> Incoming double signature (DS) Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Host DS accepted.
	 * <li><code> N </code><br>
	 * Host DS Not accepted.
	 * </ul>
	 * <li><u>3rd Character:</u> Outgoing double signature (DS).
	 * <ul>
	 * <li><code> F </code><br>
	 * FLT and ACN.
	 * <li><code> A </code><br>
	 * Last 2 characters of TTY Address.
	 * <li>Blank indicates no DS.
	 * </ul>
	 * <li><u>4th Character:</u>.
	 * <ul>
	 * <li><code> T </code><br>
	 * Typical.
	 * <li><code> E </code><br>
	 * Extended.
	 * <li><code> S </code><br>
	 * Shipper information.
	 * </ul>
	 * </ul>
	 * <p>
	 * Value = {@value}
	 */
	public static final String DEFAULT_MESSAGE_OPTIONS_FOR_FHL = "DEFAULT_MESSAGE_OPTIONS_FOR_FHL";

	/**
	 * This constant denotes a runtime parameter that defines the default
	 * message options for FMA.
	 * <p>
	 * <b>Possible runtime parameter values:</b>
	 * <ul>
	 * <li><u>1st Character:</u> Message Accept Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Accepted.
	 * <li><code> N </code><br>
	 * Not accepted.
	 * </ul>
	 * <li><u>2nd Character:</u> Incoming double signature (DS) Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Host DS accepted.
	 * <li><code> N </code><br>
	 * Host DS Not accepted.
	 * </ul>
	 * <li><u>3rd Character:</u> Outgoing double signature (DS).
	 * <ul>
	 * <li><code> F </code><br>
	 * FLT and ACN.
	 * <li><code> A </code><br>
	 * Last 2 characters of TTY Address.
	 * <li>Blank indicates no DS.
	 * </ul>
	 * </ul>
	 * <p>
	 * Value = {@value}
	 */
	public static final String DEFAULT_MESSAGE_OPTIONS_FOR_FMA = "DEFAULT_MESSAGE_OPTIONS_FOR_FMA";

	/**
	 * This constant denotes a runtime parameter that defines the default
	 * message options for FNA.
	 * <p>
	 * <b>Possible runtime parameter values:</b>
	 * <ul>
	 * <li><u>1st Character:</u> Message Accept Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Accepted.
	 * <li><code> N </code><br>
	 * Not accepted.
	 * </ul>
	 * <li><u>2nd Character:</u> Incoming double signature (DS) Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Host DS accepted.
	 * <li><code> N </code><br>
	 * Host DS Not accepted.
	 * </ul>
	 * <li><u>3rd Character:</u> Outgoing double signature (DS).
	 * <ul>
	 * <li><code> F </code><br>
	 * FLT and ACN.
	 * <li><code> A </code><br>
	 * Last 2 characters of TTY Address.
	 * <li>Blank indicates no DS.
	 * </ul>
	 * </ul>
	 * <p>
	 * Value = {@value}
	 */
	public static final String DEFAULT_MESSAGE_OPTIONS_FOR_FNA = "DEFAULT_MESSAGE_OPTIONS_FOR_FNA";

	/**
	 * This constant denotes a runtime parameter that defines the default
	 * message options for FOA.
	 * <p>
	 * <b>Possible runtime parameter values:</b>
	 * <ul>
	 * <li><u>1st Character:</u> Message Accept Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Accepted.
	 * <li><code> N </code><br>
	 * Not accepted.
	 * </ul>
	 * <li><u>2nd Character:</u> Incoming double signature (DS) Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Host DS accepted.
	 * <li><code> N </code><br>
	 * Host DS Not accepted.
	 * </ul>
	 * <li><u>3rd Character:</u> Outgoing double signature (DS).
	 * <ul>
	 * <li><code> F </code><br>
	 * FLT and ACN.
	 * <li><code> A </code><br>
	 * Last 2 characters of TTY Address.
	 * <li>Blank indicates no DS.
	 * </ul>
	 * </ul>
	 * <p>
	 * Value = {@value}
	 */
	public static final String DEFAULT_MESSAGE_OPTIONS_FOR_FOA = "DEFAULT_MESSAGE_OPTIONS_FOR_FOA";

	/**
	 * This constant denotes a runtime parameter that defines the default
	 * message options for FMA.
	 * <p>
	 * <b>Possible runtime parameter values:</b>
	 * <ul>
	 * <li><u>1st Character:</u> Message Accept Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Accepted.
	 * <li><code> N </code><br>
	 * Not accepted.
	 * </ul>
	 * <li><u>2nd Character:</u> Incoming double signature (DS) Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Host DS accepted.
	 * <li><code> N </code><br>
	 * Host DS Not accepted.
	 * </ul>
	 * <li><u>3rd Character:</u> Outgoing double signature (DS).
	 * <ul>
	 * <li><code> F </code><br>
	 * FLT and ACN.
	 * <li><code> A </code><br>
	 * Last 2 characters of TTY Address.
	 * <li>Blank indicates no DS.
	 * </ul>
	 * </ul>
	 * <p>
	 * Value = {@value}
	 */
	public static final String DEFAULT_MESSAGE_OPTIONS_FOR_FOR = "DEFAULT_MESSAGE_OPTIONS_FOR_FOR";

	/**
	 * This constant denotes a runtime parameter that defines the default
	 * message options for FSA.
	 * <p>
	 * <b>Possible runtime parameter values:</b>
	 * <ul>
	 * <li><u>1st Character:</u> Message Accept Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Accepted.
	 * <li><code> N </code><br>
	 * Not accepted.
	 * </ul>
	 * <li><u>2nd Character:</u> Incoming double signature (DS) Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Host DS accepted.
	 * <li><code> N </code><br>
	 * Host DS Not accepted.
	 * </ul>
	 * <li><u>3rd Character:</u> Outgoing double signature (DS).
	 * <ul>
	 * <li><code> F </code><br>
	 * FLT and ACN.
	 * <li><code> A </code><br>
	 * Last 2 characters of TTY Address.
	 * <li>Blank indicates no DS.
	 * </ul>
	 * <li><u>4th Character:</u>.
	 * <ul>
	 * <li><code> A </code><br>
	 * Include all non-IATA standard FSA status types.
	 * <li>Blank indicates not to include non-IATA standard FSA status types.
	 * </ul>
	 * </ul>
	 * <p>
	 * Value = {@value}
	 */
	public static final String DEFAULT_MESSAGE_OPTIONS_FOR_FSA = "DEFAULT_MESSAGE_OPTIONS_FOR_FSA";

	/**
	 * This constant denotes a runtime parameter that defines the default
	 * message options for FSR.
	 * <p>
	 * <b>Possible runtime parameter values:</b>
	 * <ul>
	 * <li><u>1st Character:</u> Message Accept Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Accepted.
	 * <li><code> N </code><br>
	 * Not accepted.
	 * </ul>
	 * <li><u>2nd Character:</u> Incoming double signature (DS) Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Host DS accepted.
	 * <li><code> N </code><br>
	 * Host DS Not accepted.
	 * </ul>
	 * <li><u>3rd Character:</u> Outgoing double signature (DS).
	 * <ul>
	 * <li><code> F </code><br>
	 * FLT and ACN.
	 * <li><code> A </code><br>
	 * Last 2 characters of TTY Address.
	 * <li>Blank indicates no DS.
	 * </ul>
	 * </ul>
	 * <p>
	 * Value = {@value}
	 */
	public static final String DEFAULT_MESSAGE_OPTIONS_FOR_FSR = "DEFAULT_MESSAGE_OPTIONS_FOR_FSR";

	/**
	 * This constant denotes a runtime parameter that defines the default
	 * message options for FSU.
	 * <p>
	 * <b>Possible runtime parameter values:</b>
	 * <ul>
	 * <li><u>1st Character:</u> Message Accept Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Accepted.
	 * <li><code> N </code><br>
	 * Not accepted.
	 * </ul>
	 * <li><u>2nd Character:</u> Incoming double signature (DS) Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Host DS accepted.
	 * <li><code> N </code><br>
	 * Host DS Not accepted.
	 * </ul>
	 * <li><u>3rd Character:</u> Outgoing double signature (DS).
	 * <ul>
	 * <li><code> F </code><br>
	 * FLT and ACN.
	 * <li><code> A </code><br>
	 * Last 2 characters of TTY Address.
	 * <li>Blank indicates no DS.
	 * </ul>
	 * </ul>
	 * <p>
	 * Value = {@value}
	 */
	public static final String DEFAULT_MESSAGE_OPTIONS_FOR_FSU = "DEFAULT_MESSAGE_OPTIONS_FOR_FSU";

	/**
	 * This constant denotes a runtime parameter that defines the default
	 * message options for FVA.
	 * <p>
	 * <b>Possible runtime parameter values:</b>
	 * <ul>
	 * <li><u>1st Character:</u> Message Accept Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Accepted.
	 * <li><code> N </code><br>
	 * Not accepted.
	 * </ul>
	 * <li><u>2nd Character:</u> Incoming double signature (DS) Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Host DS accepted.
	 * <li><code> N </code><br>
	 * Host DS Not accepted.
	 * </ul>
	 * <li><u>3rd Character:</u> Outgoing double signature (DS).
	 * <ul>
	 * <li><code> F </code><br>
	 * FLT and ACN.
	 * <li><code> A </code><br>
	 * Last 2 characters of TTY Address.
	 * <li>Blank indicates no DS.
	 * </ul>
	 * </ul>
	 * <p>
	 * Value = {@value}
	 */
	public static final String DEFAULT_MESSAGE_OPTIONS_FOR_FVA = "DEFAULT_MESSAGE_OPTIONS_FOR_FVA";

	/**
	 * This constant denotes a runtime parameter that defines the default
	 * message options for FVR.
	 * <p>
	 * <b>Possible runtime parameter values:</b>
	 * <ul>
	 * <li><u>1st Character:</u> Message Accept Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Accepted.
	 * <li><code> N </code><br>
	 * Not accepted.
	 * </ul>
	 * <li><u>2nd Character:</u> Incoming double signature (DS) Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Host DS accepted.
	 * <li><code> N </code><br>
	 * Host DS Not accepted.
	 * </ul>
	 * <li><u>3rd Character:</u> Outgoing double signature (DS).
	 * <ul>
	 * <li><code> F </code><br>
	 * FLT and ACN.
	 * <li><code> A </code><br>
	 * Last 2 characters of TTY Address.
	 * <li>Blank indicates no DS.
	 * </ul>
	 * </ul>
	 * <p>
	 * Value = {@value}
	 */
	public static final String DEFAULT_MESSAGE_OPTIONS_FOR_FVR = "DEFAULT_MESSAGE_OPTIONS_FOR_FVR";

	/**
	 * This constant denotes a runtime parameter that defines the default
	 * message options for FWB.
	 * <p>
	 * <b>Possible runtime parameter values:</b>
	 * <ul>
	 * <li><u>1st Character:</u> Message Accept Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Accepted.
	 * <li><code> N </code><br>
	 * Not accepted.
	 * </ul>
	 * <li><u>2nd Character:</u> Incoming double signature (DS) Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Host DS accepted.
	 * <li><code> N </code><br>
	 * Host DS Not accepted.
	 * </ul>
	 * <li><u>3rd Character:</u> Outgoing double signature (DS).
	 * <ul>
	 * <li><code> F </code><br>
	 * FLT and ACN.
	 * <li><code> A </code><br>
	 * Last 2 characters of TTY Address.
	 * <li>Blank indicates no DS.
	 * </ul>
	 * </ul>
	 * <p>
	 * Value = {@value}
	 */
	public static final String DEFAULT_MESSAGE_OPTIONS_FOR_FWB = "DEFAULT_MESSAGE_OPTIONS_FOR_FWB";

	/**
	 * This constant denotes a runtime parameter that defines the default
	 * message options for FWR.
	 * <p>
	 * <b>Possible runtime parameter values:</b>
	 * <ul>
	 * <li><u>1st Character:</u> Message Accept Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Accepted.
	 * <li><code> N </code><br>
	 * Not accepted.
	 * </ul>
	 * <li><u>2nd Character:</u> Incoming double signature (DS) Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Host DS accepted.
	 * <li><code> N </code><br>
	 * Host DS Not accepted.
	 * </ul>
	 * <li><u>3rd Character:</u> Outgoing double signature (DS).
	 * <ul>
	 * <li><code> F </code><br>
	 * FLT and ACN.
	 * <li><code> A </code><br>
	 * Last 2 characters of TTY Address.
	 * <li>Blank indicates no DS.
	 * </ul>
	 * </ul>
	 * <p>
	 * Value = {@value}
	 */
	public static final String DEFAULT_MESSAGE_OPTIONS_FOR_FWR = "DEFAULT_MESSAGE_OPTIONS_FOR_FWR";

	/**
	 * This constant denotes a runtime parameter that defines the default
	 * message options for FZC.
	 * <p>
	 * <b>Possible runtime parameter values:</b>
	 * <ul>
	 * <li><u>1st Character:</u> Message Accept Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Accepted.
	 * <li><code> N </code><br>
	 * Not accepted.
	 * </ul>
	 * <li><u>2nd Character:</u> Incoming double signature (DS) Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Host DS accepted.
	 * <li><code> N </code><br>
	 * Host DS Not accepted.
	 * </ul>
	 * <li><u>3rd Character:</u> Outgoing double signature (DS).
	 * <ul>
	 * <li><code> F </code><br>
	 * FLT and ACN.
	 * <li><code> A </code><br>
	 * Last 2 characters of TTY Address.
	 * <li>Blank indicates no DS.
	 * </ul>
	 * </ul>
	 * <p>
	 * Value = {@value}
	 */
	public static final String DEFAULT_MESSAGE_OPTIONS_FOR_FZC = "DEFAULT_MESSAGE_OPTIONS_FOR_FZC";

	/**
	 * This constant denotes a runtime parameter that defines the default
	 * message options for FZD.
	 * <p>
	 * <b>Possible runtime parameter values:</b>
	 * <ul>
	 * <li><u>1st Character:</u> Message Accept Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Accepted.
	 * <li><code> N </code><br>
	 * Not accepted.
	 * </ul>
	 * <li><u>2nd Character:</u> Incoming double signature (DS) Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Host DS accepted.
	 * <li><code> N </code><br>
	 * Host DS Not accepted.
	 * </ul>
	 * <li><u>3rd Character:</u> Outgoing double signature (DS).
	 * <ul>
	 * <li><code> F </code><br>
	 * FLT and ACN.
	 * <li><code> A </code><br>
	 * Last 2 characters of TTY Address.
	 * <li>Blank indicates no DS.
	 * </ul>
	 * </ul>
	 * <p>
	 * Value = {@value}
	 */
	public static final String DEFAULT_MESSAGE_OPTIONS_FOR_FZD = "DEFAULT_MESSAGE_OPTIONS_FOR_FZD";

	/**
	 * This constant denotes a runtime parameter that defines the default
	 * message options for FZE.
	 * <p>
	 * <b>Possible runtime parameter values:</b>
	 * <ul>
	 * <li><u>1st Character:</u> Message Accept Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Accepted.
	 * <li><code> N </code><br>
	 * Not accepted.
	 * </ul>
	 * <li><u>2nd Character:</u> Incoming double signature (DS) Indicator.
	 * <ul>
	 * <li><code> Y </code><br>
	 * Host DS accepted.
	 * <li><code> N </code><br>
	 * Host DS Not accepted.
	 * </ul>
	 * <li><u>3rd Character:</u> Outgoing double signature (DS).
	 * <ul>
	 * <li><code> F </code><br>
	 * FLT and ACN.
	 * <li><code> A </code><br>
	 * Last 2 characters of TTY Address.
	 * <li>Blank indicates no DS.
	 * </ul>
	 * </ul>
	 * <p>
	 * Value = {@value}
	 */
	public static final String DEFAULT_MESSAGE_OPTIONS_FOR_FZE = "DEFAULT_MESSAGE_OPTIONS_FOR_FZE";

	/**
	 * This constant holds parameter to maintain the default paycode for spot
	 * rates.
	 *
	 * <p>
	 * Value = {@value}
	 */

	public static final String DEFAULT_PAYCODE_FOR_SPOTRATES = "DEFAULT_PAYCODE_FOR_SPOTRATES";

	/**
	 * This constant holds parameter to maintain the default Queue Office.
	 *
	 * <p>
	 * Value = {@value}
	 */

	public static final String DEFAULT_QUEUE_OFFICE = "DEFAULT_QUEUE_OFFICE";

	/**
	 * This constant holds the Default Rate Source for Contract
	 * <p>
	 * Value = {@value}
	 */
	public static final String DEFAULT_RATESOURCE = "DEFAULT_RATESOURCE";

	/**
	 * This constant holds the Default rate source for Spot Rate
	 * <p>
	 * Value = {@value}
	 */
	public static final String DEFAULT_RATE_SOURCE_FOR_SPOTRATES = "DEFAULT_RATE_SOURCE_FOR_SPOTRATES";

	/**
	 * This constant denotes a runtime parameter to check whether default volume
	 * can be calculated.
	 * <p>
	 * <b>Possible runtime parameter values:</b>
	 * <ul>
	 * <li>Y <br>
	 * System will calculate the default volume.
	 * <li>N <br>
	 * System will not calculate the default volume.
	 * </ul>
	 * <p>
	 * value = {@value}
	 */
	public static final String DEFAULT_VOLUME_CALCULATION_INDICATOR = "DEFAULT_VOLUME_CALCULATION_INDICATOR";

	/**
	 * This constant denotes a runtime parameter that defines, if duplicate
	 * participant group is allowed.
	 * <p>
	 * <b>Possible runtime parameter values:</b><br>
	 * <ul>
	 * <li>Y <br>
	 * System will allow the participant group to have duplicate participant.
	 * <li>N <br>
	 * System will allow NOT the participant group to have duplicate
	 * participant.
	 * </ul>
	 * <p>
	 * value = {@value}
	 */
	public static final String DUPLICATE_PARTICIPANT_GROUP_INDICATOR = "PREVENT_DUPE_PARTICIPANT_GROUPS";

	/**
	 * This constant holds the parameter for delivary other charge code.
	 * <p>
	 * Value = {@value}
	 */
	public static final String DELIVERY_OTHER_CHARGE_CODE = "DELIVERY_OTHER_CHARGE_CODE";

	/**
	 * This constant denotes a runtime parameter that defines, if deleted
	 * participant is displayed.
	 * <p>
	 * <b>Possible runtime parameter values:</b><br>
	 * <ul>
	 * <li>Y <br>
	 * System will display the deleted participant.
	 * <li>N <br>
	 * System will not display deleted participant.
	 * </ul>
	 * <p>
	 * value = {@value}
	 */
	public static final String DISPLAY_DELETED_PARTICIPANT_INDICATOR = "DISPLAY_DELETED_PARTICIPANT_INDICATOR";

	/**
	 * This constant denotes a runtime parameter that determines Outgoing
	 * Processing Queue of the SSM transaction.
	 * <p>
	 * <b>Possible runtime parameter values:</b><br>
	 * <ul>
	 * <li>0 <br>
	 * The SSM transaction is not scheduled and the status Email functionality
	 * is disabled.
	 * <li>1 <br>
	 * The SSM transaction is scheduled and the status Email functionality is
	 * enabled.
	 * </ul>
	 * <p>
	 */
	public static final String EMAIL_NOTIFICATION_CONTROL = "EMAIL_NOTIFICATION_CONTROL";

	/**
	 * This constant holds parameter to maintain the flight date for Spot Rates.
	 * <p>
	 * Value = {@value}
	 */

	public static final String FLIGHT_DATE_FOR_SPOTRATES = "FLIGHT_DATE_FOR_SPOTRATES";

	/**
	 * This constant holds parameter to maintain the flight number for spot
	 * rates.
	 *
	 * <p>
	 * Value = {@value}
	 */

	public static final String FLIGHT_NUMBER_FOR_SPOTRATES = "FLIGHT_NUMBER_FOR_SPOTRATES";

	/**
	 * This constant denotes a runtime parameter that specifies the number of
	 * days in the future a flight date is valid for assignment, removal or
	 * booking activity against a flight.
	 * <p>
	 * Value ={@value}
	 */
	public static final String FLIGHT_VALIDITY_DAYS_AHEAD = "FLIGHT_VALIDITY_DAYS_AHEAD";

	/**
	 * This constant denotes a runtime parameter that specifies the number of
	 * days in the past a flight date is valid for assignment, removal or
	 * booking activity against a flight.
	 * <p>
	 * Value ={@value}
	 */
	public static final String FLIGHT_VALIDITY_DAYS_BACK = "FLIGHT_VALIDITY_DAYS_BACK";

	/**
	 * This constant is used as a control parameter to describe if the host
	 * system has full air waybill data capture available.
	 * <p>
	 * <b>Possible runtime parameter values:</b>
	 * <ul>
	 * <li><code> 0 </code><br>
	 * Full Air Waybill Data Capture feature is not available in the system.
	 * <li><code> 1 </code><br>
	 * Full Air Waybill Data Capture feature is available in the system..
	 * </ul>
	 * <p>
	 * value = {@value}
	 */
	public static final String FULL_AWB_DATA_CAPTURE_AVAILABLE = "FULL_AWB_DATA_CAPTURE_AVAILABLE";

	/**
	 * This constant denotes a control parameter which describes if the full air
	 * waybill data capture is required before delivery of other airline
	 * waybills (OAL � i.e. Non-Host Air Waybills).
	 * <p>
	 * <b>Possible runtime parameter values:</b>
	 * <ul>
	 * <li><code> 0 </code> <br>
	 * Full Air Waybill Data Capture is not required before delivery of Other
	 * Airline waybills.
	 * <li><code> 1 </code> <br>
	 * Full Air Waybill Data Capture is required before delivery of Other
	 * Airline waybills.
	 * <li><code> 2 </code> <br>
	 * Full Air Waybill Data Capture is required before delivery of waybills
	 * issued by carriers that have Shipment Data Capture is required field set
	 * to �Y�.
	 * </ul>
	 * <p>
	 * Value = {@value}
	 */
	public static final String FULL_AWB_DATA_CAPTURE_INDICATOR = "FULL_AWB_DATA_CAPTURE_INDICATOR";

	/**
	 * This constant controls a return air waybill to be generated or not.
	 * <p>
	 * * {@value}
	 */
	public static final String GENERATE_RETURN_AIRWAYBILL = "GENERATE_RETURN_AIRWAYBILL";

	/**
	 * This constant is used as a control parameter to define if the goods
	 * associated with CAO special handling code can only be assigned to a cargo
	 * aircraft only flight.
	 * <p>
	 * <b>Possible runtime parameter values:</b>
	 * <ul>
	 * <li>Y <br>
	 * Check Aircraft type before assigning CAO goods.
	 * <li>N <br>
	 * Do not check Aircraft type.
	 * </ul>
	 * <p>
	 * value = {@value}
	 */
	public static final String GOODS_ASSIGNMENT_TO_CARGO_ONLY_FLIGHT_INDICATOR = "GOODS_ASSIGNMENT_TO_CARGO_ONLY_FLIGHT_INDICATOR";

	/**
	 * This constant is used as a control parameter which is used to specify the
	 * disposition code based on AWB data capture.
	 * <p>
	 * <b>Possible runtime parameter values:</b>
	 * <ul>
	 * <li>Y <br>
	 * Absence of Full Air Waybill Data Capture causes goods to be put in the
	 * missing data.
	 * <li>N <br>
	 * Absence of Full Air Waybill Data Capture does not put goods in the
	 * missing data disposition. disposition.
	 * </ul>
	 * <p>
	 * value = {@value}
	 */
	public static final String GOODS_DISPOSITION_INDICATOR = "GOODS_DISPOSITION_INDICATOR";

	/**
	 * This constant is used as a control parameter that defines the default
	 * value for government bill of lading indicator.
	 * <p>
	 * <b>Possible runtime parameter values:</b><br>
	 * <ul>
	 * <li>Y <br>
	 * Participant associated with Government shipment.
	 * <li>N <br>
	 * Participant not associated with the Government.
	 * </ul>
	 * <p>
	 * value = {@value}
	 */
	public static final String GOVT_BILL_OF_LADING_INDICATOR = "GOVT_BILL_OF_LADING_INDICATOR";

	/**
	 * This constant denotes a runtime parameter which specifies if the host
	 * airline is a ground handler.
	 * <p>
	 * <b>Possible runtime parameter values:</b><br>
	 * <ul>
	 * <li>Y <br>
	 * Host airline is a ground handler.
	 * <li>N <br>
	 * Host airline is not a ground handler.
	 * </ul>
	 * <p>
	 * value = {@value}
	 */
	public static final String GROUND_HANDLER = "GROUND_HANDLER";

	/**
	 * This constant denotes a runtime parameter which specifies the host
	 * carrier code.
	 * <p>
	 * Value = {@value}
	 */
	public static final String HOST_CARRIER_CODE = "HOST_CARRIER_CODE";

	/**
	 * This constant holds the parameter for host currency.
	 * <p>
	 * Value = {@value}
	 */
	public static final String HOST_CURRENCY = "HOST_CURRENCY";

	/**
	 * This constant holds the parameter for proration currency.
	 * <p>
	 * Value = {@value}
	 */
	public static final String PRORATION_CURRENCY = "PRORATION_CURRENCY";

	/**
	 * This constant holds the parameter for host weight unit.
	 * <p>
	 * Value = {@value}
	 */
	public static final String HOST_WEIGHT_UNIT = "HOST_WEIGHT_UNIT";

	/**
	 * This constants decides whether an error or warning is returned when an
	 * IATA number is not associated with the agent participant.
	 * <p>
	 * * {@value}
	 */
	public static final String IATA_ACCOUNT_NUMBER_ASSOCIATED_WITH_PARTICIPANT = "IATA_ACCOUNT_NUMBER_ASSOCIATED_WITH_PARTICIPANT";

	/**
	 * This constant holds the parameter for IATA agent commission percentage.
	 * <p>
	 * Value = {@value}
	 */
	public static final String IATA_AGENT_COMISSION_PERCENTAGE = "IATA_AGENT_COMISSION_PERCENTAGE";

	/**
	 * This constant is used as a control parameter that defines which Exchange
	 * rate to be considered.
	 * <p>
	 * <b>Possible runtime parameter values:</b><br>
	 * <ul>
	 * <li><code> U </code><br>
	 * USD
	 * <li><code> L </code><br>
	 * GBP
	 * <li><code> E </code><br>
	 * EUR
	 * </ul>
	 * <p>
	 * value = {@value}
	 */
	public static final String IATA_EXCHANGE_RATE_BASE_CURRENCY = "IATA_EXCHANGE_RATE_BASE_CURRENCY";

	/**
	 * It controls the acceptance of incoming messages.
	 * <p>
	 * <b>Possible runtime parameter values:</b><br>
	 * <ul>
	 * <li><code> 0 </code><br>
	 * Accept incoming messages even if the TTY/TPR address does not exist or
	 * does not have a Message Link established.
	 * <li><code> 1 </code><br>
	 * Accept incoming messages only if the TTY/TPR address exists and has a
	 * Message Link established.
	 * </ul>
	 * <p>
	 * value = {@value}
	 */
	public static final String INCOMING_MESSAGE_ACCEPT_CONTROL = "INCOMING_MESSAGE_ACCEPT_CONTROL";

	/**
     * This constant holds the runtime parameter that indicates the total
     * character limit of the incoming message.
     * <p>
     * value = {@value}
     */
    public static final String INCOMING_TTY_CHARACTER_LIMITS = "INCOMING_TTY_CHARACTER_LIMITS";
	/**
	 * This constant holds the parameter for validation error message queue
	 * name.
	 * <p>
	 * Value = {@value}
	 */
	public static final String AWB_VALIDATION_ERROR_MESSAGE_QUEUE_NAME = "AWB_VALIDATION_ERROR_MESSAGE_QUEUE_NAME";

	//ITR-2A
	public static final String AWB_INVOICE_ON_HOLD_QUEUE_NAME = "AWB_INVOICE_ON_HOLD_QUEUE_NAME";
	
	public static final String BM_CM_ON_HOLD_QUEUE_NAME = "BM_CM_ON_HOLD_QUEUE_NAME";
	
	public static final String REJECTION_MEOM_ON_HOLD_QUEUE_NAME = "REJECTION_MEOM_ON_HOLD_QUEUE_NAME";

	/**
	 * This constant holds the parameter for validation error message queue
	 * office.
	 * <p>
	 * Value = {@value}
	 */
	public static final String AWB_VALIDATION_ERROR_MESSAGE_QUEUE_OFFICE = "AWB_VALIDATION_ERROR_MESSAGE_QUEUE_OFFICE";

	//ITR-2A
	public static final String AWB_ON_HOLD_QUEUE_OFFICE = "AWB_ON_HOLD_QUEUE_OFFICE";
	/**
	 * This constant holds the parameter for validation error message queue
	 * name.
	 * <p>
	 * Value = {@value}
	 */
	public static final String PRORATION_VALIDATION_ERROR_MESSAGE_QUEUE_NAME = "PRORATION_VALIDATION_ERROR_MESSAGE_QUEUE_NAME";

	/**
	 * This constant holds the parameter for validation error message queue
	 * office.
	 * <p>
	 * Value = {@value}
	 */
	public static final String PRORATION_VALIDATION_ERROR_MESSAGE_QUEUE_OFFICE = "PRORATION_VALIDATION_ERROR_MESSAGE_QUEUE_OFFICE";

	/**
	 * This constant holds the parameter for validation error message queue
	 * name.
	 * <p>
	 * Value = {@value}
	 */
	public static final String PRORATION_AND_REVENUE_REQUEST_ERROR_MESSAGE_QUEUE_NAME = "PRORATION_REVENUE_REQUEST_ERROR_MSG_Q_NAME";

	/**
	 * This constant holds the parameter for validation error message queue
	 * office.
	 * <p>
	 * Value = {@value}
	 */
	public static final String PRORATION_AND_REVENUE_REQUEST_ERROR_MESSAGE_QUEUE_OFFICE = "PRORATION_REVENUE_REQUEST_ERROR_MSG_Q_OFFICE";

	/**
	 * This constant holds the parameter for validation error message queue
	 * name.
	 * <p>
	 * Value = {@value}
	 */
	public static final String ACCOUNTING_ENTRY_QUEUE_NAME = "ACCOUNTING_ENTRY_QUEUE_NAME";

	/**
	 * This constant holds the parameter for validation error message queue
	 * office.
	 * <p>
	 * Value = {@value}
	 */
	public static final String ACCOUNTING_ENTRY_QUEUE_OFFICE = "ACCOUNTING_ENTRY_QUEUE_OFFICE";

	public static final String ERROR_FLOWN_ACCOUNTING_QUEUE = "ERROR_FLOWN_ACCOUNTING_QUEUE";

	public static final String ERROR_FLOWN_ACCOUNTING_QUEUE_OFFICE = "ERROR_FLOWN_ACCOUNTING_QUEUE_OFFICE";
	/**
	 * This constant holds the parameter for processing the queue name.
	 * <p>
	 * Value = {@value}
	 */
	public static final String AWB_PROCESSING_QUEUE_NAME = "AWB_PROCESSING_QUEUE_NAME";

	/**
	 * This constant holds the parameter for processing the queue office.
	 * <p>
	 * Value = {@value}
	 */
	public static final String AWB_PROCESSING_QUEUE_OFFICE = "AWB_PROCESSING_QUEUE_OFFICE";

	/**
	 * This constant holds the indicator whether to load pending rates from
	 * tact.
	 * <p>
	 * Value = {@value}
	 */

	public static final String ACCOUNTING_MONTH_VALIDATION_ERROR_MESSAGE_QUEUE_NAME = "ACCOUNTING_MONTH_VALIDATION_ERROR_MESSAGE_QUEUE_NAME";

	public static final String ACCOUNTING_MONTH_VALIDATION_ERROR_MESSAGE_QUEUE_OFFICE = "ACCOUNTING_MONTH_VALIDATION_ERROR_MESSAGE_QUEUE_OFFICE";

	public static final String LOAD_PENDING_RATES_FROM_TACT = "LOAD_PENDING_RATES_FROM_TACT";

	/**
	 * This constant holds the name of the runtime parameter that indicates if
	 * the flight origin date or the local scheduled (departure or arrival) date
	 * is used for inputs and displays. Note: for the booking function, it is
	 * the local segment departure (versus arrival) that is used as the booked
	 * flight date if the local date parameter value is 'Y'.
	 * <p>
	 * <b>Possible runtime parameter values:</b><br>
	 * <ul>
	 * <li>Y <br>
	 * Local scheduled departure/arrival date must be used for inputs.
	 * <li>N <br>
	 * Flight origin date is used for inputs.
	 * </ul>
	 * <p>
	 * Value ={@value}
	 */
	public static final String LOCAL_DATE = "LOCAL_DATE";

	/**
	 * This constant holds the name of the runtime parameter that indicates
	 * location of the goods which is assigned to a finalized flight.
	 * <p>
	 * value = {@value}
	 */
	public static final String LOCATION_FOR_GOODS_IN_FINALIZED_FLIGHT = "LOCATION_FOR_GOODS_IN_FINALIZED_FLIGHT";

	/**
	 * This constant holds the name of the run time parameter,that controls
	 * whether shipments associated with participant as shipper or consignee is
	 * manually audited.
	 * <p>
	 * <b>Possible runtime parameter values:</b>
	 * <ul>
	 * <li>Y <br>
	 * Manual Audit must.
	 * <li>N <br>
	 * Manual Audit not mandatory.
	 * </ul>
	 * <p>
	 * value = {@value}
	 */
	public static final String MANUAL_AUDIT_INDICATOR = "MANUAL_AUDIT_INDICATOR";

	/**
	 * This constant is used to specify the parameter that defines the maximum
	 * allowable connection time between two flights in minutes.
	 * <p>
	 * Value = {@value}
	 */
	public static final String MAXIMUM_ALLOWABLE_CONNECT_TIME = "MAXIMUM_ALLOWABLE_CONNECT_TIME";

	/**
	 * This constant is used to specify the parameter that defines the maximum
	 * volume in cubic meters.
	 * <p>
	 * Value ={@value}
	 */
	public static final String MAXIMUM_VOLUME = "MAXIMUM_VOLUME";

	/**
	 * This constant is used to specify the parameter that defines the maximum
	 * weight in kilograms.
	 * <p>
	 * Value ={@value}
	 */
	public static final String MAXIMUM_WEIGHT = "MAXIMUM_WEIGHT";

	/**
	 * This constant is used to specify the parameter that defines the minimum
	 * volume in cubic meters.
	 * <p>
	 * Value ={@value}
	 */
	public static final String MINIMUM_VOLUME = "MINIMUM_VOLUME";

	/**
	 * This constant is used to specify the parameter that defines the minimum
	 * weight in kilograms. Value ={@value}
	 */
	public static final String MINIMUM_WEIGHT = "MINIMUM_WEIGHT";

	/**
	 * This constant holds the configuration value for the control modular 7
	 * override indicator.
	 * <p>
	 * <b>Possible runtime parameter values:</b><br>
	 * <ul>
	 * <li>Y <br>
	 * Allow mod 7 override character for a mod 7 shipment reference number.
	 * <li>N <br>
	 * Mod 7 override for a mod 7 shipment reference number is not allowed.
	 * </ul>
	 * <p>
	 * Value = {@value}
	 */
	public static final String MOD7_OVERRIDE_INDICATOR = "MOD7_OVERRIDE_INDICATOR";

	/**
	 * This constant determines the default carrier to consider in the routing
	 * of an air waybill for a non-host air waybill when the carrier is not
	 * input in the routing.
	 * <p>
	 * <b>Possible runtime parameter values:</b><br>
	 * <ul>
	 * <li><code> 0 </code><br>
	 * The default is the host airline code.
	 * <li><code> 1 </code><br>
	 * The default is set to the airline code number of the non-host air
	 * waybill.
	 * </ul>
	 * <p>
	 * Value = {@value}
	 */
	public static final String NON_HOST_AWB_DEFAULT_CARRIER = "NON_HOST_AWB_DEFAULT_CARRIER";

	/**
	 * This constant denotes a runtime parameter which holds the value of number
	 * of other charges that can be allowed for an air waybill.
	 * <p>
	 * Value = {@value}
	 */
	public static final String NUMBER_OF_OTHER_CHARGES = "NUMBER_OF_OTHER_CHARGES";

	/**
	 * This constant holds the configuration value for the number of
	 * participants.
	 * <p>
	 * Value = {@value}
	 */
	public static final String NUMBER_OF_PARTICIPANTS = "NUMBER_OF_PARTICIPANTS";

	/**
	 * This constant denotes a runtime parameter that holds the value of number
	 * of ratings that can be allowed for an air waybill.
	 * <p>
	 * Value = {@value}
	 */
	public static final String NUMBER_OF_RATING_LINES = "NUMBER_OF_RATING_LINES";

	/**
	 * This constant denotes a runtime parameter that specifies the number of
	 * times the air waybill stock is searched for a new air waybill number.
	 * <p>
	 * value = {@value}
	 */
	public static final String NUMBER_OF_SEARCHES_FOR_AN_AWB_NUMBER = "NUMBER_OF_SEARCHES_FOR_AN_AWB_NUMBER";

	/**
	 * This constant denotes a runtime parameter that holds the value of oldest
	 * allowable input expressed in days from current date.
	 * <p>
	 * Value = {@value}
	 */
	public static final String OLDEST_ALLOWABLE_DATE = "OLDEST_ALLOWABLE_DATE";

	/**
	 * This constant holds the runtime parameter that defines the variation for
	 * a time change to qualify as early (in minutes).
	 * <p>
	 * Value = {@value}
	 */
	public static final String ON_TIME_EARLY_LIMIT = "ON_TIME_EARLY_LIMIT";

	/**
	 * This constant holds the runtime parameter that defines the variation for
	 * a time change to qualify as late (in minutes).
	 * <p>
	 * Value = {@value}
	 */
	public static final String ON_TIME_LATE_LIMIT = "ON_TIME_LATE_LIMIT";

	/**
	 * Parameter that defines, if one-time participants are displayed on
	 * participant selection display.
	 * <p>
	 * <b>Possible runtime parameter values:</b><br>
	 * <ul>
	 * <li><code> 0 </code><br>
	 * One time participants are not displayed.
	 * <li><code> 1 </code><br>
	 * One time participants are displayed.
	 * </ul>
	 * <p>
	 * value = {@value}
	 */
	public static final String ONE_TIME_PARTICIPANT_INDICATOR = "ONE_TIME_PARTICIPANT_INDICATOR";

	/**
	 * The business services have a runtime parameters map that contains all the
	 * runtime parameters required by the business service. In the map the key
	 * for a runtime parameter value is a string made by concatenating the
	 * fields of the parameter. In the key string the fields are separated by
	 * this delimiter.
	 * <p>
	 * Value ={@value}
	 */
	public static final String PARAMETER_FIELD_DELIMITER = ",";

	/**
	 * This constant is used across use-cases for parameter value comparison.
	 * This constant is used to hold the boolean value 'N'.
	 * <p>
	 * <b>The list of parameters that can take this value are listed below:</b>
	 * <ul>
	 * <li>PROHIBIT_MANUAL_ENTRY_EXECUTION_DATE
	 * <li>MOD7_OVERRIDE_INDICATOR
	 * <li>GROUND_HANDLER
	 * </ul>
	 * <p>
	 * value = {@value}
	 */
	public static final String PARAMETER_VALUE_AS_NO = "N";

	/**
	 * This constant is used across use-cases for parameter value comparison.
	 * This constant is used to hold the boolean value 'Y'.
	 * <p>
	 * <b>The list of parameters that can take this value are listed below:</b>
	 * <ul>
	 * <li>AVERAGE_DENSITY_FACTOR
	 * <li>GOODS_DISPOSITION_INDICATOR
	 * <li>AUTOMATIC_OFFLOAD_CARRIER_CODE_CHANGE_INDICATOR
	 * <li>GOODS_ASSIGNMENT_TO_CARGO_ONLY_FLIGHT_INDICATOR
	 * <li>COUNTRY_REQUIRED_INDICATOR
	 * <li>GOVT_BILL_OF_LADING_INDICATOR
	 * <li>MANUAL_AUDIT_INDICATOR
	 * <li>PROHIBIT_MANUAL_ENTRY_EXECUTION_DATE
	 * <li>SMALL_PACKAGE_PREPAID_INDICATOR
	 * <li>PRODUCT_CODE_REQUIRED_FOR_OVER_BOOK_ALLOTMENTS
	 * </ul>
	 * <p>
	 * value = {@value}
	 */
	public static final String PARAMETER_VALUE_AS_YES = "Y";

	/**
	 * This constant controls the use of the participant related commercial
	 * account restriction on the shipment.
	 * <p>
	 * * {@value}
	 */
	public static final String PARTICIPANT_COMMERCIAL_ACCOUNT_RESTRICTION_ON_SHIPMENT = "PARTICIPANT_COMMERCIAL_ACCOUNT_RESTRICTION_ON_SHIPMENT";

	/**
	 * This constant holds the parameter for pick up othet charge code.
	 * <p>
	 * Value = {@value}
	 */
	public static final String PICK_UP_OTHER_CHARGE_CODE = "PICK_UP_OTHER_CHARGE_CODE";

	/**
	 * This constant holds parameter to maintain the product code for Spot
	 * Rates.
	 * <p>
	 * Value = {@value}
	 */
	public static final String PRODUCT_CODE_FOR_SPOTRATES = "PRODUCT_CODE_FOR_SPOTRATES";

	/**
	 * This constant holds the product code for over booking allotments.
	 * <p>
	 * value = {@value}
	 */
	public static final String PRODUCT_CODE_REQUIRED_FOR_OVER_BOOK_ALLOTMENTS = "PRODUCT_CODE_REQUIRED_FOR_OVER_BOOK_ALLOTMENTS";

	/**
	 * This constant determines whether the manual input of air waybill priority
	 * is allowed or prohibited.
	 * <p>
	 * * {@value}
	 */
	public static final String PROHIBIT_AIRWAYBILL_PRIORITY = "PROHIBIT_AIRWAYBILL_PRIORITY";

	/**
	 * This constant denotes a run-time parameter which is an indicator that
	 * decides the entry of execution date for an air waybill.
	 * <p>
	 * <b>Possible runtime parameter values :</b>
	 * <ul>
	 * <li>Y <br>
	 * Execution date can not be entered on air waybill capture during a
	 * creation of an air waybill.
	 * <li>N <br>
	 * Execution date can be entered manually.
	 * </ul>
	 * <p>
	 * Value = {@value}
	 */
	public static final String PROHIBIT_MANUAL_ENTRY_EXECUTION_DATE = "PROHIBIT_MANUAL_ENTRY_EXECUTION_DATE";

	/**
	 * This constant holds parameter to maintain the RateClass prohibited for
	 * Commodity Code P.
	 * <p>
	 * Value = {@value}
	 */
	public static final String RATECLASS_PROHIBITED_FOR_COMMODITY_CODE_P = "RATECLASS_PROHIBITED_FOR_COMMODITY_CODE_P";

	/**
	 * This constant holds parameter to maintain the use of Rate Source for Spot
	 * Rates.
	 * <p>
	 * Value = {@value}
	 */
	public static final String RATESOURCE_FOR_SPOTRATES = "RATESOURCE_FOR_SPOTRATES";

	/**
	 * This constant holds parameter to maintain the use of Rate Type for Spot
	 * Rates.
	 * <p>
	 * Value = {@value}
	 */
	public static final String RATETYPE_FOR_SPOTRATES = "RATETYPE_FOR_SPOTRATES";

	/**
	 * This constant holds the parameter for rating module name.
	 * <p>
	 * Value = {@value}
	 */
	public static final String RATING_PARAMETER_MODULE_NAME = "RATING";

	/**
	 * This constant holds the parameter for reference airline code number.
	 * <p>
	 * Value = {@value}
	 */
	public static final String REFERENCE_AIRLINE_CODE_NUMBER = "REFERENCE_AIRLINE_CODE_NUMBER";
	
	/**
	 * This constant holds parameter to maintain the Runtime Exception message
	 * office.
	 * <p>
	 * Value = {@value}
	 */
	public static final String RUNTIME_EXCEPTION_MESSAGE_OFFICE = "RUNTIME_EXCEPTION_MESSAGE_OFFICE";

	public static final String UTILS_PARAMETER_MODULE_NAME = "UTILS";

	/**
	 * This constant is used to hold the value of Restrict Flight Finalization
	 * Based on Departure.
	 * <p>
	 * <b>Possible runtime parameter values :</b>
	 * <ul>
	 * <li>Y <br>
	 * Flight Finalization is allowed only after the flight departure time.
	 * <li>N <br>
	 * Flight Finalization function is not restricted based on the flight
	 * departure time.
	 * </ul>
	 * <p>
	 * value = {@value}
	 */
	public static final String RESTRICT_FLIGHT_FINALIZATION_BASED_ON_FLIGHT_DEPARTURE = "RESTRICT_FLIGHT_FINALIZATION_BASED_ON_FLIGHT_DEPARTURE";

	/**
	 * This constant holds parameter to maintain the use of hurdle rates.
	 * <p>
	 * Value = {@value}
	 */
	public static final String REVENUE_MANAGEMENT_INTERFACE = "REVENUE_MANAGEMENT_INTERFACE";

	/**
	 * This constant holds parameter to maintain the use of security default
	 * values for origin.
	 * <p>
	 * Value = {@value}
	 */
	public static final String SECURITY_DEFAULT_VALUE_FOR_ORIGIN = "SECURITY_DEFAULT_VALUE_FOR_ORIGIN";

	/**
	 * This constant holds parameter to maintain the security for contracts and
	 * spotrates.
	 *
	 * <p>
	 * Value = {@value}
	 */
	public static final String SECURITY_FOR_CONTRACTS_AND_SPOTRATES = "SECURITY_FOR_CONTRACTS_AND_SPOTRATES";

	/**
	 * Parameter that defines, if shipper capture is restricted by NOSHIP or IAC
	 * status.
	 * <p>
	 * <b>Possible runtime parameter values:</b><br>
	 * <ul>
	 * <li><code> 0 </code><br>
	 * NOSHIP and IAC status are disabled.
	 * <li><code> 1 </code> NOSHIP and IAC status are enabled.
	 * </ul>
	 * <p>
	 * value = {@value}
	 */
	public static final String SECURITY_INFORMATION = "SECURITY_INFORMATION";

	/**
	 * This constant indicates whether the small package air waybill can only be
	 * prepaid.
	 * <p>
	 * <b>Possible runtime parameter values:</b><br>
	 * <ul>
	 * <li>Y <br>
	 * The small package indicator can only be Prepaid.
	 * <li>N <br>
	 * The small package indicator need not be Prepaid.
	 * </ul>
	 * <p>
	 * Value = {@value}
	 */
	public static final String SMALL_PACKAGE_PREPAID_INDICATOR = "SMALL_PACKAGE_PREPAID_INDICATOR";

	/**
	 * This constant holds parameter to maintain the special instructions for
	 * Spot Rates.
	 * <p>
	 * Value = {@value}
	 */
	public static final String SPECIAL_INSTRUCTIONS_FOR_SPOTRATES = "SPECIAL_INSTRUCTIONS_FOR_SPOTRATES";

	/**
	 * This constant holds parameter to maintain the spot rate effective date
	 * from today Rates.
	 * <p>
	 * Value = {@value}
	 */

	public static final String SPOTRATE_DEFAULT_EFFECTIVE_DATE_FROM_TODAY = "SPOTRATE_DEFAULT_EFFECTIVE_DATE_FROM_TODAY";

	public static final String SPOTRATE_DISPLAY_RERATING_WARNING = "SPOTRATE_DISPLAY_RERATING_WARNING";

	public static final String SPOTRATE_QUEUE_AIRWAYBILL_TO_ACTUAL_RATE_QUEUE = "SPOTRATE_QUEUE_AIRWAYBILL_TO_ACTUAL_RATE_QUEUE";

	/**
	 * This constant holds parameter to maintain the spot rate definition for
	 * Spot Rates.
	 * <p>
	 * Value = {@value}
	 */

	public static final String SPOTRATE_DEFINITION_LIST = "SPOTRATE_DEFINITION_LIST";

	/**
	 * This constant holds parameter to display the other charge codes included
	 * for all-in pricing.
	 * <p>
	 * Value = {@value}
	 */
	public static final String ALL_IN_SPOT_RATE_LIST = "ALL_IN_SPOT_RATE_LIST";

	/**
	 * This constant holds a runtime parameter which defines the default days
	 * for SpotRate Expiration .
	 * <p>
	 * Value = {@value}
	 */

	public static final String DEFAULT_DAYS_FOR_SPOTRATE_EXPIRATION = "DEFAULT_DAYS_FOR_SPOTRATE_EXPIRATION";

	/**
	 * This constant holds a runtime parameter which defines the indefinite
	 * expiration date for SpotRates.
	 * <p>
	 * Value = {@value}
	 */
	public static final String ALLOW_INDEFINITE_EXPIRATION_DATE_FOR_SPOTRATES = "ALLOW_INDEFINITE_EXPIRATION_DATE_FOR_SPOTRATES";

	/**
	 * This constant holds a runtime parameter which defines the length of the
	 * station code .
	 * <p>
	 * Value = {@value}
	 */
	public static final String STATION_CODE_LENGTH = "STATION_CODE_LENGTH";

	/**
	 * This constant denotes a runtime parameter which holds the queue
	 * identifier of the stock control warning queue name.
	 * <p>
	 * value = {@value}
	 */
	public static final String STOCK_CONTROL_WARNING_QUEUE_NAME = "STOCK_CONTROL_WARNING_QUEUE_NAME";

	/**
	 * This constant denotes a runtime parameter which holds the office
	 * identifier of the stock control warning queue.
	 * <p>
	 * value = {@value}
	 */
	public static final String STOCK_CONTROL_WARNING_QUEUE_OFFICE_IDENTIFIER = "STOCK_CONTROL_WARNING_QUEUE_OFFICE_IDENTIFIER";

	/**
	 * This constant holds the value of global parameters' module name.
	 * <p>
	 * Value ={@value}
	 */
	public static final String SYSTEM_PARAMETER_MODULE_NAME = "SYSTEM";

	/**
	 * This constant is used to specify the default permanent volume of terminal
	 * container in cubic meters.
	 * <p>
	 * Prohibited for ULD/Pallet containers, for TCON:
	 * <ul>
	 * <li>If the runtime parameter �Permanent Volume of Terminal Container� is
	 * not setup, then Container Permanent Capacity - Volume is mandatory in the
	 * input, otherwise the provided value is considered as input.
	 * </ul>
	 * <p>
	 * value = {@value}
	 */
	public static final String TERMINAL_PERMANENT_VOLUME_CAPACITY = "TERMINAL_PERMANENT_VOLUME_CAPACITY";

	/**
	 * This constant is used to specify the the default permanent weight of
	 * terminal container in kilograms.
	 * <p>
	 * Prohibited for ULD/Pallet containers, for TCON:
	 * <ul>
	 * <li>If the runtime parameter �Permanent Weight of Terminal Container� is
	 * not setup, then Container Permanent Capacity - Weight is mandatory in the
	 * input, otherwise the provided value is considered as input.
	 * </ul>
	 * <p>
	 * value = {@value}
	 */
	public static final String TERMINAL_PERMANENT_WEIGHT_CAPACITY = "TERMINAL_PERMANENT_WEIGHT_CAPACITY";

	/**
	 * This constant holds the runtime parameter that indicates the total limit
	 * of the incoming message.
	 * <p>
	 * value = {@value}
	 */
	public static final String TOTAL_INCOMING_MESSAGE_LIMIT = "TOTAL_INCOMING_MESSAGE_LIMIT";

	/**
	 * This constant denotes a runtime parameter which indicates if the first
	 * position of the ULD serial number can be alphanumeric or not.
	 * <p>
	 * <b>Possible runtime parameter values:</b><br>
	 * <ul>
	 * <li>Y <br>
	 * First position of the ULD serial number is alphanumeric.
	 * <li>N <br>
	 * ULD Serial number has to be all numeric.
	 * </ul>
	 * <p>
	 * Value ={@value}
	 */
	public static final String ULD_SERIAL_NUMBER_INDICATOR = "ULD_SERIAL_NUMBER_INDICATOR";

	/**
	 * This constant holds the volume tolerance limit allowed on sellable space
	 * search.
	 * <p>
	 * Value = {@value}
	 */
	public static final String VOLUME_TOLERANCE_LIMIT = "VOLUME_TOLERANCE_LIMIT";

	/**
	 * This constant holds the system level parameter value to identify the
	 * threshold limit of the remaining capacities of the flight segment.
	 * <p>
	 * Value = {@value}
	 */
	public static final String WARNING_BKRSA_PCT = "WARNING_BKRSA_PCT";

	public static final String LOAD_AWB_ERROR_OFFICE = "LOAD_AWB_ERROR_OFFICE";

	public static final String LOAD_AWB_ERROR_QUEUE = "LOAD_AWB_ERROR_QUEUE";

	public static final String JASPERREPORT_VIRTUALIZER_PATH = "JASPERREPORT_VIRTUALIZER_PATH";

	/**
	 * This constant holds the weight tolerance limit allowed on sellable space
	 * search.
	 * <p>
	 * Value = {@value}
	 */
	public static final String WEIGHT_TOLERANCE_LIMIT = "WEIGHT_TOLERANCE_LIMIT";

	public static final String USE_TOTAL_SHIPMENT_WEIGHT_FOR_RATE_SELECTION = "USE_TOTAL_SHIPMENT_WEIGHT_FOR_RATE_SELECTION";

	public static final String PUBLISHED_RATE_SOURCE_NOT_ALLOWED_FOR_ACTUAL_RATES = "MANUAL_RATE_FOR_ACTUAL";

	public static final String DO_NOT_ALLOW_SELECTION_DISPLAY_FOR_MANUAL_RATING = "DO_NOT_ALLOW_SELECTION_DISPLAY_FOR_MANUAL_RATING";

	public static final String LMS_CGO_XML_URL = "LMS_CGO_XML_URL";

	public static final String CONTRACT_OR_SPOTRATE_PREPAID_PARTICIPANT_TYPE_1 = "CONTRACT_OR_SPOTRATE_PREPAID_PARTICIPANT_TYPE_1";

	public static final String CONTRACT_OR_SPOTRATE_PREPAID_PARTICIPANT_TYPE_2 = "CONTRACT_OR_SPOTRATE_PREPAID_PARTICIPANT_TYPE_2";

	public static final String CONTRACT_OR_SPOTRATE_PREPAID_PARTICIPANT_TYPE_3 = "CONTRACT_OR_SPOTRATE_PREPAID_PARTICIPANT_TYPE_3";

	public static final String CONTRACT_OR_SPOTRATE_COLLECT_PARTICIPANT_TYPE_1 = "CONTRACT_OR_SPOTRATE_COLLECT_PARTICIPANT_TYPE_1";

	public static final String CONTRACT_OR_SPOTRATE_COLLECT_PARTICIPANT_TYPE_2 = "CONTRACT_OR_SPOTRATE_COLLECT_PARTICIPANT_TYPE_2";

	public static final String CONTRACT_OR_SPOTRATE_COLLECT_PARTICIPANT_TYPE_3 = "CONTRACT_OR_SPOTRATE_COLLECT_PARTICIPANT_TYPE_3";

	public static final String COMPARE_SPECIFIC_WITH_GENERAL_COMMODITY_FOR_CONTRACT_AND_SPOTRATE = "COMPARE_SPECIF_WITH_GEN_COMMODITY_FOR_CTC_AND_SRA";

	public static final String SPOTRATE_MINIMUM_TOLERANCE_WEIGHT_UNIT = "SPOTRATE_MINIMUM_TOLERANCE_WEIGHT_UNIT";

	public static final String SPOTRATE_MAXIMUM_TOLERANCE_WEIGHT_UNIT = "SPOTRATE_MAXIMUM_TOLERANCE_WEIGHT_UNIT";

	public static final String SPOTRATE_MINIMUM_TOLERANCE_INDICATOR = "SPOTRATE_MINIMUM_TOLERANCE_INDICATOR";

	public static final String SPOTRATE_MINIMUM_TOLERANCE_VALUE = "SPOTRATE_MINIMUM_TOLERANCE_VALUE";

	public static final String SPOTRATE_MAXIMUM_TOLERANCE_INDICATOR = "SPOTRATE_MAXIMUM_TOLERANCE_INDICATOR";

	public static final String SPOTRATE_MAXIMUM_TOLERANCE_VALUE = "SPOTRATE_MAXIMUM_TOLERANCE_VALUE";

	public static final String USER_AUTHORITY_FOR_CONTRACT_SPOTRATE_SI = "USER_AUTHORITY_FOR_CONTRACT_SPOTRATE_SI";

	public static final String MAX_NUMBER_OF_RATING_LINES_FOR_RATE_RETRIEVAL = "MAX_NUMBER_OF_RATING_LINES_FOR_RATE_RETRIEVAL";

	public static final String MAX_NUMBER_OF_RATING_LINES_RETURNED_TO_CARGO = "MAX_NUMBER_OF_RATING_LINES_RETURNED_TO_CARGO";

	public static final String RATE_BREAK_FOR_RATING_LOOSE_PIECES_OUTSIDE_ULD = "RATE_BREAK_FOR_RATING_LOOSE_PIECES_OUTSIDE_ULD";

	public static final String BULK_RATES_FOR_ULD_RATING_LINES = "BULK_RATES_FOR_ULD_RATING_LINES";

	public static final String CONTRACT_SPOTRATES_SELECTION_USING_ELIGIBLE_PARTICIPANTS = "CTC_SRA_SELECTION_USING_ELIGIBLE_PARTICIPANTS";

	// UC105 Process Air Waybill Rating Request- contract start

	public static final String PARTICIPANT_HIERARCHY_INDICATOR_FOR_PREPAID_AWB_CONTRACTS = "PARTICIPANT_HIERARCHY_IND_FOR_PREPAID_AWB_CTC";

	public static final String SHOW_ALL_CONTRACTS_ON_CONTRACT_SELECTION_DISPLAY = "SHOW_ALL_CONTRACTS_ON_CONTRACT_SELECTION_DISPLAY";

	public static final String HIDE_ACTUAL_RATES_ON_SPOT_RATES_AND_CONTRACTS_SELECTION_DISPLAY = "HIDE_ACTUAL_RATES_ON_SRA_AND_CTC_DISPLAY";

	public static final String PARTICIPANT_HIERARCHY_INDICATOR_FOR_COLLECT_AWB_CONTRACTS = "PARTICIPANT_HIERARCHY_IND_FOR_COLLECT_AWB_CTC";

	public static final String CONSTRUCT_RATES = "CONSTRUCT_RATES";

	public static final String CONSTRUCT_RATES_FOR_CONTRACTS = "CONSTRUCT_RATES_FOR_CONTRACTS";

	public static final String IGNORE_ADDITIONAL_PARTICIPANTS_FOR_CONTRACTS = "IGNORE_ADDITIONAL_PARTICIPANTS_FOR_CONTRACTS";

	// UC105 Process Air Waybill Rating Request- contract end

	// UC105 Process Air Waybill Rating Request

	/**
	 * This constant denotes a run-time parameter which Controls the
	 * activate/deactivate security feature for Pricing. When enabled, it is
	 * used with the rating module security data to limit the application of
	 * private tariff rates and contracts during Pricing.
	 * <p>
	 * Value = {@value}
	 */

	public static final String SECURITY_FOR_PRICING = "SECURITY_FOR_PRICING";

	/**
	 * This constant denotes a run-time parameter which Specifies what should
	 * occur when pricing specific commodities and a specific commodity rate
	 * (SCR) does not exist or a general commodity is used because it is
	 * cheaper.
	 * <p>
	 * Value = {@value}
	 */

	public static final String SPECIFIC_COMMODITY_RATE_SEARCH = "SPECIFIC_COMMODITY_RATE_SEARCH";

	/**
	 * This constant denotes a run-time parameter which Controls if ACR
	 * selection display needs to be suppressed or not.
	 * <p>
	 * Value = {@value}
	 */
	public static final String ALLOW_OR_SUPPRESS_ACR_SELECTION = "ALLOW_OR_SUPPRESS_ACR_SELECTION";

	/**
	 * This constant denotes a run-time parameter which defines Security switch
	 * for ARDC (Rate & Quote).
	 * <p>
	 * Value = {@value}
	 */
	public static final String SECURITY_SWITCH_FOR_RATE_AND_QUOTE = "SECURITY_SWITCH_FOR_RATE_AND_QUOTE";

	/**
	 * This constant denotes a run-time parameter which Controls whether
	 * standard pricing should apply bulk rates in the absence of ULD rates for
	 * rating lines with a ULD type specified.
	 * <p>
	 * Value = {@value}
	 */
	public static final String APPLY_BULK_RATES_ULD = "APPLY_BULK_RATES_ULD";

	/**
	 * This constant denotes a run-time parameter which Controls whether the
	 * tare weight of a non-aircraft ULD is deducted from the gross weight when
	 * a ULD discount is being calculated.
	 * <p>
	 * Value = {@value}
	 */
	public static final String DONT_DEDUCT_TARE_WEIGHT_FOR_NON_AIRCRAFT_ULD = "DONT_DEDUCT_TARE_WEIGHT_FOR_NON_AIRCRAFT_ULD";

	/**
	 * This constant denotes a run-time parameter which Controls whether an air
	 * waybill with an IATA user associated with it and not rated with an
	 * applicable contract or spot rate is queued for verification.
	 * <p>
	 * Value = {@value}
	 */
	public static final String CHECK_CONTRACT_APPLIED_FOR_AGENT = "CHECK_CONTRACT_APPLIED_FOR_AGENT";

	/**
	 * This constant denotes a run-time parameter which Controls whether the
	 * entry of the class identification code is required on manually entered
	 * class rated rating lines.
	 * <p>
	 * Value = {@value}
	 */
	public static final String CHECK_CLASSRATING_ID_MANDATORY_FOR_RATE_PERCENTAGE = "CHECK_CLASSRATING_ID_MANDATORY_FOR_RATE_PERCENTAGE";

	/**
	 * This constant denotes a run-time parameter which Controls whether the
	 * actual rates can be displayed on the face value of an air waybill in the
	 * absence of a published rate or input face value (manual) rate.
	 * <p>
	 * Value = {@value}
	 */
	public static final String CHECK_ACTUAL_RATES_USED_WHEN_NO_PUBLISHED_RATES = "CHECK_ACTUAL_RATES_USED_WHEN_NO_PUBLISHED_RATES";

	/**
	 * This constant denotes a run-time parameter which Controls whether air
	 * waybills with RCPs are automatically sent to the rating queue after
	 * attempting to assign rates.
	 * <p>
	 * Value = {@value}
	 */
	public static final String AUTO_QUEUE_RCP_RATING_LINE = "AUTO_QUEUE_RCP_RATING_LINE";

	/**
	 * This constant denotes a run-time parameter which Controls whether
	 * multi-line air waybills are sent to the rating queue for review after
	 * attempting to assign rates. Multi-line air waybills have more than one
	 * rating line, ULD sequence, or B&K sequence.
	 * <p>
	 * Value = {@value}
	 */
	public static final String AUTO_QUEUE_MULTIPLE_RATE_LINES = "AUTO_QUEUE_MULTIPLE_RATE_LINES";

	/**
	 * This constant denotes a run-time parameter which Controls whether only
	 * user spot rates and contracts should be searched when rating an air
	 * waybill. Note: A$ASON has no affect when C$CPRC=1. When C$CPRC=1, only
	 * user spot rates and contracts are considered for prepaid air waybills
	 * when there is an user on the air waybill. For collect air waybills when
	 * C$CPRC=1, user contracts and spot rates are never considered since the
	 * user is never the party responsible for the transportation charges.
	 *
	 * <p>
	 * Value = {@value}
	 */
	public static final String SEARCH_USER_SPOT_RATES_AND_CONTRACTS_FOR_RATING_AIRWAY_BILL = "SEARCH_USER_SRA_AND_CTC_FOR_RATING_AWB";

	/**
	 * This constant denotes a run-time parameter which Controls if the contract
	 * and SRA search should be limited to the participant responsible for
	 * paying the transportation charges.
	 * <p>
	 * Value = {@value}
	 */
	public static final String SEARCH_SPOT_RATES_AND_CONTRACTS_FOR_RESPONSIBLE_PARTICIPANTS = "SEARCH_SPOT_RATES_AND_CONTRACTS_FOR_RESPONSIBLE_PARTICIPANTS";

	/**
	 * This constant denotes a run-time parameter which Conversion value to use
	 * for LB to KG conversion.
	 * <p>
	 * Value = {@value}
	 */
	public static final String LB_TO_KG_CONVERSION = "LB_TO_KG_CONVERSION";

	/**
	 * This constant denotes a run-time parameter which Conversion value to use
	 * for KG to LB conversion.
	 * <p>
	 * Value = {@value}
	 */
	public static final String KG_TO_LB_CONVERSION = "KG_TO_LB_CONVERSION";

	/**
	 * This constant denotes a run-time parameter which Contains the number of
	 * days past the expiration date after which the spot rate is purged from
	 * the database.
	 * <p>
	 * Value = {@value}
	 */
	public static final String NUMBER_OF_DAYS_AFTER_EXPIRED_SPOTRATES_PURGED = "NUMBER_OF_DAYS_AFTER_EXPIRED_SPOTRATES_PURGED";

	/**
	 * This constant denotes a run-time parameter which Contains the number of
	 * days past the contract expiration date after which the contract is purged
	 * from the database.
	 * <p>
	 * Value = {@value}
	 */
	public static final String NUMBER_OF_DAYS_AFTER_EXPIRED_CONTRACT_PURGED = "NUMBER_OF_DAYS_AFTER_EXPIRED_CONTRACT_PURGED";

	/**
	 * This constant denotes a run-time parameter which specifies the output
	 * report file path
	 * <p>
	 * Value = {@value}
	 */
	public static final String REPORT_FILES_PATH_NAME = "REPORT_FILES_PATH_NAME";

	/**
	 * This constant denotes a run-time parameter which specifies the output
	 * file name for tariff rate CSV format extract
	 * <p>
	 * Value = {@value}
	 */
	public static final String TARIFFRATE_CSV_FORMAT_EXTRACT_FILE_NAME = "TARIFFRATE_CSV_FORMAT_EXTRACT_FILE_NAME";

	/**
	 * This constant denotes a run-time parameter which specifies the output
	 * file name for tariff rate CMR format extract
	 * <p>
	 * Value = {@value}
	 */

	public static final String TARIFFRATE_CMR_FORMAT_EXTRACT_FILE_NAME = "TARIFFRATE_CMR_FORMAT_EXTRACT_FILE_NAME";

	/**
	 * This constant denotes a run-time parameter which specifies the output
	 * file name for tariff rate ATPCO extract
	 * <p>
	 * Value = {@value}
	 */
	public static final String TARIFFRATE_ATPCO_EXTRACT_FILE_NAME = "TARIFFRATE_ATPCO_EXTRACT_FILE_NAME";

	/**
	 * This constant denotes a run-time parameter which specifies the output
	 * file name for tariff rate IATA extract
	 * <p>
	 * Value = {@value}
	 */

	public static final String TARIFFRATE_IATA_EXTRACT_FILE_NAME = "TARIFFRATE_IATA_EXTRACT_FILE_NAME";

	/**
	 * This constant denotes a run-time parameter which specifies the output
	 * file name for contract CSV format extract
	 * <p>
	 * Value = {@value}
	 */
	public static final String CONTRACT_CSV_FORMAT_EXTRACT_FILE_NAME = "CONTRACT_CSV_FORMAT_EXTRACT_FILE_NAME";

	/**
	 * This constant denotes a run-time parameter which specifies the output
	 * file name for contract CMR Format Extract
	 * <p>
	 * Value = {@value}
	 */
	public static final String CONTRACT_CMR_FORMAT_EXTRACT_FILE_NAME = "CONTRACT_CMR_FORMAT_EXTRACT_FILE_NAME";

	/**
	 * This constant denotes a run-time parameter which specifies the output
	 * file name for spot rate CSV format extract
	 * <p>
	 * Value = {@value}
	 */
	public static final String SPOTRATE_CSV_FORMAT_EXTRACT_FILE_NAME = "SPOTRATE_CSV_FORMAT_EXTRACT_FILE_NAME";

	/**
	 * This constant denotes a run-time parameter which specifies the output
	 * file name for spot rate CMR Format Extract
	 * <p>
	 * Value = {@value}
	 */
	public static final String SPOTRATE_CMR_FORMAT_EXTRACT_FILE_NAME = "SPOTRATE_CMR_FORMAT_EXTRACT_FILE_NAME";

	/**
	 * This constant denotes a run-time parameter which specifies the office
	 * name for the Host Interface online sync service.
	 * <p>
	 * Value = {@value}
	 */

	public static final String ONLINESYNC_OFFICENAME = "ONLINESYNC_OFFICENAME";
	/**
	 * This constant denotes a run-time parameter which specifies the office
	 * name for the participant online sync service.
	 * <p>
	 * Value = {@value}
	 */

	public static final String PARTICIPANT_ONLINESYNC_OFFICENAME = "PARTICIPANT_ONLINESYNC_OFFICENAME";

	/**
	 * This constant denotes a run-time parameter which specifies the office
	 * name for the exchange rate online sync service.
	 * <p>
	 * Value = {@value}
	 */

	public static final String EXCHANGE_RATE_ONLINESYNC_OFFICENAME = "EXCHANGE_RATE_ONLINESYNC_OFFICENAME";

	/**
	 * This constant denotes a run-time parameter which Controls whether all
	 * contracts should be included in a Contract Selection display when pricing
	 * a booking or air waybill that involves hurdle rate enforcement
	 * <p>
	 * Value = {@value}
	 */
	public static final String SHOW_ALL_RATES_WITHOUT_SI_FOR_SELECTION_DISPLAY = "SHOW_ALL_RATES_WITHOUT_SI_FOR_SELECTION_DISPLAY";

	/**
	 * This constant denotes a run-time parameter which specifies the office
	 * name for the ACS Station info URL.
	 * <p>
	 * Value = {@value}
	 */

	public static final String ALLOTMENT_CONTRACTS_MANDATORY = "ALLOTMENT_CONTRACTS_MANDATORY";

	/**
	 * This constant denotes a run-time parameter which specifies whether to
	 * allow Blank Product code for Rate type validation in Contract Pricing.
	 * <p>
	 * Value = {@value}
	 */

	public static final String ALLOW_BLANK_PRODUCT_CODE_FOR_CONTRACT_RATETYPE = "ALLOW_BLANK_PRODUCT_CODE_FOR_CONTRACT_RATETYPE";

	/**
	 * This constant denotes a run-time parameter C$DMIG controls whether or not
	 * Sections 5 and 6 appear in AWB.
	 * <p>
	 * Value = {@value}
	 */

	public static final String C$DMIG = "C$DMIG";
	public static final String C$DSSA = "C$DSSA";

	/**
	 * This constant denotes a run-time parameter which specifies the office
	 * name for the ACS Station info URL.
	 * <p>
	 * Value = {@value}
	 */

	public static final String ACS_STATION_INFO_URL = "ACS_STATION_INFO_URL";

	public static final String STATION_GENERAL_MAP_URL = "STATION_GENERAL_MAP_URL";

	public static final String TAX_CODES = "TAXCODES";

	/**
	 * This constant specifies whether effective date can be past date for SPA.
	 * <p>
	 * Value = {@value}
	 */

	public static final String EFFECTIVE_DATE_CONTROL = "EFFECTIVE_DATE_CONTROL";

	/**
	 * This constant holds the parameter for rating module name.
	 * <p>
	 * Value = {@value}
	 */
	public static final String ACCOUNTING_PARAMETER_MODULE_NAME = "ACCOUNTING";

	/**
	 * This constant holds the parameter for accounting participant.
	 * <p>
	 * Value = {@value}
	 */
	public static final String SHOW_ACCOUNTING_INFORMATION = "SHOW_ACCOUNTING_INFORMATION";

	/**
	 * This constant holds the parameter for accounting participant.
	 * <p>
	 * Value = {@value}
	 */
	public static final String COLLECT_CHARGES_FOR_AWB = "COLLECT_CHARGES_FOR_AWB";

	/**
	 * This constant denotes a runtime parameter which specifies the host acn.
	 * <p>
	 * Value = {@value}
	 */
	public static final String HOST_ACN = "HOST_ACN";

	/**
	 * This constant holds the Product code used to qualify the air waybill as
	 * supplemental air waybill. search.
	 * <p>
	 * Value = {@value}
	 */
	public static final String SUPPLEMENTAL_PRODUCT_CODE = "SUPPLEMENTAL_PRODUCT_CODE";

	/**
	 * This constant holds the Product code used to qualify the air waybill as
	 * supplemental air waybill. search.
	 * <p>
	 * Value = {@value}
	 */
	public static final String PRICE_QUOTE_INTEGRATION_ENABLED = "PRICE_QUOTE_INTEGRATION_ENABLED";

	/**
	 * This constant denotes a runtime parameter which specifies the host acn.
	 * <p>
	 * Value = {@value}
	 */
	public static final String BILLING_LISTING_DAYS = "BILLING_LISTING_DAYS";

	/**
	 * This constant holds the Control that controls the use of the participant
	 * related commercial account restriction on the shipment search.
	 * <p>
	 * Value = {@value}
	 */
	public static final String CONTROL_PARTICIPANT_COMMERCIAL_ACCOUNT_RESTRICTION = "CONTROL_PARTICIPANT_COMMERCIAL_ACCOUNT_RESTRICTION";

	/**
	 * This constant holds the Parameter that defines if shipper capture is
	 * restricted by NOSHIP or IAC status. search.
	 * <p>
	 * Value = {@value}
	 */
	public static final String CONTROL_PARTICIPANT_IAC_AND_NO_SHIP_STATUS = "CONTROL_PARTICIPANT_IAC_AND_NO_SHIP_STATUS";

	/**
	 * This constant holds the Parameter that defines if SPA can be used for
	 * proration.
	 * <p>
	 * Value = {@value}
	 */
	public static final String USE_SPA_PRORATION_METHOD = "USE_SPA_PRORATION_METHOD";

	/**
	 * This constant holds the Parameter that defines if Proviso can be used for
	 * proration.
	 * <p>
	 * Value = {@value}
	 */
	public static final String USE_PROVISO_PRORATION_METHOD = "USE_PROVISO_PRORATION_METHOD";

	/**
	 * This constant holds the Parameter that defines if IATA Prorate Factor can
	 * be used for proration.
	 * <p>
	 * Value = {@value}
	 */
	public static final String USE_IATA_PRORATE_FACTOR_PRORATION_METHOD = "USE_IATA_PRORATE_FACTOR_PRORATION_METHOD";

	/**
	 * This constant holds the Parameter that defines if Great circle Mileage
	 * can be used for proration.
	 * <p>
	 * Value = {@value}
	 */
	public static final String USE_GREAT_CIRCLE_MILEAGE_PRORATION_METHOD = "USE_GREAT_CIRCLE_MILEAGE_PRORATION_METHOD";

	public static final String COMAT_PRODUCT_CODE = "COMAT_PRODUCT_CODE";

	public static final String DEFAULT_TOLERANCE_LIMIT_FOR_SIS_INWARD = "DEFAULT_TOLERANCE_LIMIT_FOR_SIS_INWARD";

	public static final String DEFAULT_TOLERANCE_LIMIT_FOR_NONSIS_INWARD = "DEFAULT_TOLERANCE_LIMIT_FOR_NONSIS_INWARD";

	public static final String QUEUE_UNDER_BILLED_INTERLINE_INWARD_BILLING = "QUEUE_UNDER_BILLED_INTERLINE_INWARD_BILLING";

	public static final String REJECTION_MEMO_STAGE_ONE = "REJECTION_MEMO_STAGE_ONE";

	public static final String REJECTION_MEMO_STAGE_TWO = "REJECTION_MEMO_STAGE_TWO";

	public static final String REJECTION_MEMO_STAGE_THREE = "REJECTION_MEMO_STAGE_THREE";
	/**
	 * This constant holds the Parameter to control if account identifier is
	 * returned as part of the output participant list. search.
	 * <p>
	 * Value = {@value}
	 */
	public static final String INCLUDE_PARTICIPANT_ACCOUNT_IDENTIFIER_ON_SUGGESTIVE_SEARCH = "INCLUDE_PART_ACC_IDENTIFIER_ON_SUGG_SEARCH";

	public static final String INCLUDE_ONE_TIME_PARTICIPANT_ON_SUGGESTIVE_SEARCH = "INCLUDE_ONE_TIME_PARTICIPANT_ON_SUGGESTIVE_SEARCH";

	public static final String DASHBOARD_CURRENCY_CODE = "DASHBOARD_CURRENCY_CODE";

	public static final String DASHBOARD_STARTING_TIME = "DASHBOARD_STARTING_TIME";

	public static final String DASHBOARD_START_OF_THE_MONTH = "DASHBOARD_START_OF_THE_MONTH";

	public static final String DASHBOARD_START_OF_THE_WEEK = "DASHBOARD_START_OF_THE_WEEK";

	/**
	 * <code>Private constructor.</code>
	 */

	public static final String EFFECTIVE_DATE_CONTROL_AGREEMENTS = "EFFECTIVE_DATE_CONTROL_AGREEMENTS";

	public static final String PAYMENT_OUTSTANDING_CATEGORY_ONE = "PAYMENT_OUTSTANDING_CATEGORY_ONE";

	public static final String PAYMENT_OUTSTANDING_CATEGORY_TWO = "PAYMENT_OUTSTANDING_CATEGORY_TWO";

	public static final String PAYMENT_OUTSTANDING_CATEGORY_THREE = "PAYMENT_OUTSTANDING_CATEGORY_THREE";

	public static final String PAYMENT_OUTSTANDING_CATEGORY_FOUR = "PAYMENT_OUTSTANDING_CATEGORY_FOUR";

	public static final String PAYMENT_OUTSTANDING_CATEGORY_FIVE = "PAYMENT_OUTSTANDING_CATEGORY_FIVE";

	public static final String WARNING_CREDIT_LIMIT = "WARNING_CREDIT_LIMIT";

	public static final String FREQUENCY_OF_COLLECTION_ALERTS = "FREQUENCY_OF_COLLECTION_ALERTS";

	public static final String INVOICE_LISTING_DAYS = "INVOICE_LISTING_DAYS";

	public static final String COLLLECTION_ALERT_GRACE_PERIOD = "COLLECTION_ALERT_GRACE_PERIOD";

	public static final String MINIMUM_DUNNING_AMOUNT = "MINIMUM_DUNNING_AMOUNT";

	public static final String ROUND_FOUR_DECIMALS_FOR_USD_CAD = "ROUND_FOUR_DECIMALS_FOR_USD_CAD";
	public static final String CONTRACT_DEFAULT_ENFORCE_HURDLE_RATES = "CONTRACT_DEFAULT_ENFORCE_HURDLE_RATES";
	public static final String SRA_DEFAULT_ENFORCE_HURDLE_RATES = "SRA_DEFAULT_ENFORCE_HURDLE_RATES";
	public static final String INVOICE_FINAL_ADJUSTMENT_DATE = "INVOICE_FINAL_ADJUSTMENT_DATE";
	/**
	 * This constant specifies the filtering period for accounting posting
	 * details.
	 * <p>
	 * Value = {@value}
	 */

	public static final String RETRIEVE_GENERATED_FILES_PARAMETER = "RETRIEVE_GENERATED_FILES_PARAMETER";
	public static final String ERP_FILE_POSTING_ERR_MESSAGE_QUEUE_NAME = "ERP_FILE_POSTING_ERR_MESSAGE_QUEUE_NAME";
	public static final String ERP_FILE_GENERATION_VALIDATION_ERROR_MESSAGE_QUEUE_OFFICE = "ERP_FILE_GENERATION_ERROR_MESSAGE_QUEUE_OFFICE";
	public static final String ERP_FILE_GENERATION_VALIDATION_ERROR_MESSAGE_QUEUE_NAME = "ERP_FILE_GENERATION_ERROR_MESSAGE_QUEUE_NAME";
	public static final String ERP_FILE_POSTING_ERR_MESSAGE_QUEUE_OFFICE = "ERP_FILE_POSTING_ERR_MESSAGE_QUEUE_OFFICE";
	public static final String FTP_SERVER_PORT_NUMBER = "FTP_SERVER_PORT_NUMBER";
	public static final String FTP_IP_ADDRESS = "FTP_IP_ADDRESS";
	public static final String FTP_USER_NAME = "FTP_USER_NAME";
	public static final String FTP_PASSWORD = "FTP_PASSWORD";
	public static final String FTP_SUB_FOLDER_NAME = "FTP_SUB_FOLDER_NAME";
	public static final String ERP_FILE_POSTING_STATUS_MESSAGE_QUEUE_NAME = "ERP_FILE_POSTING_STATUS_MESSAGE_QUEUE_NAME";
	public static final String ERP_FILE_POSTING_STATUS_MESSAGE_QUEUE_OFFICE = "ERP_FILE_POSTING_STATUS_MESSAGE_QUEUE_OFFICE";
	public static final String ERROR_PAYMENT_LOAD_QUEUE = "ERROR_PAYMENT_LOAD_QUEUE";
	public static final String ERROR_PAYMENT_LOAD_OFFICE_QUEUE = "ERROR_PAYMENT_LOAD_OFFICE_QUEUE";
	public static final String MONTHLY_CLOSURE_ENTRIES_ERROR_MESSAGE_QUEUE_NAME = "MONTHLY_CLOSURE_ENTRIES_ERROR_MESSAGE_QUEUE_NAME";
	public static final String MONTHLY_CLOSURE_ENTRIES_ERROR_MESSAGE_QUEUE_OFFICE = "MONTHLY_CLOSURE_ENTRIES_ERROR_MESSAGE_QUEUE_OFFICE";
	public static final String ERROR_PAYMENT_ACCOUNTING_QUEUE = "ERROR_PAYMENT_ACCOUNTING_QUEUE";
	public static final String ERROR_WRITEOFF_ACCOUNTING_QUEUE = "ERROR_WRITEOFF_ACCOUNTING_QUEUE";
	public static final String ERROR_PAYMENT_ACCOUNTING_OFFICE_QUEUE = "ERROR_PAYMENT_ACCOUNTING_OFFICE_QUEUE";
	public static final String WRITEOFF_REASON_TYPE = "WRITEOFF_REASON_TYPE";
	public static final String ERROR_WRITEOFFT_ACCOUNTING_OFFICE_QUEUE = "ERROR_WRITEOFFT_ACCOUNTING_OFFICE_QUEUE";
	public static final String GUVNOR_ACCRULE_CHANGESET_URL = "GUVNOR_ACCRULE_CHANGESET_URL";
	public static final String GUVNOR_LOGIN_USERID = "GUVNOR_LOGIN_USERID";
	public static final String GUVNOR_LOGIN_PASSWORD = "GUVNOR_LOGIN_PASSWORD";

	public static final String LMS_IOS_XML_URL = "LMS_IOS_XML_URL";

	public static final String OUTSTANDING_FIVE = "OUTSTANDING_FIVE";

	public static final String OUTSTANDING_FOUR = "OUTSTANDING_FOUR";

	public static final String OUTSTANDING_THREE = "OUTSTANDING_THREE";

	public static final String OUTSTANDING_TWO = "OUTSTANDING_TWO";

	public static final String OUTSTANDING_ONE = "OUTSTANDING_ONE";

	/**
	 * This constant denotes a runtime parameter which specifies the host
	 * carrier code.
	 * <p>
	 * Value = {@value}
	 */
	public static final String MAX_AWB_SELECTED_FOR_RERATING = "MAX_AWB_SELECTED_FOR_RERATING";

	public static final String ERROR_MONTHLY_REPORT_QUEUE = "ERROR_MONTHLY_REPORT_QUEUE";

	public static final String ARCHIVE_CLOSED_INVOICE = "ARCHIVE_CLOSED_INVOICE";
	public static final String COMMERCIAL_INVOICE_ARCHIVE_STATUS = "COMMERCIAL_INVOICE_ARCHIVE_STATUS";
	public static final String CASS_INVOICE_ARCHIVE_STATUS = "CASS_INVOICE_ARCHIVE_STATUS";
	public static final String INTERLINE_INWARD_INVOICE_ARCHIVE_STATUS = "INTERLINE_INWARD_INVOICE_ARCHIVE_STATUS";
	public static final String INTERLINE_OUTWARD_INVOICE_ARCHIVE_STATUS = "INTERLINE_OUTWARD_INVOICE_ARCHIVE_STATUS";
	public static final String ARCHIVE_INTERLINE_AWB = "ARCHIVE_INTERLINE_AWB";
	public static final String ARCHIVE_AWB_ACCOUNTING_ENTRIES = "ARCHIVE_AWB_ACCOUNTING_ENTRIES";
	public static final String ARCHIVE_PRELIMINARY_INVOICE = "ARCHIVE_PRELIMINARY_INVOICE";
	public static final String CRA_SYSTEM_ADMINISTRATION_EMAIL = "CRA_SYSTEM_ADMINISTRATION_EMAIL";
	public static final String COMMERCIAL_INVOICE_PAYMENT_ARCHIVE_STATUS = "COMMERCIAL_INVOICE_PAYMENT_ARCHIVE_STATUS";
	public static final String CASS_INVOICE_PAYMENT_ARCHIVE_STATUS = "CASS_INVOICE_PAYMENT_ARCHIVE_STATUS";
	public static final String INTR_INWD_INVOICE_PAYMENT_ARCHIVE_STATUS = "INTR_INWD_INVOICE_PAYMENT_ARCHIVE_STATUS";
	public static final String INTR_OTWD_INVOICE_PAYMENT_ARCHIVE_STATUS = "INTR_OTWD_INVOICE_PAYMENT_ARCHIVE_STATUS";
	public static final String RETENTION_NUMBER_OF_DAYS_FOR_HOST_AWB = "RETENTION_NUMBER_OF_DAYS_FOR_HOST_AWB";

	public static final String APPLICATION_OF_PAYMENTS_QUEUE_NAME = "APPLICATION_OF_PAYMENTS_QUEUE_NAME";
	public static final String APPLICATION_OF_PAYMENTS_OVER_PAID_QUEUE = "APPLICATION_OF_PAYMENTS_OVER_PAID_QUEUE";
	public static final String APPLICATION_OF_PAYMENTS_OVER_PAID_QUEUE_OFFICE = "APPLICATION_OF_PAYMENTS_OVER_PAID_QUEUE_OFFICE";
	public static final String APPLICATION_OF_PAYMENTS_NOT_BILLED_QUEUE = "APPLICATION_OF_PAYMENTS_NOT_BILLED_QUEUE";
	public static final String APPLICATION_OF_PAYMENTS_NOT_BILLED_QUEUE_OFFICE = "APPLICATION_OF_PAYMENTS_NOT_BILLED_QUEUE_OFFICE";

	public static final String APPLICATION_OF_PAYMENTS_PARTIALLY_PAID_QUEUE = "APPLICATION_OF_PAYMENTS_PARTIALLY_PAID_QUEUE";
	public static final String APPLICATION_OF_PARTIALLY_PAID_QUEUE_OFFICE = "APPLICATION_OF_PARTIALLY_PAID_QUEUE_OFFICE";

	public static final String APPLICATION_OF_PAYMENTS_NOT_SETTLED_QUEUE = "APPLICATION_OF_PAYMENTS_NOT_SETTLED_QUEUE";
	public static final String APPLICATION_OF_PAYMENTS_NOT_SETTLED_QUEUE_OFFICE = "APPLICATION_OF_PAYMENTS_NOT_SETTLED_QUEUE_OFFICE";
	public static final String ERROR_MONTHLY_REPORT_QUEUE_OFFICE = "ERROR_MONTHLY_REPORT_QUEUE_OFFICE";

	public static final String ERROR_ACCOUNTING_ENTRIES_REPORT_QUEUE = "ERROR_ACCOUNTING_ENTRIES_REPORT_QUEUE";

	public static final String ERROR_ACCOUNTING_ENTRIES_REPORT_QUEUE_OFFICE = "ERROR_ACCOUNTING_ENTRIES_REPORT_QUEUE_OFFICE";

	public static final String ERROR_TRIAL_REPORT_QUEUE_OFFICE = "ERROR_TRIAL_REPORT_QUEUE_OFFICE";

	public static final String ERROR_TRIAL_REPORT_QUEUE = "ERROR_TRIAL_REPORT_QUEUE";

	public static final String APPLICATION_OF_PAYMENTS_QUEUE_OFFICE = "APPLICATION_OF_PAYMENTS_QUEUE_OFFICE";

	public static final String REJECTION_MEMO_ACCOUNTING_ENTRY_QUEUE_OFFICE = "REJECTION_MEMO_ACCOUNTING_ENTRY_QUEUE_OFFICE";

	public static final String REJECTION_MEMO_ACCOUNTING_ENTRY_QUEUE = "REJECTION_MEMO_ACCOUNTING_ENTRY_QUEUE";

	public static final String PAYMENT_OUTSTANDING_DAYS1 = "PAYMENT_OUTSTANDING_DAYS1";
	public static final String PAYMENT_OUTSTANDING_DAYS2 = "PAYMENT_OUTSTANDING_DAYS2";
	public static final String PAYMENT_OUTSTANDING_DAYS3 = "PAYMENT_OUTSTANDING_DAYS3";
	public static final String PAYMENT_OUTSTANDING_DAYS4 = "PAYMENT_OUTSTANDING_DAYS4";
	public static final String ACCRUAL_AIRWAYBILL_STATUS_TYPE = "ACCRUAL_AIRWAYBILL_STATUS_TYPE";
	public static final String AIRWAYBILL_GOODS_ACCEPTANCE_STATUS = "AIRWAYBILL_GOODS_ACCEPTANCE_STATUS";
	public static final String AIRWAYBILL_DATE_CRITERIA = "AIRWAYBILL_DATE_CRITERIA";
	public static final String AIRWAYBILL_CHUNK_SIZE = "AIRWAYBILL_CHUNK_SIZE";

	public static final String PURGE_INVOICE = "PURGE_INVOICE";
	public static final String PURGE_AWB = "PURGE_AWB";
	public static final String PURGE_AWB_ACCOUNTING_ENTRIES = "PURGE_AWB_ACCOUNTING_ENTRIES";

	public static final String ACTUAL_FLOWN_URL = "ACTUAL_FLOWN_URL";

	public static final String SPA_DAYS_TO_RETAIN = "SPA_DAYS_TO_RETAIN";

	public static final String RETAIN_FORWARD_BOOKING_DAYS = "RETAIN_FORWARD_BOOKING_DAYS";

	/**
	 * This constant denotes a run-time parameter which specifies the office
	 * name for the participant online sync service.
	 * <p>
	 * Value = {@value}
	 */

	public static final String ONLINESYNC_ERRORQ_OFFICENAME = "ONLINESYNC_ERRORQ_OFFICENAME";

	public static final String ACCRUAL_AWB_INFO_FETCH_URL = "ACCRUAL_AWB_INFO_FETCH_URL";

	public static final String ACCRUAL_AWB_OID_FETCH_URL = "ACCRUAL_AWB_OID_FETCH_URL";

	public static final String INT_BILL_FILE_GEN_ERR_MESSAGE_QUEUE_NAME = "INT_BILL_FILE_GEN_ERR_MESSAGE_QUEUE_NAME";
	public static final String INT_BILL_FILE_GEN_ERR_MESSAGE_QUEUE_OFFICE = "INT_BILL_FILE_GEN_ERR_MESSAGE_QUEUE_OFFICE";

	public static final String SIS_RUN_DATE = "SIS_RUN_DATE";
	public static final String ERROR_ACCRUAL_REPORT_QUEUE = "ERROR_ACCRUAL_REPORT_QUEUE";
	public static final String ERROR_ACCRUAL_ACCOUNTING_OFFICE_QUEUE = "ERROR_ACCRUAL_ACCOUNTING_OFFICE_QUEUE";

	public static final String LMS_URL = "LMS_URL";

	/**
	 * This constant specifies whether add on rate should be applied for the
	 * contract based on the ratesource.
	 * <p>
	 * Value = {@value}
	 */

	public static final String ADDON_RATE_SOURCE_FOR_CONTRACT = "ADDON_RATE_SOURCE_FOR_CONTRACT";

	/**
	 * Ths constant specifies if the user's user authority should be Full CRU
	 * Authority to perform SRA Authorisation.
	 */
	public static final String SRA_AUTHORIZATION_REQUIRES_CRU_AUTHORITY = "SRA_AUTHORIZATION_REQUIRES_CRU_AUTHORITY";

	public static final String SIGNATURE_REQUIRED_ON_EAWB = "SIGNATURE_REQUIRED_ON_EAWB";

	/**
	 * Ths constant specifies if the user's user authority should be Full CRU
	 * Authority to perform SRA Authorisation.
	 */
	public static final String PARTICIPANT_HISTORY_GOL = "PARTICIPANT_HISTORY_GOL";
	public static final String IGNORE_PARTICIPANT_CACC = "IGNORE_PARTICIPANT_CACC";

	/**
	 * Ths constant is used to control whether only station codes can be used
	 * for the origin and destination of soft and hard block allotments.
	 */

	public static final String ALLOTMENT_CONTRACTS_STATIONS_ONLY = "ALLOTMENT_CONTRACTS_STATIONS_ONLY";

	/**
	 * Ths constant is used if the user wants to see the All allotmet contracts
	 * for R&P.
	 */
	public static final String RP_PRICE_MULTIPLE_ALLOTMENTS = "RP_PRICE_MULTIPLE_ALLOTMENTS";

	public static final String PHARMA_VITALS_CHECK_INTERVAL = "Pharma_Vitals_Check_Interval";

	public static final String PHARMA_VITALS_DELAY_MINUTES = "Pharma_Vitals_Delay_Minutes";

	public static final String PHARMA_EMAIL_ALERT_MINUTES = "Pharma_Email_Alert_Minutes";

	public static final String PHARMA_HIGHLIGHT_YELLOW = "Pharma_Highlight_Yellow";

	public static final String PHARMA_HIGHLIGHT_RED = "Pharma_Highlight_Red";

	public static final String C$CWIS = "C$CWIS"; // 'Y : The CWIS Interface is
													// enabled. N : The CWIS
													// Interface is disabled.'

	public static final String C$CWSN = "C$CWSN"; // Any Valid Station

	public static final String IS_EXTRA_LOGS_NEEDED = "IS_EXTRA_LOGS_NEEDED"; //'Y' : Extra logs enabled, 'N' disabled.

	public static final String AWB_PARAMETER_MODULE_NAME = "AWB";

	public static final String DEFAULT_CARRIER_WUNIT = "DEFAULT_CARRIER_WEIGHT_UNIT";

	public static final String MHS_TTY_TO_ADDRESS = "MHSTTYTOADDRESS";

	public static final String MSH_TTY_FROM_ADDRESS = "MHSTTYFROMADDRESS";

	public static final String MHS_STATION_ID = "MHSQUEUESTATION";

	public static final String MHS_OFFICE_ID = "MHSQUEUEOFFICE";

	/**
	 * Ths constant is used if the user wants cargo density check.
	 */
	public static final String C$RDCD = "C$RDCD";

	public static final String DEFAULT_CWIS_DIMENSION_VALUE = "DEFAULT_CWIS_DIMENSION_VALUE";

	/**
	 * Ths constant is used to hold the maximum number of days that LMS will
	 * wait before creating the applicable Underutilized Allotment Fee after the
	 * active allotment is released.
	 */
	public static final String UNDERUTILIZED_ALLOTMENT_FEE_FINAL_PROCESS_DAYS = "UNDERUTILIZED_ALLOTMENT_FEE_FINAL_PROCESS_DAYS";

	public static final String ARCHIVE_AWB_RETENTION_DAYS = "ARCHIVE_AWB_RETENTION_DAYS";

	public static final String LMS_SUGGESTIVE_URL = "LMS_SUGGESTIVE_URL";

	public static final String EXPORT_PAYCODE = "EXPORT_PAYCODE";


	public static final String SPL_RULES_RESPONSE_Q = "SPLRULESRESPONSEQ";

	/**
	 * This constant holds the Parameter that defines the webservice url for rules
	 * aut deployment.
	 * <p>
	 * Value = {@value}
	 */
	public static final String RULES_WEBSERVICE_URL = "RULES_WEBSERVICE_URL";

	public static final String SPRING_BATCH_ADMIN_URL = "SPRING_BATCH_ADMIN_URL";

	public static final String UNUSED_SPOT_RATES_REPORT_FILE_NAME = "UNUSED_SPOT_RATES_REPORT_FILE_NAME";

	public static final String LIST_MAXIMUM_ROWS = "LIST_MAXIMUM_ROWS";

	public static final String OPERATIONAL_DASHBOARD_URL = "OPERATIONAL_DASHBOARD_URL";


	public static final String ACAS_REPORT_MAX_LINES = "ACAS_Report_Max_Lines";

	public static final String ASR_DOWNLOAD_MAXIMUM_ROWS = "ASR_DOWNLOAD_MAXIMUM_ROWS";
	public static final String CARGO_MAIL_ACN = "C$MAIL";

    public static final String Purge_Expired_Tariff_Class_Joint_Rates = "Purge_Expired_Tariff_Class_Joint_Rates";
    public static final String Purge_Expired_Add_On_Rates = "Purge_Expired_Add_On_Rates";

    public static final String CRA_GOVERNMENT_TAX = "CRA_Government_Tax";
    public static final String CRA_STATE_TAX = "CRA_State_Tax";

	public static final String MEMO_ON_HOLD_QUEUE_NAME = "MEMO_ON_HOLD_QUEUE_NAME";
	public static final String MEMO_ON_HOLD_QUEUE_OFFICE = "MEMO_ON_HOLD_QUEUE_OFFICE";
	public static final String MEMO_APPROVAL_QUEUE_NAME = "MEMO_APPROVAL_QUEUE_NAME";
	public static final String MEMO_APPROVAL_QUEUE_OFFICE = "MEMO_APPROVAL_QUEUE_OFFICE";

	public static final String SEND_INVOICE_BATCH_DATE_DIFFERENCE = "Send Invoice batch date difference";
	public static final String SAP_RUN_DATE = "SAP_RUN_DATE";
	public static final String FLOWN_QUEUE_OFFICE="FLOWN_QUEUE_OFFICE";
	public static final String FLOWN_QUEUE_NAME="FLOWN_QUEUE_NAME";
	public static final String FLOWN_WEIGHT_TOLERANCE="FLOWN_WEIGHT_TOLERANCE";

	public static final String SPLIT_QUEUE_NAME="SPLIT_QUEUE_NAME";
	public static final String SPLIT_QUEUE_OFFICE="SPLIT_QUEUE_OFFICE";

	public static final String C$LMDT="C$LMDT";

	public static final String LOYALTY_MANAGEMENT="Loyalty Management";

	public static final String CGO_MODULE="CGO";

	//changes start

	public static final String AWB_AUDIT_ERROR_QUEUE_MESSAGE="AWB_AUDIT_ERROR_QUEUE_MESSAGE";

	// changes end

	/**
	 * This constant determines the Station portion of the Host Teletype Address
	 * .
	 * <p>
	 * Value ={@value}
	 */
	public static final String HOST_SYSTEM_TELETYPE_STATION = "HOST_SYSTEM_TELETYPE_STATION";
	/**
	 * This constant holds The Office portion of the Host Teletype Address.
	 * <p>
	 * Value = {@value}
	 */
	public static final String HOST_SYSTEM_TELETYPE_OFFICE = "HOST_SYSTEM_TELETYPE_OFFICE";
	/**
	 * This constant holds The CITY CODE FOR ULDCONTROL HEADQUARTERS.
	 * <p>
	 * Value = {@value}
	 */
	public static final String CITY_CODE_FOR_ULD_CONTROL_HEAD_QUARTERS = "CITY_CODE_FOR_ULD_CONTROL_HEAD_QUARTERS";
	/**
	 * This constant holds The OFFICE CODE FOR ULDCONTROL HEADQUARTERS.
	 * <p>
	 * Value = {@value}
	 */
	public static final String OFFICE_CODE_FOR_ULD_CONTROL_HEAD_QUARTERS =
			"OFFICE_CODE_FOR_ULD_CONTROL_HEAD_QUARTERS";

	/**
	 * This constant holds The OFFICE CODE FOR ULDCONTROL HEADQUARTERS.
	 * <p>
	 * Value = {@value}
	 */
	public static final String RELEASE_TO_ACCOUTING_AT_ER_OR_ER_AND_IR = "C$ERIR";

	public static final String ACCOUNTING_SPRING_BATCH_ADMIN_URL =
			"ACCOUNTING_SPRING_BATCH_ADMIN_URL";

	public static final String PARTICIPATES_IN_EAWB_MULTILATERAL_COUNTRY_STATION = "EAWB_Multilateral_Station_Country_Default";
	public static final String PARTICIPATES_IN_EAWB_MULTILATERAL_PARTICIPANT = "EAWB_Multilateral_Participant_Default";

	public static final String PARAM_IS_APS_ALLOWED = "C$ADPY";

	// FIS142B Changes
	public static final String CARRIER_LOADED_CONSOL_ULD_BOOKINGS="CARRIER_LOADED_CONSOL_ULD_BOOKINGS";
	public static final String DEFAULT_PAYCODE_ON_BOOKING = "DEFAULT_PAYCODE_ON_BOOKING";
	public static final String IMPORT_PAYCODE = "IMPORT_PAYCODE";

	public static final String ORIGIN_ADVANCE_CHARGE      = "ORIGIN_ADVANCE_CHARGE";
	public static final String DESTINATION_ADVANCE_CHARGE = "DESTINATION_ADVANCE_CHARGE";

	//Accounting AWB list screen
	public static final String ACCOUNTING_LIST_MAXIMUM_ROWS="ACCOUNTING_LIST_MAXIMUM_ROWS";
	//SK253A
	public static final String C$EXBK = "C$EXBK";

	public static final String NUMBER_OF_SPA_RECORDS_RETRIEVAL="NUMBER_OF_SPA_RECORDS_RETRIEVAL";

	public static final String ALERTS_MESSAGE_FEATURE = "Alerts_Message_Feature";
	public static final String ALERTS_DEFAULT_END_PERIOD = "Alert_Default_End_Period";

	//Mh020
	public static final String C$SPET = "C$SPET";

	public static final String NUMBER_OF_SPA_RECORDS_RETRIEVAL1 = null;

	public static final String NUMBER_OF_DAYS_AFTER_EXPIRED_ALERTS_PURGED = "Alert_Expiry_Days" ;

	public static final String INVOICE_NUMBER_FORMAT ="INVOICE_NUMBER_FORMAT";

    /**
     * This constant holds the value of SENDER_ADDRESS.
     * <p>
     * Value = {@value}
     */
	public static final String SENDER_ADDRESS  ="SENDER_ADDRESS ";

	public static final String CONTROL_UNIT_OF_MEASURE_AT_ACCEPTANCE = "Control_Unit_of_Measure_at_Acceptance";

	public static final String PROFILES_TO_SKIP_ALERTS="Profiles_To_Skip_Alerts";
	public static final String  C$SCCN ="COMPANY_NAME_MANDATORY";

	public static final String ERROR_MESSAGE_QUEUE_OFFICE = "ERROR_MESSAGE_QUEUE_OFFICE";
	public static final String ERROR_MESSAGE_QUEUE_OFFICE_FOR_NC = "ERROR_MESSAGE_QUEUE_OFFICE_FOR_NC";
	public static final String ERROR_MESSAGE_QUEUE_OFFICE_FOR_BA = "ERROR_MESSAGE_QUEUE_OFFICE_FOR_BA";
	public static final String STATION_CASH_AWB_UPDATE_AUTHORITY = "STATION_CASH_AWB_UPDATE_AUTHORITY";
	public static final String ENABLE_TRUCK_BOOKING_MESSAGE_INTERFACE = "ENABLE_TRUCK_BOOKING_MESSAGE_INTERFACE";

	/**
	 * This constant holds the value of DEFAULT_REF.
	 * <p>
	 * Value = {@value}
	 */
	public static final String DEFAULT_REF  ="DEFAULT_REF";

	/**
	 * This constant holds the value of GENERAL.
	 * <p>
	 * Value = {@value}
	 */
	public static final String GENERAL  ="General";

	/**
	 * This constant holds the value of UPLOAD_SUPPORT_DATA_FILE_SIZE.
	 * <p>
	 * Value = {@value}
	 */

	public static final String UPLOAD_SUPPORT_DATA_FILE_SIZE = "Upload_Support_Data_File_Size";
	public static final String NUMBER_OF_DAYS_TO_PURGE_UPLOADED_SPOTRATE_FILE = "Number_Of_Days_To_Purge_Uploaded_SpotRate_File";
	public static final String NUMBER_OF_DAYS_TO_PURGE_UPLOADED_CONTRACT_FILE = "Number_Of_Days_To_Purge_Uploaded_Contract_File";
	public static final String NUMBER_OF_DAYS_TO_PURGE_UPLOADED_TARIFFS_FILE = "Number_Of_Days_To_Purge_Uploaded_Tariffs_File";
	public static final String NUMBER_OF_DAYS_TO_PURGE_UPLOADED_AGGREGATE_FILE = "Number_Of_Days_To_Purge_Uploaded_Aggregate_File";
	public static final String NUMBER_OF_DAYS_TO_PURGE_UPLOADED_PARTSGROUPS_FILE = "Number_Of_Days_To_Purge_Uploaded_PartsGroups_File";


	/**
	 * This constant holds the value of PARTICIPANT_GROUP_MEMBER_CONTROL.
	 * <p>
	 * Value = {@value}
	 */
	public static final String PARTICIPANT_GROUP_MEMBER_CONTROL = "Participant_Group_Member_Control";
	/**
	 * This constant holds the value of PARTICIPANT_GROUP_MEMBER_PURGE_DAYS.
	 * <p>
	 * Value = {@value}
	 */
	public static final String PARTICIPANT_GROUP_MEMBER_PURGE_DAYS = "Participant_Group_Member_Purge_Days";

	/**
	 * This constant holds the value of CHANGE_RATE_CLASS_TO_M.
	 * <p>
	 * Value = {@value}
	 */
	public static final String CHANGE_RATE_CLASS_TO_M ="Change_Rate_Class_To_M";
	public static final String CGOWSXML = "CGOWSXML_Internal";


	public static final String DEFAULT_FLIGHT_NUMBER_FOR_DISCREPANCY_SEGMENT = "Default_Flight_Number_For_Discrepancy_Segment";

	public static final String DISPLAY_ACCOUNTING_TDS = "DISPLAY_ACCOUNTING_TDS";

	public static final String DISPLAY_KERALA_FLOOD_CESS  = "DISPLAY_KERALA_FLOOD_CESS";

	public static final String KERALA_FLOOD_CESS_TAX = "KERALA_FLOOD_CESS_TAX";

	public static final String DISPLAY_ACCOUNTING_INDIAN_GOODS_AND_SERVICE_TAX = "DISPLAY_ACCOUNTING_INDIAN_GOODS_AND_SERVICE_TAX";
	
	public static final String CRA_CGST_TAX = "CRA_CGST_TAX";
	
	public static final String CRA_SGST_TAX = "CRA_SGST_TAX";

	public static final String CRA_IGST_TAX = "CRA_IGST_TAX";
	
	public static final String DISPLAY_COMMERCIAL_SURCHARGE  = "DISPLAY_COMMERCIAL_SURCHARGE";

	public static final String COMMERCIAL_SURCHARGE_CODE = "COMMERCIAL_SURCHARGE_CODE";

	public static final String BILLING_CREDIT_MEMO_APPROVAL_PROFILE = "Billing/Credit_Memo_Approval_Profile";

	public static final String CHECK_SHIPMENT_WEIGHT = "CHECK_SHIPMENT_WEIGHT";
	public static final String CONTROL_DIMENSIONS_FOR_SDH_SIZE_EXTRA_LARGE = "CONTROL_DIMENSIONS_FOR_SDH_SIZE_EXTRA_LARGE";
	public static final String CONTROL_DIMENSIONS_FOR_SDH_SIZE_LARGE = "CONTROL_DIMENSIONS_FOR_SDH_SIZE_LARGE";
	public static final String CONTROL_WEIGHT_FOR_SDH_RISK_CALCULATION_OF_SHAPE_CATEGORY_RECTANGULAR = "CONTROL_WEIGHT_FOR_SDH_RISK_CALCULATION_OF_SHAPE_CATEGORY_RECTANGULAR";
	public static final String CONTROL_DENSITY_FOR_SDH_RISK_CALCULATION = "CONTROL_DENSITY_FOR_SDH_RISK_CALCULATION";
	public static final String CONTROL_WEIGHT_FOR_SDH_RISK_CALCULATION_OF_SHAPE_CATEGORY_ROUND_SPHERICAL = "CONTROL_WEIGHT_FOR_SDH_RISK_CALCULATION_OF_SHAPE_CATEGORY_ROUND_SPHERICAL";
	public static final String CONTROL_WEIGHT_FOR_SDH_RISK_CALCULATION_OF_SHAPE_CATEGORY_SMALL_POINTED_END = "CONTROL_WEIGHT_FOR_SDH_RISK_CALCULATION_OF_SHAPE_CATEGORY_SMALL_POINTED_END";
	public static final String CONTROL_WIDTH_AND_HEIGHT_FOR_SDH_RISK_CALCULATION = "CONTROL_WIDTH_AND_HEIGHT_FOR_SDH_RISK_CALCULATION";
	public static final String CONTROL_WEIGHT_FOR_SDH_RISK_CALCULATION_FOR_SPECIAL_AIRCRAFT_TYPES = "CONTROL_WEIGHT_FOR_SDH_RISK_CALCULATION_FOR_SPECIAL_AIRCRAFT_TYPES";
	public static final String CONTROL_WEIGHT_FOR_SDH_RISK_CALCULATION = "CONTROL_WEIGHT_FOR_SDH_RISK_CALCULATION";
	public static final String CONTROL_DIMENSIONS_FOR_SDH_SIZE_MEDIUM_AND_SMALL = "CONTROL_DIMENSIONS_FOR_SDH_SIZE_MEDIUM_AND_SMALL";
	public static final String CONTROL_SPECIAL_HANDLING_CODE_FOR_A_SMALL_SIZE_SHIPMENT = "CONTROL_SPECIAL_HANDLING_CODE_FOR_A_SMALL_SIZE_SHIPMENT";
	public static final String CONTROL_OTHER_MEASURE_FACTOR_FOR_A_SMALL_SHIPMENT = "CONTROL_OTHER_MEASURE_FACTOR_FOR_A_SMALL_SHIPMENT";
	public static final String CONTROL_SPECIAL_HANDLING_CODE_FOR_A_MEDIUM_SIZE_SHIPMENT = "CONTROL_SPECIAL_HANDLING_CODE_FOR_A_MEDIUM_SIZE_SHIPMENT";
	public static final String CONTROL_OTHER_MEASURE_FACTOR_FOR_A_MEDIUM_SHIPMENT = "CONTROL_OTHER_MEASURE_FACTOR_FOR_A_MEDIUM_SHIPMENT";
	public static final String CONTROL_SPECIAL_HANDLING_CODE_FOR_A_LARGE_SIZE_SHIPMENT = "CONTROL_SPECIAL_HANDLING_CODE_FOR_A_LARGE_SIZE_SHIPMENT";
	public static final String CONTROL_OTHER_MEASURE_FACTOR_FOR_A_LARGE_SHIPMENT = "CONTROL_OTHER_MEASURE_FACTOR_FOR_A_LARGE_SHIPMENT";
	public static final String CONTROL_SPECIAL_HANDLING_CODE_FOR_AN_EXTRA_LARGE_SIZE_SHIPMENT = "CONTROL_SPECIAL_HANDLING_CODE_FOR_AN_EXTRA_LARGE_SIZE_SHIPMENT";
	public static final String CONTROL_OTHER_MEASURE_FACTOR_FOR_AN_EXTRA_LARGE_SHIPMENT = "CONTROL_OTHER_MEASURE_FACTOR_FOR_AN_EXTRA_LARGE_SHIPMENT";
	public static final String CONTROL_SPECIAL_HANDLING_CODE_FOR_ANY_SDH_SHIPMENT = "CONTROL_SPECIAL_HANDLING_CODE_FOR_ANY_SDH_SHIPMENT";
	public static final String CONTROL_SPECIAL_AIRCRAFT_TYPES_FOR_SDH = "CONTROL_SPECIAL_AIRCRAFT_TYPES_FOR_SDH";
	
	public static final String C$RGBL = "C$RGBL";
	public static final String EVENT_L_URL = "EVENT_L_URL";
	
	//UIS157
	public static final String NUMBER_OF_DAYS_TO_PURGE_EMBARGOES = "NUMBER_OF_DAYS_TO_PURGE_EMBARGOES";

	public static final String STATION_RESTRICTION_ENFORCEMENT = "STATION_RESTRICTION_ENFORCEMENT";

	public static final String STATION_RESTRICTION_FORMAT_FOR_ECXSTN_SERVICE = "STATION_RESTRICTION_FORMAT_FOR_ECXSTN_SERVICE";
	public static final String AWB_STATION_RESTRICTION_RESPONSE_QUEUE = "AWB_STATION_RESTRICTION_RESPONSE_QUEUE";
	public static final String SEGMENT_STATION_RESTRICTION_RESPONSE_QUEUE = "SEGMENT_STATION_RESTRICTION_RESPONSE_QUEUE";
	//UIS157

	public static final String TDS_COUNTRY_CODE = "TDS_COUNTRY_CODE";
	// copied from NG

	 public static final String RULES_ENGINE_ENABLED = "RULES_ENGINE_ENABLED";
	 public static final String C$PLTW = "C$PLTW";
	 public static final String C$PLTV = "C$PLTV";
	 public static final String C$TWSF = "C$TWSF";
	 public static final String C$TWSP = "C$TWSP";
	 
	 public static final String C$NGRU = "C$NGRU";
	 
	 public static final String C$PLTM = "C$PLTM";
	 
	 public static final String C$RPLT = "C$RPLT";
	 
	 public static final String PRODUCT_CODE_FOR_STRATAIR = "PRODUCT_CODE_FOR_STRATAIR";

	//UIS171
	public static final String USE_PARTICIPANT_CONTACTS = "USE_PARTICIPANT_CONTACTS";
	public static final String EMAIL_FIELD_FORMAT = "EMAIL_FIELD_FORMAT";
	public static final String PHONE_FIELD_FORMAT = "PHONE_FIELD_FORMAT";
	public static final String FAX_FIELD_FORMAT = "FAX_FIELD_FORMAT";
	public static final String POSTAL_MAIL_PRODUCT_CODE = "Postal_Mail_Product_Code";
	 
	 public static final String AUDIT_STATUS_FOR_FLOWN_ACCOUNTING_ENTRY = "Audit_Status_For_Flown_Accounting_Entry";

	 public static final String ADVANCE_PAYMENT_MAINTENANCE = "Advance_Payment_Maintenance";
	public static final String PARTICIPANT_CONTACT_SERVICE_RESPONSE_QUEUE = "PARTICIPANT_CONTACT_SERVICE_RESPONSE_QUEUE";
	public static final String C$DGIF = "C$DGIF";

	public static final String C$AGNT = "C$AGNT";

	 
	// LMSC-11111 UIS158 Start
    public static final String ULDCONTROL_PARAMETER_MODULE_NAME = "ULDCONTROL";
    public static final String ALLOW_UCM_IN_WITHOUT_UCM_OUT = "ALLOW_UCM_IN_WITHOUT_UCM_OUT";
    public static final String AUTOCORRECT_ULDS_FOR_MISSING_UCM = "AUTOCORRECT_ULDS_FOR_MISSING_UCM";
    public static final String SEND_TO_ADVISORY_QUEUE = "SEND_TO_ADVISORY_QUEUE";
    public static final String QUEUE_HEAD_QUARTER_CITY_OFFICE = "QUEUE_HEAD_QUARTER_CITY_OFFICE";
    public static final String AUTOCORRECT_ULDS_FOR_DISCREPANCIES_UCM = "AUTOCORRECT_ULDS_FOR_DISCREPANCIES_UCM";
    public static final String LINK_ULDS_ON_FLIGHT_TO_DOWNLINE_STATION = "LINK_ULDS_ON_FLIGHT_TO_DOWNLINE_STATION";
    public static final String MESSAGE_TIME_UTC_LOCAL = "MESSAGE_TIME_UTC_LOCAL";
    public static final String FIRST_UCR_ALLOWABLE_TIME_FOR_FLIGHT = "FIRST_UCR_ALLOWABLE_TIME_FOR_FLIGHT";
    public static final String SECOND_UCR_ALLOWABLE_TIME_FOR_FLIGHT = "SECOND_UCR_ALLOWABLE_TIME_FOR_FLIGHT";
    public static final String THIRD_UCR_ALLOWABLE_TIME_FOR_FLIGHT = "THIRD_UCR_ALLOWABLE_TIME_FOR_FLIGHT";
    public static final String MAX_HOURS_LUC_EXCHANGE_RESTRICTION = "MAX_HOURS_LUC_EXCHANGE_RESTRICTION";
    public static final String DEFAULT_LOCATION_1 = "DEFAULT_LOCATION_1";
    public static final String DEFAULT_LOCATION_2 = "DEFAULT_LOCATION_2";
    public static final String NON_HOST_TO_NON_HOST_LUC_EXCHANGE = "NON_HOST_TO_NON_HOST_LUC_EXCHANGE";
    public static final String FROM_TTY_ADDRESS_FOR_MUC_MESSAGE = "FROM_TTY_ADDRESS_FOR_MUC_MESSAGE";
    public static final String FROM_TTY_ADDRESS_FOR_LDC_MESSAGE = "FROM_TTY_ADDRESS_FOR_LDC_MESSAGE";
    public static final String TO_TTY_ADDRESS_FOR_MUC_MESSAGE = "TO_TTY_ADDRESS_FOR_MUC_MESSAGE";
    public static final String HOST_CURRENCY_CODE = "HOST_CURRENCY_CODE";
    public static final String EXTERNAL_SYSTEM_TTY_ADDRESS = "EXTERNAL_SYSTEM_TTY_ADDRESS";
    public static final String EXTERNAL_SYSTEM_TTY_ADDRESS_TO_SEND_UCM = "EXTERNAL_SYSTEM_TTY_ADDRESS_TO_SEND_UCM";
    public static final String ADVISORY_QUEUE_CODE = "ADVISORY_QUEUE_CODE";
    public static final String CITY_OFFICE_CODE_FOR_ULD_CONTROL_HEAD_QUARTERS = "CITY_OFFICE_CODE_FOR_ULD_CONTROL_HEAD_QUARTERS";
    public static final String CONTAINER_INACTIVE_HOURS_BEFORE_REPORTING = "CONTAINER_INACTIVE_HOURS_BEFORE_REPORTING";
    public static final String AUTO_LUC_IN = "AUTO_LUC_IN";
    public static final String ALLOWABLE_DAYS_FOR_ULD_CREATION = "ALLOWABLE_DAYS_FOR_ULD_CREATION";
    public static final String NON_HOST_ULD_ALLOWABLE_INDICATOR = "NON_HOST_ULD_ALLOWABLE_INDICATOR";
    public static final String RETURN_ALLOWBLE_DAYS_FOR_FIRST_LUR = "ALLOWABLE_DAYS_FOR_FIRST_LUR";
    public static final String RETURN_ALLOWBLE_DAYS_FOR_SECOND_LUR = "ALLOWABLE_DAYS_FOR_SECOND_LUR";
    public static final String RETURN_ALLOWBLE_DAYS_FOR_THIRD_LUR = "ALLOWABLE_DAYS_FOR_THIRD_LUR";
    public static final String ALLOWABLE_HOURS_FOR_ULD_MOVEMENT = "ALLOWABLE_HOURS_FOR_ULD_MOVEMENT";
    public static final String PRODUCT_FOR_DEMURRAGE_CHARGES = "PRODUCT_FOR_DEMURRAGE_CHARGES";
    public static final String PREPAID_PAY_CODE_FOR_DEMURRAGE_CHARGES = "PREPAID_PAY_CODE_FOR_DEMURRAGE_CHARGES";
    public static final String COLLECT_PAY_CODE_FOR_DEMURRAGE_CHARGES = "COLLECT_PAY_CODE_FOR_DEMURRAGE_CHARGES";
    public static final String OTHER_CHARGE_CODE_FOR_DEMURRAGE_CHARGES = "OTHER_CHARGE_CODE_FOR_DEMURRAGE_CHARGES";
    public static final String OTHER_CHARGE_SUBCODE_RELATED_TO_ULD_DAMAGE =
            "OTHER_CHARGE_SUBCODE_RELATED_TO_ULD_DAMAGE";
    public static final String OTHER_CHARGE_SUBCODE_RELATED_TO_ULD_LOSS =
            "OTHER_CHARGE_SUBCODE_RELATED_TO_ULD_LOSS";
    public static final String OTHER_CHARGE_SUBCODE_RELATED_TO_OTHER_FOR_DEMURRAGE_FILE =
            "OTHER_CHARGE_SUBCODE_FOR_DEMURRAGE_FILE"; // LMS-45895 Changed the value from OTHER_CHARGE_SUBCODE_RELATED_TO_OTHER_FOR_DEMURRAGE_FILE to OTHER_CHARGE_SUBCODE_FOR_DEMURRAGE_FILE
    public static final String ULD_REMINDER_MESSAGE = "ULD_REMINDER_MESSAGE";
    public static final String AUTOCORRECT_ULDS_FOR_DISCREPANCIES_SCM = "AUTOCORRECT_ULDS_FOR_DISCREPANCIES_SCM";
    public static final String CARGO_MAIL_AIRLINE_CODE_NUMBER = "CARGO_MAIL_AIRLINE_CODE_NUMBER";
    public static final String MAXIMUM_NUMBER_OF_ULDS_IN_RUI_RESPONSE = "MAXIMUM_NUMBER_OF_ULDS_IN_RUI_RESPONSE";
    public static final String RUI_REJECT_QUEUE_OFFICE = "RUI_REJECT_QUEUE_OFFICE";
    public static final String RUS_REJECT_QUEUE_OFFICE = "RUS_REJECT_QUEUE_OFFICE";
    public static final String INCLUDE_DEMURRAGE_CHARGES = "INCLUDE_DEMURRAGE_CHARGES";
    // LMSC-11111 UIS158 End
	public static final String AUTHORITY_TO_CANCEL_PRECENDING_LUC = "AUTHORITY_TO_CANCEL_PRECENDING_LUC";
	public static final String AUTHORITY_FOR_ULD_MOVEMENT = "AUTHORITY_FOR_ULD_MOVEMENT";
	public static final String AUTHORITY_TO_DISMISS_CHARGES = "AUTHORITY_TO_DISMISS_CHARGES";
	public static final String AUTHORITY_TO_ADD_UPDATE_MUC_MESSAGE = "AUTHORITY_TO_ADD_UPDATE_MUC_MESSAGE";
	public static final String ALLOWABLE_DAYS_FOR_UCM_INFORMATION_DISPLAY = "ALLOWABLE_DAYS_FOR_UCM_INFORMATION_DISPLAY";
	public static final String ALLOWABLE_DAYS_FOR_FUTURE_UCM_INFORMATION_DISPLAY = "ALLOWABLE_DAYS_FOR_FUTURE_UCM_INFORMATION_DISPLAY";
	 public static final String ORDER_PARAMETER_MODULE_NAME = "ORDER";
	 public static final String GENERAL_MESSAGE_QUEUE_OFFICE = "GENERAL_MESSAGE_QUEUE_OFFICE";

	public static final String SCHEDULED_INVOICE_GENERATION_AND_FINALIZATION = "Scheduled_Invoice_Generation_and_Finalization";

    private ParameterConstants() {

	}
}
