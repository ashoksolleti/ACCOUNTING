/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.contract;

import com.unisys.trans.logistics.lms.accounting.dto.CollectionAgentInformationDeleteRequest;
import com.unisys.trans.logistics.lms.accounting.dto.CollectionAgentInformationFindRequest;
import com.unisys.trans.logistics.lms.accounting.dto.CollectionAgentInformationPersistRequest;
import com.unisys.trans.logistics.lms.accounting.dto.CollectionAgentInformationResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

/**
 * <code>CollectionAgentInformationService</code> handles the CollectionAgentInformation
 * <p>
 * This service has the following functions:
 * <ul>
 * <li>Create the AgentInformation.
 * <li>Find the AgentInformation by CollectorId.
 * <li>Update a AgentInformation.
 * </ul>
 * 
 * @see com.unisys.trans.logistics.lms.accounting.dto.CollectionAgentInformationFindRequest
 *      CollectionAgentInformationFindRequest
 * @see com.unisys.trans.logistics.lms.accounting.dto.CollectionAgentInformationPersistRequest
 *      CollectionAgentInformationPersistRequest
 */
public interface CollectionAgentInformationService {
    
    /**
     * Create a new AgentInformation.
     * <p>
     * This method returns a created AgentInformation if successfully created.
     * <p>
     * To create a AgentInformation user must provide following input:<br>
     * <li>collectionAgentInformationDto.<br>
     * * @param pAccountingParticipantPersistRequest
     *            <code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto.CollectionAgentInformationPersistRequest
     *            CollectionAgentInformationPersistRequest}</code><br>
     *            <ul>
     *            <li><code>
     *            {@link com.unisys.trans.logistics.lms.accounting.dto. CollectionAgentInformationPersistRequest#setCollectionAgentInformationDto
     *            collectionAgentInformationDto} - (C)</code>
     *            </ul>
     *            <p>
     * @return <code> {@link com.unisys.trans.logistics.lms.accounting.dto.CollectionAgentInformationResponse
     *         collectionAgentInformationResponse}</code>
     *         <ul>
     *         <li><code> {@link com.unisys.trans.logistics.lms.framework.dto.AbstractResponse
     *         Response fields}</code><br>
     *         holds the CodeMessage <code>
     *         {@link com.unisys.trans.logistics.lms.accounting.dto.CollectionAgentInformationResponse#getcollectionAgentInformationDtos()
     *         collectionAgentInformationDto} - (1:*)</code>
     *         </ul>
     * @throws LMSException
     *             If the validation fails, above mentioned error codes are returned. Each CodeMessage
     *             contains the status code, human readable message, and message type.
     */
    
    CollectionAgentInformationResponse createAgentInformation(CollectionAgentInformationPersistRequest pCollectionAgentRequest)
                throws LMSException;
    /**
     * This method is used toe update the agent information.
     * @param pCollectionAgentRequest
     * @return
     * @throws LMSException
     */
    CollectionAgentInformationResponse updateAgentInformation(CollectionAgentInformationPersistRequest pCollectionAgentRequest) throws LMSException;
    
    /**
     * This method is used to find the all the agent information.
     * @param pCollectionAgentInformationFindRequest
     * @return
     * @throws LMSException
     */
    CollectionAgentInformationResponse findAgentInformation(CollectionAgentInformationFindRequest pCollectionAgentInformationFindRequest)
                throws LMSException;
    /**
     * This method is used to delete the selected agent information.
     * @param pCollectionAgentInformationDeleteRequest
     * @return
     * @throws LMSException
     */
    CollectionAgentInformationResponse deleteAgentInformation(CollectionAgentInformationDeleteRequest pCollectionAgentInformationDeleteRequest) throws LMSException;
}
