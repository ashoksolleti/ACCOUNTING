package com.unisys.trans.logistics.lms.parts.contract;

import com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest;
import com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.parts.dto.LocalParticipantDeleteRequest;
import com.unisys.trans.logistics.lms.parts.dto.LocalParticipantPersistRequest;
import com.unisys.trans.logistics.lms.parts.dto.LocalParticipantFindRequest;
import com.unisys.trans.logistics.lms.parts.dto.LocalParticipantResponse;
import com.unisys.trans.logistics.lms.parts.dto.LocalParticipantRestoreRequest;

public interface LocalParticipantService {

    LocalParticipantResponse
                createLocalParticipant(LocalParticipantPersistRequest pLocalParticipantCreateRequest)
                            throws LMSException;

    LocalParticipantResponse findLocalParticipant(LocalParticipantFindRequest pLocalParticipantFindRequest)
                throws LMSException;

    LocalParticipantResponse updateLocalParticipant(
                LocalParticipantPersistRequest pLocalParticipantPersistRequest) throws LMSException;

    LocalParticipantResponse deleteLocalParticipant(
                LocalParticipantDeleteRequest pLocalParticipantDeleteRequest) throws LMSException;

    LocalParticipantResponse restoreLocalParticipant(
                LocalParticipantRestoreRequest pLocalParticipantRestoreRequest) throws LMSException;

    LocalParticipantResponse findLocalParticipantByLmsDatabaseKey(
                LocalParticipantPersistRequest pLocalParticipantPersistRequest) throws LMSException;

    LocalParticipantResponse findLocalParticipantByDate(
                final LocalParticipantFindRequest participantFindRequest) throws LMSException;

    MultipleFindResponse findLocalAWBParticipant(final MultipleFindRequest pMultipleFindRequest) throws LMSException;
}
