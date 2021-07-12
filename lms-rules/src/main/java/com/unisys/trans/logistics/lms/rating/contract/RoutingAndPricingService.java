package com.unisys.trans.logistics.lms.rating.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.rating.dto.price.RoutingAndPricingResponse;
import com.unisys.trans.logistics.lms.rating.dto.price.RoutingAndPricingRequest;

/**
 * <code>RoutingAndPricingService</code> provides methods to find and calculate Rates for multiple Routings.<br>
 * <p>
 * A RoutingAndPricing request text may have multiple Routings and for each Routing, multiple ProductCodes. <br/>
 * Pricing is done for each Routing and ProductCode combination and multiple Responses are returned.
 */
public interface RoutingAndPricingService {

    /**
     * Finds rates for the input RoutingAndPricing request.
     * <p>
     * This method find the rates for the input request.<br/>
     * If multiple Routing and Product codes are given, this method finds rates for each Routing and Product
     * code combination and returns the response.
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
     * 
     * @param pRoutingAndPricingRequest <code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.RoutingAndPricingRequest
     *            RoutingAndPricingRequest}</code><br>
     *            includes the attributes to find prices.
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.RoutingAndPricingRequest#setAwbCarrierCode
     *            AwbCarrierCode} - (M)</code></li> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.RoutingAndPricingRequest#setAwbExecutionDate
     *            AwbExecutionDate} - (M)</code></li> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.RoutingAndPricingRequest#setBankSellingRate
     *            BankSellingRate} - (M)</code></li> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.RoutingAndPricingRequest#setExportPaymentCode
     *            ExportPaymentCode} - (M)</code></li> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.RoutingAndPricingRequest#setOriginCurrencyCode
     *            OriginCurrencyCode} - (O)</code></li> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.RoutingAndPricingRequest#setParticipantDtos
     *            ParticipantDtos} - (O)</code></li> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.RoutingAndPricingRequest#setProductCodeIndicator
     *            ProductCodeIndicator} - (M)</code></li> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.RoutingAndPricingRequest#setRatingLineCount
     *            RatingLineCount} - (M)</code></li> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.RoutingAndPricingRequest#setRatingLine
     *            RatingLine} - (M)</code></li> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.RoutingAndPricingRequest#setRoutingAndPricingRouteDtos
     *            RoutingAndPricingRouteDtos} - (M)</code></li> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.RoutingAndPricingRequest#setRevenueManagementInterfaceType
     *            RevenueManagementInterfaceType} - (M)</code></li> <br>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.rating.dto.price.RoutingAndPricingRequest#setWeightUnit
     *            WeightUnit} - (M)</code></li> <br>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.rating.dto.price.RoutingAndPricingResponse
     *         RoutingAndPricingResponse}</code><br/>
     *         contains the calculated Rates.
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response
     *         fields}</code><br>
     *         holds the CodeMessages in case of any exception.<code>
     *         {@link com.unisys.trans.logistics.lms.rating.dto.price.RoutingAndPricingResponse#getRoutingAndPricingDtos()
     *         RoutingAndPricingDto} - (1:*)</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.rating.dto.price.RoutingAndPricingDto
     *         RoutingAndPricingDto}</code>
     *         </ul>
     *         </ul>
     * @throws LMSException If the processing of RoutingAndPricingRequest fails.
     */
    RoutingAndPricingResponse findRates(
                final RoutingAndPricingRequest pRoutingAndPricingRequest) throws LMSException;
}
