package com.unisys.trans.logistics.lms.framework.dto.constants.operation;

/**
 * 
 */


/** 
 * <p>Represents the type of the Goods.</p><p>BULK : All the goods having shipperLoadedULDdicator attribute NULL can be considered as BULK Goods. </p><p>SLULD: BULK : All the goods having shipperLoadedULDdicator attribute NOT NULL can be considered as SLULD Goods. </p>
 */
public enum GoodsType {
	/** 
	 * Container is ULD.
	 */
	BULK,
	/** 
	 * Container is TCON.
	 */
	SLULD
}