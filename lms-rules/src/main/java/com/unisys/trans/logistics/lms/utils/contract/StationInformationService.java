/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.StationInfoPersistRequest;
import com.unisys.trans.logistics.lms.utils.dto.StationInformationDeleteRequest;
import com.unisys.trans.logistics.lms.utils.dto.StationInformationFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.StationInformationResponse;

/**
 * <code>Station information service</code> provides the functional methods to
 * maintain station information.
 * <p>
 * The station information maintains<br>
 * <ul>
 * <li>General details like address, teletype addresses and geographical
 * location data.
 * <li>Service hours details like station hours,open/closed month
 * holidays,station holiday hours,supplemental hours,supplemental holiday
 * hours,agency hours and agency holiday hours.
 * <li>Service details like facility attributes, special instructions and
 * default location data.
 * <li>Service times like domestic cut-off times,domestic cut-off times
 * prescreened,international cut-off times,international cut-off times
 * prescreened, and transfer station details.
 * <li>Handling details.
 * </ul>
 * <p>
 * It offers the following services for maintaining station information:<br>
 * <ul>
 * <li>createStationInformation - Creates station information.
 * <li>deleteStationInformation - Deletes station information.
 * <li>findAllStations - Finds all the stations that exist in the system.
 * <li>retrieveStationInformation - Retrieves the station information for the
 * given input.
 * <li>retrieveStationInformationForDump - Retrieves the station information for
 * dump.
 * <li>updateStationInformation - Updates station information.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.utils.dto.StationInfoPersistRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.StationInformationFindRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.StationInformationDeleteRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.StationInformationResponse
 */
public interface StationInformationService {

