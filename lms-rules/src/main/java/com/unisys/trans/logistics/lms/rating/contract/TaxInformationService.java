/**======================================
 * Copyright (c) 2007 Unisys Corporation.
 *          All rights reserved.
 *          UNISYS CONFIDENTIAL
 * ====================================== */
package com.unisys.trans.logistics.lms.rating.contract;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.rating.dto.CountryTaxFindRequest;
import com.unisys.trans.logistics.lms.rating.dto.CountryTaxPersistRequest;
import com.unisys.trans.logistics.lms.rating.dto.CountryTaxResponse;
import com.unisys.trans.logistics.lms.rating.dto.StateTaxFindRequest;
import com.unisys.trans.logistics.lms.rating.dto.StateTaxPersistRequest;
import com.unisys.trans.logistics.lms.rating.dto.StateTaxResponse;
import com.unisys.trans.logistics.lms.rating.dto.TaxDeleteRequest;
import com.unisys.trans.logistics.lms.rating.dto.USGovernmentTaxFindRequest;
import com.unisys.trans.logistics.lms.rating.dto.USGovernmentTaxPersistRequest;
import com.unisys.trans.logistics.lms.rating.dto.USGovernmentTaxResponse;
import com.unisys.trans.logistics.lms.rating.dto.ValueAddedTaxFindRequest;
import com.unisys.trans.logistics.lms.rating.dto.ValueAddedTaxPersistRequest;
import com.unisys.trans.logistics.lms.rating.dto.ValueAddedTaxResponse;

/**
 * <code>TaxInformationService</code> interface exposes methods for maintaining tax information. <br>
 * The various taxes are as follows
 * <ul>
 * <li>USGovernmentTax [for 48 contiguous states of the United States,Alaska & Hawaii].
 * <li>ValueAddedTax [for European Union].
 * <li>Country Level Tax / State Level Tax.
 * </ul>
 * <p>
 * This has the following functions:<br>
 * <ul>
 * <li>createCountryTax - creates the country tax.
 * <li>createStateTax - creates the state tax.
 * <li>createUSGovernmentTax - creates the US Government tax.
 * <li>createValueAddedTax - creates the value added tax.
 * <li>findCountryTax - retrieves the country tax details.
 * <li>findStateTax - retrieves the state tax details.
 * <li>findUSGovernmentTax - retrieves the US Government tax details.
 * <li>findValueAddedTax - retrieves the value added tax details.
 * <li>updateCountryTax - updates the country tax details
 * <li>updateStateTax - updates the state tax details.
 * <li>updateUSGovernmentTax - updates the US Government tax details.
 * <li>updateValueAddedTax - updates the value added tax details.
 * <li>deleteTax - deletes the tax details.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.rating.dto.CountryTaxDto
 * @see com.unisys.trans.logistics.lms.rating.dto.StateTaxDto
 * @see com.unisys.trans.logistics.lms.rating.dto.USGovernmentTaxDto
 * @see com.unisys.trans.logistics.lms.rating.dto.ValueAddedTaxDto
 * @see com.unisys.trans.logistics.lms.rating.dto.CountryTaxFindRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.CountryTaxPersistRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.StateTaxFindRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.StateTaxPersistRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.USGovernmentTaxFindRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.USGovernmentTaxPersistRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.ValueAddedTaxFindRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.ValueAddedTaxPersistRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.TaxDeleteRequest
 * @see com.unisys.trans.logistics.lms.rating.dto.CountryTaxResponse
 * @see com.unisys.trans.logistics.lms.rating.dto.StateTaxResponse
 * @see com.unisys.trans.logistics.lms.rating.dto.USGovernmentTaxResponse
 * @see com.unisys.trans.logistics.lms.rating.dto.ValueAddedTaxResponse
 */
