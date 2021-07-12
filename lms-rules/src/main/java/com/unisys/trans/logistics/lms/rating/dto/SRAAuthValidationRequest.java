package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class SRAAuthValidationRequest extends AbstractRequest {

    /**
	 * 
	 */
    private static final long serialVersionUID = -7433336860994973865L;

    private String requestQueueName;

    public String getRequestQueueName() {
        return this.requestQueueName;
    }

    public void setRequestQueueName(final String pRequestQueueName) {
        this.requestQueueName = pRequestQueueName;
    }

}
