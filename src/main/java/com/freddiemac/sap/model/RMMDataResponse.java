package com.freddiemac.sap.model;

import java.math.BigDecimal;

public class RMMDataResponse {

	private BigDecimal rmm;
	private BigDecimal upb;

	public RMMDataResponse(BigDecimal rmm, BigDecimal upb) {
		super();
		this.rmm = rmm;
		this.upb = upb;
	}

	public BigDecimal getRmm() {
		return rmm;
	}

	public void setRmm(BigDecimal rmm) {
		this.rmm = rmm;
	}

	public BigDecimal getUpb() {
		return upb;
	}

	public void setUpb(BigDecimal upb) {
		this.upb = upb;
	}

}
