package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class AccountingDashboardRequest extends AbstractRequest{
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private List<AccountingDashboardDetailDto> accountingDashboardDetailDtos;

    /**
     * @return the accountingDashboardDetailDtos
     */
    public List<AccountingDashboardDetailDto> getAccountingDashboardDetailDtos() {
        return this.accountingDashboardDetailDtos;
    }

    /**
     * @param accountingDashboardDetailDtos the accountingDashboardDetailDtos to set
     */
    public void setAccountingDashboardDetailDtos(final List<AccountingDashboardDetailDto> pAccountingDashboardDetailDtos) {
        this.accountingDashboardDetailDtos = pAccountingDashboardDetailDtos;
    }



}
