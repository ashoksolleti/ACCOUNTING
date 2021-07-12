/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.contract;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest;
import com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse;
import com.unisys.trans.logistics.lms.framework.dto.SuggestiveSearchResponse;
import com.unisys.trans.logistics.lms.framework.dto.ValidationRequest;
import com.unisys.trans.logistics.lms.framework.dto.ValidationResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.AggregateDto;
import com.unisys.trans.logistics.lms.utils.dto.GeographicDataDto;
import com.unisys.trans.logistics.lms.utils.dto.StationControlMessageRequest;
import com.unisys.trans.logistics.lms.utils.dto.StationDto;
import com.unisys.trans.logistics.lms.utils.dto.StationFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.StationLocalTimeFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.StationLocalTimeFindResponse;
import com.unisys.trans.logistics.lms.utils.dto.StationPersistRequest;
import com.unisys.trans.logistics.lms.utils.dto.StationResponse;
import com.unisys.trans.logistics.lms.utils.dto.SuggestiveSearchRequest;

/**
 * <code>StationServiceImpl</code> provides the functional methods to maintain
 * freight station information.
 * <p>
 * The freight station information maintains<br>
 * <ul>
 * <li>General details like address, teletype addresses and geographical location data.
 * <li>Service details like station hours, time definite parameters and default location data .
 * <li>Handled carrier details.
 * <li>Various station parameters to control freight specific features.
 * </ul>
 * <p>
 * It offers the following services for maintaining station information:<br>
 * <ul>
 * <li>createStation - Creates station information.
 * <li>findByStationCode - Finds the station details for the list of station codes input.
 * <li>findRestrictionStation - Finds the station restriction control station for the given station code.
 * <li>findStation - Retrieves station information.
 * <li>updateStation - Updates station information.
 * <li>findStations - Finds the station information for the list of station codes.
 * <li>findAllStations - Finds all the stations that exist in the system.
 * <li>validateStation - Validates if station exist in the system.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.utils.dto.StationFindRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.StationResponse
 * @see com.unisys.trans.logistics.lms.utils.dto.StationPersistRequest
 */
@Path("stationService")
public interface StationService {

