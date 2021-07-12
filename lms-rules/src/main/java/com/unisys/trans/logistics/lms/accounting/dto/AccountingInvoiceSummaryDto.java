package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

/**
 * The persistent class for the ACC_INVOICE_SUMMARY database table.
 * 
 */
public class AccountingInvoiceSummaryDto extends PersistenceObjectDto {
    private static final long serialVersionUID = 1L;

    private String filecredentials;

    private BigDecimal nettotalinvoicedueairline;

    private BigDecimal noofawbs;

    private BigDecimal noofccas;

    private BigDecimal noofdcms;

    private Long oId;

    private BigDecimal totalinvoicecollectcharges;

    private BigDecimal totalinvoicecommission;

    private BigDecimal totalinvoiceincentive;

    private BigDecimal totalinvoicenetamountbeforetax;

    private BigDecimal totalinvoicenetamountpayable;

    private BigDecimal totalinvoiceprepaidcharges;

    private BigDecimal totalinvoicetax;

    private BigDecimal totalinvoiceweight;

    private BigDecimal totalotherchargesdueagent;

    private BigDecimal totalotherchargesduecarrier;

    private BigDecimal totaltaxdueagent;

    private BigDecimal totaltaxdueairline;

    private BigDecimal totalvaluationcharges;

    private BigDecimal totalweightcharges;
    
 // New fields introduced for Outward Billing
	
 	private String listingCurrency;
 	
 	private String billingCurrencySIS;
 	
 	private BigDecimal exchangeRate;
 	
 	private String settlementMethod;
 	
 	private BigDecimal settlementMonthPeriod;
 	
 	private BigDecimal totalFuelSurcharge;
 	
 	//Rehan Changes Start
 	
 	private BigDecimal keralaFloodCess;
 	//Rehan Changes End
 	
 	private BigDecimal commercialSurcharge;
 	
	/** CGST */
	private BigDecimal cgst;
	
	/** SGST */
	private BigDecimal sgst;
	
	/** IGST */
	private BigDecimal igst;

    /**
     * Attribute to hold <code>TDS</code> property.
     */
    private BigDecimal tdsAmount;

    public BigDecimal getTdsAmount() {
        return tdsAmount;
    }

    public void setTdsAmount(BigDecimal tdsAmount) {
        this.tdsAmount = tdsAmount;
    }

    

	public BigDecimal getCgst() {
		return cgst;
	}

	public void setCgst(BigDecimal cgst) {
		this.cgst = cgst;
	}

	public BigDecimal getSgst() {
		return sgst;
	}

	public void setSgst(BigDecimal sgst) {
		this.sgst = sgst;
	}

	public BigDecimal getIgst() {
		return igst;
	}

	public void setIgst(BigDecimal igst) {
		this.igst = igst;
	}

	public AccountingInvoiceSummaryDto() {
    }

    public String getFilecredentials() {
        return this.filecredentials;
    }

    public BigDecimal getNettotalinvoicedueairline() {
        return this.nettotalinvoicedueairline;
    }

    public BigDecimal getNoofawbs() {
        return this.noofawbs;
    }

    public BigDecimal getNoofccas() {
        return this.noofccas;
    }

    public BigDecimal getNoofdcms() {
        return this.noofdcms;
    }

    @Override
    public Long getOId() {
        // TODO Auto-generated method stub
        return this.oId;
    }

    public BigDecimal getTotalinvoicecollectcharges() {
        return this.totalinvoicecollectcharges;
    }

    public BigDecimal getTotalinvoicecommission() {
        return this.totalinvoicecommission;
    }

    public BigDecimal getTotalinvoiceincentive() {
        return this.totalinvoiceincentive;
    }

    public BigDecimal getTotalinvoicenetamountbeforetax() {
        return this.totalinvoicenetamountbeforetax;
    }

    public BigDecimal getTotalinvoicenetamountpayable() {
        return this.totalinvoicenetamountpayable;
    }

    public BigDecimal getTotalinvoiceprepaidcharges() {
        return this.totalinvoiceprepaidcharges;
    }

    public BigDecimal getTotalinvoicetax() {
        return this.totalinvoicetax;
    }

    public BigDecimal getTotalinvoiceweight() {
        return this.totalinvoiceweight;
    }

    public BigDecimal getTotalotherchargesdueagent() {
        return this.totalotherchargesdueagent;
    }

    public BigDecimal getTotalotherchargesduecarrier() {
        return this.totalotherchargesduecarrier;
    }

    public BigDecimal getTotaltaxdueagent() {
        return this.totaltaxdueagent;
    }

    public BigDecimal getTotaltaxdueairline() {
        return this.totaltaxdueairline;
    }

    public BigDecimal getTotalvaluationcharges() {
        return this.totalvaluationcharges;
    }

    public BigDecimal getTotalweightcharges() {
        return this.totalweightcharges;
    }

    public void setFilecredentials(final String pFilecredentials) {
        this.filecredentials = pFilecredentials;
    }

