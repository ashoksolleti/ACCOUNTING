/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>DimensionCalculationRequest</code> holds information for shipment dimensions calculation request.
 * <p>
 * Dimension calculation request object contains the shipment dimension data transfer object that has all the
 * required information for calculating the shipment dimensions.
 * <p>
 * This contains the following attribute:<br>
 * <ul>
 * <li><code>shipmentDimension</code>
 * </ul>
 */
public class DimensionCalculationRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -4227661806309904140L;

    /**
     * Attribute to hold <code>shipmentDimension</code> property.
     */
    private ShipmentDimensionDto shipmentDimension;

    /**
     * <code>Default constructor</code>.
     */
    public DimensionCalculationRequest() {

    }

    /**
     * Gets the <code>shipmentDimension</code> property.
     * <p>
     * Holds shipment details and dimensions details data transfer object. Shipment information includes
     * details about the origin station, destination station, totalPieces, totalWeight, weightUOM and shipment
     * dimension details data transfer object which contains dimensionalPieces, dimensionalUOM, height, length
     * and width.
     * <p>
     * 
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.ShipmentDimensionDto
     *         ShipmentDimensionDto}</code><br>
     *         the current value of <code>shipmentDimension</code> property.
     */
    public ShipmentDimensionDto getShipmentDimension() {

        return this.shipmentDimension;
    }

    /**
     * Sets the <code>shipmentDimension</code> property.
     * <p>
     * Holds shipment details and dimensions details data transfer object. Shipment information includes
     * details about the origin station, destination station, totalPieces, totalWeight, weightUOM and shipment
     * dimension details data transfer object which contains dimensionalPieces, dimensionalUOM, height, length
     * and width.<br>
     * <p>
     * 
     * @param pShipmentDimension <code> {@link com.unisys.trans.logistics.lms.utils.dto.ShipmentDimensionDto
     *            ShipmentDimensionDto}</code> the new value of the <code>shipmentDimension</code> property.
     */
    public void setShipmentDimension(final ShipmentDimensionDto pShipmentDimension) {
        this.shipmentDimension = pShipmentDimension;
    }
}
