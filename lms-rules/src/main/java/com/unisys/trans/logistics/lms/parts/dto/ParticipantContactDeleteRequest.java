package com.unisys.trans.logistics.lms.parts.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class ParticipantContactDeleteRequest extends AbstractRequest {
	 /**
     * 
     */
    private static final long serialVersionUID = -5318521083351875708L;

    private String lmsDatabaseKey;

    public String getLmsDatabaseKey() {
        return lmsDatabaseKey;
    }

    public void setLmsDatabaseKey(String lmsDatabaseKey) {
        this.lmsDatabaseKey = lmsDatabaseKey;
    }
}
