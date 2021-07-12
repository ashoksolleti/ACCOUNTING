package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.Date; 

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public abstract class AbstractParticipantInvoiceRequest extends AbstractRequest {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String billingScheduleIndetifier;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String invoiceFrequency;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Date scheduleFromDate;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Date scheduleToDate;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Date invoiceDate;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String billingScheduleName;
	
	public String getBillingScheduleIndetifier() {
		return billingScheduleIndetifier;
	}
	public void setBillingScheduleIndetifier(String billingScheduleIndetifier) {
		this.billingScheduleIndetifier = billingScheduleIndetifier;
	}
	public String getInvoiceFrequency() {
		return invoiceFrequency;
	}
	public void setInvoiceFrequency(String invoiceFrequency) {
		this.invoiceFrequency = invoiceFrequency;
	}
	public Date getScheduleFromDate() {
		return scheduleFromDate;
	}
	public void setScheduleFromDate(Date scheduleFromDate) {
		this.scheduleFromDate = scheduleFromDate;
	}
	public Date getScheduleToDate() {
		return scheduleToDate;
	}
	public void setScheduleToDate(Date scheduleToDate) {
		this.scheduleToDate = scheduleToDate;
	}
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public String getBillingScheduleName() {
		return billingScheduleName;
	}
	public void setBillingScheduleName(String billingScheduleName) {
		this.billingScheduleName = billingScheduleName;
	}
	
	
	
}
