package com.freddiemac.sap.model;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RMM {

	@Id
	private int id;
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

	private BigDecimal rmm;
	private BigDecimal upv;

	public RMM() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RMM(RMMDataRequest request) {
		super();
		this.groupPoolPercent = request.getGroupPoolPercent();
		this.fmPartPercent = request.getFmPartPercent();
		this.uPBInvestorPriorAmt = request.getuPBInvestorPriorAmt();
		this.morgageUPBPriorAmt = request.getMorgageUPBPriorAmt();
		this.morgageUPBAmt = request.getMorgageUPBAmt();
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "RMM [id=" + id + ", groupPoolPercent=" + groupPoolPercent + ", fmPartPercent=" + fmPartPercent
				+ ", uPBInvestorPriorAmt=" + uPBInvestorPriorAmt + ", morgageUPBPriorAmt=" + morgageUPBPriorAmt
				+ ", morgageUPBAmt=" + morgageUPBAmt + ", monthlyPIPaymtAmt=" + monthlyPIPaymtAmt + ", couponRate="
				+ couponRate + ", poolTerm=" + poolTerm + ", securityProdCode=" + securityProdCode + ", maturityDate="
				+ maturityDate + ", noteMaturityDate=" + noteMaturityDate + ", principalAmmortizationCode="
				+ principalAmmortizationCode + ", activeInactiveEditCode=" + activeInactiveEditCode
				+ ", loanStatusCode=" + loanStatusCode + ", negativeAmortizationAdjAmt=" + negativeAmortizationAdjAmt
				+ ", actualUpbAdjustmentAmt=" + actualUpbAdjustmentAmt + ", interestPaidToDate=" + interestPaidToDate
				+ ", rmm=" + rmm + ", upv=" + upv + "]";
	}

}
