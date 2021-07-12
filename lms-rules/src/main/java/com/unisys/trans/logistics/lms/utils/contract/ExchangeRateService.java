/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.ConvertCurrencyRequest;
import com.unisys.trans.logistics.lms.utils.dto.ConvertCurrencyResponse;
import com.unisys.trans.logistics.lms.utils.dto.ExchangeRateDeleteRequest;
import com.unisys.trans.logistics.lms.utils.dto.ExchangeRateDto;
import com.unisys.trans.logistics.lms.utils.dto.ExchangeRateFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.ExchangeRatePersistRequest;
import com.unisys.trans.logistics.lms.utils.dto.ExchangeRateResponse;

/**
 * <code>ExchangeRateService</code> deals with different operations to maintain bank selling rate/IATA
 * exchange rate for a pair of currencies.
 * <p>
 * This performs the following functions.<br>
 * <ul>
 * <li>Retrieves the exchange rate information based on the input currency pair
 * <li>Persists the exchange rate information and returns the exchange rates information
 * <li>Deletes an exchange rate record using the OID and returns the exchange rates information
 * <li>Converts the input amount from From-Currency to To-Currency and returns the converted amount.
 * </ul>
 * <ul>
 * <li>Bank selling rates are used for converting transportation charges to the Air Waybill Currency or Origin
 * currency of the air waybill. The Bank selling rate is an exchange rate that is used to convert from a
 * specific currency to a specific currency. The exchange rate is a factor that multiplies by the
 * from-currency to get the amount in the to-currency.<br>
 * <br>
 * <li>The IATA exchange rate is an exchange rate for a currency to US dollars. There are two types of IATA
 * exchange rates maintained.
 * <ul>
 * <li>IATA Five Day Exchange Rates<br>
 * The IATA five day exchange rates are the default exchange rates used to convert from one currency to
 * another. They are mainly used to convert transportation charges, other charges, and valuation charges for
 * an air waybill.<br>
 * <br>
 * <li>IATA Rating Exchange Rates<br>
 * The IATA rating exchange rates are mainly used for currency conversion during rate construction for pricing
 * an air waybill.
 * </ul>
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.utils.dto.ExchangeRatePersistRequest ExchangeRatePersistRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.ExchangeRateFindRequest ExchangeRateFindRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.ExchangeRateResponse ExchangeRateResponse
 * @see com.unisys.trans.logistics.lms.utils.dto.ExchangeRateDeleteRequest ExchangeRateDeleteRequest
 */
public interface ExchangeRateService {

