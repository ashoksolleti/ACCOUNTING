/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.DimensionCalculationRequest;
import com.unisys.trans.logistics.lms.utils.dto.DimensionCalculationResponse;

/**
 * <code>ShipmentDimensionCalculationService</code> provides the functional method to calculate shipments
 * dimension for the goods associated with the shipment.<br>
 * <p>
 * Based on the customs area of the origin and destination station codes the routing is determined.<br>
 * <ul>
 * <li>Dimensional volume is calculated from the dimensional details (length, width, height, unit of
 * measurement and pieces).
 * <li>Dimensional weight is calculated based on the density calculation defined by the IATA (Non-North
 * American routing) and ATPCO (North American routing). This is used to determine the freight charges for
 * shipments.
 * </ul>
 * It provides the following service method:
 * <ul>
 * <li>Calculate Shipment Dimension.
 * </ul>
 */
public interface ShipmentDimensionCalculationService {

    /**
     * <code>calculateShipmentDimension</code> method calculates total dimensional volume, total dimensional
     * weight and remaining pieces of shipments.<br>
     * <p>
     * This method Calculates shipments total dimensional volume, total dimensional weight and remaining
     * pieces with the following dimensional details:<br>
     * <ul>
     * <li>Based on the customs area of the origin and destination station codes the routing is determined.
     * <li>Calculates the total dimensional volume based on the number of dimensional pieces, length, width
     * and height.
     * <li>Calculates the total dimensional weight based on the calculated total dimensional volume and the
     * routing determined.
     * <li>Calculates the remaining pieces based on the given pieces and total of all dimensional pieces.<br>
     * </ul>
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
     * <b>The following Error Codes may be returned:</b>
     * <table border="0" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#SHIPMENTDIMENSION_ORIGIN_STATION_DOES_NOT_EXIST}</code>
     * </td>
     * <td align="left">The origin station does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#SHIPMENTDIMENSION_DESTINATION_STATION_DOES_NOT_EXIST}</code>
     * </td>
     * <td align="left">The destination station does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#STATION_DOES_NOT_EXIST}</code>
     * </td>
     * <td align="left">The station does not exist in the system.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#SHIPMENTDIMENSION_INVALID_TOTAL_DIMENSIONAL_PIECES}</code>
     * </td>
     * <td align="left">Dimensional pieces cannot be greater than the total pieces.</td>
     * </tr>
     * <tr>
     * <td align="left">
     * <code>{@link com.unisys.trans.logistics.lms.utils.constants.MessageConstants#SHIPMENTDIMENSION_INVALID_UOM_COMBINATION}</code>
     * </td>
     * <td align="left">Only CM / ME are accepted as units or Only IN/FT/YD are accepted as units.</td>
     * </tr>
     * </table>
     * 
     * @param pDimensionCalculationRequest <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.DimensionCalculationRequest
     *            DimensionCalculationRequest}</code><br>
     *            contains the shipment dimension data transfer object that has all the required information
     *            for calculating the shipment dimensions.<br>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ShipmentDimensionDto
     *            ShipmentDimensionDto}-(M)</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ShipmentDimensionDto#setOriginStation
     *            originStation}-(M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ShipmentDimensionDto#setDestinationStation
     *            destinationStation}-(M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ShipmentDimensionDto#setTotalPieces
     *            totalPieces}-(M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ShipmentDimensionDto#setTotalWeight
     *            totalWeight}-(M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ShipmentDimensionDto#setWeightUOM weightUOM}
     *            -(M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ShipmentDimensionDto#setRemainingPieces
     *            remainingPieces}-(C)</code><br>
     *            Prohibited for calculate shipment dimension method input details. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ShipmentDimensionDto#setTotalDimensionalPieces
     *            totalDimensionalPieces}-(C)</code><br>
     *            Prohibited for calculate shipment dimension method input details. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ShipmentDimensionDto#setTotalDimensionalVolume
     *            totalDimensionalVolume}-(C)</code><br>
     *            Prohibited for calculate shipment dimension method input details. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ShipmentDimensionDto#setTotalDimensionalWeight
     *            totalDimensionalWeight}-(C)</code><br>
     *            Prohibited for calculate shipment dimension method input details. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ShipmentDimensionDto#setVolumeUOM volumeUOM}
     *            -(C)</code><br>
     *            Prohibited for calculate shipment dimension method input details. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ShipmentDimensionDto#setShipmentPieceDimensions
     *            shipmentPieceDimensions}-(M)(1:*)</code>
     *            <ul>
     *            <li><code> {@link com.unisys.trans.logistics.lms.utils.dto.ShipmentPieceDimensionsDto
     *            ShipmentPieceDimensionsDto}</code>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ShipmentPieceDimensionsDto#setDimensionalUOM
     *            dimensionalUOM}-(M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ShipmentPieceDimensionsDto#setHeight height}
     *            -(M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ShipmentPieceDimensionsDto#setLength length}
     *            -(M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ShipmentPieceDimensionsDto#setPieces pieces}
     *            -(M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ShipmentPieceDimensionsDto#setWidth width}
     *            -(M)</code> <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ShipmentPieceDimensionsDto#setDimensionalVolume
     *            dimensionalVolume}-(C)</code><br>
     *            Prohibited for calculate shipment dimension method input details. <li><code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ShipmentPieceDimensionsDto#setVolumeUOM
     *            volumeUOM}-(C)</code><br>
     *            Prohibited for calculate shipment dimension method input details.
     *            </ul>
     *            </ul>
     *            </ul>
     *            </ul>
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.DimensionCalculationResponse
     *         DimensionCalculationResponse} <ul> <li>
     *         {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse Response fields} </ul>
     *         </code>
     * @throws LMSException If validation fails the above mentioned error codes are returned. Each CodeMessage
     *             contains the status code,human readable message and message type.
     */
    DimensionCalculationResponse calculateShipmentDimension(
                DimensionCalculationRequest pDimensionCalculationRequest) throws LMSException;

}
