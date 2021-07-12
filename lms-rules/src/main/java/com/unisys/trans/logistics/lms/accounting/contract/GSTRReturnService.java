package com.unisys.trans.logistics.lms.accounting.contract;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.GSTRReturnDto;
import com.unisys.trans.logistics.lms.accounting.dto.ParticipantReceivableDto;
import com.unisys.trans.logistics.lms.framework.exception.DaoException;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;


public interface GSTRReturnService extends Serializable{

	public List<Object[]> findRecordCountOfGSTReturn(final Date fromDate,Date toDate) throws LMSException;
	
	public long findB2BRecordCount(Date fromDate,
			Date toDate) throws DaoException;
	
	public long findB2cRecordCount(Date fromDate,
			Date toDate) throws DaoException;
	
	public long findCRDRRecordCount(Date fromDate,
			Date toDate) throws DaoException;
	
	public void updateGSTRReturn(final String fromDate,String toDate, int returnPeriod) throws LMSException;
	
	public Long createGSTRReturn(GSTRReturnDto gstrReturnDto) throws LMSException;

	public GSTRReturnDto getGstrReturnData(Long gstrReturnOid)throws LMSException;

	public Long getB2BCRDRInvoiceSequence(String documentType,String supplyType) throws DaoException;

	public Long getB2BCRDRCashSequence(String documentType,String supplyType) throws DaoException;

	public Long getB2CSequence() throws DaoException;
	
	public void updateDocNoToGSTRReturnTable(String docNo,Long gstrOid) throws DaoException;
	
	public void updateOrigDocNoToGSTRReturnTable(String OrgdocNo, String OrgDocDate, Long gstrOid) throws DaoException;
	
	public ParticipantReceivableDto findOriginalDocumentNumber(long originalPrOid) throws DaoException;

	public List<GSTRReturnDto> getInvoiceSummaryData(Date fromDate, Date toDate) throws DaoException;
	
	public int deleteGstrRecord(Long gstrReturnOid) throws LMSException;
	
	public void updateGSTRReturnOidParticipantReceivable(Long awbOid, long gstrReturnOid,String documentNumber,String fileType,String adjustNoteNumber)throws LMSException;
	
	public void updateOriginalDocumentNumberInPR(String documentNumber, String awbOids, String fileType,String crdrIndicator) throws LMSException;
	
	public void updateDocumentNumberInInvoiceAWB(String documentNumber, String awbOids) throws LMSException;
	
	public void updateDocumentNumberInInvoiceDCM(String documentNumber, String dcmOids,String crdrIndicator,String documentType) throws LMSException;
	
	public String getOriginalDocumentNumber(Long accAwbOid, Long prOid) throws LMSException;
	
	public List<Long> getGstReturnOidFromParticipantReceivables(Long accAwbOid) throws LMSException;
	
	public void updateB2cGSTRReturn(GSTRReturnDto gstrReturnDto) throws LMSException;
	
	public List<GSTRReturnDto> getGstrReturnDataList(List<Long> gstrReturnOidList) throws LMSException;
	
	public long findOriginalParticipantReceivablesOid(long accAwbOid, long prOid)throws LMSException;
	
	
}