    /**
     * Converts the input amount from FromCurrency to ToCurrency based on the exchange rate type code.
     * <p>
     * <b>Related methods include:</b>
     * <ul>
     * <li>
     * <code>{@link com.unisys.trans.logistics.lms.utils.contract.ExchangeRateService#findExchangeRate findExchangeRate}</code>
     * </ul>
     * <p>
     * Calculates and returns the converted amount based on the following criteria:<br>
     * <ul>
     * <li>When Bank selling rate exist and either no EURO start date for the currencies or the input date is
     * before the EURO start date of the currencies, calculate amount using BSR for the currency pair.<br>
     * AMNT = AMNT * BSR<br>
     * AMNT rounded by the rounding factor of to-currency.<br>
     * <br>
     * <li>When Bank selling rate does not exist and no EURO start date for the to currency, calculate amount
     * using IATA exchange rate.<br>
     * AMNT = (AMNT/FEXCH)*TEXCH<br>
     * AMNT rounded by the rounding factor of to-currency.<br>
     * <br>
     * <li>When the Euro start date exists for the currency and when the input date is on or after the EURO
     * start date and before currency end date, calculate amount using IATA exchange rate.<br>
     * <br>
     * <ul>
     * <li>Euro start date exist for to-currency (Former to-currency),<br>
     * AMNT = AMNT*RATE1<br>
     * AMNT rounded by the rounding factor 0.001<br>
     * AMNT = AMNT * RATE3<br>
     * AMNT rounded by the rounding factor of to-currency.<br>
     * Example: For USD to GRD you must convert USD to EUR and then EUR to GRD.<br>
     * <br>
     * <li>Euro start date exist for from-currency (Former From-currency)<br>
     * AMNT = AMNT/RATE2<br>
     * AMNT rounded by the rounding factor 0.001.<br>
     * AMNT = AMNT * RATE3<br>
     * AMNT rounded by the rounding factor of to-currency.<br>
     * Example: For GRD to USD you must convert GRD to EUR and then EUR to USD.<br>
     * <br>
     * </ul>
     * <li>When both from and to currencies are former currencies<br>
     * AMNT = AMNT*RATE2<br>
     * AMNT rounded by the rounding factor 0.001<br>
     * AMNT = AMNT * RATE3<br>
     * AMNT rounded by the rounding factor of to-currency<br>
     * <br>
     * Example: For DEM to GRD you must convert EUR to DEM and then EUR to GRD.<br>
     * <br>
     * <li>When input date is after the currency end date no conversion is possible as the former EURO
     * currency is no longer valid tender.<br>
     * </ul>
     * where <br>
     * AMNT – Amount to be converted.<br>
     * BSR – Bank selling rate for currency pair (From-currency and to-currency).<br>
     * FEXCH - IATA exchange rate for the from-currency.<br>
     * TEXCH - IATA exchange rate for the to-currency.<br>
     * RATE1 – BSR for From-currency to Euro exchange rate. (When BSR does not exist RATE1 = IATA 5 day
     * exchange rate of to-currency/IATA 5 day exchange rate of from-currency).<br>
     * RATE2 – BSR for Euro to from- currency exchange rate. (When BSR does not exist RATE2 = IATA 5 day
     * exchange rate of Euro/IATA 5 day exchange rate of from-currency).<br>
     * RATE3 – BSR for Euro to to-currency exchange rate. (When BSR does not exist RATE3 = IATA 5 day exchange
     * rate of Euro/IATA 5 day exchange rate of to-currency).<br>
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
     * <b>The following Error Codes may be returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5" >
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#EXCHANGERATE_EUROCURRENCY_DOES_NOT_EXIST}</code>
     * </td>
     * <td>Euro Currency does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#EXCHANGE_RATE_NOT_AVAILABLE}</code>
     * </td>
     * <td>No exchange rate present in the system for the given currency pair.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#EXCHANGERATE_CONVERSION_NOT_POSSIBLE}</code>
     * </td>
     * <td>Conversion is not possible when the former EURO currency is no longer valid tender.</td> <br>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pConvertCurrencyRequest the request object includes the attributes to convert the input amount
     *            FromCurrency to ToCurrency based on the exchange rate type code.<br>
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.ConvertCurrencyRequest
     *            ConvertCurrencyRequest} <ul> <li>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ConvertCurrencyRequest#setAmount amount} -
     *            (M) <li>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ConvertCurrencyRequest#setBillingCurrencyCode
     *            billingCurrencyCode} - (O) <li>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ConvertCurrencyRequest#setConversionDate
     *            conversionDate} - (O) <li>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ConvertCurrencyRequest#setExchangeRateTypeCode
     *            exchangeRateTypeCode} - (M) <li>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ConvertCurrencyRequest#setFromCurrencyCode
     *            fromCurrencyCode} - (M) <li>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ConvertCurrencyRequest#setToCurrencyCode
     *            toCurrencyCode} - (O) </ul> </code>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.ConvertCurrencyResponse
     *         ConvertCurrencyResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.ConvertCurrencyResponse#getConvertCurrency()
     *         convertCurrency} </ul> </code>
     *         <p>
     * @throws LMSException If validation fails the above mentioned error codes are returned. Each CodeMessage
     *             contains the status code,human readable message and message type.
     */

    ConvertCurrencyResponse convertAmount(ConvertCurrencyRequest pConvertCurrencyRequest) throws LMSException;

