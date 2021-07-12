/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.utility;

import java.io.Serializable;
import java.util.Comparator;

import com.unisys.trans.logistics.lms.rating.dto.JointRateEntryDto;

/**
 * <code>JointRateDtoComparator</code> contains the comparison methods for the comparing two different
 * objects.
 * <p>
 * This performs the following functions:<br>
 * <ul>
 * <li>Compares the given object.</li>
 * </ul>
 */

public class JointRateDtoComparator implements Comparator<JointRateEntryDto>, Serializable {

    /**
     * Generated Serial VersionId.
     */
    private static final long serialVersionUID = 3033159994874433204L;

    /**
     * This method is invoked on execution of the sort method of Collections.
     * <p>
     * 
     * @param pJointRateEntryDto1 <code>Object</code><br>
     *            contains the current object.
     *            <p>
     * @param pJointRateEntryDto2 <code>Object</code><br>
     *            contains the object to be compared.
     * @return <code>int</code>
     */
    @Override
    public int compare(final JointRateEntryDto pJointRateEntryDto1,
                final JointRateEntryDto pJointRateEntryDto2) {

        int value = 0;
        if (value == 0
                    && (pJointRateEntryDto1.getRateTypePriority() != null
                    || pJointRateEntryDto2.getRateTypePriority() != null)) {
            if (pJointRateEntryDto1.getRateTypePriority() == null) {
                value = -1;
            }
            else if (pJointRateEntryDto2.getRateTypePriority() == null) {
                value = 1;
            }
            else {
                if (pJointRateEntryDto1.getRateTypePriority() > pJointRateEntryDto2
                            .getRateTypePriority()) {
                    value = 1;
                }
                else if (pJointRateEntryDto1.getRateTypePriority() < pJointRateEntryDto2
                            .getRateTypePriority()) {
                    value = -1;
                }
                else {
                    value = 0;
                }
            }
        }
        if (value == 0 && (pJointRateEntryDto1.getRateClass() != null
                    || pJointRateEntryDto2.getRateClass() != null)) {
            if (pJointRateEntryDto1.getRateClass() == null) {
                value = -1;
            }
            else if (pJointRateEntryDto2.getRateClass() == null) {
                value = 1;
            }
            else {
                if (pJointRateEntryDto1.getRateClass().getDisplayPriority() > (pJointRateEntryDto2
                            .getRateClass()
                            .getDisplayPriority())) {
                    value = 1;
                }
                else if (pJointRateEntryDto1.getRateClass().getDisplayPriority() < (pJointRateEntryDto2
                            .getRateClass()
                            .getDisplayPriority())) {
                    value = -1;
                }
                else {
                    value = 0;
                }
            }
        }
        if (value == 0 && (pJointRateEntryDto1.getUldType() != null
                    || pJointRateEntryDto2.getUldType() != null)) {
            if (pJointRateEntryDto1.getUldType() == null) {
                value = -1;
            }
            else if (pJointRateEntryDto2.getUldType() == null) {
                value = 1;
            }
            else {
                value =
                            pJointRateEntryDto1.getUldType()
                                        .compareTo(pJointRateEntryDto2.getUldType());
            }
        }
        if (value == 0 && (pJointRateEntryDto1.getCommodityNumber() != null
                    || pJointRateEntryDto2.getCommodityNumber() != null)) {
            if (pJointRateEntryDto1.getCommodityNumber() == null) {
                value = -1;
            }
            else if (pJointRateEntryDto2.getCommodityNumber() == null) {
                value = 1;
            }
            else {
                value =
                            pJointRateEntryDto1.getCommodityNumber()
                                        .compareTo(pJointRateEntryDto2.getCommodityNumber());
            }
        }
        if (value == 0
                    && (pJointRateEntryDto1.getMinimumWeight() != null
                    || pJointRateEntryDto2.getMinimumWeight() != null)) {
            if (pJointRateEntryDto1.getMinimumWeight() == null) {
                value = -1;
            }
            else if (pJointRateEntryDto2.getMinimumWeight() == null) {
                value = 1;
            }
            else {
                if (pJointRateEntryDto1.getMinimumWeight().doubleValue() > pJointRateEntryDto2
                            .getMinimumWeight()
                            .doubleValue()) {
                    value = 1;
                }
                else if (pJointRateEntryDto1.getMinimumWeight().doubleValue() < pJointRateEntryDto2
                            .getMinimumWeight().doubleValue()) {
                    value = -1;
                }
                else {
                    value = 0;
                }
            }
        }
        if (value == 0 && (pJointRateEntryDto1.getRatingNoteCode() != null
                    || pJointRateEntryDto2.getRatingNoteCode() != null)) {
            if (pJointRateEntryDto1.getRatingNoteCode() == null) {
                value = -1;
            }
            else if (pJointRateEntryDto2.getRatingNoteCode() == null) {
                value = 1;
            }
            else {
                value =
                            pJointRateEntryDto1.getRatingNoteCode()
                                        .compareTo(pJointRateEntryDto2.getRatingNoteCode());
            }
        }
        if (value == 0
                    && ((pJointRateEntryDto1.getDateRangeDto() != null && pJointRateEntryDto1
                                .getDateRangeDto()
                                .getEffectiveDate() != null)
                    || (pJointRateEntryDto2.getDateRangeDto() != null && pJointRateEntryDto2
                                .getDateRangeDto()
                                .getEffectiveDate() != null))) {
            if (pJointRateEntryDto1.getDateRangeDto() == null || pJointRateEntryDto1.getDateRangeDto()
                        .getEffectiveDate() == null) {
                value = -1;
            }
            else if (pJointRateEntryDto2.getDateRangeDto() == null || pJointRateEntryDto2.getDateRangeDto()
                        .getEffectiveDate() == null) {
                value = 1;
            }
            else {
                value = pJointRateEntryDto1.getDateRangeDto().getEffectiveDate().compareTo(
                    pJointRateEntryDto2.getDateRangeDto().getEffectiveDate());
                if (value < 0) {
                    value = -1;
                }
                else if (value > 0) {
                    value = 1;
                }
            }
        }
        if (value == 0
                    && (pJointRateEntryDto1.getPivotWeight() != null
                    || pJointRateEntryDto2.getPivotWeight() != null)) {
            if (pJointRateEntryDto1.getPivotWeight() == null) {
                value = -1;
            }
            else if (pJointRateEntryDto2.getPivotWeight() == null) {
                value = 1;
            }
            else {
                if (pJointRateEntryDto1.getPivotWeight().doubleValue() > pJointRateEntryDto2.getPivotWeight()
                            .doubleValue()) {
                    value = 1;
                }
                else if (pJointRateEntryDto1.getPivotWeight().doubleValue() < pJointRateEntryDto2
                            .getPivotWeight().doubleValue()) {
                    value = -1;
                }
                else {
                    value = 0;
                }
            }
        }

        return value;
    }

}
