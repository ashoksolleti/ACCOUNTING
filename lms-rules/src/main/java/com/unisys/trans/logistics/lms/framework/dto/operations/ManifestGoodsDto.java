package com.unisys.trans.logistics.lms.framework.dto.operations;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.unisys.trans.logistics.lms.framework.constants.ParticipantCodeType;
import com.unisys.trans.logistics.lms.framework.dto.AirWaybillNumberDto;
import com.unisys.trans.logistics.lms.framework.dto.BaseFlightDto;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.dto.ShipmentCapacityDto;
import com.unisys.trans.logistics.lms.framework.dto.constants.GoodsStatusType;
import com.unisys.trans.logistics.lms.framework.dto.constants.operation.FlightIrregularityType;
import com.unisys.trans.logistics.lms.framework.preferences.CustomerDto;

public class ManifestGoodsDto extends PersistenceObjectDto {

    /**
     * Unique serial version UID.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Attribute to hold the <code>actualGoodsCapacity</code> property.
     */
    private ShipmentCapacityDto actualGoodsCapacity;

    /**
     * Attribute to hold the <code>airWaybillNumberDto</code> property.
     */
    private AirWaybillNumberDto airWaybillNumberDto;

    /**
     * Attribute to hold the <code>awbComments</code> property.
     */
    private List<String> awbComments;

    /**
     * Attribute to hold the <code>awbCreationTimeStamp</code> property.
     */
    private Date awbCreationTimeStamp;

    /**
     * Attribute to hold <code>awbOID</code> property.
     */
    private Long awbOID;

    /**
     * Attribute to hold the <code>awbParticipants</code> property.
     */
    private Map<ParticipantCodeType, CustomerDto> awbParticipants;

    /**
     * Attribute to hold the <code>awbPrintComments</code> property.
     */
    private List<String> awbPrintComments;

    /**
     * Attribute to hold the <code>boardingStation</code> property.
     */
    private String boardingStation;

    /**
     * Attribute to hold <code>changeIndicator</code> property.
     */
    private boolean changeIndicator;

    /**
     * Attribute to hold the <code>chineseDescriptionIndicator</code> property.
     */
    private boolean chineseDescriptionIndicator;

    /**
     * Attribute to hold the <code>commentsLineBreakNo</code> property.
     */
    private int commentsLineBreakNo;

    /**
     * Attribute to hold the <code>customSPLPrint</code> property.
     */
    private String customSPLPrint;

    /**
     * Attribute to hold the <code>customStatusCode</code> property.
     */
    private String customStatusCode;

    /**
     * Attribute to hold the <code>customStatusCodeDescription</code> property.
     */
    private String customStatusCodeDescription;

    /**
     * Attribute to hold the <code>description</code> property.
     */
    private String description;

    /**
     * Attribute to hold the <code>destination</code> property.
     */
    private String destination;

    /**
     * Attribute to hold the <code>destinationAirportName</code> property.
     */
    private String destinationAirportName;

    /**
     * Attribute to hold the <code>domesticAWB</code> property.
     */
    private boolean domesticAWB;

    /**
     * Attribute to hold the <code>exportDeclerationNumber</code> property.
     */
    private String exportDeclaration;

    /**
     * Attribute to hold the <code>exportDeclarationNumbers</code> property.
     */
    private List<String> exportDeclarationNumbers;

    /**
     * Attribute to hold the <code>flight</code> property.
     */
    private BaseFlightDto flight;

    /**
     * Attribute to hold the <code>flightDate</code> property.
     */
    private Date flightDate;

    /**
     * Attribute to hold the <code>flightIrregularityType</code> property.
     */
    private FlightIrregularityType flightIrregularityType;

    /**
     * Attribute to hold the <code>flightManifestGroup</code> property.
     */
    private FlightManifestGroupDto flightManifestGroup;

    /**
     * Attribute to hold the <code>goodsCapacity</code> property.
     */
    private ShipmentCapacityDto goodsCapacity;

    /**
     * Attribute to hold the <code>goodsOid</code> property.
     */
    private Long goodsOid;

    /**
     * Attribute to hold the <code>goodsSPLCodes</code> property.
     */
    private List<String> goodsSPLCodes;

    /**
     * Attribute to hold <code>goodsStatus</code> property.
     */
    private GoodsStatusType goodsStatus;

