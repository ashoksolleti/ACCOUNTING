package com.unisys.trans.logistics.lms.framework.dto.operations;

import java.math.BigDecimal;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.WeightUOMType;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class ManifestSPLCommentsDto extends PersistenceObjectDto {

    /**
     * 
     */
    private static final long serialVersionUID = 570389151365587619L;

    private List<String> goodsSPLCodes;

    private Integer pieceCount;

    private BigDecimal pieceWeight;

    /**
     * Attribute to hold <code>weightUOM</code> property.
     */
    private WeightUOMType weightUOM;

    public ManifestSPLCommentsDto() {

    }

    public List<String> getGoodsSPLCodes() {
        return this.goodsSPLCodes;
    }

    @Override
    public Long getOId() {
        // TODO Auto-generated method stub
        return null;
    }

    public Integer getPieceCount() {
        return this.pieceCount;
    }

    public BigDecimal getPieceWeight() {
        return this.pieceWeight;
    }

    public WeightUOMType getWeightUOM() {
        return this.weightUOM;
    }

    public void setGoodsSPLCodes(final List<String> goodsSPLCodes) {
        this.goodsSPLCodes = goodsSPLCodes;
    }

    public void setPieceCount(final Integer pieceCount) {
        this.pieceCount = pieceCount;
    }

    public void setPieceWeight(final BigDecimal pieceWeight) {
        this.pieceWeight = pieceWeight;
    }

    public void setWeightUOM(final WeightUOMType weightUOM) {
        this.weightUOM = weightUOM;
    }

}
