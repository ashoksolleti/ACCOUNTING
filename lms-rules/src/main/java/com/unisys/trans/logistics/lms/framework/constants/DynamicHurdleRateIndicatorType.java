/**
 * 
 */
package com.unisys.trans.logistics.lms.framework.constants;

/**
 * @author 29117
 *
 */
public enum DynamicHurdleRateIndicatorType {

    S("Static Hurdle Rates"),
    D("Dynamic Hurdle Rates"),
    E("Dynamic Hurdle Rate Unavailable"),
    M("Mixed Hurdle Rates");
    
    private String description;
    private DynamicHurdleRateIndicatorType(String pDescriprion){
        this.description = pDescriprion;
    }
    
    public String getDescription(){
        return this.description;
    }
    
}
