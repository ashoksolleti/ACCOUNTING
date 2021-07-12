package com.unisys.trans.logistics.lms.accounting.contract;

import com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementCarrierRequest;
import com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementCarrierResponse;
import com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsFindRequest;
import com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsPersistRequest;
import com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsResponse;
import com.unisys.trans.logistics.lms.framework.dto.BatchRequest;
import com.unisys.trans.logistics.lms.framework.dto.BatchResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

/**
 * <code>InterlineAgreementsService</code> handles the InterlineAgreements
 * <p>
 * This service has the following functions:
 * <ul>
 * <li>Create a InterlineAgreements.
 * <li>Find a InterlineAgreements.
 * <li>Update a InterlineAgreements.
 * <li>Find Carriers For Agreements.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsFindRequest
 *      InterlineAgreementsFindRequest
 * @see com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsPersistRequest
 *      InterlineAgreementsPersistRequest
 * @see com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementCarrierRequest
 *      InterlineAgreementCarrierRequest
 * @see com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsResponse
 *      InterlineAgreementsResponse
 * @see com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementCarrierResponse
 *      InterlineAgreementCarrierResponse
 */

public interface InterlineAgreementsService {

    /**
     * Creates the InterlineAgreements for AirwayBillOrigin,
     * AirwayBillDestination and Carrier.
     * <p>
     * The system validates the input provided by the user. Finds if Interline agreements already exists for
     * given AirwayBillOrigin, AirwayBillDestination and Carrier. If agreement does not exist each Agreement
     * is validated for entries it creates the Interline Agreements for Airway bill Origin and Airaway bill
     * Destination. The Airway bill Origin and Airaway bill Destination Type can be
     * City,Airport,Country,Country-Aggregate.
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.accounting.contract.InterlineAgreementsService #updateInterlineAgreements
     * updateInterlineAgreements}<br>
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
     * <p>
     * <b>Errors:</b> <br>
     * <b>The following Error Codes may be returned :</b>
     * <table border="1" cell spacing="0" * cell padding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#INTERLINE_AGREEMENT_ALREADY_EXIST_ORIGIN_DESTINATION
     * INTERLINE_AGREEMENT_ALREADY_EXIST_ORIGIN_DESTINATION}</code></td>
     * <td align="left">Interline Agreement already exist for origin and destination.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#INTERLINE_AGREEMENT_ALREADY_EXIST_FOR_AGREEMENT_ID
     * INTERLINE_AGREEMENT_ALREADY_EXIST_FOR_AGREEMENT_ID}</code></td>
     * <td align="left">Interline Agreement already exists for the given Agreement Identifier.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * .MessageConstants#CARRIER_CODE_MARKED_FOR_DELETION CARRIER_CODE_MARKED_FOR_DELETION}</code></td>
     * <td align="left">Carrier Code is marked for deletion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#CARRIER_NUMBER_MARKED_FOR_DELETION
     * CARRIER_NUMBER_MARKED_FOR_DELETION}</code></td>
     * <td align="left">Carrier Number is marked for deletion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#CURRENCY_MUST_HAVE_ROUNDING_FACTOR_AND_DECIMAL
     *  CURRENCY_MUST_HAVE_ROUNDING_FACTOR_AND_DECIMAL}</code></td>
     * <td align="left">The Currency must have Rounding Factor and Decimal Positions.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#EFFECTIVE_DATE_CANNOT_BE_PAST_DATE EFFECTIVE_DATE_CANNOT_BE_PAST_DATE}</code></td>
     * <td align="left">The Effective Date must not be past date if dynamic parameter "Effective Date Control"
     * is 'N'.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#RATE_TYPE_MARKED_FOE_DELETION RATE_TYPE_MARKED_FOE_DELETION}</code></td>
     * <td align="left">The Rate Type is marked for deletion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#EXPIRATION_DATE_MUST_BE_EQUAL_OR_GREATER_THAN_EFFECTIVE_DATE 
     * EXPIRATION_DATE_MUST_BE_EQUAL_OR_GREATER_THAN_EFFECTIVE_DATE}</code></td>
     * <td align="left">The Expiration Date must be equal or greater than Effective Date.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#PRODUCT_CODE_NOT_EFFECTIVE_FOR_SPA PRODUCT_CODE_NOT_EFFECTIVE_FOR_SPA}</code></td>
     * <td align="left">The Product Code{0} is not effective for the input special prorate agreement's date
     * range.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#PRODUCT_CODE_NOT_EFFECTIVE_FOR_PROVISO PRODUCT_CODE_NOT_EFFECTIVE_FOR_PROVISO}</code></td>
     * <td align="left">The Product Code{0} is not effective for the input interline carrier proviso's date
     * range.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * .MessageConstants#COMMODITY_CODE_HAS_DUPLICATES COMMODITY_CODE_HAS_DUPLICATES}</code></td>
     * <td align="left">Commodity code has duplicates.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#SPECIAL_HANDLING_CODE_HAS_DUPLICATES
     *  SPECIAL_HANDLING_CODE_HAS_DUPLICATES}</code></td>
     * <td align="left">Special Handling code has duplicates.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#FLIGHT_NUMBER_CODE_HAS_DUPLICATES
     *  FLIGHT_NUMBER_CODE_HAS_DUPLICATES}</code></td>
     * <td align="left">Flight number has duplicates.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#OTHER_CHARGE_CODE_HAS_DUPLICATES OTHER_CHARGE_CODE_HAS_DUPLICATES}</code></td>
     * <td align="left">Other charge code has duplicates.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#COMMODITY_MARKED_FOR_DELETION COMMODITY_MARKED_FOR_DELETION}</code></td>
     * <td align="left">The commodity is marked for deletion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#ULD_TYPE_CODE_HAS_DUPLICATES ULD_TYPE_CODE_HAS_DUPLICATES}</code></td>
     * <td align="left">ULD Type code has duplicates.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#ULD_TYPE_MARKED_FOR_DELETION ULD_TYPE_MARKED_FOR_DELETION}</code></td>
     * <td align="left">The ULD Type is marked for deletion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#MAXIMUM_AMOUNT_GREATER_THAN_MINIMUM_AMOUNT MAXIMUM_AMOUNT_GREATER_THAN_MINIMUM_AMOUNT}</code>
     * </td>
     * <td align="left">Maximum Amount must be greater than or equal to Minimum Amount.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#MAXIMUM_WEIGHT_GREATER_THAN_MINIMUM_WEIGHT MAXIMUM_WEIGHT_GREATER_THAN_MINIMUM_WEIGHT}</code>
     * </td>
     * <td align="left">Maximum Weight must be greater than or equal to Minimum Weight.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#MAXIMUM_PERCENT_GREATER_THAN_MINIMUM_PERCENT MAXIMUM_PERCENT_GREATER_THAN_MINIMUM_PERCENT}</code>
     * </td>
     * <td align="left">Maximum Weight must be greater than or equal to Minimum Weight.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#MAXIMUM_PERCENT_GREATER_THAN_MINIMUM_PERCENT
     * WEIGHT MAXIMUM_PERCENT_GREATER_THAN_MINIMUM_PERCENT}</code></td>
     * <td align="left">Maximum Weight Must Not Precede Minimum Percent.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pInterlineAgreementsPersistRequest
     *            <code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsPersistRequest
     *            InterlineAgreementsPersistRequest}</code><br>
     *            includes the attributes to create a <code>InterlineAgreements </code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsDto
     *            InterlineAgreementsDto}</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsDto#setAgreementIdentifier
     *            AgreementIdentifier} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsDto#setAgreementType
     *            AgreementType} - (M)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsDto#setAirWayBillDestination
     *            AirWayBillDestination} - (M)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsDto#setAirWayBillOrigin
     *            AirWayBillOrigin} - (M)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsDto#setCarrier
     *            Carrier} - (M)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsDto#setIssuingACN
     *            IssuingACN} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsDto#setInterlineAgreementsEntries
     *            InterlineAgreementsEntries} - (1:*)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setCommodityNumber
     *            CommodityNumber} - (C) Mandatory if Rate Type is SCR </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setCurrencyCode
     *            CurrencyCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setDateRangeDto
     *            DateRangeDto}</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.DateRangeDto#setEffectiveDate
     *            EffectiveDate} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.DateRangeDto#setExpirationDate
     *            ExpirationDate} - (O)</code>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setCommissionPercent
     *            CommissionPercent} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setCommodity
     *            Commodity} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setCurrencyCode
     *            CurrencyCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setFirstCarrierIndicator
     *            FirstCarrierIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setFlightNumber
     *            FlightNumber} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setFlightNumberRule
     *            FlightNumberRule} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setIntermediateCarrierIndicator
     *            IntermediateCarrierIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setLastCarrierIndicator
     *            LastCarrierIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setMaximumAmount
     *            MaximumAmount} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setMaximumPercent
     *            MaximumPercent} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setMaximumWeight
     *            MaximumWeight} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setMinimumAmount
     *            MinimumAmount} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setMinimumPercent
     *            MinimumPercent} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setMinimumWeight
     *            MinimumWeight} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setOtherChargeCode
     *            OtherChargeCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setOtherChargeRule
     *            OtherChargeRule} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setOverPivotRate
     *            OverPivotRate} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setPivotWeight
     *            PivotWeight} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setProductCode
     *            ProductCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setProrateId
     *            ProrateId} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setProvisotype
     *            Provisotype} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setRate
     *            Rate} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setRateBasedOn
     *            RateBasedOn} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setSegmentDestination
     *            SegmentDestination} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setSegmentOrigin
     *            SegmentOrigin} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setSpecialHandlingCodes
     *            SpecialHandlingCodes} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setTc1Indicator
     *            Tc1Indicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setTc2Indicator
     *            Tc2Indicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setTc3Indicator
     *            Tc3Indicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setTransatlanticIndicator
     *            TransatlanticIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setTranspacificIndicator
     *            TranspacificIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setUldType
     *            UldType} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setUldTypeRule
     *            UldTypeRule} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setWeightType
     *            WeightType} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setWeightUnit
     *            WeightUnit} - (M)</code> <li><code>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion
     *            version} -(C) Prohibited for create operation.</code></br>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsResponse
     *         InterlineAgreementsResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.accounting.constants. MessageConstants#INTERLINE_AGREEMENT_CREATED_SUCCESSFULLY
     *         INTERLINE_AGREEMENT_CREATED_SUCCESSFULLY} </code> <br>
     *         <code>for successful create.</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsResponse#getInterlineAgreementsEntryDto()
     *         InterlineAgreementsEntryDto} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto
     *         InterlineAgreementsEntryDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */
    InterlineAgreementsResponse createInterlineAgreements(
                final InterlineAgreementsPersistRequest pInterlineAgreementsPersistRequest)
                throws LMSException;

