package com.unisys.trans.logistics.lms.framework.dto.constants;

public enum HouseAirwaybillHistorySvcActionType {
C,
U,
D,
R,CO, CN;


/**
 * This method <code>fromValue</code> returns the enumerated value.
 * <p>
 * It is a type of create,find,update,delete operation.
 * <p>
 * 
 * @param pValue the value of enumerated type.
 *            <p>
 * @return the enumerated value of the action type.
 */
public static HouseAirwaybillHistorySvcActionType fromValue(final String pValue) {
    return valueOf(pValue);
}
    /**
     * The <code>value</code> method gives the string format of action type.
     * <p>
     * 
     * @return the enumerated value of the action type.
     */
    public String value() {
        return this.name();
    }

}
