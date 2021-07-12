/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.utility;

import java.io.Serializable;
import java.util.Comparator;

import com.unisys.trans.logistics.lms.rating.dto.TariffRateAdminDto;

/**
 * <code>Global Tariff Rate Admin Dto Comparator</code> contains the comparison methods for comparing two different
 * objects.
 * <p>
 * This performs the following functions:<br>
 * <ul>
 * <li>Compares the given objects.</li>
 * </ul>
 */

public class GlobalTariffRateAdminDtoComparator implements Comparator<TariffRateAdminDto>, Serializable {

    /**
     * Generated Serial VersionId.
     */
    private static final long serialVersionUID = 3033159994874433204L;

    /**
     * This method is invoked on execution of the sort method on Collections.
     * <p>
     * 
     * @param pTariffRateAdminDto1 <code>Object</code><br>
     *            contains the current object.
     *            <p>
     * @param pTariffRateAdminDto2 <code>Object</code><br>
     *            contains the object to be compared.
     * @return <code>int</code>
     */
    @Override
    public int compare(final TariffRateAdminDto pTariffRateAdminDto1,
                final TariffRateAdminDto pTariffRateAdminDto2) {

        int value = 0;

        if (value == 0
                    && (pTariffRateAdminDto1.getTariffActionType().getType() != null
                    || pTariffRateAdminDto2.getTariffActionType().getType() != null)) {
            if (pTariffRateAdminDto1.getTariffActionType().getType() == null) {
                value = 1;
            }
            else if (pTariffRateAdminDto2.getTariffActionType().getType() == null) {
                value = -1;
            }
            else {
                value =
                            pTariffRateAdminDto1.getTariffActionType().getType()
                                        .compareTo(pTariffRateAdminDto2.getTariffActionType().getType());
            }
        }

        if (value == 0
                    && (pTariffRateAdminDto1.getRateSource() != null
                    || pTariffRateAdminDto2.getRateSource() != null)) {
            if (pTariffRateAdminDto1.getRateSource() == null) {
                value = 1;
            }
            else if (pTariffRateAdminDto2.getRateSource() == null) {
                value = -1;
            }
            else {
                value =
                            pTariffRateAdminDto2.getRateSource()
                                        .compareTo(pTariffRateAdminDto1.getRateSource());
            }
        }

        if (value == 0
                    && (pTariffRateAdminDto1.getOrigin().getType().getValue() != null
                    || pTariffRateAdminDto2.getOrigin().getType().getValue() != null)) {
            if (pTariffRateAdminDto1.getOrigin().getType().getValue() == null) {
                value = 1;
            }
            else if (pTariffRateAdminDto2.getOrigin().getType().getValue() == null) {
                value = -1;
            }
            else {
                if (pTariffRateAdminDto1.getOrigin().getType().getValue() > pTariffRateAdminDto2.getOrigin()
                            .getType().getValue()) {
                    value = -1;
                }
                else if (pTariffRateAdminDto1.getOrigin().getType().getValue() < pTariffRateAdminDto2
                            .getOrigin()
                            .getType().getValue()) {
                    value = 1;
                }
                else {
                    value = 0;
                }
            }
        }

        if (value == 0
                    && (pTariffRateAdminDto1.getDestination().getType().getValue() != null
                    || pTariffRateAdminDto2.getDestination().getType().getValue() != null)) {
            if (pTariffRateAdminDto1.getDestination().getType().getValue() == null) {
                value = 1;
            }
            else if (pTariffRateAdminDto2.getDestination().getType().getValue() == null) {
                value = -1;
            }
            else {
                if (pTariffRateAdminDto1.getDestination().getType().getValue() > pTariffRateAdminDto2
                            .getDestination()
                            .getType().getValue()) {
                    value = -1;
                }
                else if (pTariffRateAdminDto1.getDestination().getType().getValue() < pTariffRateAdminDto2
                            .getDestination()
                            .getType().getValue()) {
                    value = 1;
                }
                else {
                    value = 0;
                }
            }
        }
        if (value == 0
                    && (pTariffRateAdminDto1.getCarrier() != null
                    || pTariffRateAdminDto2.getCarrier() != null)) {
            if (pTariffRateAdminDto1.getCarrier() == null) {
                value = 1;
            }
            else if (pTariffRateAdminDto2.getCarrier() == null) {
                value = -1;
            }
            else {
                value = pTariffRateAdminDto2.getCarrier().compareTo(
                    pTariffRateAdminDto1.getCarrier());
            }
        }

        if (value == 0
                    && (pTariffRateAdminDto1.getCurrency() != null
                    || pTariffRateAdminDto2.getCurrency() != null)) {
            if (pTariffRateAdminDto1.getCurrency() == null) {
                value = 1;
            }
            else if (pTariffRateAdminDto2.getCurrency() == null) {
                value = -1;
            }
            else {
                value =
                            pTariffRateAdminDto2.getCurrency().compareTo(
                                pTariffRateAdminDto1.getCurrency());
            }
        }
        if (value == 0
                    && (pTariffRateAdminDto1.getRateTypePriority() != null
                    || pTariffRateAdminDto2.getRateTypePriority() != null)) {
            if (pTariffRateAdminDto1.getRateTypePriority() == null) {
                value = 1;
            }
            else if (pTariffRateAdminDto2.getRateTypePriority() == null) {
                value = -1;
            }
            else {
                if (pTariffRateAdminDto1.getRateTypePriority() > pTariffRateAdminDto2
                            .getRateTypePriority()) {
                    value = -1;
                }
                else if (pTariffRateAdminDto1.getRateTypePriority() < pTariffRateAdminDto2
                            .getRateTypePriority()) {
                    value = 1;
                }
                else {
                    value = 0;
                }
            }
        }

        if (value == 0 && (pTariffRateAdminDto1.getCommodityNumber() != null
                    || pTariffRateAdminDto2.getCommodityNumber() != null)) {
            if (pTariffRateAdminDto1.getCommodityNumber() == null) {
                value = 1;
            }
            else if (pTariffRateAdminDto2.getCommodityNumber() == null) {
                value = -1;
            }
            else {
                value =
                            pTariffRateAdminDto2.getCommodityNumber()
                                        .compareTo(pTariffRateAdminDto1.getCommodityNumber());
            }
        }

        if (value == 0 && (pTariffRateAdminDto1.getUldType() != null
                    || pTariffRateAdminDto2.getUldType() != null)) {
            if (pTariffRateAdminDto1.getUldType() == null) {
                value = 1;
            }
            else if (pTariffRateAdminDto2.getUldType() == null) {
                value = -1;
            }
            else {
                value =
                            pTariffRateAdminDto2.getUldType()
                                        .compareTo(pTariffRateAdminDto1.getUldType());
            }
        }

        if (value == 0
                    && (pTariffRateAdminDto1.getUldCharge() != null
                    || pTariffRateAdminDto2.getUldCharge() != null)) {
            if (pTariffRateAdminDto1.getUldCharge() == null) {
                value = 1;
            }
            else if (pTariffRateAdminDto2.getUldCharge() == null) {
                value = -1;
            }
            else {
                if (pTariffRateAdminDto1.getUldCharge().getDisplayPriority() > pTariffRateAdminDto2
                            .getUldCharge()
                            .getDisplayPriority()) {
                    value = -1;
                }
                else if (pTariffRateAdminDto1.getUldCharge().getDisplayPriority() < pTariffRateAdminDto2
                            .getUldCharge().getDisplayPriority()) {
                    value = 1;
                }
                else {
                    value = 0;
                }
            }
        }

        if (value == 0
                    && (pTariffRateAdminDto1.getMinimumWeight() != null
                    || pTariffRateAdminDto2.getMinimumWeight() != null)) {
            if (pTariffRateAdminDto1.getMinimumWeight() == null) {
                value = 1;
            }
            else if (pTariffRateAdminDto2.getMinimumWeight() == null) {
                value = -1;
            }
            else {
                if (pTariffRateAdminDto1.getMinimumWeight().doubleValue() > pTariffRateAdminDto2
                            .getMinimumWeight()
                            .doubleValue()) {
                    value = -1;
                }
                else if (pTariffRateAdminDto1.getMinimumWeight().doubleValue() < pTariffRateAdminDto2
                            .getMinimumWeight().doubleValue()) {
                    value = 1;
                }
                else {
                    value = 0;
                }
            }
        }

        return value;
    }

}
