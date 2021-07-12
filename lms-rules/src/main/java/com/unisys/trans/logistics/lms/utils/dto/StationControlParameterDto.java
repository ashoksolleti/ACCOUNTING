/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.io.Serializable;

/**
 * <code>StationControlParameterDto</code> entity contains information about
 * control parameters of the station.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>automaticCheckInAllEnterFlightFinalIndicator
 * <li>automaticCheckInByFlightArrival
 * <li>automaticConfirmDiscrepancyCode
 * <li>automaticEnterFlightFinalInternationalCode
 * <li>automaticEnterFlightFinalPrinter
 * <li>automaticFlightFinalDomesticCode
 * <li>automaticULDInactivationIndicator
 * <li>automaticUSCustomsFlightDepMessageCode
 * <li>awbImportCustomsEnforcementsIndicator
 * <li>ccdFSUMessageControlCode
 * <li>customsArea
 * <li>customsAutomatedPortSelectionCode
 * <li>delayFSUDEPUntilWheelsUpIndicator
 * <li>delayToAccountingExportDays
 * <li>delayToAccountingImportDays
 * <li>depFSUMessageControlCode
 * <li>discrepancyControlStation
 * <li>disFSUMessageControlCode
 * <li>dlvFSUMessageControlCode
 * <li>domesticOnlyIndicator
 * <li>enterFlightManifestAssignmentStatusCode
 * <li>exportDefaultLocations
 * <li>exportMechanizedIndicator
 * <li>flightSummaryFutureHours
 * <li>houseAwbAssociationEnforcementCode
 * <li>houseAwbAutomaticAssociationCode
 * <li>incomingRCSCreatesGoodsIndicator
 * <li>incomingRCSRCFProcessGoodsIndicator
 * <li>manFSUMessageControlCode
 * <li>noticeOfArrivalAutomaticGenerationCode
 * <li>noticeOfArrivalAutomaticPrintIndicator
 * <li>noticeOfArrivalIndicator
 * <li>noticeOfArrivalNumberOfCopies
 * <li>printChargeCorrectiveAdviceIndicator
 * <li>printDeliverySlipIndicator
 * <li>printPFBcreditMessageIndicator
 * <li>printPrintFreightBillIndicator
 * <li>rateQueueOffice
 * <li>rateQueueStation
 * <li>rcfFSUMessageControlCode
 * <li>rcsFSUMessageControlCode
 * <li>rctFSUMessageControlCode
 * <li>recordAwbDocumentsDeliveredIndicator
 * <li>stationOtherChargeQueues
 * <li>stationRestrictionsControlStation
 * <li>taxesApplyIndicator
 * <li>tconPrefixCode
 * <li>tfdFSUMessageControlCode
 * <li>timeAfterFlightDepDomestic
 * <li>timeAfterFlightDepDomesticCode
 * <li>timeAfterFlightDepInternational
 * <li>timeAfterFlightDepInternationalCode
 * <li>timeAfterFlightDepUS
 * <li>timeAfterFlightDepUSCode
 * <li>trmFSUMessageControlCode</li>
 * </code>
 * </ul>
 */
