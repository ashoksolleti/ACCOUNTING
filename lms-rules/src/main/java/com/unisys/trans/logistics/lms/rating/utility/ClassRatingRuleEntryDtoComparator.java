/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.rating.utility;

import java.io.Serializable;
import java.util.Comparator;

import com.unisys.trans.logistics.lms.rating.dto.ClassRatingRuleEntryDto;

/**
 * <code>ClassRatingRuleEntryDtoComparator</code> contains the comparison methods for the comparing two
 * different
 * objects.
 * <p>
 * This performs the following functions:<br>
 * <ul>
 * <li>Compares the given object.</li>
 * </ul>
 */

public class ClassRatingRuleEntryDtoComparator implements Comparator<ClassRatingRuleEntryDto>, Serializable {

    /**
     * Generated Serial VersionId.
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method is invoked on execution of the sort method of Collections.
     * <p>
     * 
     * @param pClassRatingRuleEntryDto1 <code>Object</code><br>
     *            contains the current object.
     *            <p>
     * @param pClassRatingRuleEntryDto2 <code>Object</code><br>
     *            contains the object to be compared.
     * @return <code>int</code>
     */
    // BR 22 Sorts class rating rule entries
    @Override
    public int compare(final ClassRatingRuleEntryDto pClassRatingRuleEntryDto1,
                final ClassRatingRuleEntryDto pClassRatingRuleEntryDto2) {
        int value = 0;

        if (pClassRatingRuleEntryDto1.getIataDispPriority() == 0) {
            if (pClassRatingRuleEntryDto2.getIataDispPriority() != 0) {
                value = -1;
            }
        }
        else if (pClassRatingRuleEntryDto2.getIataDispPriority() == 0) {
            if (pClassRatingRuleEntryDto1.getIataDispPriority() != 0) {
                value = 1;
            }
        }
        else if (pClassRatingRuleEntryDto1.getIataDispPriority() == 0
                    && pClassRatingRuleEntryDto2.getIataDispPriority() == 0) {
            if (value == 0) {
                if (pClassRatingRuleEntryDto1.getIataDispPriority() > pClassRatingRuleEntryDto2
                            .getIataDispPriority()) {
                    value = 1;
                }
                else if (pClassRatingRuleEntryDto2.getIataDispPriority() > pClassRatingRuleEntryDto1
                            .getIataDispPriority()) {
                    value = -1;
                }
                else {
                    value = 0;
                }
            }
        }
        else {
            value=0;
        }
        if (value == 0) {
            if (pClassRatingRuleEntryDto1.getOriDstDisplayPriority() != 0
                        || pClassRatingRuleEntryDto2.getOriDstDisplayPriority() != 0) {
                /*if (pClassRatingRuleEntryDto1.getOriDstDisplayPriority() == 0) {
                    value = 1;
                }
                else if (pClassRatingRuleEntryDto2.getOriDstDisplayPriority() == 0) {
                    value = -1;
                }
                else {
                    if (pClassRatingRuleEntryDto1.getOriDstDisplayPriority() > pClassRatingRuleEntryDto2
                                .getOriDstDisplayPriority()) {
                        value = -1;

                    }
                    else if (pClassRatingRuleEntryDto1.getOriDstDisplayPriority() < pClassRatingRuleEntryDto2
                                .getOriDstDisplayPriority()) {
                        value = 1;
                    }
                    else {
                        value = 0;
                    }
                }*/
            	if (pClassRatingRuleEntryDto1.getOriDstDisplayPriority() > pClassRatingRuleEntryDto2.getOriDstDisplayPriority()){
            		value= 1;
        		}
        		else if (pClassRatingRuleEntryDto1.getOriDstDisplayPriority() < pClassRatingRuleEntryDto2.getOriDstDisplayPriority()){
        			value = -1;
        		}
            }
        }

        if (value == 0) {
            if (pClassRatingRuleEntryDto1.getOrigin().getCode() != null
                        || pClassRatingRuleEntryDto2.getOrigin().getCode() != null) {
                if (pClassRatingRuleEntryDto1.getOrigin().getCode() != null
                            || pClassRatingRuleEntryDto2.getOrigin().getCode() != null) {
                    if (pClassRatingRuleEntryDto1.getOrigin().getCode() == null) {
                        value = -1;
                    }
                    else if (pClassRatingRuleEntryDto2.getOrigin().getCode() == null) {
                        value = 1;
                    }
                    else {
                        value =
                                    pClassRatingRuleEntryDto1.getOrigin().getCode()
                                                .compareTo(pClassRatingRuleEntryDto2.getOrigin().getCode());
                    }

                }

            }
        }
        if (value == 0) {
            if (pClassRatingRuleEntryDto1.getDestination().getCode() != null
                        || pClassRatingRuleEntryDto2.getDestination().getCode() != null) {
                if (pClassRatingRuleEntryDto1.getDestination().getCode() != null
                            || pClassRatingRuleEntryDto2.getDestination().getCode() != null) {
                    if (pClassRatingRuleEntryDto1.getDestination().getCode() == null) {
                        value = -1;
                    }
                    else if (pClassRatingRuleEntryDto2.getDestination().getCode() == null) {
                        value = 1;
                    }
                    else {
                        value =
                                    pClassRatingRuleEntryDto1
                                                .getDestination()
                                                .getCode()
                                                .compareTo(
                                                    pClassRatingRuleEntryDto2.getDestination().getCode());
                    }

                }

            }
        }

        if (value == 0) {
            if (pClassRatingRuleEntryDto1.getRatingRuleType() != null
            || pClassRatingRuleEntryDto2.getRatingRuleType() != null) {
                if (pClassRatingRuleEntryDto1.getRatingRuleType() == null
                            && pClassRatingRuleEntryDto2.getRatingRuleType() != null) {
                    value = -1;
                }
                else if (pClassRatingRuleEntryDto2.getRatingRuleType() == null
                            && pClassRatingRuleEntryDto1.getRatingRuleType() != null) {
                    value = 1;
                }
                else {
                    if (pClassRatingRuleEntryDto2.getRatingRuleType() != null
                                && pClassRatingRuleEntryDto1.getRatingRuleType() != null) {
                        value =
                                    pClassRatingRuleEntryDto1.getRatingRuleType()
                                                .compareTo(pClassRatingRuleEntryDto2.getRatingRuleType());
                    }
                    else {
                        value = 0;
                    }
                }
            }
        }
        if (value == 0) {
            if (pClassRatingRuleEntryDto1.getMinimumWeight() != null
            || pClassRatingRuleEntryDto2.getMinimumWeight() != null) {
                if (pClassRatingRuleEntryDto1.getMinimumWeight() == null) {
                    value = -1;
                }
                else if (pClassRatingRuleEntryDto2.getMinimumWeight() == null) {
                    value = 1;
                }
                else {
                    if (pClassRatingRuleEntryDto1.getMinimumWeight().doubleValue() > pClassRatingRuleEntryDto2
                                .getMinimumWeight()
                                .doubleValue()) {
                        value = 1;
                    }
                    else if (pClassRatingRuleEntryDto1.getMinimumWeight().doubleValue() < pClassRatingRuleEntryDto2
                                .getMinimumWeight().doubleValue()) {
                        value = -1;
                    }
                    else {
                        value = 0;
                    }
                }
            }
        }
        if (value == 0) {
            if ((pClassRatingRuleEntryDto1.getDateRangeDto() != null && pClassRatingRuleEntryDto1
                        .getDateRangeDto()
                        .getEffectiveDate() != null)
            || (pClassRatingRuleEntryDto2.getDateRangeDto() != null && pClassRatingRuleEntryDto2
                        .getDateRangeDto()
                        .getEffectiveDate() != null)) {
                if (pClassRatingRuleEntryDto1.getDateRangeDto() == null
                            || pClassRatingRuleEntryDto1.getDateRangeDto()
                                        .getEffectiveDate() == null) {
                    value = -1;
                }
                else if (pClassRatingRuleEntryDto2.getDateRangeDto() == null
                            || pClassRatingRuleEntryDto2.getDateRangeDto()
                                        .getEffectiveDate() == null) {
                    value = 1;
                }
                else {
                    value = pClassRatingRuleEntryDto1.getDateRangeDto().getEffectiveDate().compareTo(
                        pClassRatingRuleEntryDto2.getDateRangeDto().getEffectiveDate());
                    if (value < 0) {
                        value = -1;
                    }
                    else if (value > 0) {
                        value = 1;
                    }
                }
            }
        }

        /*
         * 
         * 
         * if (pClassRatingRuleEntry1.getIataDispPriority() < pClassRatingRuleEntry2.getIataDispPriority()) {
         * value = -1;
         * }
         * else if (pClassRatingRuleEntry1.getIataDispPriority() < pClassRatingRuleEntry2
         * .getIataDispPriority()) {
         * value = 1;
         * }
         * else {
         * value = 0;
         * }
         * 
         * if (value == 0 && (pClassRatingRuleEntry1.getRateTypeCode() != null
         * || pClassRatingRuleEntry2.getRateTypeCode() != null)) {
         * if (pClassRatingRuleEntry1.getRateTypeCode() == null) {
         * value = -1;
         * }
         * else if (pClassRatingRuleEntry2.getRateTypeCode() == null) {
         * value = 1;
         * }
         * else {
         * value =
         * pClassRatingRuleEntry1.getRateTypeCode()
         * .compareTo(pClassRatingRuleEntry2.getRateTypeCode());
         * }
         * }
         * if (value == 0) {
         * if (pClassRatingRuleEntry1.getOriDstDisplayPriority() > pClassRatingRuleEntry2
         * .getOriDstDisplayPriority()) {
         * value = 1;
         * }
         * else if (pClassRatingRuleEntry1.getOriDstDisplayPriority() < pClassRatingRuleEntry2
         * .getOriDstDisplayPriority()) {
         * value = -1;
         * }
         * else {
         * value = 0;
         * }
         * }
         * 
         * if (value == 0 && (pClassRatingRuleEntry1.getOrigin() != null
         * || pClassRatingRuleEntry2.getOrigin() != null)) {
         * if (pClassRatingRuleEntry1.getOrigin().getCode() == null) {
         * value = -1;
         * }
         * else if (pClassRatingRuleEntry2.getOrigin().getCode() == null) {
         * value = 1;
         * }
         * 
         * else {
         * value =
         * pClassRatingRuleEntry1.getOrigin().getCode()
         * .compareTo(pClassRatingRuleEntry2.getOrigin().getCode());
         * }
         * }
         * 
         * if (value == 0 && (pClassRatingRuleEntry1.getDestination() != null
         * || pClassRatingRuleEntry2.getDestination() != null)) {
         * if (pClassRatingRuleEntry1.getDestination().getCode() == null) {
         * value = -1;
         * }
         * else if (pClassRatingRuleEntry2.getDestination().getCode() == null) {
         * value = 1;
         * }
         * 
         * else {
         * value =
         * pClassRatingRuleEntry1.getDestination().getCode()
         * .compareTo(pClassRatingRuleEntry2.getDestination().getCode());
         * }
         * }
         * 
         * if (value == 0 && (pClassRatingRuleEntry1.getRatingRuleType() != null
         * || pClassRatingRuleEntry2.getRatingRuleType() != null)) {
         * if (pClassRatingRuleEntry1.getRatingRuleType() != null
         * && pClassRatingRuleEntry1.getRatingRuleType().getRatingRuleType() == null) {
         * value = -1;
         * }
         * else if (pClassRatingRuleEntry2.getRatingRuleType() != null
         * && pClassRatingRuleEntry2.getRatingRuleType() == null) {
         * value = 1;
         * }
         * 
         * }
         * else if (pClassRatingRuleEntry1.getRatingRuleType() != null
         * && pClassRatingRuleEntry2.getRatingRuleType() != null) {
         * value =
         * pClassRatingRuleEntry1
         * .getRatingRuleType()
         * .getRatingRuleType()
         * .compareTo(
         * pClassRatingRuleEntry2.getRatingRuleType().getRatingRuleType());
         * }
         * if (value == 0 && (pClassRatingRuleEntry1.getMinimumWeight() != null
         * || pClassRatingRuleEntry2.getMinimumWeight() != null)) {
         * if (pClassRatingRuleEntry1.getMinimumWeight() != null) {
         * value = -1;
         * }
         * else if (pClassRatingRuleEntry2.getMinimumWeight() != null) {
         * value = 1;
         * }
         * 
         * else {
         * value =
         * pClassRatingRuleEntry1.getMinimumWeight().compareTo(
         * pClassRatingRuleEntry2.getMinimumWeight());
         * }
         * }
         */

        return value;
    }
}
