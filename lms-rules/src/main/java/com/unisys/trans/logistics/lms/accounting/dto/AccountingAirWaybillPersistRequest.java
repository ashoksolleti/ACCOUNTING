/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.constants.AdditionFunctionType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ExportPaymentType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ImportPaymentType;
import com.unisys.trans.logistics.lms.framework.constants.HostType;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.security.LocalThreadContext;

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
public class AccountingAirWaybillPersistRequest extends AbstractRequest {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 21818524079636356L;

    /**
     * Incoming Air Waybill load/update request in XML format.
     */
    private AccountingAirWaybillDto airWaybillDto;

    private List<AccountingAirWaybillDto> accountingAirWaybillDtos;

    private ReasonTypeDto reasonTypeDto;
    
    private boolean manualFlownUpdate;
    
    private Boolean isPayCodeChange = false;
    private ExportPaymentType oldExportPaymentType;
    private ImportPaymentType oldImportPaymentType;
    private boolean isOtherChargeValueChanged ;
    
    private boolean methodTriggr = false;
    private boolean isUpdateFromCRA= false;

    public boolean isMethodTriggr() {
		return methodTriggr;
	}

	public void setMethodTriggr(boolean methodTriggr) {
		this.methodTriggr = methodTriggr;
	}

    public List<AccountingAirWaybillDto> getAccountingAirWaybillDtos() {
        return this.accountingAirWaybillDtos;
    }

    public void setAccountingAirWaybillDtos(final List<AccountingAirWaybillDto> pAccountingAirWaybillDtos) {
        this.accountingAirWaybillDtos = pAccountingAirWaybillDtos;
    }

    /**
     * Attribute to hold the <code>currencyCodeType</code> object.
     */
    private String currencyCodeType;

    /**
     * <code>Default Constructor.</code>
     */
    public AccountingAirWaybillPersistRequest() {

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
    
    private String accountingRemarks;
    
    private String status;
    
    public String getAccountingRemarks() {
        return this.accountingRemarks;
    }

    public void setAccountingRemarks(final String accountingRemarks) {
        this.accountingRemarks = accountingRemarks;
    }

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

    /**
     * @return the reasonTypeDto
     */
    public ReasonTypeDto getReasonTypeDto() {
        return this.reasonTypeDto;
    }

    /**
     * @param reasonTypeDto the reasonTypeDto to set
     */
    public void setReasonTypeDto(final ReasonTypeDto pReasonTypeDto) {
        this.reasonTypeDto = pReasonTypeDto;
    }
    
    

    public boolean isManualFlownUpdate() {
		return manualFlownUpdate;
	}

	public void setManualFlownUpdate(boolean manualFlownUpdate) {
		this.manualFlownUpdate = manualFlownUpdate;
	}

	private boolean manualauditIndicator;
	
	public long getMessageTimeStamp() {
		return messageTimeStamp;
	}

	public void setMessageTimeStamp(long messageTimeStamp) {
		this.messageTimeStamp = messageTimeStamp;
	}

	private long messageTimeStamp;

	public Boolean getIsPayCodeChange() {
		return isPayCodeChange;
	}

	public void setIsPayCodeChange(Boolean isPayCodeChange) {
		this.isPayCodeChange = isPayCodeChange;
	}

	public ExportPaymentType getOldExportPaymentType() {
		return oldExportPaymentType;
	}

	public void setOldExportPaymentType(ExportPaymentType oldExportPaymentType) {
		this.oldExportPaymentType = oldExportPaymentType;
	}

	public ImportPaymentType getOldImportPaymentType() {
		return oldImportPaymentType;
	}

	public void setOldImportPaymentType(ImportPaymentType oldImportPaymentType) {
		this.oldImportPaymentType = oldImportPaymentType;
	}

	public String getStatus() {
		return status;
	}

	public boolean isOtherChargeValueChanged() {
		return isOtherChargeValueChanged;
	}

	public void setOtherChargeValueChanged(boolean isOtherChargeValueChanged) {
		this.isOtherChargeValueChanged = isOtherChargeValueChanged;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isUpdateFromCRA() {
		return isUpdateFromCRA;
	}

	public void setUpdateFromCRA(boolean isUpdateFromCRA) {
		this.isUpdateFromCRA = isUpdateFromCRA;
	}
	
}
