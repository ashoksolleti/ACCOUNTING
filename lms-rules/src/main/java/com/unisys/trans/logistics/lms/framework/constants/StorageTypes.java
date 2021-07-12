package com.unisys.trans.logistics.lms.framework.constants;

public enum StorageTypes {

	AS("Apply Storage"),

	NS("No Storage"),

	DS("Delete Storage");

	private String storageTypes;

	StorageTypes(final String pStorageTypes) {
		this.setStorageTypes(pStorageTypes);
	}

	/**
	 * @return the storageTypes
	 */
	public String getStorageTypes() {
		return this.storageTypes;
	}
	

	/**
	 * @param pStorageTypes
	 *            the storageTypes to set
	 */
	public void setStorageTypes(String pStorageTypes) {
		this.storageTypes = pStorageTypes;
	}

	/**
	 * Gives the string format of <code>paymentMethod</code>.
	 * <p>
	 * 
	 * @return the enumerated value of the <code>paymentMethod</code>.<br>
	 */
	public String value() {
		return this.storageTypes;
	}
	
	/**
	 * Gets the <code>storageType</code> property.
	 * <p>
	 * 
	 * @return the current value of the <code>pStorageType</code> property.
	 */
	
	public static StorageTypes getStorageTypes(
			final StorageTypes pStorageType) {

		StorageTypes aStorageType = null;

		for (final StorageTypes aType : StorageTypes.values()) {

			if (pStorageType.value().equals(aType.value())) {
				aStorageType = aType;
				break;
			}
		}

		return aStorageType;

	}

}