    /**
     * Attribute to hold <code>houseGoods</code> property.
     */
    private List<HouseGoodsDto> houseGoods;

    /**
     * Attribute to hold the <code>localDestination</code> property.
     */
    private String localDestination;

    /**
     * Attribute to hold the <code>localOrigin</code> property.
     */
    private String localOrigin;

    /**
     * Attribute to hold <code>location</code> property.
     */
    private String location;

    /**
     * Attribute to hold the <code>manifestContainerDto</code> property.
     */
    private ManifestContainerDto manifestContainerDto;

    /**
     * Attribute to hold the <code>manifestGroupCode</code> property.
     */
    private ManifestGroupHeaderCodeDto manifestGroupCode;

    /**
     * Attribute to hold the <code>manifestSPLCommentsDtos</code> property.
     */
    private List<ManifestSPLCommentsDto> manifestSPLCommentsDtos;

    /**
     * Attribute to hold the <code>offloadDto</code> property.
     */
    private OffloadDto offloadDto;

    /**
     * Attribute to hold the <code>oId</code> property.
     */
    private Long oId;

    /**
     * Attribute to hold the <code>origin</code> property.
     */
    private String origin;

    /**
     * Attribute to hold the <code>originAirportName</code> property.
     */
    private String originAirportName;

    /**
     * Attribute to hold the <code>ownerOperator</code> property.
     */
    private String ownerOperator;

    /**
     * Attribute to hold the <code>ownerOperatorComment</code> property.
     */
    private String ownerOperatorComment;

    /**
     * Attribute to hold <code>printEligibleIndicator</code> property.
     */
    private boolean printEligibleIndicator;

    /**
     * Attribute to hold the <code>printIndicator</code> property.
     */
    private boolean printIndicator;

    /**
     * Attribute to hold the <code>productCode</code> property.
     */
    private String productCode;

    /**
     * Attribute to hold the <code>selectionIndicator</code> property.
     */
    private boolean selectionIndicator;

    /**
     * Attribute to hold the <code>shipmentPieces</code> property.
     */
    private Long shipmentPieces;

    /**
     * Attribute to hold the <code>shipmentPiecesMaxPrint</code> property.
     */
    private String shipmentPiecesMaxPrint;

    /**
     * Attribute to hold the <code>shipperName</code> property.
     */
    private String shipperName;

    /**
     * Attribute to hold the <code>totalAWBPieces</code> property.
     */
    private Long totalAWBPieces;

    /**
     * <code>Default constructor.</code>
     */
    public ManifestGoodsDto() {
    }

    public ShipmentCapacityDto getActualGoodsCapacity() {
        return this.actualGoodsCapacity;
    }

    /**
     * Gets the value of the <code>airWaybillNumberDto</code> property injected by the Inversion of Control
     * (IoC) container.
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
     * @return the current value of <code>airWaybillNumberDto</code> property.
     */
    public AirWaybillNumberDto getAirWaybillNumberDto() {
        return this.airWaybillNumberDto;
    }

    /**
     * Gets the value of the <code>awbComments</code> property injected by the Inversion of Control (IoC)
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
     * @return the current value of <code>awbComments</code> property.
     */
    public List<String> getAwbComments() {

        if (this.awbComments == null) {
            this.awbComments = new ArrayList<String>();
        }

        if (this.awbComments.size() == 0) {
            this.awbComments.add("");
        }

        return this.awbComments;
    }

    /**
     * Gets the value of the <code>awbCreationTimeStamp</code> property injected by the Inversion of Control
     * (IoC) container.
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
     * @return the current value of <code>awbCreationTimeStamp</code> property.
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
     * Gets the value of the <code>awbParticipants</code> property injected by the Inversion of Control (IoC)
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
     * @return the current value of <code>awbParticipants</code> property.
     */
    public Map<ParticipantCodeType, CustomerDto> getAwbParticipants() {
        return this.awbParticipants;
    }

    /**
     * Gets the value of the <code>awbPrintComments</code> property injected by the Inversion of Control
     * (IoC) container.
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
     * @return the current value of <code>awbPrintComments</code> property.
     */
    public List<String> getAwbPrintComments() {
        if (this.awbPrintComments == null) {
            this.awbPrintComments = new ArrayList<String>();
        }

        return this.awbPrintComments;
    }

    /**
     * Gets the value of the <code>boardingStation</code> property injected by the Inversion of Control (IoC)
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
     * @return the current value of <code>boardingStation</code> property.
     */
    public String getBoardingStation() {
        return this.boardingStation;
    }

