//@formatter:off
/* ====================================== */
/* Copyright(c) 2013 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.framework.constants;

/**
 * <code>GenIdType</code> holds the constants to indicate GenId type applied.
 * <p>
 * Following are the possible GenId type:<br>
 * <ul>
 * <li>C
 * <li>D
 * <li>E
 * <li>F
 * <li>G
 * <li>M
 * </ul>
 */
public enum GenIdType {

  
    C("C"),
    
  
    D("D"),
    

    E("E"),
    

    F("F"),
    

    G("G"),
    
   
    M("M"),
    R("R"),
    N("N"),
	X("X");
    

    /**
     * Attribute to hold the <code>genId</code> property.
     */
    private String genId;
    
    /**
     * Parameterize constructor.
     * 
     * @param pGenId
     *            the value.
     */
    GenIdType(final String pGenId) {
       this.genId=pGenId;
    }

    /**
     * @return the genId
     */
    public String getStatus() {
        return genId;
    }
    
    public static GenIdType getGenIdType(final String pGenIdType) {
        GenIdType aGenIdType = null;
        for (final GenIdType aType : GenIdType.values()) {
            if (pGenIdType.equals(aType.getStatus())) {
                aGenIdType = aType;
                break;
            }
        }
        return aGenIdType;
    }
    /**
     * Gives the string format of enumerated <code>ShipmentStatusType</code>.
     * <p>
     * 
     * @return the current string value of the <code>ShipmentStatusType</code>.
     */
    public String value() {
        return this.name();
    }
}
