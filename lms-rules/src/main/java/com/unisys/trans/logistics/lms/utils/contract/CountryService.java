/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest;
import com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse;
import com.unisys.trans.logistics.lms.framework.dto.ValidationRequest;
import com.unisys.trans.logistics.lms.framework.dto.ValidationResponse;
import com.unisys.trans.logistics.lms.framework.dto.SuggestiveSearchResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.CountryFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.CountryPersistRequest;
import com.unisys.trans.logistics.lms.utils.dto.CountryResponse;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * <code>CountryService</code> interface exposes the APIs which identifies various processing flows involved
 * in maintaining country information.
 * <p>
 * <p>
 * This includes the following operations:
 * <ul>
 * <li>Create country - Creates a country.
 * <li>Update country - Updates the country informations.
 * <li>Find countries by country code - Retrieves a list of country details for the specified country codes.
 * <li>Find countries by region code - Retrieves country details for the specified region codes.
 * <li>Find country by country code - Retrieves country details for the specified country code.
 * <li>Find country codes by station codes - Retrieves country codes for the specified station codes.
 * <li>Find country details by city code - Retrieves country details for the specified city code.
 * <li>Find country details by station codes - Retrieves country details for the specified station codes.
 * </ul>
 * <p>
 * 
 * @see com.unisys.trans.logistics.lms.utils.dto.CountryDto
 * @see com.unisys.trans.logistics.lms.utils.dto.CountryFindRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.CountryPersistRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.CountryResponse
 * @see com.unisys.trans.logistics.lms.framework.dto.ValidationRequest
 * @see com.unisys.trans.logistics.lms.framework.dto.ValidationResponse
 * @see com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest
 * @see com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse
 */
public interface CountryService {

