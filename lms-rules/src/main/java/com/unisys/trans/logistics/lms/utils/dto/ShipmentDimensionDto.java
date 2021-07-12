/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.constants.VolumeUOMType;
import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * <code>ShipmentDimensionDto</code> holds attributes required for shipment dimension volume and weight
 * calculation.<br>
 * <p>
 * This contains following attributes:<br>
 * <code>
 * <ul>
 * <li>destinationStation
 * <li>originStation
 * <li>remainingPieces
 * <li>shipmentPieceDimensions
 * <li>totalDimensionalPieces
 * <li>totalDimensionalVolume
 * <li>totalDimensionalWeight
 * <li>totalPieces
 * <li>totalWeight
 * <li>volumeUOM
 * <li>weightUOM
 * </ul>
 * </code>
 */
public class ShipmentDimensionDto implements Serializable {
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -7506860508761678304L;

    /**
     * Attribute holds <code>destinationStation</code> property.
     */
    private String destinationStation;

    /**
     * Attribute holds <code>originStation</code> property.
     */
    private String originStation;

    /**
     * Attribute holds <code>remainingPieces</code> property.
     */
    private int remainingPieces;

    /**
     * Attribute holds <code>shipmentPieceDimensions</code> property.
     */
    private List<ShipmentPieceDimensionsDto> shipmentPieceDimensions;

    /**
     * Attribute holds <code>totalDimensionalPieces</code> property.
     */
    private int totalDimensionalPieces;

    /**
     * Attribute holds <code>totalDimensionalVolume</code> property.
     */
    private BigDecimal totalDimensionalVolume;

    /**
     * Attribute holds <code>totalDimensionalWeight</code> property.
     */
    private BigDecimal totalDimensionalWeight;

    /**
     * Attribute holds <code>totalPieces</code> property.
     */
    private int totalPieces;

    /**
     * Attribute holds <code>totalWeight</code> property.
     */
    private BigDecimal totalWeight;

    /**
     * Attribute holds <code>volumeUOM</code> property.
     */
    private VolumeUOMType volumeUOM;

    /**
     * Attribute holds <code>weightUOM</code> property.
     */
    private WeightUOMType weightUOM;

    /**
     * <code>Default constructor</code>.
     */
    public ShipmentDimensionDto() {

    }

    /**
     * Gets the <code>destinationStation</code> property.
     * <p>
     * Destination station code of the goods associated with the shipment.
     * <p>
     * <b>Format:</b><br>
     * 1-5 Alphabets.
     * <p>
     * <b>Example:</b><br>
     * ORD
     * <p>
     * 
     * @return the current value of the <code>destinationStation</code> property.
     */
    public String getDestinationStation() {

        return this.destinationStation;

    }

    /**
     * Gets the <code>originStation</code> property.
     * <p>
     * Origin station code of the goods associated with the shipment.
     * <p>
     * <b>Format:</b><br>
     * 1-5 Alphabets.
     * <p>
     * <b>Example:</b><br>
     * MSP
     * <p>
     * 
     * @return the current value of the <code>originStation</code> property.
     */
    public String getOriginStation() {

        return this.originStation;
    }

    /**
     * Gets the <code>remainingPieces</code> property.
     * <p>
     * Remaining pieces value is calculated by subtracting the Total dimensional pieces (sum of all
     * dimensional pieces) from the Total pieces.
     * <p>
     * <b>Format:</b><br>
     * 1-5 Numerics
     * <p>
     * <b>Example:</b><br>
     * 12
     * <p>
     * 
     * @return the current value of the <code>remainingPieces</code> property.
     */
    public int getRemainingPieces() {

        return this.remainingPieces;

    }

    /**
     * Gets the<code>shipmentPieceDimensions</code> property.
     * <p>
     * The field holds a list of <code>ShipmentPieceDimensionsDto</code> objects.
     * <p>
     * 
     * @return <code>{@link com.unisys.trans.logistics.lms.utils.dto.ShipmentPieceDimensionsDto
     *         ShipmentPieceDimensionsDto}</code><br>
     *         the current value of <code>shipmentPieceDimensions</code> property.
     */
    public List<ShipmentPieceDimensionsDto> getShipmentPieceDimensions() {

        return this.shipmentPieceDimensions;

    }

    /**
     * Gets the <code>totalDimensionalPieces</code> property.
     * <p>
     * Total dimensional pieces is the sum of all pieces.
     * <p>
     * <b>Format:</b><br>
     * 1 - 5 Numeric <br>
     * <b>Example:</b><br>
     * 10
     * <p>
     * 
     * @return the current value of <code>totalDimensionalPieces</code> property.
     */
    public int getTotalDimensionalPieces() {

        return this.totalDimensionalPieces;
    }

