/**
 * 
 */
package com.unisys.trans.logistics.lms.framework.dto;

import java.io.Serializable;

import com.unisys.trans.logistics.lms.framework.constants.RatingDescriptionType;
import com.unisys.trans.logistics.lms.framework.utility.ContractUtility;

/**
 * @author Unisys
 * 
 */
public class RatingSpecialRemarksDto implements Serializable {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 5648480666837207131L;

    /**
     * Attribute to hold <code>descriptionType</code> property.
     */
    private RatingDescriptionType descriptionType;

    /**
     * Attribute to hold <code>specialRemarks</code> property.
     */
    private String specialRemarks;

    /**
     * @return the descriptionType
     */
    public RatingDescriptionType getDescriptionType() {
        return this.descriptionType;
    }

    /**
     * @return the specialRemarks
     */
    public String getSpecialRemarks() {
        return this.specialRemarks;
    }

    /**
     * @param pDescriptionType the descriptionType to set
     */
    public void setDescriptionType(final RatingDescriptionType pDescriptionType) {
        this.descriptionType = pDescriptionType;
    }

    /**
     * @param pSpecialRemarks the specialRemarks to set
     */
    public void setSpecialRemarks(final String pSpecialRemarks) {
        if (pSpecialRemarks != null
                    && (RatingDescriptionType.ULD_IDENTIFIERS.equals(this.descriptionType)
                    || RatingDescriptionType.DIMENSIONS.equals(this.descriptionType))) {
            this.specialRemarks = ContractUtility.convertToUpperCase(pSpecialRemarks);
        }
        else {
            this.specialRemarks = pSpecialRemarks;
        }
    }
}
