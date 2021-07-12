/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.utility;

import java.io.Serializable;
import java.util.Comparator;

import com.unisys.trans.logistics.lms.rating.dto.AddOnRateEntryDto;

/**
 * <code>AddOnRateDtoComparator</code> contains the comparison methods for
 * comparing two different objects.
 * <p>
 * This performs the following functions:<br>
 * <ul>
 * <li>Compares the given object.</li>
 * </ul>
 */

public class AddOnRateDtoComparator implements Comparator<AddOnRateEntryDto>,
            Serializable {

    /**
     * Generated Serial VersionId.
     */
    private static final long serialVersionUID = -3834819271981968160L;

    /**
     * This method is invoked on execution of the sort method of Collections.
     * <p>
     * 
     * @param pAddOnRateEntryDto1
     *            <code>Object</code><br>
     *            contains the current object.
     *            <p>
     * @param pAddOnRateEntryDto2
     *            <code>Object</code><br>
     *            contains the object to be compared.
     * @return <code>int</code>
     */
    @Override
    public int compare(final AddOnRateEntryDto pAddOnRateEntryDto1,
                final AddOnRateEntryDto pAddOnRateEntryDto2) {

        int value = 0;

        if (pAddOnRateEntryDto1.getCityCode() != null
                    && pAddOnRateEntryDto2.getCityCode() != null) {
            if (pAddOnRateEntryDto1.getCityCode() == null) {
                value = -1;
            }
            else if (pAddOnRateEntryDto2.getCityCode() == null) {
                value = 1;
            }
            else {
                value = pAddOnRateEntryDto1.getCityCode().compareTo(
                    pAddOnRateEntryDto2.getCityCode());
            }
        }

        if (value == 0
                    && (pAddOnRateEntryDto1.getRateSourceCode() != null
                    && pAddOnRateEntryDto2.getRateSourceCode() != null)) {
            if (pAddOnRateEntryDto1.getRateSourceCode() == null) {
                value = -1;
            }
            else if (pAddOnRateEntryDto2.getRateSourceCode() == null) {
                value = 1;
            }
            else {
                value = pAddOnRateEntryDto1.getRateSourceCode().compareTo(
                    pAddOnRateEntryDto2.getRateSourceCode());
            }
        }

        if (value == 0
                    && (pAddOnRateEntryDto1.getRateTypePriority() != null || pAddOnRateEntryDto2
                                .getRateTypePriority() != null)) {
            if (pAddOnRateEntryDto1.getRateTypePriority() == null) {
                value = -1;
            }
            else if (pAddOnRateEntryDto2.getRateTypePriority() == null) {
                value = 1;
            }
            else {
                if (pAddOnRateEntryDto1.getRateTypePriority() > pAddOnRateEntryDto2
                            .getRateTypePriority()) {
                    value = 1;
                }
                else if (pAddOnRateEntryDto1.getRateTypePriority() < pAddOnRateEntryDto2
                            .getRateTypePriority()) {
                    value = -1;
                }
                else {
                    value = 0;
                }
            }
        }

        if (value == 0
                    && (pAddOnRateEntryDto1.getRateClassCode() != null || pAddOnRateEntryDto2
                                .getRateClassCode() != null)) {
            if (pAddOnRateEntryDto1.getRateClassCode() == null) {
                value = -1;
            }
            else if (pAddOnRateEntryDto2.getRateClassCode() == null) {
                value = 1;
            }
            else {
                if (pAddOnRateEntryDto1.getRateClassCode().getDisplayPriority() > (pAddOnRateEntryDto2
                            .getRateClassCode().getDisplayPriority())) {
                    value = 1;
                }
                else if (pAddOnRateEntryDto1.getRateClassCode()
                            .getDisplayPriority() < (pAddOnRateEntryDto2
                            .getRateClassCode().getDisplayPriority())) {
                    value = -1;
                }
                else {
                    value = 0;
                }
            }
        }

        if (value == 0
                    && (pAddOnRateEntryDto1.getCurrencyCode() != null || pAddOnRateEntryDto2
                                .getCurrencyCode() != null)) {
            if (pAddOnRateEntryDto1.getCurrencyCode() == null) {
                value = -1;
            }
            else if (pAddOnRateEntryDto2.getCurrencyCode() == null) {
                value = 1;
            }
            else {
                value = pAddOnRateEntryDto1.getCurrencyCode().compareTo(
                    pAddOnRateEntryDto2.getCurrencyCode());
            }
        }

        if (value == 0
                    && (pAddOnRateEntryDto1.getRateConstructionAreaCode() != null || pAddOnRateEntryDto2
                                .getRateConstructionAreaCode() != null)) {
            if (pAddOnRateEntryDto1.getRateConstructionAreaCode() == null) {
                value = -1;
            }
            else if (pAddOnRateEntryDto2.getRateConstructionAreaCode() == null) {
                value = 1;
            }
            else {
                if (pAddOnRateEntryDto1.getRateConstructionAreaCode() > (pAddOnRateEntryDto2
                            .getRateConstructionAreaCode())) {
                    value = 1;
                }
                else if (pAddOnRateEntryDto1.getRateConstructionAreaCode() < (pAddOnRateEntryDto2
                            .getRateConstructionAreaCode())) {
                    value = -1;
                }
                else {
                    value = 0;
                }
            }
        }

        if (value == 0
                    && (pAddOnRateEntryDto1.getUldTypeCode() != null || pAddOnRateEntryDto2
                                .getUldTypeCode() != null)) {
            if (pAddOnRateEntryDto1.getUldTypeCode() == null) {
                value = -1;
            }
            else if (pAddOnRateEntryDto2.getUldTypeCode() == null) {
                value = 1;
            }
            else {
                value = pAddOnRateEntryDto1.getUldTypeCode().compareTo(
                    pAddOnRateEntryDto2.getUldTypeCode());
            }
        }

        if (value == 0
                    && (pAddOnRateEntryDto1.getUldChargeCode() != null || pAddOnRateEntryDto2
                                .getUldChargeCode() != null)) {
            if (pAddOnRateEntryDto1.getUldChargeCode() == null) {
                value = -1;
            }
            else if (pAddOnRateEntryDto2.getUldChargeCode() == null) {
                value = 1;
            }
            else {
                if (pAddOnRateEntryDto1.getUldChargeCode().getDisplayPriority() > pAddOnRateEntryDto2
                            .getUldChargeCode().getDisplayPriority()) {
                    value = 1;
                }
                else if (pAddOnRateEntryDto1.getUldChargeCode()
                            .getDisplayPriority() < pAddOnRateEntryDto2
                            .getUldChargeCode().getDisplayPriority()) {
                    value = -1;
                }
                else {
                    value = 0;
                }
            }
        }

        if (value == 0
                    && (pAddOnRateEntryDto1.getMinimumWeight() != null || pAddOnRateEntryDto2
                                .getMinimumWeight() != null)) {
            if (pAddOnRateEntryDto1.getMinimumWeight() == null) {
                value = -1;
            }
            else if (pAddOnRateEntryDto2.getMinimumWeight() == null) {
                value = 1;
            }
            else {
                if (pAddOnRateEntryDto1.getMinimumWeight().doubleValue() > pAddOnRateEntryDto2
                            .getMinimumWeight().doubleValue()) {
                    value = 1;
                }
                else if (pAddOnRateEntryDto1.getMinimumWeight().doubleValue() < pAddOnRateEntryDto2
                            .getMinimumWeight().doubleValue()) {
                    value = -1;
                }
                else {
                    value = 0;
                }
            }
        }

        if (value == 0
                    && (pAddOnRateEntryDto1.getPivotWeight() != null || pAddOnRateEntryDto2
                                .getPivotWeight() != null)) {
            if (pAddOnRateEntryDto1.getPivotWeight() == null) {
                value = -1;
            }
            else if (pAddOnRateEntryDto2.getPivotWeight() == null) {
                value = 1;
            }
            else {
                if (pAddOnRateEntryDto1.getPivotWeight().doubleValue() > pAddOnRateEntryDto2
                            .getPivotWeight().doubleValue()) {
                    value = 1;
                }
                else if (pAddOnRateEntryDto1.getPivotWeight().doubleValue() < pAddOnRateEntryDto2
                            .getPivotWeight().doubleValue()) {
                    value = -1;
                }
                else {
                    value = 0;
                }
            }
        }

        if (value == 0
                    && (pAddOnRateEntryDto1.getDirection() != null || pAddOnRateEntryDto2
                                .getDirection() != null)) {
            if (pAddOnRateEntryDto1.getDirection() == null) {
                value = -1;
            }
            else if (pAddOnRateEntryDto2.getDirection() == null) {
                value = 1;
            }
            else {
                if (pAddOnRateEntryDto1.getDirection().getDisplayPriority() > (pAddOnRateEntryDto2
                            .getDirection().getDisplayPriority())) {
                    value = 1;
                }
                else if (pAddOnRateEntryDto1.getDirection()
                            .getDisplayPriority() < (pAddOnRateEntryDto2
                            .getDirection().getDisplayPriority())) {
                    value = -1;
                }
                else {
                    value = 0;
                }
            }
        }

        if (value == 0
                    && ((pAddOnRateEntryDto1.getDateRangeDto() != null && pAddOnRateEntryDto1
                                .getDateRangeDto().getEffectiveDate() != null) || (pAddOnRateEntryDto2
                                .getDateRangeDto() != null && pAddOnRateEntryDto2
                                .getDateRangeDto().getEffectiveDate() != null))) {
            if (pAddOnRateEntryDto1.getDateRangeDto() == null
                        || pAddOnRateEntryDto1.getDateRangeDto().getEffectiveDate() == null) {
                value = -1;
            }
            else if (pAddOnRateEntryDto2.getDateRangeDto() == null
                        || pAddOnRateEntryDto2.getDateRangeDto().getEffectiveDate() == null) {
                value = 1;
            }
            else {
                value = pAddOnRateEntryDto1
                            .getDateRangeDto()
                            .getEffectiveDate()
                            .compareTo(
                                pAddOnRateEntryDto2.getDateRangeDto()
                                            .getEffectiveDate());
                if (value < 0) {
                    value = -1;
                }
                else if (value > 0) {
                    value = 1;
                }
            }
        }

        return value;
    }

}
