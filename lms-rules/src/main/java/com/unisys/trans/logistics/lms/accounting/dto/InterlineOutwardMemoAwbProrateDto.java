package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.accounting.dto.constants.InwardProrateType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class InterlineOutwardMemoAwbProrateDto extends PersistenceObjectDto {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private Long OId;
    private String prorationCurrency;
    private BigDecimal totalAmount;
    private String sectorCarrier;
    private String sectorOrigin;
    private String sectorDestination;
    private InwardProrateType prorateMethod;
    private Long prorateFactor;
    private Double prorateShare;
    private BigDecimal prorateAmount;
    
    private BigDecimal prorateAmountActual;

    private BigDecimal prorateAmountBilled;
    
    private BigDecimal prorateAmountDiff;

    public Long getOId() {
        return OId;
    }

    public void setOId(Long oId) {
        OId = oId;
    }

    public String getProrationCurrency() {
        return prorationCurrency;
    }

    public void setProrationCurrency(String prorationCurrency) {
        if (prorationCurrency != null)
            this.prorationCurrency = prorationCurrency.toUpperCase();
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getSectorCarrier() {
        return sectorCarrier;
    }

    public void setSectorCarrier(String sectorCarrier) {
        this.sectorCarrier = (sectorCarrier != null) ? sectorCarrier.toUpperCase() : sectorCarrier;
    }

    public String getSectorOrigin() {
        return sectorOrigin;
    }

    public void setSectorOrigin(String sectorOrigin) {
        this.sectorOrigin = (sectorOrigin != null) ? sectorOrigin.toUpperCase() : sectorOrigin;
    }

    public String getSectorDestination() {
        return sectorDestination;
    }

    public void setSectorDestination(String sectorDestination) {
        this.sectorDestination = (sectorDestination != null) ? sectorDestination.toUpperCase() : sectorDestination;
    }

    public InwardProrateType getProrateMethod() {
        return prorateMethod;
    }

    public void setProrateMethod(InwardProrateType prorateMethod) {
        this.prorateMethod = prorateMethod;
    }

    public Long getProrateFactor() {
        return prorateFactor;
    }

    public void setProrateFactor(Long prorateFactor) {
        this.prorateFactor = prorateFactor;
    }

    public Double getProrateShare() {
        return prorateShare;
    }

    public void setProrateShare(Double prorateShare) {
        this.prorateShare = prorateShare;
    }

    public BigDecimal getProrateAmount() {
        return prorateAmount;
    }

    public void setProrateAmount(BigDecimal prorateAmount) {
        this.prorateAmount = prorateAmount;
    }

	public BigDecimal getProrateAmountActual() {
		return prorateAmountActual;
	}

	public void setProrateAmountActual(BigDecimal prorateAmountActual) {
		this.prorateAmountActual = prorateAmountActual;
	}

	public BigDecimal getProrateAmountBilled() {
		return prorateAmountBilled;
	}

	public void setProrateAmountBilled(BigDecimal prorateAmountBilled) {
		this.prorateAmountBilled = prorateAmountBilled;
	}

	public BigDecimal getProrateAmountDiff() {
		return prorateAmountDiff;
	}

	public void setProrateAmountDiff(BigDecimal prorateAmountDiff) {
		this.prorateAmountDiff = prorateAmountDiff;
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
        if (prorationCurrency == null &&
                totalAmount == null &&
                sectorCarrier == null &&
                sectorOrigin == null &&
                sectorDestination == null &&
                prorateMethod == null &&
                prorateFactor == null &&
                prorateShare == null &&
                prorateAmount == null)
            isEmptyObj = true;
        return isEmptyObj;
    }
    
}