	/**
	 * Creates a <code>station</code> after validating all the input data.
	 * <p>
	 * <b>Related methods include:</b>
	 * <li>
	 * {@link com.unisys.trans.logistics.lms.utils.contract.StationInformationService#updateStationInformation
	 * updateStationInformation }
	 * <p>
	 * <b>Run Time Parameters:</b><br>
	 * 
	 * <pre>
	 * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ACS_STATION_INFO_URL}
	 * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#STATION_GENERAL_MAP_URL}
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
	 *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#COUNTRY_DOES_NOT_EXIST}</td>
	 *            <td>The country does not exist in the system.</td>
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
	 *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_DOES_NOT_EXIST}</td>
	 *            <td>The station does not exist in the system.</td>
	 *            </tr>
	 *            </code>
	 * </table>
	 * <p>
	 * 
	 * @param pStationInfoPersistRequest
	 *            <code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoPersistRequest
	 *            StationInfoPersistRequest} </code><br>
	 *            holds the request object that includes attributes to create a
	 *            station information.<br>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDto
	 *            stationInfoDto} - (M) </code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDto#setDrivingDirections
	 *            drivingDirections} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDto#setFirmsCode
	 *            firmsCode} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDto#setPhone
	 *            phone} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDto#setAddress
	 *            address} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDto#setShipmentsInspected
	 *            shipmentsInspected} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDto#setStationLocationDtos
	 *            stationLocationDtos} - (O) </code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationLocationDto
	 *            stationLocationDto} - (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationLocationDto#setLocationType
	 *            locationType} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationLocationDto#setMailingAddressDto
	 *            mailingAddressDto} -(O)</code></li>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setAddress
	 *            address} - (O) </code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setCountry
	 *            country} - (O) </code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setCity
	 *            city} - (O) </code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setEmail
	 *            email} - (O) </code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setFax
	 *            fax} - (O) </code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setName
	 *            name} - (O) </code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setPhone
	 *            phone} - (O) </code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setPostalCode
	 *            postalCode} - (O) </code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setState
	 *            state} - (O) </code>
	 *            </ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationLocationDto#setMailingSameAsPhysical
	 *            mailingSameAsPhysical} - (O)</code> </li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationLocationDto#setOId
	 *            oId} - (M)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationLocationDto#setPhysicalAddressDto
	 *            physicalAddressDto}- (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setAddress
	 *            address} - (O) </code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setCountry
	 *            country} - (O) </code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setCity
	 *            city} - (O) </code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setEmail
	 *            email} - (O) </code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setFax
	 *            fax} - (O) </code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setName
	 *            name} - (O) </code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setPhone
	 *            phone} - (O) </code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setPostalCode
	 *            postalCode} - (O) </code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setState
	 *            state} - (O) </code>
	 *            </ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationLocationDto#setStationControlIndicator
	 *            stationControlIndicator}- (M)</code>
	 *            </ul>
	 *            </ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDto#setStationFacilityContactDtos
	 *            stationFacilityContactDtos} - (O) </code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFacilityContactDto
	 *            StationFacilityContactDto} - (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFacilityContactDto#setCargoTTY
	 *            cargoTTY} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFacilityContactDto#setCustomsInfo
	 *            customsInfo} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFacilityContactDto#setInnerCityFax
	 *            innerCityFax} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFacilityContactDto#setInnerCityPhone
	 *            innerCityPhone} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFacilityContactDto#setLabel
	 *            label} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFacilityContactDto#setLabelOId
	 *            labelOId} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFacilityContactDto#setLabelOrder
	 *            labelOrder} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFacilityContactDto#setOId
	 *            oId} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFacilityContactDto#setOutsideFax
	 *            outsideFax} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFacilityContactDto#setOutsidePhone
	 *            outsidePhone} - (O)</code>
	 *            </ul>
	 *            </ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDto#setOperationalContactDtos
	 *            operationalContactDtos} - (O) </code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationContactDto
	 *            StationContactDto} - (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationContactDto#setCellNumber
	 *            cellNumber} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationContactDto#setContactType
	 *            contactType} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationContactDto#setEmailAddress
	 *            emailAddress} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationContactDto#setFaxNumber
	 *            faxNumber} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationContactDto#setLocation
	 *            location} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationContactDto#setName
	 *            name} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationContactDto#setOfficeNumber
	 *            officeNumber} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationContactDto#setOId
	 *            oId} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationContactDto#setScheduledDaysOff
	 *            scheduledDaysOff} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationContactDto#setScheduledHours
	 *            scheduledHours} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationContactDto#setTitle
	 *            title} - (O)</code>
	 *            </ul>
	 *            </ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDto#setSalesContactDtos
	 *            salesContactDtos} - (O) </code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationContactDto
	 *            StationContactDto} - (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationContactDto#setCellNumber
	 *            cellNumber} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationContactDto#setEmailAddress
	 *            emailAddress} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationContactDto#setName
	 *            name} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationContactDto#setOId
	 *            oId} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationContactDto#setTitle
	 *            title} - (O)</code>
	 *            </ul>
	 *            </ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDto#setOId
	 *            oId} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDto#setAgencyHoursDtos
	 *            agencyHoursDtos} - (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SupplementalAgencyHoursDto
	 *            SupplementalAgencyHoursDto} - (0)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SupplementalAgencyHoursDto#setDay
	 *            day}- (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SupplementalAgencyHoursDto#setOId
	 *            oId} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SupplementalAgencyHoursDto#setStationInfoDayHoursDtos
	 *            stationInfoDayHoursDtos} - (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto
	 *            StationInfoDayHoursDto} - (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto#setLabel
	 *            label} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto#setLabelOId
	 *            labelOId} -(O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto#setLabelOrder
	 *            labelOrder} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto#setOId
	 *            oId} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto#setValue
	 *            value}- (O)</code>
	 *            </ul>
	 *            </ul>
	 *            </ul>
	 *            </ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDto#setAgencyHolidayHoursDtos
	 *            agencyHolidayHoursDtos} - (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SupplementalAgencyHoursDto
	 *            SupplementalAgencyHoursDto} - (0)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SupplementalAgencyHoursDto#setDate
	 *            day}- (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SupplementalAgencyHoursDto#setOId
	 *            oId} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SupplementalAgencyHoursDto#setSpecialIndicator
	 *            sepecialIndicator} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SupplementalAgencyHoursDto#setStationInfoDayHoursDtos
	 *            stationInfoDayHoursDtos} - (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto
	 *            StationInfoDayHoursDto} - (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto#setLabel
	 *            label} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto#setLabelOId
	 *            labelOId} -(O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto#setLabelOrder
	 *            labelOrder} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto#setOId
	 *            oId} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto#setValue
	 *            value}- (O)</code>
	 *            </ul>
	 *            </ul>
	 *            </ul>
	 *            </ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDto#setSupplementalStationHourDtos
	 *            supplementalStationHourDtos} - (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SupplementalAgencyHoursDto
	 *            SupplementalAgencyHoursDto} - (0)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SupplementalAgencyHoursDto#setDay
	 *            day}- (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SupplementalAgencyHoursDto#setOId
	 *            oId} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SupplementalAgencyHoursDto#setStationInfoDayHoursDtos
	 *            stationInfoDayHoursDtos} - (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto
	 *            StationInfoDayHoursDto} - (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto#setLabel
	 *            label} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto#setLabelOId
	 *            labelOId} -(O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto#setLabelOrder
	 *            labelOrder} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto#setOId
	 *            oId} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto#setValue
	 *            value}- (O)</code>
	 *            </ul>
	 *            </ul>
	 *            </ul>
	 *            </ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDto#setSupplementalStationHolidayDtos
	 *            supplementalStationHolidayDtos} - (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SupplementalAgencyHoursDto
	 *            SupplementalAgencyHoursDto} - (0)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SupplementalAgencyHoursDto#setDate
	 *            day}- (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SupplementalAgencyHoursDto#setOId
	 *            oId} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SupplementalAgencyHoursDto#setSpecialIndicator
	 *            sepecialIndicator} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SupplementalAgencyHoursDto#setStationInfoDayHoursDtos
	 *            stationInfoDayHoursDtos} - (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto
	 *            StationInfoDayHoursDto} - (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto#setLabel
	 *            label} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto#setLabelOId
	 *            labelOId} -(O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto#setLabelOrder
	 *            labelOrder} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto#setOId
	 *            oId} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto#setValue
	 *            value}- (O)</code>
	 *            </ul>
	 *            </ul>
	 *            </ul>
	 *            </ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDto#setStationFacilityAttributeDtos
	 *            stationFacilityAttributeDtos} - (O) </code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFacilityAttributeDto
	 *            StationFacilityAttributeDto} - (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFacilityAttributeDto#setAdditionalInformation
	 *            additionalInformation} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFacilityAttributeDto#setApplicableIndicator
	 *            applicableIndicator} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFacilityAttributeDto#setLabel
	 *            label} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFacilityAttributeDto#setLabelId
	 *            labelId} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFacilityAttributeDto#setLocation
	 *            location} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFacilityAttributeDto#setOId
	 *            oId} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFacilityAttributeDto#setLabelOrder
	 *            labelOrder} - (O)</code>
	 *            </ul>
	 *            </ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDto#setOtherSpecialInstructionDtos
	 *            otherSpecialInstructionDtos} - (O) </code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto
	 *            SpecialInstructionDto} - (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setAircraftRegistration
	 *            aircraftRegistration} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setAircraftType
	 *            aircraftType} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setAwbType
	 *            awbType} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setCarrier
	 *            carrier} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setDays
	 *            days} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setDestination
	 *            destination} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setEndDate
	 *            endDate} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setFriday
	 *            friday} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setImportRemarks
	 *            importRemarks} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setMonday
	 *            monday} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setOId
	 *            oId} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setProductCodes
	 *            productCodes} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setProductCodesAsString
	 *            productCodesAsString} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setRegistrationType
	 *            registrationType} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setSaturday
	 *            saturday} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setSpecialInstructions
	 *            specialInstructions} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setStartDate
	 *            startDate} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setStationRestrictionType
	 *            stationRestrictionType} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setSunday
	 *            sunday} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setThursday
	 *            thursday} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setTuesday
	 *            tuesday} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setWednesday
	 *            wednesday} - (O)</code>
	 *            </ul>
	 *            </ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDto#setStationHandlingDetailDtos
	 *            stationHandlingDetailDtos} - (O) </code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationHandlingDetailDto
	 *            StationHandlingDetailDto} - (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationHandlingDetailDto#setComments
	 *            comments} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationHandlingDetailDto#setExportInd
	 *            exportInd} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationHandlingDetailDto#setImportInd
	 *            importInd} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationHandlingDetailDto#setOrderAsChars
	 *            orderAsChars} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationHandlingDetailDto#setOId
	 *            oId} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationHandlingDetailDto#setStationInfoSectionLabelDto
	 *            stationInfoSectionLabelDto} - (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoSectionLabelDto#setLabel
	 *            label} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoSectionLabelDto#setOId
	 *            oId} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoSectionLabelDto#setOrder
	 *            order} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoSectionLabelDto#setSectionName
	 *            sectionName} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoSectionLabelDto#setStationInfoSectionLabelDtos
	 *            stationInfoSectionLabelDtos} - (O)</code>
	 *            </ul>
	 *            </ul>
	 *            </ul>
	 *            </ul>
	 *            <p>
	 * @return <code>
	 *         {@link com.unisys.trans.logistics.lms.utils.dto.StationInformationResponse
	 *         StationInformationResponse} <ul> <li>
	 *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
	 *         Response fields} <li>
	 *         {@link com.unisys.trans.logistics.lms.utils.dto.StationResponse#getStation
	 *         station} </ul> </code>
	 *         <p>
	 * @throws LMSException
	 *             If the station create operation fails the above mentioned
	 *             error codes are returned. Each CodeMessage contains the
	 *             status code,human readable message and message type.
	 */
	StationInformationResponse createStationInformation(
			final StationInfoPersistRequest pStationInfoPersistRequest)
			throws LMSException;