public interface TaxInformationService {
    /**
     * This method creates the country tax information.
     * <p>
     * The country code, tax code and tax details passed in the request are validated with the respective
     * service in the UTILS module. If the product codes, other charge codes, tax specific or tax exempt
     * origin and destination stations are valid, then the tax rate for country is created.
     * <p>
     * <b>Related methods include:</b>
     * <li>{@link com.unisys.trans.logistics.lms.rating.contract.TaxInformationService#updateCountryTax
     * updateCountryTax }
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_DAYS}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_EFFECTIVE_DATE}
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
     * <b>Errors: </b><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_COUNTRY_DOES_NOT_EXIST}</td>
     *            <td>The country code does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_CODE_DOES_NOT_EXIST}</td>
     *            <td>Tax code does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_SUBCODE_DOES_NOT_EXIST}</td>
     *            <td>The other charge sub code must be associated with the tax code(Other charge code).</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_APPLIES_ORIGIN_NOT_EXISTS}</td>
     *            <td>Shipment origin does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_APPLIES_DESTINATION_NOT_EXISTS}</td>
     *            <td>Shipment destination does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_ENDDATE_PRIOR_EFFECTIVE_DATE}</td>
     *            <td>End Date cannot be prior to the effective date.
     *            It can be same date as effective date.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_CPARAM_FUTURE_INVALID_DATE}</td>
     *            <td>Input date cannot be before than the current date.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_CPARAM_EFFECTIVE_DATE_ZERO_INVALID}</td>
     *            <td>The Effective Date must be tomorrow or later (When LMS parameter allowed
     *            effective date. is 0).</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_CPARAM_END_DATE_INVALID}</td>
     *            <td>Input date cannot be greater than future allowable input days.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_DATE_OVERLAP}</td>
     *            <td>Date range overlaps. Date must be greater than end date of existing entry.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_ENDDATE_UPDATED_PRIOR_EFFECTIVE_DATE}</td>
     *            <td>The effective date must be at least one day after the previous cycles end date and
     *            must be allowed effective date.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pCountryTaxPersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CountryTaxPersistRequest
     *            pCountryTaxPersistRequest}</code><br>
     *            The request object includes the attributes to create a country tax<br>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.CountryTaxDto CountryTaxDto} -
     *            (M)</code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.CountryTaxDto#setCountryCode
     *            countryCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CountryTaxDto#setTaxCode taxCode} - (M)
     *            </code> <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.TaxDto#setOId oId} - (C)
     *            </code><br>
     *            Prohibited for create operation; auto generated by system.<br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.TaxDto#setEffectiveDate
     *            effectiveDate} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDto#setEndDate endDate} - (O)</code> 
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.TaxDto#setRate rate} - (M)</code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto TaxDetailDto} - (M)
     *            </code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setCollectTaxSubcode
     *            collectTaxSubcode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setDestinations destinations}
     *            -(C)</code><br>
     *            Mandatory if origin is not provided and tax qualifier is not of type 'ALL'. <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setOrigins origins} - (C)
     *            </code><br>
     *            Mandatory if tax qualifier is not of type 'ALL'. <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setOtherChargeCodeTaxExemptedOrTaxSpecific
     *            otherChargeCodeTaxExemptedOrTaxSpecific} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setOtherChargeIndicator
     *            otherChargeIndicator}- (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setPrepaidTaxSubcode
     *            prepaidTaxSubcode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setShipmentBidirectionalIndicator
     *            shipmentBidirectionalIndicator} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setShipmentTaxQualifierDestinationCode
     *            shipmentTaxQualifierDestinationCode}- (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setShipmentTaxQualifierOriginCode
     *            shipmentTaxQualifierOriginCode}- (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setStationTaxQualifierDestinationCode
     *            stationTaxQualifierDestinationCode}- (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setStationTaxQualifierOriginCode
     *            stationTaxQualifierOriginCode}- (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setTaxOtherChargeCodes
     *            taxOtherChargeCodes}- (C)</code><br>
     *            Prohibited if the value 'A' is selected for the field 'Tax Applies to'. <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setTaxProductCodes
     *            taxProductCodes}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setValuationChargesIndicator
     *            valuationChargesIndicator}- (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setTaxWeightChargeType
     *            taxWeightChargeType}- (M)</code>
     *            </ul>
     *            </ul>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code>{@link com.unisys.trans.logistics.lms.rating.dto.CountryTaxResponse CountryTaxResponse}
     *         <ul> <li>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields}
     *         <li>{@link com.unisys.trans.logistics.lms.rating.dto.CountryTaxResponse#getCountryTaxes
     *         countryTaxes} </ul> </code>
     *         <p>
     * @throws LMSException If the create country tax fails.
     */
    CountryTaxResponse createCountryTax(CountryTaxPersistRequest pCountryTaxPersistRequest)
                throws LMSException;

    /**
     * This method creates the state tax information.
     * <p>
     * The country code, tax code ,state code and tax details passed in the request are validated with the
     * respective service in the UTILS system. If the product codes, other charge codes, tax specific or tax
     * exempt origin and destination stations are valid,then the tax rate for the given state is created.
     * <p>
     * <b>Related methods include:</b>
     * <li>{@link com.unisys.trans.logistics.lms.rating.contract.TaxInformationService#updateStateTax
     * updateStateTax }
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_DAYS}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_EFFECTIVE_DATE}
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
     * <b>Errors: </b><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_CODE_DOES_NOT_EXIST}</td>
     *            <td>Tax code does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_SUBCODE_DOES_NOT_EXIST}</td>
     *            <td>The other charge sub code must be associated with the tax code(Other charge code).</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_APPLIES_ORIGIN_NOT_EXISTS}</td>
     *            <td>Shipment origin does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_APPLIES_DESTINATION_NOT_EXISTS}</td>
     *            <td>Shipment destination does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_ENDDATE_PRIOR_EFFECTIVE_DATE}</td>
     *            <td>End Date cannot be prior to the effective date.
     *            It can be same date as effective date.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_CPARAM_FUTURE_INVALID_DATE}</td>
     *            <td>Input date cannot be before than the current date.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_CPARAM_EFFECTIVE_DATE_ZERO_INVALID}</td>
     *            <td>The Effective Date must be tomorrow or later (When LMS parameter allowed
     *            effective date. is 0).</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_CPARAM_END_DATE_INVALID}</td>
     *            <td>Input date cannot be greater than future allowable input days.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_DATE_OVERLAP}</td>
     *            <td>Date range overlaps. Date must be greater than end date of existing entry.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_ENDDATE_UPDATED_PRIOR_EFFECTIVE_DATE}</td>
     *            <td>The effective date must be at least one day after the previous cycles end date and
     *            must be allowed effective date.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pStateTaxPersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.StateTaxPersistRequest
     *            pStateTaxPersistRequest}</code><br>
     *            The request object includes the attributes to create a state tax<br>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.StateTaxDto StateTaxDto} - (M)
     *            </code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.StateTaxDto#setStateCode
     *            stateCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CountryTaxDto#setCountryCode countryCode} -
     *            (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CountryTaxDto#setTaxCode taxCode} - (M)
     *            </code> <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.TaxDto#setOId oId} - (C)
     *            </code><br>
     *            Prohibited for create operation; auto generated by system.<br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.TaxDto#setEffectiveDate
     *            effectiveDate} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDto#setEndDate endDate} - (O)</code> 
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.TaxDto#setRate rate} - (M)</code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto TaxDetailDto} - (M)
     *            </code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setCollectTaxSubcode
     *            collectTaxSubcode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setDestinations destinations}
     *            -(C)</code><br>
     *            Mandatory if origin is not provided and tax qualifier is not of type 'ALL'. <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setOrigins origins} - (C)
     *            </code><br>
     *            Mandatory if tax qualifier is not of type 'ALL'. <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setOtherChargeCodeTaxExemptedOrTaxSpecific
     *            otherChargeCodeTaxExemptedOrTaxSpecific} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setOtherChargeIndicator
     *            otherChargeIndicator}- (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setPrepaidTaxSubcode
     *            prepaidTaxSubcode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setShipmentBidirectionalIndicator
     *            shipmentBidirectionalIndicator} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setShipmentTaxQualifierDestinationCode
     *            shipmentTaxQualifierDestinationCode}- (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setShipmentTaxQualifierOriginCode
     *            shipmentTaxQualifierOriginCode}- (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setStationTaxQualifierDestinationCode
     *            stationTaxQualifierDestinationCode}- (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setStationTaxQualifierOriginCode
     *            stationTaxQualifierOriginCode}- (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setTaxOtherChargeCodes
     *            taxOtherChargeCodes}- (C)</code><br>
     *            Prohibited if the value 'A' is selected for the field 'Tax Applies to'. <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setTaxProductCodes
     *            taxProductCodes}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setValuationChargesIndicator
     *            valuationChargesIndicator}- (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setTaxWeightChargeType
     *            taxWeightChargeType}- (M)</code>
     *            </ul>
     *            </ul>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code>{@link com.unisys.trans.logistics.lms.rating.dto.StateTaxResponse StateTaxResponse} <ul>
     *         <li>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.StateTaxResponse#getStateTaxes stateTaxes}
     *         </ul> </code>
     *         <p>
     * @throws LMSException If the create state tax fails.
     */
    StateTaxResponse createStateTax(StateTaxPersistRequest pStateTaxPersistRequest) throws LMSException;

