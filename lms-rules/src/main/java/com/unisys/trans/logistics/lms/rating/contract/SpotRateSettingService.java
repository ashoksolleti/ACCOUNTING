package com.unisys.trans.logistics.lms.rating.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.rating.dto.SRAAuthValidationRequest;
import com.unisys.trans.logistics.lms.rating.dto.SRAAuthValidationResponse;
import com.unisys.trans.logistics.lms.rating.dto.SpotRateSettingRequest;
import com.unisys.trans.logistics.lms.rating.dto.SpotRateSettingResponse;

public interface SpotRateSettingService {
    public SpotRateSettingResponse findAllSpotRateAuthResponseSettings(
                final SpotRateSettingRequest pSpotRateAuthRequest) throws LMSException;

    public SpotRateSettingResponse findAllSpotRateAuthorizationSettings(
                final SpotRateSettingRequest pSpotRateAuthRequest) throws LMSException;

    public SpotRateSettingResponse updateSpotRateAuthResponseSettings(
                final SpotRateSettingRequest pSpotRateAuthRequest) throws LMSException;

    public SpotRateSettingResponse updateSpotRateAuthorizationSettings(
                final SpotRateSettingRequest pSpotRateAuthRequest) throws LMSException;

    public SpotRateSettingResponse deleteSpotRateAuthorizationSettings(
                final SpotRateSettingRequest pSpotRateAuthRequest) throws LMSException;

    public SpotRateSettingResponse deleteSpotRateAuthResponseSettings(
                final SpotRateSettingRequest pSpotRateAuthRequest) throws LMSException;

    public SRAAuthValidationResponse checkRequestQueue(
                final SRAAuthValidationRequest pSraAuthValidationRequest) throws LMSException;
}
