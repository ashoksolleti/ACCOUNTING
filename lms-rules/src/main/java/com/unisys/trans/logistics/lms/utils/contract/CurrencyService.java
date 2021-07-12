/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse;
import com.unisys.trans.logistics.lms.framework.dto.ValidationRequest;
import com.unisys.trans.logistics.lms.framework.dto.ValidationResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.CurrencyDeleteRequest;
import com.unisys.trans.logistics.lms.utils.dto.CurrencyFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.CurrencyPersistRequest;
import com.unisys.trans.logistics.lms.utils.dto.CurrencyResponse;
import com.unisys.trans.logistics.lms.utils.dto.CurrencyRestoreRequest;
import com.unisys.trans.logistics.lms.utils.dto.MultipleCurrencyFindRequest;

/**
 * <code>CurrencyService</code> interface exposes the APIs which identifies
 * various processing flows involved in maintaining the currency information.
 * <p>
 * <code>CurrencyService</code> provides the following services for maintaining
 * the <code>Currency</code> information.<br>
 * This performs the following functions:
 * <ul>
 * <li>findByCurrencyCode
 * <li>findCurrencies
 * <li>createCurrency
 * <li>updateCurrency
 * <li>deleteRoundingFactor
 * <li>deleteCurrency
 * <li>restoreCurrency
 * <li>findByCurrencyCodeAndEffectiveDate
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.utils.dto.CurrencyFindRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.CurrencyPersistRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.CurrencyDeleteRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.CurrencyRestoreRequest
 * @see com.unisys.trans.logistics.lms.utils.dto.CurrencyResponse
 * @see com.unisys.trans.logistics.lms.utils.dto.MultipleCurrencyFindRequest
 * @see com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse
 * @see com.unisys.trans.logistics.lms.framework.dto.ValidationRequest
 * @see com.unisys.trans.logistics.lms.framework.dto.ValidationResponse
 */
public interface CurrencyService {

