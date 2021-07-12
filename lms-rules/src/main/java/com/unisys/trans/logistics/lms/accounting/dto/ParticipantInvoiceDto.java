package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.Date;

import com.unisys.trans.logistics.lms.accounting.dto.constants.ActionType;
import com.unisys.trans.logistics.lms.framework.constants.InvoiceFrequencyType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class ParticipantInvoiceDto extends PersistenceObjectDto {


		/**
		 *
		 */
		private static final long serialVersionUID = 1L;
		private ActionType actionType;

		private boolean error;
		private Long oId;
		/**
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		private String participantType;
		/**
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		private InvoiceFrequencyType invoiceFrequency;
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
		private String billingScheduleName;
		/**
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		private String cassBillingPeriodName;
		/**
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		private long cassBillingPeriodNumber;
		/**
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		private String clearanceMonth;
		/**
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		private Date clearancePeriodFromDate;
		/**
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		private Date clearanceToDate;
		/**
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		private String clearancePeriodType;
		
		/**
		 * <!-- begin-UML-doc -->
		 * <!-- end-UML-doc -->
		 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
		 */
		private Date invoiceGenerationDate;
		
		
		private String carrierCode;
		
		
		
		public String getCarrierCode() {
			return carrierCode;
		}
		public void setCarrierCode(String carrierCode) {
			this.carrierCode = carrierCode;
		}

		/**
		 * @return the error
		 */
		public boolean isError() {
			return error;
		}
		/**
		 * @param error the error to set
		 */
		public void setError(boolean error) {
			this.error = error;
		}
		
		
		/**
		 * @return the invoiceFrequency
		 */
		public InvoiceFrequencyType getInvoiceFrequency() {
			return invoiceFrequency;
		}
		/**
		 * @param invoiceFrequency the invoiceFrequency to set
		 */
		public void setInvoiceFrequency(InvoiceFrequencyType invoiceFrequency) {
			this.invoiceFrequency = invoiceFrequency;
		}
		public Date getScheduleFromDate() {
			return scheduleFromDate;
		}
		public void setScheduleFromDate(Date scheduleFromDate) {
			this.scheduleFromDate = scheduleFromDate;
		}
		public String getBillingScheduleName() {
			return billingScheduleName;
		}
		public void setBillingScheduleName(String billingScheduleName) {
			this.billingScheduleName = billingScheduleName;
		}
		public String getCassBillingPeriodName() {
			return cassBillingPeriodName;
		}
		public void setCassBillingPeriodName(String cassBillingPeriodName) {
			this.cassBillingPeriodName = cassBillingPeriodName;
		}
		public long getCassBillingPeriodNumber() {
			return cassBillingPeriodNumber;
		}
		public void setCassBillingPeriodNumber(long cassBillingPeriodNumber) {
			this.cassBillingPeriodNumber = cassBillingPeriodNumber;
		}
		public String getClearanceMonth() {
			return clearanceMonth;
		}
		public void setClearanceMonth(String clearanceMonth) {
			this.clearanceMonth = clearanceMonth;
		}
		public Date getClearancePeriodFromDate() {
			return clearancePeriodFromDate;
		}
		public void setClearancePeriodFromDate(Date clearancePeriodFromDate) {
			this.clearancePeriodFromDate = clearancePeriodFromDate ;
		}
		public Date getClearanceToDate() {
			return clearanceToDate;
		}
		public void setClearanceToDate(Date clearanceToDate) {
			this.clearanceToDate = clearanceToDate;
		}
		public String getClearancePeriodType() {
			return clearancePeriodType;
		}
		public void setClearancePeriodType(String clearancePeriodType) {
			this.clearancePeriodType = clearancePeriodType;
		}
		public Date getInvoiceGenerationDate() {
			return invoiceGenerationDate;
		}
		public void setInvoiceGenerationDate(Date invoiceGenerationDate) {
			this.invoiceGenerationDate = invoiceGenerationDate;
		}

		public Date getScheduleToDate() {
			return scheduleToDate;
		}
		public void setScheduleToDate(Date scheduleToDate) {
			this.scheduleToDate =  scheduleToDate;
		}
		public ActionType getActionType() {
			return actionType;
		}
		public void setActionType(ActionType actionType) {
			this.actionType = actionType;
		}

		public String getParticipantType() {
			return participantType;
		}
		public void setParticipantType(String participantType) {
			this.participantType = participantType;
		}
		
		
		@Override
		public Long getOId() {
			return oId;
		}
		public void setOId(Long oId) {
			this.oId = oId;
		}
	}
