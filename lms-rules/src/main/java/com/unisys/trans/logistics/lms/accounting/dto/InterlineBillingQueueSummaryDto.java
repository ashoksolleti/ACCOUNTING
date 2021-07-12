package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.Serializable;

import com.unisys.trans.logistics.lms.accounting.dto.constants.InwardQueueType;

public class InterlineBillingQueueSummaryDto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -6701836040786631226L;

    private Integer queueCount;

    private InwardQueueType queueType;

    public Integer getQueueCount() {
        return this.queueCount;
    }

    public InwardQueueType getQueueType() {
        return this.queueType;
    }

    public void setQueueCount(final Integer pQueueCount) {
        this.queueCount = pQueueCount;
    }

    public void setQueueType(final InwardQueueType pQueueType) {
        this.queueType = pQueueType;
    }

}
