package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

public class AccountingDashboardResponse extends AbstractResponse {

    /**
     * 
     */
    private static final long serialVersionUID = -6593038387730880605L;

    /**
     * Attribute to hold <code>accountingDashboardDetailDtos</code> property.
     */
    private List<AccountingDashboardDetailDto> accountingDashboardDetailDtos;

    /**
     * Gets the <code>accountingDashboardDetailDtos</code> property.
     * <p>
     * 
     * @return the current value of the <code>accountingDashboardDetailDtos</code> property.
     */
    public List<AccountingDashboardDetailDto> getAccountingDashboardDetailDtos() {
        return this.accountingDashboardDetailDtos;
    }

    /**
     * Sets the <code>accountingDashboardDetailDtos</code> property.
     * <p>
     * 
     * @param pAccountingDashboardDetailDtos
     *            the current value of the <code>accountingDashboardDetailDtos</code> property.
     */
    public void setAccountingDashboardDetailDtos(final
                List<AccountingDashboardDetailDto> pAccountingDashboardDetailDtos) {
        this.accountingDashboardDetailDtos = pAccountingDashboardDetailDtos;
    }

}
