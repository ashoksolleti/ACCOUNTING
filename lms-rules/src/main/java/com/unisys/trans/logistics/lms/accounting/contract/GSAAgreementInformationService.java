package com.unisys.trans.logistics.lms.accounting.contract;

import com.unisys.trans.logistics.lms.accounting.dto.GSAAgreementDto;
import com.unisys.trans.logistics.lms.accounting.dto.GSAAgreementInformationFindRequest;
import com.unisys.trans.logistics.lms.accounting.dto.GSAAgreementInformationPersistRequest;
import com.unisys.trans.logistics.lms.accounting.dto.GSAAgreementInformationResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

import java.util.List;

public interface GSAAgreementInformationService
{
	/**
	 * 
	 * @param pGSAAgreementInformationPersistRequest
	 * @return
	 * @throws LMSException
	 */
	public GSAAgreementInformationResponse saveGSAAgreementInformation(
			GSAAgreementInformationPersistRequest pGSAAgreementInformationPersistRequest) throws LMSException;
	/**
	 * 
	 * @param fGSAAgreementInformationFindRequest
	 * @return
	 * @throws LMSException
	 */
	public GSAAgreementInformationResponse retrieveGSAAgreementInformation(
			GSAAgreementInformationFindRequest fGSAAgreementInformationFindRequest) throws LMSException;	
	/**
	 *
	 * @param fGSAAgreementInformationFindRequest
	 * @return
	 * @throws LMSException
	 */
	public GSAAgreementInformationResponse retrieveAll(
			GSAAgreementInformationFindRequest fGSAAgreementInformationFindRequest) throws LMSException;

	/**
	 * 
	 * @param pGSAAgreementInformationPersistRequest
	 * @return
	 * @throws LMSException
	 */
	public GSAAgreementInformationResponse processGSAAgreementInformation(
			GSAAgreementInformationPersistRequest pGSAAgreementInformationPersistRequest) throws LMSException;

	/**
	 *
	 * @param aGSAAgreementDto
	 * @return
	 * @throws LMSException
	 */
	public boolean gsaFinalizedCheck(GSAAgreementDto aGSAAgreementDto);

	public List<String> getLocationHerarchyList(final String pLocation) throws LMSException;
}