    /**
     * Creates a <code>station</code> after validating all the input data.
     * <p>
     * <b>Related methods include:</b>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.StationService#updateStation
     * updateStation }
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#STATION_CODE_LENGTH}
     * </pre>
     * 
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * <br>
     * <b>Errors: </b><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#QUICK_RAMP_TRANSFER_DOES_NOT_EXIST}</td>
     *            <td>The quick ramp transfer does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#COUNTRY_DOES_NOT_EXIST}</td>
     *            <td>The country does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_CODE_CANNOT_BE_UPDATED}</td>
     *            <td>The station code can not be udpated.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_HANDLED_CARRIER_DOES_NOT_EXIST}</td>
     *            <td>The handled carrier does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_HOST_HANDLED_BY_DOES_NOT_EXIST}</td>
     *            <td>The type is a Carrier code. But the Carrier code entered in the Host handled
     *             by field Carrier Code does  not exist.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_CARRIER_DOES_NOT_EXIST}</td>
     *            <td>The carrier code does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_CITY_DOES_NOT_EXIST}</td>
     *            <td>The City does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_EXPORT_DEFAULT_LOCATION_DOES_NOT_EXIST}</td>
     *            <td>Default Locations: Export does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_IMPORT_DEFAULT_LOCATION_DOES_NOT_EXIST}</td>
     *            <td>Default Locations: Import does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_CHECKIN_DEFAULT_LOCATION_DOES_NOT_EXIST}</td>
     *            <td>Default Locations: Check-In does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_PACKAGE_DEFAULT_LOCATION_DOES_NOT_EXIST}</td>
     *            <td>Default Locations: Express/Small package does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_DISCREPANCY_STATION_DOES_NOT_EXIST}</td>
     *            <td>The Discrepancy Control Station does not exist in the system.</tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_RESTRICTION_CONTROL_STATION_DOES_NOT_EXIST}</td>
     *            <td>The Stations Restrictions Control Station does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_RATE_QUEUE_STATION_DOES_NOT_EXIST}</td>
     *            <td>The Rate Queue Station does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_OTHER_CHARGE_QUEUE_STATION_DOES_NOT_EXIST}</td>
     *            <td>The Other Charges Queues Station does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_PRODUCT_CODE_DOES_NOT_EXIST}</td>
     *            <td>The Automatic Check-In All: By Product codes does not exist in the system..</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_DOES_NOT_EXIST}</td>
     *            <td>The station does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_NO_AUTOMATIC_CHECK_MECHANISED_STATION_OBJECT_INSTANCE}</td>
     *            <td>As the station is mechanized, the Automatic Check-In By Flight Arrival option cannot
     *            be N, NB, ND, NG, NL, NR or NT.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pStationPersistRequest
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.StationPersistRequest
     *            StationPersistRequest} </code><br>
     *            holds the request object that includes attributes to create a station.<br>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StationDto
     *            StationDto} - (M) </code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setAddress
     *            address} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setAirportIndicator
     *            airportIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setCarrierDefaults
     *            carrierDefaults} - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDefaultDto
     *            carrierDefaultDto} - (O)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDefaultDto#setAutomaticAssignmentToBookedFlightCode
     *            automaticAssignmentToBookedFlightCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDefaultDto#setCarrierCode
     *            carrierCode} -(O)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDefaultDto#setMaintainFlightAssignmentChangeGoodsIndicator
     *            maintainFlightAssignmentChangeGoodsIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDefaultDto#setOId
     *            oId} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDefaultDto#setStationOId
     *            stationOId}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDefaultDto#setStatusForNonMechanizedCheckIn
     *            statusForNonMechanizedCheckIn}- (O)</code>
     *            </ul>
     *            </ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setCity
     *            city} - (M) </code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CityDto
     *            CityDto} - (O)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CityDto#setCityCode
     *            cityCode} - (M)</code>
     *            </ul>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setCustomsTeletypeIndicator
     *            customsTeletypeIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setEntityType
     *            entityType}- (O) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setExportFacsimileNumber
     *            exportFacsimileNumber} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setExportPhoneNumber
     *            exportPhoneNumber} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setExportTeletype1
     *            exportTeletype1} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setExportTeletype2
     *            exportTeletype2} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setExportTeletype3
     *            exportTeletype3} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setExpressOrSmallPackageDefaultLocation
     *            expressOrSmallPackageDefaultLocation}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setHostHandledBy
     *            hostHandledBy} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setHostStationIndicator
     *            hostStationIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setIataDistrict
     *            iataDistrict} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setIataSubDistrict
     *            iataSubDistrict} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setImportFacsimileNumber
     *            importFacsimileNumber} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setImportPhoneNumber
     *            importPhoneNumber}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setImportTeletype1
     *            importTeletype1} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setImportTeletype2
     *            importTeletype2} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setImportTeletype3
     *            importTeletype3} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setMechanizedStationIndicator
     *            mechanizedStationIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setOId
     *            oId} - (O)</code> <li> <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setPhone
     *            phone}- (O) </code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setPostalCode
     *            postalCode} - (O) </code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setQuickRampTransfer
     *            quickRampTransfer} - (O)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setStationAutoCheckProductCodes
     *            stationAutoCheckProductCodes} - (C)</code></li>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StationAutoCheckProductCodeDto
     *            StationAutoCheckProductCodeDto} - (C)</code></li>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationAutoCheckProductCodeDto#setOId
     *            oId} - (M)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationAutoCheckProductCodeDto#setProductCode
     *            productCode}- (C)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationAutoCheckProductCodeDto#setStationOId
     *            stationOId} - (O)</code></li>
     *            </ul>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setStationCashIndicator
     *            stationCashIndicator} - (O)</code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setStationCode
     *            stationCode}- (M) </code></li> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setStationControlParameter
     *            stationControlParameter} - (M)</code></li>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto
     *            StationControlParameterDto} - (M)</code></li>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setAutomaticCheckInAllEnterFlightFinalIndicator
     *            automaticCheckInAllEnterFlightFinalIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setAutomaticCheckInByFlightArrival
     *            automaticCheckInByFlightArrival} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setAutomaticCheckInByFlightArrivalMinutes
     *            automaticCheckInByFlightArrivalMinutes} - (O)</code> <li> <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setAutomaticConfirmDiscrepancyCode
     *            automaticConfirmDiscrepancyCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setAutomaticEnterFlightFinalInternationalCode
     *            automaticEnterFlightFinalInternationalCode}- (M)</code> <li> <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setAutomaticEnterFlightFinalPrinter
     *            automaticEnterFlightFinalPrinter} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setAutomaticFlightFinalDomesticCode
     *            automaticFlightFinalDomesticCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setAutomaticULDInactivationIndicator
     *            automaticULDInactivationIndicator} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setAutomaticUSCustomsFlightDepMessageCode
     *            automaticUSCustomsFlightDepMessageCode} - (M)</code> <li> <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setAwbClearsImportCode
     *            awbClearsImportCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setAwbImportCustomsEnforcementsIndicator
     *            awbImportCustomsEnforcementsIndicator}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setCcdFSUMessageControlCode
     *            ccdFSUMessageControlCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setCustomsArea
     *            customsArea} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setCustomsAutomatedPortSelectionCode
     *            customsAutomatedPortSelectionCode} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setDelayFSUDEPUntilWheelsUpIndicator
     *            delayFSUDEPUntilWheelsUpIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setDelayToAccountingExportDays
     *            delayToAccountingExportDays} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setDelayToAccountingImportDays
     *            delayToAccountingImportDays}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setDepFSUMessageControlCode
     *            depFSUMessageControlCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setDiscrepancyControlStation
     *            discrepancyControlStation} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setDisFSUMessageControlCode
     *            disFSUMessageControlCode} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setDlvFSUMessageControlCode
     *            dlvFSUMessageControlCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setDomesticOnlyIndicator
     *            domesticOnlyIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setEnterFlightManifestAssignmentStatusCode
     *            enterFlightManifestAssignmentStatusCode}- (O)</code> <li> <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setExportDefaultLocations
     *            exportDefaultLocations} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setExportMechanizedIndicator
     *            exportMechanizedIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setFlightSummaryFutureHours
     *            flightSummaryFutureHours} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setHouseAwbAssociationEnforcementCode
     *            houseAwbAssociationEnforcementCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setHouseAwbAutomaticAssociationCode
     *            houseAwbAutomaticAssociationCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setIncomingRCSCreatesGoodsIndicator
     *            incomingRCSCreatesGoodsIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setIncomingRCSRCFProcessGoodsIndicator
     *            incomingRCSRCFProcessGoodsIndicator} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setManFSUMessageControlCode
     *            manFSUMessageControlCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setNoticeOfArrivalAutomaticGenerationCode
     *            noticeOfArrivalAutomaticGenerationCode} - (O)</code> <li> <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setNoticeOfArrivalAutomaticPrintIndicator
     *            noticeOfArrivalAutomaticPrintIndicator}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setNoticeOfArrivalIndicator
     *            noticeOfArrivalIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setNoticeOfArrivalNumberOfCopies
     *            noticeOfArrivalNumberOfCopies} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setPrintChargeCorrectiveAdviceIndicator
     *            printChargeCorrectiveAdviceIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setPrintDeliverySlipIndicator
     *            printDeliverySlipIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setPrintPFBcreditMessageIndicator
     *            printPFBcreditMessageIndicator} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setPrintPrintFreightBillIndicator
     *            printPrintFreightBillIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setRateQueueOffice
     *            rateQueueOffice} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setRateQueueStation
     *            rateQueueStation}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setRcfFSUMessageControlCode
     *            rcfFSUMessageControlCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setRcsFSUMessageControlCode
     *            rcsFSUMessageControlCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setRctFSUMessageControlCode
     *            rctFSUMessageControlCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setRecordAwbDocumentsDeliveredIndicator
     *            recordAwbDocumentsDeliveredIndicator} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setStationOtherChargeQueues
     *            stationOtherChargeQueues} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setStationRestrictionsControlStation
     *            stationRestrictionsControlStation} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setTaxesApplyIndicator
     *            taxesApplyIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setTconPrefixCode
     *            tconPrefixCode} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setTfdFSUMessageControlCode
     *            tfdFSUMessageControlCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setTimeAfterFlightDepDomestic
     *            timeAfterFlightDepDomestic} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setTimeAfterFlightDepDomesticCode
     *            timeAfterFlightDepDomesticCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setTimeAfterFlightDepInternational
     *            timeAfterFlightDepInternational} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setTimeAfterFlightDepInternationalCode
     *            timeAfterFlightDepInternationalCode} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setTimeAfterFlightDepUS
     *            timeAfterFlightDepUS} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setTimeAfterFlightDepUSCode
     *            timeAfterFlightDepUSCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setTrmFSUMessageControlCode
     *            trmFSUMessageControlCode}- (O)</code>
     *            </ul>
     *            </ul> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setStationHandledCarriers
     *            stationHandledCarriers} - (O)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StationHandledCarrierDto
     *            StationHandledCarrierDto} - (O)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationHandledCarrierDto#setCarrierCode
     *            carrierCode} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationHandledCarrierDto#setOId
     *            oId} - (M) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationHandledCarrierDto#setStationOId
     *            stationOId} - (O)</code>
     *            </ul>
     *            </ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setStationName
     *            stationName} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setStationNonQueueReasonCodes
     *            stationNonQueueReasonCodes} - (O)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StationNonQueueReasonCodeDto
     *            StationNonQueueReasonCodeDto} -(O)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationNonQueueReasonCodeDto#setOId
     *            oId} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationNonQueueReasonCodeDto#setReasonCodeNotQueued
     *            reasonCodeNotQueued}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationNonQueueReasonCodeDto#setStationOId
     *            stationOId} - (O)</code>
     *            </ul>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setStationServiceDetail
     *            stationServiceDetail} - (O)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto
     *            StationServiceDetailDto} - (0)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setCheckInAllDefaultLocations
     *            checkInAllDefaultLocations}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setCustomsHours
     *            customsHours} - (O)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto
     *            OfficeHourDto} - (O)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setHolidayCloseHour
     *            holidayCloseHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setHolidayOpenHour
     *            holidayOpenHour} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSaturdayCloseHour
     *            saturdayCloseHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSaturdayOpenHour
     *            saturdayOpenHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSundayCloseHour
     *            sundayCloseHour}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSundayOpenHour
     *            sundayOpenHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setWeekdayCloseHour
     *            weekdayCloseHour}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setWeekdayOpenHour
     *            weekdayOpenHour} - (O)</code>
     *            </ul>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setCustomsPortNumber
     *            customsPortNumber} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setDeliveryAccountExpressCargo
     *            deliveryAccountExpressCargo} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setDeliveryAccountNormalCargo
     *            deliveryAccountNormalCargo} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setDeliveryHours
     *            deliveryHours}- (O)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto
     *            OfficeHourDto} - (O)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setHolidayCloseHour
     *            holidayCloseHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setHolidayOpenHour
     *            holidayOpenHour} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSaturdayCloseHour
     *            saturdayCloseHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSaturdayOpenHour
     *            saturdayOpenHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSundayCloseHour
     *            sundayCloseHour}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSundayOpenHour
     *            sundayOpenHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setWeekdayCloseHour
     *            weekdayCloseHour}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setWeekdayOpenHour
     *            weekdayOpenHour} - (O)</code>
     *            </ul>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setDrivingTimeToAirport
     *            drivingTimeToAirport} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setDropOffTimeDocuments
     *            dropOffTimeDocuments} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setDropOffTimeExpress
     *            dropOffTimeExpress} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setDropOffTimeFrame
     *            dropOffTimeFrame} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setDropOffTimeNormal
     *            dropOffTimeNormal} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setExpressDeliveryPickUpHours
     *            expressDeliveryPickUpHours}- (O)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto
     *            OfficeHourDto} - (O)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setHolidayCloseHour
     *            holidayCloseHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setHolidayOpenHour
     *            holidayOpenHour} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSaturdayCloseHour
     *            saturdayCloseHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSaturdayOpenHour
     *            saturdayOpenHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSundayCloseHour
     *            sundayCloseHour}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSundayOpenHour
     *            sundayOpenHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setWeekdayCloseHour
     *            weekdayCloseHour}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setWeekdayOpenHour
     *            weekdayOpenHour} - (O)</code>
     *            </ul>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setExpressPickUpHours
     *            expressPickUpHours} - (O)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto
     *            OfficeHourDto} - (O)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setHolidayCloseHour
     *            holidayCloseHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setHolidayOpenHour
     *            holidayOpenHour} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSaturdayCloseHour
     *            saturdayCloseHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSaturdayOpenHour
     *            saturdayOpenHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSundayCloseHour
     *            sundayCloseHour}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSundayOpenHour
     *            sundayOpenHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setWeekdayCloseHour
     *            weekdayCloseHour}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setWeekdayOpenHour
     *            weekdayOpenHour} - (O)</code>
     *            </ul>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setFranchiseStationIndicator
     *            franchiseStationIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setImportDefaultLocations
     *            importDefaultLocations} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setImportMechanizedIndicator
     *            importMechanizedIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setImportQualityAssuranceIndicator
     *            importQualityAssuranceIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setOfficeOtherChargeQueues
     *            officeOtherChargeQueues}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setOpenHours
     *            openHours} - (O)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto
     *            OfficeHourDto} - (O)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setHolidayCloseHour
     *            holidayCloseHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setHolidayOpenHour
     *            holidayOpenHour} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSaturdayCloseHour
     *            saturdayCloseHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSaturdayOpenHour
     *            saturdayOpenHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSundayCloseHour
     *            sundayCloseHour}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSundayOpenHour
     *            sundayOpenHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setWeekdayCloseHour
     *            weekdayCloseHour}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setWeekdayOpenHour
     *            weekdayOpenHour} - (O)</code>
     *            </ul>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setPickUpAccountExpressCargo
     *            pickUpAccountExpressCargo} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setPickUpAccountNormalCargo
     *            pickUpAccountNormalCargo} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setPickUpHours
     *            pickUpHours} - (O)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto
     *            OfficeHourDto} - (O)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setHolidayCloseHour
     *            holidayCloseHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setHolidayOpenHour
     *            holidayOpenHour} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSaturdayCloseHour
     *            saturdayCloseHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSaturdayOpenHour
     *            saturdayOpenHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSundayCloseHour
     *            sundayCloseHour}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSundayOpenHour
     *            sundayOpenHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setWeekdayCloseHour
     *            weekdayCloseHour}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setWeekdayOpenHour
     *            weekdayOpenHour} - (O)</code>
     *            </ul>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setProductCodeExceptionsExistIndicator
     *            productCodeExceptionsExistIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setRecoveryTimeDocuments
     *            recoveryTimeDocuments} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setRecoveryTimeExpress
     *            recoveryTimeExpress} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setRecoveryTimeFrame
     *            recoveryTimeFrame} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setRecoveryTimeNormal
     *            recoveryTimeNormal} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setStationRemarks
     *            stationRemarks} - (O)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StationRemarksDto
     *            StationRemarksDto}</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StationRemarksDto#setOId
     *            oId - (C)}</code><br>
     *            Mandatory if remarks entered<br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StationRemarksDto#setRemark
     *            remark - (C)}</code><br>
     *            Mandatory if remarksType entered<br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StationRemarksDto#setRemarksType
     *            remarksType - (C)}</code><br>
     *            Mandatory if remarks entered<br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StationRemarksDto#setStationOId
     *            stationOId - (O)}</code>
     *            </ul>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setWareHouseHours
     *            wareHouseHours} - (O)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto
     *            OfficeHourDto} - (O)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setHolidayCloseHour
     *            holidayCloseHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setHolidayOpenHour
     *            holidayOpenHour} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSaturdayCloseHour
     *            saturdayCloseHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSaturdayOpenHour
     *            saturdayOpenHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSundayCloseHour
     *            sundayCloseHour}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSundayOpenHour
     *            sundayOpenHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setWeekdayCloseHour
     *            weekdayCloseHour}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setWeekdayOpenHour
     *            weekdayOpenHour} - (O)</code>
     *            </ul>
     *            </ul>
     *            </ul>
     *            </ul>
     *            <ul>
     *            </ul>
     *            </ul> </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.StationResponse
     *         StationResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.StationResponse#getStation
     *         station} </ul> </code>
     *         <p>
     * @throws LMSException
     *             If the station create operation fails the above mentioned error codes are returned. Each
     *             CodeMessage contains the status code,human readable message and message type.
     */

