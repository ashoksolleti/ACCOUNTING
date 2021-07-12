/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.framework.constants.VolumeUOMType;
import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
/**
 * <code>CapacityDto</code> represents the data transfer object for the capacity entity.
 * <p>
 * Data transfer objects are used to transfer information between client and server via web services. This
 * Capacity is used to transfer the information about the capacity data for the cargo. <br>
 * This contains the following attributes:
 * <ul>
 * <li><code>lowerDeckContainer
 * <li>lowerDeckPosition
 * <li>tallUpperDeckPosition
 * <li>upperDeckPosition
 * <li>volume
 * <li>weight</code>
 * </ul>
 */
public class CapacityDto implements Serializable {
	@Override
	public String toString() {
		String CapacityDto = new String();
		CapacityDto = "CapacityDto ::: " + "volume :" + volume + "weight :" + weight + "volumeunit :" + volumeunit
				+ "weightUnit :" + weightUnit + "pieceCount :" + pieceCount;
		return CapacityDto;
	}
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -7151400160281375638L;

    /**
     * Attribute to hold <code>lowerDeckContainer</code> property.
     */
    private int lowerDeckContainer;

    /**
     * Attribute to hold <code>lowerDeckPosition</code> property.
     */
    private int lowerDeckPosition;

    /**
     * Attribute to hold <code>tallUpperDeckPosition</code> property.
     */
    private int tallUpperDeckPosition;

    /**
     * Attribute to hold <code>upperDeckPosition</code> property.
     */
    private int upperDeckPosition;

    /**
     * Attribute to hold <code>volume</code> property.
     */
    private BigDecimal volume;

    /**
     * Attribute to hold <code>weight</code> property.
     */
    private BigDecimal weight;
    /**
     * Attribute to hold <code>volumeunit</code> property.
     */
    private VolumeUOMType volumeunit;

    /**
     * Attribute to hold <code>weightUnit</code> property.
     */
    private WeightUOMType weightUnit;
    /**
     * Attribute to hold <code>pieceCount</code> property.
     */ 
    private Integer pieceCount;

    /**
     * Gets the <code>lowerDeckContainer</code> capacity for specified type property.
     * <p>
     * <b>Format: </b><br>
     * 1 - 2 Numeric
     * <p>
     * <b>Example: </b><br>
     * 21
     * <p>
     * 
     * @return the current value of the <code>lowerDeckContainer</code> capacity for specified type property.
     */
    public int getLowerDeckContainer() {
        return this.lowerDeckContainer;

    }

    /**
     * Gets the <code>lowerDeckPosition</code> capacity for specified type property.
     * <p>
     * <b>Format: </b><br>
     * 1 -2 Numeric
     * <p>
     * <b>Example: </b><br>
     * 26
     * <p>
     * 
     * @return the current value of the <code>lowerDeckPosition</code> capacity for specified type property.
     */
    public int getLowerDeckPosition() {
        return this.lowerDeckPosition;
    }

    /**
     * Gets the <code>tallUpperDeckPosition</code> capacity for specified type property.
     * <p>
     * <b>Format: </b><br>
     * 1 - 2 Numeric
     * <p>
     * <b>Example: </b><br>
     * 23
     * <p>
     * 
     * @return the new value of the <code>tallUpperDeckPosition</code> capacity for specified type property.
     */
    public int getTallUpperDeckPosition() {
        return this.tallUpperDeckPosition;
    }

    /**
     * Gets the <code>upperDeckPosition</code> capacity for specified type property.
     * <p>
     * <b>Format: </b><br>
     * 1 - 2 Numeric
     * <p>
     * <b>Example: </b><br>
     * 2
     * <p>
     * 
     * @return the new value of the <code>upperDeckPosition</code> capacity for specified type property.
     */
    public int getUpperDeckPosition() {
        return this.upperDeckPosition;
    }

    /**
     * Gets the <code>volume</code> capacity for specified type property.
     * <p>
     * <b>Format: </b><br>
     * 9.2 Float
     * <p>
     * <b>Example: </b><br>
     * 245804567.15
     * <p>
     * 
     * @return the new value of the <code>volume</code> capacity for specified type property.
     */
    public BigDecimal getVolume() {
        return this.volume;
    }