    /**
     * This method persists the US Government tax information.
     * <p>
     * The origin and destination airports passed in the request are validated against the station service to
     * find out whether the given origin or destination is an airport station. If origin and destination are
     * not provided then it implies that the tax rate created is applicable for the US 48 contiguous states.
     * If the origin and destination airports are both within the US 48 contiguous states or within Hawaii or
     * within Alaska then also the tax rate is applicable for the US 48 contiguous states.
     * <p>
     * <b>Related methods include:</b>
     * <li>{@link com.unisys.trans.logistics.lms.rating.contract.TaxInformationService#updateUSGovernmentTax
     * updateUSGovernmentTax }
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_DAYS}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_EFFECTIVE_DATE}
     * </pre>
     * 
     * <p>
     * <b>Errors: </b><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_STATION_NO_STATECODE}</td>
     *            <td>State code is not defined for Origin / Destination.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_STATION_NOT_WITHIN_US}</td>
     *            <td>Origin / Destination must belong to the Country U.S for U.S Tax.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_NOT_AIRPORT}</td>
     *            <td>Origin/destination is not an airport.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_APPLIES_DESTINATION_NOT_EXISTS}</td>
     *            <td>Shipment destination does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_ENDDATE_PRIOR_EFFECTIVE_DATE}</td>
     *            <td>End Date cannot be prior to the effective date.
     *            It can be same date as effective date.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_CPARAM_FUTURE_INVALID_DATE}</td>
     *            <td>Input date cannot be before than the current date.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_CPARAM_EFFECTIVE_DATE_ZERO_INVALID}</td>
     *            <td>The Effective Date must be tomorrow or later (When LMS parameter allowed
     *            effective date. is 0).</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_CPARAM_END_DATE_INVALID}</td>
     *            <td>Input date cannot be greater than future allowable input days.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_DATE_OVERLAP}</td>
     *            <td>Date range overlaps. Date must be greater than end date of existing entry.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_ENDDATE_UPDATED_PRIOR_EFFECTIVE_DATE}</td>
     *            <td>The effective date must be at least one day after the previous cycles end date and
     *            must be allowed effective date.</td>
     *            </tr>
     *            </code>
     * </table>
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
     * @param pUSGovernmentTaxPersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.USGovernmentTaxPersistRequest
     *            USGovernmentTaxPersistRequest}</code><br>
     *            The request object includes the attributes to create a US tax<br>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.USGovernmentTaxDto
     *            USGovernmentTaxDto} - (M)</code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.USGovernmentTaxDto#setOrigin
     *            origin} - (C)</code><br>
     *            Mandatory for tax type 'Between States'.<br>
     *            Prohibited for tax type 'All states'. <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.USGovernmentTaxDto#setDestination
     *            destination} - (C)</code><br>
     *            Mandatory if origin is provided.<br>
     *            Prohibited for tax type 'All states'. <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.USGovernmentTaxDto#setStateTaxTypeCode
     *            stateTaxTypeCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDto#setOId oId} - (C)</code><br>
     *            Prohibited for create operation; auto generated by system.<br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.TaxDto#setEffectiveDate
     *            effectiveDate} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDto#setEndDate endDate} - (O)</code> 
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.TaxDto#setRate rate} - (M)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code>{@link com.unisys.trans.logistics.lms.rating.dto.USGovernmentTaxResponse
     *         USGovernmentTaxResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.USGovernmentTaxResponse#getUSGovernmentTaxes
     *         uSGovernmentTaxes} </ul> </code>
     *         <p>
     * @throws LMSException If the create US tax fails.
     */
    USGovernmentTaxResponse
                createUSGovernmentTax(USGovernmentTaxPersistRequest pUSGovernmentTaxPersistRequest)
                            throws LMSException;

