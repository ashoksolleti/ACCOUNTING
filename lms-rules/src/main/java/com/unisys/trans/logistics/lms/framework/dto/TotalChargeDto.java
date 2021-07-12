package com.unisys.trans.logistics.lms.framework.dto;

import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.framework.constants.GenIdType;

public class TotalChargeDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = -4405217463967755899L;

    /**
     * Attribute to hold <code>amount</code> property.
     */
    private BigDecimal amount;

    /**
     * Attribute to hold <code>awbCollectChargeGenerationType</code> property.
     */
    private String awbCollectChargeGenerationType;

    /**
     * Attribute to hold <code>awbPrepaidChargeGenerationType</code> property.
     */
    private String awbPrepaidChargeGenerationType;

    /**
     * Attribute to hold <code>awbTotalCol</code> property.
     */
    private BigDecimal awbTotalCol;

    /**
     * Attribute to hold <code>awbTotalPpd</code> property.
     */
    private BigDecimal awbTotalPpd;

    /**
     * Attribute to hold <code>awbTotalWeightCharge</code> property.
     */
    private BigDecimal awbTotalWeightCharge;

    /**
     * Attribute to hold <code>awbWeightChargeGenerationType</code> property.
     */
    private String awbWeightChargeGenerationType;

    /**
     * Attribute to hold <code>CODChargeGenId</code> property.
     */
    private String CODChargeGenId;

    /**
     * Attribute to hold <code>codCur</code> property.
     */
    private String codCur;

    /**
     * Attribute to hold <code>codExchangeRate</code> property.
     */
    private BigDecimal codExchangeRate;

    /**
     * Attribute to hold <code>collectDueAgentCharge</code> property.
     */
    private BigDecimal collectDueAgentCharge;

    /**
     * Attribute to hold <code>collectDueCarrierCharge</code> property.
     */
    private BigDecimal collectDueCarrierCharge;

    /**
     * Attribute to hold <code>currencyCode</code> property.
     */
    private String currencyCode;

    /**
     * Attribute to hold <code>displayCollectChargeGenerationType</code> property.
     */
    private String displayCollectChargeGenerationType;

    /**
     * Attribute to hold <code>displayPrepaidChargeGenerationType</code> property.
     */
    private String displayPrepaidChargeGenerationType;

    /**
     * Attribute to hold <code>displayTotalColCharges</code> property.
     */
    private BigDecimal displayTotalColCharges;

    /**
     * Attribute to hold <code>displayTotalPpdCharges</code> property.
     */
    private BigDecimal displayTotalPpdCharges;

    /**
     * Attribute to hold <code>displayTotalWeightCharges</code> property.
     */
    private BigDecimal displayTotalWeightCharges;

    /**
     * Attribute to hold <code>displayWeightChargeGenerationType</code> property.
     */
    private String displayWeightChargeGenerationType;

    /**
     * Attribute to hold the <code> generationCode</code> property.
     */
    private GenIdType generationCode;

    /**
     * Attribute to hold <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold <code>prepaidDueAgentCharge</code> property.
     */
    private BigDecimal prepaidDueAgentCharge;

    /**
     * Attribute to hold <code>prepaidDueCarrierCharge</code> property.
     */
    private BigDecimal prepaidDueCarrierCharge;

    /**
     * Attribute to hold <code>printableCollectChargeGenerationType</code> property.
     */
    private String printableCollectChargeGenerationType;

    /**
     * Attribute to hold <code>printablePrepaidChargeGenerationType</code> property.
     */
    private String printablePrepaidChargeGenerationType;

    /**
     * Attribute to hold <code>printableTotalColCharges</code> property.
     */
    private BigDecimal printableTotalColCharges;

    /**
     * Attribute to hold <code>printableTotalPpdCharges</code> property.
     */
    private BigDecimal printableTotalPpdCharges;

    /**
     * Attribute to hold <code>printableTotalWeightCharges</code> property.
     */
    private BigDecimal printableTotalWeightCharges;

    /**
     * Attribute to hold <code>printableWeightChargeGenerationType</code> property.
     */
    private String printableWeightChargeGenerationType;

    /**
     * Attribute to hold <code>totalCodAmount</code> property.
     */
    private BigDecimal totalCodAmount;

    /**
     * Attribute to hold <code>valuationChargeGenerationType</code> property.
     */
    private String valuationChargeGenerationType;

    /**
     * Attribute to hold <code>valuationCharges</code> property.
     */
    private BigDecimal valuationCharges;
    
    /**
     * Attribute to hold <code>priceQuote</code> property.
     */
    private BigDecimal priceQuoteVale;
    
    
    private String voucher;
    
    private String authorizationCode;
    
    private String holderName;
    private String totalChrgExpirationDate;
    private String maskedNumber;
    private String ccCode;
    
    private String externalApprovalPin;
    private String remarks;
    private String number;
    private String currency;
    private String paymentTypeSelected;
    private String paymentMethodType;

    private String cashDrawerName;
    private String agentName;
    /**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * @return the paymentTypeSelected
	 */
	public String getPaymentTypeSelected() {
		return paymentTypeSelected;
	}

	/**
	 * @param paymentTypeSelected the paymentTypeSelected to set
	 */
	public void setPaymentTypeSelected(String paymentTypeSelected) {
		this.paymentTypeSelected = paymentTypeSelected;
	}

	/**
	 * @return the paymentMethodType
	 */
	public String getPaymentMethodType() {
		return paymentMethodType;
	}

	/**
	 * @param paymentMethodType the paymentMethodType to set
	 */
	public void setPaymentMethodType(String paymentMethodType) {
		this.paymentMethodType = paymentMethodType;
	}

	/**
	 * @return the cashDrawerName
	 */
	public String getCashDrawerName() {
		return cashDrawerName;
	}

	/**
	 * @param cashDrawerName the cashDrawerName to set
	 */
	public void setCashDrawerName(String cashDrawerName) {
		this.cashDrawerName = cashDrawerName;
	}

	/**
	 * @return the agentName
	 */
	public String getAgentName() {
		return agentName;
	}

	/**
	 * @param agentName the agentName to set
	 */
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	/**
	 * @return the totalCashColExport
	 */
	public String getTotalCashColExport() {
		return totalCashColExport;
	}

	/**
	 * @param totalCashColExport the totalCashColExport to set
	 */
	public void setTotalCashColExport(String totalCashColExport) {
		this.totalCashColExport = totalCashColExport;
	}

	/**
	 * @return the totalCashColImport
	 */
	public String getTotalCashColImport() {
		return totalCashColImport;
	}

	/**
	 * @param totalCashColImport the totalCashColImport to set
	 */
	public void setTotalCashColImport(String totalCashColImport) {
		this.totalCashColImport = totalCashColImport;
	}

	private String totalCashColExport;
    private String totalCashColImport;

    /**
     * @return the amount
     */
    public BigDecimal getAmount() {
        return this.amount;
    }

    /**
     * Gets the <code>awbCollectChargeGenerationType</code> property.
     * <p>
     *
     * @return the current value of the <code>awbCollectChargeGenerationType</code> property.
     */
    public String getAwbCollectChargeGenerationType() {
        return this.awbCollectChargeGenerationType;
    }

    /**
     * Gets the <code>awbPrepaidChargeGenerationType</code> property.
     * <p>
     *
     * @return the current value of the <code>awbPrepaidChargeGenerationType</code> property.
     */
    public String getAwbPrepaidChargeGenerationType() {
        return this.awbPrepaidChargeGenerationType;
    }

    /**
     * @return the awbTotalCol
     */
    public BigDecimal getAwbTotalCol() {
        return this.awbTotalCol;
    }

    /**
     * @return the awbTotalPpd
     */
    public BigDecimal getAwbTotalPpd() {
        return this.awbTotalPpd;
    }

    /**
     * @return the awbTotalWeightCharge
     */
    public BigDecimal getAwbTotalWeightCharge() {
        return this.awbTotalWeightCharge;
    }

    /**
     * Gets the <code>awbWeightChargeGenerationType</code> property.
     * <p>
     *
     * @return the current value of the <code>awbWeightChargeGenerationType</code> property.
     */
    public String getAwbWeightChargeGenerationType() {
        return this.awbWeightChargeGenerationType;
    }

    /**
     * @return the cODChargeGenId
     */
    public String getCODChargeGenId() {
        return this.CODChargeGenId;
    }

    /**
     * @return the codCur
     */
    public String getCodCur() {
        return this.codCur;
    }

    /**
     * @return the codExchangeRate
     */
    public BigDecimal getCodExchangeRate() {
        return this.codExchangeRate;
    }

    /**
     * @return the collectDueAgentCharge
     */
    public BigDecimal getCollectDueAgentCharge() {
        return this.collectDueAgentCharge;
    }

    /**
     * @return the collectDueCarrierCharge
     */
    public BigDecimal getCollectDueCarrierCharge() {
        return this.collectDueCarrierCharge;
    }

    /**
     * @return the currencyCode
     */
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * Gets the <code>displayCollectChargeGenerationType</code> property.
     * <p>
     *
     * @return the current value of the <code>displayCollectChargeGenerationType</code> property.
     */
    public String getDisplayCollectChargeGenerationType() {
        return this.displayCollectChargeGenerationType;
    }

    /**
     * Gets the <code>displayPrepaidChargeGenerationType</code> property.
     * <p>
     *
     * @return the current value of the <code>displayPrepaidChargeGenerationType</code> property.
     */
    public String getDisplayPrepaidChargeGenerationType() {
        return this.displayPrepaidChargeGenerationType;
    }

    /**
     * @return the displayTotalColCharges
     */
    public BigDecimal getDisplayTotalColCharges() {
        return this.displayTotalColCharges;
    }

    /**
     * @return the displayTotalPpdCharges
     */
    public BigDecimal getDisplayTotalPpdCharges() {
        return this.displayTotalPpdCharges;
    }

    /**
     * @return the displayTotalWeightCharges
     */
    public BigDecimal getDisplayTotalWeightCharges() {
        return this.displayTotalWeightCharges;
    }

    /**
     * Gets the <code>displayWeightChargeGenerationType</code> property.
     * <p>
     *
     * @return the current value of the <code>displayWeightChargeGenerationType</code> property.
     */
    public String getDisplayWeightChargeGenerationType() {
        return this.displayWeightChargeGenerationType;
    }

    /**
     * Gets the <code>generationCode</code> property.
     * <p>
     *
     * @return the current value of the <code>generationCode</code> property.
     */
    public GenIdType getGenerationCode() {
        return this.generationCode;
    }

    /**
     * @return the oId
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * @return the prepaidDueAgentCharge
     */
    public BigDecimal getPrepaidDueAgentCharge() {
        return this.prepaidDueAgentCharge;
    }

    /**
     * @return the prepaidDueCarrierCharge
     */
    public BigDecimal getPrepaidDueCarrierCharge() {
        return this.prepaidDueCarrierCharge;
    }

    /**
     * Gets the <code>printableCollectChargeGenerationType</code> property.
     * <p>
     *
     * @return the current value of the <code>printableCollectChargeGenerationType</code> property.
     */
    public String getPrintableCollectChargeGenerationType() {
        return this.printableCollectChargeGenerationType;
    }

    /**
     * Gets the <code>printablePrepaidChargeGenerationType</code> property.
     * <p>
     *
     * @return the current value of the <code>printablePrepaidChargeGenerationType</code> property.
     */
    public String getPrintablePrepaidChargeGenerationType() {
        return this.printablePrepaidChargeGenerationType;
    }

    /**
     * @return the printableTotalColCharges
     */
    public BigDecimal getPrintableTotalColCharges() {
        return this.printableTotalColCharges;
    }

    /**
     * @return the printableTotalPpdCharges
     */
    public BigDecimal getPrintableTotalPpdCharges() {
        return this.printableTotalPpdCharges;
    }

    /**
     * @return the printableTotalWeightCharges
     */
    public BigDecimal getPrintableTotalWeightCharges() {
        return this.printableTotalWeightCharges;
    }

    /**
     * Gets the <code>printableWeightChargeGenerationType</code> property.
     * <p>
     *
     * @return the current value of the <code>printableWeightChargeGenerationType</code> property.
     */
    public String getPrintableWeightChargeGenerationType() {
        return this.printableWeightChargeGenerationType;
    }

    /**
     * @return the totalCodAmount
     */
    public BigDecimal getTotalCodAmount() {
        return this.totalCodAmount;
    }

    /**
     * @return the valuationChargeGeneration
     */
    public String getValuationChargeGenerationType() {
        return this.valuationChargeGenerationType;
    }

    /**
     * @return the valuationCharges
     */
    public BigDecimal getValuationCharges() {
        return this.valuationCharges;
    }

    /**
     * This method compares the old and new values of total charges
     * <p>
     *
     * @param pObj
     *            holds the object of new other charges dto.
     * @returns true if it does not matches and false if it matches
     *
     **/
    public boolean matches(final Object pObj) {

        final TotalChargeDto other = (TotalChargeDto) pObj;

        if ((this.displayTotalColCharges != null && this.displayTotalColCharges.compareTo(BigDecimal.ZERO) != 0)
                    && other.displayTotalColCharges == null) {
            return false;
        }
        else if (this.displayTotalColCharges == null
                    && (other.displayTotalColCharges != null && other.displayTotalColCharges
                                .compareTo(BigDecimal.ZERO) != 0)) {
            return false;
        }
        else if (this.displayTotalColCharges != null
                    && other.displayTotalColCharges != null) {

            if (this.displayTotalColCharges
                        .compareTo(other.displayTotalColCharges) != 0) {
                return false;
            }
        }

        if ((this.displayTotalPpdCharges != null && this.displayTotalPpdCharges.compareTo(BigDecimal.ZERO) != 0)
                    && other.displayTotalPpdCharges == null) {
            return false;
        }
        else if (this.displayTotalPpdCharges == null
                    && (other.displayTotalPpdCharges != null
                    && other.displayTotalPpdCharges.compareTo(BigDecimal.ZERO) != 0)) {
            return false;
        }
        else if (this.displayTotalPpdCharges != null
                    && other.displayTotalPpdCharges != null) {

            if (this.displayTotalPpdCharges
                        .compareTo(other.displayTotalPpdCharges) != 0) {
                return false;
            }
        }

        if ((this.displayTotalWeightCharges != null && this.displayTotalWeightCharges
                    .compareTo(BigDecimal.ZERO) != 0)
                    && other.displayTotalWeightCharges == null) {
            return false;
        }
        else if (this.displayTotalWeightCharges == null
                    && (other.displayTotalWeightCharges != null
                    && other.displayTotalWeightCharges.compareTo(BigDecimal.ZERO) != 0)) {
            return false;
        }
        else if (this.displayTotalWeightCharges != null
                    && other.displayTotalWeightCharges != null) {

            if (this.displayTotalWeightCharges
                        .compareTo(other.displayTotalWeightCharges) != 0) {
                return false;
            }
        }

        if ((this.awbTotalCol != null && this.awbTotalCol.compareTo(BigDecimal.ZERO) != 0)
                    && other.awbTotalCol == null) {
            return false;
        }
        else if (this.awbTotalCol == null
                    && (other.awbTotalCol != null && other.awbTotalCol.compareTo(BigDecimal.ZERO) != 0)) {
            return false;
        }
        else if (this.awbTotalCol != null && other.awbTotalCol != null) {

            if (this.awbTotalCol.compareTo(other.awbTotalCol) != 0) {
                return false;
            }
        }

        if ((this.awbTotalPpd != null && this.awbTotalPpd.compareTo(BigDecimal.ZERO) != 0)
                    && other.awbTotalPpd == null) {
            return false;
        }
        else if (this.awbTotalPpd == null
                    && (other.awbTotalPpd != null && other.awbTotalPpd.compareTo(BigDecimal.ZERO) != 0)) {
            return false;
        }
        else if (this.awbTotalPpd != null && other.awbTotalPpd != null) {

            if (this.awbTotalPpd.compareTo(other.awbTotalPpd) != 0) {
                return false;
            }
        }

        if ((this.awbTotalWeightCharge != null && this.awbTotalWeightCharge.compareTo(BigDecimal.ZERO) != 0)
                    && other.awbTotalWeightCharge == null) {
            return false;
        }
        else if (this.awbTotalWeightCharge == null
                    && (other.awbTotalWeightCharge != null && other.awbTotalWeightCharge
                                .compareTo(BigDecimal.ZERO) != 0)) {
            return false;
        }
        else if (this.awbTotalWeightCharge != null
                    && other.awbTotalWeightCharge != null) {

            if (this.awbTotalWeightCharge.compareTo(other.awbTotalWeightCharge) != 0) {
                return false;
            }
        }

        if ((this.printableTotalColCharges != null && this.printableTotalColCharges.compareTo(BigDecimal.ZERO) != 0)
                    && other.printableTotalColCharges == null) {
            return false;
        }
        else if (this.printableTotalColCharges == null
                    && (other.printableTotalColCharges != null && other.printableTotalColCharges
                                .compareTo(BigDecimal.ZERO) != 0)) {
            return false;
        }
        else if (this.printableTotalColCharges != null
                    && other.printableTotalColCharges != null) {

            if (this.printableTotalColCharges
                        .compareTo(other.printableTotalColCharges) != 0) {
                return false;
            }
        }

        if ((this.printableTotalPpdCharges != null && this.printableTotalPpdCharges.compareTo(BigDecimal.ZERO) != 0)
                    && other.printableTotalPpdCharges == null) {
            return false;
        }
        else if (this.printableTotalPpdCharges == null
                    && (other.printableTotalPpdCharges != null && other.printableTotalPpdCharges
                                .compareTo(BigDecimal.ZERO) != 0)) {
            return false;
        }
        else if (this.printableTotalPpdCharges != null
                    && other.printableTotalPpdCharges != null) {

            if (this.printableTotalPpdCharges
                        .compareTo(other.printableTotalPpdCharges) != 0) {
                return false;
            }
        }

        if ((this.printableTotalWeightCharges != null && this.printableTotalWeightCharges
                    .compareTo(BigDecimal.ZERO) != 0)
                    && other.printableTotalWeightCharges == null) {
            return false;
        }
        else if (this.printableTotalWeightCharges == null
                    && (other.printableTotalWeightCharges != null && other.printableTotalWeightCharges
                                .compareTo(BigDecimal.ZERO) != 0)) {
            return false;
        }
        else if (this.printableTotalWeightCharges != null
                    && other.printableTotalWeightCharges != null) {

            if (this.printableTotalWeightCharges
                        .compareTo(other.printableTotalWeightCharges) != 0) {
                return false;
            }
        }

        if ((this.valuationCharges != null && this.valuationCharges.compareTo(BigDecimal.ZERO) != 0)
                    && other.valuationCharges == null) {
            return false;
        }
        else if (this.valuationCharges == null
                    && (other.valuationCharges != null && other.valuationCharges.compareTo(BigDecimal.ZERO) != 0)) {
            return false;
        }
        else if (this.valuationCharges != null
                    && other.valuationCharges != null) {
            if (this.valuationCharges.compareTo(other.valuationCharges) != 0) {
                return false;
            }
        }

        if ((this.totalCodAmount != null && this.totalCodAmount.compareTo(BigDecimal.ZERO) != 0)
                    && other.totalCodAmount == null) {
            return false;
        }
        else if (this.totalCodAmount == null
                    && (other.totalCodAmount != null && other.totalCodAmount.compareTo(BigDecimal.ZERO) != 0)) {
            return false;
        }
        else if (this.totalCodAmount != null && other.totalCodAmount != null) {
            if (this.totalCodAmount.compareTo(other.totalCodAmount) != 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * @param pAmount
     *            the amount to set
     */
    public void setAmount(final BigDecimal pAmount) {
        this.amount = pAmount;
    }

    /**
     * Sets the <code>pAwbCollectChargeGenerationType</code>.
     * <p>
     *
     * @param pOtherChargeAuditWorker
     *            holds the new value of <code>pAwbCollectChargeGenerationType</code>
     */
    public void setAwbCollectChargeGenerationType(
                final String pAwbCollectChargeGenerationType) {
        this.awbCollectChargeGenerationType = pAwbCollectChargeGenerationType;
    }

    /**
     * Sets the <code>pAwbPrepaidChargeGenerationType</code>.
     * <p>
     *
     * @param pOtherChargeAuditWorker
     *            holds the new value of <code>pAwbPrepaidChargeGenerationType</code>
     */
    public void setAwbPrepaidChargeGenerationType(
                final String pAwbPrepaidChargeGenerationType) {
        this.awbPrepaidChargeGenerationType = pAwbPrepaidChargeGenerationType;
    }

    /**
     * @param awbTotalCol
     *            the awbTotalCol to set
     */
    public void setAwbTotalCol(final BigDecimal pAwbTotalCol) {
        this.awbTotalCol = pAwbTotalCol;
    }

    /**
     * @param pAwbTotalPpd
     *            the awbTotalPpd to set
     */
    public void setAwbTotalPpd(final BigDecimal pAwbTotalPpd) {
        this.awbTotalPpd = pAwbTotalPpd;
    }

    /**
     * @param pAwbTotalWeightCharge
     *            the awbTotalWeightCharge to set
     */
    public void setAwbTotalWeightCharge(final BigDecimal pAwbTotalWeightCharge) {
        this.awbTotalWeightCharge = pAwbTotalWeightCharge;
    }

    /**
     * Sets the <code>pAwbWeightChargeGenerationType</code>.
     * <p>
     *
     * @param pOtherChargeAuditWorker
     *            holds the new value of <code>pAwbWeightChargeGenerationType</code>
     */
    public void setAwbWeightChargeGenerationType(
                final String pAwbWeightChargeGenerationType) {
        this.awbWeightChargeGenerationType = pAwbWeightChargeGenerationType;
    }

    /**
     * @param cODChargeGenId
     *            the cODChargeGenId to set
     */
    public void setCODChargeGenId(final String pCODChargeGenId) {
        this.CODChargeGenId = pCODChargeGenId;
    }

    /**
     * @param pCodCur
     *            the codCur to set
     */
    public void setCodCur(final String pCodCur) {
        this.codCur = pCodCur;
    }

    /**
     * @param pCodExchangeRate
     *            the codExchangeRate to set
     */
    public void setCodExchangeRate(final BigDecimal pCodExchangeRate) {
        this.codExchangeRate = pCodExchangeRate;
    }

    /**
     * @param pCollectDueAgentCharge
     *            the collectDueAgentCharge to set
     */
    public void setCollectDueAgentCharge(final BigDecimal pCollectDueAgentCharge) {
        this.collectDueAgentCharge = pCollectDueAgentCharge;
    }

    /**
     * @param pCollectDueCarrierCharge
     *            the collectDueCarrierCharge to set
     */
    public void setCollectDueCarrierCharge(
                final BigDecimal pCollectDueCarrierCharge) {
        this.collectDueCarrierCharge = pCollectDueCarrierCharge;
    }

    /**
     * @param pCurrencyCode
     *            the currencyCode to set
     */
    public void setCurrencyCode(final String pCurrencyCode) {
        this.currencyCode = pCurrencyCode;
    }

    /**
     * Sets the <code>pDisplayCollectChargeGenerationType</code>.
     * <p>
     *
     * @param pOtherChargeAuditWorker
     *            holds the new value of <code>pDisplayCollectChargeGenerationType</code>
     */
    public void setDisplayCollectChargeGenerationType(
                final String pDisplayCollectChargeGenerationType) {
        this.displayCollectChargeGenerationType = pDisplayCollectChargeGenerationType;
    }

    /**
     * Sets the <code>pDisplayPrepaidChargeGenerationType</code>.
     * <p>
     *
     * @param pOtherChargeAuditWorker
     *            holds the new value of <code>pDisplayPrepaidChargeGenerationType</code>
     */
    public void setDisplayPrepaidChargeGenerationType(
                final String pDisplayPrepaidChargeGenerationType) {
        this.displayPrepaidChargeGenerationType = pDisplayPrepaidChargeGenerationType;
    }

    /**
     * @param pDisplayTotalColCharges
     *            the displayTotalColCharges to set
     */
    public void setDisplayTotalColCharges(
                final BigDecimal pDisplayTotalColCharges) {
        this.displayTotalColCharges = pDisplayTotalColCharges;
    }

    /**
     * @param pDisplayTotalPpdCharges
     *            the displayTotalPpdCharges to set
     */
    public void setDisplayTotalPpdCharges(
                final BigDecimal pDisplayTotalPpdCharges) {
        this.displayTotalPpdCharges = pDisplayTotalPpdCharges;
    }

    /**
     * @param pDisplayTotalWeightCharges
     *            the displayTotalWeightCharges to set
     */
    public void setDisplayTotalWeightCharges(
                final BigDecimal pDisplayTotalWeightCharges) {
        this.displayTotalWeightCharges = pDisplayTotalWeightCharges;
    }

    /**
     * Sets the <code>pDisplayWeightChargeGenerationType</code>.
     * <p>
     *
     * @param pOtherChargeAuditWorker
     *            holds the new value of <code>pDisplayWeightChargeGenerationType</code>
     */
    public void setDisplayWeightChargeGenerationType(
                final String pDisplayWeightChargeGenerationType) {
        this.displayWeightChargeGenerationType = pDisplayWeightChargeGenerationType;
    }

    /**
     * Sets the <code>generationCode</code> property.
     * <p>
     *
     * @param pGenerationCode
     *            holds the new value of <code>generationCode</code>.<br>
     */
    public void setGenerationCode(final GenIdType pGenerationCode) {
        this.generationCode = pGenerationCode;
    }

    /**
     * @param pOId
     *            the oId to set
     */
    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    /**
     * @param pPrepaidDueAgentCharge
     *            the prepaidDueAgentCharge to set
     */
    public void setPrepaidDueAgentCharge(final BigDecimal pPrepaidDueAgentCharge) {
        this.prepaidDueAgentCharge = pPrepaidDueAgentCharge;
    }

    /**
     * @param pPrepaidDueCarrierCharge
     *            the prepaidDueCarrierCharge to set
     */
    public void setPrepaidDueCarrierCharge(
                final BigDecimal pPrepaidDueCarrierCharge) {
        this.prepaidDueCarrierCharge = pPrepaidDueCarrierCharge;
    }

    /**
     * Sets the <code>pPrintableCollectChargeGenerationType</code>.
     * <p>
     *
     * @param pOtherChargeAuditWorker
     *            holds the new value of <code>pPrintableCollectChargeGenerationType</code>
     */
    public void setPrintableCollectChargeGenerationType(
                final String pPrintableCollectChargeGenerationType) {
        this.printableCollectChargeGenerationType = pPrintableCollectChargeGenerationType;
    }

    /**
     * Sets the <code>pPrintablePrepaidChargeGenerationType</code>.
     * <p>
     *
     * @param pOtherChargeAuditWorker
     *            holds the new value of <code>pPrintablePrepaidChargeGenerationType</code>
     */
    public void setPrintablePrepaidChargeGenerationType(
                final String pPrintablePrepaidChargeGenerationType) {
        this.printablePrepaidChargeGenerationType = pPrintablePrepaidChargeGenerationType;
    }

    /**
     * @param pPrintableTotalColCharges
     *            the printableTotalColCharges to set
     */
    public void setPrintableTotalColCharges(
                final BigDecimal pPrintableTotalColCharges) {
        this.printableTotalColCharges = pPrintableTotalColCharges;
    }

    /**
     * @param pPrintableTotalPpdCharges
     *            the printableTotalPpdCharges to set
     */
    public void setPrintableTotalPpdCharges(
                final BigDecimal pPrintableTotalPpdCharges) {
        this.printableTotalPpdCharges = pPrintableTotalPpdCharges;
    }

    /**
     * @param pPrintableTotalWeightCharges
     *            the printableTotalWeightCharges to set
     */
    public void setPrintableTotalWeightCharges(
                final BigDecimal pPrintableTotalWeightCharges) {
        this.printableTotalWeightCharges = pPrintableTotalWeightCharges;
    }

    /**
     * Sets the <code>pPrintableWeightChargeGenerationType</code>.
     * <p>
     *
     * @param pOtherChargeAuditWorker
     *            holds the new value of <code>pPrintableWeightChargeGenerationType</code>
     */
    public void setPrintableWeightChargeGenerationType(
                final String pPrintableWeightChargeGenerationType) {
        this.printableWeightChargeGenerationType = pPrintableWeightChargeGenerationType;
    }

    /**
     * @param pTotalCodAmount
     *            the totalCodAmount to set
     */
    public void setTotalCodAmount(final BigDecimal pTotalCodAmount) {
        this.totalCodAmount = pTotalCodAmount;
    }

    /**
     * @param pValuationChargeGeneration
     *            the valuationChargeGeneration to set
     */
    public void setValuationChargeGenerationType(
                final String pValuationChargeGenerationType) {
        this.valuationChargeGenerationType = pValuationChargeGenerationType;
    }

    /**
     * @param pValuationCharges
     *            the valuationCharges to set
     */
    public void setValuationCharges(final BigDecimal pValuationCharges) {
        this.valuationCharges = pValuationCharges;
    }

	/**
	 * @return the oId
	 */
	public Long getoId() {
		return oId;
	}

	/**
	 * @param oId the oId to set
	 */
	public void setoId(Long oId) {
		this.oId = oId;
	}

	/**
	 * @return the priceQuoteVale
	 */
	public BigDecimal getPriceQuoteVale() {
		return priceQuoteVale;
	}

	/**
	 * @param priceQuoteVale the priceQuoteVale to set
	 */
	public void setPriceQuoteVale(BigDecimal priceQuoteVale) {
		this.priceQuoteVale = priceQuoteVale;
	}

	public String getVoucher() {
		return voucher;
	}

	public void setVoucher(String voucher) {
		this.voucher = voucher;
	}

	public String getAuthorizationCode() {
		return authorizationCode;
	}

	public void setAuthorizationCode(String authorizationCode) {
		this.authorizationCode = authorizationCode;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getMaskedNumber() {
		return maskedNumber;
	}

	public void setMaskedNumber(String maskedNumber) {
		this.maskedNumber = maskedNumber;
	}

	public String getCcCode() {
		return ccCode;
	}

	public void setCcCode(String ccCode) {
		this.ccCode = ccCode;
	}

	public String getTotalChrgExpirationDate() {
		return totalChrgExpirationDate;
	}

	public void setTotalChrgExpirationDate(String totalChrgExpirationDate) {
		this.totalChrgExpirationDate = totalChrgExpirationDate;
	}

	public String getExternalApprovalPin() {
		return externalApprovalPin;
	}

	public void setExternalApprovalPin(String externalApprovalPin) {
		this.externalApprovalPin = externalApprovalPin;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
