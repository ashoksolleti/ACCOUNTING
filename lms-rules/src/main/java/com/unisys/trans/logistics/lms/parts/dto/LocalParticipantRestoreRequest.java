package com.unisys.trans.logistics.lms.parts.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class LocalParticipantRestoreRequest extends AbstractRequest {

    /**
     * 
     */
    private static final long serialVersionUID = 1688942825754294453L;

    public String lmsDatabaseKey;

    public String getLmsDatabaseKey() {
        return lmsDatabaseKey;
    }

    public void setLmsDatabaseKey(String lmsDatabaseKey) {
        this.lmsDatabaseKey = lmsDatabaseKey;
    }

}
