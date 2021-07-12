package com.unisys.trans.logistics.lms.accounting.dto.constants;

public enum AdditionFunctionType {
    FORCE_TO_AUDIT("Force To Audit"),
    CLEAR_MANUAL_AUDIT("Clear Manual Audit");
    
    private String val;
    
    AdditionFunctionType(final String pAdditionaltype) {
        this.val = pAdditionaltype;
    }

    public String getAdditionalType() {
        AdditionFunctionType aAdditionFunctionType=null;
        for (final AdditionFunctionType aType : AdditionFunctionType.values()) {
            if (aAdditionFunctionType.equals(aType.getVal())) {
                aAdditionFunctionType = aType;
                break;
            }
        }
        return this.val;
    }

    public void setAdditionalType(final String pAdditionaltype) {
        this.val = pAdditionaltype;
    }

    public String getVal() {
        return this.val;
    }
    
    public String value() {
        return this.getAdditionalType();
    }

}
