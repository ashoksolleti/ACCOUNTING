/**
 *
 */
package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author KV5
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class BillingSchedulesResponse extends AbstractResponse{
	/**
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;
    
    private CASSInvoiceFileDetailsDto cASSInvoiceFileDetailsDto;
    
	private List<BillingSchedulesDto> billingSchedulesDtos;
	
	private List<AccountingInvoiceDetailDto> accountingInvoiceDetailDtos;

	public List<BillingSchedulesDto> getBillingSchedules() {
		return billingSchedulesDtos;
	}

	public void setBillingSchedules(
			List<BillingSchedulesDto> billingSchedulesDtos) {
		this.billingSchedulesDtos = billingSchedulesDtos;
	}

	public List<AccountingInvoiceDetailDto> getAccountingInvoiceDetailDtos() {
		return accountingInvoiceDetailDtos;
	}

	public void setAccountingInvoiceDetailDtos(List<AccountingInvoiceDetailDto> accountingInvoiceDetailDtos) {
		this.accountingInvoiceDetailDtos = accountingInvoiceDetailDtos;
	}

	public CASSInvoiceFileDetailsDto getcASSInvoiceFileDetailsDto() {
		return cASSInvoiceFileDetailsDto;
	}

	public void setcASSInvoiceFileDetailsDto(CASSInvoiceFileDetailsDto cASSInvoiceFileDetailsDto) {
		this.cASSInvoiceFileDetailsDto = cASSInvoiceFileDetailsDto;
	}
	
	
	
	//private List<BillingSchedulesDto> billingSchedulesDtos;

    
}