    /**
     * This method creates the VAT tax information
     * <p>
     * The origin airport station passed in the request is validated against the station service to find out
     * whether the given origin is an airport station. If the origin station exists, then the tax rate for the
     * given origin is created.
     * <p>
     * <b>Related methods include:</b>
     * <li>{@link com.unisys.trans.logistics.lms.rating.contract.TaxInformationService#updateValueAddedTax
     * updateValueAddedTax }
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_DAYS}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_EFFECTIVE_DATE}
     * </pre>
     * 
     * <p>
     * <b>Related methods include:</b>
     * <li>{@link com.unisys.trans.logistics.lms.rating.contract.TaxInformationService#updateUSGovernmentTax
     * updateUSGovernmentTax }
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_DAYS}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_EFFECTIVE_DATE}
     * </pre>
     * 
     * <p>
     * <b>Errors: </b><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_INVALID_EUROPEAN_STATION}</td>
     *            <td>Origin station is not a valid European Economic Community station.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_NOT_AIRPORT}</td>
     *            <td>Origin/destination is not an airport.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_ENDDATE_PRIOR_EFFECTIVE_DATE}</td>
     *            <td>End Date cannot be prior to the effective date.
     *            It can be same date as effective date.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_CPARAM_FUTURE_INVALID_DATE}</td>
     *            <td>Input date cannot be before than the current date.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_CPARAM_EFFECTIVE_DATE_ZERO_INVALID}</td>
     *            <td>The Effective Date must be tomorrow or later (When LMS parameter allowed
     *            effective date. is 0).</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_CPARAM_END_DATE_INVALID}</td>
     *            <td>Input date cannot be greater than future allowable input days.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_DATE_OVERLAP}</td>
     *            <td>Date range overlaps. Date must be greater than end date of existing entry.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_ENDDATE_UPDATED_PRIOR_EFFECTIVE_DATE}</td>
     *            <td>The effective date must be at least one day after the previous cycles end date and
     *            must be allowed effective date.</td>
     *            </tr>
     *            </code>
     * </table>
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
     * @param pValueAddedTaxPersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ValueAddedTaxPersistRequest
     *            ValueAddedTaxPersistRequest}</code><br>
     *            The request object includes the attributes to create a VAT tax<br>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.ValueAddedTaxDto
     *            ValueAddedTaxDto} - (M)</code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.ValueAddedTaxDto#setOrigin
     *            origin} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDto#setOId oId} - (C)</code><br>
     *            Prohibited for create operation; auto generated by system.<br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.TaxDto#setEffectiveDate
     *            effectiveDate} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDto#setEndDate endDate} - (O)</code> 
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.TaxDto#setRate rate} - (M)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code>{@link com.unisys.trans.logistics.lms.rating.dto.ValueAddedTaxResponse
     *         ValueAddedTaxResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.ValueAddedTaxResponse#getValueAddedTaxes
     *         valueAddedTaxes} </ul> </code>
     *         <p>
     * @throws LMSException If the create of VAT fails.
     */
    ValueAddedTaxResponse createValueAddedTax(ValueAddedTaxPersistRequest pValueAddedTaxPersistRequest)
                throws LMSException;

    /**
     * This method deletes the tax information.
     * <p>
     * The same method is used for deleting USGovernmentTax, ValueAddedTax, StateTax and CountryTax.
     * <p>
     * <b>Errors: </b><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_EXPIRED_CAN_NOT_DELETE}</td>
     *            <td>Tax rate is expired.Cannot delete.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_EFFECT_CAN_NOT_DELETE}</td>
     *            <td>Tax rate is in effect.Cannot be deleted.</td>
     *            </tr>
     *            </code>
     * </table>
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
     * @param pTaxDeleteRequest <code>{@link com.unisys.trans.logistics.lms.rating.dto.TaxDeleteRequest
     *            TaxDeleteRequest} </code><br>
     *            The request object includes the attributes to delete tax information.<br>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.TaxDeleteRequest#setOId oId} -
     *            (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDeleteRequest#setTaxType taxType} - (M)
     *            </code>
     *            </ul>
     *            <p>
     * @return <code>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields}
     *         </code>
     *         <p>
     * @throws LMSException If the delete tax fails.
     */
    AbstractResponse deleteTax(TaxDeleteRequest pTaxDeleteRequest) throws LMSException;

