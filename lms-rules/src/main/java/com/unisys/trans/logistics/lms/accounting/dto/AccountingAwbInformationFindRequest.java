/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.CRAParticipantAccountType;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>AccountingAwbInformationFindRequest</code> is used for retrieving
 * <code> Air waybill information</code> information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>AirWaybillNumberDto</code>
 * <li><code>currencyCodeType</code>
 * <li><code>awbOid</code>
 * 
 * </ul>
 */
public class AccountingAwbInformationFindRequest extends AbstractRequest {

    /**
     * Attribute to hold the <code>serialVersionUID</code> object.
     */
    private static final long serialVersionUID = 9146930795817985931L;

    /**
     * Attribute to hold the <code>airWaybillNumberDto</code> object.
     */
    private AirWaybillNumberDto airWaybillNumberDto;

    private AirWaybillInvoiceFindDto airWaybillInvoiceFindDto;

    /**
     * Attribute to hold the <code>currencyCodeType</code> object.
     */
    private String currencyCodeType;

    /**
     * Attribute to hold the <code>awbOid</code> object.
     */
    private Long awbOid;

    private Date executionDate;

    private String originStation;

    private String destinationStation;

    private CRAParticipantAccountType accountType;

    private String adjustmentNoteNumber;

    /**
     * Gets the <code>awbOid</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @return the current value of the <code>awbOid</code> property.
     */

    private List<Long> airWaybillOIds;

	private String specificAirline;

    public Long getAwbOid() {
        return this.awbOid;
    }

    /**
     * Sets the <code>awbOid</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @param pAwbOid
     *            the new value of the <code>awbOid</code> property.
     */
    public void setAwbOid(final Long pAwbOid) {
        this.awbOid = pAwbOid;
    }

    /**
     * Gets the <code>airWaybillNumberDto</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @return the current value of the <code>airWaybillNumberDto</code> property.
     */
    public AirWaybillNumberDto getAirWaybillNumberDto() {
        return this.airWaybillNumberDto;
    }

    /**
     * Sets the <code>airWaybillNumberDto</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @param pAirWaybillNumberDto
     *            the new value of the <code>airWaybillNumberDto</code> property.
     */
    public void setAirWaybillNumberDto
                (final AirWaybillNumberDto pAirWaybillNumberDto) {
        this.airWaybillNumberDto = pAirWaybillNumberDto;
    }

    /**
     * Gets the <code>currencyCodeType</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @return the current value of the <code>currencyCodeType</code> property.
     */
    public String getCurrencyCodeType() {
        return this.currencyCodeType;
    }

    /**
     * Sets the <code>currencyCodeType</code> implementation injected by the IoC
     * container.
     * <p>
     * 
     * @param pCurrencyCodeType
     *            the new value of the <code>currencyCodeType</code> property.
     */
    public void setCurrencyCodeType(final String pCurrencyCodeType) {
        this.currencyCodeType = pCurrencyCodeType;
    }

    public List<Long> getAirWaybillOIds() {
        return this.airWaybillOIds;
    }

    public void setAirWaybillOIds(final List<Long> pairWaybillOIds) {
        airWaybillOIds = pairWaybillOIds;
    }

    public AirWaybillInvoiceFindDto getAirWaybillInvoiceFindDto() {
        return this.airWaybillInvoiceFindDto;
    }

    public void setAirWaybillInvoiceFindDto(final AirWaybillInvoiceFindDto pAirWaybillInvoiceFindDto) {
        this.airWaybillInvoiceFindDto = pAirWaybillInvoiceFindDto;
    }

    /**
     * @return the executiionDate
     */
    public Date getExecutionDate() {
        return this.executionDate;
    }

    /**
     * @param executiionDate the executiionDate to set
     */
    public void setExecutionDate(final Date pExecutiionDate) {
        this.executionDate = pExecutiionDate;
    }

    /**
     * @return the originStation
     */
    public String getOriginStation() {
        return this.originStation;
    }

    /**
     * @param originStation the originStation to set
     */
    public void setOriginStation(final String pOriginStation) {
        this.originStation = pOriginStation;
    }

    /**
     * @return the destinationStation
     */
    public String getDestinationStation() {
        return this.destinationStation;
    }

    /**
     * @param destinationStation the destinationStation to set
     */
    public void setDestinationStation(final String pDestinationStation) {
        this.destinationStation = pDestinationStation;
    }

    /**
     * @return the accountType
     */
    public CRAParticipantAccountType getAccountType() {
        return this.accountType;
    }

    /**
     * @param accountType the accountType to set
     */
    public void setAccountType(final CRAParticipantAccountType pAccountType) {
        this.accountType = pAccountType;
    }

	public String getAdjustmentNoteNumber() {
		return adjustmentNoteNumber;
	}

	public void setAdjustmentNoteNumber(String adjustmentNoteNumber) {
		this.adjustmentNoteNumber = adjustmentNoteNumber;
	}
	
	public String getSpecificAirline() {
		return this.specificAirline;
	}

	/**
	 * @param specificAirline the specificAirline to set
	 */
	public void setSpecificAirline(final String specificAirline) {
		this.specificAirline = specificAirline;
	}

}
