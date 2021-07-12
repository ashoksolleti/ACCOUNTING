package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.Date;

public class InterlineRejectionMemoReportDto {
	
	private  String yourInvoiceNo;
	private String yourBillingMonth;
	private Integer yourBillingPeriod;
	private String awbNo;
	private String awbPaymentType;
	private String rejectionMemoStatus;
	private String rejectionMemoNo;
	private String rejectionMemoStage;
	private String sectorOrigin;
	private String sectorDestination;
	private BigDecimal netRejectionAmountDifferences;
	private BigDecimal weightChargesDifference;
	private BigDecimal valuationChargesDifference;
	private BigDecimal vatAmountDifference;
	private BigDecimal otherChargesDifference;
	private BigDecimal iscAmountDifference;
	private BigDecimal vatAmountDifferences;
	private String prorateType;
	private BigDecimal prorateFactor;
	private String agreementIdentifier;
	private BigDecimal grossWeight;
	private BigDecimal chargeableWeight;
	private BigDecimal fuelSurcharge;
	private BigDecimal governamentTax;
	private BigDecimal stateTax;
	private Date creationDate;
	/**
	 * @return the yourInvoiceNo
	 */
	public String getYourInvoiceNo() {
		return yourInvoiceNo;
	}
	/**
	 * @param yourInvoiceNo the yourInvoiceNo to set
	 */
	public void setYourInvoiceNo(String yourInvoiceNo) {
		this.yourInvoiceNo = yourInvoiceNo;
	}
	/**
	 * @return the yourBillingMonth
	 */
	public String getYourBillingMonth() {
		return yourBillingMonth;
	}
	/**
	 * @param yourBillingMonth the yourBillingMonth to set
	 */
	public void setYourBillingMonth(String yourBillingMonth) {
		this.yourBillingMonth = yourBillingMonth;
	}
	/**
	 * @return the yourBillingPeriod
	 */
	public Integer getYourBillingPeriod() {
		return yourBillingPeriod;
	}
	/**
	 * @param yourBillingPeriod the yourBillingPeriod to set
	 */
	public void setYourBillingPeriod(Integer yourBillingPeriod) {
		this.yourBillingPeriod = yourBillingPeriod;
	}
	/**
	 * @return the awbNo
	 */
	public String getAwbNo() {
		return awbNo;
	}
	/**
	 * @param awbNo the awbNo to set
	 */
	public void setAwbNo(String awbNo) {
		this.awbNo = awbNo;
	}
	/**
	 * @return the awbPaymentType
	 */
	public String getAwbPaymentType() {
		return awbPaymentType;
	}
	/**
	 * @param awbPaymentType the awbPaymentType to set
	 */
	public void setAwbPaymentType(String awbPaymentType) {
		this.awbPaymentType = awbPaymentType;
	}
	/**
	 * @return the rejectionMemoStatus
	 */
	public String getRejectionMemoStatus() {
		return rejectionMemoStatus;
	}
	/**
	 * @param rejectionMemoStatus the rejectionMemoStatus to set
	 */
	public void setRejectionMemoStatus(String rejectionMemoStatus) {
		this.rejectionMemoStatus = rejectionMemoStatus;
	}
	/**
	 * @return the rejectionMemoNo
	 */
	public String getRejectionMemoNo() {
		return rejectionMemoNo;
	}
	/**
	 * @param rejectionMemoNo the rejectionMemoNo to set
	 */
	public void setRejectionMemoNo(String rejectionMemoNo) {
		this.rejectionMemoNo = rejectionMemoNo;
	}
	/**
	 * @return the rejectionMemoStage
	 */
	public String getRejectionMemoStage() {
		return rejectionMemoStage;
	}
	/**
	 * @param rejectionMemoStage the rejectionMemoStage to set
	 */
	public void setRejectionMemoStage(String rejectionMemoStage) {
		this.rejectionMemoStage = rejectionMemoStage;
	}
	/**
	 * @return the sectorOrigin
	 */
	public String getSectorOrigin() {
		return sectorOrigin;
	}
	/**
	 * @param sectorOrigin the sectorOrigin to set
	 */
	public void setSectorOrigin(String sectorOrigin) {
		this.sectorOrigin = sectorOrigin;
	}
	/**
	 * @return the sectorDestination
	 */
	public String getSectorDestination() {
		return sectorDestination;
	}
	/**
	 * @param sectorDestination the sectorDestination to set
	 */
	public void setSectorDestination(String sectorDestination) {
		this.sectorDestination = sectorDestination;
	}
	/**
	 * @return the netRejectionAmountDifferences
	 */
	public BigDecimal getNetRejectionAmountDifferences() {
		return netRejectionAmountDifferences;
	}
	/**
	 * @param netRejectionAmountDifferences the netRejectionAmountDifferences to set
	 */
	public void setNetRejectionAmountDifferences(
			BigDecimal netRejectionAmountDifferences) {
		this.netRejectionAmountDifferences = netRejectionAmountDifferences;
	}
	/**
	 * @return the weightChargesDifference
	 */
	public BigDecimal getWeightChargesDifference() {
		return weightChargesDifference;
	}
	/**
	 * @param weightChargesDifference the weightChargesDifference to set
	 */
	public void setWeightChargesDifference(BigDecimal weightChargesDifference) {
		this.weightChargesDifference = weightChargesDifference;
	}
	/**
	 * @return the valuationChargesDifference
	 */
	public BigDecimal getValuationChargesDifference() {
		return valuationChargesDifference;
	}
	/**
	 * @param valuationChargesDifference the valuationChargesDifference to set
	 */
	public void setValuationChargesDifference(BigDecimal valuationChargesDifference) {
		this.valuationChargesDifference = valuationChargesDifference;
	}
	/**
	 * @return the vatAmountDifference
	 */
	public BigDecimal getVatAmountDifference() {
		return vatAmountDifference;
	}
	/**
	 * @param vatAmountDifference the vatAmountDifference to set
	 */
	public void setVatAmountDifference(BigDecimal vatAmountDifference) {
		this.vatAmountDifference = vatAmountDifference;
	}
	/**
	 * @return the otherChargesDifference
	 */
	public BigDecimal getOtherChargesDifference() {
		return otherChargesDifference;
	}
	/**
	 * @param otherChargesDifference the otherChargesDifference to set
	 */
	public void setOtherChargesDifference(BigDecimal otherChargesDifference) {
		this.otherChargesDifference = otherChargesDifference;
	}
	/**
	 * @return the iscAmountDifference
	 */
	public BigDecimal getIscAmountDifference() {
		return iscAmountDifference;
	}
	/**
	 * @param iscAmountDifference the iscAmountDifference to set
	 */
	public void setIscAmountDifference(BigDecimal iscAmountDifference) {
		this.iscAmountDifference = iscAmountDifference;
	}
	/**
	 * @return the vatAmountDifferences
	 */
	public BigDecimal getVatAmountDifferences() {
		return vatAmountDifferences;
	}
	/**
	 * @param vatAmountDifferences the vatAmountDifferences to set
	 */
	public void setVatAmountDifferences(BigDecimal vatAmountDifferences) {
		this.vatAmountDifferences = vatAmountDifferences;
	}
	/**
	 * @return the prorateType
	 */
	public String getProrateType() {
		return prorateType;
	}
	/**
	 * @param prorateType the prorateType to set
	 */
	public void setProrateType(String prorateType) {
		this.prorateType = prorateType;
	}
	/**
	 * @return the prorateFactor
	 */
	public BigDecimal getProrateFactor() {
		return prorateFactor;
	}
	/**
	 * @param prorateFactor the prorateFactor to set
	 */
	public void setProrateFactor(BigDecimal prorateFactor) {
		this.prorateFactor = prorateFactor;
	}
	/**
	 * @return the agreementIdentifier
	 */
	public String getAgreementIdentifier() {
		return agreementIdentifier;
	}
	/**
	 * @param agreementIdentifier the agreementIdentifier to set
	 */
	public void setAgreementIdentifier(String agreementIdentifier) {
		this.agreementIdentifier = agreementIdentifier;
	}
	public BigDecimal getGrossWeight() {
		return grossWeight;
	}
	public void setGrossWeight(BigDecimal grossWeight) {
		this.grossWeight = grossWeight;
	}
	public BigDecimal getChargeableWeight() {
		return chargeableWeight;
	}
	public void setChargeableWeight(BigDecimal chargeableWeight) {
		this.chargeableWeight = chargeableWeight;
	}
	public BigDecimal getFuelSurcharge() {
		return fuelSurcharge;
	}
	public void setFuelSurcharge(BigDecimal fuelSurcharge) {
		this.fuelSurcharge = fuelSurcharge;
	}
	public BigDecimal getGovernamentTax() {
		return governamentTax;
	}
	public void setGovernamentTax(BigDecimal governamentTax) {
		this.governamentTax = governamentTax;
	}
	public BigDecimal getStateTax() {
		return stateTax;
	}
	public void setStateTax(BigDecimal stateTax) {
		this.stateTax = stateTax;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
}
