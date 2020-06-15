package com.freddiemac.sap.model;

import java.math.BigDecimal;
import java.sql.Date;

public class RMMDataRequest {

	private BigDecimal groupPoolPercent;
	private BigDecimal fmPartPercent;
	private BigDecimal uPBInvestorPriorAmt;
	private BigDecimal morgageUPBPriorAmt;
	private BigDecimal morgageUPBAmt;
	private BigDecimal monthlyPIPaymtAmt;
	private BigDecimal couponRate;

	private String poolTerm;
	private String securityProdCode;
	private Date maturityDate;
	private Date noteMaturityDate;

	private String principalAmmortizationCode;

	private String activeInactiveEditCode;
	private String loanStatusCode;
	private BigDecimal negativeAmortizationAdjAmt;
	private BigDecimal actualUpbAdjustmentAmt;
	private Date interestPaidToDate;

	public RMMDataRequest(BigDecimal groupPoolPercent, BigDecimal fmPartPercent, BigDecimal uPBInvestorPriorAmt,
			BigDecimal morgageUPBPriorAmt, BigDecimal morgageUPBAmt, BigDecimal monthlyPIPaymtAmt,
			BigDecimal couponRate, String poolTerm, String securityProdCode, Date maturityDate, Date noteMaturityDate,
			String principalAmmortizationCode, String activeInactiveEditCode, String loanStatusCode,
			BigDecimal negativeAmortizationAdjAmt, BigDecimal actualUpbAdjustmentAmt, Date interestPaidToDate) {
		super();
		this.groupPoolPercent = groupPoolPercent;
		this.fmPartPercent = fmPartPercent;
		this.uPBInvestorPriorAmt = uPBInvestorPriorAmt;
		this.morgageUPBPriorAmt = morgageUPBPriorAmt;
		this.morgageUPBAmt = morgageUPBAmt;
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

	public BigDecimal getMorgageUPBPriorAmt() {
		return morgageUPBPriorAmt;
	}

	public void setMorgageUPBPriorAmt(BigDecimal morgageUPBPriorAmt) {
		this.morgageUPBPriorAmt = morgageUPBPriorAmt;
	}

	public BigDecimal getMorgageUPBAmt() {
		return morgageUPBAmt;
	}

	public void setMorgageUPBAmt(BigDecimal morgageUPBAmt) {
		this.morgageUPBAmt = morgageUPBAmt;
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

	public Date getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(Date maturityDate) {
		this.maturityDate = maturityDate;
	}

	public Date getNoteMaturityDate() {
		return noteMaturityDate;
	}

	public void setNoteMaturityDate(Date noteMaturityDate) {
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

	public Date getInterestPaidToDate() {
		return interestPaidToDate;
	}

	public void setInterestPaidToDate(Date interestPaidToDate) {
		this.interestPaidToDate = interestPaidToDate;
	}

	@Override
	public String toString() {
		return "RMMDataRequest [groupPoolPercent=" + groupPoolPercent + ", fmPartPercent=" + fmPartPercent
				+ ", uPBInvestorPriorAmt=" + uPBInvestorPriorAmt + ", morgageUPBPriorAmt=" + morgageUPBPriorAmt
				+ ", morgageUPBAmt=" + morgageUPBAmt + ", monthlyPIPaymtAmt=" + monthlyPIPaymtAmt + ", couponRate="
				+ couponRate + ", poolTerm=" + poolTerm + ", securityProdCode=" + securityProdCode + ", maturityDate="
				+ maturityDate + ", noteMaturityDate=" + noteMaturityDate + ", principalAmmortizationCode="
				+ principalAmmortizationCode + ", activeInactiveEditCode=" + activeInactiveEditCode
				+ ", loanStatusCode=" + loanStatusCode + ", negativeAmortizationAdjAmt=" + negativeAmortizationAdjAmt
				+ ", actualUpbAdjustmentAmt=" + actualUpbAdjustmentAmt + ", interestPaidToDate=" + interestPaidToDate
				+ "]";
	}

}
