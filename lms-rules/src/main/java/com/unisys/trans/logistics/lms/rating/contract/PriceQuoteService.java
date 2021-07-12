/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.rating.dto.price.PriceQuoteRequest;
import com.unisys.trans.logistics.lms.rating.dto.price.RateandQuoteResponse;

/**
 * <code>Price Quote service</code> provides the functional methods to retrieve
 * rate and quote information.
 * <p>
 * 
 * It offers the following services for maintaining rate and quote information<br>
 * <ul>
 * <li>retrieveRateQuotes - Retrieves the rate and quote information for the given input details.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.rating.dto.price.PriceQuoteRequest
 */
public interface PriceQuoteService {

    /**
     * Retrieves all the rate and quote information that exist in the system.
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
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#CITY_CODE_DOES_NOT_EXIST}</td>
     *            <td>The city does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#CURRENCY_CODE_DOES_NOT_EXIST}</td>
     *            <td>The Currency Code does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#COMMODITY_NUMBER_DOES_NOT_EXIST}</td>
     *            <td>The Commodity Number does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#RATE_TYPE_DOES_NOT_EXIST}</td>
     *            <td>The Rate Type does not exist in the system.</td>
     *            </tr>
     *            <tr>
     *            <td>{@link com.unisys.trans.logistics.lms.rating.constants.
     *            MessageConstants#RATEQUOTE_WARNING_MESSAGE}</td>
     *            <td>Warning: Other Rates Could Apply.</td>
     *            </tr>
     *            
     *            </code>
     * </table>
     * <p>
     * 
     * 
     * @param pAddOnRateFindRequest
     *            <code> {@link com.unisys.trans.logistics.lms.rating.dto.price.PriceQuoteRequest
     *            PriceQuoteRequest}</code><br>
     *            includes the attributes to find <code>rate and quote</code>information.
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.price.PriceQuoteDto
     *            PriceQuoteDto}</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.PriceQuoteDto#setAllContractsInd
     *            allContractsInd} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.PriceQuoteDto#setChargeableWeight
     *            chargeableWeight} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.PriceQuoteDto#setClassRatingId
     *            classRatingId} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.PriceQuoteDto#setCommodityCode
     *            commodityCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.PriceQuoteDto#setCurrencyCode
     *            currencyCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.PriceQuoteDto#setDestinationCode
     *            destinationCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.PriceQuoteDto#setDestinationName
     *            destinationName} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.PriceQuoteDto#setDestinationPostalCode
     *            destinationPostalCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.PriceQuoteDto#setExpirationDate
     *            expirationDate} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.PriceQuoteDto#setOId
     *            oId} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.PriceQuoteDto#setOriginCode
     *            originCode} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.PriceQuoteDto#setOriginName
     *            originName} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.PriceQuoteDto#setOriginPostalCode
     *            originPostalCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.PriceQuoteDto#setParticipantAccountNumber
     *            participantAccountNumber} - (O)</code><li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.PriceQuoteDto#setParticipantName
     *            participantName} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.PriceQuoteDto#setParticipantStation
     *            participantStation} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.PriceQuoteDto#setParticipantType
     *            participantType} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.PriceQuoteDto#setProductCode
     *            productCode} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.PriceQuoteDto#setRateClass
     *            rateClass} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.PriceQuoteDto#setRatePieces
     *            ratePieces} - (M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.PriceQuoteDto#setRateTotalCharges
     *            rateTotalCharges} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.PriceQuoteDto#setRateType
     *            rateType} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.PriceQuoteDto#setShipmentDate
     *            shipmentDate} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.PriceQuoteDto#setSplCodes
     *            splCodes} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.PriceQuoteDto#setUldType
     *            uldType} - (O)</code><li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.PriceQuoteDto#setVolume
     *            volume} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.PriceQuoteDto#setVolumeUnit
     *            volumeUnit} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.PriceQuoteDto#setWeight
     *            weight} - (O)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.PriceQuoteDto#setWeightUnit
     *            weightUnit} - (O)</code>
     *            </ul>
     *            </ul>
     *            <p>
     * 
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.price.RateandQuoteResponse
     *         RateandQuoteResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields} <li>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.price.RateandQuoteResponse#getPriceQuoteDto
     *         priceQuoteDto} - (1:*) </ul> </code>
     *         <p>
     * 
     * @throws LMSException
     *             If the find operation fails, the above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */
    RateandQuoteResponse retrieveRateQuotes(
                final PriceQuoteRequest pRateQuoteRequest) throws LMSException;

}
