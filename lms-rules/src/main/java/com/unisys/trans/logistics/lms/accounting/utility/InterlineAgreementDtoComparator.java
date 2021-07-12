/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.accounting.utility;

import java.io.Serializable;
import java.util.Comparator;

import com.unisys.trans.logistics.lms.accounting.dto.InterlineAgreementsEntryDto;
import com.unisys.trans.logistics.lms.accounting.dto.constants.AgreementType;

/**
 * <code>InterlineAgreementDtoComparator</code> contains the comparison methods for
 * comparing two different objects.
 * <p>
 * This performs the following functions:<br>
 * <ul>
 * <li>Compares the given object.</li>
 * </ul>
 */

public class InterlineAgreementDtoComparator implements Comparator<InterlineAgreementsEntryDto>,
            Serializable {

    /**
     * Generated Serial VersionId.
     */
    private static final long serialVersionUID = -3834819271981968160L;

    /**
     * This method is invoked on execution of the sort method of Collections.
     * <p>
     * 
     * @param pInterlineAgreementsEntryDto1
     *            <code>Object</code><br>
     *            contains the current object.
     *            <p>
     * @param pInterlineAgreementsEntryDto2
     *            <code>Object</code><br>
     *            contains the object to be compared.
     * @return <code>int</code>
     */
    @Override
    public int compare(final InterlineAgreementsEntryDto pInterlineAgreementsEntryDto1,
                final InterlineAgreementsEntryDto pInterlineAgreementsEntryDto2) {

        int aValue = 0;
        if (pInterlineAgreementsEntryDto1.getAgreementType().equals(AgreementType.PRORATE)
                    && pInterlineAgreementsEntryDto2.getAgreementType().equals(AgreementType.PRORATE)) {
            if (pInterlineAgreementsEntryDto1.getProrateId() != null
                        && pInterlineAgreementsEntryDto2.getProrateId() != null) {
                if (pInterlineAgreementsEntryDto1.getProrateId() == null) {
                    aValue = -1;
                }
                else if (pInterlineAgreementsEntryDto2.getProrateId() == null) {
                    aValue = 1;
                }
                else {
                    if (pInterlineAgreementsEntryDto1.getProrateId() > (pInterlineAgreementsEntryDto2
                                .getProrateId())) {
                        aValue = 1;
                    }
                    else if (pInterlineAgreementsEntryDto1.getProrateId() < (pInterlineAgreementsEntryDto2
                                .getProrateId())) {
                        aValue = -1;
                    }
                    else {
                        aValue = 0;
                    }
                }
            }
        }

        if (pInterlineAgreementsEntryDto1.getAgreementType().equals(AgreementType.PROVISO)
                    && pInterlineAgreementsEntryDto2.getAgreementType().equals(AgreementType.PROVISO)) {
            if (pInterlineAgreementsEntryDto1.getProrateId() != null
                        && pInterlineAgreementsEntryDto2.getProrateId() != null) {
                if (pInterlineAgreementsEntryDto1.getProrateId() == null) {
                    aValue = -1;
                }
                else if (pInterlineAgreementsEntryDto2.getProrateId() == null) {
                    aValue = 1;
                }
                else {
                    if (pInterlineAgreementsEntryDto1.getProrateId() > (pInterlineAgreementsEntryDto2
                                .getProrateId())) {
                        aValue = 1;
                    }
                    else if (pInterlineAgreementsEntryDto1.getProrateId() < (pInterlineAgreementsEntryDto2
                                .getProrateId())) {
                        aValue = -1;
                    }
                    else {
                        aValue = 0;
                    }
                }
            }
        }

        return aValue;

    }
}