    /**
     * Creates a <code>Country</code>.
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_EFFECTIVE_DATE}
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
     * <b>Error Text: </b><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#COUNTRY_CODE_ALREADY_EXISTS}</td>
     *            <td>The country code is duplicated.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#COUNTRY_INVALID_NUMERICCODEUPDATE_OBJECT_INSTANCE}</td>
     *            <td>The input numeric code already exists.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#COUNTRY_REGIONCODE}</td>
     *            <td>The IATA Region Code does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#LOCAL_RATING_CURRENCY_DOES_NOT_EXIST}</td>
     *            <td>The local rating currency does not exist in the system.</td>
     *            </tr>
     * 
     *            </code>
     * </table>
     * 
     * @param pCountryPersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CountryPersistRequest CountryPersistRequest}
     *            </code><br>
     *            holds all the information required for creating a country.<br>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto countryDto} - (M)
     *            </code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto#setCode code} - (M)
     *            </code> <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto#setOId oId} -
     *            (C)</code><br>
     *            Prohibited for create operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version}
     *            - (C)</code><br>
     *            Prohibited for create operation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto customsInfoDto} - (O) (1:1)
     *            </code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#setArea area} -
     *            (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#setAutomatedExportIndicator
     *            automatedExportIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#setAutomatedImportIndicator
     *            automatedImportIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#setAwbActiveDays
     *            awbActiveDays} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#setAwbDaysBeforeReuse
     *            awbDaysBeforeReuse} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#setAwbImportIndicator
     *            awbImportIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#setDefaultHoldIndicator
     *            defaultHoldIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#setEdifactFromNetworkId
     *            edifactFromNetworkId} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#setEdifactToNetworkId
     *            edifactToNetworkId} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#setExcludeAutomaticFlightIndicator
     *            excludeAutomaticFlightIndicator} - (C)</code><br>
     *            Applicable only when House Air waybill association at flight finalization field is set to
     *            “Error”. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#setHawbAssociationFlightFinalCode
     *            hawbAssociationFlightFinalCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#setHawbAutomaticAssociationCode
     *            hawbAutomaticAssociationCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#setHoursBeforeArrivalReport
     *            hoursBeforeArrivalReport} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#setQueue queue} - (C)</code><br>
     *            Mandatory if customs queue station is entered and will be prohibited if customs queue
     *            station is not entered <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#setQueueOffice queueOffice} -
     *            (C)</code><br>
     *            Mandatory if customs queue station is entered <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#setQueueStation queueStation}
     *            - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#setReportingMethodCode
     *            reportingMethodCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#setShutoffMessageCode
     *            shutoffMessageCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#setTtyFromAddress
     *            ttyFromAddress} - (C)</code> <br>
     *            Only applicable for US and Canadian customs. This field is prohibited if TTY is not the
     *            reporting method. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#setTtyToAddress ttyToAddress}
     *            - (C)</code><br>
     *            Only applicable for US and canadian customs. This field is prohibited if TTY is not the
     *            reporting method.
     *            </ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto#setEmbargoNumber
     *            embargoNumber} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto#setIataAreaCode iataAreaCode} -
     *            (C)</code><br>
     *            Iata area code is prohibited. Iata area code is the first character of the country’s IATA
     *            region code <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto#setIataAreaName iataAreaName} -
     *            (C)</code><br>
     *            Iata area name is prohibited. Iata area name is picked based on the area code. The region
     *            code first character is the area code. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto#setIataRegionCode iataRegionCode}
     *            - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto#setIataRegionName iataRegionName}
     *            - (C)</code><br>
     *            Iata region name is prohibited. Iata region name is picked from input region code. <li>
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto#setIataSubAreaCode
     *            iataSubareaCode} - (C)</code><br>
     *            Iata sub area code is prohibited. Iata sub area code is the first two characters of the
     *            country’s IATA region code <li> <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto#setIataSubAreaName
     *            iataSubareaName} - (C)</code></br> Iata sub area name is prohibited.IATA sub area name is
     *            picked from the sub area code. The region code first two characters is the sub area code.
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto#setName name} - (M)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto#setNumericCode numericCode} - (M)
     *            </code> <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto
     *            ratingInfoDto} - (M) (1:1)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#setBillingCurrencyCode
     *            billingCurrencyCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#setCurrentAdditionalTariffRate
     *            currentAdditionalTariffRate} - (C)</code><br>
     *            Prohibited field and will be internally set on successful creation only if the pending
     *            tariff currency has been entered and the pending effective date is today's date. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#setCurrentDiscontinueDate
     *            currentDiscontinueDate} - (C)</code><br>
     *            Prohibited for creation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#setCurrentEffectiveDate
     *            currentEffectiveDate} - (C)</code><br>
     *            Prohibited field and will be internally set on successful creation if the value for pending
     *            effective date has been entered and is todays's date. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#setCurrentPublicationCurrency
     *            currentPublicationCurrency} - (C)</code><br>
     *            Prohibited field and will be internally set on successful creation if the value for pending
     *            publication currency has been entered and the pending effective date is today's date. <li>
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#setCurrentUsdIndicator
     *            currentUsdIndicator} - (C)</code><br>
     *            Prohibited field and will be internally set on successful creation if the value for pending
     *            USD indicator has been entered and the pending effective date is today's date. <li> <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#setHistoryAdditionalTariffRate
     *            historyAdditionalTariffRate} - (C)</code><br>
     *            Prohibited for creation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#setHistoryDiscontinueDate
     *            historyDiscontinueDate} - (C)</code><br>
     *            Prohibited for creation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#setHistoryEffectiveDate
     *            historyEffectiveDate} - (C)</code><br>
     *            Prohibited for creation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#setHistoryPublicationCurrency
     *            historyPublicationCurrency} - (C)</code><br>
     *            Prohibited for creation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#setHistoryUsdIndicator
     *            historyUsdIndicator} - (C)</code><br>
     *            Prohibited for creation. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#setLocalCurrencyCode
     *            localCurrencyCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#setLocalCurrencyName
     *            localCurrencyName} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#setLocalCurrencyNumericCode
     *            localCurrencyNumericCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#setLocalRatingCurrencyCode
     *            localRatingCurrencyCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#setPendingAdditionalTariffRate
     *            pendingAdditionalTariffRate} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#setPendingDiscontinueDate
     *            pendingDiscontinueDate} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#setPendingEffectiveDate
     *            pendingEffectiveDate} - (O)</code><br>
     *            Depends on the run time parameter -
     *            {@linkplain com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_EFFECTIVE_DATE}
     *            . <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#setPendingPublicationCurrency
     *            pendingPublicationCurrency} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#setPendingUsdIndicator
     *            pendingUsdIndicator} - (O)</code>
     *            </ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto#setWeightUnit
     *            WeightUnit} - (M)</code>
     *            </ul>
     *            </ul>
     *            <p>
     *            <br>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.CountryResponse CountryResponse}</code>
     *         <ul>
     *         <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto CountryDto}
     *         </ul>
     * @throws LMSException If the create operation fails the above mentioned error codes are returned. Each
     *             CodeMessage contains the status code, human readable message and message type.
     */
    CountryResponse createCountry(CountryPersistRequest pCountryPersistRequest) throws LMSException;

