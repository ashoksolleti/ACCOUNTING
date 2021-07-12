package com.unisys.trans.logistics.lms.accounting.contract;

import java.text.ParseException;
import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.POIExcelReaderResponse;
import com.unisys.trans.logistics.lms.accounting.dto.PaymentDetailsDto;
import com.unisys.trans.logistics.lms.accounting.dto.PaymentInformationFindRequest;
import com.unisys.trans.logistics.lms.accounting.dto.PaymentInformationPersistRequest;
import com.unisys.trans.logistics.lms.accounting.dto.PaymentInformationResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

public interface PaymentInformationService {
	
	public PaymentInformationResponse createPaymentInformation(PaymentInformationPersistRequest paymentInformationPersistRequest) throws LMSException;
	
	public PaymentInformationResponse updatePaymentInformation (
			PaymentInformationPersistRequest paymentInformationPersistRequest)throws LMSException;
	
	public PaymentInformationResponse retrievePaymentInformation(
			PaymentInformationFindRequest paymentInformationFindRequest) throws LMSException;
	
	public POIExcelReaderResponse uploadPaymentInformation(
			PaymentInformationPersistRequest paymentInformationPersistRequest) throws LMSException; 
	
	public PaymentInformationResponse applyPaymentInformation(
		    PaymentInformationPersistRequest paymentInformationPersistRequest) throws LMSException, ParseException; 
	
	public PaymentInformationResponse uploadPaymentXMLInformation(
			PaymentInformationPersistRequest paymentInformationPersistRequest) throws LMSException;
	
	public PaymentInformationResponse uploadPaymentCASSInformation(
			PaymentInformationPersistRequest paymentInformationPersistRequest) throws LMSException, ParseException;

	public void purgePaymentInformation(List<PaymentDetailsDto> paymentDetailsList) throws LMSException;

	public PaymentInformationResponse retrievePaymentInformationForArchival(PaymentInformationFindRequest paymentInformationFindRequest) throws LMSException;

}
