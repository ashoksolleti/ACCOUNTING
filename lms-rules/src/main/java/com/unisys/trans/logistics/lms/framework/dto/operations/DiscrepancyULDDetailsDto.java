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
 * <code>DiscrepancyULDDetailsDto</code> class represents the DiscrepancyULDDetails information.
 * 
 */
public class DiscrepancyULDDetailsDto implements Serializable{
   
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;


	/**
	* Attribute to hold <code>dctlStation</code> property.
	*/
	private String dctlStation;

	/**
	* Attribute to hold <code>balancePieces</code> property.
	*/
	private int balancePieces;

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
	* Attribute to hold <code>balanceWeight</code> property.
	*/
	private BigDecimal balanceWeight;
	

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
     * the current value of the <code>DctlStation</code> property.<br>
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
     * the current value of the <code>BalancePieces</code> property.<br>
     */ 
    public void setBalancePieces(final int pBalancePieces) {
        this.balancePieces = pBalancePieces;
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
     * the current value of the <code>FadCount</code> property.<br>
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
        if(this.fadDateTime!=null){
            return (Date)this.fadDateTime.clone();
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
     * the current value of the <code>FadDateTime</code> property.<br>
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
     * the current value of the <code>TtyAddress</code> property.<br>
     */ 
    public void setTtyAddress(final String pTtyAddress) {
        this.ttyAddress = pTtyAddress;
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
     * the current value of the <code>BalanceWeight</code> property.<br>
     */ 
    public void setBalanceWeight(final BigDecimal pBalanceWeight) {
        this.balanceWeight = pBalanceWeight;
    }

}