    /**
     * This method retrieves country tax details based on the country code and tax code.
     * <p>
     * It returns all the existing entries for the tax information in the descending order of the date of the
     * tax rate.
     * <p>
     * <b>Errors: </b><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_COUNTRY_DOES_NOT_EXIST}</td>
     *            <td>The country code does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_INFO_COUNTRY_CODE_DOES_NOT_EXIST}</td>
     *            <td>Country tax information does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_CODE_DOES_NOT_EXIST}</td>
     *            <td>Tax code does not exist in the system.</td>
     *            </tr>
     *            </code>
     * </table>
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
     * @param pCountryTaxFindRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CountryTaxFindRequest
     *            CountryTaxFindRequest}</code><br>
     *            The request object includes the attributes to find country information.<br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CountryTaxFindRequest#setCountryCode
     *            countryCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CountryTaxFindRequest#setTaxCode taxCode} -
     *            (M)</code>
     *            </ul>
     *            <p>
     * @return <code>{@link com.unisys.trans.logistics.lms.rating.dto.CountryTaxResponse CountryTaxResponse}
     *         <ul> <li>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields}
     *         <li>{@link com.unisys.trans.logistics.lms.rating.dto.CountryTaxResponse#getCountryTaxes
     *         getCountryTaxes} </ul> </code>
     *         <p>
     * @throws LMSException If the find operation fails.
     */
    CountryTaxResponse findCountryTax(CountryTaxFindRequest pCountryTaxFindRequest) throws LMSException;

    /**
     * This method retrieves the state tax information based on the taxCode, countryCode and stateCode.
     * <p>
     * All the existing entries for the tax information in the descending order of the date of the tax rate.
     * <p>
     * <b>Errors: </b><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_CODE_DOES_NOT_EXIST}</td>
     *            <td>Tax code does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_COUNTRY_DOES_NOT_EXIST}</td>
     *            <td>The country code does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_INFO_STATE_CODE_DOES_NOT_EXIST}</td>
     *            <td>State tax information does not exist in the system.</td>
     *            </tr>
     *            </code>
     * </table>
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
     * @param pStateTaxFindRequest <code>{@link com.unisys.trans.logistics.lms.rating.dto.StateTaxFindRequest
     *            StateTaxFindRequest}</code><br>
     *            The request object includes the attributes to find state tax information.<br>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.StateTaxFindRequest#setStateCode
     *            stateCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.StateTaxFindRequest#setCountryCode
     *            countryCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.StateTaxFindRequest#setTaxCode taxCode} -
     *            (M)</code>
     *            </ul>
     *            <p>
     * @return <code>{@link com.unisys.trans.logistics.lms.rating.dto.StateTaxResponse StateTaxResponse} <ul>
     *         <li>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.StateTaxResponse#getStateTaxes getStateTaxes}
     *         </ul> </code>
     *         <p>
     * @throws LMSException If the find operation fails.
     */
    StateTaxResponse findStateTax(StateTaxFindRequest pStateTaxFindRequest) throws LMSException;

    /**
     * This method retrieves the USGovernmentTax information based on the origin, destination and tax type
     * code.
     * <p>
     * It returns all the existing entries for the given tax information in the descending order of the date
     * of the tax rate. Retrieval is done based on the following conditions:
     * <li>If origin and destination is between Alaska or Hawaii and the 48 contiguous states of the United
     * States, it returns the tax rate for the airport pair.
     * <li>If origin and destination are not provided, it retrieves U.S. Transportation tax rate for the 48
     * contiguous states on descending date of the tax rate.
     * <li>Retrieves all US Government tax rate for the 48 contiguous states. If origin and destination are
     * provided and they are within US 48 states or within Hawaii or within Alaska then the tax rate for the
     * US 48 states has to be retrieved.
     * <p>
     * <b>Errors: </b><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_INFO_USGOVT_DOES_NOT_EXIST}</td>
     *            <td>No tax rate exists for the airport pair.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_STATION_NO_STATECODE}</td>
     *            <td>State code is not defined for Origin / Destination.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_STATION_NOT_WITHIN_US}</td>
     *            <td>Origin / Destination must belong to the Country U.S for U.S Tax.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_NOT_AIRPORT}</td>
     *            <td>Origin/destination is not an airport.</td>
     *            </tr>
     *            </code>
     * </table>
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
     * @param pUSGovernmentTaxFindRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.USGovernmentTaxFindRequest
     *            USGovernmentTaxFindRequest}</code><br>
     *            The request object includes the attributes to find a US tax information.<br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.USGovernmentTaxFindRequest#setStateTaxTypeCode
     *            stateTaxTypeCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.USGovernmentTaxFindRequest#setDestination
     *            destination} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.USGovernmentTaxFindRequest#setOrigin
     *            origin} - (M)</code>
     *            </ul>
     *            <p>
     * @return <code>{@link com.unisys.trans.logistics.lms.rating.dto.USGovernmentTaxResponse
     *         USGovernmentTaxResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.USGovernmentTaxResponse#getUSGovernmentTaxes
     *         uSGovernmentTaxes} </ul> </code>
     *         <p>
     * @throws LMSException If the find operation fails.
     */
    USGovernmentTaxResponse findUSGovernmentTax(USGovernmentTaxFindRequest pUSGovernmentTaxFindRequest)
                throws LMSException;

    /**
     * This method retrieves the Value Added Tax information based on the origin.
     * <p>
     * It returns all the existing entries for the tax information on the descending order of date of the tax
     * rate.
     * <p>
     * <b>Errors: </b><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_INVALID_EUROPEAN_STATION}</td>
     *            <td>Origin station is not a valid European Economic Community station.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_INFO_VAT_DOES_NOT_EXIST}</td>
     *            <td>No tax rate exists for the airport.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_NOT_AIRPORT}</td>
     *            <td>Origin/destination is not an airport.</td>
     *            </tr>
     *            </code>
     * </table>
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
     * @param pValueAddedTaxFindRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ValueAddedTaxFindRequest
     *            ValueAddedTaxFindRequest}</code><br>
     *            The request object includes the attributes to find a vat tax information.<br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ValueAddedTaxFindRequest#setOrigin origin}
     *            - (M)</code>
     *            </ul>
     *            <p>
     * @return <code>{@link com.unisys.trans.logistics.lms.rating.dto.ValueAddedTaxResponse
     *         ValueAddedTaxResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.ValueAddedTaxResponse#getValueAddedTaxes
     *         valueAddedTaxes} </ul> </code>
     *         <p>
     * @throws LMSException If the find operation fails.
     */
    ValueAddedTaxResponse findValueAddedTax(ValueAddedTaxFindRequest pValueAddedTaxFindRequest)
                throws LMSException;

