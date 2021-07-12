package com.unisys.trans.logistics.lms.framework.dto.constants.operation;

/**
 * Holds many goods and container disposition which determines the goods and
 * container status. The disposition specifies that the goods are in export or
 * import or general.
 */
public enum DispositionType {

	/**
	 * Represents the disposition "At export and not assigned".
	 * 
	 */
	AT_EXPORT_UNASSIGNED_TO_FLIGHT("At export and not assigned"),

	/**
	 * Represents the disposition "For interline transfer".
	 * 
	 */
	FOR_INTERLINE_TRANSFER("For interline transfer"),

	/**
	 * Represents the disposition "Missing data".
	 * 
	 */
	MISSING_DATA("Missing data"),

	/**
	 * Disposition is At export and assigned to finalized flight.
	 * 
	 */
	AT_EXPORT_AND_ASSIGNED_TO_FINALIZED_FLIGHT(
			"At export and assigned to finalized flight"),

	/**
	 * Disposition is At export and assigned to flight.
	 * 
	 */
	AT_EXPORT_AND_ASSIGNED_TO_FLIGHT("At export and assigned to flight"),

	/**
	 * Represents the disposition "Delivered".
	 * 
	 */
	DELIVERED("Delivered"),
	/**
	 * Represents the disposition "For delivery".
	 * 
	 */
	FOR_DELIVERY("For delivery"),
	/**
	 * Represents the disposition "Gone on delivery".
	 * 
	 */
	GONE_ON_DELIVERY("Gone on delivery"),

	/**
	 * Represents the disposition "Transfer manifested".
	 * 
	 */
	TRANSFER_MANIFESTED("Transfer Manifested"),

	/**
	 * Represents the disposition "Hold and call".
	 * 
	 */
	HOLD_AND_CALL("Hold and call"),

	/**
	 * Represents the disposition "Broker".
	 * 
	 */
	BROKER("Broker"),

	/**
	 * Represents the disposition "Surface carrier to destination".
	 * 
	 */
	SURFACE_CARRIER_TO_DESTINATION("Surface carrier to destination"),

	/**
	 * Represents the disposition "Breakdown".
	 * 
	 */
	BREAKDOWN("Breakdown"),

	/**
	 * Represents the disposition "Discrepancy".
	 * 
	 */
	DISCREPANCY("Discrepancy"),

	/**
	 * Represents the disposition "Closed".
	 * 
	 */
	CLOSED("Closed"),

	/**
	 * Represents the disposition "ShipperloadedUld".
	 * 
	 */
	SHIPPER_LOADED_ULD("ShipperloadedUld"),

	/**
	 * It could hold values Export, Import or null.
	 * 
	 */
	EXPORT_IMPORT_CODE("Export, Import or null"),

	/**
	 * It could hold values Export, Import or null.
	 * 
	 */
	FINALIZED("X"),

	/**
	 * TERMINATING.
	 * 
	 */
	TERMINATING("Terminating"),

	/**
	 * Represents the disposition "check in at non mechanized station".
	 * 
	 */
	CHECK_IN_AT_NON_MECHANIZED_STATION("Check in at non mechanized station"),

	/**
	 * Represents the disposition "notified".
	 * 
	 */
	NOTIFIED("Notified"), SURFACE_CARRRIER_TO_DESTINATION(
			"Surface carrier to destination"),

	/**
	 * Represents the disposition "export"-nextDisposition.
	 * 
	 */
	EXPORT("Export"),

	/**
	 * Represents the disposition "export"-nextDisposition.
	 * 
	 */
	NO_DISPOSITION("Indicator Not appliicable");

	private String dispositionType;

	DispositionType(final String pDispositionType) {
		this.dispositionType = pDispositionType;
	}

	public String getDispositionType() {
		return dispositionType;
	}

	public void setDispositionType(String dispositionType) {
		this.dispositionType = dispositionType;
	}

	public String value() {
		return this.dispositionType;
	}

	/**
	 * This methods will take an enum value say 'AT EXPORT AND ASSIGNED TO
	 * FLIGHT' or 'AT EXPORT AND ASSIGNED TO FINALIZED FLIGHT' and validates the
	 * goods against the disposition type. * True - if the disposition type
	 * values are permissible for the specified function * false - if the
	 * disposition type values are not permissible for the specified function
	 * 
	 * @return Response object that hold the boolean value which depends on
	 *         whether the disposition type values are permissible for the
	 *         specified function
	 * 
	 */
	public boolean isValidForRemoval() {
		return DispositionType.AT_EXPORT_AND_ASSIGNED_TO_FLIGHT.equals(this)
				|| DispositionType.AT_EXPORT_AND_ASSIGNED_TO_FINALIZED_FLIGHT
						.equals(this);
	}