    StationResponse createStation(StationPersistRequest pStationPersistRequest)
                throws LMSException;

    /**
     * Retrieves all the stations that exist in the system.
     * <p>
     * This method retrieves the station code and the station name for the station codes that match the search
     * text.
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pStationFindRequest
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.StationFindRequest
     *            StationFindRequest}</code><br>
     *            holds the search input values.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StationFindRequest#setSearchText
     *            searchText} - (O)</code><br>
     *            holds the search text to find the station.
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse
     *         MultipleFindResponse}</code><br>
     *         list of station data transfer object.
     *         <ul>
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse#getRetrievedObjects
     *         retrievedObjects} - (0:*)</code><br>
     *         holds a map of station details with station code as key and <code>StationDto</code> as value.
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StationDto
     *         stationDto}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#getStationCode
     *         stationCode}</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#getStationName
     *         stationName}</code>
     *         </ul>
     *         </ul>
     *         </ul>
     *         <p>
     */
    MultipleFindResponse findAllStations(
                final StationFindRequest pStationFindRequest);

    /**
     * Retrieves the station details for the list of station codes input.
     * <p>
     * This method retrieves the airport indicator, city code and the station code of a station for the given
     * list of station codes. Airport indicator indicates if the station is a city or an airport.
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * </p>
     * 
     * @param pMultipleFindRequest
     *            <code>{@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest MultipleFindRequest}</code>
     * <br>
     *            holds the request object which includes the attributes to find
     *            the station code.
     *            <ul>
     *            <li>
     *            <code>{@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest#setSearchInputs searchInputs} - (M) (1:*)</code>
     *            <br>
     *            holds the station code.
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse
     *         MultipleFindResponse}</code><br>
     *         holds the list of the station data transfer objects.<br>
     *         <ul>
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse#getRetrievedObjects
     *         retrievedObjects} - (0:*)</code><br>
     *         holds a map of station details with station code as key and <code>StationDto</code> as value.
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StationDto
     *         stationDto}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#isAirportIndicator
     *         airportIndicator}</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#getCityCode
     *         cityCode}</code> <li> <code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#getStationCode
     *         stationCode} </code>
     *         </ul>
     *         </ul>
     *         </ul>
     *         <p>
     * @throws LMSException
     *             If the find operation fails for the given station code.
     */
    MultipleFindResponse findCityAirportIndicatorByStationCodes(
                MultipleFindRequest pMultipleFindRequest) throws LMSException;

