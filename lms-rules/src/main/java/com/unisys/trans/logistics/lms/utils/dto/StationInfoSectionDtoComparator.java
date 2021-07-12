package com.unisys.trans.logistics.lms.utils.dto;

import java.io.Serializable;
import java.util.Comparator;

public class StationInfoSectionDtoComparator implements Comparator<StationInfoSectionLabelDto>,
            Serializable {

    /**
     * Generated Serial VersionId.
     */
    private static final long serialVersionUID = 1L;
    
    @Override
    public int compare(final StationInfoSectionLabelDto pObj1, final StationInfoSectionLabelDto pObj2) {
        int result = 0;
        if (pObj1.getOrder() > pObj2.getOrder()) {
            result = 1;
        }
        else if (pObj1.getOrder() < pObj2.getOrder()) {
            result = -1;
        }

        return result;
    }
}