    /**
     * Gets the <code>totalDimensionalVolume</code> property.
     * <p>
     * Total dimensional volume is derived by adding the volume of all the dimensional pieces. Total
     * dimensional volume unit is either CC (Cubic Centimeter) or MC (Cubic Meter).
     * <p>
     * <b>Format:</b><br>
     * 1 - 9 Floating point
     * <p>
     * <b>Example:</b><br>
     * 42940.00
     * <p>
     * 
     * @return the current value of <code>totalDimensionalVolume</code> property.
     */
    public BigDecimal getTotalDimensionalVolume() {

        return this.totalDimensionalVolume;

    }

    /**
     * Gets the <code>totalDimensionalWeight</code> property.
     * <p>
     * Total dimensional weight of the dimensional pieces. Total dimensional weight is calculated from the
     * total dimensional volume using the density calculation defined by IATA (Non-North American routing) and
     * ATPCO (North American routing).
     * <p>
     * <b>Format:</b><br>
     * 1 - 9 Floating point
     * <p>
     * <b>Example:</b><br>
     * 114
     * <p>
     * 
     * @return the current value of <code>totalDimensionalWeight</code> property.
     */
    public BigDecimal getTotalDimensionalWeight() {

        return this.totalDimensionalWeight;

    }

    /**
     * Gets the <code>totalPieces</code> property.
     * <p>
     * The total number of pieces associated with the shipment.
     * <p>
     * <b>Format:</b><br>
     * 1 - 5 Numeric
     * <p>
     * <b>Example:</b><br>
     * 10
     * <p>
     * 
     * @return the current value of the <code>totalPieces</code> property.
     */
    public int getTotalPieces() {

        return this.totalPieces;
    }

    /**
     * Gets the <code>totalWeight</code> property.
     * <p>
     * Total weight of the goods associated with the shipment.
     * <p>
     * <b>Format:</b><br>
     * 1 - 7 Floating point
     * <p>
     * <b>Example:</b><br>
     * 100
     * <p>
     * 
     * @return the current value of the <code>totalWeight</code> property.
     */
    public BigDecimal getTotalWeight() {

        return this.totalWeight;

    }

    /**
     * Gets the <code>volumeUOM</code> property.
     * <p>
     * 
     * @return <code>{@link com.unisys.trans.logistics.lms.framework.constants.VolumeUOMType VolumeUOMType}
     *         </code><br>
     *         the current value of <code>volumeUOM</code> property.
     */
    public VolumeUOMType getVolumeUOM() {
        return this.volumeUOM;
    }

    /**
     * Gets the <code>weightUOM</code> property.
     * <p>
     * 
     * @return <code>{@link com.unisys.trans.logistics.lms.framework.constants.WeightUOMType WeightUOMType}
     *         </code><br>
     *         the current value of the <code>weightUOM</code> property.
     */
    public WeightUOMType getWeightUOM() {

        return this.weightUOM;
    }

    /**
     * Sets the <code>destinationStation</code> property.
     * <p>
     * <b>Format:</b><br>
     * 1-5 Alphabets.
     * <p>
     * <b>Example:</b><br>
     * ORD
     * <p>
     * 
     * @param pDestinationStation the new value of the <code>destinationStation</code> property.
     */
    public void setDestinationStation(final String pDestinationStation) {
        this.destinationStation = ContractUtility.convertToUpperCase(pDestinationStation);
    }

    /**
     * Sets the <code>originStation</code> attribute.
     * <p>
     * <b>Format:</b><br>
     * 1-5 Alphabets.
     * <p>
     * <b>Example:</b><br>
     * MSP
     * <p>
     * 
     * @param pOriginStation the new value of the <code>originStation</code> property.
     */
    public void setOriginStation(final String pOriginStation) {
        this.originStation = ContractUtility.convertToUpperCase(pOriginStation);
    }

    /**
     * Sets the <code>remainingPieces</code> attribute.
     * <p>
     * Remaining pieces value is calculated by subtracting the Total dimensional pieces (sum of all
     * dimensional pieces) from the Total pieces.
     * <p>
     * <b>Format:</b><br>
     * 1-5 Numerics<br>
     * <b>Example:</b><br>
     * 12
     * <p>
     * 
     * @param pRemainingPieces the new value of the <code>remainingPieces</code> property.
     */
    public void setRemainingPieces(final int pRemainingPieces) {

        this.remainingPieces = pRemainingPieces;
    }