    /**
     * This method updates the country tax details.
     * <p>
     * The country code, tax code and tax details passed in the request are validated with the respective
     * service in the UTILS system. If the product codes, other charge codes, tax specific or tax exempt
     * origin and destination stations are valid, then the tax rate for country is updated.
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_DAYS}
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
     * <b>Errors: </b><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#EXPIRED_TAX_RATE_CONT_UPDATE}</td>
     *            <td>Expired tax rate cannot be updated.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_INFO_COUNTRY_CODE_DOES_NOT_EXIST}</td>
     *            <td>Country tax information does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_CODE_DOES_NOT_EXIST}</td>
     *            <td>Tax code does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_SUBCODE_DOES_NOT_EXIST}</td>
     *            <td>The other charge sub code must be associated with the tax code(Other charge code).</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_APPLIES_ORIGIN_NOT_EXISTS}</td>
     *            <td>Shipment origin does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_APPLIES_DESTINATION_NOT_EXISTS}</td>
     *            <td>Shipment destination does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_ENDDATE_PRIOR_EFFECTIVE_DATE}</td>
     *            <td>End Date cannot be prior to the effective date.
     *            It can be same date as effective date.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_CPARAM_FUTURE_INVALID_DATE}</td>
     *            <td>Input date cannot be before than the current date.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_CPARAM_EFFECTIVE_DATE_ZERO_INVALID}</td>
     *            <td>The Effective Date must be tomorrow or later (When LMS parameter allowed
     *            effective date. is 0).</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_CPARAM_END_DATE_INVALID}</td>
     *            <td>Input date cannot be greater than future allowable input days.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_DATE_OVERLAP}</td>
     *            <td>Date range overlaps. Date must be greater than end date of existing entry.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_ENDDATE_UPDATED_PRIOR_EFFECTIVE_DATE}</td>
     *            <td>The effective date must be at least one day after the previous cycles end date and
     *            must be allowed effective date.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pCountryTaxPersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CountryTaxPersistRequest
     *            pCountryTaxPersistRequest}</code><br>
     *            The request object includes the attributes to create a country tax<br>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.CountryTaxPersistRequest
     *            CountryTaxPersistRequest} - (M)</code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.CountryTaxDto CountryTaxDto} -
     *            (M)</code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.CountryTaxDto#setCountryCode
     *            countryCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CountryTaxDto#setTaxCode taxCode} - (M)
     *            </code> <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.TaxDto#setOId oId} - (C)
     *            </code><br>
     *            Prohibited for create operation; auto generated by system.<br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.TaxDto#setEffectiveDate
     *            effectiveDate} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDto#setEndDate endDate} - (O)</code> 
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.TaxDto#setRate rate} - (M)</code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto TaxDetailDto} - (M)
     *            </code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setCollectTaxSubcode
     *            collectTaxSubcode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setDestinations destinations}
     *            -(C)</code><br>
     *            Mandatory if origin is not provided and tax qualifier is not of type 'ALL'. <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setOrigins origins} - (C)
     *            </code><br>
     *            Mandatory if tax qualifier is not of type 'ALL'. <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setOtherChargeCodeTaxExemptedOrTaxSpecific
     *            otherChargeCodeTaxExemptedOrTaxSpecific} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setOtherChargeIndicator
     *            otherChargeIndicator}- (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setPrepaidTaxSubcode
     *            prepaidTaxSubcode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setShipmentBidirectionalIndicator
     *            shipmentBidirectionalIndicator} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setShipmentTaxQualifierDestinationCode
     *            shipmentTaxQualifierDestinationCode}- (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setShipmentTaxQualifierOriginCode
     *            shipmentTaxQualifierOriginCode}- (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setStationTaxQualifierDestinationCode
     *            stationTaxQualifierDestinationCode}- (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setStationTaxQualifierOriginCode
     *            stationTaxQualifierOriginCode}- (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setTaxOtherChargeCodes
     *            taxOtherChargeCodes}- (C)</code><br>
     *            Prohibited if the value 'A' is selected for the field 'Tax Applies to'. <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setTaxProductCodes
     *            taxProductCodes}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setValuationChargesIndicator
     *            valuationChargesIndicator}- (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setTaxWeightChargeType
     *            taxWeightChargeType}- (M)</code>
     *            </ul>
     *            </ul>
     *            </ul>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code>{@link com.unisys.trans.logistics.lms.rating.dto.CountryTaxResponse CountryTaxResponse}
     *         <ul> <li>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields}
     *         <li>{@link com.unisys.trans.logistics.lms.rating.dto.CountryTaxResponse#getCountryTaxes
     *         countryTaxes} </ul> </code>
     *         <p>
     * @throws LMSException If the update country tax fails.
     */
    CountryTaxResponse updateCountryTax(CountryTaxPersistRequest pCountryTaxPersistRequest)
                throws LMSException;

