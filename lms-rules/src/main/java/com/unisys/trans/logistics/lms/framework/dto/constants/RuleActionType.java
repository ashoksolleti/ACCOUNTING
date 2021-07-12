package com.unisys.trans.logistics.lms.framework.dto.constants;


public enum RuleActionType {
    
    PROCESS,
    STOP;
    
    public String value() {
        return name();
    }

    public static RuleActionType fromValue(String v) {
        return valueOf(v);
    }

}
