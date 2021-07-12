package com.unisys.trans.logistics.lms.framework.dto.operations;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.AirWaybillNumberDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.FlightIrregularityType;

public class ManifestContainerDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold the <code>activationStation</code> property.
     */
    private String activationStation;

    /**
     * Attribute to hold the <code>airWaybillNumberDto</code> property.
     */
    private AirWaybillNumberDto airWaybillNumberDto;

    /**
     * Attribute to hold <code>autoCloseIndicator</code> property.
     */
    private boolean autoCloseIndicator;

    /**
     * Attribute to hold the <code>awbCreationTimeStamp</code> property.
     */
    private Date awbCreationTimeStamp;

    /**
     * Attribute to hold <code>awbOID</code> property.
     */
    private Long awbOID;

    /**
     * Attribute to hold the <code>changeIndicator</code> property.
     */
    private boolean changeIndicator;

    /**
     * Attribute to hold the <code>containerId</code> property.
     */
    private String containerId;

    /**
     * Attribute to hold the <code>currentContour</code> property.
     */
    private String currentContour;

    /**
     * Attribute to hold the <code>destination</code> property.
     */
    private String destination;

    /**
     * Attribute to hold <code>discrepancyIndicator</code> property.
     */
    private boolean discrepancyIndicator;

    /**
     * Attribute to hold the <code>flightIrregularityType</code> property.
     */
    private FlightIrregularityType flightIrregularityType;

    /**
     * Attribute to hold the <code>flightManifestGroup</code> property.
     */
    private FlightManifestGroupDto flightManifestGroup;

    /**
     * Attribute to hold the <code>inputWeight</code> property.
     */
    private BigDecimal inputWeight;

    /**
     * Attribute to hold <code>location</code> property.
     */
    private String location;

    /**
     * Attribute to hold the <code>manifestGoods</code> property.
     */
    private List<ManifestGoodsDto> manifestGoods;

    /**
     * Attribute to hold the <code>nextFlightBookingSegment</code> property.
     */
    private CandidateBookingSegmentDto nextFlightBookingSegment;

    /**
     * Attribute to hold the <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold the <code>openIndicator</code> property.
     */
    private Boolean openIndicator;

    /**
     * Attribute to hold the <code>origin</code> property.
     */
    private String origin;

    /**
     * Attribute to hold the <code>percentageFull</code> property.
     */
    private Integer percentageFull;

    /**
     * Attribute to hold <code>printEligibleIndicator</code> property.
     */
    private boolean printEligibleIndicator;

    /**
     * Attribute to hold the <code>printIndicator</code> property.
     */
    private boolean printIndicator;

    /**
     * Attribute to hold the <code>selectionIndicator</code> property.
     */
    private boolean selectionIndicator;

    /**
     * Attribute to hold the <code>shipperLoadedULDIndicator</code> property.
     */
    private boolean shipperLoadedULDIndicator;

    /**
     * Attribute to hold the <code>status</code> property.
     */
    private String status;

    /**
     * Attribute to hold the <code>totalPieces</code> property.
     */
    private Long totalPieces;

    /**
     * Attribute to hold the <code>totalweight</code> property.
     */
    private BigDecimal totalweight;

    /**
     * Gets the value of the <code>activationStation</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>activationStation</code> property.
     */
    public String getActivationStation() {
        return this.activationStation;
    }

    /**
     * Gets the value of the <code>airWaybillNumberDto</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>airWaybillNumberDto</code> property.
     */
    public AirWaybillNumberDto getAirWaybillNumberDto() {
        return this.airWaybillNumberDto;
    }

    /**
     * Gets the value of the <code>awbCreationTimeStamp</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>awbCreationTimeStamp</code> property.
     */
    public Date getAwbCreationTimeStamp() {
        if (this.awbCreationTimeStamp != null) {
            return (Date) this.awbCreationTimeStamp.clone();
        }
        else {
            return null;
        }
    }

    /**
     * Gets the value of the <code>awbOId</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>awbOId</code> property.
     */
    public Long getAwbOID() {
        return this.awbOID;
    }

    /**
     * Gets the value of the <code>containerId</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>containerId</code> property.
     */
    public String getContainerId() {
        return this.containerId;
    }

    /**
     * Gets the value of the <code>currentContour</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>currentContour</code> property.
     */
    public String getCurrentContour() {
        return this.currentContour;
    }

    /**
     * Gets the value of the <code>destination</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>destination</code> property.
     */
    public String getDestination() {
        return this.destination;
    }

    /**
     * Gets the value of the <code>flightIrregularityType</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>flightIrregularityType</code> property.
     */
    public FlightIrregularityType getFlightIrregularityType() {
        return this.flightIrregularityType;
    }

    /**
     * Gets the value of the <code>flightManifestGroup</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>flightManifestGroup</code> property.
     */
    public FlightManifestGroupDto getFlightManifestGroup() {
        if (this.flightManifestGroup == null) {
            this.flightManifestGroup = new FlightManifestGroupDto();
        }
        return this.flightManifestGroup;
    }

    /**
     * Gets the value of the <code>inputWeight</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>inputWeight</code> property.
     */
    public BigDecimal getInputWeight() {
        return this.inputWeight;
    }

    /**
     * Gets the value of the <code>location</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>location</code> property.
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * Gets the value of the <code>manifestGoods</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>manifestGoods</code> property.
     */
    public List<ManifestGoodsDto> getManifestGoods() {
        return this.manifestGoods;
    }

    /**
     * Gets the value of the <code>nextFlightBookingSegment</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>nextFlightBookingSegment</code> property.
     */
    public CandidateBookingSegmentDto getNextFlightBookingSegment() {
        return this.nextFlightBookingSegment;
    }

    /**
     * Gets the value of the <code>oId</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>oId</code> property.
     */
    public Long getoId() {
        return this.oId;
    }

    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the value of the <code>openIndicator</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>openIndicator</code> property.
     */
    public Boolean getOpenIndicator() {
        return this.openIndicator;
    }

    /**
     * Gets the value of the <code>origin</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>origin</code> property.
     */
    public String getOrigin() {
        return this.origin;
    }

    /**
     * Gets the value of the <code>percentageFull</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>percentageFull</code> property.
     */
    public Integer getPercentageFull() {
        return this.percentageFull;
    }

    /**
     * Gets the value of the <code>status</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>status</code> property.
     */
    public String getStatus() {
        return this.status;
    }

    public Long getTotalPieces() {
        return this.totalPieces;
    }

    public BigDecimal getTotalweight() {
        return this.totalweight;
    }

    /**
     * Gets the value of the <code>autoCloseIndicator</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>autoCloseIndicator</code> property.
     */
    public boolean isAutoCloseIndicator() {
        return this.autoCloseIndicator;
    }

    /**
     * Gets the value of the <code>changeIndicator</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>changeIndicator</code> property.
     */
    public boolean isChangeIndicator() {
        return this.changeIndicator;
    }

    /**
     * Gets the value of the <code>discrepancyIndicator</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>discrepancyIndicator</code> property.
     */
    public boolean isDiscrepancyIndicator() {
        return this.discrepancyIndicator;
    }

    /**
     * Gets the value of the <code>printEligibleIndicator</code> property injected by the Inversion of Control
     * (IoC)
     * container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @return the current value of <code>printEligibleIndicator</code> property.
     */
    public boolean isPrintEligibleIndicator() {
        return this.printEligibleIndicator;
    }

    /**
     * Gets the value of the <code>printIndicator</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>printIndicator</code> property.
     */
    public boolean isPrintIndicator() {
        return this.printIndicator;
    }

    /**
     * @return the selectionIndicator
     */
    public boolean isSelectionIndicator() {
        return this.selectionIndicator;
    }

    /**
     * Gets the value of the <code>shipperLoadedULDIndicator</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>shipperLoadedULDIndicator</code> property.
     */
    public boolean isShipperLoadedULDIndicator() {
        return this.shipperLoadedULDIndicator;
    }

    /**
     * Sets the value of the <code>activationStation</code> property.
     * <p>
     * 
     * @param <code>activationStation</code> Holds the new value of the <code>activationStation</code>
     *        property.
     */
    public void setActivationStation(final String activationStation) {
        this.activationStation = activationStation;
    }

    /**
     * Sets the value of the <code>airWaybillNumberDto</code> property.
     * <p>
     * 
     * @param <code>airWaybillNumberDto</code> Holds the new value of the <code>airWaybillNumberDto</code>
     *        property.
     */
    public void setAirWaybillNumberDto(final AirWaybillNumberDto airWaybillNumberDto) {
        this.airWaybillNumberDto = airWaybillNumberDto;
    }

    /**
     * Sets the value of the <code>autoCloseIndicator</code> property.
     * <p>
     * 
     * @param <code>pAutoCloseIndicator</code> Holds the new value of the <code>autoCloseIndicator</code>
     *        property.
     */
    public void setAutoCloseIndicator(final boolean pAutoCloseIndicator) {
        this.autoCloseIndicator = pAutoCloseIndicator;
    }

    /**
     * Sets the value of the <code>awbCreationTimeStamp</code> property.
     * <p>
     * 
     * @param <code>awbCreationTimeStamp</code> Holds the new value of the <code>awbCreationTimeStamp</code>
     *        property.
     */
    public void setAwbCreationTimeStamp(final Date awbCreationTimeStamp) {
        if (awbCreationTimeStamp != null) {
            this.awbCreationTimeStamp = (Date) awbCreationTimeStamp.clone();
        }
        else
        {
            this.awbCreationTimeStamp = null;
        }
    }

    /**
     * Sets the value of the <code>awbOId</code> property.
     * <p>
     * 
     * @param <code>pAwbOID</code> Holds the new value of the <code>awbOId</code> property.
     */
    public void setAwbOID(final Long pAwbOID) {
        this.awbOID = pAwbOID;
    }

    /**
     * Sets the value of the <code>changeIndicator</code> property.
     * <p>
     * 
     * @param <code>changeIndicator</code> Holds the new value of the <code>changeIndicator</code> property.
     */
    public void setChangeIndicator(final boolean changeIndicator) {
        this.changeIndicator = changeIndicator;
    }

    /**
     * Sets the value of the <code>containerId</code> property.
     * <p>
     * 
     * @param <code>containerId</code> Holds the new value of the <code>containerId</code> property.
     */
    public void setContainerId(final String containerId) {
        this.containerId = containerId;
    }

    /**
     * Sets the value of the <code>currentContour</code> property.
     * <p>
     * 
     * @param <code>currentContour</code> Holds the new value of the <code>currentContour</code> property.
     */
    public void setCurrentContour(final String currentContour) {
        this.currentContour = currentContour;
    }

    /**
     * Sets the value of the <code>destination</code> property.
     * <p>
     * 
     * @param <code>destination</code> Holds the new value of the <code>destination</code> property.
     */
    public void setDestination(final String destination) {
        this.destination = destination;
    }

    /**
     * Sets the value of the <code>discrepancyIndicator</code> property.
     * <p>
     * 
     * @param <code>pDiscrepancyIndicator</code> Holds the new value of the <code>discrepancyIndicator</code>
     *        property.
     */
    public void setDiscrepancyIndicator(final boolean pDiscrepancyIndicator) {
        this.discrepancyIndicator = pDiscrepancyIndicator;
    }

    /**
     * Sets the value of the <code>flightIrregularityType</code> property.
     * <p>
     * 
     * @param <code>flightIrregularityType</code> Holds the new value of the
     *        <code>flightIrregularityType</code> property.
     */
    public void setFlightIrregularityType(final FlightIrregularityType flightIrregularityType) {
        this.flightIrregularityType = flightIrregularityType;
    }

    /**
     * Sets the value of the <code>flightManifestGroup</code> property.
     * <p>
     * 
     * @param <code>flightManifestGroup</code> Holds the new value of the <code>flightManifestGroup</code>
     *        property.
     */
    public void setFlightManifestGroup(final FlightManifestGroupDto flightManifestGroup) {
        this.flightManifestGroup = flightManifestGroup;
    }

    /**
     * Sets the value of the <code>inputWeight</code> property.
     * <p>
     * 
     * @param <code>inputWeight</code> Holds the new value of the <code>inputWeight</code> property.
     */
    public void setInputWeight(final BigDecimal inputWeight) {
        this.inputWeight = inputWeight;
    }

    /**
     * Sets the value of the <code>location</code> property.
     * <p>
     * 
     * @param <code>pLocation</code> Holds the new value of the <code>location</code> property.
     */
    public void setLocation(final String pLocation) {
        this.location = pLocation;
    }

    /**
     * Sets the value of the <code>manifestGoods</code> property.
     * <p>
     * 
     * @param <code>manifestGoods</code> Holds the new value of the <code>manifestGoods</code> property.
     */
    public void setManifestGoods(final List<ManifestGoodsDto> manifestGoods) {
        this.manifestGoods = manifestGoods;
    }

    /**
     * Sets the value of the <code>nextFlightBookingSegment</code> property.
     * <p>
     * 
     * @param <code>nextFlightBookingSegment</code> Holds the new value of the
     *        <code>nextFlightBookingSegment</code> property.
     */
    public void setNextFlightBookingSegment(final CandidateBookingSegmentDto nextFlightBookingSegment) {
        this.nextFlightBookingSegment = nextFlightBookingSegment;
    }

    /**
     * Sets the value of the <code>oId</code> property.
     * <p>
     * 
     * @param <code>oId</code> Holds the new value of the <code>oId</code> property.
     */
    public void setoId(final Long oId) {
        this.oId = oId;
    }

    /**
     * Sets the value of the <code>openIndicator</code> property.
     * <p>
     * 
     * @param <code>openIndicator</code> Holds the new value of the <code>openIndicator</code> property.
     */
    public void setOpenIndicator(final Boolean openIndicator) {
        this.openIndicator = openIndicator;
    }

    /**
     * Sets the value of the <code>origin</code> property.
     * <p>
     * 
     * @param <code>origin</code> Holds the new value of the <code>origin</code> property.
     */
    public void setOrigin(final String origin) {
        this.origin = origin;
    }

    /**
     * Sets the value of the <code>percentageFull</code> property.
     * <p>
     * 
     * @param <code>percentageFull</code> Holds the new value of the <code>percentageFull</code> property.
     */
    public void setPercentageFull(final Integer percentageFull) {
        this.percentageFull = percentageFull;
    }

    /**
     * Sets the value of the <code>printEligibleIndicator</code> property injected by the Inversion of Control
     * (IoC)
     * container.
     * 
     * <p>
     * <b>Release Notes:</b> <br/>
     * <table border="1" cellspacing="0" cellpadding="5" width="80%">
     * <tr>
     * <th align="left">Release</th>
     * <th align="left">Notes</th>
     * </tr>
     * <tr>
     * <td>@since 1.0</td>
     * <td>&nbsp;</td>
     * </tr>
     * </table>
     * <p>
     * 
     * @param pOwnerOperator the new value of the <code>printEligibleIndicator</code> property.
     */
    public void setPrintEligibleIndicator(final boolean pPrintEligibleIndicator) {
        this.printEligibleIndicator = pPrintEligibleIndicator;
    }

    /**
     * Sets the value of the <code>printIndicator</code> property.
     * <p>
     * 
     * @param <code>printIndicator</code> Holds the new value of the <code>printIndicator</code> property.
     */
    public void setPrintIndicator(final boolean printIndicator) {
        this.printIndicator = printIndicator;
    }

    /**
     * @param selectionIndicator the selectionIndicator to set
     */
    public void setSelectionIndicator(final boolean selectionIndicator) {
        this.selectionIndicator = selectionIndicator;
    }

    /**
     * Sets the value of the <code>shipperLoadedULDIndicator</code> property.
     * <p>
     * 
     * @param <code>shipperLoadedULDIndicator</code> Holds the new value of the
     *        <code>shipperLoadedULDIndicator</code> property.
     */
    public void setShipperLoadedULDIndicator(final boolean shipperLoadedULDIndicator) {
        this.shipperLoadedULDIndicator = shipperLoadedULDIndicator;
    }

    /**
     * Sets the value of the <code>status</code> property.
     * <p>
     * 
     * @param <code>pStatus</code> Holds the new value of the <code>status</code> property.
     */
    public void setStatus(final String pStatus) {
        this.status = pStatus;
    }

    public void setTotalPieces(final Long totalPieces) {
        this.totalPieces = totalPieces;
    }

    public void setTotalweight(final BigDecimal totalweight) {
        this.totalweight = totalweight;
    }

}
