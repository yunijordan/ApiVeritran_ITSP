package com.veritran.api.rest.common;


public class cardholder {
	
	private String primaryAccountNumber;
	private String cvv2;
	private String name;
	/*expirationDate expirationd;
	billingAddress billingA;*/
	private Boolean highValueCustomer;
	private String riskAssessmentScore;
	
	

	public cardholder(String primaryAccountNumber, String cvv2, String name, Boolean highValueCustomer,
			String riskAssessmentScore) {
		super();
		this.primaryAccountNumber = primaryAccountNumber;
		this.cvv2 = cvv2;
		this.name = name;
		this.highValueCustomer = highValueCustomer;
		this.riskAssessmentScore = riskAssessmentScore;
	}
	
	
	public String getPrimaryAccountNumber() {
		return primaryAccountNumber;
	}
	public void setPrimaryAccountNumber(String primaryAccountNumber) {
		this.primaryAccountNumber = primaryAccountNumber;
	}
	public String getCvv2() {
		return cvv2;
	}
	public void setCvv2(String cvv2) {
		this.cvv2 = cvv2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getHighValueCustomer() {
		return highValueCustomer;
	}
	public void setHighValueCustomer(Boolean highValueCustomer) {
		this.highValueCustomer = highValueCustomer;
	}
	public String getRiskAssessmentScore() {
		return riskAssessmentScore;
	}
	public void setRiskAssessmentScore(String riskAssessmentScore) {
		this.riskAssessmentScore = riskAssessmentScore;
	}
	


}
