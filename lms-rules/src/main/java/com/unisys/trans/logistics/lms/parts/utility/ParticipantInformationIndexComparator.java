
package com.unisys.trans.logistics.lms.parts.utility;

import java.io.Serializable;
import java.util.Comparator;

import com.unisys.trans.logistics.lms.parts.dto.ParticipantNotificationDto;

public class ParticipantInformationIndexComparator implements
        Comparator<ParticipantNotificationDto>, Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Override
    public int compare(ParticipantNotificationDto o1,
                       ParticipantNotificationDto o2) {
        if (Integer.parseInt(o1.getRowIndex()) > Integer.parseInt(o2
                .getRowIndex())) {
            return 1;
        } else {
            return -1;
        }
    }

}
