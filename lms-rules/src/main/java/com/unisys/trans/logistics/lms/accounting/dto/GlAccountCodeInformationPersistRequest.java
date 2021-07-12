/* ====================================== */
/* Copyright (c) 2013 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package  com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.List;
import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>GlAccountCodePersistRequest</code> class represents the request to create or update the GlAccountCode information.
 * <p>
 * <code>GlAccountCodePersistRequest</code> holds the following attribute:
 * <ul>
 * <code>
 * <li>GlAccountCode
 * </code>
 * </ul>
 */
public class GlAccountCodeInformationPersistRequest extends AbstractRequest {

    /**
     * Attribute to hold <code>GlAccountCodeDto</code> property.
     */
    private GlAccountCodeDto glAccountCodeDto = new GlAccountCodeDto();
    
    /**
     * Attribute to hold <code>GlAccountCodeDto</code> property.
     */
    private List<GlAccountCodeDto> glAccountCodeDtoList =  new ArrayList<GlAccountCodeDto>();
    
    /**
     * <code>Default constructor.</code>
     */
    public GlAccountCodeInformationPersistRequest() {
    }

    /**
     * Gets the <code>GlAccountCodeDto</code> property.
     * <p>
     * Represents the <code>GlAccountCodeDto</code> which holds all the attributes that are specific to GlAccountCode
     * information.
     * <p>
     * 
     * @return the current value of the <code>GlAccountCodeDto</code> property.
     */
    public final GlAccountCodeDto getGlAccountCodeDto() {
        return this.glAccountCodeDto;
    }

    /**
     * Sets the <code>GlAccountCodeDto</code> property.
     * <p>
     * Represents the <code>GlAccountCodeDto</code> which holds all the attributes that are specific to GlAccountCode
     * information.
     * <p>
     * 
     * @param pGlAccountCodeDto the new value of the <code>GlAccountCodeDto</code> property.<br>
     */
    public final void setGlAccountCodeDto(final GlAccountCodeDto pGlAccountCodeDto) {
        this.glAccountCodeDto = pGlAccountCodeDto;
    }
    
    /**
     * Gets the <code>GlAccountCodeDtoList</code> property.
     * <p>
     * Represents the <code>GlAccountCodeDtoList</code> which holds all the attributes that are specific to GlAccountCode
     * information.
     * <p>
     * 
     * @return the current value of the <code>GlAccountCodeDtoList</code> property.
     */
    public final List<GlAccountCodeDto> getGlAccountCodeDtoList() {
        return this.glAccountCodeDtoList;
    }

    /**
     * Sets the <code>GlAccountCodeDtoList</code> property.
     * <p>
     * Represents the <code>GlAccountCodeDtoList</code> which holds all the attributes that are specific to GlAccountCode
     * information.
     * <p>
     * 
     * @param pGlAccountCodeDtoList the new value of the <code>GlAccountCodeDto</code> property.<br>
     */
    public final void setGlAccountCodeDtoList(final List<GlAccountCodeDto> pGlAccountCodeDtoList) {
        this.glAccountCodeDtoList = pGlAccountCodeDtoList;
    }
}
