/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>DimensionCalculationResponse</code> holds information related to shipment dimension.
 * <p>
 * It contains the following attribute:<br>
 * <li><code>shipmentDimension</code>
 */
public class DimensionCalculationResponse extends AbstractResponse {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 6132508260174191940L;

    /**
     * Attribute holds <code>originStation</code> property.
     */
    private ShipmentDimensionDto shipmentDimension;

    /**
     * <code>Default constructor</code>.
     */
    public DimensionCalculationResponse() {
    }

    /**
     * Gets the value of the <code>shipmentDimension</code> property.
     * <p>
     * Represents the instance of the shipmentDimensions details data transfer object. This holds shipment
     * details and dimensions details data transfer object. Shipment information includes details about the
     * origin station, destination station, totalPieces, totalWeight, weightUOM and shipment dimensions
     * details data transfer object which contains dimensionalPieces,dimensionalUOM, height, length and width.
     * <p>
     * 
     * @return <code> {@link com.unisys.trans.logistics.lms.utils.dto.ShipmentDimensionDto
     *         ShipmentDimensionDto}</code> the current value of <code>shipmentDimension</code> property.
     */
    public ShipmentDimensionDto getShipmentDimension() {

        return this.shipmentDimension;
    }

    /**
     * Sets the <code>shipmentDimension attribute</code>.
     * <p>
     * Represents the instance of the shipmentDimensions details data transfer object. This holds shipment
     * details and dimensions details data transfer object. Shipment information includes details about the
     * origin station, destination station, totalPieces, totalWeight, weightUOM and shipment dimensions
     * details data transfer object which contains dimensionalPieces,dimensionalUOM, height, length and width.
     * <p>
     * 
     * @param pShipmentDimension <code> {@link com.unisys.trans.logistics.lms.utils.dto.ShipmentDimensionDto
     *            ShipmentDimensionDto}</code> the current value of <code>shipmentDimension</code> property.
     */
    public void setShipmentDimension(final ShipmentDimensionDto pShipmentDimension) {

        this.shipmentDimension = pShipmentDimension;
    }
}