    /**
     * Gets the <code>weight</code> capacity for specified type property.
     * <p>
     * <b>Format: </b><br>
     * 7.1 Float
     * <p>
     * <b>Example: </b><br>
     * 2458034.1
     * <p>
     * 
     * @return the new value of the <code>weight</code> capacity for specified type property.
     */
    public BigDecimal getWeight() {
        return this.weight;
    }

    /**
     * Sets the <code>lowerDeckContainer</code> capacity for specified type property.
     * <p>
     * <b>Format: </b><br>
     * 1 - 2 Numeric
     * <p>
     * <b>Example: </b><br>
     * 21
     * <p>
     * 
     * @param pLowerDeckContainer the new value of the <code>lowerDeckContainer</code> capacity for specified
     *            type property.
     */
    public void setLowerDeckContainer(final int pLowerDeckContainer) {
        this.lowerDeckContainer = pLowerDeckContainer;
    }

    /**
     * Sets the <code>lowerDeckPosition</code> capacity for specified type property.
     * <p>
     * <b>Format: </b><br>
     * 1 - 2 Numeric
     * <p>
     * <b>Example: </b><br>
     * 26
     * <p>
     * 
     * @param pLowerDeckPosition the new value of the <code>lowerDeckPosition</code> capacity for specified
     *            type property.
     */
    public void setLowerDeckPosition(final int pLowerDeckPosition) {
        this.lowerDeckPosition = pLowerDeckPosition;
    }

    /**
     * Sets the <code>tallUpperDeckPosition</code> capacity for specified type property.
     * <p>
     * <b>Format: </b><br>
     * 1 - 2 Numeric
     * <p>
     * <b>Example: </b><br>
     * 2
     * <p>
     * 
     * @param pTallUpperDeckPosition the new value of the <code>tallUpperDeckPosition</code> capacity for
     *            specified type property.
     */
    public void setTallUpperDeckPosition(final int pTallUpperDeckPosition) {
        this.tallUpperDeckPosition = pTallUpperDeckPosition;
    }

    /**
     * Sets the <code>upperDeckPosition</code> capacity for specified type property.
     * <p>
     * <b>Format: </b><br>
     * 1 - 2 Numeric
     * <p>
     * <p>
     * <b>Example: </b><br>
     * 2
     * <p>
     * 
     * @param pUpperDeckPosition the new value of the <code>upperDeckPosition</code> capacity for specified
     *            type property.
     */
    public void setUpperDeckPosition(final int pUpperDeckPosition) {
        this.upperDeckPosition = pUpperDeckPosition;
    }

    /**
     * Sets the <code>volume</code> capacity for specified type property.
     * <p>
     * <b>Format: </b><br>
     * 9.2 Float
     * <p>
     * <b>Example: </b><br>
     * 24580.15
     * <p>
     * 
     * @param pVolume the new value of the <code>volume</code> capacity for specified type property.
     */
    public void setVolume(final BigDecimal pVolume) {
        this.volume = pVolume;
    }

    /**
     * Sets the <code>weight</code> capacity for specified type property.
     * <p>
     * <b>Format: </b><br>
     * 7.1 Float
     * <p>
     * <b>Example: </b><br>
     * 245803.5
     * <p>
     * 
     * @param pWeight the new value of the <code>weight</code> capacity for specified type property.
     */
    public void setWeight(final BigDecimal pWeight) {
        this.weight = pWeight;
    }
	/**
	 * @return the volumeunit
	 */
	public VolumeUOMType getVolumeunit() {
		return volumeunit;
	}

	/**
	 * @return the weightUnit
	 */
	public WeightUOMType getWeightUnit() {
		return weightUnit;
	}

	/**
	 * @param volumeunit the volumeunit to set
	 */
	public void setVolumeunit(VolumeUOMType volumeunit) {
		this.volumeunit = volumeunit;
	}

	/**
	 * @param weightUnit the weightUnit to set
	 */
	public void setWeightUnit(WeightUOMType weightUnit) {
		this.weightUnit = weightUnit;
	}

	/**
	 * @return the pieceCount
	 */
	public Integer getPieceCount() {
		return pieceCount;
	}

	/**
	 * @param pieceCount the pieceCount to set
	 */
	public void setPieceCount(Integer pieceCount) {
		this.pieceCount = pieceCount;
	}
}