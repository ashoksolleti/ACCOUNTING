package com.unisys.trans.logistics.lms.framework.tty.element;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import com.unisys.trans.logistics.lms.framework.constants.FrameworkConstants;
import com.unisys.trans.logistics.lms.framework.constants.MHSMessageConstants;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

/**
 * <code>MessageHeaderElement</code> contains the message header type elements.
 * <p>
 * This contains the following methods:
 * <ul>
 * <li>fromAddr
 * <li>messageElements
 * <li>messageIdentifier
 * <li>messageStartIndex
 * <li>messageVersion
 * <li>toAddrs
 * </ul>
 */

public class MessageHeaderElement extends Element implements MultiLineElement {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 3916700218992147569L;

    /**
     * Attribute to hold <code>SPACE</code> property.
     */
    private static final String SPACE = " ";

    /**
     * Attribute to hold <code>creationDate</code> property.
     */
    private String creationDate;

    /**
     * Attribute to hold <code>creationTime</code> property.
     */
    private String creationTime;

    private boolean customsInd;

    private String doubleSignarure;

    /**
     * Attribute to hold <code>fromAddr</code> property.
     */
    private String fromAddr;

    /**
     * Attribute to hold <code>messageElements</code> property.
     */
    private List<Object> messageElements;

    /**
     * Attribute to hold <code>messageIdentifier</code> property.
     */
    private String messageIdentifier;

    /**
     * Attribute to hold <code>messagePriority</code> property.
     */
    private String messagePriority;

    /**
     * Attribute to hold <code>messageStartIndex</code> property.
     */
    private int messageStartIndex;

    /**
     * Attribute to hold <code>AUTO/MANUAL</code> property.
     */

    private String messageTriggerIdentifier;

    /**
     * Attribute to hold <code>messageVersion</code> property.
     */
    private Double messageVersion;

    /**
     * Attribute to hold <code>messageVersion</code> property.
     */
    private String originalMessageVersion;

    /**
     * Attribute to hold <code>messageVersion</code> property.
     */
    private String pdmIdentifier;

    /**
     * TTY message priority. temp hard coded as QK. The priority should be
     * derived from the messageIdentifier.
     */
    private String priority = "QK";
    
    private String aRQMEventID;

    /**
     * Attribute to hold <code>sender</code> property.
     */
    private String sender;

    /**
     * Attribute to hold <code>sequenceNumber</code> property.
     */
    private String sequenceNumber;

    // MH007 code
    /**
     * Attribute to hold <code>toAddress</code> property.
     */
    private List<String> toAddress = new ArrayList<String>();

    /**
     * Attribute to hold <code>toAddrs</code> property.
     */
    private List<String> toAddrs;

    /**
     * Attribute to hold <code>tprAddr</code> property.
     */
    private String tprAddr;

    private static String adjustNumericTextToGivenWidthWithZero(
                final String pInput, final int pLength) {
        String aProcessedString = pInput;
        char aZeroString = '0';
        if (aProcessedString == null) {
            aProcessedString = "";
        }
        if (aProcessedString.length() > pLength) {
            aProcessedString = aProcessedString.substring(0, pLength);
        }
        else if (aProcessedString.length() < pLength) {
            aProcessedString = leftPadCharacters(aProcessedString, pLength,
                aZeroString);
        }
        return aProcessedString;

    }

    // MH007 code starts

    /**
     * Used to pad a specific character to the left of the string for the
     * required length.
     * <p>
     * 
     * @param pCode
     *            holds the string to which a character is to be padded to the
     *            left.
     * @param plength
     *            holds the required length of the string.
     * @param pAppendCharacter
     *            holds the character that needs to be padded to the left.
     *            <p>
     * @return the string with the padded characters.
     */
    private static String leftPadCharacters(final String pCode,
                final int plength, final char pAppendCharacter) {
        String aCode = pCode;
        if (aCode.length() < plength) {
            for (int i = aCode.length(); i < plength; i++) {
                aCode = String.valueOf(pAppendCharacter).concat(aCode);
            }
        }
        return aCode;
    }

