package com.unisys.trans.logistics.lms.utils.contract;

import java.util.Map;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.GeographicDataDto;

public interface GeographicDataManagerService {
    GeographicDataDto findGeographicData(GeographicDataDto pGeographicDataDto) throws LMSException;
    void validateAirportGeographicData(String pString) throws LMSException;
    void validateCityGeographicData(String pString) throws LMSException;
    void validateAggregateGeographicData(String pString)throws LMSException;
    GeographicDataDto validateGeographicData(GeographicDataDto pGeographicDataDto) throws LMSException;
    void validateSameOriginAndDestination(GeographicDataDto pOrigin,GeographicDataDto pDestination)throws LMSException;
    Map<String, Object> getResponseMap();
    void validateCountryGeographicData(String pString)throws LMSException;
    
}
