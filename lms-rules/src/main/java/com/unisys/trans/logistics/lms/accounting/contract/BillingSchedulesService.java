package com.unisys.trans.logistics.lms.accounting.contract;

import java.text.ParseException;

import com.unisys.trans.logistics.lms.accounting.dto.BillingScheduleFindRequest;
import com.unisys.trans.logistics.lms.accounting.dto.BillingSchedulesPersistRequest;
import com.unisys.trans.logistics.lms.accounting.dto.BillingSchedulesResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.framework.exception.ValidationException;


/**
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author KV5
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public interface BillingSchedulesService {
	/**
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param billingSchedulesRequest
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public BillingSchedulesResponse processBillingSchedules(
			BillingScheduleFindRequest billingScheduleFindRequest);

	/**
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param billingSchedulesRequest
	 * @return
	 * @throws LMSException
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public BillingSchedulesResponse retrieveBillingSchedules(
			BillingScheduleFindRequest billingScheduleFindRequest) throws LMSException;

	/**
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param billingSchedulesRequest
	 * @return
	 * @throws ParseException
	 * @throws DaoException
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public BillingSchedulesResponse createBillingSchedules(
			BillingSchedulesPersistRequest billingSchedulesPersistRequest,String requestType) throws LMSException;

	/**
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param billingSchedulesRequest
	 * @return
	 * @throws DaoException
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public BillingSchedulesResponse deleteBillingSchedules(
			BillingSchedulesPersistRequest billingSchedulesPersistRequest, String requestType) throws LMSException;

	/**
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @param billingSchedulesRequest
	 * @return
	 * @throws ParseException
	 * @throws DaoException
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public BillingSchedulesResponse updateBillingSchedules(
			BillingSchedulesPersistRequest billingSchedulesPersistRequest, String requestType) throws LMSException;
	
	public BillingSchedulesResponse validateBillingOverlap(BillingSchedulesPersistRequest billingSchedules, String requestType, boolean flag)
			throws LMSException;
	public BillingSchedulesResponse validateBillingRange(BillingSchedulesPersistRequest billingSchedules, String requestType, boolean flag)
			throws LMSException; 

}
