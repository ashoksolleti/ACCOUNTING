package com.unisys.trans.logistics.lms.rating.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class SRAAuthValidationResponse extends AbstractResponse {

    /**
	 * 
	 */
    private static final long serialVersionUID = -7433336860994973865L;

    private boolean requestQueue;

    public boolean getRequestQueue() {
        return this.requestQueue;
    }

    public void setRequestQueue(final boolean pRequestQueue) {
        this.requestQueue = pRequestQueue;
    }

}