    /**
     * Creates an exchange rate or bank selling rate for a currency pair for a specific period.
     * <p>
     * Creates an exchange rate for a pair of currencies for a period.when there is no exchange rate/bank
     * selling rate exist for the specific pair,creates a new entry.System creates an exchange rate/bank
     * selling rate with the previous effective rate end dated to the day before the effective date of the new
     * rate,if one exists and is not already end dated.There must be no gap in time between versions of
     * exchange rate.Time gap is allowed in versions of bank selling rate. System returns list of bank selling
     * rate/IATA exchange rate with newly created data.<br>
     * <p>
     * <b>Run Time Parameters:</b>
     * 
     * <pre>
     * {@link com.unisys.trans.logistics.lms.framework.constants#IATA_EXCHANGE_RATE_BASE_CURRENCY}                                     
     * {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#ALLOWABLE_EFFECTIVE_DATE}
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
     * <b>The following Error Codes may be returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#EXCHANGERATE_FROM_TO_CURRENCY_CODE_DO_NOT_EXIST}</code>
     * </td>
     * <td align="left">Both From Currency and To Currency do not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#EXCHANGERATE_FROMCURRENCY_DOES_NOT_EXIST}</code>
     * </td>
     * <td align="left">From Currency does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#EXCHANGERATE_TOCURRENCY_DOES_NOT_EXIST}</code>
     * </td>
     * <td align="left">To Currency does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#EXCHANGERATE_INVALID_EFFECTIVEDATE_LATER}</code>
     * </td>
     * <td align="left">The effective date must be later than today's date.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#EXCHANGERATE_INVALID_EFFECTIVEDATE_TODAY_OR_LATER}</code>
     * </td>
     * <td align="left">The effective date must be equal or later than today's date.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#EXCHANGERATE_INVALID_EFFECTIVE_DATE}</code>
     * </td>
     * <td>The entered effective date of the new rate is before or same as the effective date of the currently
     * effective exchange rate.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#EXCHANGERATE_EFFECTIVEDATE_BEFORE_ENDDATE}</code>
     * </td>
     * <td align="left">The entered effective date of the new rate is before or same as the end date of the
     * currently effective exchange rate.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#EXCHANGERATE_NO_TIME_GAP}</code>
     * </td>
     * <td align="left">There must be no gap in time between versions of exchange rates.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#EXCHANGE_RATE_EFFECTIVEDATE_AFTER_ENDDATE}</code>
     * </td>
     * <td align="left">The entered effective date is after entered end date.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pExchangeRatePersistRequest holds the attributes to create exchange rate information.<br>
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.ExchangeRatePersistRequest
     *            ExchangeRatePersistRequest}</code><br>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ExchangeRateDto ExchangeRateDto}
     *            - (M)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ExchangeRateDto#setEffectiveDate
     *            effectiveDate} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ExchangeRateDto#setEndDate endDate} - (O)
     *            </code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ExchangeRateDto#setExchangeRate
     *            exchangeRate} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ExchangeRateDto#setExchangeRateTypeCode
     *            exchangeRateTypeCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ExchangeRateDto#setFromCurrencyCode
     *            fromCurrencyCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ExchangeRateDto#setOId oId} - (C)</code><br>
     *            Prohibited for create method,mandatory otherwise. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ExchangeRateDto#setToCurrencyCode
     *            toCurrencyCode} - (M)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.ExchangeRateResponse
     *         ExchangeRateResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.ExchangeRateResponse#getExchangeRates
     *         exchangeRates}- (1:*) <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.ExchangeRateDto ExchangeRateDto} </ul> </ul>
     *         </code>
     *         <p>
     * @throws LMSException If validation fails the above mentioned error codes are returned. Each CodeMessage
     *             contains the status code,human readable message and message type.
     */
    ExchangeRateResponse createExchangeRate(ExchangeRatePersistRequest pExchangeRatePersistRequest)
                throws LMSException;

    /**
     * Deletes the bank selling rate/IATA exchange rate.
     * <p>
     * Deletes the bank selling rate/IATA exchange rate based on the following condition:
     * <ul>
     * <li>The bank selling rate/IATA exchange rate presently in effect cannot be deleted.
     * <li>The past Bank Selling Rates cannot be deleted too,deletion can occur on latest Bank Selling Rates
     * /IATA exchange rate that are yet to come into effect.<br>
     * </ul>
     * After deletion the system returns the bank selling rate/IATA exchange rate data with out the deleted
     * bank selling rate/IATA exchange rate.
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
     * <b>Errors:</b><br>
     * <b>The following Error Codes may be returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#EXCHANGERATE_INVALID_DELETE_OID}</code>
     * </td>
     * <td align="left">OId of the exchange rate getting deleted is not equal to the oid of latest effective
     * exchange rate present in system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#EXCHANGERATE_INVALID_DELETE_DATE}</code>
     * </td>
     * <td align="left">The entered effective date of the new rate is before or same as the effective date of
     * the currently effective exchange rate.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pExchangeRateDeleteRequest the request object includes the attributes to delete an exchange
     *            rate.<br>
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.ExchangeRateDeleteRequest
     *            ExchangeRateDeleteRequest} <ul> <li>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ExchangeRateDeleteRequest#setExchangeRateTypeCode
     *            exchangeRateTypeCode} - (M) <li>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ExchangeRateDeleteRequest#setFromCurrencyCode
     *            fromCurrencyCode} - (O) <li>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ExchangeRateDeleteRequest#setOId oId} - (M)
     *            <li>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ExchangeRateDeleteRequest#setToCurrencyCode
     *            toCurrencyCode} - (O) </ul> </code>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.ExchangeRateResponse
     *         ExchangeRateResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.ExchangeRateResponse#getExchangeRates
     *         exchangeRates}- (1:*) <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.ExchangeRateDto ExchangeRateDto} </ul> </ul>
     *         </code>
     *         <p>
     * @throws LMSException If validation fails the above mentioned error codes are returned. Each CodeMessage
     *             contains the status code,human readable message and message type.
     */
    ExchangeRateResponse deleteExchangeRate(ExchangeRateDeleteRequest pExchangeRateDeleteRequest)
                throws LMSException;

