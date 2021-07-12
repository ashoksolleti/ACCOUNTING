package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.accounting.dto.constants.ReceivableAmountType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ReceivableDueType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

public class ParticipantReceivableSplitDto extends PersistenceObjectDto {

    /**
	 * 
	 */
    private static final long serialVersionUID = -4402850755897481076L;

    private long oid;

    private BigDecimal amount;

    private ReceivableAmountType amountType;

    private String codeCharge;

    private ReceivableDueType dueType;

    @Override
    public Long getOId() {

        return this.oid;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(final BigDecimal pAmount) {
        this.amount = pAmount;
    }

    public ReceivableAmountType getAmountType() {
        return this.amountType;
    }

    public void setAmountType(final ReceivableAmountType pAmountType) {
        this.amountType = pAmountType;
    }

    public String getCodeCharge() {
        return this.codeCharge;
    }

    public void setCodeCharge(final String pCodeCharge) {
        this.codeCharge = ContractUtility.convertToUpperCase(pCodeCharge);
    }

    public ReceivableDueType getDueType() {
        return this.dueType;
    }

    public void setDueType(final ReceivableDueType pDueType) {
        this.dueType = pDueType;
    }

    public void setOid(final long pOid) {
        this.oid = pOid;
    }

}