	/**
	 * Creates the <code>Currency</code> information after validating the input
	 * data.
	 * <p>
	 * <b>Related Methods :</b> <code>
	 * <ul>
	 * <li>{@link com.unisys.trans.logistics.lms.utils.contract.CurrencyService#updateCurrency UpdateCurrency}
	 * <li>{@link com.unisys.trans.logistics.lms.utils.contract.CurrencyService#deleteRoundingFactor DeleteRoundingFactor}
	 * <li>{@link com.unisys.trans.logistics.lms.utils.contract.CurrencyService#deleteCurrency DeleteCurrency}
	 * </ul>
	 * </code>
	 * <p>
	 * The new currency can be created only when the <code>ISOCode</code> is
	 * unique and the <code>numericCode</code> is unique. If the above two are
	 * unique then the system validates the following:
	 * <li>EuroStartDate
	 * <li>EffectiveDate, if the rounding factor information is provided. <br>
	 * If all the details are appropriate, the currency gets created in the
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
	 * <b>Errors: </b><br>
	 * <b>The following Error Codes are returned:</b><br>
	 * <table border="0" cellspacing="0" cellpadding="5">
	 * <br>
	 * <code>
	 *            <tr>
	 *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#CURRENCY_ISOCODE_ALREADY_EXISTS}</td>
	 *            <td>Currency code already exists.</td>
	 *            </tr>
	 *            <tr>
	 *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#CURRENCY_NUMERICCODE_ALREADY_EXISTS}</td>
	 *            <td>Numeric code already exists.</td>
	 *            </tr>
	 *            <tr>
	 *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#CURRENCY_INVALID_CONTENT_EUROSTARTDATE}</td>
	 *            <td>The Euro start date must be greater than today's date.</td>
	 *            </tr>
	 *            <tr>
	 *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#CURRENCY_INVALID_CONTENT_EFFECTIVEDATE}</td>
	 *            <td>Effective date of Rounding factor must be greater than the latest rounding factor for
	 *            the currency and it must also be greater than today's date.</td>
	 *            </tr>
	 *            </code>
	 * </table>
	 * <p>
	 * 
	 * @param pCurrencyPersistRequest
	 *            <code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.CurrencyPersistRequest
	 *            CurrencyPersistRequest}</code><br>
	 *            which includes attributes for creating a currency.
	 *            <p>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto
	 *            currency} - (M) </code><br>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto#setIsoCode
	 *            isoCode} - (M)</code><br>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto#setDescription
	 *            description} - (M)</code><br>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto#setNumericCode
	 *            numericCode} - (M)</code><br>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto#setEuroStartDate
	 *            euroStartDate} - (O)</code><br>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto#setDeletedUser
	 *            deletedUser} - (C)</code><br>
	 *            Prohibited for create operation.<br>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto#setEndDate
	 *            endDate} - (C)</code><br>
	 *            Prohibited for create operation.<br>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto#setOId
	 *            oId} - (C) </code><br>
	 *            Prohibited for create operation.<br>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion
	 *            version} - (C)</code><br>
	 *            Prohibited for create operation.<br>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto#setRoundingFactors
	 *            roundingFactors} - (O) (0:1)</code><br>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.RoundingFactorDto
	 *            RoundingFactorDto}</code><br>
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.RoundingFactorDto#setCurrencyInfoOId
	 *            currencyInfoOId} - (C)</code><br>
	 *            Prohibited for create operation. <br>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.RoundingFactorDto#setDecimalPositions
	 *            decimalPositions} - (M)</code><br>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.RoundingFactorDto#setEffectiveDate
	 *            effectiveDate} - (M)</code><br>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.RoundingFactorDto#setEndDate
	 *            endDate} - (C)</code><br>
	 *            Prohibited for create operation.<br>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.RoundingFactorDto#setOId
	 *            oId} - (C)</code><br>
	 *            Prohibited for create operation. <br>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.RoundingFactorDto#setRoundingFactor
	 *            roundingFactor} - (M)</code><br>
	 *            </ul>
	 *            </ul>
	 *            </ul>
	 *            </ul>
	 *            <p>
	 * @return <code>
	 *         {@link com.unisys.trans.logistics.lms.utils.dto.CurrencyResponse
	 *         CurrencyResponse} <ul> <li>
	 *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
	 *         Response fields} <li>
	 *         {@link com.unisys.trans.logistics.lms.utils.dto.CurrencyResponse#getCurrencies()
	 *         currencies} - (1:*) <ul> <li>
	 *         {@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto
	 *         CurrencyDto} </ul> </ul> </code>
	 *         <p>
	 * @throws LMSException
	 *             If the currency create operation fails the above mentioned
	 *             error codes are returned. Each CodeMessage contains the
	 *             status code, human readable message and message type.
	 */
	CurrencyResponse createCurrency(
			CurrencyPersistRequest pCurrencyPersistRequest) throws LMSException;

