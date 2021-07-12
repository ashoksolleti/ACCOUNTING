/* ====================================== */
/* Copyright (c) 2012 Unisys Corporation. */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
package com.unisys.trans.logistics.lms.framework.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.unisys.trans.logistics.lms.framework.exception.CodeMessage;

/**
 * <code>BatchResponse</code> is used for batch process.
 * <p>
 * This contains the following attributes:
 * <ul>
 * <li>additionalInfo
 * <li>createCount
 * <li>deleteCount
 * <li>entryFoundIndicator
 * <li>errorItems
 * <li>updateCount
 * </ul>
 */
public class BatchResponse extends AbstractResponse {

	/**
	 * Attribute to hold <code>serialVersionUID</code> property.
	 */
	private static final long serialVersionUID = -7856357151412599590L;

	/**
	 * Attribute to hold <code>additionalInfo</code> property.
	 */
	private Object additionalInfo;

	/**
	 * Attribute to hold <code>createCount</code> property.
	 */
	private long createCount;

	/**
	 * Attribute to hold <code>deleteCount</code> property.
	 */
	private long deleteCount;

	private long deleteSpotRateCount;
	/**
	 * Attribute to hold <code>failedCount</code> property.
	 */
	private long failedCount;

	private long unchangedCount;

	/**
	 * Attribute to hold <code>entryFoundIndicator</code> property.
	 */
	private boolean entryFoundIndicator;

	/**
	 * Attribute to hold <code>errorItems</code> property.
	 */
	private Map<String, List<TapeRateEntry>> errorItems;

	/**
	 * Attribute to hold <code>parameter</code> property.
	 */
	private long updateCount;

	public void addErrorItem(final CodeMessage pCodeMessage,
			final TapeRateEntry pItem) {

		String errorMessage = pCodeMessage.getMessage();
		if (errorMessage == null || errorMessage.isEmpty()) {
			return;
		}
		if (errorItems == null) {

			errorItems = new HashMap<String, List<TapeRateEntry>>();
		}
		List<TapeRateEntry> items = null;

		if (errorItems.containsKey(errorMessage)) {

			items = errorItems.get(errorMessage);
			items.add(pItem);
		} else {

			items = new ArrayList<TapeRateEntry>();
			items.add(pItem);
			errorItems.put(errorMessage, items);
		}
	}

	public void addErrorItem(final List<CodeMessage> pCodeMessages,
			final TapeRateEntry pItem) {

		StringBuilder errorMessageBuilder = new StringBuilder();

		for (CodeMessage codeMsg : pCodeMessages) {
			errorMessageBuilder.append(codeMsg.getMessage() + ",");
		}
		if (errorMessageBuilder.length() <= 0) {
			return;
		}
		String errorMessage = errorMessageBuilder.toString();

		if (errorItems == null) {

			errorItems = new HashMap<String, List<TapeRateEntry>>();
		}
		List<TapeRateEntry> items = null;

		if (errorItems.containsKey(errorMessage)) {

			items = errorItems.get(errorMessage);
			items.add(pItem);
		} else {

			items = new ArrayList<TapeRateEntry>();
			items.add(pItem);
			errorItems.put(errorMessage, items);
		}
	}

	/**
	 * 
	 * @param pErrorMessage
	 *            holds the ErrorMessage.
	 * @param pItem
	 *            holds the Item.
	 */
	public void addErrorItem(final String pErrorMessage,
			final TapeRateEntry pItem) {

		if (pErrorMessage == null || pErrorMessage.isEmpty()) {
			return;
		}
		if (errorItems == null) {

			errorItems = new HashMap<String, List<TapeRateEntry>>();
		}
		List<TapeRateEntry> items = null;
		if (errorItems.containsKey(pErrorMessage)) {

			items = errorItems.get(pErrorMessage);
			items.add(pItem);
		} else {

			items = new ArrayList<TapeRateEntry>();
			items.add(pItem);
			errorItems.put(pErrorMessage, items);
		}
	}

	public void addErrorItems(final String pErrorMessage,
			final List<? extends TapeRateEntry> pItems) {

		if (pErrorMessage == null || pErrorMessage.isEmpty()) {
			return;
		}
		if (errorItems == null) {

			errorItems = new HashMap<String, List<TapeRateEntry>>();
		}
		List<TapeRateEntry> items = null;
		if (errorItems.containsKey(pErrorMessage)) {

			items = errorItems.get(pErrorMessage);
			items.addAll(pItems);
		} else {

			items = new ArrayList<TapeRateEntry>();
			items.addAll(pItems);
			errorItems.put(pErrorMessage, items);
		}
	}

	/**
	 * Gets the <code>additionalInfo</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>additionalInfo</code> property.
	 */
	public Object getAdditionalInfo() {
		return this.additionalInfo;
	}

