package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.Date;
import java.util.Set;

import com.unisys.trans.logistics.lms.accounting.dto.constants.BillingScheduleIndicatorType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ClearingHouseType;
import com.unisys.trans.logistics.lms.framework.constants.InvoiceFrequencyType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * The persistent class for the ACC_INVOICE_BILLINGSCHEDULE database table.
 * 
 */
public class AccountingInvoiceBillingScheduleDto extends PersistenceObjectDto {
    private static final long serialVersionUID = 1L;

    private Set<AccountingInvoiceDetailDto> accountingInvoiceDetails;

    private Date billingEnddate;

    private String billingIdentifier;

    private AccountingOriginalInvoiceDetailDto billingoriginal;

    private Integer billingPeriod;

    private BillingScheduleIndicatorType billingScheduleIndicator;

    private String billingScheduleName;

    private String billingScheduleType;
    
    private InvoiceFrequencyType billingScheduleFrequency;   

    private Date billingStartdate;

    private String billingYearMonth;

    private ClearingHouseType clearingHouseType;

    private AccountingOriginalInvoiceDetailDto creditoriginal;

    private AccountingInvoiceDetailDto invoiceDetailDto;

    private Long oId;

    private AccountingOriginalInvoiceDetailDto rejectoriginal;
    
    private String specificAirline;

	private String cassFileName;

	private byte[] cassFile;
	
	private boolean enableOnProcess = false;
	
	private boolean onProcess=false;	
	
    
	public boolean isOnProcess() {
		return onProcess;
	}

	public void setOnProcess(boolean onProcess) {
		this.onProcess = onProcess;
	}

	public boolean isEnableOnProcess() {
		return enableOnProcess;
	}

	public void setEnableOnProcess(boolean enableOnProcess) {
		this.enableOnProcess = enableOnProcess;
	}

	public String getCassFileName() {
		return cassFileName;
	}

	public void setCassFileName(String cassFileName) {
		this.cassFileName = cassFileName;
	}

	public byte[] getCassFile() {
		return cassFile;
	}

	public void setCassFile(byte[] cassFile) {
		this.cassFile = cassFile;
	}

    public AccountingInvoiceBillingScheduleDto() {
    }

    public Set<AccountingInvoiceDetailDto> getAccInvoiceDetails() {
        return this.accountingInvoiceDetails;
    }

    public Date getBillingEnddate() {
        return ContractUtility.getClonedDate(this.billingEnddate);
    }

    public String getBillingIdentifier() {
        return this.billingIdentifier;
    }

    public AccountingOriginalInvoiceDetailDto getBillingoriginal() {
        return billingoriginal;
    }

    public Integer getBillingPeriod() {
        return this.billingPeriod;
    }

    public BillingScheduleIndicatorType getBillingScheduleIndicator() {
        return this.billingScheduleIndicator;
    }

    public String getBillingScheduleName() {
        return this.billingScheduleName;
    }

    public String getBillingScheduleType() {
        return this.billingScheduleType;
    }

    public Date getBillingStartdate() {
        return ContractUtility.getClonedDate(this.billingStartdate);
    }

    public String getBillingYearMonth() {
        return this.billingYearMonth;
    }

    public ClearingHouseType getClearingHouseType() {
        return this.clearingHouseType;
    }

    public AccountingOriginalInvoiceDetailDto getCreditoriginal() {
        return this.creditoriginal;
    }

    /**
     * @return the invoiceDetailDto
     */
    public AccountingInvoiceDetailDto getInvoiceDetailDto() {
        return this.invoiceDetailDto;
    }

    @Override
    public Long getOId() {
        return this.oId;
    }

    public AccountingOriginalInvoiceDetailDto getRejectoriginal() {
        return this.rejectoriginal;
    }

    public void setAccInvoiceDetails(final Set<AccountingInvoiceDetailDto> pAccountingInvoiceDetails) {
        this.accountingInvoiceDetails = pAccountingInvoiceDetails;
    }

    public void setBillingEnddate(final Date pBillingEnddate) {
        this.billingEnddate = ContractUtility.getClonedDate(pBillingEnddate);
    }

    public void setBillingIdentifier(final String pBillingIdentifier) {
        this.billingIdentifier = pBillingIdentifier;
    }

    public void setBillingoriginal(final AccountingOriginalInvoiceDetailDto pBillingoriginal) {
        this.billingoriginal = pBillingoriginal;
    }

    public void setBillingPeriod(final Integer pBillingPeriod) {
        this.billingPeriod = pBillingPeriod;
    }

    public void setBillingScheduleIndicator(final BillingScheduleIndicatorType pBillingScheduleIndicator) {
        this.billingScheduleIndicator = pBillingScheduleIndicator;
    }

    public void setBillingScheduleName(final String pBillingScheduleName) {
        this.billingScheduleName = pBillingScheduleName;
    }

    public void setBillingScheduleType(final String pBillingScheduleType) {
        this.billingScheduleType = pBillingScheduleType;
    }

    public void setBillingStartdate(final Date pBillingStartdate) {
        this.billingStartdate = ContractUtility.getClonedDate(pBillingStartdate);
    }

    public void setBillingYearMonth(final String pBillingYearMonth) {
        this.billingYearMonth = pBillingYearMonth;
    }

    public void setClearingHouseType(final ClearingHouseType pClearingHouseType) {
        this.clearingHouseType = pClearingHouseType;
    }

    public void setCreditoriginal(final AccountingOriginalInvoiceDetailDto pCreditoriginal) {
        this.creditoriginal = pCreditoriginal;
    }

    /**
     * @param pInvoiceDetailDto the invoiceDetailDto to set
     */
    public void setInvoiceDetailDto(final AccountingInvoiceDetailDto pInvoiceDetailDto) {
        this.invoiceDetailDto = pInvoiceDetailDto;
    }

    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    public void setRejectoriginal(final AccountingOriginalInvoiceDetailDto pRejectoriginal) {
        this.rejectoriginal = pRejectoriginal;
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
    
	public InvoiceFrequencyType getBillingScheduleFrequency() {
		return billingScheduleFrequency;
	}

	public void setBillingScheduleFrequency(InvoiceFrequencyType billingScheduleFrequency) {
		this.billingScheduleFrequency = billingScheduleFrequency;
	}

}