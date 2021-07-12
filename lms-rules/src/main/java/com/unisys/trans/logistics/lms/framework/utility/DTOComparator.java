//@formatter:off
/* ====================================== */
/* Copyright(c) 2011 Unisys Corporation.  */
/*          All rights reserved.          */
/*          UNISYS CONFIDENTIAL           */
/* ====================================== */
//@formatter:on
package com.unisys.trans.logistics.lms.framework.utility;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * Sorts a collection of data transfer objects (DTO's) based on the name of the
 * getter of the field to sort on. For example: the DTO MyDto has three fields
 * ID, Name and Value, all with appropriate getters and setters. If you want to
 * sort on the field Name, which has a getter called "getName", then invoke the
 * sorting as follows:
 * 
 * <pre>
 * Collections.sort(myDtoList, new DtoComparator(&quot;getName&quot;, true, true));
 * </pre>
 * 
 * The following call is also supported. The "get" will be prefixed
 * automatically if not present:
 * 
 * <pre>
 * Collections.sort(myDtoList, new DtoComparator(&quot;name&quot;, true, true));
 * </pre>
 * 
 * You can use "deep" getters when a DTO contains one or more nested DTO's. For
 * example: MyDto1 contains a MyDto2 property which contains a String property.
 * If you want to sort myDto1List on the "name" property of MyDto2, then
 * separate the getters by dots and invoke the sorting as follows:
 * 
 * <pre>
 * Collections.sort(myDto1List, new DtoComparator(&quot;myDto2.name&quot;, true, true));
 * </pre>
 * 
 * The boolean 2nd parameter indicates the sort order. If true, then the
 * collection will be sorted ascending at natural sort order. If false, then the
 * collection will be sorted descending at natural sort order. The default value
 * is true.
 * <p>
 * Very useful for lists of DTO's used in JSF datatables.
 */
public class DTOComparator implements Comparator<Object>, Serializable {

	/**
	 * default serial version id.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Attribute to hold the Sort Order.
	 */
	private boolean ascending;

	/**
	 * Attribute to hold the list of getter method names as string.
	 */
	private List<String> getters;

	/**
	 * arguemented constructor.
	 * 
	 * @param pGetter
	 *            The name of the getter of the field to sort on.
	 */
	public DTOComparator(final String pGetter) {
		this(pGetter, true);
	}

	/**
	 * arguemented constructor.
	 * 
	 * @param pGetter
	 *            The name of the getter of the field to sort on.
	 * @param pAscending
	 *            The sort order: true = ascending, false = descending.
	 */
	public DTOComparator(final String pGetter, final boolean pAscending) {
		this.getters = new ArrayList<String>();
		for (String name : pGetter.split("\\.")) {
			final String searchStr = "get";
			if (!name.startsWith(searchStr)) {
				name = searchStr
						+ ContractUtility.convertToUpperCase(name.substring(0,
								1)) + name.substring(1);
			}
			this.getters.add(name);
		}
		this.ascending = pAscending;
	}

	/**
	 * compares two given objects.
	 * 
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 * @param pObject1
	 *            It holds the object1 value.
	 * @param pObject2
	 *            It holds the object2 value.
	 * @return result
	 */
	@SuppressWarnings("unchecked")
	public int compare(Object pObject1, Object pObject2) {
		final int result;
		try {
			final Iterator<String> iter = getters.iterator();
			while (pObject1 != null && pObject2 != null && iter.hasNext()) {
				final String getter = iter.next();
				if (getter.contains("get(")) {
					// SuppressOn:MagicNumber
					pObject1 = ((List<String>) pObject1).get(Integer
							.parseInt(getter.substring(4, 5)));
					pObject2 = ((List<String>) pObject2).get(Integer
							.parseInt(getter.substring(4, 5)));
				} else {
					pObject1 = pObject1.getClass()
							.getMethod(getter, new Class[0])
							.invoke(pObject1, new Object[0]);
					pObject2 = pObject2.getClass()
							.getMethod(getter, new Class[0])
							.invoke(pObject2, new Object[0]);
					// SuppressOff:MagicNumber
				}

			}
		} catch (Exception e) {
			// If this exception occurs, then it is usually a fault of the DTO
			// developer.
			throw new RuntimeException("Cannot compare " + pObject1 + " with "
					+ pObject2 + " on " + getters, e);
		}

		if (ascending) {
			if (pObject1 == null && pObject2 == null) {
				result = 0;
			} else if (pObject1 == null) {

				result = -1;
			} else if (pObject2 == null) {
				result = 1;
			} else {
				result = ((Comparable<Object>) pObject1).compareTo(pObject2);
			}
		} else {
			if (pObject1 == null && pObject2 == null) {
				result = 0;
			} else if (pObject1 == null) {
				result = 1;
			} else if (pObject2 == null) {
				result = -1;
			} else {
				result = ((Comparable<Object>) pObject2).compareTo(pObject1);
			}
		}
		return result;
	}

	/**
	 * Gets the <code>getters</code> property.
	 * <p>
	 * <b>Format :</b><br>
	 * String
	 * 
	 * @return the new value of the <code>getters</code> property.
	 */
	public List<String> getGetters() {
		return getters;
	}

	/**
	 * gets the <code>ascending</code> property.
	 * <p>
	 * <b>Format :</b><br>
	 * Boolean
	 * <p>
	 * <b>Example :</b><br>
	 * <li><code>true</code> - sort the column in ascending order.
	 * <li><code>false</code> - sort the column in descending order.
	 * <p>
	 * 
	 * @return sort order of the column
	 */
	public boolean isAscending() {
		return ascending;
	}

	/**
	 * sets the <code>ascending</code> property.
	 * <p>
	 * <b>Format :</b><br>
	 * Boolean
	 * <p>
	 * <b>Example :</b><br>
	 * <li><code>true</code> - sort the column in ascending order.
	 * <li><code>false</code> - sort the column in descending order.
	 * <p>
	 * 
	 * @param pAscending
	 *            set the sorting order as ascending or descending.
	 */
	public void setAscending(final boolean pAscending) {
		this.ascending = pAscending;
	}

	/**
	 * sets the <code>getters</code> property.
	 * <p>
	 * <b>Format :</b><br>
	 * String
	 * 
	 * @param pGetters
	 *            List of getter methods as string
	 */
	public void setGetters(final List<String> pGetters) {
		this.getters = pGetters;
	}

}
