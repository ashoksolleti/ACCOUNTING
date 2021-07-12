package com.unisys.trans.logistics.lms.framework.dto.constants.operation;

/** 
 * Represents the type of the container.
 */
public enum ContainerType {
	/** 
	 * Container is ULD.
	 */
	ULD,
	/** 
	 * Container is Pallet.
	 */
	PALLET,
	/** 
	 * Container is TCON.
	 */
	TCON,
	/** 
     * Container is INACTIVE.
     */
	INACTIVE;
	
	 /**
     * This methods will take an enum value say 'ULD' or 'Pallet' and validates the
     * container against the container type.
     * * True - if the disposition type values are permissible for the specified function
     * * false - if the disposition type values are not permissible for the specified function
     * 
     * @return Response object that hold the boolean value which depends on whether the disposition type
     *         values are permissible for the specified function
     * 
     */
    public boolean isULDPalletContainer() {        
        return ContainerType.ULD.equals(this)
                    || ContainerType.PALLET.equals(this);
    }
    
    public boolean isTCONContainer() {        
        return ContainerType.TCON.equals(this);
    }
}