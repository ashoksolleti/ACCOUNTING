package com.unisys.trans.logistics.lms.parts.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class SuggestiveRequest extends AbstractRequest{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String suggestivePrefix;
	
	String station;

	public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getSuggestivePrefix() {
		return suggestivePrefix;
	}

	public void setSuggestivePrefix(String suggestivePrefix) {
		this.suggestivePrefix = suggestivePrefix;
	}

}
