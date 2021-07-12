/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.dto;

import com.unisys.trans.logistics.lms.framework.constants.VolumeUOMType;
import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <code>ShipmentCapacityDto</code> holds the capacity information of the shipment.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>pieces
 * <li>volume
 * <li>volumeUOM
 * <li>weight
 * <li>weightUOM
 * </code>
 * </ul>
 */
public class ShipmentCapacityDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 521224044632128142L;

    /**
     * Attribute to hold <code>pieceCount</code> property.
     */
    private Integer pieceCount;

    /**
     * Attribute to hold <code>volume</code> property.
     */
    private BigDecimal volume;

    /**
     * Attribute to hold <code>volumeUOM</code> property.
     */
    private VolumeUOMType volumeUOM;

    /**
     * Attribute to hold <code>weight</code> property.
     */
    private BigDecimal weight;

    /**
     * Attribute to hold <code>weightUOM</code> property.
     */
    private WeightUOMType weightUOM;

    /**
     * <code>Default constructor.</code>
     */
    public ShipmentCapacityDto() {

    }

    /**
     * Gets the <code>pieceCount</code> property.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric
     * <p>
     * <b>Example: </b><br>
     * 10
     * 
     * @return the current value of the <code>pieceCount</code> property.
     */
    public Integer getPieceCount() {
        return this.pieceCount;
    }

    /**
     * Gets the <code>volume</code> attribute.
     * <p>
     * <b>Format: </b><br>
     * 9.2 Float
     * <p>
     * <b>Example: </b><br>
     * 10
     * 
     * @return the current value of the <code>volume</code> property.
     */
    public BigDecimal getVolume() {
        return this.volume;
    }

    /**
     * Gets the <code>volumeUOM</code> attribute.
     * <p>
     * The unit of volume.
     * <p>
     * 
     * @return the current value of the <code>volumeUOM</code> property.
     */
    public VolumeUOMType getVolumeUOM() {
        return this.volumeUOM;
    }

    /**
     * Gets the <code>weight</code> attribute.
     * <p>
     * <b>Format: </b><br>
     * 7.1 Float
     * <p>
     * <b>Example: </b><br>
     * 5.1
     * 
     * @return the current value of the <code>weight</code> property.
     */
    public BigDecimal getWeight() {
        return this.weight;
    }

    /**
     * Gets the <code>weightUOM</code> attribute.
     * <p>
     * The unit of weight.
     * <p>
     * 
     * @return the current value of the <code>weightUOM</code> property.
     */
    public WeightUOMType getWeightUOM() {
        return this.weightUOM;
    }

    /**
     * Sets the <code>pieceCount</code> attribute.
     * <p>
     * <b>Format: </b><br>
     * 1-5 Numeric
     * <p>
     * <b>Example: </b><br>
     * 10
     * 
     * @param pPieceCount the new value of <code>pieceCount</code> property.
     */
    public void setPieceCount(final Integer pPieceCount) {
        this.pieceCount = pPieceCount;
    }

    /**
     * Sets the <code>volume</code> attribute.
     * <p>
     * <b>Format: </b><br>
     * 9.2 Float
     * <p>
     * <b>Example: </b><br>
     * 10
     * 
     * @param pVolume the new value of <code>volume</code> property.
     */
    public void setVolume(final BigDecimal pVolume) {
        this.volume = pVolume;
    }

    /**
     * Sets the <code>volumeUOM</code> attribute.
     * <p>
     * The unit of volume.
     * <p>
     * 
     * @param pVolumeUOM the new value of <code>volumeUOM</code> property.
     */
    public void setVolumeUOM(final VolumeUOMType pVolumeUOM) {
        this.volumeUOM = pVolumeUOM;
    }

    /**
     * Sets the <code>weight</code> attribute.
     * <p>
     * <b>Format: </b><br>
     * 7.1 Float
     * <p>
     * <b>Example: </b><br>
     * 5.1
     * 
     * @param pWeight the new value of <code>weight</code> property.
     */
    public void setWeight(final BigDecimal pWeight) {
        this.weight = pWeight;
    }

    /**
     * Sets the <code>weightUOM</code> attribute.
     * <p>
     * The unit of weight.
     * <p>
     * 
     * @param pWeightUOM the new value of <code>weightUOM</code> property.
     */
    public void setWeightUOM(final WeightUOMType pWeightUOM) {
        this.weightUOM = pWeightUOM;
    }

}