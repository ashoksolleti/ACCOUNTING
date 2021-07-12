package com.unisys.trans.logistics.lms.accounting.contract;

import com.unisys.trans.logistics.lms.accounting.dto.AccountingAirWaybillResubmitRequest;
import com.unisys.trans.logistics.lms.accounting.dto.ParticipantCreditInformationFindRequest;
import com.unisys.trans.logistics.lms.accounting.dto.ParticipantCreditInformationPersistRequest;
import com.unisys.trans.logistics.lms.accounting.dto.ParticipantCreditInformationResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

/**
 * <code>AirWaybillAdjustmentsService</code> handles the Air waybill.
 * <p>
 * This service has the following functions:
 * <ul>
 * <li>find AirWaybill.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.accounting.dto.AccountingAwbInformationFindRequest
 *      AccountingAwbInformationFindRequest
 */
public interface ParticipantCreditInformationService {

    public ParticipantCreditInformationResponse findParticipantCreditInformations(
    		ParticipantCreditInformationFindRequest aParticipantCreditInformationFindRequest)
                throws LMSException;

    public ParticipantCreditInformationResponse createParticipantCreditInfo(
            ParticipantCreditInformationPersistRequest aRequest) throws LMSException;


    public void reprocessAirWaybill(String errorMsgCode, AccountingAirWaybillResubmitRequest aAccountingAirWaybillResubmitRequest, Long oId);

}