    /**
     * Sets the <code>shipmentPieceDimensions</code> property.
     * <p>
     * The field holds a list of <code>ShipmentPieceDimensionsDto</code> objects.
     * <p>
     * 
     * @param pShipmentPieceDimensions <code>
     *            {@link com.unisys.trans.logistics.lms.utils.dto.ShipmentPieceDimensionsDto
     *            ShipmentPieceDimensionsDto}</code><br>
     *            the new value of <code>shipmentPieceDimensions</code> property.
     */
    public void setShipmentPieceDimensions(final List<ShipmentPieceDimensionsDto> pShipmentPieceDimensions) {

        this.shipmentPieceDimensions = pShipmentPieceDimensions;
    }

    /**
     * Sets the <code>totalDimensionalPieces</code> property.
     * <p>
     * Total dimensional pieces is the sum of all pieces for which total dimensional volume and weight is
     * calculated.
     * <p>
     * <b>Format:</b><br>
     * 1 - 5 Numeric
     * <p>
     * <b>Example:</b><br>
     * 10
     * <p>
     * 
     * @param pTotalDimensionalPieces the new value of <code>totalDimensionalPieces</code> property.
     */
    public void setTotalDimensionalPieces(final int pTotalDimensionalPieces) {

        this.totalDimensionalPieces = pTotalDimensionalPieces;
    }

    /**
     * Sets the <code>totalDimensionalVolume</code> property.
     * <p>
     * Total dimensional volume is derived by adding the volume of all the dimensional pieces. Total
     * dimensional volume unit is either CC (Cubic Centimeter) or MC (Cubic Meter).
     * <p>
     * <b>Format:</b><br>
     * 1 - 9 Floating point
     * <p>
     * <b>Example:</b><br>
     * 42940.00
     * <p>
     * 
     * @param pTotalDimensionalVolume the new value of <code>totalDimensionalVolume</code> property.
     */
    public void setTotalDimensionalVolume(final BigDecimal pTotalDimensionalVolume) {

        this.totalDimensionalVolume = pTotalDimensionalVolume;
    }

    /**
     * Sets the <code>totalDimensionalWeight</code> property.
     * <p>
     * Total dimensional weight of the dimensional pieces. Total dimensional weight is calculated from the
     * total dimensional volume using the density calculation defined by IATA (Non-North American routing) and
     * ATPCO (North American routing).
     * <p>
     * <b>Format:</b><br>
     * 1 - 9 Floating point
     * <p>
     * <b>Example:</b><br>
     * 114
     * <p>
     * 
     * @param pTotalDimensionalWeight the new value of <code>totalDimensionalWeight</code> property.
     */
    public void setTotalDimensionalWeight(final BigDecimal pTotalDimensionalWeight) {

        this.totalDimensionalWeight = pTotalDimensionalWeight;
    }

    /**
     * Sets the <code>totalPieces</code> property.
     * <p>
     * The total number of pieces associated with the shipment.
     * <p>
     * <b>Format:</b><br>
     * 1 - 5 Numeric
     * <p>
     * <b>Example:</b><br>
     * 10
     * <p>
     * 
     * @param pTotalPieces the new value of the <code>totalPieces</code> property.
     */
    public void setTotalPieces(final int pTotalPieces) {
        this.totalPieces = pTotalPieces;
    }

    /**
     * Sets the <code>totalWeight</code> property.
     * <p>
     * Total weight of the goods associated with the shipment.
     * <p>
     * <b>Format:</b><br>
     * 1 - 7 Floating point
     * <p>
     * <b>Example:</b><br>
     * 100
     * <p>
     * 
     * @param pTotalWeight the new value of the <code>totalWeight</code> property.
     */
    public void setTotalWeight(final BigDecimal pTotalWeight) {

        this.totalWeight = pTotalWeight;
    }

    /**
     * Sets the <code>volumeUOM</code> property.
     * <p>
     * 
     * @param pVolumeUOM <code>{@link com.unisys.trans.logistics.lms.framework.constants.VolumeUOMType
     *            VolumeUOMType} </code><br>
     *            the new value of the <code>volumeUOM</code> property.
     */
    public void setVolumeUOM(final VolumeUOMType pVolumeUOM) {

        this.volumeUOM = pVolumeUOM;
    }

    /**
     * Sets the <code>weightUOM</code> property.
     * <p>
     * 
     * @param pWeightUOM <code>{@link com.unisys.trans.logistics.lms.framework.constants.WeightUOMType
     *            WeightUOMType} </code><br>
     *            the new value of the <code>weightUOM</code> property.
     */
    public void setWeightUOM(final WeightUOMType pWeightUOM) {

        this.weightUOM = pWeightUOM;
    }
}
