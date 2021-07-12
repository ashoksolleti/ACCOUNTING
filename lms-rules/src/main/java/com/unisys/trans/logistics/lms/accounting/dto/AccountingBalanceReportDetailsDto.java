package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.Date;

import com.unisys.trans.logistics.lms.accounting.dto.constants.ActionType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ReportConsolidationTypes;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.DateUtility;

public class AccountingBalanceReportDetailsDto extends PersistenceObjectDto {

	private static final long serialVersionUID = 1L;
	private ActionType actionType;
	private Long oId = 0l;
	private String airWaybillNumber;
	private String invoiceNumber;
	private String flightNumber;
	private String accountingMonth;
	private Integer financialYear;
	private Date accountingDate;
	private AirWaybillNumberDto airWaybillNumberDto = new AirWaybillNumberDto();
	private String glAccountName;
	private String glAccountNumber;
	private String glAccountNumberAsString;
	private BigDecimal debitCurrency;
	private BigDecimal creditCurrency;
	private ReportConsolidationTypes reportConsolidationType;
	private Date accountStartDate;
	private Date accountEndDate;
	private static final String EMPTY_STRING = "";
	private String memoNumber;
	private AccountingAirWaybillDto accAirWayBillDto;
	private String specificAirline;
	private String awbCreationDate;
	public String getSpecificAirline() {
		return specificAirline;
	}

	public void setSpecificAirline(String specificAirline) {
		this.specificAirline = specificAirline;
	}
	
	public String getMemoNumber() {
		return memoNumber;
	}

	public void setMemoNumber(String memoNumber) {
		this.memoNumber = memoNumber;
	}

	
	public AccountingAirWaybillDto getAccAirWayBillDto() {
		return accAirWayBillDto;
	}

	public void setAccAirWayBillDto(AccountingAirWaybillDto accAirWayBillDto) {
		this.accAirWayBillDto = accAirWayBillDto;
	}

	/**
	 * @return the reportConsolidationType
	 */
	public ReportConsolidationTypes getReportConsolidationType() {
		return reportConsolidationType;
	}

	/**
	 * @param reportConsolidationType the reportConsolidationType to set
	 */
	public void setReportConsolidationType(
			ReportConsolidationTypes reportConsolidationType) {
		this.reportConsolidationType = reportConsolidationType;
	}

	/**
	 * @return the actionType
	 */
	public ActionType getActionType() {
		return actionType;
	}

	/**
	 * @param actionType the actionType to set
	 */
	public void setActionType(ActionType actionType) {
		this.actionType = actionType;
	}

	/**
	 * @return the airWaybillNumberDto
	 */
	public AirWaybillNumberDto getAirWaybillNumberDto() {
		if(airWaybillNumber!=null && airWaybillNumber.length()>11){
			String a,b;
			a=airWaybillNumber.substring(0, 3);
			b=airWaybillNumber.substring(4);
			airWaybillNumberDto.setAirlineCodeNbr(a);
			airWaybillNumberDto.setShipmentReference(b);
		}
		return airWaybillNumberDto;
	}

	/**
	 * @param airWaybillNumberDto the airWaybillNumberDto to set
	 */
	public void setAirWaybillNumberDto(AirWaybillNumberDto airWaybillNumberDto) {
		this.airWaybillNumberDto = airWaybillNumberDto;
	}

	/**
	 * @return the accountingDate
	 */
	public Date getAccountingDate() {
		return accountingDate;
	}

	/**
	 * @param accountingDate
	 *            the accountingDate to set
	 */
	public void setAccountingDate(Date accountingDate) {
		this.accountingDate = accountingDate;
	}


	/**
	 * @return the airWaybillNumber
	 */
	public String getAirWaybillNumber() {
		if(airWaybillNumberDto != null){
			if(airWaybillNumberDto.getAirlineCodeNbr()!=null && airWaybillNumberDto.getShipmentReference()!=null){
				airWaybillNumber = airWaybillNumberDto.getAirlineCodeNbr()+"-"+airWaybillNumberDto.getShipmentReference();
			}
		}
		return airWaybillNumber;
	}

