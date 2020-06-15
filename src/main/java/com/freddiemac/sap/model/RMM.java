package com.freddiemac.sap.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RMM {

	@Id
	private int id;
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

	private String activeInactiveEditCode;
	private String loanStatusCode;
	private BigDecimal negativeAmortizationAdjAmt;
	private BigDecimal actualUpbAdjustmentAmt;
	private String interestPaidToDate;

	private BigDecimal rmm;
	private BigDecimal upb;

	public RMM() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RMM(RMMDataRequest request) {
		super();
		this.groupPoolPercent = request.getGroupPoolPercent();
		this.fmPartPercent = request.getFmPartPercent();
		this.uPBInvestorPriorAmt = request.getuPBInvestorPriorAmt();
		this.mortgageUPBPriorAmt = request.getMortgageUPBPriorAmt();
		this.mortgageUPBAmt = request.getMortgageUPBAmt();
		this.monthlyPIPaymtAmt = request.getMonthlyPIPaymtAmt();
		this.couponRate = request.getCouponRate();
		this.poolTerm = request.getPoolTerm();
		this.securityProdCode = request.getSecurityProdCode();
		this.maturityDate = request.getMaturityDate();
		this.noteMaturityDate = request.getNoteMaturityDate();
		this.principalAmmortizationCode = request.getPrincipalAmmortizationCode();
		this.activeInactiveEditCode = request.getActiveInactiveEditCode();
		this.loanStatusCode = request.getLoanStatusCode();
		this.negativeAmortizationAdjAmt = request.getNegativeAmortizationAdjAmt();
		this.actualUpbAdjustmentAmt = request.getActualUpbAdjustmentAmt();
		this.interestPaidToDate = request.getInterestPaidToDate();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "RMM [id=" + id + ", groupPoolPercent=" + groupPoolPercent + ", fmPartPercent=" + fmPartPercent
				+ ", uPBInvestorPriorAmt=" + uPBInvestorPriorAmt + ", mortgageUPBPriorAmt=" + mortgageUPBPriorAmt
				+ ", mortgageUPBAmt=" + mortgageUPBAmt + ", monthlyPIPaymtAmt=" + monthlyPIPaymtAmt + ", couponRate="
				+ couponRate + ", poolTerm=" + poolTerm + ", securityProdCode=" + securityProdCode + ", maturityDate="
				+ maturityDate + ", noteMaturityDate=" + noteMaturityDate + ", principalAmmortizationCode="
				+ principalAmmortizationCode + ", activeInactiveEditCode=" + activeInactiveEditCode
				+ ", loanStatusCode=" + loanStatusCode + ", negativeAmortizationAdjAmt=" + negativeAmortizationAdjAmt
				+ ", actualUpbAdjustmentAmt=" + actualUpbAdjustmentAmt + ", interestPaidToDate=" + interestPaidToDate
				+ ", rmm=" + rmm + ", upb=" + upb + "]";
	}

}