	/**
	 * Gets the <code>createCount</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>createCount</code> property.
	 */
	public long getCreateCount() {
		return this.createCount;
	}

	/**
	 * Gets the <code>deleteCount</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>deleteCount</code> property.
	 */
	public long getDeleteCount() {
		return this.deleteCount;
	}

	/**
	 * Gets the <code>errorItems</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>errorItems</code> property.
	 */
	public Map<String, List<TapeRateEntry>> getErrorItems() {
		return this.errorItems;
	}

	/**
	 * Gets the <code>failedCount</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>failedCount</code> property.
	 */
	public long getFailedCount() {
		return this.failedCount;
	}

	public long getUnchangedCount() {
		return unchangedCount;
	}

	/**
	 * Gets the <code>updateCount</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>updateCount</code> property.
	 */
	public long getUpdateCount() {
		return this.updateCount;
	}

	/**
	 * Gets the <code>createCount</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>createCount</code> property.
	 */
	public long incrementCreateCount() {
		return ++createCount;
	}

	/**
	 * Gets the <code>createCount</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>createCount</code> property.
	 */
	public long incrementCreateCount(final long pCreateCount) {
		return createCount = createCount + pCreateCount;
	}

	/**
	 * Gets the <code>deleteCount</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>deleteCount</code> property.
	 */
	public long incrementDeleteCount() {
		return ++deleteCount;
	}

	/**
	 * Gets the <code>deleteCount</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>deleteCount</code> property.
	 */
	public long incrementDeleteCount(final long pDeleteCount) {
		return deleteCount = deleteCount + pDeleteCount;
	}

	/**
	 * Gets the <code>updateCount</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>updateCount</code> property.
	 */

	public long incrementUpdateCount() {
		return ++updateCount;
	}

	/**
	 * Gets the <code>updateCount</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>updateCount</code> property.
	 */
	public long incrementUpdateCount(final long pUpdateCount) {
		return updateCount = updateCount + pUpdateCount;
	}

	/**
	 * Gets the <code>entryFoundIndicator</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>entryFoundIndicator</code>
	 *         property.
	 */
	public boolean isEntryFoundIndicator() {
		return this.entryFoundIndicator;
	}

	/**
	 * Sets the <code>additionalInfo</code> property.
	 * <p>
	 * 
	 * @param pAdditionalInfo
	 *            the new value of the <code>additionalInfo</code> property.
	 */
	public void setAdditionalInfo(final Object pAdditionalInfo) {
		this.additionalInfo = pAdditionalInfo;
	}

	/**
	 * Sets the <code>createCount</code> property.
	 * <p>
	 * 
	 * @param pCreateCount
	 *            the new value of the <code>createCount</code> property.
	 */
	public void setCreateCount(final long pCreateCount) {
		this.createCount = pCreateCount;
	}

	/**
	 * Sets the <code>deleteCount</code> property.
	 * <p>
	 * 
	 * @param pDeleteCount
	 *            the new value of the <code>deleteCount</code> property.
	 */
	public void setDeleteCount(final long pDeleteCount) {
		this.deleteCount = pDeleteCount;
	}

	/**
	 * Sets the <code>entryFoundIndicator</code> property.
	 * <p>
	 * 
	 * @param pEntryFoundIndicator
	 *            the new value of the <code>entryFoundIndicator</code>
	 *            property.
	 */
	public void setEntryFoundIndicator(final boolean pEntryFoundIndicator) {
		this.entryFoundIndicator = pEntryFoundIndicator;
	}

	/**
	 * Sets the <code>errorItems</code> property.
	 * <p>
	 * 
	 * @param pErrorItems
	 *            the new value of the <code>errorItems</code> property.
	 */
	public void setErrorItems(final Map<String, List<TapeRateEntry>> pErrorItems) {
		this.errorItems = pErrorItems;
	}

	/**
	 * Sets the <code>failedCount</code> property.
	 * <p>
	 * 
	 * @param pFailedCount
	 *            the new value of the <code>failedCount</code> property.
	 */
	public void setFailedCount(final long pFailedCount) {
		this.failedCount = pFailedCount;
	}

	public void setUnchangedCount(long unchangedCount) {
		this.unchangedCount = unchangedCount;
	}

	/**
	 * Sets the <code>updateCount</code> property.
	 * <p>
	 * 
	 * @param pUpdateCount
	 *            the new value of the <code>updateCount</code> property.
	 */
	public void setUpdateCount(final long pUpdateCount) {
		this.updateCount = pUpdateCount;
	}
	public long getDeleteSpotRateCount() {
		return deleteSpotRateCount;
	}

	public void setDeleteSpotRateCount(final long pDeleteSpotRateCount) {
		this.deleteSpotRateCount = pDeleteSpotRateCount;
	}
}