	/**
	 * Marks the <code>Currency</code> as ‘Deleted’ by updating the currency
	 * with an end date value.<br>
	 * <p>
	 * <b>Related Methods :</b> <code>
	 * <ul>
	 * <li>{@link com.unisys.trans.logistics.lms.utils.contract.CurrencyService#restoreCurrency RestoreCurrency}
	 * </ul>
	 * </code>
	 * <p>
	 * The currency is marked for deletion when the <code>endDate</code> is
	 * given for it. The system validates the <code>endDate</code> and marks the
	 * currency for deletion. <br>
	 * The currency marked for deletion can be retrieved but cannot be updated
	 * when an end date exists.<br>
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
	 *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#CURRENCY_ALREADY_DELETED}</td>
	 *            <td>Currency is already marked for deletion.</td>
	 *            </tr>
	 *            <tr>
	 *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#CURRENCY_INVALID_CONTENT_ENDDATE_WITH_EUROSTARTDATE}</td>
	 *            <td>End date must be greater than or equal to Euro start date.</td>
	 *            </tr>
	 *            <tr>
	 *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#CURRENCY_INVALID_CONTENT_ENDDATE_WITH_EFFECTIVEDATE}</td>
	 *            <td>End date must be greater than or equal to the latest effective date.</td>
	 *            </tr>
	 *            <tr>
	 *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#CURRENCY_INVALID_CONTENT_ENDDATE_WITH_CURRENTDATE}</td>
	 *            <td>End date must be greater than or equal to today's date.</td>
	 *            </tr>
	 *            </code>
	 * </table>
	 * <p>
	 * 
	 * @param pCurrencyDeleteRequest
	 *            <code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDeleteRequest
	 *            CurrencyDeleteRequest} </code><br>
	 *            which includes attributes for deleting a currency.
	 *            <p>
	 *            <ul>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto currency} - (M)</code>
	 *            <br>
	 *            <ul>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto#setIsoCode isoCode} - (M)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto#setDescription description} - (M)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto#setNumericCode numericCode} - (M)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto#setEuroStartDate euroStartDate} - (O)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto#setDeletedUser deletedUser} - (M)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto#setEndDate endDate} - (M)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto#setOId oId} - (M)</code>
	 *            - <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version} - (M)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto#setRoundingFactors roundingFactors} - (O) (0:*)</code>
	 *            <br>
	 *            <ul>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.RoundingFactorDto RoundingFactorDto}</code>
	 *            <br>
	 *            <ul>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.RoundingFactorDto#setCurrencyInfoOId currencyInfoOId} - (M)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.RoundingFactorDto#setDecimalPositions decimalPositions} - (M)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.RoundingFactorDto#setEffectiveDate effectiveDate} - (M)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.RoundingFactorDto#setEndDate endDate} - (O)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.RoundingFactorDto#setOId oId} - (M)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.RoundingFactorDto#setRoundingFactor roundingFactor} - (M)</code>
	 *            <br>
	 *            </ul>
	 *            </ul>
	 *            </ul>
	 *            </ul>
	 *            <p>
	 * @return <code>
	 *         {@link com.unisys.trans.logistics.lms.utils.dto.CurrencyResponse
	 *         CurrencyResponse} <ul> <li>
	 *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
	 *         Response fields} <li>
	 *         {@link com.unisys.trans.logistics.lms.utils.dto.CurrencyResponse#getCurrencies()
	 *         currencies} - (1:*) <ul> <li>
	 *         {@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto
	 *         CurrencyDto} </ul> </ul> </code>
	 *         <p>
	 * @throws LMSException
	 *             If the currency delete operation fails the above mentioned
	 *             error codes are returned. Each CodeMessage contains the
	 *             status code, human readable message and message type.
	 */
	CurrencyResponse deleteCurrency(CurrencyDeleteRequest pCurrencyDeleteRequest)
			throws LMSException;

	/**
	 * Deletes the <code>RoundingFactor</code> information.<br>
	 * <p>
	 * <b>Related Methods :</b> <code>
	 * <ul>
	 * <li>{@link com.unisys.trans.logistics.lms.utils.contract.CurrencyService#updateCurrency updateCurrency}
	 * </ul>
	 * </code>
	 * <p>
	 * The system validates the rounding factor information based on
	 * <code>effectiveDate</code> and <code>endDate</code> of the rounding
	 * factor and deletes the rounding factor information. <br>
	 * The currency marked for deletion can be retrieved but it's rounding
	 * factor information cannot be deleted when an end date of the currency
	 * exists.<br>
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
	 *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#CURRENCY_ALREADY_DELETED}</td>
	 *            <td>Currency is already marked for deletion.</td>
	 *            </tr>
	 *            <tr>
	 *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#CURRENCY_ROUNDINGFACTOR_PAST_NOT_DELETED}</td>
	 *            <td>Rounding factor/decimal position is ‘in-effect/past’. Cannot be deleted.</td>
	 *            </tr>
	 *            <tr>
	 *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#CURRENCY_FUTURE_ROUNDINGFACTOR_NOT_LATEST}</td>
	 *            <td>Only the Latest Rounding Factor Record can be deleted.</td>
	 *            </tr>
	 *            </code>
	 * </table>
	 * <p>
	 * 
	 * @param pCurrencyPersistRequest
	 *            <code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.CurrencyPersistRequest
	 *            CurrencyPersistRequest}</code><br>
	 *            which includes attributes for deleting a rounding factor
	 *            information.
	 *            <p>
	 *            <ul>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto currency} - (M)</code>
	 *            <br>
	 *            <ul>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto#setIsoCode isoCode} - (M)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto#setDescription description} - (M)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto#setNumericCode numericCode} - (M)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto#setEuroStartDate euroStartDate} - (O)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto#setDeletedUser deletedUser} - (M)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto#setEndDate endDate} - (M)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto#setOId oId} - (M)</code>
	 *            - <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version} - (M)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto#setRoundingFactors roundingFactors} - (O) (0:*)</code>
	 *            <br>
	 *            <ul>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.RoundingFactorDto RoundingFactorDto}</code>
	 *            <br>
	 *            <ul>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.RoundingFactorDto#setCurrencyInfoOId currencyInfoOId} - (M)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.RoundingFactorDto#setDecimalPositions decimalPositions} - (M)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.RoundingFactorDto#setEffectiveDate effectiveDate} - (M)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.RoundingFactorDto#setEndDate endDate} - (O)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.RoundingFactorDto#setOId oId} - (M)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.RoundingFactorDto#setRoundingFactor roundingFactor} - (M)</code>
	 *            <br>
	 *            </ul>
	 *            </ul>
	 *            </ul>
	 *            </ul>
	 *            <p>
	 * @return <code>
	 *         {@link com.unisys.trans.logistics.lms.utils.dto.CurrencyResponse
	 *         CurrencyResponse} <ul> <li>
	 *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
	 *         Response fields} <li>
	 *         {@link com.unisys.trans.logistics.lms.utils.dto.CurrencyResponse#getCurrencies()
	 *         currencies} - (1:*) <ul> <li>
	 *         {@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto
	 *         CurrencyDto} </ul> </ul> </code>
	 *         <p>
	 * @throws LMSException
	 *             If the delete rounding factor operation fails the above
	 *             mentioned error codes are returned. Each CodeMessage contains
	 *             the status code, human readable message and message type.
	 */
	CurrencyResponse deleteRoundingFactor(
			CurrencyPersistRequest pCurrencyPersistRequest) throws LMSException;

