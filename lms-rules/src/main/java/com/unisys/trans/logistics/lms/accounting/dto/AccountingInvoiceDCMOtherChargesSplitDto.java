/**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.accounting.dto.constants.DueType;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author KV5
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class AccountingInvoiceDCMOtherChargesSplitDto {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private String chargeCode;
	
	private String subCode;
	public String getSubCode() {
		return subCode;
	}
	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Double amount;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Double netAmount;
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private DueType dueType;
	/**
	 * @return the chargeCode
	 */
	public String getChargeCode() {
		return chargeCode;
	}
	/**
	 * @param chargeCode the chargeCode to set
	 */
	public void setChargeCode(String chargeCode) {
		this.chargeCode = chargeCode;
	}
	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	/**
	 * @return the netAmount
	 */
	public Double getNetAmount() {
		return netAmount;
	}
	/**
	 * @param netAmount the netAmount to set
	 */
	public void setNetAmount(Double netAmount) {
		this.netAmount = netAmount;
	}
	/**
	 * @return the dueType
	 */
	public DueType getDueType() {
		return dueType;
	}
	/**
	 * @param dueType the dueType to set
	 */
	public void setDueType(DueType dueType) {
		this.dueType = dueType;
	}
}