public class StationControlParameterDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 5070816413055645386L;

    /**
     * Attribute to hold <code>automaticCheckInAllEnterFlightFinalIndicator</code> property.
     * <p>
     * Indicator to specify if the Enter Flight Final function should attempt to schedule a Goods Check In
     * functions via INT: ON based on the Goods Check In setting of the offload station.
     * <li><code>true</code><br>
     * Enter Final Flight will attempt to schedule a Goods Check In function.
     * <li><code>false</code><br>
     * Enter Final Flight will not attempt to schedule a Goods Check In function. This is the default value.
     */
    private boolean automaticCheckInAllEnterFlightFinalIndicator;

    /**
     * Attribute to hold <code>automaticCheckInByFlightArrival</code> property.
     * <p>
     * Automatic Check-In By Flight Arrival code and description selection. The Goods Check In function that
     * is performed automatically after flight arrival.
     */
    private String automaticCheckInByFlightArrival;

    /**
     * Attribute to hold <code>automaticCheckInByFlightArrivalMinutes</code> property.
     * <p>
     * Number of minutes after flight arrival (actual time of arrival) when the Goods Check In function
     * defined in the Automatic Check-In By Flight Arrival field is done by the application if no previous
     * manual Goods Check In function was done. If a manual Goods Check In function was done before no error
     * must be generated. Must be 0 if the Automatic Check-In By Flight Arrival field is set to NO. On initial
     * display the default, value is set to 0.
     */
    private int automaticCheckInByFlightArrivalMinutes;

    /**
     * Attribute to hold <code>automaticConfirmDiscrepancyCode</code> property.
     * <p>
     * Indicates if loose goods discrepancies declared at the station are to be automatically confirmed by the
     * system. Values allowed are: N - Indicates discrepancies at this station are not automatically confirmed
     * by the system. This is the default value. There are two yes options - one for international and
     * domestic and the other for domestic only. A - Indicates that all International and Domestic loose goods
     * discrepancies at this station are automatically confirmed by the system. D - Indicates that only
     * Domestic discrepancies for loose goods are automatically confirmed by the system. Domestic
     * discrepancies are all warehouse discrepancies, and import or export discrepancies on domestic flight
     * segments. A flight segment is considered domestic when the boarding and offload stations of the
     * discrepancy are in the same country.
     */
    private String automaticConfirmDiscrepancyCode;

    /**
     * Attribute to hold <code>automaticEnterFlightFinalInternationalCode</code> property.
     * <p>
     * The type of departure time used by the batch program which finalizes flights (in LMS CFMCFT) for
     * scheduling an automatic Flight Finalization for international flights.
     */
    private String automaticEnterFlightFinalInternationalCode;

    /**
     * Attribute to hold <code>automaticEnterFlightFinalPrinter</code> property.
     * <p>
     * Printer to send the message.
     */
    private String automaticEnterFlightFinalPrinter;

    /**
     * Attribute to hold <code>automaticFlightFinalDomesticCode</code> property.
     * <p>
     * The type of departure time used by the batch program which finalizes flights (in LMS CFMCFT) for
     * scheduling an automatic Flight Finalization for domestic flights.
     */
    private String automaticFlightFinalDomesticCode;

    /**
     * Attribute to hold <code>automaticULDInactivationIndicator</code> property.
     * <p>
     * ULD Auto Inactivation indicator. Indicates whether or not an active import ULD at the station is
     * automatically emptied (inactivated) when a user at the station attempts to activate it for export.
     * Possible Values:
     * <li><code>true</code><br>
     * Indicates automatic ULD inactivation is allowed.
     * <li><code>false</code><br>
     * Indicates automatic ULD inactivation is not allowed. This is the default value.
     */
    private boolean automaticULDInactivationIndicator;

    /**
     * Attribute to hold <code>automaticUSCustomsFlightDepMessageCode</code> property.
     * <p>
     * The type of departure time used for scheduling the automatic Enter Flight Final, Initiate Customs, and
     * the generation of a Flight Departure Message. This field is used only if the station is the last
     * station in the flight routing prior to entering the U.S. Scheduled Time - Scheduled departure time (S)
     * Actual Time - Actual departure time (A) Current Time - Current departure time is the default. (C)
     */
    private String automaticUSCustomsFlightDepMessageCode;

    /**
     * Attribute to hold <code>awbClearsImportCode</code> property.
     * <p>
     * Air Waybill clears import audit based on Delivery or finalization Values are: Finalization of Goods
     * (G), FSU DLV (F), The default value is Finalization of Goods (G).
     */
    private String awbClearsImportCode;

    /**
     * Attribute to hold <code>awbImportCustomsEnforcementsIndicator</code> property.
     * <p>
     * Controls whether the clearance number is required for delivery. The station level flag indicates
     * whether the clearance number is required for delivery. When the flag is off, delivery is allowed
     * whether or not an import clearance number has been recorded for the air waybill or house air
     * waybills.When the station level flag is on, each air waybill or house air waybill delivery checks the
     * AWB Custom Clearance status of the air waybill to determine if it can be delivered. Possible Values:
     * <li><code>true</code><br>
     * If AWB import customs enforcement should be done for this country.
     * <li><code>false</code><br>
     * If AWB import customs processing should not be enforced. This field is NOT applicable to US Customs.
     */
    private boolean awbImportCustomsEnforcementsIndicator;

    /**
     * Attribute to hold <code>ccdFSUMessageControlCode</code> property.
     * <p>
     * These flags are used for two purposes: Indicates use of incoming FSU messages, or live goods to
     * determine the current status of a shipment if both, incoming FSU messages, and live goods, exist for
     * the same status and at the same station. This only applies based on a system level dynamic parameter.In
     * LMS, the parameter C$DSSF should be set to1. Indicates if outgoing FSU/FZE messages are generated based
     * on live goods functions, based on incoming FSU messages and the Status Update function, or based on
     * both.
     */
    private String ccdFSUMessageControlCode;

    /**
     * Attribute to hold <code>address</code> property.
     * <p>
     * European customs station or North American station status. This field is populated from the country
     * data of the station's country.
     */
    private String customsArea;

    /**
     * Attribute to hold <code>customsAutomatedPortSelectionCode</code> property.
     * <p>
     * This field can display a list of all the customs station select values defined in the system. From this
     * list, the user can select the customs station select code for this rate queue. Values allowed are: O -
     * There is no customs facility at this station. This is the default value. N - There is a customs
     * facility at this station, but the carrier is not exchanging messages with customs at this station. I -
     * There is a customs facility at this station and the carrier is exchanging only import messages with
     * customs. E - There is a customs facility at this station and the carrier is exchanging only export
     * messages with customs. B - There is a customs facility at this station and the carrier is exchanging
     * both import and export messages with customs. M - There is a customs facility at this station and the
     * carrier is exchanging messages with customs through non-automated means.
     */
    private String customsAutomatedPortSelectionCode;

    /**
     * Attribute to hold <code>delayFSUDEPUntilWheelsUpIndicator</code> property.
     * <p>
     * Indicates if outgoing FSU DEP messages should be delayed until the actual flight departure
     * (wheels-off-the-ground) time.
     * <li><code>true</code><br>
     * Delays FSU DEP messages until a wheels-off-the-ground time has been recorded.
     * <li><code>false</code><br>
     * Sends FSU DEP messages at Flight Finalization time. Default value is false.
     */
    private boolean delayFSUDEPUntilWheelsUpIndicator;

    /**
     * Attribute to hold <code>delayToAccountingExportDays</code> property.
     * <p>
     * Number of days to be delayed. Changing the value of this field affects the number of days in which an
     * air waybill is released to accounting by file maintenance at the export reporting station. The default
     * value is zero (0). When system cargo parameter C$ERIR is set one, both the export delay and the import
     * delay have to be met before the air waybill can be released to accounting.
     */
    private int delayToAccountingExportDays;

    /**
     * Attribute to hold <code>delayToAccountingImportDays</code> property.
     * <p>
     * Number of days to be delayed. Changing the value of this field affects the number of days in which an
     * air waybill is released to accounting by file maintenance at the import reporting station. The default
     * value is zero (0). When system cargo parameter C$ERIR is set one, both the export delay and the import
     * delay have to be met before the air waybill can be released to accounting.
     */
    private int delayToAccountingImportDays;

    /**
     * Attribute to hold <code>depFSUMessageControlCode</code> property.
     * <p>
     * These flags are used for two purposes: Indicates use of incoming FSU messages, or live goods to
     * determine the current status of a shipment if both, incoming FSU messages, and live goods, exist for
     * the same status and at the same station. This only applies based on a system level dynamic parameter.In
     * LMS, the parameter C$DSSF should be set to 1. Indicates if outgoing FSU/FZE messages are generated
     * based on live goods functions, based on incoming FSU messages and the Status Update function, or based
     * on both.
     */
    private String depFSUMessageControlCode;

    /**
     * Attribute to hold <code>discrepancyControlStation</code> property.
     * <p>
     * Discrepancy control station. If the station controls its own discrepancies then this field should be
     * blank. If the station does not control its own discrepancies then this field should contain a valid
     * station code. If the station is not a host station, then this field is set to blank and any station
     * code entered here is ignored, because there is no discrepancy control for non-host stations. If a host
     * station is changed to non-host, but the station is the owner of any air waybills or ULDs with
     * associated discrepancies, then a warning is displayed.
     */
    private String discrepancyControlStation;

    /**
     * Attribute to hold <code>disFSUMessageControlCode</code> property.
     * <p>
     * These flags are used for two purposes: Indicates use of incoming FSU messages, or live goods to
     * determine the current status of a shipment if both, incoming FSU messages, and live goods, exist for
     * the same status and at the same station. This only applies based on a system level dynamic parameter.In
     * LMS, the parameter C$DSSF should be set to 1. Indicates if outgoing FSU/FZE messages are generated
     * based on live goods functions, based on incoming FSU messages and the Status Update function, or based
     * on both.
     */
    private String disFSUMessageControlCode;

    /**
     * Attribute to hold <code>dlvFSUMessageControlCode</code> property.
     * <p>
     * These flags are used for two purposes: Indicates use of incoming FSU messages, or live goods to
     * determine the current status of a shipment if both, incoming FSU messages, and live goods, exist for
     * the same status and at the same station. This only applies based on a system level dynamic parameter.In
     * LMS, the parameter C$DSSF should be set to 1. Indicates if outgoing FSU/FZE messages are generated
     * based on live goods functions, based on incoming FSU messages and the Status Update function, or based
     * on both.
     */
    private String dlvFSUMessageControlCode;

    /**
     * Attribute to hold <code>domesticOnlyIndicator</code> property.
     * <p>
     * The Domestic only indicator is used to determine whether the check-in all function should process only
     * domestic and no international flights, or whether it should process all flights. Possible Values:
     * <li><code>true</code><br>
     * If the check-in all function processes only domestic flights.
     * <li><code>false</code><br>
     * If the check-in all function processes domestic and international flights.
     */
    private boolean domesticOnlyIndicator;

    /**
     * Attribute to hold <code>enterFlightManifestAssignmentStatusCode</code> property.
     * <p>
     * Used by the FFM Message and Enter Flight Manifest function to indicate whether to assign a shipment as
     * "Finalized" or "Not Finalized".
     */
    private String enterFlightManifestAssignmentStatusCode;

    /**
     * Attribute to hold <code>exportDefaultLocations</code> property.
     * <p>
     * The default location for the acceptance of goods at this station. This location is used when there is
     * no location entered in the accept goods. If this field is blank, then the system wide default location
     * is used by the Accept Goods function. If this field is blank, then the system wide default system
     * location parameter is used by the Accept Goods function (LMS parameter is C$ELOC). The value of "NONE"
     * can be entered to indicate that there is no default location defined at the station level and that the
     * system wide default is not to be used.
     */
    private String exportDefaultLocations;

    /**
     * Attribute to hold <code>exportMechanizedIndicator</code> property.
     * <p>
     * Export mechanized indicator. Indicates whether or not the export part of the station has a PC. This
     * field is not used for processing purposes within the application and is used for display purposes only.
     * Possible Values:
     * <li><code>true</code><br>
     * Indicates Export does have a PC. This is the default value.
     * <li><code>false</code><br>
     * Indicates Export does not have a PC. This is an optional attribute.
     */
    private boolean exportMechanizedIndicator;

    /**
     * Attribute to hold <code>flightSummaryFutureHours</code> property.
     * <p>
     * Number of hours in the future to display flight information.
     */
    private int flightSummaryFutureHours;

    /**
     * Attribute to hold <code>houseAwbAssociationEnforcementCode</code> property.
     * <p>
     * Indicator specifies when the enforcement of house air waybill and master goods association is to be
     * performed.
     */
    private String houseAwbAssociationEnforcementCode;

    /**
     * Attribute to hold <code>houseAwbAutomaticAssociationCode</code> property.
     * <p>
     * Indicator specifies when the automatic association of house air waybill and master goods is to be
     * performed.
     */
    private String houseAwbAutomaticAssociationCode;

    /**
     * Attribute to hold <code>incomingRCSCreatesGoodsIndicator</code> property.
     * <p>
     * Goods Indicator to specify if an incoming FSU RCS message attempts to create goods.
     * <li><code>true</code><br>
     * Indicates that an incoming FSU RCS message attempts to create goods.
     * <li><code>false</code><br>
     * Indicates that an incoming FSU RCS message is only recorded in goods history, and does not attempt to
     * create goods. This is the default value.
     */
    private boolean incomingRCSCreatesGoodsIndicator;

    /**
     * Attribute to hold <code>incomingRCSRCFProcessGoodsIndicator</code> property.
     * <p>
     * Indicator to specify if an incoming FSU: RCF message attempts to check-in goods.
     * <li><code>true</code><br>
     * An incoming FSU RCF message attempts to check-in goods.
     * <li><code>false</code><br>
     * An incoming FSU RCF message is only recorded in goods history, and does not attempt to check-in goods.
     * This is the default value.
     */
    private boolean incomingRCSRCFProcessGoodsIndicator;

    /**
     * Attribute to hold <code>manFSUMessageControlCode</code> property.
     * <p>
     * These flags are used for two purposes: Indicates use of incoming FSU messages, or live goods to
     * determine the current status of a shipment if both, incoming FSU messages, and live goods, exist for
     * the same status and at the same station. This only applies based on a system level dynamic parameter.
     * In LMS, the parameter C$DSSF should be set to 1. Indicates if outgoing FSU/FZE messages are generated
     * based on live goods functions, based on incoming FSU messages and the Status Update function, or based
     * on both.
     */
    private String manFSUMessageControlCode;

    /**
     * Attribute to hold <code>noticeOfArrivalAutomaticGenerationCode</code> property.
     * <p>
     * Enables or disables the automatic generation of a Notice of Arrival either for a Master or a House Air
     * Waybill. Values are: No Auto Generation - Automatic generation of Notice of Arrival is turned off. This
     * is the default value. (0) Auto Generation for Master Air Waybill - Auto generation of Notice of Arrival
     * is turned on and it generates a Notice of Arrival for master air waybill only. (M) Auto Generation for
     * Master or House - Auto generation of Notice of Arrival is turned on and it attempts to generate a
     * Notice of Arrival for house air waybill. (H) If the air waybill does not have any houses or if the
     * Master AWB Status is not set to 'Deconsolidated', the application generates a Notice of Arrival for the
     * master air waybill.
     */
    private String noticeOfArrivalAutomaticGenerationCode;

    /**
     * Attribute to hold <code>noticeOfArrivalAutomaticPrintIndicator</code> property.
     * <p>
     * Possible Values:
     * <li><code>true</code><br>
     * Auto Generation with print:Notice of Arrival is printed.
     * <li><code>false</code><br>
     * Auto Generation without print:Notice of Arrival will not be printed.
     */
    private boolean noticeOfArrivalAutomaticPrintIndicator;

    /**
     * Attribute to hold <code>noticeOfArrivalIndicator</code> property.
     * <p>
     * Notice of arrival indicator. Possible Values:
     * <li><code>true</code><br>
     * If the application will automatically record the delivery of the air waybill documents at the time the
     * Notice of Arrival is recorded.
     * <li><code>false</code><br>
     * If the application will not automatically record the delivery of the AWB documents at the time the
     * Notice of Arrival is recorded.
     */
    private boolean noticeOfArrivalIndicator;

    /**
     * Attribute to hold <code>noticeOfArrivalNumberOfCopies</code> property.
     * <p>
     * Defines the number of copies printed for an automatic Notice of Arrival.
     */
    private int noticeOfArrivalNumberOfCopies;

    /**
     * Attribute to hold <code>printChargeCorrectiveAdviceIndicator</code> property.
     * <p>
     * The Charge Correction Advice print indicator allows stations to use the standard product print formats
     * or local formats (as specified and maintained by the airline). Possible Values: 0 - Default value to
     * the standard product print. 1 - The headers on the CCA are also printed along with the data.
     */
    private int printChargeCorrectiveAdviceIndicator;

    /**
     * Attribute to hold <code>printDeliverySlipIndicator</code> property.
     * <p>
     * The Print Delivery Slip indicator allows stations to use the standard product print formats or local
     * formats (as specified and maintained by the airline). Possible Values: 0 - If the station uses the
     * local print formats. 1 - If the station is allowed to use the standard product print formats.
     */
    private int printDeliverySlipIndicator;

    /**
     * Attribute to hold <code>printPFBcreditMessageIndicator</code> property.
     * <p>
     * The PFB (Print Freight Bill) Credit Message indicator allows stations to use the standard product print
     * formats or to include the credit status on the print. Possible Values: 0 - Default value to the
     * standard product print. 1 - Prints the credit status (Credit Messages) as per the following rules.
     * While printing the origin air waybill at the origin station, the participant responsible for the
     * prepaid charges is checked credit extension. The order of participant being responsible for prepaid
     * charges is the IATA agent, the Origin Prepaid Bill-to participant, and then the Shipper. If the
     * responsible participant has no credit limit, then CASH ONLY is printed on air waybill. If the
     * responsible participant is over their credit limit, then OVER LIMIT is printed on the air waybill. If
     * the responsible participant has a credit limit, but there is no bank selling exchange rate set up for
     * converting currency of participants credit limit to origin currency then XR MISSING is printed on the
     * air waybill. If printing the destination air waybill at the destination station, the participant
     * responsible for the collect charges is checked for whether credit is extended. The order of participant
     * being responsible for collect charges is the Collect Bill-to participant, and then the Consignee. When
     * printing the destination option at the destination station, If the responsible participant has no
     * credit limit, then CASH ONLY is printed on air waybill. If the responsible participant is over their
     * credit limit, then OVER LIMIT is printed on the air waybill. If the responsible participant has credit
     * limit, but there is no bank selling exchange rate set up for converting currency of participants credit
     * limit to destination currency, then XR MISSING is printed on the air waybill.
     */
    private int printPFBcreditMessageIndicator;

    /**
     * Attribute to hold <code>printPrintFreightBillIndicator</code> property.
     * <p>
     * The Print Freight Bill (PFB) indicator allows stations to use the standard product print formats or
     * local formats (as specified and maintained by the airline). Possible Values: 0 - Default value to the
     * standard product print. 1 - The issuing carrier is not printed by PFB.
     */
    private int printPrintFreightBillIndicator;

    /**
     * Attribute to hold <code>rateQueueOffice</code> property.
     * <p>
     * Queuing office designator for an air waybill is queued for tariff rates. If this field is left blank,
     * the air waybill is queued to the office that the agent is signed into. If Rate queue station is
     * entered, then entry of this field is mandatory: otherwise, entry of this field is prohibited.
     */
    private int rateQueueOffice;

    /**
     * Attribute to hold <code>rateQueueStation</code> property.
     * <p>
     * Queuing city for an air waybill is queued for tariff rates. If this field is left blank, the air
     * waybill is queued to the station that the agent is signed into.
     */
    private String rateQueueStation;

    /**
     * Attribute to hold <code>rcfFSUMessageControlCode</code> property.
     * <p>
     * These flags are used for two purposes: Indicates use of incoming FSU messages, or live goods to
     * determine the current status of a shipment if both, incoming FSU messages, and live goods, exist for
     * the same status and at the same station. This only applies based on a system level dynamic parameter.In
     * LMS, the parameter C$DSSF should be set to 1. Indicates if outgoing FSU/FZE messages are generated
     * based on live goods functions, based on incoming FSU messages and the Status Update function, or based
     * on both.
     */
    private String rcfFSUMessageControlCode;

    /**
     * Attribute to hold <code>rcsFSUMessageControlCode</code> property.
     * <p>
     * These flags are used for two purposes: Indicates use of incoming FSU messages, or live goods to
     * determine the current status of a shipment if both, incoming FSU messages, and live goods, exist for
     * the same status and at the same station. This only applies based on a system level dynamic parameter.In
     * LMS, the parameter C$DSSF should be set to 1. Indicates if outgoing FSU/FZE messages are generated
     * based on live goods functions, based on incoming FSU messages and the Status Update function, or based
     * on both.
     */
    private String rcsFSUMessageControlCode;

    /**
     * Attribute to hold <code>rctFSUMessageControlCode</code> property.
     * <p>
     * These flags are used for two purposes: Indicates use of incoming FSU messages, or live goods to
     * determine the current status of a shipment if both, incoming FSU messages, and live goods, exist for
     * the same status and at the same station. This only applies based on a system level dynamic parameter.In
     * LMS, the parameter C$DSSF should be set to 1. Indicates if outgoing FSU/FZE messages are generated
     * based on live goods functions, based on incoming FSU messages and the Status Update function, or based
     * on both.
     */
    private String rctFSUMessageControlCode;

    /**
     * Attribute to hold <code>recordAwbDocumentsDeliveredIndicator</code> property.
     * <p>
     * Indicates whether the automatic generation of a Notice of Arrival will also automatically record the
     * delivery of the air waybill documents.
     * <li><code>true</code><br>
     * The application will automatically record the delivery of the air waybill documents at the time the
     * Notice of Arrival is recorded.
     * <li><code>false</code><br>
     * The application will not automatically record the delivery of the AWB documents at the time the Notice
     * of Arrival is recorded. This is the default value.
     */
    private boolean recordAwbDocumentsDeliveredIndicator;

    /**
     * Attribute to hold <code>stationOtherChargeQueues</code> property.
     * <p>
     * Queuing station for an air waybill is queued for miscellaneous rates. If this field is left blank, the
     * air waybill is queued to the station that the agent is signed into.
     */
    private String stationOtherChargeQueues;

    /**
     * Attribute to hold <code>stationRestrictionsControlStation</code> property.
     * <p>
     * The Station Restrictions Control Station is an alternate station that is allowed to maintain collect
     * charges allowed and embargo information for this station. If this field is blank, it defaults to the
     * station being entered.
     */
    private String stationRestrictionsControlStation;

    /**
     * Attribute to hold <code>taxesApplyIndicator</code> property.
     * <p>
     * Indicates whether taxes (province/state/city) are applied at this station, provided the AWB meets
     * specific criteria. The tax rates and criteria are specified in the tax tables using the Tax Information
     * function. Values allowed are:
     * <li><code>true</code><br>
     * Indicate that taxes are applicable at this station.
     * <li><code>false</code><br>
     * Indicates default value. No taxes are applicable at this station. Refer to Other Charges Generation,
     * Tax Generation for more details.
     */
    private boolean taxesApplyIndicator;

    /**
     * Attribute to hold <code>tconPrefixCode</code> property.
     * <p>
     * Prefix for auto TCON creation. Loose goods of the product code specified in the product code field can
     * be moved into a flight specific Terminal Container (TCON) instead of using the default Goods Check In
     * All location when these conditions are met.
     */
    private String tconPrefixCode;

    /**
     * Attribute to hold <code>tfdFSUMessageControlCode</code> property.
     * <p>
     * These flags are used for two purposes: Indicates use of incoming FSU messages, or live goods to
     * determine the current status of a shipment if both, incoming FSU messages, and live goods, exist for
     * the same status and at the same station. This only applies based on a system level dynamic parameter.In
     * LMS, the parameter C$DSSF should be set to 1. Indicates if outgoing FSU/FZE messages are generated
     * based on live goods functions, based on incoming FSU messages and the Status Update function, or based
     * on both.
     */
    private String tfdFSUMessageControlCode;

    /**
     * Attribute to hold <code>timeAfterFlightDepDomestic</code> property.
     * <p>
     * For the domestic functionality, this parameter defines when after flight departure the flight
     * finalization is automatically executed if no previous manual flight finalization was completed.
     */

    private String timeAfterFlightDepDomestic;

    /**
     * Attribute to hold <code>timeAfterFlightDepDomesticCode</code> property.
     * <p>
     * Indicates whether the time after flight departure for domestic is expressed in minutes or percentage.
     * Minutes - This is the default, with a value of zero. This value defines the number of minutes after
     * flight departure when Flight Finalization is done if no previous manual Flight Finalization was
     * completed. Percentage - Indicates the time entered is a percentage. This value defines the percent of
     * scheduled flight time after flight departure when Flight Finalization is done if no previous manual
     * flight finalization was completed.
     */
    private String timeAfterFlightDepDomesticCode;

    /**
     * Attribute to hold <code>timeAfterFlightDepInternational</code> property.
     * <p>
     * For the international functionality, this parameter defines when after flight departure the flight
     * finalization is automatically executed if no previous manual flight finalization was completed.
     */
    private String timeAfterFlightDepInternational;

    /**
     * Attribute to hold <code>timeAfterFlightDepInternationalCode</code> property.
     * <p>
     * Indicates whether the time after flight departure for international is expressed in minutes or
     * percentage. Minutes - This is the default, with a value of zero. This value defines the number of
     * minutes after flight departure when Flight Finalization is done if no previous manual Flight
     * Finalization was completed. Percentage - Indicates the time entered is a percentage. This value defines
     * the percent of scheduled flight time after flight departure when Flight Finalization is done if no
     * previous manual flight finalization was completed.
     */
    private String timeAfterFlightDepInternationalCode;

    /**
     * Attribute to hold <code>timeAfterFlightDepUS</code> property.
     * <p>
     * This parameter defines when after flight departure the flight finalization, initiate customs and the
     * generation of a flight departure message is automatically executed if they were not previously done.
     */
    private String timeAfterFlightDepUS;

    /**
     * Attribute to hold <code>timeAfterFlightDepUSCode</code> property.
     * <p>
     * Indicates whether the time after flight departure for [NPC]And Initiate US Customs & Flight Departure
     * Message' is expressed in minutes or percentage. Minutes - This is the default, with a value of zero.
     * This value defines the number of minutes after flight departure when Flight Finalization is done if no
     * previous manual Flight Finalization was completed. For the [NPC]And Initiate US Customs & Flight
     * Departure Message' functionality, the application will also automatically Initiate Customs and generate
     * a Flight Departure Message. Percentage - Indicates the time entered is a percentage. This value defines
     * the percent of scheduled flight time after flight departure when Flight Finalization is done if no
     * previous manual flight finalization was completed. For the [NPC]And Initiate US Customs & Flight
     * Departure Message' functionality, the application will also automatically Initiate Customs and generate
     * a Flight Departure Message.
     */
    private String timeAfterFlightDepUSCode;

    /**
     * Attribute to hold <code>trmFSUMessageControlCode</code> property.
     * <p>
     * These flags are used for two purposes: Indicates use of incoming FSU messages, or live goods to
     * determine the current status of a shipment if both, incoming FSU messages, and live goods, exist for
     * the same status and at the same station. This only applies based on a system level dynamic parameter.In
     * LMS, the parameter C$DSSF should be set to 1. Indicator to specify if an incoming FSU RCS message
     * attempts to create goods. 0 - Indicates that an incoming FSU RCS message is only recorded in goods
     * history, and does not attempt to create goods. 1 - Indicates that an incoming FSU RCS message attempts
     * to create goods. Indicates if outgoing FSU/FZE messages are generated based on live goods functions,
     * based on incoming FSU messages and the Status Update function, or based on both.
     */
    private String trmFSUMessageControlCode;

    /**
     * <code>Default constructor.</code>
     */
    public StationControlParameterDto() {

    }

    /**
     * Gets the value of the <code>automaticCheckInByFlightArrival</code> property.
     * <p>
     * Automatic Check-In By Flight Arrival code and description selection. The Goods Check In function that
     * is performed automatically after flight arrival.
     * <p>
     * <b>Format: </b><br>
     * 1-2 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * AT
     * <p>
     * 
     * @return the current value of the <code>automaticCheckInByFlightArrival</code> property.<br>
     */
    public String getAutomaticCheckInByFlightArrival() {
        return this.automaticCheckInByFlightArrival;
    }

    /**
     * Gets the value of the <code>automaticCheckInByFlightArrivalMinutes</code> property.
     * <p>
     * Number of minutes after flight arrival (actual time of arrival) when the Goods Check In function
     * defined in the Automatic Check-In By Flight Arrival field is done by the application if no previous
     * manual Goods Check In function was done. If a manual Goods Check In function was done before no error
     * must be generated. Must be 0 if the Automatic Check-In By Flight Arrival field is set to NO. On initial
     * display the default, value is set to 0.
     * <p>
     * <b>Format: </b><br>
     * 1-3 Numeric
     * <p>
     * <b>Example: </b><br>
     * 12
     * <p>
     * 
     * @return the current value of the <code>automaticCheckInByFlightArrivalMinutes</code>
     */
    public int getAutomaticCheckInByFlightArrivalMinutes() {
        return this.automaticCheckInByFlightArrivalMinutes;
    }

    /**
     * Gets the value of the <code>automaticConfirmDiscrepancyCode</code> property.
     * <p>
     * Indicates if loose goods discrepancies declared at the station are to be automatically confirmed by the
     * system. Values allowed are: N - Indicates discrepancies at this station are not automatically confirmed
     * by the system. This is the default value. There are two yes options - one for international and
     * domestic and the other for domestic only. A - Indicates that all International and Domestic loose goods
     * discrepancies at this station are automatically confirmed by the system. D - Indicates that only
     * Domestic discrepancies for loose goods are automatically confirmed by the system. Domestic
     * discrepancies are all warehouse discrepancies, and import or export discrepancies on domestic flight
     * segments. A flight segment is considered domestic when the boarding and offload stations of the
     * discrepancy are in the same country.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @return the current value of the <code>automaticConfirmDiscrepancyCode</code> property.<br>
     */
    public String getAutomaticConfirmDiscrepancyCode() {
        return this.automaticConfirmDiscrepancyCode;
    }

    /**
     * Gets the value of the <code>automaticEnterFlightFinalInternationalCode</code> property.
     * <p>
     * The type of departure time used by the batch program which finalizes flights (in LMS CFMCFT) for
     * scheduling an automatic Flight Finalization for international flights.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * F
     * <p>
     * 
     * @return the current value of the <code>automaticEnterFlightFinalInternationalCode</code>property.<br>
     */
    public String getAutomaticEnterFlightFinalInternationalCode() {
        return this.automaticEnterFlightFinalInternationalCode;
    }

    /**
     * Gets the value of the <code>automaticEnterFlightFinalPrinter</code> property.
     * <p>
     * Printer to send the message.
     * <p>
     * <b>Format: </b><br>
     * 1-100 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * EXPORT
     * <p>
     * 
     * @return the current value of the <code>automaticEnterFlightFinalPrinter</code> property.<br>
     */
    public String getAutomaticEnterFlightFinalPrinter() {
        return this.automaticEnterFlightFinalPrinter;
    }

    /**
     * Gets the value of the <code>automaticFlightFinalDomesticCode</code> property.
     * <p>
     * The type of departure time used by the batch program which finalizes flights (in LMS CFMCFT) for
     * scheduling an automatic Flight Finalization for domestic flights.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @return the current value of the <code>automaticFlightFinalDomesticCode</code> property.<br>
     */
    public String getAutomaticFlightFinalDomesticCode() {
        return this.automaticFlightFinalDomesticCode;
    }

    /**
     * Gets the value of the <code>automaticUSCustomsFlightDepMessageCode</code> property.
     * <p>
     * The type of departure time used for scheduling the automatic Enter Flight Final, Initiate Customs, and
     * the generation of a Flight Departure Message. This field is used only if the station is the last
     * station in the flight routing prior to entering the U.S. Scheduled Time - Scheduled departure time (S)
     * Actual Time - Actual departure time (A) Current Time - Current departure time is the default. (C)
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @return the current value of the <code>automaticUSCustomsFlightDepMessageCode</code>property.<br>
     */
    public String getAutomaticUSCustomsFlightDepMessageCode() {
        return this.automaticUSCustomsFlightDepMessageCode;
    }

    /**
     * Gets the value of the <code>awbClearsImportCode</code> property.
     * <p>
     * Air Waybill clears import audit based on Delivery or finalization Values are: Finalization of Goods
     * (G), FSU DLV (F), The default value is Finalization of Goods (G).
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * F
     * <p>
     * 
     * @return the current value of the <code>awbClearsImportCode</code> property.<br>
     */
    public String getAwbClearsImportCode() {
        return this.awbClearsImportCode;
    }

    /**
     * Gets the value of the <code>ccdFSUMessageControlCode</code> property.
     * <p>
     * These flags are used for two purposes: Indicates use of incoming FSU messages, or live goods to
     * determine the current status of a shipment if both, incoming FSU messages, and live goods, exist for
     * the same status and at the same station. This only applies based on a system level dynamic parameter.In
     * LMS, the parameter C$DSSF should be set to1. Indicates if outgoing FSU/FZE messages are generated based
     * on live goods functions, based on incoming FSU messages and the Status Update function, or based on
     * both.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * F
     * <p>
     * 
     * @return the current value of the <code>ccdFSUMessageControlCode</code> property.<br>
     */
    public String getCcdFSUMessageControlCode() {
        return this.ccdFSUMessageControlCode;
    }

    /**
     * Gets the value of the <code>customsArea</code> property.
     * <p>
     * European customs station or North American station status. This field is populated from the country
     * data of the station's country.
     * <p>
     * <b>Format: </b><br>
     * 1-2 Alphabets
     * <p>
     * <b>Example: </b><br>
     * C
     * <p>
     * 
     * @return the current value of the <code>customsArea</code> property.<br>
     */
    public String getCustomsArea() {
        return this.customsArea;
    }

    /**
     * Gets the value of the <code>customsAutomatedPortSelectionCode</code> property.
     * <p>
     * This field can display a list of all the customs station select values defined in the system. From this
     * list, the user can select the customs station select code for this rate queue. Values allowed are: O -
     * There is no customs facility at this station. This is the default value. N - There is a customs
     * facility at this station, but the carrier is not exchanging messages with customs at this station. I -
     * There is a customs facility at this station and the carrier is exchanging only import messages with
     * customs. E - There is a customs facility at this station and the carrier is exchanging only export
     * messages with customs. B - There is a customs facility at this station and the carrier is exchanging
     * both import and export messages with customs. M - There is a customs facility at this station and the
     * carrier is exchanging messages with customs through non-automated means.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * O
     * <p>
     * 
     * @return the current value of the <code>customsAutomatedPortSelectionCode</code> property.<br>
     */
    public String getCustomsAutomatedPortSelectionCode() {
        return this.customsAutomatedPortSelectionCode;
    }

    /**
     * Gets the value of the <code>delayToAccountingExportDays</code> property.
     * <p>
     * Number of days to be delayed. Changing the value of this field affects the number of days in which an
     * air waybill is released to accounting by file maintenance at the export reporting station. The default
     * value is zero (0). When system cargo parameter C$ERIR is set one, both the export delay and the import
     * delay have to be met before the air waybill can be released to accounting.
     * <p>
     * <b>Format: </b><br>
     * 1-2 Numeric
     * <p>
     * <b>Example: </b><br>
     * 12
     * <p>
     * 
     * @return the current value of the <code>delayToAccountingExportDays</code> property.<br>
     */
    public int getDelayToAccountingExportDays() {
        return this.delayToAccountingExportDays;
    }

    /**
     * Gets the value of the <code>delayToAccountingImportDays</code> property.
     * <p>
     * Number of days to be delayed. Changing the value of this field affects the number of days in which an
     * air waybill is released to accounting by file maintenance at the import reporting station. The default
     * value is zero (0). When system cargo parameter C$ERIR is set one, both the export delay and the import
     * delay have to be met before the air waybill can be released to accounting.
     * <p>
     * <b>Format: </b><br>
     * 1-2 Numeric
     * <p>
     * <b>Example: </b><br>
     * 12
     * <p>
     * 
     * @return the current value of the <code>delayToAccountingImportDays</code> property.<br>
     */
    public int getDelayToAccountingImportDays() {
        return this.delayToAccountingImportDays;
    }

    /**
     * Gets the value of the <code>depFSUMessageControlCode</code> property.
     * <p>
     * These flags are used for two purposes: Indicates use of incoming FSU messages, or live goods to
     * determine the current status of a shipment if both, incoming FSU messages, and live goods, exist for
     * the same status and at the same station. This only applies based on a system level dynamic parameter.In
     * LMS, the parameter C$DSSF should be set to 1. Indicates if outgoing FSU/FZE messages are generated
     * based on live goods functions, based on incoming FSU messages and the Status Update function, or based
     * on both.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * F
     * <p>
     * 
     * @return the current value of the <code>depFSUMessageControlCode</code> property.<br>
     */
    public String getDepFSUMessageControlCode() {
        return this.depFSUMessageControlCode;
    }

    /**
     * Gets the value of the <code>discrepancyControlStation</code> property.
     * <p>
     * Discrepancy control station. If the station controls its own discrepancies then this field should be
     * blank. If the station does not control its own discrepancies then this field should contain a valid
     * station code. If the station is not a host station, then this field is set to blank and any station
     * code entered here is ignored, because there is no discrepancy control for non-host stations. If a host
     * station is changed to non-host, but the station is the owner of any air waybills or ULDs with
     * associated discrepancies, then a warning is displayed.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @return the current value of the <code>discrepancyControlStation</code> property.<br>
     */
    public String getDiscrepancyControlStation() {
        return this.discrepancyControlStation;
    }

    /**
     * Gets the value of the <code>disFSUMessageControlCode</code> property.
     * <p>
     * These flags are used for two purposes: Indicates use of incoming FSU messages, or live goods to
     * determine the current status of a shipment if both, incoming FSU messages, and live goods, exist for
     * the same status and at the same station. This only applies based on a system level dynamic parameter.In
     * LMS, the parameter C$DSSF should be set to 1. Indicates if outgoing FSU/FZE messages are generated
     * based on live goods functions, based on incoming FSU messages and the Status Update function, or based
     * on both.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * F
     * <p>
     * 
     * @return the current value of the <code>disFSUMessageControlCode</code> property.<br>
     */
    public String getDisFSUMessageControlCode() {
        return this.disFSUMessageControlCode;
    }

    /**
     * Gets the value of the <code>dlvFSUMessageControlCode</code> property.
     * <p>
     * These flags are used for two purposes: Indicates use of incoming FSU messages, or live goods to
     * determine the current status of a shipment if both, incoming FSU messages, and live goods, exist for
     * the same status and at the same station. This only applies based on a system level dynamic parameter.In
     * LMS, the parameter C$DSSF should be set to 1. Indicates if outgoing FSU/FZE messages are generated
     * based on live goods functions, based on incoming FSU messages and the Status Update function, or based
     * on both.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * F
     * <p>
     * 
     * @return the current value of the <code>dlvFSUMessageControlCode</code> property.<br>
     */
    public String getDlvFSUMessageControlCode() {
        return this.dlvFSUMessageControlCode;
    }

    /**
     * Gets the value of the <code>enterFlightManifestAssignmentStatusCode</code> property.
     * <p>
     * Used by the FFM Message and Enter Flight Manifest function to indicate whether to assign a shipment as
     * "Finalized" or "Not Finalized".
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * F
     * <p>
     * 
     * @return the current value of the <code>enterFlightManifestAssignmentStatusCode</code>property.<br>
     */
    public String getEnterFlightManifestAssignmentStatusCode() {
        return this.enterFlightManifestAssignmentStatusCode;
    }

    /**
     * Gets the value of the <code>exportDefaultLocations</code> property.
     * <p>
     * The default location for the acceptance of goods at this station. This location is used when there is
     * no location entered in the accept goods. If this field is blank, then the system wide default location
     * is used by the Accept Goods function. If this field is blank, then the system wide default system
     * location parameter is used by the Accept Goods function (LMS parameter is C$ELOC). The value of "NONE"
     * can be entered to indicate that there is no default location defined at the station level and that the
     * system wide default is not to be used.
     * <p>
     * <b>Format: </b><br>
     * 1-9 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * 1EXPORT
     * <p>
     * 
     * @return the current value of the <code>exportDefaultLocations</code> property.<br>
     */
    public String getExportDefaultLocations() {
        return this.exportDefaultLocations;
    }

    /**
     * Gets the value of the <code>flightSummaryFutureHours</code> property.
     * <p>
     * Number of hours in the future to display flight information.
     * <p>
     * <b>Format: </b><br>
     * 1-3 Numeric
     * <p>
     * <b>Example: </b><br>
     * 234
     * <p>
     * 
     * @return the current value of the <code>flightSummaryFutureHours</code> property.<br>
     */
    public int getFlightSummaryFutureHours() {
        return this.flightSummaryFutureHours;
    }

    /**
     * Gets the value of the <code>houseAwbAssociationEnforcementCode</code> property.
     * <p>
     * Indicator specifies when the enforcement of house air waybill and master goods association is to be
     * performed.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * N
     * <p>
     * 
     * @return the current value of the <code>houseAwbAssociationEnforcementCode</code> property.<br>
     */
    public String getHouseAwbAssociationEnforcementCode() {
        return this.houseAwbAssociationEnforcementCode;
    }

    /**
     * Gets the value of the <code>houseAwbAutomaticAssociationCode</code> property.
     * <p>
     * Indicator specifies when the automatic association of house air waybill and master goods is to be
     * performed.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * N
     * <p>
     * 
     * @return the current value of the <code>houseAwbAutomaticAssociationCode</code> property.<br>
     */
    public String getHouseAwbAutomaticAssociationCode() {
        return this.houseAwbAutomaticAssociationCode;
    }

    /**
     * Gets the value of the <code>manFSUMessageControlCode</code> property.
     * <p>
     * These flags are used for two purposes: Indicates use of incoming FSU messages, or live goods to
     * determine the current status of a shipment if both, incoming FSU messages, and live goods, exist for
     * the same status and at the same station. This only applies based on a system level dynamic parameter.
     * In LMS, the parameter C$DSSF should be set to 1. Indicates if outgoing FSU/FZE messages are generated
     * based on live goods functions, based on incoming FSU messages and the Status Update function, or based
     * on both.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * F
     * <p>
     * 
     * @return the current value of the <code>manFSUMessageControlCode</code> property.<br>
     */
    public String getManFSUMessageControlCode() {
        return this.manFSUMessageControlCode;
    }

    /**
     * Gets the value of the <code>noticeOfArrivalAutomaticGenerationCode</code> property.
     * <p>
     * Enables or disables the automatic generation of a Notice of Arrival either for a Master or a House Air
     * Waybill.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * M
     * <p>
     * 
     * @return the current value of the <code>noticeOfArrivalAutomaticGenerationCode</code>property.<br>
     */
    public String getNoticeOfArrivalAutomaticGenerationCode() {
        return this.noticeOfArrivalAutomaticGenerationCode;
    }

    /**
     * Gets the value of the <code>noticeOfArrivalNumberOfCopies</code> property.
     * <p>
     * Defines the number of copies printed for an automatic Notice of Arrival.
     * <p>
     * <b>Format: </b><br>
     * 1-2 Numeric
     * <p>
     * <b>Example: </b><br>
     * 10
     * <p>
     * 
     * @return the current value of the <code>noticeOfArrivalNumberOfCopies</code> property.<br>
     */
    public int getNoticeOfArrivalNumberOfCopies() {
        return this.noticeOfArrivalNumberOfCopies;
    }

    /**
     * Gets the value of <code>printChargeCorrectiveAdviceIndicator</code> property.
     * <p>
     * The Charge Correction Advice print indicator allows stations to use the standard product print formats
     * or local formats (as specified and maintained by the airline). Possible Values: 0 - Default value to
     * the standard product print. 1 - The headers on the CCA are also printed along with the data.
     * <p>
     * 
     * @return the current value of the <code>printChargeCorrectiveAdviceIndicator</code>property.<br>
     */
    public int getPrintChargeCorrectiveAdviceIndicator() {
        return this.printChargeCorrectiveAdviceIndicator;
    }

    /**
     * Gets the value of <code>printDeliverySlipIndicator</code> property.
     * <p>
     * The Print Delivery Slip indicator allows stations to use the standard product print formats or local
     * formats (as specified and maintained by the airline). Possible Values: 0 - If the station uses the
     * local print formats. 1 - If the station is allowed to use the standard product print formats.
     * <p>
     * 
     * @return the current value of the <code>printDeliverySlipIndicator</code> property.<br>
     */
    public int getPrintDeliverySlipIndicator() {
        return this.printDeliverySlipIndicator;
    }

    /**
     * Gets the value of <code>printPFBcreditMessageIndicator</code> property.
     * <p>
     * The PFB (Print Freight Bill) Credit Message indicator allows stations to use the standard product print
     * formats or to include the credit status on the print. Possible Values: 0 - Default value to the
     * standard product print. 1 - Prints the credit status (Credit Messages) as per the following rules.
     * While printing the origin air waybill at the origin station, the participant responsible for the
     * prepaid charges is checked credit extension. The order of participant being responsible for prepaid
     * charges is the IATA agent, the Origin Prepaid Bill-to participant, and then the Shipper. If the
     * responsible participant has no credit limit, then CASH ONLY is printed on air waybill. If the
     * responsible participant is over their credit limit, then OVER LIMIT is printed on the air waybill. If
     * the responsible participant has a credit limit, but there is no bank selling exchange rate set up for
     * converting currency of participants credit limit to origin currency then XR MISSING is printed on the
     * air waybill. If printing the destination air waybill at the destination station, the participant
     * responsible for the collect charges is checked for whether credit is extended. The order of participant
     * being responsible for collect charges is the Collect Bill-to participant, and then the Consignee. When
     * printing the destination option at the destination station, If the responsible participant has no
     * credit limit, then CASH ONLY is printed on air waybill. If the responsible participant is over their
     * credit limit, then OVER LIMIT is printed on the air waybill. If the responsible participant has credit
     * limit, but there is no bank selling exchange rate set up for converting currency of participants credit
     * limit to destination currency, then XR MISSING is printed on the air waybill.
     * <p>
     * 
     * @return the current value of the <code>printPFBcreditMessageIndicator</code> property.<br>
     */
    public int getPrintPFBcreditMessageIndicator() {
        return this.printPFBcreditMessageIndicator;
    }

    /**
     * Gets the value of <code>printPrintFreightBillIndicator</code> property.
     * <p>
     * The Print Freight Bill (PFB) indicator allows stations to use the standard product print formats or
     * local formats (as specified and maintained by the airline). Possible Values: 0 - Default value to the
     * standard product print. 1 - The issuing carrier is not printed by PFB.
     * <p>
     * 
     * @return the current value of the <code>printPrintFreightBillIndicator</code> property.<br>
     */
    public int getPrintPrintFreightBillIndicator() {
        return this.printPrintFreightBillIndicator;
    }

    /**
     * Gets the value of the <code>rateQueueOffice</code> property.
     * <p>
     * Queuing office designator for an air waybill is queued for tariff rates. If this field is left blank,
     * the air waybill is queued to the office that the agent is signed into. If Rate queue station is
     * entered, then entry of this field is mandatory: otherwise, entry of this field is prohibited.
     * <p>
     * <b>Format: </b><br>
     * 3 Numeric
     * <p>
     * <b>Example: </b><br>
     * 001
     * <p>
     * 
     * @return the current value of the <code>rateQueueOffice</code> property.<br>
     */
    public int getRateQueueOffice() {
        return this.rateQueueOffice;
    }

    /**
     * Gets the value of the <code>rateQueueStation</code> property.
     * <p>
     * Queuing city for an air waybill is queued for tariff rates. If this field is left blank, the air
     * waybill is queued to the station that the agent is signed into.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @return the current value of the <code>rateQueueStation</code> property.<br>
     */
    public String getRateQueueStation() {
        return this.rateQueueStation;
    }

    /**
     * Gets the value of the <code>rcfFSUMessageControlCode</code> property.
     * <p>
     * These flags are used for two purposes: Indicates use of incoming FSU messages, or live goods to
     * determine the current status of a shipment if both, incoming FSU messages, and live goods, exist for
     * the same status and at the same station. This only applies based on a system level dynamic parameter.In
     * LMS, the parameter C$DSSF should be set to 1. Indicates if outgoing FSU/FZE messages are generated
     * based on live goods functions, based on incoming FSU messages and the Status Update function, or based
     * on both.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * F
     * <p>
     * 
     * @return the current value of the <code>rcfFSUMessageControlCode</code> property.<br>
     */
    public String getRcfFSUMessageControlCode() {
        return this.rcfFSUMessageControlCode;
    }

    /**
     * Gets the value of the <code>rcsFSUMessageControlCode</code> property.
     * <p>
     * These flags are used for two purposes: Indicates use of incoming FSU messages, or live goods to
     * determine the current status of a shipment if both, incoming FSU messages, and live goods, exist for
     * the same status and at the same station. This only applies based on a system level dynamic parameter.In
     * LMS, the parameter C$DSSF should be set to 1. Indicates if outgoing FSU/FZE messages are generated
     * based on live goods functions, based on incoming FSU messages and the Status Update function, or based
     * on both.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * F
     * <p>
     * 
     * @return the current value of the <code>rcsFSUMessageControlCode</code> property.<br>
     */
    public String getRcsFSUMessageControlCode() {
        return this.rcsFSUMessageControlCode;
    }

    /**
     * Gets the value of the <code>rctFSUMessageControlCode</code> property.
     * <p>
     * These flags are used for two purposes: Indicates use of incoming FSU messages, or live goods to
     * determine the current status of a shipment if both, incoming FSU messages, and live goods, exist for
     * the same status and at the same station. This only applies based on a system level dynamic parameter.In
     * LMS, the parameter C$DSSF should be set to 1. Indicates if outgoing FSU/FZE messages are generated
     * based on live goods functions, based on incoming FSU messages and the Status Update function, or based
     * on both.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * F
     * <p>
     * 
     * @return the current value of the <code>rctFSUMessageControlCode</code> property.<br>
     */
    public String getRctFSUMessageControlCode() {
        return this.rctFSUMessageControlCode;
    }

    /**
     * Gets the value of the <code>stationOtherChargeQueues</code> property.
     * <p>
     * Queuing station for an air waybill is queued for miscellaneous rates. If this field is left blank, the
     * air waybill is queued to the station that the agent is signed into.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @return the current value of the <code>stationOtherChargeQueues</code> property.<br>
     */
    public String getStationOtherChargeQueues() {
        return this.stationOtherChargeQueues;
    }

    /**
     * Gets the value of the <code>stationRestrictionsControlStation</code> property.
     * <p>
     * The Station Restrictions Control Station is an alternate station that is allowed to maintain collect
     * charges allowed and embargo information for this station. If this field is blank, it defaults to the
     * station being entered.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @return the current value of the <code>stationRestrictionsControlStation</code> property.<br>
     */
    public String getStationRestrictionsControlStation() {
        return this.stationRestrictionsControlStation;
    }

    /**
     * Gets the value of the <code>tconPrefixCode</code> property.
     * <p>
     * Prefix for auto TCON creation. Loose goods of the product code specified in the product code field can
     * be moved into a flight specific Terminal Container (TCON) instead of using the default Goods Check In
     * All location when these conditions are met.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * T
     * <p>
     * 
     * @return the current value of the <code>tconPrefixCode</code> property.<br>
     */
    public String getTconPrefixCode() {
        return this.tconPrefixCode;
    }

    /**
     * Gets the value of the <code>tfdFSUMessageControlCode</code> property.
     * <p>
     * These flags are used for two purposes: Indicates use of incoming FSU messages, or live goods to
     * determine the current status of a shipment if both, incoming FSU messages, and live goods, exist for
     * the same status and at the same station. This only applies based on a system level dynamic parameter.In
     * LMS, the parameter C$DSSF should be set to 1. Indicates if outgoing FSU/FZE messages are generated
     * based on live goods functions, based on incoming FSU messages and the Status Update function, or based
     * on both.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * F
     * <p>
     * 
     * @return the current value of the <code>tfdFSUMessageControlCode</code> property.<br>
     */
    public String getTfdFSUMessageControlCode() {
        return this.tfdFSUMessageControlCode;
    }

    /**
     * Gets the value of the <code>timeAfterFlightDepDomestic</code> property.
     * <p>
     * For the domestic functionality, this parameter defines when after flight departure the flight
     * finalization is automatically executed if no previous manual flight finalization was completed.
     * <p>
     * <b>Format: </b><br>
     * 1 - 99 0r 1 - 999 0r NO
     * <p>
     * <b>Example: </b><br>
     * NO
     * <p>
     * 
     * @return the current value of the <code>timeAfterFlightDepDomestic</code> property.<br>
     */
    public String getTimeAfterFlightDepDomestic() {
        return this.timeAfterFlightDepDomestic;
    }

    /**
     * Gets the value of the <code>timeAfterFlightDepDomesticCode</code> property.
     * <p>
     * Indicates whether the time after flight departure for domestic is expressed in minutes or percentage.
     * Minutes - This is the default, with a value of zero. This value defines the number of minutes after
     * flight departure when Flight Finalization is done if no previous manual Flight Finalization was
     * completed. Percentage - Indicates the time entered is a percentage. This value defines the percent of
     * scheduled flight time after flight departure when Flight Finalization is done if no previous manual
     * flight finalization was completed.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * M
     * <p>
     * 
     * @return the current value of the <code>timeAfterFlightDepDomesticCode</code> property.<br>
     */
    public String getTimeAfterFlightDepDomesticCode() {
        return this.timeAfterFlightDepDomesticCode;
    }

    /**
     * Gets the value of the <code>timeAfterFlightDepInternational</code> property.
     * <p>
     * For the international functionality, this parameter defines when after flight departure the flight
     * finalization is automatically executed if no previous manual flight finalization was completed.
     * <p>
     * <b>Format: </b><br>
     * 1 - 99 0r 1 - 999 0r NO<br>
     * <b>Example: </b><br>
     * NO
     * 
     * @return the current value of the <code>timeAfterFlightDepInternational</code> property.<br>
     */
    public String getTimeAfterFlightDepInternational() {
        return this.timeAfterFlightDepInternational;
    }

    /**
     * Gets the value of the <code>timeAfterFlightDepInternationalCode</code> property.
     * <p>
     * Indicates whether the time after flight departure for international is expressed in minutes or
     * percentage. Minutes - This is the default, with a value of zero. This value defines the number of
     * minutes after flight departure when Flight Finalization is done if no previous manual Flight
     * Finalization was completed. Percentage - Indicates the time entered is a percentage. This value defines
     * the percent of scheduled flight time after flight departure when Flight Finalization is done if no
     * previous manual flight finalization was completed.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * M
     * <p>
     * 
     * @return the current value of the <code>timeAfterFlightDepInternationalCode</code> property.<br>
     */
    public String getTimeAfterFlightDepInternationalCode() {
        return this.timeAfterFlightDepInternationalCode;
    }

    /**
     * Gets the value of the <code>timeAfterFlightDepUS</code> property.
     * <p>
     * This parameter defines when after flight departure the flight finalization, initiate customs and the
     * generation of a flight departure message is automatically executed if they were not previously done.
     * <p>
     * <b>Format: </b><br>
     * 1 - 99 0r 1 - 999 0r NO
     * <p>
     * <b>Example: </b><br>
     * NO
     * <p>
     * 
     * @return the current value of the <code>timeAfterFlightDepUS</code> property.<br>
     */
    public String getTimeAfterFlightDepUS() {
        return this.timeAfterFlightDepUS;
    }

    /**
     * Gets the value of the <code>timeAfterFlightDepUSCode</code> property.
     * <p>
     * Indicates whether the time after flight departure for [NPC]And Initiate US Customs & Flight Departure
     * Message' is expressed in minutes or percentage. Minutes - This is the default, with a value of zero.
     * This value defines the number of minutes after flight departure when Flight Finalization is done if no
     * previous manual Flight Finalization was completed. For the [NPC]And Initiate US Customs & Flight
     * Departure Message' functionality, the application will also automatically Initiate Customs and generate
     * a Flight Departure Message. Percentage - Indicates the time entered is a percentage. This value defines
     * the percent of scheduled flight time after flight departure when Flight Finalization is done if no
     * previous manual flight finalization was completed. For the [NPC]And Initiate US Customs & Flight
     * Departure Message' functionality, the application will also automatically Initiate Customs and generate
     * a Flight Departure Message.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * M
     * <p>
     * 
     * @return the current value of the <code>timeAfterFlightDepUSCode</code> property.<br>
     */
    public String getTimeAfterFlightDepUSCode() {
        return this.timeAfterFlightDepUSCode;
    }

    /**
     * Gets the value of the <code>trmFSUMessageControlCode</code> property.
     * <p>
     * These flags are used for two purposes: Indicates use of incoming FSU messages, or live goods to
     * determine the current status of a shipment if both, incoming FSU messages, and live goods, exist for
     * the same status and at the same station. This only applies based on a system level dynamic parameter.In
     * LMS, the parameter C$DSSF should be set to 1. Indicator to specify if an incoming FSU RCS message
     * attempts to create goods. 0 - Indicates that an incoming FSU RCS message is only recorded in goods
     * history, and does not attempt to create goods. 1 - Indicates that an incoming FSU RCS message attempts
     * to create goods. Indicates if outgoing FSU/FZE messages are generated based on live goods functions,
     * based on incoming FSU messages and the Status Update function, or based on both.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * F
     * <p>
     * 
     * @return the current value of the <code>trmFSUMessageControlCode</code> property.<br>
     */
    public String getTrmFSUMessageControlCode() {
        return this.trmFSUMessageControlCode;
    }

    /**
     * Gets the value of <code>automaticCheckInAllEnterFlightFinalIndicator</code> property.
     * <p>
     * Indicator to specify if the Enter Flight Final function should attempt to schedule a Goods Check In
     * functions via INT: ON based on the Goods Check In setting of the offload station.
     * <li><code>true</code><br>
     * Enter Final Flight will attempt to schedule a Goods Check In function.
     * <li><code>false</code><br>
     * Enter Final Flight will not attempt to schedule a Goods Check In function.
     * <p>
     * 
     * @return the current value of the <code> automaticCheckInAllEnterFlightFinalIndicator</code>property.<br>
     */
    public boolean isAutomaticCheckInAllEnterFlightFinalIndicator() {
        return this.automaticCheckInAllEnterFlightFinalIndicator;
    }

    /**
     * Gets the value of <code>maintainFlightAssignmentChangeGoodsIndicator</code> property.
     * <p>
     * ULD Auto Inactivation indicator. Indicates whether or not an active import ULD at the station is
     * automatically emptied (inactivated) when a user at the station attempts to activate it for export.
     * Possible Values:
     * <li><code>true</code><br>
     * Indicates automatic ULD inactivation is allowed.
     * <li><code>false</code><br>
     * Indicates automatic ULD inactivation is not allowed.
     * <p>
     * 
     * @return the current value of the <code>automaticULDInactivationIndicator </code>property.<br>
     */
    public boolean isAutomaticULDInactivationIndicator() {
        return this.automaticULDInactivationIndicator;
    }

    /**
     * Gets the value of <code>awbImportCustomsEnforcementsIndicator</code> property.
     * <p>
     * Controls whether the clearance number is required for delivery. The station level flag indicates
     * whether the clearance number is required for delivery. When the flag is off, delivery is allowed
     * whether or not an import clearance number has been recorded for the air waybill or house air
     * waybills.When the station level flag is on, each air waybill or house air waybill delivery checks the
     * AWB Custom Clearance status of the air waybill to determine if it can be delivered. Possible Values:
     * <li><code>true</code><br>
     * If AWB import customs enforcement should be done for this country.
     * <li><code>false</code><br>
     * If AWB import customs processing should not be enforced.
     * <p>
     * 
     * @return the current value of the <code> awbImportCustomsEnforcementsIndicator</code>property.<br>
     */
    public boolean isAwbImportCustomsEnforcementsIndicator() {
        return this.awbImportCustomsEnforcementsIndicator;
    }

    /**
     * Gets the value of <code>delayFSUDEPUntilWheelsUpIndicator</code> property.
     * <p>
     * Indicates if outgoing FSU DEP messages should be delayed until the actual flight departure
     * (wheels-off-the-ground) time.
     * <li><code>true</code><br>
     * Delays FSU DEP messages until a wheels-off-the-ground time has been recorded.
     * <li><code>false</code><br>
     * Sends FSU DEP messages at Flight Finalization time.
     * <p>
     * 
     * @return the current value of the <code>delayFSUDEPUntilWheelsUpIndicator </code> property.<br>
     */
    public boolean isDelayFSUDEPUntilWheelsUpIndicator() {
        return this.delayFSUDEPUntilWheelsUpIndicator;
    }

    /**
     * Gets the value of <code>domesticOnlyIndicator</code> property.
     * <p>
     * The Domestic only indicator is used to determine whether the check-in all function should process only
     * domestic and no international flights, or whether it should process all flights. Possible Values:
     * <li><code>true</code><br>
     * If the check-in all function processes only domestic flights.
     * <li><code>false</code><br>
     * If the check-in all function processes domestic and international flights.
     * <p>
     * 
     * @return the current value of the <code>domesticOnlyIndicator</code> property.<br>
     */
    public boolean isDomesticOnlyIndicator() {
        return this.domesticOnlyIndicator;
    }

    /**
     * Gets the value of <code>exportMechanizedIndicator</code> property.
     * <p>
     * Export mechanized indicator. Indicates whether or not the export part of the station has a PC. This
     * field is not used for processing purposes within the application and is used for display purposes only.
     * Possible Values:
     * <li><code>true</code><br>
     * Indicates Export does have a PC. This is the default value.
     * <li><code>false</code><br>
     * Indicates Export does not have a PC. This is an optional attribute.
     * <p>
     * 
     * @return the current value of the <code>exportMechanizedIndicator</code> property.<br>
     */
    public boolean isExportMechanizedIndicator() {
        return this.exportMechanizedIndicator;
    }

    /**
     * Gets the value of <code>incomingRCSCreatesGoodsIndicator</code> property.
     * <p>
     * Goods Indicator to specify if an incoming FSU RCS message attempts to create goods.
     * <li><code>true</code><br>
     * Indicates that an incoming FSU RCS message attempts to create goods.
     * <li><code>false</code><br>
     * Indicates that an incoming FSU RCS message is only recorded in goods history, and does not attempt to
     * create goods. This is the default value.
     * <p>
     * 
     * @return the current value of the <code>incomingRCSCreatesGoodsIndicator </code> property.<br>
     */
    public boolean isIncomingRCSCreatesGoodsIndicator() {
        return this.incomingRCSCreatesGoodsIndicator;
    }

    /**
     * Gets the value of <code>incomingRCSRCFProcessGoodsIndicator</code> property.
     * <p>
     * Indicator to specify if an incoming FSU: RCF message attempts to check-in goods.
     * <li><code>true</code><br>
     * An incoming FSU RCF message attempts to check-in goods.
     * <li><code>false</code><br>
     * An incoming FSU RCF message is only recorded in goods history, and does not attempt to check-in goods.
     * This is the default value.
     * <p>
     * 
     * @return the current value of the <code> incomingRCSRCFProcessGoodsIndicator</code> property.<br>
     */
    public boolean isIncomingRCSRCFProcessGoodsIndicator() {
        return this.incomingRCSRCFProcessGoodsIndicator;
    }

    /**
     * Gets the value of <code>noticeOfArrivalAutomaticPrintIndicator</code> property.
     * <p>
     * Possible Values:
     * <li><code>true</code><br>
     * Auto Generation with print:Notice of Arrival is printed.
     * <li><code>false</code><br>
     * Auto Generation without print:Notice of Arrival will not be printed.
     * <p>
     * 
     * @return the current value of the <code> noticeOfArrivalAutomaticPrintIndicator</code>property.<br>
     */
    public boolean isNoticeOfArrivalAutomaticPrintIndicator() {
        return this.noticeOfArrivalAutomaticPrintIndicator;
    }

    /**
     * Gets the value of <code>noticeOfArrivalIndicator</code> property.
     * <p>
     * Notice of arrival indicator. Possible Values:
     * <li><code>true</code><br>
     * If the application will automatically record the delivery of the air waybill documents at the time the
     * Notice of Arrival is recorded.
     * <li><code>false</code><br>
     * If the application will not automatically record the delivery of the AWB documents at the time the
     * Notice of Arrival is recorded.
     * <p>
     * 
     * @return the current value of the <code>noticeOfArrivalIndicator</code> property.<br>
     */
    public boolean isNoticeOfArrivalIndicator() {
        return this.noticeOfArrivalIndicator;
    }

    /**
     * Gets the value of <code>recordAwbDocumentsDeliveredIndicator</code> property.
     * <p>
     * Indicates whether the automatic generation of a Notice of Arrival will also automatically record the
     * delivery of the air waybill documents.
     * <li><code>true</code><br>
     * The application will automatically record the delivery of the air waybill documents at the time the
     * Notice of Arrival is recorded.
     * <li><code>false</code><br>
     * The application will not automatically record the delivery of the AWB documents at the time the Notice
     * of Arrival is recorded. This is the default value.
     * <p>
     * 
     * @return the current value of the <code> recordAwbDocumentsDeliveredIndicator</code>property.<br>
     */
    public boolean isRecordAwbDocumentsDeliveredIndicator() {
        return this.recordAwbDocumentsDeliveredIndicator;
    }

    /**
     * Gets the value of <code>taxesApplyIndicator</code> property.
     * <p>
     * Indicates whether taxes (province/state/city) are applied at this station, provided the AWB meets
     * specific criteria. The tax rates and criteria are specified in the tax tables using the Tax Information
     * function. Values allowed are:
     * <li><code>true</code><br>
     * Indicate that taxes are applicable at this station.
     * <li><code>false</code><br>
     * Indicates default value. No taxes are applicable at this station. Refer to Other Charges Generation,
     * Tax Generation for more details.
     * <p>
     * 
     * @return the current value of the <code>taxesApplyIndicator</code> property.<br>
     */
    public boolean isTaxesApplyIndicator() {
        return this.taxesApplyIndicator;
    }

    /**
     * Sets the value of <code>automaticCheckInAllEnterFlightFinalIndicator</code> property.
     * <p>
     * Indicator to specify if the Enter Flight Final function should attempt to schedule a Goods Check In
     * functions via INT: ON based on the Goods Check In setting of the offload station.
     * <li><code>true</code><br>
     * Enter Final Flight will attempt to schedule a Goods Check In function.
     * <li><code>false</code><br>
     * Enter Final Flight will not attempt to schedule a Goods Check In function. This is the default value.
     * <p>
     * 
     * @param pAutomaticCheckInAllEnterFlightFinalIndicator
     *            the new value of the <code> automaticCheckInAllEnterFlightFinalIndicator</code> property.<br>
     */
    public void setAutomaticCheckInAllEnterFlightFinalIndicator(
                final boolean pAutomaticCheckInAllEnterFlightFinalIndicator) {
        this.automaticCheckInAllEnterFlightFinalIndicator = pAutomaticCheckInAllEnterFlightFinalIndicator;
    }

    /**
     * Sets the value of the <code>automaticCheckInByFlightArrival</code> property.
     * <p>
     * Automatic Check-In By Flight Arrival code and description selection. The Goods Check In function that
     * is performed automatically after flight arrival.
     * <p>
     * <b>Format: </b><br>
     * 1-2 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * AT
     * <p>
     * 
     * @param pAutomaticCheckInByFlightArrival
     *            the new value of the <code>automaticCheckInByFlightArrival</code> property.<br>
     */
    public void setAutomaticCheckInByFlightArrival(
                final String pAutomaticCheckInByFlightArrival) {
        this.automaticCheckInByFlightArrival = ContractUtility
                    .convertToUpperCase(pAutomaticCheckInByFlightArrival);
    }

    /**
     * Sets the value of the <code>automaticCheckInByFlightArrivalMinutes</code> property.
     * <p>
     * Number of minutes after flight arrival (actual time of arrival) when the Goods Check In function
     * defined in the Automatic Check-In By Flight Arrival field is done by the application if no previous
     * manual Goods Check In function was done. If a manual Goods Check In function was done before no error
     * must be generated. Must be 0 if the Automatic Check-In By Flight Arrival field is set to NO. On initial
     * display the default, value is set to 0.
     * <p>
     * <b>Format: </b><br>
     * 1-36 Alphanumeric, hyphen (-), and period (.) including spaces
     * <p>
     * <b>Example: </b><br>
     * POB 14000, POSTAL STN SAINT LAURENT
     * <p>
     * 
     * @param pAutomaticCheckInByFlightArrivalMinutes
     *            the new value of the <code>automaticCheckInByFlightArrivalMinutes</code> property.<br>
     */
    public void setAutomaticCheckInByFlightArrivalMinutes(
                final int pAutomaticCheckInByFlightArrivalMinutes) {
        this.automaticCheckInByFlightArrivalMinutes = pAutomaticCheckInByFlightArrivalMinutes;
    }

    /**
     * Sets the value of the <code>automaticConfirmDiscrepancyCode</code> property.
     * <p>
     * Indicates if loose goods discrepancies declared at the station are to be automatically confirmed by the
     * system. Values allowed are: N - Indicates discrepancies at this station are not automatically confirmed
     * by the system. This is the default value. There are two yes options - one for international and
     * domestic and the other for domestic only. A - Indicates that all International and Domestic loose goods
     * discrepancies at this station are automatically confirmed by the system. D - Indicates that only
     * Domestic discrepancies for loose goods are automatically confirmed by the system. Domestic
     * discrepancies are all warehouse discrepancies, and import or export discrepancies on domestic flight
     * segments. A flight segment is considered domestic when the boarding and offload stations of the
     * discrepancy are in the same country.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @param pAutomaticConfirmDiscrepancyCode
     *            the new value of the <code>automaticConfirmDiscrepancyCode</code> property.<br>
     */
    public void setAutomaticConfirmDiscrepancyCode(
                final String pAutomaticConfirmDiscrepancyCode) {
        this.automaticConfirmDiscrepancyCode = ContractUtility
                    .convertToUpperCase(pAutomaticConfirmDiscrepancyCode);
    }

    /**
     * Sets the value of the <code>automaticEnterFlightFinalInternationalCode</code> property.
     * <p>
     * The type of departure time used by the batch program which finalizes flights (in LMS CFMCFT) for
     * scheduling an automatic Flight Finalization for international flights.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * F
     * <p>
     * 
     * @param pAutomaticEnterFlightFinalInternationalCode
     *            the new value of the <code>automaticEnterFlightFinalInternationalCode</code> property.<br>
     */
    public void setAutomaticEnterFlightFinalInternationalCode(
                final String pAutomaticEnterFlightFinalInternationalCode) {
        this.automaticEnterFlightFinalInternationalCode = ContractUtility
                    .convertToUpperCase(pAutomaticEnterFlightFinalInternationalCode);
    }

    /**
     * Sets the value of the <code>automaticEnterFlightFinalPrinter</code> property.
     * <p>
     * Printer to send the message.
     * <p>
     * <b>Format: </b><br>
     * 1-100 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * EXPORT
     * <p>
     * 
     * @param pAutomaticEnterFlightFinalPrinter
     *            the new value of the <code>automaticEnterFlightFinalPrinter</code> property.<br>
     */
    public void setAutomaticEnterFlightFinalPrinter(
                final String pAutomaticEnterFlightFinalPrinter) {
        this.automaticEnterFlightFinalPrinter = pAutomaticEnterFlightFinalPrinter;
    }

    /**
     * Sets the value of the <code>automaticFlightFinalDomesticCode</code> property.
     * <p>
     * The type of departure time used by the batch program which finalizes flights (in LMS CFMCFT) for
     * scheduling an automatic Flight Finalization for domestic flights.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @param pAutomaticFlightFinalDomesticCode
     *            the new value of the <code>automaticFlightFinalDomesticCode</code> property.<br>
     */
    public void setAutomaticFlightFinalDomesticCode(
                final String pAutomaticFlightFinalDomesticCode) {
        this.automaticFlightFinalDomesticCode = ContractUtility
                    .convertToUpperCase(pAutomaticFlightFinalDomesticCode);
    }

    /**
     * Sets the value of <code>automaticULDInactivationIndicator</code> property.
     * <p>
     * ULD Auto Inactivation indicator. Indicates whether or not an active import ULD at the station is
     * automatically emptied (inactivated) when a user at the station attempts to activate it for export.
     * Possible Values:
     * <li><code>true</code><br>
     * Indicates automatic ULD inactivation is allowed.
     * <li><code>false</code><br>
     * Indicates automatic ULD inactivation is not allowed. This is the default value.
     * <p>
     * 
     * @param pAutomaticULDInactivationIndicator
     *            the new value of the <code>automaticULDInactivationIndicator </code> property.<bR>
     */
    public void setAutomaticULDInactivationIndicator(
                final boolean pAutomaticULDInactivationIndicator) {
        this.automaticULDInactivationIndicator = pAutomaticULDInactivationIndicator;
    }

    /**
     * Sets the value of the <code>automaticUSCustomsFlightDepMessageCode</code> property.
     * <p>
     * The type of departure time used for scheduling the automatic Enter Flight Final, Initiate Customs, and
     * the generation of a Flight Departure Message. This field is used only if the station is the last
     * station in the flight routing prior to entering the U.S. Scheduled Time - Scheduled departure time (S)
     * Actual Time - Actual departure time (A) Current Time - Current departure time is the default. (C)
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * A
     * <p>
     * 
     * @param pAutomaticUSCustomsFlightDepMessageCode
     *            the new value of the <code>automaticUSCustomsFlightDepMessageCode</code> property.<br>
     */
    public void setAutomaticUSCustomsFlightDepMessageCode(
                final String pAutomaticUSCustomsFlightDepMessageCode) {
        this.automaticUSCustomsFlightDepMessageCode = ContractUtility
                    .convertToUpperCase(pAutomaticUSCustomsFlightDepMessageCode);
    }

    /**
     * Sets the value of the <code>awbClearsImportCode</code> property.
     * <p>
     * Air Waybill clears import audit based on Delivery or finalization Values are: Finalization of Goods
     * (G), FSU DLV (F), The default value is Finalization of Goods (G).
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet<br>
     * <b>Example: </b><br>
     * F
     * 
     * @param pAwbClearsImportCode
     *            the new value of the <code>awbClearsImportCode</code> property.<br>
     */
    public void setAwbClearsImportCode(final String pAwbClearsImportCode) {
        this.awbClearsImportCode = ContractUtility
                    .convertToUpperCase(pAwbClearsImportCode);
    }

    /**
     * Sets the value of <code>awbImportCustomsEnforcementsIndicator</code> property.
     * <p>
     * Controls whether the clearance number is required for delivery. The station level flag indicates
     * whether the clearance number is required for delivery. When the flag is off, delivery is allowed
     * whether or not an import clearance number has been recorded for the air waybill or house air
     * waybills.When the station level flag is on, each air waybill or house air waybill delivery checks the
     * AWB Custom Clearance status of the air waybill to determine if it can be delivered. Possible Values:
     * <li><code>true</code><br>
     * If AWB import customs enforcement should be done for this country.
     * <li><code>false</code><br>
     * If AWB import customs processing should not be enforced. This field is NOT applicable to US Customs.
     * <p>
     * 
     * @param pAwbImportCustomsEnforcementsIndicator
     *            the new value of the <code> awbImportCustomsEnforcementsIndicator</code> property.<br>
     */
    public void setAwbImportCustomsEnforcementsIndicator(
                final boolean pAwbImportCustomsEnforcementsIndicator) {
        this.awbImportCustomsEnforcementsIndicator = pAwbImportCustomsEnforcementsIndicator;
    }

    /**
     * Sets the value of the <code>ccdFSUMessageControlCode</code> property.
     * <p>
     * These flags are used for two purposes: Indicates use of incoming FSU messages, or live goods to
     * determine the current status of a shipment if both, incoming FSU messages, and live goods, exist for
     * the same status and at the same station. This only applies based on a system level dynamic parameter.In
     * LMS, the parameter C$DSSF should be set to1. Indicates if outgoing FSU/FZE messages are generated based
     * on live goods functions, based on incoming FSU messages and the Status Update function, or based on
     * both.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * F
     * <p>
     * 
     * @param pCcdFSUMessageControlCode
     *            the new value of the <code>ccdFSUMessageControlCode</code> property.<br>
     */
    public void setCcdFSUMessageControlCode(
                final String pCcdFSUMessageControlCode) {
        this.ccdFSUMessageControlCode = ContractUtility
                    .convertToUpperCase(pCcdFSUMessageControlCode);
    }

    /**
     * Sets the value of the <code>customsArea</code> property.
     * <p>
     * European customs station or North American station status. This field is populated from the country
     * data of the station's country.
     * <p>
     * <b>Format: </b><br>
     * 1-2 Alphabets
     * <p>
     * <b>Example: </b><br>
     * C
     * <p>
     * 
     * @param pCustomsArea
     *            the new value of the <code>customsArea</code> property.<br>
     */
    public void setCustomsArea(final String pCustomsArea) {
        this.customsArea = ContractUtility.convertToUpperCase(pCustomsArea);
    }

    /**
     * Sets the value of the <code>customsAutomatedPortSelectionCode</code> property.
     * <p>
     * This field can display a list of all the customs station select values defined in the system. From this
     * list, the user can select the customs station select code for this rate queue. Values allowed are: O -
     * There is no customs facility at this station. This is the default value. N - There is a customs
     * facility at this station, but the carrier is not exchanging messages with customs at this station. I -
     * There is a customs facility at this station and the carrier is exchanging only import messages with
     * customs. E - There is a customs facility at this station and the carrier is exchanging only export
     * messages with customs. B - There is a customs facility at this station and the carrier is exchanging
     * both import and export messages with customs. M - There is a customs facility at this station and the
     * carrier is exchanging messages with customs through non-automated means.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * O
     * <p>
     * 
     * @param pCustomsAutomatedPortSelectionCode
     *            the new value of the <code>customsAutomatedPortSelectionCode</code> property.<br>
     */
    public void setCustomsAutomatedPortSelectionCode(
                final String pCustomsAutomatedPortSelectionCode) {
        this.customsAutomatedPortSelectionCode = ContractUtility
                    .convertToUpperCase(pCustomsAutomatedPortSelectionCode);
    }

    /**
     * Sets the value of <code>delayFSUDEPUntilWheelsUpIndicator</code> property.
     * <p>
     * Indicates if outgoing FSU DEP messages should be delayed until the actual flight departure
     * (wheels-off-the-ground) time.
     * <li><code>true</code><br>
     * Delays FSU DEP messages until a wheels-off-the-ground time has been recorded.
     * <li><code>false</code><br>
     * Sends FSU DEP messages at Flight Finalization time. Default value is false.
     * <p>
     * 
     * @param pDelayFSUDEPUntilWheelsUpIndicator
     *            the new value of the <code>delayFSUDEPUntilWheelsUpIndicator </code> property.<br>
     */
    public void setDelayFSUDEPUntilWheelsUpIndicator(
                final boolean pDelayFSUDEPUntilWheelsUpIndicator) {
        this.delayFSUDEPUntilWheelsUpIndicator = pDelayFSUDEPUntilWheelsUpIndicator;
    }

    /**
     * Sets the value of the <code>delayToAccountingExportDays</code> property.
     * <p>
     * Number of days to be delayed. Changing the value of this field affects the number of days in which an
     * air waybill is released to accounting by file maintenance at the export reporting station. The default
     * value is zero (0). When system cargo parameter C$ERIR is set one, both the export delay and the import
     * delay have to be met before the air waybill can be released to accounting.
     * <p>
     * <b>Format: </b><br>
     * 1-2 Numeric
     * <p>
     * <b>Example: </b><br>
     * 12
     * <p>
     * 
     * @param pDelayToAccountingExportDays
     *            the new value of the <code>delayToAccountingExportDays</code> property.<br>
     */
    public void setDelayToAccountingExportDays(
                final int pDelayToAccountingExportDays) {
        this.delayToAccountingExportDays = pDelayToAccountingExportDays;
    }

    /**
     * Sets the value of the <code>delayToAccountingImportDays</code> property.
     * <p>
     * Number of days to be delayed. Changing the value of this field affects the number of days in which an
     * air waybill is released to accounting by file maintenance at the import reporting station. The default
     * value is zero (0). When system cargo parameter C$ERIR is set one, both the export delay and the import
     * delay have to be met before the air waybill can be released to accounting.
     * <p>
     * <b>Format: </b><br>
     * 1-2 Numeric
     * <p>
     * <b>Example: </b><br>
     * 12
     * <p>
     * 
     * @param pDelayToAccountingImportDays
     *            the new value of the <code>delayToAccountingImportDays</code> property.<br>
     */
    public void setDelayToAccountingImportDays(
                final int pDelayToAccountingImportDays) {
        this.delayToAccountingImportDays = pDelayToAccountingImportDays;
    }

    /**
     * Sets the value of the <code>depFSUMessageControlCode</code> property.
     * <p>
     * These flags are used for two purposes: Indicates use of incoming FSU messages, or live goods to
     * determine the current status of a shipment if both, incoming FSU messages, and live goods, exist for
     * the same status and at the same station. This only applies based on a system level dynamic parameter.In
     * LMS, the parameter C$DSSF should be set to 1. Indicates if outgoing FSU/FZE messages are generated
     * based on live goods functions, based on incoming FSU messages and the Status Update function, or based
     * on both.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * F
     * <p>
     * 
     * @param pDepFSUMessageControlCode
     *            the new value of the <code>depFSUMessageControlCode</code> property.<br>
     */
    public void setDepFSUMessageControlCode(
                final String pDepFSUMessageControlCode) {
        this.depFSUMessageControlCode = ContractUtility
                    .convertToUpperCase(pDepFSUMessageControlCode);
    }

    /**
     * Sets the value of the <code>discrepancyControlStation</code> property.
     * <p>
     * Discrepancy control station. If the station controls its own discrepancies then this field should be
     * blank. If the station does not control its own discrepancies then this field should contain a valid
     * station code. If the station is not a host station, then this field is set to blank and any station
     * code entered here is ignored, because there is no discrepancy control for non-host stations. If a host
     * station is changed to non-host, but the station is the owner of any air waybills or ULDs with
     * associated discrepancies, then a warning is displayed.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @param pDiscrepancyControlStation
     *            the new value of the <code>discrepancyControlStation</code> property.<br>
     */
    public void setDiscrepancyControlStation(
                final String pDiscrepancyControlStation) {
        this.discrepancyControlStation = ContractUtility
                    .convertToUpperCase(pDiscrepancyControlStation);
    }

    /**
     * Sets the value of the <code>disFSUMessageControlCode</code> property.
     * <p>
     * These flags are used for two purposes: Indicates use of incoming FSU messages, or live goods to
     * determine the current status of a shipment if both, incoming FSU messages, and live goods, exist for
     * the same status and at the same station. This only applies based on a system level dynamic parameter.In
     * LMS, the parameter C$DSSF should be set to 1. Indicates if outgoing FSU/FZE messages are generated
     * based on live goods functions, based on incoming FSU messages and the Status Update function, or based
     * on both.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * F
     * <p>
     * 
     * @param pDisFSUMessageControlCode
     *            the new value of the <code>disFSUMessageControlCode</code> property.<br>
     */
    public void setDisFSUMessageControlCode(
                final String pDisFSUMessageControlCode) {
        this.disFSUMessageControlCode = ContractUtility
                    .convertToUpperCase(pDisFSUMessageControlCode);
    }

    /**
     * Sets the value of the <code>dlvFSUMessageControlCode</code> property.
     * <p>
     * These flags are used for two purposes: Indicates use of incoming FSU messages, or live goods to
     * determine the current status of a shipment if both, incoming FSU messages, and live goods, exist for
     * the same status and at the same station. This only applies based on a system level dynamic parameter.In
     * LMS, the parameter C$DSSF should be set to 1. Indicates if outgoing FSU/FZE messages are generated
     * based on live goods functions, based on incoming FSU messages and the Status Update function, or based
     * on both.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * F
     * <p>
     * 
     * @param pDlvFSUMessageControlCode
     *            the new value of the <code>dlvFSUMessageControlCode</code> property.<br>
     */
    public void setDlvFSUMessageControlCode(
                final String pDlvFSUMessageControlCode) {
        this.dlvFSUMessageControlCode = ContractUtility
                    .convertToUpperCase(pDlvFSUMessageControlCode);
    }

    /**
     * Sets the value of <code>domesticOnlyIndicator</code> property.
     * <p>
     * The Domestic only indicator is used to determine whether the check-in all function should process only
     * domestic and no international flights, or whether it should process all flights. Possible Values:
     * <li><code>true</code><br>
     * If the check-in all function processes only domestic flights.
     * <li><code>false</code><br>
     * If the check-in all function processes domestic and international flights.
     * <p>
     * 
     * @param pDomesticOnlyIndicator
     *            the new value of the <code>domesticOnlyIndicator</code> property.<br>
     */
    public void setDomesticOnlyIndicator(final boolean pDomesticOnlyIndicator) {
        this.domesticOnlyIndicator = pDomesticOnlyIndicator;
    }

    /**
     * Sets the value of the <code>enterFlightManifestAssignmentStatusCode</code> property.
     * <p>
     * Used by the FFM Message and Enter Flight Manifest function to indicate whether to assign a shipment as
     * "Finalized" or "Not Finalized".
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * F
     * <p>
     * 
     * @param pEnterFlightManifestAssignmentStatusCode
     *            the new value of the <code>enterFlightManifestAssignmentStatusCode</code> property.<br>
     */
    public void setEnterFlightManifestAssignmentStatusCode(
                final String pEnterFlightManifestAssignmentStatusCode) {
        this.enterFlightManifestAssignmentStatusCode = ContractUtility
                    .convertToUpperCase(pEnterFlightManifestAssignmentStatusCode);
    }

    /**
     * Sets the value of the <code>exportDefaultLocations</code> property.
     * <p>
     * The default location for the acceptance of goods at this station. This location is used when there is
     * no location entered in the accept goods. If this field is blank, then the system wide default location
     * is used by the Accept Goods function. If this field is blank, then the system wide default system
     * location parameter is used by the Accept Goods function (LMS parameter is C$ELOC). The value of "NONE"
     * can be entered to indicate that there is no default location defined at the station level and that the
     * system wide default is not to be used.
     * <p>
     * <b>Format: </b><br>
     * 1-9 Alphanumeric
     * <p>
     * <b>Example: </b><br>
     * 1EXPORT
     * <p>
     * 
     * @param pExportDefaultLocations
     *            the new value of the <code>exportDefaultLocations</code> property.<br>
     */
    public void setExportDefaultLocations(final String pExportDefaultLocations) {
        this.exportDefaultLocations = ContractUtility
                    .convertToUpperCase(pExportDefaultLocations);
    }

    /**
     * Sets the value of <code>exportMechanizedIndicator</code> property.
     * <p>
     * Export mechanized indicator. Indicates whether or not the export part of the station has a PC. This
     * field is not used for processing purposes within the application and is used for display purposes only.
     * Possible Values:
     * <li><code>true</code><br>
     * Indicates Export does have a PC. This is the default value.
     * <li><code>false</code><br>
     * Indicates Export does not have a PC. This is an optional attribute.
     * <p>
     * 
     * @param pExportMechanizedIndicator
     *            the new value of the <code>exportMechanizedIndicator</code> property.<br>
     */
    public void setExportMechanizedIndicator(
                final boolean pExportMechanizedIndicator) {
        this.exportMechanizedIndicator = pExportMechanizedIndicator;
    }

    /**
     * Sets the value of the <code>flightSummaryFutureHours</code> property.
     * <p>
     * Number of hours in the future to display flight information.
     * <p>
     * <b>Format: </b><br>
     * 1-3 Numeric
     * <p>
     * <b>Example: </b><br>
     * 234
     * <p>
     * 
     * @param pFlightSummaryFutureHours
     *            the new value of the <code>flightSummaryFutureHours</code> property.<br>
     */
    public void setFlightSummaryFutureHours(final int pFlightSummaryFutureHours) {
        this.flightSummaryFutureHours = pFlightSummaryFutureHours;
    }

    /**
     * Sets the value of the <code>houseAwbAssociationEnforcementCode</code> property.
     * <p>
     * Indicator specifies when the enforcement of house air waybill and master goods association is to be
     * performed.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * N
     * <p>
     * 
     * @param pHouseAwbAssociationEnforcementCode
     *            the new value of the <code>houseAwbAssociationEnforcementCode</code> property.<br>
     */
    public void setHouseAwbAssociationEnforcementCode(
                final String pHouseAwbAssociationEnforcementCode) {
        this.houseAwbAssociationEnforcementCode = ContractUtility
                    .convertToUpperCase(pHouseAwbAssociationEnforcementCode);
    }

    /**
     * Sets the value of the <code>houseAwbAutomaticAssociationCode</code> property.
     * <p>
     * Indicator specifies when the automatic association of house air waybill and master goods is to be
     * performed.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * N
     * <p>
     * 
     * @param pHouseAwbAutomaticAssociationCode
     *            the new value of the <code>houseAwbAutomaticAssociationCode</code> property.<br>
     */
    public void setHouseAwbAutomaticAssociationCode(
                final String pHouseAwbAutomaticAssociationCode) {
        this.houseAwbAutomaticAssociationCode = ContractUtility
                    .convertToUpperCase(pHouseAwbAutomaticAssociationCode);
    }

    /**
     * Sets the value of <code>incomingRCSCreatesGoodsIndicator</code> property.
     * <p>
     * Goods Indicator to specify if an incoming FSU RCS message attempts to create goods.
     * <li><code>true</code><br>
     * Indicates that an incoming FSU RCS message attempts to create goods.
     * <li><code>false</code><br>
     * Indicates that an incoming FSU RCS message is only recorded in goods history, and does not attempt to
     * create goods. This is the default value.
     * <p>
     * 
     * @param pIncomingRCSCreatesGoodsIndicator
     *            the new value of the <code>incomingRCSCreatesGoodsIndicator </code> property.<bR>
     */
    public void setIncomingRCSCreatesGoodsIndicator(
                final boolean pIncomingRCSCreatesGoodsIndicator) {
        this.incomingRCSCreatesGoodsIndicator = pIncomingRCSCreatesGoodsIndicator;
    }

    /**
     * Sets the value of <code>incomingRCSRCFProcessGoodsIndicator</code> property.
     * <p>
     * Indicator to specify if an incoming FSU: RCF message attempts to check-in goods.
     * <li><code>true</code><br>
     * An incoming FSU RCF message attempts to check-in goods.
     * <li><code>false</code><br>
     * An incoming FSU RCF message is only recorded in goods history, and does not attempt to check-in goods.
     * This is the default value.
     * <p>
     * 
     * @param pIncomingRCSRCFProcessGoodsIndicator
     *            the new value of the <code> incomingRCSRCFProcessGoodsIndicator </code> property.<bR>
     */
    public void setIncomingRCSRCFProcessGoodsIndicator(
                final boolean pIncomingRCSRCFProcessGoodsIndicator) {
        this.incomingRCSRCFProcessGoodsIndicator = pIncomingRCSRCFProcessGoodsIndicator;
    }

    /**
     * Sets the value of the <code>manFSUMessageControlCode</code> property.
     * <p>
     * These flags are used for two purposes: Indicates use of incoming FSU messages, or live goods to
     * determine the current status of a shipment if both, incoming FSU messages, and live goods, exist for
     * the same status and at the same station. This only applies based on a system level dynamic parameter.
     * In LMS, the parameter C$DSSF should be set to 1. Indicates if outgoing FSU/FZE messages are generated
     * based on live goods functions, based on incoming FSU messages and the Status Update function, or based
     * on both.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * F
     * <p>
     * 
     * @param pManFSUMessageControlCode
     *            the new value of the <code>manFSUMessageControlCode</code> property.<br>
     */
    public void setManFSUMessageControlCode(
                final String pManFSUMessageControlCode) {
        this.manFSUMessageControlCode = ContractUtility
                    .convertToUpperCase(pManFSUMessageControlCode);
    }

    /**
     * Sets the value of the <code>noticeOfArrivalAutomaticGenerationCode</code> property.
     * <p>
     * Enables or disables the automatic generation of a Notice of Arrival either for a Master or a House Air
     * Waybill. Values are: No Auto Generation - Automatic generation of Notice of Arrival is turned off. This
     * is the default value. (0) Auto Generation for Master Air Waybill - Auto generation of Notice of Arrival
     * is turned on and it generates a Notice of Arrival for master air waybill only. (M) Auto Generation for
     * Master or House - Auto generation of Notice of Arrival is turned on and it attempts to generate a
     * Notice of Arrival for house air waybill. (H) If the air waybill does not have any houses or if the
     * Master AWB Status is not set to 'Deconsolidated', the application generates a Notice of Arrival for the
     * master air waybill.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * M
     * <p>
     * 
     * @param pNoticeOfArrivalAutomaticGenerationCode
     *            the new value of the <code>noticeOfArrivalAutomaticGenerationCode</code> property.<br>
     */
    public void setNoticeOfArrivalAutomaticGenerationCode(
                final String pNoticeOfArrivalAutomaticGenerationCode) {
        this.noticeOfArrivalAutomaticGenerationCode = ContractUtility
                    .convertToUpperCase(pNoticeOfArrivalAutomaticGenerationCode);
    }

    /**
     * Sets the value of <code>noticeOfArrivalAutomaticPrintIndicator</code> property.
     * <p>
     * Possible Values:
     * <li><code>true</code><br>
     * Auto Generation with print:Notice of Arrival is printed.
     * <li><code>false</code><br>
     * Auto Generation without print:Notice of Arrival will not be printed.
     * <p>
     * 
     * @param pNoticeOfArrivalAutomaticPrintIndicator
     *            the new value of the <code> noticeOfArrivalAutomaticPrintIndicator</code> property.<bR>
     */
    public void setNoticeOfArrivalAutomaticPrintIndicator(
                final boolean pNoticeOfArrivalAutomaticPrintIndicator) {
        this.noticeOfArrivalAutomaticPrintIndicator = pNoticeOfArrivalAutomaticPrintIndicator;
    }

    /**
     * Sets the value of <code>noticeOfArrivalIndicator</code> property.
     * <p>
     * Notice of arrival indicator. Possible Values:
     * <li><code>true</code><br>
     * If the application will automatically record the delivery of the air waybill documents at the time the
     * Notice of Arrival is recorded.
     * <li><code>false</code><br>
     * If the application will not automatically record the delivery of the AWB documents at the time the
     * Notice of Arrival is recorded.
     * <p>
     * 
     * @param pNoticeOfArrivalIndicator
     *            the new value of the <code>noticeOfArrivalIndicator</code> property.<bR>
     */
    public void setNoticeOfArrivalIndicator(
                final boolean pNoticeOfArrivalIndicator) {
        this.noticeOfArrivalIndicator = pNoticeOfArrivalIndicator;
    }

    /**
     * Sets the value of the <code>noticeOfArrivalNumberOfCopies</code> property.
     * <p>
     * Defines the number of copies printed for an automatic Notice of Arrival.
     * <p>
     * <b>Format: </b><br>
     * 1-2 Numeric
     * <p>
     * <b>Example: </b><br>
     * 10
     * <p>
     * 
     * @param pNoticeOfArrivalNumberOfCopies
     *            the new value of the <code>noticeOfArrivalNumberOfCopies</code> property.<br>
     */
    public void setNoticeOfArrivalNumberOfCopies(
                final int pNoticeOfArrivalNumberOfCopies) {
        this.noticeOfArrivalNumberOfCopies = pNoticeOfArrivalNumberOfCopies;
    }

    /**
     * Sets the value of <code>printChargeCorrectiveAdviceIndicator</code> property.
     * <p>
     * The Charge Correction Advice print indicator allows stations to use the standard product print formats
     * or local formats (as specified and maintained by the airline). Possible Values: 0 - Default value to
     * the standard product print. 1 - The headers on the CCA are also printed along with the data.
     * <p>
     * 
     * @param pPrintChargeCorrectiveAdviceIndicator
     *            the new value of the <code>printChargeCorrectiveAdviceIndicator</code> property.<bR>
     */
    public void setPrintChargeCorrectiveAdviceIndicator(
                final int pPrintChargeCorrectiveAdviceIndicator) {
        this.printChargeCorrectiveAdviceIndicator = pPrintChargeCorrectiveAdviceIndicator;
    }

    /**
     * Sets the value of <code>printDeliverySlipIndicator</code> property.
     * <p>
     * The Print Delivery Slip indicator allows stations to use the standard product print formats or local
     * formats (as specified and maintained by the airline). Possible Values: 0 - If the station uses the
     * local print formats. 1 - If the station is allowed to use the standard product print formats.
     * <p>
     * 
     * @param pPrintDeliverySlipIndicator
     *            the new value of the <code>printDeliverySlipIndicator</code> property.<bR>
     */
    public void setPrintDeliverySlipIndicator(
                final int pPrintDeliverySlipIndicator) {
        this.printDeliverySlipIndicator = pPrintDeliverySlipIndicator;
    }

    /**
     * Sets the value of <code>printPFBcreditMessageIndicator</code> property.
     * <p>
     * The PFB (Print Freight Bill) Credit Message indicator allows stations to use the standard product print
     * formats or to include the credit status on the print. Possible Values: 0 - Default value to the
     * standard product print. 1 - Prints the credit status (Credit Messages) as per the following rules.
     * While printing the origin air waybill at the origin station, the participant responsible for the
     * prepaid charges is checked credit extension. The order of participant being responsible for prepaid
     * charges is the IATA agent, the Origin Prepaid Bill-to participant, and then the Shipper. If the
     * responsible participant has no credit limit, then CASH ONLY is printed on air waybill. If the
     * responsible participant is over their credit limit, then OVER LIMIT is printed on the air waybill. If
     * the responsible participant has a credit limit, but there is no bank selling exchange rate set up for
     * converting currency of participants credit limit to origin currency then XR MISSING is printed on the
     * air waybill. If printing the destination air waybill at the destination station, the participant
     * responsible for the collect charges is checked for whether credit is extended. The order of participant
     * being responsible for collect charges is the Collect Bill-to participant, and then the Consignee. When
     * printing the destination option at the destination station, If the responsible participant has no
     * credit limit, then CASH ONLY is printed on air waybill. If the responsible participant is over their
     * credit limit, then OVER LIMIT is printed on the air waybill. If the responsible participant has credit
     * limit, but there is no bank selling exchange rate set up for converting currency of participants credit
     * limit to destination currency, then XR MISSING is printed on the air waybill.
     * <p>
     * 
     * @param pPrintPFBcreditMessageIndicator
     *            the new value of the <code>printPFBcreditMessageIndicator</code> property.<bR>
     */
    public void setPrintPFBcreditMessageIndicator(
                final int pPrintPFBcreditMessageIndicator) {
        this.printPFBcreditMessageIndicator = pPrintPFBcreditMessageIndicator;
    }

    /**
     * Sets the value of <code>printPrintFreightBillIndicator</code> property.
     * <p>
     * The Print Freight Bill (PFB) indicator allows stations to use the standard product print formats or
     * local formats (as specified and maintained by the airline). Possible Values: 0 - Default value to the
     * standard product print. 1 - The issuing carrier is not printed by PFB.
     * <p>
     * 
     * @param pPrintPrintFreightBillIndicator
     *            the new value of the <code>printPrintFreightBillIndicator</code> property.<bR>
     */
    public void setPrintPrintFreightBillIndicator(
                final int pPrintPrintFreightBillIndicator) {
        this.printPrintFreightBillIndicator = pPrintPrintFreightBillIndicator;
    }

    /**
     * Sets the value of the <code>rateQueueOffice</code> property.
     * <p>
     * Queuing office designator for an air waybill is queued for tariff rates. If this field is left blank,
     * the air waybill is queued to the office that the agent is signed into. If Rate queue station is
     * entered, then entry of this field is mandatory: otherwise, entry of this field is prohibited.
     * <p>
     * <b>Format: </b><br>
     * 3 Numeric
     * <p>
     * <b>Example: </b><br>
     * 001
     * <p>
     * 
     * @param pRateQueueOffice
     *            the new value of the <code>rateQueueOffice</code> property.<br>
     */
    public void setRateQueueOffice(final int pRateQueueOffice) {
        this.rateQueueOffice = pRateQueueOffice;
    }

    /**
     * Sets the value of the <code>rateQueueStation</code> property.
     * <p>
     * Queuing city for an air waybill is queued for tariff rates. If this field is left blank, the air
     * waybill is queued to the station that the agent is signed into.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabet
     * <p>
     * <b>Example: </b><br>
     * MSP
     * <p>
     * 
     * @param pRateQueueStation
     *            the new value of the <code>rateQueueStation</code> property.<br>
     */
    public void setRateQueueStation(final String pRateQueueStation) {
        this.rateQueueStation = ContractUtility
                    .convertToUpperCase(pRateQueueStation);
    }

    /**
     * Sets the value of the <code>rcfFSUMessageControlCode</code> property.
     * <p>
     * These flags are used for two purposes: Indicates use of incoming FSU messages, or live goods to
     * determine the current status of a shipment if both, incoming FSU messages, and live goods, exist for
     * the same status and at the same station. This only applies based on a system level dynamic parameter.In
     * LMS, the parameter C$DSSF should be set to 1. Indicates if outgoing FSU/FZE messages are generated
     * based on live goods functions, based on incoming FSU messages and the Status Update function, or based
     * on both.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * F
     * <p>
     * 
     * @param pRcfFSUMessageControlCode
     *            the new value of the <code>rcfFSUMessageControlCode</code> property.<br>
     */
    public void setRcfFSUMessageControlCode(
                final String pRcfFSUMessageControlCode) {
        this.rcfFSUMessageControlCode = ContractUtility
                    .convertToUpperCase(pRcfFSUMessageControlCode);
    }

    /**
     * Sets the value of the <code>rcsFSUMessageControlCode</code> property.
     * <p>
     * These flags are used for two purposes: Indicates use of incoming FSU messages, or live goods to
     * determine the current status of a shipment if both, incoming FSU messages, and live goods, exist for
     * the same status and at the same station. This only applies based on a system level dynamic parameter.In
     * LMS, the parameter C$DSSF should be set to 1. Indicates if outgoing FSU/FZE messages are generated
     * based on live goods functions, based on incoming FSU messages and the Status Update function, or based
     * on both.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * F
     * <p>
     * 
     * @param pRcsFSUMessageControlCode
     *            the new value of the <code>rcsFSUMessageControlCode</code> property.<br>
     */
    public void setRcsFSUMessageControlCode(
                final String pRcsFSUMessageControlCode) {
        this.rcsFSUMessageControlCode = ContractUtility
                    .convertToUpperCase(pRcsFSUMessageControlCode);
    }

    /**
     * Sets the value of the <code>rctFSUMessageControlCode</code> property.
     * <p>
     * These flags are used for two purposes: Indicates use of incoming FSU messages, or live goods to
     * determine the current status of a shipment if both, incoming FSU messages, and live goods, exist for
     * the same status and at the same station. This only applies based on a system level dynamic parameter.In
     * LMS, the parameter C$DSSF should be set to 1. Indicates if outgoing FSU/FZE messages are generated
     * based on live goods functions, based on incoming FSU messages and the Status Update function, or based
     * on both.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * F
     * <p>
     * 
     * @param pRctFSUMessageControlCode
     *            the new value of the <code>rctFSUMessageControlCode</code> property.<br>
     */
    public void setRctFSUMessageControlCode(
                final String pRctFSUMessageControlCode) {
        this.rctFSUMessageControlCode = ContractUtility
                    .convertToUpperCase(pRctFSUMessageControlCode);
    }

    /**
     * Sets the value of <code>recordAwbDocumentsDeliveredIndicator</code> property.
     * <p>
     * Indicates whether the automatic generation of a Notice of Arrival will also automatically record the
     * delivery of the air waybill documents.
     * <li><code>true</code><br>
     * The application will automatically record the delivery of the air waybill documents at the time the
     * Notice of Arrival is recorded.
     * <li><code>false</code><br>
     * The application will not automatically record the delivery of the AWB documents at the time the Notice
     * of Arrival is recorded. This is the default value.
     * <p>
     * 
     * @param pRecordAwbDocumentsDeliveredIndicator
     *            the new value of the <code> recordAwbDocumentsDeliveredIndicator</code> property.<bR>
     */
    public void setRecordAwbDocumentsDeliveredIndicator(
                final boolean pRecordAwbDocumentsDeliveredIndicator) {
        this.recordAwbDocumentsDeliveredIndicator = pRecordAwbDocumentsDeliveredIndicator;
    }

    /**
     * Sets the value of the <code>stationOtherChargeQueues</code> property.
     * <p>
     * Queuing station for an air waybill is queued for miscellaneous rates. If this field is left blank, the
     * air waybill is queued to the station that the agent is signed into.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * msp
     * <p>
     * 
     * @param pStationOtherChargeQueues
     *            the new value of the <code>stationOtherChargeQueues</code> property.<br>
     */
    public void setStationOtherChargeQueues(
                final String pStationOtherChargeQueues) {
        this.stationOtherChargeQueues = ContractUtility
                    .convertToUpperCase(pStationOtherChargeQueues);
    }

    /**
     * Sets the value of the <code>stationRestrictionsControlStation</code> property.
     * <p>
     * The Station Restrictions Control Station is an alternate station that is allowed to maintain collect
     * charges allowed and embargo information for this station. If this field is blank, it defaults to the
     * station being entered.
     * <p>
     * <b>Format: </b><br>
     * 3 Alphabets
     * <p>
     * <b>Example: </b><br>
     * msp
     * <p>
     * 
     * @param pStationRestrictionsControlStation
     *            the new value of the <code>stationRestrictionsControlStation</code> property.<br>
     */
    public void setStationRestrictionsControlStation(
                final String pStationRestrictionsControlStation) {
        this.stationRestrictionsControlStation = ContractUtility
                    .convertToUpperCase(pStationRestrictionsControlStation);
    }

    /**
     * Sets the value of <code>taxesApplyIndicator</code> property.
     * <p>
     * Indicates whether taxes (province/state/city) are applied at this station, provided the AWB meets
     * specific criteria. The tax rates and criteria are specified in the tax tables using the Tax Information
     * function. Values allowed are:
     * <li><code>true</code><br>
     * Indicate that taxes are applicable at this station.
     * <li><code>false</code><br>
     * Indicates default value. No taxes are applicable at this station. Refer to Other Charges Generation,
     * Tax Generation for more details.
     * <p>
     * 
     * @param pTaxesApplyIndicator
     *            the new value of the <code>taxesApplyIndicator</code> property.<bR>
     */
    public void setTaxesApplyIndicator(final boolean pTaxesApplyIndicator) {
        this.taxesApplyIndicator = pTaxesApplyIndicator;
    }

    /**
     * Sets the value of the <code>tconPrefixCode</code> property.
     * <p>
     * Prefix for auto TCON creation. Loose goods of the product code specified in the product code field can
     * be moved into a flight specific Terminal Container (TCON) instead of using the default Goods Check In
     * All location when these conditions are met.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * T
     * <p>
     * 
     * @param pTconPrefixCode
     *            the new value of the <code>tconPrefixCode</code>property.<br>
     */
    public void setTconPrefixCode(final String pTconPrefixCode) {
        this.tconPrefixCode = ContractUtility
                    .convertToUpperCase(pTconPrefixCode);
    }

    /**
     * Sets the value of the <code>tfdFSUMessageControlCode</code> property.
     * <p>
     * These flags are used for two purposes: Indicates use of incoming FSU messages, or live goods to
     * determine the current status of a shipment if both, incoming FSU messages, and live goods, exist for
     * the same status and at the same station. This only applies based on a system level dynamic parameter.In
     * LMS, the parameter C$DSSF should be set to 1. Indicates if outgoing FSU/FZE messages are generated
     * based on live goods functions, based on incoming FSU messages and the Status Update function, or based
     * on both.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * F
     * <p>
     * 
     * @param pTfdFSUMessageControlCode
     *            the new value of the <code>tfdFSUMessageControlCode</code> property.<br>
     */
    public void setTfdFSUMessageControlCode(
                final String pTfdFSUMessageControlCode) {
        this.tfdFSUMessageControlCode = ContractUtility
                    .convertToUpperCase(pTfdFSUMessageControlCode);
    }

    /**
     * Sets the value of the <code>timeAfterFlightDepDomestic</code> property.
     * <p>
     * For the domestic functionality, this parameter defines when after flight departure the flight
     * finalization is automatically executed if no previous manual flight finalization was completed.
     * <p>
     * <b>Format: </b><br>
     * 1 - 99 0r 1 - 999 0r NO
     * <p>
     * <b>Example: </b><br>
     * NO
     * <p>
     * 
     * @param pTimeAfterFlightDepDomestic
     *            the new value of the <code>timeAfterFlightDepDomestic</code> property.<br>
     */
    public void setTimeAfterFlightDepDomestic(
                final String pTimeAfterFlightDepDomestic) {
        this.timeAfterFlightDepDomestic = pTimeAfterFlightDepDomestic;
    }

    /**
     * Sets the value of the <code>timeAfterFlightDepDomesticCode</code> property.
     * <p>
     * Indicates whether the time after flight departure for domestic is expressed in minutes or percentage.
     * Minutes - This is the default, with a value of zero. This value defines the number of minutes after
     * flight departure when Flight Finalization is done if no previous manual Flight Finalization was
     * completed. Percentage - Indicates the time entered is a percentage. This value defines the percent of
     * scheduled flight time after flight departure when Flight Finalization is done if no previous manual
     * flight finalization was completed.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * M
     * <p>
     * 
     * @param pTimeAfterFlightDepDomesticCode
     *            the new value of the <code>timeAfterFlightDepDomesticCode</code> property.<br>
     */
    public void setTimeAfterFlightDepDomesticCode(
                final String pTimeAfterFlightDepDomesticCode) {
        this.timeAfterFlightDepDomesticCode = pTimeAfterFlightDepDomesticCode;
    }

    /**
     * Sets the value of the <code>timeAfterFlightDepInternational</code> property.
     * <p>
     * For the international functionality, this parameter defines when after flight departure the flight
     * finalization is automatically executed if no previous manual flight finalization was completed.
     * <p>
     * <b>Format: </b><br>
     * 1 - 99 0r 1 - 999 0r NO
     * <p>
     * <b>Example: </b><br>
     * NO
     * <p>
     * 
     * @param pTimeAfterFlightDepInternational
     *            the new value of the <code>timeAfterFlightDepInternational</code> property.<br>
     */
    public void setTimeAfterFlightDepInternational(
                final String pTimeAfterFlightDepInternational) {
        this.timeAfterFlightDepInternational = pTimeAfterFlightDepInternational;
    }

    /**
     * Sets the value of the <code>timeAfterFlightDepInternationalCode</code> property.
     * <p>
     * Indicates whether the time after flight departure for international is expressed in minutes or
     * percentage. Minutes - This is the default, with a value of zero. This value defines the number of
     * minutes after flight departure when Flight Finalization is done if no previous manual Flight
     * Finalization was completed. Percentage - Indicates the time entered is a percentage. This value defines
     * the percent of scheduled flight time after flight departure when Flight Finalization is done if no
     * previous manual flight finalization was completed.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * M
     * <p>
     * 
     * @param pTimeAfterFlightDepInternationalCode
     *            The new value of the <code>timeAfterFlightDepInternationalCode</code> property.<br>
     */
    public void setTimeAfterFlightDepInternationalCode(
                final String pTimeAfterFlightDepInternationalCode) {
        this.timeAfterFlightDepInternationalCode = pTimeAfterFlightDepInternationalCode;
    }

    /**
     * Sets the value of the <code>timeAfterFlightDepUS</code> property.
     * <p>
     * This parameter defines when after flight departure the flight finalization, initiate customs and the
     * generation of a flight departure message is automatically executed if they were not previously done.
     * <p>
     * <b>Format: </b><br>
     * 1 - 99 0r 1 - 999 0r NO
     * <p>
     * <b>Example: </b><br>
     * NO
     * <p>
     * 
     * @param pTimeAfterFlightDepUS
     *            the new value of the <code>timeAfterFlightDepUS</code> property.<br>
     */
    public void setTimeAfterFlightDepUS(final String pTimeAfterFlightDepUS) {
        this.timeAfterFlightDepUS = pTimeAfterFlightDepUS;
    }

    /**
     * Sets the value of the <code>timeAfterFlightDepUSCode</code> property.
     * <p>
     * Indicates whether the time after flight departure for [NPC]And Initiate US Customs & Flight Departure
     * Message' is expressed in minutes or percentage. Minutes - This is the default, with a value of zero.
     * This value defines the number of minutes after flight departure when Flight Finalization is done if no
     * previous manual Flight Finalization was completed. For the [NPC]And Initiate US Customs & Flight
     * Departure Message' functionality, the application will also automatically Initiate Customs and generate
     * a Flight Departure Message. Percentage - Indicates the time entered is a percentage. This value defines
     * the percent of scheduled flight time after flight departure when Flight Finalization is done if no
     * previous manual flight finalization was completed. For the [NPC]And Initiate US Customs & Flight
     * Departure Message' functionality, the application will also automatically Initiate Customs and generate
     * a Flight Departure Message.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * M
     * <p>
     * 
     * @param pTimeAfterFlightDepUSCode
     *            the new value of the <code>timeAfterFlightDepUSCode</code> property.<br>
     */
    public void setTimeAfterFlightDepUSCode(
                final String pTimeAfterFlightDepUSCode) {
        this.timeAfterFlightDepUSCode = pTimeAfterFlightDepUSCode;
    }

    /**
     * Sets the value of the <code>trmFSUMessageControlCode</code> property.
     * <p>
     * These flags are used for two purposes: Indicates use of incoming FSU messages, or live goods to
     * determine the current status of a shipment if both, incoming FSU messages, and live goods, exist for
     * the same status and at the same station. This only applies based on a system level dynamic parameter.In
     * LMS, the parameter C$DSSF should be set to 1. Indicator to specify if an incoming FSU RCS message
     * attempts to create goods. 0 - Indicates that an incoming FSU RCS message is only recorded in goods
     * history, and does not attempt to create goods. 1 - Indicates that an incoming FSU RCS message attempts
     * to create goods. Indicates if outgoing FSU/FZE messages are generated based on live goods functions,
     * based on incoming FSU messages and the Status Update function, or based on both.
     * <p>
     * <b>Format: </b><br>
     * 1 Alphabet
     * <p>
     * <b>Example: </b><br>
     * F
     * <p>
     * 
     * @param pTrmFSUMessageControlCode
     *            the new value of the <code>trmFSUMessageControlCode</code> property.<br>
     */
    public void setTrmFSUMessageControlCode(
                final String pTrmFSUMessageControlCode) {
        this.trmFSUMessageControlCode = ContractUtility
                    .convertToUpperCase(pTrmFSUMessageControlCode);
    }
}
