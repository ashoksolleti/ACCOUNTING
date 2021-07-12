package com.unisys.trans.logistics.lms.accounting.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.constants.PaymentOutstandingCategory;
import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;
import com.unisys.trans.logistics.lms.framework.utility.DateUtility;

public class PaymentOutstandingAmountDto extends PersistenceObjectDto {
	private static final long serialVersionUID = 1L;

	private Long awbOid;
	
	private BigDecimal amountUnBilled;

	private String participantAccountNumber;

	private String participantName;

	private String invoiceNumber;

	private String airWaybillNumber;

	private String dcmReferenceNumber;

	private BigDecimal amountUnapplied;

	private BigDecimal totalOutstanding;

	private Date paymentdueDate;
	
	private Date invoiceDate;
	
	private BigDecimal categoryAmount1;
	
	private BigDecimal categoryAmount2;
	
	private BigDecimal categoryAmount3;
	
	private BigDecimal categoryAmount4;
	
	private BigDecimal categoryAmount5;

	private List<PaymentOutstandingByCategoryDto> paymentOutstandingByCategoryDtos = new ArrayList<PaymentOutstandingByCategoryDto>();
	
	private String awbOrdcmNumber;
	
	private String paymentdueDateAsString;
	
	private String invoiceDateAsString;

	/**
	 * @return the paymentdueDateAsString
	 */
	public String getPaymentdueDateAsString() {
		if(paymentdueDate!=null)
			paymentdueDateAsString= DateUtility.convertToGMTDate(paymentdueDate);
		return paymentdueDateAsString;
	}

	/**
	 * @param paymentdueDateAsString the paymentdueDateAsString to set
	 */
	public void setPaymentdueDateAsString(String paymentdueDateAsString) {
		this.paymentdueDateAsString = paymentdueDateAsString;
	}

	/**
	 * @return the invoiceDateAsString
	 */
	public String getInvoiceDateAsString() {
		if(invoiceDate!=null)
			invoiceDateAsString= DateUtility.convertToGMTDate(invoiceDate);
		return invoiceDateAsString;
	}

	/**
	 * @param invoiceDateAsString the invoiceDateAsString to set
	 */
	public void setInvoiceDateAsString(String invoiceDateAsString) {
		this.invoiceDateAsString = invoiceDateAsString;
	}

	/**
	 * @return the awbOrdcmNumber
	 */
	public String getAwbOrdcmNumber() {
		
		if(airWaybillNumber!=null){
			awbOrdcmNumber = airWaybillNumber;
		}else if(dcmReferenceNumber !=null){
			awbOrdcmNumber = dcmReferenceNumber;
		}
		return awbOrdcmNumber;
	}

	/**
	 * @param awbOrdcmNumber the awbOrdcmNumber to set
	 */
	public void setAwbOrdcmNumber(String awbOrdcmNumber) {
		this.awbOrdcmNumber = awbOrdcmNumber;
	}

	/**
	 * @return the categoryAmount1
	 */
	public BigDecimal getCategoryAmount1() {
		if(this.paymentOutstandingByCategoryDtos!=null && !this.paymentOutstandingByCategoryDtos.isEmpty()){
			for(PaymentOutstandingByCategoryDto byCategoryDto : this.getPaymentOutstandingByCategoryDtos()){
				if(byCategoryDto.getPaymentOutstandingCategory().equals(PaymentOutstandingCategory.CATEGORY_ONE)){
					categoryAmount1 = byCategoryDto.getAmount();
				}
			}
		}
		return categoryAmount1;
	}

	/**
	 * @param categoryAmount1 the categoryAmount1 to set
	 */
	public void setCategoryAmount1(BigDecimal categoryAmount1) {
		this.categoryAmount1 = categoryAmount1;
	}

	/**
	 * @return the categoryAmount2
	 */
	public BigDecimal getCategoryAmount2() {
		if(this.paymentOutstandingByCategoryDtos!=null && !this.paymentOutstandingByCategoryDtos.isEmpty()){
			for(PaymentOutstandingByCategoryDto byCategoryDto : this.getPaymentOutstandingByCategoryDtos()){
				if(byCategoryDto.getPaymentOutstandingCategory().equals(PaymentOutstandingCategory.CATEGORY_TWO)){
					categoryAmount2 = byCategoryDto.getAmount();
				}
			}
		}
		return categoryAmount2;
	}

	/**
	 * @param categoryAmount2 the categoryAmount2 to set
	 */
	public void setCategoryAmount2(BigDecimal categoryAmount2) {
		this.categoryAmount2 = categoryAmount2;
	}

	/**
	 * @return the categoryAmount3
	 */
	public BigDecimal getCategoryAmount3() {
		if(this.paymentOutstandingByCategoryDtos!=null && !this.paymentOutstandingByCategoryDtos.isEmpty()){
			for(PaymentOutstandingByCategoryDto byCategoryDto : this.getPaymentOutstandingByCategoryDtos()){
				if(byCategoryDto.getPaymentOutstandingCategory().equals(PaymentOutstandingCategory.CATEGORY_THREE)){
					categoryAmount3 = byCategoryDto.getAmount();
				}
			}
		}
		return categoryAmount3;
	}

	/**
	 * @param categoryAmount3 the categoryAmount3 to set
	 */
	public void setCategoryAmount3(BigDecimal categoryAmount3) {
		this.categoryAmount3 = categoryAmount3;
	}

