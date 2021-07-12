package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.unisys.trans.logistics.lms.accounting.dto.constants.VATIdentifier;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class InterlineOutwardMemoAwbVATDto extends PersistenceObjectDto {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private Long OId;
    private String vatLabel;
    private VATIdentifier vatIdentifier;
    private String vatCode;
    private String vatText;
    private BigDecimal vatTaxableAmount;
    private BigDecimal vatPercentage;
    private BigDecimal vatCalculatedAmount;
    private  BigDecimal vatBaseAmountAccepted ;
    private BigDecimal vatPercentageAccepted;
    private BigDecimal vatCalAmountAccepted;
    
    
    private BigDecimal vatBaseAmountActual;

    /**
     * Attribute to hold <code>vatBaseAmountBilled</code> property.
     */
    private BigDecimal vatBaseAmountBilled;

    /**
     * Attribute to hold <code>vatBaseAmountDiff</code> property.
     */
    private BigDecimal vatBaseAmountDiff;

    /**
     * Attribute to hold <code>vatCalAmountActual</code> property.
     */
    private BigDecimal vatCalAmountActual;

    /**
     * Attribute to hold <code>vatCalAmountBilled</code> property.
     */
    private BigDecimal vatCalAmountBilled;

    /**
     * Attribute to hold <code>vatCalAmountDiff</code> property.
     */
    private BigDecimal vatCalAmountDiff;


    /**
     * Attribute to hold <code>vatPercentageActual</code> property.
     */
    private BigDecimal vatPercentageActual;

    /**
     * Attribute to hold <code>vatPercentageBilled</code> property.
     */
    private BigDecimal vatPercentageBilled;

    /**
     * Attribute to hold <code>vatPercentageDiff</code> property.
     */
    private BigDecimal vatPercentageDiff;

    public Long getOId() {
        return OId;
    }

    public void setOId(Long oId) {
        OId = oId;
    }

    public String getVatLabel() {
        return vatLabel;
    }

    public void setVatLabel(String vatLabel) {
        this.vatLabel = vatLabel;
    }

    public VATIdentifier getVatIdentifier() {
        return vatIdentifier;
    }

    public void setVatIdentifier(VATIdentifier vatIdentifier) {
        this.vatIdentifier = vatIdentifier;
    }

    public String getVatCode() {
        return vatCode;
    }

    public void setVatCode(String vatCode) {
        this.vatCode = vatCode;
    }

    public String getVatText() {
        return vatText;
    }

    public void setVatText(String vatText) {
        this.vatText = vatText;
    }

    public BigDecimal getVatTaxableAmount() {
        return vatTaxableAmount;
    }

    public void setVatTaxableAmount(BigDecimal vatTaxableAmount) {
        this.vatTaxableAmount = vatTaxableAmount;
    }

    public BigDecimal getVatPercentage() {
        return vatPercentage;
    }

    public void setVatPercentage(BigDecimal vatPercentage) {
        this.vatPercentage = vatPercentage;
    }

    public BigDecimal getVatCalculatedAmount() {
        return vatCalculatedAmount;
    }

    public void setVatCalculatedAmount(BigDecimal vatCalculatedAmount) {
        // vatCalculatedAmount = (vatTaxableAmount * vatPercentage)/100;
        if ((null != vatTaxableAmount && null != vatPercentage) && !vatTaxableAmount.equals(BigDecimal.ZERO)) {
            vatCalculatedAmount = vatTaxableAmount.multiply(vatPercentage).divide(new BigDecimal(100), 2,
                    RoundingMode.CEILING);
        }
        this.vatCalculatedAmount = vatCalculatedAmount;
    }

	public BigDecimal getVatBaseAmountActual() {
		return vatBaseAmountActual;
	}

	public void setVatBaseAmountActual(BigDecimal vatBaseAmountActual) {
		this.vatBaseAmountActual = vatBaseAmountActual;
	}

	public BigDecimal getVatBaseAmountBilled() {
		return vatBaseAmountBilled;
	}

	public void setVatBaseAmountBilled(BigDecimal vatBaseAmountBilled) {
		this.vatBaseAmountBilled = vatBaseAmountBilled;
	}

	public BigDecimal getVatBaseAmountDiff() {
		return vatBaseAmountDiff;
	}

	public void setVatBaseAmountDiff(BigDecimal vatBaseAmountDiff) {
		this.vatBaseAmountDiff = vatBaseAmountDiff;
	}

	public BigDecimal getVatCalAmountActual() {
		return vatCalAmountActual;
	}

	public void setVatCalAmountActual(BigDecimal vatCalAmountActual) {
		this.vatCalAmountActual = vatCalAmountActual;
	}

	public BigDecimal getVatCalAmountBilled() {
		return vatCalAmountBilled;
	}

	public void setVatCalAmountBilled(BigDecimal vatCalAmountBilled) {
		this.vatCalAmountBilled = vatCalAmountBilled;
	}

	public BigDecimal getVatCalAmountDiff() {
		return vatCalAmountDiff;
	}

	public void setVatCalAmountDiff(BigDecimal vatCalAmountDiff) {
		this.vatCalAmountDiff = vatCalAmountDiff;
	}

	public BigDecimal getVatPercentageActual() {
		return vatPercentageActual;
	}

	public void setVatPercentageActual(BigDecimal vatPercentageActual) {
		this.vatPercentageActual = vatPercentageActual;
	}

	public BigDecimal getVatPercentageBilled() {
		return vatPercentageBilled;
	}

	public void setVatPercentageBilled(BigDecimal vatPercentageBilled) {
		this.vatPercentageBilled = vatPercentageBilled;
	}

	public BigDecimal getVatPercentageDiff() {
		return vatPercentageDiff;
	}

	public void setVatPercentageDiff(BigDecimal vatPercentageDiff) {
		this.vatPercentageDiff = vatPercentageDiff;
	}

    public BigDecimal getVatBaseAmountAccepted() {
        return vatBaseAmountAccepted;
    }

    public void setVatBaseAmountAccepted(BigDecimal vatBaseAmountAccepted) {
        this.vatBaseAmountAccepted = vatBaseAmountAccepted;
    }

    public BigDecimal getVatPercentageAccepted() {
        return vatPercentageAccepted;
    }

    public void setVatPercentageAccepted(BigDecimal vatPercentageAccepted) {
        this.vatPercentageAccepted = vatPercentageAccepted;
    }

    public BigDecimal getVatCalAmountAccepted() {
        return vatCalAmountAccepted;
    }

    public void setVatCalAmountAccepted(BigDecimal vatCalAmountAccepted) {
        this.vatCalAmountAccepted = vatCalAmountAccepted;
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
        if (vatLabel == null &&
                vatIdentifier == null &&
                vatCode == null &&
                vatText == null &&
                vatTaxableAmount == null &&
                vatPercentage == null)
            isEmptyObj = true;
        return isEmptyObj;
    }
    
}