    /**
     * Finds the station restriction control station for the given station code.
     * <p>
     * This method retrieves only the station code and the station restriction control station for the given
     * station code.
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pStationFindRequest
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StationFindRequest
     *            StationFindRequest} - (M) </code><br>
     *            holds the station code of the station which is to be retrieved.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFindRequest#setStationCode
     *            stationCode} - (M)</code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.StationResponse
     *         StationResponse}</code> the station response object.<br>
     *         <p>
     * @throws LMSException
     *             If the find operation fails.
     */
    StationResponse findRestrictionStation(
                StationFindRequest pStationFindRequest) throws LMSException;

    /**
     * Finds the station and the carrier defaults for the station.
     * <p>
     * This method retrieves the station details and the carrier defaults for the station code and carrier
     * code input. If the carrier code is not input,then the station details and the default carrier defaults
     * for the station code is retrieved.
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#STATION_CODE_LENGTH}
     * </pre>
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * <br>
     * <b>Errors: </b><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_HANDLED_CARRIER_DOES_NOT_EXIST}</td>
     *            <td>The handled carrier does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_HOST_HANDLED_BY_DOES_NOT_EXIST}</td>
     *            <td>The type is a Carrier code. But the Carrier code entered in the Host handled
     *             by field Carrier Code does  not exist.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_CARRIER_DOES_NOT_EXIST}</td>
     *            <td>The carrier code does not exist in the system.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pStationFindRequest
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.StationFindRequest
     *            StationFindRequest}</code><br>
     *            holds the request object that includes the attributes to find
     *            a station.<br>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StationFindRequest
     *            StationFindRequest} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFindRequest#setCarrierCode
     *            carrierCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFindRequest#setStationCode
     *            stationCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFindRequest#setViewCarrierDataDefaultsIndicator
     *            viewCarrierDataDefaultsIndicator} - (O)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.StationResponse
     *         StationResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.StationResponse#setStation
     *         station} </ul> </code>
     *         <p>
     * @throws LMSException
     *             If the station find operation fails the above mentioned error
     *             codes are returned. Each CodeMessage contains the status
     *             code,human readable message and message type.
     */
    StationResponse findStation(StationFindRequest pStationFindRequest)
                throws LMSException;

