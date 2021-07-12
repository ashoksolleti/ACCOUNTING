/**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;

/**
 * @author SeramRaK
 *
 */
public class InterlineReportDto {

	private String clearingHouse;
	private String awbNo;
	private String awbOrigin;
	private String awbDestination;
	private String sectorOrigin;
	private String sectorDestination;
	private String airWaybillPaymentType;
	private BigDecimal totalAwb; 
	private BigDecimal weightCharges;
	private BigDecimal valuationCharges;
	private BigDecimal otherCharges;
	private BigDecimal isc;
	
	private BigDecimal iscAmount;
	private BigDecimal vatAmount;
	private BigDecimal chargesDueCarrier;
	private BigDecimal chargesDueAgent;
	private BigDecimal taxDueAirline;
	private BigDecimal taxDueAgent;
	private String prorateType;
	private String agreementIdentifier;
	private Long prorateFactor;
	public String getClearingHouse() {
		return clearingHouse;
	}
	public void setClearingHouse(String clearingHouse) {
		this.clearingHouse = clearingHouse;
	}
	public String getAwbNo() {
		return awbNo;
	}
	public void setAwbNo(String awbNo) {
		this.awbNo = awbNo;
	}
	public String getAwbOrigin() {
		return awbOrigin;
	}
	public void setAwbOrigin(String awbOrigin) {
		this.awbOrigin = awbOrigin;
	}
	public String getAwbDestination() {
		return awbDestination;
	}
	public void setAwbDestination(String awbDestination) {
		this.awbDestination = awbDestination;
	}
	public String getSectorOrigin() {
		return sectorOrigin;
	}
	public void setSectorOrigin(String sectorOrigin) {
		this.sectorOrigin = sectorOrigin;
	}
	public String getSectorDestination() {
		return sectorDestination;
	}
	public void setSectorDestination(String sectorDestination) {
		this.sectorDestination = sectorDestination;
	}
	public String getAirWaybillPaymentType() {
		return airWaybillPaymentType;
	}
	public void setAirWaybillPaymentType(String airWaybillPaymentType) {
		this.airWaybillPaymentType = airWaybillPaymentType;
	}
	public BigDecimal getTotalAwb() {
		return totalAwb;
	}
	public void setTotalAwb(BigDecimal totalAwb) {
		this.totalAwb = totalAwb;
	}
	/**
	 * @return the isc
	 */
	public BigDecimal getIsc() {
		return isc;
	}
	/**
	 * @param isc the isc to set
	 */
	public void setIsc(BigDecimal isc) {
		this.isc = isc;
	}
	public BigDecimal getWeightCharges() {
		return weightCharges;
	}
	public void setWeightCharges(BigDecimal weightCharges) {
		this.weightCharges = weightCharges;
	}
	public BigDecimal getValuationCharges() {
		return valuationCharges;
	}
	public void setValuationCharges(BigDecimal valuationCharges) {
		this.valuationCharges = valuationCharges;
	}
	public BigDecimal getOtherCharges() {
		return otherCharges;
	}
	public void setOtherCharges(BigDecimal otherCharges) {
		this.otherCharges = otherCharges;
	}
	public BigDecimal getIscPercentageActual() {
		return isc;
	}
	public void setIscPercentageActual(BigDecimal iscPercentageActual) {
		this.isc = iscPercentageActual;
	}
	public BigDecimal getIscAmount() {
		return iscAmount;
	}
	public void setIscAmount(BigDecimal iscAmount) {
		this.iscAmount = iscAmount;
	}
	
	public BigDecimal getVatAmount() {
		return vatAmount;
	}
	public void setVatAmount(BigDecimal vatAmount) {
		this.vatAmount = vatAmount;
	}
	public BigDecimal getChargesDueCarrier() {
		return chargesDueCarrier;
	}
	public void setChargesDueCarrier(BigDecimal chargesDueCarrier) {
		this.chargesDueCarrier = chargesDueCarrier;
	}
	public BigDecimal getChargesDueAgent() {
		return chargesDueAgent;
	}
	public void setChargesDueAgent(BigDecimal chargesDueAgent) {
		this.chargesDueAgent = chargesDueAgent;
	}
	public BigDecimal getTaxDueAirline() {
		return taxDueAirline;
	}
	public void setTaxDueAirline(BigDecimal taxDueAirline) {
		this.taxDueAirline = taxDueAirline;
	}
	public BigDecimal getTaxDueAgent() {
		return taxDueAgent;
	}
	public void setTaxDueAgent(BigDecimal taxDueAgent) {
		this.taxDueAgent = taxDueAgent;
	}
	public String getProrateType() {
		return prorateType;
	}
	public void setProrateType(String prorateType) {
		this.prorateType = prorateType;
	}
	public String getAgreementIdentifier() {
		return agreementIdentifier;
	}
	public void setAgreementIdentifier(String agreementIdentifier) {
		this.agreementIdentifier = agreementIdentifier;
	}
	public Long getProrateFactor() {
		return prorateFactor;
	}
	public void setProrateFactor(Long prorateFactor) {
		this.prorateFactor = prorateFactor;
	}
	
	
	
	
	
}
