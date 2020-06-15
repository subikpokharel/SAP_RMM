package com.freddiemac.sap.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RMMDataRequest {

	private BigDecimal groupPoolPercent;
	private BigDecimal fmPartPercent;
	private BigDecimal uPBInvestorPriorAmt;
	private BigDecimal mortgageUPBPriorAmt;
	private BigDecimal mortgageUPBAmt;
	private BigDecimal monthlyPIPaymtAmt;
	private BigDecimal couponRate;

	private String poolTerm;
	private String securityProdCode;
	private String maturityDate;
	private String noteMaturityDate;

	private String principalAmmortizationCode;

	@JsonProperty("activeInactiveEditCode")
	private String activeInactiveEditCode;
	@JsonProperty("loanStatusCode")
	private String loanStatusCode;
	private BigDecimal negativeAmortizationAdjAmt;
	private BigDecimal actualUpbAdjustmentAmt;
	private String interestPaidToDate;

	public RMMDataRequest(BigDecimal groupPoolPercent, BigDecimal fmPartPercent, BigDecimal uPBInvestorPriorAmt,
			BigDecimal mortgageUPBPriorAmt, BigDecimal mortgageUPBAmt, BigDecimal monthlyPIPaymtAmt,
			BigDecimal couponRate, String poolTerm, String securityProdCode, String maturityDate,
			String noteMaturityDate, String principalAmmortizationCode, String activeInactiveEditCode,
			String loanStatusCode, BigDecimal negativeAmortizationAdjAmt, BigDecimal actualUpbAdjustmentAmt,
			String interestPaidToDate) {
		super();
		this.groupPoolPercent = groupPoolPercent;
		this.fmPartPercent = fmPartPercent;
		this.uPBInvestorPriorAmt = uPBInvestorPriorAmt;
		this.mortgageUPBPriorAmt = mortgageUPBPriorAmt;
		this.mortgageUPBAmt = mortgageUPBAmt;
		this.monthlyPIPaymtAmt = monthlyPIPaymtAmt;
		this.couponRate = couponRate;
		this.poolTerm = poolTerm;
		this.securityProdCode = securityProdCode;
		this.maturityDate = maturityDate;
		this.noteMaturityDate = noteMaturityDate;
		this.principalAmmortizationCode = principalAmmortizationCode;
		this.activeInactiveEditCode = activeInactiveEditCode;
		this.loanStatusCode = loanStatusCode;
		this.negativeAmortizationAdjAmt = negativeAmortizationAdjAmt;
		this.actualUpbAdjustmentAmt = actualUpbAdjustmentAmt;
		this.interestPaidToDate = interestPaidToDate;
	}

	public BigDecimal getGroupPoolPercent() {
		return groupPoolPercent;
	}

	public void setGroupPoolPercent(BigDecimal groupPoolPercent) {
		this.groupPoolPercent = groupPoolPercent;
	}

	public BigDecimal getFmPartPercent() {
		return fmPartPercent;
	}

	public void setFmPartPercent(BigDecimal fmPartPercent) {
		this.fmPartPercent = fmPartPercent;
	}

	public BigDecimal getuPBInvestorPriorAmt() {
		return uPBInvestorPriorAmt;
	}

	public void setuPBInvestorPriorAmt(BigDecimal uPBInvestorPriorAmt) {
		this.uPBInvestorPriorAmt = uPBInvestorPriorAmt;
	}

	public BigDecimal getMortgageUPBPriorAmt() {
		return mortgageUPBPriorAmt;
	}

	public void setMortgageUPBPriorAmt(BigDecimal mortgageUPBPriorAmt) {
		this.mortgageUPBPriorAmt = mortgageUPBPriorAmt;
	}

	public BigDecimal getMortgageUPBAmt() {
		return mortgageUPBAmt;
	}

	public void setMortgageUPBAmt(BigDecimal mortgageUPBAmt) {
		this.mortgageUPBAmt = mortgageUPBAmt;
	}

	public BigDecimal getMonthlyPIPaymtAmt() {
		return monthlyPIPaymtAmt;
	}

	public void setMonthlyPIPaymtAmt(BigDecimal monthlyPIPaymtAmt) {
		this.monthlyPIPaymtAmt = monthlyPIPaymtAmt;
	}

	public BigDecimal getCouponRate() {
		return couponRate;
	}

	public void setCouponRate(BigDecimal couponRate) {
		this.couponRate = couponRate;
	}

	public String getPoolTerm() {
		return poolTerm;
	}

	public void setPoolTerm(String poolTerm) {
		this.poolTerm = poolTerm;
	}

	public String getSecurityProdCode() {
		return securityProdCode;
	}

	public void setSecurityProdCode(String securityProdCode) {
		this.securityProdCode = securityProdCode;
	}

	public String getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(String maturityDate) {
		this.maturityDate = maturityDate;
	}

	public String getNoteMaturityDate() {
		return noteMaturityDate;
	}

	public void setNoteMaturityDate(String noteMaturityDate) {
		this.noteMaturityDate = noteMaturityDate;
	}

	public String getPrincipalAmmortizationCode() {
		return principalAmmortizationCode;
	}

	public void setPrincipalAmmortizationCode(String principalAmmortizationCode) {
		this.principalAmmortizationCode = principalAmmortizationCode;
	}

	public String getActiveInactiveEditCode() {
		return activeInactiveEditCode;
	}

	public void setActiveInactiveEditCode(String activeInactiveEditCode) {
		this.activeInactiveEditCode = activeInactiveEditCode;
	}

	public String getLoanStatusCode() {
		return loanStatusCode;
	}

	public void setLoanStatusCode(String loanStatusCode) {
		this.loanStatusCode = loanStatusCode;
	}

	public BigDecimal getNegativeAmortizationAdjAmt() {
		return negativeAmortizationAdjAmt;
	}

	public void setNegativeAmortizationAdjAmt(BigDecimal negativeAmortizationAdjAmt) {
		this.negativeAmortizationAdjAmt = negativeAmortizationAdjAmt;
	}

	public BigDecimal getActualUpbAdjustmentAmt() {
		return actualUpbAdjustmentAmt;
	}

	public void setActualUpbAdjustmentAmt(BigDecimal actualUpbAdjustmentAmt) {
		this.actualUpbAdjustmentAmt = actualUpbAdjustmentAmt;
	}

	public String getInterestPaidToDate() {
		return interestPaidToDate;
	}

	public void setInterestPaidToDate(String interestPaidToDate) {
		this.interestPaidToDate = interestPaidToDate;
	}

	@Override
	public String toString() {
		return "RMMDataRequest [groupPoolPercent=" + groupPoolPercent + ", fmPartPercent=" + fmPartPercent
				+ ", uPBInvestorPriorAmt=" + uPBInvestorPriorAmt + ", mortgageUPBPriorAmt=" + mortgageUPBPriorAmt
				+ ", mortgageUPBAmt=" + mortgageUPBAmt + ", monthlyPIPaymtAmt=" + monthlyPIPaymtAmt + ", couponRate="
				+ couponRate + ", poolTerm=" + poolTerm + ", securityProdCode=" + securityProdCode + ", maturityDate="
				+ maturityDate + ", noteMaturityDate=" + noteMaturityDate + ", principalAmmortizationCode="
				+ principalAmmortizationCode + ", activeInactiveEditCode=" + activeInactiveEditCode
				+ ", loanStatusCode=" + loanStatusCode + ", negativeAmortizationAdjAmt=" + negativeAmortizationAdjAmt
				+ ", actualUpbAdjustmentAmt=" + actualUpbAdjustmentAmt + ", interestPaidToDate=" + interestPaidToDate
				+ "]";
	}

}