    @Override
    public List<Line> buildElement() {
        return this.buildLines();
    }

    // MH007 code ends
    /**
     * Used to build the lines.
     * 
     * 
     * <p>
     * 
     * @return the headerLine.
     */

    public List<Line> buildLines() {

        final List<Line> headerLine = new ArrayList<Line>();

        // to address Line
        final Line toAddressLine = new Line();
        final StringBuilder anToAddress = new StringBuilder();
        anToAddress.append(FrameworkConstants.SOH);
        anToAddress.append(SPACE);
        if (!this.isCustomsInd()) {
            anToAddress.append(this.priority);
            anToAddress.append(SPACE);
        }
        for (final String ttyaddress : this.toAddrs) {
            anToAddress.append(ttyaddress);
            anToAddress.append(SPACE);
        }

        toAddressLine.addLineField(anToAddress.toString());
        headerLine.add(toAddressLine);

        // Originator address Line
        final Line fromAddressLine = new Line();
        final StringBuilder fromAddress = new StringBuilder();
        fromAddress.append(".");
        fromAddress.append(this.fromAddr);
        if (!this.isCustomsInd()) {
            fromAddress.append(SPACE);

            if (null != this.doubleSignarure) {
                fromAddress.append(this.doubleSignarure);
                fromAddress.append("/");
            }

            final Calendar calendar = this.getTimeStamp();
            String aDayOfMonth = "" + calendar.get(Calendar.DAY_OF_MONTH);
            if (aDayOfMonth.length() < 2) {
                aDayOfMonth = "0" + aDayOfMonth;
            }
            String anHourOfDay = "" + calendar.get(Calendar.HOUR_OF_DAY);
            if (anHourOfDay.length() < 2) {
                anHourOfDay = "0" + anHourOfDay;
            }
            String aMinute = "" + calendar.get(Calendar.MINUTE);
            if (aMinute.length() < 2) {
                aMinute = "0" + aMinute;
            }
            fromAddress.append(aDayOfMonth);
            fromAddress.append(anHourOfDay);
            fromAddress.append(aMinute);
        }
        if (this.getTprAddr() != null) {
            fromAddress.append(SPACE);
            fromAddress.append(this.getTprAddr());
        }
        fromAddressLine.addLineField(fromAddress.toString());

        headerLine.add(fromAddressLine);
        if (this.isCustomsInd()) {
            if (this.pdmIdentifier != null) {
                final Line aPdmIdentifier = new Line();
                final List<Field> pdmIdentifierFields = new ArrayList<Field>();
                pdmIdentifierFields.add(new Field(this.pdmIdentifier));
                aPdmIdentifier.setLineFields(pdmIdentifierFields);
                headerLine.add(aPdmIdentifier);
            }
        }
        // Message Identifier
        final Line msgIdentifier = new Line();
        final List<Field> msgIdentifierFields = new ArrayList<Field>();
        msgIdentifierFields.add(new Field(FrameworkConstants.STX + this.messageIdentifier));
        if (!this.isCustomsInd()) {
            if (this.messageVersion != null) {
                msgIdentifierFields.add(new Field(Double
                            .toString(this.messageVersion)));
            }
        }
        msgIdentifier.setLineFields(msgIdentifierFields);
        headerLine.add(msgIdentifier);

        return headerLine;
    }
    // LMSC-11111 UIS158 Start
    public List<Line> buildBCFLines(){

	    final List<Line> headerLine = new ArrayList<Line>();
	
	    if (this.isCustomsInd()) {
	        if (this.pdmIdentifier != null) {
	            final Line aPdmIdentifier = new Line();
	            final List<Field> pdmIdentifierFields = new ArrayList<Field>();
	            pdmIdentifierFields.add(new Field(this.pdmIdentifier));
	            aPdmIdentifier.setLineFields(pdmIdentifierFields);
	            headerLine.add(aPdmIdentifier);
	        }
	    }
	    // Message Identifier
	    final Line msgIdentifier = new Line();
	    final List<Field> msgIdentifierFields = new ArrayList<Field>();
	    msgIdentifierFields.add(new Field(FrameworkConstants.STX + this.messageIdentifier));
	    if (!this.isCustomsInd()) {
	        if (this.messageVersion != null) {
	            msgIdentifierFields.add(new Field(Double
	                    .toString(this.messageVersion)));
	        }
	    }
	    msgIdentifier.setLineFields(msgIdentifierFields);
        headerLine.add(msgIdentifier);

        return headerLine;
    }
    // LMSC-11111 UIS158 End

