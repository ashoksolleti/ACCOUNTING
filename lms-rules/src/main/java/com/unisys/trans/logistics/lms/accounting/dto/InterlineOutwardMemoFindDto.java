package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.Date;
import java.util.Set;

import com.unisys.trans.logistics.lms.accounting.dto.constants.ApprovalStatus;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ClearingHouseType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.MemoStatus;
import com.unisys.trans.logistics.lms.accounting.dto.constants.MemoType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class InterlineOutwardMemoFindDto extends PersistenceObjectDto {
    private static final long serialVersionUID = 1L;
    private Long OId;
    private MemoType memoType;
    private String memoBMCMNumber;
    private String billedCarrier;
    private Date fromDate;
    private Date toDate;
    private ApprovalStatus approvalStatus;
    private MemoStatus memoStatus;
    private AirWaybillNumberDto airWaybillNumber;
    private ClearingHouseType clearingHouseType;
    private String specificAirline;
    private String carrier;

	private String billingYearMonth;

	private Integer billingPeriod;

	private String invoiceNumber;
	
	private Set<String> carriers;

    private String memoNumber;

    public Long getOId() {
        return OId;
    }

    public void setOId(Long oId) {
        OId = oId;
    }

    public MemoType getMemoType() {
        return memoType;
    }

    public void setMemoType(MemoType memoType) {
        this.memoType = memoType;
    }
    
	/**
     * @return the memoBMCMNumber
     */
    public String getMemoBMCMNumber() {
        return memoBMCMNumber;
    }

    /**
     * @param memoBMCMNumber the memoBMCMNumber to set
     */
    public void setMemoBMCMNumber(String memoBMCMNumber) {
        this.memoBMCMNumber = memoBMCMNumber;
    }

    public String getBilledCarrier() {
        return billedCarrier;
    }

    public void setBilledCarrier(String billedCarrier) {
        this.billedCarrier = (billedCarrier != null) ? billedCarrier.toUpperCase() : billedCarrier;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public ApprovalStatus getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(ApprovalStatus approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public MemoStatus getMemoStatus() {
        return memoStatus;
    }

    public void setMemoStatus(MemoStatus memoStatus) {
        this.memoStatus = memoStatus;
    }

	public AirWaybillNumberDto getAirWaybillNumber() {
		if (this.airWaybillNumber == null) {
			this.airWaybillNumber = new AirWaybillNumberDto();

		}
		return airWaybillNumber;
	}

	public void setAirWaybillNumber(AirWaybillNumberDto airWaybillNumber) {
		this.airWaybillNumber = airWaybillNumber;
	}

	public ClearingHouseType getClearingHouseType() {
		return clearingHouseType;
	}

	public void setClearingHouseType(ClearingHouseType clearingHouseType) {
		this.clearingHouseType = clearingHouseType;
	}

	public String getSpecificAirline() {
		return specificAirline;
	}

	public void setSpecificAirline(String specificAirline) {
		this.specificAirline = specificAirline;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = (carrier != null) ? carrier.toUpperCase() : carrier;
	}

	public String getBillingYearMonth() {
		return billingYearMonth;
	}

	public void setBillingYearMonth(String billingYearMonth) {
		this.billingYearMonth = billingYearMonth;
	}

	public Integer getBillingPeriod() {
		return billingPeriod;
	}

	public void setBillingPeriod(Integer billingPeriod) {
		this.billingPeriod = billingPeriod;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = (invoiceNumber != null) ? invoiceNumber.toUpperCase() : invoiceNumber;
	}

	public Set<String> getCarriers() {
		return carriers;
	}

	public void setCarriers(Set<String> carriers) {
		this.carriers = carriers;
	}

    public String getMemoNumber() {
        return memoNumber;
    }

    public void setMemoNumber(String memoNumber) {
    	this.memoNumber = (memoNumber != null) ? memoNumber.toUpperCase() : memoNumber;
    }
    
}
