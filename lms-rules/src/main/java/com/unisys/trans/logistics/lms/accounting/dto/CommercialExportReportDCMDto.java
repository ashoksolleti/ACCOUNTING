/**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author SeramRaK
 *
 */
public class CommercialExportReportDCMDto {
	
	private String serialNumber;
	private String awbNumber;
	private BigDecimal chargeableWeight;
	private String noteType;
	private BigDecimal commission;
	private BigDecimal tds;
	private BigDecimal totalAdjustment;
	private BigDecimal otherCharge;
	private BigDecimal discountAmount;
	private BigDecimal taxDueAgent;
	//Invoice Template
	private Date dcmGenerationDate;
	private String shipmentReference;
	private String airlineCodeNbr;
	private String originStation;
	private String destinationStation;
	private BigDecimal grossWeight;
	private BigDecimal netWeightCharge;
	private BigDecimal governmentTax;
	private BigDecimal netAmountPayable;
	private BigDecimal stateTax;
	/** The Shipper Name. */
	private String shipperName;
	private BigDecimal vatPercentage;
	
	
	/** The Consignee Name. */
	private String consigneeName;
	private BigDecimal fuelSurcharge;
	
	private BigDecimal cgst;
	private BigDecimal sgst;
	private BigDecimal igst;
	
	private BigDecimal gstAmount;
	
	private BigDecimal keralaFloodCess;

	//AI028 LMSC-20808
	private BigDecimal commercialSurcharge;

	public BigDecimal getCommercialSurcharge() {
		if (commercialSurcharge == null)
		{
			commercialSurcharge = new BigDecimal(0);
		}
		return commercialSurcharge;
	}

	public void setCommercialSurcharge(BigDecimal commercialSurcharge) {
		this.commercialSurcharge = commercialSurcharge;
	}
	
	
	public BigDecimal getKeralaFloodCess() {
		return keralaFloodCess;
	}
	public void setKeralaFloodCess(BigDecimal keralaFloodCess) {
		this.keralaFloodCess = keralaFloodCess;
	}
	public BigDecimal getCgst() {
		return cgst;
	}
	public void setCgst(BigDecimal cgst) {
		this.cgst = cgst;
	}
	public BigDecimal getSgst() {
		return sgst;
	}
	public void setSgst(BigDecimal sgst) {
		this.sgst = sgst;
	}
	public BigDecimal getIgst() {
		return igst;
	}
	public void setIgst(BigDecimal igst) {
		this.igst = igst;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getAwbNumber() {
		return awbNumber;
	}
	public void setAwbNumber(String awbNumber) {
		this.awbNumber = awbNumber;
	}
	public BigDecimal getChargeableWeight() {
		return chargeableWeight;
	}
	public void setChargeableWeight(BigDecimal chargeableWeight) {
		this.chargeableWeight = chargeableWeight;
	}
	public String getNoteType() {
		return noteType;
	}
	public void setNoteType(String noteType) {
		this.noteType = noteType;
	}
	public BigDecimal getCommission() {
		return commission;
	}
	public void setCommission(BigDecimal commission) {
		this.commission = commission;
	}
	public BigDecimal getTds() {
		return tds;
	}
	public void setTds(BigDecimal tds) {
		this.tds = tds;
	}
	public BigDecimal getTotalAdjustment() {
		return totalAdjustment;
	}
	public void setTotalAdjustment(BigDecimal totalAdjustment) {
		this.totalAdjustment = totalAdjustment;
	}
	public BigDecimal getOtherCharge() {
		return otherCharge;
	}
	public void setOtherCharge(BigDecimal otherCharge) {
		this.otherCharge = otherCharge;
	}
	public BigDecimal getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(BigDecimal discountAmount) {
		this.discountAmount = discountAmount;
	}
	public BigDecimal getTaxDueAgent() {
		return taxDueAgent;
	}
	public void setTaxDueAgent(BigDecimal taxDueAgent) {
		this.taxDueAgent = taxDueAgent;
	}
	
	//Invoice Template
	public Date getDcmGenerationDate() {
		return dcmGenerationDate;
	}
	public void setDcmGenerationDate(Date dcmGenerationDate) {
		this.dcmGenerationDate = dcmGenerationDate;
	}
	public String getShipmentReference() {
		return shipmentReference;
	}
	public void setShipmentReference(String shipmentReference) {
		this.shipmentReference = shipmentReference;
	}
	public String getAirlineCodeNbr() {
		return airlineCodeNbr;
	}
	public void setAirlineCodeNbr(String airlineCodeNbr) {
		this.airlineCodeNbr = airlineCodeNbr;
	}
	public String getOriginStation() {
		return originStation;
	}
	public void setOriginStation(String originStation) {
		this.originStation = originStation;
	}
	public String getDestinationStation() {
		return destinationStation;
	}
	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}
	public BigDecimal getGrossWeight() {
		return grossWeight;
	}
	public void setGrossWeight(BigDecimal grossWeight) {
		this.grossWeight = grossWeight;
	}
	public BigDecimal getNetWeightCharge() {
		return netWeightCharge;
	}
	public void setNetWeightCharge(BigDecimal netWeightCharge) {
		this.netWeightCharge = netWeightCharge;
	}
	public BigDecimal getGovernmentTax() {
		return governmentTax;
	}
	public void setGovernmentTax(BigDecimal governmentTax) {
		this.governmentTax = governmentTax;
	}
	public BigDecimal getStateTax() {
		return stateTax;
	}
	public void setStateTax(BigDecimal stateTax) {
		this.stateTax = stateTax;
	}
	public String getShipperName() {
		return shipperName;
	}
	public void setShipperName(String shipperName) {
		this.shipperName = shipperName;
	}
	public String getConsigneeName() {
		return consigneeName;
	}
	public void setConsigneeName(String consigneeName) {
		this.consigneeName = consigneeName;
	}
	public BigDecimal getFuelSurcharge() {
		return fuelSurcharge;
	}
	public void setFuelSurcharge(BigDecimal fuelSurcharge) {
		this.fuelSurcharge = fuelSurcharge;
	}
	public BigDecimal getNetAmountPayable() {
		return netAmountPayable;
	}
	public void setNetAmountPayable(BigDecimal netAmountPayable) {
		this.netAmountPayable = netAmountPayable;
	}
	public BigDecimal getVatPercentage() {
		return vatPercentage;
	}
	public void setVatPercentage(BigDecimal vatPercentage) {
		this.vatPercentage = vatPercentage;
	}
	public BigDecimal getGstAmount() {
		return gstAmount;
	}
	public void setGstAmount(BigDecimal gstAmount) {
		this.gstAmount = gstAmount;
	}
	

	
	
	
}
