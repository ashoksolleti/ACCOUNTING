package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.constants.ExportPaymentType;

public class AccountingFlownRevenueDto extends ParticipantInvoiceDetailDto {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -4786601253961156710L;

	/** The valuation charge. */
	private BigDecimal valuationCharge;
	
	/** The other charges due carrier. */
	private BigDecimal otherChargesDueCarrier;
	
	/** The other charges due agent. */
	private BigDecimal otherChargesDueAgent;
	
	private BigDecimal otherChargesSum;
	public BigDecimal getOtherChargesSum() {
		return otherChargesSum;
	}

	public void setOtherChargesSum(BigDecimal otherChargesSum) {
		this.otherChargesSum = otherChargesSum;
	}

	/** The tax due airline. */
	private BigDecimal taxDueAirline;
	
	/** The tax due agent. */
	private BigDecimal taxDueAgent;
	
	/** The tax due airline indicator. */
	private boolean taxDueAirlineIndicator;
	
	private BigDecimal fuelSurcharge;
	
	private BigDecimal securitySurcharge;
	
	private List<OtherChargeSplitDto> otherchargesBreakDown;
	
	private OnlineProrationDetailDto onlineProrationDetailDto;
	
	private CarrierReceivableDto carrierReceivableDto;
	
	private boolean hostCarrierIndicator;
	
	private BigDecimal carrierRevenue;
	
	private ExportPaymentType paycodeIndicator;
	
	private String originStation;
	
	private String hostACNNumber;
	
	private AirWaybillRevenueDto airWaybillRevenueDto;
	
	private String hostCarrierCode;

	private String provision;
	
	private String billingType;
	
	public String getHostCarrierCode() {
		return hostCarrierCode;
	}

	public void setHostCarrierCode(String hostCarrierCode) {
		this.hostCarrierCode = hostCarrierCode;
	}

	public AirWaybillRevenueDto getAirWaybillRevenueDto() {
		return airWaybillRevenueDto;
	}

	public void setAirWaybillRevenueDto(AirWaybillRevenueDto airWaybillRevenueDto) {
		this.airWaybillRevenueDto = airWaybillRevenueDto;
	}

	public CarrierReceivableDto getCarrierReceivableDto() {
		return carrierReceivableDto;
	}

	public void setCarrierReceivableDto(CarrierReceivableDto carrierReceivableDto) {
		this.carrierReceivableDto = carrierReceivableDto;
	}

	public String getHostACNNumber() {
		return hostACNNumber;
	}

	public void setHostACNNumber(String hostACNNumber) {
		this.hostACNNumber = hostACNNumber;
	}

	public String getOriginStation() {
		return originStation;
	}

	public void setOriginStation(String originStation) {
		this.originStation = originStation;
	}

	private String acnNumber;
	
	public String getAcnNumber() {
		return acnNumber;
	}

	public void setAcnNumber(String acnNumber) {
		this.acnNumber = acnNumber;
	}

	public ExportPaymentType getPaycodeIndicator() {
		return paycodeIndicator;
	}

	public void setPaycodeIndicator(ExportPaymentType paycodeIndicator) {
		this.paycodeIndicator = paycodeIndicator;
	}

	public BigDecimal getCarrierRevenue() {
		if(carrierRevenue == null){
			carrierRevenue = new BigDecimal(0);
		}
		return carrierRevenue;
	}

	public void setCarrierRevenue(BigDecimal carrierRevenue) {
		this.carrierRevenue = carrierRevenue;
	}

	public boolean isHostCarrierIndicator() {
		return hostCarrierIndicator;
	}

	public void setHostCarrierIndicator(boolean hostCarrierIndicator) {
		this.hostCarrierIndicator = hostCarrierIndicator;
	}

	public List<OtherChargeSplitDto> getOtherchargesBreakDown() {
		if(otherchargesBreakDown ==null)
		{
			otherchargesBreakDown = new ArrayList<OtherChargeSplitDto>();
		}
		return otherchargesBreakDown;
	}

	public void setOtherchargesBreakDown(
			List<OtherChargeSplitDto> otherchargesBreakDown) {
		this.otherchargesBreakDown = otherchargesBreakDown;
	}


	
	
	public OnlineProrationDetailDto getOnlineProrationDetailDto() {
		return onlineProrationDetailDto;
	}

	public void setOnlineProrationDetailDto(
			OnlineProrationDetailDto onlineProrationDetailDto) {
		this.onlineProrationDetailDto = onlineProrationDetailDto;
	}

	/**
	 * @return the valuationCharge
	 */
	public BigDecimal getValuationCharge() {
		if(valuationCharge == null){
			valuationCharge = new BigDecimal(0);
		}
		return valuationCharge;
	}

	/**
	 * @param valuationCharge the valuationCharge to set
	 */
	public void setValuationCharge(BigDecimal valuationCharge) {
		this.valuationCharge = valuationCharge;
	}

	/**
	 * @return the otherChargesDueCarrier
	 */
	public BigDecimal getOtherChargesDueCarrier() {
		if(otherChargesDueCarrier == null){
			otherChargesDueCarrier = new BigDecimal(0);
		}
		return otherChargesDueCarrier;
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
		if(otherChargesDueAgent == null){
			otherChargesDueAgent = new BigDecimal(0);
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
	 * @return the taxDueAirline
	 */
	public BigDecimal getTaxDueAirline() {
		if(taxDueAirline == null){
			taxDueAirline = new BigDecimal(0);
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
		if(taxDueAgent == null){
			taxDueAgent = new BigDecimal(0);
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
	 * @return the taxDueAirlineIndicator
	 */
	public boolean isTaxDueAirlineIndicator() {
		return taxDueAirlineIndicator;
	}

	/**
	 * @param taxDueAirlineIndicator the taxDueAirlineIndicator to set
	 */
	public void setTaxDueAirlineIndicator(boolean taxDueAirlineIndicator) {
		this.taxDueAirlineIndicator = taxDueAirlineIndicator;
	}

	/**
	 * @return the fuelSurcharge
	 */
	public BigDecimal getFuelSurcharge() {
		if(fuelSurcharge == null){
			fuelSurcharge = new BigDecimal(0);
		}
		return fuelSurcharge;
	}

	/**
	 * @param fuelSurcharge the fuelSurcharge to set
	 */
	public void setFuelSurcharge(BigDecimal fuelSurcharge) {
		this.fuelSurcharge = fuelSurcharge;
	}

	/**
	 * @return the securitySurcharge
	 */
	public BigDecimal getSecuritySurcharge() {
		if(securitySurcharge == null){
			securitySurcharge = new BigDecimal(0);
		}
		return securitySurcharge;
	}

	/**
	 * @param securitySurcharge the securitySurcharge to set
	 */
	public void setSecuritySurcharge(BigDecimal securitySurcharge) {
		this.securitySurcharge = securitySurcharge;
	}

	public String getProvision() {
		return provision;
	}

	public void setProvision(String provision) {
		this.provision = provision;
	}

	/**
	 * @return the billingType
	 */
	public String getBillingType() {
		return billingType;
	}

	/**
	 * @param billingType the billingType to set
	 */
	public void setBillingType(String billingType) {
		this.billingType = billingType;
	}
	
	
	
	
}
