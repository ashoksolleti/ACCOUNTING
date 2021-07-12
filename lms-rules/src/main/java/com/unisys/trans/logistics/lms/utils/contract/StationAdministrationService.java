package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.StationAdminFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.StationAdminPersistRequest;
import com.unisys.trans.logistics.lms.utils.dto.StationAdminResponse;


public interface StationAdministrationService {
   StationAdminResponse findAllLabels(StationAdminFindRequest pStationAdminFindRequest) throws LMSException;
   StationAdminResponse createStationAdminLabels(StationAdminPersistRequest pStationAdminPersistRequest) throws LMSException;
   StationAdminResponse updateStationAdminLabels(StationAdminPersistRequest pStationAdminPersistRequest) throws LMSException;
   
}