    /**
     * This method returns the station's local date and time for the specified
     * UTC date.
     * <p>
     * 
     * @param pStationLocalTimeFindRequest
     *            holds the station local time find request.
     *            <p>
     * @return the response which holds the local date and time for the station.
     *         <p>
     * @throws LMSException
     *             If the city associated with the station does not exist in the
     *             system.
     */
    StationLocalTimeFindResponse findStationLocalTime(
                final StationLocalTimeFindRequest pStationLocalTimeFindRequest)
                throws LMSException;

    /**
     * This methods retrieves all the station details for the list of station
     * codes input.
     * <p>
     * This methods retrieves all the station details for the list of station codes input including the city
     * details of the city where the station is located. It also retrieves the country code and its customs
     * area where the station is located.
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pMultipleFindRequest
     *            <code> {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest
     *            MultipleFindRequest} </code><br>
     *            holds the request object which includes the attributes to find
     *            the station code.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest#setSearchInputs
     *            searchInputs} - (M) (1:*)</code><br>
     *            holds the station codes.
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse
     *         MultipleFindResponse}</code><br>
     *         holds the list of the station data transfer objects.<br>
     *         <ul>
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse#getRetrievedObjects
     *         retrievedObjects} - (0:*)</code><br>
     *         holds a map of station details with station code as key and <code>StationDto</code> as value.
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StationDto
     *         stationDto}</code>
     *         </ul>
     *         </ul>
     *         <p>
     * @throws LMSException
     *             If the city code or the country code corresponding the input
     *             station codes does not exist in the system.
     */
    MultipleFindResponse findStations(
                final MultipleFindRequest pMultipleFindRequest) throws LMSException;