    /**
     * This method updates the state tax details.
     * <p>
     * The country code, tax code, state code and tax details passed in the request are validated with the
     * respective service in the UTILS system. If the product codes, other charge codes, tax specific or tax
     * exempt origin and destination stations are valid, then the tax rate for state is updated.
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_DAYS}
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
     * <b>Errors: </b><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_INFO_STATE_CODE_DOES_NOT_EXIST}</td>
     *            <td>State tax information does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#EXPIRED_TAX_RATE_CONT_UPDATE}</td>
     *            <td>Expired tax rate cannot be updated.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_CODE_DOES_NOT_EXIST}</td>
     *            <td>Tax code does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_SUBCODE_DOES_NOT_EXIST}</td>
     *            <td>The other charge sub code must be associated with the tax code(Other charge code).</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_APPLIES_ORIGIN_NOT_EXISTS}</td>
     *            <td>Shipment origin does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_APPLIES_DESTINATION_NOT_EXISTS}</td>
     *            <td>Shipment destination does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_ENDDATE_PRIOR_EFFECTIVE_DATE}</td>
     *            <td>End Date cannot be prior to the effective date.
     *            It can be same date as effective date.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_CPARAM_FUTURE_INVALID_DATE}</td>
     *            <td>Input date cannot be before than the current date.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_CPARAM_EFFECTIVE_DATE_ZERO_INVALID}</td>
     *            <td>The Effective Date must be tomorrow or later (When LMS parameter allowed
     *            effective date. is 0).</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_CPARAM_END_DATE_INVALID}</td>
     *            <td>Input date cannot be greater than future allowable input days.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_DATE_OVERLAP}</td>
     *            <td>Date range overlaps. Date must be greater than end date of existing entry.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_ENDDATE_UPDATED_PRIOR_EFFECTIVE_DATE}</td>
     *            <td>The effective date must be at least one day after the previous cycles end date and
     *            must be allowed effective date.</td>
     *            </tr>
     *            </code>
     * </table>
     * <p>
     * 
     * @param pStateTaxPersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.StateTaxPersistRequest
     *            pStateTaxPersistRequest}</code><br>
     *            The request object includes the attributes to create a state tax<br>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.StateTaxDto StateTaxDto} - (M)
     *            </code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.StateTaxDto#setStateCode
     *            stateCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CountryTaxDto#setCountryCode countryCode} -
     *            (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.CountryTaxDto#setTaxCode taxCode} - (M)
     *            </code> <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.TaxDto#setOId oId} - (C)
     *            </code><br>
     *            Prohibited for create operation; auto generated by system.<br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.TaxDto#setEffectiveDate
     *            effectiveDate} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDto#setEndDate endDate} - (O)</code> 
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.TaxDto#setRate rate} - (M)</code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto TaxDetailDto} - (M)
     *            </code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setCollectTaxSubcode
     *            collectTaxSubcode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setDestinations destinations}
     *            -(C)</code><br>
     *            Mandatory if origin is not provided and tax qualifier is not of type 'ALL'. <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setOrigins origins} - (C)
     *            </code><br>
     *            Mandatory if tax qualifier is not of type 'ALL'. <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setOtherChargeCodeTaxExemptedOrTaxSpecific
     *            otherChargeCodeTaxExemptedOrTaxSpecific} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setOtherChargeIndicator
     *            otherChargeIndicator}- (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setPrepaidTaxSubcode
     *            prepaidTaxSubcode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setShipmentBidirectionalIndicator
     *            shipmentBidirectionalIndicator} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setShipmentTaxQualifierDestinationCode
     *            shipmentTaxQualifierDestinationCode}- (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setShipmentTaxQualifierOriginCode
     *            shipmentTaxQualifierOriginCode}- (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setStationTaxQualifierDestinationCode
     *            stationTaxQualifierDestinationCode}- (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setStationTaxQualifierOriginCode
     *            stationTaxQualifierOriginCode}- (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setTaxOtherChargeCodes
     *            taxOtherChargeCodes}- (C)</code><br>
     *            Prohibited if the value 'A' is selected for the field 'Tax Applies to'. <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setTaxProductCodes
     *            taxProductCodes}- (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setValuationChargesIndicator
     *            valuationChargesIndicator}- (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDetailDto#setTaxWeightChargeType
     *            taxWeightChargeType}- (M)</code>
     *            </ul>
     *            </ul>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code>{@link com.unisys.trans.logistics.lms.rating.dto.StateTaxResponse StateTaxResponse} <ul>
     *         <li>{@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.StateTaxResponse#getStateTaxes stateTaxes}
     *         </ul> </code>
     *         <p>
     * @throws LMSException If the update state tax fails.
     */
    StateTaxResponse updateStateTax(StateTaxPersistRequest pStateTaxPersistRequest) throws LMSException;

