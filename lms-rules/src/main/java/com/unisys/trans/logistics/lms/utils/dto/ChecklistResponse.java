package com.unisys.trans.logistics.lms.utils.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractResponse;

/**
 * <code>ChecklistResponse</code> is used to find and store checklists.
 * 
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li><code>checklistValues
 * <li>message
</code>
 * </ul>
 */
public class ChecklistResponse extends AbstractResponse {

    /**
     * 
     */
    private static final long serialVersionUID = 5978993506157995350L;

    private String checklistValues;

    private String message;

    public String getChecklistValues() {
        return this.checklistValues;
    }

    public String getMessage() {
        return this.message;
    }

    public void setChecklistValues(String pChecklistValues) {
        this.checklistValues = pChecklistValues;
    }

    public void setMessage(String pMessage) {
        this.message = pMessage;
    }
}
