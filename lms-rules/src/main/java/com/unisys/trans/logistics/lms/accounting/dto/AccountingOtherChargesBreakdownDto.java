package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.unisys.trans.logistics.lms.accounting.dto.constants.DueType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * The persistent class for the ACC_OTHER_CHARGES_BREAKDOWN database table.
 * 
 */
public class AccountingOtherChargesBreakdownDto implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold <code>actualDataLine</code> property.
     */
    private String actualDataLine;

    private BigDecimal amountActual;

    private BigDecimal amountBilled;

    private BigDecimal amountDiff;
    
    private BigDecimal amountAccepted;

    private String code;
    
    private String subCode;
    
    List<AccountingVatAmountBreakdownDto> vatBreakdownDtos;

    public String getSubCode() {
		return subCode;
	}

	public void setSubCode(String psubCode) {
		this.subCode = ContractUtility.convertToUpperCase(psubCode);
	}

	private Long oId;
    
    private DueType dueType;

    public DueType getDueType() {
        return this.dueType;
    }

    public void setDueType(final DueType pDueType) {
        this.dueType = pDueType;
    }

	public AccountingOtherChargesBreakdownDto() {
    }

    public String getActualDataLine() {
        return actualDataLine;
    }

    /**
     * @return the amountActual
     */
    public BigDecimal getAmountActual() {
        return this.amountActual;
    }

    /**
     * @return the amountBilled
     */
    public BigDecimal getAmountBilled() {
        return this.amountBilled;
    }

    /**
     * @return the amountDiff
     */
    public BigDecimal getAmountDiff() {
        return this.amountDiff;
    }

    public String getCode() {
        return this.code;
    }

    public Long getOId() {
        return this.oId;
    }

    public void setActualDataLine(final String pActualDataLine) {
        this.actualDataLine = pActualDataLine;
    }

    /**
     * @param pAmountActual the amountActual to set
     */
    public void setAmountActual(final BigDecimal pAmountActual) {
        this.amountActual = pAmountActual;
    }

    /**
     * @param pAmountBilled the amountBilled to set
     */
    public void setAmountBilled(final BigDecimal pAmountBilled) {
        this.amountBilled = pAmountBilled;
    }

    /**
     * @param pAmountDiff the amountDiff to set
     */
    public void setAmountDiff(final BigDecimal pAmountDiff) {
        this.amountDiff = pAmountDiff;
    }

    public void setCode(final String pCode) {
        this.code = ContractUtility.convertToUpperCase(pCode);
    }

    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

	/**
	 * @return the amountAccepted
	 */
    
	public BigDecimal getAmountAccepted() {
		
		/*if(amountAccepted==null)
			amountAccepted = BigDecimal.ZERO;*/
		
		return amountAccepted;
	}

	/**
	 * @param amountAccepted the amountAccepted to set
	 */
	public void setAmountAccepted(BigDecimal amountAccepted) {
		this.amountAccepted = amountAccepted;
	}

	public List<AccountingVatAmountBreakdownDto> getVatBreakdownDtos() {
		return vatBreakdownDtos;
	}

	public void setVatBreakdownDtos(List<AccountingVatAmountBreakdownDto> vatBreakdownDtos) {
		this.vatBreakdownDtos = vatBreakdownDtos;
	}
	
	

}