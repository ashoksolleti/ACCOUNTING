package com.unisys.trans.logistics.lms.utils.dto.ucs;

import java.io.Serializable;

/**
 * <code>ServiceHourDto</code> contain details of Service Hour. This contains
 * the following attributes:
 * <ul>
 * <li>allDayOpenInd
 * <li>closedIndicator
 * <li>closeHour
 * <li>formattedString
 * <li>officeTimes
 * <li>openCloseInd
 * <li>openHour
 * </ul>
 */
public class ServiceHourDto implements Serializable {

    /**
     * Generated serial version added. add a valid serial version id.
     */
    private static final long serialVersionUID = 8917122412528392330L;

    /**
     * Attribute to Hold the<code>allDayOpenInd</code>.
     */
    private Boolean allDayOpenInd;

    /**
     * Attribute to Hold the<code>checkOtherInd</code>.
     */
    private boolean checkOtherInd;

    /**
     * Attribute to Hold the<code>closedIndicator</code>.
     */
    private Boolean closedIndicator;

    /**
     * Attribute to Hold the<code>closeHour</code>.
     */
    private String closeHour;

    /**
     * Attribute to Hold the<code>formattedString</code>.
     */
    private String formattedString;

    /**
     * Attribute to Hold the<code>officeTimes</code>.
     */
    private String officeTimes;

    /**
     * Attribute to Hold the<code>openCloseInd</code>.
     */
    private Boolean openCloseInd;

    /**
     * Attribute to Hold the<code>openHour</code>.
     */
    private String openHour;

    /**
     * Attribute to Hold the<code>openCloseInd</code>.
     */
    private Boolean otherInputInd;

    /**
     * Gets the <code>allDayOpenInd</code> property.
     * <p>
     * 
     * @return the current value of <code>allDayOpenInd</code> property.
     */
    public Boolean getAllDayOpenInd() {
        return this.allDayOpenInd;
    }

    /**
     * Gets the <code>closedIndicator</code> property.
     * <p>
     * 
     * @return the current value of <code>closedIndicator</code> property.
     */
    public Boolean getClosedIndicator() {
        return this.closedIndicator;
    }

    /**
     * Gets the <code>closeHour</code> property.
     * <p>
     * 
     * @return the current value of <code>closeHour</code> property.
     */
    public String getCloseHour() {
        return this.closeHour;
    }

    /**
     * Gets the <code>String</code> property.
     * <p>
     * 
     * @return the current value of <code>formattedString</code> property.
     */
    public String getFormattedString() {
        final StringBuffer newString = new StringBuffer();

        if (this.getOtherInputInd() != null && this.getOtherInputInd()
                    && this.getOpenHour() != null && !this.getOpenHour().isEmpty()) {

            final String[] theSplittedOTime = this.getOpenHour().split(" ");

            if (theSplittedOTime.length == 1) {

                newString.append(theSplittedOTime[0] == null ? ""
                            : theSplittedOTime[0]);
            }
            else if (theSplittedOTime.length == 2) {

                newString.append(theSplittedOTime[0] == null ? ""
                            : theSplittedOTime[0]);
                newString.append("\n <br/>");
                newString.append(theSplittedOTime[1] == null ? ""
                            : theSplittedOTime[1]);
            }
            // SuppressOff:MagicNumber
            else if (theSplittedOTime.length == 3) {

                newString.append(theSplittedOTime[0] == null ? ""
                            : theSplittedOTime[0]);
                newString.append("\n <br/>");
                newString.append(theSplittedOTime[1] == null ? ""
                            : theSplittedOTime[1]);
                newString.append("\n <br/>");
                newString.append(theSplittedOTime[2] == null ? ""
                            : theSplittedOTime[2]);
            }
        }
        else if (this.getOtherInputInd() != null
                    && this.getOtherInputInd()
                    && this.getOpenHour() == null) {
            newString.append("");
        }
        else {
            if (this.getAllDayOpenInd() != null) {
                newString
                            .append((this.getAllDayOpenInd()) ? "24 hour Open"
                                        : "Closed");
            }
        }
        this.formattedString = newString.toString();
        return this.formattedString;
    }

    /**
     * Gets the <code>openCloseInd</code> property.
     * <p>
     * 
     * @return the current value of <code>openCloseInd</code> property.
     */
    public Boolean getOpenCloseInd() {
        return this.openCloseInd;
    }

    /**
     * Gets the <code>openHour</code> property.
     * <p>
     * 
     * @return the current value of <code>openHour</code> property.
     */
    public String getOpenHour() {
        return this.openHour;
    }

    /**
     * Gets the <code>otherInputInd</code> property.
     * <p>
     * 
     * @return the current value of <code>otherInputInd</code> property.
     */
    public Boolean getOtherInputInd() {
        return this.otherInputInd;
    }

    /**
     * Gets the <code>checkOtherInd</code> property.
     * <p>
     * 
     * @return the current value of <code>checkOtherInd</code> property.
     */
    public boolean isCheckOtherInd() {
        return this.checkOtherInd;
    }

    /**
     * Sets the <code>allDayOpenInd</code> property.
     * 
     * @param pAllDayOpenInd
     *            holds the value of the allDayOpenInd to set.
     */
    public void setAllDayOpenInd(final Boolean pAllDayOpenInd) {
        this.allDayOpenInd = pAllDayOpenInd;
    }

    /**
     * Sets the <code>checkOtherInd</code> property.
     * 
     * @param pCheckOtherInd
     *            holds the value of the checkOtherInd to set.
     */
    public void setCheckOtherInd(final boolean pCheckOtherInd) {
        this.checkOtherInd = pCheckOtherInd;
    }

    /**
     * Sets the <code>closedIndicator</code> property.
     * 
     * @param pClosedIndicator
     *            holds the value of the closedIndicator to set.
     */
    public void setClosedIndicator(final Boolean pClosedIndicator) {
        this.closedIndicator = pClosedIndicator;
    }

    /**
     * Sets the <code>closeHour</code> property.
     * 
     * @param pCloseHour
     *            holds the value of the closeHour to set.
     */
    public void setCloseHour(final String pCloseHour) {
        this.closeHour = pCloseHour;
    }

    /**
     * Sets the <code>formattedString</code> property.
     * 
     * @param pFormattedString
     *            holds the value of the formattedString to set.
     */
    public void setFormattedString(final String pFormattedString) {
        this.formattedString = pFormattedString;
    }

    /**
     * Sets the <code>openCloseInd</code> property.
     * 
     * @param pOpenCloseInd
     *            holds the value of the openCloseInd to set.
     */
    public void setOpenCloseInd(final Boolean pOpenCloseInd) {
        this.openCloseInd = pOpenCloseInd;
    }

    /**
     * Sets the <code>openHour</code> property.
     * 
     * @param pOpenHour
     *            holds the value of the openHour to set.
     */
    public void setOpenHour(final String pOpenHour) {
        this.openHour = pOpenHour;
    }

    /**
     * Sets the <code>otherInputInd</code> property.
     * 
     * @param pOtherInputInd
     *            holds the value of the otherInputInd to set.
     */
    public void setOtherInputInd(final Boolean pOtherInputInd) {
        this.otherInputInd = pOtherInputInd;
    }

}
