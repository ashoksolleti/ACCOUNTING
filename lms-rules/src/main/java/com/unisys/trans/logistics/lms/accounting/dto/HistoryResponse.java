/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;
import com.unisys.trans.logistics.lms.framework.dto.RequestHeader;

import java.util.ArrayList;
import java.util.List;

/**
 * <code>HistoryResponse</code> contains the response of all the request received by
 * <code>HistoryService</code> for maintaining History.
 * <p>
 * This contains the following attribute:
 * <ul>
 * <code>
 * <li>history
 * </code>
 * </ul>
 */
public class HistoryResponse extends AbstractResponse {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 5739742713350497373L;

    /**
     * Holds collection of <code>HistoryDto</code> object.
     */
    private List<AccountingHistoryDto> histories = new ArrayList<AccountingHistoryDto>(); // NOPMD

    private List<AccountingAirWaybillListDto> accountingAirWaybillList =
                new ArrayList<AccountingAirWaybillListDto>();
    
    private List<ActualFlownDto> actualFlowns ;
    /**
     * @return the accountingAirWaybillList
     */
    public List<AccountingAirWaybillListDto> getAccountingAirWaybillList() {
        return this.accountingAirWaybillList;
    }

    /**
     * @param accountingAirWaybillList the accountingAirWaybillList to set
     */
    public void setAccountingAirWaybillList(final List<AccountingAirWaybillListDto> pAccountingAirWaybillList) {
        this.accountingAirWaybillList = pAccountingAirWaybillList;
    }

    /**
     * <code>Default constructor.</code>
     */
    public HistoryResponse() {

    }

    /**
     * This method is used for adding the <code>HistoryDto</code> objects while assembling
     * <code>HistoryDto</code> objects to the response.
     * <p>
     * 
     * @param pHistoryDto the new value of <code>HistoryDto</code> property.
     */
    public void addHistory(final AccountingHistoryDto pHistoryDto) {
        this.histories.add(pHistoryDto);
    }

    /**
     * @return the history
     */
    public List<AccountingHistoryDto> getHistories() {
        return this.histories;
    }

    /**
     * @param history the history to set
     */
    public void setHistories(final List<AccountingHistoryDto> pHistories) {
        this.histories = pHistories;
    }

	public List<ActualFlownDto> getActualFlowns() {
		return actualFlowns;
	}

	public void setActualFlowns(List<ActualFlownDto> actualFlowns) {
		this.actualFlowns = actualFlowns;
	}
}