	/**
	 * Finds the effective rounding factor information of the
	 * <code>Currency</code> on the given input date.
	 * <p>
	 * <b>Related Method :</b> <code>
	 * <ul>
	 * <li>{@link com.unisys.trans.logistics.lms.utils.contract.CurrencyService#findCurrency findCurrency}
	 * </ul>
	 * </code>
	 * <p>
	 * The system finds the currency code that exactly matches the input
	 * currency code and fetches its associated rounding factor information
	 * which is effective on the given input date.<br>
	 * <p>
	 * <b>Run Time Parameters:</b><br>
	 * 
	 * <pre>
	 * <li>
	 * {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#CURRENCY_ROUNDING_FACTOR}
	 * <li>
	 * {@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#CURRENCY_DECIMAL_POSITION}
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
	 * 
	 * @param pMultipleCurrencyFindRequest
	 *            <code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest
	 *            MultipleFindRequest} </code><br>
	 *            contains the list of search input values.
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest#setSearchInputs
	 *            searchInputs} - (M) (1:*)</code><br>
	 *            holds the list of <code>CurrencyCode</code> and <code>
	 *            inputDate</code>.
	 *            </ul>
	 *            <p>
	 * @return <code>
	 *         {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse
	 *         MultipleFindResponse} <ul> <li>
	 *         {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse#getRetrievedObjects()
	 *         retrievedObjects} - (0:*) holds the <code>ISOCode</code> as Key
	 *         and <code>currencyDto</code> as Value. </ul> </code>
	 *         <p>
	 * @throws LMSException
	 *             If the currency code does not exist the corresponding
	 *             mentioned error codes are returned. Each CodeMessage contains
	 *             the status code, human readable message and message type.
	 */
	@Deprecated
	MultipleFindResponse findByCurrencyCodeAndEffectiveDate(
			MultipleCurrencyFindRequest pMultipleCurrencyFindRequest)
			throws LMSException;