    /**
     * Retrieve the countries for specified list of country codes.
     * <p>
     * Retrieves a map of country details with country code as key and <code>CountryDto</code> as value.
     * <p>
     * <p>
     * <b>Related methods include:</b>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountriesByRegionCodes
     * findCountriesByRegionCode }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountry findCountry }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountriesByCodes
     * findCountryByCountryCode }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountryCodesByStationCodes
     * findCountryCodesByStationCodes }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountryDetailsByCityCode
     * findCountryDetailsByCityCode }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountryDetailsByStationCodes
     * findCountryDetailsByStationCodes }
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
     *            {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest MultipleFindRequest}
     *            </code><br>
     *            holds list of search input values.<br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest#setSearchInputs
     *            searchInputs} - (M)(1:*)</code> <br>
     *            holds a list of country codes.
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse
     *         MultipleFindResponse}</code><br>
     *         <ul>
     *         <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         <code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse#getRetrievedObjects
     *         retrievedObjects} - (0:*)</code> <br>
     *         holds a map with country code as key and <code>CountryDto</code> as value.
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto CountryDto}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto#getCode countryCode}
     *         </code> <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto#getName name}
     *         </code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto#getIataRegionCode iataRegionCode}
     *         </code> <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto
     *         CustomsInfoDto}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#getArea area}</code>
     *         </ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto RatingInfoDto}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#getLocalCurrencyCode
     *         localCurrencyCode}</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#getBillingCurrencyCode
     *         billingCurrencyCode}</code>
     *         </ul>
     *         </ul>
     *         </ul>
     *         </ul>
     *         <p>
     * @throws LMSException If the method fails the above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message and message type.
     */
    MultipleFindResponse findCountriesByCodes(MultipleFindRequest pMultipleFindRequest) throws LMSException;

    
    /**
     * Retrieve all the countries.
     * <p>
     * Retrieves a map of country details with country code as key and <code>CountryDto</code> as value.
     * <p>
     * <p>
     * <b>Related methods include:</b>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountriesByRegionCodes
     * findCountriesByRegionCode }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountry findCountry }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountriesByCodes
     * findCountryByCountryCode }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountryCodesByStationCodes
     * findCountryCodesByStationCodes }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountryDetailsByCityCode
     * findCountryDetailsByCityCode }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountryDetailsByStationCodes
     * findCountryDetailsByStationCodes }
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
     * @param aCountryFindRequest 
     * 
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse
     *         MultipleFindResponse}</code><br>
     *         <ul>
     *         <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         <code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse#getRetrievedObjects
     *         retrievedObjects} - (0:*)</code> <br>
     *         holds a map with country code as key and <code>CountryDto</code> as value.
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto CountryDto}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto#getCode countryCode}
     *         </code> <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto#getName name}
     *         </code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto#getIataRegionCode iataRegionCode}
     *         </code> <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto
     *         CustomsInfoDto}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#getArea area}</code>
     *         </ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto RatingInfoDto}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#getLocalCurrencyCode
     *         localCurrencyCode}</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#getBillingCurrencyCode
     *         billingCurrencyCode}</code>
     *         </ul>
     *         </ul>
     *         </ul>
     *         </ul>
     *         <p>
     * @throws LMSException If the method fails the above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message and message type.
     */
    CountryResponse findAllCountires(CountryFindRequest aCountryFindRequest)throws LMSException;

