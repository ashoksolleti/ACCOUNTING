package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.Date;



import com.unisys.trans.logistics.lms.accounting.dto.constants.RevenueIndicatorType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class CommercialImportRepotDTO extends PersistenceObjectDto {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4178009201326172957L;

	/** The awb number. */
	private String awbNumber;
	
	/** The execution date. */
	private Date executionDate;
	
	/** The origin station. */
	private String originStation;
	
	/** The destination station. */
	private String destinationStation;
	
	
	private Date flightDate;

    /**
     * Attribute to holds <code>flightNumber</code> property.
     */
	
	private BigDecimal totalWeightCharges;
   
    private String flightNumber;
    /** The gross weight. */
	private BigDecimal grossWeight;
	
	
	/** The tax due airline. */
	private BigDecimal taxDueAirline;
	
	/** The tax due agent. */
	private BigDecimal taxDueAgent;
	/** The weight charge. */
	private BigDecimal weightCharge;
	
	/** The rate of exchange. */
	private BigDecimal rateOfExchange;
	
	
	/** The other charges due carrier. */
	private BigDecimal otherChargesDueCarrier;
	
	/** The other charges due agent. */
	private BigDecimal otherChargesDueAgent;
	
	
	/** The commission percentage. */
	private BigDecimal commissionPercentage;
	
	/** The commission amount. */
	private BigDecimal commissionAmount;
	

	/** The tds percentage. */
	private BigDecimal tdsPercentage;
	
	/** The tds amount. */
	private BigDecimal tdsAmount;
	
	private BigDecimal  netAmountPayable;
	
	private String reveIndicatorType;
	
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
	
	

	
	
	
	/**
	 * @return the awbNumber
	 */
	public String getAwbNumber() {
		return awbNumber;
	}







	/**
	 * @param awbNumber the awbNumber to set
	 */
	public void setAwbNumber(String awbNumber) {
		this.awbNumber = awbNumber;
	}







	/**
	 * @return the executionDate
	 */
	public Date getExecutionDate() {
		return executionDate;
	}







	/**
	 * @param executionDate the executionDate to set
	 */
	public void setExecutionDate(Date executionDate) {
		this.executionDate = executionDate;
	}







	/**
	 * @return the originStation
	 */
	public String getOriginStation() {
		return originStation;
	}







	/**
	 * @param originStation the originStation to set
	 */
	public void setOriginStation(String originStation) {
		this.originStation = originStation;
	}







	/**
	 * @return the destinationStation
	 */
	public String getDestinationStation() {
		return destinationStation;
	}







	/**
	 * @param destinationStation the destinationStation to set
	 */
	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}







	/**
	 * @return the flightDate
	 */
	public Date getFlightDate() {
		return flightDate;
	}







	/**
	 * @param flightDate the flightDate to set
	 */
	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
	}







	/**
	 * @return the flightNumber
	 */
	public String getFlightNumber() {
		return flightNumber;
	}







	/**
	 * @param flightNumber the flightNumber to set
	 */
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}







	/**
	 * @return the grossWeight
	 */
	public BigDecimal getGrossWeight() {
		if(grossWeight== null)
		{
			grossWeight= new BigDecimal(0);
		}
		return grossWeight;
	}







	/**
	 * @param grossWeight the grossWeight to set
	 */
	public void setGrossWeight(BigDecimal grossWeight) {
		this.grossWeight = grossWeight;
	}







	/**
	 * @return the weightCharge
	 */
	public BigDecimal getWeightCharge() {
		if(weightCharge== null)
		{
			weightCharge= new BigDecimal(0);
		}
		return weightCharge;
	}







	/**
	 * @param weightCharge the weightCharge to set
	 */
	public void setWeightCharge(BigDecimal weightCharge) {
		this.weightCharge = weightCharge;
	}







	/**
	 * @return the rateOfExchange
	 */
	public BigDecimal getRateOfExchange() {
		
		if(rateOfExchange== null)
		{
			rateOfExchange= new BigDecimal(0);
		}
		return rateOfExchange;
	}







	/**
	 * @param rateOfExchange the rateOfExchange to set
	 */
	public void setRateOfExchange(BigDecimal rateOfExchange) {
		this.rateOfExchange = rateOfExchange;
	}







	/**
	 * @return the otherChargesDueCarrier
	 */
	public BigDecimal getOtherChargesDueCarrier() {
		if(otherChargesDueCarrier== null)
		{
			otherChargesDueCarrier= new BigDecimal(0);
		}
		return otherChargesDueCarrier;
	}







	/**
	 * @return the totalWeightCharges
	 */
	public BigDecimal getTotalWeightCharges() {
		if(totalWeightCharges==null)
		{
			totalWeightCharges= new BigDecimal(0);
		}
		return totalWeightCharges;
	}







	/**
	 * @param totalWeightCharges the totalWeightCharges to set
	 */
	public void setTotalWeightCharges(BigDecimal totalWeightCharges) {
		this.totalWeightCharges = totalWeightCharges;
	}







	/**
	 * @return the taxDueAirline
	 */
	public BigDecimal getTaxDueAirline() {
		if(taxDueAirline==null)
		{
			taxDueAirline= new BigDecimal(0);
		}
		return taxDueAirline;
	}







	/**
	 * @param taxDueAirline the taxDueAirline to set
	 */
	public void setTaxDueAirline(BigDecimal taxDueAirline) {
		this.taxDueAirline = taxDueAirline;
	}







	/**
	 * @return the taxDueAgent
	 */
	public BigDecimal getTaxDueAgent() {
		if(taxDueAgent== null)
		{
			taxDueAgent= new BigDecimal(0);
		}
		return taxDueAgent;
	}







	/**
	 * @param taxDueAgent the taxDueAgent to set
	 */
	public void setTaxDueAgent(BigDecimal taxDueAgent) {
		this.taxDueAgent = taxDueAgent;
	}







	/**
	 * @param otherChargesDueCarrier the otherChargesDueCarrier to set
	 */
	public void setOtherChargesDueCarrier(BigDecimal otherChargesDueCarrier) {
		this.otherChargesDueCarrier = otherChargesDueCarrier;
	}







	/**
	 * @return the otherChargesDueAgent
	 */
	public BigDecimal getOtherChargesDueAgent() {
		if(otherChargesDueAgent== null)
		{
			otherChargesDueAgent= new BigDecimal(0);
		}
		return otherChargesDueAgent;
	}







	/**
	 * @param otherChargesDueAgent the otherChargesDueAgent to set
	 */
	public void setOtherChargesDueAgent(BigDecimal otherChargesDueAgent) {
		this.otherChargesDueAgent = otherChargesDueAgent;
	}







	/**
	 * @return the commissionPercentage
	 */
	public BigDecimal getCommissionPercentage() {
		return commissionPercentage;
	}







	/**
	 * @param commissionPercentage the commissionPercentage to set
	 */
	public void setCommissionPercentage(BigDecimal commissionPercentage) {
		this.commissionPercentage = commissionPercentage;
	}







	/**
	 * @return the commissionAmount
	 */
	public BigDecimal getCommissionAmount() {
		if(commissionAmount== null)
		{
			commissionAmount= new BigDecimal(0);
		}
		return commissionAmount;
	}

	public BigDecimal getTdsPercentage() {
		return tdsPercentage;
	}

	public void setTdsPercentage(BigDecimal tdsPercentage) {
		this.tdsPercentage = tdsPercentage;
	}

	public BigDecimal getTdsAmount() {
		if(tdsAmount== null)
		{
			tdsAmount= new BigDecimal(0);
		}
		return tdsAmount;
	}

	public void setTdsAmount(BigDecimal tdsAmount) {
		this.tdsAmount = tdsAmount;
	}

	/**
	 * @param commissionAmount the commissionAmount to set
	 */
	public void setCommissionAmount(BigDecimal commissionAmount) {
		this.commissionAmount = commissionAmount;
	}







	/**
	 * @return the netAmountPayable
	 */
	public BigDecimal getNetAmountPayable() {
		if(netAmountPayable== null)
		{
			netAmountPayable= new BigDecimal(0);
		}
		return netAmountPayable;
	}







	/**
	 * @param netAmountPayable the netAmountPayable to set
	 */
	public void setNetAmountPayable(BigDecimal netAmountPayable) {
		this.netAmountPayable = netAmountPayable;
	}







	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return null;
	}







	/**
	 * @return the reveIndicatorType
	 */
	public String getReveIndicatorType() {
		return reveIndicatorType;
	}







	/**
	 * @param reveIndicatorType the reveIndicatorType to set
	 */
	public void setReveIndicatorType(String reveIndicatorType) {
		this.reveIndicatorType = reveIndicatorType;
	}


	public BigDecimal getGstAmount() {
		if(gstAmount== null)
		{
			gstAmount= new BigDecimal(0);
		}
		
		return gstAmount;
	}
	
	public void setGstAmount(BigDecimal gstAmount) {
		this.gstAmount = gstAmount;
	}
	
	
	

}
