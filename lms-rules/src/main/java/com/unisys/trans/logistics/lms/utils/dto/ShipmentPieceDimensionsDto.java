/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.constants.DimensionalUOMType;
import com.unisys.trans.logistics.lms.framework.constants.VolumeUOMType;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * The shipment piece dimensions contains set of attributes which are used to calculate dimensional volume for
 * the each dimensional set.<br>
 * <p>
 * This contains following attributes:<br>
 * <code>
 * <ul>
 * <li>dimensionalUOM
 * <li>dimensionalVolume
 * <li>height
 * <li>length
 * <li>pieces
 * <li>volumeUOM
 * <li>width
 * <li>invalidAirCrafts
 * </ul>
 * </code>
 */
public class ShipmentPieceDimensionsDto implements Serializable {
	@Override
	public String toString() {
		String ShipmentPieceDimensionsDto = new String();
		ShipmentPieceDimensionsDto = "ShipmentPieceDimensionsDto ::: " + "height :" + height 
				+ "length :" + length + "pieces :" + pieces
				+ "width :" + width + "dimensionalUOM :" + dimensionalUOM;
		return ShipmentPieceDimensionsDto;
	}
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 3230594663728743833L;

    /**
     * Attribute holds <code>dimensionalUOM</code> property.
     */
    private DimensionalUOMType dimensionalUOM;

    /**
     * Attribute holds <code>dimensionalVolume</code> property.
     */
    private BigDecimal dimensionalVolume;

    /**
     * Attribute holds <code>height</code> property.
     */
    private int height;

    /**
     * Attribute holds <code>length</code> property.
     */
    private int length;

    /**
     * Attribute holds <code>pieces</code> property.
     */
    private int pieces;

    /**
     * Attribute holds <code>volumeUOM</code> property.
     */
    private VolumeUOMType volumeUOM;

    /**
     * Attribute holds <code>width</code> property.
     */
    private int width;
    
    /**
     * Attribute holds <code>invalidAirCrafts</code> property.
     */
    private String invalidAirCrafts;

    /**
     * <code>Default constructor</code>.
     */
    public ShipmentPieceDimensionsDto() {

    }

    /**
     * Gets the <code>dimensionalUOM</code> property.
     * <p>
     * 
     * @return the current value of <code>dimensionalUOM</code> property.
     */
    public DimensionalUOMType getDimensionalUOM() {

        return this.dimensionalUOM;
    }

    /**
     * Gets the <code>dimensionalVolume</code> property.
     * <p>
     * Dimensional volume of the goods which is expressed in units as per the respective unit’s cubic value.
     * Example: If dimensional UOM of the goods is meter (ME) then dimensional volume is represented in
     * cubicmeter (MC).
     * <p>
     * <b>Range :</b><br>
     * 0.1 - 999999999
     * <p>
     * 
     * @return the current value of <code>dimensionalVolume</code> property.
     */
    public BigDecimal getDimensionalVolume() {

        return this.dimensionalVolume;
    }

    /**
     * Gets the <code>height</code> property.
     * <p>
     * Height of the shipment piece(s).
     * </p>
     * <b>Range :</b><br>
     * 1- 999999
     * 
     * @return the current value of <code>height</code> property.
     */
    public int getHeight() {

        return this.height;
    }

    /**
     * Gets the <code>length</code> property.
     * <p>
     * Length of the shipment piece(s).
     * </p>
     * <b>Range :</b><br>
     * 1- 999999
     * 
     * @return the current value of <code>length</code> property.
     */
    public int getLength() {

        return this.length;
    }

    /**
     * Gets the <code>pieces</code> property.
     * <p>
     * The number of pieces that are of same length, width and height.
     * </p>
     * <b>Range :</b><br>
     * 1- 99999
     * 
     * @return the current value of <code>pieces</code> property.
     */
    public int getPieces() {

        return this.pieces;
    }

    /**
     * Gets the <code>volumeUOM</code> property.
     * <p>
     * Indicates the unit of measurement for volume.
     * </p>
     * 
     * @return the current value of <code>pieces</code> property.
     */
    public VolumeUOMType getVolumeUOM() {

        return this.volumeUOM;
    }

    /**
     * Gets of the <code>width</code> property.
     * <p>
     * Width of the shipment piece(s).
     * <p>
     * <b>Range :</b><br>
     * 1- 999999
     * 
     * @return the current value of <code>width</code> property.
     */
    public int getWidth() {

        return this.width;
    }

    /**
     * Sets the <code>dimensionalUOM</code> property.
     * <p>
     * Indicates the dimensionalUOM for shipment dimension calculation.
     * </p>
     * 
     * @param pDimensionalUOM the new value of <code>dimensionalUOM</code> property.
     */
    public void setDimensionalUOM(final DimensionalUOMType pDimensionalUOM) {

        this.dimensionalUOM = pDimensionalUOM;

    }

    /**
     * Sets the <code>dimensionalVolume</code> property.
     * <p>
     * Dimensional volume of the goods which is expressed in units as per the respective unit’s cubic value.
     * Example: Id dimensional UOM of the goods is meter (ME) then dimensional volume is represented in cubic
     * meter (MC).
     * <p>
     * <b>Range :</b><br>
     * 0.1 - 999999999
     * 
     * @param pDimensionalVolume the new value of <code>dimensionalVolume</code> property.
     */
    public void setDimensionalVolume(final BigDecimal pDimensionalVolume) {

        this.dimensionalVolume = pDimensionalVolume;
    }

    /**
     * Sets the <code>height</code> property.
     * <p>
     * Height of the shipment piece(s).
     * </p>
     * <b>Range :</b><br>
     * 0.1 - 999999
     * 
     * @param pHeight the new value of <code>height</code> property.
     */
    public void setHeight(final int pHeight) {

        this.height = pHeight;
    }

    /**
     * Sets the <code>length</code> property.
     * <p>
     * Length of the shipment piece(s).
     * </p>
     * <b>Range :</b><br>
     * 0.1 - 999999
     * 
     * @param pLength the new value of <code>dimensionalVolume</code> property.
     */
    public void setLength(final int pLength) {

        this.length = pLength;
    }

    /**
     * Sets the <code>pieces</code> property.
     * <p>
     * The number of pieces that are of same length, width and height.
     * </p>
     * <b>Range :</b><br>
     * 0.1 - 999999
     * 
     * @param pPieces the new value of <code>pieces</code> property.
     */
    public void setPieces(final int pPieces) {

        this.pieces = pPieces;
    }

    /**
     * Sets the <code>volumeUOM</code> property.
     * <p>
     * Indicates the unit of measurement for volume.
     * </p>
     * 
     * @param pVolumeUOM the new value of <code>volumeUOM</code> property.
     */
    public void setVolumeUOM(final VolumeUOMType pVolumeUOM) {

        this.volumeUOM = pVolumeUOM;
    }

    /**
     * Sets the <code>width</code> property.
     * <p>
     * Width of the shipment piece(s).
     * <p>
     * <b>Range :</b><br>
     * 0.1 - 999999
     * 
     * @param pWidth the new value of <code>width</code> property.
     */
    public void setWidth(final int pWidth) {

        this.width = pWidth;
    }

	public String getInvalidAirCrafts() {
		return invalidAirCrafts;
	}

	public void setInvalidAirCrafts(String invalidAirCrafts) {
		this.invalidAirCrafts = invalidAirCrafts;
	}
}
