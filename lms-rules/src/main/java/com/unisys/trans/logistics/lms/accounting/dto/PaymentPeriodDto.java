package com.unisys.trans.logistics.lms.accounting.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.unisys.trans.logistics.lms.framework.dto.PersistenceObjectDto;

public class PaymentPeriodDto extends PersistenceObjectDto{
	private static final long serialVersionUID = 1L;

    private Long oId;
    
    private String participantType;
    
    private Date paymentEndDate;
    
    private Date paymentFromDate;

    private List<PaymentDetailsDto> paymentDetailsDtos = new ArrayList<PaymentDetailsDto>();
    
	public String getParticipantType() {
		return participantType;
	}

	public void setParticipantType(String participantType) {
		this.participantType = participantType;
	}

	public Date getPaymentEndDate() {
		return paymentEndDate;
	}

	public void setPaymentEndDate(Date paymentEndDate) {
		this.paymentEndDate = paymentEndDate;
	}

	public Date getPaymentFromDate() {
		return paymentFromDate;
	}

	public void setPaymentFromDate(Date paymentFromDate) {
		this.paymentFromDate = paymentFromDate;
	}

	public List<PaymentDetailsDto> getPaymentDetailsDtos() {
		return paymentDetailsDtos;
	}

	public void setPaymentDetailsDtos(List<PaymentDetailsDto> paymentDetailsDtos) {
		this.paymentDetailsDtos = paymentDetailsDtos;
	}

	@Override
	public Long getOId() {
		// TODO Auto-generated method stub
		return this.oId;
	}


	
    
    

}
