package com.unisys.trans.logistics.lms.accounting.dto;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import com.unisys.trans.logistics.lms.accounting.dto.constants.AccountingPeriodType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ActionType;
import com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

/**
 * @author SeramRaK
 *
 */

public class AccountingPeriodDto extends PersistenceObjectDto  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5898418926001069065L;

	

	private Long oId=0l;

	private String accountingMonth;

	private String accountingPeriodType;

	private Integer financialYear;
	
	

	private Date closingDate;

	private Date periodStartDate;

	private Date periodEndDate;
	
	 /**
     * Attribute to hold <code>action</code> property.
     */
    private ActionType action;
    
    
    private Integer dtoVersion=0;
    /**
     * Attribute to hold <code>error</code> property.
     */
    private boolean error;
    
    private boolean download;

	private String specificAirline;
	
	public Long getOId() {
		return oId;
	}

	public void setOId(Long oId) {
		this.oId = oId;
	}

	public String getAccountingMonth() {
		if(accountingMonth!=null)
		{
			accountingMonth=accountingMonth.toUpperCase();
		}
		return accountingMonth;
	}

	public void setAccountingMonth(String accountingMonth) {
		this.accountingMonth = accountingMonth;
	}

	public String getAccountingPeriodType() {
		return accountingPeriodType;
	}

	public void setAccountingPeriodType(String accountingPeriodType) {
		this.accountingPeriodType = accountingPeriodType;
	}

	public Integer getFinancialYear() {
		return financialYear;
	}

	public void setFinancialYear(Integer financialYear) {
		this.financialYear = financialYear;
	}

	public Date getClosingDate() {
		return closingDate;
	}

	public void setClosingDate(Date closingDate) {
		this.closingDate = closingDate;
	}

	public Date getPeriodStartDate() {
		return periodStartDate;
	}

	public void setPeriodStartDate(Date periodStartDate) {
		this.periodStartDate = periodStartDate;
	}

	public Date getPeriodEndDate() {
		return periodEndDate;
	}

	public void setPeriodEndDate(Date periodEndDate) {
		this.periodEndDate = periodEndDate;
	}

	public ActionType getAction() {
		return action;
	}

	public void setAction(ActionType action) {
		this.action = action;
	}

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	public boolean isDownload() {
		return download;
	}

	public void setDownload(boolean download) {
		this.download = download;
	}

	

	public String getFinancialYearString() {
		if(financialYear!=null)
		{
			return financialYear.toString();
		}else
		{
			return "";
		}	
	}

	public void setFinancialYearString(String financialYearString) {
		if(financialYearString!=null)
		{
			try {
				this.financialYear=Integer.parseInt(financialYearString);
			} catch (NumberFormatException e) {
				this.financialYear=0;
			}
		}else
		{
			this.financialYear=0;
		}	
	}
	
	
	

	public Integer getDtoVersion() {
		return dtoVersion;
	}

	public void setDtoVersion(Integer dtoVersion) {
		this.dtoVersion = dtoVersion;
	}

	public String getSpecificAirline() {
		return specificAirline;
	}

	public void setSpecificAirline(String specificAirline) {
		this.specificAirline = specificAirline;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((accountingMonth == null) ? 0 : accountingMonth.hashCode());
		result = prime
				* result
				+ ((accountingPeriodType == null) ? 0 : accountingPeriodType
						.hashCode());
		result = prime * result
				+ ((closingDate == null) ? 0 : closingDate.hashCode());
		result = prime * result
				+ ((financialYear == null) ? 0 : financialYear.hashCode());
		result = prime * result
				+ ((oId == null) ? 0 : oId.hashCode());
		result = prime * result
				+ ((dtoVersion == null) ? 0 : dtoVersion.hashCode());
		result = prime * result
				+ ((periodEndDate == null) ? 0 : periodEndDate.hashCode());
		result = prime * result
				+ ((periodStartDate == null) ? 0 : periodStartDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountingPeriodDto other = (AccountingPeriodDto) obj;
		if (accountingMonth == null) {
			if (other.accountingMonth != null)
				return false;
		} else if (!accountingMonth.equals(other.accountingMonth))
			return false;
		if (oId == null) {
			if (other.oId != null)
				return false;
		} else if (!oId.equals(other.oId))
			return false;
		if (dtoVersion == null) {
			if (other.dtoVersion != null)
				return false;
		} else if (!dtoVersion.equals(other.dtoVersion))
			return false;
		if (accountingPeriodType == null) {
			if (other.accountingPeriodType != null)
				return false;
		} else if (!accountingPeriodType.equals(other.accountingPeriodType))
			return false;
		if (closingDate == null) {
			if (other.closingDate != null)
				return false;
		} else if (!closingDate.equals(other.closingDate))
			return false;
		if (financialYear == null) {
			if (other.financialYear != null)
				return false;
		} else if (!financialYear.equals(other.financialYear))
			return false;
		if (periodEndDate == null) {
			if (other.periodEndDate != null)
				return false;
		} else if (!periodEndDate.equals(other.periodEndDate))
			return false;
		if (periodStartDate == null) {
			if (other.periodStartDate != null)
				return false;
		} else if (!periodStartDate.equals(other.periodStartDate))
			return false;
		return true;
	}

 
	
	/**
     * Creates the String representation of <code>InterlineAgreements</code>.
     * <p>
     * This will return the String representation based on InterlineAgreements.
     * <p>
     * 
     * @return the String representation of <code>InterlineAgreements</code>.
     */
    public String toString() {
        String csvString = new String();

        if (this.getAction()!=null && ActionType.FIND.equals(this.getAction())) {

            csvString = this.buildFindCSVString();
        }
        else {
            csvString = this.buildDtoCSVString();
        }

        return csvString;

    }

    /**
     * Creates the String representation of <code>Interline Prorate</code>.
     * <p>
     * This will return the String representation based on Interline Prorate.
     * <p>
     * 
     * @return the String representation of <code>Interline Prorate</code>.
     */
    private String buildFindCSVString() {
        final StringBuffer csvString = new StringBuffer();

       
        
        csvString.append(this.prefixSuffixByQuotes(this.getAccountingMonth()));
        
        if(this.getFinancialYear()!=null)
        {
        	csvString.append(this.prefixSuffixByQuotes(this.getFinancialYear().toString()));
        }
        
        csvString.append(this.prefixSuffixByQuotes(this.getAccountingPeriodTypeDescription(this.getAccountingPeriodType())));
        
        return csvString.toString();
    }

    /**
     * Creates the String representation of <code>Interline Proviso</code>.
     * <p>
     * This will return the String representation based on Interline Proviso.
     * <p>
     * 
     * @return the String representation of <code>Interline Proviso</code>.
     */
    private String buildDtoCSVString() {
        final StringBuffer csvString = new StringBuffer();

        
        
        csvString.append(this.prefixSuffixByQuotes(this.getAccountingMonth()));
        
        if(this.getFinancialYear()!=null)
        {
        	csvString.append(this.prefixSuffixByQuotes(this.getFinancialYear().toString()));
        }
        
        csvString.append(this.prefixSuffixByQuotes(this.getFormatDate(getPeriodStartDate())));
        csvString.append(this.prefixSuffixByQuotes(this.getFormatDate(getPeriodEndDate())));
        csvString.append(this.prefixSuffixByQuotes(this.getFormatDate(getClosingDate())));
        
        csvString.append(this.prefixSuffixByQuotes(this.getAccountingPeriodTypeDescription(this.getAccountingPeriodType())));
        
        return csvString.toString();
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

	
    public String getAccountingPeriodTypeDescription(String key)
    {
    	if(key!=null)
    	{
    		return AccountingPeriodType.valueOf(key).getType();
    	}else
    	{
    		return "";
    	}
    	
    }
	
    public String getFormatDate(Date date)
    {
    	
    	String value="";
    	if(date!=null)
    	{
    		 SimpleDateFormat dateFormat = new SimpleDateFormat();
             dateFormat.setLenient(false);
             dateFormat.setTimeZone(TimeZone.getTimeZone(FrameworkConstants.GMT));
             dateFormat.applyPattern("ddMMMyyyy");
    		 value=dateFormat.format(date).toUpperCase();
    	}	
    	if(value!=null)
    	{
    		value=value.toUpperCase();
    	}
      return value;	
    }
	
}
