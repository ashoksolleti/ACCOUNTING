package com.unisys.trans.logistics.lms.rating.contract;

import java.util.concurrent.Future;

import com.unisys.trans.logistics.lms.framework.exception.LMSException;
import com.unisys.trans.logistics.lms.rating.dto.price.PricingRequest;
import com.unisys.trans.logistics.lms.rating.dto.price.PricingResponse;

public interface PricingService {

    PricingResponse findPrice(PricingRequest pRequest) throws LMSException;

    Future<PricingResponse> asyncFindPrice(PricingRequest pPricingRequest) throws LMSException;

}