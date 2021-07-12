package com.unisys.trans.logistics.lms.accounting.dto;
/**
 * @author KurmalNG
 *
 */
import java.util.Date;

import com.unisys.trans.logistics.lms.accounting.dto.constants.OutstandingAmountLevel;
import com.unisys.trans.logistics.lms.framework.constants.CRABillingScheduleType;
import com.unisys.trans.logistics.lms.framework.constants.CRAParticipantAccountType;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.rating.dto.AWBNumberDto;

public class PaymentOutstandingRequest extends AbstractRequest{
	private static final long serialVersionUID = 1L;
	
	private CRABillingScheduleType detailType = CRABillingScheduleType.PARTICIPANT_ACCOUNT;
	
	private String detailTypeIdentifier;
	
	private String station;
	
	private String participantAccountNumber;
	
	private String participantName;
	
	private OutstandingAmountLevel outstandingAmountLevel = OutstandingAmountLevel.PARTICIPANT;
	
	private String invoiceNumber;
	
	private AirWaybillNumberDto awbNumberDto = new AirWaybillNumberDto();
	
	private String dcmReferenceNumber;
	
	private Date invoiceStartDate;
	
	private Date invoiceEndDate;
	
	private CRAParticipantAccountType  participantAccountType = CRAParticipantAccountType.COMMERCIAL; 
	
	private String specificAirline;

	public String getSpecificAirline() {
		return specificAirline;
	}

	public void setSpecificAirline(String specificAirline) {
		this.specificAirline = specificAirline;
	}

	/**
	 * @return the detailType
	 */
	public CRABillingScheduleType getDetailType() {
		return detailType;
	}

	/**
	 * @param detailType the detailType to set
	 */
	public void setDetailType(CRABillingScheduleType detailType) {
		this.detailType = detailType;
	}

	/**
	 * @return the detailTypeIdentifier
	 */
	public String getDetailTypeIdentifier() {
		return detailTypeIdentifier;
	}

	/**
	 * @param detailTypeIdentifier the detailTypeIdentifier to set
	 */
	public void setDetailTypeIdentifier(String detailTypeIdentifier) {
		this.detailTypeIdentifier = detailTypeIdentifier;
	}

	/**
	 * @return the station
	 */
	public String getStation() {
		return station;
	}

	/**
	 * @param station the station to set
	 */
	public void setStation(String station) {
		this.station = station;
	}

	/**
	 * @return the participantAccountNumber
	 */
	public String getParticipantAccountNumber() {
		return participantAccountNumber;
	}

	/**
	 * @param participantAccountNumber the participantAccountNumber to set
	 */
	public void setParticipantAccountNumber(String participantAccountNumber) {
		this.participantAccountNumber = participantAccountNumber;
	}

	/**
	 * @return the participantName
	 */
	public String getParticipantName() {
		return participantName;
	}

	/**
	 * @param participantName the participantName to set
	 */
	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}

	/**
	 * @return the outstandingAmountLevel
	 */
	public OutstandingAmountLevel getOutstandingAmountLevel() {
		return outstandingAmountLevel;
	}

	/**
	 * @param outstandingAmountLevel the outstandingAmountLevel to set
	 */
	public void setOutstandingAmountLevel(
			OutstandingAmountLevel outstandingAmountLevel) {
		this.outstandingAmountLevel = outstandingAmountLevel;
	}

	/**
	 * @return the invoiceNumber
	 */
	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	/**
	 * @param invoiceNumber the invoiceNumber to set
	 */
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	/**
	 * @return the awbNumberDto
	 */
	public AirWaybillNumberDto getAwbNumberDto() {
		return awbNumberDto;
	}

	/**
	 * @param awbNumberDto the awbNumberDto to set
	 */
	public void setAwbNumberDto(AirWaybillNumberDto awbNumberDto) {
		this.awbNumberDto = awbNumberDto;
	}

	/**
	 * @return the invoiceStartDate
	 */
	public Date getInvoiceStartDate() {
		return invoiceStartDate;
	}

	/**
	 * @param invoiceStartDate the invoiceStartDate to set
	 */
	public void setInvoiceStartDate(Date invoiceStartDate) {
		this.invoiceStartDate = invoiceStartDate;
	}

	/**
	 * @return the invoiceEndDate
	 */
	public Date getInvoiceEndDate() {
		return invoiceEndDate;
	}

	/**
	 * @param invoiceEndDate the invoiceEndDate to set
	 */
	public void setInvoiceEndDate(Date invoiceEndDate) {
		this.invoiceEndDate = invoiceEndDate;
	}

	/**
	 * @return the dcmReferenceNumber
	 */
	public String getDcmReferenceNumber() {
		return dcmReferenceNumber;
	}

	/**
	 * @param dcmReferenceNumber the dcmReferenceNumber to set
	 */
	public void setDcmReferenceNumber(String dcmReferenceNumber) {
		this.dcmReferenceNumber = dcmReferenceNumber;
	}

	/**
	 * @return the participantAccountType
	 */
	public CRAParticipantAccountType getParticipantAccountType() {
		return participantAccountType;
	}

	/**
	 * @param participantAccountType the participantAccountType to set
	 */
	public void setParticipantAccountType(
			CRAParticipantAccountType participantAccountType) {
		this.participantAccountType = participantAccountType;
	}
	
}