    /**
     * Updates a <code>station</code> after validating all the input data.
     * <p>
     * <b>Related methods include:</b>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.StationService#updateStation
     * updateStation }
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#STATION_CODE_LENGTH}
     * </pre>
     * 
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * <br>
     * <b>Errors: </b><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#QUICK_RAMP_TRANSFER_DOES_NOT_EXIST}</td>
     *            <td>The quick ramp transfer does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#COUNTRY_DOES_NOT_EXIST}</td>
     *            <td>The country does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_CODE_CANNOT_BE_UPDATED}</td>
     *            <td>The station code can not be udpated.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_HANDLED_CARRIER_DOES_NOT_EXIST}</td>
     *            <td>The handled carrier does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_HOST_HANDLED_BY_DOES_NOT_EXIST}</td>
     *            <td>The type is a Carrier code. But the Carrier code entered in the Host handled
     *             by field Carrier Code does  not exist.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_CARRIER_DOES_NOT_EXIST}</td>
     *            <td>The carrier code does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_CITY_DOES_NOT_EXIST}</td>
     *            <td>The City does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_EXPORT_DEFAULT_LOCATION_DOES_NOT_EXIST}</td>
     *            <td>Default Locations: Export does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_IMPORT_DEFAULT_LOCATION_DOES_NOT_EXIST}</td>
     *            <td>Default Locations: Import does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_CHECKIN_DEFAULT_LOCATION_DOES_NOT_EXIST}</td>
     *            <td>Default Locations: Check-In does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_PACKAGE_DEFAULT_LOCATION_DOES_NOT_EXIST}</td>
     *            <td>Default Locations: Express/Small package does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_DISCREPANCY_STATION_DOES_NOT_EXIST}</td>
     *            <td>The Discrepancy Control Station does not exist in the system.</tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_RESTRICTION_CONTROL_STATION_DOES_NOT_EXIST}</td>
     *            <td>The Stations Restrictions Control Station does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_RATE_QUEUE_STATION_DOES_NOT_EXIST}</td>
     *            <td>The Rate Queue Station does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_OTHER_CHARGE_QUEUE_STATION_DOES_NOT_EXIST}</td>
     *            <td>The Other Charges Queues Station does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_PRODUCT_CODE_DOES_NOT_EXIST}</td>
     *            <td>The Automatic Check-In All: By Product codes does not exist in the system..</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_DOES_NOT_EXIST}</td>
     *            <td>The station does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_NO_AUTOMATIC_CHECK_MECHANISED_STATION_OBJECT_INSTANCE}</td>
     *            <td>As the station is mechanized, the Automatic Check-In By Flight Arrival option cannot
     *            be N, NB, ND, NG, NL, NR or NT.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pStationPersistRequest
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.StationPersistRequest
     *            StationPersistRequest} </code><br>
     *            holds the request object that includes attributes to update a station.<br>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StationDto
     *            StationDto} - (M) </code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setAddress
     *            address} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setAirportIndicator
     *            airportIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setCarrierDefaults
     *            carrierDefaults} - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDefaultDto
     *            carrierDefaultDto} - (O)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDefaultDto#setAutomaticAssignmentToBookedFlightCode
     *            automaticAssignmentToBookedFlightCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDefaultDto#setCarrierCode
     *            carrierCode} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDefaultDto#setMaintainFlightAssignmentChangeGoodsIndicator
     *            maintainFlightAssignmentChangeGoodsIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDefaultDto#setOId
     *            oId} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDefaultDto#setStationOId
     *            stationOId}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CarrierDefaultDto#setStatusForNonMechanizedCheckIn
     *            statusForNonMechanizedCheckIn}- (O)</code>
     *            </ul>
     *            </ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setCity
     *            city} - (M) </code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CityDto
     *            CityDto} - (O)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CityDto#setCityCode
     *            cityCode} - (M)</code>
     *            </ul>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setCustomsTeletypeIndicator
     *            customsTeletypeIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setEntityType
     *            entityType}- (O) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setExportFacsimileNumber
     *            exportFacsimileNumber} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setExportPhoneNumber
     *            exportPhoneNumber} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setExportTeletype1
     *            exportTeletype1} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setExportTeletype2
     *            exportTeletype2} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setExportTeletype3
     *            exportTeletype3} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setExpressOrSmallPackageDefaultLocation
     *            expressOrSmallPackageDefaultLocation}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setHostHandledBy
     *            hostHandledBy} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setHostStationIndicator
     *            hostStationIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setIataDistrict
     *            iataDistrict} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setIataSubDistrict
     *            iataSubDistrict} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setImportFacsimileNumber
     *            importFacsimileNumber} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setImportPhoneNumber
     *            importPhoneNumber}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setImportTeletype1
     *            importTeletype1} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setImportTeletype2
     *            importTeletype2} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setImportTeletype3
     *            importTeletype3} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setMechanizedStationIndicator
     *            mechanizedStationIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setOId
     *            oId} - (O)</code> <li> <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setPhone
     *            phone}- (O) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setPostalCode
     *            postalCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setQuickRampTransfer
     *            quickRampTransfer} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setStationAutoCheckProductCodes
     *            stationAutoCheckProductCodes} - (C)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StationAutoCheckProductCodeDto
     *            StationAutoCheckProductCodeDto} - (C)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationAutoCheckProductCodeDto#setOId
     *            oId} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationAutoCheckProductCodeDto#setProductCode
     *            productCode}- (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationAutoCheckProductCodeDto#setStationOId
     *            stationOId} - (O)</code>
     *            </ul>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setStationCashIndicator
     *            stationCashIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setStationCode
     *            stationCode}- (M) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setStationControlParameter
     *            stationControlParameter} - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto
     *            StationControlParameterDto} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setAutomaticCheckInAllEnterFlightFinalIndicator
     *            automaticCheckInAllEnterFlightFinalIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setAutomaticCheckInByFlightArrival
     *            automaticCheckInByFlightArrival} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setAutomaticCheckInByFlightArrivalMinutes
     *            automaticCheckInByFlightArrivalMinutes} - (O)</code> <li> <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setAutomaticConfirmDiscrepancyCode
     *            automaticConfirmDiscrepancyCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setAutomaticEnterFlightFinalInternationalCode
     *            automaticEnterFlightFinalInternationalCode}- (M)</code> <li> <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setAutomaticEnterFlightFinalPrinter
     *            automaticEnterFlightFinalPrinter} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setAutomaticFlightFinalDomesticCode
     *            automaticFlightFinalDomesticCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setAutomaticULDInactivationIndicator
     *            automaticULDInactivationIndicator} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setAutomaticUSCustomsFlightDepMessageCode
     *            automaticUSCustomsFlightDepMessageCode} - (M)</code> <li> <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setAwbClearsImportCode
     *            awbClearsImportCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setAwbImportCustomsEnforcementsIndicator
     *            awbImportCustomsEnforcementsIndicator}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setCcdFSUMessageControlCode
     *            ccdFSUMessageControlCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setCustomsArea
     *            customsArea} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setCustomsAutomatedPortSelectionCode
     *            customsAutomatedPortSelectionCode} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setDelayFSUDEPUntilWheelsUpIndicator
     *            delayFSUDEPUntilWheelsUpIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setDelayToAccountingExportDays
     *            delayToAccountingExportDays} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setDelayToAccountingImportDays
     *            delayToAccountingImportDays}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setDepFSUMessageControlCode
     *            depFSUMessageControlCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setDiscrepancyControlStation
     *            discrepancyControlStation} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setDisFSUMessageControlCode
     *            disFSUMessageControlCode} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setDlvFSUMessageControlCode
     *            dlvFSUMessageControlCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setDomesticOnlyIndicator
     *            domesticOnlyIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setEnterFlightManifestAssignmentStatusCode
     *            enterFlightManifestAssignmentStatusCode}- (O)</code> <li> <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setExportDefaultLocations
     *            exportDefaultLocations} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setExportMechanizedIndicator
     *            exportMechanizedIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setFlightSummaryFutureHours
     *            flightSummaryFutureHours} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setHouseAwbAssociationEnforcementCode
     *            houseAwbAssociationEnforcementCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setHouseAwbAutomaticAssociationCode
     *            houseAwbAutomaticAssociationCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setIncomingRCSCreatesGoodsIndicator
     *            incomingRCSCreatesGoodsIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setIncomingRCSRCFProcessGoodsIndicator
     *            incomingRCSRCFProcessGoodsIndicator} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setManFSUMessageControlCode
     *            manFSUMessageControlCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setNoticeOfArrivalAutomaticGenerationCode
     *            noticeOfArrivalAutomaticGenerationCode} - (O)</code> <li> <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setNoticeOfArrivalAutomaticPrintIndicator
     *            noticeOfArrivalAutomaticPrintIndicator}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setNoticeOfArrivalIndicator
     *            noticeOfArrivalIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setNoticeOfArrivalNumberOfCopies
     *            noticeOfArrivalNumberOfCopies} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setPrintChargeCorrectiveAdviceIndicator
     *            printChargeCorrectiveAdviceIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setPrintDeliverySlipIndicator
     *            printDeliverySlipIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setPrintPFBcreditMessageIndicator
     *            printPFBcreditMessageIndicator} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setPrintPrintFreightBillIndicator
     *            printPrintFreightBillIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setRateQueueOffice
     *            rateQueueOffice} - (C)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setRateQueueStation
     *            rateQueueStation}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setRcfFSUMessageControlCode
     *            rcfFSUMessageControlCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setRcsFSUMessageControlCode
     *            rcsFSUMessageControlCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setRctFSUMessageControlCode
     *            rctFSUMessageControlCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setRecordAwbDocumentsDeliveredIndicator
     *            recordAwbDocumentsDeliveredIndicator} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setStationOtherChargeQueues
     *            stationOtherChargeQueues} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setStationRestrictionsControlStation
     *            stationRestrictionsControlStation} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setTaxesApplyIndicator
     *            taxesApplyIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setTconPrefixCode
     *            tconPrefixCode} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setTfdFSUMessageControlCode
     *            tfdFSUMessageControlCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setTimeAfterFlightDepDomestic
     *            timeAfterFlightDepDomestic} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setTimeAfterFlightDepDomesticCode
     *            timeAfterFlightDepDomesticCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setTimeAfterFlightDepInternational
     *            timeAfterFlightDepInternational} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setTimeAfterFlightDepInternationalCode
     *            timeAfterFlightDepInternationalCode} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setTimeAfterFlightDepUS
     *            timeAfterFlightDepUS} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setTimeAfterFlightDepUSCode
     *            timeAfterFlightDepUSCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationControlParameterDto#setTrmFSUMessageControlCode
     *            trmFSUMessageControlCode}- (O)</code>
     *            </ul>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setStationHandledCarriers
     *            stationHandledCarriers} - (O)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StationHandledCarrierDto
     *            StationHandledCarrierDto} - (O)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationHandledCarrierDto#setCarrierCode
     *            carrierCode} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationHandledCarrierDto#setOId
     *            oId} - (M) </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationHandledCarrierDto#setStationOId
     *            stationOId} - (O)</code>
     *            </ul>
     *            </ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setStationName
     *            stationName} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setStationNonQueueReasonCodes
     *            stationNonQueueReasonCodes} - (O)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StationNonQueueReasonCodeDto
     *            StationNonQueueReasonCodeDto} -(O)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationNonQueueReasonCodeDto#setOId
     *            oId} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationNonQueueReasonCodeDto#setReasonCodeNotQueued
     *            reasonCodeNotQueued}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationNonQueueReasonCodeDto#setStationOId
     *            stationOId} - (O)</code>
     *            </ul>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationDto#setStationServiceDetail
     *            stationServiceDetail} - (O)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto
     *            StationServiceDetailDto} - (0)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setCheckInAllDefaultLocations
     *            checkInAllDefaultLocations}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setCustomsHours
     *            customsHours} - (O)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto
     *            OfficeHourDto} - (O)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setHolidayCloseHour
     *            holidayCloseHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setHolidayOpenHour
     *            holidayOpenHour} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSaturdayCloseHour
     *            saturdayCloseHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSaturdayOpenHour
     *            saturdayOpenHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSundayCloseHour
     *            sundayCloseHour}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSundayOpenHour
     *            sundayOpenHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setWeekdayCloseHour
     *            weekdayCloseHour}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setWeekdayOpenHour
     *            weekdayOpenHour} - (O)</code>
     *            </ul>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setCustomsPortNumber
     *            customsPortNumber} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setDeliveryAccountExpressCargo
     *            deliveryAccountExpressCargo} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setDeliveryAccountNormalCargo
     *            deliveryAccountNormalCargo} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setDeliveryHours
     *            deliveryHours}- (O)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto
     *            OfficeHourDto} - (O)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setHolidayCloseHour
     *            holidayCloseHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setHolidayOpenHour
     *            holidayOpenHour} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSaturdayCloseHour
     *            saturdayCloseHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSaturdayOpenHour
     *            saturdayOpenHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSundayCloseHour
     *            sundayCloseHour}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSundayOpenHour
     *            sundayOpenHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setWeekdayCloseHour
     *            weekdayCloseHour}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setWeekdayOpenHour
     *            weekdayOpenHour} - (O)</code>
     *            </ul>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setDrivingTimeToAirport
     *            drivingTimeToAirport} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setDropOffTimeDocuments
     *            dropOffTimeDocuments} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setDropOffTimeExpress
     *            dropOffTimeExpress} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setDropOffTimeFrame
     *            dropOffTimeFrame} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setDropOffTimeNormal
     *            dropOffTimeNormal} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setExpressDeliveryPickUpHours
     *            expressDeliveryPickUpHours}- (O)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto
     *            OfficeHourDto} - (O)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setHolidayCloseHour
     *            holidayCloseHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setHolidayOpenHour
     *            holidayOpenHour} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSaturdayCloseHour
     *            saturdayCloseHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSaturdayOpenHour
     *            saturdayOpenHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSundayCloseHour
     *            sundayCloseHour}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSundayOpenHour
     *            sundayOpenHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setWeekdayCloseHour
     *            weekdayCloseHour}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setWeekdayOpenHour
     *            weekdayOpenHour} - (O)</code>
     *            </ul>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setExpressPickUpHours
     *            expressPickUpHours} - (O)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto
     *            OfficeHourDto} - (O)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setHolidayCloseHour
     *            holidayCloseHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setHolidayOpenHour
     *            holidayOpenHour} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSaturdayCloseHour
     *            saturdayCloseHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSaturdayOpenHour
     *            saturdayOpenHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSundayCloseHour
     *            sundayCloseHour}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSundayOpenHour
     *            sundayOpenHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setWeekdayCloseHour
     *            weekdayCloseHour}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setWeekdayOpenHour
     *            weekdayOpenHour} - (O)</code>
     *            </ul>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setFranchiseStationIndicator
     *            franchiseStationIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setImportDefaultLocations
     *            importDefaultLocations} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setImportMechanizedIndicator
     *            importMechanizedIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setImportQualityAssuranceIndicator
     *            importQualityAssuranceIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setOfficeOtherChargeQueues
     *            officeOtherChargeQueues}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setOpenHours
     *            openHours} - (O)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto
     *            OfficeHourDto} - (O)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setHolidayCloseHour
     *            holidayCloseHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setHolidayOpenHour
     *            holidayOpenHour} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSaturdayCloseHour
     *            saturdayCloseHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSaturdayOpenHour
     *            saturdayOpenHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSundayCloseHour
     *            sundayCloseHour}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSundayOpenHour
     *            sundayOpenHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setWeekdayCloseHour
     *            weekdayCloseHour}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setWeekdayOpenHour
     *            weekdayOpenHour} - (O)</code>
     *            </ul>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setPickUpAccountExpressCargo
     *            pickUpAccountExpressCargo} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setPickUpAccountNormalCargo
     *            pickUpAccountNormalCargo} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setPickUpHours
     *            pickUpHours} - (O)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto
     *            OfficeHourDto} - (O)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setHolidayCloseHour
     *            holidayCloseHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setHolidayOpenHour
     *            holidayOpenHour} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSaturdayCloseHour
     *            saturdayCloseHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSaturdayOpenHour
     *            saturdayOpenHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSundayCloseHour
     *            sundayCloseHour}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSundayOpenHour
     *            sundayOpenHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setWeekdayCloseHour
     *            weekdayCloseHour}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setWeekdayOpenHour
     *            weekdayOpenHour} - (O)</code>
     *            </ul>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setProductCodeExceptionsExistIndicator
     *            productCodeExceptionsExistIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setRecoveryTimeDocuments
     *            recoveryTimeDocuments} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setRecoveryTimeExpress
     *            recoveryTimeExpress} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setRecoveryTimeFrame
     *            recoveryTimeFrame} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setRecoveryTimeNormal
     *            recoveryTimeNormal} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setStationRemarks
     *            stationRemarks} - (O)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StationRemarksDto
     *            StationRemarksDto}</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StationRemarksDto#setOId
     *            oId - (C)}</code><br>
     *            Mandatory if remarks entered<br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StationRemarksDto#setRemark
     *            remark - (C)}</code><br>
     *            Mandatory if remarksType entered<br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StationRemarksDto#setRemarksType
     *            remarksType - (C)}</code><br>
     *            Mandatory if remarks entered<br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.StationRemarksDto#setStationOId
     *            stationOId - (O)}</code>
     *            </ul>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.StationServiceDetailDto#setWareHouseHours
     *            wareHouseHours} - (O)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto
     *            OfficeHourDto} - (O)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setHolidayCloseHour
     *            holidayCloseHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setHolidayOpenHour
     *            holidayOpenHour} -(O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSaturdayCloseHour
     *            saturdayCloseHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSaturdayOpenHour
     *            saturdayOpenHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSundayCloseHour
     *            sundayCloseHour}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setSundayOpenHour
     *            sundayOpenHour} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setWeekdayCloseHour
     *            weekdayCloseHour}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.OfficeHourDto#setWeekdayOpenHour
     *            weekdayOpenHour} - (O)</code>
     *            </ul>
     *            </ul>
     *            </ul>
     *            </ul>
     *            <ul>
     *            </ul>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.StationResponse
     *         StationResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.StationResponse#setStation
     *         station} </ul> </code>
     *         <p>
     * @throws LMSException
     *             If the station update operation fails the above mentioned error codes are returned. Each
     *             CodeMessage contains the status code, human readable message and message type.
     */
    StationResponse updateStation(StationPersistRequest pStationPersistRequest)
                throws LMSException;