	/**
	 * Finds the effective rounding factor information of the
	 * <code>Currency</code> on the given input date.
	 * <p>
	 * <b>Related Method :</b> <code>
	 * <ul>
	 * <li>{@link com.unisys.trans.logistics.lms.utils.contract.CurrencyService#findByCurrencyCode  findByCurrencyCode}
	 * </ul>
	 * </code>
	 * <p>
	 * The system finds the currency code that exactly matches the input
	 * currency code and fetches its associated rounding factor information
	 * which is effective on the given input date.<br>
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
	 * @param pMultipleCurrencyFindRequest
	 *            <code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest
	 *            MultipleFindRequest} </code><br>
	 *            contains the list of search input values.
	 *            <ul>
	 *            <li><code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest#setSearchInputs
	 *            searchInputs} - (M) (1:*)</code><br>
	 *            holds the list of <code>CurrencyCode</code> and <code>
	 *            inputDate</code>.
	 *            </ul>
	 *            <p>
	 * @return <code>
	 *         {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse
	 *         MultipleFindResponse} <ul> <li>
	 *         {@link com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse#getRetrievedObjects()
	 *         retrievedObjects} - (0:*) holds the <code>ISOCode</code> as Key
	 *         and <code>currencyDto</code> as Value. </ul> </code>
	 *         <p>
	 * @throws LMSException
	 *             If the currency code does not exist the corresponding
	 *             mentioned error codes are returned. Each CodeMessage contains
	 *             the status code, human readable message and message type.
	 */
	MultipleFindResponse findCurrencyByCurrencyCodeAndEffectiveDate(
			MultipleCurrencyFindRequest pMultipleCurrencyFindRequest)
			throws LMSException;

	/**
	 * Finds the <code>Currency</code> information.<br>
	 * <p>
	 * <b>Related Methods :</b> <code>
	 * <ul>
	 * <li>{@link com.unisys.trans.logistics.lms.utils.contract.CurrencyService#findByCurrencyCodeAndEffectiveDate findByCurrencyCodeAndEffectiveDate}
	 * <li>{@link com.unisys.trans.logistics.lms.utils.contract.CurrencyService#validateCurrencyCode validateCurrencyCode}
	 * </ul>
	 * </code>
	 * <p>
	 * The system finds the currency information based on the input currency
	 * code:<br>
	 * <ul>
	 * <li>If the currency code is provided in the input, the system find the
	 * currency information and all its associated rounding factor details.
	 * <li>If the currency code is not provided in the input, the system
	 * retrieves all currencies with the rounding factor information which is
	 * effective on today's date.
	 * </ul>
	 * <p>
	 * <b>Run Time Parameters:</b><br>
	 * 
	 * <pre>
	 * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#CURRENCY_ROUNDING_FACTOR}
	 * <li>{@link com.unisys.trans.logistics.lms.framework.constants.ParameterConstants#CURRENCY_DECIMAL_POSITION}
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
	 *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#CURRENCY_NO_ISOCODE_EXISTS}</td>
	 *            <td>No currency information exists in the system.</td>
	 *            </tr>
	 *            <tr>
	 *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#CURRENCY_ISOCODE_NOT_EXIST}</td>
	 *            <td>Currency code does not exist in the system.</td>
	 *            </tr>
	 *            </code>
	 * </table>
	 * <p>
	 * 
	 * @param pCurrencyFindRequest
	 *            <code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.CurrencyFindRequest
	 *            CurrencyFindRequest}</code><br>
	 *            which includes the attributes to find the currency
	 *            information.
	 *            <p>
	 *            <ul>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.CurrencyFindRequest#setIsoCode isoCode} - (O)</code>
	 *            </ul>
	 *            <p>
	 * @return <code>
	 *         {@link com.unisys.trans.logistics.lms.utils.dto.CurrencyResponse
	 *         CurrencyResponse} <ul> <li>
	 *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
	 *         Response fields} <li>
	 *         {@link com.unisys.trans.logistics.lms.utils.dto.CurrencyResponse#getCurrencies()
	 *         currencies} - (0:*) <ul> <li>
	 *         {@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto
	 *         CurrencyDto} </ul> </ul> </code>
	 *         <p>
	 * @throws LMSException
	 *             If the currency information does not exist the above
	 *             mentioned error codes are returned. Each CodeMessage contains
	 *             the status code, human readable message and message type.
	 */
	CurrencyResponse findCurrency(CurrencyFindRequest pCurrencyFindRequest)
			throws LMSException;

