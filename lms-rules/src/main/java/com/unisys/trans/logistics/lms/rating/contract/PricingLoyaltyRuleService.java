package com.unisys.trans.logistics.lms.rating.contract;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.rating.dto.price.LoyaltyRulesDto;

public interface PricingLoyaltyRuleService {
	
	void calculateLoyaltyPoints(LoyaltyRulesDto pLoyaltyRulesDto)throws LMSException;

}
	