    /**
     * Retrieve the countries by region codes.
     * <p>
     * A list of IATA region codes is given as input. The system retrieves the countries associated for the
     * provided IATA region codes.
     * <p>
     * <b>Related methods include:</b>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountriesByRegionCodes
     * findCountriesByRegionCode }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountry findCountry }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountriesByCodes
     * findCountryByCountryCode }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountryCodesByStationCodes
     * findCountryCodesByStationCodes }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountryDetailsByCityCode
     * findCountryDetailsByCityCode }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountryDetailsByStationCodes
     * findCountryDetailsByStationCodes }
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
     *            {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest MultipleFindRequest}
     *            </code><br>
     *            holds the list of search input values.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest#setSearchInputs
     *            searchInputs} - (M)(1:*)</code> <br>
     *            holds the list of iata region codes.
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse
     *         MultipleFindResponse}</code><br>
     *         <ul>
     *         <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         <code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse#getRetrievedObjects
     *         retrievedObjects} - (0:*)</code> <br>
     *         holds a map with country code as key and <code>CountryDto</code> as value.
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto CountryDto}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto#getCode countryCode}
     *         </code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto#getIataRegionCode iataRegionCode}
     *         </code> <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto#getOId oId}
     *         </code>
     *         </ul>
     *         </ul>
     *         </ul>
     *         <p>
     * @throws LMSException If the method fails the above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message and message type.
     */
    MultipleFindResponse findCountriesByRegionCodes(MultipleFindRequest pMultipleFindRequest)
                throws LMSException;

    /**
     * Retrieve the <code>Country</code> by the country code.
     * <p>
     * <b>Related methods include:</b>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountriesByRegionCodes
     * findCountriesByRegionCode }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountry findCountry }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountriesByCodes
     * findCountryByCountryCode }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountryCodesByStationCodes
     * findCountryCodesByStationCodes }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountryDetailsByCityCode
     * findCountryDetailsByCityCode }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountryDetailsByStationCodes
     * findCountryDetailsByStationCodes }
     * <p>
     * <p>
     * <b>Errors: </b><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#COUNTRY_INVALID_CODENOTEXIST}</td>
     *            <td>The Country code does not exist in the system.</td>
     *            </tr>
     *            </code>
     * </table>
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
     * @param pCountryFindRequest <code> {@link com.unisys.trans.logistics.lms.utils.dto.CountryFindRequest
     *            CountryFindRequest}</code><br>
     *            holds all the required information for retrieving country information
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CountryFindRequest
     *            CountryFindRequest} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CountryFindRequest#setCountryCode
     *            countryCode} - (M)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.CountryResponse CountryResponse}</code>
     *         <ul>
     *         <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto CountryDto}
     *         </ul>
     *         <p>
     * @throws LMSException If the method fails the above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message and message type.
     */
    CountryResponse findCountry(CountryFindRequest pCountryFindRequest) throws LMSException;

    /**
     * Finds the country codes by using the station codes.
     * <p>
     * <b>Related methods include:</b>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountriesByRegionCodes
     * findCountriesByRegionCode }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountry findCountry }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountriesByCodes
     * findCountryByCountryCode }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountryCodesByStationCodes
     * findCountryCodesByStationCodes }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountryDetailsByCityCode
     * findCountryDetailsByCityCode }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountryDetailsByStationCodes
     * findCountryDetailsByStationCodes }
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
     *            {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest MultipleFindRequest}
     *            </code><br>
     *            holds the list of search input values.<br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest#setSearchInputs
     *            searchInputs} - (M) (1:*)</code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse
     *         MultipleFindResponse}</code><br>
     *         <ul>
     *         <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         <code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse#getRetrievedObjects
     *         retrievedObjects}</code> <br>
     *         holds a map of with station code as key and country code as value.
     *         </ul>
     *         <p>
     * @throws LMSException If the method fails the above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message and message type.
     */
    MultipleFindResponse findCountryCodesByStationCodes(final MultipleFindRequest pMultipleFindRequest)
                throws LMSException;

