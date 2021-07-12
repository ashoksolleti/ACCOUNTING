package com.unisys.trans.logistics.lms.accounting.contract;

import com.unisys.trans.logistics.lms.accounting.dto.AccountingAirWaybillPersistRequest;
import com.unisys.trans.logistics.lms.accounting.dto.AccountingAirWaybillResponse;
import com.unisys.trans.logistics.lms.accounting.dto.AirwaybillAdjustmentsFindRequest;
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
public interface AirWaybillAdjustmentsService {

    public AccountingAirWaybillResponse findAirWaybillAdjustments(
                AirwaybillAdjustmentsFindRequest aAirwaybillAdjustmentsFindRequest)
                throws LMSException;

    public AccountingAirWaybillResponse processAirWaybillAdjustments(
                final AccountingAirWaybillPersistRequest pAccountingAirWaybillPersistRequest)
                throws LMSException;
    
    public void reRateAirWaybill(final AccountingAirWaybillPersistRequest aReratingProcessRequest)
                throws LMSException;

}
