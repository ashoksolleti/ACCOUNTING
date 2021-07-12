package com.unisys.trans.logistics.lms.accounting.contract;


import java.text.ParseException;

import com.unisys.trans.logistics.lms.accounting.dto.ParticipantAgreementResponse;
import com.unisys.trans.logistics.lms.accounting.dto.ParticipantAgreementsFindRequest;
import com.unisys.trans.logistics.lms.accounting.dto.ParticipantAgreementsPersistRequest;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.framework.exception.ValidationException;


/**
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author KV5
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public interface ParticipantAgreementService {

	
	public ParticipantAgreementResponse retrieveParticipantAgreements(
			ParticipantAgreementsFindRequest participantAgreementsFindRequest) throws LMSException, ParseException;

	public ParticipantAgreementResponse saveParticipantAgreements(
			ParticipantAgreementsPersistRequest aParticipantAgreementsPersistRequest)
            throws LMSException;

	public ParticipantAgreementResponse processParticipantAgreements(ParticipantAgreementsPersistRequest request)
			throws LMSException, ParseException;
	
	 public ParticipantAgreementResponse processExemptedTDSAgreements(
			 ParticipantAgreementsPersistRequest aParticipantAgreementsPersistRequest)
	            throws LMSException, ParseException;

}
