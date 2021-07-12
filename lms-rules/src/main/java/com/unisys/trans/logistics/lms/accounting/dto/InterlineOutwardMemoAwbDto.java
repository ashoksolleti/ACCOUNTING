package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import com.unisys.trans.logistics.lms.accounting.dto.constants.AWBPaymentType;
import com.unisys.trans.logistics.lms.accounting.dto.constants.BillingCode;
import com.unisys.trans.logistics.lms.accounting.dto.constants.InwardInvoiceStatus;
import com.unisys.trans.logistics.lms.accounting.dto.constants.PartShipmentIndicator;
import com.unisys.trans.logistics.lms.accounting.dto.constants.PolarChoice;
import com.unisys.trans.logistics.lms.accounting.dto.constants.ProrationType;
import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class InterlineOutwardMemoAwbDto extends PersistenceObjectDto {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private Long OId;
    private String awbNumber;
    private Date awbExecutionDate;
    private BillingCode awbBillingCode;
    private String awbOrigin;
    private String awbDestination;
    private String awbAirportFrom;
    private String awbAirportTo;
    private Date awbCarriageDate;
    private Long awbBilledWeight;
    private ProrationType awbProrationMethod;
    private Long awbProratePercentage;
    private PartShipmentIndicator awbShipmentIndicator;
    private WeightUOMType awbUnitOfWeight;
    private PolarChoice awbCCAIndicator;
    private String awbAirlineUse;
    private String referenceOne;
    private String referenceTwo;
    private String referenceThree;
    private String referenceFour;
    private String referenceFive;
    private BigDecimal vatCalculatedAmount;
    private List<InterlineOutwardMemoAwbProrateDto> prorateDtos = new ArrayList<InterlineOutwardMemoAwbProrateDto>();
    private List<InterlineOutwardMemoAwbVATDto> vATDtos = new ArrayList<InterlineOutwardMemoAwbVATDto>();
    private List<InterlineOutwardMemoAwbOCDto> oCDtos = new ArrayList<InterlineOutwardMemoAwbOCDto>();
    private static final String EMPTY_STRING = "";
    private static final BigDecimal DEFAULT = BigDecimal.ZERO;
    private static final String NEW_LINE = "<br>";
    public static final int otherChargesPerRow = 1;
    
    private InwardInvoiceStatus awbInvoiceStatus;
    
    private AWBPaymentType paymentType;
    
	private String sectorDestination;

	private String sectorOrigin;
    
     
    public AWBPaymentType getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(AWBPaymentType paymentType) {
		this.paymentType = paymentType;
	}

	public InwardInvoiceStatus getAwbInvoiceStatus() {
		return awbInvoiceStatus;
	}

	public void setAwbInvoiceStatus(InwardInvoiceStatus awbInvoiceStatus) {
		this.awbInvoiceStatus = awbInvoiceStatus;
	}

	public Long getOId() {
        return OId;
    }

    /**
     * @return the vatCalculatedAmount
     */
    public BigDecimal getVatCalculatedAmount() {
        return vatCalculatedAmount;
    }

    /**
     * @param vatCalculatedAmount
     *            the vatCalculatedAmount to set
     */
    public void setVatCalculatedAmount(BigDecimal vatCalculatedAmount) {
        this.vatCalculatedAmount = vatCalculatedAmount;
    }

    public void setOId(Long oId) {
        OId = oId;
    }

    public String getAwbNumber() {
        return awbNumber;
    }

    public void setAwbNumber(String awbNumber) {
        this.awbNumber = awbNumber;
    }

    public Date getAwbExecutionDate() {
        return awbExecutionDate;
    }

    public void setAwbExecutionDate(Date awbExecutionDate) {
        this.awbExecutionDate = awbExecutionDate;
    }

    public BillingCode getAwbBillingCode() {
        return awbBillingCode;
    }

    public void setAwbBillingCode(BillingCode awbBillingCode) {
        this.awbBillingCode = awbBillingCode;
    }

    public String getAwbOrigin() {
        return awbOrigin;
    }

    public void setAwbOrigin(String awbOrigin) {
        this.awbOrigin = (awbOrigin != null) ? awbOrigin.toUpperCase() : awbOrigin;
    }

    public String getAwbDestination() {
        return awbDestination;
    }

    public void setAwbDestination(String awbDestination) {
        this.awbDestination = (awbDestination != null) ? awbDestination.toUpperCase() : awbDestination;
    }

    public String getAwbAirportFrom() {
        return awbAirportFrom;
    }

    public void setAwbAirportFrom(String awbAirportFrom) {
        this.awbAirportFrom = (awbAirportFrom != null) ? awbAirportFrom.toUpperCase() : awbAirportFrom;
    }

    public String getAwbAirportTo() {
        return awbAirportTo;
    }

    public void setAwbAirportTo(String awbAirportTo) {
        this.awbAirportTo = (awbAirportTo != null) ? awbAirportTo.toUpperCase() : awbAirportTo;
    }

    public Date getAwbCarriageDate() {
        return awbCarriageDate;
    }

    public void setAwbCarriageDate(Date awbCarriageDate) {
        this.awbCarriageDate = awbCarriageDate;
    }

    public Long getAwbBilledWeight() {
        return awbBilledWeight;
    }

    public void setAwbBilledWeight(Long awbBilledWeight) {
        this.awbBilledWeight = awbBilledWeight;
    }

    public ProrationType getAwbProrationMethod() {
        return awbProrationMethod;
    }

    public void setAwbProrationMethod(ProrationType awbProrationMethod) {
        this.awbProrationMethod = awbProrationMethod;
    }

    public Long getAwbProratePercentage() {
        return awbProratePercentage;
    }

    public void setAwbProratePercentage(Long awbProratePercentage) {
        this.awbProratePercentage = awbProratePercentage;
    }

    public PartShipmentIndicator getAwbShipmentIndicator() {
        return awbShipmentIndicator;
    }

    public void setAwbShipmentIndicator(PartShipmentIndicator awbShipmentIndicator) {
        this.awbShipmentIndicator = awbShipmentIndicator;
    }

    public WeightUOMType getAwbUnitOfWeight() {
        return awbUnitOfWeight;
    }

    public void setAwbUnitOfWeight(WeightUOMType awbUnitOfWeight) {
        this.awbUnitOfWeight = awbUnitOfWeight;
    }

    public PolarChoice getAwbCCAIndicator() {
        return awbCCAIndicator;
    }

    public void setAwbCCAIndicator(PolarChoice awbCCAIndicator) {
        this.awbCCAIndicator = awbCCAIndicator;
    }

    public String getAwbAirlineUse() {
        return awbAirlineUse;
    }

    public void setAwbAirlineUse(String awbAirlineUse) {
        this.awbAirlineUse = awbAirlineUse;
    }

    public String getReferenceOne() {
        return referenceOne;
    }

    public void setReferenceOne(String referenceOne) {
        this.referenceOne = referenceOne;
    }

    public String getReferenceTwo() {
        return referenceTwo;
    }

    public void setReferenceTwo(String referenceTwo) {
        this.referenceTwo = referenceTwo;
    }

    public String getReferenceThree() {
        return referenceThree;
    }

    public void setReferenceThree(String referenceThree) {
        this.referenceThree = referenceThree;
    }

    public String getReferenceFour() {
        return referenceFour;
    }

    public void setReferenceFour(String referenceFour) {
        this.referenceFour = referenceFour;
    }

    public String getReferenceFive() {
        return referenceFive;
    }

    public void setReferenceFive(String referenceFive) {
        this.referenceFive = referenceFive;
    }

    public List<InterlineOutwardMemoAwbProrateDto> getProrateDtos() {
        if (this.prorateDtos == null) {
            this.prorateDtos = new ArrayList<InterlineOutwardMemoAwbProrateDto>();
        }
        if (this.prorateDtos.isEmpty()) {
            this.prorateDtos.add(new InterlineOutwardMemoAwbProrateDto());
        }
        return this.prorateDtos;
    }

    public void setProrateDtos(List<InterlineOutwardMemoAwbProrateDto> prorateDtos) {
        this.prorateDtos = prorateDtos;
    }

    public List<InterlineOutwardMemoAwbVATDto> getVATDtos() {
        if (this.vATDtos == null) {
            this.vATDtos = new ArrayList<InterlineOutwardMemoAwbVATDto>();
        }
        if (this.vATDtos.isEmpty()) {
            this.vATDtos.add(new InterlineOutwardMemoAwbVATDto());
        }
        return vATDtos;
    }

    public void setVATDtos(List<InterlineOutwardMemoAwbVATDto> vATDtos) {
        this.vATDtos = vATDtos;
    }

    public List<InterlineOutwardMemoAwbOCDto> getOCDtos() {
        if (this.oCDtos == null) {
            this.oCDtos = new ArrayList<InterlineOutwardMemoAwbOCDto>();
        }
        // case1: if the list is empty.
        if (this.oCDtos.isEmpty()) {
            addOCRow();
            return this.oCDtos;
        }
        
        // If the list is not empty.
        int currentSize = this.oCDtos.size();
        
        // case2: if there are required number of Dtos.
        if (currentSize % otherChargesPerRow == 0)
            return this.oCDtos;
        
        // case3: Need to add the empty Dtos
        int maxSize = currentSize + (otherChargesPerRow - 1); // here atleast one other charge entry will be present.
        for (int x = currentSize + 1; x <= maxSize; x++) {
            this.oCDtos.add(new InterlineOutwardMemoAwbOCDto());
            if (x % otherChargesPerRow == 0)
                break;
        }
        return oCDtos;
    }

    public void setOCDtos(List<InterlineOutwardMemoAwbOCDto> oCDtos) {
        this.oCDtos = oCDtos;
    }
    
    public void addOCRow() {
        if (this.oCDtos != null)
            for (int i = 0; i < otherChargesPerRow; i++) {
                this.oCDtos.add(new InterlineOutwardMemoAwbOCDto());
            }
    }

    public String getProrationCurrencyAsString() {
        return getinterlineAwbProrateDtoDetails(1);
    }

    public String getTotalAmountAsString() {
        return getinterlineAwbProrateDtoDetails(2);
    }

    public String getSectorCarrierAsString() {
        return getinterlineAwbProrateDtoDetails(3);
    }

    public String getSectorOriginString() {
        return getinterlineAwbProrateDtoDetails(4);
    }

    public String getSectorDestinationAsString() {
        return getinterlineAwbProrateDtoDetails(5);
    }

    public String getProrateMethodAsString() {
        return getinterlineAwbProrateDtoDetails(6);
    }

    public String getProrateFactorAsString() {
        return getinterlineAwbProrateDtoDetails(7);
    }

    public String getProrateShareAsString() {
        return getinterlineAwbProrateDtoDetails(8);
    }

    public String getProrateAmountAsString() {
        return getinterlineAwbProrateDtoDetails(9);
    }

    private String getinterlineAwbProrateDtoDetails(int val) {
        StringBuilder valStr = new StringBuilder();
        if (CollectionUtils.isNotEmpty(prorateDtos)) {
            int listSize = prorateDtos.size();
            int i = 0;
            for (InterlineOutwardMemoAwbProrateDto prorateDto : prorateDtos) {
                switch (val) {
                case 1:
                    valStr.append((prorateDto.getProrationCurrency() == null) ? EMPTY_STRING : prorateDto.getProrationCurrency());
                    break;
                case 2:
                    valStr.append((prorateDto.getTotalAmount() == null) ? DEFAULT : prorateDto.getTotalAmount());
                    break;
                case 3:
                    valStr.append((prorateDto.getSectorCarrier() == null) ? EMPTY_STRING : prorateDto.getSectorCarrier());
                    break;
                case 4:
                    valStr.append((prorateDto.getSectorOrigin() == null) ? EMPTY_STRING : prorateDto.getSectorOrigin());
                    break;
                case 5:
                    valStr.append((prorateDto.getSectorDestination() == null) ? EMPTY_STRING : prorateDto.getSectorDestination());
                    break;
                case 6:
                    valStr.append((prorateDto.getProrateMethod() == null) ? EMPTY_STRING : prorateDto.getProrateMethod().getStringValue());
                    break;
                case 7:
                    valStr.append((prorateDto.getProrateFactor() == null) ? DEFAULT : prorateDto.getProrateFactor());
                    break;
                case 8:
                    valStr.append((prorateDto.getProrateShare() == null) ? 0.0 : prorateDto.getProrateShare());
                    break;
                case 9:
                    valStr.append((prorateDto.getProrateAmount() == null) ? DEFAULT : prorateDto.getProrateAmount());
                    break;
                }
                if ((listSize > 1 || i++ != listSize - 1)) {
                    valStr.append(NEW_LINE);
                }
            }
        }
        else {
            valStr.append(EMPTY_STRING);
        }
        return valStr.toString();
    }

    public String getVatLabelAsString() {
        return getinterlineVATDtoDetails(1);
    }

    public String getVatIdentifierAsString() {
        return getinterlineVATDtoDetails(2);
    }

    public String getVatCodeAsString() {
        return getinterlineVATDtoDetails(3);
    }

    public String getVatTextAsString() {
        return getinterlineVATDtoDetails(4);
    }

    public String getVatTaxableAmountAsString() {
        return getinterlineVATDtoDetails(5);
    }

    public String getVatPercentageAsString() {
        return getinterlineVATDtoDetails(6);
    }

    public String getVatCalculatedAmountAsString() {
        return getinterlineVATDtoDetails(7);
    }

    private String getinterlineVATDtoDetails(int val) {
        StringBuilder valStr = new StringBuilder();
        if (CollectionUtils.isNotEmpty(vATDtos)) {
            int listSize = vATDtos.size();
            int i = 0;
            for (InterlineOutwardMemoAwbVATDto vatDto : vATDtos) {
                switch (val) {
                case 1:
                    valStr.append((vatDto.getVatLabel() == null) ? EMPTY_STRING : vatDto.getVatLabel());
                    break;
                case 2:
                    valStr.append((vatDto.getVatIdentifier() == null) ? EMPTY_STRING : vatDto.getVatIdentifier().getLabel());
                    break;
                case 3:
                    valStr.append((vatDto.getVatCode() == null) ? EMPTY_STRING : vatDto.getVatCode());
                    break;
                case 4:
                    valStr.append((vatDto.getVatText() == null) ? EMPTY_STRING : vatDto.getVatText());
                    break;
                case 5:
                    valStr.append((vatDto.getVatTaxableAmount() == null) ? DEFAULT : vatDto.getVatTaxableAmount());
                    break;
                case 6:
                    valStr.append((vatDto.getVatPercentage() == null) ? DEFAULT : vatDto.getVatPercentage());
                    break;
                case 7:
                    valStr.append((vatDto.getVatCalculatedAmount() == null) ? DEFAULT : vatDto.getVatCalculatedAmount());
                    break;
                }
                if ((listSize > 1 && i++ != listSize - 1)) {
                    valStr.append(NEW_LINE);
                }
            }
        }
        else {
            valStr.append(EMPTY_STRING);
        }
        return valStr.toString();
    }

    private String getinterlineMemoAwbOCDtoDetails(int val) {
        StringBuilder valStr = new StringBuilder();
        if (CollectionUtils.isNotEmpty(oCDtos)) {
            int listSize = oCDtos.size();
            int i = 0;
            for (InterlineOutwardMemoAwbOCDto ocdto : oCDtos) {
                switch (val) {
                case 1:
                    valStr.append((ocdto.getCode() == null) ? EMPTY_STRING : ocdto.getCode());
                    break;
                case 2:
                    valStr.append((ocdto.getAmount() == null) ? EMPTY_STRING : ocdto.getAmount());
                    break;
                }
                if ((listSize > 1 && i++ != listSize - 1)) {
                    valStr.append(NEW_LINE);
                }
            }
        }
        else {
            valStr.append(EMPTY_STRING);
        }
        return valStr.toString();
    }

    public String getCodeAsString() {
        return getinterlineMemoAwbOCDtoDetails(1);
    }

    public String getAmountAsString() {
        return getinterlineMemoAwbOCDtoDetails(2);
    }

	public String getSectorDestination() {
		return getSectorDestinationAsString();
	}

	public void setSectorDestination(String sectorDestination) {
		this.sectorDestination = sectorDestination;
	}

	public String getSectorOrigin() {
		return getSectorOriginString();
	}

	public void setSectorOrigin(String sectorOrigin) {
		this.sectorOrigin = sectorOrigin;
	}
    
    
    
}
