package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class InwardBillingProcessingResponse extends AbstractResponse {

    /**
     * 
     */
    private static final long serialVersionUID = 7910095327111633090L;

    private List<InterlineBillingQueueDto> interlineBillingQueueDtos;

    private List<InterlineBillingQueueSummaryDto> interlineBillingQueueSummaryDtos;

    public List<InterlineBillingQueueDto> getInterlineBillingQueueDtos() {
        return this.interlineBillingQueueDtos;
    }

    public List<InterlineBillingQueueSummaryDto> getInterlineBillingQueueSummaryDtos() {
        return this.interlineBillingQueueSummaryDtos;
    }

    public void setInterlineBillingQueueDtos(final List<InterlineBillingQueueDto> pInterlineBillingQueueDtos) {
        this.interlineBillingQueueDtos = pInterlineBillingQueueDtos;
    }

    public void setInterlineBillingQueueSummaryDtos(final 
                List<InterlineBillingQueueSummaryDto> pInterlineBillingQueueSummaryDtos) {
        this.interlineBillingQueueSummaryDtos = pInterlineBillingQueueSummaryDtos;
    }

}
