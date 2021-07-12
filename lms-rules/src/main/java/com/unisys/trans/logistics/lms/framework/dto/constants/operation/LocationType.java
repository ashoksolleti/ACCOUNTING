package com.unisys.trans.logistics.lms.framework.dto.constants.operation;

/**
 * Indicates the type of location where goods are kept.
 */
public enum LocationType {
    
    /**
     * Goods location type is finalized flight.
     */
    IN_FINALIZED_FLIGHT,
    /**
     * Goods location type is terminal location.
     */
    TERMINAL_LOCATION,
    /**
     * Goods location type is container.
     */
    CONTAINER_ULD,
    /** 
	 */
    CONTAINER_PALLET,
    /** 
	 */
    CONTAINER_TCON;

    public boolean isContainer() {
        return LocationType.CONTAINER_PALLET.equals(this) || LocationType.CONTAINER_TCON.equals(this)
                    || LocationType.CONTAINER_ULD.equals(this);
    }

    public boolean isULDPalletContainer() {
        return LocationType.CONTAINER_PALLET.equals(this) || LocationType.CONTAINER_ULD.equals(this);
    }
    
    public boolean isTCONContainer() {
        return LocationType.CONTAINER_TCON.equals(this);
    }

    public boolean isTerminalLocation() {
        return LocationType.TERMINAL_LOCATION.equals(this);
    }
}