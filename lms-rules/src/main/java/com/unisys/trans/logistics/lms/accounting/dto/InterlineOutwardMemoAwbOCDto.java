package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class InterlineOutwardMemoAwbOCDto extends PersistenceObjectDto {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private Long OId;
    private String code;
    private BigDecimal amount;
    
    private BigDecimal amountActual;

    private BigDecimal amountBilled;

    private BigDecimal amountDiff;
    
    private BigDecimal amountAccepted;

    public Long getOId() {
        return OId;
    }

    public void setOId(Long oId) {
        OId = oId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

	public BigDecimal getAmountActual() {
		return amountActual;
	}

	public void setAmountActual(BigDecimal amountActual) {
		this.amountActual = amountActual;
	}

	public BigDecimal getAmountBilled() {
		return amountBilled;
	}

	public void setAmountBilled(BigDecimal amountBilled) {
		this.amountBilled = amountBilled;
	}

	public BigDecimal getAmountDiff() {
		return amountDiff;
	}

	public void setAmountDiff(BigDecimal amountDiff) {
		this.amountDiff = amountDiff;
	}

	public BigDecimal getAmountAccepted() {
		return amountAccepted;
	}

	public void setAmountAccepted(BigDecimal amountAccepted) {
		this.amountAccepted = amountAccepted;
	}

    /* Determine whether the dto object is an empty object.
     * 
     * If all the UI properties exposed for this data transfer object is null then this data transfer object is considered empty.
     * 
     * @param none
     * 
     * @return boolean - indicates the emptiness of the data transfer object
     * 
     * @throws none */
    public boolean isEmptyObj() {
        boolean isEmptyObj = false;
        if (code == null &&
                amount == null)
            isEmptyObj = true;
        return isEmptyObj;
    }
    
}
