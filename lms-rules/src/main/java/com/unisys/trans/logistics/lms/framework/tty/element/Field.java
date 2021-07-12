package com.unisys.trans.logistics.lms.framework.tty.element;

import java.util.List;
/**
 *
 * 014-12345675/MSPORD/T5K22. This line has 3 fields (014-12345675,
 * MSPORD, T5K22) {@link Line} Lines and Fields are shipped to individual {@link MessageDelegate} for every
 * teletype message
 */
public class Field {
    /**
     * Attribute to hold <code>content</code> property.
     */
    private String content;

    /**
     * <code>Parameterised constructor.</code>
     */

    public Field(final String pContent) {
        this.setContent(pContent);
    }
	// LMSC-11111 UIS158 Start
    /**
     * <code>Parameterized constructor for CWIS message building.</code>
     */
    public Field(final String pContent,boolean pCwisInd) {

        if (pContent != null && pCwisInd) {
            this.setContent(pContent);
        }
        else if(pContent != null) {
            this.setContent(pContent.trim());

        }
    }
    // LMSC-11111 UIS158 End

    /**
     * Used to convert integer to string.
     * 
     * 
     * @param pFieldList holds the list of fields.
     *            * @param pIndex holds the indexes.
     *            <p>
     * @return content
     */

    public static String getContentFromList(final List<Field> pFieldList, final int pIndex) {
        String content = null;
        if (pFieldList != null && pFieldList.size() > pIndex) {
            content = pFieldList.get(pIndex).getContent();
        }
        return content;
    }

    /**
     * Gets the <code>Content</code> property.
     * <p>
     * 
     * @return the current value of the <code>Content</code> property.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * Sets the <code>Content</code> property.
     * <p>
     * 
     * @param pContent
     *            holds the new value of <code>Content</code>.<br>
     */

    public void setContent(final String pContent) {
        this.content = pContent;
    }

}
