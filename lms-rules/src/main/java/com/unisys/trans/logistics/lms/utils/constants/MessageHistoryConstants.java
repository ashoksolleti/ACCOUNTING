package com.unisys.trans.logistics.lms.utils.constants;

public final class MessageHistoryConstants {
	

	/**
	 * This constant defines the start of the message.
	 */
	public static final char SOM = '\1';

	/**
	 * This constant defines the start of the text.
	 */
	public static final char STX = '\2';

	/**
	 * This constant defines the end of the text.
	 */
	public static final char ETX = '\3';
	
	/**
	 * This constant defines the carriage return.
	 */
	public static final char CR = '\15';
	
	public static final char EOD = '\4';
	
	public static final char AMPERSAND = '\26';
	
	public static final String MESSAGE_TYPE_OUTGOING="Outgoing";
	
	public static final String MESSAGE_TYPE_INCOMING="Incoming";
	
	public static final String REJECT_QUEUE_NAME_INCOMING="INCOMINGREJECTQ";
	
	public static final String REJECT_QUEUE_NAME_OUTGOING="OUTGOINGREJECTQ";
	
	public static final String OFFICE_IDENTIFIER="MSP001";
	
	public static final String ADDRESS_TYPE="INMESSAGE";
	
	public static final int MESSAGE_HISTORY_EXCEPTION=918;
	
	public static final String INCOMING_QUEUE_NAME="INCOMINGMESSAGEHISTORYQ";
	
	public static final String OUTGOING_QUEUE_NAME="OUTGOINGMESSAGEHISTORYQ";
	public static final String MESSAGE_TYPE_XML="X";
	public static final String XFM="XFM";

    public static final String CUSTOM_XFM = "Outgoing XFFM XML";

}
