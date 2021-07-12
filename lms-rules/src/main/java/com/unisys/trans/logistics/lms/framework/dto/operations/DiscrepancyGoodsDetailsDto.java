package com.unisys.trans.logistics.lms.framework.dto.operations;

/* ====================================== */
/* Copyright (c) 2014 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <code>DiscrepancyGoodsDetailsDto</code> class represents the DiscrepancyGoodsDetails information.
 * <p>
 * This contains the following attributes:<br/>
 * <li><code>balancePieces</code></li>
 * <li><code>balanceWeight</code></li>
 * <li><code>dctlStation</code></li>
 * <li><code>fadCount</code></li>
 * <li><code>fadDateTime</code></li>
 * <li><code>serialVersionUID</code></li>
 * <li><code>sluldBalancePieces</code></li>
 * <li><code>sluldBalanceWeight</code></li>
 * <li><code>ttyAddress</code></li>
 * <p>
 * 
 * 
 * @author Unisys
 * @version 1.0
 * @since 1.0
 */
public class DiscrepancyGoodsDetailsDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    private String dctlStation;

    /**
     * Attribute to hold <code>balancePieces</code> property.
     */
    private int balancePieces;

    /**
     * Attribute to hold <code>balanceWeight</code> property.
     */
    private BigDecimal balanceWeight;

    /**
     * Attribute to hold <code>sluldBalancePieces</code> property.
     */
    private int sluldBalancePieces;

    /**
     * Attribute to hold <code>sluldBalanceWeight</code> property.
     */
    private BigDecimal sluldBalanceWeight;

    /**
     * Attribute to hold <code>fadCount</code> property.
     */
    private int fadCount;

    /**
     * Attribute to hold <code>fadDateTime</code> property.
     */
    private Date fadDateTime;

    /**
     * Attribute to hold <code>ttyAddress</code> property.
     */
    private String ttyAddress;

    /**
     * Gets the <code>DctlStation</code> property.
     * <p>
     * 
     * @return the current value of the <code>DctlStation</code> property.<br>
     */
    public String getDctlStation() {
        return this.dctlStation;
    }

    /**
     * Sets the <code>DctlStation</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>DctlStation</code> property.<br>
     */
    public void setDctlStation(final String pDctlStation) {
        this.dctlStation = pDctlStation;
    }

    /**
     * Gets the <code>BalancePieces</code> property.
     * <p>
     * 
     * @return the current value of the <code>BalancePieces</code> property.<br>
     */
    public int getBalancePieces() {
        return this.balancePieces;
    }

    /**
     * Sets the <code>BalancePieces</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>BalancePieces</code> property.<br>
     */
    public void setBalancePieces(final int pBalancePieces) {
        this.balancePieces = pBalancePieces;
    }

    /**
     * Gets the <code>BalanceWeight</code> property.
     * <p>
     * 
     * @return the current value of the <code>BalanceWeight</code> property.<br>
     */
    public BigDecimal getBalanceWeight() {
        return this.balanceWeight;
    }

    /**
     * Sets the <code>BalanceWeight</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>BalanceWeight</code> property.<br>
     */
    public void setBalanceWeight(final BigDecimal pBalanceWeight) {
        this.balanceWeight = pBalanceWeight;
    }

    /**
     * Gets the value of the <code>sluldBalancePieces</code> property.
     * <p>
     *
     * @return Returns the current value of <code>sluldBalancePieces</code> property.
     */
    public int getSluldBalancePieces() {
        return sluldBalancePieces;
    }

    /**
     * Sets the value of the <code>sluldBalancePieces</code> property.
     * <p>
     *
     * @param <code>sluldBalancePieces</code> Holds the new value of the <code>sluldBalancePieces</code>
     *        property.
     */
    public void setSluldBalancePieces(int sluldBalancePieces) {
        this.sluldBalancePieces = sluldBalancePieces;
    }

    /**
     * Gets the value of the <code>sluldBalanceWeight</code> property.
     * <p>
     *
     * @return Returns the current value of <code>sluldBalanceWeight</code> property.
     */
    public BigDecimal getSluldBalanceWeight() {
        return sluldBalanceWeight;
    }

    /**
     * Sets the value of the <code>sluldBalanceWeight</code> property.
     * <p>
     *
     * @param <code>sluldBalanceWeight</code> Holds the new value of the <code>sluldBalanceWeight</code>
     *        property.
     */
    public void setSluldBalanceWeight(BigDecimal sluldBalanceWeight) {
        this.sluldBalanceWeight = sluldBalanceWeight;
    }

    /**
     * Gets the <code>FadCount</code> property.
     * <p>
     * 
     * @return the current value of the <code>FadCount</code> property.<br>
     */
    public int getFadCount() {
        return this.fadCount;
    }

    /**
     * Sets the <code>FadCount</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>FadCount</code> property.<br>
     */
    public void setFadCount(final int pFadCount) {
        this.fadCount = pFadCount;
    }

    /**
     * Gets the <code>FadDateTime</code> property.
     * <p>
     * 
     * @return the current value of the <code>FadDateTime</code> property.<br>
     */
    public Date getFadDateTime() {
        if(fadDateTime!=null){
            return (Date)fadDateTime.clone();
            }
            else{
                return null;
            }
    }

    /**
     * Sets the <code>FadDateTime</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>FadDateTime</code> property.<br>
     */
    public void setFadDateTime(final Date pFadDateTime) {
        if(pFadDateTime!=null){
        	this.fadDateTime =(Date) pFadDateTime.clone();
          }   
        else
        {
        	this.fadDateTime=null;
        }
    }

    /**
     * Gets the <code>TtyAddress</code> property.
     * <p>
     * 
     * @return the current value of the <code>TtyAddress</code> property.<br>
     */
    public String getTtyAddress() {
        return this.ttyAddress;
    }

    /**
     * Sets the <code>TtyAddress</code> property.
     * <p>
     * 
     * @param pAmount
     *            the current value of the <code>TtyAddress</code> property.<br>
     */
    public void setTtyAddress(final String pTtyAddress) {
        this.ttyAddress = pTtyAddress;
    }

}
