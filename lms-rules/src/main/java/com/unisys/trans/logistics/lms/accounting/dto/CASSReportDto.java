/**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.unisys.trans.logistics.lms.framework.logging.LMSLogger;

/**
 * @author SeramRaK
 *
 */
public class CASSReportDto {

	
	private String awbNumber;
	private BigDecimal weightCharge;
	private BigDecimal grossWeight;
	private BigDecimal otherChargesDueCarrier;
	private BigDecimal commissionAmount;
	private Date executionDate;
	private BigDecimal valuationCharge;
	private String originStation;
	private String destinationStation;
	private BigDecimal netAmountBeforeTax;
	private BigDecimal netAmountPayable;
	private BigDecimal discountAmount;
	private BigDecimal taxDueAirline;
	private String serialNumber;
	private String debit;
	private String agentCode;
	
	/**
	 * @return the agentCode
	 */
	public String getAgentCode() {
		return agentCode;
	}
	/**
	 * @param agentCode the agentCode to set
	 */
	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}
	public String getAwbNumber() {
		return awbNumber;
	}
	public void setAwbNumber(String awbNumber) {
		this.awbNumber = awbNumber;
	}
	public BigDecimal getGrossWeight() {
		if(grossWeight==null)
		{
			grossWeight=new BigDecimal(0);
		}
		return grossWeight;
	}
	public void setGrossWeight(BigDecimal grossWeight) {
		this.grossWeight = grossWeight;
	}
	public BigDecimal getOtherChargesDueCarrier() {
		if(otherChargesDueCarrier==null)
		{
			otherChargesDueCarrier=new BigDecimal(0);
		}
		return otherChargesDueCarrier;
	}
	public void setOtherChargesDueCarrier(BigDecimal otherChargesDueCarrier) {
		this.otherChargesDueCarrier = otherChargesDueCarrier;
	}
	public BigDecimal getCommissionAmount() {
		if(commissionAmount==null)
		{
			commissionAmount=new BigDecimal(0);
		}
		return commissionAmount;
	}
	public void setCommissionAmount(BigDecimal commissionAmount) {
		this.commissionAmount = commissionAmount;
	}
	public Date getExecutionDate() {
		return executionDate;
	}
	public void setExecutionDate(Date executionDate) {
		this.executionDate = executionDate;
	}
	public BigDecimal getValuationCharge() {
		if(valuationCharge==null)
		{
			valuationCharge=new BigDecimal(0);
		}
		return valuationCharge;
	}
	public void setValuationCharge(BigDecimal valuationCharge) {
		this.valuationCharge = valuationCharge;
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
	public BigDecimal getNetAmountBeforeTax() {
		if(netAmountBeforeTax==null)
		{
			netAmountBeforeTax=new BigDecimal(0);
		}
		return netAmountBeforeTax;
	}
	public void setNetAmountBeforeTax(BigDecimal netAmountBeforeTax) {
		this.netAmountBeforeTax = netAmountBeforeTax;
	}
	public BigDecimal getNetAmountPayable() {
		if(netAmountPayable==null)
		{
			netAmountPayable=new BigDecimal(0);
		}
		return netAmountPayable;
	}
	public void setNetAmountPayable(BigDecimal netAmountPayable) {
		this.netAmountPayable = netAmountPayable;
	}
	public BigDecimal getDiscountAmount() {
		if(discountAmount==null)
		{
			discountAmount=new BigDecimal(0);
		}
		return discountAmount;
	}
	public void setDiscountAmount(BigDecimal discountAmount) {
		this.discountAmount = discountAmount;
	}
	public BigDecimal getTaxDueAirline() {
		LMSLogger.info("in CASSReportDto.getTaxDueAirline");
		if(taxDueAirline==null)
		{
			taxDueAirline=new BigDecimal(0);
		}
		return taxDueAirline;
	}
	public void setTaxDueAirline(BigDecimal taxDueAirline) {
		this.taxDueAirline = taxDueAirline;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public BigDecimal getWeightCharge() {
		if(weightCharge==null)
		{
			weightCharge=new BigDecimal(0);
		}
		return weightCharge;
	}
	public void setWeightCharge(BigDecimal weightCharge) {
		this.weightCharge = weightCharge;
	}
	public String getDebit() {
		return debit;
	}
	public void setDebit(String debit) {
		this.debit = debit;
	}
	

	
	
}
