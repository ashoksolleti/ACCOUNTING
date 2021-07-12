/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
/**
 * @author SaifAhmad
 */

package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

import java.util.List;
import java.sql.Date;
import java.util.ArrayList;

/**
 * <code>InterlineOutwardBillingFindRequest</code> contains all the attributes
 * which are required for processing the retrieve request from user.
 * <p>
 * This contains the following attributes:<br>
 * <ul>
 * <code>
 * <li>serialVersionUID
 * <li>interlineOutwardBillingDto
 * <li>interlineOutwardBillingSlidingRatesDto
 * </code>
 * </ul>
 *
 */

public class InterlineOutwardBillingFindRequest extends AbstractRequest
{

	private static final long serialVersionUID = 1L;
	
	private InterlineOutwardBillingDto interlineOutwardBillingDto =new InterlineOutwardBillingDto();
	
      private List<InterlineOutwardBillingDto> interlineOutwardBillingDtoList=new ArrayList<InterlineOutwardBillingDto>();
      
      private String clearingHouse;
		
		private String accountingMonth;

		private String specificAirline;
		
		private Date invoiceGenerationDate;
		
		
		
    

	public Date getInvoiceGenerationDate() {
			return invoiceGenerationDate;
		}

		public void setInvoiceGenerationDate(Date invoiceGenerationDate) {
			this.invoiceGenerationDate = invoiceGenerationDate;
		}

	

	public String getClearingHouse() {
			return clearingHouse;
		}

		public void setClearingHouse(String clearingHouse) {
			this.clearingHouse = clearingHouse;
		}

		public String getAccountingMonth() {
			return accountingMonth;
		}

		public void setAccountingMonth(String accountingMonth) {
			this.accountingMonth = accountingMonth;
		}

	/**
	 * @param interlineOutwardBillingDto
	 */
	public InterlineOutwardBillingDto getInterlineOutwardBillingDto() {
		return interlineOutwardBillingDto;
	}

	/**
	 * @param interlineOutwardBillingDto the interlineOutwardBillingDto to set
	 */
	public void setInterlineOutwardBillingDto(InterlineOutwardBillingDto interlineOutwardBillingDto) {
		this.interlineOutwardBillingDto = interlineOutwardBillingDto;
	}

	            
        /**
         * @return the interlineOutwardBillingDtoList
         */
        public List<InterlineOutwardBillingDto> getInterlineOutwardBillingDtoList() {
                return interlineOutwardBillingDtoList;
        }
    
        /**
         * @param interlineOutwardBillingDtoList the interlineOutwardBillingDtoList to set
         */
        public void setInterlineOutwardBillingDtoList(List<InterlineOutwardBillingDto> interlineOutwardBillingDtoList) {
                this.interlineOutwardBillingDtoList = interlineOutwardBillingDtoList;
        }
        
        public String getSpecificAirline() {
    		return this.specificAirline;
    	}

    	/**
    	 * @param specificAirline the specificAirline to set
    	 */
    	public void setSpecificAirline(final String specificAirline) {
    		this.specificAirline = specificAirline;
    	}   
	
}
