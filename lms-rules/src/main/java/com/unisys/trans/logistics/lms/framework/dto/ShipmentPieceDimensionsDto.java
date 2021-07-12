/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.framework.constants.DimensionalUOMType;
import com.unisys.trans.logistics.lms.framework.constants.VolumeUOMType;

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
 * <li>selected
 * <li>willNotFit
 * </ul>
 * </code>
 */
public class ShipmentPieceDimensionsDto implements Serializable {
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
     * Formats the rating line description based on the shipment pieces.
     * 
     * @return the formatted description.
     */
    public String formatDescription() {
        final StringBuffer ratingDescription = new StringBuffer();
       
        ratingDescription.append("(D");
        ratingDescription.append(this.getLength());
        ratingDescription.append("*");
        ratingDescription.append(this.getWidth());
        ratingDescription.append("*");
        ratingDescription.append(this.getHeight());
        ratingDescription.append(this
                    .getDimensionalUOM());
        ratingDescription.append("*");
        ratingDescription.append(this.getPieces());
        ratingDescription.append(")");
        return ratingDescription.toString();
    }
    
    public void setDimensions(final String pDescription){        
        final String splitvalue[] = pDescription.split("\\*");
        this.setLength(Integer.parseInt(splitvalue[0].substring(2)));
        this.setWidth(Integer.parseInt(splitvalue[1]));
        this.setHeight(Integer.parseInt(splitvalue[2].substring(0, splitvalue[2].length() - 2)));
        this.setDimensionalUOM(DimensionalUOMType.valueOf(splitvalue[2].substring(splitvalue[2].length() - 2)));
        this.setPieces(Integer.parseInt(splitvalue[3].substring(0, splitvalue[3].length() - 1)));
    }
    
    /**
     * Attribute holds <code>height</code> property.
     */
    private Integer height;

    /**
     * Attribute holds <code>length</code> property.
     */
    private Integer length;

    /**
     * Attribute holds <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute holds <code>pieces</code> property.
     */
    private Integer pieces;

    /**
     * Attribute holds <code>ratingLine</code> property.
     */
    private int ratingLine;

    /**
     * Attribute holds <code>selected</code> property.
     */
    private boolean selected;

    /**
     * Attribute holds <code>volumeUOM</code> property.
     */
    private VolumeUOMType volumeUOM;

    /**
     * Attribute holds <code>width</code> property.
     */
    private Integer width;

    /**
     * Attribute holds <code>willNotFit</code> property.
     */
    private String willNotFit;

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
     * Dimensional volume of the goods which is expressed in units as per the respective unit's cubic value.
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
    public Integer getHeight() {

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
    public Integer getLength() {

        return this.length;
    }

    /**
     * Gets the <code>oId</code> property.
     * <p>
     * 
     * @return the current value of the <code>oId</code> property.
     */
    public Long getoId() {
        return this.oId;
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
    public Integer getPieces() {

        return this.pieces;
    }

    /**
     * Gets the <code>ratingLine</code> property.
     * 
     * @return the current value of the <code>ratingLine</code> property.
     */
    public int getRatingLine() {
        return this.ratingLine;
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
    public Integer getWidth() {

        return this.width;
    }

    /**
     * Gets of the <code>willNotFit</code> property.
     * <p>
     * Gets the list of Aircraft Codes.
     * <p>
     * 
     * @return the willNotFit
     */
    public String getWillNotFit() {
        return this.willNotFit;
    }

    /**
     * Gets of the <code>selected</code> property.
     * <p>
     * check shipment piece(s) is/are selected or not.
     * <p>
     * 
     * @return the current value of <code>selected</code> property.
     */
    public boolean isSelected() {
        return this.selected;
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
     * Dimensional volume of the goods which is expressed in units as per the respective unit's cubic value.
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
    public void setHeight(final Integer pHeight) {

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
    public void setLength(final Integer pLength) {

        this.length = pLength;
    }

    /**
     * Sets the <code>oId</code> property.
     * <p>
     * 
     * @param pOId
     *            holds the new value of <code>oId</code>.<br>
     */
    public void setoId(final Long pOId) {
        this.oId = pOId;
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
    public void setPieces(final Integer pPieces) {

        this.pieces = pPieces;
    }

    /**
     * sets of the <code>RatingLine</code> property.
     * <p>
     * <p>
     * 
     * @param pRatingLine the RatingLine to set
     */
    public void setRatingLine(final int pRatingLine) {
        this.ratingLine = pRatingLine;
    }

    /**
     * Sets the <code>selected</code> property.
     * <p>
     * check shipment piece(s) is/are selected or not.
     * <p>
     * 
     * @param pSelected the new value of <code>selected</code> property.
     */
    public void setSelected(final boolean pSelected) {
        this.selected = pSelected;
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
    public void setWidth(final Integer pWidth) {

        this.width = pWidth;
    }

    /**
     * sets of the <code>willNotFit</code> property.
     * <p>
     * sets the list of Aircraft Codes.
     * <p>
     * 
     * @param pWillNotFit the willNotFit to set
     */
    public void setWillNotFit(final String pWillNotFit) {
        this.willNotFit = pWillNotFit;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dimensionalUOM == null) ? 0 : dimensionalUOM.hashCode());
        result = prime * result + height;
        result = prime * result + length;
        result = prime * result + pieces;
        result = prime * result + ratingLine;
        result = prime * result + ((volumeUOM == null) ? 0 : volumeUOM.hashCode());
        result = prime * result + width;
        result = prime * result + ((willNotFit == null) ? 0 : willNotFit.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;}
        if (obj == null){
            return false;}
        if (getClass() != obj.getClass()){
            return false;}
        ShipmentPieceDimensionsDto other = (ShipmentPieceDimensionsDto) obj;
        if (dimensionalUOM != other.dimensionalUOM){
            return false;}
        if (height!=null && (!height.equals(other.height))){
            return false;}
        if (length!=null && (!length.equals(other.length))){
            return false;}
        if (pieces!=null && (!pieces.equals(other.pieces))){
            return false;}
        if (ratingLine != other.ratingLine){
            return false;}
        if (volumeUOM != other.volumeUOM){
            return false;}
        if (width!=null && (!width.equals(other.width))){
            return false;}
        if (willNotFit == null) {
            if (other.willNotFit != null){
                return false;}
        }
        else if (!willNotFit.equals(other.willNotFit)){
            return false;}
        return true;
    }

}