    public int getCommentsLineBreakNo() {
        return this.commentsLineBreakNo;
    }

    public String getCustomSPLPrint() {
        return this.customSPLPrint;
    }

    /**
     * Gets the value of the <code>customStatusCode</code> property injected by the Inversion of Control (IoC)
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
     * @return the current value of <code>customStatusCode</code> property.
     */
    public String getCustomStatusCode() {
        return this.customStatusCode;
    }

    /**
     * Gets the value of the <code>customStatusCodeDescription</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>customStatusCodeDescription</code> property.
     */
    public String getCustomStatusCodeDescription() {
        return this.customStatusCodeDescription;
    }

    /**
     * Gets the value of the <code>description</code> property injected by the Inversion of Control (IoC)
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
     * @return the current value of <code>description</code> property.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Gets the value of the <code>destination</code> property injected by the Inversion of Control (IoC)
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
     * @return the current value of <code>destination</code> property.
     */
    public String getDestination() {
        return this.destination;
    }

    /**
     * @return the destinationAirportName
     */
    public String getDestinationAirportName() {
        return this.destinationAirportName;
    }

    public String getExportDeclaration() {
        return this.exportDeclaration;
    }

    /**
     * Gets the value of the <code>exportDeclarationNumbers</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>exportDeclarationNumbers</code> property.
     */
    public List<String> getExportDeclarationNumbers() {
        return this.exportDeclarationNumbers;
    }

    /**
     * Gets the value of the <code>flight</code> property injected by the Inversion of Control (IoC)
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
     * @return the current value of <code>flight</code> property.
     */
    public BaseFlightDto getFlight() {
        return this.flight;
    }

    /**
     * Gets the value of the <code>flightDate</code> property injected by the Inversion of Control (IoC)
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
     * @return the current value of <code>flightDate</code> property.
     */
    public Date getFlightDate() {
        if (this.flightDate != null) {
            return (Date) this.flightDate.clone();
        }
        else {
            return null;
        }
    }

    /**
     * Gets the value of the <code>flightIrregularityType</code> property injected by the Inversion of Control
     * (IoC) container.
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
     * @return the current value of <code>flightIrregularityType</code> property.
     */
    public FlightIrregularityType getFlightIrregularityType() {
        return this.flightIrregularityType;
    }

    /**
     * Gets the value of the <code>flightManifestGroup</code> property injected by the Inversion of Control
     * (IoC) container.
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
     * @return the current value of <code>flightManifestGroup</code> property.
     */
    public FlightManifestGroupDto getFlightManifestGroup() {
        if (this.flightManifestGroup == null) {
            this.flightManifestGroup = new FlightManifestGroupDto();
        }
        return this.flightManifestGroup;
    }

    /**
     * Gets the value of the <code>goodsCapacity</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>goodsCapacity</code> property.
     */
    public ShipmentCapacityDto getGoodsCapacity() {
        return this.goodsCapacity;
    }

    /**
     * Gets the value of the <code>goodsOid</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>goodsOid</code> property.
     */
    public Long getGoodsOid() {
        return this.goodsOid;
    }

    /**
     * Gets the value of the <code>goodsSPLCodes</code> property injected by the Inversion of Control (IoC)
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
     * @return the current value of <code>goodsSPLCodes</code> property.
     */
    public List<String> getGoodsSPLCodes() {
        return this.goodsSPLCodes;
    }

    /**
     * Gets the value of the <code>goodsStatus</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>goodsStatus</code> property.
     */
    public GoodsStatusType getGoodsStatus() {
        return this.goodsStatus;
    }

    /**
     * @return the houseGoods
     */
    public List<HouseGoodsDto> getHouseGoods() {
        return this.houseGoods;
    }

    /**
     * Gets the value of the <code>localDestination</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>localDestination</code> property.
     */
    public String getLocalDestination() {
        return this.localDestination;
    }