    public List<Line> buildMHLines() {
        List<Line> aHeaderLineList = new ArrayList<Line>();
        Line aHeaderLine = new Line();

        final StringBuilder toAdderss = new StringBuilder();
        toAdderss.append(MHSMessageConstants.DEFAULT_PRIORITY);
        toAdderss.append(MHSMessageConstants.SPACE);
        for (final String toAddr : this.toAddress) {
            toAdderss.append(toAddr);

        }
        aHeaderLine.addLineField(toAdderss.toString());
        aHeaderLineList.add(aHeaderLine);

        // Originator address Line
        final Line fromAddressLine = new Line();
        final StringBuilder fromAdderss = new StringBuilder();
        fromAdderss.append(MHSMessageConstants.DOT);
        fromAdderss.append(this.getFromAddr());
        fromAdderss.append(MHSMessageConstants.SPACE);

        if (this.getDoubleSignarure() != null) {
            fromAdderss.append(this.getDoubleSignarure());
            fromAdderss.append(MHSMessageConstants.SLASH);
        }

        final Calendar calendar = Calendar.getInstance(
            TimeZone.getTimeZone("UTC"), Locale.ENGLISH);
        Integer date = Integer.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
        Integer hour = Integer.valueOf(calendar.get(Calendar.HOUR_OF_DAY));
        Integer minute = Integer.valueOf(calendar.get(Calendar.MINUTE));
        fromAdderss.append(adjustNumericTextToGivenWidthWithZero(
            date.toString(), 2));
        fromAdderss.append(adjustNumericTextToGivenWidthWithZero(
            hour.toString(), 2));
        fromAdderss.append(adjustNumericTextToGivenWidthWithZero(
            minute.toString(), 2));
        fromAddressLine.addLineField(fromAdderss.toString());
        aHeaderLineList.add(fromAddressLine);

        /** AEE/52253/MAS/12NOV13/0000 */

        // Message Type Identifier and Title information.
        final Line msgIdentifierLine = new Line();
        final List<Field> msgIdentifierFields = new ArrayList<Field>();
        msgIdentifierFields.add(new Field(this.getLineIdentifier()));
        msgIdentifierFields.add(new Field(this.getSequenceNumber()));

        msgIdentifierFields.add(new Field(this.getSender()));

        msgIdentifierFields.add(new Field(this.getCreationDate()));

        msgIdentifierFields.add(new Field(this.getCreationTime()));

        msgIdentifierLine.setLineFields(msgIdentifierFields);
        aHeaderLineList.add(msgIdentifierLine);
        return aHeaderLineList;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public String getDoubleSignarure() {
        return this.doubleSignarure;
    }

    /**
     * Gets the <code>FromAddr</code> property.
     * <p>
     * 
     * @return the current value of the <code>FromAddr</code> property.
     */
    public String getFromAddr() {
        return this.fromAddr;
    }

    /**
     * Gets the <code>MessageElements</code> property.
     * <p>
     * 
     * @return the current value of the <code>MessageElements</code> property.
     */
    public List<Object> getMessageElements() {
        return this.messageElements;
    }

    /**
     * Gets the <code>MessageIdentifier</code> property.
     * <p>
     * 
     * @return the current value of the <code>MessageIdentifier</code> property.
     */
    public String getMessageIdentifier() {
        return this.messageIdentifier;
    }

    public String getMessagePriority() {
        return messagePriority;
    }

    /**
     * @return the messageStartIndex
     */
    public int getMessageStartIndex() {
        return this.messageStartIndex;
    }

    /**
     * Gets the <code>messageTriggerIdentifier</code> property.
     * <p>
     * 
     * @return the current value of the <code>messageTriggerIdentifier</code> property.
     */
    public String getMessageTriggerIdentifier() {
        return this.messageTriggerIdentifier;
    }

    /**
     * Gets the <code>MessageVersion</code> property.
     * <p>
     * 
     * @return the current value of the <code>MessageVersion</code> property.
     */

    public Double getMessageVersion() {
        return this.messageVersion;
    }

    /**
     * Gets the <code>originalMessageVersion</code> property.
     * 
     * @return
     */
    public String getOriginalMessageVersion() {
        return originalMessageVersion;
    }

    public String getPdmIdentifier() {
        return this.pdmIdentifier;
    }

    public String getPriority() {
        return this.priority;
    }

    public String getSender() {
        return sender;
    }

    public String getSequenceNumber() {
        return sequenceNumber;
    }

    public List<String> getToAddress() {
        return toAddress;
    }

    /**
     * Gets the <code>ToAddrs</code> property.
     * <p>
     * 
     * @return the current value of the <code>ToAddrs</code> property.
     */
    public List<String> getToAddrs() {
        return this.toAddrs;
    }

    /**
     * Gets the <code>tprAddr</code> property.
     * <p>
     * 
     * @return the current value of the <code>tprAddr</code> property.
     */
    public String getTprAddr() {
        return this.tprAddr;
    }

    public boolean isCustomsInd() {
        return this.customsInd;
    }

    @Override
    public Element parseElement(final List<Line> pTTYLine) throws LMSException {
        return null;
    }

    /**
     * Used to parse the element.
     * 
     * @param pTTYMessage
     *            holds the tty message.
     *            <p>
     * @return the MessageHeaderElement.
     */

    public MessageHeaderElement parseElement(String pTTYMessage) {

    	String aFromAddrs = null;
        
        pTTYMessage=pTTYMessage.replaceAll("(?m)^[ \t]*\r?\n", "");
        if(pTTYMessage.contains("LAST")){
        pTTYMessage=pTTYMessage.substring(0,pTTYMessage.indexOf("LAST")+3);
        }
        String originalTTYMessage = pTTYMessage.replaceAll("\r\n","\n");
        

        // cleanup msg syntax
        pTTYMessage = pTTYMessage.replace(FrameworkConstants.SOH, ' ');
        pTTYMessage = pTTYMessage.replace(FrameworkConstants.STX, ' ');
        pTTYMessage = pTTYMessage.replace(FrameworkConstants.CR, ' ');
        pTTYMessage = pTTYMessage.replace(MHSMessageConstants.ETX, ' ');
        pTTYMessage = pTTYMessage.trim();

        int anIndexOfAddr = 0;
        if (pTTYMessage.charAt(2) == ' ') {
            anIndexOfAddr = 3;
        }
        else if (pTTYMessage.charAt(3) == ' ') {
            anIndexOfAddr = 3;
        }
        else if (pTTYMessage.charAt(0) == (char) 10
                    || pTTYMessage.charAt(0) == (char) 13) {
            anIndexOfAddr = 1;
        }
        
        final String aLineSeparator = "\n";
        final int line = originalTTYMessage.indexOf(aLineSeparator);
        aFromAddrs = pTTYMessage.substring(anIndexOfAddr, line);
        aFromAddrs = aFromAddrs.replaceAll("\\.", "");
        aFromAddrs = aFromAddrs.replaceAll(FrameworkConstants.NEW_LINE, "").trim();
        this.setToAddrs(Arrays.asList(aFromAddrs.split(" ")));

        anIndexOfAddr = pTTYMessage.indexOf(".");
        this.setFromAddr(pTTYMessage.substring(anIndexOfAddr + 1,
            anIndexOfAddr + 9).trim());

        final String[] msgArray = originalTTYMessage.split(aLineSeparator);
        boolean match = false;
        int contentStartIndex = 0;
        for (final String msgLine : msgArray) {
            contentStartIndex++;
            if (match) {

                if (msgLine.length() >= 3 && msgLine.trim().equals("PDM")) {
                    this.setPdmIdentifier(msgLine);
                }
                else {
                    final String[] msgIdentifier = msgLine.split("/");
                    if (msgIdentifier.length >= 2) {
                        this.setMessageIdentifier(msgIdentifier[0].trim());
    						if (msgIdentifier[1].trim().isEmpty()) {
                            this.setMessageVersion(null);
                        }
                        else {

                            try {
                                this.setMessageVersion(Double
                                            .valueOf(msgIdentifier[1].trim()));
                            }
                            catch (final NumberFormatException pNumberFormatException) {
                                this.setMessageVersion(null);
                                this.setOriginalMessageVersion(msgIdentifier[1].trim());
                            }
                        }
                  }
                    else if (msgIdentifier.length == 1) {
                        this.setMessageIdentifier(msgIdentifier[0].trim());
                    }
                    this.setMessageStartIndex(contentStartIndex);
                    break;
                }
            }
            else if (msgLine.startsWith(".")) {
                match = true;
                final String[] frmaddress = msgLine.split(" ");
                if (frmaddress.length >= 3) {
                    this.setTprAddr(frmaddress[2].trim());
                }
                if (frmaddress.length >= 2) {
                    final String doublesignature = frmaddress[1].trim();
                    if (doublesignature != null && !doublesignature.equals("")) {
                        final String[] doubleArray = doublesignature.split("/");
                        if (doubleArray.length >= 2) {
                            this.setDoubleSignarure(doubleArray[0].trim());
                        }
                    }
                }
            }
        }
        return this;
    }

    public MessageHeaderElement parseMHElement(String pTTYMessage)
                throws LMSException {
        String aFromAddrs = null;
        // cleanup msg syntax
        pTTYMessage = pTTYMessage.replace(MHSMessageConstants.SOH, ' ');
        pTTYMessage = pTTYMessage.replace(MHSMessageConstants.STX, ' ');
        pTTYMessage = pTTYMessage.replace(MHSMessageConstants.CR, ' ');
        pTTYMessage = pTTYMessage.trim();

        int anIndexOfAddr = 0;
        if (pTTYMessage.charAt(2) == ' ') {
            anIndexOfAddr = 3;
        }
        else if (pTTYMessage.charAt(3) == ' ') {
            anIndexOfAddr = 3;
        }
        else if (pTTYMessage.charAt(0) == (char) 10
                    || pTTYMessage.charAt(0) == (char) 13) {
            anIndexOfAddr = 1;
        }

        final int line = pTTYMessage.indexOf("\n");
        aFromAddrs = pTTYMessage.substring(anIndexOfAddr, line);
        this.setToAddress(Arrays.asList(aFromAddrs.split(" ")));

        anIndexOfAddr = pTTYMessage.indexOf(".");
        this.setFromAddr(pTTYMessage.substring(anIndexOfAddr + 1,
            anIndexOfAddr + 9));

        final String[] msgArray = pTTYMessage.split("\n");
        boolean match = false;
        int contentStartIndex = 0;
        for (final String msgLine : msgArray) {
            contentStartIndex++;
            if (match) {
                /** AEE/52253/MAS/12NOV13/0000 */
                final String[] msgIdentifier = msgLine.split("/");
                if (msgIdentifier.length >= 2) {
                    this.setLineIdentifier(msgIdentifier[0].trim());
                    this.setSequenceNumber((msgIdentifier[1].trim()));
                    this.setSender(msgIdentifier[2].trim());
                    this.setCreationDate(msgIdentifier[3].trim());
                    this.setCreationTime(msgIdentifier[4].trim());
                }
                else if (msgIdentifier.length == 1) {
                    this.setLineIdentifier(msgIdentifier[0].trim());
                }
                this.setMessageStartIndex(contentStartIndex);
                break;
            }
            else if (msgLine.startsWith(".")) {
                match = true;
            }
        }
        return this;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public void setCustomsInd(final boolean customsInd) {
        this.customsInd = customsInd;
    }

    public void setDoubleSignarure(final String doubleSignarure) {
        this.doubleSignarure = doubleSignarure;
    }

    /**
     * Sets the <code>FromAddr</code> property.
     * <p>
     * 
     * @param pFromAddr
     *            holds the new value of <code>FromAddr</code>.<br>
     */
    public void setFromAddr(final String pFromAddr) {
        this.fromAddr = pFromAddr;
    }

    /**
     * Sets the <code>MessageElements</code> property.
     * <p>
     * 
     * @param pMessageElements
     *            holds the new value of <code>MessageElements</code>.<br>
     */
    public void setMessageElements(final List<Object> pMessageElements) {
        this.messageElements = pMessageElements;
    }

    /**
     * Sets the <code>MessageIdentifier</code> property.
     * <p>
     * 
     * @param pMessageIdentifier
     *            holds the new value of <code>MessageIdentifier</code>.<br>
     */
    public void setMessageIdentifier(final String pMessageIdentifier) {
        this.messageIdentifier = pMessageIdentifier;
    }

    public void setMessagePriority(String messagePriority) {
        this.messagePriority = messagePriority;
    }

    /**
     * @param messageStartIndex
     *            the messageStartIndex to set
     */
    public void setMessageStartIndex(final int pMessageStartIndex) {
        this.messageStartIndex = pMessageStartIndex;
    }

    /**
     * Sets the <code>messageTriggerIdentifier</code> property.
     * <p>
     * 
     * @param messageTriggerIdentifier
     *            holds the new value of <code>messageTriggerIdentifier</code>.<br>
     */
    public void setMessageTriggerIdentifier(final String pMessageTriggerIdentifier) {
        this.messageTriggerIdentifier = pMessageTriggerIdentifier;
    }

    /**
     * Sets the <code>MessageVersion</code> property.
     * <p>
     * 
     * @param pMessageVersion
     *            holds the new value of <code>MessageVersion</code>.<br>
     */
    public void setMessageVersion(final Double pMessageVersion) {
        this.messageVersion = pMessageVersion;
    }

    /***
     * Sets the <code>originalMessageVersion</code> property.
     * 
     * @param originalMessageVersion
     */
    public void setOriginalMessageVersion(final String pOriginalMessageVersion) {
        this.originalMessageVersion = pOriginalMessageVersion;
    }

    public void setPdmIdentifier(final String pdmIdentifier) {
        this.pdmIdentifier = pdmIdentifier;
    }

    public void setPriority(final String pPriority) {
        this.priority = pPriority;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public void setToAddress(List<String> toAddress) {
        this.toAddress = toAddress;
    }

    /**
     * Sets the <code>ToAddrs</code> property.
     * <p>
     * 
     * @param pToAddrs
     *            holds the new value of <code>ToAddrs</code>.<br>
     */
    public void setToAddrs(final List<String> pToAddrs) {
        this.toAddrs = pToAddrs;
    }

    /**
     * Sets the <code>tprAddr</code> property.
     * <p>
     * 
     * @param pTprAddr
     *            holds the new value of <code>tprAddr</code>.<br>
     */
    public void setTprAddr(final String pTprAddr) {
        this.tprAddr = pTprAddr;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "MessageHeaderElement [fromAddr=" + this.fromAddr
                    + ", messageElements=" + this.messageElements
                    + ", messageIdentifier=" + this.messageIdentifier
                    + ", messageVersion=" + this.messageVersion + ", toAddrs="
                    + this.toAddrs + "]";
    }

    /**
     * Gets the <code>TimeStamp</code> property in GMT.
     * <p>
     * 
     * @return the current value of the <code>TimeStamp</code> property.
     */
    private Calendar getTimeStamp() {
        /**
         * Code change for TR-1001846 V1 = Change Local Time Stamp to GMT Time
         * Timezone set as GMT instead of UTC as earlier.
         ***/

        return Calendar
                    .getInstance(TimeZone.getTimeZone("GMT"), Locale.ENGLISH);
    }

	/**
	 * @return the aRQMEventID
	 */
	public String getRQMEventID() {
		return aRQMEventID;
	}

	/**
	 * @param aRQMEventID the aRQMEventID to set
	 */
	public void setRQMEventID(String aRQMEventID) {
		this.aRQMEventID = aRQMEventID;
	}
}
