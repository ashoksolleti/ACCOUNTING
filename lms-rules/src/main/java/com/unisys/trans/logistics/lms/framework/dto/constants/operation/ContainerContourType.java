package com.unisys.trans.logistics.lms.framework.dto.constants.operation;



/** 
 * Represents the container contour.
 */
public enum ContainerContourType {
	/** 
	 * The container contour is Upper Deck Pallets.
	 */
	UP("U"),
	/** 
	 * The container contour is Lower Deck Pallets.
	 */
	DN("L"),
	/** 
	 * The container contour is Tall Deck Pallets.
	 */
	TALL("T"),
	/** 
	 * The container contour is general Contour.
	 */
	CONTOUR("C");
	
	 /**
     * Attribute to hold the <code>awbType</code> property.
     */
    private String contourType;
	
    /**
     * Parameterized constructor. Accepts the string representation of the enum
     * as the parameter
     * 
     * @param pValue
     *            String representaion of the enum
     */
    private ContainerContourType(final String contourType) {
        this.contourType = contourType;
    }
    
	 /**
     * Gets the <code>ContainerContourType</code>.
     * <p>
     * This is used as a Mandatory field for create ,update and reassign.
     * <p>
     * 
     * @param pAirWaybillType
     *            the new value of <code>ContainerContourType</code>.
     *            <p>
     * @return the current value of <code>ContainerContourType</code>.
     */
    public static ContainerContourType getContainerContourType(final String pContainerContourType) {

		ContainerContourType aContainerContourType = null;

        for (final ContainerContourType aType : ContainerContourType.values()) {

            if (pContainerContourType.equals(aType.value())) {
            	aContainerContourType = aType;
                break;
            }
        }

        return aContainerContourType;
    }
    
    
    /**
     * Gets the <code>contourType</code> property.
     * <p>
     * 
     * @return the current value of the <code>contourType</code> property.
     */
    public String getContourType() {
        return this.contourType;
    }

    /**
     * Sets the <code>contourType</code> property.
     * <p>
     * 
     * @param contourType
     *            holds the new value of <code>contourType</code>.<br>
     */
    public void setContourType(final String contourType) {
        this.contourType = contourType;
    }

    /**
     * Gets the value for<code>contourType</code>.
     * <p>
     * 
     * @return the current value of <code>contourType</code> property. 
     */
    public String value() {
        return this.contourType;
    }
}