package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class SuggestiveSearchRequest extends AbstractRequest {
     /**
     * 
     */
    private static final long serialVersionUID = 2800938409848352314L;
    private String searchString;

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }
}