    /**
     * Find the countries by using the city codes.
     * <p>
     * <b>Related methods include:</b>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountriesByRegionCodes
     * findCountriesByRegionCode }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountry findCountry }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountriesByCodes
     * findCountryByCountryCode }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountryCodesByStationCodes
     * findCountryCodesByStationCodes }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountryDetailsByCityCode
     * findCountryDetailsByCityCode }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountryDetailsByStationCodes
     * findCountryDetailsByStationCodes }
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
     *            {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest MultipleFindRequest}
     *            </code><br>
     *            holds the list of search input values.<br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest#setSearchInputs
     *            searchInputs} - (M) (1:*)</code><br>
     *            holds a list of city codes.
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse
     *         MultipleFindResponse}</code><br>
     *         Returns the retrieved objects for the search input.<br>
     *         <ul>
     *         <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         <code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse#getRetrievedObjects
     *         retrievedObjects} - (0:*) </code> <br>
     *         holds a map with city code as key and <code>CountryDto</code> as value.
     *         </ul>
     *         <p>
     * @throws LMSException If the method fails the above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message and message type.
     */
    MultipleFindResponse findCountryDetailsByCityCode(final MultipleFindRequest pMultipleFindRequest)
                throws LMSException;

    /**
     * Finds the country details by using the station code.
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
     *            {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest MultipleFindRequest}
     *            </code><br>
     *            holds the list of search input values.<br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest#setSearchInputs
     *            searchInputs} - (M) (1:*)</code><br>
     *            holds a list of station codes.
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse
     *         MultipleFindResponse}</code><br>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse#getRetrievedObjects
     *         retrievedObjects} - (0:*)</code> <br>
     *         holds a map of country details with country code as key and <code>CountryDto</code> as value.
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto CountryDto}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto#getCode countryCode}
     *         </code> <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto#getName name}
     *         </code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto#getIataRegionCode iataRegionCode}
     *         </code> <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto
     *         CustomsInfoDto}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#getArea area}</code>
     *         </ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto RatingInfoDto}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#getLocalCurrencyCode
     *         localCurrencyCode}</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#getBillingCurrencyCode
     *         billingCurrencyCode}</code>
     *         </ul>
     *         </ul>
     *         </ul>
     *         </ul>
     *         <p>
     * @throws LMSException If the method fails the above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message and message type.
     */
    MultipleFindResponse findCountryDetailsByStationCodes(final MultipleFindRequest pMultipleFindRequest)
                throws LMSException;