    /**
     * Retrieves the exchange rate for a pair of currencies.<br>
     * <p>
     * <b>Related methods include:</b>
     * <ul>
     * <li>
     * <code>{@link com.unisys.trans.logistics.lms.utils.contract.ExchangeRateService#convertAmount convertAmount}</code>
     * </ul>
     * This method calculates exchange rate for a given pair of currencies.
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
     * <b>Errors:</b><br>
     * <b>The following Error Codes may be returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#EXCHANGE_RATE_NOT_AVAILABLE}</code>
     * </td>
     * <td align="left">No exchange rate for the Currency pair from currency and to currency</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pExchangeRateFindRequest the request object includes the attributes to find exchange rate .<br>
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.ExchangeRateFindRequest
     *            ExchangeRateFindRequest}<br> <ul> <li>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ExchangeRateFindRequest#setExchangeRateTypeCode
     *            exchangeRateTypeCode} - (M) <li>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ExchangeRateFindRequest#setFromCurrencyCode
     *            fromCurrencyCode} - (O) <li>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ExchangeRateFindRequest#setToCurrencyCode
     *            toCurrencyCode} - (M) </ul> </code>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.ExchangeRateDto ExchangeRateDto}</code><br>
     *         <p>
     * @throws LMSException If validation fails the above mentioned error codes are returned. Each CodeMessage
     *             contains the status code,human readable message and message type.
     */
    ExchangeRateDto findExchangeRate(ExchangeRateFindRequest pExchangeRateFindRequest) throws LMSException;

    /**
     * Retrieves the bank selling rate/IATA exchange rates.
     * <p>
     * Returns both the Bank selling rate/IATA exchange rate for the retrieved currency code based on the
     * following input provided by the actor:<br>
     * <ul>
     * <li>When both from and to currencies are provided by the actor, it returns all the rates (past,
     * present, future rates) for the currency pair.<br>
     * <li>When only to currency is provided, it returns the rates (that are effective currently) for all the
     * currencies against the provided To currency.<br>
     * </ul>
     * <p>
     * <b>Run Time Parameters:</b>
     * 
     * <pre>
     *  {@link com.unisys.trans.logistics.lms.framework.constants#IATA_EXCHANGE_RATE_BASE_CURRENCY}
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
     * <b>Errors:</b><br>
     * <b>The following Error Codes may be returned:</b><br>
     * <table border="0" cellspacing="0" cellpadding="5">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#EXCHANGERATE_FROM_TO_CURRENCY_CODE_DO_NOT_EXIST}</code>
     * </td>
     * <td align="left">Both From Currency and To Currency do not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#EXCHANGERATE_FROMCURRENCY_DOES_NOT_EXIST}</code>
     * </td>
     * <td align="left">From Currency does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#EXCHANGERATE_TOCURRENCY_DOES_NOT_EXIST}</code>
     * </td>
     * <td align="left">To Currency does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#EXCHANGERATE_INVALID_INVALID_TOCURRENCY}</code>
     * </td>
     * <td align="left">To currency and control parameter both are same.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#EXCHANGERATE_INVALID_INVALID_FROM_TO}</code>
     * </td>
     * <td align="left">From currency and To currency both are same.</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pExchangeRateFindRequest the request object includes the attributes to find exchange rate .<br>
     *            <code> {@link com.unisys.trans.logistics.lms.utils.dto.ExchangeRateFindRequest
     *            ExchangeRateFindRequest} <ul> <li>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ExchangeRateFindRequest#setExchangeRateTypeCode
     *            exchangeRateTypeCode} - (M) <li>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ExchangeRateFindRequest#setFromCurrencyCode
     *            fromCurrencyCode} - (O) <li>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ExchangeRateFindRequest#setToCurrencyCode
     *            toCurrencyCode} - (M) </ul> </code>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.ExchangeRateResponse
     *         ExchangeRateResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.ExchangeRateResponse#getExchangeRates
     *         exchangeRates}- (1:*) <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.utils.dto.ExchangeRateDto ExchangeRateDto} </ul> </ul>
     *         </code>
     *         <p>
     * @throws LMSException If validation fails the above mentioned error codes are returned. Each CodeMessage
     *             contains the status code,human readable message and message type.
     */
    ExchangeRateResponse findExchangeRates(ExchangeRateFindRequest pExchangeRateFindRequest)
                throws LMSException;
}
