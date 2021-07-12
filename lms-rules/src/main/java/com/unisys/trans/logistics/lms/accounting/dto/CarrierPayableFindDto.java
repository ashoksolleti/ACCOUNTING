/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.constants.AWBPaymentType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.RevenueIndicatorType;

/**
 * <code>CarrierPayableDto</code> contains the details of CarrierPayableDto.
 * <p>
 * This contains all information about CarrierPayableDto.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>carrierCode
 * <li>prorationType
 * <li>prorateIdentifier
 * <li>interlineServiceCommissionPercentage
 * <li>paymentAmount
 * <li>paymentCurrencyCode
 * <li>oId
 * <li>status
 * </ul>
 */
public class CarrierPayableFindDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -5824453134958364787L;

    /**
     * Attribute to hold <code>carrierCode</code> property.
     */
    private String carrierCode;

    /**
     * Attribute to hold <code>adjustmentDto</code> property.
     */
    private AirWaybillNumberDto airWaybillNumberDto;

    /**
     * Attribute to hold <code>awbExecutionDate</code> property.
     */

    private Date awbExecutionDate;

    /**
     * Attribute to hold <code>revenueIndicatorType</code> property.
     */

    private RevenueIndicatorType revenueIndicatorType;
    
    private AWBPaymentType paymentType;
    
    private List<AccountingProrateLadderBreakdownDto> accProrateLadderBreakdowns;
    
    private String originStation;
    
    private String destinationStation;
    
    private AccountingInvoiceAWBDto accountingInvoiceAWBDto;


    public AirWaybillNumberDto getAirWaybillNumberDto() {
        return this.airWaybillNumberDto;
    }

    public Date getAwbExecutionDate() {
        return this.awbExecutionDate;
    }

    public String getCarrierCode() {
        return this.carrierCode;
    }

  
    public RevenueIndicatorType getRevenueIndicatorType() {
        return this.revenueIndicatorType;
    }

    public void setAirWaybillNumberDto(AirWaybillNumberDto pAirWaybillNumberDto) {
        this.airWaybillNumberDto = pAirWaybillNumberDto;
    }

    public void setAwbExecutionDate(Date pAwbExecutionDate) {
        this.awbExecutionDate = pAwbExecutionDate;
    }

    public void setCarrierCode(String pCarrierCode) {
        this.carrierCode = pCarrierCode;
    }

    public void setRevenueIndicatorType(RevenueIndicatorType pRevenueIndicatorType) {
        this.revenueIndicatorType = pRevenueIndicatorType;
    }

	/**
	 * @return the paymentType
	 */
	public AWBPaymentType getPaymentType() {
		return paymentType;
	}

	/**
	 * @param paymentType the paymentType to set
	 */
	public void setPaymentType(AWBPaymentType paymentType) {
		this.paymentType = paymentType;
	}

	/**
	 * @return the accProrateLadderBreakdowns
	 */
	public List<AccountingProrateLadderBreakdownDto> getAccProrateLadderBreakdowns() {
		return accProrateLadderBreakdowns;
	}

	/**
	 * @param accProrateLadderBreakdowns the accProrateLadderBreakdowns to set
	 */
	public void setAccProrateLadderBreakdowns(
			List<AccountingProrateLadderBreakdownDto> accProrateLadderBreakdowns) {
		this.accProrateLadderBreakdowns = accProrateLadderBreakdowns;
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
	 * @return the accountingInvoiceAWBDto
	 */
	public AccountingInvoiceAWBDto getAccountingInvoiceAWBDto() {
		return accountingInvoiceAWBDto;
	}

	/**
	 * @param accountingInvoiceAWBDto the accountingInvoiceAWBDto to set
	 */
	public void setAccountingInvoiceAWBDto(
			AccountingInvoiceAWBDto accountingInvoiceAWBDto) {
		this.accountingInvoiceAWBDto = accountingInvoiceAWBDto;
	}

}
