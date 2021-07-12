/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.accounting.dto.constants.ParticipantAccountType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * <code>AdjustmentsFindDto</code> contain details for finding
 * InterlineAgreements.
 * <p>
 * This contains all information about finding Interline Agreements.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>agreementIdentifier
 * <li>agreementType
 * <li>airWayDestination
 * <li>airwayOrigin
 * <li>dateRangeDto
 * <li>issuingACN
 * <li>oId
 * <li>toCarrier
 * </ul>
 */

public class AdjustmentsFindDto extends PersistenceObjectDto {

	/**
     * 
     */
	private static final long serialVersionUID = -2066866043577759846L;

	/**
	 * Attribute to hold <code>participantName</code> property.
	 */
	private String participantName;

	/**
	 * Attribute to hold <code>participantAccountNumber</code> property.
	 */
	private String participantAccountNumber;

	/**
	 * Attribute to hold <code>station</code> property.
	 */
	private String station;

	/**
	 * Attribute to hold <code>flightDate</code> property.
	 */
	/*
	 * private Date flightDate;
	 */

	/**
	 * Attribute to hold <code>flightNumber</code> property.
	 */
	private String flightNumber;

	/**
	 * Attribute to hold <code>participantAccountType</code> property.
	 */
	private ParticipantAccountType participantAccountType;

	/**
	 * Attribute to hold <code>originStation</code> property.
	 */
	private String originStation;

	/**
	 * Attribute to hold <code>destinationStation</code> property.
	 */
	private String destinationStation;

	/**
	 * Attribute to hold <code>contractNumber</code> property.
	 */
	private String contractNumber;

	/**
	 * Attribute to hold <code>productCode</code> property.
	 */
	private String productCode;

	/**
	 * Attribute to hold <code>startDate</code> property.
	 */
	private Date startDate;

	/**
	 * Attribute to hold <code>endDate</code> property.
	 */
	private Date endDate;

	/**
	 * Attribute to hold <code>importAuditCompleted</code> property.
	 */
	private boolean importAuditCompleted;

	/**
	 * Attribute to hold <code>oId</code> property.
	 */
	private Long oId;
	/**
	 * Gets the <code>participantName</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>participantName</code> property.
	 */

	// NAC
	/**
	 * Attribute to hold <code>oId</code> property.
	 */
	private String specificAirline;

	public String getParticipantName() {
		return this.participantName;
	}

	/**
	 * Sets the <code>participantName</code> property.
	 * <p>
	 * 
	 * @param pParticipantName
	 *            the current value of the <code>participantName</code>
	 *            property.
	 */
	public void setParticipantName(final String pParticipantName) {

		this.participantName = ContractUtility
				.convertToUpperCase(pParticipantName);
	}

	/**
	 * Gets the <code>originStation</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>originStation</code> property.
	 */
	public String getOriginStation() {
		return this.originStation;
	}

	/**
	 * Sets the <code>originStation</code> property.
	 * <p>
	 * 
	 * @param pOriginStation
	 *            the current value of the <code>originStation</code> property.
	 */
	public void setOriginStation(final String pOriginStation) {
		this.originStation = ContractUtility.convertToUpperCase(pOriginStation);

	}

	/**
	 * Gets the <code>destinationStation</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>destinationStation</code>
	 *         property.
	 */
	public String getDestinationStation() {
		return this.destinationStation;
	}

	/**
	 * Sets the <code>destinationStation</code> property.
	 * <p>
	 * 
	 * @param pDestinationStation
	 *            the current value of the <code>destinationStation</code>
	 *            property.
	 */
	public void setDestinationStation(final String pDestinationStation) {

		this.destinationStation = ContractUtility
				.convertToUpperCase(pDestinationStation);
	}

	/**
	 * Gets the <code>contractNumber</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>contractNumber</code> property.
	 */
	public String getContractNumber() {
		return this.contractNumber;
	}

	/**
	 * Sets the <code>contractNumber</code> property.
	 * <p>
	 * 
	 * @param pContractNumber
	 *            the current value of the <code>contractNumber</code> property.
	 */
	public void setContractNumber(final String pContractNumber) {

		this.contractNumber = ContractUtility
				.convertToUpperCase(pContractNumber);
	}

	/**
	 * Gets the <code>productCode</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>productCode</code> property.
	 */
	public String getProductCode() {
		return this.productCode;
	}

	/**
	 * Sets the <code>productCode</code> property.
	 * <p>
	 * 
	 * @param pProductCode
	 *            the current value of the <code>productCode</code> property.
	 */
	public void setProductCode(final String pProductCode) {

		this.productCode = ContractUtility.convertToUpperCase(pProductCode);
	}

