package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import com.unisys.trans.logistics.lms.accounting.dto.constants.InwardInvoiceStatus;
import com.unisys.trans.logistics.lms.accounting.dto.constants.PaymentStatusType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ReceivableStatusType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * The persistent class for the ACC_INVOICE_DETAILS database table.
 * 
 */
public class AccountingInvoiceDetailDto extends PersistenceObjectDto {
    private static final long serialVersionUID = 1L;

    private Set<AccountingInvoiceAWBDto> accInvoiceAwbs;

    private AccountingInvoiceBillingScheduleDto accInvoiceBillingschedule;
    
    private CASSInvoiceFileDetailsDto cASSInvoiceFileDetailsDto;
    
    private AccountingInvoiceSummaryDto accInvoiceSummary;

    private Set<AccountingInvoiceDCMDto> accountingInvoiceDCMs;

    private String accountType;

    private String billingCarrier;

    private String billingCurrency;

    private AccountingOriginalInvoiceDetailDto billingoriginal;

    private String country;

    private AccountingOriginalInvoiceDetailDto creditoriginal;

    private String generateInvoice;
    
    private String hostCurrencyCode;

    private String iataAccountNumber;

    private InterlineInwardBillingFileDetailDto interlineInwardBillingFileDetailDto;

    private List<AccountingInvoiceAWBDto> invoiceAwbDtos;

    private Date invoiceDate;

    private String invoiceFrequency;

    private String invoiceNumber;
    
    private BigDecimal invoicePaidAmount;
    
    private PaymentStatusType invoicePaymentStatus; 
    
    private String invoiceStatus;
    
    private String invoiceEmailStatus;
    
    private InwardInvoiceStatus inwardInvoiceStatus;
    
    private ReceivableStatusType receivableStatusType;
    
    private Date lastModifiedDate;

    private String modeInvoice;

    private Long oId;

    private String participantAccountNumber;

    private ParticipantInvoicePrintDto participantInvoicePrintDto;

    private AccountingOriginalInvoiceDetailDto rejectoriginal;
    
    private String rejectStage;
    
    private String sFICode;
	
    private Boolean sisIndicator;
    
    private Boolean printIndicator;
    
    private Boolean creditInvoice;
    
    private String specificAirline;

    public AccountingInvoiceDetailDto() {
    }

	public Set<AccountingInvoiceAWBDto> getAccInvoiceAwbs() {
        return this.accInvoiceAwbs;
    }
	public AccountingInvoiceBillingScheduleDto getAccInvoiceBillingschedule() {

        return this.accInvoiceBillingschedule;
    }
	

	public CASSInvoiceFileDetailsDto getcASSInvoiceFileDetailsDto() {
		return cASSInvoiceFileDetailsDto;
	}

	public void setcASSInvoiceFileDetailsDto(CASSInvoiceFileDetailsDto cASSInvoiceFileDetailsDto) {
		this.cASSInvoiceFileDetailsDto = cASSInvoiceFileDetailsDto;
	}

	public AccountingInvoiceSummaryDto getAccInvoiceSummary() {
        return this.accInvoiceSummary;
    }

	/**
	 * @return the accountingInvoiceDCMs
	 */
	public Set<AccountingInvoiceDCMDto> getAccountingInvoiceDCMs() {
		return this.accountingInvoiceDCMs;
	}

    public String getAccountType() {
		return this.accountType;
	}

    public String getBillingCarrier() {
        return this.billingCarrier;
    }

    public String getBillingCurrency() {
        return this.billingCurrency;
    }

    public AccountingOriginalInvoiceDetailDto getBillingoriginal() {
        return this.billingoriginal;
    }

    public String getCountry() {
		return this.country;
	}

    public AccountingOriginalInvoiceDetailDto getCreditoriginal() {
        return this.creditoriginal;
    }

    public String getGenerateInvoice() {
        return this.generateInvoice;
    }

    public String getHostCurrencyCode() {
		return this.hostCurrencyCode;
	}

    public String getIataAccountNumber() {
		return this.iataAccountNumber;
	}

    /**
     * @return the interlineInwardBillingFileDetailDto
     */
    public InterlineInwardBillingFileDetailDto getInterlineInwardBillingFileDetailDto() {
        return this.interlineInwardBillingFileDetailDto;
    }

