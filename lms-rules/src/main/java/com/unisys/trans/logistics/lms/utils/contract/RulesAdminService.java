package com.unisys.trans.logistics.lms.utils.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.utils.dto.RulesAdminFindRequest;
import com.unisys.trans.logistics.lms.utils.dto.RulesAdminPersistRequest;
import com.unisys.trans.logistics.lms.utils.dto.RulesAdminResponse;

public interface RulesAdminService {

    RulesAdminResponse processRulesAdminData(RulesAdminPersistRequest pRulesAdminPersistRequest)
                throws LMSException;

    RulesAdminResponse findRulesAdminHistory(RulesAdminFindRequest pRequest) throws LMSException;

}
