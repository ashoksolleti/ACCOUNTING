package com.unisys.trans.logistics.lms.accounting.dto;

import com.unisys.trans.logistics.lms.framework.dto.AbstractRequest;

public class FlownSegmentRevenueReportFindRequest extends AbstractRequest {

		private static final long serialVersionUID = 1L;
		private FlownSegmentRevenueDto flownSegmentRevenueDto =new FlownSegmentRevenueDto();

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		public FlownSegmentRevenueDto getFlownSegmentRevenueDto() {
			return flownSegmentRevenueDto;
		}

		public void setFlownSegmentRevenueDto(
				FlownSegmentRevenueDto flownSegmentRevenueDto) {
			this.flownSegmentRevenueDto = flownSegmentRevenueDto;
		}
		
}