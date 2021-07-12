package com.unisys.trans.logistics.lms.framework.dto.operations;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class SegmentManifestDetailsDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold the <code>brokerIndicator</code> property.
     */
    private boolean brokerIndicator;

    /**
     * Attribute to hold the <code>Owner Operator Of Segment Header</code> property.
     */
    private String carrierName;

    /**
     * Attribute to hold the <code>consigneeIndicator</code> property.
     */
    private boolean consigneeIndicator;

    /**
     * Attribute to hold the <code>destBulkFreightOrder</code> property.
     */
    private int destBulkFreightOrder;

    /**
     * Attribute to hold the <code>destBulkPageBrkIndicator</code> property.
     */
    private boolean destBulkPageBrkIndicator;

    /**
     * Attribute to hold the <code>destinationAirportName</code> property.
     */
    private String destinationAirportName;

    /**
     * Attribute to hold the <code>destULDContentsOrder</code> property.
     */
    private int destULDContentsOrder;

    /**
     * Attribute to hold the <code>destULDPageBrkIndicator</code> property.
     */
    private boolean destULDPageBrkIndicator;

    /**
     * Attribute to hold the <code>ecCustomsBulkFreightOrder</code> property.
     */
    private int ecCustomsBulkFreightOrder;

    /**
     * Attribute to hold the <code>ecCustomsPageBrkIndicator</code> property.
     */
    private boolean ecCustomsPageBrkIndicator;

    /**
     * Attribute to hold the <code>ecCustomsULDContentsOrder</code> property.
     */
    private int ecCustomsULDContentsOrder;

    /**
     * Attribute to hold the <code>eCuldPageBrkIndicator</code> property.
     */
    private boolean eCULDPageBrkIndicator;

    /**
     * Attribute to hold the <code>manAircraftRegistration</code> property.
     */
    private String manAircraftRegistration;

    /**
     * Attribute to hold the <code>manIssuedBy</code> property.
     */
    private String manIssuedBy;

    /**
     * Attribute to hold the <code>manLine1Remarks</code> property.
     */
    private String manLine1Remarks;

    /**
     * Attribute to hold the <code>manLine2Remarks</code> property.
     */
    private String manLine2Remarks;

    /**
     * Attribute to hold the <code>manLine4Remarks</code> property.
     */
    private String manLine4Remarks;

    /**
     * Attribute to hold the <code>manLine6Remarks</code> property.
     */
    private String manLine6Remarks;

    /**
     * Attribute to hold the <code>manLine8Remarks</code> property.
     */
    private String manLine8Remarks;

    /**
     * Attribute to hold the <code>originAirportName</code> property.
     */
    private String originAirportName;

    /**
     * Attribute to hold the <code>ownerOfOperator</code> property.
     */
    private String ownerOfOperator;

    /**
     * Attribute to hold the <code>pageBreakBetweenIndicator</code> property.
     */
    private boolean pageBreakBetweenIndicator;

    /**
     * Attribute to hold the <code>printDualHeaderIndicator</code> property.
     */
    private boolean printDualHeaderIndicator;

    /**
     * Attribute to hold the <code>printHouseAirWaybillsIndicator</code> property.
     */
    private boolean printHouseAirWaybillsIndicator;

    /**
     * Attribute to hold the <code>printULDSeperateIndicator</code> property.
     */
    private boolean printULDSeperateIndicator;

    /**
     * Attribute to hold the <code>prodCodeBulkFreightOrder</code> property.
     */
    private int prodCodeBulkFreightOrder;

    /**
     * Attribute to hold the <code>prodCodePageBrkIndicator</code> property.
     */
    private boolean prodCodePageBrkIndicator;

    /**
     * Attribute to hold the <code>prodCodeULDContentsOrder</code> property.
     */
    private int prodCodeULDContentsOrder;

    /**
     * Attribute to hold the <code>prodULDPageBrkIndicator</code> property.
     */
    private boolean prodULDPageBrkIndicator;

    /**
     * Attribute to hold the <code>sepExprShipmentIndicator</code> property.
     */
    private boolean sepExprShipmentIndicator;

    /**
     * Attribute to hold the <code>shipperIndicator</code> property.
     */
    private boolean shipperIndicator;

    /**
     * Gets the value of the <code>carrierName</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>carrierName</code> property.
     */
    public String getCarrierName() {
        return this.carrierName;
    }

    /**
     * Gets the value of the <code>destBulkFreightOrder</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>destBulkFreightOrder</code> property.
     */
    public int getDestBulkFreightOrder() {
        return this.destBulkFreightOrder;
    }

    /**
     * Gets the value of the <code>destinationAirportName</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>destinationAirportName</code> property.
     */
    public String getDestinationAirportName() {
        return this.destinationAirportName;
    }

    /**
     * Gets the value of the <code>destULDContentsOrder</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>destULDContentsOrder</code> property.
     */
    public int getDestULDContentsOrder() {
        return this.destULDContentsOrder;
    }

    /**
     * Gets the value of the <code>ecCustomsBulkFreightOrder</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>ecCustomsBulkFreightOrder</code> property.
     */
    public int getEcCustomsBulkFreightOrder() {
        return this.ecCustomsBulkFreightOrder;
    }

    /**
     * Gets the value of the <code>ecCustomsULDContentsOrder</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>ecCustomsULDContentsOrder</code> property.
     */
    public int getEcCustomsULDContentsOrder() {
        return this.ecCustomsULDContentsOrder;
    }

    /**
     * Gets the value of the <code>manAircraftRegistration</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>manAircraftRegistration</code> property.
     */
    public String getManAircraftRegistration() {
        return this.manAircraftRegistration;
    }

    /**
     * Gets the value of the <code>manIssuedBy</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>manIssuedBy</code> property.
     */
    public String getManIssuedBy() {
        return this.manIssuedBy;
    }

    /**
     * Gets the value of the <code>manLine1Remarks</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>manLine1Remarks</code> property.
     */
    public String getManLine1Remarks() {
        return this.manLine1Remarks;
    }

    /**
     * Gets the value of the <code>manLine2Remarks</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>manLine2Remarks</code> property.
     */
    public String getManLine2Remarks() {
        return this.manLine2Remarks;
    }

    /**
     * Gets the value of the <code>manLine4Remarks</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>manLine4Remarks</code> property.
     */
    public String getManLine4Remarks() {
        return this.manLine4Remarks;
    }

    /**
     * Gets the value of the <code>manLine6Remarks</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>manLine6Remarks</code> property.
     */
    public String getManLine6Remarks() {
        return this.manLine6Remarks;
    }

    /**
     * Gets the value of the <code>manLine8Remarks</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>manLine8Remarks</code> property.
     */
    public String getManLine8Remarks() {
        return this.manLine8Remarks;
    }

    @Override
    public Long getOId() {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Gets the value of the <code>originAirportName</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>originAirportName</code> property.
     */
    public String getOriginAirportName() {
        return this.originAirportName;
    }

    /**
     * Gets the value of the <code>ownerOfOperator</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>ownerOfOperator</code> property.
     */
    public String getOwnerOfOperator() {
        return this.ownerOfOperator;
    }

    /**
     * Gets the value of the <code>prodCodeBulkFreightOrder</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>prodCodeBulkFreightOrder</code> property.
     */
    public int getProdCodeBulkFreightOrder() {
        return this.prodCodeBulkFreightOrder;
    }

    /**
     * Gets the value of the <code>prodCodeULDContentsOrder</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>prodCodeULDContentsOrder</code> property.
     */
    public int getProdCodeULDContentsOrder() {
        return this.prodCodeULDContentsOrder;
    }

    /**
     * Gets the value of the <code>brokerIndicator</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>brokerIndicator</code> property.
     */
    public boolean isBrokerIndicator() {
        return this.brokerIndicator;
    }

    /**
     * Gets the value of the <code>consigneeIndicator</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>consigneeIndicator</code> property.
     */
    public boolean isConsigneeIndicator() {
        return this.consigneeIndicator;
    }

    /**
     * Gets the <code>destBulkPageBrkIndicator</code> property.
     * <p>
     * <b>Possible Values:</b><br>
     * <li><code>true</code><br>
     * Print each new value of each sorted field within bulk freight on a new page. Page break does not apply
     * to goods inside a container.
     * <li><code>false</code><br>
     * Do not output new values of sorted field on a new page.
     * <p>
     * 
     * @return the current value of the <code>destBulkPageBrkIndicator</code> property
     */
    public boolean isDestBulkPageBrkIndicator() {
        return this.destBulkPageBrkIndicator;
    }

    /**
     * Gets the <code>destULDPageBrkIndicator</code> property.
     * <p>
     * <b>Possible Values:</b><br>
     * <li><code>true</code><br>
     * Print each new value of each sorted field within bulk freight on a new page. Page break does not apply
     * to goods inside a container.
     * <li><code>false</code><br>
     * Do not output new values of sorted field on a new page.
     * <p>
     * 
     * @return the current value of the <code>destULDPageBrkIndicator</code> property
     */
    public boolean isDestULDPageBrkIndicator() {
        return this.destULDPageBrkIndicator;
    }

    /**
     * Gets the <code>ecCustomsPageBrkIndicator</code> property.
     * <p>
     * <b>Possible Values:</b><br>
     * <li><code>true</code><br>
     * Print each new value of each sorted field within bulk freight on a new page. Page break does not apply
     * to goods inside a container.
     * <li><code>false</code><br>
     * Do not output new values of sorted field on a new page.
     * <p>
     * 
     * @return the current value of the <code>ecCustomsPageBrkIndicator</code> property
     */
    public boolean isEcCustomsPageBrkIndicator() {
        return this.ecCustomsPageBrkIndicator;
    }

    /**
     * Gets the <code>eCULDPageBrkIndicator</code> property.
     * <p>
     * <b>Possible Values:</b><br>
     * <li><code>true</code><br>
     * Print each new value of each sorted field within bulk freight on a new page. Page break does not apply
     * to goods inside a container.
     * <li><code>false</code><br>
     * Do not output new values of sorted field on a new page.
     * <p>
     * 
     * @return the current value of the <code>eCULDPageBrkIndicator</code> property
     */
    public boolean isECULDPageBrkIndicator() {
        return this.eCULDPageBrkIndicator;
    }

    /**
     * Gets the value of the <code>pageBreakBetweenIndicator</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>pageBreakBetweenIndicator</code> property.
     */
    public boolean isPageBreakBetweenIndicator() {
        return this.pageBreakBetweenIndicator;
    }

    /**
     * Gets the value of the <code>printDualHeaderIndicator</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>printDualHeaderIndicator</code> property.
     */
    public boolean isPrintDualHeaderIndicator() {
        return this.printDualHeaderIndicator;
    }

    /**
     * Gets the value of the <code>printHouseAirWaybillsIndicator</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>printHouseAirWaybillsIndicator</code> property.
     */
    public boolean isPrintHouseAirWaybillsIndicator() {
        return this.printHouseAirWaybillsIndicator;
    }

    /**
     * Gets the value of the <code>printULDSeperateIndicator</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>printULDSeperateIndicator</code> property.
     */
    public boolean isPrintULDSeperateIndicator() {
        return this.printULDSeperateIndicator;
    }

    /**
     * Gets the <code>prodCodePageBrkIndicator</code> property.
     * <p>
     * <b>Possible Values:</b><br>
     * <li><code>true</code><br>
     * Print each new value of each sorted field within bulk freight on a new page. Page break does not apply
     * to goods inside a container
     * <li><code>false</code><br>
     * Do not output new values of sorted field on a new page
     * <p>
     * 
     * @return the current value of the <code>prodCodePageBrkIndicator</code> property
     */
    public boolean isProdCodePageBrkIndicator() {
        return this.prodCodePageBrkIndicator;
    }

    /**
     * Gets the <code>prodULDPageBrkIndicator</code> property.
     * <p>
     * <b>Possible Values:</b><br>
     * <li><code>true</code><br>
     * - Print each new value of each sorted field within bulk freight on a new page. Page break does not
     * apply to goods inside a container
     * <li><code>false</code><br>
     * - Do not output new values of sorted field on a new page
     * <p>
     * 
     * @return the current value of the <code>prodULDPageBrkIndicator</code> property
     */
    public boolean isProdULDPageBrkIndicator() {
        return this.prodULDPageBrkIndicator;
    }

    /**
     * Gets the value of the <code>sepExprShipmentIndicator</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>sepExprShipmentIndicator</code> property.
     */
    public boolean isSepExprShipmentIndicator() {
        return this.sepExprShipmentIndicator;
    }

    /**
     * Gets the value of the <code>shipperIndicator</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>shipperIndicator</code> property.
     */
    public boolean isShipperIndicator() {
        return this.shipperIndicator;
    }

    /**
     * Sets the value of the <code>brokerIndicator</code> property.
     * <p>
     * 
     * @param <code>brokerIndicator</code> Holds the new value of the <code>brokerIndicator</code> property.
     */
    public void setBrokerIndicator(final boolean brokerIndicator) {
        this.brokerIndicator = brokerIndicator;
    }

    /**
     * Sets the value of the <code>carrierName</code> property.
     * <p>
     * 
     * @param <code>carrierName</code> Holds the new value of the <code>carrierName</code> property.
     */
    public void setCarrierName(final String carrierName) {
        this.carrierName = carrierName;
    }

    /**
     * Sets the value of the <code>consigneeIndicator</code> property.
     * <p>
     * 
     * @param <code>consigneeIndicator</code> Holds the new value of the <code>consigneeIndicator</code>
     *        property.
     */
    public void setConsigneeIndicator(final boolean consigneeIndicator) {
        this.consigneeIndicator = consigneeIndicator;
    }

    /**
     * Sets the value of the <code>destBulkFreightOrder</code> property.
     * <p>
     * 
     * @param <code>destBulkFreightOrder</code> Holds the new value of the <code>destBulkFreightOrder</code>
     *        property.
     */
    public void setDestBulkFreightOrder(final int destBulkFreightOrder) {
        this.destBulkFreightOrder = destBulkFreightOrder;
    }

    /**
     * Sets the <code>destBulkPageBrkIndicator</code> property.
     * <p>
     * <b>Possible Values:</b><br>
     * <li><code>true</code><br>
     * Print each new value of each sorted field within bulk freight on a new page. Page break does not apply
     * to goods inside a container.
     * <li><code>false</code><br>
     * Do not output new values of sorted field on a new page.
     * <p>
     * 
     * @param pDestBulkPageBrkIndicator
     *            the new value of the <code>destBulkPageBrkIndicator</code> property
     */
    public void setDestBulkPageBrkIndicator(final boolean pDestBulkPageBrkIndicator) {
        this.destBulkPageBrkIndicator = pDestBulkPageBrkIndicator;
    }

    /**
     * Sets the value of the <code>destinationAirportName</code> property.
     * <p>
     * 
     * @param <code>destinationAirportName</code> Holds the new value of the
     *        <code>destinationAirportName</code> property.
     */
    public void setDestinationAirportName(final String destinationAirportName) {
        this.destinationAirportName = destinationAirportName;
    }

    /**
     * Sets the value of the <code>destULDContentsOrder</code> property.
     * <p>
     * 
     * @param <code>destULDContentsOrder</code> Holds the new value of the <code>destULDContentsOrder</code>
     *        property.
     */
    public void setDestULDContentsOrder(final int destULDContentsOrder) {
        this.destULDContentsOrder = destULDContentsOrder;
    }

    /**
     * Sets the <code>destULDPageBrkIndicator</code> property.
     * <p>
     * <b>Possible Values:</b><br>
     * <li><code>true</code><br>
     * Print each new value of each sorted field within bulk freight on a new page. Page break does not apply
     * to goods inside a container.
     * <li><code>false</code><br>
     * Do not output new values of sorted field on a new page.
     * <p>
     * 
     * @param pDestULDPageBrkIndicator
     *            the new value of the <code>destULDPageBrkIndicator</code> property
     */
    public void setDestULDPageBrkIndicator(final boolean pDestULDPageBrkIndicator) {
        this.destULDPageBrkIndicator = pDestULDPageBrkIndicator;
    }

    /**
     * Sets the value of the <code>ecCustomsBulkFreightOrder</code> property.
     * <p>
     * 
     * @param <code>ecCustomsBulkFreightOrder</code> Holds the new value of the
     *        <code>ecCustomsBulkFreightOrder</code> property.
     */
    public void setEcCustomsBulkFreightOrder(final int ecCustomsBulkFreightOrder) {
        this.ecCustomsBulkFreightOrder = ecCustomsBulkFreightOrder;
    }

    /**
     * Sets the <code>ecCustomsPageBrkIndicator</code> property.
     * <p>
     * <b>Possible Values:</b><br>
     * <li><code>true</code><br>
     * Print each new value of each sorted field within bulk freight on a new page. Page break does not apply
     * to goods inside a container.
     * <li><code>false</code><br>
     * Do not output new values of sorted field on a new page.
     * <p>
     * 
     * @param pEcCustomsPageBrkIndicator
     *            the new value of the <code>ecCustomsPageBrkIndicator</code> property
     */
    public void setEcCustomsPageBrkIndicator(final boolean pEcCustomsPageBrkIndicator) {
        this.ecCustomsPageBrkIndicator = pEcCustomsPageBrkIndicator;
    }

    /**
     * Sets the value of the <code>ecCustomsULDContentsOrder</code> property.
     * <p>
     * 
     * @param <code>ecCustomsULDContentsOrder</code> Holds the new value of the
     *        <code>ecCustomsULDContentsOrder</code> property.
     */
    public void setEcCustomsULDContentsOrder(final int ecCustomsULDContentsOrder) {
        this.ecCustomsULDContentsOrder = ecCustomsULDContentsOrder;
    }

    /**
     * Sets the <code>eCULDPageBrkIndicator</code> property.
     * <p>
     * <b>Possible Values:</b><br>
     * <li><code>true</code><br>
     * Print each new value of each sorted field within bulk freight on a new page. Page break does not apply
     * to goods inside a container.
     * <li><code>false</code><br>
     * Do not output new values of sorted field on a new page.
     * <p>
     * 
     * @param pECULDPageBrkIndicator
     *            the new value of the <code>eCULDPageBrkIndicator</code> property
     */
    public void setECULDPageBrkIndicator(final boolean pECULDPageBrkIndicator) {
        this.eCULDPageBrkIndicator = pECULDPageBrkIndicator;
    }

    /**
     * Sets the value of the <code>manAircraftRegistration</code> property.
     * <p>
     * 
     * @param <code>manAircraftRegistration</code> Holds the new value of the
     *        <code>manAircraftRegistration</code> property.
     */
    public void setManAircraftRegistration(final String manAircraftRegistration) {
        this.manAircraftRegistration = manAircraftRegistration;
    }

    /**
     * Sets the value of the <code>manIssuedBy</code> property.
     * <p>
     * 
     * @param <code>manIssuedBy</code> Holds the new value of the <code>manIssuedBy</code> property.
     */
    public void setManIssuedBy(final String manIssuedBy) {
        this.manIssuedBy = manIssuedBy;
    }

    /**
     * Sets the value of the <code>manLine1Remarks</code> property.
     * <p>
     * 
     * @param <code>manLine1Remarks</code> Holds the new value of the <code>manLine1Remarks</code> property.
     */
    public void setManLine1Remarks(final String manLine1Remarks) {
        this.manLine1Remarks = manLine1Remarks;
    }

    /**
     * Sets the value of the <code>manLine2Remarks</code> property.
     * <p>
     * 
     * @param <code>manLine2Remarks</code> Holds the new value of the <code>manLine2Remarks</code> property.
     */
    public void setManLine2Remarks(final String manLine2Remarks) {
        this.manLine2Remarks = manLine2Remarks;
    }

    /**
     * Sets the value of the <code>manLine4Remarks</code> property.
     * <p>
     * 
     * @param <code>manLine4Remarks</code> Holds the new value of the <code>manLine4Remarks</code> property.
     */
    public void setManLine4Remarks(final String manLine4Remarks) {
        this.manLine4Remarks = manLine4Remarks;
    }

    /**
     * Sets the value of the <code>manLine6Remarks</code> property.
     * <p>
     * 
     * @param <code>manLine6Remarks</code> Holds the new value of the <code>manLine6Remarks</code> property.
     */
    public void setManLine6Remarks(final String manLine6Remarks) {
        this.manLine6Remarks = manLine6Remarks;
    }

    /**
     * Sets the value of the <code>manLine8Remarks</code> property.
     * <p>
     * 
     * @param <code>manLine8Remarks</code> Holds the new value of the <code>manLine8Remarks</code> property.
     */
    public void setManLine8Remarks(final String manLine8Remarks) {
        this.manLine8Remarks = manLine8Remarks;
    }

    /**
     * Sets the value of the <code>originAirportName</code> property.
     * <p>
     * 
     * @param <code>originAirportName</code> Holds the new value of the <code>originAirportName</code>
     *        property.
     */
    public void setOriginAirportName(final String originAirportName) {
        this.originAirportName = originAirportName;
    }

    /**
     * Sets the value of the <code>ownerOfOperator</code> property.
     * <p>
     * 
     * @param <code>ownerOfOperator</code> Holds the new value of the <code>ownerOfOperator</code> property.
     */
    public void setOwnerOfOperator(final String ownerOfOperator) {
        this.ownerOfOperator = ownerOfOperator;
    }

    /**
     * Sets the value of the <code>pageBreakBetweenIndicator</code> property.
     * <p>
     * 
     * @param <code>pageBreakBetweenIndicator</code> Holds the new value of the
     *        <code>pageBreakBetweenIndicator</code> property.
     */
    public void setPageBreakBetweenIndicator(final boolean pageBreakBetweenIndicator) {
        this.pageBreakBetweenIndicator = pageBreakBetweenIndicator;
    }

    /**
     * Sets the value of the <code>printDualHeaderIndicator</code> property.
     * <p>
     * 
     * @param <code>printDualHeaderIndicator</code> Holds the new value of the
     *        <code>printDualHeaderIndicator</code> property.
     */
    public void setPrintDualHeaderIndicator(final boolean printDualHeaderIndicator) {
        this.printDualHeaderIndicator = printDualHeaderIndicator;
    }

    /**
     * Sets the value of the <code>printHouseAirWaybillsIndicator</code> property.
     * <p>
     * 
     * @param <code>pPrintHouseAirWaybillsIndicator</code> Holds the new value of the
     *        <code>printHouseAirWaybillsIndicator</code> property.
     */
    public void setPrintHouseAirWaybillsIndicator(final boolean pPrintHouseAirWaybillsIndicator) {
        this.printHouseAirWaybillsIndicator = pPrintHouseAirWaybillsIndicator;
    }

    /**
     * Sets the value of the <code>printULDSeperateIndicator</code> property.
     * <p>
     * 
     * @param <code>printULDSeperateIndicator</code> Holds the new value of the
     *        <code>printULDSeperateIndicator</code> property.
     */
    public void setPrintULDSeperateIndicator(final boolean printULDSeperateIndicator) {
        this.printULDSeperateIndicator = printULDSeperateIndicator;
    }

    /**
     * Sets the value of the <code>prodCodeBulkFreightOrder</code> property.
     * <p>
     * 
     * @param <code>prodCodeBulkFreightOrder</code> Holds the new value of the
     *        <code>prodCodeBulkFreightOrder</code> property.
     */
    public void setProdCodeBulkFreightOrder(final int prodCodeBulkFreightOrder) {
        this.prodCodeBulkFreightOrder = prodCodeBulkFreightOrder;
    }

    /**
     * Sets the <code>prodCodePageBrkIndicator</code> property.
     * <p>
     * <b>Possible Values:</b><br>
     * <li><code>true</code><br>
     * Print each new value of each sorted field within bulk freight on a new page. Page break does not apply
     * to goods inside a container
     * <li><code>false</code><br>
     * Do not output new values of sorted field on a new page
     * <p>
     * 
     * @param pProdCodePageBrkIndicator
     *            the new value of the <code>prodCodePageBrkIndicator</code> property
     */
    public void setProdCodePageBrkIndicator(final boolean pProdCodePageBrkIndicator) {
        this.prodCodePageBrkIndicator = pProdCodePageBrkIndicator;
    }

    /**
     * Sets the value of the <code>prodCodeULDContentsOrder</code> property.
     * <p>
     * 
     * @param <code>prodCodeULDContentsOrder</code> Holds the new value of the
     *        <code>prodCodeULDContentsOrder</code> property.
     */
    public void setProdCodeULDContentsOrder(final int prodCodeULDContentsOrder) {
        this.prodCodeULDContentsOrder = prodCodeULDContentsOrder;
    }

    /**
     * Sets the <code>prodULDPageBrkIndicator</code> property.
     * <p>
     * <b>Possible Values:</b><br>
     * <li><code>true</code><br>
     * - Print each new value of each sorted field within bulk freight on a new page. Page break does not
     * apply to goods inside a container
     * <li><code>false</code><br>
     * - Do not output new values of sorted field on a new page
     * <p>
     * 
     * @param pProdULDPageBrkIndicator
     *            the new value of the <code>prodULDPageBrkIndicator</code> property
     */
    public void setProdULDPageBrkIndicator(final boolean pProdULDPageBrkIndicator) {
        this.prodULDPageBrkIndicator = pProdULDPageBrkIndicator;
    }

    /**
     * Sets the value of the <code>sepExprShipmentIndicator</code> property.
     * <p>
     * 
     * @param <code>sepExprShipmentIndicator</code> Holds the new value of the
     *        <code>sepExprShipmentIndicator</code> property.
     */
    public void setSepExprShipmentIndicator(final boolean sepExprShipmentIndicator) {
        this.sepExprShipmentIndicator = sepExprShipmentIndicator;
    }

    /**
     * Sets the value of the <code>shipperIndicator</code> property.
     * <p>
     * 
     * @param <code>shipperIndicator</code> Holds the new value of the <code>shipperIndicator</code> property.
     */
    public void setShipperIndicator(final boolean shipperIndicator) {
        this.shipperIndicator = shipperIndicator;
    }
}