	/**
	 * Deletes the Station.
	 * <p>
	 * In order to delete a Station, the given station code must exist in the
	 * system.
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
	 * <b>Errors:</b> <br>
	 * <b>The following Error Codes may be returned :</b>
	 * <table border="0" cellspacing="0" * cellpadding="5">
	 * <tr>
	 * <td>
	 * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_DOES_NOT_EXIST}</code>
	 * </td><br>
	 * <td>The station does not exist in the system.</td>
	 * </tr>
	 * </table>
	 * <p>
	 * 
	 * @param pStationInformationDeleteRequest
	 *            <code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInformationDeleteRequest
	 *            StationInformationDeleteRequest}</code><br>
	 *            includes the attributes to delete a Station.
	 *            <ul>
	 *            <code> <li>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInformationDeleteRequest#setOId
	 *            oId} - (M) <li>
	 *            </ul>
	 *            <p>
	 * @return <code>
	 *         {@link com.unisys.trans.logistics.lms.utils.dto.StationInformationResponse
	 *         StationInformationResponse}</code>
	 *         <ul>
	 *         <li><code>
	 *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
	 *         Response fields}</code><br>
	 *         holds the CodeMessage <code>
	 *         {@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_INFO_DELETED_SUCCESSFULLY}
	 *         </code> for successful delete.
	 *         </ul>
	 *         <p>
	 * @throws LMSException
	 *             If the station delete operation fails, the above mentioned
	 *             error codes are returned. Each CodeMessage contains the
	 *             status code, human readable message, and message type.
	 */
	StationInformationResponse deleteStationInformation(
			final StationInformationDeleteRequest pStationInformationDeleteRequest)
			throws LMSException;

