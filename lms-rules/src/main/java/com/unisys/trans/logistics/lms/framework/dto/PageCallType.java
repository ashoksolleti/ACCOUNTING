package com.unisys.trans.logistics.lms.framework.dto;


public enum PageCallType {
    
    BEFORE,
    AFTER;
    
    public String value() {
        return name();
    }

    public static PageCallType fromValue(String v) {
        return valueOf(v);
    }

}
