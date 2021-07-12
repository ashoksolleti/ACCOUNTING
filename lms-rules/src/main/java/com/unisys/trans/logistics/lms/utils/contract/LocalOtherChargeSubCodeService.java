package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.LocalOtherChargeSubCodeRequest;
import com.unisys.trans.logistics.lms.utils.dto.LocalOtherChargeSubCodeResponse;

public interface LocalOtherChargeSubCodeService {

    LocalOtherChargeSubCodeResponse createLocalOtherChargeSubCode(
                LocalOtherChargeSubCodeRequest pLocalOtherChargeSubCodeRequest) throws LMSException;

    LocalOtherChargeSubCodeResponse findAllLocalOtherChargeSubCode(
                LocalOtherChargeSubCodeRequest pLocalOtherChargeSubCodeRequest) throws LMSException;

    LocalOtherChargeSubCodeResponse updateLocalOtherChargeSubCode(
                LocalOtherChargeSubCodeRequest pLocalOtherChargeSubCodeRequest) throws LMSException;

    LocalOtherChargeSubCodeResponse deleteLocalOtherChargeSubCode(
                LocalOtherChargeSubCodeRequest pLocalOtherChargeSubCodeRequest) throws LMSException;

    LocalOtherChargeSubCodeResponse restoreLoalOtherChargeSubCode(
                LocalOtherChargeSubCodeRequest pLocalOtherChargeSubCodeRequest) throws LMSException;

    LocalOtherChargeSubCodeResponse findLocalOtherChargeSubCodeByLmsDatabaseKey(
                LocalOtherChargeSubCodeRequest pLocalOtherChargeSubCodeRequest) throws LMSException;

    LocalOtherChargeSubCodeResponse findLocalOtherChargeBySubCode(
                LocalOtherChargeSubCodeRequest pLocalOtherChargeSubCodeRequest) throws LMSException;

}
