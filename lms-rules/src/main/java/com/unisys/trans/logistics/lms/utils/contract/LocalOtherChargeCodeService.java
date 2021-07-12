package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.dto.MultipleFindRequest;
import com.unisys.trans.logistics.lms.framework.dto.MultipleFindResponse;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.LocalOtherChargeCodeRequest;
import com.unisys.trans.logistics.lms.utils.dto.LocalOtherChargeCodeResponse;

public interface LocalOtherChargeCodeService {

    LocalOtherChargeCodeResponse createLocalOtherChargeCode(
                LocalOtherChargeCodeRequest pLocalOtherChargeCodeRequest) throws LMSException;

    LocalOtherChargeCodeResponse findAllLocalOtherChargeCode(
                LocalOtherChargeCodeRequest pLocalOtherChargeCodeRequest) throws LMSException;

    LocalOtherChargeCodeResponse updateLocalOtherChargeCode(
                LocalOtherChargeCodeRequest pLocalOtherChargeCodeRequest) throws LMSException;

    LocalOtherChargeCodeResponse deleteLocalOtherChargeCode(
                LocalOtherChargeCodeRequest pLocalOtherChargeCodeRequest) throws LMSException;

    LocalOtherChargeCodeResponse restoreLoalOtherChargeCode(
                LocalOtherChargeCodeRequest pLocalOtherChargeCodeRequest) throws LMSException;

    LocalOtherChargeCodeResponse findLocalOtherChargeCodeByLmsDatabaseKey(
                LocalOtherChargeCodeRequest pLocalOtherChargeCodeRequest) throws LMSException;

    MultipleFindResponse findLocalOtherChargeByCode(
                final MultipleFindRequest pMultipleFindRequest) throws LMSException;

}