	/**
	 * @param airWaybillNumber
	 *            the airWaybillNumber to set
	 */
	public void setAirWaybillNumber(String airWaybillNumber) {
		this.airWaybillNumber = airWaybillNumber;
	}

	/**
	 * @return the invoiceNumber
	 */
	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	/**
	 * @param invoiceNumber
	 *            the invoiceNumber to set
	 */
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	/**
	 * @return the flightNumber
	 */
	public String getFlightNumber() {
		return flightNumber;
	}

	/**
	 * @param flightNumber
	 *            the flightNumber to set
	 */
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	/**
	 * @return the accountingMonth
	 */
	public String getAccountingMonth() {
		if(accountingMonth!=null && !accountingMonth.isEmpty()){
			accountingMonth=accountingMonth.toUpperCase();
		}
		return accountingMonth;
	}

	/**
	 * @param accountingMonth
	 *            the accountingMonth to set
	 */
	public void setAccountingMonth(String accountingMonth) {
		this.accountingMonth = accountingMonth;
	}

	/**
	 * @return the financialYear
	 */
	public Integer getFinancialYear() {
		return financialYear;
	}

	/**
	 * @param financialYear
	 *            the financialYear to set
	 */
	public void setFinancialYear(Integer financialYear) {
		this.financialYear = financialYear;
	}

	/**
	 * @return the oId
	 */
	public Long getoId() {
		return oId;
	}

