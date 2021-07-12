package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.unisys.trans.logistics.lms.accounting.dto.constants.ReceivableType;
import com.unisys.trans.logistics.lms.framework.constants.CRAParticipantAccountType;
import com.unisys.trans.logistics.lms.framework.constants.InvoiceParticipantAccountType;

public class AirWaybillInvoiceFindDto  implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;
	
	private List<String> accountNumber;
	private Date billingFromDate;
	private Date billingToDate;
	private ReceivableType receivableType;
	private String carrierCode;
	private InvoiceParticipantAccountType accountType;
	
	private String airlineCodeNbr;
	private String shipmentRefNumber;
	private String originStation;
	private String destStation;
	private Date executionDate;
	private boolean bkgSegmentForInterline;
	private boolean specificAirlineParameter;
	private String specificAirline;
	private String slidingScaleOid;
	private Long gsaOid;
	private String gsaWeightType;
	
	public String getGsaWeightType() {
		return gsaWeightType;
	}

	public void setGsaWeightType(String gsaWeightType) {
		this.gsaWeightType = gsaWeightType;
	}

	public Long getGsaOid() {
		return gsaOid;
	}

	public void setGsaOid(Long gsaOid) {
		this.gsaOid = gsaOid;
	}
	private Map<Long, List<Long>> gsaId;

    public Map<Long, List<Long>> getGsaId() {
		return gsaId;
	}

	public void setGsaId(Map<Long, List<Long>> gsaId) {
		this.gsaId = gsaId;
	}
	
	

	
	public String getSlidingScaleOid() {
		return slidingScaleOid;
	}
	public void setSlidingScaleOid(String slidingScaleOid) {
		this.slidingScaleOid = slidingScaleOid;
	}
	public boolean isBkgSegmentForInterline() {
		return bkgSegmentForInterline;
	}
	public void setBkgSegmentForInterline(boolean bkgSegmentForInterline) {
		this.bkgSegmentForInterline = bkgSegmentForInterline;
	}
	public String getAirlineCodeNbr() {
		return airlineCodeNbr;
	}
	public void setAirlineCodeNbr(String airlineCodeNbr) {
		this.airlineCodeNbr = airlineCodeNbr;
	}
	public String getShipmentRefNumber() {
		return shipmentRefNumber;
	}
	public void setShipmentRefNumber(String shipmentRefNumber) {
		this.shipmentRefNumber = shipmentRefNumber;
	}
	public String getOriginStation() {
		return originStation;
	}
	public void setOriginStation(String originStation) {
		this.originStation = originStation;
	}
	public String getDestStation() {
		return destStation;
	}
	public void setDestStation(String destStation) {
		this.destStation = destStation;
	}
	public Date getExecutionDate() {
		return executionDate;
	}
	public void setExecutionDate(Date executionDate) {
		this.executionDate = executionDate;
	}
	public List<String> getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(List<String> accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Date getBillingFromDate() {
		return billingFromDate;
	}
	public void setBillingFromDate(Date billingFromDate) {
		this.billingFromDate = billingFromDate;
	}
	public Date getBillingToDate() {
		return billingToDate;
	}
	public void setBillingToDate(Date billingToDate) {
		this.billingToDate = billingToDate;
	}
	
	public ReceivableType getReceivableType() {
		return receivableType;
	}

	public void setReceivableType(ReceivableType receivableType) {
		this.receivableType = receivableType;
	}
	public String getCarrierCode() {
		return carrierCode;
	}
	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}
	/**
	 * @return the accountType
	 */
	public InvoiceParticipantAccountType getAccountType() {
		return accountType;
	}
	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(InvoiceParticipantAccountType accountType) {
		this.accountType = accountType;
	}
	/**
	 * @return the specificAirlineParameter
	 */
	public boolean isSpecificAirlineParameter() {
		return specificAirlineParameter;
	}
	/**
	 * @param specificAirlineParameter the specificAirlineParameter to set
	 */
	public void setSpecificAirlineParameter(boolean specificAirlineParameter) {
		this.specificAirlineParameter = specificAirlineParameter;
	}
	/**
	 * @return the specificAirline
	 */
	public String getSpecificAirline() {
		return specificAirline;
	}
	/**
	 * @param specificAirline the specificAirline to set
	 */
	public void setSpecificAirline(String specificAirline) {
		this.specificAirline = specificAirline;
	}
	
	
	
	
}
