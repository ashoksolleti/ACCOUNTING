package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class InterlineOutwardMemoFindRequest extends AbstractRequest {
    private static final long serialVersionUID = 1L;
    private InterlineOutwardMemoFindDto findDto = new InterlineOutwardMemoFindDto();

    public InterlineOutwardMemoFindDto getFindDto() {
        return findDto;
    }

    public void setFindDto(InterlineOutwardMemoFindDto findDto) {
        this.findDto = findDto;
    }

    
}