	/**
	 * Gets the <code>startDate</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>startDate</code> property.
	 */
	public Date getStartDate() {
		return ContractUtility.getClonedDate(this.startDate);

	}

	/**
	 * Sets the <code>startDate</code> property.
	 * <p>
	 * 
	 * @param pStartDate
	 *            the current value of the <code>startDate</code> property.
	 */
	public void setStartDate(final Date pStartDate) {
		this.startDate = pStartDate;
	}

	/**
	 * Gets the <code>endDate</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>endDate</code> property.
	 */
	public Date getEndDate() {
		return ContractUtility.getClonedDate(this.endDate);

	}

	/**
	 * Sets the <code>endDate</code> property.
	 * <p>
	 * 
	 * @param pEndDate
	 *            the current value of the <code>endDate</code> property.
	 */
	public void setEndDate(final Date pEndDate) {
		this.endDate = pEndDate;
	}

	/**
	 * Sets the <code>oId</code> property.
	 * <p>
	 * 
	 * @param oId
	 *            the current value of the <code>oId</code> property.
	 */
	public void setoId(final Long pOId) {
		this.oId = pOId;
	}

	/**
	 * Gets the <code>oId</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>oId</code> property.
	 */
	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return this.oId;
	}

	/**
	 * Gets the <code>participantAccountNumber</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>participantAccountNumber</code>
	 *         property.
	 */
	public String getParticipantAccountNumber() {
		return this.participantAccountNumber;
	}

	/**
	 * Sets the <code>participantAccountNumber</code> property.
	 * <p>
	 * 
	 * @param pParticipantAccountNumber
	 *            the current value of the <code>participantAccountNumber</code>
	 *            property.
	 */
	public void setParticipantAccountNumber(
			final String pParticipantAccountNumber) {
		this.participantAccountNumber = ContractUtility
				.convertToUpperCase(pParticipantAccountNumber);

	}

	/**
	 * Gets the <code>station</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>station</code> property.
	 */
	public String getStation() {
		return this.station;
	}

	/**
	 * Sets the <code>station</code> property.
	 * <p>
	 * 
	 * @param pStation
	 *            the current value of the <code>station</code> property.
	 */
	public void setStation(final String pStation) {
		this.station = ContractUtility.convertToUpperCase(pStation);

	}

	/*
	 * public Date getFlightDate() { return flightDate; }
	 * 
	 * public void setFlightDate(final Date pFlightDate) { this.flightDate =
	 * pFlightDate; }
	 */
	/**
	 * Gets the <code>flightNumber</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>flightNumber</code> property.
	 */
	public String getFlightNumber() {
		return this.flightNumber;
	}

	/**
	 * Sets the <code>flightNumber</code> property.
	 * <p>
	 * 
	 * @param pFlightNumber
	 *            the current value of the <code>flightNumber</code> property.
	 */
	public void setFlightNumber(final String pFlightNumber) {

		this.flightNumber = ContractUtility.convertToUpperCase(pFlightNumber);
	}

	/**
	 * Gets the <code>participantAccountType</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>participantAccountType</code>
	 *         property.
	 */
	public ParticipantAccountType getParticipantAccountType() {
		return this.participantAccountType;
	}

	/**
	 * Sets the <code>participantAccountType</code> property.
	 * <p>
	 * 
	 * @param pParticipantAccountType
	 *            the current value of the <code>participantAccountType</code>
	 *            property.
	 */
	public void setParticipantAccountType(
			final ParticipantAccountType pParticipantAccountType) {
		this.participantAccountType = pParticipantAccountType;
	}

	/**
	 * Gets the <code>importAuditCompleted</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>importAuditCompleted</code>
	 *         property.
	 */
	public boolean isImportAuditCompleted() {
		return this.importAuditCompleted;
	}

	/**
	 * Sets the <code>importAuditCompleted</code> property.
	 * <p>
	 * 
	 * @param pImportAuditCompleted
	 *            the current value of the <code>importAuditCompleted</code>
	 *            property.
	 */
	public void setImportAuditCompleted(final boolean pImportAuditCompleted) {
		this.importAuditCompleted = pImportAuditCompleted;
	}

	/* NAC starts */

	/**
	 * Gets the <code>specificAirline</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>specificAirline</code> property.
	 */
	public String getSpecificAirline() {
		return specificAirline;
	}

	/**
	 * Sets the <code>specificAirline</code> property.
	 * <p>
	 * 
	 * @param specificAirline
	 *            the current value of the <code>specificAirline</code>
	 *            property.
	 */
	public void setSpecificAirline(String specificAirline) {
		this.specificAirline = specificAirline;
	}

	/* NAC ends */
}