	/**
	 * Restores the <code>Currency</code> which has been marked for deletion.<br>
	 * <p>
	 * The precondition is 'the currency information should have been retrieved
	 * and marked for deletion.<br>
	 * The system validates the currency information to check whether the
	 * currency is not marked for deletion. If the currency is not marked for
	 * deletion, the error message is thrown.
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
	 *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#CURRENCY_NOT_MARKED_FOR_DELETION}</td>
	 *            <td>Currency is not marked for deletion.</td>
	 *            </tr>
	 *            </code>
	 * </table>
	 * <p>
	 * 
	 * @param pCurrencyRestoreRequest
	 *            <code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.CurrencyRestoreRequest
	 *            CurrencyRestoreRequest}</code><br>
	 *            which includes the attributes to restore currency information.
	 *            <p>
	 *            <ul>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto currency} - (M)</code>
	 *            <br>
	 *            <ul>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto#setIsoCode isoCode} - (M)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto#setDescription description} - (M)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto#setNumericCode numericCode} - (M)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto#setEuroStartDate euroStartDate} - (O)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto#setDeletedUser deletedUser} - (M)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto#setEndDate endDate} - (M)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto#setOId oId} - (M)</code>
	 *            - <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version} - (M)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto#setRoundingFactors roundingFactors} - (O) (0:*)</code>
	 *            <br>
	 *            <ul>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.RoundingFactorDto RoundingFactorDto}</code>
	 *            <br>
	 *            <ul>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.RoundingFactorDto#setCurrencyInfoOId currencyInfoOId} - (M)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.RoundingFactorDto#setDecimalPositions decimalPositions} - (M)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.RoundingFactorDto#setEffectiveDate effectiveDate} - (M)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.RoundingFactorDto#setEndDate endDate} - (O)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.RoundingFactorDto#setOId oId} - (M)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.RoundingFactorDto#setRoundingFactor roundingFactor} - (M)</code>
	 *            <br>
	 *            </ul>
	 *            </ul>
	 *            </ul>
	 *            </ul>
	 *            <p>
	 * @return <code>
	 *         {@link com.unisys.trans.logistics.lms.utils.dto.CurrencyResponse
	 *         CurrencyResponse} <ul> <li>
	 *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
	 *         Response fields} <li>
	 *         {@link com.unisys.trans.logistics.lms.utils.dto.CurrencyResponse#getCurrencies()
	 *         currencies} - (1:1) <ul> <li>
	 *         {@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto
	 *         CurrencyDto} </ul> </ul> </code>
	 *         <p>
	 * @throws LMSException
	 *             If the restore currency operation fails the above mentioned
	 *             error codes are returned. Each CodeMessage contains the
	 *             status code, human readable message and message type.
	 */
	CurrencyResponse restoreCurrency(
			CurrencyRestoreRequest pCurrencyRestoreRequest) throws LMSException;