    /**
     * @return the invoiceAwbDtos
     */
    public List<AccountingInvoiceAWBDto> getInvoiceAwbDtos() {
        if (this.invoiceAwbDtos == null) {
            this.invoiceAwbDtos = new ArrayList<AccountingInvoiceAWBDto>();
        }
        return this.invoiceAwbDtos;
    }

    public Date getInvoiceDate() {
        return ContractUtility.getClonedDate(this.invoiceDate);
    }

    public String getInvoiceFrequency() {
        return this.invoiceFrequency;
    }

    public String getInvoiceNumber() {
        return this.invoiceNumber;
    }

    public BigDecimal getInvoicePaidAmount() {
		return this.invoicePaidAmount;
	}

    public PaymentStatusType getInvoicePaymentStatus() {
		return this.invoicePaymentStatus;
	}

    public String getInvoiceStatus() {
        return this.invoiceStatus;
    }

	public InwardInvoiceStatus getInwardInvoiceStatus() {
        return this.inwardInvoiceStatus;
    }

	public Date getLastModifiedDate() {
		return this.lastModifiedDate;
	}

    public String getModeInvoice() {
        return this.modeInvoice;
    }

    @Override
    public Long getOId() {
        // TODO Auto-generated method stub
        return this.oId;
    }

    public String getParticipantAccountNumber() {
        return this.participantAccountNumber;
    }

    /**
	 * @return the participantInvoicePrintDto
	 */
	public ParticipantInvoicePrintDto getParticipantInvoicePrintDto() {
		return this.participantInvoicePrintDto;
	}

    public AccountingOriginalInvoiceDetailDto getRejectoriginal() {
        return this.rejectoriginal;
    }

    public String getRejectStage() {
        return this.rejectStage;
    }

    public String getsFICode() {
        return this.sFICode;
    }

    public Boolean getSisIndicator() {
        return this.sisIndicator;
    }

    public void setAccInvoiceAwbs(final Set<AccountingInvoiceAWBDto> pAccInvoiceAwbs) {
        this.accInvoiceAwbs = pAccInvoiceAwbs;
    }

    public void setAccInvoiceBillingschedule(final AccountingInvoiceBillingScheduleDto accInvoiceBillingschedule) {
        this.accInvoiceBillingschedule = accInvoiceBillingschedule;
    }

	public void setAccInvoiceSummary(final AccountingInvoiceSummaryDto accInvoiceSummary) {
        this.accInvoiceSummary = accInvoiceSummary;
    }

	/**
	 * @param accountingInvoiceDCMs the accountingInvoiceDCMs to set
	 */
	public void setAccountingInvoiceDCMs(final 
			Set<AccountingInvoiceDCMDto> accountingInvoiceDCMs) {
		this.accountingInvoiceDCMs = accountingInvoiceDCMs;
	}

    public void setAccountType(final String accountType) {
		this.accountType = accountType;
	}

    public void setBillingCarrier(final String billingCarrier) {
        this.billingCarrier = ContractUtility.convertToUpperCase(billingCarrier);
    }

    public void setBillingCurrency(final String billingCurrency) {
        this.billingCurrency = ContractUtility.convertToUpperCase(billingCurrency);
    }

    public void setBillingoriginal(final AccountingOriginalInvoiceDetailDto billingoriginal) {
        this.billingoriginal = billingoriginal;
    }

    public void setCountry(final String country) {
		this.country = country;
	}

    public void setCreditoriginal(final AccountingOriginalInvoiceDetailDto creditoriginal) {
        this.creditoriginal = creditoriginal;
    }

    public void setGenerateInvoice(final String generateInvoice) {
        this.generateInvoice = generateInvoice;
    }

    public void setHostCurrencyCode(final String hostCurrencyCode) {
		this.hostCurrencyCode = hostCurrencyCode;
	}

    public void setIataAccountNumber(final String iataAccountNumber) {
		this.iataAccountNumber = iataAccountNumber;
	}

    /**
     * @param interlineInwardBillingFileDetailDto the interlineInwardBillingFileDetailDto to set
     */
    public void setInterlineInwardBillingFileDetailDto(final 
                InterlineInwardBillingFileDetailDto interlineInwardBillingFileDetailDto) {
        this.interlineInwardBillingFileDetailDto = interlineInwardBillingFileDetailDto;
    }