    /**
     * This method updates the US Government tax details.
     * <p>
     * Update is done only if the effective date, end date and tax rate are valid.
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_DAYS}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_EFFECTIVE_DATE}
     * </pre>
     * <p>
     * <b>Errors: </b><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_INFO_USGOVT_DOES_NOT_EXIST}</td>
     *            <td>No tax rate exists for the airport pair.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#EFFECTIVE_TAX_RATE_CONT_UPDATE}</td>
     *            <td>Tax rate cannot be updated.Rate is in effect.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#EXPIRED_TAX_RATE_CONT_UPDATE}</td>
     *            <td>Expired tax rate cannot be updated.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_ENDDATE_PRIOR_EFFECTIVE_DATE}</td>
     *            <td>End Date cannot be prior to the effective date.
     *            It can be same date as effective date.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_CPARAM_FUTURE_INVALID_DATE}</td>
     *            <td>Input date cannot be before than the current date.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_CPARAM_EFFECTIVE_DATE_ZERO_INVALID}</td>
     *            <td>The Effective Date must be tomorrow or later (When LMS parameter allowed
     *            effective date. is 0).</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_CPARAM_END_DATE_INVALID}</td>
     *            <td>Input date cannot be greater than future allowable input days.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_DATE_OVERLAP}</td>
     *            <td>Date range overlaps. Date must be greater than end date of existing entry.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_ENDDATE_UPDATED_PRIOR_EFFECTIVE_DATE}</td>
     *            <td>The effective date must be at least one day after the previous cycles end date and
     *            must be allowed effective date.</td>
     *            </tr>
     *            </code>
     * </table>
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
     * @param pUSGovernmentTaxPersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.USGovernmentTaxPersistRequest
     *            USGovernmentTaxPersistRequest}</code><br>
     *            The request object includes the attributes to create a US tax<br>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.USGovernmentTaxDto
     *            USGovernmentTaxDto} - (M)</code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.USGovernmentTaxDto#setOrigin
     *            origin} - (C)</code><br>
     *            Mandatory for tax type 'Between States'.<br>
     *            Prohibited for tax type 'All states'. <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.USGovernmentTaxDto#setDestination
     *            destination} - (C)</code><br>
     *            Mandatory if origin is provided.<br>
     *            Prohibited for tax type 'All states'. <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.USGovernmentTaxDto#setStateTaxTypeCode
     *            stateTaxTypeCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDto#setOId oId} - (C)</code><br>
     *            Prohibited for create operation; auto generated by system.<br>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.TaxDto#setEffectiveDate
     *            effectiveDate} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDto#setEndDate endDate} - (O)</code> 
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.TaxDto#setRate rate} - (M)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code>{@link com.unisys.trans.logistics.lms.rating.dto.USGovernmentTaxResponse
     *         USGovernmentTaxResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.USGovernmentTaxResponse#getUSGovernmentTaxes
     *         uSGovernmentTaxes} </ul> </code>
     *         <p>
     * @throws LMSException If the update US tax fails.
     */
    USGovernmentTaxResponse
                updateUSGovernmentTax(USGovernmentTaxPersistRequest pUSGovernmentTaxPersistRequest)
                            throws LMSException;

    /**
     * This method updates the value added tax details.
     * <p>
     * The origin airport station passed in the request is validated against the station service to find out
     * whether the given origin is an airport station.If the origin station exists, then the tax rate for
     * given origin is updated.
     * <p>
     * <b>Run Time Parameters:</b><br>
     * 
     * <pre>
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_DAYS}
     * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_EFFECTIVE_DATE}
     * </pre>
     * <p>
     * <b>Errors: </b><br>
     * <b>The following Error Codes are returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <br>
     * <code>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_INFO_VAT_DOES_NOT_EXIST}</td>
     *            <td>No tax rate exists for the airport.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#EFFECTIVE_TAX_RATE_CONT_UPDATE}</td>
     *            <td>Tax rate cannot be updated.Rate is in effect.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#EXPIRED_TAX_RATE_CONT_UPDATE}</td>
     *            <td>Expired tax rate cannot be updated.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_ENDDATE_PRIOR_EFFECTIVE_DATE}</td>
     *            <td>End Date cannot be prior to the effective date.
     *            It can be same date as effective date.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_CPARAM_FUTURE_INVALID_DATE}</td>
     *            <td>Input date cannot be before than the current date.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_CPARAM_EFFECTIVE_DATE_ZERO_INVALID}</td>
     *            <td>The Effective Date must be tomorrow or later (When LMS parameter allowed
     *            effective date. is 0).</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_CPARAM_END_DATE_INVALID}</td>
     *            <td>Input date cannot be greater than future allowable input days.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_DATE_OVERLAP}</td>
     *            <td>Date range overlaps. Date must be greater than end date of existing entry.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.MessageConstants#TAX_ENDDATE_UPDATED_PRIOR_EFFECTIVE_DATE}</td>
     *            <td>The effective date must be at least one day after the previous cycles end date and
     *            must be allowed effective date.</td>
     *            </tr>
     *            </code>
     * </table>
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
     * @param pValueAddedTaxPersistRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.ValueAddedTaxPersistRequest
     *            ValueAddedTaxPersistRequest}</code><br>
     *            The request object includes the attributes to create a VAT tax<br>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.ValueAddedTaxDto
     *            ValueAddedTaxDto} - (M)</code>
     *            <ul>
     *            <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.ValueAddedTaxDto#setOrigin
     *            origin} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDto#setOId oId} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDto#setEffectiveDate effectiveDate} -
     *            (M)</code> <li><code>{@link com.unisys.trans.logistics.lms.rating.dto.TaxDto#setEndDate
     *            endDate} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.TaxDto#setRate rate} - (M)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code>{@link com.unisys.trans.logistics.lms.rating.dto.ValueAddedTaxResponse
     *         ValueAddedTaxResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.ValueAddedTaxResponse#getValueAddedTaxes
     *         valueAddedTaxes} </ul> </code>
     *         <p>
     * @throws LMSException If the update of VAT fails.
     */
    ValueAddedTaxResponse updateValueAddedTax(ValueAddedTaxPersistRequest pValueAddedTaxPersistRequest)
                throws LMSException;
}