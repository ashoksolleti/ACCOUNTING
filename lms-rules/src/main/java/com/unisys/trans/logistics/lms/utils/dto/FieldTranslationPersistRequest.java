package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

/**
 * <code>FieldTranslationPersistRequest</code> class contains the specific details for creating and
 * updating
 * field translation information.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <code>
 * <li>fieldTranslationDto
 *  </code>
 * </ul>
 */
public class FieldTranslationPersistRequest extends AbstractRequest {

    /**
     * unique serial version UID.
     */
    private static final long serialVersionUID = 7188242150692560102L;

    /**
     * Attribute to hold <code>fieldTranslationDto</code> property.
     */
    private FieldTranslationDto fieldTranslationDto;

    /**
     * default constructor.
     */
    public FieldTranslationPersistRequest() {

    }

    /**
     * Gets the <code>fieldTranslationDto</code> property.
     * 
     * @return the current value of the <code>fieldTranslationDto</code> property.<br>
     */
    public FieldTranslationDto getFieldTranslationDto() {
        return this.fieldTranslationDto;
    }

    /**
     * Sets the <code>fieldTranslationDto</code> property.
     * <p>
     * 
     * @param pFieldTranslationDto
     *            the new value of the <code>fieldTranslationDto</code> property.
     */
    public void setFieldTranslationDto(final FieldTranslationDto pFieldTranslationDto) {
        this.fieldTranslationDto = pFieldTranslationDto;
    }

}
