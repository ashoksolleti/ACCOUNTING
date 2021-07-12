package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.LocalManifestCodeRequest;
import com.unisys.trans.logistics.lms.utils.dto.LocalManifestCodeResponse;

public interface LocalManifestCodeService {

    LocalManifestCodeResponse createLocalManifestCode(
                LocalManifestCodeRequest pLocalManifestCodeRequest) throws LMSException;

    LocalManifestCodeResponse findAllLocalManifestCode(
                LocalManifestCodeRequest pLocalManifestCodeRequest) throws LMSException;

    LocalManifestCodeResponse updateLocalManifestCode(
                LocalManifestCodeRequest pLocalManifestCodeRequest) throws LMSException;

    LocalManifestCodeResponse deleteLocalManifestCode(
                LocalManifestCodeRequest pLocalManifestCodeRequest) throws LMSException;

    LocalManifestCodeResponse restoreLocalManifestCode(
                LocalManifestCodeRequest pLocalManifestCodeRequest) throws LMSException;

    LocalManifestCodeResponse findLocalManifestCodeByLmsDatabaseKey(
                LocalManifestCodeRequest pLocalManifestCodeRequest) throws LMSException;
}