	/**
	 * @param oId
	 *            the oId to set
	 */
	public void setoId(Long oId) {
		this.oId = oId;
	}

	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return this.oId;
	}

	public String getGlAccountName() {
		return glAccountName;
	}

	public void setGlAccountName(String glAccountName) {
		this.glAccountName = glAccountName;
	}

	
	public String getGlAccountNumber() {
		return glAccountNumber;
	}

	public void setGlAccountNumber(String glAccountNumber) {
		this.glAccountNumber = glAccountNumber;
	}

	public String getGlAccountNumberAsString() {
			if(glAccountNumber!=null){
				String a,b;
				a=glAccountNumber.substring(0,4);
				b=glAccountNumber.substring(4);
				glAccountNumberAsString = a+" "+b;
		}
		return glAccountNumberAsString;
	}

	public void setGlAccountNumberAsString(String glAccountNumberAsString) {
		this.glAccountNumberAsString = glAccountNumberAsString;
	}

	public BigDecimal getDebitCurrency() {
		return debitCurrency;
	}

	public void setDebitCurrency(BigDecimal debitCurrency) {
		this.debitCurrency = debitCurrency;
	}

	public BigDecimal getCreditCurrency() {
		return creditCurrency;
	}

	public void setCreditCurrency(BigDecimal creditCurrency) {
		this.creditCurrency = creditCurrency;
	}
	
	/**
	 * @return the accountStartDate
	 */
	public Date getAccountStartDate() {
		return accountStartDate;
	}

	/**
	 * @param accountStartDate the accountStartDate to set
	 */
	public void setAccountStartDate(Date accountStartDate) {
		this.accountStartDate = accountStartDate;
	}

	/**
	 * @return the accountEndDate
	 */
	public Date getAccountEndDate() {
		return accountEndDate;
	}

	/**
	 * @param accountEndDate the accountEndDate to set
	 */
	public void setAccountEndDate(Date accountEndDate) {
		this.accountEndDate = accountEndDate;
	}

	/**
	 * @return the awbCreationDate
	 */
	public String getAwbCreationDate() {
		return this.awbCreationDate;
	}

	/**
	 * @param awbCreationDate the awbCreationDate to set
	 */
	public void setAwbCreationDate(final String awbCreationDate) {
		this.awbCreationDate = awbCreationDate;
	}

	/**
     * prefixes and suffixes a given string with open quotes.
     * 
     * @param pString the new value of the <code>value</code>.
     * 
     * @return aModifiedString the new value of the <code>aModifiedString</code>.
     * 
     * 
     */
    private String prefixSuffixByQuotes(final String pString) {
        final String aQUOTATION = "\"";
        final String aCOMMA = ",";

        final StringBuffer aModifiedString = new StringBuffer();
        aModifiedString.append(aQUOTATION);
        aModifiedString.append(pString);
        aModifiedString.append(aQUOTATION);
        aModifiedString.append(aCOMMA);

        return aModifiedString.toString();
    }
    
    public String toString() {
    	final StringBuffer csvString = new StringBuffer();
    	if(this.actionType!=null && this.actionType.equals(ActionType.FIND)){
    		if (this.getAccountingMonth() != null) {
                csvString.append(this.prefixSuffixByQuotes(this.getAccountingMonth()));
            }
            else {
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }
    		if (this.getFinancialYear() != null) {
                csvString.append(this.prefixSuffixByQuotes(this.getFinancialYear().toString()));
            }
            else {
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }
    		if (this.getAccountStartDate() != null) {
                csvString.append(this.prefixSuffixByQuotes(DateUtility.convertToGMTDate(this.getAccountStartDate())));
            }
            else {
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }
    		if (this.getAccountEndDate() != null) {
                csvString.append(this.prefixSuffixByQuotes(DateUtility.convertToGMTDate(this.getAccountEndDate())));
            }
            else {
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }
    	}
    	else{
    		if(this.reportConsolidationType.equals(ReportConsolidationTypes.AWB)){
        		if (this.getAirWaybillNumber() != null) {
                    csvString.append(this.prefixSuffixByQuotes(this.getAirWaybillNumber()));
                }
                else {
                    csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
                }
			    if (this.getAwbCreationDate() != null) {
				    csvString.append(this.prefixSuffixByQuotes(this.getAwbCreationDate()));
			    }
			    else {
				    csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
			    }
        		if (this.getGlAccountNumber() != null) {
                    csvString.append(this.prefixSuffixByQuotes(this.getGlAccountNumber()));
                }
                else {
                    csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
                }
        		if (this.getGlAccountName() != null) {
                    csvString.append(this.prefixSuffixByQuotes(this.getGlAccountName()));
                }
                else {
                    csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
                }
        	}
    		if(this.reportConsolidationType.equals(ReportConsolidationTypes.GLACC)){
    			if (this.getGlAccountNumberAsString() != null) {
                    csvString.append(this.prefixSuffixByQuotes(this.getGlAccountNumberAsString()));
                }
                else {
                    csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
                }
        		if (this.getGlAccountName() != null) {
                    csvString.append(this.prefixSuffixByQuotes(this.getGlAccountName()));
                }
                else {
                    csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
                }
    		}
    		if(this.reportConsolidationType.equals(ReportConsolidationTypes.ACCPERIOD)){
    			if (this.getAccountingMonth() != null) {
                    csvString.append(this.prefixSuffixByQuotes(this.getAccountingMonth()));
                }
                else {
                    csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
                }
        		if (this.getFinancialYear() != null) {
                    csvString.append(this.prefixSuffixByQuotes(this.getFinancialYear().toString()));
                }
                else {
                    csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
                }
    		}
    		if (this.getDebitCurrency() != null) {
                csvString.append(this.prefixSuffixByQuotes(this.getDebitCurrency().toString()));
            }
            else {
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }
    		if (this.getCreditCurrency() != null) {
                csvString.append(this.prefixSuffixByQuotes(this.getCreditCurrency().toString()));
            }
            else {
                csvString.append(this.prefixSuffixByQuotes(EMPTY_STRING));
            }
    	}
		return csvString.toString();
    }
}