	/**
	 * Retrieves all the stations that exist in the system.
	 * <p>
	 * This method retrieves the station code and the station name for the
	 * station codes that match the search text.
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
	 * @param pStationInformationFindRequest
	 *            <code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInformationFindRequest
	 *            StationFindRequest}</code><br>
	 *            holds the search input values.
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInformationFindRequest#setStationCode
	 *            stationCode} - (O)</code><br>
	 *            holds the station code to find the station.
	 *            </ul>
	 *            <p>
	 * @return <code>
	 *         {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse
	 *         MultipleFindResponse}</code><br>
	 *         list of station data transfer object.
	 *         <ul>
	 *         <li><code>
	 *         {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse#getRetrievedObjects
	 *         retrievedObjects} - (0:*)</code><br>
	 *         holds a map of station details with station code as key and
	 *         <code>StationInfoDto</code> as value.
	 *         <ul>
	 *         <li><code>
	 *         {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDto
	 *         StationInfoDto}</code>
	 *         <ul>
	 *         <li><code>
	 *         {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDto#getStationCode
	 *         stationCode}</code> <li><code>
	 *         {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDto#getStationName
	 *         stationName}</code>
	 *         </ul>
	 *         </ul>
	 *         </ul>
	 *         <p>
	 */
	MultipleFindResponse findAllStations(
			final StationInformationFindRequest pStationInformationFindRequest)
			throws LMSException;