	/**
	 * This methods will take an enum value say ASSIGNMENT and validates the
	 * goods against the disposition type. * True - if the disposition type
	 * values are permissible for the specified function * false - if the
	 * disposition type values are not permissible for the specified function
	 * 
	 * @return Response object that hold the boolean value which depends on
	 *         whether the disposition type values are permissible for the
	 *         specified function
	 * 
	 */
	public boolean isValidForAssignment() {
		return DispositionType.AT_EXPORT_UNASSIGNED_TO_FLIGHT.equals(this);
	}

	/**
	 * <p>
	 * This methods will take an enum value say 'AT EXPORT AND ASSIGNED TO
	 * FLIGHT' or 'AT EXPORT AND ASSIGNED TO FINALIZED FLIGHT' and validates the
	 * goods against the disposition type.<br>
	 * * True - if the disposition type values are permissible for the specified
	 * function<br>
	 * * false - if the disposition type values are not permissible for the
	 * specified function
	 * </p>
	 * <p>
	 * false if disposition Type is any of below: <br>
	 * - On a finalized flight (Refer UC128 - Process Flight Finalization) <br>
	 * - Delivered (Refer UC180 - Process Shipment Delivery Request) <br>
	 * - Gone on delivery (Refer UC134 - Goods Status Change)
	 * </p>
	 * 
	 * @return Response object that hold the boolean value which depends on
	 *         whether the disposition type values are permissible for the
	 *         specified function
	 * 
	 */
	public boolean isValidForMovement() {
		return !DispositionType.GONE_ON_DELIVERY.equals(this)
				&& !DispositionType.DELIVERED.equals(this)
				&& !DispositionType.FINALIZED.equals(this)
				&& !DispositionType.AT_EXPORT_AND_ASSIGNED_TO_FINALIZED_FLIGHT.equals(this);

	}
	
	public boolean isValidForMovementFinalized() {
		return DispositionType.AT_EXPORT_AND_ASSIGNED_TO_FINALIZED_FLIGHT.equals(this)	;

	}

	/**
	 * <p>
	 * This methods will take an enum value say 'AT EXPORT AND ASSIGNED TO
	 * FLIGHT' or 'AT EXPORT AND ASSIGNED TO FINALIZED FLIGHT' and validates the
	 * goods against the disposition type.<br>
	 * * True - if the disposition type values are permissible for the specified
	 * function<br>
	 * * false - if the disposition type values are not permissible for the
	 * specified function
	 * </p>
	 * <p>
	 * false if disposition Type is any of below: <br>
	 * - On a finalized flight (Refer UC128 - Process Flight Finalization) <br>
	 * - Delivered (Refer UC180 - Process Shipment Delivery Request) <br>
	 * - Gone on delivery (Refer UC134 - Goods Status Change)
	 * </p>
	 * 
	 * @return Response object that hold the boolean value which depends on
	 *         whether the disposition type values are permissible for the
	 *         specified function
	 * 
	 */
	public boolean isValidForImportContainerMovement() {
		return DispositionType.BREAKDOWN.equals(this)
				|| DispositionType.FOR_INTERLINE_TRANSFER.equals(this)
				|| DispositionType.TRANSFER_MANIFESTED.equals(this);
	}

	/**
	 * This methods will take an enum value say 'AT EXPORT AND ASSIGNED TO
	 * FLIGHT' or 'AT EXPORT AND ASSIGNED TO FINALIZED FLIGHT' or
	 * AT_EXPORT_UNASSIGNED_TO_FLIGHT and validates the goods against the
	 * disposition type. * True - if the disposition type values are permissible
	 * for the specified function * false - if the disposition type values are
	 * not permissible for the specified function
	 * 
	 * 
	 * @return Response object that hold the boolean value which depends on
	 *         whether the disposition type values are permissible for the
	 *         specified function
	 * 
	 */
	public boolean isValidForCurrentStationAsBoardingStation() {
		return DispositionType.AT_EXPORT_AND_ASSIGNED_TO_FLIGHT.equals(this)
				|| DispositionType.AT_EXPORT_AND_ASSIGNED_TO_FINALIZED_FLIGHT
						.equals(this);
	}

