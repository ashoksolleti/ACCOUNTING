package com.unisys.trans.logistics.lms.utils.dto;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>FieldTranslationResponse </code> represents the response object of the maintenance request received
 * by <code>FieldTranslation</code>.
 * <p>
 * <code>FieldTranslationResponse </code> contains the following attribute:<br>
 * <ul>
 * <code>
 * <li>fieldTranslationDto
 * <li>fieldTranslationDtos
 * </code>
 * </ul>
 */
public class FieldTranslationResponse extends AbstractResponse {

    /**
     * unique serial version UID.
     */
    private static final long serialVersionUID = -4950193479272967671L;

    /**
     * Attribute to hold list of <code>fieldTranslationDto</code> objects.<br>
     */
    private FieldTranslationDto fieldTranslationDto = new FieldTranslationDto();

    /**
     * Attribute to hold list of <code>fieldTranslationDtos</code> objects.<br>
     */
    private List<FieldTranslationDto> fieldTranslationDtos = new ArrayList<FieldTranslationDto>();

    /**
     * default constructor.
     */
    public FieldTranslationResponse() {

    }

    /**
     * Adds the <code>fieldTranslationDto</code> to the list of <code>fieldTranslationDto</code>.
     * <p>
     * 
     * @param pFieldTranslationDto the new value of <code>fieldTranslationDtos</code> property.
     */
    public void addFieldTranslation(final FieldTranslationDto pFieldTranslationDto) {
        this.fieldTranslationDtos.add(pFieldTranslationDto);
    }

    /**
     * Gets the <code>fieldTranslationDto</code> property.
     * <p>
     * 
     * @return the current value of <code>fieldTranslationDto</code> property.
     */
    public FieldTranslationDto getFieldTranslationDto() {
        return this.fieldTranslationDto;
    }

    /**
     * Gets the <code>fieldTranslationDtos</code> property.
     * <p>
     * 
     * @return the current value of <code>fieldTranslationDtos</code> property.
     */
    public List<FieldTranslationDto> getFieldTranslationDtos() {
        return this.fieldTranslationDtos;
    }

    /**
     * Sets the <code>fieldTranslationDto</code> property.
     * <p>
     * 
     * @param pFieldTranslationDto the new value of the <code>fieldTranslationDto</code> property.
     */
    public void setFieldTranslationDto(final FieldTranslationDto pFieldTranslationDto) {
        this.fieldTranslationDto = pFieldTranslationDto;
    }

    /**
     * Sets the <code>FieldTranslationDtos</code> property.
     * <p>
     * 
     * @param pFieldTranslationDtos the new value of the <code>FieldTranslationDtos</code> property.
     */
    public void setFieldTranslationDtos(final List<FieldTranslationDto> pFieldTranslationDtos) {
        this.fieldTranslationDtos = pFieldTranslationDtos;
    }

}
