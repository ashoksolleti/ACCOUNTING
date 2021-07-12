package com.unisys.trans.logistics.lms.framework.tty.element;

import java.util.ArrayList;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.mhs.parser.Parser;
/**
 * {@link Line} represents a single line in a teletype message. Lines are
 * derived by splitting the message by carriage return and line feed.
 * 
 * Lines contain fields. They are sent to {@link MessageDelegate} and {@link Parser} for parsing them into
 * intelligible {@link Element}
 * 
 */
public class Line {
    /**
     * Attribute to hold <code>SLASH</code> property.
     */
	private static final String SLASH = "/";

    private boolean continuationLine;

    /**
     * Attribute to hold <code>lineFields</code> property.
     */
    private List<Field> lineFields = new ArrayList<Field>();

    /**
     * Default constructor
     */
    public Line() {
        super();
    }

    // LMSC-11111 UIS158 Start
	public Line(final String pLine,final boolean pIncoming) {
		final String[] fieldSet = pLine.split(SLASH);
		for (final String field : fieldSet) {
			this.lineFields.add(new Field(field,!pIncoming));
		}
	}
	// LMSC-11111 UIS158 End

	public void addCWISLineField(final String pContent) {
        this.lineFields.add(new Field(pContent,true));
    }

    public Line(final String pLine) {
        final String[] fieldSet = pLine.split(SLASH);
        for (final String field : fieldSet) {
            this.lineFields.add(new Field(field));
        }
    }

    public void addLineField(final String pContent) {
        this.lineFields.add(new Field(pContent));
    }

    /**
     * Gets the <code>FieldAsString</code> property.
     * <p>
     * 
     * @return the current value of the <code>FieldAsString</code> property.
     */
    public String getFieldAsString(final int pIndex) {
        return this.lineFields.get(pIndex).getContent();
    }

    /**
     * Gets the <code>LineFields</code> property.
     * <p>
     * 
     * @return the current value of the <code>LineFields</code> property.
     */

    public List<Field> getLineFields() {
        return this.lineFields;
    }

    /**
     * Gets the <code>AdditionalLine</code> property.
     * <p>
     * 
     * @return the current value of the <code>AdditionalLine</code> property.
     */

    public boolean isAdditionalLine() {
    	  if (this.lineFields != null && this.lineFields.get(0).getContent().equals("")) {
              return true;
          }
          return false;
    }

    /**
     * Gets the <code>continuationLine</code> property.
     * <p>
     * 
     * @return the current value of the <code>continuationLine</code> property.
     */
    public boolean isContinuationLine() {
        return continuationLine;
    }

    /**
     * Sets the <code>continuationLine</code> property.
     * <p>
     * 
     * @param pContinuationLine
     *            holds the new value of <code>continuationLine</code>.<br>
     */
    public void setContinuationLine(final boolean pContinuationLine) {
        this.continuationLine = pContinuationLine;
    }

    /**
     * Sets the <code>LineFields</code> property.
     * <p>
     * 
     * @param pLineFields
     *            holds the new value of <code>LineFields</code>.<br>
     */
    public void setLineFields(final List<Field> pLineFields) {
        this.lineFields = pLineFields;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        if (this.isContinuationLine()) {
            builder.append(SLASH);
        }
        for (int i = 0; i < this.lineFields.size(); i++) {
            final Field aField = this.lineFields.get(i);
            if (aField.getContent() != null) {
                builder.append(aField.getContent());
            }
            if (i < this.lineFields.size() && i != this.lineFields.size() - 1) {
                builder.append(SLASH);
            }
        }
        return builder.toString();
    }

}
