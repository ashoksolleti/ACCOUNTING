/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.constants.AdditionFunctionType;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>AirWaybillPersistRequest</code>class represents the request to
 * create/update AccountingParticipantInformation details.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>accountingParticipantDto
 * </code>
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.accounting.dto.AccountingParticipantDto
 */
public class AirWaybillAdjustmentsPersistRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 21818524079636356L;

    /**
     * Incoming Air Waybill load/update request in XML format.
     */
    private AccountingAirWaybillDto airWaybillDto;

    private List<AccountingAirWaybillDto> accountingAirWaybillDtos;

    /**
     * Attribute to hold the <code>currencyCodeType</code> object.
     */
    private String currencyCodeType;

    /**
     * <code>Default Constructor.</code>
     */
    public AirWaybillAdjustmentsPersistRequest() {

    }

    private String messageId;

    public String getMessageId() {
        return this.messageId;
    }

    public void setMessageId(final String pMessageId) {
        this.messageId = pMessageId;
    }

    public AccountingAirWaybillDto getAirWaybillDto() {
        return this.airWaybillDto;
    }

    public void setAirWaybillDto(final AccountingAirWaybillDto pAirWaybillDto) {
        this.airWaybillDto = pAirWaybillDto;
    }

    private String airWaybillXML;

    public String getAirWaybillXML() {
        return this.airWaybillXML;
    }

    public void setAirWaybillXML(final String pAirWaybillXML) {
        this.airWaybillXML = pAirWaybillXML;
    }

    private AdditionFunctionType functiontype;

    public AdditionFunctionType getFunctiontype() {
        return this.functiontype;
    }

    public void setFunctiontype(final AdditionFunctionType pFunctiontype) {
        this.functiontype = pFunctiontype;
    }

    private String updateReasonCode;

    private String updateReasonText;

    public String getUpdateReasonCode() {
        return this.updateReasonCode;
    }

    public void setUpdateReasonCode(final String pUpdateReasonCode) {
        this.updateReasonCode = pUpdateReasonCode;
    }

    public String getUpdateReasonText() {
        return this.updateReasonText;
    }

    public void setUpdateReasonText(final String pUpdateReasonText) {
        this.updateReasonText = pUpdateReasonText;
    }

    public String getCurrencyCodeType() {
        return this.currencyCodeType;
    }

    public void setCurrencyCodeType(final String pCurrencyCodeType) {
        this.currencyCodeType = pCurrencyCodeType;
    }

    public boolean isManualauditIndicator() {
        return this.manualauditIndicator;
    }

    public void setManualauditIndicator(final boolean pManualauditIndicator) {
        this.manualauditIndicator = pManualauditIndicator;
    }

    public List<AccountingAirWaybillDto> getAccountingAirWaybillDtos() {
        return this.accountingAirWaybillDtos;
    }

    public void setAccountingAirWaybillDtos(
                final List<AccountingAirWaybillDto> pAccountingAirWaybillDtos) {
        this.accountingAirWaybillDtos = pAccountingAirWaybillDtos;
    }

    private boolean manualauditIndicator;

}
