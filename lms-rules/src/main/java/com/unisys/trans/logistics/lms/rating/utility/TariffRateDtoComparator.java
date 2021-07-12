/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.utility;

import com.unisys.trans.logistics.lms.rating.dto.TariffRateDto;
import java.io.Serializable;
import java.util.Comparator;

/**
 * <code>TariffRateDtoComparator</code> contains the comparison methods for the comparing two different
 * objects.
 * <p>
 * This performs the following functions:<br>
 * <ul>
 * <li>Compares the given object.</li>
 * </ul>
 */

public class TariffRateDtoComparator implements Comparator<TariffRateDto>, Serializable {

    /**
     * Generated Serial VersionId.
     */
    private static final long serialVersionUID = 3033159994874433204L;

    /**
     * This method is invoked on execution of the sort method of Collections.
     * <p>
     * 
     * @param pTariffRateDto1 <code>Object</code><br>
     *            contains the current object.
     *            <p>
     * @param pTariffRateDto2 <code>Object</code><br>
     *            contains the object to be compared.
     * @return <code>int</code>
     */
    @Override
    public int compare(final TariffRateDto pTariffRateDto1, final TariffRateDto pTariffRateDto2) {

        int value = 0;

        if (pTariffRateDto1.getRateSourceCode() != null
                    || pTariffRateDto2.getRateSourceCode() != null) {
            if (pTariffRateDto1.getRateSourceCode() == null) {
                value = -1;
            }
            else if (pTariffRateDto2.getRateSourceCode() == null) {
                value = 1;
            }
            else {
                value =
                            pTariffRateDto1.getRateSourceCode()
                                        .compareTo(pTariffRateDto2.getRateSourceCode());
            }
        }
        if (value == 0
                    && (pTariffRateDto1.getCurrencyCode() != null
                    || pTariffRateDto2.getCurrencyCode() != null)) {
            if (pTariffRateDto1.getCurrencyCode() == null) {
                value = -1;
            }
            else if (pTariffRateDto2.getCurrencyCode() == null) {
                value = 1;
            }
            else {
                value = pTariffRateDto1.getCurrencyCode().compareTo(pTariffRateDto2.getCurrencyCode());
            }
        }
        if (value == 0
                    && (pTariffRateDto1.getRateTypePriority() != null
                    || pTariffRateDto2.getRateTypePriority() != null)) {
            if (pTariffRateDto1.getRateTypePriority() == null) {
                value = -1;
            }
            else if (pTariffRateDto2.getRateTypePriority() == null) {
                value = 1;
            }
            else {
                if (pTariffRateDto1.getRateTypePriority() > pTariffRateDto2
                            .getRateTypePriority()) {
                    value = 1;
                }
                else if (pTariffRateDto1.getRateTypePriority() < pTariffRateDto2
                            .getRateTypePriority()) {
                    value = -1;
                }
                else {
                    value = 0;
                }
            }
        }
        if (value == 0 && (pTariffRateDto1.getRateClassCode() != null
                    || pTariffRateDto2.getRateClassCode() != null)) {
            if (pTariffRateDto1.getRateClassCode() == null) {
                value = -1;
            }
            else if (pTariffRateDto2.getRateClassCode() == null) {
                value = 1;
            }
            else {
                if (pTariffRateDto1.getRateClassCode().getDisplayPriority() > (pTariffRateDto2
                            .getRateClassCode()
                            .getDisplayPriority())) {
                    value = 1;
                }
                else if (pTariffRateDto1.getRateClassCode().getDisplayPriority() < (pTariffRateDto2
                            .getRateClassCode()
                            .getDisplayPriority())) {
                    value = -1;
                }
                else {
                    value = 0;
                }
            }
        }
        if (value == 0 && (pTariffRateDto1.getUldType() != null
                    || pTariffRateDto2.getUldType() != null)) {
            if (pTariffRateDto1.getUldType() == null) {
                value = -1;
            }
            else if (pTariffRateDto2.getUldType() == null) {
                value = 1;
            }
            else {
                value =
                            pTariffRateDto1.getUldType()
                                        .compareTo(pTariffRateDto2.getUldType());
            }
        }
        if (value == 0 && (pTariffRateDto1.getCommodityNumber() != null
                    || pTariffRateDto2.getCommodityNumber() != null)) {
            if (pTariffRateDto1.getCommodityNumber() == null) {
                value = -1;
            }
            else if (pTariffRateDto2.getCommodityNumber() == null) {
                value = 1;
            }
            else {
                value =
                            pTariffRateDto1.getCommodityNumber()
                                        .compareTo(pTariffRateDto2.getCommodityNumber());
            }
        }
        if (value == 0
                    && (pTariffRateDto1.getMinimumWeight() != null
                    || pTariffRateDto2.getMinimumWeight() != null)) {
            if (pTariffRateDto1.getMinimumWeight() == null) {
                value = -1;
            }
            else if (pTariffRateDto2.getMinimumWeight() == null) {
                value = 1;
            }
            else {
                if (pTariffRateDto1.getMinimumWeight().doubleValue() > pTariffRateDto2.getMinimumWeight()
                            .doubleValue()) {
                    value = 1;
                }
                else if (pTariffRateDto1.getMinimumWeight().doubleValue() < pTariffRateDto2
                            .getMinimumWeight().doubleValue()) {
                    value = -1;
                }
                else {
                    value = 0;
                }
            }
        }
        if (value == 0 && (pTariffRateDto1.getRatingNoteCode() != null
                    || pTariffRateDto2.getRatingNoteCode() != null)) {
            if (pTariffRateDto1.getRatingNoteCode() == null) {
                value = -1;
            }
            else if (pTariffRateDto2.getRatingNoteCode() == null) {
                value = 1;
            }
            else {
                value =
                            pTariffRateDto1.getRatingNoteCode()
                                        .compareTo(pTariffRateDto2.getRatingNoteCode());
            }
        }
        if (value == 0) {
            if (!(pTariffRateDto1.getPendingGovernmentAppInd() ^ pTariffRateDto2.
                        getPendingGovernmentAppInd())) {
                value = 0;
            }
            else {
                value = pTariffRateDto1.getPendingGovernmentAppInd() ? -1 : 1;
            }
        }
        if (value == 0
                    && ((pTariffRateDto1.getDateRangeDto() != null && pTariffRateDto1.getDateRangeDto()
                                .getEffectiveDate() != null)
                    || (pTariffRateDto2.getDateRangeDto() != null && pTariffRateDto2.getDateRangeDto()
                                .getEffectiveDate() != null))) {
            if (pTariffRateDto1.getDateRangeDto() == null || pTariffRateDto1.getDateRangeDto()
                        .getEffectiveDate() == null) {
                value = -1;
            }
            else if (pTariffRateDto2.getDateRangeDto() == null || pTariffRateDto2.getDateRangeDto()
                        .getEffectiveDate() == null) {
                value = 1;
            }
            else {
                value = pTariffRateDto1.getDateRangeDto().getEffectiveDate().compareTo(
                    pTariffRateDto2.getDateRangeDto().getEffectiveDate());
                if (value < 0) {
                    value = -1;
                }
                else if (value > 0) {
                    value = 1;
                }
            }
        }
        if (value == 0
                    && (pTariffRateDto1.getPivotWeight() != null
                    || pTariffRateDto2.getPivotWeight() != null)) {
            if (pTariffRateDto1.getPivotWeight() == null) {
                value = -1;
            }
            else if (pTariffRateDto2.getPivotWeight() == null) {
                value = 1;
            }
            else {
                if (pTariffRateDto1.getPivotWeight().doubleValue() > pTariffRateDto2.getPivotWeight()
                            .doubleValue()) {
                    value = 1;
                }
                else if (pTariffRateDto1.getPivotWeight().doubleValue() < pTariffRateDto2
                            .getPivotWeight().doubleValue()) {
                    value = -1;
                }
                else {
                    value = 0;
                }
            }
        }
        if (value == 0
                    && (pTariffRateDto1.getUldChargeCode() != null
                    || pTariffRateDto2.getUldChargeCode() != null)) {
            if (pTariffRateDto1.getUldChargeCode() == null) {
                value = -1;
            }
            else if (pTariffRateDto2.getUldChargeCode() == null) {
                value = 1;
            }
            else {
                if (pTariffRateDto1.getUldChargeCode().getDisplayPriority() > pTariffRateDto2
                            .getUldChargeCode()
                            .getDisplayPriority()) {
                    value = 1;
                }
                else if (pTariffRateDto1.getUldChargeCode().getDisplayPriority() < pTariffRateDto2
                            .getUldChargeCode().getDisplayPriority()) {
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