    /**
     * Validates if the list of stations exist in the system.
     * <p>
     * If the station exists in the system, this method retrieves the station code and the object ID for the
     * list of stations input.
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pValidationRequest
     *            <code> {@link com.unisys.trans.logistics.lms.framework.dto.ValidationRequest
     *            ValidationRequest}</code> the request object which contains
     *            the list of search input values.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.ValidationRequest#setSearchInputs
     *            searchInputs} - (M) (1:*)</code> holds a list of station codes.
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse
     *         ValidationResponse}</code><br>
     *         <ul>
     *         <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse#getValidInputs()
     *         ValidInputs} <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse#getSearchInputs()
     *         SearchInputs} <br>
     *         </ul>
     *         <p>
     */
    ValidationResponse validateStation(
                final ValidationRequest pValidationRequest);
    
    /**
     * This method returns the station's local date and time for the specified
     * UTC date.
     * <p>
     * 
     * @param pStationLocalTimeFindRequest
     *            holds the station local time find request.
     *            <p>
     * @return the response which holds the local date and time for the station.
     *         <p>
     * @throws LMSException
     *             If the city associated with the station does not exist in the
     *             system.
     */
    StationLocalTimeFindResponse findStationUTCTime(
                final StationLocalTimeFindRequest pStationLocalTimeFindRequest)
                throws LMSException;
    @POST
    @Path("/stations")
    @Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    SuggestiveSearchResponse findAllStationsBySuggestiveSearch(StationFindRequest aStationFindRequest) throws LMSException;

    
    List<String> findStationCode(String pPrefix)throws LMSException;
    //UIS110 Start
    public void processSyncMessage(StationControlMessageRequest pControllerMessageRequest)throws LMSException;
  //UIS110 End

    List<String> findStationsByGeoType(
            final GeographicDataDto pGeographicDataDto,
            final AggregateDto pAggregateDto) throws LMSException;
    
    StationLocalTimeFindResponse findStationLocalTimeForRestrictions(
			final StationLocalTimeFindRequest pStationLocalTimeFindRequest)throws LMSException;

    
    public WeightUOMType findStationDefaultWeightUnit(final StationFindRequest pStationFindRequest)throws LMSException;//UIS158-LMS-11123 code changes
}