	/**
	 * Finds the station information details.
	 * <p>
	 * This method retrieves the station details for the station code input.
	 * <p>
	 * <b>Run Time Parameters:</b><br>
	 * 
	 * <pre>
	 * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ACS_STATION_INFO_URL}
	 * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#STATION_GENERAL_MAP_URL}
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
	 *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_DOES_NOT_EXIST}</td>
	 *            <td>The carrier code does not exist in the system.</td>
	 *            </tr>
	 *            <tr>
	 *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_DOES_NOT_EXIST_IN_LMS_SYSTEM}</td>
	 *            <td>The carrier code does not exist in the LMS system.</td>
	 *            </tr>
	 *            </code>
	 * </table>
	 * <p>
	 * 
	 * @param pStationInformationFindRequest
	 *            <code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInformationFindRequest
	 *            StationInformationFindRequest}</code><br>
	 *            holds the request object that includes the attributes to find
	 *            a station.<br>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInformationFindRequest
	 *            StationInformationFindRequest} - (M)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInformationFindRequest#setStationCode
	 *            stationCode} - (M)</code> <li><code>
	 *            </ul>
	 *            <p>
	 * @return <code>
	 *         {@link com.unisys.trans.logistics.lms.utils.dto.StationInformationResponse
	 *         StationInformationResponse} <ul> <li>
	 *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
	 *         Response fields} <li>
	 *         {@link com.unisys.trans.logistics.lms.utils.dto.StationInformationResponse#setStation
	 *         station}
	 *         </ul>
	 *         </code>
	 *         <p>
	 * @throws LMSException
	 *             If the station find operation fails the above mentioned error
	 *             codes are returned. Each CodeMessage contains the status
	 *             code,human readable message and message type.
	 */
	StationInformationResponse retrieveStationInformation(
			final StationInformationFindRequest pStationInformationFindRequest)
			throws LMSException;

	// Retrieves station Information for dump
	StationInformationResponse retrieveStationInformationForDump(
			final StationInformationFindRequest pStationInformationFindRequest)
			throws LMSException;