	/**
	 * @return the categoryAmount4
	 */
	public BigDecimal getCategoryAmount4() {
		if(this.paymentOutstandingByCategoryDtos!=null && !this.paymentOutstandingByCategoryDtos.isEmpty()){
			for(PaymentOutstandingByCategoryDto byCategoryDto : this.getPaymentOutstandingByCategoryDtos()){
				if(byCategoryDto.getPaymentOutstandingCategory().equals(PaymentOutstandingCategory.CATEGORY_FOUR)){
					categoryAmount4 = byCategoryDto.getAmount();
				}
			}
		}
		return categoryAmount4;
	}

	/**
	 * @param categoryAmount4 the categoryAmount4 to set
	 */
	public void setCategoryAmount4(BigDecimal categoryAmount4) {
		this.categoryAmount4 = categoryAmount4;
	}

	/**
	 * @return the categoryAmount5
	 */
	public BigDecimal getCategoryAmount5() {
		if(this.paymentOutstandingByCategoryDtos!=null && !this.paymentOutstandingByCategoryDtos.isEmpty()){
			for(PaymentOutstandingByCategoryDto byCategoryDto : this.getPaymentOutstandingByCategoryDtos()){
				if(byCategoryDto.getPaymentOutstandingCategory().equals(PaymentOutstandingCategory.CATEGORY_FIVE)){
					categoryAmount5 = byCategoryDto.getAmount();
				}
			}
		}
		return categoryAmount5;
	}

	/**
	 * @param categoryAmount5 the categoryAmount5 to set
	 */
	public void setCategoryAmount5(BigDecimal categoryAmount5) {
		this.categoryAmount5 = categoryAmount5;
	}

	/**
	 * @return the participantName
	 */
	public String getParticipantName() {
		return participantName;
	}

	/**
	 * @param participantName
	 *            the participantName to set
	 */
	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}

	/**
	 * @return the amountUnBilled
	 */
	public BigDecimal getAmountUnBilled() {
		return amountUnBilled;
	}

	/**
	 * @param amountUnBilled
	 *            the amountUnBilled to set
	 */
	public void setAmountUnBilled(BigDecimal amountUnBilled) {
		this.amountUnBilled = amountUnBilled;
	}

	/**
	 * @return the participantAccountNumber
	 */
	public String getParticipantAccountNumber() {
		return participantAccountNumber;
	}

	/**
	 * @param participantAccountNumber
	 *            the participantAccountNumber to set
	 */
	public void setParticipantAccountNumber(String participantAccountNumber) {
		this.participantAccountNumber = participantAccountNumber;
	}

	/**
	 * @return the invoiceNumber
	 */
	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	/**
	 * @param invoiceNumber
	 *            the invoiceNumber to set
	 */
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	/**
	 * @return the airWaybillNumber
	 */
	public String getAirWaybillNumber() {
		return airWaybillNumber;
	}

	/**
	 * @param airWaybillNumber
	 *            the airWaybillNumber to set
	 */
	public void setAirWaybillNumber(String airWaybillNumber) {
		this.airWaybillNumber = airWaybillNumber;
	}

	/**
	 * @return the dcmReferenceNumber
	 */
	public String getDcmReferenceNumber() {
		return dcmReferenceNumber;
	}

	/**
	 * @param dcmReferenceNumber
	 *            the dcmReferenceNumber to set
	 */
	public void setDcmReferenceNumber(String dcmReferenceNumber) {
		this.dcmReferenceNumber = dcmReferenceNumber;
	}

	/**
	 * @return the amountUnapplied
	 */
	public BigDecimal getAmountUnapplied() {
		return amountUnapplied;
	}

	/**
	 * @param amountUnapplied
	 *            the amountUnapplied to set
	 */
	public void setAmountUnapplied(BigDecimal amountUnapplied) {
		this.amountUnapplied = amountUnapplied;
	}

	/**
	 * @return the totalOutstanding
	 */
	public BigDecimal getTotalOutstanding() {
		return totalOutstanding;
	}

	/**
	 * @param totalOutstanding
	 *            the totalOutstanding to set
	 */
	public void setTotalOutstanding(BigDecimal totalOutstanding) {
		this.totalOutstanding = totalOutstanding;
	}

	/**
	 * @return the paymentdueDate
	 */
	public Date getPaymentdueDate() {
		return paymentdueDate;
	}

	/**
	 * @param paymentdueDate
	 *            the paymentdueDate to set
	 */
	public void setPaymentdueDate(Date paymentdueDate) {
		this.paymentdueDate = paymentdueDate;
	}

	/**
	 * @return the paymentOutstandingByCategoryDtos
	 */
	public List<PaymentOutstandingByCategoryDto> getPaymentOutstandingByCategoryDtos() {
		return paymentOutstandingByCategoryDtos;
	}

	/**
	 * @param paymentOutstandingByCategoryDtos
	 *            the paymentOutstandingByCategoryDtos to set
	 */
	public void setPaymentOutstandingByCategoryDtos(
			List<PaymentOutstandingByCategoryDto> paymentOutstandingByCategoryDtos) {
		this.paymentOutstandingByCategoryDtos = paymentOutstandingByCategoryDtos;
	}

	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return the invoiceDate
	 */
	public Date getInvoiceDate() {
		return invoiceDate;
	}

	/**
	 * @param invoiceDate the invoiceDate to set
	 */
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	
	
	public String getFormatDate(Date pDate)
	{
		String date=" ";
		if(pDate!=null)
			date= DateUtility.convertToGMTDate(pDate);
		return date;
	}

	public Long getAwbOid() {
		return awbOid;
	}

	public void setAwbOid(Long awbOid) {
		this.awbOid = awbOid;
	}
}
