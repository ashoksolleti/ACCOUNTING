/* ====================================== */
/* Copyright(c) 2011 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.awb.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class TotalChargesDto extends PersistenceObjectDto  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3352238544804346900L;

    private Long oId;


	/**
	 * Freight bill total collect - 
	 * Actual Collect Charges
	 */
	private BigDecimal awbTotalCol;

	/**
	 * Freight Bill Total Prepaid-
	 * Actual Prepaid Charges
	 */
	private BigDecimal awbTotalPpd;

	/**
	 * Freight Bill Total Weight Charge - 
	 * Actual Weight Charges
	 */
	private BigDecimal awbTotalWeightCharge;

	 /**
     * Displayable Total Collect Shipment Charges- Face collect Charges
     */
    private BigDecimal displayTotalColCharges;

    /**
     * Displayable Total Prepaid Shipment Charges - Face Prepaid Charges
     */
    private BigDecimal displayTotalPpdCharges;

    /**
     * Displayable Total Weight Charge - Prepaid Weight Charges
     */
    private BigDecimal displayTotalWeightCharge;
    
    /**
     * Printable Total Collect Shipment Charges -
     * Published Collect Charges
     */
    private BigDecimal printableTotalColCharges;

    /**
     * Printable Total Prepaid Shipment Charges -
     * Published Prepaid Charges
     */
    private BigDecimal printableTotalPpdCharges;

    /**
     * Printable Total Weight Charge - Published Weight Charges
     */
    private BigDecimal printableTotalWeightCharge;

	public BigDecimal getPrintableTotalColCharges() {
		return printableTotalColCharges;
	}



	public void setPrintableTotalColCharges(BigDecimal printableTotalColCharges) {
		this.printableTotalColCharges = printableTotalColCharges;
	}



	public BigDecimal getPrintableTotalPpdCharges() {
		return printableTotalPpdCharges;
	}



	public void setPrintableTotalPpdCharges(BigDecimal printableTotalPpdCharges) {
		this.printableTotalPpdCharges = printableTotalPpdCharges;
	}



	public BigDecimal getPrintableTotalWeightCharge() {
		return printableTotalWeightCharge;
	}



	public void setPrintableTotalWeightCharge(BigDecimal printableTotalWeightCharge) {
		this.printableTotalWeightCharge = printableTotalWeightCharge;
	}



	public BigDecimal getDisplayTotalColCharges() {
		return displayTotalColCharges;
	}



	public void setDisplayTotalColCharges(BigDecimal displayTotalColCharges) {
		this.displayTotalColCharges = displayTotalColCharges;
	}



	public BigDecimal getDisplayTotalPpdCharges() {
		return displayTotalPpdCharges;
	}



	public void setDisplayTotalPpdCharges(BigDecimal displayTotalPpdCharges) {
		this.displayTotalPpdCharges = displayTotalPpdCharges;
	}



	public BigDecimal getDisplayTotalWeightCharge() {
		return displayTotalWeightCharge;
	}



	public void setDisplayTotalWeightCharge(BigDecimal displayTotalWeightCharge) {
		this.displayTotalWeightCharge = displayTotalWeightCharge;
	}



	public BigDecimal getAwbTotalCol() {
		return awbTotalCol;
	}



	public void setAwbTotalCol(BigDecimal awbTotalCol) {
		this.awbTotalCol = awbTotalCol;
	}



	public BigDecimal getAwbTotalPpd() {
		return awbTotalPpd;
	}



	public void setAwbTotalPpd(BigDecimal awbTotalPpd) {
		this.awbTotalPpd = awbTotalPpd;
	}



	public BigDecimal getAwbTotalWeightCharge() {
		return awbTotalWeightCharge;
	}



	public void setAwbTotalWeightCharge(BigDecimal awbTotalWeightCharge) {
		this.awbTotalWeightCharge = awbTotalWeightCharge;
	}



	public Long getOId() {
		
		return oId;
	}
	
	public void setOid(Long oId) {
		
		this.oId = oId;
	}



}
