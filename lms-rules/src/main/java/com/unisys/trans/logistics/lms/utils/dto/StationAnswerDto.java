package com.unisys.trans.logistics.lms.utils.dto;

public class StationAnswerDto {

    public StationAnswerDto(String comments, boolean exportInd,
                boolean importInd, StationInfoSectionLabelDto answerInfo) {
        super();
        this.comments = comments;
        this.exportInd = exportInd;
        this.importInd = importInd;
        this.answerInfo = answerInfo;
    }

    private String comments;

    private boolean exportInd;

    private boolean importInd;

    // Document name
    private StationInfoSectionLabelDto answerInfo;

    // Document order

    private Long oId;

    public String getComments() {
        return comments;
    }

    public Long getOId() {
        return this.oId;
    }

    public boolean getExportInd() {
        return exportInd;
    }

    public boolean getImportInd() {
        return importInd;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setExportInd(boolean exportInd) {
        this.exportInd = exportInd;
    }

    public void setImportInd(boolean importInd) {
        this.importInd = importInd;
    }

    public void setOId(final Long pOId) {
        this.oId = pOId;
    }

    public StationInfoSectionLabelDto getAnswerInfo() {
        return answerInfo;
    }

    public void setAnswerInfo(StationInfoSectionLabelDto answerInfo) {
        this.answerInfo = answerInfo;
    }

}
