/**
 * 
 */
package com.unisys.trans.logistics.lms.accounting.contract;

import com.unisys.trans.logistics.lms.parts.dto.ParticipantGroupDeleteRequest;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantGroupFindRequest;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantGroupPersistRequest;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantGroupResponse;
import com.unisys.trans.logistics.lms.parts.dto.ParticipantGroupRestoreRequest;



/** 
 * <!-- begin-UML-doc -->
 * Participant groups denote groups of participants in the system which are defined for the purpose of creating a single contract that could be applied to multiple participants. 
 * For example, when the same contract terms apply for more than one participant, instead of creating the same contract for each participant, the participants can form a single group, and the contract can be created for that group. If the contract no longer applies to a single participant, that participant can simply be removed from the group.
 * 
 * This ParticipantGroupService interface provides the following services:
 * 1. Creates a participant group.
 * 2. Updates a participant group.
 * 3. Deletes a participant group.
 * 4. Restores a participant group.
 * 5. Retrieves all participants for a group. If the group number is null, system retrieves all participant group numbers and descriptions. 
 * 6. Retrieves all participant groups for a participant.
 * <!-- end-UML-doc -->
 * @author KV5
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public interface BillingParticipantGroupService {
	/** 
	 * <!-- begin-UML-doc -->
	 * This method creates a participant group. 
	 * A participant is added to the participant group only by either participant billing account number 1 or an IATA agent number.
	 * 
	 * The argument persist request contains ParticipantGroupDto and a list of ParticipantDetailDto. Validations like type, size, format and content validation are performed on the group information (group number and description) as well as the participant information (account number and its type). If any validation fails, no information is persisted.
	 * <!-- end-UML-doc -->
	 * @param pParticipantGroupPersistRequest The request object for persisting participant group information. 
	 * It has a ParticipantGroupDto that holds information of the participant group to be created.
	 * @return Participant group response object with the created participant group details. 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ParticipantGroupResponse createBillingParticipantGroup(
			ParticipantGroupPersistRequest pParticipantGroupPersistRequest);

	/** 
	 * <!-- begin-UML-doc -->
	 * Marks the ParticipantGroup for deletion.
	 * <!-- end-UML-doc -->
	 * @param pParticipantGroupDeleteRequest The request object for deleting a participant group from the client via web service.
	 * It has the following attributes:
	 * 1. oId - object ID of the participant group. 
	 * 2. endDate - ineffective date of the group. 
	 * 
	 * 
	 * @return Participant group response object contains Acknowledgement – if the participant group information is purged from the system.
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ParticipantGroupResponse deleteBillingParticipantGroup(
			ParticipantGroupDeleteRequest pParticipantGroupDeleteRequest);

	/** 
	 * <!-- begin-UML-doc -->
	 * This method restores a participant group which is marked for deletion. The delete indicator of the participant group is set as false to restore.
	 * 
	 * 
	 * <!-- end-UML-doc -->
	 * @param pParticipantGroupRestoreRequest The request object for restoring the participant group that is marked for deletion. 
	 * It contains oId (object ID) attribute of the participant group that has to restored. 
	 * @return The participant group response object with the restored participant group details. 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ParticipantGroupResponse restoreBillingParticipantGroup(
			ParticipantGroupRestoreRequest pParticipantGroupRestoreRequest);

	/** 
	 * <!-- begin-UML-doc -->
	 * This method updates a participant group information. 
	 * Since the group number is the unique attribute to identify a participant group, it must not be updated. 
	 * A participant is added to the participant group only by either a participant billing account number 1 or an IATA agent account number.
	 * The argument persist request contains group number, group description and a list of participant information (account number and its type). Validations like type, size, format and content validation are performed on the group information (group number and description) as well as the participant information (action code, account number and its type). If any validation fails, no information is persisted.
	 * 
	 * The participants those needs to be removed from the group are filtered in the client and only the participants who are to be newly added to the group will be sent (along with the existing participants) through the persist request. 
	 * For Example: In a group of 10 participants, if three are removed and one is newly added in client then only 8 participants (7 already exist + 1 newly added) will be sent through the persist request.
	 * 
	 * <!-- end-UML-doc -->
	 * @param pParticipantGroupPersistRequest The request object for updating participant group information. 
	 * It has a ParticipantGroupDto which holds information of the participant group that needs to be updated.
	 * @return The participant group response object with updated participant group details. 
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ParticipantGroupResponse updateBillingParticipantGroup(
			ParticipantGroupPersistRequest pParticipantGroupPersistRequest);

	/** 
	 * <!-- begin-UML-doc -->
	 * The system retrieves group information and participant information based upon the groupNumber attribute of the ParticipantGroupFindRequest as below:
	 * 
	 * 1. If groupNumber != null, then the system retrieves the corresponding participant group (if exists) information and participant information associated with the group. 
	 * 2. If groupNumber = null, then the system retrieves all the participant group numbers and descriptions.
	 * 
	 * <!-- end-UML-doc -->
	 * @param pParticipantGroupFindRequest The request object for retrieving a participant group information from the client via web service.
	 * @return The participant group response object contains any one of the following
	 * 1. A ParticipantGroupDto and list of ParticipantDetailDtos – when requested for participant group information.
	 * 2. A list of ParticipantGroupDtos – when requested for all participant groups.
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ParticipantGroupResponse findBillingParticipantGroupByGroupNumber(
			ParticipantGroupFindRequest pParticipantGroupFindRequest);

	/** 
	 * <!-- begin-UML-doc -->
	 * The system retrieves all the participant group information for a participant.
	 * A participant may exist in more than one group. Hence this method retrieve the participant details like name, station, account number, address, city, state, country and postal code and a list of participant groups (ParticipantGroupDto) to which that participant is associated. 
	 * <!-- end-UML-doc -->
	 * @param pParticipantGroupFindRequest Request object for retrieving a participant group information from the client via web service.
	 * For this request object participant account number and its type is mandatory and the participant group number is optional. 
	 * @return The participant group response object contains a list ParticipantGroupDtos and a ParticipantDetailDto.
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ParticipantGroupResponse findBillingParticipantGroupsForParticipant(
			ParticipantGroupFindRequest pParticipantGroupFindRequest);
}