    /**
     * Updates a <code>Country</code> after validating all the input data.
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_EFFECTIVE_DATE}
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
     * <b>Error Text: </b><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#COUNTRY_INVALID_CODEUPDATE_OBJECT_INSTANCE}</td>
     *            <td>The country code cannot be changed on update.td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#COUNTRY_INVALID_NUMERICCODEUPDATE_OBJECT_INSTANCE}</td>
     *            <td>The input numeric code already exists.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#COUNTRY_REGIONCODE}</td>
     *            <td>The IATA Region Code does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#LOCAL_RATING_CURRENCY_DOES_NOT_EXIST}</td>
     *            <td>The local rating currency does not exist in the system.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pCountryPersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CountryPersistRequest CountryPersistRequest}
     *            </code><br>
     *            holds all the information required for creating a country.<br>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto countryDto} - (M)
     *            </code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto#setCode code} - (M)
     *            </code> <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto#setOId oId} -
     *            (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version}
     *            - (M)</code> <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto
     *            customsInfoDto} - (O) (1:1) </code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#setArea area} -
     *            (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#setAutomatedExportIndicator
     *            automatedExportIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#setAutomatedImportIndicator
     *            automatedImportIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#setAwbActiveDays
     *            awbActiveDays} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#setAwbDaysBeforeReuse
     *            awbDaysBeforeReuse} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#setAwbImportIndicator
     *            awbImportIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#setDefaultHoldIndicator
     *            defaultHoldIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#setEdifactFromNetworkId
     *            edifactFromNetworkId} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#setEdifactToNetworkId
     *            edifactToNetworkId} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#setExcludeAutomaticFlightIndicator
     *            excludeAutomaticFlightIndicator} - (C)</code><br>
     *            Applicable only when House Air waybill association at flight finalization field is set to
     *            “Error”. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#setHawbAssociationFlightFinalCode
     *            hawbAssociationFlightFinalCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#setHawbAutomaticAssociationCode
     *            hawbAutomaticAssociationCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#setHoursBeforeArrivalReport
     *            hoursBeforeArrivalReport} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#setQueue queue} - (C)</code><br>
     *            Mandatory if customs queue station is entered and will be prohibited if customs queue
     *            station is not entered <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#setQueueOffice queueOffice} -
     *            (C)</code><br>
     *            Mandatory if customs queue station is entered <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#setQueueStation queueStation}
     *            - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#setReportingMethodCode
     *            reportingMethodCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#setShutoffMessageCode
     *            shutoffMessageCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#setTtyFromAddress
     *            ttyFromAddress} - (C)</code><br>
     *            Only applicable for US and Canadian customs. This field is prohibited if TTY is not the
     *            reporting method. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CustomsInfoDto#setTtyToAddress ttyToAddress}
     *            - (O)</code><br>
     *            only applicable for US and canadian customs. This field is prohibited if TTY is not the
     *            reporting method.
     *            </ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto#setEmbargoNumber
     *            embargoNumber} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto#setIataAreaCode iataAreaCode} -
     *            (C)</code><br>
     *            Iata area code is prohibited. Iata area code is the first character of the country’s IATA
     *            region code <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto#setIataAreaName iataAreaName} -
     *            (C)</code><br>
     *            Iata area name is prohibited. Iata area name is picked based on the area code. The region
     *            code first character is the area code. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto#setIataRegionCode iataRegionCode}
     *            - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto#setIataRegionName iataRegionName}
     *            - (C)</code><br>
     *            Iata region name is prohibited. Iata region name is picked from input region code. <li>
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto#setIataSubAreaCode
     *            iataSubareaCode} - (C)</code><br>
     *            Iata sub area code is prohibited. Iata sub area code is the first two characters of the
     *            country’s IATA region code <li> <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto#setIataSubAreaName
     *            iataSubareaName} - (C)</code></br> Iata sub area name is prohibited.IATA sub area name is
     *            picked from the sub area code. The region code first two characters is the sub area code.
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto#setName name} - (M)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto#setNumericCode numericCode} - (M)
     *            </code> <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto#setOId oId} -
     *            (M)</code><br>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto ratingInfoDto} -
     *            (M) (1:1) </code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#setBillingCurrencyCode
     *            billingCurrencyCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#setCurrentAdditionalTariffRate
     *            currentAdditionalTariffRate} - (O)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#setCurrentDiscontinueDate
     *            currentDiscontinueDate} - (O)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#setCurrentEffectiveDate
     *            currentEffectiveDate} - (O)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#setCurrentPublicationCurrency
     *            currentPublicationCurrency} - (O)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#setCurrentUsdIndicator
     *            currentUsdIndicator} - (O)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#setHistoryAdditionalTariffRate
     *            historyAdditionalTariffRate} - (O)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#setHistoryDiscontinueDate
     *            historyDiscontinueDate} - (O)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#setHistoryEffectiveDate
     *            historyEffectiveDate} - (O)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#setHistoryPublicationCurrency
     *            historyPublicationCurrency} - (O)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#setHistoryUsdIndicator
     *            historyUsdIndicator} - (O)</code><br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#setLocalCurrencyCode
     *            localCurrencyCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#setLocalCurrencyName
     *            localCurrencyName} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#setLocalCurrencyNumericCode
     *            localCurrencyNumericCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#setLocalRatingCurrencyCode
     *            localRatingCurrencyCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#setPendingAdditionalTariffRate
     *            pendingAdditionalTariffRate} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#setPendingDiscontinueDate
     *            pendingDiscontinueDate} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#setPendingEffectiveDate
     *            pendingEffectiveDate} - (O)</code><br>
     *            Depends on the run time parameter -
     *            {@linkplain com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_EFFECTIVE_DATE}
     *            . <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#setPendingPublicationCurrency
     *            pendingPublicationCurrency} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.RatingInfoDto#setPendingUsdIndicator
     *            pendingUsdIndicator} - (O)</code>
     *            </ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto#setWeightUnit
     *            WeightUnit} - (M)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.CountryResponse CountryResponse}</code>
     *         <ul>
     *         <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto CountryDto}
     *         </ul>
     *         <p>
     * @throws LMSException If the update operation fails the above mentioned error codes are returned. Each
     *             CodeMessage contains the status code, human readable message and message type.
     */
    CountryResponse updateCountry(CountryPersistRequest pCountryPersistRequest) throws LMSException;

