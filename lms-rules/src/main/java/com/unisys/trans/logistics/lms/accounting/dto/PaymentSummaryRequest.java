package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.constants.CRAParticipantAccountType;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.parts.dto.constants.ParticipantType;

/**
 * @author KurmalNG
 *
 */

public class PaymentSummaryRequest extends AbstractRequest{

	private static final long serialVersionUID = 1L;
	
	private Date paymentStartDate;
	
	private Date paymentEndDate;
	
	private Date billingStartDate;
	
	private Date billingEndDate;
	
	private String participantName;
	
	private String participantAccountNumber;
	
	private String station;
	
	private CRAParticipantAccountType participantType;

	/**
	 * @return the paymentStartDate
	 */
	public Date getPaymentStartDate() {
		return paymentStartDate;
	}

	/**
	 * @param paymentStartDate the paymentStartDate to set
	 */
	public void setPaymentStartDate(Date paymentStartDate) {
		this.paymentStartDate = paymentStartDate;
	}

	/**
	 * @return the paymentEndDate
	 */
	public Date getPaymentEndDate() {
		return paymentEndDate;
	}

	/**
	 * @param paymentEndDate the paymentEndDate to set
	 */
	public void setPaymentEndDate(Date paymentEndDate) {
		this.paymentEndDate = paymentEndDate;
	}

	/**
	 * @return the billingStartDate
	 */
	public Date getBillingStartDate() {
		return billingStartDate;
	}

	/**
	 * @param billingStartDate the billingStartDate to set
	 */
	public void setBillingStartDate(Date billingStartDate) {
		this.billingStartDate = billingStartDate;
	}

	/**
	 * @return the billingEndDate
	 */
	public Date getBillingEndDate() {
		return billingEndDate;
	}

	/**
	 * @param billingEndDate the billingEndDate to set
	 */
	public void setBillingEndDate(Date billingEndDate) {
		this.billingEndDate = billingEndDate;
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

	public CRAParticipantAccountType getParticipantType() {
		return participantType;
	}

	public void setParticipantType(CRAParticipantAccountType participantType) {
		this.participantType = participantType;
	}

}
