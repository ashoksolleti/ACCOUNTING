/**
 * 
 */
package com.unisys.trans.logistics.lms.utils.contract;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.NotificationRequest;

public interface NotificationService {
		public List<String> findEmailAddress (NotificationRequest notificationRequest) throws LMSException;
		public String   sendEmail(NotificationRequest notificationRequest) throws LMSException;
		public String   sendEmailWithAttachment(NotificationRequest notificationRequest) throws LMSException;
}
