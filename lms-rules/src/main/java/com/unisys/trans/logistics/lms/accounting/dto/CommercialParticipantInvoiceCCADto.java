/**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.Date;

/** 
 * 
 * @author SeramRaK
 * 
 */
public class CommercialParticipantInvoiceCCADto extends ParticipantInvoiceDetailDto {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//private static final long serialVersionUID = 1931835925899600933L;

	private String vatIndicatorString;
	
	private Date ccaGenerationDate;
	
	private Integer valuationCharge;
	
	private Integer otherChargeDueCarrier;
	
	private Integer otherChargesDueAgent;
	
	private Integer commissionPercentage;
	
	private Integer commissionAmount;
	
	private Character commissionIndicator;
	
	private Integer discountAmount;
	
	private Integer taxDueAirline;
	
	private Integer taxDueAgent;
	
	private Character taxDueAirlineIndicator;
	
	private Character discountIndicator;
	
	private String ccaNumber;
	
	private CASSParticipantInvoiceSummaryDto cASSParticipantInvoiceSummaryDto;
	public String getVatIndicatorString() {
		return vatIndicatorString;
	}
	public void setVatIndicatorString(String vatIndicatorString) {
		this.vatIndicatorString = vatIndicatorString;
	}
	public Date getCcaGenerationDate() {
		return ccaGenerationDate;
	}
	public void setCcaGenerationDate(Date ccaGenerationDate) {
		this.ccaGenerationDate = ccaGenerationDate;
	}
	
	public Integer getValuationCharge() {
		return valuationCharge;
	}
	public void setValuationCharge(Integer valuationCharge) {
		this.valuationCharge = valuationCharge;
	}
	public Integer getOtherChargeDueCarrier() {
		return otherChargeDueCarrier;
	}
	public void setOtherChargeDueCarrier(Integer otherChargeDueCarrier) {
		this.otherChargeDueCarrier = otherChargeDueCarrier;
	}
	public Integer getOtherChargesDueAgent() {
		return otherChargesDueAgent;
	}
	public void setOtherChargesDueAgent(Integer otherChargesDueAgent) {
		this.otherChargesDueAgent = otherChargesDueAgent;
	}
	public Integer getCommissionPercentage() {
		return commissionPercentage;
	}
	public void setCommissionPercentage(Integer commissionPercentage) {
		this.commissionPercentage = commissionPercentage;
	}
	public Integer getCommissionAmount() {
		return commissionAmount;
	}
	public void setCommissionAmount(Integer commissionAmount) {
		this.commissionAmount = commissionAmount;
	}
	public Character getCommissionIndicator() {
		return commissionIndicator;
	}
	public void setCommissionIndicator(Character commissionIndicator) {
		this.commissionIndicator = commissionIndicator;
	}
	public Integer getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(Integer discountAmount) {
		this.discountAmount = discountAmount;
	}
	
	public Integer getTaxDueAirline() {
		return taxDueAirline;
	}
	public void setTaxDueAirline(Integer taxDueAirline) {
		this.taxDueAirline = taxDueAirline;
	}
	public Integer getTaxDueAgent() {
		return taxDueAgent;
	}
	public void setTaxDueAgent(Integer taxDueAgent) {
		this.taxDueAgent = taxDueAgent;
	}
	public Character getTaxDueAirlineIndicator() {
		return taxDueAirlineIndicator;
	}
	public void setTaxDueAirlineIndicator(Character taxDueAirlineIndicator) {
		this.taxDueAirlineIndicator = taxDueAirlineIndicator;
	}
	public Character getDiscountIndicator() {
		return discountIndicator;
	}
	public void setDiscountIndicator(Character discountIndicator) {
		this.discountIndicator = discountIndicator;
	}
	public String getCcaNumber() {
		return ccaNumber;
	}
	public void setCcaNumber(String ccaNumber) {
		this.ccaNumber = ccaNumber;
	}
	public CASSParticipantInvoiceSummaryDto getcASSParticipantInvoiceSummaryDto() {
		return cASSParticipantInvoiceSummaryDto;
	}
	public void setcASSParticipantInvoiceSummaryDto(
			CASSParticipantInvoiceSummaryDto cASSParticipantInvoiceSummaryDto) {
		this.cASSParticipantInvoiceSummaryDto = cASSParticipantInvoiceSummaryDto;
	}
	
	
	
}