package com.unisys.trans.logistics.lms.accounting.dto;

import java.io.Serializable;

import com.unisys.trans.logistics.lms.accounting.dto.constants.InwardProrateType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AccountingProrateLadderBreakdownDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long oId;

    private BigDecimal prorateAmountActual;

    private BigDecimal prorateAmountBilled;
    
    private BigDecimal prorateAmountDiff;

    private BigDecimal prorateFactor;

    private InwardProrateType prorateType;

    private String sectorCarrier;

    private String sectorDest;

    private String sectorOrig;
    
    private String CurrencyOfProration;
    
    private Double prorateShare; 
    

    public Double getProrateShare() {
		return prorateShare;
	}

	public void setProrateShare(Double prorateShare) {
		this.prorateShare = prorateShare;
	}

	public String getCurrencyOfProration() {
		return CurrencyOfProration;
	}

	public void setCurrencyOfProration(String currencyOfProration) {
		CurrencyOfProration = currencyOfProration;
	}

	/**
     * Attribute to hold <code>actualDataLine</code> property.
     */
    private String actualDataLine;

    public AccountingProrateLadderBreakdownDto() {
    }

     public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    public BigDecimal getProrateAmountActual() {
        return this.prorateAmountActual;
    }

    public void setProrateAmountActual(final BigDecimal pProrateAmountActual) {
        this.prorateAmountActual = pProrateAmountActual;
    }

    public BigDecimal getProrateAmountBilled() {
        return this.prorateAmountBilled;
    }

    public void setProrateAmountBilled(final BigDecimal pProrateAmountBilled) {
        this.prorateAmountBilled = pProrateAmountBilled;
    }

    public InwardProrateType getProrateType() {
        return this.prorateType;
    }

    public void setProrateType(final InwardProrateType pProrateType) {
        this.prorateType = pProrateType;
    }

    public BigDecimal getProrateFactor() {
        if(this.prorateFactor != null) {
            this.prorateFactor = this.prorateFactor.setScale(0);
        }
        return this.prorateFactor;
    }

    public void setProrateFactor(final BigDecimal pProrateFactor) {
        this.prorateFactor = pProrateFactor;
    }

    public String getSectorCarrier() {
        return this.sectorCarrier;
    }

    public void setSectorCarrier(final String pSectorCarrier) {
        this.sectorCarrier = ContractUtility.convertToUpperCase(pSectorCarrier);
    }

    public String getSectorDest() {
        return this.sectorDest;
    }

    public void setSectorDest(final String pSectorDest) {
        this.sectorDest = ContractUtility.convertToUpperCase(pSectorDest);
    }

    public String getSectorOrig() {
        return this.sectorOrig;
    }

    public void setSectorOrig(final String pSectorOrig) {
        this.sectorOrig = ContractUtility.convertToUpperCase(pSectorOrig);
    }

    public Long getOId() {
        return this.oId;
    }

    /**
     * @return the prorateAmountDiff
     */
    public BigDecimal getProrateAmountDiff() {
        return this.prorateAmountDiff;
    }

    /**
     * @param prorateAmountDiff the prorateAmountDiff to set
     */
    public void setProrateAmountDiff(final BigDecimal pProrateAmountDiff) {
        this.prorateAmountDiff = pProrateAmountDiff;
    }
    
	public String getActualDataLine() {
		return this.actualDataLine;
	}

	public void setActualDataLine(final String pActualDataLine) {
		this.actualDataLine = pActualDataLine;
	}

}