    /**
     * Finds carriers associated with InterlineAgreements based on the agreement
     * type.
     * <p>
     * This method returns a carriers details associated with Agreements.
     * <p>
     * To find the TariffRate user must provide following input:<br>
     * <li>AgreementType.<br>
     * <li>Carrier.<br>
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
     * <p>
     * <p>
     * 
     * @param pInterlineAgreementCarrierRequest
     *            <code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementCarrierRequest
     *            InterlineAgreementCarrierRequest}</code><br>
     *            includes the attributes to find <code>carrier's</code>.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementCarrierRequest#setAgreementType
     *            AgreementType} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementCarrierRequest#setCarrier
     *            Aarrier} - (O)</code> <li><code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementCarrierResponse
     *         InterlineAgreementCarrierResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code></li> holds the CodeMessage <br>
     *         <li><code>
     *         {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementCarrierResponse#getCarrierDto()
     *         Carrier Details}</code></li> holds the Carrier Code and name
     *         </ul>
     * <br>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */
    InterlineAgreementCarrierResponse findCarriersForAgreements(
                final InterlineAgreementCarrierRequest pInterlineAgreementCarrierRequest)
                throws LMSException;

    InterlineAgreementsResponse findExpiredInterlineAgreements(
                final InterlineAgreementsFindRequest pInterlineAgreementsFindRequest)
                throws LMSException;