	/**
	 * Updates a <code>station</code> after validating all the input data.
	 * <p>
	 * <b>Related methods include:</b>
	 * <li>
	 * {@link com.unisys.trans.logistics.lms.utils.contract.StationInformationService#createStationInformation
	 * createStationInformation }
	 * <p>
	 * <b>Run Time Parameters:</b><br>
	 * 
	 * <pre>
	 * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ACS_STATION_INFO_URL}
	 * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#STATION_GENERAL_MAP_URL}
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
	 *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#COUNTRY_DOES_NOT_EXIST}</td>
	 *            <td>The country does not exist in the system.</td>
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
	 *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_DOES_NOT_EXIST}</td>
	 *            <td>The station does not exist in the system.</td>
	 *            </tr>
	 *            </code>
	 * </table>
	 * <p>
	 * 
	 * @param pStationInfoPersistRequest
	 *            <code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoPersistRequest
	 *            StationInfoPersistRequest} </code><br>
	 *            holds the request object that includes attributes to create a
	 *            station information.<br>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDto
	 *            stationInfoDto} - (M) </code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDto#setDrivingDirections
	 *            drivingDirections} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDto#setFirmsCode
	 *            firmsCode} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDto#setPhone
	 *            phone} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDto#setAddress
	 *            address} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDto#setShipmentsInspected
	 *            shipmentsInspected} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDto#setStationLocationDtos
	 *            stationLocationDtos} - (O) </code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationLocationDto
	 *            stationLocationDto} - (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationLocationDto#setLocationType
	 *            locationType} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationLocationDto#setMailingAddressDto
	 *            mailingAddressDto} -(O)</code></li>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setAddress
	 *            address} - (O) </code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setCountry
	 *            country} - (O) </code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setCity
	 *            city} - (O) </code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setEmail
	 *            email} - (O) </code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setFax
	 *            fax} - (O) </code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setName
	 *            name} - (O) </code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setPhone
	 *            phone} - (O) </code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setPostalCode
	 *            postalCode} - (O) </code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setState
	 *            state} - (O) </code>
	 *            </ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationLocationDto#setMailingSameAsPhysical
	 *            mailingSameAsPhysical} - (O)</code> </li> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationLocationDto#setOId
	 *            oId} - (M)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationLocationDto#setPhysicalAddressDto
	 *            physicalAddressDto}- (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setAddress
	 *            address} - (O) </code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setCountry
	 *            country} - (O) </code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setCity
	 *            city} - (O) </code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setEmail
	 *            email} - (O) </code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setFax
	 *            fax} - (O) </code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setName
	 *            name} - (O) </code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setPhone
	 *            phone} - (O) </code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setPostalCode
	 *            postalCode} - (O) </code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.ContactDto#setState
	 *            state} - (O) </code>
	 *            </ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationLocationDto#setStationControlIndicator
	 *            stationControlIndicator}- (M)</code>
	 *            </ul>
	 *            </ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDto#setStationFacilityContactDtos
	 *            stationFacilityContactDtos} - (O) </code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFacilityContactDto
	 *            StationFacilityContactDto} - (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFacilityContactDto#setCargoTTY
	 *            cargoTTY} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFacilityContactDto#setCustomsInfo
	 *            customsInfo} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFacilityContactDto#setInnerCityFax
	 *            innerCityFax} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFacilityContactDto#setInnerCityPhone
	 *            innerCityPhone} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFacilityContactDto#setLabel
	 *            label} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFacilityContactDto#setLabelOId
	 *            labelOId} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFacilityContactDto#setLabelOrder
	 *            labelOrder} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFacilityContactDto#setOId
	 *            oId} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFacilityContactDto#setOutsideFax
	 *            outsideFax} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFacilityContactDto#setOutsidePhone
	 *            outsidePhone} - (O)</code>
	 *            </ul>
	 *            </ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDto#setOperationalContactDtos
	 *            operationalContactDtos} - (O) </code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationContactDto
	 *            StationContactDto} - (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationContactDto#setCellNumber
	 *            cellNumber} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationContactDto#setContactType
	 *            contactType} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationContactDto#setEmailAddress
	 *            emailAddress} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationContactDto#setFaxNumber
	 *            faxNumber} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationContactDto#setLocation
	 *            location} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationContactDto#setName
	 *            name} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationContactDto#setOfficeNumber
	 *            officeNumber} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationContactDto#setOId
	 *            oId} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationContactDto#setScheduledDaysOff
	 *            scheduledDaysOff} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationContactDto#setScheduledHours
	 *            scheduledHours} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationContactDto#setTitle
	 *            title} - (O)</code>
	 *            </ul>
	 *            </ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDto#setSalesContactDtos
	 *            salesContactDtos} - (O) </code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationContactDto
	 *            StationContactDto} - (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationContactDto#setCellNumber
	 *            cellNumber} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationContactDto#setEmailAddress
	 *            emailAddress} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationContactDto#setName
	 *            name} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationContactDto#setOId
	 *            oId} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationContactDto#setTitle
	 *            title} - (O)</code>
	 *            </ul>
	 *            </ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDto#setOId
	 *            oId} - (M)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDto#setAgencyHoursDtos
	 *            agencyHoursDtos} - (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SupplementalAgencyHoursDto
	 *            SupplementalAgencyHoursDto} - (0)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SupplementalAgencyHoursDto#setDay
	 *            day}- (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SupplementalAgencyHoursDto#setOId
	 *            oId} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SupplementalAgencyHoursDto#setStationInfoDayHoursDtos
	 *            stationInfoDayHoursDtos} - (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto
	 *            StationInfoDayHoursDto} - (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto#setLabel
	 *            label} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto#setLabelOId
	 *            labelOId} -(O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto#setLabelOrder
	 *            labelOrder} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto#setOId
	 *            oId} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto#setValue
	 *            value}- (O)</code>
	 *            </ul>
	 *            </ul>
	 *            </ul>
	 *            </ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDto#setAgencyHolidayHoursDtos
	 *            agencyHolidayHoursDtos} - (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SupplementalAgencyHoursDto
	 *            SupplementalAgencyHoursDto} - (0)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SupplementalAgencyHoursDto#setDate
	 *            day}- (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SupplementalAgencyHoursDto#setOId
	 *            oId} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SupplementalAgencyHoursDto#setSpecialIndicator
	 *            sepecialIndicator} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SupplementalAgencyHoursDto#setStationInfoDayHoursDtos
	 *            stationInfoDayHoursDtos} - (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto
	 *            StationInfoDayHoursDto} - (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto#setLabel
	 *            label} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto#setLabelOId
	 *            labelOId} -(O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto#setLabelOrder
	 *            labelOrder} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto#setOId
	 *            oId} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto#setValue
	 *            value}- (O)</code>
	 *            </ul>
	 *            </ul>
	 *            </ul>
	 *            </ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDto#setSupplementalStationHourDtos
	 *            supplementalStationHourDtos} - (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SupplementalAgencyHoursDto
	 *            SupplementalAgencyHoursDto} - (0)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SupplementalAgencyHoursDto#setDay
	 *            day}- (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SupplementalAgencyHoursDto#setOId
	 *            oId} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SupplementalAgencyHoursDto#setStationInfoDayHoursDtos
	 *            stationInfoDayHoursDtos} - (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto
	 *            StationInfoDayHoursDto} - (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto#setLabel
	 *            label} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto#setLabelOId
	 *            labelOId} -(O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto#setLabelOrder
	 *            labelOrder} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto#setOId
	 *            oId} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto#setValue
	 *            value}- (O)</code>
	 *            </ul>
	 *            </ul>
	 *            </ul>
	 *            </ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDto#setSupplementalStationHolidayDtos
	 *            supplementalStationHolidayDtos} - (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SupplementalAgencyHoursDto
	 *            SupplementalAgencyHoursDto} - (0)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SupplementalAgencyHoursDto#setDate
	 *            day}- (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SupplementalAgencyHoursDto#setOId
	 *            oId} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SupplementalAgencyHoursDto#setSpecialIndicator
	 *            sepecialIndicator} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SupplementalAgencyHoursDto#setStationInfoDayHoursDtos
	 *            stationInfoDayHoursDtos} - (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto
	 *            StationInfoDayHoursDto} - (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto#setLabel
	 *            label} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto#setLabelOId
	 *            labelOId} -(O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto#setLabelOrder
	 *            labelOrder} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto#setOId
	 *            oId} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDayHoursDto#setValue
	 *            value}- (O)</code>
	 *            </ul>
	 *            </ul>
	 *            </ul>
	 *            </ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDto#setStationFacilityAttributeDtos
	 *            stationFacilityAttributeDtos} - (O) </code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFacilityAttributeDto
	 *            StationFacilityAttributeDto} - (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFacilityAttributeDto#setAdditionalInformation
	 *            additionalInformation} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFacilityAttributeDto#setApplicableIndicator
	 *            applicableIndicator} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFacilityAttributeDto#setLabel
	 *            label} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFacilityAttributeDto#setLabelId
	 *            labelId} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFacilityAttributeDto#setLocation
	 *            location} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFacilityAttributeDto#setOId
	 *            oId} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationFacilityAttributeDto#setLabelOrder
	 *            labelOrder} - (O)</code>
	 *            </ul>
	 *            </ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDto#setOtherSpecialInstructionDtos
	 *            otherSpecialInstructionDtos} - (O) </code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto
	 *            SpecialInstructionDto} - (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setAircraftRegistration
	 *            aircraftRegistration} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setAircraftType
	 *            aircraftType} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setAwbType
	 *            awbType} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setCarrier
	 *            carrier} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setDays
	 *            days} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setDestination
	 *            destination} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setEndDate
	 *            endDate} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setFriday
	 *            friday} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setImportRemarks
	 *            importRemarks} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setMonday
	 *            monday} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setOId
	 *            oId} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setProductCodes
	 *            productCodes} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setProductCodesAsString
	 *            productCodesAsString} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setRegistrationType
	 *            registrationType} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setSaturday
	 *            saturday} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setSpecialInstructions
	 *            specialInstructions} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setStartDate
	 *            startDate} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setStationRestrictionType
	 *            stationRestrictionType} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setSunday
	 *            sunday} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setThursday
	 *            thursday} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setTuesday
	 *            tuesday} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.SpecialInstructionDto#setWednesday
	 *            wednesday} - (O)</code>
	 *            </ul>
	 *            </ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoDto#setStationHandlingDetailDtos
	 *            stationHandlingDetailDtos} - (O) </code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationHandlingDetailDto
	 *            StationHandlingDetailDto} - (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationHandlingDetailDto#setComments
	 *            comments} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationHandlingDetailDto#setExportInd
	 *            exportInd} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationHandlingDetailDto#setImportInd
	 *            importInd} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationHandlingDetailDto#setOrderAsChars
	 *            orderAsChars} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationHandlingDetailDto#setOId
	 *            oId} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationHandlingDetailDto#setStationInfoSectionLabelDto
	 *            stationInfoSectionLabelDto} - (O)</code>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoSectionLabelDto#setLabel
	 *            label} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoSectionLabelDto#setOId
	 *            oId} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoSectionLabelDto#setOrder
	 *            order} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoSectionLabelDto#setSectionName
	 *            sectionName} - (O)</code> <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.StationInfoSectionLabelDto#setStationInfoSectionLabelDtos
	 *            stationInfoSectionLabelDtos} - (O)</code>
	 *            </ul>
	 *            </ul>
	 *            </ul>
	 *            </ul>
	 *            <p>
	 * @return <code>
	 *         {@link com.unisys.trans.logistics.lms.utils.dto.StationInformationResponse
	 *         StationInformationResponse} <ul> <li>
	 *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
	 *         Response fields} <li>
	 *         {@link com.unisys.trans.logistics.lms.utils.dto.StationResponse#getStation
	 *         station} </ul> </code>
	 *         <p>
	 * @throws LMSException
	 *             If the station create operation fails the above mentioned
	 *             error codes are returned. Each CodeMessage contains the
	 *             status code,human readable message and message type.
	 */
	StationInformationResponse updateStationInformation(
			final StationInfoPersistRequest pStationInfoPersistRequest)
			throws LMSException;

}
