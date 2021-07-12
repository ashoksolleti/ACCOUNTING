/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.contract;

import com.unisys.trans.logistics.lms.accounting.dto.GlAccountCodeDto;
import com.unisys.trans.logistics.lms.accounting.dto.GlAccountCodeInformationFindRequest;
import com.unisys.trans.logistics.lms.accounting.dto.GlAccountCodeInformationPersistRequest;
import com.unisys.trans.logistics.lms.accounting.dto.GlAccountCodeInformationResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;



public interface GlAccountCodeInformationService 
{
	/**
	 * 
	 * @param fGlAccountCodeInformationFindRequest
	 * @return
	 * @throws LMSException
	 */
	public GlAccountCodeInformationResponse retrieveGlAccountCodeInformation(
			GlAccountCodeInformationFindRequest fGlAccountCodeInformationFindRequest) throws LMSException;	
	/**
	 *
	 * @param fGlAccountCodeInformationFindRequest
	 * @return
	 * @throws LMSException
	 */
	public GlAccountCodeInformationResponse retrieveAll(
			GlAccountCodeInformationFindRequest fGlAccountCodeInformationFindRequest) throws LMSException;
			
	/**
	 * 
	 * @param pGlAccountCodeInformationPersistRequest
	 * @return
	 * @throws LMSException
	 */
	public GlAccountCodeInformationResponse saveGlAccountCodeInformation(
			GlAccountCodeInformationPersistRequest pGlAccountCodeInformationPersistRequest) throws LMSException;

	/**
	 * 
	 * @param pGlAccountCodeInformationPersistRequest
	 * @return
	 * @throws LMSException
	 */
	public GlAccountCodeInformationResponse processGlAccountCodeInformation(
			GlAccountCodeInformationPersistRequest pGlAccountCodeInformationPersistRequest) throws LMSException;
	
	/**
	 * 
	 * @param fGlAccountCodeInformationFindRequest
	 * @return
	 * @throws LMSException
	 */
	public GlAccountCodeDto retrieveGlAccountCodeInformationByGLAccountNumber(
			String accountNumber) throws LMSException;	
	
	public GlAccountCodeInformationResponse retrieveGLAccountDetailsBySpecificAirline(
			GlAccountCodeInformationFindRequest fGlAccountCodeInformationFindRequest,String specificAirline) throws LMSException;
	
	public GlAccountCodeInformationResponse retrieveGlAccountCodeByGlAccCodeAndSpecificAirLine(GlAccountCodeInformationFindRequest 
			aGlAccountCodeInformationFindRequest,String accountNumber, String specificAirline) throws LMSException;	
}