    /**
     * Gets the value of the <code>localOrigin</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>localOrigin</code> property.
     */
    public String getLocalOrigin() {
        return this.localOrigin;
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
     * Gets the value of the <code>manifestContainerDto</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>manifestContainerDto</code> property.
     */
    public ManifestContainerDto getManifestContainerDto() {
        return this.manifestContainerDto;
    }

    /**
     * Gets the value of the <code>manifestGroupCode</code> property injected by the Inversion of Control
     * (IoC) container.
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
     * @return the current value of <code>manifestGroupCode</code> property.
     */
    public ManifestGroupHeaderCodeDto getManifestGroupCode() {
        if (this.manifestGroupCode == null) {
            this.manifestGroupCode = new ManifestGroupHeaderCodeDto();
        }
        return this.manifestGroupCode;
    }

    public List<ManifestSPLCommentsDto> getManifestSPLCommentsDtos() {
        return this.manifestSPLCommentsDtos;
    }

    /**
     * Gets the value of the <code>offloadDto</code> property injected by the Inversion of Control (IoC)
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
     * @return the current value of <code>offloadDto</code> property.
     */
    public OffloadDto getOffloadDto() {
        return this.offloadDto;
    }

    /**
     * Gets the value of the <code>oId</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>oId</code> property.
     */
    @Override
    public Long getOId() {
        return this.oId;
    }

    /**
     * Gets the value of the <code>origin</code> property injected by the Inversion of Control (IoC)
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
     * @return the current value of <code>origin</code> property.
     */
    public String getOrigin() {
        return this.origin;
    }

    /**
     * @return the originAirportName
     */
    public String getOriginAirportName() {
        return this.originAirportName;
    }

    /**
     * Gets the value of the <code>ownerOperator</code> property injected by the Inversion of Control (IoC)
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
     * @return the current value of <code>ownerOperator</code> property.
     */
    public String getOwnerOperator() {
        return this.ownerOperator;
    }

    public String getOwnerOperatorComment() {
        return this.ownerOperatorComment;
    }

    /**
     * Gets the value of the <code>productCode</code> property injected by the Inversion of Control (IoC)
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
     * @return the current value of <code>productCode</code> property.
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * Gets the value of the <code>shipmentPieces</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>shipmentPieces</code> property.
     */
    public Long getShipmentPieces() {
        if (this.shipmentPieces == null) {
            this.shipmentPieces = (long) 0;
        }
        return this.shipmentPieces;
    }

    public String getShipmentPiecesMaxPrint() {
        return this.shipmentPiecesMaxPrint;
    }

    /**
     * Gets the value of the <code>shipperName</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>shipperName</code> property.
     */
    public String getShipperName() {
        return this.shipperName;
    }

    /**
     * Gets the value of the <code>totalAWBPieces</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>totalAWBPieces</code> property.
     */
    public Long getTotalAWBPieces() {
        if (this.totalAWBPieces == null) {
            this.totalAWBPieces = (long) 0;
        }
        return this.totalAWBPieces;
    }

    /**
     * Gets the value of the <code>changeIndicator</code> property injected by the Inversion of Control (IoC)
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
     * @return the current value of <code>changeIndicator</code> property.
     */
    public boolean isChangeIndicator() {
        return this.changeIndicator;
    }

    /**
     * Gets the value of the <code>chineseDescriptionIndicator</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>chineseDescriptionIndicator</code> property.
     */
    public boolean isChineseDescriptionIndicator() {
        return this.chineseDescriptionIndicator;
    }

    /**
     * Gets the value of the <code>domesticAWB</code> property.
     * <p>
     * 
     * @return Returns the current value of <code>domesticAWB</code> property.
     */
    public boolean isDomesticAWB() {
        return this.domesticAWB;
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
     * Gets the value of the <code>printIndicator</code> property injected by the Inversion of Control (IoC)
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
     * @return the current value of <code>printIndicator</code> property.
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

    public void setActualGoodsCapacity(final ShipmentCapacityDto actualGoodsCapacity) {
        this.actualGoodsCapacity = actualGoodsCapacity;
    }

    /**
     * Sets the value of the <code>airWaybillNumberDto</code> property injected by the Inversion of Control
     * (IoC) container.
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
     * @param pAirWaybillNumberDto the new value of the <code>airWaybillNumberDto</code> property.
     */
    public void setAirWaybillNumberDto(final AirWaybillNumberDto pAirWaybillNumberDto) {
        this.airWaybillNumberDto = pAirWaybillNumberDto;
    }

    /**
     * Sets the value of the <code>awbComments</code> property injected by the Inversion of Control (IoC)
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
     * @param pAwbComments the new value of the <code>awbComments</code> property.
     */
    public void setAwbComments(final List<String> pAwbComments) {
        this.awbComments = pAwbComments;
    }

    /**
     * Sets the value of the <code>awbCreationTimeStamp</code> property injected by the Inversion of Control
     * (IoC) container.
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
     * @param pAwbCreationTimeStamp the new value of the <code>awbCreationTimeStamp</code> property.
     */
    public void setAwbCreationTimeStamp(final Date pAwbCreationTimeStamp) {
        if (pAwbCreationTimeStamp != null) {
            this.awbCreationTimeStamp = (Date) pAwbCreationTimeStamp.clone();
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
     * Sets the value of the <code>awbParticipants</code> property injected by the Inversion of Control (IoC)
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
     * @param pAwbParticipants the new value of the <code>awbParticipants</code> property.
     */
    public void setAwbParticipants(final Map<ParticipantCodeType, CustomerDto> pAwbParticipants) {
        this.awbParticipants = pAwbParticipants;
    }

    /**
     * Sets the value of the <code>awbPrintComments</code> property injected by the Inversion of Control (IoC)
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
     * @param pAwbParticipants the new value of the <code>awbPrintComments</code> property.
     */
    public void setAwbPrintComments(final List<String> awbPrintComments) {
        this.awbPrintComments = awbPrintComments;
    }

    /**
     * Sets the value of the <code>boardingStation</code> property injected by the Inversion of Control (IoC)
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
     * @param pBoardingStation the new value of the <code>boardingStation</code> property.
     */
    public void setBoardingStation(final String pBoardingStation) {
        this.boardingStation = pBoardingStation;
    }

    /**
     * Sets the value of the <code>changeIndicator</code> property injected by the Inversion of Control (IoC)
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
     * @param changeIndicator the new value of the <code>changeIndicator</code> property.
     */
    public void setChangeIndicator(final boolean changeIndicator) {
        this.changeIndicator = changeIndicator;
    }

    /**
     * Sets the value of the <code>chineseDescriptionIndicator</code> property.
     * <p>
     * 
     * @param <code>pChineseDescriptionIndicator</code> Holds the new value of the
     *        <code>chineseDescriptionIndicator</code> property.
     */
    public void setChineseDescriptionIndicator(final boolean pChineseDescriptionIndicator) {
        this.chineseDescriptionIndicator = pChineseDescriptionIndicator;
    }

    public void setCommentsLineBreakNo(final int commentsLineBreakNo) {
        this.commentsLineBreakNo = commentsLineBreakNo;
    }

    public void setCustomSPLPrint(final String customSPLPrint) {
        this.customSPLPrint = customSPLPrint;
    }

    /**
     * Sets the value of the <code>customStatusCode</code> property injected by the Inversion of Control (IoC)
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
     * @param pCustomStatusCode the new value of the <code>customStatusCode</code> property.
     */
    public void setCustomStatusCode(final String pCustomStatusCode) {
        this.customStatusCode = pCustomStatusCode;
    }

    /**
     * Sets the value of the <code>customStatusCodeDescription</code> property.
     * <p>
     * 
     * @param <code>customStatusCodeDescription</code> Holds the new value of the
     *        <code>customStatusCodeDescription</code> property.
     */
    public void setCustomStatusCodeDescription(final String customStatusCodeDescription) {
        this.customStatusCodeDescription = customStatusCodeDescription;
    }

    /**
     * Sets the value of the <code>description</code> property injected by the Inversion of Control (IoC)
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
     * @param pDescription the new value of the <code>description</code> property.
     */
    public void setDescription(final String pDescription) {
        this.description = pDescription;
    }

    /**
     * Sets the value of the <code>destination</code> property injected by the Inversion of Control (IoC)
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
     * @param pDestination the new value of the <code>destination</code> property.
     */
    public void setDestination(final String pDestination) {
        this.destination = pDestination;
    }

    /**
     * @param destinationAirportName the destinationAirportName to set
     */
    public void setDestinationAirportName(final String destinationAirportName) {
        this.destinationAirportName = destinationAirportName;
    }

    /**
     * Sets the value of the <code>domesticAWB</code> property.
     * <p>
     * 
     * @param <code>pDomesticAWB</code> Holds the new value of the <code>domesticAWB</code> property.
     */
    public void setDomesticAWB(final boolean pDomesticAWB) {
        this.domesticAWB = pDomesticAWB;
    }

    public void setExportDeclaration(final String exportDeclaration) {
        this.exportDeclaration = exportDeclaration;
    }

    /**
     * Sets the value of the <code>exportDeclarationNumbers</code> property.
     * <p>
     * 
     * @param <code>pExportDeclarationNumbers</code> Holds the new value of the
     *        <code>exportDeclarationNumbers</code> property.
     */
    public void setExportDeclarationNumbers(final List<String> pExportDeclarationNumbers) {
        this.exportDeclarationNumbers = pExportDeclarationNumbers;
    }

    /**
     * Sets the value of the <code>flight</code> property injected by the Inversion of Control (IoC)
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
     * @param pFlight the new value of the <code>flight</code> property.
     */
    public void setFlight(final BaseFlightDto pFlight) {
        this.flight = pFlight;
    }

    /**
     * Sets the value of the <code>flightDate</code> property injected by the Inversion of Control (IoC)
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
     * @param pFlightDate the new value of the <code>flightDate</code> property.
     */
    public void setFlightDate(final Date pFlightDate) {
        if (pFlightDate != null) {
            this.flightDate = (Date) pFlightDate.clone();
        }
        else
        {
            this.flightDate = null;
        }
    }

    /**
     * Sets the value of the <code>flightIrregularityType</code> property injected by the Inversion of Control
     * (IoC) container.
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
     * @param pFlightIrregularityType the new value of the <code>flightIrregularityType</code> property.
     */
    public void setFlightIrregularityType(final FlightIrregularityType pFlightIrregularityType) {
        this.flightIrregularityType = pFlightIrregularityType;
    }

    /**
     * Sets the value of the <code>flightManifestGroup</code> property injected by the Inversion of Control
     * (IoC) container.
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
     * @param pFlightManifestGroup the new value of the <code>flightManifestGroup</code> property.
     */
    public void setFlightManifestGroup(final FlightManifestGroupDto pFlightManifestGroup) {
        this.flightManifestGroup = pFlightManifestGroup;
    }

    /**
     * Sets the value of the <code>goodsCapacity</code> property.
     * <p>
     * 
     * @param <code>goodsCapacity</code> Holds the new value of the <code>goodsCapacity</code> property.
     */
    public void setGoodsCapacity(final ShipmentCapacityDto goodsCapacity) {
        this.goodsCapacity = goodsCapacity;
    }

    /**
     * Sets the value of the <code>goodsOid</code> property.
     * <p>
     * 
     * @param <code>goodsOid</code> Holds the new value of the <code>goodsOid</code> property.
     */
    public void setGoodsOid(final Long goodsOid) {
        this.goodsOid = goodsOid;
    }

    /**
     * Sets the value of the <code>goodsSPLCodes</code> property injected by the Inversion of Control (IoC)
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
     * @param pGoodsSPLCodes the new value of the <code>goodsSPLCodes</code> property.
     */
    public void setGoodsSPLCodes(final List<String> pGoodsSPLCodes) {
        this.goodsSPLCodes = pGoodsSPLCodes;
    }

    /**
     * Sets the value of the <code>goodsStatus</code> property.
     * <p>
     * 
     * @param <code>pGoodsStatus</code> Holds the new value of the <code>goodsStatus</code> property.
     */
    public void setGoodsStatus(final GoodsStatusType pGoodsStatus) {
        this.goodsStatus = pGoodsStatus;
    }

    /**
     * @param houseGoods the houseGoods to set
     */
    public void setHouseGoods(final List<HouseGoodsDto> houseGoods) {
        this.houseGoods = houseGoods;
    }

    /**
     * Sets the value of the <code>localDestination</code> property.
     * <p>
     * 
     * @param <code>localDestination</code> Holds the new value of the <code>localDestination</code> property.
     */
    public void setLocalDestination(final String pLocalDestination) {
        this.localDestination = pLocalDestination;
    }

    /**
     * Sets the value of the <code>localOrigin</code> property.
     * <p>
     * 
     * @param <code>localOrigin</code> Holds the new value of the <code>localOrigin</code> property.
     */
    public void setLocalOrigin(final String pLocalOrigin) {
        this.localOrigin = pLocalOrigin;
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
     * Sets the value of the <code>manifestContainerDto</code> property.
     * <p>
     * 
     * @param <code>manifestContainerDto</code> Holds the new value of the <code>manifestContainerDto</code>
     *        property.
     */
    public void setManifestContainerDto(final ManifestContainerDto manifestContainerDto) {
        this.manifestContainerDto = manifestContainerDto;
    }

    /**
     * Sets the value of the <code>manifestGroupCode</code> property injected by the Inversion of Control
     * (IoC) container.
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
     * @param pManifestGroupCode the new value of the <code>manifestGroupCode</code> property.
     */
    public void setManifestGroupCode(final ManifestGroupHeaderCodeDto pManifestGroupCode) {
        this.manifestGroupCode = pManifestGroupCode;
    }

    public void setManifestSPLCommentsDtos(final List<ManifestSPLCommentsDto> manifestSPLCommentsDtos) {
        this.manifestSPLCommentsDtos = manifestSPLCommentsDtos;
    }

    /**
     * Sets the value of the <code>offloadDto</code> property injected by the Inversion of Control (IoC)
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
     * @param pOffloadDto the new value of the <code>offloadDto</code> property.
     */
    public void setOffloadDto(final OffloadDto pOffloadDto) {
        this.offloadDto = pOffloadDto;
    }

    /**
     * Sets the value of the <code>oId</code> property.
     * <p>
     * 
     * @param <code>oId</code> Holds the new value of the <code>oId</code> property.
     */
    public void setOId(final Long oId) {
        this.oId = oId;
    }

    /**
     * Sets the value of the <code>origin</code> property injected by the Inversion of Control (IoC)
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
     * @param pOrigin the new value of the <code>origin</code> property.
     */
    public void setOrigin(final String pOrigin) {
        this.origin = pOrigin;
    }

    /**
     * @param originAirportName the originAirportName to set
     */
    public void setOriginAirportName(final String originAirportName) {
        this.originAirportName = originAirportName;
    }

    /**
     * Sets the value of the <code>ownerOperator</code> property injected by the Inversion of Control (IoC)
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
     * @param pOwnerOperator the new value of the <code>ownerOperator</code> property.
     */
    public void setOwnerOperator(final String pOwnerOperator) {
        this.ownerOperator = pOwnerOperator;
    }

    public void setOwnerOperatorComment(final String ownerOperatorComment) {
        this.ownerOperatorComment = ownerOperatorComment;
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
     * Sets the value of the <code>printIndicator</code> property injected by the Inversion of Control (IoC)
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
     * @param pPrintIndicator the new value of the <code>printIndicator</code> property.
     */
    public void setPrintIndicator(final boolean pPrintIndicator) {
        this.printIndicator = pPrintIndicator;
    }

    /**
     * Sets the value of the <code>productCode</code> property injected by the Inversion of Control (IoC)
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
     * @param pProductCode the new value of the <code>productCode</code> property.
     */
    public void setProductCode(final String pProductCode) {
        this.productCode = pProductCode;
    }

    /**
     * @param selectionIndicator the selectionIndicator to set
     */
    public void setSelectionIndicator(final boolean selectionIndicator) {
        this.selectionIndicator = selectionIndicator;
    }

    /**
     * Sets the value of the <code>shipmentPieces</code> property.
     * <p>
     * 
     * @param <code>shipmentPieces</code> Holds the new value of the <code>shipmentPieces</code> property.
     */
    public void setShipmentPieces(final Long shipmentPieces) {
        this.shipmentPieces = shipmentPieces;
    }

    /**
     * Sets the value of the <code>shipmentPiecesMaxPrint</code> property.
     * <p>
     * 
     * @param <code>pShipmentPiecesMaxPrint</code> Holds the new value of the
     *        <code>shipmentPiecesMaxPrint</code> property.
     */
    public void setShipmentPiecesMaxPrint(final String pShipmentPiecesMaxPrint) {
        this.shipmentPiecesMaxPrint = pShipmentPiecesMaxPrint;
    }

    /**
     * Sets the value of the <code>shipperName</code> property.
     * <p>
     * 
     * @param <code>shipperName</code> Holds the new value of the <code>shipperName</code> property.
     */
    public void setShipperName(final String pShipperName) {
        this.shipperName = pShipperName;
    }

    /**
     * Sets the value of the <code>totalAWBPieces</code> property.
     * <p>
     * 
     * @param <code>pTotalAWBPieces</code> Holds the new value of the <code>totalAWBPieces</code> property.
     */
    public void setTotalAWBPieces(final Long pTotalAWBPieces) {
        this.totalAWBPieces = pTotalAWBPieces;
    }

}