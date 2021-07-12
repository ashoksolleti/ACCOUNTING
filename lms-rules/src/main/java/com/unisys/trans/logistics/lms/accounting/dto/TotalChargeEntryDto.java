/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.accounting.dto.constants.GenIdType;

/**
 * <code>TotalChargeEntryDto</code> class contain information specific to an TotalCharge Entry.<br>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>actualIndicator
 * <li>charge
 * <li>chargeGenIdType
 * <li>faceIndicator
 * <li>oId
 * <li>publishedIndicator
 * </code>
 * </ul>
 */
public class TotalChargeEntryDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -6530682681785759812L;

    /**
     * Attribute to hold <code>actualIndicator</code> property.
     */
    private boolean actualIndicator;

    /**
     * Attribute to hold <code>charge</code> property.
     */
    private BigDecimal charge;

    /**
     * Attribute to hold <code>chargeGenIdType</code> property.
     */
    private GenIdType chargeGenIdType;

    /**
     * Attribute to hold <code>faceIndicator</code> property.
     */
    private boolean faceIndicator;

    /**
     * Attribute to hold <code>publishedIndicator</code> property.
     */
    private boolean publishedIndicator;

    /**
     * Gets the <code>actualIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>actualIndicator</code> property.
     */
    public boolean getActualIndicator() {
        return this.actualIndicator;
    }

    /**
     * Gets the <code>charge</code> property.
     * <p>
     * 
     * @return the current value of the <code>charge</code> property.
     */
    public BigDecimal getCharge() {
        return this.charge;
    }

    /**
     * Gets the <code>chargeGenIdType</code> property.
     * <p>
     * 
     * @return the current value of the <code>chargeGenIdType</code> property.
     */
    public GenIdType getChargeGenIdType() {
        return this.chargeGenIdType;
    }

    /**
     * Gets the <code>faceIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>faceIndicator</code> property.
     */
    public boolean getFaceIndicator() {
        return this.faceIndicator;
    }


    /**
     * Gets the <code>publishedIndicator</code> property.
     * <p>
     * 
     * @return the current value of the <code>publishedIndicator</code> property.
     */
    public boolean getPublishedIndicator() {
        return this.publishedIndicator;
    }

    /**
     * Sets the <code>actualIndicator</code>.
     * <p>
     * 
     * @param pActualIndicator
     *            holds the new value of <code>actualIndicator</code>
     */
    public void setActualIndicator(final boolean pActualIndicator) {
        this.actualIndicator = pActualIndicator;
    }

    /**
     * Sets the <code>charge</code>.
     * <p>
     * 
     * @param pCharge
     *            holds the new value of <code>charge</code>
     */
    public void setCharge(final BigDecimal pCharge) {
        this.charge = pCharge;
    }

    /**
     * Sets the <code>chargeGenIdType</code>.
     * <p>
     * 
     * @param pChargeGenIdType
     *            holds the new value of <code>chargeGenIdType</code>
     */
    public void setChargeGenIdType(final GenIdType pChargeGenIdType) {
        this.chargeGenIdType = pChargeGenIdType;
    }

    /**
     * Sets the <code>faceIndicator</code>.
     * <p>
     * 
     * @param pFaceIndicator
     *            holds the new value of <code>faceIndicator</code>
     */
    public void setFaceIndicator(final boolean pFaceIndicator) {
        this.faceIndicator = pFaceIndicator;
    }

    /**
     * Sets the <code>publishedIndicator</code>.
     * <p>
     * 
     * @param pPublishedIndicator
     *            holds the new value of <code>publishedIndicator</code>
     */
    public void setPublishedIndicator(final boolean pPublishedIndicator) {
        this.publishedIndicator = pPublishedIndicator;
    }
    
    @Override
    public String toString() {
        final StringBuilder aStrBuilder = new StringBuilder();
        
      
        if(this.getActualIndicator()){
            aStrBuilder.append("Actual");
            aStrBuilder.append(" ");
        }
        if(this.getFaceIndicator()){
            aStrBuilder.append("Face");
            aStrBuilder.append(" ");
        } 
        if(this.getPublishedIndicator()){
            aStrBuilder.append("Published");
            aStrBuilder.append(" ");
        } 
        
        if(this.getChargeGenIdType()!=null){
            aStrBuilder.append(this.getChargeGenIdType());
            aStrBuilder.append(" ");
        }
        if(this.getCharge()!=null){
            aStrBuilder.append(this.getCharge());
            aStrBuilder.append(" ");
        }
       
        return aStrBuilder.toString();
    }
}
