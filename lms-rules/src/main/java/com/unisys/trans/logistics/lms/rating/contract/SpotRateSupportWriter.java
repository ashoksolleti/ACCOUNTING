package com.unisys.trans.logistics.lms.rating.contract;

import com.unisys.trans.logistics.lms.framework.dto.BatchRequest;

public interface SpotRateSupportWriter {
	
	String writeCSVForSpotRate(BatchRequest pRequest);
	
}
