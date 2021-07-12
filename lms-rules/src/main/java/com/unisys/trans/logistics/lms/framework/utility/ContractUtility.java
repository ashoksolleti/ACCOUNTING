/* ====================================== */
/* Copyright (c) 2007 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */

package com.unisys.trans.logistics.lms.framework.utility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/**
 * <code>ContractUtility</code> contains the conversion methods that processes on Date and String.
 * <p>
 * This contains the following methods:
 * <ul>
 * <li>getClonedDate
 * <li>convertToUpperCase
 * <li>convertListToUpperCase
 * <li>convertToLowerCase
 * </ul>
 */
public final class ContractUtility {

    /**
     * This constant should be used instead of hard coded "" or "new String()"
     * to avoid the creation of a new instance of String().
     */
    public static final String EMPTY_STRING = "";
    private static final TimeZone GMT_TIMEZONE = TimeZone.getTimeZone("GMT");

    /**
     * Compares the given two dates and returns a integer value based on comparison.
     * <p>
     * 
     * @param pFirstDate holds the first date.
     * @param pSecondDate holds the second date.
     *            <p>
     * @return the values:
     *         <ul>
     *         <li><code>0</code><br>
     *         if the firstDate and the secondDate are equal. <li><code>1</code><br>
     *         if the firstDate is greater than the secondDate. <li><code>-1 </code><br>
     *         if the firstDate is less than the secondDate.
     *         </ul>
     */
    public static int compareDates(final Date pFirstDate, final Date pSecondDate) {

        final Calendar firstCalendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        firstCalendar.setTime(pFirstDate);
        firstCalendar.set(Calendar.HOUR, 0);
        firstCalendar.set(Calendar.HOUR_OF_DAY, 0);
        firstCalendar.set(Calendar.MINUTE, 0);
        firstCalendar.set(Calendar.SECOND, 0);
        firstCalendar.set(Calendar.MILLISECOND, 0);

        final Calendar secondCalendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        secondCalendar.setTime(pSecondDate);
        secondCalendar.set(Calendar.HOUR, 0);
        secondCalendar.set(Calendar.HOUR_OF_DAY, 0);
        secondCalendar.set(Calendar.MINUTE, 0);
        secondCalendar.set(Calendar.SECOND, 0);
        secondCalendar.set(Calendar.MILLISECOND, 0);

        return firstCalendar.compareTo(secondCalendar);
    }
    
    public static String convertToTitlecase(final String pInput) {

        final StringBuilder anOutputTitleCase = new StringBuilder();
        boolean capNextInd = true;

        for (char aChar : pInput.toCharArray()) {
            if (Character.isSpaceChar(aChar)) {
                capNextInd = true;
                break;
            }
            else {
                aChar = (capNextInd) ? Character.toUpperCase(aChar)
                            : Character.toLowerCase(aChar);
                anOutputTitleCase.append(aChar);
                capNextInd = false;
            }

        }
        return anOutputTitleCase.toString();
    }

    

    /**
     * Used to convert the list of string to upper case.
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pInput holds the list of string which is to be converted to an upper case.
     *            <p>
     * @return the list of string in upper case.
     */
    public static List<String> convertListToUpperCase(final List<String> pInput) {
        List<String> anOutput = null;

        if (pInput != null && !pInput.isEmpty()) {
            anOutput = new ArrayList<String>();
            for (final String aInput : pInput) {
                anOutput.add(convertToUpperCase(aInput));
            }
        }

        return anOutput;
    }

    /**
     * Used to convert a string to lower case.
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pInput holds the string which is to be converted to lower case.
     *            <p>
     * @return the converted string which is in lower case.
     */

    public static String convertToLowerCase(final String pInput) {

        String anOutput = null;

        if (pInput != null) {

            anOutput = (pInput.trim()).toLowerCase(Locale.US);
        }

        return anOutput;
    }

    /**
     * This method is used to convert a string to upper case.
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pInput holds the string to be converted to upper case.
     *            <p>
     * @return the converted string which is in upper case.
     */

    public static String convertToUpperCase(final String pInput) {

        String anOutput = null;
        // empty space seems to be intrusive!!. trap that as well
        if (pInput != null && !pInput.isEmpty()) {

            anOutput = (pInput.trim()).toUpperCase(Locale.US);
        }

        return anOutput;
    }

    /**
     * Gets the clone for the given date.
     * <p>
     * <b>Release Notes:</b> <br>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@Since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pDate holds the <code>Date</code> to be cloned.
     *            <p>
     * @return the clone of the given date.
     */
    public static Date getClonedDate(final Date pDate) {
        Date aDate = null;
        if (pDate != null) {
            aDate = (Date) pDate.clone();
        }
        return aDate;
    }

    /**
     * This method validates whether the given <code>String</code> is empty or
     * not.
     * <p>
     * <b>Possible values</b>:
     * <ul>
     * <li><code>true</code><br>
     * <ul>
     * <li>If the object is null.
     * <li>If the object is not null and the length is '0' when the string is trimmed.
     * </ul>
     * <li><code>false</code><br>
     * <li>If the object is not null and the length is not '0' when the string is trimmed.
     * </ul>
     * <p>
     * 
     * @param ptext
     *            holds the String object.
     *            <p>
     * @return <code>true</code> - if the given input string is <code>empty</code>.
     */
    public static boolean isEmpty(final String ptext) {
        return ptext == null || ptext.trim().equals(EMPTY_STRING);
    }
    
    /**
     * Converts the account number to IATA number format
     * @param accountNumber
     * @return String
     */
    public static String getIATANumberFormat(String accountNumber) {

    	 String anIATANumber = "";
		if (accountNumber != null) {

			anIATANumber = accountNumber;
			// check if its already has required format

			if (accountNumber.indexOf('-') > 0
					|| accountNumber.matches("[a-zA-Z]+")) {
				return accountNumber;
			}
			accountNumber = accountNumber.trim();
			if (accountNumber.length() == 7) {
				anIATANumber = accountNumber.substring(0, 2) + "-"
						+ accountNumber.substring(2, 3) + " "
						+ accountNumber.substring(3);
			} else if (accountNumber.length() == 11) {
				anIATANumber = accountNumber.substring(0, 2) + "-"
						+ accountNumber.substring(2, 3) + " "
						+ accountNumber.substring(3, 7) + "/"
						+ accountNumber.substring(7);
			}
		}
        return anIATANumber;
    }
    /**
     * Converts the date according to the given <code>Date</code> format.
     * <p>
     * Example : Consider the date inputted to be "Mon Dec 01 05:04:47 GMT 2008", format as "ddMMMyy" , the
     * formatted date output will be "01DEC08".
     * <p>
     * 
     * @param pFormat
     *            holds the format of the <code>Date</code>.
     * @param pDate
     *            holds the <code>Date</code> value.
     *            <p>
     * @return the current value of the <code>Date</code> in the given format as
     *         string.
     */
    public static String getFormattedDate(final String pFormat, final Date pDate) {
        String aDate = null;
        if (pDate != null) {
            final SimpleDateFormat format = new SimpleDateFormat(pFormat,
                        Locale.US);
            aDate = ContractUtility.convertToUpperCase(format.format(pDate));
        }
        return aDate;
    }
	
	/**
     * Gets the <code>Number</code> property.
     */
    public static boolean isNumber(final String pInput) {
        return Pattern.matches("[0-9]*", pInput);
    }
	

    /**
     * <code>Default constructor.</code>
     */
    private ContractUtility() {

    }

}
