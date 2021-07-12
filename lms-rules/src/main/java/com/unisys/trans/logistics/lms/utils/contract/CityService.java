/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.dto.BatchRequest;
import com.unisys.trans.logistics.lms.framework.dto.BatchResponse;
import com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest;
import com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse;
import com.unisys.trans.logistics.lms.framework.dto.ValidationRequest;
import com.unisys.trans.logistics.lms.framework.dto.ValidationResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.CityDeleteRequest;
import com.unisys.trans.logistics.lms.utils.dto.CityDto;
import com.unisys.trans.logistics.lms.utils.dto.CityFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.CityPersistRequest;
import com.unisys.trans.logistics.lms.utils.dto.CityResponse;
import com.unisys.trans.logistics.lms.utils.dto.CityRestoreRequest;

/**
 * <code>CityService</code> interface exposes the APIs which identifies various processing flows involved in
 * displaying and maintaining city information.
 * <p>
 * City information contains details like:
 * <li>Standard Variation to UTC (Time zone - Coordinated Universal Time).
 * <li>Daylight Savings Time information.
 * <p>
 * This interface performs the following functions :
 * <ul>
 * <li>Creates the city information.
 * <li>Updates the city information.
 * <li>Retrieves the city information.
 * <li>Deletes the city information.
 * <li>Restores the city information.
 * <li>Retrieves the city and airport information.
 * <li>Retrieves the city information for the given country code.
 * <li>Retrieves the city information for the given country codes.
 * <li>Retrieves the city information based on the city code.
 * <li>Retrieves the city information based on the city codes.
 * <li>Validates the given city codes.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.utils.dto.CityFindRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.CityResponse
 * @see com.unisys.trans.logistics.lms.framework.dto.ValidationRequest
 * @see com.unisys.trans.logistics.lms.framework.dto.ValidationResponse
 * @see com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest
 * @see com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse
 */
public interface CityService {

    /**
     * Creates a new City information.
     * <p>
     * <b>Related methods include:</b>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CityService#updateCity updateCity}
     * <p>
     * Creates a new city and also the DSTs (Daylight Saving Time) information associated with that city.
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
     * @param pCityPersistRequest <code> {@link com.unisys.trans.logistics.lms.utils.dto.CityPersistRequest
     *            CityPersistRequest}</code><br>
     *            holds the information to update a city and its related city DSTs information.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CityDto city} - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CityDto#setCityCode cityCode} -(
     *            M)</code> <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CityDto#setCityName
     *            cityName} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CityDto#setCountryCode countryCode} - (M)
     *            </code> <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CityDto#setStateCode
     *            stateCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CityDto#setStateName stateName} - (O)</code>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CityDto#setStandardUTCVariation
     *            standardUTCVariation} - (O)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CityDto#setCityDSTs cityDSTs} -
     *            (O)(0:*)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CityDSTDto CityDSTDto}</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CityDSTDto#setStandardDSTVariation
     *            standardDSTVariation} - (0)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CityDSTDto#setStartDSTDate startDSTDate} -
     *            (C)</code><br>
     *            Mandatory if DST Variation to Standard is not None. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CityDSTDto#setEndDSTDate endDSTDate} - (C)
     *            </code><br>
     *            Mandatory if DST Variation to Standard is not None. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CityDSTDto#setStartDSTTime startDSTTime} -
     *            (C)</code><br>
     *            Mandatory if DST Variation to Standard is not None. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CityDSTDto#setEndDSTTime endDSTTime} -(C)
     *            </code><br>
     *            Mandatory if DST Variation to standard is not None.
     *            </ul>
     *            </ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CityDto#setAirports airports} -
     *            (O)(0:*)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.AirportDto AirportDto}</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.AirportDto#setAirportCode
     *            airportCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AirportDto#setAirportName airportName} - (O)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AirportDto#setAirportServiceIndicator
     *            airportServiceIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AirportDto#setCityCode cityCode} - (O)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AirportDto#setDefaultAirportIndicator
     *            defaultAirportIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AirportDto#setLatitude latitude} - (O)
     *            </code> <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.AirportDto#setLongitude
     *            longitude} - (O)</code>
     *            </ul>
     *            </ul>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.CityResponse CityResponse}<br> <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.CityDto cities} - (1:*) </ul> </code>
     *         <p>
     * @throws LMSException If the city cannot be created.
     */
    CityResponse createCity(CityPersistRequest pCityPersistRequest) throws LMSException;