	/**
	 * Updates the <code>Currency</code> information and returns the updated
	 * currency information.<br>
	 * <p>
	 * <b>Related Methods :</b> <code>
	 * <ul>
	 * <li>{@link com.unisys.trans.logistics.lms.utils.contract.CurrencyService#deleteRoundingFactor DeleteRoundingFactor}
	 * <li>{@link com.unisys.trans.logistics.lms.utils.contract.CurrencyService#deleteCurrency DeleteCurrency}
	 * </ul>
	 * </code>
	 * <p>
	 * The system checks whether the currency information to be updated is not
	 * marked for deletion.<br>
	 * If it is not marked for deletion, the system validates the
	 * <code>numericCode</code>, <code>euroStartDate</code> and
	 * <code>effectiveDate</code> and then updates the information.
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
	 *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#CURRENCY_ALREADY_DELETED}</td>
	 *            <td>Currency is already marked for deletion.</td>
	 *            </tr>
	 *            <tr>
	 *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#CURRENCY_NUMERICCODE_ALREADY_EXISTS}</td>
	 *            <td>Numeric code already exists.</td>
	 *            </tr>
	 *            <tr>
	 *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#CURRENCY_INVALID_CONTENT_EUROSTARTDATE}</td>
	 *            <td>The Euro start date must be greater than today's date.</td>
	 *            </tr>
	 *            <tr>
	 *            <td>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#CURRENCY_INVALID_CONTENT_EFFECTIVEDATE}</td>
	 *            <td>Effective date of Rounding factor must be greater than the latest rounding factor for
	 *            the currency and it must also be greater than today's date.</td>
	 *            </tr>
	 *            </code>
	 * </table>
	 * <p>
	 * 
	 * @param pCurrencyPersistRequest
	 *            <code>
	 *            {@link com.unisys.trans.logistics.lms.utils.dto.CurrencyPersistRequest
	 *            CurrencyPersistRequest}</code><br>
	 *            which includes attributes for updating currency information.
	 *            <p>
	 *            <ul>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto currency} - (M)</code>
	 *            <br>
	 *            <ul>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto#setIsoCode isoCode} - (M)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto#setDescription description} - (M)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto#setNumericCode numericCode} - (M)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto#setEuroStartDate euroStartDate} - (O)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto#setDeletedUser deletedUser} - (C)</code>
	 *            - <br>
	 *            Prohibited for update operation.<br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto#setEndDate endDate} - (C)</code>
	 *            - <br>
	 *            Prohibited for update operation.<br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto#setOId oId} - (M)</code>
	 *            - <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto#setVersion version} - (M)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto#setRoundingFactors roundingFactors} - (O) (0:*)</code>
	 *            <br>
	 *            <ul>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.RoundingFactorDto RoundingFactorDto}</code>
	 *            <br>
	 *            <ul>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.RoundingFactorDto#setCurrencyInfoOId currencyInfoOId} - (M)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.RoundingFactorDto#setDecimalPositions decimalPositions} - (M)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.RoundingFactorDto#setEffectiveDate effectiveDate} - (M)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.RoundingFactorDto#setEndDate endDate} - (C)</code>
	 *            <br>
	 *            Mandatory if <code>endDate</code> exists for the rounding
	 *            factor.
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.RoundingFactorDto#setOId oId} - (M)</code>
	 *            <br>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.utils.dto.RoundingFactorDto#setRoundingFactor roundingFactor} - (M)</code>
	 *            <br>
	 *            </ul>
	 *            </ul>
	 *            </ul>
	 *            </ul>
	 *            <p>
	 * @return <code>
	 *         {@link com.unisys.trans.logistics.lms.utils.dto.CurrencyResponse
	 *         CurrencyResponse} <ul> <li>
	 *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
	 *         Response fields} <li>
	 *         {@link com.unisys.trans.logistics.lms.utils.dto.CurrencyResponse#getCurrencies()
	 *         currencies} - (1:1) <ul> <li>
	 *         {@link com.unisys.trans.logistics.lms.utils.dto.CurrencyDto
	 *         CurrencyDto} </ul> </ul> </code>
	 *         <p>
	 * @throws LMSException
	 *             If the update currency operation fails the above mentioned
	 *             error codes are returned. Each CodeMessage contains the
	 *             status code, human readable message and message type.
	 */
	CurrencyResponse updateCurrency(
			CurrencyPersistRequest pCurrencyPersistRequest) throws LMSException;

	/**
	 * Validates the <code>Currency</code> by currency code.
	 * <p>
	 * If <code>currencycode</code> is given, finds the currency information
	 * details by <code>currencycode</code>.<br>
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
	 *            <code>
	 *            {@link com.unisys.trans.logistics.lms.framework.dto.ValidationRequest
	 *            ValidationRequest}</code><br>
	 *            holds the list of search input values.
	 *            <p>
	 *            <ul>
	 *            <li>
	 *            <code>{@link com.unisys.trans.logistics.lms.framework.dto.ValidationRequest#setSearchInputs searchInputs} - (M)</code>
	 *            </ul>
	 *            <p>
	 * @return <code>
	 *           <li>
	 *         {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse
	 *         ValidationResponse} <ul> <li>
	 *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
	 *         Response fields} <li>
	 *         {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse#getValidInputs
	 *         validInputs}-(0:*) <li>
	 *         {@link com.unisys.trans.logistics.lms.framework.dto.ValidationResponse#getSearchInputs
	 *         searchInputs} -(1:*) </ul> </code>
	 *         <p>
	 */
	ValidationResponse validateCurrencyCode(ValidationRequest pValidationRequest);
}
