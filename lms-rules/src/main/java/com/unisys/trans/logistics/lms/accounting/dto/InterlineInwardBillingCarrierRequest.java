package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.accounting.dto.constants.MemoType;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class InterlineInwardBillingCarrierRequest extends AbstractRequest {

    /**
     * 
     */
    private static final long serialVersionUID = 3186336745691418946L;

    private InterlineInwardBillingFindDto interlineInwardBillingsFindDto;

    private MemoType memoType;

    public InterlineInwardBillingFindDto getInterlineInwardBillingsFindDto() {
        return this.interlineInwardBillingsFindDto;
    }

    public MemoType getMemoType() {
        return this.memoType;
    }

    public void setInterlineInwardBillingsFindDto(
                final InterlineInwardBillingFindDto pInterlineInwardBillingsFindDto) {
        this.interlineInwardBillingsFindDto = pInterlineInwardBillingsFindDto;
    }

    public void setMemoType(final MemoType pMemoType) {
        this.memoType = pMemoType;
    }

}