    /**
     * Marks the city for deletion.
     * <p>
     * In case of the marking the city for deletion, the end date must be provided.City that is associated
     * with an airport cannot be deleted.
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
     * 
     * @param pCityDeleteRequest <code> {@link com.unisys.trans.logistics.lms.utils.dto.CityDeleteRequest
     *            CityDeleteRequest} </code><br>
     *            holds the required information to mark the city for delete operation.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CityDeleteRequest#setCityCode
     *            cityCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CityDeleteRequest#setEndDate endDate} - (M)
     *            </code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.CityResponse CityResponse}<br> <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.CityDto cities} - (0:*) </ul> </code>
     *         <p>
     * @throws LMSException If the city cannot be deleted.
     */
    CityResponse deleteCity(CityDeleteRequest pCityDeleteRequest) throws LMSException;

    /**
     * Finds all the city and airports.
     * <p>
     * Retrieves all the city and airports in the system and displays the details. Cities marked for deletion
     * will also be displayed.
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
     * 
     * @param pCityFindRequest <code> {@link com.unisys.trans.logistics.lms.utils.dto.CityFindRequest
     *            CityFindRequest} </code><br>
     *            the request object which contains the list of search input values.<br>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CityFindRequest#setSearchText
     *            searchText} - (M)</code><br>
     *            holds the required information for retrieving the city and its relevant airport information.<br>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.CityResponse CityResponse}<br> <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.CityDto cities} - (0:*) </ul> </code>
     *         <p>
     * @throws LMSException If no record exists for the given search criteria.
     */
    CityResponse findCitiesAndAirports(final CityFindRequest pCityFindRequest) throws LMSException;

    /**
     * Finds the city whose code exactly matches the city codes present in the request.
     * <p>
     * <b>Related methods include:</b>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CityService#findCity findCity}
     * <p>
     * Retrieves all the information related to the provided city code, if that particular city code is
     * present in the system.
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
     * 
     * @param pMultipleFindRequest <code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest MultipleFindRequest}
     *            </code><br>
     *            the request object which contains the list of search input values.<br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest#setSearchInputs
     *            searchInputs}-(M)</code><br>
     *            hold the <code>cityCode</code> for which the city is to be retrieved.
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse
     *         MultipleFindResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse#getRetrievedObjects
     *         retrievedObjects} - (0:*)</code><br>
     *         holds the <code>cityCode</code> as Key and <code>cityDto</code> as Value.
     *         </ul>
     * @throws LMSException If the city for the city code present in the request does not exist.
     */
    MultipleFindResponse findCitiesByCityCodes(MultipleFindRequest pMultipleFindRequest) throws LMSException;

    /**
     * Finds the <code>City</code> for the <code>countryCode</code> thats present in the request.
     * <p>
     * <p>
     * <b>Related methods include:</b>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CityService#findCitiesByCountryCodes
     * findCitiesByCountryCodes}
     * <p>
     * For the given <code>countryCode</code>, list of cities and its associated airports information will be
     * retrieved.
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
     * @param pCityFindRequest <code> {@link com.unisys.trans.logistics.lms.utils.dto.CityFindRequest
     *            CityFindRequest} </code><br>
     *            holds the request object containing the country code for which city information is to be
     *            retrieved.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CityFindRequest CityFindRequest}
     *            -(M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CityFindRequest#setCode cityCode}
     *            - (C)</code><br>
     *            Prohibited for this operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CityFindRequest#setCountryCode countryCode}
     *            -(M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CityFindRequest#setSearchText searchText }
     *            -(M)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.CityResponse CityResponse}</code><br>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code> <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CityDto cities} -
     *         (0:*)</code>
     *         </ul>
     * @throws LMSException If the city details for the <code>countryCode</code> present in the request do not
     *             exist.
     */
    CityResponse findCitiesByCountry(CityFindRequest pCityFindRequest) throws LMSException;

    /**
     * Finds the cities whose <code>countryCode</code> exactly matches the input country codes.
     * <p>
     * Retrieves all informations related to the provided <code>countryCode</code>, if that particular
     * <code>countryCode</code> already exists in the system.
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
     * 
     * @param pMultipleFindRequest <code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest MultipleFindRequest}
     *            </code><br>
     *            the request object which contains the list of search input values.<br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest#setSearchInputs
     *            searchInputs} - (M)</code><br>
     *            holds the list of <code>countryCode</code>.
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse
     *         MultipleFindResponse}</code><br>
     *         the retrieved objects for the search input.<br>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse#getRetrievedObjects
     *         retrievedObjects} - (0:*)</code><br>
     *         holds the <code>cityCode</code> as Key and <code> cityDto </code> as Value.
     *         </ul>
     * @throws LMSException If the country code doesn't exist.
     */
    MultipleFindResponse findCitiesByCountryCodes(MultipleFindRequest pMultipleFindRequest)
                throws LMSException;

