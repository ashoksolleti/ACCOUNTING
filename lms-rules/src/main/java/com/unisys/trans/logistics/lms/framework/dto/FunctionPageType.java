package com.unisys.trans.logistics.lms.framework.dto;

/**
 * <p>
 * Java class for FunctionPageType.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * <p>
 * 
 * <pre>
 * &lt;simpleType name="FunctionPageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACCEPT-GOODS"/>
 *     &lt;enumeration value="GOODS-INFORMATION"/>
 *     &lt;enumeration value="AWB-INFORMATION"/>
 *     &lt;enumeration value="BOOKING-INFORMATION"/>
 *     &lt;enumeration value="EXPRESS-AWB"/>
 *     &lt;enumeration value="SLULD-EXPRESS-AWB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */

public enum FunctionPageType {

    ACCEPT_GOODS("ACCEPT-GOODS"),
    GOODS_INFORMATION("GOODS-INFORMATION"),
    AWB_INFORMATION("AWB-INFORMATION"),
    BOOKING_INFORMATION("BOOKING-INFORMATION"),
    EXPRESS_AWB("EXPRESS-AWB"),
    SLULD_EXPRESS_AWB("SLULD-EXPRESS-AWB"),
    SIMPLIFIED_ACCEPTANCE("SIMPLIFIED-ACCEPTANCE");

    FunctionPageType(final String pFunctionPageType) {

        this.setFunctionPageType(pFunctionPageType);
    }

    public String getFunctionPageType() {
        return functionPageType;
    }

    public void setFunctionPageType(String functionPageType) {
        this.functionPageType = functionPageType;
    }

    private String functionPageType;

    public static FunctionPageType getFunctionPageTypeName(String pFunctionPageType) {
        FunctionPageType aFunctionPage = null;
        for (FunctionPageType aFunctionPageType : FunctionPageType.values()) {
            if (aFunctionPageType.getFunctionPageType().equals(pFunctionPageType)) {
                aFunctionPage = aFunctionPageType;
                break;
            }
        }
        return aFunctionPage;
    }

}
