/**
 * 
 */
package com.unisys.trans.logistics.lms.utils.contract;

import java.util.Date;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.AlertAcknowledgementRequest;
import com.unisys.trans.logistics.lms.utils.dto.AlertAcknowledgementResponse;
import com.unisys.trans.logistics.lms.utils.dto.AlertAdministrationFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.AlertAdministrationPersistRequest;
import com.unisys.trans.logistics.lms.utils.dto.AlertAdministrationResponse;
import com.unisys.trans.logistics.lms.utils.dto.AlertDeleteRequest;

/**
 * @author 31975
 *
 */
public interface AlertAdministrationService {

	AlertAdministrationResponse findAlertForUser(AlertAdministrationFindRequest pAlertAdministrationRequest)
			throws LMSException;

	AlertAcknowledgementResponse processAlertAcks(AlertAcknowledgementRequest pAlertAcknowledgementRequest)
			throws LMSException;

	AlertAdministrationResponse createAlert(AlertAdministrationPersistRequest pRequest) throws LMSException;

	AlertAdministrationResponse updateAlert(AlertAdministrationPersistRequest pRequest) throws LMSException;

	AlertAdministrationResponse findAlertInformation(AlertAdministrationFindRequest pAlertAdministrationFindRequest)
			throws LMSException;

	AlertAdministrationResponse findProfiles(AlertAdministrationFindRequest pRequest) throws LMSException;

	AlertAdministrationResponse deleteAlert(AlertDeleteRequest aRequest) throws LMSException;

}