    /**
     * Finds the <code>City</code>.
     * <p>
     * For the given <code>cityCode</code>, city details will be populated. If the provided code is of
     * airport, then the airport code will be replaced by the <code>cityCode</code> associated with that
     * airport and will be displayed with the warning message.
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
     * @param pCityFindRequest <code> {@link com.unisys.trans.logistics.lms.utils.dto.CityFindRequest
     *            CityFindRequest} </code><br>
     *            holds the request object for retrieving city and its associated airports information.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CityFindRequest CityFindRequest}
     *            - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CityFindRequest#setCode cityCode}
     *            - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CityFindRequest#setCountryCode countryCode}
     *            - (C)</code><br>
     *            Prohibited for this operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CityFindRequest#setSearchText searchText} -(
     *            M)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.CityResponse CityResponse}</code><br>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code> <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CityDto cities} -
     *         (0:*)</code>
     *         </ul>
     * @throws LMSException If the city details do not exist.
     */
    CityResponse findCity(CityFindRequest pCityFindRequest) throws LMSException;

    /**
     * Finds the list of<code>Airport's</code> for a given City.
     * <p>
     * For the given <code>cityCode</code>, list of Airport's will be retrieved.
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
     * @param pMultipleFindRequest <code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest
     *            MultipleFindRequest} </code><br>
     *            holds the request object for retrieving airports for a given city.
     *            <ul>
     *            <li><code> City Code - (M)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse
     *         MultipleFindResponse}</code><br>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code> <li><code> airportCodes </code>
     *         </ul>
     * @throws LMSException If the city details do not exist.
     */
    MultipleFindResponse findAirportsForCity(MultipleFindRequest pMultipleFindRequest) throws LMSException;

    /**
     * Finds the <code>City</code>.
     * <p>
     * For the given <code>cityCode</code>, city details will be populated.
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
     * @param pCityFindRequest <code> {@link com.unisys.trans.logistics.lms.utils.dto.CityFindRequest
     *            CityFindRequest} </code><br>
     *            holds the request object for retrieving city and its associated airports information.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CityFindRequest CityFindRequest}
     *            - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CityFindRequest#setCode cityCode}
     *            - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CityFindRequest#setCountryCode countryCode}
     *            - (C)</code><br>
     *            Prohibited for this operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CityFindRequest#setSearchText searchText} -(
     *            M)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.CityResponse CityResponse}</code><br>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code> <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CityDto cities} -
     *         (0:*)</code>
     *         </ul>
     * @throws LMSException If the city details do not exist.
     */
    CityResponse findCityByCode(CityFindRequest pCityFindRequest) throws LMSException;

    /**
     * Restores the city.
     * <p>
     * Restores a city that had been earlier marked for deletion. The airports associated with the city cannot
     * be restored.
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
     * 
     * @param pCityRestoreRequest <code> {@link com.unisys.trans.logistics.lms.utils.dto.CityRestoreRequest
     *            CityRestoreRequest}</code><br>
     *            holds the required information for restoring a city information.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CityRestoreRequest#setCityCode
     *            cityCode} - (M)</code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.CityResponse CityResponse}</code><br>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code> <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CityDto cities} -
     *         (0:*)</code>
     *         </ul>
     * @throws LMSException If the city code does not exist.
     */
    CityResponse restoreCity(CityRestoreRequest pCityRestoreRequest) throws LMSException;