    /**
     * @param invoiceAwbDtos the invoiceAwbDtos to set
     */
    public void setInvoiceAwbDtos(final List<AccountingInvoiceAWBDto> invoiceAwbDtos) {
        this.invoiceAwbDtos = invoiceAwbDtos;
    }

    public void setInvoiceDate(final Date invoiceDate) {
        this.invoiceDate = ContractUtility.getClonedDate(invoiceDate);
    }

    public void setInvoiceFrequency(final String invoiceFrequency) {
        this.invoiceFrequency = invoiceFrequency;
    }

    public void setInvoiceNumber(final String invoiceNumber) {
        this.invoiceNumber = ContractUtility.convertToUpperCase(invoiceNumber);
    }

    public void setInvoicePaidAmount(final BigDecimal invoicePaidAmount) {
			this.invoicePaidAmount = invoicePaidAmount;
	}
    
    public void setInvoicePaymentStatus(final PaymentStatusType invoicePaymentStatus) {
		this.invoicePaymentStatus = invoicePaymentStatus;
	}

    public void setInvoiceStatus(final String pInvoiceStatus) {
        this.invoiceStatus = ContractUtility.convertToUpperCase(pInvoiceStatus);
    }

	public void setInwardInvoiceStatus(final InwardInvoiceStatus pInwardInvoiceStatus) {
        this.inwardInvoiceStatus = pInwardInvoiceStatus;
    }

	public void setLastModifiedDate(final Date pLastModifiedDate) {
		this.lastModifiedDate = pLastModifiedDate;
	}

	public void setModeInvoice(final String pModeInvoice) {
        this.modeInvoice = pModeInvoice;
    }

	public void setOId(final Long pOId) {
        this.oId = pOId;
    }

	public void setParticipantAccountNumber(final String pParticipantAccountNumber) {
        this.participantAccountNumber = pParticipantAccountNumber;
    }

	/**
	 * @param pParticipantInvoicePrintDto the participantInvoicePrintDto to set
	 */
	public void setParticipantInvoicePrintDto(final 
			ParticipantInvoicePrintDto pParticipantInvoicePrintDto) {
		this.participantInvoicePrintDto = pParticipantInvoicePrintDto;
	}

	public void setRejectoriginal(final AccountingOriginalInvoiceDetailDto pRejectoriginal) {
        this.rejectoriginal = pRejectoriginal;
    }

	public void setRejectStage(final String pRejectStage) {
        this.rejectStage = pRejectStage;
    }

	public void setsFICode(final String pSFICode) {
        this.sFICode = pSFICode;
    }

	public void setSisIndicator(final Boolean pSisIndicator) {
        this.sisIndicator = pSisIndicator;
	}

	/**
	 * @return the receivableStatusType
	 */
	public ReceivableStatusType getReceivableStatusType() {
		return receivableStatusType;
	}

	/**
	 * @param receivableStatusType the receivableStatusType to set
	 */
	public void setReceivableStatusType(ReceivableStatusType receivableStatusType) {
		this.receivableStatusType = receivableStatusType;
	}

	/**
	 * @return the creditInvoice
	 */
	public Boolean getCreditInvoice() {
		return creditInvoice;
	}

	/**
	 * @param creditInvoice the creditInvoice to set
	 */
	public void setCreditInvoice(Boolean creditInvoice) {
		this.creditInvoice = creditInvoice;
	}
	
	public String getInvoiceEmailStatus() {
		return invoiceEmailStatus;
	}

	public void setInvoiceEmailStatus(String invoiceEmailStatus) {
		this.invoiceEmailStatus = invoiceEmailStatus;
	}

	/**
	 * @return the printIndicator
	 */
	public Boolean getPrintIndicator() {
		return printIndicator;
	}

	/**
	 * @param printIndicator the printIndicator to set
	 */
	public void setPrintIndicator(Boolean printIndicator) {
		this.printIndicator = printIndicator;
	}
	
	/**
	 * @return the specificAirline
	 */
	public String getSpecificAirline() {
		return specificAirline;
	}

	/**
	 * @param specificAirline the specificAirline to set
	 */
	public void setSpecificAirline(String specificAirline) {
		this.specificAirline = specificAirline;
	}
}