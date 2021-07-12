package com.unisys.trans.logistics.lms.accounting.contract;

import com.unisys.trans.logistics.lms.accounting.dto.GHAAgreementInformationFindRequest;
import com.unisys.trans.logistics.lms.accounting.dto.GHAAgreementInformationPersistRequest;
import com.unisys.trans.logistics.lms.accounting.dto.GHAAgreementInformationResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;



public interface GHAAgreementInformationService 
{
	/**
	 * 
	 * @param pGHAAgreementInformationPersistRequest
	 * @return
	 * @throws LMSException
	 */
	public GHAAgreementInformationResponse saveGHAAgreementInformation(
			GHAAgreementInformationPersistRequest pGHAAgreementInformationPersistRequest) throws LMSException;
	/**
	 * 
	 * @param fGHAAgreementInformationFindRequest
	 * @return
	 * @throws LMSException
	 */
	public GHAAgreementInformationResponse retrieveGHAAgreementInformation(
			GHAAgreementInformationFindRequest fGHAAgreementInformationFindRequest) throws LMSException;	
	/**
	 *
	 * @param fGHAAgreementInformationFindRequest
	 * @return
	 * @throws LMSException
	 */
	public GHAAgreementInformationResponse retrieveAll(
			GHAAgreementInformationFindRequest fGHAAgreementInformationFindRequest) throws LMSException;

	/**
	 * 
	 * @param pGHAAgreementInformationPersistRequest
	 * @return
	 * @throws LMSException
	 */
	public GHAAgreementInformationResponse processGHAAgreementInformation(
			GHAAgreementInformationPersistRequest pGHAAgreementInformationPersistRequest) throws LMSException;
}
