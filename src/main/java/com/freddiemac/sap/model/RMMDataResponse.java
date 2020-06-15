package com.freddiemac.sap.model;

import java.math.BigDecimal;

public class RMMDataResponse {

	private BigDecimal rmm;
	private BigDecimal upv;

	public RMMDataResponse(BigDecimal rmm, BigDecimal upv) {
		super();
		this.rmm = rmm;
		this.upv = upv;
	}

	public BigDecimal getRmm() {
		return rmm;
	}

	public void setRmm(BigDecimal rmm) {
		this.rmm = rmm;
	}

	public BigDecimal getUpv() {
		return upv;
	}

	public void setUpv(BigDecimal upv) {
		this.upv = upv;
	}

}