	/**
	 * This methods will take an enum value say 'AT EXPORT AND ASSIGNED TO
	 * FLIGHT' or 'AT EXPORT AND ASSIGNED TO FINALIZED FLIGHT' or
	 * AT_EXPORT_UNASSIGNED_TO_FLIGHT and validates the goods against the
	 * disposition type. * True - if the disposition type values are permissible
	 * for the specified function * false - if the disposition type values are
	 * not permissible for the specified function
	 * 
	 * 
	 * @return Response object that hold the boolean value which depends on
	 *         whether the disposition type values are permissible for the
	 *         specified function
	 * 
	 */
	public boolean isExportDispostion() {
		return DispositionType.AT_EXPORT_UNASSIGNED_TO_FLIGHT.equals(this)
				|| DispositionType.AT_EXPORT_AND_ASSIGNED_TO_FLIGHT
						.equals(this)
				|| DispositionType.AT_EXPORT_AND_ASSIGNED_TO_FINALIZED_FLIGHT
						.equals(this);
	}

	/**
	 * This methods will take an enum value say 'DELIVERED' or 'BROKER' or
	 * 'SURFACE_CARRIER_TO_DESTINATION' and validates the goods against the
	 * disposition type. * True - if the disposition type values are permissible
	 * for the specified function * false - if the disposition type values are
	 * not permissible for the specified function
	 * 
	 * 
	 * @return Response object that hold the boolean value which depends on
	 *         whether the disposition type values are permissible for the
	 *         specified function
	 * 
	 */
	public boolean isImportDisposition() {
		return DispositionType.GONE_ON_DELIVERY.equals(this)
				||DispositionType.FOR_DELIVERY.equals(this)
				|| DispositionType.FINALIZED.equals(this)
				|| DispositionType.BROKER.equals(this)
				|| DispositionType.HOLD_AND_CALL.equals(this)
				|| DispositionType.SURFACE_CARRIER_TO_DESTINATION.equals(this);
	}

	/**
	 * This methods will take an enum value say 'MISSING_DATA' or
	 * 'FOR_INTERLINE_TRANSFER' or 'TRANSFER_MANIFESTED' and validates the goods
	 * against the disposition type. * True - if the disposition type values are
	 * permissible for the specified function * false - if the disposition type
	 * values are not permissible for the specified function
	 * 
	 * 
	 * @return Response object that hold the boolean value which depends on
	 *         whether the disposition type values are permissible for the
	 *         specified function
	 * 
	 */
	public boolean isGeneralDispostion() {
		return DispositionType.MISSING_DATA.equals(this)
				|| DispositionType.FOR_INTERLINE_TRANSFER.equals(this)
				|| DispositionType.TRANSFER_MANIFESTED.equals(this);
	}

	/**
	 * This methods will take an enum value say 'BREAKDOWN' or
	 * 'FOR_INTERLINE_TRANSFER' and validates the goods against the disposition
	 * type. * True - if the disposition type values are permissible for the
	 * specified function * false - if the disposition type values are not
	 * permissible for the specified function
	 * 
	 * CLULD stands for Carrier Loaded ULD
	 * 
	 * 
	 * 
	 * @return Response object that hold the boolean value which depends on
	 *         whether the disposition type values are permissible for the
	 *         specified function
	 * 
	 */
	public boolean isValidForCLULDInactivation() {
		return DispositionType.BREAKDOWN.equals(this)
				|| DispositionType.FOR_INTERLINE_TRANSFER.equals(this);
	}
	
	

	/**
	 * This methods will take an enum value say 'BREAKDOWN' or
	 * 'FOR_INTERLINE_TRANSFER' or 'HOLD_AND_CALL' and validates the goods
	 * against the disposition type. * True - if the disposition type values are
	 * permissible for the specified function * false - if the disposition type
	 * values are not permissible for the specified function
	 * 
	 * CLULD stands for Carrier Loaded ULD,SLULD stands for Shipper Loaded ULD.
	 * 
	 * @return Response object that hold the boolean value which depends on
	 *         whether the disposition type values are permissible for the
	 *         specified function
	 * 
	 */
	public boolean isValidForSLULDInactivation() {
		return !(DispositionType.AT_EXPORT_UNASSIGNED_TO_FLIGHT.equals(this)
				|| DispositionType.AT_EXPORT_AND_ASSIGNED_TO_FLIGHT
						.equals(this)
				|| DispositionType.TRANSFER_MANIFESTED.equals(this)
				|| DispositionType.AT_EXPORT_AND_ASSIGNED_TO_FINALIZED_FLIGHT
						.equals(this) || DispositionType.GONE_ON_DELIVERY
					.equals(this));
	}