    /**
     * Updates the city and city DST information for the City.
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
     * 
     * @param pCityPersistRequest <code> {@link com.unisys.trans.logistics.lms.utils.dto.CityPersistRequest
     *            CityPersistRequest}</code><br>
     *            holds the information to update a city and its related city DSTs information.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CityDto city} - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CityDto#setCityCode cityCode} -(
     *            M)</code> <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CityDto#setCityName
     *            cityName} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CityDto#setCountryCode countryCode} - (M)
     *            </code> <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CityDto#setStateCode
     *            stateCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CityDto#setStateName stateName} - (O)</code>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CityDto#setStandardUTCVariation
     *            standardUTCVariation} - (O)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CityDto#setCityDSTs cityDSTs} -
     *            (O)(0:*)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CityDSTDto CityDSTDto}</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CityDSTDto#setStandardDSTVariation
     *            standardDSTVariation} - (0)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CityDSTDto#setStartDSTDate startDSTDate} -
     *            (C)</code><br>
     *            Mandatory if DST Variation to Standard is not None. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CityDSTDto#setEndDSTDate endDSTDate} - (C)
     *            </code><br>
     *            Mandatory if DST Variation to Standard is not None. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CityDSTDto#setStartDSTTime startDSTTime} -
     *            (C)</code><br>
     *            Mandatory if DST Variation to Standard is not None. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CityDSTDto#setEndDSTTime endDSTTime} -( C)
     *            </code><br>
     *            Mandatory if DST Variation to standard is not None.
     *            </ul>
     *            </ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CityDto#setAirports airports} -
     *            (O)(0:*)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.AirportDto AirportDto}</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.AirportDto#setAirportCode
     *            airportCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AirportDto#setAirportName airportName} - (O)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AirportDto#setAirportServiceIndicator
     *            airportServiceIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AirportDto#setCityCode cityCode} - (O)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AirportDto#setDefaultAirportIndicator
     *            defaultAirportIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.AirportDto#setLatitude latitude} - (O)
     *            </code> <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.AirportDto#setLongitude
     *            longitude} - (O)</code>
     *            </ul>
     *            </ul>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.CityResponse CityResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.CityDto cities} - (0:*) </ul> </code>
     *         <p>
     * @throws LMSException If the city update operation fails.
     */
    CityResponse updateCity(CityPersistRequest pCityPersistRequest) throws LMSException;

    /**
     * Validates the city information.
     * <p>
     * It checks for the existence of the <code>cityCodes</code> entered as input. If the
     * <code>cityCodes</code> exist in the system, it returns the city information, else it returns the
     * appropriate error code in the <code>ValidationResponse</code> object.
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
     * 
     * @param pValidationRequest <code> {@link com.unisys.trans.logistics.lms.framework.dto.ValidationRequest
     *            ValidationRequest}</code><br>
     *            the request object which contains the list of search input values.<br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.ValidationRequest#setSearchInputs
     *            searchInputs} - (M)(1:*)</code><br>
     *            holds the list of <code>cityCodes</code>.
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse
     *         ValidationResponse}</code><br>
     *         <ul>
     *         <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         <code> {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse#getInvalidInputs
     *         invalidInputs}</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse#getValidInputs
     *         validInputs} - (1:*)</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse#getSearchInputs
     *         searchInputs} - (1:*)</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse#getRetrievedObjects
     *         retrievedObjects} - (0:*)</code>
     *         </ul>
     *         <p>
     * @throws LMSException If the validation of city fails.
     */
    ValidationResponse validateCityCodes(final ValidationRequest pValidationRequest) throws LMSException;

    /**
     * This method deletes the City for PFM.
     * 
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cell spacing="0" cell padding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * 
     * @param pBatchRequest
     *            <code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchRequest
     *            BatchRequest}</code><br>
     * @return BatchResponse
     *         holds the <code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchResponse
     *         BatchResponse}</code><br>
     *         <p>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human
     *             readable message, and message type.
     */
    BatchResponse purgeCity(BatchRequest pBatchRequest) throws LMSException;

    /**
     * This method writes the discrepancy report for City PFM.
     * 
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cell spacing="0" cell padding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * 
     * @param pBatchRequest
     *            <code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchRequest
     *            BatchRequest}</code><br>
     * @return BatchResponse
     *         holds the <code> {@link com.unisys.trans.logistics.lms.framework.dto.BatchResponse
     *         BatchResponse}</code><br>
     *         <p>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human
     *             readable message, and message type.
     */
    BatchResponse purgeDiscrepancyReportCity(BatchRequest pBatchRequest, StringBuffer pReport)
                throws LMSException;

    /**
     * Finds the City for PFM.
     * 
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cell spacing="0" cell padding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * 
     * @param pCityDto
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.CityDto
     *            CityDto}</code><br>
     *            <p>
     * @return CityResponse
     *         holds the <code> {@link com.unisys.trans.logistics.lms.utils.dto.CityResponse
     *         CityResponse}</code><br>
     *         <p>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are
     *             returned. Each CodeMessage contains the status code, human
     *             readable message, and message type.
     */
    CityResponse findCityForPfm(CityDto pCityDto) throws LMSException;

}
