/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package  com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>GlAccountCodeFindRequest</code> class represents the request to find the GlAccountCode information.
 * 
 */
public class GlAccountCodeInformationFindRequest extends AbstractRequest {
    
    /**
     * Attribute to hold <code>GlAccountCode</code> property.
     */
    private GlAccountCodeDto glAccountCodeDto =  new GlAccountCodeDto();
    
    /**
     * <code>Default constructor.</code>
     */
    public GlAccountCodeInformationFindRequest() {
    }
    
    /**
     * Gets the <code>GlAccountCode</code> property.
     * <p>
     * Represents the <code>GlAccountCodeDto</code> which holds all the attributes that are specific to GlAccountCode
     * information.
     * <p>
     * 
     * @return the current value of the <code>GlAccountCode</code> property.
     */
    public final GlAccountCodeDto getGlAccountCodeDto() {
        return this.glAccountCodeDto;
    }

    /**
     * Sets the <code>GlAccountCode</code> property.
     * <p>
     * Represents the <code>GlAccountCodeDto</code> which holds all the attributes that are specific to GlAccountCode
     * information.
     * <p>
     * 
     * @param pGlAccountCodeDto the new value of the <code>GlAccountCode</code> property.<br>
     */
    public final void setGlAccountCodeDto(final GlAccountCodeDto pGlAccountCodeDto) {
        this.glAccountCodeDto = pGlAccountCodeDto;
    }
    
    
}