    /**
     * Finds the InterlineAgreements for given AirwayBillOrigin,
     * AirwayBillDestination and Carrier and other filters.
     * <p>
     * The system validates the input provided by the user. Finds if Interline agreements exists for given
     * AirwayBillOrigin, AirwayBillDestination and Carrier and date filters given. If agreement does not exist
     * each Agreement is validated for entries it throws error. The Airway bill Origin and Airway bill
     * Destination Type can be City,Airport,Country,Country-Aggregate.
     * 
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
     * <p>
     * <b>Errors:</b> <br>
     * <b>The following Error Codes may be returned :</b>
     * <table border="1" cell spacing="0" * cell padding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#INTERLINE_AGREEMENT_DOES_NOT_EXIST_FOR_THE_GIVEN_FIELDS
     * INTERLINE_AGREEMENT_DOES_NOT_EXIST_FOR_THE_GIVEN_FIELDS}</code></td>
     * <td align="left">No Interline Agreements found for the given fields</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#CARRIER_MANDATORY_FOR_ACN
     * CARRIER_MANDATORY_FOR_ACN}</code></td>
     * <td align="left">To Carrier is required when entering ACN</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pInterlineAgreementsFindRequest
     *            <code> {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsFindRequest
     *            InterlineAgreementsFindRequest}</code><br>
     *            includes the attributes to find a <code>InterlineAgreements </code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsFindDto
     *            InterlineAgreementsFindDto}</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsFindDto#setAgreementIdentifier
     *            AgreementIdentifier} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsFindDto#setAirWayBillDestination
     *            AgreementType} - (M)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsFindDto#setAirWayBillOrigin
     *            AirWayBillDestination} - (M)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsFindDto#setAgreementType
     *            AirWayBillOrigin} - (M)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsFindDto#setDateRange
     *            Carrier} - (M)</code> <br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.DateRangeDto#setEffectiveDate
     *            EffectiveDate} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.DateRangeDto#setExpirationDate
     *            ExpirationDate} - (O)</code>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsFindDto#setIssuingACN
     *            IssuingACN} - (M)</code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsFindDto#setToCarrier
     *            IssuingACN} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion
     *            version} -(C) Prohibited for create operation.</code></br>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsResponse
     *         InterlineAgreementsResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsResponse#getInterlineAgreementsEntryDto()
     *         InterlineAgreementsEntryDto} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto
     *         InterlineAgreementsEntryDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */
    InterlineAgreementsResponse findInterlineAgreements(
                final InterlineAgreementsFindRequest pInterlineAgreementsFindRequest)
                throws LMSException;