    public void setNettotalinvoicedueairline(final BigDecimal pNettotalinvoicedueairline) {
        this.nettotalinvoicedueairline = pNettotalinvoicedueairline;
    }

    public void setNoofawbs(final BigDecimal pNoofawbs) {
        this.noofawbs = pNoofawbs;
    }

    public void setNoofccas(final BigDecimal pNoofccas) {
        this.noofccas = pNoofccas;
    }

    public void setNoofdcms(final BigDecimal pNoofdcms) {
        this.noofdcms = pNoofdcms;
    }

    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    public void setTotalinvoicecollectcharges(final BigDecimal pTotalinvoicecollectcharges) {
        this.totalinvoicecollectcharges = pTotalinvoicecollectcharges;
    }

    public void setTotalinvoicecommission(final BigDecimal pTotalinvoicecommission) {
        this.totalinvoicecommission = pTotalinvoicecommission;
    }

    public void setTotalinvoiceincentive(final BigDecimal pTotalinvoiceincentive) {
        this.totalinvoiceincentive = pTotalinvoiceincentive;
    }

    public void setTotalinvoicenetamountbeforetax(final BigDecimal pTotalinvoicenetamountbeforetax) {
        this.totalinvoicenetamountbeforetax = pTotalinvoicenetamountbeforetax;
    }

    public void setTotalinvoicenetamountpayable(final BigDecimal pTotalinvoicenetamountpayable) {
        this.totalinvoicenetamountpayable = pTotalinvoicenetamountpayable;
    }

    public void setTotalinvoiceprepaidcharges(final BigDecimal pTotalinvoiceprepaidcharges) {
        this.totalinvoiceprepaidcharges = pTotalinvoiceprepaidcharges;
    }

    public void setTotalinvoicetax(final BigDecimal pTotalinvoicetax) {
        this.totalinvoicetax = pTotalinvoicetax;
    }

    public void setTotalinvoiceweight(final BigDecimal pTotalinvoiceweight) {
        this.totalinvoiceweight = pTotalinvoiceweight;
    }

    public void setTotalotherchargesdueagent(final BigDecimal pTotalotherchargesdueagent) {
        this.totalotherchargesdueagent = pTotalotherchargesdueagent;
    }

    public void setTotalotherchargesduecarrier(final BigDecimal pTotalotherchargesduecarrier) {
        this.totalotherchargesduecarrier = pTotalotherchargesduecarrier;
    }

    public void setTotaltaxdueagent(final BigDecimal pTotaltaxdueagent) {
        this.totaltaxdueagent = pTotaltaxdueagent;
    }

    public void setTotaltaxdueairline(final BigDecimal pTotaltaxdueairline) {
        this.totaltaxdueairline = pTotaltaxdueairline;
    }

    public void setTotalvaluationcharges(final BigDecimal pTotalvaluationcharges) {
        this.totalvaluationcharges = pTotalvaluationcharges;
    }

    public void setTotalweightcharges(final BigDecimal pTotalweightcharges) {
        this.totalweightcharges = pTotalweightcharges;
    }

	public String getListingCurrency() {
		return listingCurrency;
	}

	public void setListingCurrency(String listingCurrency) {
		this.listingCurrency = listingCurrency;
	}

	public String getBillingCurrencySIS() {
		return billingCurrencySIS;
	}

	public void setBillingCurrencySIS(String billingCurrencySIS) {
		this.billingCurrencySIS = billingCurrencySIS;
	}

	public BigDecimal getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(BigDecimal exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public String getSettlementMethod() {
		return settlementMethod;
	}

	public void setSettlementMethod(String settlementMethod) {
		this.settlementMethod = settlementMethod;
	}

	public BigDecimal getSettlementMonthPeriod() {
		return settlementMonthPeriod;
	}

	public void setSettlementMonthPeriod(BigDecimal settlementMonthPeriod) {
		this.settlementMonthPeriod = settlementMonthPeriod;
	}
	
	public BigDecimal getTotalFuelSurcharge() {
		
		if(totalFuelSurcharge == null){
			totalFuelSurcharge = new BigDecimal(0);
		}
		
		
		return totalFuelSurcharge;
	}

	public void setTotalFuelSurcharge(BigDecimal totalFuelSurcharge) {
		this.totalFuelSurcharge = totalFuelSurcharge;
	}
	
	//Rehan Changes Start
	public BigDecimal getKeralaFloodCess() {
		if(keralaFloodCess == null){
			keralaFloodCess = new BigDecimal(0);
		}	
		return keralaFloodCess;
	}

	public void setKeralaFloodCess(BigDecimal keralaFloodCess) {
		this.keralaFloodCess = keralaFloodCess;
	}

	public BigDecimal getCommercialSurcharge() {
		if(commercialSurcharge == null){
			commercialSurcharge = new BigDecimal(0);
		}
		return commercialSurcharge;
	}

	public void setCommercialSurcharge(BigDecimal commercialSurcharge) {
		this.commercialSurcharge = commercialSurcharge;
	}
	
	//Rehan Changes End

}