	/**
	 * This methods will take an enum value say 'BREAKDOWN' or
	 * 'FOR_INTERLINE_TRANSFER' or 'HOLD_AND_CALL' and validates the goods
	 * against the disposition type. * True - if the disposition type values are
	 * permissible for the specified function * false - if the disposition type
	 * values are not permissible for the specified function
	 * 
	 * CLULD stands for Carrier Loaded ULD,SLULD stands for Shipper Loaded ULD.
	 * 
	 * @return Response object that hold the boolean value which depends on
	 *         whether the disposition type values are permissible for the
	 *         specified function
	 * 
	 */
	public boolean isValidForCLULDOrSLULDInactivation() {
		return DispositionType.BREAKDOWN.equals(this)
				|| DispositionType.HOLD_AND_CALL.equals(this)
				|| DispositionType.FOR_INTERLINE_TRANSFER.equals(this);
	}

	public boolean isDispositionValidForULDMovement() {
		return DispositionType.TRANSFER_MANIFESTED.equals(this)
				|| DispositionType.HOLD_AND_CALL.equals(this)
				|| DispositionType.MISSING_DATA.equals(this)
				|| DispositionType.FOR_INTERLINE_TRANSFER.equals(this)
				|| DispositionType.BROKER.equals(this)
				|| DispositionType.SURFACE_CARRIER_TO_DESTINATION.equals(this)
				||  DispositionType.FINALIZED.equals(this)
				||  DispositionType.FOR_DELIVERY.equals(this);
	}

	/**
	 * This methods is used in UC132 Check-In By Uld to determine if a
	 * container's status is valid for a next flight.
	 * <ul>
	 * <li><code>True</code> - if the disposition type is 'Export' or 'Missing'.
	 * </li>
	 * <li><code>false</code> - if the disposition type is
	 * 'Terminating'/'Breakdown'/'Broker'/'Surface Destination'/'Delivery'.</li>
	 * </ul>
	 * 
	 * @return Response object that hold the boolean value which depends on
	 *         whether the disposition type values are permissible for the
	 *         specified function
	 * 
	 */
	public boolean isDispositionValidForNextFlight() {
		if (this.isExportDispostion()
				|| DispositionType.MISSING_DATA.equals(this)) {
			return true;
		} else if (DispositionType.FOR_INTERLINE_TRANSFER.equals(this)
				|| DispositionType.TERMINATING.equals(this)
				|| DispositionType.BREAKDOWN.equals(this)
				|| DispositionType.SURFACE_CARRIER_TO_DESTINATION.equals(this)
				|| DispositionType.BROKER.equals(this)
				|| DispositionType.DELIVERED.equals(this)) {
			return false;
		}
		return false;
	}

	/**
	 * This methods is used in UC132 Check-In By Uld to determine if a
	 * container's status is valid for a next flight.
	 * <ul>
	 * <li><code>True</code> - if the disposition type is 'Export' or 'Missing'
	 * or 'Interline'.</li>
	 * <li><code>false</code> - if the disposition type is
	 * 'Terminating'/'Breakdown'/'Broker'/'Surface Destination'/'Delivery'.</li>
	 * </ul>
	 * 
	 * @return Response object that hold the boolean value which depends on
	 *         whether the disposition type values are permissible for the
	 *         specified function
	 * 
	 */
	public boolean isDispositionValidForOffload() {
		if (this.isExportDispostion()
				|| DispositionType.MISSING_DATA.equals(this)
				|| DispositionType.FOR_INTERLINE_TRANSFER.equals(this)) {
			return true;
		} else if (DispositionType.TERMINATING.equals(this)
				|| DispositionType.BREAKDOWN.equals(this)
				|| DispositionType.SURFACE_CARRIER_TO_DESTINATION.equals(this)
				|| DispositionType.BROKER.equals(this)
				|| DispositionType.DELIVERED.equals(this)) {
			return false;
		}
		return false;
	}

	/**
	 * This methods is used in UC190 Maintain Goods Discrepancy to determine if
	 * a goods' disposition is finalized.
	 * <ul>
	 * <li><code>True</code> - if the disposition type is 'Finalized' or 'Check
	 * in at non-mechanized station' or 'In transfer manifested' or 'Surface
	 * carrier to destination'.</li>
	 * <li><code>false</code> - if the disposition type is others.</li>
	 * </ul>
	 * 
	 * @return Response object that hold the boolean value which depends on
	 *         whether the disposition type values are permissible for the
	 *         specified function
	 * 
	 */
	public boolean isFinalizedDisposition() {
		return DispositionType.FINALIZED.equals(this);
	}

	
	public String toString() {
		return this.dispositionType;
	}
}