    /**
     * Retrieves country details for the specified country codes.
     * <p>
     * The system finds the country code that exactly matches the input country code.
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
     * @param pValidationRequest <code> {@link com.unisys.trans.logistics.lms.framework.dto.ValidationRequest
     *            ValidationRequest}</code><br>
     *            the request object which contains the list of search input values.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.ValidationRequest#setSearchInputs
     *            searchInputs} - (M) (1:*)</code><br>
     *            holds a list of country codes.
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse
     *         ValidationResponse}</code><br>
     *         Returns the exact country code if match found.<br>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse#getValidInputs
     *         validInputs}-(0:*)</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse#getSearchInputs
     *         searchInputs}-(1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto CountryDto}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto#getCode countryCode}
     *         </code> <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto#getOId oId}
     *         </code>
     *         </ul>
     *         </ul>
     *         </ul>
     *         <p>
     * @throws LMSException If the method fails the above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message and message type.
     */
    ValidationResponse validateCountry(ValidationRequest pValidationRequest) throws LMSException;

    /**
     * Retrieve the <code>Country</code> by the country code.
     * <p>
     * <b>Related methods include:</b>
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountriesByRegionCodes
     * findCountriesByRegionCode }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountry findCountry }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountriesByCodes
     * findCountryByCountryCode }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountryCodesByStationCodes
     * findCountryCodesByStationCodes }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountryDetailsByCityCode
     * findCountryDetailsByCityCode }
     * <li>
     * {@link com.unisys.trans.logistics.lms.utils.contract.CountryService#findCountryDetailsByStationCodes
     * findCountryDetailsByStationCodes }
     * <p>
     * <p>
     * <b>Errors: </b><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#COUNTRY_INVALID_CODENOTEXIST}</td>
     *            <td>The Country code does not exist in the system.</td>
     *            </tr>
     *            </code>
     * </table>
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
     * @param pCountryFindRequest <code> {@link com.unisys.trans.logistics.lms.utils.dto.CountryFindRequest
     *            CountryFindRequest}</code><br>
     *            holds all the required information for retrieving country information
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.CountryFindRequest
     *            CountryFindRequest} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.CountryFindRequest#setCountryCode
     *            countryCode} - (M)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.CountryResponse CountryResponse}</code>
     *         <ul>
     *         <li> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.CountryDto CountryDto}
     *         </ul>
     *         <p>
     * @throws LMSException If the method fails the above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message and message type.
     */

	CountryResponse findCountryIataRegionCode(final CountryFindRequest pRequest) throws LMSException;

	//UIS157
    @POST
    @Path("/findCountrySuggestiveSearch")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    SuggestiveSearchResponse findCountrySuggestiveSearch(
            CountryFindRequest pCountryFindRequest) throws LMSException;
    //UIS157
}
