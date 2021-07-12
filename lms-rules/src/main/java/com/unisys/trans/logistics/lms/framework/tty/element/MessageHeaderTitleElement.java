package com.unisys.trans.logistics.lms.framework.tty.element;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import com.unisys.trans.logistics.lms.framework.constants.MHSMessageConstants;
import com.unisys.trans.logistics.lms.framework.exception.LMSException;

public class MessageHeaderTitleElement extends Element {

    /**
     * 
     */
    private static final long serialVersionUID = 2169055610797329255L;

    // Header section
    private String messagePriority;

    private List<String> toAddress = new ArrayList<String>();

    private String fromAddr;

    // Title section
    private String sequenceNumber;

    private String sender;

    private String creationDate;

    private String creationTime;

    private String doubleSignarure;

    /**
     * Attribute to hold <code>messageStartIndex</code> property.
     */
    private int messageStartIndex;

    public String getMessagePriority() {
        return messagePriority;
    }

    public void setMessagePriority(String messagePriority) {
        this.messagePriority = messagePriority;
    }

    public String getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public List<String> getToAddress() {
        return toAddress;
    }

    public void setToAddress(List<String> toAddress) {
        this.toAddress = toAddress;
    }

    public String getFromAddr() {
        return fromAddr;
    }

    public void setFromAddr(String fromAddr) {
        this.fromAddr = fromAddr;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public String getDoubleSignarure() {
        return doubleSignarure;
    }

    public void setDoubleSignarure(String doubleSignarure) {
        this.doubleSignarure = doubleSignarure;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public int getMessageStartIndex() {
        return messageStartIndex;
    }

    public void setMessageStartIndex(int messageStartIndex) {
        this.messageStartIndex = messageStartIndex;
    }

    /**
     * QD KULCWMH
     * .KULFMMH 111600
     * AEE/52253/MAS/12NOV13/0000
     * 
     * 
     */

    // @Override
    public List<Line> buildLines() {
        List<Line> aHeaderLineList = new ArrayList<Line>();
        Line aHeaderLine = new Line();

        final StringBuilder toAdderss = new StringBuilder();
        toAdderss.append(MHSMessageConstants.DEFAULT_PRIORITY);
        toAdderss.append(MHSMessageConstants.SPACE);
        for (final String toAddr : this.toAddress) {
            toAdderss.append(toAddr);
            // toAdderss.append(MHSMessageConstants.SPACE);
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

        final Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"), Locale.ENGLISH);
        Integer date = new Integer(calendar.get(Calendar.DAY_OF_MONTH));
        Integer hour = new Integer(calendar.get(Calendar.HOUR_OF_DAY));
        Integer minute = new Integer(calendar.get(Calendar.MINUTE));
        fromAdderss.append(
            MessageHeaderTitleElement.adjustNumericTextToGivenWidthWithZero(date.toString(), 2));
        fromAdderss.append(
            MessageHeaderTitleElement.adjustNumericTextToGivenWidthWithZero(hour.toString(), 2));
        fromAdderss.append(
            MessageHeaderTitleElement.adjustNumericTextToGivenWidthWithZero(minute.toString(), 2));
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

    public MessageHeaderTitleElement parseElement(String pTTYMessage) throws LMSException {
        String aFromAddrs = null;
        // cleanup msg syntax
        pTTYMessage = pTTYMessage.replace(MHSMessageConstants.SOH, ' ');
        pTTYMessage = pTTYMessage.replace(MHSMessageConstants.STX, ' ');
        pTTYMessage = pTTYMessage.replace(MHSMessageConstants.CR, ' ');
        pTTYMessage = pTTYMessage.replace(MHSMessageConstants.ETX, ' ');
        pTTYMessage = pTTYMessage.replaceAll("_", "");
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
                    this.setSequenceNumber((msgIdentifier[1]
                                .trim()));
                    this.setSender(msgIdentifier[2]
                                .trim());
                    this.setCreationDate(msgIdentifier[3]
                                .trim());
                    this.setCreationTime(msgIdentifier[4]
                                .trim());
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

    public static String adjustNumericTextToGivenWidthWithZero(final String pInput, final int pLength) {
        String aProcessedString = pInput;
        char ZERO_STRING = '0';
        if (aProcessedString == null) {
            aProcessedString = "";
        }
        if (aProcessedString.length() > pLength) {
            aProcessedString = aProcessedString.substring(0, pLength);
        }
        else if (aProcessedString.length() < pLength) {
            aProcessedString = MessageHeaderTitleElement.leftPadCharacters(
                aProcessedString, pLength, ZERO_STRING);
        }
        return aProcessedString;

    }

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
    public static String leftPadCharacters(final String pCode,
                final int plength, final char pAppendCharacter) {
        String aCode = pCode;
        if (aCode.length() < plength) {
            for (int i = aCode.length(); i < plength; i++) {
                aCode = String.valueOf(pAppendCharacter).concat(aCode);
            }
        }
        return aCode;
    }

}