    BatchResponse findInterlineAgreementsByUpdatedDate(
                final BatchRequest pBatchRequest) throws LMSException;

    /**
     * Updates the InterlineAgreements for AirwayBillOrigin,
     * AirwayBillDestination and Carrier.
     * <p>
     * The system validates the input provided by the user. Finds if Interline agreements already exists for
     * given AirwayBillOrigin, AirwayBillDestination and Carrier. If agreement does not exist each Agreement
     * is validated for entries it creates the Interline Agreements for Airway bill Origin and Airaway bill
     * Destination. The Airway bill Origin and Airaway bill Destination Type can be
     * City,Airport,Country,Country-Aggregate.
     * <p>
     * <b> Related methods include:</b><br>
     * {@link com.unisys.trans.logistics.lms.accounting.contract.InterlineAgreementsService #updateInterlineAgreements
     * updateInterlineAgreements}<br>
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
     * <p>
     * <b>Errors:</b> <br>
     * <b>The following Error Codes may be returned :</b>
     * <table border="1" cell spacing="0" * cell padding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#INTERLINE_AGREEMENT_ALREADY_EXIST_ORIGIN_DESTINATION
     * INTERLINE_AGREEMENT_ALREADY_EXIST_ORIGIN_DESTINATION}</code></td>
     * <td align="left">Interline Agreement already exist for origin and destination.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#INTERLINE_AGREEMENT_ALREADY_EXIST_FOR_AGREEMENT_ID
     * INTERLINE_AGREEMENT_ALREADY_EXIST_FOR_AGREEMENT_ID}</code></td>
     * <td align="left">Interline Agreement already exists for the given Agreement Identifier.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#RATE_SOURCE_MARKED_FOR_DELETION RATE_SOURCE_MARKED_FOR_DELETION}</code></td>
     * <td align="left">Rate Source is marked for deletion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * .MessageConstants#CARRIER_CODE_MARKED_FOR_DELETION CARRIER_CODE_MARKED_FOR_DELETION}</code></td>
     * <td align="left">Carrier Code is marked for deletion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#CARRIER_NUMBER_MARKED_FOR_DELETION
     * CARRIER_NUMBER_MARKED_FOR_DELETION}</code></td>
     * <td align="left">Carrier Number is marked for deletion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#CURRENCY_MUST_HAVE_ROUNDING_FACTOR_AND_DECIMAL
     *  CURRENCY_MUST_HAVE_ROUNDING_FACTOR_AND_DECIMAL}</code></td>
     * <td align="left">The Currency must have Rounding Factor and Decimal Positions.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#EFFECTIVE_DATE_CANNOT_BE_PAST_DATE EFFECTIVE_DATE_CANNOT_BE_PAST_DATE}</code></td>
     * <td align="left">The Effective Date must not be past date if dynamic parameter "Effective Date Control"
     * is 'N'.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#RATE_TYPE_MARKED_FOE_DELETION RATE_TYPE_MARKED_FOE_DELETION}</code></td>
     * <td align="left">The Rate Type is marked for deletion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#EXPIRATION_DATE_MUST_BE_EQUAL_OR_GREATER_THAN_EFFECTIVE_DATE 
     * EXPIRATION_DATE_MUST_BE_EQUAL_OR_GREATER_THAN_EFFECTIVE_DATE}</code></td>
     * <td align="left">The Expiration Date must be equal or greater than Effective Date.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#PRODUCT_CODE_NOT_EFFECTIVE_FOR_SPA PRODUCT_CODE_NOT_EFFECTIVE_FOR_SPA}</code></td>
     * <td align="left">The Product Code{0} is not effective for the input special prorate agreement's date
     * range.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#PRODUCT_CODE_NOT_EFFECTIVE_FOR_PROVISO PRODUCT_CODE_NOT_EFFECTIVE_FOR_PROVISO}</code></td>
     * <td align="left">The Product Code{0} is not effective for the input interline carrier proviso's date
     * range.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * .MessageConstants#COMMODITY_CODE_HAS_DUPLICATES COMMODITY_CODE_HAS_DUPLICATES}</code></td>
     * <td align="left">Commodity code has duplicates.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#SPECIAL_HANDLING_CODE_HAS_DUPLICATES
     *  SPECIAL_HANDLING_CODE_HAS_DUPLICATES}</code></td>
     * <td align="left">Special Handling code has duplicates.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#FLIGHT_NUMBER_CODE_HAS_DUPLICATES
     *  FLIGHT_NUMBER_CODE_HAS_DUPLICATES}</code></td>
     * <td align="left">Flight number has duplicates.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#OTHER_CHARGE_CODE_HAS_DUPLICATES OTHER_CHARGE_CODE_HAS_DUPLICATES}</code></td>
     * <td align="left">Other charge code has duplicates.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#COMMODITY_MARKED_FOR_DELETION COMMODITY_MARKED_FOR_DELETION}</code></td>
     * <td align="left">The commodity is marked for deletion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#ULD_TYPE_CODE_HAS_DUPLICATES ULD_TYPE_CODE_HAS_DUPLICATES}</code></td>
     * <td align="left">ULD Type code has duplicates.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#ULD_TYPE_MARKED_FOR_DELETION ULD_TYPE_MARKED_FOR_DELETION}</code></td>
     * <td align="left">The ULD Type is marked for deletion.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#MAXIMUM_AMOUNT_GREATER_THAN_MINIMUM_AMOUNT MAXIMUM_AMOUNT_GREATER_THAN_MINIMUM_AMOUNT}</code>
     * </td>
     * <td align="left">Maximum Amount must be greater than or equal to Minimum Amount.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#MAXIMUM_WEIGHT_GREATER_THAN_MINIMUM_WEIGHT MAXIMUM_WEIGHT_GREATER_THAN_MINIMUM_WEIGHT}</code>
     * </td>
     * <td align="left">Maximum Weight must be greater than or equal to Minimum Weight.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#MAXIMUM_PERCENT_GREATER_THAN_MINIMUM_PERCENT MAXIMUM_PERCENT_GREATER_THAN_MINIMUM_PERCENT}</code>
     * </td>
     * <td align="left">Maximum Weight must be greater than or equal to Minimum Weight.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.accounting.constants.
     * MessageConstants#MAXIMUM_PERCENT_GREATER_THAN_MINIMUM_PERCENT
     * WEIGHT MAXIMUM_PERCENT_GREATER_THAN_MINIMUM_PERCENT}</code></td>
     * <td align="left">Maximum Weight Must Not Precede Minimum Percent.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pInterlineAgreementsPersistRequest
     *            <code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsPersistRequest
     *            InterlineAgreementsPersistRequest}</code><br>
     *            includes the attributes to create a <code>InterlineAgreements </code>.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsDto
     *            InterlineAgreementsDto}</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsDto#setAgreementIdentifier
     *            AgreementIdentifier} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsDto#setAgreementType
     *            AgreementType} - (M)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsDto#setAirWayBillDestination
     *            AirWayBillDestination} - (M)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsDto#setAirWayBillOrigin
     *            AirWayBillOrigin} - (M)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsDto#setCarrier
     *            Carrier} - (M)</code> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsDto#setIssuingACN
     *            IssuingACN} - (M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsDto#setInterlineAgreementsEntries
     *            InterlineAgreementsEntries} - (1:*)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setCommodityNumber
     *            CommodityNumber} - (C) Mandatory if Rate Type is SCR </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setCurrencyCode
     *            CurrencyCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setDateRangeDto
     *            DateRangeDto}</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.DateRangeDto#setEffectiveDate
     *            EffectiveDate} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.DateRangeDto#setExpirationDate
     *            ExpirationDate} - (O)</code>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setCommissionPercent
     *            CommissionPercent} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setCommodity
     *            Commodity} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setCurrencyCode
     *            CurrencyCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setFirstCarrierIndicator
     *            FirstCarrierIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setFlightNumber
     *            FlightNumber} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setFlightNumberRule
     *            FlightNumberRule} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setIntermediateCarrierIndicator
     *            IntermediateCarrierIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setLastCarrierIndicator
     *            LastCarrierIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setMaximumAmount
     *            MaximumAmount} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setMaximumPercent
     *            MaximumPercent} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setMaximumWeight
     *            MaximumWeight} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setMinimumAmount
     *            MinimumAmount} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setMinimumPercent
     *            MinimumPercent} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setMinimumWeight
     *            MinimumWeight} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setOtherChargeCode
     *            OtherChargeCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setOtherChargeRule
     *            OtherChargeRule} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setOverPivotRate
     *            OverPivotRate} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setPivotWeight
     *            PivotWeight} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setProductCode
     *            ProductCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setProrateId
     *            ProrateId} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setProvisotype
     *            Provisotype} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setRate
     *            Rate} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setRateBasedOn
     *            RateBasedOn} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setSegmentDestination
     *            SegmentDestination} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setSegmentOrigin
     *            SegmentOrigin} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setSpecialHandlingCodes
     *            SpecialHandlingCodes} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setTc1Indicator
     *            Tc1Indicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setTc2Indicator
     *            Tc2Indicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setTc3Indicator
     *            Tc3Indicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setTransatlanticIndicator
     *            TransatlanticIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setTranspacificIndicator
     *            TranspacificIndicator} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setUldType
     *            UldType} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setUldTypeRule
     *            UldTypeRule} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setWeightType
     *            WeightType} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto#setWeightUnit
     *            WeightUnit} - (M)</code> <li><code>
     *            </ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion
     *            version} -(C) Prohibited for create operation.</code></br>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsResponse
     *         InterlineAgreementsResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.accounting.constants. MessageConstants#INTERLINE_AGREEMENT_CREATED_SUCCESSFULLY
     *         INTERLINE_AGREEMENT_CREATED_SUCCESSFULLY} </code> <br>
     *         <code>for successful create.</code> <li><code>
     *         {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsResponse#getInterlineAgreementsEntryDto()
     *         InterlineAgreementsEntryDto} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto
     *         InterlineAgreementsEntryDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */
    InterlineAgreementsResponse updateInterlineAgreements(
                final InterlineAgreementsPersistRequest pInterlineAgreementsPersistRequest)
                throws LMSException;
}
